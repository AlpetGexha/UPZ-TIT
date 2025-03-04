<?php

//startimi i nje sesionit
session_start();

//ndryshimi i nje rreshti ne DB

//kontrollo nese eshte kliku butoni, jane dergu te dhenat permes metodes GET
//perdoruesi i kyqur dhe roli i tij student
if(isset($_SESSION['usernameID']) && isset($_SESSION['roli']) && $_SESSION['roli'] == 3 && isset($_GET['idProf']) && isset($_GET['kodiLnd']) && isset($_GET['sem']) && isset($_GET['dept']) && isset($_GET['heraP'])) {
	
	//marrja e vlerave me GET
	$idStd = $_SESSION['usernameID'];
	$idProf = $_GET['idProf'];
	$kodiLnd = $_GET['kodiLnd'];
	$sem = $_GET['sem'];
	$dept = $_GET['dept'];
	$heraP = $_GET['heraP'];
	$heraP = $heraP + 1;
	
	//konekto me db
	require "connect.php";
	
	//query per update ne db
	$updateQuery = "UPDATE rezultatet 
					SET paraqitur = 1, heraParaqitjes = '$heraP'
					WHERE studenti = '$idStd' AND profesori = '$idProf' AND lenda  = '$kodiLnd'
						AND semestri = '$sem' AND departamenti = '$dept';";
	mysqli_query($connect, $updateQuery);
}

//ridrejtoje perdoruesin ne faqen submitExams.php
header("Location: ../../submitExams.php");

?>