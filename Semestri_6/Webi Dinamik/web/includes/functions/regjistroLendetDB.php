<?php

if (isset($_GET['studenti']) && isset($_GET['provimi'])) {
	$studenti = $_GET['studenti'];
	$provimi = $_GET['provimi'];

	require "connect.php";

	mysqli_query($connect, "INSERT INTO rezultatet 
							VALUES ('$studenti', '$provimi', 0,0,0)");

	header("Location: ../../regjistroLendet.php");
}
