<?php

require 'includes/functions/connect.php';

if (
    empty($_POST['fname']) && empty($_POST['email']) &&
    ($_POST['departament'] ?? '') === 'Perzgjedh departamentin' &&
    empty($_POST['idReg']) && empty($_POST['passwordReg'])
) {
    $error = 'Te gjitha te dhenat duhet te plotesohen!';

    return;
}

$emri = $_POST['fname'] ?? '';
$email = $_POST['email'] ?? '';
$departamenti = $_POST['departament'] ?? '';
$userID = $_POST['idReg'] ?? '';
$password = $_POST['passwordReg'] ?? '';

if (empty($emri)) {
    $errorEmri = 'Fusha e emrit duhet te plotesohet!';

    return;
}

if (! preg_match("/^([a-zA-Z' ]+)$/", $emri)) {
    $errorEmri = 'Emri duhet te permbaje vetem shkronja!';

    return;
}

if (empty($email)) {
    $errorEmail = 'Fusha e email adreses duhet te plotesohet!';

    return;
}

if (! filter_var($email, FILTER_VALIDATE_EMAIL)) {
    $errorEmail = 'Email adresa nuk eshte valide!';

    return;
}

if ($departamenti === 'Perzgjedh departamentin') {
    $errorDepartamenti = 'Duhet te zgjedhni nje opsion nga lista!';

    return;
}

if (empty($userID)) {
    $errorUserID = 'Fusha e ID-se duhet te plotesohet!';

    return;
}

if (mb_strlen($userID) !== 9 || ! is_numeric($userID)) {
    $errorUserID = 'ID duhet te permbaje 9 shifra numerike!';

    return;
}

$stmt = mysqli_prepare($connect, 'SELECT 1 FROM perdoruesi WHERE id = ?');
mysqli_stmt_bind_param($stmt, 's', $userID);
mysqli_stmt_execute($stmt);
mysqli_stmt_store_result($stmt);
$userExists = mysqli_stmt_num_rows($stmt);
mysqli_stmt_close($stmt);

if ($userExists !== 0) {
    $errorUserID = 'Ky perdorues ekziston!';

    return;
}

if (empty($password)) {
    $errorPassword = 'Fusha e fjalekalimit duhet te plotesohet!';

    return;
}

$uppercase = preg_match('@[A-Z]@', $password);
$lowercase = preg_match('@[a-z]@', $password);
$number = preg_match('@[0-9]@', $password);
$specialChars = preg_match('@[^\w]@', $password);

if (mb_strlen($password) < 8 || ! $uppercase || ! $lowercase || ! $number || ! $specialChars) {
    $errorPassword = 'Fjalekalim i dobet!';
    $errorPasswordTooltip = 'Fjalekalimi duhet te permbaje te pakten 8 karaktere, prej tyre nje shkronje te madhe, nje shkronje te vogel, nje numer dhe nje karakter special!';

    return;
}

$dataRegj = date('Y-m-d');

$stmt = mysqli_prepare($connect, 'SELECT id FROM departamenti WHERE emri = ?');
mysqli_stmt_bind_param($stmt, 's', $departamenti);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);
$row = mysqli_fetch_assoc($result);
$deptID = $row['id'];
mysqli_stmt_close($stmt);

mysqli_begin_transaction($connect);

try {

    $stmt = mysqli_prepare($connect, "INSERT INTO perdoruesi (id, emri, email, fjalekalimi, roli) VALUES (?, ?, ?, MD5(?), '3')");
    mysqli_stmt_bind_param($stmt, 'ssss', $userID, $emri, $email, $password);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);

    $stmt = mysqli_prepare($connect, "INSERT INTO studenti (id, dataregjistrimit, departamenti, semestri) VALUES (?, ?, ?, '1')");
    mysqli_stmt_bind_param($stmt, 'sss', $userID, $dataRegj, $deptID);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);

    $stmt = mysqli_prepare($connect, 'UPDATE departamenti SET numriStudenteveRegjistruar = numriStudenteveRegjistruar + 1 WHERE id = ?');
    mysqli_stmt_bind_param($stmt, 's', $deptID);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);

    mysqli_commit($connect);

    header('Location: login.php');
    exit();
} catch (Exception $e) {

    mysqli_rollback($connect);
    $error = 'Insertimi nuk u realizua!';
}
