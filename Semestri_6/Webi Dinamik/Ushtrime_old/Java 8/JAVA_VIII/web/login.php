<?php

//startimi i sesionit
session_start();

//nese perdoruesi nuk eshte kyq, shfaqe kete pamjen e web faqes

if(!isset($_SESSION['usernameID'])) {
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
					<h1>Login Form</h1>
					
					<?php
					
					$errorUsername = $errorPassword = $errorGen = "";
					
					if($_SERVER['REQUEST_METHOD'] == "POST") {
						//login
						include "Includes/validate/loginValidate.php";
					}
					?>
					
					<table>
						<form action = "<?php echo $_SERVER['PHP_SELF'];?>" method = "POST">
							<tr><td><input type = "text" name = "usernameLogin" placeholder = "Username"></td></tr>
							<tr><td><?php echo $errorUsername;?></td></tr>
							<tr><td><input type = "password" name = "passLogin" placeholder = "Password"></td></tr>
							<tr><td><?php echo $errorPassword;?></td></tr>
							<tr><td><?php echo $errorGen;?></td></tr>
							<tr><td><input type = "submit"></td></tr>
						</form>
					</table>
					
				</div>
			</div>
			<?php include "Includes/template/aside.php"?>
			<?php include "Includes/template/footer.php";?>
		</div>
	</body>
</html>

<?php
}

//perdoruesi eshte i kyqur
else {
	//ridrejtoje ne faqen baze pas kyqjes
	header("Location: home.php");
}
?>