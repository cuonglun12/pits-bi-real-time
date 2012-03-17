/*
drop index IDX_ARE_CLI_04;

drop index IDX_ARE_CLI_03;

drop index IDX_ARE_CLI_02;

drop index IDX_ARE_CLI_01;

drop index IDX_ARE_CLI_00;

drop table T_AREA_CLIENTE;

drop index IDX_CARG_10;

drop index IDX_CARG_09;

drop index IDX_CARG_08;

drop index IDX_CARG_07;

drop index IDX_CARG_06;

drop index IDX_CARG_05;

drop index IDX_CARG_04;

drop index IDX_CARG_03;

drop index IDX_CARG_02;

drop index IDX_CARG_01;

drop index IDX_CARG_00;

drop table T_CARGO;

drop index IDX_CAR_DESP_10;

drop index IDX_CAR_DESP_09;

drop index IDX_CAR_DESP_08;

drop index IDX_CAR_DESP_07;

drop index IDX_CAR_DESP_06;

drop index IDX_CAR_DESP_05;

drop index IDX_CAR_DESP_04;

drop index IDX_CAR_DESP_03;

drop index IDX_CAR_DESP_02;

drop index IDX_CAR_DESP_01;

drop index IDX_CAR_DESP_00;

drop table T_CARGO_DESPACHO;

drop index IDX_CLI_06;

drop index IDX_CLI_05;

drop index IDX_CLI_04;

drop index IDX_CLI_03;

drop index IDX_CLI_02;

drop index IDX_CLI_01;

drop index IDX_CLI_00;

drop table T_CLIENTE;

drop index IDX_COTI_10;

drop index IDX_COTI_09;

drop index IDX_COTI_08;

drop index IDX_COTI_07;

drop index IDX_COTI_06;

drop index IDX_COTI_05;

drop index IDX_COTI_04;

drop index IDX_COTI_03;

drop index IDX_COTI_02;

drop index IDX_COTI_01;

drop index IDX_COTI_00;

drop table T_COTIZACION;

drop index IDX_DESP_11;

drop index IDX_DESP_10;

drop index IDX_DESP_09;

drop index IDX_DESP_08;

drop index IDX_DESP_07;

drop index IDX_DESP_06;

drop index IDX_DESP_05;

drop index IDX_DESP_04;

drop index IDX_DESP_03;

drop index IDX_DESP_02;

drop index IDX_DESP_01;

drop index IDX_DESP_00;

drop table T_DESPACHO;

drop index IDX_EMP_02;

drop index IDX_EMP_01;

drop index IDX_EMP_00;

drop table T_EMPLEADO;

drop index IDX_EMP_CAT_03;

drop index IDX_EMP_CAT_02;

drop index IDX_EMP_CAT_01;

drop index IDX_EMP_CAT_00;

drop table T_EMPLEADO_CATEGORIA;

drop index IDX_LIQ_05;

drop index IDX_LIQ_04;

drop index IDX_LIQ_03;

drop index IDX_LIQ_02;

drop index IDX_LIQ_01;

drop index IDX_LIQ_00;

drop table T_LIQUIDACION;

drop index IDX_ORD_14;

drop index IDX_ORD_13;

drop index IDX_ORD_12;

drop index IDX_ORD_11;

drop index IDX_ORD_10;

drop index IDX_ORD_09;

drop index IDX_ORD_08;

drop index IDX_ORD_07;

drop index IDX_ORD_06;

drop index IDX_ORD_05;

drop index IDX_ORD_04;

drop index IDX_ORD_03;

drop index IDX_ORD_02;

drop index IDX_ORD_01;

drop index IDX_ORD_00;

drop table T_ORDEN;

drop index IDX_PROD_04;

drop index IDX_PROD_03;

drop index IDX_PROD_02;

drop index IDX_PROD_01;

drop index IDX_PROD_00;

drop table T_PRODUCTO;

drop index IDX_SED_03;

drop index IDX_SED_02;

drop index IDX_SED_01;

drop index IDX_SED_00;

drop table T_SEDE;

drop index IDX_SERV_03;

drop index IDX_SERV_02;

drop index IDX_SERV_01;

drop index IDX_SERV_00;

drop table T_SERVICIO;

drop index IDX_UBI_04;

drop index IDX_UBI_03;

drop index IDX_UBI_02;

drop index IDX_UBI_01;

drop index IDX_UBI_00;

drop table T_UBIGEO;

drop index IDX_ZON_03;

drop index IDX_ZON_02;

drop index IDX_ZON_01;

drop index IDX_ZON_00;

drop table T_ZONA;
*/
/*==============================================================*/
/* Table: T_AREA_CLIENTE                                        */
/*==============================================================*/
create table T_AREA_CLIENTE (
   ARE_CLI_ID           SERIAL               not null,
   CLI_ID               INT4                 not null default 0,
   ARE_CLI_COD_TIP      INT4                 not null default 0,
   UBI_ID               INT4                 not null default 0,
   ARE_CLI_DES          VARCHAR(250)         not null default '-',
   ARE_CLI_DES_DIR      VARCHAR(250)         null default '-',
   ARE_CLI_COD          VARCHAR(30)          not null default '-',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_AREA_CLIENTE primary key (ARE_CLI_ID)
);

