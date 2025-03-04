<?php

function login($user, $pass) {
	if($user == "" || $pass == "") {
		echo "<p style = 'color: red;'>Te dhenat duhet te plotesohen!</p>";
	}
	else {
		$myfile = fopen("db.txt", "r") or die("Nuk mund te hap fajllin!");
		$text = fread($myfile, filesize("db.txt"));
		$arr = explode(",", $text);
		$username = $arr[1];
		$password = $arr[2];
	
		if($user == $username) {
			if($pass == $password) {
				echo "<p style = 'color: green;'>Sakte!</p>";
				header("Location: Home.php");
			}
			else {
				echo "<p style = 'color: red;'>Fjalekalimi jo i sakte!</p>";
			}
		}
		else {
			echo "<p style = 'color: red;'>Ky perdorues nuk ekziston!</p>";
		}
		fclose($myfile);
	}
}

function register($name, $username, $password, $confirmPass) {
	
	if($name == "" || $username == "" || $password == "" || $confirmPass == "") {
		echo "<p style = 'color: red;'>Te dhenat duhet te plotesohen!</p>";
	}
	else {
		
		if($password == $confirmPass) {
			$myfile = fopen("db.txt", "w") or die("Nuk mund te hap fajllin!");
			$text = $name . "," . $username . "," . $password;
			fwrite($myfile, $text);
			fclose($myfile);
			heaDer("Location: login.php");
		}
		else {
			echo "<p style = 'color: red;'>Fjalekalimi jo i perputhshem!</p>";
		}
		
		}
	}
?>