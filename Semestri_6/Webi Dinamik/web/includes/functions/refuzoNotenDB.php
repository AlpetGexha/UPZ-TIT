<?php

require 'connect.php';

if (isset($_GET['studenti']) && isset($_GET['provimi'])) {
    $studenti = $_GET['studenti'];
    $provimi = $_GET['provimi'];

    mysqli_query($connect, "UPDATE rezultatet SET nota = 0
							WHERE studenti = '{$studenti}' AND provimi = '{$provimi}';");

    header('Location: ../../rezultatet.php');
}
