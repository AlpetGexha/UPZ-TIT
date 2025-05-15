<?php

$username = $_SESSION['username'];

require 'includes/functions/connect.php';

$query = mysqli_query($connect, "SELECT emri FROM perdoruesi
								 WHERE id = '{$username}';");
$row = mysqli_fetch_assoc($query);
$studenti = $row['emri'];

$query2 = mysqli_query($connect, "SELECT l.emri AS lenda, l.statusi,
									l.kredite, p.emri AS profesori,
									i.id AS provimi
								  FROM lenda l, perdoruesi p, profesori r,
									studenti s, ligjerimet i
								  WHERE l.kodi = i.lenda AND p.id = r.id
									AND r.id = i.profesori
									AND s.departamenti = i.departamenti
									AND s.semestri = i.semestri
									AND s.id = '{$username}';");

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
// echo "<pre> ";
// var_dump($row2 = mysqli_fetch_assoc($query2));
while ($row2 = mysqli_fetch_assoc($query2)) {
    $i++;
    $lenda = $row2['lenda'];
    $statusi = $row2['statusi'];
    $kredite = $row2['kredite'];
    $profesori = $row2['profesori'];
    $provimi = $row2['provimi'];

    echo "<tr class = 'exams'>
			<td class = 'exams'>{$i}</td>
			<td class = 'exams'>{$studenti}</td>
			<td class = 'exams'>{$lenda}</td>
			<td class = 'exams'>{$statusi}</td>
			<td class = 'exams'>{$kredite}</td>
			<td class = 'exams'>{$profesori}</td>";

    $query3 = mysqli_query($connect, "SELECT * FROM rezultatet
							WHERE studenti = '{$username}'
								AND provimi = '{$provimi}';");
    $count3 = mysqli_num_rows($query3);
    echo "<td class = 'exams'>";
    if ($count3 === 0) {
        echo "<a href = 'includes/functions/regjistroLendetDB.php?studenti={$username}&provimi={$provimi}' class = 'btn'>Regjistro</a>";
    }
    echo '</td>';
    echo "<td class = 'exams'>";
    if ($count3 === 1) { // ose $count3 != 0
        echo "<a href = 'includes/functions/cregjistroLendetDB.php?studenti={$username}&provimi={$provimi}' class = 'btn'>Çregjistro</a>";
    }
    echo '</td>';

    echo '</tr>';
}

echo '</table>';
