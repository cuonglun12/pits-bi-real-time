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




SELECT loc.key_localizacion,
       cli.key_cliente     ,
       ser.key_servicio    ,
       pro.key_producto    ,
       tsal.key_tiempo     ,
       tent.key_tiempo     ,
       estado.key_estado   ,
       per1.key_personal   ,
       per2.key_personal   ,
       per3.key_personal   ,
       de.serieguia        ,
       de.nroguia          ,
       de.total            ,
       de.entregados       ,
       de.motivos          ,
       de.reenvios         ,
       de.anulados         ,
       de.fuerazona        ,
       de.perdidos
FROM   despacho de
       INNER JOIN detdespacho det
       ON     de.serieguia = det.serieguia
       AND    de.nroguia   = det.nroguia
       INNER JOIN ordenes ord
       ON     det.serie = ord.serie
       AND    det.orden = ord.orden
       INNER JOIN dim_localizacion loc
       ON     de.codzona = loc.cod_zona
       INNER JOIN dim_cliente cli
       ON     ord.codcliente = cli.cod_cliente
       INNER JOIN dim_servicio ser
       ON     ord.codservicio = ser.cod_servicio
       INNER JOIN dim_producto pro
       ON     ord.codproducto = pro.cod_producto
       INNER JOIN dim_tiempo tsal
       ON     de.fecsalida = tsal.fec_fecha
       INNER JOIN dim_tiempo tent
       ON     de.fecretorno = tent.fec_fecha
       INNER JOIN
              (SELECT key_estado,
                      cod_estado
              FROM    dim_estado
              WHERE   cod_tipo = '01'
              )
              AS estado
       ON     de.codestadoguia = estado.cod_estado
       INNER JOIN dim_personal per1
       ON     de.codmensajero = per1.cod_codigopersonal
       INNER JOIN dim_personal per2
       ON     de.usuariodesp = per2.cod_codigopersonal
       INNER JOIN dim_personal per3
       ON     de.usuariocierre = per3.cod_codigopersonal
	   
	   
	   
SELECT loc.key_localizacion,
       cli.key_cliente     ,
       ser.key_servicio    ,
       pro.key_producto    ,
       tsal.key_tiempo     ,
       tent.key_tiempo     ,
       estado.key_estado   ,
       per1.key_personal   ,
       per2.key_personal   ,
       per3.key_personal   ,
       de.serieguia        ,
       de.nroguia          ,
	   sum(CASE WHEN det.codestado!='' THEN 1 ELSE 0 END) as cnt_total,
	   sum(CASE WHEN det.codestado='04' THEN 1 ELSE 0 END) as cnt_entregado,
	   sum(CASE WHEN det.codestado='05' THEN 1 ELSE 0 END) as cnt_motivos,
	   sum(CASE WHEN det.codestado='06' THEN 1 ELSE 0 END) as cnt_reenvios,
	   sum(CASE WHEN det.codestado='09' THEN 1 ELSE 0 END) as cnt_anulados,
	   sum(CASE WHEN det.codestado='07' THEN 1 ELSE 0 END) as cnt_fuerazona,
	   sum(CASE WHEN det.codestado='08' THEN 1 ELSE 0 END) as cnt_perdidos
FROM   despacho de
       INNER JOIN detdespacho det ON de.serieguia = det.serieguia AND de.nroguia = det.nroguia
       INNER JOIN ordenes ord ON det.serie = ord.serie AND det.orden = ord.orden
       INNER JOIN dim_localizacion loc ON de.codzona = loc.cod_zona
       INNER JOIN dim_cliente cli ON ord.codcliente = cli.cod_cliente AND ord.codareacliente = cli.cod_area
       INNER JOIN dim_servicio ser ON ord.codservicio = ser.cod_servicio
       INNER JOIN dim_producto pro ON ord.codproducto = pro.cod_producto
       INNER JOIN dim_tiempo tsal ON de.fecsalida = tsal.fec_fecha
       INNER JOIN dim_tiempo tent ON de.fecretorno = tent.fec_fecha
       INNER JOIN
              (SELECT key_estado,
                      cod_estado
              FROM    dim_estado
              WHERE   cod_tipo = '01'
              )
              AS estado
       ON     de.codestadoguia = estado.cod_estado
       INNER JOIN dim_personal per1 ON de.codmensajero = per1.cod_codigopersonal
       INNER JOIN dim_personal per2 ON de.usuariodesp = per2.cod_codigopersonal
       INNER JOIN dim_personal per3 ON de.usuariocierre = per3.cod_codigopersonal
