<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match = "/emails">
		<html>
		<body>
		<h2>Emails</h2>
		<xsl:apply-templates />
		</body>
		</html>
	</xsl:template>
	
	<xsl:template match = "email">
		<p>
			<xsl:apply-templates select = "header"/>
			<xsl:apply-templates select = "body"/>
		</p>
	</xsl:template>
	
	<xsl:template match = "header">
		<xsl:apply-templates select = "from"/>
		<xsl:apply-templates select = "to"/>
		<xsl:apply-templates select = "date"/>
		<xsl:apply-templates select = "subject"/>
	</xsl:template>
	
	<xsl:template match = "from">
		From: <xsl:value-of select = "name"/> &lt;<xsl:value-of select = "emailAddress"/>&gt;<br/>
	</xsl:template>
	
	<xsl:template match = "to">
		To: <xsl:value-of select = "name"/> &lt;<xsl:value-of select = "emailAddress"/>&gt;<br/>
	</xsl:template>
	
	<xsl:template match = "date">
		Date: <xsl:value-of select = "."/><br/>
	</xsl:template>
	
	<xsl:template match = "subject">
		Subject: <xsl:value-of select = "."/><br/>
	</xsl:template>
	
	<xsl:template match = "body">
		Body: <xsl:value-of select = "."/><br/>
	</xsl:template>
</xsl:stylesheet>