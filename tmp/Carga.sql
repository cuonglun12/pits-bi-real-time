select if codnegocio='00' then 'a' end if from t_negocios
select * from t_negocios

select * from cliente
select * from t_servicios
select * from t_moneda
select count(*) from ordenes where codnegocio = '01'
select * from ordenes where codnegocio = '01' and moneda = 'D' limit 1
select * from ordenes where codnegocio = '01' and moneda = 'S' limit 1
select count(*) from ordenes where codnegocio = '01' and moneda = 'D' limit 1
select count(*) from ordenes where codnegocio = '01' and moneda = 'S' and estadoorden = '03' and cnt_admision >0 limit 1
select count(*) from cliente
select substring(codcliente,1,4) from cliente

/*
cod_cliente, des_cliente, cod_tipocliente, des_tipocliente,
cod_area, des_area, des_direccion, cod_pais, cod_ubigeo
*/

select c.codcliente,c.cliente,c.tipocliente,a.codareacliente,a.areacliente,c.direccion,c.codpais,c.ubigeo
from cliente c inner join areacliente a on c.codcliente = a.codcliente
where
c.codcliente is not null and c.codcliente <> ''
and trim(c.cliente)<> ''
and c.tipocliente is not null
and trim(tipocliente) <> ''
and c.ubigeo is not null
and length(trim(c.ubigeo))=6

update dim_cliente set cod_pais = 'PE' where cod_pais is null

select n.codnegocio, trim(n.negocio), a.codambito, trim(a.ambito), s.codservicio, trim(s.servicio)
from t_negocios n, t_servicios s, t_ambitos a
where
s.codnegocio = n.codnegocio
and s.codambito = a.codambito
and n.codnegocio is not null and n.codnegocio <> '' and trim(n.negocio) <> ''
and a.codambito is not null and a.codambito <> '' and trim(a.ambito) <> ''
and s.codservicio is not null and s.codservicio <> '' and trim(s.servicio) <> ''


select codproducto, producto,tipoproducto from t_productos
where
codproducto is not null and codproducto <> ''
and trim(producto)<>''
and tipoproducto is not null and tipoproducto <> ''

update dim_producto set des_tipo = 'DOCUMENTO' where cod_tipo = 'D';
update dim_producto set des_tipo = 'MUESTRA' where cod_tipo = 'M';



select c.key_cliente,s.key_servicio,p.key_producto,fr.key_tiempo,fi.key_tiempo,fv.key_tiempo, fd.key_tiempo, o.serie,o.orden,o.cnt_admision,o.importe,o.igv,o.total
from
ordenes o inner join dim_cliente c on o.codcliente = c.cod_cliente and o.codareacliente = c.cod_area
inner join dim_servicio s on o.codnegocio = s.cod_negocio and o.codambito = s.cod_ambito and o.codservicio = s.cod_servicio
inner join dim_producto p on o.codproducto = p.cod_producto
inner join dim_tiempo fr on o.fechaingreso = fr.fec_fecha
inner join dim_tiempo fi on o.fechainicio = fi.fec_fecha
inner join dim_tiempo fv on o.fechavencimiento = fv.fec_fecha
inner join dim_tiempo fd on o.fechadevolucion = fd.fec_fecha
where
o.codnegocio = '01'
and o.moneda = 'S'
and o.estadoorden = '03'
and o.cnt_admision >0