WHERE
       det.serieguia = '011' and det.nroguia = '101261'
GROUP BY
       cli.key_cliente     ,
       ser.key_servicio    ,
       pro.key_producto    ,
	   loc.key_localizacion,
       tsal.key_tiempo     ,
       tent.key_tiempo     ,
       estado.key_estado   ,
       per1.key_personal   ,
       per2.key_personal   ,
       per3.key_personal   ,
       de.serieguia        ,
       de.nroguia	   
	   
select per.codigopersonal cod_personal, per.tipopers cod_tipopersonal, per.coddepartamento cod_departamento, dep.departamento des_departamento, per.nombre des_nombre, per.estadocivil cod_estadocivil, eci.estadocivil des_estadocivil, 
 per.fechaingreso::date fec_fechaingreso, per.fechacese::date fec_fechacese, per.sexo cod_sexo, CASE per.sexo 
  WHEN 'M' THEN 'MASCULINO'
  WHEN 'F' THEN 'FEMENINO'
  ELSE '-'
  END des_sexo 
from personal per inner join t_tipopersonal tpe
on per.tipopers = tpe.codtipopersonal
inner join t_departamento dep
on per.coddepartamento = dep.coddepartamento
inner join t_estadocivil eci
on per.estadocivil = eci.codestadocivil


-----------------------------------------

select
    cli.key_cliente as cliente,
    ser.key_servicio as servicio,
    pro.key_producto as producto,
    treg.key_tiempo as treg,
    ord.fechaingreso as ingreso,
    tini.key_tiempo as tini,
    ord.fechainicio as inicio,
    tven.key_tiempo as tven,
    ord.fechavencimiento as vencimiento,
    tdev.key_tiempo as tdev,
    ord.fechadevolucion as devolucion,
    ord.estadoorden as estado,
    ord.serie as serie,
    ord.orden as orden,
    ord.importe as importe,
    ord.igv as igv,
    ord.total as total
from
    ordenes ord
    INNER JOIN dim_cliente cli ON ord.codcliente = cli.cod_cliente AND ord.codareacliente = cli.cod_area
    INNER JOIN dim_servicio ser ON ord.codservicio = ser.cod_servicio
    INNER JOIN dim_producto pro ON ord.codproducto = pro.cod_producto
    LEFT JOIN dim_tiempo treg ON ord.fechaingreso = treg.fec_fecha
    LEFT JOIN dim_tiempo tini ON ord.fechainicio = tini.fec_fecha
    LEFT JOIN dim_tiempo tven ON ord.fechavencimiento = tven.fec_fecha
    LEFT JOIN dim_tiempo tdev ON ord.fechadevolucion = tdev.fec_fecha

select correlativo,codestado, codmotivo
from detordenes
where orden = ? and serie = ? and codestado not in ('09','12')

select
    det.codestado as estado,
    det.codmotivo as motivo,
    tsal.key_tiempo as tsal,
    dep.fecsalida as salida,
    tret.key_tiempo as tret,
    dep.fecretorno as retorno,
    tcie.key_tiempo as tcie,
    dep.fechacierre as cierre,
    tmod.key_tiempo as tmod,
    dep.fechamod as modifacion
from
    detdespacho det
    inner join despacho dep on det.serieguia = dep.serieguia and det.nroguia = dep.nroguia
    inner join dim_tiempo tsal on dep.fecsalida = tsal.fec_fecha
    inner join dim_tiempo tret on dep.fecretorno = tret.fec_fecha
    inner join dim_tiempo tcie on date(dep.fechacierre) = tcie.fec_fecha
    inner join dim_tiempo tmod on date(dep.fechamod) = tmod.fec_fecha
where
    det.orden = ''
    and det.serie = ''
    and det.correlativo = ''
order by
    salida desc
limit 1
    
