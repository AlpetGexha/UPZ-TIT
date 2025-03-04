<?php

//startimi i sesionit
session_start();

//paraqite kete pamje te web faqes nese perdoruesi eshte kyq
//dhe nese perdoruesi i kyqur eshte nje student

if(isset($_SESSION['usernameID']) && isset($_SESSION['roli'])) {
	if($_SESSION['roli'] == 3) {
?>

<!DOCTYPE html>
	<head>
		<title>Home</title>
		<link rel="stylesheet" type="text/css" href="style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include "Includes/template/nav.php";?>
			<?php //include "Includes/template/header.php";?>
			<div class="content main">
				<div class="sec">
					<h1>Register Exams</h1>
					<?php
					require "Includes/functions/selectExams.php";
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
	//nese perdoruesi i kyqur nuk eshte student
	else {
		//ridrejtoje ne faqen baze pas kyqjes
		header("Location: home.php");
	}
}

//perdoruesi nuk eshte i kyqur
else {
	//ridrejtoje ne faqen baze para kyqjes
	header("Location: login.php");
}
?>