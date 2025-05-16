<?php
session_start();

// Clear any previous reset tokens
if (isset($_SESSION['reset_token'])) {
    unset($_SESSION['reset_token']);
}
if (isset($_SESSION['reset_username'])) {
    unset($_SESSION['reset_username']);
}

// Initialize variables
$errorMessage = '';
$successMessage = '';

// Check if there's an error message from a redirect
if (isset($_SESSION['reset_error'])) {
    $errorMessage = $_SESSION['reset_error'];
    unset($_SESSION['reset_error']);
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    require 'includes/functions/connect.php';
    
    $username = trim($_POST['username'] ?? '');
    
    if (empty($username)) {
        $errorMessage = 'Ju lutem shkruani ID-në tuaj!';
    } else {
        // Check if username exists
        $stmt = mysqli_prepare($connect, 'SELECT id FROM perdoruesi WHERE id = ?');
        mysqli_stmt_bind_param($stmt, 's', $username);
        mysqli_stmt_execute($stmt);
        mysqli_stmt_store_result($stmt);
        
        if (mysqli_stmt_num_rows($stmt) === 0) {
            $errorMessage = 'Përdoruesi me këtë ID nuk ekziston!';
        } else {
            // Create a reset token and store in session
            $reset_token = bin2hex(random_bytes(32));
            $expiry = time() + 3600; // Token valid for 1 hour
            
            $_SESSION['reset_token'] = $reset_token;
            $_SESSION['reset_username'] = $username;
            $_SESSION['reset_expiry'] = $expiry;
            
            // Redirect to reset password page
            header('Location: reset-password.php');
            exit();
        }
        
        mysqli_stmt_close($stmt);
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
                
                <p>Ju lutem shkruani ID-në tuaj për të rivendosur fjalëkalimin.</p>
                
                <form method="POST" action="">
                    <div class="form-group">
                        <label for="username">ID e përdoruesit:</label>
                        <input type="text" id="username" name="username" required>
                    </div>
                    
                    <input type="submit" value="Vazhdo" class="btn-submit">
                </form>
                
                <p><a href="login.php">Kthehu te faqja e hyrjes</a></p>
            </div>
        </div>
        
        <?php include 'includes/template/aside.php' ?>
        <?php include 'includes/template/footer.php'; ?>
    </div>
</body>
</html>
