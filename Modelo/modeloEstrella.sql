/*

drop table dim_cliente;

drop table dim_ubigeo;

drop table dim_estado;

drop table dim_facturado;

drop table dim_moneda;

drop table dim_personal;

drop table dim_producto;

drop table dim_sede;

drop table dim_servicio;

drop table dim_tiempo;

drop table dim_tipo_documento;

drop table dim_tipo_pago;

drop table dim_tipo_reparto;

drop table dim_tipo_ruta;

drop table dim_zona;

drop table fact_cotizacion;

drop table fact_despacho;

drop table fact_envio;

drop table fact_orden;

*/

/*==============================================================*/
/* User: postgres                                               */
/*==============================================================*/
/*==============================================================*/
/* Table: dim_cliente                                           */
/*==============================================================*/
create table dim_cliente (
cliente_area_key     INT4                 not null default 0,
cliente_key          INT4                 not null default 0,
cliente_cod_tip      INT4                 not null default 46,
cliente_desc_tip     VARCHAR(250)         not null default 'NO DEFINIDO',
cliente_cod_categoria INT4                 not null default 42,
cliente_desc_categoria VARCHAR(250)         not null default 'NO DEFINIDO',
cliente_cod_facturacion INT4                 not null default 52,
cliente_desc_facturacion VARCHAR(250)         not null default 'NO DEFINIDO',
cliente_cod_credito  INT4                 not null default 48,
cliente_desc_credito VARCHAR(250)         not null default 'NO DEFINIDO',
cliente_cod_tip_doc  INT4                 not null default 77,
cliente_desc_tip_doc VARCHAR(250)         not null default 'NO DEFINIDO',
cliente_num_tip_doc  CHAR(15)             not null default '-',
cliente_desc         VARCHAR(250)         not null default '-',
cliente_area_cod     VARCHAR(30)          not null default '-',
cliente_area_desc    VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_CLIENTE primary key (cliente_area_key)
);

/*==============================================================*/
/* Table: dim_ubigeo_cliente                                    */
/*==============================================================*/
create table dim_ubigeo (
ubigeo_key   INT4                 not null default 0,
ubigeo_cod_pais INT4                 not null default 386,
ubigeo_des_pais VARCHAR(250)         not null default 'NO DEFINIDO',
ubigeo_cod_departamento INT4                 not null default 412,
ubigeo_desc_departamento VARCHAR(250)         not null default 'NO DEFINIDO',
ubigeo_cod_provincia INT4                 not null default 607,
ubigeo_desc_provincia VARCHAR(250)         not null default 'NO DEFINIDO',
ubigeo_cod_distrito INT4                 not null default 2440,
ubigeo_desc_distrito VARCHAR(250)         not null default 'NO DEFINIDO',
constraint PK_DIM_UBIGEO primary key (ubigeo_key)
);

/*==============================================================*/
/* Table: dim_estado                                            */
/*==============================================================*/
create table dim_estado (
estado_key           INT4                 not null default 0,
estado_cod_tipo      CHAR(4)              not null default '-',
estado_desc_tipo     VARCHAR(250)         not null default '-',
estado_cod           VARCHAR(6)           not null default '-',
estado_desc          VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_ESTADO primary key (estado_key)
);

/*==============================================================*/
/* Table: dim_facturado                                         */
/*==============================================================*/
create table dim_facturado (
facturado_key        INT4                 not null default 0,
facturado_cod        CHAR(1)              not null default '-',
facturado_desc       VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_FACTURADO primary key (facturado_key)
);

/*==============================================================*/
/* Table: dim_moneda                                            */
/*==============================================================*/
create table dim_moneda (
moneda_key           INT4                 not null default 0,
moneda_cod           CHAR(2)              not null default '-',
moneda_desc          VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_MONEDA primary key (moneda_key)
);

/*==============================================================*/
/* Table: dim_personal                                          */
/*==============================================================*/
create table dim_personal (
personal_key         INT4                 not null,
personal_codigo      VARCHAR(10)          not null default '-',
personal_codigo_categoria INT4                 not null default 92,
personal_descripcion_categoria VARCHAR(250)         not null default 'NO DEFINIDO',
personal_nombre      VARCHAR(250)         not null default '-',
personal_sexo        CHAR(1)              not null default 'M',
proc_id              INT4                 not null default 0,
constraint PK_DIM_PERSONAL primary key (personal_key)
);

