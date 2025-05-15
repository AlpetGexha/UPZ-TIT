<?php

if (! isset($_SESSION['username']) || ! isset($_POST['departamenti']) || ! isset($_POST['lenda'])) {
    echo '<p>Missing required parameters</p>';

    return;
}

require 'includes/functions/connect.php';

$userID = $_SESSION['username'];
$departamenti = mysqli_real_escape_string($connect, $_POST['departamenti']);
$lenda = mysqli_real_escape_string($connect, $_POST['lenda']);

$query = 'SELECT r.provimi, r.studenti, p.emri AS studentiEmri, r.nota
          FROM rezultatet r
          JOIN ligjerimet l ON r.provimi = l.id
          JOIN perdoruesi p ON p.id = r.studenti
          WHERE l.profesori = ?
            AND l.departamenti = ?
            AND l.lenda = ?
          ORDER BY p.emri';

$stmt = mysqli_prepare($connect, $query);
mysqli_stmt_bind_param($stmt, 'sss', $userID, $departamenti, $lenda);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if (! $result) {
    echo '<p>Error fetching results: ' . mysqli_error($connect) . '</p>';
    mysqli_stmt_close($stmt);

    return;
}

echo "<table class='exams'>
        <tr class='exams'>
          <th class='exams'>ID</th>
          <th class='exams'>Studenti</th>
          <th class='exams'>Nota</th>
          <th class='exams'></th>
          <th class='exams'></th>
        </tr>";

while ($row = mysqli_fetch_assoc($result)) {
    $studentiID = htmlspecialchars($row['studenti'], ENT_QUOTES, 'UTF-8');
    $studenti = htmlspecialchars($row['studentiEmri'], ENT_QUOTES, 'UTF-8');
    $nota = (int) $row['nota'];
    $provimi = htmlspecialchars($row['provimi'], ENT_QUOTES, 'UTF-8');

    echo "<form action='includes/functions/notimiDB.php' method='POST'>";
    echo "<tr class='exams'>
            <td class='exams'><input type='text' value='{$studentiID}' name='studID' size='8' readonly/></td>
            <td class='exams'>{$studenti}</td>";
    echo "<td class='exams'>";

    if ($nota === 0) {
        echo "<select name='notimi'>
                <option value='5'>5</option>
                <option value='6'>6</option>
                <option value='7'>7</option>
                <option value='8'>8</option>
                <option value='9'>9</option>
                <option value='10'>10</option>
              </select>";
    } else {
        echo "<input type='text' value='{$nota}' readonly size='1'/>";
    }

    echo '</td>';
    echo "<td class='exams'><input type='hidden' name='provimi' value='{$provimi}'/></td>";
    echo "<td class='exams'>";

    if ($nota === 0) {
        echo "<input type='submit' value='Vendos notën'/>";
    }

    echo '</td>';
    echo '</tr>
         </form>';
}

mysqli_stmt_close($stmt);
echo '</table>';
