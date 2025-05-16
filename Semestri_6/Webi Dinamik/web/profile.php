<?php
session_start();

// Check if user is logged in
if (!isset($_SESSION['username']) || !isset($_SESSION['roli'])) {
    header('Location: login.php');
    exit();
}

require 'includes/functions/connect.php';

$username = $_SESSION['username'];
$roli = $_SESSION['roli'];
$successMessage = '';
$errorMessage = '';

// Define role names
$roleNames = [
    1 => 'Administrator',
    2 => 'Profesor',
    3 => 'Student'
];

// Fetch user data
$stmt = mysqli_prepare($connect, 'SELECT id, emri, email FROM perdoruesi WHERE id = ?');
mysqli_stmt_bind_param($stmt, 's', $username);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if (mysqli_num_rows($result) === 0) {
    $errorMessage = 'Përdoruesi nuk u gjet!';
} else {
    $userData = mysqli_fetch_assoc($result);
}
mysqli_stmt_close($stmt);

// Process form submission
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $updateError = '';

    // 1. Update Name and Email
    if (isset($_POST['update_info'])) {
        $newName = trim($_POST['new_name']);
        $newEmail = trim($_POST['new_email']);

        // Validate name
        if (empty($newName)) {
            $updateError = 'Fusha e emrit duhet të plotësohet!';
        } elseif (!preg_match("/^([a-zA-Z' ]+)$/", $newName)) {
            $updateError = 'Emri duhet të përmbajë vetëm shkronja!';
        }

        // Validate email
        if (empty($newEmail)) {
            $updateError = 'Fusha e email adresës duhet të plotësohet!';
        } elseif (!filter_var($newEmail, FILTER_VALIDATE_EMAIL)) {
            $updateError = 'Email adresa nuk është valide!';
        }

        // If no validation errors, update user info
        if (empty($updateError)) {
            $updateStmt = mysqli_prepare($connect, 'UPDATE perdoruesi SET emri = ?, email = ? WHERE id = ?');
            mysqli_stmt_bind_param($updateStmt, 'sss', $newName, $newEmail, $username);

            if (mysqli_stmt_execute($updateStmt)) {
                $successMessage = 'Të dhënat u përditësuan me sukses!';
                // Update displayed data
                $userData['emri'] = $newName;
                $userData['email'] = $newEmail;
            } else {
                $errorMessage = 'Ndodhi një gabim gjatë përditësimit të të dhënave!';
            }

            mysqli_stmt_close($updateStmt);
        } else {
            $errorMessage = $updateError;
        }
    }

    // 2. Update Password
    if (isset($_POST['update_password'])) {
        $currentPassword = $_POST['current_password'];
        $newPassword = $_POST['new_password'];
        $confirmPassword = $_POST['confirm_password'];

        // Check if current password is correct
        $checkStmt = mysqli_prepare($connect, 'SELECT fjalekalimi FROM perdoruesi WHERE id = ?');
        mysqli_stmt_bind_param($checkStmt, 's', $username);
        mysqli_stmt_execute($checkStmt);
        $checkResult = mysqli_stmt_get_result($checkStmt);
        $passwordData = mysqli_fetch_assoc($checkResult);
        mysqli_stmt_close($checkStmt);

        if (md5($currentPassword) !== $passwordData['fjalekalimi']) {
            $errorMessage = 'Fjalëkalimi aktual nuk është i saktë!';
        } elseif ($newPassword !== $confirmPassword) {
            $errorMessage = 'Fjalëkalimet e reja nuk përputhen!';
        } elseif (strlen($newPassword) < 8) {
            $errorMessage = 'Fjalëkalimi i ri duhet të jetë të paktën 8 karaktere!';
        } else {
            // Validate password strength
            $uppercase = preg_match('@[A-Z]@', $newPassword);
            $lowercase = preg_match('@[a-z]@', $newPassword);
            $number = preg_match('@[0-9]@', $newPassword);
            $specialChars = preg_match('@[^\w]@', $newPassword);

            if (!$uppercase || !$lowercase || !$number || !$specialChars) {
                $errorMessage = 'Fjalëkalimi duhet të përmbajë të paktën një shkronjë të madhe, një shkronjë të vogël, një numër dhe një karakter special!';
            } else {
                // Update password
                $hashedPassword = md5($newPassword);
                $updateStmt = mysqli_prepare($connect, 'UPDATE perdoruesi SET fjalekalimi = ? WHERE id = ?');
                mysqli_stmt_bind_param($updateStmt, 'ss', $hashedPassword, $username);

                if (mysqli_stmt_execute($updateStmt)) {
                    $successMessage = 'Fjalëkalimi u ndryshua me sukses!';
                } else {
                    $errorMessage = 'Ndodhi një gabim gjatë ndryshimit të fjalëkalimit!';
                }

                mysqli_stmt_close($updateStmt);
            }
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profili i Përdoruesit</title>
    <link rel="stylesheet" type="text/css" href="Style/style.css">
    <style>
        .profile-container {
            padding: 20px;
        }

        .profile-info {
            margin-bottom: 20px;
            padding: 15px;
            background-color: #f9f9f9;
            border-radius: 5px;
            border: 1px solid #ddd;
        }

        .profile-section {
            margin-bottom: 30px;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            border: 1px solid #ddd;
        }

        .profile-section h3 {
            margin-top: 0;
            border-bottom: 1px solid #eee;
            padding-bottom: 10px;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        .form-group input {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }

        .success-message {
            padding: 10px;
            background-color: #dff0d8;
            color: #3c763d;
            border-radius: 4px;
            margin-bottom: 15px;
        }

        .error-message {
            padding: 10px;
            background-color: #f2dede;
            color: #a94442;
            border-radius: 4px;
            margin-bottom: 15px;
        }

        .btn-submit {
            padding: 8px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .btn-submit:hover {
            background-color: #45a049;
        }
    </style>
</head>

<body>
    <div id="container">
        <?php include 'includes/template/nav.php'; ?>
        <?php include 'includes/template/header.php'; ?>

        <div class="content main">
            <div class="profile-container">
                <h2>Profili i Përdoruesit</h2>

                <?php if (!empty($successMessage)): ?>
                    <div class="success-message"><?php echo $successMessage; ?></div>
                <?php endif; ?>

                <?php if (!empty($errorMessage)): ?>
                    <div class="error-message"><?php echo $errorMessage; ?></div>
                <?php endif; ?>

                <div class="profile-info">
                    <h3>Të dhënat aktuale</h3>
                    <p><strong>ID e përdoruesit:</strong> <?php echo htmlspecialchars($userData['id']); ?></p>
                    <p><strong>Roli:</strong> <?php echo htmlspecialchars($roleNames[$roli]); ?></p>
                </div>

                <!-- Update Name and Email -->
                <div class="profile-section">
                    <h3>Ndrysho të dhënat personale</h3>
                    <form method="POST" action="">
                        <div class="form-group">
                            <label for="new_name">Emri:</label>
                            <input type="text" id="new_name" name="new_name" value="<?php echo htmlspecialchars($userData['emri']); ?>" required>
                        </div>

                        <div class="form-group">
                            <label for="new_email">Email:</label>
                            <input type="email" id="new_email" name="new_email" value="<?php echo htmlspecialchars($userData['email']); ?>" required>
                        </div>

                        <input type="submit" name="update_info" value="Përditëso të dhënat" class="btn-submit">
                    </form>
                </div>

                <!-- Update Password -->
                <div class="profile-section">
                    <h3>Ndrysho fjalëkalimin</h3>
                    <form method="POST" action="">
                        <div class="form-group">
                            <label for="current_password">Fjalëkalimi aktual:</label>
                            <input type="password" id="current_password" name="current_password" required>
                        </div>

                        <div class="form-group">
                            <label for="new_password">Fjalëkalimi i ri:</label>
                            <input type="password" id="new_password" name="new_password" required>
                        </div>

                        <div class="form-group">
                            <label for="confirm_password">Konfirmo fjalëkalimin e ri:</label>
                            <input type="password" id="confirm_password" name="confirm_password" required>
                        </div>

                        <input type="submit" name="update_password" value="Ndrysho fjalëkalimin" class="btn-submit">
                    </form>
                </div>
            </div>
        </div>

        <?php include 'includes/template/aside.php' ?>
        <?php include 'includes/template/footer.php'; ?>
    </div>
</body>

</html>