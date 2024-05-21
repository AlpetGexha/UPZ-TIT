<?php

require "php-jwt/src/JWT.php";
require "php-jwt/src/Key.php";

use Firebase\JWT\JWT;
use Firebase\JWT\Key;

// Lidhja me bazën e të dhënave
$host = "localhost";
$username = "";
$password = "";
$database = "upzfshk_sensors";

$connection = new mysqli($host, $username, $password, $database);

// Kontrolloni lidhjen
if ($connection->connect_error) {
    die("Lidhja dështoi: " . $connection->connect_error);
}

$secretKey = "sekreti-lamir";
$token = $_REQUEST["token"];
$sekreti_id = "123321";

$temperature = isset($_REQUEST["temperature"]) ? $_REQUEST["temperature"] : null;
$humidity = isset($_REQUEST["humidity"]) ? $_REQUEST["humidity"] : null;
$deviceid = isset($_REQUEST["deviceid"]) ? $_REQUEST["deviceid"] : null;

$ledValue = isset($_REQUEST["led"]) ? $_REQUEST["led"] : null;
$ledInsertValue = isset($_REQUEST["ledValue"]) ? $_REQUEST["ledValue"] : null;

// Merrni të dhënat nga POST request
//$data = json_decode(file_get_contents("php://input"), true);

// Kryerja e validimeve
if (isset($temperature) && isset($humidity) && isset($deviceid)) {
    //if (isset($data['temperature']) && isset($data['humidity']) && isset($data['deviceid'])) {
    try {
        echo $token . " " . $secretKey;
        // Verifikoni tokenin duke përdorur çelësin e fshehur
        $decoded = JWT::decode($token, new Key($secretKey, "HS256"));

        $dataToInsert = $decoded->id;
        echo "lsh-" . $dataToInsert;

        if ($dataToInsert == $sekreti_id) {
            $query =
                "INSERT INTO dataset (temperature, humidity, deviceid) VALUES (?, ?, ?)";
            $statement = $connection->prepare($query);
            $statement->bind_param("ddi", $temperature, $humidity, $deviceid);

            // Kryeni query
            if ($statement->execute()) {
                echo "Të dhënat janë vedosur me sukses!";
            } else {
                echo "Gabim gjatë futjes së të dhënave: " . $statement->error;
            }
            
            $statement->close();
            $connection->close();
        }
    } catch (Exception $e) {
        // Nëse ndodh një gabim gjatë verifikimit, tokeni është i pavlefshëm
        echo json_encode([
            "message" =>
                "Tokeni i pavlefshëm ose ka ndodhur një gabim gjatë verifikimit.",
        ]);
    }
} elseif (isset($ledValue)) {
    $q = mysqli_query($connection, "select * from led ORDER BY `id` ASC");

    $data["rows"] = [];
    while ($r = mysqli_fetch_array($q)) {
        $arr = [];
        $arr["id"] = $r["id"];
        $arr["data"] = $r["data"];

        array_push($data["rows"], $arr);
    }
    $veri = json_encode($data["rows"]);
    echo $veri;
    //echo $data["rows"][0]["data"];//$veri;
}
// Kryerja e validimeve
if (isset($ledInsertValue)) {
    $query = "UPDATE led SET data = ?";
    $statement = $connection->prepare($query);

    $statement->bind_param("i", $ledInsertValue);

    // Kryeni query
    if ($statement->execute()) {
        echo "Të dhënat janë vedosur me sukses!";
    } else {
        echo "Gabim gjatë futjes së të dhënave: " . $statement->error;
    }

    // Mbyllni deklaratën dhe lidhjen me bazën e të dhënave
    $statement->close();
    $connection->close();
} else {
    echo "Të dhënat nuk janë në formatin e duhur.";
}
?>
