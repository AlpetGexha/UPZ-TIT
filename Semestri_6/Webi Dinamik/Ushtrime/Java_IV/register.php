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
					<table class = "form-group">
						<form action = "" method = "POST">
							<tr>
								<td><input type = "text" name = "fname" placeholder = "Emri"></td>
								<td><input type = "text" name = "email" placeholder = "Email adresa"></td>
							</tr>
							<tr>
								<td>
									<?php
                                    echo "<span class='error'><span>";
			?>
								</td>
								<td>
									<?php
			echo "<span class='error'><span>";
			?>
								</td>
							</tr>
							<tr>
								<td colspan = "2">
									<select name = "departament">
										<option  value = "Dizajnimi i Softuerëve">Dizajnimi i Softuereve</option>
									</select>
								</td>
							</tr>
							<tr>
								<td colspan = "2">
									<?php
			echo "<span class='error'><span>";
			?>
								</td>
							</tr>
							<tr>
								<td><input type = "text" name = "idReg" placeholder = "ID"></td>
								<td><input type = "password" name = "passwordReg" placeholder = "Fjalekalimi"></td>
							</tr>
							<tr>
								<td>
									<?php
			echo "<span class='error'><span>";
			?>
								</td>
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
								<td><input type = "submit" name = "register" value="Submit"></td>
							</tr>
						</form>
					</table>
					
				</div>
			</div>
			<?php include 'Includes/template/aside.php'?>
			<?php include 'Includes/template/footer.php'; ?>
		</div>
	</body>
</html>