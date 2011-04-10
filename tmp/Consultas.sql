select
serie, orden, codcliente, codareacliente,
codservicio, codproducto, codnegocio,
--codambito,
--cnt_admision, cnt_digitado,
--fechaingreso, fechainicio, fechavencimiento, fechadevolucion, 
--moneda,
--tipo_cambio
--monto_periferico,
--importe_plus,
--importe_servicio,
--importe,igv,total,
estadoorden
--importe_periferico
from ordenes
where
codnegocio = '01'--NEGOCIO DE MENSAJERIA
and codambito = '01'
and moneda = 'S'
--and importe_plus != 0
--and codservicio = '0009'
--and codcliente = '00000010094'
--and 



/*

select serie, count(*) from ordenes group by serie order by serie
select * from cliente
select * from t_serie_orden order by codserieorden
*/


select 
serie, orden, codcliente,correlativo,
codestado,codmotivo,
--empresa
--llavedestina
--cargo
--referencia,codzona,cuadrante,llavedistrito,codpostal,,codzona
destinatario,direccion,ubigeo,tipoingreso
--codservicio, codproducto, codnegocio
 from detordenes
where codestado = '04'
--select * from detordenes
--where codestado = '04'
--select * from ordenes where serie = '020' and orden = '0010961' and codcliente = '00000003072'
--select * from despacho
select serieguia,nroguia from despacho
select codzona from detdespacho where codzona is not null

--select codzona,cuadrante,destinatario,cargo,codpostal from detordenes