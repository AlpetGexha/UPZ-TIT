<?php
session_start();


if (! isset($_SESSION['username']) || ! isset($_SESSION['roli'])) {
    header('Location: login.php');
    exit();
}


if ($_SESSION['roli'] !== 1) {
    header('Location: home.php');
    exit();
}

$queryInput = isset($_GET['query']) ? $_GET['query'] : '';
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fshirja e lendeve</title>
    <link rel="stylesheet" type="text/css" href="Style/style.css">
</head>

<body>
    <div id="container">
        <?php include 'includes/template/nav.php'; ?>
        <?php include 'includes/template/header.php'; ?>
        <div class="content main">
            <div class="sec">
                <h2>Fshirja e lendeve</h2>
                <form method="GET" action="">
                    <input type="text" name="query" value="<?= $queryInput ?>" placeholder="Kërko për lëndë...">
                    <input type="submit" value="Kërko">
                </form>
                <?php include 'includes/functions/selectFshijLendet.php'; ?>
            </div>
        </div>
        <?php include 'includes/template/aside.php' ?>
        <?php include 'includes/template/footer.php'; ?>
    </div>
</body>

</html>