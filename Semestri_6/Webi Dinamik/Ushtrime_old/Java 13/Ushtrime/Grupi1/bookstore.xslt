<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match = "/bookstore">
		<html>
		<body>
			<table border = "1">
				<tr>
					<th>Emri</th>
					<th>Mbiemri</th>
					<th>Zipkodi</th>
					<th>Rruga</th>
					<th>Qyteti</th>
					<th>Telefoni</th>
				
				</tr>
				<xsl:for-each select = "//telefoni[@lloji='mobil']">
					<tr bgcolor = "orange">
						<td><xsl:value-of select = "emri"/></td>
						<td><xsl:value-of select = "mbiemri"/></td>
						<td><xsl:value-of select = "zipkodi"/></td>
						<td><xsl:value-of select = "rruga"/></td>
						<td><xsl:value-of select = "qyteti"/></td>
						<td><xsl:value-of select = "telefoni"/></td>
					</tr>
					
				</xsl:for-each>
			</table>
		</body>
		</html>
	</xsl:template>
</xsl:stylesheet>