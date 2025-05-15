<?php
session_start();


if (! isset($_SESSION['username']) || ! isset($_SESSION['roli'])) {
    header('Location: login.php');
    exit();
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="Style/style.css">
</head>

<body>
    <div id="container">
        <?php include 'includes/template/nav.php'; ?>
        <?php include 'includes/template/header.php'; ?>
        <div class="content main">
            <div class="sec">
                <h3>Faleminderit!</h3>
            </div>
        </div>
        <?php include 'includes/template/aside.php'?>
        <?php include 'includes/template/footer.php'; ?>
    </div>
</body>
</html>