<?php
//startimi i sesionit
session_start();

//nese eshte klikuar butoni per regjistrim te nje lende te caktuar ekzekutohet kodi ne vazhdim (insertimi i nje rreshti te ri ne tabelen rezultatet ne DB)
//perdoruesi i kyqur dhe roli i tij student
if(isset($_SESSION['usernameID']) && isset($_SESSION['roli']) && isset($_GET['idProf']) && isset($_GET['kodiLnd']) && isset($_GET['sem']) && isset($_GET['dept'])) {

	if($_SESSION['roli'] == 3) {
		//marrja e te dhenave permes metodes GET
		$idStd = $_SESSION['usernameID'];
		$idProf = $_GET['idProf'];
		$kodiLnd = $_GET['kodiLnd'];
		$sem = $_GET['sem'];
		$dept = $_GET['dept'];
		
		//konektimi i web app me db
		require "../functions/connect.php";
		
		//query qe perfshin insertimin e nje rreshti te ri ne tabelen rezultatet
		$insertQuery = "INSERT INTO rezultatet (studenti, lenda, profesori, semestri, departamenti, nota, heraParaqitjes, notuar, paraqitur, refuzuar, pranuar)
						VALUES ('$idStd', '$kodiLnd', '$idProf', '$sem', '$dept', 'Ende pa notuar', 0, 0, 0, 0, 0);";
		
		//ekzekutimi i query-it per insertim ne db
		mysqli_query($connect, $insertQuery);
	}
}

//ridrejtimi ne faqen registerExams.php
header("Location: ../../registerExams.php");
?>