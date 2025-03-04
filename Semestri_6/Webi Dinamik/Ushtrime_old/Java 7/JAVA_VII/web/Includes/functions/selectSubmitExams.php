<?php

//selektimi i provimeve te cilat studenti qe eshte kyq ne sistem mund ti regjistroje

//studenti i kyqur
$usernameID = '123456789';

//konektimi me db
require "Includes/functions/connect.php";

//selektimi i emrit dhe mbiemrit te studentit te kyqur
$query1Res = mysqli_query($connect, "SELECT concat(emri, ' ', mbiemri) AS studenti FROM perdoruesi WHERE id = '$usernameID';");
$query1Rreshti = mysqli_fetch_assoc($query1Res);
$studenti = $query1Rreshti['studenti'];

//selektimi i provimeve qe mund ti regjistroje studenti i kyqur
//query
$selectQuery = "SELECT l.emri AS lenda, concat(p.emri, ' ', p.mbiemri) AS profesori, 
					heraParaqitjes, r.profesori AS idProf, r.lenda AS kodiLnd,
					r.semestri AS idSem, r.departamenti AS idDept, paraqitur
				FROM rezultatet r, lenda l, perdoruesi p
				WHERE studenti = '$usernameID' AND l.kodi = r.lenda AND p.id = r.profesori;";
//ekzekutimi i query-it
$selectQueryRes = mysqli_query($connect, $selectQuery);

//marrja e te dhenave nga rezultati i kthyer nga ekzekutimi i query-it

//krijimi i tabeles per vendosjen e rreshtave rezultat
echo "<table class = 'exams'>
		<tr class = 'exmas'>
			<th class = 'exams'>Studenti</th>
			<th class = 'exams'>Lenda</th>
			<th class = 'exams'>Profesori</th>
			<th class = 'exams'>Hera e paraqitjes</th>
			<th class = 'exams'></th>
		</tr>";

while($rreshti = mysqli_fetch_assoc($selectQueryRes)) {
	
	$lenda = $rreshti['lenda'];
	$profesori = $rreshti['profesori'];
	$heraP = $rreshti['heraParaqitjes'];
	$idProf = $rreshti['idProf'];
	$kodiLnd = $rreshti['kodiLnd'];
	$idSem = $rreshti['idSem'];
	$idDept = $rreshti['idDept'];
	
	echo "<tr class = 'exmas'>
			<td class = 'exams'>$studenti</td>
			<td class = 'exams'>$lenda</td>
			<td class = 'exams'>$profesori</td>
			<td class = 'exams'>$heraP</td>";
		//nese studenti ende nuk e ka paraqit provimin perkates atehere shfaqja butoni Submit
		if($rreshti['paraqitur'] == 0) {
			echo "<td class = 'exams'><a href = 'Includes/functions/submitExamsDB.php?idStd=$usernameID&idProf=$idProf&kodiLnd=$kodiLnd&idSem=$idSem&idDept=$idDept&heraP=$heraP' class = 'btn'>Submit</a></td>";
		}
	echo "</tr>";
}

echo "</table>";
?>