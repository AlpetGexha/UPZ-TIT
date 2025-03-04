<?php

$str = "PHP"; //global

function fun() {
	$str1 = $GLOBALS['str'] . ", MySQL"; //lokal
	echo $str1;
}

fun();
?>