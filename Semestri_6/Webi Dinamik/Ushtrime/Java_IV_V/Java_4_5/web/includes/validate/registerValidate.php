<?php

require "includes/functions/connect.php";

$emri = $_POST['fname'];
$email = $_POST['email'];
$departamenti = $_POST['departament'];
$userID = $_POST['idReg'];
$password = $_POST['passwordReg'];

$register = true;

if (empty($emri) && empty($email) && $departamenti == 'Përzgjedh departamentin' && empty($userID) && empty($password)) {
    $error = 'Të gjitha të dhënat duhet të plotësohen!';
    $register = false;
} else {
    // Validate emri
    if (empty($emri)) {
        $errorEmri = 'Fusha e emrit duhet të plotësohet!';
        $register = false;
    } elseif (! preg_match("/^([a-zA-Z' ]+)$/", (string) $emri)) {
        $errorEmri = 'Emri duhet të përmbajë vetëm shkronja!';
        $register = false;
    }

    // Validate email
    if (empty($email)) {
        $errorEmail = 'Fusha e email adresës duhet të plotësohet!';
        $register = false;
    } elseif (! filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $errorEmail = 'Email adresa nuk është valide!';
        $register = false;
    }

    // Validate departamenti
    if ($departamenti == 'Përzgjedh departamentin') {
        $errorDepartamenti = 'Duhet të zgjidhni një opsion nga lista!';
        $register = false;
    }

    // Validate user ID
    if (empty($userID)) {
        $errorUserID = 'Fusha e ID-së duhet të plotësohet!';
        $register = false;
    } else {
        $query2 = $db->prepare('SELECT * FROM perdoruesi WHERE id = :userID');
        $query2->execute([':userID' => $userID]);
        $count2 = $query2->rowCount();
        if (strlen((string) $userID) != 9 || ! is_numeric($userID)) {
            $errorUserID = 'ID duhet të ketë 9 shifra numerike';
            $register = false;
        } elseif ($count2 != 0) {
            $errorUserID = 'Ky përdorues ekziston!';
            $register = false;
        }
    }

    // Validate password
    if (empty($password)) {
        $errorPassword = 'Fusha e fjalëkalimit duhet të plotësohet!';
        $register = false;
    } else {
        $uppercase = preg_match('@[A-Z]@', (string) $password);
        $lowercase = preg_match('@[a-z]@', (string) $password);
        $number = preg_match('@[0-9]@', (string) $password);
        $specialChars = preg_match('@[^\w]@', (string) $password);
        if (! $uppercase || ! $lowercase || ! $number || ! $specialChars) {
            $errorPassword = 'Fjalëkalim i dobët!';
            $errorPasswordTooltip = 'Fjalëkalimi duhet të përmbajë të paktën një shkronjë të madhe, një shkronjë të vogël, një numër dhe një karakter special!';
            $register = false;
        }
    }

    // Register user if all validations pass
    if ($register) {
        $dataRegjistrimit = date('Y-m-d');

        $query3 = $db->prepare('SELECT id FROM departamenti WHERE emri = :departamenti');
        $query3->execute([':departamenti' => $departamenti]);
        $row3 = $query3->fetch(PDO::FETCH_ASSOC);
        $departamentiID = $row3['id'];

        $queryInsert1 = "INSERT INTO perdoruesi (id, emri, email, fjalekalimi, roli) VALUES (:userID, :emri, :email, MD5(:password), '3')";
        $queryInsert2 = "INSERT INTO studenti (id, dataRegjistrimit, departamenti, semestri) VALUES (:userID, :dataRegjistrimit, :departamentiID, '1')";

        $query4 = $db->prepare('SELECT * FROM departamenti WHERE id = :departamentiID');
        $query4->execute([':departamentiID' => $departamentiID]);
        $row4 = $query4->fetch(PDO::FETCH_ASSOC);
        $nrStdRegj = $row4['nrStdRegjistruar'] + 1;

        try {
            $db->beginTransaction();
            $stmt1 = $db->prepare($queryInsert1);
            $stmt1->execute([':userID' => $userID, ':emri' => $emri, ':email' => $email, ':password' => $password]);
            $stmt2 = $db->prepare($queryInsert2);
            $stmt2->execute([':userID' => $userID, ':dataRegjistrimit' => $dataRegjistrimit, ':departamentiID' => $departamentiID]);
            $updateQuery = $db->prepare('UPDATE departamenti SET nrStdRegjistruar = :nrStdRegj WHERE id = :departamentiID');
            $updateQuery->execute([':nrStdRegj' => $nrStdRegj, ':departamentiID' => $departamentiID]);
            $db->commit();
            header('Location: login.php');
        } catch (Exception $e) {
            $db->rollBack();
            $error = 'Insertimi nuk u realizua me sukses!' . $e->getMessage();
        }
    }
}
