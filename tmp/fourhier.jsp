<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<jp:mondrianQuery id="query01" jdbcDriver="org.postgresql.Driver" jdbcUrl="jdbc:postgresql://localhost:5432/db_pitsbi" catalogUri="/WEB-INF/queries/Envio.xml"
   jdbcUser="postgres" jdbcPassword="okamismo" connectionPooling="false">
select 
{
	[Total Cargos Entregados],
	[Total Cargos Fuerazona],
	[Total Cargos Motivados],
	[Total Cargos Perdidos],
	[Total Cargos Reenvios],
	[Total Cargos Anulados],
	[Total]
} on columns,

NON EMPTY
{
	(
		[Cliente].[All cliente],
		[Servicio].[All servicio],
		[Producto].[All producto],
		[Estado].[All estado],
		[Personal].[All personal],
		[Localizacion].[All localizacion],
		[Tiempo].[All tiempo]
	)
} on rows
  from Envios

</jp:mondrianQuery>

<c:set var="title01" scope="session">4 hierarchies on one axis</c:set>
