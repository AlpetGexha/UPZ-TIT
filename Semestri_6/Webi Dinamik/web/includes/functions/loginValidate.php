<?php

require 'includes/functions/connect.php';

if (empty($_POST['usernameLogin']) && empty($_POST['passLogin'])) {
    $error = 'Te gjitha te dhenat duhet te plotesohen!';

    return;
}

$username = $_POST['usernameLogin'] ?? '';
$password = $_POST['passLogin'] ?? '';

if (empty($username)) {
    $errorUsername = 'Fusha e username-it duhet te plotesohet!';

    return;
}

$stmt = mysqli_prepare($connect, 'SELECT id, fjalekalimi, roli FROM perdoruesi WHERE id = ?');
mysqli_stmt_bind_param($stmt, 's', $username);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if (mysqli_num_rows($result) === 0) {
    $errorUsername = 'Ky perdorues nuk ekziston!';
    mysqli_stmt_close($stmt);

    return;
}

$row = mysqli_fetch_assoc($result);
mysqli_stmt_close($stmt);

if (empty($password)) {
    $errorPassword = 'Fusha e fjalekalimit duhet te plotesohet!';

    return;
}

if (md5($password) !== $row['fjalekalimi']) {
    $errorPassword = 'Fjalekalimi nuk eshte i sakte!';

    return;
}

$_SESSION['username'] = $username;
$_SESSION['roli'] = $row['roli'];

header('Location: home.php');
exit();
