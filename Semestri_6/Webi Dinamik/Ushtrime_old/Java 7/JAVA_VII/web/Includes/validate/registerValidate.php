<?php

//konektimi me db - i nevojshem per te vazhduar me manipulimin e te dhenave ne db
require "Includes/functions/connect.php";

//marrja e te dhenave te formes me POST
$fname = $_POST['fname'];
$lname = $_POST['lname'];
$departament = $_POST['departament'];
$email = $_POST['email'];
$id = $_POST['idReg'];
$pass = $_POST['passwordReg'];

//kjo pjese na nevojitet per validimin e email adreses dhe id-se se perdoruesit qe po tenton te regjistrohet ne sistem
//deshirojme te shikojme nese ekziston nje perdorues me email-in dhe id-ne e shenuar ne HTML formen
//variablat $countID dhe $countEmail na nevojiten per te validuar vlerat e shenuara ne fushat email dhe id
$queryID = mysqli_query($connect, "SELECT id FROM perdoruesi WHERE id='$id'");
$countID = @mysqli_num_rows($queryID);
$queryEmail = mysqli_query($connect, "SELECT email FROM perdoruesi WHERE email='$email'");
$countEmail = @mysqli_num_rows($queryEmail);

//variabla $register tregon nese mund te kryejme regjistrimin e studentit apo jo, varesisht nga vlera e saj meqe eshte boolean-e
//kudo qe ka gabime variabla $register e merr vleren false (dmth mbishkruhet vlera fillestare true me false)
$register = true;

//ne vazhdim do te shikojme vetem rastet kur ka ndodhur ndonje gabim gjate plotesimit te formes te cilen po e validojme (per te dhenat e saj aktuale)
//nese asnjera nga fushat e formes nuk eshte e plotesuar
if(empty($fname) && empty($lname) && $departament == "Perzgjidh departamentin" && empty($email) && empty($id) && empty($pass)) {
	$errorGen = "Te gjitha fushat duhet te plotesohen!";
	$register = false;
}

