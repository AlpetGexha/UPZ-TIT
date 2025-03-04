<div class="nav">
	<a href="index.php">Home</a>
	<a href="#">About</a>
	<a href="#">Contact</a>
	<?php
	//nese perdoruesi nuk eshte kyq ne sistem
	if(!isset($_SESSION['usernameID'])) {
		echo '<a href="register.php">Register</a>
			<a href="login.php">Login</a>';
	}
	
	//nese perdoruesi eshte kyq ne sistem
	else {
		//paraqitja linqet per web faqet perkatese roleve te ndryshme te perdoruesit te kyqur ne sistem
		if(isset($_SESSION['roli'])) {
			//student
			if($_SESSION['roli'] == 3) {
				echo '<a href="registerExams.php">Register Exams</a>
					<a href="submitExams.php">Submit Exams</a>';
			}
			//profesor
			else if($_SESSION['roli'] == 2) {
				echo '';
			}
			//administrator
			else if($_SESSION['roli'] == 1) {
				echo '';
			}
		}
		echo '<a href = "Includes/validate/logout.php">Logout</a>';
	}
	?>
</div>