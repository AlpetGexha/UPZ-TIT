<?php

require "includes/functions/connect.php";

$username = $_SESSION['username'];

$query = mysqli_query($connect, "SELECT semestri FROM studenti WHERE id = '$username';");
$row = mysqli_fetch_assoc($query);
$semestri = $row['semestri'];

for($i = 1; $i <= $semestri; $i++) {
	$query2 = mysqli_query($connect, "SELECT pershkrimi FROM semestri WHERE id = '$i';");
	$row2 = mysqli_fetch_assoc($query2);
	$semestriP = $row2['pershkrimi'];
	
	echo "<option value = '$i'>$semestriP</option>";
}
?>