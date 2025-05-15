<div class="nav">
	<a href="index.php">Home</a>
	<a href="#">About</a>
	<a href="#">Contact</a>
	<?php
	if(!isset($_SESSION['username'])) {
	?>
		<a href="register.php">Register</a>
		<a href="login.php">Login</a>
	<?php
	}
	else {
		if(isset($_SESSION['roli'])) {
			if($_SESSION['roli'] == 1) {
				echo "<a href = 'fshijLendet.php'>Fshij lendet</a>";
			}
			else if($_SESSION['roli'] == 2) {
				echo "<a href = 'notimi.php'>Notimi</a>";
			}
			else if($_SESSION['roli'] == 3) {
				echo "<a href = 'regjistroLendet.php'>Regjistro lendet</a>";
				echo "<a href = 'rezultatet.php'>Rezultatet</a>";
			}
		}
		echo "<a href = '#'>Profile</a>";
		echo "<a href = 'logout.php'>Logout</a>";
	}
	?>
</div>