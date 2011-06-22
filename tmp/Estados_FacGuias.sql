select count(*) from fac_guia

select * from  fac_guia
where key_tiempo_retorno_real  = 0
-- Primero
update fac_guia SET num_guias = 1

SELECT * FROM dim_estado

/*
11	01    	DESPACHO        02	ESTADO-GUIA-DESPACHO	01	EN FECHA
12	02    	RUTA            02	ESTADO-GUIA-DESPACHO	01	EN FECHA
13	03    	CERRADO         02	ESTADO-GUIA-DESPACHO	01	EN FECHA
14	04    	GENERADO        02	ESTADO-GUIA-DESPACHO	01	EN FECHA
15	05    	PAGADO          02	ESTADO-GUIA-DESPACHO	01	EN FECHA
16	06    	ANULADO         02	ESTADO-GUIA-DESPACHO	01	EN FECHA
17	99    	INCONSISTENTE	02	ESTADO-GUIA-DESPACHO	01	EN FECHA
18	01    	DESPACHO        02	ESTADO-GUIA-DESPACHO	02	FUERA DE FECHA
19	02    	RUTA            02	ESTADO-GUIA-DESPACHO	02	FUERA DE FECHA
20	03    	CERRADO         02	ESTADO-GUIA-DESPACHO	02	FUERA DE FECHA
21	04    	GENERADO        02	ESTADO-GUIA-DESPACHO	02	FUERA DE FECHA
22	05    	PAGADO          02	ESTADO-GUIA-DESPACHO	02	FUERA DE FECHA
23	06    	ANULADO         02	ESTADO-GUIA-DESPACHO	02	FUERA DE FECHA
24	99    	INCONSISTENTE	02	ESTADO-GUIA-DESPACHO	02	FUERA DE FECHA
*/

--Segundo: DESPACHO
UPDATE fac_guia SET num_gui_def = 1
WHERE key_estado_guia = 11
GO
UPDATE fac_guia SET num_gui_dff = 1
WHERE key_estado_guia = 18

--Tercero RUTA
UPDATE fac_guia SET num_gui_ref = 1
WHERE key_estado_guia = 12
GO
UPDATE fac_guia SET num_gui_rff = 1
WHERE key_estado_guia = 19

--CUARTO CERRADO
UPDATE fac_guia SET num_gui_cef = 1
WHERE key_estado_guia = 13
GO
UPDATE fac_guia SET num_gui_cff = 1
WHERE key_estado_guia = 20

--Quinto GENERADO
UPDATE fac_guia SET num_gui_gef = 1
WHERE key_estado_guia = 14
GO
UPDATE fac_guia SET num_gui_gff = 1
WHERE key_estado_guia = 21

--Sexto PAGADO
UPDATE fac_guia SET num_gui_pef = 1
WHERE key_estado_guia = 15
GO
UPDATE fac_guia SET num_gui_pff = 1
WHERE key_estado_guia = 22

--Setimo ANULADO
UPDATE fac_guia SET num_gui_anulados = 1
WHERE key_estado_guia = 16 OR key_estado_guia = 23
GO
UPDATE fac_guia SET num_gui_incosistentes = 1
WHERE key_estado_guia = 17 OR key_estado_guia = 24


-- Octavo INCONSISTENTES
UPDATE fac_guia SET num_gui_incosistentes = 0
WHERE num_gui_incosistentes is null


-- Noveno Total de guias
UPDATE fac_guia SET num_guias = 1
WHERE num_guias is null

SELECT 
num_gui_def+ 
num_gui_dff+  
num_gui_ref+  
num_gui_rff+  
num_gui_cef+  
num_gui_cff+  
num_gui_gef+
num_gui_gff+
num_gui_pef+
num_gui_pff+
num_gui_anulados+
num_gui_incosistentes from fac_guia
