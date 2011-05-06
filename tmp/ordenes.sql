select
    --fechainicio,fechadevolucion,fechavencimiento
    --count(ord)
    --*
from
    ordenes ord inner join (select serie, orden,count(*) from detordenes where codestado in ('01','02','03','10') group by serie, orden) detalle on ord.serie = detalle.serie and ord.orden = detalle.orden --26553/115154 = 23%
where
    --fechainicio is null or fechadevolucion is null or fechavencimiento is null --1155/115154 = 10%
    --codnegocio = '01' and moneda = 'D' limit 1
    --cnt_admision = cnt_digitado+cnt_periferico+cnt_m3 --100779/115154 = 87.5%

select * from t_estados_orden
select estadoorden, count(*) from ordenes group by estadoorden
select * from ordenes where estadoorden = '1'
--/ 	4
--00	1190 GENERADO
--01	49539 PENDIENTE
--02	307 ANULADO
--03	64086 CERRADO
--1 	28
    


select
count(*)
from
ordenes ord inner join (select serie, orden, correlativo, count('+') as cantidad from detdespacho group by serie, orden, correlativo) detalle on ord.serie = detalle.serie and ord.orden = detalle.orden
where
ord.cnt_admision = detalle.cantidad


select
c*
from
ordenes ord inner join (select serie, orden,count(*) from detordenes where codestado in ('01','02','03','10') group by serie, orden) detalle on ord.serie = detalle.serie and ord.orden = detalle.orden

select distinct codestado from detordenes

select * from estados
select * from motivos