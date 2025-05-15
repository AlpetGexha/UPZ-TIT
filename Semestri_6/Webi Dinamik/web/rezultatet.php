<?php
session_start();

if(isset($_SESSION['username']) && isset($_SESSION['roli'])) {
	if($_SESSION['roli'] == 3) {	
?>
<!DOCTYPE html>
	<head>
		<title>Rezultatet</title>
		<link rel="stylesheet" type="text/css" href="Style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include "Includes/template/nav.php";?>
			<?php include "Includes/template/header.php";?>
			<div class="content main">
				<div class="sec">
					<h2>Rezultatet</h2>
					<?php
					include "includes/functions/selectRezultatet.php";
					?>
				</div>
			</div>
			<?php include "Includes/template/aside.php"?>
			<?php include "Includes/template/footer.php";?>
		</div>
	</body>
</html>
<?php
	}
	else {
		header("Location: home.php");
	}
}
else {
	header("Location: login.php");
}
?>