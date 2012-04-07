--Carga de ubigeo
select 'PE'||di.param_cod,'287',de.param_id,pr.param_id, di.param_id from 
(select param_id, param_cod, substr(param_cod,1,4) as param_codx, param_des from t_parametro where param_cod_tip = 33) di
inner join (select param_id, param_cod, substr(param_cod,1,2) as param_codx, param_des from t_parametro where param_cod_tip = 32) pr
on di.param_codx = pr.param_cod
inner join (select param_id, param_cod, param_des from t_parametro where param_cod_tip = 31) de
on pr.param_codx = de.param_cod

--Servicios
SELECT param_cod,'61','2444',param_des FROM t_parametro where param_cod_tip = 16
select serv_id,sev_cod,'2444','LOCAL','61','MENSAJERIA',serv_des from t_servicio

--Carga de ubigeo en dimensional
select
ubi.ubi_id,
pas.param_id, pas.param_des,
dep.param_id, dep.param_des,
pro.param_id, pro.param_des,
dis.param_id, dis.param_des

from t_ubigeo ubi
inner join
(select param_id, param_des from t_parametro where param_cod_tip = 30 and param_cod = 'PE') pas on ubi.ubi_cod_pais = pas.param_id
inner join
(select param_id, param_des from t_parametro where param_cod_tip = 31) dep on ubi.ubi_cod_departamento = dep.param_id
inner join
(select param_id, param_des from t_parametro where param_cod_tip = 32) pro on ubi.ubi_cod_provincia = pro.param_id
inner join
(select param_id, param_des from t_parametro where param_cod_tip = 33) dis on ubi.ubi_cod_distrito = dis.param_id