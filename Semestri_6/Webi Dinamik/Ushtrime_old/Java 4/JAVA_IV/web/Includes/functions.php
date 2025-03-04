<?php

function find($username) {
	//hap fajllin per lexim (r = read)
	$file = fopen("db.txt", "r");
	
	$passwordDB = "";
	
	//perderisa nuk ka arrit ne fund te fajllit
	//lexo secilin rresht ne fajllin


	while(!feof($file)) {
		
		//marrja e nje rreshti nga fajlli
		$line = fgets($file);
		
		if($line == "")
			continue;
		
		$array = explode(",", $line);
		//username ne fajllin
		$usernameDB = $array[1];
		
		//nese hyrja e funksioni perputhet me vleren e lexuar te username-it ne fajll
		if($username == $usernameDB) {
			//perdoruesi me kete username u gjet
			$passwordDB = $array[2];
			break;
		}
	}
	fclose($file);
	return $passwordDB;
}

function login($user, $pass) {
	//te pakten njera fushe eshte e zbrazet
	if($user == "" || $pass == "") {
		echo "<p style = 'color: red;'>Te dhenat duhet te plotesohen!</p>";
	}
	//fushat kane vlera, validoje ato vlera
	else {
		//kerko ne fajllin per perdoruesin me username ne variablen user
		$passwordDB = find($user);
		
		//nese perdoruesi ekziston
		if($passwordDB != "") {
			//fjalekalimi perputhet
			if($pass == trim($passwordDB)) {
				//kyqe perdoruesin
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
	}
}

function register($name, $username, $password, $confirmPass) {
	
	//te pakten njera fushe eshte e zbrazet
	if($name == "" || $username == "" || $password == "" || $confirmPass == "") {
		echo "<p style = 'color: red;'>Te dhenat duhet te plotesohen!</p>";
	}
	//te gjitha fushat kane vlera, validoje vlerat
	else {
		//kerko ne fajllin ne baze te username-it dhe rezultatin nga funksioni ruaje ne variablen $passwordDB
		$passwordDB = find($username);
		//nese perdoruesi nuk eshte gjet, dmth nuk ekziston
		if($passwordDB == "") { 
		//nese fjalekalimi eshte konfirmuar sakte, ok
			if($password == $confirmPass) {
				$myfile = fopen("db.txt", "a+") or die("Nuk mund te hap fajllin!");
				$text = $name . "," . $username . "," . $password . PHP_EOL;
				fwrite($myfile, $text);
				fclose($myfile);
				header("Location: login.php");
			}
			else {
				echo "<p style = 'color: red;'>Fjalekalimi jo i perputhshem!</p>";
			}
		}
		//perdoruesi eshte gjet
		else {
			echo "<p style = 'color: red;'>Ky perdorues tashme ekziston!</p>";
		}
	}
}
?>