/*==============================================================*/
/* Table: dim_producto                                          */
/*==============================================================*/
create table dim_producto (
producto_key         INT4                 not null default 0,
producto_cod         VARCHAR(10)          not null default '-',
producto_cod_tip     INT4                 not null default 118,
producto_desc_tip    VARCHAR(250)         not null default 'NO DEFINIDO',
producto_desc        VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_PRODUCTO primary key (producto_key)
);

/*==============================================================*/
/* Table: dim_sede                                              */
/*==============================================================*/
create table dim_sede (
sede_key             INT4                 not null default 0,
sede_cod             VARCHAR(10)          not null default '-',
sede_cod_tipo        INT4                 not null default 119,
sede_desc_tipo       VARCHAR(250)         not null default 'NO DEFINIDO',
sede_cod_pais        INT4                 not null default 386,
sede_desc_pais       VARCHAR(250)         not null default 'NO DEFINIDO',
sede_cod_departamento INT4                 not null default 412,
sede_desc_departamento VARCHAR(250)         not null default 'NO DEFINIDO',
sede_cod_provincia   INT4                 not null default 607,
sede_desc_provincia  VARCHAR(250)         not null default 'NO DEFINIDO',
sede_cod_distrito    INT4                 not null default 2440,
sede_desc_distrito   VARCHAR(250)         not null default 'NO DEFINIDO',
sede_desc            VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_SEDE primary key (sede_key)
);

/*==============================================================*/
/* Table: dim_servicio                                          */
/*==============================================================*/
create table dim_servicio (
servicio_key         INT4                 not null default 0,
servicio_cod         VARCHAR(10)          not null default '-',
servicio_cod_ambito  INT4                 not null default 2445,
servicio_desc_ambito VARCHAR(250)         not null default 'NO DEFINIDO',
servicio_cod_negocio INT4                 not null default 62,
servicio_desc_negocio VARCHAR(250)         not null default 'NO DEFINIDO',
servicio_desc        VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_SERVICIO primary key (servicio_key)
);

/*==============================================================*/
/* Table: dim_tiempo                                            */
/*==============================================================*/
create table dim_tiempo (
tiempo_key           SERIAL               not null,
tiempo_fecha         DATE                 not null,
tiempo_dia_semana    INT2                 not null,
tiempo_dia_mes       INT2                 not null,
tiempo_nombre_dia    VARCHAR(9)           not null,
tiempo_semana_mes    INT2                 not null,
tiempo_semana_anio   INT2                 not null,
tiempo_mes           INT2                 not null,
tiempo_nombre_mes    VARCHAR(10)          not null,
tiempo_trimestre     INT2                 not null,
tiempo_nombre_trimestre CHAR(7)              not null,
tiempo_semestre      INT2                 not null,
tiempo_nombre_semestre CHAR(7)              not null,
tiempo_anio          INT2                 not null,
tiempo_es_feriado    CHAR(2)              not null default 'No',
constraint PK_DIM_TIEMPO primary key (tiempo_key)
);

/*==============================================================*/
/* Table: dim_tipo_documento                                    */
/*==============================================================*/
create table dim_tipo_documento (
tipo_documento_key   INT4                 not null default 0,
tipo_documento_cod   CHAR(2)              not null default '-',
tipo_documento_desc  VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_TIPO_DOCUMENTO primary key (tipo_documento_key)
);

/*==============================================================*/
/* Table: dim_tipo_pago                                         */
/*==============================================================*/
create table dim_tipo_pago (
tipo_pago_key        INT4                 not null default 0,
tipo_pago_cod        CHAR(2)              not null default '-',
tipo_pago_desc       VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_TIPO_PAGO primary key (tipo_pago_key)
);

/*==============================================================*/
/* Table: dim_tipo_reparto                                      */
/*==============================================================*/
create table dim_tipo_reparto (
tipo_reparto_key     INT4                 not null default 0,
tipo_reparto_cod     CHAR(2)              not null default '-',
tipo_reparto_desc    VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_TIPO_REPARTO primary key (tipo_reparto_key)
);

