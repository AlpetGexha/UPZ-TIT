<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match = "/bookstore">
		<html>
		<body>
		<table border = "1">
			<tr>
				<th>Title</th>
				<th>Author(s)</th>
				<th>Year</th>
				<th>Price</th>
				<th>Category</th>
			</tr>
			<xsl:for-each select = "book[@category='web']">
			<xsl:sort select = "year"/>
				<tr bgcolor = "white">
					<td><xsl:value-of select = "title"/></td>
					<td><xsl:value-of select = "author"/></td>
					<td><xsl:value-of select = "year"/></td>
					<td><xsl:value-of select = "price"/></td>
					<td><xsl:value-of select = "@category"/></td>
				</tr>
			</xsl:for-each>
		</table>
		</body>
		</html>
	</xsl:template>
</xsl:stylesheet>