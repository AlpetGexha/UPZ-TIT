<!DOCTYPE html>
	<head>
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="Style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include __DIR__ . '/Includes/template/nav.php'; ?>
			<?php include __DIR__ . '/Includes/template/header.php'; ?>
			<div class="content main">
				<div class="sec">
					<h1>Login Form</h1>
					<table>
						<form action = "" method = "POST">
							<tr>
								<td><input type = "text" name = "usernameLogin" placeholder = "Username"></td>
							</tr>
							<tr>
								<td>
									<?php
                                    echo "<span class='error'><span>";
			?>
								</td>
							</tr>
							<tr>
								<td><input type = "text" name = "passLogin" placeholder = "Password"></td>
							</tr>
							<tr>
								<td>
									<?php
			echo "<span class='error'><span>";
			?>
								</td>
							</tr>
							<tr>
								<td>
								<?php
			                    echo "<span class='error'><span>";
			?>
								</td>
								<td></td>
							</tr>
							<tr>
								<td><input type = "submit"></td>
							</tr>
						</form>
					</table>
				</div>
			</div>
			<?php include __DIR__ . '/Includes/template/aside.php'?>
			<?php include __DIR__ . '/Includes/template/footer.php'; ?>
		</div>
	</body>
</html>