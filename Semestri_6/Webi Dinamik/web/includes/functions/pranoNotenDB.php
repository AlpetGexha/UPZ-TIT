<?php

if (isset($_GET['studenti']) && isset($_GET['provimi'])) {
    $studenti = $_GET['studenti'];
    $provimi = $_GET['provimi'];

    require 'connect.php';

    mysqli_query($connect, "UPDATE rezultatet
							SET transkripte = 1
							WHERE studenti = '{$studenti}' AND provimi = '{$provimi}';");

    header('Location: ../../rezultatet.php');
}
