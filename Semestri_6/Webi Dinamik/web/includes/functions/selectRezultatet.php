<?php

if (! isset($_POST['semestri']) || ! isset($_SESSION['username'])) {
    echo '<p>Missing required parameters</p>';

    return;
}

$semestri = $_POST['semestri'];
$username = $_SESSION['username'];

require 'includes/functions/connect.php';

$query = 'SELECT l.lenda AS kodiL, e.emri AS lenda, p.emri AS profesori,
                 r.nota, r.provimi, r.transkripte
          FROM rezultatet r
          JOIN ligjerimet l ON r.provimi = l.id
          JOIN lenda e ON l.lenda = e.kodi
          JOIN perdoruesi p ON l.profesori = p.id
          WHERE l.semestri = ?
            AND r.studenti = ?
          ORDER BY e.emri';

$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, 'ss', $semestri, $username);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if (! $result) {
    echo '<p>Error fetching results: ' . mysqli_error($connect) . '</p>';
    mysqli_stmt_close($stmt);

    return;
}

echo "<table class='exams'>
        <tr class='exams'>
            <th class='exams'>Nr.</th>
            <th class='exams'>Kodi i lendes</th>
            <th class='exams'>Lenda</th>
            <th class='exams'>Profesori</th>
            <th class='exams'>Nota</th>
            <th class='exams'></th>
            <th class='exams'></th>
        </tr>";

$i = 1;
while ($row = mysqli_fetch_assoc($result)) {
    $kodiL = htmlspecialchars($row['kodiL'], ENT_QUOTES, 'UTF-8');
    $lenda = htmlspecialchars($row['lenda'], ENT_QUOTES, 'UTF-8');
    $profesori = htmlspecialchars($row['profesori'], ENT_QUOTES, 'UTF-8');
    $nota = (int) $row['nota'];
    $provimi = htmlspecialchars($row['provimi'], ENT_QUOTES, 'UTF-8');
    $transkripte = (int) $row['transkripte'];

    echo "<tr class='exams'>
            <td class='exams'>{$i}</td>
            <td class='exams'>{$kodiL}</td>
            <td class='exams'>{$lenda}</td>
            <td class='exams'>{$profesori}</td>";

    echo "<td class='exams'>";
    if ($nota !== 0) {
        echo "{$nota}";
    } else {
        echo 'Ende pa notuar';
    }
    echo '</td>';

    echo "<td class='exams'>";
    if (($nota >= 6 && $nota <= 9) && $transkripte === 0) {
        echo "<a href='includes/functions/pranoNotenDB.php?studenti={$username}&provimi={$provimi}' class='btn'>Prano</a>";
    }
    echo '</td>';

    echo "<td class='exams'>";
    if (($nota >= 6 && $nota <= 9) && $transkripte === 0) {
        echo "<a href='includes/functions/refuzoNotenDB.php?studenti={$username}&provimi={$provimi}' class='btn'>Refuzo</a>";
    }
    echo '</td>';

    echo '</tr>';
    $i++;
}

mysqli_stmt_close($stmt);
echo '</table>';
