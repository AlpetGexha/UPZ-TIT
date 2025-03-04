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