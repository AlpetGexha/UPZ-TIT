<?php
require 'php-jwt/php-jwt/src/JWT.php';
require 'php-jwt/php-jwt/src/Key.php';

use Firebase\JWT\JWT;
use Firebase\JWT\Key;

$key = 'example_key';
$payload = [
    'email' => 'lamirshkurti@gmail.com',
    'id' => '627dead70d8ef902c751f791',
    'iat' => 1356999524,
    'nbf' => 1357000000
];


$key = base64_decode($key);
$jwt = JWT::encode($payload, $key, 'HS256');

$decoded = JWT::decode($jwt, new Key($key, 'HS256'));

echo "encoded: ".$jwt;
echo "\n decoded: ";
print_r($decoded);

// $key = base64_decode($secretKey);
// $decoded = JWT::decode($jwt, new Key($key, 'HS256'));
    // $decoded = Firebase\JWT\JWT::decode($jwt, new Key($secretKey, 'HS256'));
// echo $key;
//     print_r($decoded);

?>
