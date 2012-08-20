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
34: Estado de facturacion
35: Tipo de ambito
36: Estado de liquidacion

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