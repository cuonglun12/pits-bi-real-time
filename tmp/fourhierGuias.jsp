<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<jp:mondrianQuery id="query01" jdbcDriver="org.postgresql.Driver" jdbcUrl="jdbc:postgresql://192.168.1.126:5432/db_pitsbi" catalogUri="/WEB-INF/queries/Guias.xml"
   jdbcUser="user_prueba" jdbcPassword="!12345678" connectionPooling="false">
select 
{
	[Cargos totales],
	[Cargos Entregados],
	[Cargos Motivados],
	[Cargos Reenviados],
	[Cargos Anulados],
	[Cargos Fuera de zona],
	[Cargos Perdidos],
	[Días Excedidos]
	
} on columns,

NON EMPTY
{
	(
		[Personal].[Todos],
		[Tiempo].[Todos],
		[Sede].[Todos],
		[Localizacion].[Todos]
		[Estado].[Todos]
		
	)
} on rows
  from Ordenes

</jp:mondrianQuery>

<c:set var="title01" scope="session">Analisis de Cargos</c:set>

