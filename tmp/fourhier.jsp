<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>


<jp:mondrianQuery id="query01" jdbcDriver="org.postgresql.Driver" jdbcUrl="jdbc:postgresql://192.168.1.126:5432/db_pitsbi" catalogUri="/WEB-INF/queries/Ordenes.xml"
   jdbcUser="user_prueba" jdbcPassword="!12345678" connectionPooling="false">
select 
{
	[T.O.],
	[O.C.EF.],
	[O.C.FF.],
	[O.P.EF.],
	[O.P.FF.],
	[O.A.],
	[O.I.],
	[T.IGV],
	[T.Imp.],
	[T.Ing.]
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
<c:set var="text00" scope="session">Leyenda:</c:set>
<c:set var="text01" scope="session">T.O. = Total de ordenes</c:set>
<c:set var="text02" scope="session">O.C.EF. = Ordenes cerrados en fecha / O.C.FF. = Ordenes cerrados fuera fecha</c:set>
<c:set var="text03" scope="session">O.P.EF. = Ordenes pendientes en fecha / O.P.FF. = Ordenes pendientes fuera fecha</c:set>
<c:set var="text04" scope="session">O.A. = Ordenes anuladas / O.I. = Ordenes inconsistentes</c:set>
<c:set var="text05" scope="session">T.IGV = Total IGV / T.Imp. = Total importe / T.Ing. = Total ingreso</c:set>

