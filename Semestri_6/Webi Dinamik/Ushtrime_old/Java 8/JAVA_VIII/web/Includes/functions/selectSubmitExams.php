<?php
//selektimi i lendeve per paraqitje nga studenti qe eshte kyq aktualisht ne sistem

//konektimi me db
require "Includes/functions/connect.php";

//studenti qe eshte kyq aktualisht ne sistem
$usernameID = $_SESSION['usernameID'];

//merr emrin dhe mbiemrin e studentit te kyqur
$queryNameStd = mysqli_query($connect, "SELECT concat(emri, ' ', mbiemri) AS studenti FROM perdoruesi WHERE id = '$usernameID'");
$rowNameStd = mysqli_fetch_assoc($queryNameStd);
$studenti = $rowNameStd['studenti'];

//merr ne cilin departament dhe ne cilin semester gjendet studenti i kyqur
$querySemDeptStd = mysqli_query($connect, "SELECT departamenti, semestri FROM studenti WHERE id = '$usernameID';");
$rowSemDeptStd = mysqli_fetch_assoc($querySemDeptStd);
$semestri = $rowSemDeptStd['semestri'];
$departamenti = $rowSemDeptStd['departamenti'];

//selektimi i lendeve qe studenti tashme i ka regjistruar
$selectQuery = "SELECT l.emri AS lenda, l.kodi AS kodiLnd, concat(p.emri, ' ', p.mbiemri) AS profesori, 
					r.heraParaqitjes AS heraParaqitjes, r.profesori AS profID
				FROM lenda l, perdoruesi p, rezultatet r 
				WHERE r.studenti = '$usernameID' AND r.semestri = '$semestri' 
					AND l.kodi = r.lenda AND p.id = r.profesori;";
//ekzekutimi i query-it
$selectQueryRes = mysqli_query($connect, $selectQuery);

echo "<table class = 'exams'>
		<tr class = 'exams'>
			<th class = 'exams'>Studenti</th>
			<th class = 'exams'>Lenda</th>
			<th class = 'exams'>Profesori</th>
			<th class = 'exams'>Hera e paraqitjes</th>
			<th class = 'exams'></th>
		</tr>";
		
if(mysqli_num_rows($selectQueryRes) == 0) {
	echo "<tr class = 'exams'>
			<td class = 'exams' colspan = '5'>Nuk ka te dhena</td>
		</tr>";
}

while($row = mysqli_fetch_assoc($selectQueryRes)) {
	//marrja e te dhenave prej rreshtave rezultat ne secilin iterim te ciklit while
	$lenda = $row['lenda'];
	$kodiLnd = $row['kodiLnd'];
	$profesori = $row['profesori'];
	$profID = $row['profID'];
	$heraParaqitjes = $row['heraParaqitjes'];
	
	//keto te dhena i vendosim neper qelizat e tabeles se krijuar ne HTML
	echo "<tr class = 'exams'>
			<td class = 'exams'>$studenti</td>
			<td class = 'exams'>$lenda</td>
			<td class = 'exams'>$profesori</td>
			<td class = 'exams'>$heraParaqitjes</td>";
			
			//kontrollo, nese studenti e ka paraqit lenden perkatese atehere mos e paraqit butonin Submit
			$selectQuery1 = "SELECT * FROM rezultatet
							WHERE studenti = '$usernameID' AND lenda = '$kodiLnd' 
								AND profesori = '$profID' AND paraqitur = 0;";
			//ekzekuto query-in
			$selectQuery1Res = mysqli_query($connect, $selectQuery1);
			$selectQuery1NumRow = mysqli_num_rows($selectQuery1Res);
			
			if($selectQuery1NumRow != 0) {
				echo "<td class = 'exams'><a href = 'Includes/functions/submitExamsDB.php?idProf=$profID&kodiLnd=$kodiLnd&sem=$semestri&dept=$departamenti&heraP=$heraParaqitjes' class = 'btn'>Submit</a></td>";
			}
		echo "</tr>";
}

echo "</table>";
?>