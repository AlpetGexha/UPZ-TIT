<?php
$x = 1; //globale
echo $x;



function ush1() {
	global $x;
	echo $x; //gabim: $x nuk eshte i definuar
}

ush1();
?>