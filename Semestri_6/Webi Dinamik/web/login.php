<?php
session_start();

if (! isset($_SESSION['username']) && ! isset($_SESSION['roli'])) {
    ?>

	<!DOCTYPE html>

	<head>
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="Style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include 'Includes/template/nav.php'; ?>
			<?php include 'Includes/template/header.php'; ?>
			<div class="content main">
				<div class="sec">
					<h1>Login Form</h1>
					<?php
                        $error = $errorUsername = $errorPassword = '';
    $username = '';

    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        include 'includes/functions/loginValidate.php';
    }
    ?>
					<table>
						<form action="" method="POST">
							<tr>
								<td><input type="text" name="usernameLogin" placeholder="Username" value="<?php if (empty($errorUsername)) {
								    echo $username;
								} ?>"></td>
							</tr>
							<tr>
								<td>
									<?php
                                    echo "<span class='error'>{$errorUsername}<span>";
    ?>
								</td>
							</tr>
							<tr>
								<td><input type="password" name="passLogin" placeholder="Password"></td>
							</tr>
							<tr>
								<td>
									<?php
    echo "<span class='error'>{$errorPassword}<span>";
    ?>
								</td>
							</tr>
							<tr>
								<td>
									<?php
    echo "<span class='error'>{$error}<span>";
    ?>
								</td>
								<td></td>
							</tr>
							<tr>
								<td><input type="submit"></td>
							</tr>
						</form>
					</table>
				</div>
			</div>
			<?php include 'Includes/template/aside.php' ?>
			<?php include 'Includes/template/footer.php'; ?>
		</div>
	</body>

	</html>
<?php
} else {
    header('Location: home.php');
}
?>