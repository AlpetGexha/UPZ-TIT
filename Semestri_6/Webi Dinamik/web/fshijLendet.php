<?php
session_start();

if (isset($_SESSION['username']) && isset($_SESSION['roli'])) {
    if ($_SESSION['roli'] === 1) {
        ?>
<!DOCTYPE html>
	<head>
		<title>Fshirja e lendeve</title>
		<link rel="stylesheet" type="text/css" href="Style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include 'Includes/template/nav.php'; ?>
			<?php include 'Includes/template/header.php'; ?>
			<div class="content main">
				<div class="sec">
					<h2>Fshirja e lendeve</h2>
					<?php
                            include 'includes/functions/selectFshijLendet.php';
        ?>
				</div>
			</div>
			<?php include 'Includes/template/aside.php'?>
			<?php include 'Includes/template/footer.php'; ?>
		</div>
	</body>
</html>
<?php
    } else {
        header('Location: home.php');
    }
} else {
    header('Location: login.php');
}
?>