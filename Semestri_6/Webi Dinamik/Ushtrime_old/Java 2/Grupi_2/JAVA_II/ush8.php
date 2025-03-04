<?php
$x = 2; //fusheveprim global

echo $x . "<br>";


function myTest() {
	global $x;
	echo "x = " . $x; //gabim: x nuk eshte e definuar
}

myTest();
?>