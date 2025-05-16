<?php
session_start();

// Check if reset token exists in session
if (!isset($_SESSION['reset_token']) || !isset($_SESSION['reset_username']) || !isset($_SESSION['reset_expiry'])) {
    header('Location: forgot-password.php');
    exit();
}

// Check if token is expired
if (time() > $_SESSION['reset_expiry']) {
    // Token expired, redirect to forgot password page
    unset($_SESSION['reset_token']);
    unset($_SESSION['reset_username']);
    unset($_SESSION['reset_expiry']);

    $_SESSION['reset_error'] = 'Sesioni i rivendosjes së fjalëkalimit ka skaduar. Ju lutem provoni përsëri.';
    header('Location: forgot-password.php');
    exit();
}

// Initialize variables
$errorMessage = '';
$successMessage = '';
$username = $_SESSION['reset_username'];

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    require 'includes/functions/connect.php';

    $newPassword = $_POST['new_password'] ?? '';
    $confirmPassword = $_POST['confirm_password'] ?? '';

    // Validate passwords
    if (empty($newPassword)) {
        $errorMessage = 'Ju lutem shkruani fjalëkalimin e ri!';
    } elseif (empty($confirmPassword)) {
        $errorMessage = 'Ju lutem konfirmoni fjalëkalimin e ri!';
    } elseif ($newPassword !== $confirmPassword) {
        $errorMessage = 'Fjalëkalimet nuk përputhen!';
    } elseif (strlen($newPassword) < 8) {
        $errorMessage = 'Fjalëkalimi duhet të jetë të paktën 8 karaktere!';
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
            $stmt = mysqli_prepare($connect, 'UPDATE perdoruesi SET fjalekalimi = ? WHERE id = ?');
            mysqli_stmt_bind_param($stmt, 'ss', $hashedPassword, $username);

            if (mysqli_stmt_execute($stmt)) {
                // Clear reset token
                unset($_SESSION['reset_token']);
                unset($_SESSION['reset_username']);
                unset($_SESSION['reset_expiry']);

                // Set success message and redirect
                $_SESSION['password_reset_success'] = true;
                header('Location: login.php');
                exit();
            } else {
                $errorMessage = 'Ndodhi një gabim gjatë përditësimit të fjalëkalimit!';
            }

            mysqli_stmt_close($stmt);
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rivendosja e Fjalëkalimit</title>
    <link rel="stylesheet" type="text/css" href="Style/style.css">
    <style>
        .reset-container {
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
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

        .error-message {
            padding: 10px;
            background-color: #f2dede;
            color: #a94442;
            border-radius: 4px;
            margin-bottom: 15px;
        }

        .success-message {
            padding: 10px;
            background-color: #dff0d8;
            color: #3c763d;
            border-radius: 4px;
            margin-bottom: 15px;
        }

        .password-info {
            font-size: 0.9em;
            color: #666;
            margin-top: 5px;
        }
    </style>
</head>

<body>
    <div id="container">
        <?php include 'includes/template/nav.php'; ?>
        <?php include 'includes/template/header.php'; ?>

        <div class="content main">
            <div class="reset-container">
                <h2>Rivendosja e Fjalëkalimit</h2>

                <?php if (!empty($errorMessage)): ?>
                    <div class="error-message"><?php echo $errorMessage; ?></div>
                <?php endif; ?>

                <?php if (!empty($successMessage)): ?>
                    <div class="success-message"><?php echo $successMessage; ?></div>
                <?php endif; ?>

                <p>Ju lutem shkruani fjalëkalimin e ri për llogarinë: <strong><?php echo htmlspecialchars($username); ?></strong></p>

                <form method="POST" action="">
                    <div class="form-group">
                        <label for="new_password">Fjalëkalimi i ri:</label>
                        <input type="password" id="new_password" name="new_password" required>
                        <p class="password-info">Fjalëkalimi duhet të ketë të paktën 8 karaktere, një shkronjë të madhe, një shkronjë të vogël, një numër dhe një karakter special.</p>
                    </div>

                    <div class="form-group">
                        <label for="confirm_password">Konfirmo fjalëkalimin e ri:</label>
                        <input type="password" id="confirm_password" name="confirm_password" required>
                    </div>

                    <input type="submit" value="Rivendos fjalëkalimin" class="btn-submit">
                </form>
            </div>
        </div>

        <?php include 'includes/template/aside.php' ?>
        <?php include 'includes/template/footer.php'; ?>
    </div>
</body>

</html>