<?php

if (! isset($_SESSION['username'])) {
    echo "<option value=''>Session not active</option>";

    return;
}

require 'includes/functions/connect.php';

$userID = $_SESSION['username'];

$query = 'SELECT DISTINCT d.id AS did, d.emri
          FROM departamenti d
          JOIN ligjerimet l ON l.departamenti = d.id
          WHERE l.profesori = ?
          ORDER BY d.emri';

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
    $departamenti = htmlspecialchars($row['emri'], ENT_QUOTES, 'UTF-8');
    $deptID = htmlspecialchars($row['did'], ENT_QUOTES, 'UTF-8');
    echo "<option value=\"{$deptID}\">{$departamenti}</option>";
}

mysqli_stmt_close($stmt);
