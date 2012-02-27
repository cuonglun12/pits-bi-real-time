/*
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
