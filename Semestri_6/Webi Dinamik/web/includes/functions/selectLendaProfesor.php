<?php

require "includes/functions/connect.php";

$userID = $_SESSION['username'];

$query = mysqli_query($connect, "SELECT kodi, emri FROM lenda l, ligjerimet i WHERE l.kodi = i.lenda AND i.profesori = '$userID';");

$count = mysqli_num_rows($query);

if($count == 0) {
	echo "<option value = 'Nuk ka të dhëna'>Nuk ka të dhëna</option>";
}
else {
	while($row = mysqli_fetch_assoc($query)) {
		$lenda = $row['emri'];
		$lendaKodi = $row['kodi'];
		echo "<option value = '$lendaKodi'>$lenda</option>";
	}
}

?>