select fecsalida,fecretorno,fechadesp,fechacierre,fecasigna from despacho
select count(*) from despacho where fecretorno is null
select count(*) from despacho where fechacierre is null
select count(*) from despacho-- where fechacierre is null
--select count(*) from detdespacho

select * from despacho where fechacierre is null and fechamod is null
select * from t_estado_guia
select * from t_estados_orden
select * from detdespacho




