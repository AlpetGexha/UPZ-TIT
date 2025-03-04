<?php
$evidenca = array(
	array("Agnesa Berisha", 8, 1),
	array("Almir Gashi", 6, 0),
	array("Leutrim Hoti", 8, 1),
	array("Festa Bytyqi", 7, 1));
for($i = 0; $i < count($evidenca); $i++) {
	for($j = 0; $j < count($evidenca[0]); $j++) {
		echo $evidenca[$i][$j] . " "; //$ perfaqeson rreshtin, $j perfaqeson kolonen
	}
	echo "<br>";
}
echo "<br>";
foreach($evidenca as $rreshti) {
	foreach($rreshti as $qeliza) {
		echo $qeliza . " ";
	}
	echo "<br>";
}
?>