<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="statoStampante" scope="request" class="connector.Printer3dConnector"></jsp:useBean>            
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="./immagini/favicon.png" type="image/png">
<link href="./css/stile-gray.css" rel="stylesheet" type="text/css">
<title>3D Printer Monitor</title>
</head>
<body>
<form action="Printer3dServlet" method="post">

<div>
<span class="testoDatiGrandi"><input class="campiTestoStandard" type="text" name="txtNome" value="<%=statoStampante.printer3d.getNome() %>"></span>
<br><br>
<span class="testoDatiGrandi"><input class="campiTestoStandard" type="text" name="txtStato" value="<%=statoStampante.interfaccia.statoStringa %>"></span>
</div>
<div>
<table class="sezioniPrincipali">
<tr>
<td>
<img src="<%=statoStampante.interfaccia.imgAllarmi %>" >
</td>
<td>
<div id="<%=statoStampante.interfaccia.idVentola %>"></div>
</td>
<td width=250>

<p>
<span class="testoIndiciDettagli">Temp. Ugello:</span><br><input class="campiTestoDettagli" type="text" name="txtTempUgello" value="<%=statoStampante.printer3d.getTempUgello() %>">
</p>
<p>
<span class="testoIndiciDettagli">Temp. Ambiente:</span><br><input class="campiTestoDettagli" type="text" name="txtTempAmbiente" value="<%=statoStampante.printer3d.getTempAmbiente() %>">
</p>
<p>
<span class="testoIndiciDettagli">Vibrazioni(RMS):</span><br><input class="campiTestoDettagli" type="text" name="txtVibrazioniRMS" value="<%=statoStampante.printer3d.getVibrazioniRMS() %>">
</p>


</td>
</tr>
</table>
</div>
<div>
<input class="pulsantiStandard" type="submit" id="btnpause" name="btnComando" value="Pausa">

<input class="pulsantiStandard" type="submit" id="btnventola" name="btnComando" value="Ventola">
</div>


</form>
</body>
</html>