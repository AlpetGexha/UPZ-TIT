<?php

$semestri = $_POST['semestri'];

require 'includes/functions/connect.php';

$username = $_SESSION['username'];

$query = mysqli_query($connect, "SELECT l.lenda AS kodiL, e.emri AS lenda, p.emri AS profesori, r.nota, r.provimi, r.transkripte
								 FROM rezultatet r, ligjerimet l, lenda e, perdoruesi p
								 WHERE r.provimi = l.id AND l.lenda = e.kodi AND l.profesori = p.id
									AND l.semestri = '{$semestri}'
									AND r.studenti = '{$username}';");

echo "<table class = 'exams'>
		<tr class = 'exams'>
			<th class = 'exams'>Nr.</th>
			<th class = 'exams'>Kodi i lendes</th>
			<th class = 'exams'>Lenda</th>
			<th class = 'exams'>Profesori</th>
			<th class = 'exams'>Nota</th>
			<th class = 'exams'></th>
			<th class = 'exams'></th>
		</tr>";

$i = 1;
while ($row = mysqli_fetch_assoc($query)) {
    $kodiL = $row['kodiL'];
    $lenda = $row['lenda'];
    $profesori = $row['profesori'];
    $nota = $row['nota'];
    $provimi = $row['provimi'];
    $transkripte = $row['transkripte'];

    echo "<tr class = 'exams'>
			<td class = 'exams'>{$i}</td>
			<td class = 'exams'>{$kodiL}</td>
			<td class = 'exams'>{$lenda}</td>
			<td class = 'exams'>{$profesori}</td>";

    echo "<td class = 'exams'>";
    if ($nota !== 0) {
        echo "{$nota}";
    } else {
        echo 'Ende pa notuar';
    }
    echo '</td>';

    echo "<td class = 'exams'>";
    if (($nota >= 6 && $nota <= 9) && $transkripte === 0) {
        echo "<a href = 'includes/functions/pranoNotenDB.php?studenti={$username}&provimi={$provimi}' class = 'btn'>Prano</a>";
    }
    echo '</td>';

    echo "<td class = 'exams'>";
    if (($nota >= 6 && $nota <= 9) && $transkripte === 0) {
        echo "<a href = 'includes/functions/refuzoNotenDB.php?studenti={$username}&provimi={$provimi}' class = 'btn'>Refuzo</a>";
    }
    echo '</td>';

    echo '</tr>';
    $i++;
}

echo '</table>';
