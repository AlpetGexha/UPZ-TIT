<?php

require "includes/functions/connect.php";

$userID = $_SESSION['username'];

$query = mysqli_query($connect, "SELECT d.id AS did, d.emri FROM ligjerimet l, departamenti d WHERE l.departamenti = d.id AND profesori = '$userID';");

$count = mysqli_num_rows($query);

if($count == 0) {
	echo "<option value = 'Nuk ka të dhëna'>Nuk ka të dhëna</option>";
}
else {
	while($row = mysqli_fetch_assoc($query)) {
		$departamenti = $row['emri'];
		$deptID = $row['did'];
		echo "<option value = '$deptID'>$departamenti</option>";
	}
}

?>