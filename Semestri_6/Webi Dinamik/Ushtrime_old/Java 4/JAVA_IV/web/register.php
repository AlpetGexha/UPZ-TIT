<!DOCTYPE html>
	<head>
		<title>Register</title>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>

	<body>
		<div id="container">
			<?php include "Includes/nav.php";?>
			<?php include "Includes/header.php";?>
			<div class="content main">
				<div class="sec">
					<h1>Register Form</h1>
					<table>
						<form action = "<?php echo $_SERVER['PHP_SELF'];?>" method = "POST">
						<tr><td>Name:</td> <td><input type = "text" name = "nameSurname" placeholder = "Name and Surname"> </td><tr>
						<tr><td>Username:</td> <td><input type = "text" name = "usernameReg" placeholder = "Username"></td> </tr>
						<tr><td>Password:</td> <td><input type = "password" name = "passReg" placeholder = "Password"> </td></tr>
						<tr><td>Confirm password:</td> <td><input type = "password" name = "confirmPassReg" placeholder = "Confirm Password"> </td></tr>
						<tr><td><input type = "submit" name = "register" value="Submit"></td></tr>
						</form>
					</table>
					<?php
					if($_SERVER['REQUEST_METHOD'] == 'POST') {
						//marrja e te dhenave te formes me metoden POST
						$name = $_POST['nameSurname'];
						$username = $_POST['usernameReg'];
						$password = $_POST['passReg'];
						$confirmPass = $_POST['confirmPassReg'];
						include 'Includes/functions.php';
						register($name, $username, $password, $confirmPass);
					}
					?>
				</div>
			</div>
			<?php include "Includes/aside.php"?>
			<?php include "Includes/footer.php";?>
		</div>
	</body>
</html>