<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match = "/bookstore">
		<html>
		<body>
		<h2>Bookstore</h2>
		<xsl:apply-templates/>
		</body>
		</html>
	</xsl:template>
	
	<xsl:template match = "book">
		<p>
		<xsl:apply-templates select = "title"/>
		<xsl:apply-templates select = "author"/>
		</p>
	</xsl:template>
	
	<xsl:template match = "title">
		Title: <span><xsl:value-of select = "."/></span><br/>
	</xsl:template>
	
	<xsl:template match = "author">
		Author: <span><xsl:value-of select = "."/></span><br/>
	</xsl:template>
</xsl:stylesheet>