/*==============================================================*/
/* Index: IDX_ARE_CLI_00                                        */
/*==============================================================*/
create  index IDX_ARE_CLI_00 on T_AREA_CLIENTE (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_ARE_CLI_01                                        */
/*==============================================================*/
create  index IDX_ARE_CLI_01 on T_AREA_CLIENTE (
CLI_ID
);

/*==============================================================*/
/* Index: IDX_ARE_CLI_02                                        */
/*==============================================================*/
create  index IDX_ARE_CLI_02 on T_AREA_CLIENTE (
ARE_CLI_COD_TIP
);

/*==============================================================*/
/* Index: IDX_ARE_CLI_03                                        */
/*==============================================================*/
create  index IDX_ARE_CLI_03 on T_AREA_CLIENTE (
UBI_ID
);

/*==============================================================*/
/* Index: IDX_ARE_CLI_04                                        */
/*==============================================================*/
create unique index IDX_ARE_CLI_04 on T_AREA_CLIENTE (
ARE_CLI_COD
);

/*==============================================================*/
/* Table: T_CARGO                                               */
/*==============================================================*/
create table T_CARGO (
   CARG_ID              SERIAL               not null,
   CARG_CORR            INT4                 not null default 0,
   ORD_ID               INT4                 not null default 0,
   PROD_ID              INT4                 not null default 0,
   ZON_ID               INT4                 not null default 0,
   ZON_ID_NEW           INT4                 not null default 0,
   CARG_COD_MOV         INT4                 not null default 0,
   CARG_COD_TIP_ING     INT4                 not null default 0,
   CARG_COD_FEC_DES     DATE                 not null default '1900-01-01',
   CARG_COD_FEC_REC     DATE                 not null default '1900-01-01',
   CARG_DESTINATARIO    VARCHAR(250)         not null default '-',
   CARG_DIR             VARCHAR(250)         not null default '-',
   CARG_REF             VARCHAR(250)         not null default '-',
   CARG_NEW_DIR         VARCHAR(250)         not null default '-',
   CARG_NEW_REF         VARCHAR(250)         not null default '-',
   CARG_COD_EST         INT4                 not null default 0,
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_CARGO primary key (CARG_ID)
);

/*==============================================================*/
/* Index: IDX_CARG_00                                           */
/*==============================================================*/
create  index IDX_CARG_00 on T_CARGO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_CARG_01                                           */
/*==============================================================*/
create unique index IDX_CARG_01 on T_CARGO (
CARG_CORR,
ORD_ID
);

/*==============================================================*/
/* Index: IDX_CARG_02                                           */
/*==============================================================*/
create  index IDX_CARG_02 on T_CARGO (
CARG_CORR
);

/*==============================================================*/
/* Index: IDX_CARG_03                                           */
/*==============================================================*/
create  index IDX_CARG_03 on T_CARGO (
ORD_ID
);

/*==============================================================*/
/* Index: IDX_CARG_04                                           */
/*==============================================================*/
create  index IDX_CARG_04 on T_CARGO (
PROD_ID
);

/*==============================================================*/
/* Index: IDX_CARG_05                                           */
/*==============================================================*/
create  index IDX_CARG_05 on T_CARGO (
ZON_ID
);

/*==============================================================*/
/* Index: IDX_CARG_06                                           */
/*==============================================================*/
create  index IDX_CARG_06 on T_CARGO (
ZON_ID_NEW
);

/*==============================================================*/
/* Index: IDX_CARG_07                                           */
/*==============================================================*/
create  index IDX_CARG_07 on T_CARGO (
CARG_COD_MOV
);

/*==============================================================*/
/* Index: IDX_CARG_08                                           */
/*==============================================================*/
create  index IDX_CARG_08 on T_CARGO (
CARG_COD_TIP_ING
);

/*==============================================================*/
/* Index: IDX_CARG_09                                           */
/*==============================================================*/
create  index IDX_CARG_09 on T_CARGO (
CARG_COD_FEC_DES
);

/*==============================================================*/
/* Index: IDX_CARG_10                                           */
/*==============================================================*/
create  index IDX_CARG_10 on T_CARGO (
CARG_COD_FEC_REC
);

/*==============================================================*/
/* Table: T_CARGO_DESPACHO                                      */
/*==============================================================*/
create table T_CARGO_DESPACHO (
   CAR_DESP_ID          SERIAL               not null,
   DESP_ID              INT4                 not null default 0,
   CARG_ID              INT4                 not null default 0,
   ZON_ID               INT4                 null default 0,
   CAR_DESP_COD_MOV     INT4                 not null default 0,
   CAR_DESP_COD_VER     INT4                 not null default 0,
   CAR_DESP_DIR         VARCHAR(250)         not null default '-',
   CAR_DESP_REF         VARCHAR(250)         not null default '-',
   CAR_DESP_FEC_SAL     DATE                 not null default '1900-01-01',
   CAR_DESP_FEC_RET_PRO DATE                 not null default '1900-01-01',
   CAR_DESP_FEC_RET_REA DATE                 not null default '1900-01-01',
   CAR_DESP_FEC_VER     DATE                 not null default '1900-01-01',
   CAR_DESP_COD_EST     INT4                 not null default 0,
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_CARGO_DESPACHO primary key (CAR_DESP_ID)
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_00                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_00 on T_CARGO_DESPACHO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_01                                       */
/*==============================================================*/
create unique index IDX_CAR_DESP_01 on T_CARGO_DESPACHO (
DESP_ID,
CARG_ID
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_02                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_02 on T_CARGO_DESPACHO (
DESP_ID
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_03                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_03 on T_CARGO_DESPACHO (
CARG_ID
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_04                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_04 on T_CARGO_DESPACHO (
CAR_DESP_COD_MOV
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_05                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_05 on T_CARGO_DESPACHO (
ZON_ID
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_06                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_06 on T_CARGO_DESPACHO (
CAR_DESP_COD_VER
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_07                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_07 on T_CARGO_DESPACHO (
CAR_DESP_FEC_SAL
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_08                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_08 on T_CARGO_DESPACHO (
CAR_DESP_FEC_RET_PRO
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_09                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_09 on T_CARGO_DESPACHO (
CAR_DESP_FEC_RET_REA
);

/*==============================================================*/
/* Index: IDX_CAR_DESP_10                                       */
/*==============================================================*/
create  index IDX_CAR_DESP_10 on T_CARGO_DESPACHO (
CAR_DESP_FEC_VER
);

/*==============================================================*/
/* Table: T_CLIENTE                                             */
/*==============================================================*/
create table T_CLIENTE (
   CLI_ID               SERIAL               not null,
   CLI_COD_TIP          INT4                 not null default 0,
   CLI_COD_CAT          INT4                 not null default 0,
   CLI_COD_TIP_DOC      INT4                 not null default 0,
   CLI_NUM_TIP_DOC      VARCHAR(15)          not null default '-',
   CLI_DES_RAZ_SOC      VARCHAR(250)         not null default '-',
   CLI_DES_APE_PAT      VARCHAR(100)         not null default '-',
   CLI_DES_APE_MAT      VARCHAR(100)         not null default '-',
   CLI_DES_NOM          VARCHAR(100)         not null default '-',
   CLI_COD_TIP_FAC      INT4                 not null default 0,
   CLI_COD_TIP_CRE      INT4                 not null default 0,
   UBI_ID               INT4                 not null default 0,
   CLI_COD              VARCHAR(20)          not null default '-',
   CLI_NUM_TEL          VARCHAR(50)          not null default '-',
   CLI_DES_COR          VARCHAR(100)         not null default '-',
   CLI_DES_DIR          VARCHAR(250)         not null default '-',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_CLIENTE primary key (CLI_ID)
);

/*==============================================================*/
/* Index: IDX_CLI_00                                            */
/*==============================================================*/
create  index IDX_CLI_00 on T_CLIENTE (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_CLI_01                                            */
/*==============================================================*/
create  index IDX_CLI_01 on T_CLIENTE (
CLI_COD_TIP
);

/*==============================================================*/
/* Index: IDX_CLI_02                                            */
/*==============================================================*/
create  index IDX_CLI_02 on T_CLIENTE (
CLI_COD_CAT
);

/*==============================================================*/
/* Index: IDX_CLI_03                                            */
/*==============================================================*/
create  index IDX_CLI_03 on T_CLIENTE (
UBI_ID
);

/*==============================================================*/
/* Index: IDX_CLI_04                                            */
/*==============================================================*/
create  index IDX_CLI_04 on T_CLIENTE (
CLI_COD_TIP_FAC
);

/*==============================================================*/
/* Index: IDX_CLI_05                                            */
/*==============================================================*/
create  index IDX_CLI_05 on T_CLIENTE (
CLI_COD_TIP_CRE
);

/*==============================================================*/
/* Index: IDX_CLI_06                                            */
/*==============================================================*/
create unique index IDX_CLI_06 on T_CLIENTE (
CLI_COD
);

/*==============================================================*/
/* Table: T_COTIZACION                                          */
/*==============================================================*/
create table T_COTIZACION (
   COTI_ID              SERIAL               not null,
   EMP_CAT_ID           INT4                 not null default 0,
   ARE_CLI_ID           INT4                 not null default 0,
   PROD_ID              INT4                 not null default 0,
   COTI_COD_AMB         INT4                 not null default 0,
   COTI_COD_SERV        INT4                 not null default 0,
   COTI_COD_NEG         INT4                 not null default 0,
   COTI_COD_TIP_DOC     INT4                 not null default 0,
   COTI_SERIE_DOC       VARCHAR(6)           not null default '-',
   COTI_NUM_DOC         VARCHAR(10)          not null default '-',
   COTI_COD_EST         INT4                 not null default 0,
   COTI_FEC_APRO        DATE                 not null default '1900-01-01',
   COTI_FEC_INI         DATE                 not null default '1900-01-01',
   COTI_FEC_FIN         DATE                 not null default '1900-01-01',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_COTIZACION primary key (COTI_ID)
);

/*==============================================================*/
/* Index: IDX_COTI_00                                           */
/*==============================================================*/
create  index IDX_COTI_00 on T_COTIZACION (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_COTI_01                                           */
/*==============================================================*/
create  index IDX_COTI_01 on T_COTIZACION (
EMP_CAT_ID
);

/*==============================================================*/
/* Index: IDX_COTI_02                                           */
/*==============================================================*/
create  index IDX_COTI_02 on T_COTIZACION (
ARE_CLI_ID
);

/*==============================================================*/
/* Index: IDX_COTI_03                                           */
/*==============================================================*/
create  index IDX_COTI_03 on T_COTIZACION (
COTI_COD_AMB
);

/*==============================================================*/
/* Index: IDX_COTI_04                                           */
/*==============================================================*/
create  index IDX_COTI_04 on T_COTIZACION (
COTI_COD_SERV
);

/*==============================================================*/
/* Index: IDX_COTI_05                                           */
/*==============================================================*/
create  index IDX_COTI_05 on T_COTIZACION (
COTI_COD_NEG
);

/*==============================================================*/
/* Index: IDX_COTI_06                                           */
/*==============================================================*/
create  index IDX_COTI_06 on T_COTIZACION (
COTI_FEC_APRO
);

/*==============================================================*/
/* Index: IDX_COTI_07                                           */
/*==============================================================*/
create  index IDX_COTI_07 on T_COTIZACION (
COTI_FEC_INI
);

/*==============================================================*/
/* Index: IDX_COTI_08                                           */
/*==============================================================*/
create  index IDX_COTI_08 on T_COTIZACION (
COTI_FEC_FIN
);

/*==============================================================*/
/* Index: IDX_COTI_09                                           */
/*==============================================================*/
create unique index IDX_COTI_09 on T_COTIZACION (
COTI_COD_TIP_DOC,
COTI_SERIE_DOC,
COTI_NUM_DOC
);

/*==============================================================*/
/* Index: IDX_COTI_10                                           */
/*==============================================================*/
create  index IDX_COTI_10 on T_COTIZACION (
PROD_ID
);

/*==============================================================*/
/* Table: T_DESPACHO                                            */
/*==============================================================*/
create table T_DESPACHO (
   DESP_ID              SERIAL               not null,
   DESP_COD_TIP_DOC     INT4                 not null default 0,
   DESP_SERIE_DOC       VARCHAR(6)           not null default '-',
   DESP_NUMERO_DOC      VARCHAR(10)          not null default '-',
   SED_ID               INT4                 not null default 0,
   ZON_ID               INT4                 not null default 0,
   EMP_CAT_ID           INT4                 not null default 0,
   DESP_COD_TIP         INT4                 not null default 0,
   DESP_COD_TIP_RUT     INT4                 not null default 0,
   DESP_COD_VER         INT4                 not null default 0,
   DESP_MON_PASAJE      NUMERIC(14,4)        not null default 0,
   DESP_CNT_CARGOS      INT4                 not null default 0,
   DESP_FEC_SAL         DATE                 not null default '1900-01-01',
   DESP_FEC_RET_PRO     DATE                 not null default '1900-01-01',
   DESP_FEC_RET_REA     DATE                 not null default '1900-01-01',
   DESP_FEC_VER         DATE                 not null default '1900-01-01',
   DESP_CAN_PAS         NUMERIC(14,4)        not null default 0,
   DESP_COD_EST         INT4                 not null default 0,
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_DESPACHO primary key (DESP_ID)
);

/*==============================================================*/
/* Index: IDX_DESP_00                                           */
/*==============================================================*/
create  index IDX_DESP_00 on T_DESPACHO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_DESP_01                                           */
/*==============================================================*/
create unique index IDX_DESP_01 on T_DESPACHO (
DESP_COD_TIP_DOC,
DESP_SERIE_DOC,
DESP_NUMERO_DOC
);

/*==============================================================*/
/* Index: IDX_DESP_02                                           */
/*==============================================================*/
create  index IDX_DESP_02 on T_DESPACHO (
SED_ID
);

/*==============================================================*/
/* Index: IDX_DESP_03                                           */
/*==============================================================*/
create  index IDX_DESP_03 on T_DESPACHO (
EMP_CAT_ID
);

/*==============================================================*/
/* Index: IDX_DESP_04                                           */
/*==============================================================*/
create  index IDX_DESP_04 on T_DESPACHO (
DESP_COD_TIP
);

/*==============================================================*/
/* Index: IDX_DESP_05                                           */
/*==============================================================*/
create  index IDX_DESP_05 on T_DESPACHO (
ZON_ID
);

/*==============================================================*/
/* Index: IDX_DESP_06                                           */
/*==============================================================*/
create  index IDX_DESP_06 on T_DESPACHO (
DESP_COD_TIP_RUT
);

/*==============================================================*/
/* Index: IDX_DESP_07                                           */
/*==============================================================*/
create  index IDX_DESP_07 on T_DESPACHO (
DESP_COD_VER
);

/*==============================================================*/
/* Index: IDX_DESP_08                                           */
/*==============================================================*/
create  index IDX_DESP_08 on T_DESPACHO (
DESP_FEC_SAL
);

/*==============================================================*/
/* Index: IDX_DESP_09                                           */
/*==============================================================*/
create  index IDX_DESP_09 on T_DESPACHO (
DESP_FEC_RET_PRO
);

/*==============================================================*/
/* Index: IDX_DESP_10                                           */
/*==============================================================*/
create  index IDX_DESP_10 on T_DESPACHO (
DESP_FEC_RET_REA
);

/*==============================================================*/
/* Index: IDX_DESP_11                                           */
/*==============================================================*/
create  index IDX_DESP_11 on T_DESPACHO (
DESP_FEC_VER
);

/*==============================================================*/
/* Table: T_EMPLEADO                                            */
/*==============================================================*/
create table T_EMPLEADO (
   EMP_ID               SERIAL               not null,
   EMP_COD              VARCHAR(10)          not null default '-',
   EMP_COD_TIP_DOC      INT4                 not null default 0,
   EMP_NUM_TIP_DOC      VARCHAR(15)          not null default '-',
   EMP_DES_APE_PAT      VARCHAR(100)         not null default '-',
   EMP_DES_APE_MAT      VARCHAR(100)         not null default '-',
   EMP_DES_NOM          VARCHAR(100)         not null default '-',
   EMP_FEC_NAC          DATE                 not null default '1900-01-01',
   EMP_SEX              CHAR(1)              not null default 'M'
      constraint CKC_EMP_SEX_T_EMPLEA check (EMP_SEX in ('0','1')),
   COD_IND_CAM          CHAR(1)              not null default '1',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_EMPLEADO primary key (EMP_ID)
);

/*==============================================================*/
/* Index: IDX_EMP_00                                            */
/*==============================================================*/
create  index IDX_EMP_00 on T_EMPLEADO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_EMP_01                                            */
/*==============================================================*/
create unique index IDX_EMP_01 on T_EMPLEADO (
EMP_COD
);

/*==============================================================*/
/* Index: IDX_EMP_02                                            */
/*==============================================================*/
create  index IDX_EMP_02 on T_EMPLEADO (
EMP_COD_TIP_DOC,
EMP_NUM_TIP_DOC
);

/*==============================================================*/
/* Table: T_EMPLEADO_CATEGORIA                                  */
/*==============================================================*/
create table T_EMPLEADO_CATEGORIA (
   EMP_CAT_ID           SERIAL               not null,
   EMP_ID               INT4                 not null default 0,
   EMP_CAT_COD_TIP      INT4                 not null default 0,
   EMP_CAT_COD          VARCHAR(12)          not null default '-',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_EMPLEADO_CATEGORIA primary key (EMP_CAT_ID)
);

/*==============================================================*/
/* Index: IDX_EMP_CAT_00                                        */
/*==============================================================*/
create  index IDX_EMP_CAT_00 on T_EMPLEADO_CATEGORIA (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_EMP_CAT_01                                        */
/*==============================================================*/
create unique index IDX_EMP_CAT_01 on T_EMPLEADO_CATEGORIA (
EMP_CAT_COD
);

/*==============================================================*/
/* Index: IDX_EMP_CAT_02                                        */
/*==============================================================*/
create  index IDX_EMP_CAT_02 on T_EMPLEADO_CATEGORIA (
EMP_ID
);

/*==============================================================*/
/* Index: IDX_EMP_CAT_03                                        */
/*==============================================================*/
create  index IDX_EMP_CAT_03 on T_EMPLEADO_CATEGORIA (
EMP_CAT_COD_TIP
);

/*==============================================================*/
/* Table: T_LIQUIDACION                                         */
/*==============================================================*/
create table T_LIQUIDACION (
   LIQ_ID               SERIAL               not null,
   ORD_ID               INT4                 not null default 0,
   LIQ_COD_TIP_DOC      INT4                 not null default 0,
   LIQ_COD_EST          INT4                 not null default 0,
   LIQ_SERIE_DOC        VARCHAR(6)           not null default '-',
   LIQ_NUM_DOC          VARCHAR(10)          not null default '-',
   LIQ_FEC_LIQ          DATE                 not null default '1900-01-01',
   LIQ_CNT_ENT          INT4                 not null default 0,
   LIQ_CNT_MOT          INT4                 not null default 0,
   LIQ_CNT_PEN          INT4                 not null default 0,
   LIQ_CNT_NO_TRAB      INT4                 not null default 0,
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_LIQUIDACION primary key (LIQ_ID)
);

/*==============================================================*/
/* Index: IDX_LIQ_00                                            */
/*==============================================================*/
create  index IDX_LIQ_00 on T_LIQUIDACION (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_LIQ_01                                            */
/*==============================================================*/
create unique index IDX_LIQ_01 on T_LIQUIDACION (
LIQ_COD_TIP_DOC,
LIQ_SERIE_DOC,
LIQ_NUM_DOC
);

/*==============================================================*/
/* Index: IDX_LIQ_02                                            */
/*==============================================================*/
create  index IDX_LIQ_02 on T_LIQUIDACION (
ORD_ID
);

/*==============================================================*/
/* Index: IDX_LIQ_03                                            */
/*==============================================================*/
create  index IDX_LIQ_03 on T_LIQUIDACION (
LIQ_COD_TIP_DOC
);

/*==============================================================*/
/* Index: IDX_LIQ_04                                            */
/*==============================================================*/
create  index IDX_LIQ_04 on T_LIQUIDACION (
LIQ_FEC_LIQ
);

/*==============================================================*/
/* Index: IDX_LIQ_05                                            */
/*==============================================================*/
create  index IDX_LIQ_05 on T_LIQUIDACION (
LIQ_COD_EST
);

/*==============================================================*/
/* Table: T_ORDEN                                               */
/*==============================================================*/
create table T_ORDEN (
   ORD_ID               SERIAL               not null,
   COTI_ID              INT4                 not null default 0,
   COD_ARE_CLI          INT4                 not null default 0,
   EMP_CAT_ID           INT4                 not null default 0,
   ORD_COD_TIP_REP      INT4                 not null default 0,
   SERV_ID              INT4                 not null default 0,
   PROD_ID              INT4                 not null default 0,
   ORD_COD_TIP_PAG      INT4                 not null default 0,
   ORD_COD_TIP_MON      INT4                 not null default 0,
   ORD_COD_TIP_DOC      INT4                 not null default 0,
   ORD_SERIE_DOC        VARCHAR(6)           not null default '-',
   ORD_NUM_DOC          VARCHAR(10)          not null default '-',
   ORD_TIP_CAMBIO       NUMERIC(6,3)         not null default 1,
   ORD_CNT_CARGOS       INT4                 not null default 0,
   ORD_IND_FAC          INT4                 not null default 0,
   ORD_FEC_INI          DATE                 not null default '1900-01-01',
   ORD_FEC_VEN          DATE                 not null default '1900-01-01',
   ORD_FEC_CIE          DATE                 not null default '1900-01-01',
   ORD_FEC_DEV          DATE                 not null default '1900-01-01',
   ORD_FEC_LIQ          DATE                 not null default '1900-01-01',
   ORD_FEC_FAC          DATE                 not null default '1900-01-01',
   ORD_IMPORTE          NUMERIC(14,4)        not null default 0,
   ORD_DESCUENTO        NUMERIC(14,4)        not null default 0,
   ORD_VENTA            NUMERIC(14,4)        not null default 0,
   ORD_IGV              NUMERIC(14,4)        not null default 0,
   ORD_TOTAL            NUMERIC(14,4)        not null default 0,
   ORD_COD_EST          INT4                 not null default 0,
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_ORDEN primary key (ORD_ID)
);

/*==============================================================*/
/* Index: IDX_ORD_00                                            */
/*==============================================================*/
create  index IDX_ORD_00 on T_ORDEN (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_ORD_01                                            */
/*==============================================================*/
create  index IDX_ORD_01 on T_ORDEN (
COTI_ID
);

/*==============================================================*/
/* Index: IDX_ORD_02                                            */
/*==============================================================*/
create  index IDX_ORD_02 on T_ORDEN (
COD_ARE_CLI
);

/*==============================================================*/
/* Index: IDX_ORD_03                                            */
/*==============================================================*/
create  index IDX_ORD_03 on T_ORDEN (
EMP_CAT_ID
);

/*==============================================================*/
/* Index: IDX_ORD_04                                            */
/*==============================================================*/
create  index IDX_ORD_04 on T_ORDEN (
ORD_COD_TIP_REP
);

/*==============================================================*/
/* Index: IDX_ORD_05                                            */
/*==============================================================*/
create  index IDX_ORD_05 on T_ORDEN (
PROD_ID
);

/*==============================================================*/
/* Index: IDX_ORD_06                                            */
/*==============================================================*/
create  index IDX_ORD_06 on T_ORDEN (
ORD_COD_TIP_PAG
);

/*==============================================================*/
/* Index: IDX_ORD_07                                            */
/*==============================================================*/
create  index IDX_ORD_07 on T_ORDEN (
ORD_COD_TIP_MON
);

/*==============================================================*/
/* Index: IDX_ORD_08                                            */
/*==============================================================*/
create  index IDX_ORD_08 on T_ORDEN (
ORD_FEC_INI
);

/*==============================================================*/
/* Index: IDX_ORD_09                                            */
/*==============================================================*/
create  index IDX_ORD_09 on T_ORDEN (
ORD_FEC_VEN
);

/*==============================================================*/
/* Index: IDX_ORD_10                                            */
/*==============================================================*/
create  index IDX_ORD_10 on T_ORDEN (
ORD_FEC_CIE
);

/*==============================================================*/
/* Index: IDX_ORD_11                                            */
/*==============================================================*/
create  index IDX_ORD_11 on T_ORDEN (
ORD_FEC_DEV
);

/*==============================================================*/
/* Index: IDX_ORD_12                                            */
/*==============================================================*/
create  index IDX_ORD_12 on T_ORDEN (
ORD_FEC_LIQ
);

/*==============================================================*/
/* Index: IDX_ORD_13                                            */
/*==============================================================*/
create unique index IDX_ORD_13 on T_ORDEN (
ORD_COD_TIP_DOC,
ORD_SERIE_DOC,
ORD_NUM_DOC
);

/*==============================================================*/
/* Index: IDX_ORD_14                                            */
/*==============================================================*/
create  index IDX_ORD_14 on T_ORDEN (
ORD_FEC_FAC
);

/*==============================================================*/
/* Table: T_PRODUCTO                                            */
/*==============================================================*/
create table T_PRODUCTO (
   PROD_ID              SERIAL               not null,
   PROD_COD_TIP         INT4                 not null default 0,
   PROD_COD_AMB         INT4                 not null default 0,
   PROD_COD_NEG         INT4                 not null default 0,
   PROD_COD             VARCHAR(10)          not null default '-',
   PROD_DES             VARCHAR(250)         not null default '-',
   PROD_PRE             NUMERIC(14,4)        not null default 0,
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_PRODUCTO primary key (PROD_ID)
);

/*==============================================================*/
/* Index: IDX_PROD_00                                           */
/*==============================================================*/
create  index IDX_PROD_00 on T_PRODUCTO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_PROD_01                                           */
/*==============================================================*/
create  index IDX_PROD_01 on T_PRODUCTO (
PROD_COD_TIP
);

/*==============================================================*/
/* Index: IDX_PROD_02                                           */
/*==============================================================*/
create  index IDX_PROD_02 on T_PRODUCTO (
PROD_COD_AMB
);

/*==============================================================*/
/* Index: IDX_PROD_03                                           */
/*==============================================================*/
create  index IDX_PROD_03 on T_PRODUCTO (
PROD_COD_NEG
);

/*==============================================================*/
/* Index: IDX_PROD_04                                           */
/*==============================================================*/
create unique index IDX_PROD_04 on T_PRODUCTO (
PROD_COD
);

/*==============================================================*/
/* Table: T_SEDE                                                */
/*==============================================================*/
create table T_SEDE (
   SED_ID               SERIAL               not null,
   SED_COD              VARCHAR(10)          not null default '-',
   UBI_ID               INT4                 not null default 0,
   SED_COD_TIP          INT4                 not null default 0,
   SED_DES              VARCHAR(250)         not null default '-',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   COD_IND_CAM          CHAR(1)              not null default '1',
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_SEDE primary key (SED_ID)
);

/*==============================================================*/
/* Index: IDX_SED_00                                            */
/*==============================================================*/
create  index IDX_SED_00 on T_SEDE (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_SED_01                                            */
/*==============================================================*/
create unique index IDX_SED_01 on T_SEDE (
SED_COD
);

/*==============================================================*/
/* Index: IDX_SED_02                                            */
/*==============================================================*/
create  index IDX_SED_02 on T_SEDE (
SED_COD_TIP
);

/*==============================================================*/
/* Index: IDX_SED_03                                            */
/*==============================================================*/
create  index IDX_SED_03 on T_SEDE (
UBI_ID
);

/*==============================================================*/
/* Table: T_SERVICIO                                            */
/*==============================================================*/
create table T_SERVICIO (
   SERV_ID              SERIAL               not null,
   SEV_COD              VARCHAR(10)          not null default '-',
   SERV_COD_NEG         INT4                 not null default 0,
   SERV_COD_AMB         INT4                 not null default 0,
   SERV_DES             VARCHAR(250)         not null default '-',
   COD_IND_CAM          CHAR(1)              not null default '1',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_SERVICIO primary key (SERV_ID)
);

/*==============================================================*/
/* Index: IDX_SERV_00                                           */
/*==============================================================*/
create  index IDX_SERV_00 on T_SERVICIO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_SERV_01                                           */
/*==============================================================*/
create unique index IDX_SERV_01 on T_SERVICIO (
SEV_COD
);

/*==============================================================*/
/* Index: IDX_SERV_02                                           */
/*==============================================================*/
create  index IDX_SERV_02 on T_SERVICIO (
SERV_COD_NEG
);

/*==============================================================*/
/* Index: IDX_SERV_03                                           */
/*==============================================================*/
create  index IDX_SERV_03 on T_SERVICIO (
SERV_COD_AMB
);

/*==============================================================*/
/* Table: T_UBIGEO                                              */
/*==============================================================*/
create table T_UBIGEO (
   UBI_ID               SERIAL               not null,
   UBI_COD              VARCHAR(10)          not null default '-',
   UBI_COD_PAIS         INT4                 not null default 0,
   UBI_COD_DEPARTAMENTO INT4                 not null default 0,
   UBI_COD_PROVINCIA    INT4                 not null default 0,
   UBI_COD_DISTRITO     INT4                 not null default 0,
   COD_IND_CAM          CHAR(1)              not null default '1',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_UBIGEO primary key (UBI_ID)
);

/*==============================================================*/
/* Index: IDX_UBI_00                                            */
/*==============================================================*/
create  index IDX_UBI_00 on T_UBIGEO (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_UBI_01                                            */
/*==============================================================*/
create  index IDX_UBI_01 on T_UBIGEO (
UBI_COD_PAIS
);

/*==============================================================*/
/* Index: IDX_UBI_02                                            */
/*==============================================================*/
create  index IDX_UBI_02 on T_UBIGEO (
UBI_COD_DEPARTAMENTO
);

/*==============================================================*/
/* Index: IDX_UBI_03                                            */
/*==============================================================*/
create  index IDX_UBI_03 on T_UBIGEO (
UBI_COD_PROVINCIA
);

/*==============================================================*/
/* Index: IDX_UBI_04                                            */
/*==============================================================*/
create  index IDX_UBI_04 on T_UBIGEO (
UBI_COD_DISTRITO
);

/*==============================================================*/
/* Table: T_ZONA                                                */
/*==============================================================*/
create table T_ZONA (
   ZON_ID               SERIAL               not null,
   ZON_COD              VARCHAR(10)          not null default '-',
   UBI_ID               INT4                 not null default 0,
   ZON_DES              VARCHAR(250)         not null default '-',
   ZON_COD_POSTAL       VARCHAR(10)          not null default '-',
   COD_IND_CAM          CHAR(1)              not null default '1',
   FEC_NUM_CAM          INT8                 not null default 19000101010101,
   PROC_ID              INT4                 not null default 0,
   constraint PK_T_ZONA primary key (ZON_ID)
);

/*==============================================================*/
/* Index: IDX_ZON_00                                            */
/*==============================================================*/
create  index IDX_ZON_00 on T_ZONA (
FEC_NUM_CAM
);

/*==============================================================*/
/* Index: IDX_ZON_01                                            */
/*==============================================================*/
create unique index IDX_ZON_01 on T_ZONA (
ZON_COD
);

/*==============================================================*/
/* Index: IDX_ZON_02                                            */
/*==============================================================*/
create  index IDX_ZON_02 on T_ZONA (
UBI_ID
);

/*==============================================================*/
/* Index: IDX_ZON_03                                            */
/*==============================================================*/
create  index IDX_ZON_03 on T_ZONA (
ZON_COD_POSTAL
);
