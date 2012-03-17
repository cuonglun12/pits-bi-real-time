/*

drop index IDX_PARAM_02;

drop index IDX_PARAM_01;

drop index IDX_PARAM_00;

drop table T_PARAMETRO;

*/

/*==============================================================*/
/* Table: T_PARAMETRO                                           */
/*==============================================================*/
create table T_PARAMETRO (
   PARAM_ID             SERIAL               not null,
   PARAM_COD_TIP        INT4                 not null default 0,
   PARAM_COD            VARCHAR(10)          not null default '-',
   PARAM_DES            VARCHAR(250)         not null default '-',
   PARAM_REF            INT4                 not null default 0,
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_PARAMETRO primary key (PARAM_ID)
);

comment on column T_PARAMETRO.PARAM_COD_TIP is
'1: Tipo area cliente
2: Estado de cargo despacho
3: Estado de cargo despacho verificacion 
4: Motivo de cargo despacho
5: Estado de cargo
6: Motivo de cargo
7: Tipo de ingreso cargo
8: Categoria de cliente
9: Tipo de cliente
10: Tipo de credito
11: Tipo de documento de trabajo
12: Tipo de facturacion
13: Tipo de ambito
14: Estado de cotizacion
15: Tipo de negocio
16: Tipo de servicio
17: Tipo de documento (ruc, dni, guia, factura, etc)
18: Estado de despacho
19: Estado de despacho verificacion
20: Tipo de despacho
21: Tipo de ruta
22: Categoria de empleado
23: Estado de orden
24: Tipo de ingreso
25: Tipo de moneda
26: Tipo de pago
27: Tipo de reparto
28: Tipo de producto
29: Tipo de sede
30: Pais
31: Departamento
32: Provincia
33: Distrito
';

/*==============================================================*/
/* Index: IDX_PARAM_00                                          */
/*==============================================================*/
create  index IDX_PARAM_00 on T_PARAMETRO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_PARAM_01                                          */
/*==============================================================*/
create unique index IDX_PARAM_01 on T_PARAMETRO (
PARAM_COD_TIP,
PARAM_COD
);

/*==============================================================*/
/* Index: IDX_PARAM_02                                          */
/*==============================================================*/
create  index IDX_PARAM_02 on T_PARAMETRO (
PARAM_REF
);





INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1, 1, '0', 'CENTRAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2, 1, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(3, 2, '01', 'DIGITADO            ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(4, 2, '03', 'RUTA                ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(5, 2, '04', 'ENTREGADO           ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(6, 2, '05', 'MOTIVADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(7, 2, '06', 'REENVIADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(8, 2, '07', 'FUERA DE ZONA       ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(9, 2, '08', 'PERDIDO             ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(10, 2, '09', 'ANULADO             ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(11, 2, '10', 'NO DISTRIBUIDO      ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(12, 2, '11', 'RETENIDO  ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(13, 2, '12', 'SIN FISICO          ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(14, 2, '13', 'PROVINCIA           ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(15, 2, '14', 'SUPERVISION         ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(16, 2, '15', 'ROBADO     ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(17, 2, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(18, 3, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(19, 4, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(20, 5, '01', 'DIGITADO            ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(21, 5, '02', 'CLASIFICADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(22, 5, '03', 'RUTA                ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(23, 5, '04', 'ENTREGADO           ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(24, 5, '05', 'MOTIVADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(25, 5, '06', 'REENVIADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(26, 5, '07', 'FUERA DE ZONA       ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(27, 5, '08', 'PERDIDO             ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(28, 5, '09', 'ANULADO             ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(29, 5, '10', 'NO DISTRIBUIDO      ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(30, 5, '11', 'RETENIDO  ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(31, 5, '12', 'SIN FISICO          ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(32, 5, '13', 'PROVINCIA           ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(33, 5, '14', 'SUPERVISION         ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(34, 5, '15', 'ROBADO     ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(35, 5, '16', 'SI LLEGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(36, 5, '17', 'RECEPCIONADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(37, 5, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(38, 6, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(39, 7, '01', 'DIGITADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(40, 7, '02', 'TRANSFERIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(41, 7, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(42, 8, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(43, 9, 'J', 'JURIDICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(44, 9, 'N', 'NATURAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(45, 9, 'E', 'E', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(46, 9, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(47, 10, 'C', 'CREDITO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(48, 10, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(49, 11, '01', 'GUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(50, 11, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(51, 12, 'F', 'FACTURACION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(52, 12, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(53, 13, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(54, 14, '1', 'NORMAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(55, 14, '2', 'PLANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(56, 14, '3', 'VALIJAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(57, 14, '4', 'UBIGEOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(58, 14, '5', 'RANGOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(59, 14, '6', 'GIRO RECOJO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(60, 14, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(61, 15, '01', 'MENSAJERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(62, 15, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(63, 16, '0003', 'CORREO 1 DIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(64, 16, '0004', 'CORREO 2 DIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(65, 16, '0005', 'CORREO 3 DIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(66, 16, '0010', 'EXPRESS 2-5 DIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(67, 16, '0011', 'ECON. EXP. 15 - 30 DIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(68, 16, '0012', 'CORREO 15 -30 DIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(69, 16, '0013', 'CORREO 4 DIAS A MAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(70, 16, '0014', 'VOLANTEO PERSONALIZADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(71, 16, '0020', 'VOLANTEO SIMPLE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(72, 16, '0006', 'CORREO 4 DIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(73, 16, '0009', 'CORREO 5 DIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(74, 16, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(75, 17, '01', 'RUC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(76, 17, '02', 'DNI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(77, 17, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(78, 18, '01', 'DESPACHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(79, 18, '02', 'RUTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(80, 18, '03', 'CERRADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(81, 18, '04', 'GENERADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(82, 18, '05', 'PAGADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(83, 18, '06', 'ANULADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(84, 18, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(85, 19, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(86, 20, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(87, 21, '01', 'MENSAJERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(88, 21, '11', 'COURIER', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(89, 21, '12', 'RECOJO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(90, 21, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(91, 22, '01', 'MENSAJERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(92, 22, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(93, 23, '00', 'GENERADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(94, 23, '01', 'PENDIENTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(95, 23, '02', 'ANULADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(96, 23, '03', 'CERRADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(97, 23, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(98, 24, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(99, 25, 'S', 'NUEVO SOL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(100, 25, 'D', 'DOLAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(101, 25, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(102, 26, '1', 'CREDITO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(103, 26, '2', 'CONTADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(104, 26, '3', 'CUOTAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(105, 26, '4', 'PREPAID', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(106, 26, '5', 'COLLECT', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(107, 26, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(108, 27, '01', 'NO BAJO PUERTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(109, 27, '02', 'BAJO PUERTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(110, 27, '03', 'PORCENAJE DE BAJO PUERTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(111, 27, '04', 'VOLANTEO SIN CARGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(112, 27, '05', 'SIN VALOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(113, 27, '06', '3 DIAS BAJO PUERTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(114, 27, '07', '4 DIAS BAJO PUERTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(115, 27, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(116, 28, 'M', 'MUESTRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(117, 28, 'D', 'DOCUMENTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(118, 28, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(119, 29, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(120, 30, 'AD', 'ANDORRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(121, 30, 'AE', 'UNITED ARAB EMIRATES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(122, 30, 'AF', 'AFGHANISTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(123, 30, 'AG', 'ANTIGUA AND BARBUDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(124, 30, 'AI', 'ANGUILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(125, 30, 'AL', 'ALBANIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(126, 30, 'AM', 'ARMENIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(127, 30, 'AN', 'NETHERLANDS ANTILLES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(128, 30, 'AO', 'ANGOLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(129, 30, 'AQ', 'ANTARCTICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(130, 30, 'AR', 'ARGENTINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(131, 30, 'AS', 'AMERICAN SAMOA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(132, 30, 'AT', 'AUSTRIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(133, 30, 'AU', 'AUSTRALIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(134, 30, 'AW', 'ARUBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(135, 30, 'AZ', 'AZERBAIJAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(136, 30, 'BA', 'BOSNIA AND HERZEGOVINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(137, 30, 'BB', 'BARBADOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(138, 30, 'BD', 'BANGLADESH', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(139, 30, 'BE', 'BELGIUM', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(140, 30, 'BF', 'BURKINA FASO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(141, 30, 'BG', 'BULGARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(142, 30, 'BH', 'BAHRAIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(143, 30, 'BI', 'BURUNDI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(144, 30, 'BJ', 'BENIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(145, 30, 'BM', 'BERMUDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(146, 30, 'BN', 'BRUNEI DARUSSALAM', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(147, 30, 'BO', 'BOLIVIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(148, 30, 'BR', 'BRAZIL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(149, 30, 'BS', 'BAHAMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(150, 30, 'BT', 'BHUTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(151, 30, 'BV', 'BOUVET ISLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(152, 30, 'BW', 'BOTSWANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(153, 30, 'BY', 'BELARUS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(154, 30, 'BZ', 'BELIZE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(155, 30, 'CA', 'CANADA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(156, 30, 'CC', 'COCOS (KEELING) ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(157, 30, 'CF', 'CENTRAL AFRICAN REPUBLIC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(158, 30, 'CG', 'CONGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(159, 30, 'CH', 'SWITZERLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(160, 30, 'CI', 'COTE D''IVOIRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(161, 30, 'CK', 'COOK ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(162, 30, 'CL', 'CHILE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(163, 30, 'CM', 'CAMEROON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(164, 30, 'CN', 'CHINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(165, 30, 'CO', 'COLOMBIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(166, 30, 'CR', 'COSTA RICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(167, 30, 'CS', 'SERBIA AND MONTENEGRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(168, 30, 'CU', 'CUBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(169, 30, 'CV', 'CAPE VERDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(170, 30, 'CX', 'CHRISTMAS ISLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(171, 30, 'CY', 'CYPRUS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(172, 30, 'CZ', 'CZECH REPUBLIC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(173, 30, 'DE', 'GERMANY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(174, 30, 'DJ', 'DJIBOUTI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(175, 30, 'DK', 'DENMARK', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(176, 30, 'DM', 'DOMINICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(177, 30, 'DO', 'DOMINICAN REPUBLIC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(178, 30, 'DZ', 'ALGERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(179, 30, 'EC', 'ECUADOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(180, 30, 'EE', 'ESTONIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(181, 30, 'EG', 'EGYPT', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(182, 30, 'EH', 'WESTERN SAHARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(183, 30, 'ER', 'ERITREA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(184, 30, 'ES', 'SPAIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(185, 30, 'ET', 'ETHIOPIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(186, 30, 'FI', 'FINLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(187, 30, 'FJ', 'FIJI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(188, 30, 'FK', 'FALKLAND ISLANDS (MALVINAS)', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(189, 30, 'FM', 'MICRONESIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(190, 30, 'FO', 'FAROE ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(191, 30, 'FR', 'FRANCE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(192, 30, 'TZ', 'TANZANIA, UNITED REPUBLIC OF', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(193, 30, 'GA', 'GABON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(194, 30, 'GB', 'UNITED KINGDOM', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(195, 30, 'GD', 'GRENADA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(196, 30, 'GE', 'GEORGIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(197, 30, 'GF', 'FRENCH GUIANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(198, 30, 'GH', 'GHANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(199, 30, 'GI', 'GIBRALTAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(200, 30, 'GL', 'GREENLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(201, 30, 'GM', 'GAMBIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(202, 30, 'GN', 'GUINEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(203, 30, 'GP', 'GUADELOUPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(204, 30, 'GQ', 'EQUATORIAL GUINEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(205, 30, 'GR', 'GREECE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(206, 30, 'GS', 'SOUTH GEORGIA AND THE SOUTH S', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(207, 30, 'GT', 'GUATEMALA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(208, 30, 'GU', 'GUAM', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(209, 30, 'GW', 'GUINEA-BISSAU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(210, 30, 'GY', 'GUYANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(211, 30, 'HK', 'HONG KONG', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(212, 30, 'HM', 'HEARD AND MC DONALD ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(213, 30, 'HN', 'HONDURAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(214, 30, 'HR', 'CROATIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(215, 30, 'HT', 'HAITI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(216, 30, 'HU', 'HUNGARY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(217, 30, 'ID', 'INDONESIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(218, 30, 'IE', 'IRELAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(219, 30, 'IL', 'ISRAEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(220, 30, 'IN', 'INDIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(221, 30, 'IO', 'BRITISH INDIAN OCEAN TERRITOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(222, 30, 'IQ', 'IRAQ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(223, 30, 'IR', 'IRAN (ISLAMIC REPUBLIC OF)', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(224, 30, 'IS', 'ICELAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(225, 30, 'IT', 'ITALY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(226, 30, 'JM', 'JAMAICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(227, 30, 'JO', 'JORDAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(228, 30, 'JP', 'JAPAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(229, 30, 'KE', 'KENYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(230, 30, 'KG', 'KYRGYSTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(231, 30, 'KH', 'CAMBODIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(232, 30, 'KI', 'KIRIBATI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(233, 30, 'KM', 'COMOROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(234, 30, 'KN', 'SAINT KITTS AND NEVIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(235, 30, 'KP', 'KOREA, DEMOCRATIC PEOPLE''S RE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(236, 30, 'KR', 'KOREA, REPUBLIC OF', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(237, 30, 'KW', 'KUWAIT', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(238, 30, 'KY', 'CAYMAN ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(239, 30, 'KZ', 'KAZAKHSTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(240, 30, 'LA', 'LAO PEOPLE''S DEMOCRATIC REPUB', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(241, 30, 'LB', 'LEBANON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(242, 30, 'LC', 'SAINT LUCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(243, 30, 'LI', 'LIECHTENSTEIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(244, 30, 'LK', 'SRI LANKA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(245, 30, 'LR', 'LIBERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(246, 30, 'LS', 'LESOTHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(247, 30, 'LT', 'LITHUANIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(248, 30, 'LU', 'LUXEMBOURG', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(249, 30, 'LV', 'LATVIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(250, 30, 'LY', 'LIBYAN ARAB JAMAHIRIYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(251, 30, 'MA', 'MOROCCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(252, 30, 'MC', 'MONACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(253, 30, 'MD', 'MOLDOVA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(254, 30, 'MG', 'MADAGASCAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(255, 30, 'MH', 'MARSHALL ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(256, 30, 'MK', 'MACEDONIA F.Y.R.', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(257, 30, 'ML', 'MALI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(258, 30, 'MM', 'MYANMAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(259, 30, 'MN', 'MONGOLIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(260, 30, 'MO', 'MACAU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(261, 30, 'MP', 'NORTHERN MARIANA ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(262, 30, 'MQ', 'MARTINIQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(263, 30, 'MR', 'MAURITANIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(264, 30, 'MS', 'MONTSERRAT', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(265, 30, 'MT', 'MALTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(266, 30, 'MU', 'MAURITIUS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(267, 30, 'MV', 'MALDIVES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(268, 30, 'MW', 'MALAWI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(269, 30, 'MX', 'MEXICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(270, 30, 'MY', 'MALAYSIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(271, 30, 'MZ', 'MOZAMBIQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(272, 30, 'NA', 'NAMIBIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(273, 30, 'NC', 'NEW CALEDONIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(274, 30, 'NE', 'NIGER', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(275, 30, 'NF', 'NORFOLK ISLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(276, 30, 'NG', 'NIGERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(277, 30, 'NI', 'NICARAGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(278, 30, 'NL', 'NETHERLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(279, 30, 'NO', 'NORWAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(280, 30, 'NP', 'NEPAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(281, 30, 'NR', 'NAURU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(282, 30, 'NT', 'NEUTRAL ZONE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(283, 30, 'NU', 'NIUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(284, 30, 'NZ', 'NEW ZEALAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(285, 30, 'OM', 'OMAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(286, 30, 'PA', 'PANAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(287, 30, 'PE', 'PERU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(288, 30, 'PF', 'FRENCH POLYNESIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(289, 30, 'PG', 'PAPUA NEW GUINEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(290, 30, 'PH', 'PHILIPPINES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(291, 30, 'PK', 'PAKISTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(292, 30, 'PL', 'POLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(293, 30, 'PM', 'SAINT PIERRE AND MIQUELON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(294, 30, 'PN', 'PITCAIRN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(295, 30, 'PR', 'PUERTO RICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(296, 30, 'PT', 'PORTUGAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(297, 30, 'PW', 'PALAU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(298, 30, 'PY', 'PARAGUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(299, 30, 'QA', 'QATAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(300, 30, 'RE', 'REUNION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(301, 30, 'RO', 'ROMANIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(302, 30, 'RU', 'RUSSIAN FEDERATION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(303, 30, 'RW', 'RWANDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(304, 30, 'SA', 'SAUDI ARABIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(305, 30, 'SB', 'SOLOMON ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(306, 30, 'SC', 'SEYCHELLES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(307, 30, 'SD', 'SUDAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(308, 30, 'SE', 'SWEDEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(309, 30, 'SG', 'SINGAPORE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(310, 30, 'SH', 'SAINT HELENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(311, 30, 'SI', 'SLOVENIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(312, 30, 'SJ', 'SVALBARD AND JAN MAYEN ISLAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(313, 30, 'SK', 'SLOVAKIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(314, 30, 'SL', 'SIERRA LEONE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(315, 30, 'SM', 'SAN MARINO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(316, 30, 'SN', 'SENEGAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(317, 30, 'SO', 'SOMALIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(318, 30, 'SR', 'SURINAME', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(319, 30, 'ST', 'SAO TOME AND PRINCIPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(320, 30, 'SV', 'EL SALVADOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(321, 30, 'SY', 'SYRIAN ARAB REPUBLIC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(322, 30, 'SZ', 'SWAZILAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(323, 30, 'TC', 'TURKS AND CAICOS ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(324, 30, 'TD', 'CHAD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(325, 30, 'TF', 'FRENCH SOUTHERN TERRITORIES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(326, 30, 'TG', 'TOGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(327, 30, 'TH', 'THAILAND', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(328, 30, 'TJ', 'TAJIKISTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(329, 30, 'TK', 'TOKELAU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(330, 30, 'TM', 'TURKMENISTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(331, 30, 'TN', 'TUNISIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(332, 30, 'TO', 'TONGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(333, 30, 'TP', 'EAST TIMOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(334, 30, 'TR', 'TURKEY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(335, 30, 'TT', 'TRINIDAD AND TOBAGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(336, 30, 'TV', 'TUVALU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(337, 30, 'TW', 'TAIWAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(338, 30, 'UA', 'UKRAINE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(339, 30, 'UG', 'UGANDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(340, 30, 'UM', 'UNITED STATES MINOR OUTLYING', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(341, 30, 'US', 'UNITED STATES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(342, 30, 'UY', 'URUGUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(343, 30, 'UZ', 'UZBEKISTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(344, 30, 'VA', 'VATICAN CITY STATE (HOLY SEE)', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(345, 30, 'VC', 'SAINT VINCENT AND THE GRENADI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(346, 30, 'VE', 'VENEZUELA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(347, 30, 'VG', 'VIRGIN ISLANDS (BRITISH)', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(348, 30, 'VI', 'VIRGIN ISLANDS (U.S.)', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(349, 30, 'VN', 'VIET NAM', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(350, 30, 'VU', 'VANUATU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(351, 30, 'WF', 'WALLIS AND FUTUNA ISLANDS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(352, 30, 'WS', 'SAMOA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(353, 30, 'XZ', 'INTERNACIONAL ZONE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(354, 30, 'YE', 'YEMEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(355, 30, 'YT', 'MAYOTTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(356, 30, 'YU', 'YUGOSLAVIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(357, 30, 'ZA', 'SOUTH AFRICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(358, 30, 'ZM', 'ZAMBIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(359, 30, 'ZR', 'ZAIRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(360, 30, 'ZW', 'ZIMBABWE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(361, 30, '1A', 'CHECOSLOVAQUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(362, 30, '1B', 'ZONAS FRANCAS DEL PERU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(363, 30, '1C', 'PAISES_NO_PREC.EN OP.ABAST.CO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(364, 30, '1D', 'AGUAS INTERNACIONALES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(365, 30, '1E', 'NO DECLARADOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(366, 30, '1F', 'GAZA Y JERICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(367, 30, '1G', 'ESCOCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(368, 30, '1H', 'URSS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(369, 30, '1I', 'VIETNAM (DEL NORTE)', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(370, 30, '1J', 'COMUNIDAD ECONOMICA EUROPEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(371, 30, '1K', 'COSTA DE MARFIL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(372, 30, '1L', 'ZONA DEL CANAL DE PANAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(373, 30, '1M', 'ALEMANIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(374, 30, '1N', 'CANAL (NORMANDAS), ISLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(375, 30, '1O', 'CANTON Y ENDERBURRY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(376, 30, '1P', 'HONDURAS BRITANICAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(377, 30, '1Q', 'JONSTON, ISLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(378, 30, '1R', 'MACEDONIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(379, 30, '1S', 'MIDWAY, ISLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(380, 30, '1T', 'PACIFICO, ISLAS DEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(381, 30, '1U', 'REPUBLICA ARABE UNIDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(382, 30, '1V', 'WAKE, ISLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(383, 30, '1W', 'TERRITORIO AUTONOMO DE PALEST', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(384, 30, '99', 'TODOS LOS PAISES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(385, 30, 'FX', 'FRANCE, METROPOLITAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(386, 30, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(387, 31, '01', 'AMAZONAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(388, 31, '02', 'ANCASH', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(389, 31, '03', 'APURIMAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(390, 31, '04', 'AREQUIPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(391, 31, '05', 'AYACUCHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(392, 31, '06', 'CAJAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(393, 31, '07', 'CALLAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(394, 31, '08', 'CUSCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(395, 31, '09', 'HUANCAVELICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(396, 31, '10', 'HUANUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(397, 31, '11', 'ICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(398, 31, '12', 'JUNIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(399, 31, '13', 'LA LIBERTAD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(400, 31, '14', 'LAMBAYEQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(401, 31, '15', 'LIMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(402, 31, '16', 'LORETO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(403, 31, '17', 'MADRE DE DIOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(404, 31, '18', 'MOQUEGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(405, 31, '19', 'PASCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(406, 31, '20', 'PIURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(407, 31, '21', 'PUNO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(408, 31, '22', 'SAN MARTIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(409, 31, '23', 'TACNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(410, 31, '24', 'TUMBES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(411, 31, '25', 'UCAYALI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(412, 31, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(413, 32, '0101', 'CHACHAPOYAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(414, 32, '0102', 'BAGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(415, 32, '0103', 'BONGARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(416, 32, '0104', 'CONDORCANQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(417, 32, '0105', 'LUYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(418, 32, '0106', 'RODRIGUEZ DE MENDOZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(419, 32, '0107', 'UTCUBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(420, 32, '0201', 'HUARAZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(421, 32, '0202', 'AIJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(422, 32, '0203', 'ANTONIO RAYMONDI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(423, 32, '0204', 'ASUNCION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(424, 32, '0205', 'BOLOGNESI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(425, 32, '0206', 'CARHUAZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(426, 32, '0207', 'CARLOS FERMIN FITZCARRALD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(427, 32, '0208', 'CASMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(428, 32, '0209', 'CORONGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(429, 32, '0210', 'HUARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(430, 32, '0211', 'HUARMEY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(431, 32, '0212', 'HUAYLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(432, 32, '0213', 'MARISCAL LUZURIAGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(433, 32, '0214', 'OCROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(434, 32, '0215', 'PALLASCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(435, 32, '0216', 'POMABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(436, 32, '0217', 'RECUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(437, 32, '0218', 'SANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(438, 32, '0219', 'SIHUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(439, 32, '0220', 'YUNGAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(440, 32, '0301', 'ABANCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(441, 32, '0302', 'ANDAHUAYLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(442, 32, '0303', 'ANTABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(443, 32, '0304', 'AYMARAES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(444, 32, '0305', 'COTABAMBAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(445, 32, '0306', 'CHINCHEROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(446, 32, '0307', 'GRAU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(447, 32, '0401', 'AREQUIPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(448, 32, '0402', 'CAMANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(449, 32, '0403', 'CARAVELI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(450, 32, '0404', 'CASTILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(451, 32, '0405', 'CAYLLOMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(452, 32, '0406', 'CONDESUYOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(453, 32, '0407', 'ISLAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(454, 32, '0408', 'LA UNION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(455, 32, '0501', 'HUAMANGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(456, 32, '0502', 'CANGALLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(457, 32, '0503', 'HUANCA SANCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(458, 32, '0504', 'HUANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(459, 32, '0505', 'LA MAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(460, 32, '0506', 'LUCANAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(461, 32, '0507', 'PARINACOCHAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(462, 32, '0508', 'PAUCAR DEL SARA SARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(463, 32, '0509', 'SUCRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(464, 32, '0510', 'VICTOR FAJARDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(465, 32, '0511', 'VILCAS HUAMAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(466, 32, '0601', 'CAJAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(467, 32, '0602', 'CAJABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(468, 32, '0603', 'CELENDIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(469, 32, '0604', 'CHOTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(470, 32, '0605', 'CONTUMAZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(471, 32, '0606', 'CUTERVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(472, 32, '0607', 'HUALGAYOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(473, 32, '0608', 'JAEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(474, 32, '0609', 'SAN IGNACIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(475, 32, '0610', 'SAN MARCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(476, 32, '0611', 'SAN MIGUEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(477, 32, '0612', 'SAN PABLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(478, 32, '0613', 'SANTA CRUZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(479, 32, '0701', 'CALLAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(480, 32, '0801', 'CUSCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(481, 32, '0802', 'ACOMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(482, 32, '0803', 'ANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(483, 32, '0804', 'CALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(484, 32, '0805', 'CANAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(485, 32, '0806', 'CANCHIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(486, 32, '0807', 'CHUMBIVILCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(487, 32, '0808', 'ESPINAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(488, 32, '0809', 'LA CONVENCION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(489, 32, '0810', 'PARURO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(490, 32, '0811', 'PAUCARTAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(491, 32, '0812', 'QUISPICANCHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(492, 32, '0813', 'URUBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(493, 32, '0901', 'HUANCAVELICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(494, 32, '0902', 'ACOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(495, 32, '0903', 'ANGARAES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(496, 32, '0904', 'CASTROVIRREYNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(497, 32, '0905', 'CHURCAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(498, 32, '0906', 'HUAYTARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(499, 32, '0907', 'TAYACAJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(500, 32, '1001', 'HUANUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(501, 32, '1002', 'AMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(502, 32, '1003', 'DOS DE MAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(503, 32, '1004', 'HUACAYBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(504, 32, '1005', 'HUAMALIES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(505, 32, '1006', 'LEONCIO PRADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(506, 32, '1007', 'MARAÑON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(507, 32, '1008', 'PACHITEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(508, 32, '1009', 'PUERTO INCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(509, 32, '1010', 'LAURICOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(510, 32, '1011', 'YAROWILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(511, 32, '1101', 'ICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(512, 32, '1102', 'CHINCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(513, 32, '1103', 'NAZCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(514, 32, '1104', 'PALPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(515, 32, '1105', 'PISCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(516, 32, '1201', 'HUANCAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(517, 32, '1202', 'CONCEPCION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(518, 32, '1203', 'CHANCHAMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(519, 32, '1204', 'JAUJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(520, 32, '1205', 'JUNIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(521, 32, '1206', 'SATIPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(522, 32, '1207', 'TARMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(523, 32, '1208', 'YAULI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(524, 32, '1209', 'CHUPACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(525, 32, '1301', 'TRUJILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(526, 32, '1302', 'ASCOPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(527, 32, '1303', 'BOLIVAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(528, 32, '1304', 'CHEPEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(529, 32, '1305', 'JULCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(530, 32, '1306', 'OTUZCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(531, 32, '1307', 'PACASMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(532, 32, '1308', 'PATAZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(533, 32, '1309', 'SANCHEZ CARRION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(534, 32, '1310', 'SANTIAGO DE CHUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(535, 32, '1311', 'GRAN CHIMU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(536, 32, '1312', 'VIRU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(537, 32, '1401', 'CHICLAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(538, 32, '1402', 'FERREÑAFE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(539, 32, '1403', 'LAMBAYEQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(540, 32, '1501', 'LIMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(541, 32, '1502', 'BARRANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(542, 32, '1503', 'CAJATAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(543, 32, '1504', 'CANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(544, 32, '1505', 'CAÑETE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(545, 32, '1506', 'HUARAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(546, 32, '1507', 'HUAROCHIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(547, 32, '1508', 'HUAURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(548, 32, '1509', 'OYON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(549, 32, '1510', 'YAUYOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(550, 32, '1601', 'MAYNAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(551, 32, '1602', 'ALTO AMAZONAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(552, 32, '1603', 'LORETO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(553, 32, '1604', 'MARISCAL RAMON CASTILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(554, 32, '1605', 'REQUENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(555, 32, '1606', 'UCAYALI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(556, 32, '1701', 'TAMBOPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(557, 32, '1702', 'MANU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(558, 32, '1703', 'TAHUAMANU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(559, 32, '1801', 'MARISCAL NIETO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(560, 32, '1802', 'GENERAL SANCHEZ CERRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(561, 32, '1803', 'ILO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(562, 32, '1901', 'PASCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(563, 32, '1902', 'DANIEL ALCIDES CARRION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(564, 32, '1903', 'OXAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(565, 32, '2001', 'PIURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(566, 32, '2002', 'AYABACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(567, 32, '2003', 'HUANCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(568, 32, '2004', 'MORROPON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(569, 32, '2005', 'PAITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(570, 32, '2006', 'SULLANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(571, 32, '2007', 'TALARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(572, 32, '2008', 'SECHURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(573, 32, '2101', 'PUNO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(574, 32, '2102', 'AZANGARO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(575, 32, '2103', 'CARABAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(576, 32, '2104', 'CHUCUITO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(577, 32, '2105', 'EL COLLAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(578, 32, '2106', 'HUANCANE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(579, 32, '2107', 'LAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(580, 32, '2108', 'MELGAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(581, 32, '2109', 'MOHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(582, 32, '2110', 'SAN ANTONIO DE PUTINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(583, 32, '2111', 'SAN ROMAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(584, 32, '2112', 'SANDIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(585, 32, '2113', 'YUNGUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(586, 32, '2201', 'MOYOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(587, 32, '2202', 'BELLAVISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(588, 32, '2203', 'EL DORADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(589, 32, '2204', 'HUALLAGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(590, 32, '2205', 'LAMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(591, 32, '2206', 'MARISCAL CACERES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(592, 32, '2207', 'PICOTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(593, 32, '2208', 'RIOJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(594, 32, '2209', 'SAN MARTIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(595, 32, '2210', 'TOCACHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(596, 32, '2301', 'TACNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(597, 32, '2302', 'CANDARAVE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(598, 32, '2303', 'JORGE BASADRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(599, 32, '2304', 'TARATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(600, 32, '2401', 'TUMBES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(601, 32, '2402', 'CONTRALMIRANTE VILLAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(602, 32, '2403', 'ZARUMILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(603, 32, '2501', 'CORONEL PORTILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(604, 32, '2502', 'ATALAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(605, 32, '2503', 'PADRE ABAD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(606, 32, '2504', 'PURUS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(607, 32, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(608, 33, '010101', 'CHACHAPOYAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(609, 33, '010102', 'ASUNCION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(610, 33, '010103', 'BALSAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(611, 33, '010104', 'CHETO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(612, 33, '010105', 'CHILIQUIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(613, 33, '010106', 'CHUQUIBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(614, 33, '010107', 'GRANADA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(615, 33, '010108', 'HUANCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(616, 33, '010109', 'LA JALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(617, 33, '010110', 'LEIMEBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(618, 33, '010111', 'LEVANTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(619, 33, '010112', 'MAGDALENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(620, 33, '010113', 'MARISCAL CASTILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(621, 33, '010114', 'MOLINOPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(622, 33, '010115', 'MONTEVIDEO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(623, 33, '010116', 'OLLEROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(624, 33, '010117', 'QUINJALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(625, 33, '010118', 'SAN FCO. DE DAGUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(626, 33, '010119', 'SAN ISIDRO DE MAINO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(627, 33, '010120', 'SOLOCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(628, 33, '010121', 'SONCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(629, 33, '010201', 'LA PECA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(630, 33, '010202', 'ARAMANGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(631, 33, '010203', 'COPALLIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(632, 33, '010204', 'EL PARCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(633, 33, '010205', 'IMAZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(634, 33, '010301', 'JUMBILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(635, 33, '010302', 'CHISQUILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(636, 33, '010303', 'CHURUJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(637, 33, '010304', 'COROSHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(638, 33, '010305', 'CUISPES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(639, 33, '010306', 'FLORIDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(640, 33, '010307', 'JAZAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(641, 33, '010308', 'RECTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(642, 33, '010309', 'SAN CARLOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(643, 33, '010310', 'SHIPASBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(644, 33, '010311', 'VALERA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(645, 33, '010312', 'YAMBRASBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(646, 33, '010401', 'NIEVA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(647, 33, '010402', 'EL CENEPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(648, 33, '010403', 'RIO SANTIAGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(649, 33, '010501', 'LAMUD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(650, 33, '010502', 'CAMPORREDONDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(651, 33, '010503', 'COCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(652, 33, '010504', 'COLCAMAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(653, 33, '010505', 'CONILA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(654, 33, '010506', 'INGUILPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(655, 33, '010507', 'LONGUITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(656, 33, '010508', 'LONYA CHICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(657, 33, '010509', 'LUYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(658, 33, '010510', 'LUYA VIEJO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(659, 33, '010511', 'MARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(660, 33, '010512', 'OCALLI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(661, 33, '010513', 'OCUMAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(662, 33, '010514', 'PISUQUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(663, 33, '010515', 'PROVIDENCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(664, 33, '010516', 'SAN CRISTOBAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(665, 33, '010517', 'SAN FRANCISCO DEL YESO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(666, 33, '010518', 'SAN JERONIMO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(667, 33, '010519', 'SN JUAN DE LOPECANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(668, 33, '010520', 'SANTA CATALINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(669, 33, '010521', 'SANTO TOMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(670, 33, '010522', 'TINGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(671, 33, '010523', 'TRITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(672, 33, '010601', 'SAN NICOLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(673, 33, '010602', 'CHIRIMOTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(674, 33, '010603', 'COCHAMAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(675, 33, '010604', 'HUAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(676, 33, '010605', 'LIMABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(677, 33, '010606', 'LONGAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(678, 33, '010607', 'MARISCAL BENAVIDES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(679, 33, '010608', 'MILPUC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(680, 33, '010609', 'OMIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(681, 33, '010610', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(682, 33, '010611', 'TOTORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(683, 33, '010612', 'VISTA ALEGRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(684, 33, '010701', 'BAGUA GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(685, 33, '010702', 'CAJARURO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(686, 33, '010703', 'CUMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(687, 33, '010704', 'EL MILAGRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(688, 33, '010705', 'JAMALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(689, 33, '010706', 'LONYA GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(690, 33, '010707', 'YAMON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(691, 33, '020101', 'HUARAZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(692, 33, '020102', 'COCHABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(693, 33, '020103', 'COLCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(694, 33, '020104', 'HUANCHAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(695, 33, '020105', 'INDEPENDENCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(696, 33, '020106', 'JANGAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(697, 33, '020107', 'LA LIBERTAD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(698, 33, '020108', 'OLLEROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(699, 33, '020109', 'PAMPAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(700, 33, '020110', 'PARIACOTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(701, 33, '020111', 'PIRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(702, 33, '020112', 'TARICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(703, 33, '020201', 'AIJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(704, 33, '020202', 'CORIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(705, 33, '020203', 'HUACLLAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(706, 33, '020204', 'LA MERCED', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(707, 33, '020205', 'SUCCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(708, 33, '020301', 'LLAMELLIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(709, 33, '020302', 'ACZO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(710, 33, '020303', 'CHACCHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(711, 33, '020304', 'CHINGAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(712, 33, '020305', 'MIRGAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(713, 33, '020306', 'SAN JUAN DE RONTOY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(714, 33, '020401', 'CHACAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(715, 33, '020402', 'ACOCHACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(716, 33, '020501', 'CHIQUIAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(717, 33, '020502', 'ABELARDO PARDO LEZAMETA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(718, 33, '020503', 'ANTONIO RAYMONDI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(719, 33, '020504', 'AQUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(720, 33, '020505', 'CAJACAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(721, 33, '020506', 'CANIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(722, 33, '020507', 'COLQUIOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(723, 33, '020508', 'HUALLANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(724, 33, '020509', 'HUASTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(725, 33, '020510', 'HUAYLLACAYAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(726, 33, '020511', 'LA PRIMAVERA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(727, 33, '020512', 'MANGAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(728, 33, '020513', 'PACLLON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(729, 33, '020514', 'SAN MIGUEL DE CORPANQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(730, 33, '020515', 'TICLLOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(731, 33, '020601', 'CARHUAZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(732, 33, '020602', 'ACOPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(733, 33, '020603', 'AMASHCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(734, 33, '020604', 'ANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(735, 33, '020605', 'ATAQUERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(736, 33, '020606', 'MARCARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(737, 33, '020607', 'PARIAHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(738, 33, '020608', 'SAN MIGUEL DE ACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(739, 33, '020609', 'SHILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(740, 33, '020610', 'TINCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(741, 33, '020611', 'YUNGAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(742, 33, '020701', 'SAN LUIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(743, 33, '020702', 'SAN NICOLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(744, 33, '020703', 'YAUYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(745, 33, '020801', 'CASMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(746, 33, '020802', 'BUENA VISTA ALTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(747, 33, '020803', 'COMANDANTE NOEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(748, 33, '020804', 'YAUTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(749, 33, '020901', 'CORONGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(750, 33, '020902', 'ACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(751, 33, '020903', 'BAMBAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(752, 33, '020904', 'CUSCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(753, 33, '020905', 'LA PAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(754, 33, '020906', 'YANAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(755, 33, '020907', 'YUPAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(756, 33, '021001', 'HUARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(757, 33, '021002', 'ANRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(758, 33, '021003', 'CAJAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(759, 33, '021004', 'CHAVIN DE HUANTAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(760, 33, '021005', 'HUACACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(761, 33, '021006', 'HUACCHIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(762, 33, '021007', 'HUACHIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(763, 33, '021008', 'HUANTAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(764, 33, '021009', 'MASIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(765, 33, '021010', 'PAUCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(766, 33, '021011', 'PONTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(767, 33, '021012', 'RAHUAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(768, 33, '021013', 'RAPAYAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(769, 33, '021014', 'SAN MARCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(770, 33, '021015', 'SAN PEDRO DE CHANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(771, 33, '021016', 'UCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(772, 33, '021101', 'HUARMEY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(773, 33, '021102', 'COCHAPETI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(774, 33, '021103', 'CULEBRAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(775, 33, '021104', 'HUAYAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(776, 33, '021105', 'MALVAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(777, 33, '021201', 'CARAZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(778, 33, '021202', 'HUALLANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(779, 33, '021203', 'HUATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(780, 33, '021204', 'HUAYLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(781, 33, '021205', 'MATO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(782, 33, '021206', 'PAMPAROMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(783, 33, '021207', 'PUEBLO LIBRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(784, 33, '021208', 'SANTA CRUZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(785, 33, '021209', 'SANTO TORIBIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(786, 33, '021210', 'YURACMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(787, 33, '021301', 'PISCOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(788, 33, '021302', 'CASCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(789, 33, '021303', 'ELEAZAR GUZMAN BARRON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(790, 33, '021304', 'FIDEL OLIVAS ESCUDERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(791, 33, '021305', 'LLAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(792, 33, '021306', 'LLUMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(793, 33, '021307', 'LUCMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(794, 33, '021308', 'MUSGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(795, 33, '021401', 'OCROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(796, 33, '021402', 'ACAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(797, 33, '021403', 'CAJAMARQUILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(798, 33, '021404', 'CARHUAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(799, 33, '021405', 'COCHAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(800, 33, '021406', 'CONGAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(801, 33, '021407', 'LLIPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(802, 33, '021408', 'SAN CRISTOBAL DE RAJAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(803, 33, '021409', 'SAN PEDRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(804, 33, '021410', 'SANTIAGO DE CHILCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(805, 33, '021501', 'CABANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(806, 33, '021502', 'BOLOGNESI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(807, 33, '021503', 'CONCHUCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(808, 33, '021504', 'HUACASCHUQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(809, 33, '021505', 'HUANDOVAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(810, 33, '021506', 'LACABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(811, 33, '021507', 'LLAPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(812, 33, '021508', 'PALLASCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(813, 33, '021509', 'PAMPAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(814, 33, '021510', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(815, 33, '021511', 'TAUCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(816, 33, '021601', 'POMABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(817, 33, '021602', 'HUAYLLAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(818, 33, '021603', 'PAROBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(819, 33, '021604', 'QUINUABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(820, 33, '021701', 'RECUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(821, 33, '021702', 'CATAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(822, 33, '021703', 'COTAPARACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(823, 33, '021704', 'HUAYLLAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(824, 33, '021705', 'LLACLLIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(825, 33, '021706', 'MARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(826, 33, '021707', 'PAMPAS CHICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(827, 33, '021708', 'PARARIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(828, 33, '021709', 'TAPACOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(829, 33, '021710', 'TICAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(830, 33, '021801', 'CHIMBOTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(831, 33, '021802', 'CACERES DEL PERU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(832, 33, '021803', 'COISHCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(833, 33, '021804', 'MACATE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(834, 33, '021805', 'MORO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(835, 33, '021806', 'NEPEÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(836, 33, '021807', 'SAMANCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(837, 33, '021808', 'SANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(838, 33, '021809', 'NUEVO CHIMBOTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(839, 33, '021901', 'SIHUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(840, 33, '021902', 'ACOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(841, 33, '021903', 'ALFONSO UGARTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(842, 33, '021904', 'CASHAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(843, 33, '021905', 'CHINGALPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(844, 33, '021906', 'HUAYLLABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(845, 33, '021907', 'QUICHES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(846, 33, '021908', 'RAGASH', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(847, 33, '021909', 'SAN JUAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(848, 33, '021910', 'SICSIBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(849, 33, '022001', 'YUNGAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(850, 33, '022002', 'CASCAPARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(851, 33, '022003', 'MANCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(852, 33, '022004', 'MATACOTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(853, 33, '022005', 'QUILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(854, 33, '022006', 'RANRAHIRCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(855, 33, '022007', 'SHUPLUY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(856, 33, '022008', 'YANAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(857, 33, '030101', 'ABANCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(858, 33, '030102', 'CHACOCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(859, 33, '030103', 'CIRCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(860, 33, '030104', 'CURAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(861, 33, '030105', 'HUANIPACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(862, 33, '030106', 'LAMBRAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(863, 33, '030107', 'PICHIRHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(864, 33, '030108', 'SAN PEDRO DE CACHORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(865, 33, '030109', 'TAMBURCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(866, 33, '030201', 'ANDAHUAYLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(867, 33, '030202', 'ANDARAPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(868, 33, '030203', 'CHIARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(869, 33, '030204', 'HUANCARAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(870, 33, '030205', 'HUANCARAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(871, 33, '030206', 'HUAYANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(872, 33, '030207', 'KISHUARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(873, 33, '030208', 'PACOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(874, 33, '030209', 'PACUCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(875, 33, '030210', 'PAMPACHIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(876, 33, '030211', 'POMACOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(877, 33, '030212', 'SAN ANTONIO DE CACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(878, 33, '030213', 'SAN JERONIMO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(879, 33, '030214', 'SAN MIGUEL DE CHACCRAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(880, 33, '030215', 'SANTA MARIA DE CHICMO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(881, 33, '030216', 'TALAVERA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(882, 33, '030217', 'TUMAY HUARACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(883, 33, '030218', 'TURPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(884, 33, '030219', 'KAQUIABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(885, 33, '030301', 'ANTABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(886, 33, '030302', 'EL ORO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(887, 33, '030303', 'HUAQUIRCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(888, 33, '030304', 'JUAN ESPINOZA MEDRANO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(889, 33, '030305', 'OROPESA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(890, 33, '030306', 'PACHACONAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(891, 33, '030307', 'SABAINO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(892, 33, '030401', 'CHALHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(893, 33, '030402', 'CAPAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(894, 33, '030403', 'CARAYBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(895, 33, '030404', 'CHAPIMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(896, 33, '030405', 'COLCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(897, 33, '030406', 'COTARUSE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(898, 33, '040206', 'OCOÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(899, 33, '030407', 'HUAYLLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(900, 33, '030408', 'JUSTO APU SAHUARAURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(901, 33, '030409', 'LUCRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(902, 33, '030410', 'POCOHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(903, 33, '030411', 'SAN JUAN DE CHACÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(904, 33, '030412', 'SAÑAYCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(905, 33, '030413', 'SORAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(906, 33, '030414', 'TAPAIRIHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(907, 33, '030415', 'TINTAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(908, 33, '030416', 'TORAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(909, 33, '030417', 'YANACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(910, 33, '030501', 'TAMBOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(911, 33, '030502', 'COTABAMBAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(912, 33, '030503', 'COYLLURQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(913, 33, '030504', 'HAQUIRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(914, 33, '030505', 'MARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(915, 33, '030506', 'CHALLHUAHUACHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(916, 33, '030601', 'CHINCHEROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(917, 33, '030602', 'ANCO_HUALLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(918, 33, '030603', 'COCHARCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(919, 33, '030604', 'HUACCANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(920, 33, '030605', 'OCOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(921, 33, '030606', 'ONGOY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(922, 33, '030607', 'URANMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(923, 33, '030608', 'RANRACANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(924, 33, '030701', 'CHUQUIBAMBILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(925, 33, '030702', 'CURPAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(926, 33, '030703', 'GAMARRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(927, 33, '030704', 'HUAYLLATI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(928, 33, '030705', 'MAMARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(929, 33, '030706', 'MICAELA BASTIDAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(930, 33, '030707', 'PATAYPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(931, 33, '030708', 'PROGRESO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(932, 33, '030709', 'SAN ANTONIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(933, 33, '030710', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(934, 33, '030711', 'TURPAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(935, 33, '030712', 'VILCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(936, 33, '030713', 'VIRUNDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(937, 33, '030714', 'CURASCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(938, 33, '040101', 'AREQUIPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(939, 33, '080608', 'TINTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(940, 33, '040102', 'ALTO SELVA ALEGRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(941, 33, '040103', 'CAYMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(942, 33, '040104', 'CERRO COLORADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(943, 33, '040105', 'CHARACATO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(944, 33, '040106', 'CHIGUATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(945, 33, '040107', 'JACOBO HUNTER', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(946, 33, '040108', 'LA JOYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(947, 33, '040109', 'MARIANO MELGAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(948, 33, '040110', 'MIRAFLORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(949, 33, '040111', 'MOLLEBAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(950, 33, '040112', 'PAUCARPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(951, 33, '040113', 'POCSI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(952, 33, '040114', 'POLOBAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(953, 33, '040115', 'QUEQUEÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(954, 33, '040116', 'SABANDIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(955, 33, '040117', 'SACHACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(956, 33, '040118', 'SAN JUAN DE SIGUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(957, 33, '040119', 'SAN JUAN DE TARUCANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(958, 33, '040120', 'SANTA ISABEL DE SIGUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(959, 33, '040121', 'SANTA RITA DE SIGUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(960, 33, '040122', 'SOCABAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(961, 33, '040123', 'TIABAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(962, 33, '040124', 'UCHUMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(963, 33, '040125', 'VITOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(964, 33, '040126', 'YANAHUARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(965, 33, '040127', 'YARABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(966, 33, '040128', 'YURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(967, 33, '040129', 'JOSE LUIS BUSTAMANTE Y RIVERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(968, 33, '040201', 'CAMANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(969, 33, '040202', 'JOSE MARIA QUIMPER', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(970, 33, '040203', 'MARIANO NICOLAS VALCARCEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(971, 33, '040204', 'MARISCAL CACERES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(972, 33, '040205', 'NICOLAS DE PIEROLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(973, 33, '040207', 'QUILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(974, 33, '040208', 'SAMUEL PASTOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(975, 33, '040301', 'CARAVELI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(976, 33, '040302', 'ACARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(977, 33, '040303', 'ATICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(978, 33, '040304', 'ATIQUIPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(979, 33, '040305', 'BELLA UNION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(980, 33, '040306', 'CAHUACHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(981, 33, '040307', 'CHALA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(982, 33, '040308', 'CHAPARRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(983, 33, '040309', 'HUANUHUANU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(984, 33, '040310', 'JAQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(985, 33, '040311', 'LOMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(986, 33, '040312', 'QUICACHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(987, 33, '040313', 'YAUCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(988, 33, '040401', 'APLAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(989, 33, '040402', 'ANDAGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(990, 33, '040403', 'AYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(991, 33, '040404', 'CHACHAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(992, 33, '040405', 'CHILCAYMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(993, 33, '040406', 'CHOCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(994, 33, '040407', 'HUANCARQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(995, 33, '040408', 'MACHAGUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(996, 33, '040409', 'ORCOPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(997, 33, '040410', 'PAMPACOLCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(998, 33, '040411', 'TIPAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(999, 33, '040412', 'UÑON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1000, 33, '040413', 'URACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1001, 33, '040414', 'VIRACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1002, 33, '040501', 'CHIVAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1003, 33, '040502', 'ACHOMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1004, 33, '040503', 'CABANACONDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1005, 33, '040504', 'CALLALLI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1006, 33, '040505', 'CAYLLOMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1007, 33, '040506', 'COPORAQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1008, 33, '040507', 'HUAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1009, 33, '040508', 'HUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1010, 33, '040509', 'ICHUPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1011, 33, '040510', 'LARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1012, 33, '040511', 'LLUTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1013, 33, '040512', 'MACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1014, 33, '040513', 'MADRIGAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1015, 33, '040514', 'SAN ANTONIO DE CHUCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1016, 33, '040515', 'SIBAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1017, 33, '040516', 'TAPAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1018, 33, '040517', 'TISCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1019, 33, '040518', 'TUTI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1020, 33, '040519', 'YANQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1021, 33, '040520', 'MAJES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1022, 33, '040601', 'CHUQUIBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1023, 33, '040602', 'ANDARAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1024, 33, '040603', 'CAYARANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1025, 33, '040604', 'CHICHAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1026, 33, '040605', 'IRAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1027, 33, '040606', 'RIO GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1028, 33, '040607', 'SALAMANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1029, 33, '040608', 'YANAQUIHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1030, 33, '040701', 'MOLLENDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1031, 33, '040702', 'COCACHACRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1032, 33, '040703', 'DEAN VALDIVIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1033, 33, '040704', 'ISLAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1034, 33, '040705', 'MEJIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1035, 33, '040706', 'PUNTA DE BOMBON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1036, 33, '040801', 'COTAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1037, 33, '040802', 'ALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1038, 33, '040803', 'CHARCANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1039, 33, '040804', 'HUAYNACOTAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1040, 33, '040805', 'PAMPAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1041, 33, '040806', 'PUYCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1042, 33, '040807', 'QUECHUALLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1043, 33, '040808', 'SAYLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1044, 33, '040809', 'TAURIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1045, 33, '040810', 'TOMEPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1046, 33, '040811', 'TORO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1047, 33, '050101', 'AYACUCHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1048, 33, '050102', 'ACOCRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1049, 33, '050103', 'ACOS VINCHOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1050, 33, '050104', 'CARMEN ALTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1051, 33, '050105', 'CHIARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1052, 33, '050106', 'OCROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1053, 33, '050107', 'PACAYCASA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1054, 33, '050108', 'QUINUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1055, 33, '050109', 'SAN JOSE DE TICLLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1056, 33, '050110', 'SAN JUAN BAUTISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1057, 33, '050111', 'SANTIAGO DE PISCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1058, 33, '050112', 'SOCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1059, 33, '050113', 'TAMBILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1060, 33, '050114', 'VINCHOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1061, 33, '050115', 'JESUS NAZARENO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1062, 33, '050201', 'CANGALLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1063, 33, '050202', 'CHUSCHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1064, 33, '050203', 'LOS MOROCHUCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1065, 33, '050204', 'MARIA PARADO DE BELLIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1066, 33, '050205', 'PARAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1067, 33, '050206', 'TOTOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1068, 33, '050301', 'SANCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1069, 33, '050302', 'CARAPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1070, 33, '050303', 'SACSAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1071, 33, '050906', 'MORCOLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1072, 33, '050304', 'SANTIAGO DE LUCANAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1073, 33, '050401', 'HUANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1074, 33, '050402', 'AYAHUANCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1075, 33, '050403', 'HUAMANGUILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1076, 33, '050404', 'IGUAIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1077, 33, '050405', 'LURICOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1078, 33, '050406', 'SANTILLANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1079, 33, '050407', 'SIVIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1080, 33, '050408', 'LLOCHEGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1081, 33, '050501', 'SAN MIGUEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1082, 33, '050502', 'ANCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1083, 33, '050503', 'AYNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1084, 33, '050504', 'CHILCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1085, 33, '050505', 'CHUNGUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1086, 33, '050506', 'LUIS CARRANZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1087, 33, '050507', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1088, 33, '050508', 'TAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1089, 33, '050601', 'PUQUIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1090, 33, '050602', 'AUCARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1091, 33, '050603', 'CABANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1092, 33, '050604', 'CARMEN SALCEDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1093, 33, '050605', 'CHAVIÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1094, 33, '050606', 'CHIPAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1095, 33, '050607', 'HUACÑHUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1096, 33, '050608', 'LARAMATE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1097, 33, '050609', 'LEONCIO PRADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1098, 33, '050610', 'LLAUTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1099, 33, '050611', 'LUCANAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1100, 33, '050612', 'OCAÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1101, 33, '050613', 'OTOCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1102, 33, '050614', 'SAISA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1103, 33, '050615', 'SAN CRISTOBAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1104, 33, '050616', 'SAN JUAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1105, 33, '050617', 'SAN PEDRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1106, 33, '050618', 'SAN PEDRO DE PALCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1107, 33, '050619', 'SANCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1108, 33, '050620', 'SANTA ANA DE HUAYCAHUACHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1109, 33, '050621', 'SANTA LUCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1110, 33, '050701', 'CORACORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1111, 33, '050702', 'CHUMPI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1112, 33, '050703', 'CORONEL CASTAÑEDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1113, 33, '050704', 'PACAPAUSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1114, 33, '050705', 'PULLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1115, 33, '050706', 'PUYUSCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1116, 33, '080601', 'SICUANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1117, 33, '050707', 'SAN FRANCISCO DE RAVACAYCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1118, 33, '050708', 'UPAHUACHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1119, 33, '050801', 'PAUSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1120, 33, '050802', 'COLTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1121, 33, '050803', 'CORCULLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1122, 33, '050804', 'LAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1123, 33, '050805', 'MARCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1124, 33, '050806', 'OYOLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1125, 33, '050807', 'PARARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1126, 33, '050808', 'SAN JAVIER DE ALPABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1127, 33, '050809', 'SAN JOSE DE USHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1128, 33, '050810', 'SARA SARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1129, 33, '050901', 'QUEROBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1130, 33, '050902', 'BELEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1131, 33, '050903', 'CHALCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1132, 33, '050904', 'CHILCAYOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1133, 33, '050905', 'HUACAÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1134, 33, '050907', 'PAICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1135, 33, '050908', 'SAN PEDRO DE LARCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1136, 33, '050909', 'SAN SALVADOR DE QUIJE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1137, 33, '050910', 'SANTIAGO DE PAUCARAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1138, 33, '050911', 'SORAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1139, 33, '051001', 'HUANCAPI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1140, 33, '051002', 'ALCAMENCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1141, 33, '051003', 'APONGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1142, 33, '051004', 'ASQUIPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1143, 33, '150108', 'CHORRILLOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1144, 33, '051006', 'CAYARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1145, 33, '051007', 'COLCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1146, 33, '051008', 'HUAMANQUIQUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1147, 33, '051009', 'HUANCARAYLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1148, 33, '051010', 'HUAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1149, 33, '051011', 'SARHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1150, 33, '051012', 'VILCANCHOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1151, 33, '051101', 'VILCAS HUAMAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1152, 33, '051102', 'ACCOMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1153, 33, '051103', 'CARHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1154, 33, '051104', 'CONCEPCION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1155, 33, '051105', 'HUAMBALPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1156, 33, '051106', 'INDEPENDENCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1157, 33, '051107', 'SAURAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1158, 33, '051108', 'VISCHONGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1159, 33, '060101', 'CAJAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1160, 33, '060102', 'ASUNCION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1161, 33, '060103', 'CHETILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1162, 33, '060104', 'COSPAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1163, 33, '060105', 'ENCAÑADA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1164, 33, '060106', 'JESUS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1165, 33, '060107', 'LLACANORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1166, 33, '060108', 'LOS BAÑOS DEL INCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1167, 33, '060109', 'MAGDALENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1168, 33, '060110', 'MATARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1169, 33, '060111', 'NAMORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1170, 33, '060112', 'SAN JUAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1171, 33, '060201', 'CAJABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1172, 33, '060202', 'CACHACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1173, 33, '060203', 'CONDEBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1174, 33, '060204', 'SITACOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1175, 33, '060301', 'CELENDIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1176, 33, '060302', 'CHUMUCH', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1177, 33, '060303', 'CORTEGANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1178, 33, '060304', 'HUASMIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1179, 33, '060305', 'JORGE CHAVEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1180, 33, '060306', 'JOSE GALVEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1181, 33, '060307', 'MIGUEL IGLESIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1182, 33, '060308', 'OXAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1183, 33, '060309', 'SOROCHUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1184, 33, '060310', 'SUCRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1185, 33, '060311', 'UTCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1186, 33, '060312', 'LA LIBERTAD DE PALLAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1187, 33, '060401', 'CHOTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1188, 33, '060402', 'ANGUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1189, 33, '060403', 'CHADIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1190, 33, '060404', 'CHIGUIRIP', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1191, 33, '060405', 'CHIMBAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1192, 33, '060406', 'CHOROPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1193, 33, '060407', 'COCHABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1194, 33, '060408', 'CONCHAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1195, 33, '060409', 'HUAMBOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1196, 33, '060410', 'LAJAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1197, 33, '060411', 'LLAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1198, 33, '060412', 'MIRACOSTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1199, 33, '060413', 'PACCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1200, 33, '060414', 'PION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1201, 33, '060415', 'QUEROCOTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1202, 33, '060416', 'SAN JUAN DE LICUPIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1203, 33, '060417', 'TACABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1204, 33, '060418', 'TOCMOCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1205, 33, '060419', 'CHALAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1206, 33, '060501', 'CONTUMAZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1207, 33, '060502', 'CHILETE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1208, 33, '060503', 'CUPISNIQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1209, 33, '060504', 'GUZMANGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1210, 33, '060505', 'SAN BENITO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1211, 33, '060506', 'SANTA CRUZ DE TOLED', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1212, 33, '060507', 'TANTARICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1213, 33, '060508', 'YONAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1214, 33, '060601', 'CUTERVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1215, 33, '060602', 'CALLAYUC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1216, 33, '060603', 'CHOROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1217, 33, '060604', 'CUJILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1218, 33, '060605', 'LA RAMADA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1219, 33, '060606', 'PIMPINGOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1220, 33, '060607', 'QUEROCOTILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1221, 33, '060608', 'SAN ANDRES DE CUTERVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1222, 33, '060609', 'SAN JUAN DE CUTERVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1223, 33, '060610', 'SAN LUIS DE LUCMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1224, 33, '060611', 'SANTA CRUZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1225, 33, '060612', 'SANTO DOMINGO DE LA CAPILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1226, 33, '060613', 'SANTO TOMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1227, 33, '060614', 'SOCOTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1228, 33, '060615', 'TORIBIO CASANOVA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1229, 33, '060701', 'BAMBAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1230, 33, '060702', 'CHUGUR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1231, 33, '060703', 'HUALGAYOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1232, 33, '060801', 'JAEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1233, 33, '060802', 'BELLAVISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1234, 33, '060803', 'CHONTALI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1235, 33, '060804', 'COLASAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1236, 33, '060805', 'HUABAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1237, 33, '060806', 'LAS PIRIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1238, 33, '060807', 'POMAHUACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1239, 33, '060808', 'PUCARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1240, 33, '060809', 'SALLIQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1241, 33, '060810', 'SAN FELIPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1242, 33, '060811', 'SAN JOSE DEL ALTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1243, 33, '060812', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1244, 33, '060901', 'SAN IGNACIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1245, 33, '060902', 'CHIRINOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1246, 33, '060903', 'HUARANGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1247, 33, '060904', 'LA COIPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1248, 33, '060905', 'NAMBALLE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1249, 33, '060906', 'SAN JOSE DE LOURDES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1250, 33, '060907', 'TABACONAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1251, 33, '061001', 'PEDRO GALVEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1252, 33, '061002', 'CHANCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1253, 33, '061003', 'EDUARDO VILLANUEVA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1254, 33, '061004', 'GREGORIO PITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1255, 33, '061005', 'ICHOCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1256, 33, '061006', 'JOSE MANUEL QUIROZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1257, 33, '061007', 'JOSE SABOGAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1258, 33, '061101', 'SAN MIGUEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1259, 33, '061102', 'BOLIVAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1260, 33, '061103', 'CALQUIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1261, 33, '061104', 'CATILLUC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1262, 33, '061105', 'EL PRADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1263, 33, '061106', 'LA FLORIDA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1264, 33, '061107', 'LLAPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1265, 33, '061108', 'NANCHOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1266, 33, '061109', 'NIEPOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1267, 33, '061110', 'SAN GREGORIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1268, 33, '061111', 'SAN SILVESTRE DE COCHAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1269, 33, '061112', 'TONGOD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1270, 33, '061113', 'UNION AGUA BLANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1271, 33, '061201', 'SAN PABLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1272, 33, '061202', 'SAN BERNARDINO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1273, 33, '061203', 'SAN LUIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1274, 33, '061204', 'TUMBADEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1275, 33, '061301', 'SANTA CRUZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1276, 33, '061302', 'ANDABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1277, 33, '061303', 'CATACHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1278, 33, '061304', 'CHANCAYBAÑOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1279, 33, '061305', 'LA ESPERANZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1280, 33, '061306', 'NINABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1281, 33, '061307', 'PULAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1282, 33, '061308', 'SAUCEPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1283, 33, '061309', 'SEXI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1284, 33, '061310', 'UTICYACU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1285, 33, '061311', 'YAUYUCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1286, 33, '080101', 'CUSCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1287, 33, '080102', 'CCORCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1288, 33, '080103', 'POROY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1289, 33, '080104', 'SAN JERONIMO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1290, 33, '080105', 'SAN SEBASTIAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1291, 33, '080106', 'SANTIAGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1292, 33, '080107', 'SAYLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1293, 33, '080108', 'WANCHAQ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1294, 33, '080201', 'ACOMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1295, 33, '080202', 'ACOPIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1296, 33, '080203', 'ACOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1297, 33, '070101', 'CALLAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1298, 33, '070104', 'LA PERLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1299, 33, '070105', 'LA PUNTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1300, 33, '070106', 'VENTANILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1301, 33, '080204', 'MOSOC LLACTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1302, 33, '080205', 'POMACANCHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1303, 33, '080206', 'RONDOCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1304, 33, '080207', 'SANGARARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1305, 33, '080301', 'ANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1306, 33, '080302', 'ANCAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1307, 33, '080303', 'CACHIMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1308, 33, '080304', 'CHINCHAYPUJIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1309, 33, '080305', 'HUAROCONDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1310, 33, '080306', 'LIMATAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1311, 33, '080307', 'MOLLEPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1312, 33, '080308', 'PUCYURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1313, 33, '080309', 'ZURITE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1314, 33, '080401', 'CALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1315, 33, '080402', 'COYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1316, 33, '080403', 'LAMAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1317, 33, '080404', 'LARES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1318, 33, '080405', 'PISAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1319, 33, '080406', 'SAN SALVADOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1320, 33, '080407', 'TARAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1321, 33, '080408', 'YANATILE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1322, 33, '080501', 'YANAOCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1323, 33, '080502', 'CHECCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1324, 33, '080503', 'KUNTURKANKI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1325, 33, '080504', 'LANGUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1326, 33, '080505', 'LAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1327, 33, '080506', 'PAMPAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1328, 33, '080507', 'QUEHUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1329, 33, '080508', 'TUPAC AMARU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1330, 33, '080602', 'CHECACUPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1331, 33, '080603', 'COMBAPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1332, 33, '080604', 'MARANGANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1333, 33, '080605', 'PITUMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1334, 33, '080606', 'SAN PABLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1335, 33, '080607', 'SAN PEDRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1336, 33, '080701', 'SANTO TOMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1337, 33, '080702', 'CAPACMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1338, 33, '080703', 'CHAMACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1339, 33, '080704', 'COLQUEMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1340, 33, '080705', 'LIVITACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1341, 33, '080706', 'LLUSCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1342, 33, '080707', 'QUIÑOTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1343, 33, '080708', 'VELILLE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1344, 33, '080801', 'ESPINAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1345, 33, '080802', 'CONDOROMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1346, 33, '080803', 'COPORAQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1347, 33, '080804', 'OCORURO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1348, 33, '080805', 'PALLPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1349, 33, '080806', 'PICHIGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1350, 33, '080807', 'SUYCKUTAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1351, 33, '080808', 'ALTO PICHIGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1352, 33, '080901', 'SANTA ANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1353, 33, '080902', 'ECHARATE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1354, 33, '080903', 'HUAYOPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1355, 33, '080904', 'MARANURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1356, 33, '080905', 'OCOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1357, 33, '080906', 'QUELLOUNO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1358, 33, '080907', 'KIMBIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1359, 33, '080908', 'SANTA TERESA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1360, 33, '080909', 'VILCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1361, 33, '080910', 'PICHARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1362, 33, '081001', 'PARURO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1363, 33, '081002', 'ACCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1364, 33, '081003', 'CCAPI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1365, 33, '081004', 'COLCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1366, 33, '081005', 'HUANOQUITE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1367, 33, '081006', 'OMACHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1368, 33, '081007', 'PACCARITAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1369, 33, '081008', 'PILLPINTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1370, 33, '081009', 'YAURISQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1371, 33, '081101', 'PAUCARTAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1372, 33, '081102', 'CAICAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1373, 33, '081103', 'CHALLABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1374, 33, '081104', 'COLQUEPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1375, 33, '081105', 'HUANCARANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1376, 33, '081106', 'KOSÑIPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1377, 33, '081201', 'URCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1378, 33, '081202', 'ANDAHUAYLILLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1379, 33, '081203', 'CAMANTI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1380, 33, '081204', 'CCARHUAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1381, 33, '081205', 'CCATCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1382, 33, '081206', 'CUSIPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1383, 33, '081207', 'HUARO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1384, 33, '081208', 'LUCRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1385, 33, '081209', 'MARCAPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1386, 33, '081210', 'OCONGATE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1387, 33, '081211', 'OROPESA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1388, 33, '081212', 'QUIQUIJANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1389, 33, '081301', 'URUBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1390, 33, '081302', 'CHINCHERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1391, 33, '081303', 'HUAYLLABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1392, 33, '081304', 'MACHUPICCHU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1393, 33, '081305', 'MARAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1394, 33, '081306', 'OLLANTAYTAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1395, 33, '081307', 'YUCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1396, 33, '090101', 'HUANCAVELICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1397, 33, '090102', 'ACOBAMBILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1398, 33, '090103', 'ACORIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1399, 33, '090104', 'CONAYCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1400, 33, '090105', 'CUENCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1401, 33, '090106', 'HUACHOCOLPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1402, 33, '090107', 'HUAYLLAHUARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1403, 33, '090108', 'IZCUCHACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1404, 33, '090109', 'LARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1405, 33, '090110', 'MANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1406, 33, '090111', 'MARISCAL CACERES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1407, 33, '090112', 'MOYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1408, 33, '090113', 'NUEVO OCCORO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1409, 33, '090114', 'PALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1410, 33, '090115', 'PILCHACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1411, 33, '090116', 'VILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1412, 33, '090117', 'YAULI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1413, 33, '090118', 'ASCENSION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1414, 33, '090119', 'HUANDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1415, 33, '090201', 'ACOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1416, 33, '090202', 'ANDABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1417, 33, '090203', 'ANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1418, 33, '090204', 'CAJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1419, 33, '090205', 'MARCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1420, 33, '090206', 'PAUCARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1421, 33, '090207', 'POMACOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1422, 33, '090208', 'ROSARIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1423, 33, '090301', 'LIRCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1424, 33, '090302', 'ANCHONGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1425, 33, '090303', 'CALLANMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1426, 33, '090304', 'CCOCHACCASA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1427, 33, '090305', 'CHINCHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1428, 33, '090306', 'CONGALLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1429, 33, '090307', 'HUANCAÑHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1430, 33, '090308', 'HUAYLLAY GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1431, 33, '090309', 'JULCAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1432, 33, '090310', 'SAN ANTONIO DE ANTAPARCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1433, 33, '090311', 'SANTO TOMAS DE PATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1434, 33, '090312', 'SECCLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1435, 33, '090401', 'CASTROVIRREYNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1436, 33, '090402', 'ARMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1437, 33, '090403', 'AURAHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1438, 33, '090404', 'CAPILLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1439, 33, '090405', 'CHUPAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1440, 33, '090406', 'COCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1441, 33, '090407', 'HUACHOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1442, 33, '090408', 'HUAMATAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1443, 33, '090409', 'MOLLEPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1444, 33, '090410', 'SAN JUAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1445, 33, '090411', 'SANTA ANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1446, 33, '090412', 'TANTARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1447, 33, '090413', 'TICRAPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1448, 33, '090501', 'CHURCAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1449, 33, '090502', 'ANCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1450, 33, '090503', 'CHINCHIHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1451, 33, '090504', 'EL CARMEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1452, 33, '090505', 'LA MERCED', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1453, 33, '090506', 'LOCROJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1454, 33, '090507', 'PAUCARBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1455, 33, '090508', 'SAN MIGUEL DE MAYOCC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1456, 33, '090509', 'SAN PEDRO DE CORIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1457, 33, '090510', 'PACHAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1458, 33, '090601', 'HUAYTARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1459, 33, '090602', 'AYAVI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1460, 33, '090603', 'CORDOVA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1461, 33, '090604', 'HUAYACUNDO ARMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1462, 33, '090605', 'LARAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1463, 33, '090606', 'OCOYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1464, 33, '090607', 'PILPICHACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1465, 33, '090608', 'QUERCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1466, 33, '090609', 'QUITOÑARMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1467, 33, '090610', 'SAN ANTONIO DE CUSICANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1468, 33, '090611', 'SAN FRANCISCO DE SANGAYAICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1469, 33, '090612', 'SAN ISIDRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1470, 33, '090613', 'SANTIAGO DE CHOCORVOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1471, 33, '090614', 'SANTIAGO DE QUIRAHUARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1472, 33, '090615', 'SANTO DOMINGO DE CAPILLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1473, 33, '090616', 'TAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1474, 33, '090701', 'PAMPAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1475, 33, '090702', 'ACOSTAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1476, 33, '090703', 'ACRAQUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1477, 33, '090704', 'AHUAYCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1478, 33, '090705', 'COLCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1479, 33, '090706', 'DANIEL HERNANDEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1480, 33, '090707', 'HUACHOCOLPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1481, 33, '090709', 'HUARIBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1482, 33, '090710', 'ÑAHUIMPUQUIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1483, 33, '090711', 'PAZOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1484, 33, '090713', 'QUISHUAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1485, 33, '090714', 'SALCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1486, 33, '090715', 'SALCAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1487, 33, '090716', 'SAN MARCOS DE ROCCHAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1488, 33, '090717', 'SURCUBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1489, 33, '090718', 'TINTAY PUNCU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1490, 33, '100101', 'HUANUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1491, 33, '100102', 'AMARILIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1492, 33, '100103', 'CHINCHAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1493, 33, '100104', 'CHURUBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1494, 33, '100105', 'MARGOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1495, 33, '100106', 'QUISQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1496, 33, '100107', 'SAN FRANCISCO DE CAYRAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1497, 33, '100108', 'SAN PEDRO DE CHAULAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1498, 33, '100109', 'SANTA MARIA DEL VALLE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1499, 33, '100110', 'YARUMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1500, 33, '100111', 'PILLCO MARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1501, 33, '100201', 'AMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1502, 33, '100202', 'CAYNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1503, 33, '100203', 'COLPAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1504, 33, '100204', 'CONCHAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1505, 33, '100205', 'HUACAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1506, 33, '100206', 'SAN FRANCISCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1507, 33, '100207', 'SAN RAFAEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1508, 33, '100208', 'TOMAY KICHWA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1509, 33, '100301', 'LA UNION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1510, 33, '100307', 'CHUQUIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1511, 33, '100311', 'MARIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1512, 33, '100313', 'PACHAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1513, 33, '100316', 'QUIVILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1514, 33, '100317', 'RIPAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1515, 33, '100321', 'CHUQUIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1516, 33, '100322', 'SILLAPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1517, 33, '100323', 'YANAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1518, 33, '100401', 'HUACAYBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1519, 33, '100402', 'CANCHABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1520, 33, '100403', 'COCHABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1521, 33, '100404', 'PINRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1522, 33, '100501', 'LLATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1523, 33, '100502', 'ARANCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1524, 33, '100503', 'CHAVIN DE PARIARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1525, 33, '100504', 'JACAS GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1526, 33, '100505', 'JIRCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1527, 33, '100506', 'MIRAFLORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1528, 33, '100507', 'MONZON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1529, 33, '100508', 'PUNCHAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1530, 33, '100509', 'PUÑOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1531, 33, '100510', 'SINGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1532, 33, '100511', 'TANTAMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1533, 33, '100601', 'RUPAÑRUPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1534, 33, '100602', 'DANIEL ALOMIAS ROBLES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1535, 33, '100603', 'HERMILIO VALDIZAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1536, 33, '100604', 'JOSE CRESPO Y CASTILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1537, 33, '100605', 'LUYANDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1538, 33, '120601', 'SATIPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1539, 33, '100606', 'MARIANO DAMASO BERAUN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1540, 33, '100701', 'HUACRACHUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1541, 33, '100702', 'CHOLON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1542, 33, '100703', 'SAN BUENAVENTURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1543, 33, '100801', 'PANAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1544, 33, '100802', 'CHAGLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1545, 33, '100803', 'MOLINO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1546, 33, '100804', 'UMARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1547, 33, '100901', 'PUERTO INCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1548, 33, '100902', 'CODO DEL POZUZO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1549, 33, '100903', 'HONORIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1550, 33, '100904', 'TOURNAVISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1551, 33, '100905', 'YUYAPICHIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1552, 33, '101001', 'JESUS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1553, 33, '101002', 'BAÑOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1554, 33, '101003', 'JIVIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1555, 33, '101004', 'QUEROPALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1556, 33, '101005', 'RONDOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1557, 33, '101006', 'SAN FRANCISCO DE ASIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1558, 33, '101007', 'SAN MIGUEL DE CAURI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1559, 33, '101101', 'CHAVINILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1560, 33, '101102', 'CAHUAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1561, 33, '101103', 'CHACABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1562, 33, '101104', 'APARICIO POMARES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1563, 33, '101105', 'JACAS CHICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1564, 33, '101106', 'OBAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1565, 33, '101107', 'PAMPAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1566, 33, '101108', 'CHORAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1567, 33, '110101', 'ICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1568, 33, '110102', 'LA TINGUIÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1569, 33, '110103', 'LOS AQUIJES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1570, 33, '110104', 'OCUCAJE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1571, 33, '110105', 'PACHACUTEC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1572, 33, '110106', 'PARCONA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1573, 33, '110107', 'PUEBLO NUEVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1574, 33, '110108', 'SALAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1575, 33, '110109', 'SAN JOSE DE LOS MOLINOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1576, 33, '110110', 'SAN JUAN BAUTISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1577, 33, '110111', 'SANTIAGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1578, 33, '110112', 'SUBTANJALLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1579, 33, '110113', 'TATE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1580, 33, '110114', 'YAUCA DEL ROSARIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1581, 33, '110201', 'CHINCHA ALTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1582, 33, '110202', 'ALTO LARAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1583, 33, '110203', 'CHAVIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1584, 33, '110204', 'CHINCHA BAJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1585, 33, '110205', 'EL CARMEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1586, 33, '110206', 'GROCIO PRADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1587, 33, '110207', 'PUEBLO NUEVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1588, 33, '110208', 'SAN JUAN DE YANAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1589, 33, '110209', 'SAN PEDRO DE HUACARPANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1590, 33, '110210', 'SUNAMPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1591, 33, '110211', 'TAMBO DE MORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1592, 33, '110301', 'NAZCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1593, 33, '110302', 'CHANGUILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1594, 33, '110303', 'EL INGENIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1595, 33, '110304', 'MARCONA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1596, 33, '110305', 'VISTA ALEGRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1597, 33, '110401', 'PALPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1598, 33, '110402', 'LLIPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1599, 33, '110403', 'RIO GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1600, 33, '110404', 'SANTA CRUZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1601, 33, '110405', 'TIBILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1602, 33, '110501', 'PISCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1603, 33, '110502', 'HUANCANO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1604, 33, '110503', 'HUMAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1605, 33, '110504', 'INDEPENDENCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1606, 33, '110505', 'PARACAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1607, 33, '110506', 'SAN ANDRES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1608, 33, '110507', 'SAN CLEMENTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1609, 33, '110508', 'TUPAC AMARU INCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1610, 33, '120101', 'HUANCAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1611, 33, '120104', 'CARHUACALLANGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1612, 33, '120105', 'CHACAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1613, 33, '120106', 'CHICCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1614, 33, '120107', 'CHILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1615, 33, '120108', 'CHONGOS ALTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1616, 33, '120111', 'CHUPURO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1617, 33, '120112', 'COLCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1618, 33, '120113', 'CULLHUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1619, 33, '120114', 'EL TAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1620, 33, '120116', 'HUACRAPUQUIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1621, 33, '120117', 'HUALHUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1622, 33, '120119', 'HUANCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1623, 33, '120120', 'HUASICANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1624, 33, '120121', 'HUAYUCACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1625, 33, '120122', 'INGENIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1626, 33, '120124', 'PARIAHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1627, 33, '120125', 'PILCOMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1628, 33, '120126', 'PUCARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1629, 33, '120127', 'QUICHUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1630, 33, '120128', 'QUILCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1631, 33, '120129', 'SAN AGUSTIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1632, 33, '120130', 'SAN JERONIMO DE TUNAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1633, 33, '120132', 'SAÑO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1634, 33, '120133', 'SAPALLANGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1635, 33, '120134', 'SICAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1636, 33, '120135', 'SANTO DOMINGO DE ACOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1637, 33, '120136', 'VIQUES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1638, 33, '120201', 'CONCEPCION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1639, 33, '120202', 'ACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1640, 33, '120203', 'ANDAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1641, 33, '120204', 'CHAMBARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1642, 33, '120205', 'COCHAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1643, 33, '120206', 'COMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1644, 33, '120207', 'HEROINAS TOLEDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1645, 33, '120208', 'MANZANARES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1646, 33, '120209', 'MARISCAL CASTILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1647, 33, '120210', 'MATAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1648, 33, '120211', 'MITO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1649, 33, '120212', 'NUEVE DE JULIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1650, 33, '120213', 'ORCOTUNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1651, 33, '120214', 'SAN JOSE DE QUERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1652, 33, '210310', 'USICAYOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1653, 33, '120215', 'SANTA ROSA DE OCOPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1654, 33, '120301', 'CHANCHAMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1655, 33, '120302', 'PERENE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1656, 33, '120303', 'PICHANAQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1657, 33, '120304', 'SAN LUIS DE SHUARO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1658, 33, '120305', 'SAN RAMON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1659, 33, '120306', 'VITOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1660, 33, '120401', 'JAUJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1661, 33, '120402', 'ACOLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1662, 33, '120403', 'APATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1663, 33, '120404', 'ATAURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1664, 33, '120405', 'CANCHAYLLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1665, 33, '120406', 'CURICACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1666, 33, '120407', 'EL MANTARO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1667, 33, '120408', 'HUAMALI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1668, 33, '120409', 'HUARIPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1669, 33, '120410', 'HUERTAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1670, 33, '120411', 'JANJAILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1671, 33, '120412', 'JULCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1672, 33, '120413', 'LEONOR ORDOÑEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1673, 33, '120414', 'LLOCLLAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1674, 33, '120415', 'MARCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1675, 33, '120416', 'MASMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1676, 33, '120417', 'MASMA CHICCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1677, 33, '120418', 'MOLINOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1678, 33, '120419', 'MONOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1679, 33, '120420', 'MUQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1680, 33, '120421', 'MUQUIYAUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1681, 33, '120422', 'PACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1682, 33, '120423', 'PACCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1683, 33, '120424', 'PANCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1684, 33, '120425', 'PARCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1685, 33, '120426', 'POMACANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1686, 33, '120427', 'RICRAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1687, 33, '120428', 'SAN LORENZO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1688, 33, '120429', 'SAN PEDRO DE CHUNAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1689, 33, '120430', 'SAUSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1690, 33, '120431', 'SINCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1691, 33, '120432', 'TUNAN MARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1692, 33, '120433', 'YAULI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1693, 33, '120434', 'YAUYOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1694, 33, '120501', 'JUNIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1695, 33, '120502', 'CARHUAMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1696, 33, '120503', 'ONDORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1697, 33, '120504', 'ULCUMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1698, 33, '120602', 'COVIRIALI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1699, 33, '120603', 'LLAYLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1700, 33, '120604', 'MAZAMARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1701, 33, '120605', 'PAMPA HERMOSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1702, 33, '120606', 'PANGOA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1703, 33, '120607', 'RIO NEGRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1704, 33, '120608', 'RIO TAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1705, 33, '120701', 'TARMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1706, 33, '120702', 'ACOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1707, 33, '120703', 'HUARICOLCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1708, 33, '120704', 'HUASAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1709, 33, '120705', 'LA UNION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1710, 33, '120706', 'PALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1711, 33, '120707', 'PALCAMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1712, 33, '120708', 'SAN PEDRO DE CAJAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1713, 33, '120709', 'TAPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1714, 33, '120801', 'LA OROYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1715, 33, '120802', 'CHACAPALPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1716, 33, '120803', 'HUAYÑHUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1717, 33, '120804', 'MARCAPOMACOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1718, 33, '120805', 'MOROCOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1719, 33, '120806', 'PACCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1720, 33, '120807', 'SANTA BARBARA DE CARHUACAYAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1721, 33, '120808', 'SANTA ROSA DE SACCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1722, 33, '120809', 'SUITUCANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1723, 33, '120810', 'YAULI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1724, 33, '120901', 'CHUPACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1725, 33, '120902', 'AHUAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1726, 33, '120903', 'CHONGOS BAJO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1727, 33, '120904', 'HUACHAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1728, 33, '120905', 'HUAMANCACA CHICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1729, 33, '120906', 'SAN JUAN DE YSCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1730, 33, '120907', 'SAN JUAN DE JARPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1731, 33, '120908', 'TRES DE DICIEMBRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1732, 33, '120909', 'YANACANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1733, 33, '130101', 'TRUJILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1734, 33, '130102', 'EL PORVENIR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1735, 33, '130103', 'FLORENCIA DE MORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1736, 33, '130104', 'HUANCHACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1737, 33, '130105', 'LA ESPERANZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1738, 33, '130106', 'LAREDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1739, 33, '130107', 'MOCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1740, 33, '210401', 'JULI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1741, 33, '130108', 'POROTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1742, 33, '130109', 'SALAVERRY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1743, 33, '130110', 'SIMBAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1744, 33, '130111', 'VICTOR LARCO HERRERA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1745, 33, '130201', 'ASCOPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1746, 33, '130202', 'CHICAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1747, 33, '130203', 'CHOCOPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1748, 33, '130204', 'MAGDALENA DE CAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1749, 33, '130205', 'PAIJAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1750, 33, '130206', 'RAZURI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1751, 33, '130207', 'SANTIAGO DE CAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1752, 33, '130208', 'CASA GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1753, 33, '130301', 'BOLIVAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1754, 33, '130302', 'BAMBAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1755, 33, '130303', 'CONDORMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1756, 33, '130304', 'LONGOTEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1757, 33, '130305', 'UCHUMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1758, 33, '130306', 'UCUNCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1759, 33, '130401', 'CHEPEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1760, 33, '130402', 'PACANGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1761, 33, '130403', 'PUEBLO NUEVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1762, 33, '130501', 'JULCAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1763, 33, '130502', 'CALAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1764, 33, '130503', 'CARABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1765, 33, '130504', 'HUASO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1766, 33, '130601', 'OTUZCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1767, 33, '130602', 'AGALLPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1768, 33, '130604', 'CHARAT', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1769, 33, '130605', 'HUARANCHAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1770, 33, '130606', 'LA CUESTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1771, 33, '130608', 'MACHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1772, 33, '130610', 'PARANDAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1773, 33, '130611', 'SALPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1774, 33, '130613', 'SINSICAP', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1775, 33, '130614', 'USQUIL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1776, 33, '130701', 'SAN PEDRO DE LLOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1777, 33, '130702', 'GUADALUPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1778, 33, '130703', 'JEQUETEPEQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1779, 33, '130704', 'PACASMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1780, 33, '130705', 'SAN JOSE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1781, 33, '130801', 'TAYABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1782, 33, '130802', 'BULDIBUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1783, 33, '130803', 'CHILLIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1784, 33, '130804', 'HUANCASPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1785, 33, '130805', 'HUAYLILLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1786, 33, '130806', 'HUAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1787, 33, '130807', 'ONGON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1788, 33, '130808', 'PARCOY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1789, 33, '130809', 'PATAZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1790, 33, '130810', 'PIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1791, 33, '130811', 'SANTIAGO DE CHALLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1792, 33, '130812', 'TAURIJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1793, 33, '130813', 'URPAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1794, 33, '130901', 'HUAMACHUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1795, 33, '130902', 'CHUGAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1796, 33, '130903', 'COCHORCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1797, 33, '130904', 'CURGOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1798, 33, '130905', 'MARCABAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1799, 33, '130906', 'SANAGORAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1800, 33, '130907', 'SARIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1801, 33, '130908', 'SARTIMBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1802, 33, '131001', 'SANTIAGO DE CHUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1803, 33, '131002', 'ANGASMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1804, 33, '131003', 'CACHICADAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1805, 33, '131004', 'MOLLEBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1806, 33, '131005', 'MOLLEPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1807, 33, '131006', 'QUIRUVILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1808, 33, '131007', 'SANTA CRUZ DE CHUCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1809, 33, '131008', 'SITABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1810, 33, '131101', 'CASCAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1811, 33, '131102', 'LUCMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1812, 33, '131103', 'MARMOT', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1813, 33, '131104', 'SAYAPULLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1814, 33, '131201', 'VIRU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1815, 33, '131202', 'CHAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1816, 33, '131203', 'GUADALUPITO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1817, 33, '140101', 'CHICLAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1818, 33, '140102', 'CHONGOYAPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1819, 33, '140103', 'ETEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1820, 33, '140104', 'ETEN PUERTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1821, 33, '140105', 'JOSE LEONARDO ORTIZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1822, 33, '140106', 'LA VICTORIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1823, 33, '140107', 'LAGUNAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1824, 33, '140108', 'MONSEFU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1825, 33, '140109', 'NUEVA ARICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1826, 33, '140110', 'OYOTUN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1827, 33, '140111', 'PICSI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1828, 33, '140112', 'PIMENTEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1829, 33, '140113', 'REQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1830, 33, '140114', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1831, 33, '140115', 'SAÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1832, 33, '140116', 'CAYALTI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1833, 33, '140117', 'PATAPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1834, 33, '140118', 'POMALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1835, 33, '140119', 'PUCALA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1836, 33, '140120', 'TUMAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1837, 33, '140201', 'FERREÑAFE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1838, 33, '140202', 'CAÑARIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1839, 33, '140203', 'INCAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1840, 33, '140204', 'MANUEL ANTONIO MESONES MURO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1841, 33, '140205', 'PITIPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1842, 33, '140206', 'PUEBLO NUEVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1843, 33, '140301', 'LAMBAYEQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1844, 33, '140302', 'CHOCHOPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1845, 33, '140303', 'ILLIMO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1846, 33, '140304', 'JAYANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1847, 33, '140305', 'MOCHUMI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1848, 33, '140306', 'MORROPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1849, 33, '140307', 'MOTUPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1850, 33, '140308', 'OLMOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1851, 33, '140309', 'PACORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1852, 33, '140310', 'SALAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1853, 33, '140311', 'SAN JOSE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1854, 33, '140312', 'TUCUME', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1855, 33, '150104', 'BARRANCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1856, 33, '150102', 'ANCON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1857, 33, '150106', 'CARABAYLLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1858, 33, '150110', 'COMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1859, 33, '150112', 'INDEPENDENCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1860, 33, '150103', 'ATE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1861, 33, '150107', 'CHACLACAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1862, 33, '150111', 'EL AGUSTINO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1863, 33, '150109', 'CIENEGUILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1864, 33, '150101', 'LIMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1865, 33, '150105', 'BREÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1866, 33, '150201', 'BARRANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1867, 33, '150202', 'PARAMONGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1868, 33, '150203', 'PATIVILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1869, 33, '150204', 'SUPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1870, 33, '150205', 'SUPE PUERTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1871, 33, '150301', 'CAJATAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1872, 33, '150302', 'COPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1873, 33, '150303', 'GORGOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1874, 33, '150304', 'HUANCAPON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1875, 33, '150305', 'MANAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1876, 33, '150401', 'CANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1877, 33, '150402', 'ARAHUAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1878, 33, '150403', 'HUAMANTANGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1879, 33, '150404', 'HUAROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1880, 33, '150405', 'LACHAQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1881, 33, '150406', 'SAN BUENAVENTURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1882, 33, '150407', 'STA.ROSA DE QUIVES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1883, 33, '150501', 'SAN VICENTE DE CAÑETE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1884, 33, '150502', 'ASIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1885, 33, '150503', 'CALANGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1886, 33, '150504', 'CERRO AZUL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1887, 33, '150505', 'CHILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1888, 33, '150506', 'COAYLLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1889, 33, '150507', 'IMPERIAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1890, 33, '150508', 'LUNAHUANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1891, 33, '150509', 'MALA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1892, 33, '150510', 'NUEVO IMPERIAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1893, 33, '150511', 'PACARAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1894, 33, '150512', 'QUILMANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1895, 33, '150513', 'SAN ANTONIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1896, 33, '150514', 'SAN LUIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1897, 33, '150515', 'STA.CRUZ DE FLORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1898, 33, '150516', 'ZUÑIGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1899, 33, '150601', 'HUARAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1900, 33, '150602', 'ATAVILLOS ALTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1901, 33, '150603', 'ATAVILLOS BAJO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1902, 33, '150604', 'AUCALLAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1903, 33, '150605', 'CHANCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1904, 33, '150606', 'IHUARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1905, 33, '150607', 'LAMPIAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1906, 33, '150608', 'PACARAOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1907, 33, '150609', 'SAN MIGUEL DE ACOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1908, 33, '150610', 'STA.CRUZ DE ANDAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1909, 33, '150611', 'SUMBILCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1910, 33, '150612', 'VEINTISIETE DE NOVIEMBRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1911, 33, '150701', 'MATUCANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1912, 33, '150702', 'ANTIOQUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1913, 33, '150703', 'CALLAHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1914, 33, '150704', 'CARAMPOMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1915, 33, '150705', 'CHICLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1916, 33, '150119', 'LURIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1917, 33, '150122', 'MIRAFLORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1918, 33, '150127', 'PUNTA NEGRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1919, 33, '150129', 'SAN BARTOLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1920, 33, '150133', 'SAN JUAN DE MIRAFLORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1921, 33, '150140', 'SANTIAGO DE SURCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1922, 33, '150141', 'SURQUILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1923, 33, '150143', 'VILLA MARIA DEL TRIUNFO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1924, 33, '150142', 'VILLA EL SALVADOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1925, 33, '150138', 'SANTA MARIA DEL MAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1926, 33, '150124', 'PUCUSANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1927, 33, '150125', 'PUENTE PIEDRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1928, 33, '150128', 'RIMAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1929, 33, '150139', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1930, 33, '150117', 'LOS OLIVOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1931, 33, '150114', 'LA MOLINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1932, 33, '150115', 'LA VICTORIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1933, 33, '150118', 'LURIGANCHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1934, 33, '150134', 'SAN LUIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1935, 33, '150137', 'SANTA ANITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1936, 33, '150130', 'SAN BORJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1937, 33, '150123', 'PACHACAMAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1938, 33, '150113', 'JESUS MARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1939, 33, '150116', 'LINCE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1940, 33, '150131', 'SAN ISIDRO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1941, 33, '150136', 'SAN MIGUEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1942, 33, '150706', 'CUENCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1943, 33, '150707', 'HUACHUPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1944, 33, '150708', 'HUANZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1945, 33, '150709', 'HUAROCHIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1946, 33, '150710', 'LAHUAYTAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1947, 33, '150711', 'LANGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1948, 33, '150712', 'LARAOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1949, 33, '150713', 'MARIATANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1950, 33, '150714', 'RICARDO PALMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1951, 33, '150715', 'SAN ANDRES DE TUPICOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1952, 33, '150716', 'SAN ANTONIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1953, 33, '150717', 'SAN BARTOLOME', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1954, 33, '150718', 'SAN DAMIAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1955, 33, '150719', 'SAN JUAN DE IRIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1956, 33, '150720', 'SAN JUAN DE TANTARANCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1957, 33, '150721', 'SAN LORENZO DE QUINTI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1958, 33, '150722', 'SAN MATEO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1959, 33, '150723', 'SAN MATEO DE OTAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1960, 33, '150724', 'SAN PEDRO DE CASTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1961, 33, '150725', 'SAN PEDRO DE HUANCAYRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1962, 33, '150726', 'SANGALLAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1963, 33, '150727', 'STA.CRUZ DE COCACHACRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1964, 33, '150729', 'SANTIAGO DE ANCHUCAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1965, 33, '150730', 'SANTIAGO DE TUNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1966, 33, '150731', 'STO.DGO.DE LOS OLLEROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1967, 33, '150732', 'SURCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1968, 33, '150801', 'HUACHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1969, 33, '150802', 'AMBAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1970, 33, '150803', 'CALETA DE CARQUIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1971, 33, '150804', 'CHECRAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1972, 33, '150805', 'HUALMAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1973, 33, '150806', 'HUAURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1974, 33, '150807', 'LEONCIO PRADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1975, 33, '150808', 'PACCHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1976, 33, '150809', 'SANTA LEONOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1977, 33, '150810', 'SANTA MARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1978, 33, '150811', 'SAYAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1979, 33, '150812', 'VEGUETA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1980, 33, '150901', 'OYON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1981, 33, '150902', 'ANDAJES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1982, 33, '150903', 'CAUJUL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1983, 33, '150904', 'COCHAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1984, 33, '150905', 'NAVAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1985, 33, '150906', 'PACHANGARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1986, 33, '151001', 'YAUYOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1987, 33, '151002', 'ALIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1988, 33, '151003', 'AYAUCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1989, 33, '151004', 'AYAVIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1990, 33, '151005', 'AZANGARO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1991, 33, '151006', 'CACRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1992, 33, '151007', 'CARANIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1993, 33, '151008', 'CATAHUASI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1994, 33, '151009', 'CHOCOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1995, 33, '151010', 'COCHAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1996, 33, '151011', 'COLONIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1997, 33, '151012', 'HONGOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1998, 33, '151013', 'HUAMPARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(1999, 33, '151014', 'HUANCAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2000, 33, '151015', 'HUANGASCAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2001, 33, '151016', 'HUANTAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2002, 33, '151017', 'HUAÑEC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2003, 33, '151018', 'LARAOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2004, 33, '151019', 'LINCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2005, 33, '151020', 'MADEAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2006, 33, '151021', 'MIRAFLORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2007, 33, '151022', 'OMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2008, 33, '151023', 'PUTINZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2009, 33, '151024', 'QUINCHES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2010, 33, '151025', 'QUINOCAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2011, 33, '151026', 'SAN JOAQUIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2012, 33, '151027', 'SAN PEDRO DE PILAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2013, 33, '151028', 'TANTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2014, 33, '151029', 'TAURIPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2015, 33, '151030', 'TOMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2016, 33, '151031', 'TUPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2017, 33, '151032', 'VIÑAC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2018, 33, '151033', 'VITIS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2019, 33, '150120', 'MAGDALENA DEL MAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2020, 33, '160101', 'IQUITOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2021, 33, '160102', 'ALTO NANAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2022, 33, '160103', 'FERNANDO LORES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2023, 33, '160104', 'INDIANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2024, 33, '160105', 'LAS AMAZONAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2025, 33, '160106', 'MAZAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2026, 33, '160107', 'NAPO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2027, 33, '160108', 'PUNCHANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2028, 33, '160109', 'PUTUMAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2029, 33, '160110', 'TORRES CAUSANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2030, 33, '160112', 'BELEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2031, 33, '160113', 'SAN JUAN BAUTISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2032, 33, '160201', 'YURIMAGUAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2033, 33, '160202', 'BALSAPUERTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2034, 33, '160203', 'BARRANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2035, 33, '160204', 'CAHUAPANAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2036, 33, '160205', 'JEBEROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2037, 33, '160206', 'LAGUNAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2038, 33, '160207', 'MANSERICHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2039, 33, '160208', 'MORONA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2040, 33, '160209', 'PASTAZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2041, 33, '160210', 'SANTA CRUZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2042, 33, '160211', 'TENIENTE CESAR LOPEZ ROJAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2043, 33, '160301', 'NAUTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2044, 33, '160302', 'PARINARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2045, 33, '160303', 'TIGRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2046, 33, '160304', 'TROMPETEROS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2047, 33, '160305', 'URARINAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2048, 33, '160401', 'RAMON CASTILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2049, 33, '160402', 'PEBAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2050, 33, '160403', 'YAVARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2051, 33, '160404', 'SAN PABLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2052, 33, '160501', 'REQUENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2053, 33, '160502', 'ALTO TAPICHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2054, 33, '160503', 'CAPELO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2055, 33, '160504', 'EMILIO SAN MARTIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2056, 33, '160505', 'MAQUIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2057, 33, '160506', 'PUINAHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2058, 33, '160507', 'SAQUENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2059, 33, '160508', 'SOPLIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2060, 33, '160509', 'TAPICHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2061, 33, '160510', 'JENARO HERRERA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2062, 33, '160511', 'YAQUERANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2063, 33, '160601', 'CONTAMANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2064, 33, '160602', 'INAHUAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2065, 33, '160603', 'PADRE MARQUEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2066, 33, '160604', 'PAMPA HERMOSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2067, 33, '160605', 'SARAYACU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2068, 33, '160606', 'VARGAS GUERRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2069, 33, '170101', 'TAMBOPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2070, 33, '170102', 'INAMBARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2071, 33, '170103', 'LAS PIEDRAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2072, 33, '170104', 'LABERINTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2073, 33, '170201', 'MANU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2074, 33, '170202', 'FITZCARRALD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2075, 33, '170203', 'MADRE DE DIOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2076, 33, '170204', 'HUEPETUHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2077, 33, '170301', 'IÑAPARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2078, 33, '170302', 'IBERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2079, 33, '170303', 'TAHUAMANU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2080, 33, '180101', 'MOQUEGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2081, 33, '180102', 'CARUMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2082, 33, '180103', 'CUCHUMBAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2083, 33, '180104', 'SAMEGUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2084, 33, '180105', 'SAN CRISTOBAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2085, 33, '180106', 'TORATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2086, 33, '180201', 'OMATE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2087, 33, '180202', 'CHOJATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2088, 33, '180203', 'COALAQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2089, 33, '180204', 'ICHUÑA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2090, 33, '180205', 'LA CAPILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2091, 33, '180206', 'LLOQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2092, 33, '180207', 'MATALAQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2093, 33, '180208', 'PUQUINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2094, 33, '180209', 'QUINISTAQUILLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2095, 33, '180210', 'UBINAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2096, 33, '180211', 'YUNGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2097, 33, '180301', 'ILO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2098, 33, '180302', 'EL ALGARROBAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2099, 33, '180303', 'PACOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2100, 33, '190101', 'CHAUPIMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2101, 33, '190102', 'HUACHON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2102, 33, '190103', 'HUARIACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2103, 33, '190104', 'HUAYLLAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2104, 33, '190105', 'NINACACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2105, 33, '190106', 'PALLANCHACRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2106, 33, '190107', 'PAUCARTAMBO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2107, 33, '190108', 'SAN FRANCISCO DE ASIS DE YARUSYACAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2108, 33, '190109', 'SIMON BOLIVAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2109, 33, '190110', 'TICLACAYAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2110, 33, '190111', 'TINYAHUARCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2111, 33, '190112', 'VICCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2112, 33, '190113', 'YANACANCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2113, 33, '190201', 'YANAHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2114, 33, '190202', 'CHACAYAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2115, 33, '190203', 'GOYLLARISQUIZGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2116, 33, '190204', 'PAUCAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2117, 33, '190205', 'SAN PEDRO DE PILLAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2118, 33, '190206', 'SANTA ANA DE TUSI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2119, 33, '190207', 'TAPUC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2120, 33, '190208', 'VILCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2121, 33, '190301', 'OXAPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2122, 33, '190302', 'CHONTABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2123, 33, '190303', 'HUANCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2124, 33, '190304', 'PALCAZU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2125, 33, '190305', 'POZUZO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2126, 33, '190306', 'PUERTO BERMUDEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2127, 33, '190307', 'VILLA RICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2128, 33, '200101', 'PIURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2129, 33, '200104', 'CASTILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2130, 33, '200105', 'CATACAOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2131, 33, '200107', 'CURA MORI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2132, 33, '200108', 'EL TALLAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2133, 33, '200109', 'LA ARENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2134, 33, '200110', 'LA UNION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2135, 33, '200111', 'LAS LOMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2136, 33, '200114', 'TAMBO GRANDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2137, 33, '200201', 'AYABACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2138, 33, '200202', 'FRIAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2139, 33, '200203', 'JILILI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2140, 33, '200204', 'LAGUNAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2141, 33, '200205', 'MONTERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2142, 33, '200206', 'PACAIPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2143, 33, '200207', 'PAIMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2144, 33, '200208', 'SAPILLICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2145, 33, '200209', 'SICCHEZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2146, 33, '200210', 'SUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2147, 33, '200301', 'HUANCABAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2148, 33, '200302', 'CANCHAQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2149, 33, '200303', 'EL CARMEN DE LA FRONTERA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2150, 33, '200304', 'HUARMACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2151, 33, '200305', 'LALAQUIZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2152, 33, '200306', 'SAN MIGUEL DE EL FAIQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2153, 33, '200307', 'SONDOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2154, 33, '200308', 'SONDORILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2155, 33, '200401', 'CHULUCANAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2156, 33, '200402', 'BUENOS AIRES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2157, 33, '200403', 'CHALACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2158, 33, '200404', 'LA MATANZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2159, 33, '200405', 'MORROPON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2160, 33, '200406', 'SALITRAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2161, 33, '200407', 'SAN JUAN DE BIGOTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2162, 33, '200408', 'SANTA CATALINA DE MOSSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2163, 33, '200409', 'SANTO DOMINGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2164, 33, '200410', 'YAMANGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2165, 33, '200501', 'PAITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2166, 33, '200502', 'AMOTAPE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2167, 33, '200503', 'ARENAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2168, 33, '200504', 'COLAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2169, 33, '200505', 'LA HUACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2170, 33, '200506', 'TAMARINDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2171, 33, '200507', 'VICHAYAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2172, 33, '200601', 'SULLANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2173, 33, '200602', 'BELLAVISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2174, 33, '200603', 'IGNACIO ESCUDERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2175, 33, '200604', 'LANCONES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2176, 33, '200605', 'MARCAVELICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2177, 33, '200606', 'MIGUEL CHECA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2178, 33, '200607', 'QUERECOTILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2179, 33, '200608', 'SALITRAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2180, 33, '200701', 'PARIÑAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2181, 33, '200702', 'EL ALTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2182, 33, '200703', 'LA BREA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2183, 33, '200704', 'LOBITOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2184, 33, '200705', 'LOS ORGANOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2185, 33, '200706', 'MANCORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2186, 33, '200801', 'SECHURA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2187, 33, '200802', 'BELLAVISTA DE LA UNION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2188, 33, '200803', 'BERNAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2189, 33, '200804', 'CRISTO NOS VALGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2190, 33, '200805', 'VICE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2191, 33, '200806', 'RINCONADA LLICUAR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2192, 33, '210101', 'PUNO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2193, 33, '210102', 'ACORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2194, 33, '210103', 'AMANTANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2195, 33, '210104', 'ATUNCOLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2196, 33, '210105', 'CAPACHICA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2197, 33, '210106', 'CHUCUITO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2198, 33, '210107', 'COATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2199, 33, '210108', 'HUATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2200, 33, '210109', 'MAÑAZO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2201, 33, '210110', 'PAUCARCOLLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2202, 33, '210111', 'PICHACANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2203, 33, '210112', 'PLATERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2204, 33, '210113', 'SAN ANTONIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2205, 33, '210114', 'TIQUILLACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2206, 33, '210115', 'VILQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2207, 33, '210201', 'AZANGARO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2208, 33, '210202', 'ACHAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2209, 33, '210203', 'ARAPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2210, 33, '210204', 'ASILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2211, 33, '210205', 'CAMINACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2212, 33, '210206', 'CHUPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2213, 33, '210207', 'JOSE DOMINGO CHOQUEHUANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2214, 33, '210208', 'MUÑANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2215, 33, '210209', 'POTONI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2216, 33, '210210', 'SAMAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2217, 33, '210211', 'SAN ANTON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2218, 33, '210212', 'SAN JOSE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2219, 33, '210213', 'SAN JUAN DE SALINAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2220, 33, '210214', 'SANTIAGO DE PUPUJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2221, 33, '210215', 'TIRAPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2222, 33, '210301', 'MACUSANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2223, 33, '210302', 'AJOYANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2224, 33, '210303', 'AYAPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2225, 33, '210304', 'COASA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2226, 33, '210305', 'CORANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2227, 33, '210306', 'CRUCERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2228, 33, '210307', 'ITUATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2229, 33, '210308', 'OLLACHEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2230, 33, '210309', 'SAN GABAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2231, 33, '210402', 'DESAGUADERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2232, 33, '210403', 'HUACULLANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2233, 33, '210404', 'KELLUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2234, 33, '210405', 'PISACOMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2235, 33, '210406', 'POMATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2236, 33, '210407', 'ZEPITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2237, 33, '210501', 'ILAVE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2238, 33, '210502', 'CAPAZO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2239, 33, '210503', 'PILCUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2240, 33, '210504', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2241, 33, '210505', 'CONDURIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2242, 33, '210601', 'HUANCANE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2243, 33, '210602', 'COJATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2244, 33, '210603', 'HUATASANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2245, 33, '210604', 'INCHUPALLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2246, 33, '210605', 'PUSI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2247, 33, '210606', 'ROSASPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2248, 33, '210607', 'TARACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2249, 33, '210608', 'VILQUE CHICO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2250, 33, '210701', 'LAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2251, 33, '210702', 'CABANILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2252, 33, '210703', 'CALAPUJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2253, 33, '210704', 'NICASIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2254, 33, '210705', 'OCUVIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2255, 33, '210706', 'PALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2256, 33, '210707', 'PARATIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2257, 33, '210708', 'PUCARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2258, 33, '210709', 'SANTA LUCIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2259, 33, '210710', 'VILAVILA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2260, 33, '210801', 'AYAVIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2261, 33, '210802', 'ANTAUTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2262, 33, '210803', 'CUPI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2263, 33, '210804', 'LLALLI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2264, 33, '210805', 'MACARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2265, 33, '210806', 'NUÑOA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2266, 33, '210807', 'ORURILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2267, 33, '210808', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2268, 33, '210809', 'UMACHIRI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2269, 33, '210901', 'MOHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2270, 33, '210902', 'CONIMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2271, 33, '210903', 'HUAYRAPATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2272, 33, '210904', 'TILALI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2273, 33, '211001', 'PUTINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2274, 33, '211002', 'ANANEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2275, 33, '211003', 'PEDRO VILCA APAZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2276, 33, '211004', 'QUILCAPUNCU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2277, 33, '211005', 'SINA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2278, 33, '211101', 'JULIACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2279, 33, '211102', 'CABANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2280, 33, '211103', 'CABANILLAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2281, 33, '211104', 'CARACOTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2282, 33, '211201', 'SANDIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2283, 33, '211202', 'CUYOCUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2284, 33, '211203', 'LIMBANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2285, 33, '211204', 'PATAMBUCO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2286, 33, '211205', 'PHARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2287, 33, '211206', 'QUIACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2288, 33, '211207', 'SAN JUAN DEL ORO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2289, 33, '211208', 'YANAHUAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2290, 33, '211209', 'ALTO INAMBARI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2291, 33, '211301', 'YUNGUYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2292, 33, '211302', 'ANAPIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2293, 33, '211303', 'COPANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2294, 33, '211304', 'CUTURAPI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2295, 33, '211305', 'OLLARAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2296, 33, '211306', 'TINICACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2297, 33, '211307', 'UNICACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2298, 33, '150126', 'PUNTA HERMOSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2299, 33, '220101', 'MOYOBAMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2300, 33, '220102', 'CALZADA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2301, 33, '220103', 'HABANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2302, 33, '220104', 'JEPELACIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2303, 33, '220105', 'SORITOR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2304, 33, '220106', 'YANTALO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2305, 33, '220201', 'BELLAVISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2306, 33, '220202', 'ALTO BIAVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2307, 33, '220203', 'BAJO BIAVO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2308, 33, '220204', 'HUALLAGA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2309, 33, '220205', 'SAN PABLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2310, 33, '220206', 'SAN RAFAEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2311, 33, '220301', 'SAN JOSE DE SISA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2312, 33, '220302', 'AGUA BLANCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2313, 33, '220303', 'SAN MARTIN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2314, 33, '220304', 'SANTA ROSA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2315, 33, '220305', 'SHATOJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2316, 33, '220401', 'SAPOSOA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2317, 33, '220402', 'ALTO SAPOSOA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2318, 33, '220403', 'EL ESLABON', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2319, 33, '220404', 'PISCOYACU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2320, 33, '220405', 'SACANCHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2321, 33, '220406', 'TINGO DE SAPOSOA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2322, 33, '220501', 'LAMAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2323, 33, '220502', 'ALONSO DE ALVARADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2324, 33, '220503', 'BARRANQUITA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2325, 33, '220504', 'CAYNARACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2326, 33, '220505', 'CUÑUMBUQUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2327, 33, '220506', 'PINTO RECODO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2328, 33, '220507', 'RUMISAPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2329, 33, '220508', 'SAN ROQUE DE CUMBAZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2330, 33, '220509', 'SHANAO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2331, 33, '220510', 'TABALOSOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2332, 33, '220511', 'ZAPATERO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2333, 33, '220601', 'JUANJUI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2334, 33, '220602', 'CAMPANILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2335, 33, '220603', 'HUICUNGO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2336, 33, '220604', 'PACHIZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2337, 33, '220605', 'PAJARILLO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2338, 33, '220701', 'PICOTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2339, 33, '220702', 'BUENOS AIRES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2340, 33, '220703', 'CASPISAPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2341, 33, '220704', 'PILLUANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2342, 33, '220705', 'PUCACACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2343, 33, '220706', 'SAN CRISTOBAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2344, 33, '220707', 'SAN HILARION', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2345, 33, '220708', 'SHAMBOYACU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2346, 33, '220709', 'TINGO DE PONASA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2347, 33, '220710', 'TRES UNIDOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2348, 33, '220801', 'RIOJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2349, 33, '220802', 'AWAJUN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2350, 33, '220803', 'ELIAS SOPLIN VARGAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2351, 33, '220804', 'NUEVA CAJAMARCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2352, 33, '220805', 'PARDO MIGUEL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2353, 33, '220806', 'POSIC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2354, 33, '220807', 'SAN FERNANDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2355, 33, '220808', 'YORONGOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2356, 33, '220809', 'YURACYACU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2357, 33, '220901', 'TARAPOTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2358, 33, '250401', 'PURUS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2359, 33, '220902', 'ALBERTO LEVEAU', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2360, 33, '220903', 'CACATACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2361, 33, '220904', 'CHAZUTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2362, 33, '220905', 'CHIPURANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2363, 33, '220906', 'EL PORVENIR', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2364, 33, '220907', 'HUIMBAYOC', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2365, 33, '220908', 'JUAN GUERRA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2366, 33, '220909', 'LA BANDA DE SHILCAYO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2367, 33, '220910', 'MORALES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2368, 33, '220911', 'PAPAPLAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2369, 33, '220912', 'SAN ANTONIO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2370, 33, '220913', 'SAUCE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2371, 33, '220914', 'SHAPAJA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2372, 33, '221001', 'TOCACHE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2373, 33, '221002', 'NUEVO PROGRESO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2374, 33, '221003', 'POLVORA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2375, 33, '221004', 'SHUNTE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2376, 33, '221005', 'UCHIZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2377, 33, '230101', 'TACNA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2378, 33, '230102', 'ALTO DE LA ALIANZA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2379, 33, '230103', 'CALANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2380, 33, '230104', 'CIUDAD NUEVA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2381, 33, '230105', 'INCLAN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2382, 33, '230106', 'PACHIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2383, 33, '230107', 'PALCA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2384, 33, '230108', 'POCOLLAY', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2385, 33, '230109', 'SAMA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2386, 33, '230110', 'CORONEL GREGORIO ALBARRACIN LANCHIP', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2387, 33, '230201', 'CANDARAVE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2388, 33, '230202', 'CAIRANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2389, 33, '230203', 'CAMILACA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2390, 33, '230204', 'CURIBAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2391, 33, '230205', 'HUANUARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2392, 33, '230206', 'QUILAHUANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2393, 33, '230301', 'LOCUMBA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2394, 33, '230302', 'ILABAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2395, 33, '230303', 'ITE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2396, 33, '230401', 'TARATA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2397, 33, '230402', 'CHUCATAMANI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2398, 33, '230403', 'ESTIQUE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2399, 33, '230404', 'ESTIQUEÑPAMPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2400, 33, '230405', 'SITAJARA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2401, 33, '230406', 'SUSAPAYA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2402, 33, '230407', 'TARUCACHI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2403, 33, '230408', 'TICACO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2404, 33, '240101', 'TUMBES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2405, 33, '240102', 'CORRALES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2406, 33, '240103', 'LA CRUZ', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2407, 33, '240104', 'PAMPAS DE HOSPITAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2408, 33, '240105', 'SAN JACINTO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2409, 33, '240106', 'SAN JUAN DE LA VIRGEN', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2410, 33, '240201', 'ZORRITOS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2411, 33, '240202', 'CASITAS', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2412, 33, '240301', 'ZARUMILLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2413, 33, '240302', 'AGUAS VERDES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2414, 33, '240303', 'MATAPALO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2415, 33, '240304', 'PAPAYAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2416, 33, '250101', 'CALLERIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2417, 33, '250102', 'CAMPOVERDE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2418, 33, '250103', 'IPARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2419, 33, '250104', 'MASISEA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2420, 33, '250105', 'YARINACOCHA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2421, 33, '250106', 'NUEVA REQUENA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2422, 33, '250201', 'RAYMONDI', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2423, 33, '250202', 'SEPAHUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2424, 33, '250203', 'TAHUANIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2425, 33, '250204', 'YURUA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2426, 33, '250301', 'PADRE ABAD', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2427, 33, '250302', 'IRAZOLA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2428, 33, '250303', 'CURIMANA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2429, 33, '051005', 'CANARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2430, 33, '230111', 'TOQUEPALA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2431, 33, '150135', 'SAN MARTIN DE PORRES', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2432, 33, '100112', 'TINGO MARIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2433, 33, '250107', 'PUCALLPA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2434, 33, '150728', 'SANTA EULALIA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2435, 33, '120307', 'LA MERCED', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2436, 33, '150121', 'PUEBLO LIBRE', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2437, 33, '070102', 'BELLAVISTA', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2438, 33, '070103', 'CARMEN DE LA LEGUA REYNOSO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2439, 33, '150132', 'SAN JUAN DE LURIGANCHO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2440, 33, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2441, 34, '1', 'FACTURADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2442, 34, '0', 'NO FACTURADO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2443, 34, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2444, 35, '01', 'LOCAL', 0, 19000101010101, '1', 0);
INSERT INTO public.t_parametro(param_id, param_cod_tip, param_cod, param_des, param_ref, fec_num_cam, cod_ind_cam, proc_id)
  VALUES(2445, 35, '-', 'NO DEFINIDO', 0, 19000101010101, '1', 0);

