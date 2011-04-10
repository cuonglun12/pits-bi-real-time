select
serie,orden,item,
cod_area_origen,cod_area_destino,item_desde,item_hasta,
codestado --- pendiente p, recepcionad r, rechaza x, anulado a, enviadp e
 from t_proceso_area
where serie = '008' and orden = '0386034'
--select * from t_proceso_area_det
select * from areacliente
select * from t_apoyo_cab
select * from t_departamento--area