//nese te pakten njera nga fushat permban nje vlere perkatese, na nevojitet ta validojme ate vlere
else {
	//nese fusha e emrit eshte e zbrazet
	if(empty($fname)) {
		$errorFname = "Fusha e emrit duhet te plotesohet!";
		$register = false;
	}
	
	//emri ka vlere, validoje ate
	else {
		//nese emri permban edhe karaktere tjera jo-shkronje
		if(!preg_match("/^[a-zA-Z ]*$/", $fname)) {
			$errorFname = "Emri duhet te permbaje vetem shkronja!";
			$register = false;
		}
	}
	
	//nese fusha e mbiemrit eshte e zbrazet
	if(empty($lname)) {
		$errorLname = "Fusha e mbiemrit duhet te plotesohet!";
		$register = false;
	}
	
	//mbiemri ka vlere, validoje ate
	else {
		//nese mbiemri permban edhe karaktere tjera jo-shkronje
		if(!preg_match("/^[a-zA-Z ]*$/", $lname)) {
			$errorLname = "Mbiemri duhet te permbaje vetem shkronja!";
			$register = false;
		}
	}
	
	//nese ne listen e departamenteve perdoruesi nuk ka zgjedhur asnjerin nga opsionet qe perfaqesojne nje departament ne fakultet
	if($departament == "Perzgjidh departamentin") {
		$errorDepartament = "Fusha e departamentit duhet te plotesohet!";
		$register = false;
	}
	
	//nese fusha e email adreses eshte e zbrazet
	if(empty($email)) {
		$errorEmail = "Fusha e email adreses duhet te plotesohet!";
		$register = false;
	}
	
	//email adresa ka vlere, validoje ate
	else {
		//nese formati i email adreses se shenuar nuk eshte i sakte
		if(!filter_var($email, FILTER_VALIDATE_EMAIL)) {
			$errorEmail = "Formati i email adreses nuk eshte i sakte!";
			$register = false;
		}
		//nese ekziston nje perdorues qe e ka kete email adrese
		else if($countEmail != 0) {
			$errorEmail = "Ky email tashme ekziston!";
			$register = false;
		}
	}
	
	//nese fusha e id-se eshte e zbrazet
	if(empty($id)) {
		$errorID = "Fusha e id-se duhet te plotesohet!";
		$register = false;
	}
	
	//id ka vlere, validoje ate
	else {
		//nese id permban edhe karaktere tjera jo-numra
		if(!is_numeric($id)) {
			$errorID = "Numri i id-se duhet te permabje vetem vetem numra!";
			$register = false;
		}
		
		//nese id nuk ka saktesisht 9 karaktere
		else if(strlen($id) != 9) {
			$errorID = "Numri i id-se duhet te jete 9 karaktere i gjate!";
			$register = false;
		}
		
		//nese ekziston nje perdorues qe e ka kete id (id paraqet username permes se ciles do te kyqet perdoruesi ne llogarine e tij ne sistem)
		else if($countID != 0) {
			$errorID = "Ky perdorues tashme ekziston!";
			$register = false;
		}
	}
	
	//nese fusha e fjalekalimit eshte e zbrazet
	if(empty($pass)) {
		$errorPass = "Fusha e fjalekalimit duhet te plotesohet!";
		$register = false;
	}
	
	//fjalekalimi ka vlere, validoje ate
	else {
		$uppercase = preg_match("@[A-Z]@", $pass);
		$lowercase = preg_match("@[a-z]@", $pass);
		$number = preg_match("@[0-9]@", $pass);
		$specialChars = preg_match("@[^\w]@", $pass);
		
		//nese fjalekalimi eshte i dobet
		//nese nuk plotesohet njeri nga kushtet e meposhtem atehere konsiderohet qe fjalekalimi eshte i dobet
		if(!$uppercase || !$lowercase || !$number || !$specialChars || strlen($pass) < 8) {
			$errorPass = "Fjalekalim i dobet";
			$errorPassTooltip = "Fjalekalimi duhet te permbaje te pakten 8 karaktere dhe duhet te perfshije te pakten nje shkronje te madhe, nje numer dhe nje karakter special!";
			$register = false;
		}
	}
	
	//nese asnje gabim nuk ka ndodh (dmth nuk eshte plotesuar asnje nga kushtet qe perfaqesojne vetem kontrollimin e gabimeve qe kane ndodhe) atehere dmth qe variabla $register kurre nuk e ka marre vleren false, por vazhdon te kete vleren fillestare true, qe i bjen se kushti do te plotesohet dhe do te mundemi te realizojme insertimin e te dhenave ne db
	if($register == true) {
		
		//inserto ne db
		
		//marrja e dates aktuale nga sistemi qe ruhet si date e regjistrimit te perdoruesit ne sistem
		$dataReg = date("Y-m-d");
		
		//meqe perdoruesi kur e zgjedh nje opsion nga lista e departamenteve vlera qe dergohet ne server eshte emri i departamentit, ndersa ne regjistrimin e nje studenti te ri na nevojitet id e departamentit qe eshte celes i huaj ne tabelen studenti qe referencon ne celesin primar te tabeles departamenti
		//e marrim vleren e id-se per departamentin qe perdoruesi tashme e ka zgjedh nga opsionet e listes
		$queryDeptID = mysqli_query($connect, "SELECT id FROM departamenti WHERE emri = '$departament'");
		$row = mysqli_fetch_assoc($queryDeptID);
		$depID = $row['id'];
		
		//tani jemi gati te insertojme perdoruesin e ri ne db
		//ne rastin tone do te bejme nje insertim te dyfishte ne dy tabela te ndryshme
		$querysql = "INSERT INTO perdoruesi 
			(id, emri, mbiemri, email, fjalekalimi, roli) 
			VALUES ('$id', '$fname', '$lname', '$email', md5('$pass'), 3);";
		$querysql .= "INSERT INTO studenti
			(id, dataregjistrimit, departamenti, semestri)
			VALUES ('$id', '$dataReg', '$depID', 1);";
		
		//funksioni ne vazhdim perdoret per te ekzekutuar deklarata te shumta te sql query ne mysql
		if (mysqli_multi_query($connect, $querysql)) {
			echo "u insertua";
		}
		else {
			echo "ka ndodh nje gabim ne insertim";
		}
	}
}
?>