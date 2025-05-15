<?php

if (! isset($_GET['studenti']) || ! isset($_GET['provimi'])) {
    header('Location: ../../regjistroLendet.php');
    exit();
}

require 'connect.php';

$studenti = mysqli_real_escape_string($connect, $_GET['studenti']);
$provimi = mysqli_real_escape_string($connect, $_GET['provimi']);

$query = 'DELETE FROM rezultatet WHERE studenti = ? AND provimi = ?';
$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, 'ss', $studenti, $provimi);
mysqli_stmt_execute($stmt);
mysqli_stmt_close($stmt);

header('Location: ../../regjistroLendet.php');
exit();
