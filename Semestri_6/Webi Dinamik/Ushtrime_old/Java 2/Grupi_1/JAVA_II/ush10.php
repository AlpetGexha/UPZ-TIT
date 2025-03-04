<?php

function fun1()
{
	static $x = 0;
	$x = $x + 1;
	// ne line with phpe
	echo $x . PHP_EOL;
}

fun1();
fun1();
fun1();
