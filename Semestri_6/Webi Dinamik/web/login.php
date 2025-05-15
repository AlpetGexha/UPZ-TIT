<?php
session_start();


if (isset($_SESSION['username']) && isset($_SESSION['roli'])) {
	header('Location: home.php');
	exit();
}


$error = $errorUsername = $errorPassword = '';
$username = '';


if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	include 'includes/functions/loginValidate.php';
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="Style/style.css">
</head>

<body>
	<div id="container">
		<?php include 'includes/template/nav.php'; ?>
		<?php include 'includes/template/header.php'; ?>
		<div class="content main">
			<div class="sec">
				<h1>Login Form</h1>
				<table>
					<form action="" method="POST">
						<tr>
							<td><input type="text" name="usernameLogin" placeholder="Username" value="<?= ! empty($username) ? htmlspecialchars($username) : '' ?>"></td>
						</tr>
						<tr>
							<td>
								<span class="error"><?= htmlspecialchars($errorUsername) ?></span>
							</td>
						</tr>
						<tr>
							<td><input type="password" name="passLogin" placeholder="Password"></td>
						</tr>
						<tr>
							<td>
								<span class="error"><?= htmlspecialchars($errorPassword) ?></span>
							</td>
						</tr>
						<tr>
							<td>
								<span class="error"><?= htmlspecialchars($error) ?></span>
							</td>
							<td></td>
						</tr>
						<tr>
							<td><input type="submit" value="Login"></td>
						</tr>
					</form>
				</table>
			</div>
		</div>
		<?php include 'includes/template/aside.php' ?>
		<?php include 'includes/template/footer.php'; ?>
	</div>
</body>

</html>