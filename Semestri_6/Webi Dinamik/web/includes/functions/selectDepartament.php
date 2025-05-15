<?php

require "includes/functions/connect.php";

$query = mysqli_query($connect, "SELECT emri FROM departamenti;");

while($row = mysqli_fetch_assoc($query)) {
	$emri = $row['emri'];
	echo "<option value = '$emri'>$emri</option>";
}

?>