<?php

// Lidhja me bazën e të dhënave
$host = "localhost";
$username = "root";
$password = "";
$database = "upzfshk_sensors";

$connection = new mysqli($host, $username, $password, $database);

// Kontrolloni lidhjen
if ($connection->connect_error) {
    die("Lidhja dështoi: " . $connection->connect_error);
}


$temperature = isset($_REQUEST['temperature']) ? $_REQUEST['temperature'] : null;
$humidity = isset($_REQUEST['humidity']) ? $_REQUEST['humidity'] : null;
$deviceid = isset($_REQUEST['deviceid']) ? $_REQUEST['deviceid'] : null;

// Merrni të dhënat nga POST request
$data = json_decode(file_get_contents("php://input"), true);

// Kryerja e validimeve
if (isset($temperature) && isset($humidity) && isset($deviceid)) {
    //if (isset($data['temperature']) && isset($data['humidity']) && isset($data['deviceid'])) {

    $query = "INSERT INTO dataset (temperature, humidity, deviceid) VALUES (?, ?, ?)";
    $statement = $connection->prepare($query);
    //    $statement->bind_param("ddi", $data['temperature'], $data['humidity'], $data['deviceid']);
    $statement->bind_param("ddi", $temperature, $humidity, $deviceid);

    // Kryeni query
    if ($statement->execute()) {
        echo "Të dhënat janë vedosur me sukses!";
        // echo the given data
        echo "<br /><br /> Temperature: " . $temperature . " <br />Humidity: " . $humidity . " <br />DeviceID: " . $deviceid;

        echo "<br /><br /><a href='index.php'>Show all data</a>";
    } else {
        echo "Gabim gjatë futjes së të dhënave: " . $statement->error;
    }

    // Mbyllni deklaratën dhe lidhjen me bazën e të dhënave
    $statement->close();
    $connection->close();
} else {
    echo "Të dhënat nuk janë në formatin e duhur.";
    // fetch all data
    $query = "Select * from dataset ORDER BY id DESC";
    $statement = $connection->prepare($query);

    $statement->execute();
    $result = $statement->get_result();
    $data = $result->fetch_all(MYSQLI_ASSOC);
    echo "<br /><br /> <pre>" . json_encode($data);
    $statement->close();
}
