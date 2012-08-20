--ACTUALIZACION BD VENTAS

--Modificacion de las tablas
ALTER TABLE "t_cotizaciones" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
--Valores: 1: Nuevo, 2: Procesado, 3: Con error (inconsistente)
ALTER TABLE "t_cotizaciones" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

--Creacion de Funciones
CREATE OR REPLACE FUNCTION bi_proc_update_t_cotizaciones()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE t_cotizaciones
		SET bi_fec_num_cam = now()
		WHERE
			coserie = OLD.coserie
			AND conumero = OLD.conumero;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

--Creacion de Triggers
CREATE TRIGGER "bi_tr_update_t_cotizaciones" AFTER UPDATE ON "t_cotizaciones"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_t_cotizaciones();

--ACTUALIZACION BD NEXT

--Modificacion de las tablas
ALTER TABLE "areacliente" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "areacliente" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "detordenes" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "detordenes" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "detdespacho" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "detdespacho" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "cliente" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "cliente" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "despacho" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "despacho" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "personal" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "personal" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "t_liquidacion" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "t_liquidacion" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "ordenes" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "ordenes" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "t_productos" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "t_productos" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "sedesprov" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "sedesprov" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "t_servicios" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "t_servicios" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "ubigeos" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "ubigeos" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

ALTER TABLE "zonas" ADD COLUMN "bi_fec_num_cam" timestamp default current_timestamp;
ALTER TABLE "zonas" ADD COLUMN "bi_cod_ind_cam" char(1) default '1';

--Creacion de Funciones
CREATE OR REPLACE FUNCTION bi_proc_update_areacliente()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE areacliente
		SET
			bi_fec_num_cam = now()
		WHERE
			codcliente = OLD.codcliente
			AND codareacliente = OLD.codareacliente;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_detordenes()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE detordenes
		SET
			bi_fec_num_cam = now()
		WHERE
			serie = OLD.serie
			AND orden = OLD.orden
			AND correlativo = OLD.correlativo;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_detdespacho()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE detdespacho
		SET
			bi_fec_num_cam = now()
		WHERE
			serieguia = OLD.serieguia
			AND nroguia = OLD.nroguia
			AND serie = OLD.serie
			AND orden = OLD.orden
			AND correlativo = OLD.correlativo;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;	

CREATE OR REPLACE FUNCTION bi_proc_update_cliente()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE cliente
		SET
			bi_fec_num_cam = now()
		WHERE
			codcliente = OLD.codcliente;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_despacho()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE despacho
		SET
			bi_fec_num_cam = now()
		WHERE
			serieguia = OLD.serieguia
			nroguia = OLD.nroguia;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_personal()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE personal
		SET
			bi_fec_num_cam = now()
		WHERE
			codigopersonal = OLD.codigopersonal;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_t_liquidacion()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE t_liquidacion
		SET
			bi_fec_num_cam = now()
		WHERE
			seriedevolucion = OLD.seriedevolucion
			nrodevolucion = OLD.nrodevolucion;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_ordenes()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE ordenes
		SET
			bi_fec_num_cam = now()
		WHERE
			serie = OLD.serie
			orden = OLD.orden;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_t_productos()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE t_productos
		SET
			bi_fec_num_cam = now()
		WHERE
			codproducto = OLD.codproducto;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_sedesprov()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE sedesprov
		SET
			bi_fec_num_cam = now()
		WHERE
			codsede = OLD.codsede;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_t_servicios()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE t_servicios
		SET
			bi_fec_num_cam = now()
		WHERE
			codservicio = OLD.codservicio;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_ubigeos()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE ubigeos
		SET
			bi_fec_num_cam = now()
		WHERE
			ubigeo = OLD.ubigeo;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION bi_proc_update_zonas()
    RETURNS trigger AS
$BODY$
	BEGIN
		UPDATE zonas
		SET
			bi_fec_num_cam = now()
		WHERE
			codzona = OLD.codzona;
		RETURN NULL;
	END;
$BODY$ LANGUAGE plpgsql;
	
--Creacion de Triggers
CREATE TRIGGER "bi_tr_update_areacliente" AFTER UPDATE ON "areacliente"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_areacliente();

CREATE TRIGGER "bi_tr_update_detordenes" AFTER UPDATE ON "detordenes"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_detordenes();

CREATE TRIGGER "bi_tr_update_detdespacho" AFTER UPDATE ON "detdespacho"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_detdespacho();

CREATE TRIGGER "bi_tr_update_cliente" AFTER UPDATE ON "cliente"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_cliente();

CREATE TRIGGER "bi_tr_update_despacho" AFTER UPDATE ON "despacho"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_despacho();

CREATE TRIGGER "bi_tr_update_personal" AFTER UPDATE ON "personal"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_personal();

CREATE TRIGGER "bi_tr_update_t_liquidacion" AFTER UPDATE ON "t_liquidacion"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_t_liquidacion();

CREATE TRIGGER "bi_tr_update_ordenes" AFTER UPDATE ON "ordenes"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_ordenes();

CREATE TRIGGER "bi_tr_update_t_productos" AFTER UPDATE ON "t_productos"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_t_productos();

CREATE TRIGGER "bi_tr_update_sedesprov" AFTER UPDATE ON "sedesprov"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_sedesprov();

CREATE TRIGGER "bi_tr_update_t_servicios" AFTER UPDATE ON "t_servicios"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_t_servicios();

CREATE TRIGGER "bi_tr_update_ubigeos" AFTER UPDATE ON "ubigeos"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_ubigeos();

CREATE TRIGGER "bi_tr_update_zonas" AFTER UPDATE ON "zonas"
    FOR EACH ROW
	    WHEN (
			OLD.campo1 IS DISTINCT FROM NEW.campo1
			OR OLD.campo2 IS DISTINCT FROM NEW.campo2
		)
	    EXECUTE PROCEDURE bi_proc_update_zonas();