<?php

require 'includes/functions/connect.php';

$username = $_POST['usernameLogin'];
$password = $_POST['passLogin'];

$login = true;

$query = mysqli_query($connect, "SELECT * FROM perdoruesi WHERE id = '{$username}';");
$row = mysqli_fetch_assoc($query);

if (empty($username) && empty($password)) {
    $error = 'Te gjitha te dhenat duhet te plotesohen!';
    $login = false;
} else {
    // username
    if (empty($username)) {
        $errorUsername = 'Fusha e username-it duhet te plotesohet!';
        $login = false;
    } else {
        $count = mysqli_num_rows($query);
        if ($count === 0) {
            $errorUsername = 'Ky perdorues nuk ekziston!';
            $login = false;
        }
    }

    // password
    if (empty($password)) {
        $errorPassword = 'Fusha e fjalekalimit duhet te plotesohet!';
        $login = false;
    } else {
        $passDB = $row['fjalekalimi'];
        if (md5($password) !== $passDB) {
            $errorPassword = 'Fjalekalimi nuk eshte i sakte!';
            $login = false;
        }
    }

    // login ok
    if ($login) { // if($login == true)
        $roli = $row['roli'];
        $_SESSION['username'] = $username;
        $_SESSION['roli'] = $roli;

        header('Location: home.php');
    }
}
