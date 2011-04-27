<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<jp:mondrianQuery id="query01" jdbcDriver="org.postgresql.Driver" jdbcUrl="jdbc:postgresql://localhost:5432/db_pitsbi" catalogUri="/WEB-INF/queries/Pits.xml"
   jdbcUser="postgres" jdbcPassword="okamismo" connectionPooling="false">
select 
{
	[SUM Cargos],
	[SUM IGV (S/.)],
	[SUM Importe (S/.)],
	[SUM Total (S/.)]
} on columns,

NON EMPTY
{
	(
		[Cliente].[All cliente],
		[Servicio].[All servicio],
		[Producto].[All producto],
		[Tiempo].[All tiempo]
	)
} on rows
  from Pits

</jp:mondrianQuery>

<c:set var="title01" scope="session">4 hierarchies on one axis</c:set>