/*==============================================================*/
/* Table: dim_tipo_ruta                                         */
/*==============================================================*/
create table dim_tipo_ruta (
tipo_ruta_key        INT4                 not null default 0,
tipo_ruta_cod        CHAR(2)              not null default '-',
tipo_ruta_desc       VARCHAR(250)         not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_TIPO_RUTA primary key (tipo_ruta_key)
);

/*==============================================================*/
/* Table: dim_zona                                              */
/*==============================================================*/
create table dim_zona (
zona_key             INT4                 not null default 0,
zona_cod_pais        INT4                 not null default 386,
zona_desc_pais       VARCHAR(250)         not null default 'NO DEFINIDO',
zona_cod_departamento INT4                 not null default 412,
zona_desc_departamento VARCHAR(250)         not null default 'NO DEFINIDO',
zona_cod_provincia   INT4                 not null default 607,
zona_desc_provincia  VARCHAR(250)         not null default 'NO DEFINIDO',
zona_cod_distrito    INT4                 not null default 2440,
zona_desc_distrito   VARCHAR(250)         not null default 'NO DEFINIDO',
zona_cod             VARCHAR(10)          not null default '-',
zona_desc            VARCHAR(250)         not null default '-',
zona_cod_postal      VARCHAR(10)          not null default '-',
proc_id              INT4                 not null default 0,
constraint PK_DIM_ZONA primary key (zona_key)
);

/*==============================================================*/
/* Table: fact_cotizacion                                       */
/*==============================================================*/
create table fact_cotizacion (
cotizacion_key       INT4                 not null default 0,
cotizacion_key_cliente_area INT4                 not null default 0,
cotizacion_key_ubigeo_cliente INT4                 not null default 0,
cotizacion_key_servicio INT4                 not null default 0,
cotizacion_key_producto INT4                 not null default 0,
cotizacion_key_fec_apro INT4                 not null default 0,
cotizacion_key_fec_ini INT4                 not null default 0,
cotizacion_key_fec_fin INT4                 not null default 0,
cotizacion_key_estado INT4                 not null default 60,
cotizacion_ind_unidad INT2                 not null default 1,
cotizacion_cnt_ord_total INT4                 not null default 0,
cotizacion_cnt_ord_en_trab INT4                 not null default 0,
cotizacion_cnt_ord_cer INT4                 not null default 0,
cotizacion_cnt_ord_catiempo INT4                 not null default 0,
cotizacion_cnt_ord_cftiempo INT4                 not null default 0,
cotizacion_cnt_ord_fac INT4                 not null default 0,
cotizacion_cnt_ord_can INT4                 not null default 0,
cotizacion_mon_importe NUMERIC(15,4)        not null default 0,
cotizacion_mon_igv   NUMERIC(15,4)        not null default 0,
cotizacion_mon_total NUMERIC(15,4)        not null default 0,
proc_id              INT4                 not null default 0,
constraint PK_FACT_COTIZACION primary key (cotizacion_key)
);

/*==============================================================*/
/* Table: fact_despacho                                         */
/*==============================================================*/
create table fact_despacho (
despacho_key         INT4                 not null default 0,
despacho_key_sede    INT4                 not null default 0,
despacho_key_zona    INT4                 not null default 0,
despacho_key_personal INT4                 not null default 0,
despacho_key_tipo_ruta INT4                 not null default 0,
despacho_key_fec_sal INT4                 not null default 0,
despacho_key_fec_retp INT4                 not null default 0,
despacho_key_fec_retr INT4                 not null default 0,
despacho_key_estado  INT4                 not null default 84,
despacho_mon_pasaje  NUMERIC(15,4)        not null default 0,
despacho_ind_unidad  INT2                 not null default 1,
despacho_cnt_dias_exc INT4                 not null default 0,
despacho_cnt_cargos  INT4                 not null default 0,
despacho_cnt_ent     INT4                 not null default 0,
despacho_cnt_mot     INT4                 not null default 0,
despacho_cnt_ree     INT4                 not null default 0,
despacho_cnt_anu     INT4                 not null default 0,
despacho_cnt_fue_zon INT4                 not null default 0,
despacho_cnt_perd    INT4                 not null default 0,
despacho_cnt_dig     INT4                 not null default 0,
despacho_cnt_rut     INT4                 not null default 0,
despacho_cnt_pro     INT4                 not null default 0,
despacho_cnt_rob     INT4                 not null default 0,
despacho_trab_en_fec INT2                 not null default 0,
despacho_trab_fuera_fec INT2                 not null default 0,
proc_id              INT4                 not null default 0,
constraint PK_FACT_DESPACHO primary key (despacho_key)
);

