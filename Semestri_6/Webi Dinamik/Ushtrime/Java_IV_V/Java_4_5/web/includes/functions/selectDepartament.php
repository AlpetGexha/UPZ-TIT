<?php

require "includes/functions/connect.php";

$sql = "SELECT emri FROM departamenti";

$stmt = $db->prepare($sql);
$stmt->execute();

while ($row = $stmt->fetchColumn()) {
    echo "<option value = '$row'>$row</option>";
}

?>