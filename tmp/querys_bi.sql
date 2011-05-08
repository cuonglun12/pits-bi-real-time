select * from dim_sede
update dim_sede set cod_ubigeo = null

select des_direccion from dim_sede
-- update dim_sede set des_direccion = null 
where length(trim(des_direccion)) = 1


update dim_sede set key_sede = 1
where key_sede = 46

select des_alias from dim_sede 
--update dim_sede set des_alias = null
where length(trim(des_alias)) = 0


update dim_sede set des_estado = 'ANULADO'
where cod_estado = 0


select * from fac_guia

select * from dim_personal
select count(*) from dim_personal
select cod_tipopersonal, des_tipopersonal from dim_personal
select codtipopersonal, tipopersonal  from t_tipopersonal 


update dim_personal set des_tipopersonal = (select tipopersonal
from t_tipopersonal where codtipopersonal = cod_tipopersonal)

select * from t_tipopersonal