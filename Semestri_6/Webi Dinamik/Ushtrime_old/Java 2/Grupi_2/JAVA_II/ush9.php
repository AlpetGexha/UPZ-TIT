<?php
$a = 2;
$b = 2.7;

function myFunction() {

	//global $a, $b; ose
	$c = $GLOBALS['a'] + $GLOBALS['b']; //c = 4.7
	echo $c;
	echo var_dump($c); //float 4.7
}

myFunction();

?>