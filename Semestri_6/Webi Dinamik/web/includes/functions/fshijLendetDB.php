<?php

if (! isset($_GET['kodi'])) {
    header('Location: ../../fshijLendet.php');
    exit();
}

require 'connect.php';

$kodi = mysqli_real_escape_string($connect, $_GET['kodi']);

$query = 'DELETE FROM lenda WHERE kodi = ?';
$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, 's', $kodi);
mysqli_stmt_execute($stmt);
mysqli_stmt_close($stmt);

header('Location: ../../fshijLendet.php');
exit();
