<?php

require 'includes/functions/connect.php';

$emri = $_POST['fname'];
$email = $_POST['email'];
$departamenti = $_POST['departament'];
$userID = $_POST['idReg'];
$password = $_POST['passwordReg'];

$register = true;

if (empty($emri) && empty($email) && $departamenti === 'Perzgjedh departamentin' && empty($userID) && empty($password)) {
    $error = 'Te gjitha te dhenat duhet te plotesohen!';
    $register = false;
} else {
    // emri
    if (empty($emri)) {
        $errorEmri = 'Fusha e emrit duhet te plotesohet!';
        $register = false;
    } else {
        if (! preg_match("/^([a-zA-Z' ]+)$/", $emri)) {
            $errorEmri = 'Emri duhet te permbaje vetem shkronja!';
            $register = false;
        }
    }

    // email
    if (empty($email)) {
        $errorEmail = 'Fusha e email adreses duhet te plotesohet!';
        $register = false;
    } else {
        if (! filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $errorEmail = 'Email adresa nuk eshte valide!';
            $register = false;
        }
    }

    // departamenti
    if ($departamenti === 'Perzgjedh departamentin') {
        $errorDepartamenti = 'Duhet te zgjedhni nje opsion nga lista!';
        $register = false;
    }

    // userid
    if (empty($userID)) {
        $errorUserID = 'Fusha e ID-se duhet te plotesohet!';
        $register = false;
    } else {
        $query = mysqli_query($connect, "SELECT * FROM perdoruesi WHERE id = '{$userID}';");
        $count = mysqli_num_rows($query);
        if (mb_strlen($userID) !== 9 || ! is_numeric($userID)) {
            $errorUserID = 'ID duhet te permbaje 9 shifra numerike!';
            $register = false;
        } elseif ($count !== 0) {
            $errorUserID = 'Ky perdorues ekziston!';
            $register = false;
        }
    }

    // password
    if (empty($password)) {
        $errorPassword = 'Fusha e fjalekalimit duhet te plotesohet!';
        $register = false;
    } else {
        $uppercase = preg_match('@[A-Z]@', $password);
        $lowercase = preg_match('@[a-z]@', $password);
        $number = preg_match('@[0-9]@', $password);
        $specialChars = preg_match('@[^\w]@', $password);
        if (mb_strlen($password) < 8 || ! $uppercase || ! $lowercase || ! $number || ! $specialChars) {
            $errorPassword = 'Fjalekalim i dobet!';
            $errorPasswordTooltip = 'Fjalekalimi duhet te permbaje te pakten 8 karaktere, prej tyre nje shkronje te madhe, nje shkronje te vogel, nje numer dhe nje karakter special!';
            $register = false;
        }
    }

    // nese nuk ka asnje gabim ne plotesimin e formes, vazhdo me regjistrimin e studentit
    if ($register) { // if($register == true)
        $dataRegj = date('Y-m-d');
        $query2 = mysqli_query($connect, "SELECT id FROM departamenti WHERE emri = '{$departamenti}';");
        $row2 = mysqli_fetch_assoc($query2);
        $deptID = $row2['id'];

        $queryInsert = "INSERT INTO perdoruesi (id, emri, email, fjalekalimi, roli)
		VALUES ('{$userID}', '{$emri}', '{$email}', md5('{$password}'), '3');";
        $queryInsert .= "INSERT INTO studenti (id, dataregjistrimit, departamenti, semestri)
		VALUES ('{$userID}', '{$dataRegj}', '{$deptID}', '1');";

        // u shtua nje student i ri, ndrysho numrin e studenteve te regjistruar ne departamentin perkates
        $query3 = mysqli_query($connect, "SELECT * FROM departamenti WHERE id = '{$deptID}';");
        $row3 = mysqli_fetch_assoc($query3);
        $numriSR = $row3['numriStudenteveRegjistruar'];
        $numriSR = $numriSR + 1;

        mysqli_query($connect, "UPDATE departamenti
			SET numriStudenteveRegjistruar = '{$numriSR}'
			WHERE id = '{$deptID}';");

        $insert = mysqli_multi_query($connect, $queryInsert);
        if ($insert) {
            header('Location: login.php');
        } else {
            $error = 'Insertimi nuk u realizua!';
        }
    }
}
