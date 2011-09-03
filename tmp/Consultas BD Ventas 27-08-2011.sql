SELECT
coserie, conumero,--LLAVE DE LA COTIZACION (BASENEXT VS. VENTAS)
--ruc_dni,
contacto,--NO HAY EN BASENEXT
codcliente, codareacliente,--LLAVE DEL CLIENTE (BASENEXT VS. VENTAS)
--direccion, email,
--codpaiscontacto, ubigeo, codpostal,
--telefono,
--anexo, celular, areacontacto,
codtipoentrega,-- TIPO DE ENTREGA DE BASENEXT
--cargocontacto, fax, codpaisorigen, ciudadorigen, puertoorigen, obsorigen, transporteorigen, codpaisdestino, ciudaddestino, puertodestino, transportedestino, obsdestino, obscotizacion,
codnegocio,--MENSAJERIA Y COURIER
codambito,--LOCAL Y NACIONAL
codservicio,--SERVICIOS DE BASENEXT 
codproducto,--PRODUCTOS DE BASENEXT
peso, -- PESO Y SE ASOCIA CON LA TABLA TCOTIZAPESO
--pesoapox, pesototal,
preciounitario, preciototal, descuento, montoneto, porcentaje, moneda,
--montopagar, flete, desaduanaje, seguro, comision,
cantidad,
--cntposiciones, cntunidades, cntpersonas, unidadmedida, largo, ancho, alto, volumen, numerodias,
reserie, renumro,
tipoproducto,--MUESTRA M, DOCUMENTO D
--rutaimagen, producto, obsproducto, codencuesta, imo, umm, serie, orden,
estado,--CUALES SON LOS ESTADOS
--empresa, usuario,
fecha, usuariomod, fechamod,--DATOS DEL REGISTRO
motivoanulacion,--SOLICITAR LA LISTA DE MOTIVOS
tipocotizacion,--SOLICITAR LA DEFINICION DE LOS VALORES
fechaanula, usuarioanula,
--usuarioaprueba, fechaaprueba, JUAN MENCIONO QUE NO SE REALIZABA UN CONTROL PARA AUTORIZAR LAS COTIZACIONES
codzona,--SOLICITAR LA DEFINICION DE LOS VALORES
subservicios,pplano, preal, cod_destino,
--t_transporte, preciokadic, preciokadic_plano, kg_base,
kg_recojo, kg_adicional_recojo
--, recojo, ubigeo_origen, ubigeo_destino, codunidad, des_servicio, zonal 
    FROM t_cotizaciones
where
codnegocio in ('01','11') -- MENSAJERIA y COURIER
and codambito in ('01','02') -- 01 LOCAL, 02 NACIONAL

/*
select * from t_cotizaciones where codcliente is null
select * from t_negocios
select * from t_tipoentrega
select * from t_ambitos
select * from t_ord_trabajo
select * from t_servicio_cliente
select codnegocio, count(*) from t_cotizaciones group by codnegocio
select * from t_producto
select * from t_peso where codnegocio in ('01','11')
select * from t_peso where cod_peso = '0000'
select * from t_cotizapeso --VINCULO DE LA COTIZACION Y DEL PESO
select * from t_cotizatarifa --TARIFA QUE SE LE APLICA A LA COTIZACION
select * from t_cotizatarifa order by fecha desc
select * from t_tarifas where codtarifa = '04597' --69.26
select * from t_tarifas order by fecha desc
select * from t_cotizaciones where coserie = '20' and  conumero = '214'
select * from t_tarifas where codnegocio in ('01','11') and codambito in ('01','02')
select codtarifa,codnegocio,codambito,codservicio,tarifa_urbana,codpeso,codcantidad,moneda from t_tarifas where codnegocio in ('01','11') and codambito in ('01','02') --and codproducto is not null
select * from t_cantidad where codnegocio in ('01','11')
select * from t_cotizacantidad
select * from t_servicio_cliente
select * from t_cotizarangos
select * from t_cotiza_adicional
select * from t_estado
select * from t_zona
select * from t_zona_cliente

select * from t_negocios
select * from t_cotizaciones where subservicios is not null
select * from 

*/


/*

CONSULTAS A LA BASENEXT

select * from cliente where codcliente = '00000004390'
select * from cliente where ruc = '06437323'
select * from ordenes
select * from t_ord_trabajo
select * from t_productos
select * from t_tipoentrega
select * from t_servicios

select codnegocio,count(*) from ordenes group by codnegocio
select * from t_servicios where codnegocio in ('01','11') and codambito in ('01','02')
*/


select coserie, conumero,peso, cantidad,codnegocio,codservicio,codambito from t_cotizaciones

-- coserie     conumero     peso     cantidad    codnegocio   servicio  codambito 
-- ----------  -----------  -------  -----------        
 --10          14           0.02     10001          01      0013       02

select * from t_peso where codnegocio = '01' and codservicio = '0013' and cod_peso = '0041'
--select * from t_cotizapeso where 
select * from t_cantidad where codnegocio = '01' and codservicio = '0013'
select * from t_tarifas where codnegocio = '01' and codservicio = '0013' and codpeso = '0041' and codambito = '02'

select * from t_tarifas where codnegocio = '01' and codservicio = '0013' and codpeso = '0041' and codambito = '02' and codzona is not null

select coserie, conumero, count(*) from t_cotizatarifa group by 1,2 having count(*)>1

select tf.codpeso, tf.tarifa, tf.tarifa_urbana, ca.cantidad_ini,ca.cantidad_fin from t_cotizatarifa ct inner join t_tarifas tf on ct.codtarifa = tf.codtarifa inner join t_cantidad ca on tf.codcantidad = ca.codcantidad
where ct.coserie = '10' and ct.conumero = '8'

select estado, count(*) from t_cotizaciones group by 1

select codcliente, codareacliente, count(*)  from t_cotizaciones where estado = '5' group by codcliente, codareacliente

select codcliente, count(*)  from t_cotizaciones where estado = '5' group by codcliente
select usuario,count(*) from t_cotizaciones group by usuario

select codproducto,count(*) from t_cotizaciones group by codproducto
select * from t_producto where codproducto = '0020'

select motivoanulacion, count(*) from t_cotizaciones where estado = '1' and motivoanulacion is not null group by 1


------ZONA
select codzona,codambito from t_cotizaciones where codzona is not null and codzona !=''
select codzona,codambito,count(*) from t_cotizaciones where codzona is not null and codzona !='' group by 1,2
select * from t_zona where codzona = '0037'
select * from t_servicio_cliente
select * from t_zona_cliente
select * from t_zona_provincia_cliente