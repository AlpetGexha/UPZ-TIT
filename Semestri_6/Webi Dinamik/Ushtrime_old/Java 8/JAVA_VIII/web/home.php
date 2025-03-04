<?php

//startimi i sesionit
session_start();

//nese perdoruesi eshte kyq ne sistem, atehere paraqitja kete pamje te web faqes
if(isset($_SESSION['usernameID'])) {

?>

<!DOCTYPE html>
	<head>
		<title>Home</title>
		<link rel="stylesheet" type="text/css" href="style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include "Includes/template/nav.php";?>
			<?php include "Includes/template/header.php";?>
			<div class="content main">
				<div class="sec">
					<h3>Faleminderit!</h3>
				</div>
			</div>
			<?php include "Includes/template/aside.php"?>
			<?php include "Includes/template/footer.php";?>
		</div>
	</body>
</html>

<?php
}

//nese nuk eshte kyq, atehere ridrejtoje ne faqen baze para kyqjes
else {
	header("Location: login.php");
}

?>