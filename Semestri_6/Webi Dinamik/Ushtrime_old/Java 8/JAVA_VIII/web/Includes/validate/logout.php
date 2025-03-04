<?php

//startimi i sesionit
session_start();

//shkaterrimi i sesionit
session_destroy();

//ridrejtoje ne faqen baze para kyqjes
header("Location: ../../login.php");

?>