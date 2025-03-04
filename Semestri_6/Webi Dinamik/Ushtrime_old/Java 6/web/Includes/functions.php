<?php

function login($user, $pass) {
	//kyqja e perdoruesit ne sistem
	//...
}

function register($fname, $lname, $departament, $email, $id, $pass) {

	//regjistrimi i studentit te ri ne sistem
	//...
	//konektimi me db
	$conn = mysqli_connect("localhost", "root", "", "universiteti") or die("Nuk mund te konektohet");
	
	$queryID = $conn -> query("SELECT id FROM perdoruesi WHERE id='$id'");
	$countID = @mysqli_num_rows($queryID);
	$queryEmail = $conn -> query("SELECT email FROM perdoruesi WHERE email='$email'");
	$countEmail = @mysqli_num_rows($queryEmail);
	$register = true;
	//$errorGen = $errorFnameGen = $errorFnameErr1 = $errorLnameGen = $errorLnameErr1 = $errorDepartamentGen = $errorEmailGen = $errorEmailErr1 = $errorEmailErr2 = $errorIDGen = $errorIDErr1 = $errorIDErr2 = $errorIDErr3 = $errorPassGen = $errorPassErr1 = "";
	
	if(empty($fname) && empty($lname) && $departament == "Perzgjidh departamentin" && empty($email) && empty($id) && empty($pass)) {
		echo "hello here...";
		$errorGen = "Te gjitha fushat duhet te plotesohen!";
		$register = false;
	}
	else {
		echo "dd";
		if(empty($fname)) {
			$errorFnameGen = "Fusha e emrit duhet te plotesohet!";
			$register = false;
		}
		else {
			if(!preg_match("/^[a-zA-Z ]*$/", $fname)) {
				$errorFnameErr1 = "Emri duhet te permbaje vetem shkronja!";
				$register = false;
			}
		}
		
		if(empty($lname)) {
			$errorLnameGen = "Fusha e mbiemrit duhet te plotesohet!";
			$register = false;
		}
		else {
			if(!preg_match("/^[a-zA-Z ]*$/", $lname)) {
				$errorLnameErr1 = "Mbiemri duhet te permbaje vetem shkronja!";
				$register = false;
			}
		}
		
		if($departament == "Perzgjidh departamentin") {
			$errorDepartamentGen = "Fusha e departamentit duhet te plotesohet!";
			$register = false;
		}
		
		if(empty($email)) {
			$errorEmailGen = "Fusha e email adreses duhet te plotesohet!";
			$register = false;
		}
		else {
			if(!filter_var($email, FILTER_VALIDATE_EMAIL)) {
				$errorEmailErr1 = "Formati i email adreses nuk eshte i sakte!";
				$register = false;
			}
			else if($countEmail != 0) {
				$errorEmailErr2 = "Ky email tashme ekziston!";
				$register = false;
			}
		}
		
		if(empty($id)) {
			$errorIDGen = "Fusha e id-se duhet te plotesohet!";
			$register = false;
		}
		else {
			if(!is_numeric($id)) {
				$errorIDErr1 = "Numri i id-se duhet te permabje vetem vetem numra!";
				$register = false;
			}
			else if(strlen($id) != 9) {
				$errorIDErr2 = "Numri i id-se duhet te jete 9 karaktere i gjate!";
				$register = false;
			}
			else if($countID != 0) {
				$errorIDErr3 = "Ky perdorues tashme ekziston!";
				$register = false;
			}
		}
		
		if(empty($pass)) {
			$errorPassGen = "Fusha e fjalekalimit duhet te plotesohet!";
			$register = false;
		}
		else {
			$uppercase = preg_match("@[A-Z]@");
			$lowercase = preg_match("@[a-z]@");
			$number = preg_match("@[0-9]@");
			$specialChars = preg_match("@[^\w]@");
			
			if(!$uppercase || !$lowercase || !$number || !$specialChars || strlen($pass) < 8) {
				$errorPassErr1 = "Fjalekalimi duhet te permbaje te pakten 8 karaktere dhe duhet te perfshije te pakten nje shkronje te madhe, nje numer dhe nje karakter specialte !";
				$register = false;
			}
		}
		
		if($register == true) {
			//insert
			$dataReg = date('d-m-Y');
			$queryDeptID = $conn -> query("SELECT id FROM departamenti WHERE emri = '$departamenti'");
			$row = mysqli_fetch_assoc($queryDeptID);
			$depID = $row['id'];
			$querysql = "INSERT INTO perdoruesi 
				(id, emri, mbiemri, email, fjalekalimi, roli) 
				VALUES ('$id', '$fname', '$lname', '$email', md5('$fjalekalimi'), 'Student');";
			$querysql .= "INSERT INTO studenti
				(id, dataregjistrimit, departamenti, semestri)
				VALUES ('$id', '$dataReg', '$depID', 1);";
			mysqli_multi_query($conn, $querysql);
		}
	}
}
?>