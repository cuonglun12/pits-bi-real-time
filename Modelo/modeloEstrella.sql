drop table dim_producto;

/*==============================================================*/
/* Table: dim_producto                                          */
/*==============================================================*/
create table dim_producto (
key_producto         SERIAL               not null,
cod_producto         CHAR(4)              null,
des_producto         VARCHAR(100)         null,
cod_tipo             CHAR(1)              null,
des_tipo             VARCHAR(100)         null,
constraint PK_DIM_PRODUCTO primary key (key_producto)
);

drop table dim_servicio;

/*==============================================================*/
/* Table: dim_servicio                                          */
/*==============================================================*/
create table dim_servicio (
key_servicio         SERIAL               not null,
cod_negocio          CHAR(2)              null,
des_negocio          VARCHAR(100)         null,
cod_ambito           CHAR(2)              null,
des_ambito           VARCHAR(100)         null,
cod_servicio         CHAR(4)              null,
des_servicio         VARCHAR(200)         null,
constraint PK_DIM_SERVICIO primary key (key_servicio)
);

drop table dim_cliente;

/*==============================================================*/
/* Table: dim_cliente                                           */
/*==============================================================*/
create table dim_cliente (
key_cliente          SERIAL               not null,
cod_cliente          CHAR(11)             not null,
des_cliente          VARCHAR(200)         not null,
cod_tipocliente      CHAR(1)              not null,
des_tipocliente      VARCHAR(100)         not null,
cod_area             CHAR(15)             null,
des_area             VARCHAR(150)         null,
cod_rubro            SERIAL               not null,
des_rubro            VARCHAR(100)         not null,
des_direccion        VARCHAR(200)         not null,
cod_pais             CHAR(2)              not null,
cod_departamento     CHAR(2)              not null,
cod_provincia        CHAR(4)              not null,
cod_distrito         CHAR(6)              not null,
cod_ubigeo           CHAR(6)              not null,
des_pais             VARCHAR(100)         not null,
des_departamento     VARCHAR(100)         not null,
des_provincia        VARCHAR(100)         not null,
des_distrito         VARCHAR(100)         not null,
cod_tipocredito      CHAR(1)              not null,
des_tipocredito      VARCHAR(100)         not null,
constraint PK_DIM_CLIENTE primary key (key_cliente)
);

drop table dim_estado;

/*==============================================================*/
/* Table: dim_estado                                            */
/*==============================================================*/
create table dim_estado (
key_estado           SERIAL               not null,
cod_estado           CHAR(6)              null,
des_estado           VARCHAR(100)         null,
cod_tipo             CHAR(2)              null,
des_tipo             VARCHAR(100)         null,
cod_estadofecha      CHAR(2)              null,
des_estadofecha      VARCHAR(100)         null,
constraint PK_DIM_ESTADO primary key (key_estado)
);


drop table dim_localizacion;

/*==============================================================*/
/* Table: dim_localizacion                                      */
/*==============================================================*/
create table dim_localizacion (
key_localizacion     SERIAL               not null,
cod_pais             CHAR(2)              null,
cod_departamento     CHAR(2)              null,
cod_provincia        CHAR(4)              null,
cod_distrito         CHAR(6)              null,
cod_ubigeo           CHAR(6)              null,
des_pais             VARCHAR(100)         null,
des_departamento     VARCHAR(100)         null,
des_provincia        VARCHAR(100)         null,
des_distrito         VARCHAR(100)         null,
cod_postal           CHAR(3)              null default '000',
cod_zona             CHAR(6)              null default '000000',
constraint PK_DIM_LOCALIZACION primary key (key_localizacion)
);


drop table dim_personal;

/*==============================================================*/
/* Table: dim_personal                                          */
/*==============================================================*/
create table dim_personal (
key_personal         SERIAL               not null,
cod_codigopersonal   CHAR(6)              null,
cod_tipopersonal     CHAR(2)              null,
cod_departamento     CHAR(4)              null,
des_departamento     VARCHAR(100)         null,
des_nombre           VARCHAR(100)         null,
cod_estadocivil      CHAR(2)              null,
des_estadocivil      VARCHAR(100)         null,
fec_fechaingreso     DATE                 null,
fec_fechacese        DATE                 null,
cod_sexo             CHAR(1)              null,
des_sexo             VARCHAR(100)         null,
constraint PK_DIM_PERSONAL primary key (key_personal)
);


