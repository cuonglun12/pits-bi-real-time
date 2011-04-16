select * from ordenes where codservicio in ('0014','0020') and codtiporeparto = '04'
select * from ordenes where codtiporeparto = '04' and codservicio not in ('0014','0020')
where
serie='006'
and orden='0016127'
and codcliente='00000000421'

select * from detordenes
where
serie='006'
and orden='0016127'
and codcliente='00000000421'

select * from despacho
where
serieguia = '001'
and nroguia = '044651'

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

