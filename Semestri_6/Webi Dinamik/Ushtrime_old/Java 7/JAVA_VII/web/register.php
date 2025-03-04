<!DOCTYPE html>
	<head>
		<title>Register</title>
		<link rel="stylesheet" type="text/css" href="style/style.css">
	</head>

	<body>
		<div id="container">
			<?php include "Includes/template/nav.php";?>
			<?php include "Includes/template/header.php";?>
			<div class="content main">
				<div class="sec">
					<h1>Register Form</h1>
					<?php
					
					//se pari na nevojitet te i krijojme (deklarojme) variablat qe permbajne mesazhet e gabimeve qe kane ndodhur para se ti perdorim
					$errorGen = $errorFname = $errorLname = $errorDepartament = $errorEmail = $errorEmail = $errorEmail = $errorID = $errorID = $errorID = $errorID = $errorPass = $errorPass = $errorPassTooltip = "";
					
					//ne te njejten menyre i krijojme edhe variablat qe permbajne vlerat aktuale qe i ka shenuar perdoruesi kur e ka plotesuar formen
					//keto vlera do te shenohen neper fushat perkatese te tekstit permes atributut value, dmth vlerat qe i ka shenuar perdoruesi do te ruhen ne formen derisa te mund te realizohet insertimi i tyre ne db 
					$fname = $lname = $email = $id = $pass = "";
					$departament = "Perzgjidh departamentin";
					
					//kushti if ne kete rast do te plotesohet vetem pasi klikohet butoni Submit ne formen
					if($_SERVER['REQUEST_METHOD'] == 'POST') {
						//POST
						
						include 'Includes/validate/registerValidate.php';
					}
					?>
					<table>
						<form action = "<?php echo $_SERVER['PHP_SELF'];?>" method = "POST">
							<tr>
								<td><input type = "text" name = "fname" placeholder = "Emri" value="<?php echo $fname;?>"></td>
								<td><input type = "text" name = "lname" placeholder = "Mbiemri" value="<?php echo $lname;?>"></td>
							</tr>
							<!--errors-->
							<tr>
								<td>
								<?php
								echo "<span class='error'>$errorFname<span>";
								?>
								</td>
								<td>
								<?php
								echo "<span class='error'>$errorLname<span>";
								?>
								</td>
							</tr>
							<tr>
								<td>
									<select name = "departament">
										<option  value="<?php echo $departament;?>"><?php echo $departament;?></option>
										<?php include "Includes/functions/selectDepartament.php";?>
										
									</select>
								</td>
								<td><input type = "text" name = "email" placeholder = "Email adresa" value="<?php echo $email;?>"></td>
							</tr>
							<!--errors-->
							<tr>
								<td>
								<?php
								echo "<span class='error'>$errorDepartament<span>";
								?>
								</td>
								<td>
								<?php
								echo "<span class='error'>$errorEmail<span>";
								?>
								</td>
							</tr>
							<tr>
								<td><input type = "text" name = "idReg" placeholder = "ID" value="<?php echo $id;?>"></td>
								<td><input type = "password" name = "passwordReg" placeholder = "Fjalekalimi"></td>
							</tr>
							<!--errors-->
							<tr>
								<td>
								<?php
								echo "<span class='error'>$errorID<span>";
								?>
								</td>
								<td>
								<?php
								echo "<span class='error' title = '$errorPassTooltip'>$errorPass<span>";
								?>
								</td>
							</tr>
							<tr>
								<td>
								<?php
								echo "<span class='error'>$errorGen<span>";
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
			<?php include "Includes/template/aside.php"?>
			<?php include "Includes/template/footer.php";?>
		</div>
	</body>
</html>