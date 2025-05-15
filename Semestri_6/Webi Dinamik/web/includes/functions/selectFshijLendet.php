<?php

require "includes/functions/connect.php";

$query = mysqli_query($connect, "SELECT * FROM lenda;");

echo "<table class = 'exams'>
		<tr class = 'exams'>
			<th class = 'exams'>Kodi</th>
			<th class = 'exams'>Emri</th>
			<th class = 'exams'>Kredite</th>
			<th class = 'exams'>Statusi</th>
			<th class = 'exams'></th>
		</tr>";

while($row = mysqli_fetch_assoc($query)) {
	$kodi = $row['kodi'];
	$emri = $row['emri'];
	$kredite = $row['kredite'];
	$statusi = $row['statusi'];
	
	echo "<tr class = 'exams'>
			<td class = 'exams'>$kodi</td>
			<td class = 'exams'>$emri</td>
			<td class = 'exams'>$kredite</td>
			<td class = 'exams'>$statusi</td>
			<td class = 'exams'><a href = 'includes/functions/fshijLendetDB.php?kodi=$kodi' class = 'btn' onclick = 'return konfirmoFshirjen()'>Fshij</a></td>
		  </tr>";
}

echo "</table>";

?>

<script>
function konfirmoFshirjen() {
	return confirm("A jeni i sigurt per fshirjen?");
}
</script>