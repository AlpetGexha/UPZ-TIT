<?php

$db = new PDO('mysql:host=localhost;dbname=unismu', 'root', '');

if (! $db) {
    exit('Database connection failed');
}
