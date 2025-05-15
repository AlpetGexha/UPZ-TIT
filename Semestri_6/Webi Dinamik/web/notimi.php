<?php
session_start();

if (isset($_SESSION['username']) && isset($_SESSION['roli'])) {
    if ($_SESSION['roli'] === 2) {
        ?>
<!DOCTYPE html>
	<head>
		<title>Notimi</title>
		<link rel="stylesheet" type="text/css" href="Style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include 'Includes/template/nav.php'; ?>
			<?php include 'Includes/template/header.php'; ?>
			<div class="content main">
				<div class="sec">
					<h2>Notimi</h2>
					<table>
					<form action = "" method = "POST">
						<tr>
							<td>
								<select name = "departamenti">
									<?php
                                            include 'includes/functions/selectDepartamentProfesor.php';
        ?>
								</select>
							</td>
							<td>
								<select name = "lenda">
									<?php
        include 'includes/functions/selectLendaProfesor.php';
        ?>
								</select>
							</td>
							<td><input type = "submit"/></td>
						</tr>
					</form>
					</table>
					<?php
                    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
                        include 'includes/functions/selectNotimi.php';
                    }
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