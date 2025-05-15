<?php

if(isset($_GET['studenti']) && isset($_GET['provimi'])) {
	$studenti = $_GET['studenti'];
	$provimi = $_GET['provimi'];
	
	require "connect.php";
	
	mysqli_query($connect, "DELETE FROM rezultatet 
							WHERE studenti = '$studenti' 
								AND provimi = '$provimi';");
	
	header("Location: ../../regjistroLendet.php");
}

?>