<?php

require 'includes/functions/connect.php';

// Kontrolloni nëse një pyetje kërkimi është e pranishme në parametrat GET
$search = isset($_GET['query']) ? trim($_GET['query']) : '';

// modifikoni Querin SQL për të përfshirë filtrimin nëse ekziston një term kërkimi
if ($search !== '') {
	$searchEscaped = mysqli_real_escape_string($connect, $search);
	$query = "SELECT kodi, emri, kredite, statusi FROM lenda 
              WHERE emri LIKE '%$searchEscaped%' 
              ORDER BY emri";
} else {
	$query = 'SELECT kodi, emri, kredite, statusi FROM lenda ORDER BY emri';
}

$result = mysqli_query($connect, $query);

if (! $result) {
	echo '<p>Error fetching courses: ' . mysqli_error($connect) . '</p>';
	return;
}

echo "<table class='exams'>
        <tr class='exams'>
            <th class='exams'>Kodi</th>
            <th class='exams'>Emri</th>
            <th class='exams'>Kredite</th>
            <th class='exams'>Statusi</th>
            <th class='exams'></th>
        </tr>";

if (mysqli_num_rows($result) === 0) {
	echo "<tr class='exams'><td class='exams' colspan='5'>Nuk ka lend</td></tr>";
} else {
	while ($row = mysqli_fetch_assoc($result)) {
		$kodi = htmlspecialchars($row['kodi'], ENT_QUOTES, 'UTF-8');
		$emri = htmlspecialchars($row['emri'], ENT_QUOTES, 'UTF-8');
		$kredite = htmlspecialchars($row['kredite'], ENT_QUOTES, 'UTF-8');
		$statusi = htmlspecialchars($row['statusi'], ENT_QUOTES, 'UTF-8');

		echo "<tr class='exams'>
						<td class='exams'>{$kodi}</td>
						<td class='exams'>{$emri}</td>
						<td class='exams'>{$kredite}</td>
						<td class='exams'>{$statusi}</td>
						<td class='exams'><a href='includes/functions/fshijLendetDB.php?kodi={$kodi}' class='btn' onclick='return konfirmoFshirjen()'>Fshij</a></td>
					  </tr>";
	}
}
mysqli_free_result($result);
echo '</table>';
