<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<jp:mondrianQuery id="query01" jdbcDriver="org.postgresql.Driver" jdbcUrl="jdbc:postgresql://192.168.1.126:5432/db_pitsbi" catalogUri="/WEB-INF/queries/Ordenes.xml"
   jdbcUser="user_prueba" jdbcPassword="!12345678" connectionPooling="false">
select 
{
	[O-Total],
	[EF-Cerr],
	[EF-Pend],
	[FF-Cerr],
	[FF-Pend],
	[O-Dias Ex],
	[O-Anulado],
	[O-Incosis],
	[C-Total],
	[C-Anulado],
	[C-Entrega],
	[C-Fuera Z],
	[C-Motivad],
	[C-Perdido],
	[C-Reenvio]
} on columns,

NON EMPTY
{
	(
		[Cliente].[Todos],
		[Servicio].[Todos],
		[Producto].[Todos],
		[Inicio].[Todos]
	)
} on rows
  from Ordenes

</jp:mondrianQuery>

<c:set var="title01" scope="session">Analisis de Ordenes de Servicio</c:set>

