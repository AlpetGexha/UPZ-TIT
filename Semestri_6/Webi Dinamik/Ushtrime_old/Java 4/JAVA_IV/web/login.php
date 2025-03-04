<!DOCTYPE html>
	<head>
		<title>Home</title>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>

	<body>
		<div id="container">
			<?php include "Includes/nav.php";?>
			<?php include "Includes/header.php";?>
			<div class="content main">
				<div class="sec">
					<h1>Login Form</h1>
					<form action = "<?php echo $_SERVER['PHP_SELF'];?>" method = "POST">
						Username: <input type = "text" name = "usernameLogin" placeholder = "Username"> <br/><br/>
						Password:  <input type = "password" name = "passLogin" placeholder = "Password"> <br/><br/>
						<input type = "submit" ><br/><br/>
					</form>
					<?php
					if($_SERVER['REQUEST_METHOD'] == "POST") {
						//marrja e te dhenave te formes me metoden POST
						$user = $_POST['usernameLogin'];
						$pass= $_POST['passLogin'];
						include 'Includes/functions.php';
						login($user, $pass);
					}
					?>
				</div>
			</div>
			<?php include "Includes/aside.php"?>
			<?php include "Includes/footer.php";?>
		</div>
	</body>
</html>