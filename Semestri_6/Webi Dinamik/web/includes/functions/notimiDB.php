<?php

$studID = $_POST['studID'];
$nota = $_POST['notimi'];
$provimi = $_POST['provimi'];

require "connect.php";

mysqli_query($connect, "UPDATE rezultatet SET nota = '$nota' 
						WHERE studenti = '$studID' 
							AND provimi = '$provimi';");

if($nota == 10) {
	mysqli_query($connect, "UPDATE rezultatet SET transkripte = 1 
							WHERE studenti = '$studID' 
							AND provimi = '$provimi';");
}

header("Location: ../../notimi.php");

?>