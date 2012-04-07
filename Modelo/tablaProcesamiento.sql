/*

drop index IDX_PROC_DET_03;
drop index IDX_PROC_DET_02;
drop index IDX_PROC_DET_01;

drop table T_PROCESO_DETALLE;
drop table T_PROCESO;

*/

/*==============================================================*/
/* Table: T_PROCESO                                             */
/*==============================================================*/
create table T_PROCESO (
   PROC_ID              SERIAL               not null,
   PROC_TIP             CHAR(1)              not null default '1',
   PROC_FEC_DESDE       TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_FEC_HASTA       TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_CNT_REG_X_BLOQUE INT4                 not null default 0,
   PROC_NUM_REG_TOT     INT4                 not null default 0,
   PROC_NUM_REG_PRO     INT4                 not null default 0,
   PROC_NUM_REG_REC     INT4                 not null default 0,
   PROC_FEC_INI         TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_FEC_FIN         TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_FEC_ACT         TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_EST             CHAR(1)              not null default '1',
   constraint PK_T_PROCESO primary key (PROC_ID)
);

comment on column T_PROCESO.PROC_TIP is
'1: Carga Modelo Generico
2: Carga Modelo Dimensional';

comment on column T_PROCESO.PROC_EST is
'1: Inciado
2: Terminado correctamente
3: Terminado con errores
4: Cancelado';

/*==============================================================*/
/* Table: T_PROCESO_DETALLE                                     */
/*==============================================================*/
create table T_PROCESO_DETALLE (
   PRO_DET_ID           SERIAL               not null default 0,
   PROC_ID              INT4                 not null default 0,
   PROC_TIP             CHAR(1)              not null default '1',
   PROC_DET_ID_TABLE    INT4                 not null default 0,
   PROC_DET_FEC_DESDE   TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_DET_FEC_HASTA   TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_DET_NUM_REG_TOT INT4                 not null default 0,
   PROC_DET_NUM_REG_PRO INT4                 not null default 0,
   PROC_DET_NUM_REG_REC INT4                 not null default 0,
   PROC_DET_FEC_INI     TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_DET_FEC_FIN     TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_DET_FEC_ACT     TIMESTAMP            not null default '1900-01-01 01:01:01',
   PROC_DET_EST         CHAR(1)              not null default '1',
   constraint PK_T_PROCESO_DETALLE primary key (PRO_DET_ID)
);

comment on column T_PROCESO_DETALLE.PROC_TIP is
'1: Carga Modelo Generico
2: Carga Modelo Dimensional';

comment on column T_PROCESO_DETALLE.PROC_DET_ID_TABLE is
't_area_cliente=101
t_cargo=102
t_cargo_despacho=103
t_cliente=104
t_cotizacion=105
t_despacho=106
t_empleado=107
t_empleado_categoria=108
t_liquidacion=109
t_orden=110
t_parametro=111
t_producto=112
t_sede=113
t_servicio=114
t_ubigeo=115
t_zona=116

dim_cliente=201
dim_estado=202
dim_facturado=203
dim_moneda=204
dim_personal=205
dim_producto=206
dim_sede=207
dim_servicio=208
dim_tiempo=209
dim_tipo_documento=210
dim_tipo_pago=211
dim_tipo_reparto=212
dim_tipo_ruta=213
dim_ubigeo=214
dim_zona=215
fact_cotizacion=216
fact_despacho=217
fact_envio=218
fact_orden=219';

comment on column T_PROCESO_DETALLE.PROC_DET_EST is
'1: Inciado
2: Terminado correctamente
3: Terminado con errores
4: Cancelado';

/*==============================================================*/
/* Index: IDX_PROC_DET_01                                       */
/*==============================================================*/
create unique index IDX_PROC_DET_01 on T_PROCESO_DETALLE (
PROC_ID,
PROC_TIP,
PROC_DET_ID_TABLE
);

/*==============================================================*/
/* Index: IDX_PROC_DET_02                                       */
/*==============================================================*/
create  index IDX_PROC_DET_02 on T_PROCESO_DETALLE (
PROC_ID
);

/*==============================================================*/
/* Index: IDX_PROC_DET_03                                       */
/*==============================================================*/
create  index IDX_PROC_DET_03 on T_PROCESO_DETALLE (
PROC_DET_ID_TABLE
);
