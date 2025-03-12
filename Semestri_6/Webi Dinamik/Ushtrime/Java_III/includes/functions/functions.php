<?php

function search($username): string
{
    $file = fopen('db.txt', 'r');
    $passDB = '';
    while (! feof($file)) {
        $rreshti = fgets($file);
        if ($rreshti == '') {
            continue;
        }
        $vargu = explode(',', $rreshti);
        $userDB = $vargu[1];
        if ($username == $userDB) {
            $passDB = $vargu[2];
            fclose($file);
            break;
        }
    }

    return trim($passDB);
}

function login($username, $password): void
{
    if ($username == '' || $password == '') {
        echo "<p style = 'color: red;'>Te gjitha te dhenat duhet te plotesohen!</p>";
    } else {
        $passDB = search($username);
        if ($passDB != '') {
            if ($password == $passDB) {
                //OK
                //perdoruesi kycet
                header('Location: home.php');
            } else {
                echo "<p style = 'color: red;'>Fjalekalimi nuk eshte i sakte!</p>";
            }
        } else {
            echo "<p style = 'color: red;'>Ky perdorues nuk ekziston!</p>";
        }
    }
}

function register(?string $emri, ?string $username, ?string $password, $confirmPassword): void
{
    if ($emri == '' || $username == '' || $password == '' || $confirmPassword == '') {
        echo "<p style = 'color: red;'>Te gjitha te dhenat duhet te plotesohen!</p>";
    } else {
        $passDB = search($username);
        if ($passDB == '') {
            if ($password == $confirmPassword) {
                //OK
                //regjistro user-in ne fajllin db
                $rreshti = $emri . ',' . $username . ',' . $password . PHP_EOL;
                $file = fopen('db.txt', 'a');
                fwrite($file, $rreshti);
                fclose($file);
                header('Location: login.php');
            } else {
                echo "<p style = 'color: red;'>Fjalekalimet nuk perputhen!</p>";
            }
        } else {
            echo "<p style = 'color: red;'>Ky perdorues ekziston!</p>";
        }
    }
}
