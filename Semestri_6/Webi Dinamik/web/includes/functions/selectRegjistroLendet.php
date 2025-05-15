<?php

if (! isset($_SESSION['username'])) {
    header('Location: login.php');
    exit();
}

$username = $_SESSION['username'];
require 'includes/functions/connect.php';

$stmt = mysqli_prepare($connect, 'SELECT emri FROM perdoruesi WHERE id = ?');
mysqli_stmt_bind_param($stmt, 's', $username);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);
$row = mysqli_fetch_assoc($result);
$studenti = $row['emri'];
mysqli_stmt_close($stmt);

$query = 'SELECT l.emri AS lenda, l.statusi,
                 l.kredite, p.emri AS profesori,
                 i.id AS provimi
          FROM lenda l
          JOIN ligjerimet i ON l.kodi = i.lenda
          JOIN profesori r ON r.id = i.profesori
          JOIN perdoruesi p ON p.id = r.id
          JOIN studenti s ON s.departamenti = i.departamenti
                        AND s.semestri = i.semestri
          WHERE s.id = ?';

$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, 's', $username);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

echo "<table class = 'exams'>
		<tr class = 'exams'>
			<th class = 'exams'></th>
			<th class = 'exams'>Studenti</th>
			<th class = 'exams'>Lenda</th>
			<th class = 'exams'>Statusi</th>
			<th class = 'exams'>Kredite</th>
			<th class = 'exams'>Profesori</th>
			<th class = 'exams'></th>
			<th class = 'exams'></th>
		</tr>";

$i = 0;
while ($row = mysqli_fetch_assoc($result)) {
    $i++;
    $lenda = $row['lenda'];
    $statusi = $row['statusi'];
    $kredite = $row['kredite'];
    $profesori = $row['profesori'];
    $provimi = $row['provimi'];

    echo "<tr class = 'exams'>
			<td class = 'exams'>{$i}</td>
			<td class = 'exams'>{$studenti}</td>
			<td class = 'exams'>{$lenda}</td>
			<td class = 'exams'>{$statusi}</td>
			<td class = 'exams'>{$kredite}</td>
			<td class = 'exams'>{$profesori}</td>";

    $checkStmt = mysqli_prepare($connect, 'SELECT 1 FROM rezultatet WHERE studenti = ? AND provimi = ?');
    mysqli_stmt_bind_param($checkStmt, 'ss', $username, $provimi);
    mysqli_stmt_execute($checkStmt);
    mysqli_stmt_store_result($checkStmt);
    $isRegistered = mysqli_stmt_num_rows($checkStmt);
    mysqli_stmt_close($checkStmt);

    echo "<td class = 'exams'>";
    if ($isRegistered === 0) {
        echo "<a href = 'includes/functions/regjistroLendetDB.php?studenti={$username}&provimi={$provimi}' class = 'btn'>Regjistro</a>";
    }
    echo '</td>';

    echo "<td class = 'exams'>";
    if ($isRegistered === 1) {
        echo "<a href = 'includes/functions/cregjistroLendetDB.php?studenti={$username}&provimi={$provimi}' class = 'btn'>Çregjistro</a>";
    }
    echo '</td>';

    echo '</tr>';
}

mysqli_stmt_close($stmt);
echo '</table>';
