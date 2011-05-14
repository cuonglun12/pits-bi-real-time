<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<jp:mondrianQuery id="query01" jdbcDriver="org.postgresql.Driver" jdbcUrl="jdbc:postgresql://192.168.1.126:5432/db_pitsbi" catalogUri="/WEB-INF/queries/Guias.xml"
   jdbcUser="user_prueba" jdbcPassword="!12345678" connectionPooling="false">
select 
{
	[Total_Guias],
	[Cargos_Totales],
	[Cargos_Entregados],
	[Cargos_Motivados],
	[Cargos_Reenviados],
	[Cargos_Anulados],
	[Cargos_Fuera_zona],
	[Cargos_Perdidos],
	[Dias_Excedidos]
	
} on columns,

NON EMPTY
{
	(
		[Personal].[Todos],
		[Tiempo].[Todos],
		[Sede].[Todos],
		[Localizacion].[Todos],
		[Estado].[Todos]
		
	)
} on rows
  from Guias

</jp:mondrianQuery>

<c:set var="title01" scope="session">Analisis de Guias</c:set>

