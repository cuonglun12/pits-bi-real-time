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
    ord.total as total,
    ord.cnt_digitado
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
    
