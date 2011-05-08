select *  from ordenes   -- serie, orden
order by serie, orden

select  o.serie, 
        o.orden, 
        o.codcliente, 
        o.codnegocio, 
        o.codservicio, 
        o.codproducto, 
        o.codtiporeparto,
        o.fechaingreso,
        o.fechainicio,
        o.fechavencimiento, 
        o.fechadevolucion, -- fecha cuando se entragan los cargos a los clientes de PITS
        o.estadoorden,
        eo.estadoorden,
        o.codorigen,
        o.codzona   
from ordenes o   -- serie, orden
inner join t_estados_orden eo on o.estadoorden = eo.codestadoorden
order by 1,2

-- estados de ordenes
select * from t_estados_orden

select  o.serie, 
        o.orden, 
        o.codcliente, 
        o.codnegocio, 
        o.codservicio, 
        o.codproducto, 
        o.codtiporeparto,
        o.fechaingreso,
        o.fechainicio,
        o.fechavencimiento, 
        o.fechadevolucion, -- fecha cuando se entragan los cargos a los clientes de PITS
        o.estadoorden,
        eo.estadoorden,
        o.codorigen,
        o.codzona ,
        deto.destinatario,
        deto.direccion,
        deto.distrito, 
        deto.codpostal,
        deto.ubigeo,
        deto.codestado,
        edeto.estado,
        deto.tipoingreso,
        deto.user_digitacion
from ordenes o   -- serie, orden
inner join detordenes deto on o.serie = deto.serie and o.orden = deto.orden
inner join t_estados_orden eo on o.estadoorden = eo.codestadoorden
inner join estados edeto on deto.codestado = edeto.codestado
where o.estadoorden = '00'

select * from detordenes  -- serie, orden, tipoingreso, user_digitacion / correlativo
--tabla de estados de detordenes
select * from estados



select * from despacho -- serieguia, nroguia

select 
    d.serieguia,
    d.nroguia,
    d.fecsalida,
    d.fecretorno retorno_real,
    d.codmensajero,
    d.entregados,
    d.motivos,
    d.reenvios,
    d.reenvios,
    d.anulados,
    d.fuerazona, d.perdidos, d.observacion, d.monto, d.codestadoguia, d.estadoveri, d.fechadesp, d.fechacierre, d.fecasigna,
    detd.serie, detd.orden, detd.correlativo, detd.codestado, e.estado, detd.codmotivo, detd.estadoveri  
from detdespacho detd
inner join despacho d on d.serieguia = detd.serieguia and d.nroguia = detd.nroguia
inner join estados e on detd.codestado = e.codestado
where d.fecsalida is null


select count(*), correlativo from detdespacho
group by correlativo
having count(*) 

select * from detdespacho where serieguia = '001' and nroguia = '009784'
/*
001	009784
001	009784
*/


inner join orden o on  -- serieguia, nroguia

select * from detdespacho -- serieguia, nroguia, serie, orden, correlativo

select * from sedesprov where 

select * from t_estado_guia

select codsede, nomsede, direccion, ubigeo, 'distrito', estado, 'estado', alias_sede from sedesprov
where estado = 1

 INSERT INTO "public"."dim_sede"("key_sede", "cod_sede", "des_nombre", "des_direccion", "cod_ubigeo", "des_distrito", "cod_estado", "des_estado", "des_alias")   VALUES(46, 'L42', 'SEDE VILLA EL SALVADOR (SIN USAR)', 'Panamericana Sur Km. 25.3 Conchan', '', '', '0', '','')


select * from despacho where codmensajero = ' '


select * from personal where tipopers = '01'

select * from t_tipopersonal 



select * from despacho where codmensajero not in (select codigopersonal from personal)

sele
