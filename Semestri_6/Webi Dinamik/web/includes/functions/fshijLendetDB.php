<?php

if(isset($_GET['kodi'])) {
	$kodi = $_GET['kodi'];
	
	require "connect.php";
	
	mysqli_query($connect, "DELETE FROM lenda WHERE kodi = '$kodi';");
	
	header("Location: ../../fshijLendet.php");
}

?>