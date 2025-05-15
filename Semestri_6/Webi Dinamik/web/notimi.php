<?php
session_start();


if (! isset($_SESSION['username']) || ! isset($_SESSION['roli'])) {
    header('Location: login.php');
    exit();
}


if ($_SESSION['roli'] !== 2) {
    header('Location: home.php');
    exit();
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notimi</title>
    <link rel="stylesheet" type="text/css" href="Style/style.css">
</head>

<body>
    <div id="container">
        <?php include 'includes/template/nav.php'; ?>
        <?php include 'includes/template/header.php'; ?>
        <div class="content main">
            <div class="sec">
                <h2>Notimi</h2>
                <table>
                    <form action="" method="POST">
                        <tr>
                            <td>
                                <select name="departamenti">
                                    <?php include 'includes/functions/selectDepartamentProfesor.php'; ?>
                                </select>
                            </td>
                            <td>
                                <select name="lenda">
                                    <?php include 'includes/functions/selectLendaProfesor.php'; ?>
                                </select>
                            </td>
                            <td><input type="submit" value="Shfaq"></td>
                        </tr>
                    </form>
                </table>

                <?php
                if ($_SERVER['REQUEST_METHOD'] === 'POST') {
                    include 'includes/functions/selectNotimi.php';
                }
?>
            </div>
        </div>
        <?php include 'includes/template/aside.php'?>
        <?php include 'includes/template/footer.php'; ?>
    </div>
</body>
</html>