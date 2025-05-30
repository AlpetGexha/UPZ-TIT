<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
    <xsl:output method="html" indent="yes" encoding="UTF-8"/>
    
    <!-- Root template -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Kontaktet me Telefona Mobil</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        margin: 20px;
                        background-color: #f5f5f5;
                    }
                    h1 {
                        color: #333;
                        text-align: center;
                        margin-bottom: 30px;
                    }
                    table {
                        width: 100%;
                        border-collapse: collapse;
                        background-color: white;
                        box-shadow: 0 2px 5px rgba(0,0,0,0.1);
                        margin: 0 auto;
                    }
                    th {
                        background-color: #4CAF50;
                        color: white;
                        padding: 12px;
                        text-align: left;
                        border-bottom: 2px solid #45a049;
                    }
                    td {
                        padding: 10px;
                        border-bottom: 1px solid #ddd;
                    }
                    tr:nth-child(even) {
                        background-color: #f9f9f9;
                    }
                    tr:hover {
                        background-color: #f5f5f5;
                    }
                    .mobile-phone {
                        color: #2196F3;
                        font-weight: bold;
                    }
                    .no-contacts {
                        text-align: center;
                        color: #666;
                        font-style: italic;
                        padding: 20px;
                    }
                </style>
            </head>
            <body>
                <h1>Kontaktet me Telefona Mobil</h1>
                
                <xsl:choose>
                    <xsl:when test="kontaktet/kontakti[telefoni[@lloji='mobil']]">
                        <table>
                            <thead>
                                <tr>
                                    <th>Emri</th>
                                    <th>Mbiemri</th>
                                    <th>Adresa</th>
                                    <th>Qyteti</th>
                                    <th>Zip Kodi</th>
                                    <th>Telefoni Mobil</th>
                                    <th>Email Adresa</th>
                                </tr>
                            </thead>
                            <tbody>
                                <!-- Select only contacts that have mobile phones -->
                                <xsl:for-each select="kontaktet/kontakti[telefoni[@lloji='mobil']]">
                                    <tr>
                                        <td><xsl:value-of select="personi/emri"/></td>
                                        <td><xsl:value-of select="personi/mbiemri"/></td>
                                        <td><xsl:value-of select="adresa/rruga"/></td>
                                        <td><xsl:value-of select="adresa/qyteti"/></td>
                                        <td><xsl:value-of select="adresa/zipKodi"/></td>
                                        <td class="mobile-phone">
                                            <!-- Display all mobile phone numbers for this contact -->
                                            <xsl:for-each select="telefoni[@lloji='mobil']">
                                                <xsl:value-of select="."/>
                                                <xsl:if test="position() != last()"><br/></xsl:if>
                                            </xsl:for-each>
                                        </td>
                                        <td>
                                            <xsl:choose>
                                                <xsl:when test="emailAdresa != ''">
                                                    <xsl:value-of select="emailAdresa"/>
                                                </xsl:when>
                                                <xsl:otherwise>
                                                    <em>Pa email</em>
                                                </xsl:otherwise>
                                            </xsl:choose>
                                        </td>
                                    </tr>
                                </xsl:for-each>
                            </tbody>
                        </table>
                    </xsl:when>
                    <xsl:otherwise>
                        <div class="no-contacts">
                            <p>Nuk ka kontakte me telefona mobil.</p>
                        </div>
                    </xsl:otherwise>
                </xsl:choose>
            </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>
