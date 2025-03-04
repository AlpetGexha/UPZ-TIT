<?php

//validimi i te dhenave hyrese ne plotesimin e formes se kyqjes te perdoruesit ne sistem, varesisht nga roli i tij

//marrja e te dhenave te formes permes metodes POST
$usernameID = $_POST['usernameLogin'];
$pass = $_POST['passLogin'];

$login = true;

//konektimi me db
require "Includes/functions/connect.php";

//validimi i te dhenave hyrese

//nese asnjera nga fushat nuk eshte plotesuar
if(empty($usernameID) && empty($pass)) {
	$errorGen = "Te gjitha te dhenat duhet te plotesohen!";
	$login = false;
}

//nese te pakten njera nga fushat eshte e plotesuar, atehere validoje vleren e saj
else {
	//validimi i usernameID
	
	//nese usernameID eshte e zbrazet
	if(empty($usernameID)) {
		$errorUsername = "Fusha e username duhet te plotesohet!";
		$login = false;
	}
	//nese usernameID ka vlere
	else {
		//nese perdoruesi nuk ekziston
		$query1 = "SELECT * FROM perdoruesi WHERE id = '$usernameID';";
		$query1Res = mysqli_query($connect, $query1);
		$count1 = mysqli_num_rows($query1Res);
		
		if($count1 == 0) {
			$errorUsername = "Ky perdorues nuk ekziston!";
			$login = false;
		}
	}
	
	//validimi i password
	
	//nese password eshte i zbrazet
	if(empty($pass)) {
		$errorPassword = "Fusha e fjalekalimit duhet te plotesohet!";
		$login = false;
	}
	//nese password ka vlere
	else {
		//nese password nuk eshte i sakte per kete perdorues
		$query2 = "SELECT fjalekalimi FROM perdoruesi WHERE id = '$usernameID';";
		$query2Res = mysqli_query($connect, $query2);
		$query2Row = mysqli_fetch_array($query2Res);
		$passwordDB = $query2Row['fjalekalimi'];
		$pass1 = md5($pass);
		
		if($pass1 != $passwordDB) {
			$errorPassword = "Fjalekalimi nuk eshte i sakte!";
			$login = false;
		}
	}
	
	//nese asnje gabim nuk ka ndodh gjate plotesimit te formes se kyqjes, atehere variabla login vazhdon ta kete vleren fillestare true
	if($login == true) {
		//perdoruesi kyqet me sukses, ne sistem
		
		$query3 = "SELECT roli FROM perdoruesi WHERE id = '$usernameID';";
		$query3Res = mysqli_query($connect, $query3);
		$query3Row = mysqli_fetch_array($query3Res);
		$roli = $query3Row['roli'];
		
		$_SESSION['usernameID'] = $usernameID;
		$_SESSION['roli'] = $roli;
		
		//ridrejtoje ne faqen baze pas kyqjes se perdoruesit ne sistem
		header("Location: home.php");
	}
}

?>