drop table dim_sede;

/*==============================================================*/
/* Table: dim_sede                                              */
/*==============================================================*/
create table dim_sede (
key_sede             SERIAL               not null,
cod_sede             CHAR(3)              null,
des_nombre           VARCHAR(100)         null,
des_direccion        VARCHAR(100)         null,
cod_ubigeo           CHAR(6)              null,
des_distrito         VARCHAR(100)         null,
cod_estado           CHAR(1)              null,
des_estado           CHAR(2)              null,
des_alias            VARCHAR(100)         null,
constraint PK_DIM_SEDE primary key (key_sede)
);

drop table dim_tiempo;

/*==============================================================*/
/* Table: dim_tiempo                                            */
/*==============================================================*/
create table dim_tiempo (
key_tiempo           SERIAL               not null,
num_anio             INT4                 null,
num_trimestre        INT2                 null,
num_mes              INT2                 null,
num_dia_mes          INT2                 null,
num_dia_semana       INT2                 null,
num_semana_mes       INT2                 null,
des_mes              VARCHAR(10)          null,
des_trimestre        CHAR(2)              null,
des_dia_semana       VARCHAR(9)           null,
fec_fecha            DATE                 null,
constraint PK_DIM_TIEMPO primary key (key_tiempo)
);

drop table fac_orden;

/*==============================================================*/
/* Table: fac_orden                                             */
/*==============================================================*/
create table fac_orden (
key_cliente          INT8                 null,
key_servicio         INT4                 null,
key_producto         INT4                 null,
key_tiempo_registro  INT8                 null,
key_tiempo_inicio    INT8                 null,
key_tiempo_vencimiento INT8                 null,
key_tiempo_cierre    INT8                 null,
key_tiempo_devolucion INT8                 null,
key_estado           INT4                 null,
num_dias_excedidos   INT4                 null default 0,
cod_serie            CHAR(3)              null,
cod_orden            CHAR(7)              null,
num_cargos           INT8                 null default 0,
num_cargos_anulados  INT8                 null default 0,
num_cargos_entregados INT8                 null default 0,
num_cargos_fuerazona INT8                 null default 0,
num_cargos_motivados INT8                 null default 0,
num_cargos_perdidos  INT8                 null default 0,
num_cargos_reenvios  INT8                 null default 0,
num_ord_cef          INT8                 null default 0,
num_ord_cff          INT8                 null default 0,
num_ord_pef          INT8                 null default 0,
num_ord_pff          INT8                 null default 0,
num_ord_anulados     INT8                 null default 0,
num_ord_incosistentes INT8                 null,
num_ord              INT8                 null,
num_importe          NUMERIC(15,4)        null default 0,
num_igv              NUMERIC(15,4)        null default 0,
num_total            NUMERIC(15,4)        null default 0
);

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_TIEM_TREGIS foreign key (key_tiempo_registro)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_CLIE foreign key (key_cliente)
      references dim_cliente (key_cliente)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_TIEM_TINICIO foreign key (key_tiempo_inicio)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_TIEM_TVENCI foreign key (key_tiempo_vencimiento)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_TIEM_TDEVO foreign key (key_tiempo_devolucion)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_ESTA foreign key (key_estado)
      references dim_estado (key_estado)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_TIEM_TCIERRE foreign key (key_tiempo_cierre)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_PROD foreign key (key_producto)
      references dim_producto (key_producto)
      on delete restrict on update restrict;

alter table fac_orden
   add constraint FK_FAC_ORDE_DIM_SERV foreign key (key_servicio)
      references dim_servicio (key_servicio)
      on delete restrict on update restrict;
	  
drop table fac_guia;

