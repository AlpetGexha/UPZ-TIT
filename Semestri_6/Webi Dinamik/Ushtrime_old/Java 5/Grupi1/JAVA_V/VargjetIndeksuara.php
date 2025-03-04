<?php
$kurset = array("Programim", "Algoritme", "Databaze");
echo count($kurset) . "<br>";
for($i = 0; $i < count($kurset); $i++) {
	echo $kurset[$i] . " ";
}
echo "<br>";
$i = 0;
while($i < sizeof($kurset)) {
	echo $kurset[$i] . " ";
	$i++;
}
echo "<br>";
foreach($kurset as $kursi) {
	echo $kursi . " ";
}
echo "<br>";
?>