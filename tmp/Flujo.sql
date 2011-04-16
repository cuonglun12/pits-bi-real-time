select * from ordenes where codservicio in ('0014','0020') and codtiporeparto = '04'
select * from ordenes where codtiporeparto = '04' and codservicio not in ('0014','0020')
where
serie='006'
and orden='0016127'
and codcliente='00000000421'

select * from detordenes
--select codproducto from ordenes
where
serie='006'
and orden='0016127'
and codcliente='00000000421'



group by correlativo having count(*)>1


select * from detordenes limit 1

SERIE0+GUIA0+CORRELATIVO+MOTIVO (DIMENSION)


SERIE1+GUIA1+CORRELATIVO+TIEMPO1+MOTIVO1 (HECHOS)
SERIE2+GUIA2+CORRELATIVO+TIEMPO2+MOTIVO2(HECHOS)
SERIE3+GUIA3+CORRELATIVO+TIEMPO3+MOTIVO3 (HECHOS)
SERIE4+GUIA4+CORRELATIVO+TIEMPO4+MOTIVO5 (HECHOS)
serie orden correlativo
001	0005431	000166

select * from detdespacho limit 1

select * from detdespacho
where
serie='006'
and orden='0016127'

select * from pasajeguias
select serieguia,nroguia, count(*) from t_guia_zona group by serieguia,nroguia having count(*)>2
select * from t_guia_zona where serieguia = '001' and nroguia = '047397'
select * from t_ubigeos_cliente
select * from ubigeos
select ruc,count(*) from cliente group by ruc having count(*)>1
select * from t_cliente_personal



select * from personal where codigopersonal = '007654' 
select usuario, count(*) from personal group by usuario having count(*)>1 --where codtipo = '01' 

select nombre, count(*) from personal group by nombre having count(*)>1 --where codtipo = '01' 
select count(*) from personal 

select * from personal where nombre = 'LINARES BACA CESAR'
select * from t_tipopersonal
select * from _pg_foreign_data_wrappers
select * from despacho
select * from personal where codigopersonal in (select codmensajero from despacho)
select * from t_tipopersonal