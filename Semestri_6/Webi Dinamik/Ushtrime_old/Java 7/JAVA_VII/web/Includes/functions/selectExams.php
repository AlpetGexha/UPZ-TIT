<?php

//konekto me db
require "Includes/functions/connect.php";

//studenti i kyqur (tani per tani le te jete vlere statike, kur e mesojme kyqjen e perdoruesit ne sistem punojme me variabla)
$usernameID = '123456789';

//selektimi i emrit dhe mbiemrit te perdoruesit te kyqyr
$queryEmriStd = mysqli_query($connect, "SELECT concat(emri, ' ', mbiemri) AS studenti FROM perdoruesi WHERE id = '$usernameID'");
$rreshtiEmriStd = mysqli_fetch_assoc($queryEmriStd);
$studenti = $rreshtiEmriStd['studenti'];

//selektojme provimet te cilat studenti qe eshte kyq mund te i regjistroje
$querySql = "SELECT l.emri AS lenda, concat(pr.emri, ' ', pr.mbiemri) AS profesori, p.departamenti AS departamenti, p.semestri AS semestri, pr.id AS profID, l.kodi AS kodiLnd
			FROM lenda l, studenti s, ligjerimet p, perdoruesi pr
			WHERE s.id = '$usernameID' AND l.kodi = p.lenda AND p.semestri = s.semestri 
				AND p.departamenti = s.departamenti AND pr.id = p.profesori";
//ekzekutojme query-in paraprak
$queryRes = mysqli_query($connect, $querySql);

//krijojme tabelen te e cila do te vendosim rezultatet e marra nga db
echo "<table class = 'exams'>
	<form action = 'Includes/functions/registerExamsDB.php' method = 'GET'>
			<tr class = 'exams'>
				<th class = 'exams'>Studenti</th>
				<th class = 'exams'>Lenda</th>
				<th class = 'exams'>Profesori</th>
				<th class = 'exams'></th>
			</tr>";
			
while($row = mysqli_fetch_assoc($queryRes)) {
	
	//i vendosim rezultatet ne tabele ne HTML
	
	$lenda = $row['lenda'];
	$profesori = $row['profesori'];
	$departamenti = $row['departamenti'];
	$semestri = $row['semestri'];
	$kodiLnd = $row['kodiLnd'];
	$profID = $row['profID'];

	echo "<tr class = 'exams'>
			<td class = 'exams'>$studenti</td>
			<td class = 'exams'>$lenda</td>
			<td class = 'exams'>$profesori</td>";
				
	//kontrollo, nese e ka regjistruar perdoruesi ndonjeren nga lendet perkatese dhe mos e paraqit butonin Register
	$sqlQueryReg = "SELECT * FROM rezultatet 
					WHERE studenti = '$usernameID' AND profesori = '$profID' 
						AND lenda = '$kodiLnd' AND semestri = '$semestri' 
						AND departamenti = '$departamenti'";
	$queryReg = mysqli_query($connect, $sqlQueryReg);
	$countReg = mysqli_num_rows($queryReg);
	
	if($countReg == 0) {
		echo "<td class = 'exams'><a href = 'Includes/functions/registerExamsDB.php?idStd=$usernameID&idProf=$profID&kodiLnd=$kodiLnd&sem=$semestri&dept=$departamenti' class = 'btn'>Register</a></td>";
	}
	
	echo "</tr>";
}

echo "</form>
	</table>";

?>