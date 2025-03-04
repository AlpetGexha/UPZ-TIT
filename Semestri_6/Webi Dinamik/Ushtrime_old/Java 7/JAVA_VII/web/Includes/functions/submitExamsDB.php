<?php

if(isset($_GET['idStd']) && isset($_GET['idProf']) && isset($_GET['kodiLnd']) && isset($_GET['idSem']) && isset($_GET['idDept']) && isset($_GET['heraP'])) {
	$idStd = $_GET['idStd'];
	$idProf = $_GET['idProf'];
	$kodiLnd = $_GET['kodiLnd'];
	$idSem = $_GET['idSem'];
	$idDept = $_GET['idDept'];
	$heraP = $_GET['heraP'];
	$heraP = $heraP + 1;

	//konektimi me db
	require "connect.php";

	//query per update ne tabelen rezultatet
	$updateQuery = "UPDATE rezultatet
					SET heraParaqitjes = '$heraP', paraqitur = 1
					WHERE studenti = '$idStd' AND lenda = '$kodiLnd' AND profesori = '$idProf'
						AND semestri = '$idSem' AND departamenti = '$idDept';";
	//ekzekutimi i query-it
	mysqli_query($connect, $updateQuery);

	//ridrejto ne faqen baze
	header("Location: ../../submitExams.php");
}

?>