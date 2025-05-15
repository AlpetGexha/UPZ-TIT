<?php

require 'includes/functions/connect.php';

$query = 'SELECT emri FROM departamenti ORDER BY emri';
$result = mysqli_query($connect, $query);

if (! $result) {
    echo '<option>Error fetching departments</option>';

    return;
}

while ($row = mysqli_fetch_assoc($result)) {
    $emri = htmlspecialchars($row['emri'], ENT_QUOTES, 'UTF-8');
    echo "<option value=\"{$emri}\">{$emri}</option>";
}

mysqli_free_result($result);
