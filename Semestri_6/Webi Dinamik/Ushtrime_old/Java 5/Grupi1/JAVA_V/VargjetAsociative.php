<?php
$moshat = array("Agim" => 34, "Jehona" => 23, "Jeton" => 45);
foreach($moshat as $celesi => $vlera) {
	echo $celesi . " => " . $vlera . "<br>";
}
$celesat = array_keys($moshat);
for($i = 0; $i < count($celesat); $i++) {
	echo $celesat[$i] . " ";
}
echo "<br>";
?>