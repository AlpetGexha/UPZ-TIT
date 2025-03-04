<?php

function fun() {
	static $x = 0;
	$x = $x + 1;
	
	echo $x . "<br>";
}

fun();
fun();
fun();
?>