/*==============================================================*/
/* Table: fac_guia                                              */
/*==============================================================*/
create table fac_guia (
key_localizacion     INT4                 null,
key_tiempo_salida    INT8                 null,
key_tiempo_retorno   INT8                 null,
key_tiempo_retorno_real INT8                 null,
key_estado_guia      INT4                 null,
key_personal_mensajero INT4                 null,
key_sede             INT4                 null,
num_dias_excedidos   INT4                 null,
cod_serie            CHAR(3)              null,
cod_guia             CHAR(6)              null,
num_cargos_total     INT8                 null,
num_cargos_entregados INT8                 null,
num_cargos_motivados INT8                 null,
num_cargos_reenvios  INT8                 null,
num_cargos_anulados  INT8                 null,
num_cargos_fuerazona INT8                 null,
num_cargos_perdidos  INT8                 null,
num_gui_def          INT8                 null,
num_gui_dff          INT8                 null,
num_gui_ref          INT8                 null,
num_gui_rff          INT8                 null,
num_gui_cef          INT8                 null,
num_gui_cff          INT8                 null,
num_gui_gef          INT8                 null,
num_gui_gff          INT8                 null,
num_gui_pef          INT8                 null,
num_gui_pff          INT8                 null,
num_gui_anulados     INT8                 null,
num_gui_incosistentes INT8                 null,
num_guias            INT8                 null
);

alter table fac_guia
   add constraint FK_FAC_GUIA_DIM_TIEMPO_TSALIDA foreign key (key_tiempo_retorno)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_guia
   add constraint FK_FAC_GUIA_DIM_PERS foreign key (key_personal_mensajero)
      references dim_personal (key_personal)
      on delete restrict on update restrict;

alter table fac_guia
   add constraint FK_FAC_GUIA_DIM_LOCA foreign key (key_localizacion)
      references dim_localizacion (key_localizacion)
      on delete restrict on update restrict;

alter table fac_guia
   add constraint FK_FAC_GUIA_DIM_TIEMPO_TRETORNO foreign key (key_tiempo_salida)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_guia
   add constraint FK_FAC_GUIA_DIM_ESTA foreign key (key_estado_guia)
      references dim_estado (key_estado)
      on delete restrict on update restrict;

alter table fac_guia
   add constraint FK_FAC_GUIA_DIM_SEDE foreign key (key_sede)
      references dim_sede (key_sede)
      on delete restrict on update restrict;

alter table fac_guia
   add constraint FK_FAC_GUIA_DIM_TIEMPO_TRETORNO_REAL foreign key (key_tiempo_retorno_real)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;
drop table fac_envio;

/*==============================================================*/
/* Table: fac_envio                                             */
/*==============================================================*/
create table fac_envio (
key_localizacion     INT4                 null,
key_cliente          INT8                 null,
key_servicio         INT4                 null,
key_producto         INT4                 null,
key_tiempo_salida    INT8                 null,
key_tiempo_entrada   INT8                 null,
key_estado_guia      INT4                 null,
key_personal_mensajero INT4                 null,
key_personal_salida  INT4                 null,
key_personal_entrada INT4                 null,
cod_serie            CHAR(3)              null,
cod_guia             CHAR(6)              null,
num_cargos_total     INT8                 null,
num_cargos_entregados INT8                 null,
num_cargos_motivados INT8                 null,
num_cargos_reenvios  INT8                 null,
num_cargos_anulados  INT8                 null,
num_cargos_fuerazona INT8                 null,
num_cargos_perdidos  INT8                 null
);

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_LOCA foreign key (key_localizacion)
      references dim_localizacion (key_localizacion)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_CLIE foreign key (key_cliente)
      references dim_cliente (key_cliente)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_SERV foreign key (key_servicio)
      references dim_servicio (key_servicio)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ORDE_DIM_PERS_PROD foreign key (key_producto)
      references dim_producto (key_producto)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_TIEM_TSALI foreign key (key_tiempo_salida)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_TIEM_TENTRA foreign key (key_tiempo_entrada)
      references dim_tiempo (key_tiempo)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_ESTADO foreign key (key_estado_guia)
      references dim_estado (key_estado)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_PERS_MENSA foreign key (key_personal_mensajero)
      references dim_personal (key_personal)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_PERS_PENTRA foreign key (key_personal_entrada)
      references dim_personal (key_personal)
      on delete restrict on update restrict;

alter table fac_envio
   add constraint FK_FAC_ENVI_DIM_PERS_PSALID foreign key (key_personal_salida)
      references dim_personal (key_personal)
      on delete restrict on update restrict;