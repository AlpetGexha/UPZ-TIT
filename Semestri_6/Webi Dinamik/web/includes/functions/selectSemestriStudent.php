<?php

if (! isset($_SESSION['username'])) {
    echo "<option value=''>Session not active</option>";

    return;
}

require 'includes/functions/connect.php';

$username = $_SESSION['username'];

$stmt = mysqli_prepare($connect, 'SELECT semestri FROM studenti WHERE id = ?');
mysqli_stmt_bind_param($stmt, 's', $username);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if (! $result || mysqli_num_rows($result) === 0) {
    echo "<option value=''>No semester data found</option>";
    mysqli_stmt_close($stmt);

    return;
}

$row = mysqli_fetch_assoc($result);
$currentSemester = (int) $row['semestri'];
mysqli_stmt_close($stmt);

$stmt = mysqli_prepare($connect, 'SELECT id, pershkrimi FROM semestri WHERE id <= ? ORDER BY id');
mysqli_stmt_bind_param($stmt, 'i', $currentSemester);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

while ($row = mysqli_fetch_assoc($result)) {
    $semesterId = (int) $row['id'];
    $semesterDesc = htmlspecialchars($row['pershkrimi'], ENT_QUOTES, 'UTF-8');
    echo "<option value=\"{$semesterId}\">{$semesterDesc}</option>";
}

mysqli_stmt_close($stmt);
