<!DOCTYPE html>
	<head>
		<title>Register</title>
		<link rel="stylesheet" type="text/css" href="Style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include 'Includes/template/nav.php'; ?>
			<?php include 'Includes/template/header.php'; ?>
			<div class="content main">
				<div class="sec">
					<h1>Register Form</h1>
					<table>
						<form action = "<?php echo $_SERVER['PHP_SELF']; ?>" method = "POST">
						<tr><td>Name:</td> <td><input type = "text" name = "nameSurname" placeholder = "Name and Surname"> </td><tr>
						<tr><td>Username:</td> <td><input type = "text" name = "usernameReg" placeholder = "Username"></td> </tr>
						<tr><td>Password:</td> <td><input type = "password" name = "passReg" placeholder = "Password"> </td></tr>
						<tr><td>Confirm password:</td> <td><input type = "password" name = "confirmPassReg" placeholder = "Confirm Password"> </td></tr>
						<tr><td><input type = "submit" name = "register" value="Submit"></td></tr>
						</form>
					</table>
					<?php
                    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
                        $emri = $_POST['nameSurname'];
                        $username = $_POST['usernameReg'];
                        $password = $_POST['passReg'];
                        $confirmPassword = $_POST['confirmPassReg'];

                        include 'includes/functions/functions.php';
                        register($emri, $username, $password, $confirmPassword);
                    }
			?>
				</div>
			</div>
			<?php include 'Includes/template/aside.php'?>
			<?php include 'Includes/template/footer.php'; ?>
		</div>
	</body>
</html>