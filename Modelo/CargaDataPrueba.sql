INSERT INTO dim_cliente(cliente_area_key, cliente_key, cliente_desc_tip_doc, cliente_num_tip_doc, cliente_desc, cliente_area_desc)
VALUES(1, 1, '01', '42790561', 'Cliente 01', 'Ventas');
INSERT INTO dim_cliente(cliente_area_key, cliente_key, cliente_desc_tip_doc, cliente_num_tip_doc, cliente_desc, cliente_area_desc)
VALUES(2, 1, '01', '42790561', 'Cliente 01', 'Marketing');
INSERT INTO dim_cliente(cliente_area_key, cliente_key, cliente_desc_tip_doc, cliente_num_tip_doc, cliente_desc, cliente_area_desc)
VALUES(3, 1, '01', '42790561', 'Cliente 01', 'Cobranzas');

INSERT INTO fact_cotizacion(cotizacion_key, cotizacion_key_cliente_area, cotizacion_key_servicio, cotizacion_key_fec_apro, cotizacion_key_fec_ini, cotizacion_key_fec_fin, cotizacion_cnt_ord_total, cotizacion_cnt_ord_en_trab, cotizacion_cnt_ord_cer, cotizacion_cnt_ord_catiempo, cotizacion_cnt_ord_cftiempo, cotizacion_cnt_ord_fac, cotizacion_cnt_ord_can, cotizacion_mon_importe, cotizacion_mon_igv, cotizacion_mon_total)
VALUES(1, 1, 1, 1, 2, 3, 1, 2, 3, 4, 5, 6, 7, 100, 200, 300);
INSERT INTO fact_cotizacion(cotizacion_key, cotizacion_key_cliente_area, cotizacion_key_servicio, cotizacion_key_fec_apro, cotizacion_key_fec_ini, cotizacion_key_fec_fin, cotizacion_cnt_ord_total, cotizacion_cnt_ord_en_trab, cotizacion_cnt_ord_cer, cotizacion_cnt_ord_catiempo, cotizacion_cnt_ord_cftiempo, cotizacion_cnt_ord_fac, cotizacion_cnt_ord_can, cotizacion_mon_importe, cotizacion_mon_igv, cotizacion_mon_total)
VALUES(2, 1, 1, 1, 2, 3, 1, 2, 3, 4, 5, 6, 7, 100, 200, 300);
INSERT INTO fact_cotizacion(cotizacion_key, cotizacion_key_cliente_area, cotizacion_key_servicio, cotizacion_key_fec_apro, cotizacion_key_fec_ini, cotizacion_key_fec_fin, cotizacion_cnt_ord_total, cotizacion_cnt_ord_en_trab, cotizacion_cnt_ord_cer, cotizacion_cnt_ord_catiempo, cotizacion_cnt_ord_cftiempo, cotizacion_cnt_ord_fac, cotizacion_cnt_ord_can, cotizacion_mon_importe, cotizacion_mon_igv, cotizacion_mon_total)
VALUES(3, 1, 1, 1, 2, 3, 1, 2, 3, 4, 5, 6, 7, 100, 200, 300);

INSERT INTO dim_servicio(servicio_key, servicio_cod, servicio_cod_ambito, servicio_desc_ambito, servicio_cod_negocio, servicio_desc_negocio, servicio_desc)
VALUES(1, '0003', 2444, 'LOCAL', 61, 'MENSAJERIA', 'CORREO 1 DIA');
INSERT INTO dim_servicio(servicio_key, servicio_cod, servicio_cod_ambito, servicio_desc_ambito, servicio_cod_negocio, servicio_desc_negocio, servicio_desc)
VALUES(2, '0003', 2444, 'LOCAL', 61, 'MENSAJERIA', 'CORREO 2 DIAS');