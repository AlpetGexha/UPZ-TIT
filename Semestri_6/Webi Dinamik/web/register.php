<?php
session_start();


if (isset($_SESSION['username']) || isset($_SESSION['roli'])) {
    header('Location: home.php');
    exit();
}


$error = $errorEmri = $errorEmail = $errorDepartamenti = $errorUserID = $errorPasswordTooltip = $errorPassword = '';
$emri = '';


if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include 'includes/functions/registerValidate.php';
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="Style/style.css">
</head>

<body>
    <div id="container">
        <?php include 'includes/template/nav.php'; ?>
        <?php include 'includes/template/header.php'; ?>
        <div class="content main">
            <div class="sec">
                <h1>Register Form</h1>                <table class="form-group">
                    <form action="" method="POST">
                        <tr>
                            <td><input type="text" name="fname" placeholder="Emri" value="<?= ! empty($emri) && empty($errorEmri) ? htmlspecialchars($emri) : '' ?>"></td>
                            <td><input type="text" name="email" placeholder="Email adresa"></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="error"><?= htmlspecialchars($errorEmri) ?></span>
                            </td>
                            <td>
                                <span class="error"><?= htmlspecialchars($errorEmail) ?></span>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <select name="departament">
                                    <option value="Perzgjedh departamentin">Perzgjedh departamentin</option>
                                    <?php include 'includes/functions/selectDepartament.php'; ?>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <span class="error"><?= htmlspecialchars($errorDepartamenti) ?></span>
                            </td>
                        </tr>
                        <tr>
                            <td><input type="text" name="idReg" placeholder="ID"></td>
                            <td><input type="password" name="passwordReg" placeholder="Fjalekalimi"></td>
                        </tr>
                        <tr>
                            <td>
                                <span class="error"><?= htmlspecialchars($errorUserID) ?></span>
                            </td>
                            <td>
                                <span class="error" title="<?= htmlspecialchars($errorPasswordTooltip) ?>"><?= htmlspecialchars($errorPassword) ?></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span class="error"><?= htmlspecialchars($error) ?></span>
                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td><input type="submit" name="register" value="Submit"></td>
                        </tr>
                    </form>
                </table>
            </div>
        </div>
        <?php include 'includes/template/aside.php'?>
        <?php include 'includes/template/footer.php'; ?>
    </div>
</body>
</html>