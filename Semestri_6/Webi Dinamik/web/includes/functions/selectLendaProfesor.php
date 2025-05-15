<?php

if (! isset($_SESSION['username'])) {
    echo "<option value=''>Session not active</option>";

    return;
}

require 'includes/functions/connect.php';

$userID = $_SESSION['username'];

$query = 'SELECT DISTINCT l.kodi, l.emri
          FROM lenda l
          JOIN ligjerimet i ON l.kodi = i.lenda
          WHERE i.profesori = ?
          ORDER BY l.emri';

$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, 's', $userID);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if (mysqli_num_rows($result) === 0) {
    echo "<option value='Nuk ka të dhëna'>Nuk ka të dhëna</option>";
    mysqli_stmt_close($stmt);

    return;
}

while ($row = mysqli_fetch_assoc($result)) {
    $lenda = htmlspecialchars($row['emri'], ENT_QUOTES, 'UTF-8');
    $lendaKodi = htmlspecialchars($row['kodi'], ENT_QUOTES, 'UTF-8');
    echo "<option value=\"{$lendaKodi}\">{$lenda}</option>";
}

mysqli_stmt_close($stmt);
