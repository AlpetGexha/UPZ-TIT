<?php
session_start();


if (isset($_SESSION['username']) && isset($_SESSION['roli'])) {
	header('Location: home.php');
	exit();
}


$error = $errorUsername = $errorPassword = '';
$username = '';
$successMessage = '';

// Check if password reset was successful
if (isset($_SESSION['password_reset_success']) && $_SESSION['password_reset_success'] === true) {
    $successMessage = 'Fjalëkalimi juaj u rivendos me sukses! Ju mund të hyni me fjalëkalimin e ri.';
    unset($_SESSION['password_reset_success']);
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
	include 'includes/functions/loginValidate.php';
}
?>
<!DOCTYPE html>
<html lang="en">

<head>	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="Style/style.css">
	<style>
		.forgot-password {
			display: block;
			text-align: center;
			margin-top: 10px;
			color: #4285f4;
			text-decoration: none;
		}
		.forgot-password:hover {
			text-decoration: underline;
		}
	</style>
</head>

<body>
	<div id="container">
		<?php include 'includes/template/nav.php'; ?>
		<?php include 'includes/template/header.php'; ?>		<div class="content main">
			<div class="sec">
				<h1>Login Form</h1>
				
				<?php if (!empty($successMessage)): ?>
				<div class="success-message" style="padding: 10px; background-color: #dff0d8; color: #3c763d; border-radius: 4px; margin-bottom: 15px;">
					<?php echo $successMessage; ?>
				</div>
				<?php endif; ?>
				
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
						<tr>
							<td><a href="forgot-password.php" class="forgot-password">Forgot your password?</a></td>
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