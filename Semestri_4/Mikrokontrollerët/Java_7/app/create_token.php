<?php
require 'php-jwt/src/JWT.php';
require 'php-jwt/src/Key.php';

use Firebase\JWT\JWT;
use Firebase\JWT\Key;

$secretKey = 'sekreti-lamir';

$tokenData = [
    'id' => '123321'
];

// $tokenData = [
//     'data' => [
//         'id' => '123321'
//         // 'id' => '1',
//         // 'temperature' => 25.5,
//         // 'humidity' => 25.5,
//         // 'deviceid' => 1,
//         // 'data' => time(),
//             // 'iat': 1703288812,
//             // 'exp': 1703383200
//     ],
// ];
// $key = base64_decode($secretKey);

$jwt = JWT::encode($tokenData, $secretKey, 'HS256');

$decoded = JWT::decode($jwt, new Key($secretKey, 'HS256'));
print_r($decoded);

echo json_encode(['token' => $jwt]);
?>
