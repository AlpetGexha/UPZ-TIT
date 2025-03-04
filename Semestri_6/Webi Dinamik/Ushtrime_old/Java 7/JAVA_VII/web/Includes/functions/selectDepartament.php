<?php

//konektimi me db (i nevojshem)
require "connect.php";

//marrja e te dhenave (emrin e departamentit) nga tabela departamenti
//ekzekutohet query per selektim te emrit te departamentit nga db dhe rezultati ruhet ne variablen $query
$query = mysqli_query($connect, "SELECT emri FROM departamenti");

//tani na nevojitet te i marrim keto rreshta rezultat nga query i ekzekutuar
//meqe rezultati permban disa rreshta si rezultat qe kthehen nga query i ekzekutuar me larte, atehere duhet te iterojme ne secilin rresht me nje cikel
while($row = @mysqli_fetch_assoc($query)) { //ne secilin iterim variabla $row do te permbaje nje rresht rezultat nga vargu i rezultateve te kthyera
	//meqe funksioni i perdorur mysqli_fetch_assoc na kthen rreshtat rezultat si varg asociativ, atehere na duhet te marrim vetem vleren e atributut emri te tabeles departamenti
	$emri = $row['emri'];
	
	//vendosja e te dhenave te marra ne etiketat <option> ne HTML
	echo "<option value = '$emri'>$emri </option>";
}
?>