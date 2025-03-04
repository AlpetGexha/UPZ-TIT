<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match = "/emails">
		<html>
		<body>
		<h2>Emails</h2>
		<xsl:for-each select = "email">
			<h4>Email <xsl:value-of select = "position()"/></h4>
			<p>
				From: <xsl:value-of select = "header/from/name"/> &lt;<xsl:value-of select = "header/from/emailAddress"/>&gt;<br/>
				<xsl:for-each select = "header/to">
					To: <xsl:value-of select = "name"/> &lt;<xsl:value-of select = "emailAddress"/>&gt;<br/>
				</xsl:for-each>				
				Date: <xsl:value-of select = "header/date"/><br/>
				Subject: <xsl:value-of select = "header/subject"/> <br/>
				Body: <xsl:value-of select = "body"/><br/>
			</p>
		</xsl:for-each>
		</body>
		</html>
	</xsl:template>
</xsl:stylesheet>