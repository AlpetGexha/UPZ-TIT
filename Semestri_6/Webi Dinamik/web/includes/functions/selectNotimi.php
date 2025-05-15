<?php

require 'includes/functions/connect.php';

$userID = $_SESSION['username'];

$departamenti = $_POST['departamenti'];
$lenda = $_POST['lenda'];

$query = mysqli_query($connect, "SELECT r.provimi, r.studenti, p.emri AS studentiEmri, r.nota FROM rezultatet r, ligjerimet l, perdoruesi p
								WHERE p.id = r.studenti AND r.provimi = l.id AND l.profesori = '{$userID}'
								AND l.departamenti = '{$departamenti}'
								AND l.lenda = '{$lenda}';");

echo "<table class = 'exams'>
		<tr class = 'exams'>
			<th class = 'exams'>ID</th>
			<th class = 'exams'>Studenti</th>
			<th class = 'exams'>Nota</th>
			<th class = 'exams'></th>
			<th class = 'exams'></th>
		</tr>";

while ($row = mysqli_fetch_assoc($query)) {
    $studentiID = $row['studenti'];
    $studenti = $row['studentiEmri'];
    $nota = $row['nota'];
    $provimi = $row['provimi'];
    echo "<form action = 'includes/functions/notimiDB.php' method = 'POST'>";
    echo "<tr class = 'exams'>
			<td class = 'exams'><input type = 'text' value = '{$studentiID}' name = 'studID' size = '8'/></td>
			<td class = 'exams'>{$studenti}</td>";
    echo "<td class = 'exams'>";
    if ($nota === 0) {
        echo "<select name = 'notimi'>
						<option value = '5'>5</option>
						<option value = '6'>6</option>
						<option value = '7'>7</option>
						<option value = '8'>8</option>
						<option value = '9'>9</option>
						<option value = '10'>10</option>
					  </select>";
    } else {
        echo "<input type = 'text' value = '{$nota}' readonly size = '1'/>";
    }
    echo '</td>';
    echo "<td class = 'exams'><input type = 'hidden' name = 'provimi' value = '{$provimi}'/></td>";
    echo "<td class = 'exams'>";
    if ($nota === 0) {
        echo "<input type = 'submit' value = 'Vendos notën'/>";
    }
    echo '</td>';
    echo '</tr>
		</form>';
}

echo '</table>';