/*==============================================================*/
/* Table: fact_envio                                            */
/*==============================================================*/
create table fact_envio (
envio_key            INT4                 not null default 0,
envio_key_cliente_area INT4                 not null default 0,
envio_key_ubigeo_cliente INT4                 not null default 0,
envio_key_servicio   INT4                 not null default 0,
envio_key_producto   INT4                 not null default 0,
envio_key_zona       INT4                 not null default 0,
envio_key_personal   INT4                 not null default 0,
envio_key_fec_sal    INT4                 not null default 0,
envio_key_fec_retp   INT4                 not null default 0,
envio_key_fec_retr   INT4                 not null default 0,
envio_key_estado     INT4                 not null default 17,
envio_ind_unidad     INT2                 not null default 1,
envio_ind_ent        INT2                 not null default 0,
envio_ind_mot        INT2                 not null default 0,
envio_ind_ree        INT2                 not null default 0,
envio_ind_anu        INT2                 not null default 0,
envio_ind_fue_zon    INT2                 not null default 0,
envio_ind_perd       INT2                 not null default 0,
envio_ind_dig        INT2                 not null default 0,
envio_ind_rut        INT2                 not null default 0,
envio_ind_pro        INT2                 not null default 0,
envio_ind_rob        INT2                 not null default 0,
proc_id              INT4                 not null default 0,
constraint PK_FACT_ENVIO primary key (envio_key)
);

/*==============================================================*/
/* Table: fact_orden                                            */
/*==============================================================*/
create table fact_orden (
orden_key            INT4                 not null default 0,
orden_key_cliente_area INT4                 not null default 0,
orden_key_ubigeo_cliente INT4                 not null default 0,
orden_key_servicio   INT4                 not null default 0,
orden_key_producto   INT4                 not null default 0,
orden_key_tipo_reparto INT4                 not null default 0,
orden_key_tipo_documento INT4                 not null default 0,
orden_key_tipo_pago  INT4                 not null default 0,
orden_key_moneda     INT4                 not null default 0,
orden_key_fec_ini    INT4                 not null default 0,
orden_key_fec_ven    INT4                 not null default 0,
orden_key_fec_cie    INT4                 not null default 0,
orden_key_fec_dev    INT4                 not null default 0,
orden_key_fec_fac    INT4                 not null default 0,
orden_key_estado     INT4                 not null default 97,
orden_key_facturado  INT4                 not null default 0,
orden_aten_en_fec    INT2                 not null default 0,
orden_aten_fuera_fec INT2                 not null default 0,
orden_ind_unidad     INT2                 not null default 1,
orden_cnt_dias_exc   INT4                 not null default 0,
orden_cnt_cargos     INT4                 not null default 0,
orden_cnt_cargos_anu INT4                 not null default 0,
orden_cnt_cargos_ent INT4                 not null default 0,
orden_cnt_cargos_fue_zon INT4                 not null default 0,
orden_cnt_cargos_mot INT4                 not null default 0,
orden_cnt_cargos_perd INT4                 not null default 0,
orden_cnt_cargos_ree INT4                 not null default 0,
orden_cnt_cargos_dig INT4                 not null default 0,
orden_cnt_cargos_rut INT4                 not null default 0,
orden_cnt_cargos_pro INT4                 not null default 0,
orden_cnt_cargos_rob INT4                 not null default 0,
orden_mon_importe    NUMERIC(14,4)        not null default 0,
orden_mon_descuento  NUMERIC(14,4)        not null default 0,
orden_mon_igv        NUMERIC(14,4)        not null default 0,
orden_mon_total      NUMERIC(14,4)        not null default 0,
proc_id              INT4                 not null default 0,
constraint PK_FACT_ORDEN primary key (orden_key)
);
