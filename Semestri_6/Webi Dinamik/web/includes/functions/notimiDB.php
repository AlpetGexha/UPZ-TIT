<?php

if (! isset($_POST['studID']) || ! isset($_POST['notimi']) || ! isset($_POST['provimi'])) {
    header('Location: ../../notimi.php');
    exit();
}

require 'connect.php';

$studID = mysqli_real_escape_string($connect, $_POST['studID']);
$nota = mysqli_real_escape_string($connect, $_POST['notimi']);
$provimi = mysqli_real_escape_string($connect, $_POST['provimi']);

$query = 'UPDATE rezultatet SET nota = ? WHERE studenti = ? AND provimi = ?';
$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, 'iss', $nota, $studID, $provimi);
mysqli_stmt_execute($stmt);
mysqli_stmt_close($stmt);

if ((int) $nota === 10) {
    $query = 'UPDATE rezultatet SET transkripte = 1 WHERE studenti = ? AND provimi = ?';
    $stmt = mysqli_prepare($connect, $query);
    mysqli_stmt_bind_param($stmt, 'ss', $studID, $provimi);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_close($stmt);
}

header('Location: ../../notimi.php');
exit();
