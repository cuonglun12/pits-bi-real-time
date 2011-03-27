CREATE TABLE agentetarifa (
    codagente character(6) NOT NULL,
    coddepa character(5) NOT NULL,
    codprov character(5) NOT NULL,
    coddis character(3) NOT NULL,
    desdemasivo01 integer DEFAULT 0,
    hastamasivo01 integer DEFAULT 0,
    masivo01 numeric(10,3) DEFAULT 0,
    desdemasivo02 integer DEFAULT 0,
    hastamasivo02 integer DEFAULT 0,
    masivo02 numeric(10,3) DEFAULT 0,
    desdemasivo03 integer DEFAULT 0,
    hastamasivo03 integer DEFAULT 0,
    masivo03 numeric(10,3) DEFAULT 0,
    desdemasivo04 integer DEFAULT 0,
    hastamasivo04 integer DEFAULT 0,
    masivo04 numeric(10,3) DEFAULT 0,
    desdeurgente01 integer,
    hastaurgente01 integer,
    urgente01 numeric(10,3) DEFAULT 0,
    desdekilo01 numeric(10,3) DEFAULT 0,
    hastakilo01 numeric(10,3) DEFAULT 0,
    tarifakilo01 numeric(10,3) DEFAULT 0,
    kiloadic01 numeric(10,3) DEFAULT 0,
    tarifaadic01 numeric(10,3) DEFAULT 0,
    desdekilo02 numeric(10,3) DEFAULT 0,
    hastakilo02 numeric(10,3) DEFAULT 0,
    tarifakilo02 numeric(10,3) DEFAULT 0,
    kiloadic02 numeric(10,3) DEFAULT 0,
    tarifaadic02 numeric(10,3) DEFAULT 0,
    desdekilo03 numeric(10,3) DEFAULT 0,
    hastakilo03 numeric(10,3) DEFAULT 0,
    tarifakilo03 numeric(10,3) DEFAULT 0,
    kiloadic03 numeric(10,3) DEFAULT 0,
    tarifaadic03 numeric(10,3) DEFAULT 0,
    desdekilo04 numeric(10,3) DEFAULT 0,
    hastakilo04 numeric(10,3) DEFAULT 0,
    tarifakilo04 numeric(10,3) DEFAULT 0,
    kiloadic04 numeric(10,3) DEFAULT 0,
    tarifaadic04 numeric(10,3) DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.agentetarifa OWNER TO postgres;

--
-- TOC entry 1899 (class 1259 OID 16446)
-- Dependencies: 2376 6
-- Name: archivos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE archivos (
    codigo character(6) NOT NULL,
    archivo character varying(50),
    estado smallint DEFAULT 0
);


ALTER TABLE public.archivos OWNER TO postgres;

--
-- TOC entry 1900 (class 1259 OID 16450)
-- Dependencies: 2377 2378 2379 6
-- Name: arcimpresion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE arcimpresion (
    codigo integer NOT NULL,
    archivo character varying(200),
    comando character varying(200),
    tipo smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    cargos integer DEFAULT 0,
    dcomando text,
    ordenamiento integer DEFAULT 0
);


ALTER TABLE public.arcimpresion OWNER TO postgres;

--
-- TOC entry 1901 (class 1259 OID 16459)
-- Dependencies: 2380 6
-- Name: areacliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE areacliente (
    codcliente character(11) NOT NULL,
    codareacliente character(15) NOT NULL,
    ruc character varying(20),
    areacliente character varying(150),
    direccion character varying(150),
    ubigeo character varying(6),
    codpais character varying(2),
    telefono character varying(30),
    movil character varying(30),
    email character varying(50),
    codejecutiva character(6),
    observacion character varying(200),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL,
    contacto character varying(100),
    areacontacto character varying(100),
    preorden character varying(20)
);


ALTER TABLE public.areacliente OWNER TO postgres;

--
-- TOC entry 1902 (class 1259 OID 16466)
-- Dependencies: 6
-- Name: baccesos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE baccesos (
    codprogram character(8) NOT NULL,
    codigopersonal character(6) NOT NULL
);


ALTER TABLE public.baccesos OWNER TO postgres;

--
-- TOC entry 1903 (class 1259 OID 16469)
-- Dependencies: 6
-- Name: bgrupo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE bgrupo (
    grupo character(2) NOT NULL,
    descripcion character varying(30),
    definepad character varying(200),
    onpad character varying(200),
    definepopup character varying(200),
    secuencia smallint
);


ALTER TABLE public.bgrupo OWNER TO postgres;

--
-- TOC entry 1904 (class 1259 OID 16475)
-- Dependencies: 6
-- Name: bloqueos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE bloqueos (
    orden character(7),
    fecha timestamp without time zone,
    serie character(3),
    usuario character(6),
    tipo character varying(30)
);


ALTER TABLE public.bloqueos OWNER TO postgres;

--
-- TOC entry 1905 (class 1259 OID 16478)
-- Dependencies: 6
-- Name: blq_orden; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE blq_orden (
    orden character(7) NOT NULL,
    codusuario character(6),
    fecha timestamp with time zone,
    serie character(3) NOT NULL
);


ALTER TABLE public.blq_orden OWNER TO postgres;

--
-- TOC entry 1906 (class 1259 OID 16481)
-- Dependencies: 6
-- Name: bprogram; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE bprogram (
    codprogram character(8) NOT NULL,
    descripcion character varying(50),
    grupo character(2) NOT NULL,
    menues character(3),
    comando character varying(200),
    dmenu character varying(200)
);


ALTER TABLE public.bprogram OWNER TO postgres;

--
-- TOC entry 1907 (class 1259 OID 16484)
-- Dependencies: 2381 6
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cliente (
    codcliente character(11) NOT NULL,
    ruc character varying(20),
    cliente character varying(150),
    tipocliente character(1),
    rubro character varying(60),
    alias character varying(150),
    direccion character varying(250),
    ubigeo character(6),
    codpais character varying(2),
    telefono character varying(30),
    movil character varying(30),
    lim character varying(6),
    codejecutiva character(6),
    email character varying(200),
    tipo_credito character(1),
    tipo_facturacion character(1),
    usuario character(6),
    fecha timestamp without time zone,
    fechamod timestamp without time zone,
    usuariomod character(6),
    periodo_fac character(1),
    dias_credito numeric(5,0),
    credito numeric(8,2),
    credito_utilizado numeric(8,2),
    credito_disponible numeric(8,2),
    sobregiro numeric(8,2),
    estado smallint DEFAULT 0 NOT NULL,
    observacion character varying(200),
    fecha_inicio_credito date,
    fecha_vence_credito date,
    tipo_documento character(1),
    referencia text,
    telefono1 character varying(20),
    cod_encuesta character varying(3),
    h_pactada numeric(15,0),
    t_cliente numeric(15,2),
    t_h_adicional numeric(15,2),
    t_km_adicional numeric(15,2),
    email_2 character varying(200),
    clasifica character varying(4),
    codempresa character varying(11)
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 2994 (class 0 OID 0)
-- Dependencies: 1907
-- Name: COLUMN cliente.tipocliente; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN cliente.tipocliente IS 'N = Natural J=Juridico E=Estatal';


--
-- TOC entry 1908 (class 1259 OID 16491)
-- Dependencies: 2382 6
-- Name: consextremas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE consextremas (
    item numeric(9,0) NOT NULL,
    codmodulo character(4) NOT NULL,
    usuario character(6),
    descripcion character varying(120),
    estado character(1) DEFAULT 'S'::bpchar,
    codpermiso character(3)
);


ALTER TABLE public.consextremas OWNER TO postgres;

--
-- TOC entry 2995 (class 0 OID 0)
-- Dependencies: 1908
-- Name: COLUMN consextremas.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN consextremas.estado IS 'S- PERMISO
<>S NO PERMISO';


--
-- TOC entry 1909 (class 1259 OID 16495)
-- Dependencies: 2383 2384 2385 6
-- Name: contactos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE contactos (
    codcontacto character(6) NOT NULL,
    codcliente character(11) NOT NULL,
    codareacliente character(15) NOT NULL,
    contacto character varying(60),
    cargo character varying(40),
    direccion character varying(150),
    ubigeo character(6),
    telefono character varying(30),
    movil character varying(30),
    email character varying(40),
    observacion character varying(150),
    usuarioweb character varying(30),
    claveweb character varying(30),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL,
    tipocontacto character(2),
    tipousuarioweb character(2),
    permisoweb character(2),
    id_contacto character varying(6),
    ruc_dni character varying(11),
    email_alterno character varying(40),
    ccosto character varying(50),
    ctrabajo character varying(50),
    codtienda character varying(10),
    cod_tel character varying(3),
    cod_movil character varying(3),
    env_mail character(1) DEFAULT 0,
    anexo character varying(15),
    cod_tel2 character varying(3),
    telefono2 character varying(20),
    nivel smallint DEFAULT 0,
    codoficina character varying(10),
    rpmactual character varying(20),
    rpm character varying(20),
    subgerente character varying(150),
    territorio character varying(100),
    codigo character varying(10),
    oficina character varying(150)
);


ALTER TABLE public.contactos OWNER TO postgres;

--
-- TOC entry 2996 (class 0 OID 0)
-- Dependencies: 1909
-- Name: COLUMN contactos.tipousuarioweb; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN contactos.tipousuarioweb IS '01=ADMINISTRADOR CLIENTE 02=ADMINISTRADOR CENTO DE COSTO 03=CONTACTO';


--
-- TOC entry 2997 (class 0 OID 0)
-- Dependencies: 1909
-- Name: COLUMN contactos.permisoweb; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN contactos.permisoweb IS '01=LECTURA ESCRITURA 02=LECTURA 03=ESCRITURA';


--
-- TOC entry 2998 (class 0 OID 0)
-- Dependencies: 1909
-- Name: COLUMN contactos.nivel; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN contactos.nivel IS '0=Normal 1=Principal';


--
-- TOC entry 1910 (class 1259 OID 16504)
-- Dependencies: 2386 2387 2388 2389 2390 2391 2392 2393 2394 2395 2396 6
-- Name: despacho; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE despacho (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    fecsalida date,
    fecretorno date,
    codmensajero character(6),
    pasaje numeric(6,2) DEFAULT 0,
    total integer DEFAULT 0,
    entregados integer DEFAULT 0,
    motivos integer DEFAULT 0,
    reenvios integer DEFAULT 0,
    anulados integer DEFAULT 0,
    fuerazona integer DEFAULT 0,
    perdidos integer DEFAULT 0,
    observacion character varying(100),
    tiporuta character(2),
    monto numeric(6,2) DEFAULT 0,
    codestadoguia character(2),
    estadoveri character(2),
    usuariodesp character(6),
    fechadesp timestamp without time zone,
    usuariocierre character(6),
    fechacierre timestamp without time zone,
    codtipopago character(2),
    horaretorno character(8),
    codzona character(6),
    userasigna character(6),
    fecasigna timestamp without time zone,
    codorigen character(3) NOT NULL,
    codsede character(3) NOT NULL,
    tipofi smallint DEFAULT 1,
    usuarioflete character(6),
    fechaflete date,
    nrocaja smallint,
    flete character(1),
    horasalida timestamp without time zone,
    horaflete time(6) with time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    codplanilla character(3),
    brevete character varying(20),
    cod_ayudante character(6),
    cod_unidad character(3),
    placa character varying(30),
    des_unidad character varying(50),
    cod_tracking_guia smallint DEFAULT 0
);


ALTER TABLE public.despacho OWNER TO postgres;

--
-- TOC entry 2999 (class 0 OID 0)
-- Dependencies: 1910
-- Name: COLUMN despacho.codsede; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN despacho.codsede IS '= destino';


--
-- TOC entry 3000 (class 0 OID 0)
-- Dependencies: 1910
-- Name: COLUMN despacho.tipofi; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN despacho.tipofi IS '1 Masivo
2 Nacional
3 Boveda';


--
-- TOC entry 1911 (class 1259 OID 16520)
-- Dependencies: 2397 6
-- Name: detdespacho; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE detdespacho (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    codorigen character(3),
    codsede character(3) NOT NULL,
    codclienteb character varying(50),
    estacion character(6),
    contador character(6),
    volante smallint DEFAULT 0,
    codzona character(6),
    codestado character(2),
    codmotivo character(2),
    estadoveri character(2),
    fecasignado date,
    user_cla character(6),
    fec_cla timestamp without time zone,
    user_recep character(6),
    fec_recep timestamp without time zone
);


ALTER TABLE public.detdespacho OWNER TO postgres;

--
-- TOC entry 2041 (class 1259 OID 19340)
-- Dependencies: 6
-- Name: detorden_int; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE detorden_int (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    tipoingreso character varying(3),
    preorden1 character varying(20),
    preorden2 character varying(20),
    empresa character varying(150),
    consignado character varying(150),
    direccion character varying(200),
    telefono character varying(100),
    ciudad character varying(200),
    codpais character varying(2),
    impresion_shipper character varying(500),
    carrier_empresa character varying(150),
    carrier_consignado character varying(150),
    carrier_direccion character varying(200),
    carrier_telefono character varying(150),
    carrier_ciudad character varying(150),
    carrier_codpais character varying(2),
    impresion_carrier character varying(500),
    agents_iata character varying(100),
    accoun_no character varying(50),
    cod_aeropuerto_origen character(6),
    "to" character varying(50),
    codaerolinea character(4),
    to1 character varying(50),
    by1 character varying(50),
    to2 character varying(50),
    by2 character varying(50),
    currency character varying(50),
    chgs character varying(50),
    wtppd character varying(20),
    wtcoll character varying(20),
    otherppd character varying(20),
    othercoll character varying(20),
    valor_declarado_aduana character varying(50),
    valor_declarado_transporte character varying(50),
    cod_aeropuerto_destino character(6),
    fight character varying(50),
    date character varying(50),
    amount character varying(50),
    informacion character varying(800),
    nro_pieces character varying(800),
    gross character varying(800),
    kg_lb character varying(800),
    rate_class character varying(800),
    commody_item character varying(800),
    chargeable character varying(800),
    rate_charge character varying,
    total character varying(500),
    descripcion_bienes character varying(500),
    prepaid numeric(15,4),
    peso_carga numeric(15,4),
    collect numeric(15,4),
    valor_carga_prepaid numeric(15,4),
    valor_carga_collect numeric(15,4),
    tax_prepaid numeric(15,4),
    tax_collect numeric(15,4),
    total_prepaid_agent numeric(15,4),
    total_collect_agent numeric(15,4),
    total_prepaid_carrier numeric(15,4),
    total_collet_carrier numeric(15,4),
    total_prepaid numeric(15,4),
    total_collect numeric(15,4),
    currency_conversion_rates numeric(15,4),
    charges_currency numeric(15,4),
    impresion_cons character varying(500),
    execute_date date,
    point_of_origen character varying(150),
    loading_pier character varying(150),
    codpuerto_pre_carrier character varying(4),
    codpuerto_loading character(4),
    descripcion_nave character varying(200),
    date_at character varying(200),
    des_by character varying(200),
    codpuerto_destino character(4)
);


ALTER TABLE public.detorden_int OWNER TO postgres;

--
-- TOC entry 1912 (class 1259 OID 16524)
-- Dependencies: 2398 2399 2400 2401 2402 2403 2404 2405 2406 2407 6
-- Name: detordenes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE detordenes (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    preorden character varying(20),
    codcliente character(11),
    codareacliente character(15),
    empresa character varying(150),
    llaveempresa character varying(15),
    destinatario character varying(150),
    llavedestina character varying(15),
    cargo character varying(100),
    direccion character varying(200),
    distrito character varying(100),
    referencia character varying(200),
    codpostal character varying(3),
    ubigeo character(6),
    codzona character varying(10),
    cuadrante character(10),
    nuevadireccion character varying(200),
    nuevareferencia character varying(200),
    nuevocodpostal character varying(3),
    nuevoubigeo character varying(6),
    llave character varying(50),
    codigo character varying(50),
    codigo1 character varying(50),
    codigo2 character varying(50),
    codigo3 character varying(50),
    codigo4 character varying(50),
    codigo5 character varying(50),
    codigo6 character varying(50),
    codestado character(2),
    codmotivo character(2),
    codestadodesc character(2),
    codmotivodesc character(2),
    codestadoant character varying(2),
    codmotivoant character varying(2),
    codestadocli character varying(2),
    codmotivocli character varying(2),
    tipoingreso character(2) NOT NULL,
    user_digitacion character(6) NOT NULL,
    fec_digitacion date,
    hora_digitacion timestamp without time zone,
    user_digitacionmod character(6),
    fec_digitacionmod date,
    hora_digitacionmod timestamp without time zone,
    user_descargo character(6),
    fec_descargo date,
    fecrecepcion timestamp without time zone,
    torre_ integer,
    nroguia character varying(6),
    ajuste smallint DEFAULT 0,
    liquidado smallint DEFAULT 0,
    nroliquidacion character(6),
    recepcion character varying(150),
    recepcion_dni character varying(8),
    parentesco character varying(30),
    colorcasa character varying(30),
    puerta character varying(30),
    nropisos character varying(2),
    suministro character varying(30),
    telefono character varying(30),
    ventana character varying(30),
    tipoviv character varying(30),
    vecinoizq character varying(30),
    vecinoder character varying(30),
    material character varying(30),
    estadoviv character varying(30),
    rejacolor character varying(30),
    locald character varying(20),
    imagen character varying(1),
    user_scaneo character(6),
    fec_scaneo timestamp without time zone,
    sesionscaneo integer DEFAULT 0,
    tiposcaneo smallint DEFAULT 0,
    monto numeric(10,3) DEFAULT 0,
    oficina character varying(20),
    moneda character(1),
    coordinado character varying(1),
    fecha_coor timestamp without time zone,
    user_coor character varying(6),
    observacion character varying(200),
    nropiezas integer,
    peso numeric(10,3) DEFAULT 0,
    pesoreal numeric(10,3) DEFAULT 0,
    cargoagente character varying(1),
    nrocargoagente integer DEFAULT 0,
    codenvio character varying(2),
    ancho numeric(10,2),
    largo numeric(10,2),
    alto numeric(10,2),
    vbase numeric(10,2),
    vexceso numeric(10,2),
    bloqueo smallint DEFAULT 0,
    ruc character varying(11),
    dni character varying(8),
    flagdescargo smallint DEFAULT 0,
    nuevodistrito character varying(100),
    serieliquidacion character(3),
    serieguia character(3),
    user_cuadre character(6),
    fecha_cuadre timestamp without time zone,
    est_cuadre character(1),
    flag_coor character varying(1),
    useruario_coor character(6),
    fecha_coordinacion timestamp without time zone,
    serieguiasol character(3),
    nroguiasol character(6),
    imagen_ftp character varying(1),
    usuario_ftp character varying(6),
    fecha_ftp timestamp without time zone,
    usuario_ws character varying(20),
    usuario_coordina character(6),
    fecha_coordina timestamp without time zone
);


ALTER TABLE public.detordenes OWNER TO postgres;

--
-- TOC entry 1913 (class 1259 OID 16547)
-- Dependencies: 2408 2409 6
-- Name: dettransferido; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE dettransferido (
    orden character(7) NOT NULL,
    desde integer DEFAULT 0 NOT NULL,
    hasta integer DEFAULT 0 NOT NULL,
    usuario character(6),
    fechadig date,
    tipoingreso character(2),
    serie character(3) NOT NULL
);


ALTER TABLE public.dettransferido OWNER TO postgres;

--
-- TOC entry 1914 (class 1259 OID 16552)
-- Dependencies: 6
-- Name: estados; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE estados (
    codestado character(2) NOT NULL,
    estado character(20)
);


ALTER TABLE public.estados OWNER TO postgres;

--
-- TOC entry 1915 (class 1259 OID 16555)
-- Dependencies: 6
-- Name: estados_awb; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE estados_awb (
    codestado character(2) NOT NULL,
    estado character varying(30)
);


ALTER TABLE public.estados_awb OWNER TO postgres;

--
-- TOC entry 1916 (class 1259 OID 16558)
-- Dependencies: 2410 6
-- Name: fecharetorno; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE fecharetorno (
    serieguia character(3),
    nroguia character(6),
    fecmovimiento timestamp without time zone,
    dias integer DEFAULT 0,
    fecharetorno date,
    codigopersonal character(6),
    codsede character(3)
);


ALTER TABLE public.fecharetorno OWNER TO postgres;

--
-- TOC entry 2061 (class 1259 OID 177918)
-- Dependencies: 6
-- Name: foo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE foo (
    id integer NOT NULL,
    nombre character varying(100),
    descripcion character varying(500),
    archivo_bytea bytea,
    archivo_oid oid,
    mime character varying(100),
    size numeric
);


ALTER TABLE public.foo OWNER TO postgres;

--
-- TOC entry 2062 (class 1259 OID 177921)
-- Dependencies: 6 2061
-- Name: foo_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE foo_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


ALTER TABLE public.foo_id_seq OWNER TO postgres;

--
-- TOC entry 3001 (class 0 OID 0)
-- Dependencies: 2062
-- Name: foo_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE foo_id_seq OWNED BY foo.id;


--
-- TOC entry 1917 (class 1259 OID 16565)
-- Dependencies: 6
-- Name: glosas_estados_awb; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE glosas_estados_awb (
    codestado character(2),
    codglosa character(2) NOT NULL,
    glosa character varying(100)
);


ALTER TABLE public.glosas_estados_awb OWNER TO postgres;

--
-- TOC entry 1918 (class 1259 OID 16571)
-- Dependencies: 6
-- Name: items; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE items (
    codigo character(2) NOT NULL,
    item integer,
    descripcion character varying(50),
    estado character(1)
);


ALTER TABLE public.items OWNER TO postgres;

--
-- TOC entry 1919 (class 1259 OID 16574)
-- Dependencies: 6
-- Name: motivos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE motivos (
    codmotivo character(2) NOT NULL,
    motivo character(30)
);


ALTER TABLE public.motivos OWNER TO postgres;

--
-- TOC entry 1920 (class 1259 OID 16577)
-- Dependencies: 6
-- Name: mov_log_web; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE mov_log_web (
    serie_registro character(2) NOT NULL,
    nro_registro numeric NOT NULL,
    cod_cliente character(11),
    tipo_usuario character(2),
    fecha_log timestamp without time zone,
    usuario character varying(30),
    clave character varying(30),
    ip_adress character varying(30),
    estado character(1)
);


ALTER TABLE public.mov_log_web OWNER TO postgres;

--
-- TOC entry 1921 (class 1259 OID 16583)
-- Dependencies: 6
-- Name: movliqcobranza; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE movliqcobranza (
    serie_voucher character(3) NOT NULL,
    nro_voucher numeric(7,0) NOT NULL,
    fecha_deposito timestamp without time zone NOT NULL,
    moneda character(1) NOT NULL,
    valor_deposito numeric(9,3) NOT NULL,
    cod_banco character(2) NOT NULL,
    nro_operacion character(20),
    glosa character(250),
    cuenta character(30),
    estado character(1) NOT NULL,
    usuario_crea character(6) NOT NULL,
    fecha_crea timestamp without time zone NOT NULL,
    usuario_modifica character(6),
    fecha_modifica timestamp without time zone
);


ALTER TABLE public.movliqcobranza OWNER TO postgres;

--
-- TOC entry 3002 (class 0 OID 0)
-- Dependencies: 1921
-- Name: COLUMN movliqcobranza.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN movliqcobranza.estado IS 'P - Abierto
C - Cerrado
A - Anulado';


--
-- TOC entry 1922 (class 1259 OID 16586)
-- Dependencies: 6
-- Name: movliqcobranzadeta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE movliqcobranzadeta (
    serie_voucher character(3) NOT NULL,
    nro_voucher numeric(7,0) NOT NULL,
    item_voucher numeric(7,0) NOT NULL,
    tipo_documento character(1) NOT NULL,
    serie_documento character(3) NOT NULL,
    nro_documento numeric(9,0),
    cod_cobrador character(6) NOT NULL,
    fecha timestamp without time zone NOT NULL,
    tipo_liquidacion character(1) NOT NULL,
    tipo_referencia character(1) NOT NULL,
    nro_referencia character(20) NOT NULL,
    valor_liquidado numeric(9,3) NOT NULL,
    moneda character(1) NOT NULL,
    tipo_movimiento character(1),
    monto_tipo double precision,
    estado_tipo character(1),
    estado character(1) NOT NULL,
    usuario_crea character(6) NOT NULL,
    fecha_crea timestamp without time zone NOT NULL,
    usuario_mod character(6),
    fecha_mod timestamp without time zone
);


ALTER TABLE public.movliqcobranzadeta OWNER TO postgres;

--
-- TOC entry 1923 (class 1259 OID 16593)
-- Dependencies: 6
-- Name: movreclamocabe; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE movreclamocabe (
    emi_guia character(3) NOT NULL,
    nro_guia character(6) NOT NULL,
    fecha_guia date NOT NULL,
    codcliente character(11) NOT NULL,
    codareacliente character(15) NOT NULL,
    observacion character varying(800),
    estado character(1) NOT NULL,
    cod_responsable character(6),
    usuario character(6) NOT NULL,
    fecha timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone,
    registro_web character(1),
    ip_web character(15),
    codcontacto character(6),
    nro_matricula character varying(20),
    fecha_inicio date,
    fecha_vence date
);


ALTER TABLE public.movreclamocabe OWNER TO postgres;

--
-- TOC entry 3003 (class 0 OID 0)
-- Dependencies: 1923
-- Name: COLUMN movreclamocabe.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN movreclamocabe.estado IS 'P -  Pendiente
A - Anulado
R - Atendido
S - Procede
N - No Procede
  ';


--
-- TOC entry 1924 (class 1259 OID 16596)
-- Dependencies: 6
-- Name: movreclamodeta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE movreclamodeta (
    item numeric(7,0) NOT NULL,
    emi_guia character(3) NOT NULL,
    nro_guia character(6) NOT NULL,
    serie character(3),
    orden character(7),
    correlativo character(6),
    destinatario character varying(150),
    codigo character(20),
    tipo_reclamo character(2),
    observacion character(800),
    estado character(1) NOT NULL,
    usuario character(6) NOT NULL,
    fechacrea timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.movreclamodeta OWNER TO postgres;

--
-- TOC entry 1925 (class 1259 OID 16602)
-- Dependencies: 2411 6
-- Name: movverificacioncabe; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE movverificacioncabe (
    emi_guia character(3) NOT NULL,
    nro_guia character(6) NOT NULL,
    fecha_guia date NOT NULL,
    fecha_retorno timestamp without time zone,
    fecha_cierre timestamp without time zone,
    cod_verificador character(6),
    cod_cuadrante character(2),
    ubigeo character(6),
    cod_usuario character(6) NOT NULL,
    flete smallint,
    valor_flete numeric(9,3),
    moneda character(1),
    usuario_flete character(6),
    fecha_flete timestamp without time zone,
    observacion character(240),
    serie_reclamo character(3),
    nro_reclamo character(6),
    estado character(1) NOT NULL,
    usuariocrea character(6) NOT NULL,
    fechacrea timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone,
    origen_reclamo character(1),
    codsede character(3),
    nrocaja smallint DEFAULT 0,
    estado_flete character(1),
    userasigna character(6),
    fecasigna timestamp without time zone,
    codtipopago character(2)
);


ALTER TABLE public.movverificacioncabe OWNER TO postgres;

--
-- TOC entry 3004 (class 0 OID 0)
-- Dependencies: 1925
-- Name: COLUMN movverificacioncabe.flete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN movverificacioncabe.flete IS '1 - SI
2 - NO';


--
-- TOC entry 3005 (class 0 OID 0)
-- Dependencies: 1925
-- Name: COLUMN movverificacioncabe.moneda; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN movverificacioncabe.moneda IS 'S - SOLES
D - DOLARES';


--
-- TOC entry 3006 (class 0 OID 0)
-- Dependencies: 1925
-- Name: COLUMN movverificacioncabe.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN movverificacioncabe.estado IS 'P - Pendiente
A - Asignado
C - Cerrado
D - Despachado
N - Anulado';


--
-- TOC entry 1926 (class 1259 OID 16606)
-- Dependencies: 6
-- Name: movverificaciondescargo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE movverificaciondescargo (
    emi_guia character(3) NOT NULL,
    nro_guia character(6) NOT NULL,
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    fecha_descargo timestamp without time zone NOT NULL,
    codestado character(2),
    codmotivo character(2),
    procede character(1),
    usuariocrea character(6) NOT NULL,
    fechacrea timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado character(1) NOT NULL
);


ALTER TABLE public.movverificaciondescargo OWNER TO postgres;

--
-- TOC entry 1927 (class 1259 OID 16609)
-- Dependencies: 6
-- Name: movverificaciondeta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE movverificaciondeta (
    emi_guia character(3) NOT NULL,
    nro_guia character(6) NOT NULL,
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    fecha_guia date NOT NULL,
    fecha_descargo timestamp without time zone,
    recepcionado character varying(60),
    destinatario character varying(150),
    atendido character(60),
    dni character varying(20),
    telefono character varying(20),
    puntual character(1),
    retrazado character(1),
    deteriorado character(1),
    abierto character(1),
    bajo_puerta character(1),
    conforme character(1),
    pared text,
    puerta text,
    ventana text,
    pisos text,
    vecino_i text,
    vecino_d text,
    medidor text,
    trato character(1),
    emi_guia_men character(3),
    nro_guia_men character(6),
    observacion text,
    estado character(1) NOT NULL,
    usuariocrea character(6) NOT NULL,
    fechacrea timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone,
    puerta_m text,
    pared_m text,
    pisos_m text,
    vecino_im text,
    vecino_dm text,
    codsede character(3),
    estacion character(6)
);


ALTER TABLE public.movverificaciondeta OWNER TO postgres;

--
-- TOC entry 1928 (class 1259 OID 16618)
-- Dependencies: 2412 2413 2414 2415 2416 2417 2418 2419 2420 2421 2422 2423 2424 2425 2426 2427 2428 2429 2430 2431 2432 2433 2434 2435 2436 2437 2438 2439 2440 2441 6
-- Name: ordenes; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE ordenes (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    preorden character varying(20),
    codcliente character(11),
    codareacliente character(15),
    codambito character(2),
    codnegocio character(2),
    codservicio character(4),
    codproducto character(4),
    codtiporeparto character(2),
    cnt_admision numeric(10,0) DEFAULT 0,
    cnt_digitado numeric(10,0) DEFAULT 0,
    peso numeric(10,3) DEFAULT 0,
    fechaingreso date,
    fechainicio date,
    fechavencimiento date,
    fechadevolucion date,
    estadoorden character(2) DEFAULT 1 NOT NULL,
    estadoout character(2),
    bloqueo smallint DEFAULT 0,
    volantes smallint DEFAULT 0,
    valorado smallint DEFAULT 0,
    liquidado smallint DEFAULT 0,
    nroliquidacion character(6),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    codejecutiva character(6),
    glosa character varying(50),
    facturado smallint DEFAULT 0,
    fac_serie character(3),
    eecc_serie character(3),
    eecc_numero character(6),
    importe numeric(15,4) DEFAULT 0.000,
    descuento numeric(15,4) DEFAULT 0.000,
    venta numeric(15,4) DEFAULT 0.000,
    igv numeric(15,4) DEFAULT 0.000,
    total numeric(15,4) DEFAULT 0.000,
    coserie character(2),
    conumero numeric(5,0),
    codtipooperador character(2),
    seoperador character(3),
    tarifa_urbana numeric(15,4),
    tarifa_periferica numeric(15,4),
    tarifa_extrema numeric(15,4),
    inafecto numeric(9,3) DEFAULT 0.000,
    tipocotizacion smallint DEFAULT 0,
    moneda character(1),
    tipo_cambio numeric(9,3) DEFAULT 3.150,
    fac_numero numeric(9,0),
    tipodocumento character(1),
    observacion text,
    grupo character varying(10),
    codorigen character(3),
    codzona character(4),
    importe_plus numeric(15,4) DEFAULT 0.000,
    tarifa_adicional numeric(15,4) DEFAULT 0.000,
    importe_servicio numeric(15,4) DEFAULT 0.000,
    importe_periferico numeric(15,4) DEFAULT 0.000,
    monto_periferico numeric(15,4) DEFAULT 0.000,
    cnt_periferico numeric(10,0) DEFAULT 0,
    codtracking smallint DEFAULT 0,
    usuario_recojo character(6),
    fecha_recojo timestamp without time zone,
    flag_recojo smallint DEFAULT 0,
    tipo_pago_orden smallint DEFAULT 1,
    ciudad_origen character varying(10),
    ciudad_destino character varying(10),
    valor_declarado numeric(15,4) DEFAULT 0.0000,
    prioridad character(1),
    nrooperador character varying(50),
    codrecojo character varying(7),
    cod_conformidad character(1),
    obs_conformidad character varying(100),
    usu_conformidad character varying(6),
    fec_conformidad timestamp without time zone,
    cod_activa smallint DEFAULT 0,
    ususario_activa character(6),
    fecha_activa timestamp without time zone,
    t_transporte character(1),
    serie_devc character varying(3),
    nro_devc character varying(6),
    estado_devc character varying(2),
    observacion2 character varying(500),
    serieguiasol character(3),
    nroguiasol character(6),
    flag_tipo_orden smallint DEFAULT 0,
    codigo character varying(11),
    cnt_m3 smallint DEFAULT 0,
    tipo_unidad character varying(4),
    cod_sub_servicio character varying(10),
    usuario_anula character(6),
    fecha_anula timestamp without time zone,
    obs_anula character varying(100)
);


ALTER TABLE public.ordenes OWNER TO postgres;

--
-- TOC entry 3007 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.codambito; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.codambito IS '01 - LOCAL
02 - NACIONAL
03 - INTERNACIONAL';


--
-- TOC entry 3008 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.estadoorden; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.estadoorden IS '00=Pendiente
01=Generado, 02=Anulado 03=cerrado';


--
-- TOC entry 3009 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.estadoout; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.estadoout IS '00 = pendiente de transferencia 01 = Error de transfrerencia  02 = transferido';


--
-- TOC entry 3010 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.liquidado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.liquidado IS '0=pendiente 1=Periodica 2=total';


--
-- TOC entry 3011 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.facturado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.facturado IS '0=pendiente, 1=eecc, 2=facturado';


--
-- TOC entry 3012 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.moneda; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.moneda IS 'D - DOLARES
S - SOLES';


--
-- TOC entry 3013 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.usuario_recojo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.usuario_recojo IS 'usuario confirma recojo';


--
-- TOC entry 3014 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.tipo_pago_orden; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.tipo_pago_orden IS '1=credito 2=contado 3=en cuotas 4=prepaid 5=collect';


--
-- TOC entry 3015 (class 0 OID 0)
-- Dependencies: 1928
-- Name: COLUMN ordenes.prioridad; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN ordenes.prioridad IS 'N - NORMAL
S - ALTA';


--
-- TOC entry 1929 (class 1259 OID 16652)
-- Dependencies: 6
-- Name: origen; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE origen (
    codorigen character(3) NOT NULL
);


ALTER TABLE public.origen OWNER TO postgres;

--
-- TOC entry 1930 (class 1259 OID 16655)
-- Dependencies: 2442 6
-- Name: pasajeguias; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pasajeguias (
    serieguia character(3),
    nroguia character(6),
    fecmovimiento timestamp without time zone,
    codigopersonal character(6),
    pasaje numeric(8,2) DEFAULT 0,
    codsede character(3)
);


ALTER TABLE public.pasajeguias OWNER TO postgres;

--
-- TOC entry 1931 (class 1259 OID 16659)
-- Dependencies: 6
-- Name: pc_usuario; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE pc_usuario (
    usuario character varying(30),
    maquina character varying(30),
    pusuario character(6)
);


ALTER TABLE public.pc_usuario OWNER TO postgres;

--
-- TOC entry 1932 (class 1259 OID 16662)
-- Dependencies: 2443 2444 2445 6
-- Name: personal; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE personal (
    codigopersonal character(6) NOT NULL,
    usuario character varying(20),
    tipopers character(2),
    codtipo character(2),
    coddepartamento character(4),
    codbanco character(4),
    tipopago character(2),
    nombre character varying(100),
    appaterno character varying(20),
    apmaterno character varying(20),
    nombres character varying(60),
    direccion character varying(150),
    ubigeo character(6),
    ubigeonac character(6),
    fechanac timestamp without time zone,
    estadocivil character(2),
    dni character varying(8),
    lmilitar character varying(20),
    nroafp character varying(20),
    nroruc character varying(20),
    nrocuenta character varying(20),
    nroessalud character varying(20),
    telefono character varying(20),
    correo character varying(50),
    estadopersonal character(2),
    recomendo character varying(60),
    password character varying(20),
    monto numeric(6,2) DEFAULT 0,
    usuarioingeso character(6),
    fechaingreso timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    fechacese timestamp without time zone,
    horaentrada character varying(30),
    tarifa_urbanacc numeric(5,3) DEFAULT 0.000,
    tarifa_urbanasc numeric(5,3) DEFAULT 0.000,
    codempresa character(11),
    codzona character(10),
    tarifa_perifericacc numeric(5,3),
    tarifa_perifericasc numeric(5,3),
    tarifa_extremacc numeric(5,3),
    tarifa_extremasc numeric(5,3),
    sexo character(1),
    correo_empresa character varying(250),
    empresa character varying(60),
    dirempresa character varying(60),
    rucempresa character varying(20),
    telefono2 character varying(20),
    correo2 character varying(20),
    coddestino character(6),
    codigojefedirecto character(6),
    zona_bono character(1),
    codventa character varying(11),
    codsede character(3)
);


ALTER TABLE public.personal OWNER TO postgres;

--
-- TOC entry 1933 (class 1259 OID 16671)
-- Dependencies: 2446 2447 2448 6
-- Name: rutapath; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE rutapath (
    codigo character(2) NOT NULL,
    path character varying(50),
    descripcion character varying(60),
    fecha timestamp without time zone,
    usuario character(6),
    usuariomod character(6),
    fechamod timestamp without time zone,
    tipo smallint DEFAULT 0,
    pordefecto smallint DEFAULT 0,
    codestado smallint DEFAULT 0
);


ALTER TABLE public.rutapath OWNER TO postgres;

--
-- TOC entry 3016 (class 0 OID 0)
-- Dependencies: 1933
-- Name: COLUMN rutapath.tipo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN rutapath.tipo IS '1=reparto 2=ajuste 3=motivos 4= sesiones';


--
-- TOC entry 3017 (class 0 OID 0)
-- Dependencies: 1933
-- Name: COLUMN rutapath.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN rutapath.codestado IS '0=activo 1=anulado';


--
-- TOC entry 1934 (class 1259 OID 16677)
-- Dependencies: 2449 2450 2451 6
-- Name: sedesprov; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE sedesprov (
    codsede character(3) NOT NULL,
    nomsede character varying(100),
    direccion character varying(100),
    ubigeo character(6),
    ciudad character varying(50),
    url character varying(250),
    estado smallint DEFAULT 0,
    alias_sede character varying(50),
    ip_sede character varying(20),
    nro_maq_reg character varying(30),
    nro_autorizacion character varying(20),
    tipo smallint DEFAULT 0,
    tipo1 smallint DEFAULT 0
);


ALTER TABLE public.sedesprov OWNER TO postgres;

--
-- TOC entry 1935 (class 1259 OID 16686)
-- Dependencies: 6
-- Name: t_admin_acceso; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_admin_acceso (
    tipo_acceso character(1) NOT NULL,
    correlativo numeric(6,0) NOT NULL,
    codigo_agente character(6),
    codigo_personal character(6),
    codigo_cliente character varying(11),
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.t_admin_acceso OWNER TO postgres;

--
-- TOC entry 3018 (class 0 OID 0)
-- Dependencies: 1935
-- Name: COLUMN t_admin_acceso.tipo_acceso; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_admin_acceso.tipo_acceso IS 'A=Agente C=Cliente E=Ejecutivo';


--
-- TOC entry 2032 (class 1259 OID 18868)
-- Dependencies: 2575 6
-- Name: t_aeropuerto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_aeropuerto (
    codigo character(6) NOT NULL,
    iata character varying(3),
    icao character varying(4),
    ciudad character varying(100),
    pais character varying(100),
    aeropuerto character varying(200),
    estado smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_aeropuerto OWNER TO postgres;

--
-- TOC entry 1936 (class 1259 OID 16689)
-- Dependencies: 6
-- Name: t_agentedestino; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_agentedestino (
    ubigeo character(6) NOT NULL,
    codigopersonal character(6) NOT NULL,
    usuariocrea character(6) NOT NULL,
    fechacrea timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado character(1) NOT NULL
);


ALTER TABLE public.t_agentedestino OWNER TO postgres;

--
-- TOC entry 3019 (class 0 OID 0)
-- Dependencies: 1936
-- Name: COLUMN t_agentedestino.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_agentedestino.estado IS 'A - Activo
N - Anulado';


--
-- TOC entry 1937 (class 1259 OID 16692)
-- Dependencies: 2452 6
-- Name: t_ambitos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ambitos (
    codambito character(2) NOT NULL,
    ambito character(30),
    fecha timestamp without time zone,
    usuario character(6),
    fechamod timestamp without time zone,
    usuariomod character(6),
    estado smallint DEFAULT 0 NOT NULL,
    codnegocio character(2)
);


ALTER TABLE public.t_ambitos OWNER TO postgres;

--
-- TOC entry 1938 (class 1259 OID 16696)
-- Dependencies: 6
-- Name: t_apoyo_cab; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_apoyo_cab (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    fecha_ingreso date,
    codestado character(1),
    usuario character(6),
    fecha timestamp without time zone,
    usuario_cierre character(6),
    fecha_cierre timestamp without time zone,
    codplanilla character(3)
);


ALTER TABLE public.t_apoyo_cab OWNER TO postgres;

--
-- TOC entry 3020 (class 0 OID 0)
-- Dependencies: 1938
-- Name: COLUMN t_apoyo_cab.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_apoyo_cab.codestado IS 'P=Pendiente E=En Proceso C=Culminado';


--
-- TOC entry 1939 (class 1259 OID 16699)
-- Dependencies: 6
-- Name: t_apoyo_det; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_apoyo_det (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    codigopersonal character(6) NOT NULL,
    cod_tipo_apoyo character(3) NOT NULL,
    desde numeric(7,0) NOT NULL,
    hasta numeric(7,0) NOT NULL,
    cantidad numeric(7,0),
    monto numeric(7,3),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    codestado character(1),
    tarifa numeric(6,3),
    codplanilla character(3),
    fecha_ingreso date
);


ALTER TABLE public.t_apoyo_det OWNER TO postgres;

--
-- TOC entry 3021 (class 0 OID 0)
-- Dependencies: 1939
-- Name: COLUMN t_apoyo_det.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_apoyo_det.codestado IS 'E=En Proceso C=Culminado';


--
-- TOC entry 1940 (class 1259 OID 16702)
-- Dependencies: 6
-- Name: t_apoyo_extra; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_apoyo_extra (
    codplanilla character(3) NOT NULL,
    codigopersonal character(6) NOT NULL,
    itemextra numeric(9,0) NOT NULL,
    fechapoyo date NOT NULL,
    fechadesde timestamp with time zone,
    fechahasta timestamp with time zone,
    timedesde character(10) NOT NULL,
    timehasta character(10) NOT NULL,
    horas numeric(7,0) NOT NULL,
    turno character(2),
    moneda character(1) NOT NULL,
    monto numeric(9,3) NOT NULL,
    detalle character(250) NOT NULL,
    estado character(1),
    usuario character(6) NOT NULL,
    fecha timestamp with time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp with time zone
);


ALTER TABLE public.t_apoyo_extra OWNER TO postgres;

--
-- TOC entry 1941 (class 1259 OID 16705)
-- Dependencies: 6
-- Name: t_apoyo_personal; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_apoyo_personal (
    fecha_guia date NOT NULL,
    codigopersonal character(6) NOT NULL,
    estado character varying(1),
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.t_apoyo_personal OWNER TO postgres;

--
-- TOC entry 2063 (class 1259 OID 180600)
-- Dependencies: 2627 6
-- Name: t_apoyo_sueldo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_apoyo_sueldo (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    desde character(6) NOT NULL,
    hasta character varying(6) NOT NULL,
    codigopersonal character(6) NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    tipo smallint DEFAULT 0
);


ALTER TABLE public.t_apoyo_sueldo OWNER TO postgres;

--
-- TOC entry 2023 (class 1259 OID 17631)
-- Dependencies: 2566 6
-- Name: t_apoyo_verifica; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_apoyo_verifica (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    desde character(6) NOT NULL,
    hasta character varying(6) NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    tipo smallint DEFAULT 0
);


ALTER TABLE public.t_apoyo_verifica OWNER TO postgres;

--
-- TOC entry 1942 (class 1259 OID 16708)
-- Dependencies: 6
-- Name: t_banco; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_banco (
    codbanco character(4) NOT NULL,
    ruc character(11),
    descripcion character(40) NOT NULL,
    abreviado character(20) NOT NULL,
    observacion character(50),
    ciudad character varying(60),
    pais character varying(60),
    saldon numeric(10,3),
    saldod numeric(10,3),
    usuario_crea character(6) NOT NULL,
    fecha_crea timestamp without time zone NOT NULL,
    usuario_mod character(6),
    fecha_mod timestamp without time zone
);


ALTER TABLE public.t_banco OWNER TO postgres;

--
-- TOC entry 2059 (class 1259 OID 173162)
-- Dependencies: 2606 2607 2608 2609 2610 2611 2612 2613 6
-- Name: t_bloqueo_orden; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_bloqueo_orden (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    desde timestamp without time zone NOT NULL,
    hasta timestamp without time zone NOT NULL,
    dia1 smallint DEFAULT 0,
    dia2 smallint DEFAULT 0,
    dia3 smallint DEFAULT 0,
    dia4 smallint DEFAULT 0,
    dia5 smallint DEFAULT 0,
    dia6 smallint DEFAULT 0,
    dia7 smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp(6) without time zone,
    usuariomod character(6),
    fechamod timestamp(6) without time zone,
    est_bloqueo smallint DEFAULT 0,
    usuario_anula character varying(6),
    fecha_anula timestamp(6) without time zone
);


ALTER TABLE public.t_bloqueo_orden OWNER TO postgres;

--
-- TOC entry 1943 (class 1259 OID 16711)
-- Dependencies: 2453 2454 6
-- Name: t_bono; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_bono (
    itembon numeric(8,0) NOT NULL,
    codbono character(2) NOT NULL,
    monto numeric(8,2),
    montototal numeric(8,2),
    codsede character(3) NOT NULL,
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    fechabono date NOT NULL,
    codmensajero character(6) NOT NULL,
    observacion character varying(1000),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    diasb numeric(3,0) DEFAULT 0,
    estado smallint DEFAULT 0 NOT NULL,
    host character(50),
    ip_pc character(20),
    usuarioanula character(6),
    fechaanula timestamp without time zone,
    argumento character(100),
    ip_anula character(20)
);


ALTER TABLE public.t_bono OWNER TO postgres;

--
-- TOC entry 3022 (class 0 OID 0)
-- Dependencies: 1943
-- Name: COLUMN t_bono.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_bono.estado IS '1 -- Pendiente
2 -- Anulado';


--
-- TOC entry 1944 (class 1259 OID 16719)
-- Dependencies: 2455 6
-- Name: t_caja; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_caja (
    nrocaja smallint NOT NULL,
    caja character varying(30),
    codestado smallint DEFAULT 0
);


ALTER TABLE public.t_caja OWNER TO postgres;

--
-- TOC entry 2053 (class 1259 OID 163288)
-- Dependencies: 6
-- Name: t_ciudad; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ciudad (
    codciudad character(3) NOT NULL,
    ciudad character varying(100),
    codpais character(2)
);


ALTER TABLE public.t_ciudad OWNER TO postgres;

--
-- TOC entry 1945 (class 1259 OID 16723)
-- Dependencies: 6
-- Name: t_clavesacceso; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_clavesacceso (
    codigo character(3) NOT NULL,
    codigopersonal character(6) NOT NULL,
    clave character(10),
    descripcion character varying(100)
);


ALTER TABLE public.t_clavesacceso OWNER TO postgres;

--
-- TOC entry 1946 (class 1259 OID 16726)
-- Dependencies: 2456 6
-- Name: t_cliente_personal; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_cliente_personal (
    codcliente character(11) NOT NULL,
    codigopersonal character(6) NOT NULL,
    estado smallint DEFAULT 0 NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_cliente_personal OWNER TO postgres;

--
-- TOC entry 2021 (class 1259 OID 17465)
-- Dependencies: 2563 6
-- Name: t_como_conocio; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_como_conocio (
    codigo character(3) NOT NULL,
    descripcion character varying(100),
    estado smallint DEFAULT 0
);


ALTER TABLE public.t_como_conocio OWNER TO postgres;

--
-- TOC entry 2037 (class 1259 OID 19080)
-- Dependencies: 2579 2580 2581 2582 6
-- Name: t_conceptos_cobro_internacional; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_conceptos_cobro_internacional (
    cod_concepto character(4) NOT NULL,
    des_concepto character varying(200),
    codnegocio character(2),
    codservicio character(4),
    graba character(1) DEFAULT 'S'::bpchar,
    estado smallint DEFAULT 0,
    guia smallint DEFAULT 0,
    t_transporte character(1) DEFAULT 'A'::bpchar,
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.t_conceptos_cobro_internacional OWNER TO postgres;

--
-- TOC entry 2042 (class 1259 OID 162535)
-- Dependencies: 2587 6
-- Name: t_conceptos_plus; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_conceptos_plus (
    cod_concepto character(4) NOT NULL,
    concepto character varying(200),
    estado smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_conceptos_plus OWNER TO postgres;

--
-- TOC entry 1947 (class 1259 OID 16730)
-- Dependencies: 6
-- Name: t_confirmacion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_confirmacion (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    detalle_acuse character varying(80),
    fecha_acuse timestamp without time zone,
    estado_acuse character(1),
    tipo_receptor character varying(1),
    codsede character(3),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    dni character varying(20),
    telefono character varying(20),
    observacion character varying(100),
    serieguia character(3),
    nroguia character(6)
);


ALTER TABLE public.t_confirmacion OWNER TO postgres;

--
-- TOC entry 3023 (class 0 OID 0)
-- Dependencies: 1947
-- Name: COLUMN t_confirmacion.estado_acuse; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_confirmacion.estado_acuse IS 'E=Entrega M=Motivo O=Otros';


--
-- TOC entry 3024 (class 0 OID 0)
-- Dependencies: 1947
-- Name: COLUMN t_confirmacion.tipo_receptor; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_confirmacion.tipo_receptor IS 'T=titular F=Familiar O=Otros';


--
-- TOC entry 1948 (class 1259 OID 16733)
-- Dependencies: 6
-- Name: t_confirmacion_orden; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_confirmacion_orden (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    cod_conformidad character(1),
    des_conformidad character varying(100),
    codcliente character(11),
    codareacliente character(15),
    codcontacto character(6),
    usuario character(6),
    fecha timestamp without time zone,
    usuario_m character(6),
    fecha_m timestamp without time zone
);


ALTER TABLE public.t_confirmacion_orden OWNER TO postgres;

--
-- TOC entry 2025 (class 1259 OID 17747)
-- Dependencies: 6
-- Name: t_coordinacion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_coordinacion (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(7) NOT NULL,
    items integer NOT NULL,
    codcliente character(11),
    codestado character(1),
    desestado character varying(50),
    fecha_entrega date,
    desde character varying(10),
    hasta character varying(10),
    contacto character varying(100),
    direccion character varying(100),
    referencia character varying(150),
    ubigeo character(6),
    telefono character varying(250),
    observacion character varying(150),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    p_nro_clave character varying(20),
    p_lugar_nac character varying(50),
    p_fecha_nac date,
    p_departamento character varying(50),
    p_pais character varying(50),
    p_nacionalidad character varying(50),
    p_nro_dni character varying(20),
    p_nro_pasaporte character varying(50),
    p_telefono_fijo character varying(20),
    p_movistar character varying(20),
    p_claro character varying(20),
    p_nextel character varying(20),
    p_email character varying(80),
    p_sitio_web character varying(80),
    p_urbanizacion character varying(100),
    p_distrito character varying(50),
    f_estado_civil character varying(20),
    f_nombres character varying(80),
    f_ap_paterno character varying(50),
    f_ap_materno character varying(50),
    f_lugar_nac character varying(50),
    f_departamento character varying(50),
    f_pais character varying(50),
    f_nacionalidad character varying(50),
    f_nro_hijos integer,
    f_edades character varying(50),
    f_nro_dni character varying(50),
    lt_empresa character varying(50),
    lt_cargo character varying(50),
    lt_direccion character varying(150),
    lt_distrito character varying(50),
    lt_telefono character varying(20),
    lt_referencia character varying(150),
    lt_email character varying(80),
    lc_empresa character varying(50),
    lc_cargo character varying(50),
    lc_direccion character varying(150),
    lc_distrito character varying(50),
    lc_telefono character varying(20),
    lc_referencia character varying(150),
    lc_email character varying(80),
    at_actividad character varying(50),
    at_actividad1 character varying(50),
    ac_actividad character varying(50),
    ac_actividad1 character varying(50),
    i_informacion character varying(250)
);


ALTER TABLE public.t_coordinacion OWNER TO postgres;

--
-- TOC entry 1949 (class 1259 OID 16736)
-- Dependencies: 2457 6
-- Name: t_correo_personal; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_correo_personal (
    coddepartamento character(4) NOT NULL,
    codigopersonal character(6) NOT NULL,
    estado smallint DEFAULT 0 NOT NULL
);


ALTER TABLE public.t_correo_personal OWNER TO postgres;

--
-- TOC entry 1950 (class 1259 OID 16740)
-- Dependencies: 6
-- Name: t_ctasbancaria; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ctasbancaria (
    codagente character(6) NOT NULL,
    codbanco character(4) NOT NULL,
    nrocuenta character varying(50) NOT NULL,
    moneda character(1) NOT NULL,
    usuariocrea character(6) NOT NULL,
    fechacrea timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado character(2) NOT NULL
);


ALTER TABLE public.t_ctasbancaria OWNER TO postgres;

--
-- TOC entry 2033 (class 1259 OID 18874)
-- Dependencies: 6
-- Name: t_datorden; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_datorden (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL
);


ALTER TABLE public.t_datorden OWNER TO postgres;

--
-- TOC entry 1951 (class 1259 OID 16743)
-- Dependencies: 2458 2459 6
-- Name: t_departamento; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_departamento (
    coddepartamento character(4) NOT NULL,
    departamento character varying(50),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    anulado smallint DEFAULT 0,
    flag smallint DEFAULT 0
);


ALTER TABLE public.t_departamento OWNER TO postgres;

--
-- TOC entry 1952 (class 1259 OID 16748)
-- Dependencies: 6
-- Name: t_destino; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_destino (
    coddestino character varying(60) NOT NULL,
    codpostal character varying(3),
    ubigeo character(6),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    nombre character varying(100)
);


ALTER TABLE public.t_destino OWNER TO postgres;

--
-- TOC entry 1953 (class 1259 OID 16751)
-- Dependencies: 2460 6
-- Name: t_destinos_internacional; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_destinos_internacional (
    cod_des character(10) NOT NULL,
    descripcion character varying(50),
    tipo character(1),
    estado character(1) DEFAULT 0,
    usuario character(10),
    fecha timestamp without time zone,
    codpais character(2)
);


ALTER TABLE public.t_destinos_internacional OWNER TO postgres;

--
-- TOC entry 2046 (class 1259 OID 162760)
-- Dependencies: 2590 6
-- Name: t_destinos_undtransporte; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_destinos_undtransporte (
    nrodestino character(6) NOT NULL,
    codcliente character(11),
    empresa character varying(200),
    puntollegada character varying(250),
    nrollegada character varying(50),
    dirllegada character varying(300),
    ubigeo character varying(6),
    estado smallint DEFAULT 0,
    usuario character varying(6),
    fecha timestamp without time zone,
    punto character(1),
    nroempresa character varying(2)
);


ALTER TABLE public.t_destinos_undtransporte OWNER TO postgres;

--
-- TOC entry 2048 (class 1259 OID 162980)
-- Dependencies: 6
-- Name: t_det_requerimiento_unidad; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_det_requerimiento_unidad (
    cod_vuelta character(7) NOT NULL,
    nro_req character(7) NOT NULL,
    codcliente character(11),
    codareacliente character(15),
    fecha_descarga date,
    h_llegada_tienda character varying(12),
    h_inicio_descarga character varying(12),
    h_final_descarga character varying(12),
    h_salida_tienda character varying(12),
    usuconf_descarga character varying(6),
    fecha_confdescarga timestamp without time zone,
    obsentrega_descarga character varying(500),
    fecha_llegada_cd date,
    h_llegada_cd character varying(12),
    h_inicio_carga_cd character varying(12),
    h_fin_carga_cd character varying(12),
    h_salida_cd character varying(12),
    usuario_llegada_cd character(6),
    fecha_conf_llegada_cd timestamp without time zone,
    obs_llegada_cd character varying(250),
    img_llegada_cd character varying(1),
    img_iniciocar_cd character varying(1),
    img_fincar_cd character varying(1),
    img_salida_cd character varying(1),
    img_llegada_td character varying(1),
    img_iniciodes_td character varying(1),
    img_findesc_td character varying(1),
    img_salida_td character varying(1),
    fecha_carga date,
    fecha_despacho date
);


ALTER TABLE public.t_det_requerimiento_unidad OWNER TO postgres;

--
-- TOC entry 1954 (class 1259 OID 16755)
-- Dependencies: 2461 6
-- Name: t_devolucion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_devolucion (
    seriedevolucion character(3) NOT NULL,
    nrodevolucion character(6) NOT NULL,
    correlativo character(6),
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    fechadevolucion timestamp without time zone,
    codigopersonal character(6),
    codunidad character(3),
    codcliente character(11),
    codareacliente character(15),
    fechaentrega timestamp without time zone,
    direccionentrega character varying(200),
    sello character(1),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    obsentrega character varying(100),
    area_origen character(4),
    area_destino character(4),
    desde numeric(6,0),
    hasta numeric(6,0),
    tiporecepcion character(1),
    usuariorecepciona character(6),
    fecharecepcion timestamp without time zone,
    imagen character(1),
    consignado character varying(150),
    nuevadireccion character varying(200),
    codestado smallint DEFAULT 0,
    usuario_digitaliza character(6),
    fecha_digitaliza timestamp without time zone,
    codorigen character(4),
    coddestino character(4)
);


ALTER TABLE public.t_devolucion OWNER TO postgres;

--
-- TOC entry 3025 (class 0 OID 0)
-- Dependencies: 1954
-- Name: COLUMN t_devolucion.tiporecepcion; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_devolucion.tiporecepcion IS 'S=SI N=NO';


--
-- TOC entry 3026 (class 0 OID 0)
-- Dependencies: 1954
-- Name: COLUMN t_devolucion.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_devolucion.codestado IS '0=pendiente 1=ruta 2=entregado 3=rechazado 4=anulado';


--
-- TOC entry 2024 (class 1259 OID 17685)
-- Dependencies: 6
-- Name: t_devolucion_masivo_courier; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_devolucion_masivo_courier (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    fecguia date,
    codcliente character(11),
    codareacliente character(15),
    estado character varying(2),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    usucierre character(6),
    feccierre timestamp without time zone,
    obs character varying(100),
    desde timestamp without time zone,
    hasta timestamp without time zone
);


ALTER TABLE public.t_devolucion_masivo_courier OWNER TO postgres;

--
-- TOC entry 1955 (class 1259 OID 16762)
-- Dependencies: 6
-- Name: t_dfactura; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_dfactura (
    fac_serie character(3),
    fac_num character(6),
    dfac_cantidad numeric(10,3),
    dfac_descripcion character varying(200),
    dfac_punit numeric(10,3),
    dfac_total numeric(10,3),
    serie character(3),
    orden character(6)
);


ALTER TABLE public.t_dfactura OWNER TO postgres;

--
-- TOC entry 2052 (class 1259 OID 163081)
-- Dependencies: 2601 6
-- Name: t_distrito; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_distrito (
    codpostal character(3) NOT NULL,
    distrito character varying(50),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    anulado smallint DEFAULT 0,
    bono_zona character varying(1),
    ubigeo character(6)
);


ALTER TABLE public.t_distrito OWNER TO postgres;

--
-- TOC entry 1956 (class 1259 OID 16765)
-- Dependencies: 6
-- Name: t_documento; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_documento (
    tipo_documento character(1) NOT NULL,
    des_documento character(50),
    usuario_crea character(6),
    fecha_crea timestamp without time zone,
    usuario_mod character(6),
    fecha_mod timestamp without time zone,
    estado character(1)
);


ALTER TABLE public.t_documento OWNER TO postgres;

--
-- TOC entry 1957 (class 1259 OID 16768)
-- Dependencies: 6
-- Name: t_emision; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_emision (
    tipo_emision character(1) NOT NULL,
    des_emision character(250),
    usuario_crea character(6),
    fecha_crea timestamp without time zone,
    usuario_mod character(6),
    fecha_mod timestamp without time zone,
    estado character(1)
);


ALTER TABLE public.t_emision OWNER TO postgres;

--
-- TOC entry 1958 (class 1259 OID 16771)
-- Dependencies: 6
-- Name: t_empresa; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_empresa (
    codempresa character varying(11) NOT NULL,
    desempresa character varying(80) NOT NULL,
    abreviado character varying(10) NOT NULL,
    direccion character varying(80) NOT NULL,
    codciudad character(3),
    codpostal character(3),
    codprov character(4),
    coddepartamento character(4),
    codpais character(2),
    representante_legal character varying(60) NOT NULL,
    codoficina character(3),
    oficina_principal character(3),
    telefonos character varying(40),
    fax character varying(20),
    email character varying(60),
    emailalterno character varying(60),
    paginaweb character varying(60),
    observacion character varying(240),
    activo character(2) NOT NULL,
    codservicio character(4),
    codproducto character(4),
    cnt_admision integer,
    codnegocio character(2),
    usuario character varying(6),
    fecha timestamp without time zone,
    usuariomod character varying(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_empresa OWNER TO postgres;

--
-- TOC entry 2039 (class 1259 OID 19228)
-- Dependencies: 6
-- Name: t_equivalencia; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_equivalencia (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    barracliente character varying(50) NOT NULL
);


ALTER TABLE public.t_equivalencia OWNER TO postgres;

--
-- TOC entry 1959 (class 1259 OID 16777)
-- Dependencies: 2462 6
-- Name: t_estado_guia; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_estado_guia (
    codestadoguia character(2) NOT NULL,
    estadoguia character varying(50),
    estado smallint DEFAULT 0 NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_estado_guia OWNER TO postgres;

--
-- TOC entry 1960 (class 1259 OID 16781)
-- Dependencies: 6
-- Name: t_estadocivil; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_estadocivil (
    codestadocivil character(2) NOT NULL,
    estadocivil character varying(50)
);


ALTER TABLE public.t_estadocivil OWNER TO postgres;

--
-- TOC entry 1961 (class 1259 OID 16784)
-- Dependencies: 2463 6
-- Name: t_estadocuenta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_estadocuenta (
    serie_est character(3) NOT NULL,
    numero_est character(6) NOT NULL,
    codcliente character(11) NOT NULL,
    codarea character(15) NOT NULL,
    importe numeric(9,3),
    descuento numeric(9,3),
    venta numeric(9,3),
    igv numeric(9,3),
    total numeric(9,3),
    estado smallint DEFAULT 0,
    moneda character(1),
    seriedocumento character(3),
    nrodocumento numeric(9,0),
    usuario character(6),
    fecha_crea timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    inafecto numeric(9,3),
    fecha date,
    glosa character(250),
    desde timestamp without time zone,
    hasta timestamp without time zone,
    tipodocumento character(1),
    graba character(1),
    p_igv numeric(15,2)
);


ALTER TABLE public.t_estadocuenta OWNER TO postgres;

--
-- TOC entry 3027 (class 0 OID 0)
-- Dependencies: 1961
-- Name: COLUMN t_estadocuenta.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_estadocuenta.estado IS '0 Pendiente
1 Anulado
2 Facturado
3 Cerrado';


--
-- TOC entry 1962 (class 1259 OID 16788)
-- Dependencies: 2464 2465 6
-- Name: t_estados_orden; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_estados_orden (
    codestadoorden character(2) DEFAULT 1 NOT NULL,
    estadoorden character varying(50),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL,
    observacion character varying(80)
);


ALTER TABLE public.t_estados_orden OWNER TO postgres;

--
-- TOC entry 1963 (class 1259 OID 16793)
-- Dependencies: 2466 2467 2468 2469 2470 2471 2472 2473 6
-- Name: t_factura; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_factura (
    tipo_documento character(1) NOT NULL,
    serie_documento character(3) NOT NULL,
    nro_documento numeric(9,0) NOT NULL,
    codcliente character varying(11) NOT NULL,
    codareacliente character(15) NOT NULL,
    codubigeo character(6) NOT NULL,
    fecha_emision date NOT NULL,
    cod_oficina character(6) NOT NULL,
    valor_venta numeric(9,3) DEFAULT 0.000 NOT NULL,
    valor_descuento numeric(9,3) DEFAULT 0.000 NOT NULL,
    valor_inafecto numeric(9,3) DEFAULT 0.000,
    valor_imponible numeric(9,3) DEFAULT 0.000 NOT NULL,
    valor_igv numeric(9,3) DEFAULT 0.000 NOT NULL,
    valor_total numeric(9,3) DEFAULT 0.000 NOT NULL,
    moneda character(1) NOT NULL,
    collect character varying(1) NOT NULL,
    codnegocio character(2) NOT NULL,
    observacion character varying(500),
    cod_usuario character varying(6) NOT NULL,
    tipo_emision character(1) NOT NULL,
    tipo_venta character(1) NOT NULL,
    cantidad numeric(9,3) DEFAULT 0.000 NOT NULL,
    estado character(1) NOT NULL,
    cod_usuario_anula character varying(10),
    cod_motivo character(4),
    fecha_anulacion timestamp without time zone,
    serie_voucher character(3),
    nro_voucher numeric(9,0),
    tipo_cambio numeric(9,3) DEFAULT 3.150 NOT NULL,
    glosa character varying(300),
    usuario_crea character varying(6),
    fecha_crea timestamp without time zone,
    usuario_modifica character varying(6),
    fecha_modifica timestamp without time zone,
    codempresa character varying(11),
    fecha_vence date,
    tipo_relacionado character(1),
    serie_relacionado character(3),
    nro_relacionado numeric(9,0),
    accion character(1),
    aprobado character varying(1),
    codservicio character(4)
);


ALTER TABLE public.t_factura OWNER TO postgres;

--
-- TOC entry 3028 (class 0 OID 0)
-- Dependencies: 1963
-- Name: COLUMN t_factura.tipo_emision; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_factura.tipo_emision IS 'N NORMAL(ORDEN)
O OTRAS EMISIONES(ORDEN)
E ESTADO DE CUENTA (ORDEN)
C NOTAS (ORDEN)
I INTERNACIONAL (ORDEN)';


--
-- TOC entry 3029 (class 0 OID 0)
-- Dependencies: 1963
-- Name: COLUMN t_factura.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_factura.estado IS 'P - Pendiente
L - Liquidado
C - Cancelado
A - Anulado';


--
-- TOC entry 1964 (class 1259 OID 16807)
-- Dependencies: 2474 2475 2476 6
-- Name: t_factura_plus; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_factura_plus (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo numeric(6,0) DEFAULT 0 NOT NULL,
    codproceso character(3),
    tarifa numeric(10,3) DEFAULT 0,
    monto numeric(15,3),
    estado smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    motanula character varying(150),
    observacion character varying(150),
    codservicio character(4),
    codsubservicio character(4)
);


ALTER TABLE public.t_factura_plus OWNER TO postgres;

--
-- TOC entry 3030 (class 0 OID 0)
-- Dependencies: 1964
-- Name: COLUMN t_factura_plus.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_factura_plus.estado IS '0=Pendiente 1=Aulado 2=Aprobado';


--
-- TOC entry 2065 (class 1259 OID 180928)
-- Dependencies: 6
-- Name: t_fecha_corte_enotria; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_fecha_corte_enotria (
    serie_fc character(3) NOT NULL,
    nro_fc character(7) NOT NULL,
    fecha_corte date,
    dia character varying(2),
    mes character varying(2),
    anio character varying(4),
    codproducto character varying(4),
    codcliente character(11),
    codareacliente character(15),
    estado character varying(1),
    usuario character(6),
    fecha timestamp(6) without time zone,
    new_codproducto character varying(10)
);


ALTER TABLE public.t_fecha_corte_enotria OWNER TO postgres;

--
-- TOC entry 2031 (class 1259 OID 18841)
-- Dependencies: 2574 6
-- Name: t_feriados; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_feriados (
    fecha date NOT NULL,
    estado smallint DEFAULT 0,
    observacion character varying(500)
);


ALTER TABLE public.t_feriados OWNER TO postgres;

--
-- TOC entry 1965 (class 1259 OID 16813)
-- Dependencies: 2477 6
-- Name: t_flete; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_flete (
    cod_tipo_flete smallint DEFAULT 0 NOT NULL,
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    codigopersonal character(6) NOT NULL,
    fecha_flete date,
    nrocaja smallint,
    moneda character(1),
    monto numeric(8,2),
    codestado character(1),
    codusuario character(6),
    fecha timestamp without time zone,
    codusuariomod character(6),
    fechamod timestamp without time zone,
    cantidad integer
);


ALTER TABLE public.t_flete OWNER TO postgres;

--
-- TOC entry 3031 (class 0 OID 0)
-- Dependencies: 1965
-- Name: COLUMN t_flete.cod_tipo_flete; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_flete.cod_tipo_flete IS '1=MENSAJERIA 2=VERIFICACION 3=OTROS';


--
-- TOC entry 3032 (class 0 OID 0)
-- Dependencies: 1965
-- Name: COLUMN t_flete.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_flete.codestado IS 'E=ENTREGADO A=ANULADO';


--
-- TOC entry 1966 (class 1259 OID 16817)
-- Dependencies: 2478 2479 2480 6
-- Name: t_guia_devolucion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_guia_devolucion (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    fecsalida date,
    fecretorno date,
    codigopersonal character(6),
    codauxiliar character(6),
    total integer DEFAULT 0,
    total_recep integer DEFAULT 0,
    observacion character varying(100),
    codestadoguia character(1),
    usuario_despacho character(6),
    fecha_despacho timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    userasigna character(6),
    fecasigna timestamp without time zone,
    codorigen character(3),
    cod_tracking_guia smallint DEFAULT 0,
    cod_unidad character(3),
    nro_placa character varying(10)
);


ALTER TABLE public.t_guia_devolucion OWNER TO postgres;

--
-- TOC entry 1967 (class 1259 OID 16823)
-- Dependencies: 6
-- Name: t_guia_devolucion_det; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_guia_devolucion_det (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    seriedevolucion character(3) NOT NULL,
    nrodevolucion character(6) NOT NULL,
    codclienteb character varying(11),
    codestado character(1),
    user_cla character(6),
    fec_cla timestamp without time zone,
    user_recep character(6),
    fec_recep timestamp without time zone
);


ALTER TABLE public.t_guia_devolucion_det OWNER TO postgres;

--
-- TOC entry 3033 (class 0 OID 0)
-- Dependencies: 1967
-- Name: COLUMN t_guia_devolucion_det.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_guia_devolucion_det.codestado IS 'R=ruta E=entregado X=rechazado A=anulado';


--
-- TOC entry 1968 (class 1259 OID 16826)
-- Dependencies: 2481 2482 2483 6
-- Name: t_guia_interna; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_guia_interna (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    fecsalida date,
    fecretorno date,
    cod_area_origen character(4),
    cod_area_destino character(4),
    total integer DEFAULT 0,
    observacion character varying(100),
    codestadoguia character(1),
    usuario_despacho character(6),
    fecha_despacho timestamp without time zone,
    usuario_recepcion character(6),
    fecha_recepcion timestamp without time zone,
    userasigna character(6),
    fecasigna timestamp without time zone,
    codorigen character(3),
    cod_tracking_guia smallint DEFAULT 0,
    total_recep integer DEFAULT 0,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_guia_interna OWNER TO postgres;

--
-- TOC entry 1969 (class 1259 OID 16832)
-- Dependencies: 6
-- Name: t_guia_interna_det; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_guia_interna_det (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    codclienteb character varying(11),
    codestado character(1),
    user_cla character(6),
    fec_cla timestamp without time zone,
    user_recep character(6),
    fec_recep timestamp without time zone
);


ALTER TABLE public.t_guia_interna_det OWNER TO postgres;

--
-- TOC entry 2051 (class 1259 OID 163040)
-- Dependencies: 2600 6
-- Name: t_guia_zona; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_guia_zona (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    codzona character(10) NOT NULL,
    pasaje numeric(10,2) DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.t_guia_zona OWNER TO postgres;

--
-- TOC entry 2064 (class 1259 OID 180910)
-- Dependencies: 2628 6
-- Name: t_imagen_delete; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_imagen_delete (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    items smallint DEFAULT 0 NOT NULL,
    est_imagen character varying(1),
    des_anula character varying(100),
    usuario_anula character(6),
    fecha_anula timestamp without time zone,
    usuario_imagen character(6),
    fecha_imagen timestamp without time zone,
    ruta_imagen character varying(150)
);


ALTER TABLE public.t_imagen_delete OWNER TO postgres;

--
-- TOC entry 1970 (class 1259 OID 16835)
-- Dependencies: 6
-- Name: t_items; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_items (
    cod_item character(3) NOT NULL,
    item_inicio integer,
    item_fin integer,
    item_contador integer,
    item_limite integer,
    descripcion character varying(50),
    estado character(1)
);


ALTER TABLE public.t_items OWNER TO postgres;

--
-- TOC entry 1971 (class 1259 OID 16838)
-- Dependencies: 2484 2485 2486 2487 2488 6
-- Name: t_liquidacion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_liquidacion (
    seriedevolucion character(3) NOT NULL,
    nrodevolucion character(6) NOT NULL,
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    entregados integer DEFAULT 0,
    motivos integer DEFAULT 0,
    pendientes integer DEFAULT 0,
    notrabajados integer DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    observacion character varying(100),
    nrofactura character varying(40),
    codestado smallint DEFAULT 0 NOT NULL
);


ALTER TABLE public.t_liquidacion OWNER TO postgres;

--
-- TOC entry 3034 (class 0 OID 0)
-- Dependencies: 1971
-- Name: COLUMN t_liquidacion.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_liquidacion.codestado IS '0=Pendiente 1=Devuelto';


--
-- TOC entry 2045 (class 1259 OID 162641)
-- Dependencies: 2589 6
-- Name: t_logueows; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_logueows (
    usuario character varying(50) NOT NULL,
    clave character varying(20),
    estado smallint DEFAULT 0,
    codcliente character(11),
    codareacliente character varying(15)
);


ALTER TABLE public.t_logueows OWNER TO postgres;

--
-- TOC entry 3035 (class 0 OID 0)
-- Dependencies: 2045
-- Name: COLUMN t_logueows.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_logueows.estado IS '0--activo
1--anulado';


--
-- TOC entry 2054 (class 1259 OID 163293)
-- Dependencies: 2602 6
-- Name: t_manifiesto_couriers; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_manifiesto_couriers (
    serie character varying(6) NOT NULL,
    orden character varying(12) NOT NULL,
    vuelo character varying(100),
    fecha_courier date,
    tipo_manifiesto character varying(10),
    t_bultos numeric(15,2),
    peso numeric(15,2),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    tipo smallint NOT NULL,
    estado smallint DEFAULT 0,
    fecha_courier_llegada date
);


ALTER TABLE public.t_manifiesto_couriers OWNER TO postgres;

--
-- TOC entry 2055 (class 1259 OID 163316)
-- Dependencies: 6
-- Name: t_manifiesto_couriers_det; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_manifiesto_couriers_det (
    serie character varying(6) NOT NULL,
    orden character varying(12) NOT NULL,
    tipo smallint NOT NULL,
    ordserie character(3) NOT NULL,
    ordorden character(7) NOT NULL,
    awbserie character varying(6),
    awbnro character varying(12),
    codorigen character(3),
    coddestino character(3),
    tp1 smallint,
    tp2 character(1),
    embarcador character varying(200),
    contenido character varying(200),
    piezas smallint,
    peso numeric(15,2),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    consignatario character varying(200),
    fecha_cto date,
    fecha_endose date
);


ALTER TABLE public.t_manifiesto_couriers_det OWNER TO postgres;

--
-- TOC entry 2050 (class 1259 OID 163006)
-- Dependencies: 2597 2598 2599 6
-- Name: t_manifiesto_inter; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_manifiesto_inter (
    serie character(3) NOT NULL,
    nro character varying(6) NOT NULL,
    mawb character varying(20),
    fecha timestamp with time zone,
    linea character varying(200),
    origen character(10),
    destino character(10),
    operador character(2),
    contenido character varying(200),
    usuario character(6),
    fechamod timestamp without time zone,
    usuariomod character(6),
    usuario_anula character(6),
    fechaanula timestamp without time zone,
    estado character(1) DEFAULT 0,
    fecha_cierre timestamp without time zone,
    total_bultos numeric(5,0),
    total_peso numeric(10,2),
    usuario_cierre character(6),
    usuario_despacho character(6),
    fecha_despacho timestamp without time zone,
    usuario_ingpais character(6),
    fecha_ingpais timestamp without time zone,
    usuario_flete character(6),
    fecha_flete timestamp without time zone,
    flete_usa numeric(15,2) DEFAULT 0,
    usuario_alm character(6),
    fecha_alm timestamp without time zone,
    almacen_usa numeric(15,2) DEFAULT 0
);


ALTER TABLE public.t_manifiesto_inter OWNER TO postgres;

--
-- TOC entry 3036 (class 0 OID 0)
-- Dependencies: 2050
-- Name: COLUMN t_manifiesto_inter.fecha_cierre; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_manifiesto_inter.fecha_cierre IS '0  Manifestado
1 Despachado
2 Cerrado
3 Anulado';


--
-- TOC entry 1972 (class 1259 OID 16853)
-- Dependencies: 6
-- Name: t_manifiesto_inter_det; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_manifiesto_inter_det (
    serie character(3) NOT NULL,
    nro character(6) NOT NULL,
    serie_awb character(3) NOT NULL,
    nro_awb character(7) NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    codestado character(2),
    codglosa character(2),
    usuariodescargo character(6),
    fechadescargo timestamp without time zone,
    bultos numeric(5,0),
    peso numeric(10,2),
    usuarioaduanas character(6),
    fechaaduanas timestamp without time zone,
    user_pickup character varying(6),
    fecha_pickup timestamp without time zone,
    monto_pickup numeric(15,2),
    user_servicio character varying(6),
    fecha_servicio timestamp without time zone,
    monto_servicio numeric(15,2),
    user_delivery character varying(6),
    fecha_delivery timestamp without time zone,
    monto_delivery numeric(15,2),
    user_corte character varying(6),
    fecha_corte timestamp without time zone,
    monto_corte numeric(15,2),
    user_handling character varying(6),
    fecha_user_handling timestamp without time zone,
    monto_handling numeric(15,2),
    user_traslado character varying(6),
    fecha_traslado timestamp without time zone,
    monto_traslado numeric(15,2),
    user_recojo character varying(6),
    fecha_recojo timestamp without time zone,
    monto_recojo numeric(15,2)
);


ALTER TABLE public.t_manifiesto_inter_det OWNER TO postgres;

--
-- TOC entry 1973 (class 1259 OID 16856)
-- Dependencies: 6
-- Name: t_menu_accesouser; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_menu_accesouser (
    codpro character(4) NOT NULL,
    codusuario character(6) NOT NULL,
    usuario_crea character(6),
    fecha_crea timestamp without time zone
);


ALTER TABLE public.t_menu_accesouser OWNER TO postgres;

--
-- TOC entry 1974 (class 1259 OID 16859)
-- Dependencies: 6
-- Name: t_menu_accesoweb; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_menu_accesoweb (
    codmenu character(4) NOT NULL,
    descripcion character varying(200)
);


ALTER TABLE public.t_menu_accesoweb OWNER TO postgres;

--
-- TOC entry 1975 (class 1259 OID 16862)
-- Dependencies: 6
-- Name: t_menu_accesowebpr; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_menu_accesowebpr (
    codpro character(4) NOT NULL,
    codigo character(4) NOT NULL,
    descripcion character varying(200)
);


ALTER TABLE public.t_menu_accesowebpr OWNER TO postgres;

--
-- TOC entry 1976 (class 1259 OID 16865)
-- Dependencies: 6
-- Name: t_moneda; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_moneda (
    tipo_moneda character(1) NOT NULL,
    des_moneda character varying(150),
    simbolo character varying(20),
    usuario_crea character(6),
    fecha_crea timestamp without time zone,
    usuario_mod character(6),
    fecha_mod timestamp without time zone,
    estado character(1)
);


ALTER TABLE public.t_moneda OWNER TO postgres;

--
-- TOC entry 1977 (class 1259 OID 16868)
-- Dependencies: 6
-- Name: t_motivoanula; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_motivoanula (
    cod_motivo character(4) NOT NULL,
    des_motivo character varying(150),
    tipo_motivo character(2),
    usuario_crea character(6),
    fecha_crea timestamp without time zone,
    usuario_mod character(6),
    fecha_mod timestamp without time zone
);


ALTER TABLE public.t_motivoanula OWNER TO postgres;

--
-- TOC entry 2047 (class 1259 OID 162835)
-- Dependencies: 2591 2592 2593 2594 2595 2596 6
-- Name: t_mov_fecha_ciclo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_mov_fecha_ciclo (
    items character(6) NOT NULL,
    ciclo character varying(20) NOT NULL,
    fecha_mov date,
    cnt_entregados numeric(10,0) DEFAULT 0,
    cnt_motivos numeric(10,0) DEFAULT 0,
    cnt_ruta numeric(10,0) DEFAULT 0,
    cnt_pendientes numeric(10,0) DEFAULT 0,
    cnt_notrabajados numeric(10,0) DEFAULT 0,
    estado smallint DEFAULT 0,
    usuario character varying(6),
    fecha timestamp without time zone
);


ALTER TABLE public.t_mov_fecha_ciclo OWNER TO postgres;

--
-- TOC entry 1978 (class 1259 OID 16871)
-- Dependencies: 6
-- Name: t_movimiento_orden; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_movimiento_orden (
    codmovimiento character(2) NOT NULL,
    correlativo numeric(10,0) NOT NULL,
    serie character(3),
    orden character(7),
    usuario character(6),
    fecha timestamp without time zone,
    detallemov text,
    ip character varying(15)
);


ALTER TABLE public.t_movimiento_orden OWNER TO postgres;

--
-- TOC entry 1979 (class 1259 OID 16877)
-- Dependencies: 2489 2490 6
-- Name: t_negocios; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_negocios (
    codnegocio character(2) NOT NULL,
    negocio character varying(50),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    codresponsable character(6),
    estado smallint DEFAULT 0,
    telefono_empresa character varying(15),
    correo character varying(50),
    datos_encargado character varying(40),
    cargo character varying(60),
    anexo character(4),
    tipo smallint DEFAULT 0
);


ALTER TABLE public.t_negocios OWNER TO postgres;

--
-- TOC entry 1980 (class 1259 OID 16881)
-- Dependencies: 2491 2492 6
-- Name: t_operador; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_operador (
    codtipooperador character(2) DEFAULT 0 NOT NULL,
    operador character varying(50),
    estado smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_operador OWNER TO postgres;

--
-- TOC entry 1981 (class 1259 OID 16886)
-- Dependencies: 2493 2494 2495 2496 2497 2498 2499 2500 2501 2502 2503 2504 6
-- Name: t_ord_trabajo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ord_trabajo (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    ar_empresa character varying(150),
    ar_direccion character varying(150),
    ar_contacto character varying(150),
    ar_telefono character varying(20),
    ar_ruc character(11),
    ar_distrito character varying(20),
    ar_area character varying(150),
    ar_anexo character varying(10),
    ar_obs character varying(200),
    as_segmentado character varying(150),
    as_cantidad numeric,
    as_criterio character varying(150),
    as_distritos character varying(150),
    as_cargos smallint DEFAULT 0,
    as_etiquetas smallint DEFAULT 0,
    as_cargopropio smallint DEFAULT 0,
    as_dbmotivos smallint DEFAULT 0,
    as_dbejecutivo smallint DEFAULT 0,
    as_digitalizacion smallint DEFAULT 0,
    as_otros character varying(150),
    as_obs character varying(600),
    ac_obs character varying(600),
    ao_cargopits smallint DEFAULT 0,
    ao_cargopropio smallint DEFAULT 0,
    ao_sincargo smallint DEFAULT 0,
    ao_cntvisitas numeric,
    ao_tiempodistribusion numeric,
    ao_tiempomedida smallint DEFAULT 0,
    ao_fecinicio timestamp without time zone,
    ao_tiporeparto character varying(30),
    ao_fectermino timestamp without time zone,
    ao_obs character varying(600),
    atc_fecliquida timestamp without time zone,
    atc_liquidador character varying(100),
    atc_horaliquidada character varying(10),
    atc_obs character varying(600),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0,
    enviado smallint DEFAULT 0,
    areas_involucradas character varying(50),
    ap_postal character varying(200),
    ap_otros character varying(150),
    ap_obs character varying(600),
    otroscorreos character varying(300),
    usuarioenv character(6),
    fechaenv timestamp without time zone,
    ad_cantidad character varying(250),
    ad_monto character varying(250),
    ad_montoneto numeric(15,4),
    ad_moneda character varying(1),
    ad_subservicios character varying(250)
);


ALTER TABLE public.t_ord_trabajo OWNER TO postgres;

--
-- TOC entry 2038 (class 1259 OID 19167)
-- Dependencies: 2583 2584 2585 6
-- Name: t_orden_montos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_orden_montos (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    item numeric NOT NULL,
    cod_concepto character(4) NOT NULL,
    monto numeric(15,4),
    usuario character(6),
    fecha timestamp without time zone,
    eecc_serie character(3),
    eecc_numero character(6),
    facturado smallint DEFAULT 0,
    usuariomod character(6),
    fechamod timestamp without time zone,
    tg smallint DEFAULT 0,
    moneda character(1),
    tipo_cambio numeric(15,2),
    monto_us numeric(15,4) DEFAULT 0
);


ALTER TABLE public.t_orden_montos OWNER TO postgres;

--
-- TOC entry 1982 (class 1259 OID 16904)
-- Dependencies: 2505 2506 2507 6
-- Name: t_orden_pago; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_orden_pago (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    tarifa_urbanacc numeric(5,3) DEFAULT 0,
    tarifa_perifericacc numeric(5,3) DEFAULT 0,
    tarifa_extremacc numeric(5,3) DEFAULT 0,
    usuario character(6),
    fecha timestamp with time zone,
    usuariomod character(6),
    fechamod timestamp with time zone,
    tarifa_urbanasc numeric(5,3),
    tarifa_perifericasc numeric(5,3),
    tarifa_extremasc numeric(5,3)
);


ALTER TABLE public.t_orden_pago OWNER TO postgres;

--
-- TOC entry 2043 (class 1259 OID 162544)
-- Dependencies: 2588 6
-- Name: t_orden_plus; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_orden_plus (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    codconcepto character(4) NOT NULL,
    montos numeric(15,4),
    usuario character(6),
    fecha timestamp without time zone,
    estado smallint DEFAULT 0,
    observacion character varying(500)
);


ALTER TABLE public.t_orden_plus OWNER TO postgres;

--
-- TOC entry 1983 (class 1259 OID 16910)
-- Dependencies: 6
-- Name: t_orden_rango; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_orden_rango (
    codcliente character(11) NOT NULL,
    codareacliente character(15) NOT NULL,
    serie character(3) NOT NULL,
    desde numeric(7,0) NOT NULL,
    hasta numeric(7,0) NOT NULL,
    cantidad numeric(10,0),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    codestado smallint,
    codorigen character(10),
    coddestino character(10)
);


ALTER TABLE public.t_orden_rango OWNER TO postgres;

--
-- TOC entry 3037 (class 0 OID 0)
-- Dependencies: 1983
-- Name: COLUMN t_orden_rango.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_orden_rango.codestado IS '0=Generado 1=Asignado';


--
-- TOC entry 2026 (class 1259 OID 17797)
-- Dependencies: 2567 2568 2569 2570 6
-- Name: t_ordencompra_int; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ordencompra_int (
    serie character(3) NOT NULL,
    numero character(6) NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    coserie character(3),
    conumero numeric,
    imgvoucher character varying(1) DEFAULT 'N'::character varying,
    imagen character varying(250),
    v_producto numeric(15,2),
    flete numeric(15,2),
    seguro numeric(15,2),
    vcif numeric(15,2),
    ad_valorem numeric(15,2),
    igv numeric(15,2),
    imp numeric(15,2),
    imp_aduanas numeric(15,2),
    desaduanaje numeric(15,2),
    flete_serv numeric(15,2),
    comision_compra numeric(15,2),
    seguro_serv numeric(15,2) DEFAULT 0.00,
    igv_serv numeric(15,2),
    pago_serv numeric(15,2),
    costo_total numeric(15,2),
    estado smallint DEFAULT 0,
    shipping character(1),
    proveedor character varying(150),
    observacion character varying(500),
    codcliente character(11),
    fecha_voucher timestamp without time zone,
    usuario_voucher character(6),
    percepcion numeric(15,2) DEFAULT 0
);


ALTER TABLE public.t_ordencompra_int OWNER TO postgres;

--
-- TOC entry 2027 (class 1259 OID 17839)
-- Dependencies: 6
-- Name: t_ordencompra_intdet; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ordencompra_intdet (
    serie character(3) NOT NULL,
    numero character(6) NOT NULL,
    item numeric NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    codigo character(4),
    producto character varying(500),
    cantidad numeric(10,0),
    peso numeric(15,2),
    precio numeric(15,2)
);


ALTER TABLE public.t_ordencompra_intdet OWNER TO postgres;

--
-- TOC entry 1984 (class 1259 OID 16913)
-- Dependencies: 6
-- Name: t_ordencosto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ordencosto (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    codambito character(2) NOT NULL,
    concepto character(2) NOT NULL,
    coditem character(2) NOT NULL,
    codservicio character(4),
    tipo_servicio character(1),
    codproducto character(4),
    afecto_igv character(1),
    moneda character(1),
    valor_venta numeric(15,3) NOT NULL,
    valor_descuento numeric(15,3) NOT NULL,
    valor_igv numeric(15,3) NOT NULL,
    valor_total numeric(15,3) NOT NULL,
    estado character(1),
    usuario_crea character varying(6),
    fecha_crea timestamp without time zone NOT NULL,
    usuario_mod character varying(6),
    fecha_modifica timestamp without time zone
);


ALTER TABLE public.t_ordencosto OWNER TO postgres;

--
-- TOC entry 2058 (class 1259 OID 171596)
-- Dependencies: 2605 6
-- Name: t_ordenes_mntcourier; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ordenes_mntcourier (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    monto numeric(15,2) DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    tipo character(1) NOT NULL
);


ALTER TABLE public.t_ordenes_mntcourier OWNER TO postgres;

--
-- TOC entry 2030 (class 1259 OID 18759)
-- Dependencies: 2573 6
-- Name: t_ordventa_prodac; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ordventa_prodac (
    item_pedido character varying(7) NOT NULL,
    codcliente character(11) NOT NULL,
    codareacliente character(15),
    usuario_pedido character varying(6),
    fecha_pedido timestamp without time zone,
    des_cliente character varying(150),
    ord_venta character varying(10),
    cond_pago character varying(100),
    usuario_crea character(6),
    fecha_crea timestamp without time zone,
    observacion character varying(250),
    estado smallint DEFAULT 0
);


ALTER TABLE public.t_ordventa_prodac OWNER TO postgres;

--
-- TOC entry 1985 (class 1259 OID 16916)
-- Dependencies: 2508 6
-- Name: t_paises; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_paises (
    codpais character(2) NOT NULL,
    pais character varying(50),
    inicio character(8),
    fin character(8),
    estado smallint DEFAULT 0 NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_paises OWNER TO postgres;

--
-- TOC entry 1986 (class 1259 OID 16920)
-- Dependencies: 6
-- Name: t_planilla; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_planilla (
    codplanilla character(3) NOT NULL,
    desplanilla character varying(50),
    desde_a date,
    hasta_a date,
    desde_m date,
    hasta_m date,
    apoyo character(1),
    mensajeria character(1),
    administrativo character(1),
    estado character(1),
    tipo character(1),
    usuario character(6),
    fecha timestamp with time zone,
    usuariomod character(6),
    fechamod timestamp with time zone,
    desde_v date,
    hasta_v date,
    des_mensajeria character varying(50),
    des_nacional character varying(50)
);


ALTER TABLE public.t_planilla OWNER TO postgres;

--
-- TOC entry 3038 (class 0 OID 0)
-- Dependencies: 1986
-- Name: COLUMN t_planilla.apoyo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilla.apoyo IS 'N = no generado S= si generado C = Cerrado';


--
-- TOC entry 3039 (class 0 OID 0)
-- Dependencies: 1986
-- Name: COLUMN t_planilla.mensajeria; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilla.mensajeria IS '-- N = no generado S= si generado C = Cerrado';


--
-- TOC entry 3040 (class 0 OID 0)
-- Dependencies: 1986
-- Name: COLUMN t_planilla.administrativo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilla.administrativo IS '-- N = no generado S= si generado C = Cerrado';


--
-- TOC entry 3041 (class 0 OID 0)
-- Dependencies: 1986
-- Name: COLUMN t_planilla.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilla.estado IS 'No esta siendo usado';


--
-- TOC entry 1987 (class 1259 OID 16923)
-- Dependencies: 6
-- Name: t_planilla_plus; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_planilla_plus (
    codplanilla character(3) NOT NULL,
    codigopersonal character(6) NOT NULL,
    tipomovimiento character(2) NOT NULL,
    tipodescuento character(3) NOT NULL,
    itemdescto numeric(9,0) NOT NULL,
    moneda character(1) NOT NULL,
    monto numeric(9,2) NOT NULL,
    detalle character(250) NOT NULL,
    estado character(1),
    usuario character(10) NOT NULL,
    fecha timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone,
    tipo character(2),
    codalmacen character(3),
    tipoguia character(2),
    serieguia character(3),
    nroguia character(6)
);


ALTER TABLE public.t_planilla_plus OWNER TO postgres;

--
-- TOC entry 3042 (class 0 OID 0)
-- Dependencies: 1987
-- Name: COLUMN t_planilla_plus.tipomovimiento; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilla_plus.tipomovimiento IS '01=Descuento 02=Reintegro';


--
-- TOC entry 3043 (class 0 OID 0)
-- Dependencies: 1987
-- Name: COLUMN t_planilla_plus.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilla_plus.estado IS 'P = Pendiente';


--
-- TOC entry 3044 (class 0 OID 0)
-- Dependencies: 1987
-- Name: COLUMN t_planilla_plus.tipo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilla_plus.tipo IS 'A - APOYO POSTAL
M - MENSAJERIA
V - ADMINISTRATIVO';


--
-- TOC entry 1988 (class 1259 OID 16926)
-- Dependencies: 6
-- Name: t_planilladet; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_planilladet (
    codplanilla character(3) NOT NULL,
    codpersonal character(6) NOT NULL,
    codtipopanilla character(1) NOT NULL,
    fechaplanilla date,
    totalproduccion numeric(9,3),
    totalapoyoextra numeric(9,3),
    totalreintegro numeric(9,3),
    totaldescuento numeric(9,3),
    totalbono numeric(9,3),
    totalpago numeric(9,3),
    estado character(1),
    usuario character(6),
    fecha timestamp without time zone,
    usuarimod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_planilladet OWNER TO postgres;

--
-- TOC entry 3045 (class 0 OID 0)
-- Dependencies: 1988
-- Name: COLUMN t_planilladet.codtipopanilla; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_planilladet.codtipopanilla IS 'Apoyo = A, Mensajeria = M, Administrativo = V';


--
-- TOC entry 1989 (class 1259 OID 16929)
-- Dependencies: 2509 2510 6
-- Name: t_proceso_area; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_proceso_area (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    item numeric(7,0) NOT NULL,
    cod_area_origen character(4) NOT NULL,
    cod_area_destino character(4) NOT NULL,
    item_desde numeric(6,0) NOT NULL,
    item_hasta numeric(6,0) NOT NULL,
    fecha_proceso date,
    observacion character varying DEFAULT 150,
    fecha_recepcion timestamp without time zone,
    usuario_recepcion character(6),
    codestado character(1) NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    item_desde_rec numeric(6,0),
    item_hasta_rec numeric(6,0),
    cantidad integer,
    tipoingreso smallint DEFAULT 0,
    enviado character varying(1)
);


ALTER TABLE public.t_proceso_area OWNER TO postgres;

--
-- TOC entry 1990 (class 1259 OID 16936)
-- Dependencies: 6
-- Name: t_proceso_area_det; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_proceso_area_det (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    item numeric(7,0) NOT NULL,
    cod_area_origen character(4) NOT NULL,
    cod_area_destino character(4) NOT NULL,
    observacion text,
    estado character(1) NOT NULL,
    usuario text NOT NULL,
    fecha timestamp without time zone NOT NULL,
    usuariomod text NOT NULL,
    fechamod timestamp without time zone NOT NULL
);


ALTER TABLE public.t_proceso_area_det OWNER TO postgres;

--
-- TOC entry 1991 (class 1259 OID 16942)
-- Dependencies: 2511 6
-- Name: t_productos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_productos (
    codproducto character(4) NOT NULL,
    producto character varying(100),
    codnegocio character(2),
    codambito character(2),
    estado smallint DEFAULT 0 NOT NULL,
    usuario character(6),
    usuariomod character(6),
    codcliente character(11),
    tipoproducto character(1) NOT NULL,
    fecha timestamp without time zone,
    fechamod timestamp without time zone,
    obs character varying(50)
);


ALTER TABLE public.t_productos OWNER TO postgres;

--
-- TOC entry 3046 (class 0 OID 0)
-- Dependencies: 1991
-- Name: COLUMN t_productos.tipoproducto; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_productos.tipoproducto IS 'M = muestra y D = documento';


--
-- TOC entry 2040 (class 1259 OID 19259)
-- Dependencies: 2586 6
-- Name: t_puerto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_puerto (
    codigo character(4) NOT NULL,
    codpais character(2),
    puerto character varying(200),
    estado smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.t_puerto OWNER TO postgres;

--
-- TOC entry 1992 (class 1259 OID 16946)
-- Dependencies: 2512 2513 2514 2515 2516 2517 2518 2519 6
-- Name: t_recojofijo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_recojofijo (
    codrecojofijo character(6) NOT NULL,
    codcliente character(11),
    codareacliente character(15),
    codestado smallint DEFAULT 0,
    desde timestamp without time zone NOT NULL,
    hasta timestamp without time zone NOT NULL,
    dia1 smallint DEFAULT 0,
    dia2 smallint DEFAULT 0,
    dia3 smallint DEFAULT 0,
    dia4 smallint DEFAULT 0,
    dia5 smallint DEFAULT 0,
    dia6 smallint DEFAULT 0,
    dia7 smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    codcontacto character(6)
);


ALTER TABLE public.t_recojofijo OWNER TO postgres;

--
-- TOC entry 3047 (class 0 OID 0)
-- Dependencies: 1992
-- Name: COLUMN t_recojofijo.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_recojofijo.codestado IS '0=activo 1=anulado';


--
-- TOC entry 1993 (class 1259 OID 16957)
-- Dependencies: 2520 2521 2522 2523 2524 2525 2526 2527 2528 6
-- Name: t_recojos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_recojos (
    codrecojo character(7) NOT NULL,
    tipoingreso smallint DEFAULT 0 NOT NULL,
    tiposervicio smallint DEFAULT 0 NOT NULL,
    codambito character varying(2),
    codcliente character varying(11),
    codareacliente character varying(15),
    empresa character varying(60),
    ruc character varying(11),
    direccion character varying(100),
    referencia character varying(60),
    distrito character varying(50),
    contacto character varying(60),
    area character varying(60),
    telefono character varying(20),
    anexo character varying(60),
    observacion character varying(150),
    desde character(8),
    hasta character(8),
    codproducto character(4),
    cantidad integer DEFAULT 0,
    cnt_bultos integer DEFAULT 0,
    peso numeric(10,3) DEFAULT 0,
    largo numeric(10,2) DEFAULT 0,
    ancho numeric(10,2) DEFAULT 0,
    alto numeric(10,2) DEFAULT 0,
    codunidad character(3),
    codestadorecojo character(3),
    usuariopedido character(6),
    fechapedido timestamp without time zone,
    usuariorecojo character(6),
    fecharecojo timestamp without time zone,
    serie character(3),
    orden character(7),
    seguro character varying(1),
    embalaje character varying(1),
    vigilancia character varying(1),
    fragil character varying(1),
    peligroso character varying(1),
    impostergable character varying(1),
    locales character(1),
    nacional character(1),
    internacional character(1),
    estado_envio smallint DEFAULT 0,
    hora_salida character varying(8),
    hora_llegada character varying(8),
    usuarioasigna character(6),
    fechaasigna timestamp without time zone,
    usuariodescarga character(6),
    fechadescarga timestamp without time zone,
    motivo character varying(100),
    codrecojofijo character(6),
    codcontacto character(6),
    cod_unidad character(3),
    nro_placa character varying(10),
    des_unidad character varying(60),
    origen_recojo character varying(11),
    destino_recojo character varying(11),
    empresa_entrega character varying(100),
    direccion_entrega character varying(100),
    referancia_entrega character varying(100),
    consignado_entrega character varying(100),
    contacto_entrega character varying(100),
    area_entrega character varying(100),
    ruc_entrega character varying(11),
    distrito_entrega character varying(100),
    ubigeo_entrega character varying(6),
    telefono_entrega character varying(20),
    anexo_entrega character varying(60),
    ubigeo_recojo character varying(6),
    flag_ambito character varying(1)
);


ALTER TABLE public.t_recojos OWNER TO postgres;

--
-- TOC entry 3048 (class 0 OID 0)
-- Dependencies: 1993
-- Name: COLUMN t_recojos.tipoingreso; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_recojos.tipoingreso IS '0=Manual 1=automático';


--
-- TOC entry 3049 (class 0 OID 0)
-- Dependencies: 1993
-- Name: COLUMN t_recojos.tiposervicio; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_recojos.tiposervicio IS '0=Normal 1=Express';


--
-- TOC entry 3050 (class 0 OID 0)
-- Dependencies: 1993
-- Name: COLUMN t_recojos.usuariopedido; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_recojos.usuariopedido IS '--- PRES SOLICITA';


--
-- TOC entry 3051 (class 0 OID 0)
-- Dependencies: 1993
-- Name: COLUMN t_recojos.usuariorecojo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_recojos.usuariorecojo IS 'PERS IR RECOJER';


--
-- TOC entry 3052 (class 0 OID 0)
-- Dependencies: 1993
-- Name: COLUMN t_recojos.seguro; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_recojos.seguro IS 'S';


--
-- TOC entry 3053 (class 0 OID 0)
-- Dependencies: 1993
-- Name: COLUMN t_recojos.estado_envio; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_recojos.estado_envio IS '0=listo 1=falta';


--
-- TOC entry 2049 (class 1259 OID 162996)
-- Dependencies: 6
-- Name: t_req_und_img; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_req_und_img (
    item character(6) NOT NULL,
    nro_req character varying(7) NOT NULL,
    cod_vuelta character varying(7) NOT NULL,
    hora character varying(10) NOT NULL,
    imagen character(1),
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.t_req_und_img OWNER TO postgres;

--
-- TOC entry 2034 (class 1259 OID 18972)
-- Dependencies: 2576 6
-- Name: t_requerimiento_unidad; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_requerimiento_unidad (
    nro_req character(7) NOT NULL,
    codcliente character(11),
    codareacliente character(15),
    tarifa_cliente numeric(15,2),
    hora_pactada character varying(8),
    tarifa_hora_adicional numeric(15,2),
    tarifa_kilometro_adicional numeric(15,2),
    usuario_solicita character(6),
    fecha_solicita date,
    fecha_recojo date,
    hora_recojo character(8),
    cap_requerida character(6),
    codambito character(2),
    observacion_solicita character varying(250),
    estado character(1),
    fecha_asigna date,
    nro_placa character varying(15),
    descripcion_und character varying(100),
    chofer character varying(100),
    cod_unidad character(3),
    codproveedor character(6),
    tarifa_proveedor numeric(15,2),
    hora_ingreso character varying(8),
    hora_retorno character varying(8),
    kilometro_inicial numeric(20,2),
    kilometro_final numeric(20,2),
    kilometro_recorrido numeric(20,2),
    kilometro_adicional numeric(20,2),
    hora_trabajada character varying(8),
    hora_adicional character varying(8),
    usuario_asigna character(6),
    observacion_asigna character varying(250),
    fecha_confdescarga timestamp without time zone,
    fecha_descarga date,
    h_inicio_descarga character(8),
    h_final_descarga character(8),
    h_salida_tienda character(8),
    usuconf_descarga character varying(6),
    obsentrega_descarga character varying(500),
    serie character varying(3),
    orden character varying(7),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    tipo_undidad character varying(4),
    cod_servicio character varying(10),
    docref_remitente character varying(2),
    serieref_remitente character varying(50),
    nroref_remitente character varying(100),
    docref_transportista character varying(2),
    serieref_transportista character varying(3),
    nroref_transportista character varying(10),
    usuario_os character varying(6),
    fecha_os timestamp without time zone,
    usuario_recorr character varying(6),
    fecha_recorr timestamp without time zone,
    obs_recorrido character varying(250),
    total numeric(15,4) DEFAULT 0.000,
    h_llegada_tienda character(8),
    fecha_llegada_cd date,
    h_llegada_cd character varying(12),
    h_inicio_carga_cd character varying(12),
    h_fin_carga_cd character varying(12),
    h_salida_cd character varying(12),
    usuario_llegada_cd character(6),
    fecha_conf_llegada_cd timestamp without time zone,
    obs_llegada_cd character varying(250),
    img_llegada_cd character varying(1),
    img_iniciocar_cd character varying(1),
    img_fincar_cd character varying(1),
    img_salida_cd character varying(1),
    img_llegada_td character varying(1),
    img_iniciodes_td character varying(1),
    img_findesc_td character varying(1),
    img_salida_td character varying(1),
    cod_apelativo character varying(10),
    nro_despacho character varying(10)
);


ALTER TABLE public.t_requerimiento_unidad OWNER TO postgres;

--
-- TOC entry 1994 (class 1259 OID 16972)
-- Dependencies: 2529 2530 6
-- Name: t_sancion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_sancion (
    itemsa numeric(8,0) NOT NULL,
    codsancion character(2) NOT NULL,
    monto numeric(8,2),
    montototal numeric(8,2),
    codsede character(3) NOT NULL,
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    fechadescto date NOT NULL,
    codmensajero character(6) NOT NULL,
    observacion character varying(100),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    diasr numeric(3,0) DEFAULT 0,
    estado smallint DEFAULT 1 NOT NULL,
    host character(50),
    ip_pc character(20),
    usuarioanula character(6),
    fechaanula timestamp without time zone,
    argumento character(100),
    ip_anula character(20)
);


ALTER TABLE public.t_sancion OWNER TO postgres;

--
-- TOC entry 3054 (class 0 OID 0)
-- Dependencies: 1994
-- Name: COLUMN t_sancion.estado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_sancion.estado IS '1 - Vigente
2 - Anulado';


--
-- TOC entry 2057 (class 1259 OID 163380)
-- Dependencies: 2604 6
-- Name: t_seccion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_seccion (
    codcliente character(11) NOT NULL,
    cod_seccion character(4) NOT NULL,
    des_seccion character varying(50),
    obs_seccion character varying(100),
    est_seccion smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_seccion OWNER TO postgres;

--
-- TOC entry 2056 (class 1259 OID 163374)
-- Dependencies: 2603 6
-- Name: t_seccion_det; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_seccion_det (
    codcliente character(11) NOT NULL,
    cod_seccion character(4) NOT NULL,
    nro_carta character varying(20) NOT NULL,
    nro_paginas smallint DEFAULT 0,
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    correlativo character(6) NOT NULL,
    tipoentrega character varying(50),
    motivo character varying(50),
    cod_sub_seccion character varying(4),
    fecha_entrega timestamp without time zone,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_seccion_det OWNER TO postgres;

--
-- TOC entry 1995 (class 1259 OID 16977)
-- Dependencies: 2531 2532 6
-- Name: t_serie_guia; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_serie_guia (
    codserieguia character(3) NOT NULL,
    descripcion character varying(60),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL,
    pordefecto smallint DEFAULT 0 NOT NULL,
    items character varying(3)
);


ALTER TABLE public.t_serie_guia OWNER TO postgres;

--
-- TOC entry 1996 (class 1259 OID 16982)
-- Dependencies: 2533 2534 2535 6
-- Name: t_serie_orden; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_serie_orden (
    codserieorden character(3) DEFAULT 1 NOT NULL,
    descripcion character varying(60),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL,
    pordefecto smallint DEFAULT 0 NOT NULL,
    contador integer
);


ALTER TABLE public.t_serie_orden OWNER TO postgres;

--
-- TOC entry 1997 (class 1259 OID 16988)
-- Dependencies: 2536 6
-- Name: t_serviciocliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_serviciocliente (
    codservicio character(4) NOT NULL,
    codcliente character(11) NOT NULL,
    servicio character varying(50),
    estado character(1) DEFAULT 0
);


ALTER TABLE public.t_serviciocliente OWNER TO postgres;

--
-- TOC entry 1998 (class 1259 OID 16992)
-- Dependencies: 2537 2538 2539 2540 6
-- Name: t_servicios; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_servicios (
    codservicio character(4) NOT NULL,
    servicio character varying(50),
    codnegocio character(2),
    codambito character(2),
    estado smallint DEFAULT 0 NOT NULL,
    dias smallint DEFAULT 1,
    fecha timestamp without time zone,
    usuario character(6),
    fechamod timestamp without time zone,
    usuariomod character(6),
    tiposervicio character(1),
    obs character varying(150),
    precio_periferia numeric(10,2) DEFAULT 0.00,
    cod_centro_costo numeric(5,0),
    tipo1 smallint DEFAULT 0
);


ALTER TABLE public.t_servicios OWNER TO postgres;

--
-- TOC entry 3055 (class 0 OID 0)
-- Dependencies: 1998
-- Name: COLUMN t_servicios.tiposervicio; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_servicios.tiposervicio IS 'M = mensajeria y C = Courier';


--
-- TOC entry 1999 (class 1259 OID 16998)
-- Dependencies: 2541 2542 6
-- Name: t_subservicios; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_subservicios (
    codsubservicio character(4) NOT NULL,
    subservicio character varying(50),
    codservicio character(4) NOT NULL,
    codnegocio character(2),
    codambito character(2),
    estado smallint DEFAULT 0 NOT NULL,
    dias smallint DEFAULT 1,
    fecha timestamp without time zone,
    usuario character(6),
    fechamod timestamp without time zone,
    usuariomod character(6),
    tiposervicio character(1),
    obs character varying(150),
    codtabla character(3),
    codigo character(3)
);


ALTER TABLE public.t_subservicios OWNER TO postgres;

--
-- TOC entry 2035 (class 1259 OID 19015)
-- Dependencies: 2577 6
-- Name: t_subservicioscliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_subservicioscliente (
    codsubserviciocliente character(4) NOT NULL,
    subservicio character varying(100),
    estado smallint DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    codcliente character(11),
    codareacliente character(15),
    codservicio character(4)
);


ALTER TABLE public.t_subservicioscliente OWNER TO postgres;

--
-- TOC entry 2000 (class 1259 OID 17003)
-- Dependencies: 2543 2544 2545 6
-- Name: t_tablas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tablas (
    codtabla character(3) NOT NULL,
    codigo character(3) NOT NULL,
    descripcion character varying(50),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL,
    tarifa numeric(6,3) DEFAULT 0 NOT NULL,
    cantidad numeric(6,0) DEFAULT 0 NOT NULL
);


ALTER TABLE public.t_tablas OWNER TO postgres;

--
-- TOC entry 2001 (class 1259 OID 17009)
-- Dependencies: 6
-- Name: t_temp_eecc; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_temp_eecc (
    serie character(3) NOT NULL,
    orden character(11) NOT NULL,
    codcliente character varying(11),
    area character varying(15),
    fecha timestamp without time zone,
    servicio character varying(50),
    ambito character varying(15),
    articulo character varying(50),
    cantidad numeric(5,0),
    observacion character varying(50),
    importe numeric(10,3),
    descuento numeric(10,3),
    venta numeric(10,3),
    igv numeric(10,3),
    total numeric(10,3),
    usuario character(6)
);


ALTER TABLE public.t_temp_eecc OWNER TO postgres;

--
-- TOC entry 2002 (class 1259 OID 17012)
-- Dependencies: 6
-- Name: t_tienda_cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tienda_cliente (
    codcliente character(11) NOT NULL,
    codtienda character(10) NOT NULL,
    destienda character varying(150),
    direccion character varying(150),
    responsable character varying(100),
    coddistrito character varying(6),
    telefono character varying(250),
    codestado smallint,
    tipo_punto character(1) NOT NULL,
    codusuario character(6),
    fecha timestamp without time zone,
    codusuariomod character(6),
    fechamod timestamp without time zone,
    tipo_ingreso character(1)
);


ALTER TABLE public.t_tienda_cliente OWNER TO postgres;

--
-- TOC entry 3056 (class 0 OID 0)
-- Dependencies: 2002
-- Name: COLUMN t_tienda_cliente.codestado; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_tienda_cliente.codestado IS '0=vigente 1=anulado';


--
-- TOC entry 3057 (class 0 OID 0)
-- Dependencies: 2002
-- Name: COLUMN t_tienda_cliente.tipo_punto; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_tienda_cliente.tipo_punto IS 'O=Origen D=Destino';


--
-- TOC entry 3058 (class 0 OID 0)
-- Dependencies: 2002
-- Name: COLUMN t_tienda_cliente.tipo_ingreso; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_tienda_cliente.tipo_ingreso IS 'N=normal E=externo';


--
-- TOC entry 2003 (class 1259 OID 17018)
-- Dependencies: 2546 2547 6
-- Name: t_tipo_bono; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipo_bono (
    codtipobono character(2) NOT NULL,
    desbono character varying(50),
    monto numeric(8,2) DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL
);


ALTER TABLE public.t_tipo_bono OWNER TO postgres;

--
-- TOC entry 2004 (class 1259 OID 17023)
-- Dependencies: 6
-- Name: t_tipo_descuento; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipo_descuento (
    coddescuento character(3) NOT NULL,
    desdescuento character(60) NOT NULL,
    estado character(1),
    usuario character(6),
    fecha timestamp with time zone,
    usuariomod character(6),
    fechamod timestamp with time zone
);


ALTER TABLE public.t_tipo_descuento OWNER TO postgres;

--
-- TOC entry 2005 (class 1259 OID 17026)
-- Dependencies: 6
-- Name: t_tipo_pago; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipo_pago (
    codtipopago character(2) NOT NULL,
    tipopago character varying(50)
);


ALTER TABLE public.t_tipo_pago OWNER TO postgres;

--
-- TOC entry 2006 (class 1259 OID 17029)
-- Dependencies: 6
-- Name: t_tipo_pago_reparto; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipo_pago_reparto (
    codtipopago character(2) NOT NULL,
    destipopago character varying(30),
    monto numeric(5,3),
    estado character(1)
);


ALTER TABLE public.t_tipo_pago_reparto OWNER TO postgres;

--
-- TOC entry 2007 (class 1259 OID 17032)
-- Dependencies: 2548 2549 6
-- Name: t_tipo_sancion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipo_sancion (
    codtiposancion character(2) NOT NULL,
    sancion character varying(50),
    monto numeric(8,2) DEFAULT 0,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0 NOT NULL
);


ALTER TABLE public.t_tipo_sancion OWNER TO postgres;

--
-- TOC entry 2008 (class 1259 OID 17037)
-- Dependencies: 2550 6
-- Name: t_tipoentrega; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipoentrega (
    codtipoentrega character(2) NOT NULL,
    tipoentrega character varying(60),
    estado smallint DEFAULT 0 NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_tipoentrega OWNER TO postgres;

--
-- TOC entry 2009 (class 1259 OID 17041)
-- Dependencies: 2551 6
-- Name: t_tipopersonal; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipopersonal (
    codtipopersonal character(2) NOT NULL,
    tipopersonal character varying(50),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    anulado smallint DEFAULT 0
);


ALTER TABLE public.t_tipopersonal OWNER TO postgres;

--
-- TOC entry 3059 (class 0 OID 0)
-- Dependencies: 2009
-- Name: COLUMN t_tipopersonal.tipopersonal; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_tipopersonal.tipopersonal IS '01 - MENSAJEROS
51 - APOYO POSTAL (HABILITADOR)';


--
-- TOC entry 2036 (class 1259 OID 19025)
-- Dependencies: 2578 6
-- Name: t_tipounidad_cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tipounidad_cliente (
    codunidad character(4) NOT NULL,
    unidad character varying(200),
    codcliente character(11),
    codareacliente character(15),
    estado smallint DEFAULT 0,
    fecha timestamp without time zone,
    usuario character(6),
    fechamod timestamp without time zone,
    usuariomod character(6)
);


ALTER TABLE public.t_tipounidad_cliente OWNER TO postgres;

--
-- TOC entry 2010 (class 1259 OID 17045)
-- Dependencies: 2552 6
-- Name: t_tracking; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tracking (
    codtracking smallint DEFAULT 0 NOT NULL,
    tracking character varying(50)
);


ALTER TABLE public.t_tracking OWNER TO postgres;

--
-- TOC entry 2011 (class 1259 OID 17049)
-- Dependencies: 2553 6
-- Name: t_tracking_guia; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tracking_guia (
    cod_tracking_guia smallint DEFAULT 0 NOT NULL,
    tracking character varying(50),
    estado_conf character varying(1),
    observacion character varying(100)
);


ALTER TABLE public.t_tracking_guia OWNER TO postgres;

--
-- TOC entry 2022 (class 1259 OID 17490)
-- Dependencies: 2564 2565 6
-- Name: t_tracking_inter; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tracking_inter (
    codtracking smallint DEFAULT 0 NOT NULL,
    tracking_esp character varying(100),
    tracking_eng character varying(100),
    estado smallint DEFAULT 0,
    exp_imp character(1)
);


ALTER TABLE public.t_tracking_inter OWNER TO postgres;

--
-- TOC entry 3060 (class 0 OID 0)
-- Dependencies: 2022
-- Name: COLUMN t_tracking_inter.exp_imp; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN t_tracking_inter.exp_imp IS 'E--EXPORTAR
I--IMPORTAR';


--
-- TOC entry 2012 (class 1259 OID 17053)
-- Dependencies: 2554 6
-- Name: t_tracking_mov; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tracking_mov (
    serie character(3) NOT NULL,
    orden character(7) NOT NULL,
    codtracking smallint DEFAULT 0 NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    tipo_documento character varying(4),
    serie_documento character varying(3),
    nro_documento character varying(7),
    emp_transporte character varying(100),
    observacion character varying(100)
);


ALTER TABLE public.t_tracking_mov OWNER TO postgres;

--
-- TOC entry 2029 (class 1259 OID 18501)
-- Dependencies: 2572 6
-- Name: t_tracking_mov_guia; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_tracking_mov_guia (
    serieguia character(3) NOT NULL,
    nroguia character(6) NOT NULL,
    codtracking smallint DEFAULT 0 NOT NULL,
    usuario character(6),
    fecha timestamp without time zone,
    estado_conf character varying(1),
    nombre_recojo character varying(100),
    dni_recojo character varying(20),
    observacion character varying(100),
    fecha_recojo timestamp without time zone
);


ALTER TABLE public.t_tracking_mov_guia OWNER TO postgres;

--
-- TOC entry 2013 (class 1259 OID 17057)
-- Dependencies: 6
-- Name: t_ubigeos_cliente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_ubigeos_cliente (
    codcliente character(11) NOT NULL,
    cod_ubigeo_cliente character(6) NOT NULL,
    distrito_cliente character varying(150),
    ubigeo character varying(6),
    usuario character varying(6),
    fecha timestamp without time zone,
    usuariomod character varying(6),
    fechamod character varying,
    estado character varying(1),
    nombre character varying(150),
    codpostal character varying(3)
);


ALTER TABLE public.t_ubigeos_cliente OWNER TO postgres;

--
-- TOC entry 2014 (class 1259 OID 17063)
-- Dependencies: 6
-- Name: t_usuarioagente; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_usuarioagente (
    usuarioag character varying(11) NOT NULL,
    clave character varying(11) NOT NULL,
    codagente character(6) NOT NULL,
    ubigeo character(6),
    usuariocrea character(6) NOT NULL,
    fechacrea timestamp without time zone NOT NULL,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.t_usuarioagente OWNER TO postgres;

--
-- TOC entry 2044 (class 1259 OID 162589)
-- Dependencies: 6
-- Name: t_venta; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_venta (
    serie_fac character(3) NOT NULL,
    nro_fac numeric(9,0) NOT NULL,
    cod_forma_pago character(1),
    tipo_tarjeta character varying(30),
    nro_tarjeta character(30),
    cod_recibido character(1),
    monto_recibido numeric(15,2),
    tipo_cambio numeric(5,2),
    monto_recibido_total numeric(15,2),
    monto_vuelto numeric(15,2),
    hora character varying(15),
    destino character varying(150),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    fechadeposito date
);


ALTER TABLE public.t_venta OWNER TO postgres;

--
-- TOC entry 2028 (class 1259 OID 17909)
-- Dependencies: 2571 6
-- Name: t_wongmetro; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE t_wongmetro (
    codigo character varying(20) NOT NULL,
    descripcion character varying(150) NOT NULL,
    codmedida character(3),
    sp29 character varying(20) NOT NULL,
    cantidad integer DEFAULT 0,
    punitario numeric(15,4),
    total numeric(15,4),
    codcliente character(11)
);


ALTER TABLE public.t_wongmetro OWNER TO postgres;

--
-- TOC entry 3061 (class 0 OID 0)
-- Dependencies: 2028
-- Name: TABLE t_wongmetro; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE t_wongmetro IS 'Impresion de Código de Barra Wong Metro';


--
-- TOC entry 2060 (class 1259 OID 177826)
-- Dependencies: 2614 2615 2616 2617 2618 2619 2620 2621 2622 2623 2624 2625 6
-- Name: tab_solicitud_sgs; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tab_solicitud_sgs (
    serie_solicitud character(2) NOT NULL,
    nro_solicitud numeric NOT NULL,
    cod_cliente character varying(11) DEFAULT NULL::character varying,
    nro_cliente numeric,
    nro_contacto numeric,
    servicio character varying(50) NOT NULL,
    tipo_producto character varying(50) DEFAULT NULL::character varying,
    cantidad character(10) DEFAULT NULL::bpchar,
    observacion character varying(300) DEFAULT NULL::character varying,
    estado character(1) DEFAULT 'P'::bpchar,
    usuario_crea character(10) DEFAULT NULL::bpchar,
    fecha_crea timestamp without time zone,
    usuario_modifica character(10) DEFAULT NULL::bpchar,
    fecha_modifica timestamp without time zone,
    usuario_recepciona character(10) DEFAULT NULL::bpchar,
    fecha_recepciona timestamp without time zone,
    nro_cliente_anula numeric,
    nro_contacto_anula numeric,
    usuario_anula character(10) DEFAULT NULL::bpchar,
    fecha_anula timestamp without time zone,
    motivo character varying(100) DEFAULT NULL::character varying,
    dir_archivo character varying(200) DEFAULT NULL::character varying,
    nro_ord_serv numeric,
    serie_ord_serv character(3) DEFAULT NULL::bpchar,
    codcliente character varying(11),
    codareacliente character varying(15)
);


ALTER TABLE public.tab_solicitud_sgs OWNER TO postgres;

--
-- TOC entry 2015 (class 1259 OID 17066)
-- Dependencies: 2555 2556 2557 6
-- Name: tablaconfig; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tablaconfig (
    codigo character(2) NOT NULL,
    descripcion character varying(250),
    tipo1 integer DEFAULT 0,
    tipo2 integer DEFAULT 0,
    tipo3 integer DEFAULT 0
);


ALTER TABLE public.tablaconfig OWNER TO postgres;

--
-- TOC entry 2016 (class 1259 OID 17072)
-- Dependencies: 6
-- Name: tarifabd; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tarifabd (
    codigo character(2) NOT NULL,
    tarifa numeric(10,3),
    descripcion character varying(50),
    usuario character(6),
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone
);


ALTER TABLE public.tarifabd OWNER TO postgres;

--
-- TOC entry 2017 (class 1259 OID 17078)
-- Dependencies: 6
-- Name: tipoentrega; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tipoentrega (
    codestado character(2) NOT NULL,
    codmotivo character(2) NOT NULL,
    tipo character varying(30),
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.tipoentrega OWNER TO postgres;

--
-- TOC entry 2018 (class 1259 OID 17081)
-- Dependencies: 6
-- Name: tipoentregacli; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tipoentregacli (
    codcliente character(11) NOT NULL,
    codmotivo character(2) NOT NULL,
    tipo character varying(30),
    usuario character(6),
    fecha timestamp without time zone
);


ALTER TABLE public.tipoentregacli OWNER TO postgres;

--
-- TOC entry 2019 (class 1259 OID 17084)
-- Dependencies: 2558 6
-- Name: ubigeos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE ubigeos (
    coddepa character(2),
    codprov character(2),
    codpos character(2),
    ubigeo character(6) NOT NULL,
    departamento character varying(100),
    provincia character varying(100),
    distrito character varying(100),
    nombre character varying(200),
    flagprov smallint DEFAULT 0,
    codpostal character(3),
    codzona character varying(4)
);


ALTER TABLE public.ubigeos OWNER TO postgres;

--
-- TOC entry 2020 (class 1259 OID 17094)
-- Dependencies: 2559 2560 2561 2562 6
-- Name: zonas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE zonas (
    codzona character(6) NOT NULL,
    codpostal character(3),
    codclasificador character(6),
    bonozona character(1),
    descripcion character varying(50),
    pasaje numeric(6,3) DEFAULT 0,
    monto numeric(10,3) DEFAULT 0,
    fecha timestamp without time zone,
    usuariomod character(6),
    fechamod timestamp without time zone,
    estado smallint DEFAULT 0,
    usuario character(6),
    bono numeric(6,3) DEFAULT 0,
    efectividad smallint,
    ubigeo character(6),
    tipozona character(3),
    cantidad smallint
);


ALTER TABLE public.zonas OWNER TO postgres;

--
-- TOC entry 3062 (class 0 OID 0)
-- Dependencies: 2020
-- Name: COLUMN zonas.monto; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN zonas.monto IS 'monto destajo';


--
-- TOC entry 2626 (class 2604 OID 177923)
-- Dependencies: 2062 2061
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE foo ALTER COLUMN id SET DEFAULT nextval('foo_id_seq'::regclass);


--
-- TOC entry 2781 (class 2606 OID 17115)
-- Dependencies: 1963 1963 1963 1963
-- Name: Pky_T_factura; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_factura
    ADD CONSTRAINT "Pky_T_factura" PRIMARY KEY (tipo_documento, serie_documento, nro_documento);


--
-- TOC entry 2642 (class 2606 OID 17117)
-- Dependencies: 1905 1905 1905
-- Name: Pky_blq_orden; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY blq_orden
    ADD CONSTRAINT "Pky_blq_orden" PRIMARY KEY (serie, orden);


--
-- TOC entry 2717 (class 2606 OID 17119)
-- Dependencies: 1932 1932
-- Name: Pky_codigopersonal; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY personal
    ADD CONSTRAINT "Pky_codigopersonal" PRIMARY KEY (codigopersonal);


--
-- TOC entry 2630 (class 2606 OID 17121)
-- Dependencies: 1898 1898 1898 1898 1898
-- Name: agentetarifa_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY agentetarifa
    ADD CONSTRAINT agentetarifa_pkey PRIMARY KEY (codagente, coddepa, codprov, coddis);


--
-- TOC entry 2727 (class 2606 OID 17123)
-- Dependencies: 1937 1937
-- Name: ambito; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ambitos
    ADD CONSTRAINT ambito UNIQUE (ambito);


--
-- TOC entry 2634 (class 2606 OID 17125)
-- Dependencies: 1900 1900
-- Name: arcimpresion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY arcimpresion
    ADD CONSTRAINT arcimpresion_pkey PRIMARY KEY (codigo);


--
-- TOC entry 2636 (class 2606 OID 17127)
-- Dependencies: 1901 1901 1901
-- Name: areacliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY areacliente
    ADD CONSTRAINT areacliente_pkey PRIMARY KEY (codareacliente, codcliente);


--
-- TOC entry 2638 (class 2606 OID 17129)
-- Dependencies: 1902 1902 1902
-- Name: baccesos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY baccesos
    ADD CONSTRAINT baccesos_pkey PRIMARY KEY (codprogram, codigopersonal);


--
-- TOC entry 2640 (class 2606 OID 17131)
-- Dependencies: 1903 1903
-- Name: bgrupo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY bgrupo
    ADD CONSTRAINT bgrupo_pkey PRIMARY KEY (grupo);


--
-- TOC entry 2644 (class 2606 OID 17133)
-- Dependencies: 1906 1906
-- Name: bprogram_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY bprogram
    ADD CONSTRAINT bprogram_pkey PRIMARY KEY (codprogram);


--
-- TOC entry 2747 (class 2606 OID 17135)
-- Dependencies: 1945 1945 1945
-- Name: clavesacceso_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_clavesacceso
    ADD CONSTRAINT clavesacceso_pkey PRIMARY KEY (codigo, codigopersonal);


--
-- TOC entry 2646 (class 2606 OID 17137)
-- Dependencies: 1907 1907
-- Name: cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (codcliente);


--
-- TOC entry 2729 (class 2606 OID 17139)
-- Dependencies: 1937 1937
-- Name: codambito; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ambitos
    ADD CONSTRAINT codambito PRIMARY KEY (codambito);


--
-- TOC entry 2817 (class 2606 OID 17141)
-- Dependencies: 1979 1979
-- Name: codnegocio; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_negocios
    ADD CONSTRAINT codnegocio PRIMARY KEY (codnegocio);


--
-- TOC entry 2829 (class 2606 OID 17143)
-- Dependencies: 1985 1985
-- Name: codpais; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_paises
    ADD CONSTRAINT codpais PRIMARY KEY (codpais);


--
-- TOC entry 2841 (class 2606 OID 17145)
-- Dependencies: 1991 1991
-- Name: codproducto; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_productos
    ADD CONSTRAINT codproducto PRIMARY KEY (codproducto);


--
-- TOC entry 2855 (class 2606 OID 17147)
-- Dependencies: 1998 1998
-- Name: codservicio; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_servicios
    ADD CONSTRAINT codservicio PRIMARY KEY (codservicio);


--
-- TOC entry 2857 (class 2606 OID 17149)
-- Dependencies: 1999 1999
-- Name: codsubservicio; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_subservicios
    ADD CONSTRAINT codsubservicio PRIMARY KEY (codsubservicio);


--
-- TOC entry 2875 (class 2606 OID 17151)
-- Dependencies: 2008 2008
-- Name: codtipoentrega; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipoentrega
    ADD CONSTRAINT codtipoentrega PRIMARY KEY (codtipoentrega);


--
-- TOC entry 2650 (class 2606 OID 17153)
-- Dependencies: 1908 1908 1908
-- Name: consextremas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY consextremas
    ADD CONSTRAINT consextremas_pkey PRIMARY KEY (codmodulo, item);


--
-- TOC entry 2695 (class 2606 OID 17159)
-- Dependencies: 1921 1921 1921
-- Name: movliqcobranza_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY movliqcobranza
    ADD CONSTRAINT movliqcobranza_pkey PRIMARY KEY (serie_voucher, nro_voucher);


--
-- TOC entry 2697 (class 2606 OID 17161)
-- Dependencies: 1922 1922 1922 1922
-- Name: movliqcobranzadeta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY movliqcobranzadeta
    ADD CONSTRAINT movliqcobranzadeta_pkey PRIMARY KEY (serie_voucher, nro_voucher, item_voucher);


--
-- TOC entry 2699 (class 2606 OID 17163)
-- Dependencies: 1923 1923 1923
-- Name: movreclamocabe_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY movreclamocabe
    ADD CONSTRAINT movreclamocabe_pkey PRIMARY KEY (emi_guia, nro_guia);


--
-- TOC entry 2701 (class 2606 OID 17165)
-- Dependencies: 1924 1924 1924 1924
-- Name: movreclamodeta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY movreclamodeta
    ADD CONSTRAINT movreclamodeta_pkey PRIMARY KEY (item, emi_guia, nro_guia);


--
-- TOC entry 2703 (class 2606 OID 17167)
-- Dependencies: 1925 1925 1925
-- Name: movverificacioncabe_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY movverificacioncabe
    ADD CONSTRAINT movverificacioncabe_pkey PRIMARY KEY (emi_guia, nro_guia);


--
-- TOC entry 2705 (class 2606 OID 17169)
-- Dependencies: 1926 1926 1926 1926 1926 1926
-- Name: movverificaciondescargo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY movverificaciondescargo
    ADD CONSTRAINT movverificaciondescargo_pkey PRIMARY KEY (emi_guia, nro_guia, serie, orden, correlativo);


--
-- TOC entry 2707 (class 2606 OID 17171)
-- Dependencies: 1927 1927 1927 1927 1927 1927
-- Name: movverificaciondeta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY movverificaciondeta
    ADD CONSTRAINT movverificaciondeta_pkey PRIMARY KEY (emi_guia, nro_guia, serie, orden, correlativo);


--
-- TOC entry 2827 (class 2606 OID 17175)
-- Dependencies: 1984 1984 1984 1984 1984 1984
-- Name: ordencosto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ordencosto
    ADD CONSTRAINT ordencosto_pkey PRIMARY KEY (serie, orden, codambito, concepto, coditem);


--
-- TOC entry 2763 (class 2606 OID 17177)
-- Dependencies: 1953 1953
-- Name: p_dest; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_destinos_internacional
    ADD CONSTRAINT p_dest PRIMARY KEY (cod_des);


--
-- TOC entry 2969 (class 2606 OID 163320)
-- Dependencies: 2055 2055 2055 2055 2055 2055
-- Name: ph_guideta; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_manifiesto_couriers_det
    ADD CONSTRAINT ph_guideta PRIMARY KEY (serie, orden, tipo, ordserie, ordorden);


--
-- TOC entry 2931 (class 2606 OID 19033)
-- Dependencies: 2036 2036
-- Name: ph_tunidacli; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipounidad_cliente
    ADD CONSTRAINT ph_tunidacli PRIMARY KEY (codunidad);


--
-- TOC entry 2632 (class 2606 OID 17179)
-- Dependencies: 1899 1899
-- Name: pk_archivos; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY archivos
    ADD CONSTRAINT pk_archivos PRIMARY KEY (codigo);


--
-- TOC entry 2965 (class 2606 OID 163292)
-- Dependencies: 2053 2053
-- Name: pk_ciudad; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ciudad
    ADD CONSTRAINT pk_ciudad PRIMARY KEY (codciudad);


--
-- TOC entry 2923 (class 2606 OID 18872)
-- Dependencies: 2032 2032
-- Name: pk_codair; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_aeropuerto
    ADD CONSTRAINT pk_codair PRIMARY KEY (codigo);


--
-- TOC entry 2871 (class 2606 OID 17181)
-- Dependencies: 2006 2006
-- Name: pk_codtipopago; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipo_pago_reparto
    ADD CONSTRAINT pk_codtipopago PRIMARY KEY (codtipopago);


--
-- TOC entry 2943 (class 2606 OID 162543)
-- Dependencies: 2042 2042
-- Name: pk_concepplus; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_conceptos_plus
    ADD CONSTRAINT pk_concepplus PRIMARY KEY (cod_concepto);


--
-- TOC entry 2933 (class 2606 OID 162409)
-- Dependencies: 2037 2037
-- Name: pk_concepto; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_conceptos_cobro_internacional
    ADD CONSTRAINT pk_concepto PRIMARY KEY (cod_concepto);


--
-- TOC entry 2901 (class 2606 OID 17473)
-- Dependencies: 2021 2021
-- Name: pk_conocio; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_como_conocio
    ADD CONSTRAINT pk_conocio PRIMARY KEY (codigo);


--
-- TOC entry 2925 (class 2606 OID 18878)
-- Dependencies: 2033 2033 2033
-- Name: pk_datorden; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_datorden
    ADD CONSTRAINT pk_datorden PRIMARY KEY (serie, orden);


--
-- TOC entry 2759 (class 2606 OID 17183)
-- Dependencies: 1951 1951
-- Name: pk_departamento; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_departamento
    ADD CONSTRAINT pk_departamento PRIMARY KEY (coddepartamento);


--
-- TOC entry 2803 (class 2606 OID 17185)
-- Dependencies: 1972 1972 1972 1972 1972
-- Name: pk_detmanifiesto; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_manifiesto_inter_det
    ADD CONSTRAINT pk_detmanifiesto PRIMARY KEY (serie, nro, serie_awb, nro_awb);


--
-- TOC entry 2941 (class 2606 OID 19347)
-- Dependencies: 2041 2041 2041 2041
-- Name: pk_detorden_int; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY detorden_int
    ADD CONSTRAINT pk_detorden_int PRIMARY KEY (serie, orden, correlativo);


--
-- TOC entry 2679 (class 2606 OID 17187)
-- Dependencies: 1912 1912 1912 1912 1912 1912
-- Name: pk_detordenes; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY detordenes
    ADD CONSTRAINT pk_detordenes PRIMARY KEY (serie, orden, correlativo, tipoingreso, user_digitacion);


--
-- TOC entry 2681 (class 2606 OID 17190)
-- Dependencies: 1913 1913 1913 1913 1913
-- Name: pk_dettransferido; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY dettransferido
    ADD CONSTRAINT pk_dettransferido PRIMARY KEY (serie, orden, desde, hasta);


--
-- TOC entry 2963 (class 2606 OID 163086)
-- Dependencies: 2052 2052
-- Name: pk_distrito; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_distrito
    ADD CONSTRAINT pk_distrito PRIMARY KEY (codpostal);


--
-- TOC entry 2777 (class 2606 OID 17192)
-- Dependencies: 1961 1961 1961
-- Name: pk_ec; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_estadocuenta
    ADD CONSTRAINT pk_ec PRIMARY KEY (serie_est, numero_est);


--
-- TOC entry 2685 (class 2606 OID 17194)
-- Dependencies: 1915 1915
-- Name: pk_est; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY estados_awb
    ADD CONSTRAINT pk_est PRIMARY KEY (codestado);


--
-- TOC entry 2775 (class 2606 OID 17196)
-- Dependencies: 1960 1960
-- Name: pk_estadocivil; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_estadocivil
    ADD CONSTRAINT pk_estadocivil PRIMARY KEY (codestadocivil);


--
-- TOC entry 2683 (class 2606 OID 17198)
-- Dependencies: 1914 1914
-- Name: pk_estados; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY estados
    ADD CONSTRAINT pk_estados PRIMARY KEY (codestado);


--
-- TOC entry 2921 (class 2606 OID 18852)
-- Dependencies: 2031 2031
-- Name: pk_feriado; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_feriados
    ADD CONSTRAINT pk_feriado PRIMARY KEY (fecha);


--
-- TOC entry 2981 (class 2606 OID 177931)
-- Dependencies: 2061 2061
-- Name: pk_foo; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY foo
    ADD CONSTRAINT pk_foo PRIMARY KEY (id);


--
-- TOC entry 2687 (class 2606 OID 17200)
-- Dependencies: 1917 1917
-- Name: pk_glosa; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY glosas_estados_awb
    ADD CONSTRAINT pk_glosa PRIMARY KEY (codglosa);


--
-- TOC entry 2913 (class 2606 OID 17846)
-- Dependencies: 2027 2027 2027 2027
-- Name: pk_intdet; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ordencompra_intdet
    ADD CONSTRAINT pk_intdet PRIMARY KEY (serie, numero, item);


--
-- TOC entry 2693 (class 2606 OID 17202)
-- Dependencies: 1920 1920 1920
-- Name: pk_log; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY mov_log_web
    ADD CONSTRAINT pk_log PRIMARY KEY (serie_registro, nro_registro);


--
-- TOC entry 2949 (class 2606 OID 162649)
-- Dependencies: 2045 2045
-- Name: pk_login; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_logueows
    ADD CONSTRAINT pk_login PRIMARY KEY (usuario);


--
-- TOC entry 2959 (class 2606 OID 163014)
-- Dependencies: 2050 2050 2050
-- Name: pk_man; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_manifiesto_inter
    ADD CONSTRAINT pk_man PRIMARY KEY (serie, nro);


--
-- TOC entry 2967 (class 2606 OID 163299)
-- Dependencies: 2054 2054 2054 2054
-- Name: pk_mancourier; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_manifiesto_couriers
    ADD CONSTRAINT pk_mancourier PRIMARY KEY (tipo, serie, orden);


--
-- TOC entry 2907 (class 2606 OID 17689)
-- Dependencies: 2024 2024 2024
-- Name: pk_masivo; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_devolucion_masivo_courier
    ADD CONSTRAINT pk_masivo PRIMARY KEY (serieguia, nroguia);


--
-- TOC entry 2809 (class 2606 OID 17206)
-- Dependencies: 1975 1975 1975
-- Name: pk_menp; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_menu_accesowebpr
    ADD CONSTRAINT pk_menp PRIMARY KEY (codpro, codigo);


--
-- TOC entry 2807 (class 2606 OID 17208)
-- Dependencies: 1974 1974
-- Name: pk_menu; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_menu_accesoweb
    ADD CONSTRAINT pk_menu PRIMARY KEY (codmenu);


--
-- TOC entry 2691 (class 2606 OID 17210)
-- Dependencies: 1919 1919
-- Name: pk_motivos; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY motivos
    ADD CONSTRAINT pk_motivos PRIMARY KEY (codmotivo);


--
-- TOC entry 2819 (class 2606 OID 17212)
-- Dependencies: 1980 1980
-- Name: pk_op; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_operador
    ADD CONSTRAINT pk_op PRIMARY KEY (codtipooperador);


--
-- TOC entry 2821 (class 2606 OID 17214)
-- Dependencies: 1981 1981 1981
-- Name: pk_ord_trabajo; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ord_trabajo
    ADD CONSTRAINT pk_ord_trabajo PRIMARY KEY (serie, orden);


--
-- TOC entry 2713 (class 2606 OID 17216)
-- Dependencies: 1928 1928 1928
-- Name: pk_orden; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY ordenes
    ADD CONSTRAINT pk_orden PRIMARY KEY (serie, orden);


--
-- TOC entry 2825 (class 2606 OID 17218)
-- Dependencies: 1983 1983 1983 1983 1983 1983
-- Name: pk_orden_rango; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_orden_rango
    ADD CONSTRAINT pk_orden_rango PRIMARY KEY (codcliente, codareacliente, serie, desde, hasta);


--
-- TOC entry 2935 (class 2606 OID 162415)
-- Dependencies: 2038 2038 2038 2038
-- Name: pk_ordenmontos; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_orden_montos
    ADD CONSTRAINT pk_ordenmontos PRIMARY KEY (serie, orden, cod_concepto);


--
-- TOC entry 2911 (class 2606 OID 17801)
-- Dependencies: 2026 2026 2026
-- Name: pk_ordint; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ordencompra_int
    ADD CONSTRAINT pk_ordint PRIMARY KEY (serie, numero);


--
-- TOC entry 2975 (class 2606 OID 171636)
-- Dependencies: 2058 2058 2058 2058
-- Name: pk_ordmnt; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ordenes_mntcourier
    ADD CONSTRAINT pk_ordmnt PRIMARY KEY (serie, orden, tipo);


--
-- TOC entry 2945 (class 2606 OID 162548)
-- Dependencies: 2043 2043 2043 2043
-- Name: pk_ordplus; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_orden_plus
    ADD CONSTRAINT pk_ordplus PRIMARY KEY (serie, orden, codconcepto);


--
-- TOC entry 2715 (class 2606 OID 17220)
-- Dependencies: 1929 1929
-- Name: pk_origen; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY origen
    ADD CONSTRAINT pk_origen PRIMARY KEY (codorigen);


--
-- TOC entry 2805 (class 2606 OID 17222)
-- Dependencies: 1973 1973 1973
-- Name: pk_peruser; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_menu_accesouser
    ADD CONSTRAINT pk_peruser PRIMARY KEY (codpro, codusuario);


--
-- TOC entry 2939 (class 2606 OID 19267)
-- Dependencies: 2040 2040
-- Name: pk_puerto; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_puerto
    ADD CONSTRAINT pk_puerto PRIMARY KEY (codigo);


--
-- TOC entry 2845 (class 2606 OID 17224)
-- Dependencies: 1993 1993
-- Name: pk_recojos; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_recojos
    ADD CONSTRAINT pk_recojos PRIMARY KEY (codrecojo);


--
-- TOC entry 2721 (class 2606 OID 17226)
-- Dependencies: 1934 1934
-- Name: pk_sedesprov; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY sedesprov
    ADD CONSTRAINT pk_sedesprov PRIMARY KEY (codsede);


--
-- TOC entry 2929 (class 2606 OID 19023)
-- Dependencies: 2035 2035
-- Name: pk_subservcli; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_subservicioscliente
    ADD CONSTRAINT pk_subservcli PRIMARY KEY (codsubserviciocliente);


--
-- TOC entry 2725 (class 2606 OID 17230)
-- Dependencies: 1936 1936 1936
-- Name: pk_t_agentedestino; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_agentedestino
    ADD CONSTRAINT pk_t_agentedestino PRIMARY KEY (ubigeo, codigopersonal);


--
-- TOC entry 2977 (class 2606 OID 173173)
-- Dependencies: 2059 2059 2059
-- Name: pk_t_bloqueo_orden; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_bloqueo_orden
    ADD CONSTRAINT pk_t_bloqueo_orden PRIMARY KEY (serie, orden);


--
-- TOC entry 2745 (class 2606 OID 17232)
-- Dependencies: 1944 1944
-- Name: pk_t_caja; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_caja
    ADD CONSTRAINT pk_t_caja PRIMARY KEY (nrocaja);


--
-- TOC entry 2761 (class 2606 OID 17234)
-- Dependencies: 1952 1952
-- Name: pk_t_destino; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_destino
    ADD CONSTRAINT pk_t_destino PRIMARY KEY (coddestino);


--
-- TOC entry 2955 (class 2606 OID 162987)
-- Dependencies: 2048 2048 2048
-- Name: pk_t_det_requerimiento_unidad; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_det_requerimiento_unidad
    ADD CONSTRAINT pk_t_det_requerimiento_unidad PRIMARY KEY (cod_vuelta, nro_req);


--
-- TOC entry 2765 (class 2606 OID 17236)
-- Dependencies: 1954 1954 1954
-- Name: pk_t_devolucion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_devolucion
    ADD CONSTRAINT pk_t_devolucion PRIMARY KEY (seriedevolucion, nrodevolucion);


--
-- TOC entry 2771 (class 2606 OID 17238)
-- Dependencies: 1958 1958
-- Name: pk_t_empresa; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_empresa
    ADD CONSTRAINT pk_t_empresa PRIMARY KEY (codempresa);


--
-- TOC entry 2783 (class 2606 OID 17240)
-- Dependencies: 1964 1964 1964 1964
-- Name: pk_t_factura_plus; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_factura_plus
    ADD CONSTRAINT pk_t_factura_plus PRIMARY KEY (serie, orden, correlativo);


--
-- TOC entry 2987 (class 2606 OID 180932)
-- Dependencies: 2065 2065 2065
-- Name: pk_t_fecha_corte_enotria; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_fecha_corte_enotria
    ADD CONSTRAINT pk_t_fecha_corte_enotria PRIMARY KEY (serie_fc, nro_fc);


--
-- TOC entry 2801 (class 2606 OID 17242)
-- Dependencies: 1971 1971 1971
-- Name: pk_t_liquidacion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_liquidacion
    ADD CONSTRAINT pk_t_liquidacion PRIMARY KEY (seriedevolucion, nrodevolucion);


--
-- TOC entry 2837 (class 2606 OID 17244)
-- Dependencies: 1989 1989 1989 1989
-- Name: pk_t_proceso_area; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_proceso_area
    ADD CONSTRAINT pk_t_proceso_area PRIMARY KEY (serie, orden, item);


--
-- TOC entry 2839 (class 2606 OID 17246)
-- Dependencies: 1990 1990 1990 1990
-- Name: pk_t_proceso_area_det; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_proceso_area_det
    ADD CONSTRAINT pk_t_proceso_area_det PRIMARY KEY (serie, orden, item);


--
-- TOC entry 2843 (class 2606 OID 17248)
-- Dependencies: 1992 1992
-- Name: pk_t_recojofijo; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_recojofijo
    ADD CONSTRAINT pk_t_recojofijo PRIMARY KEY (codrecojofijo);


--
-- TOC entry 2927 (class 2606 OID 18979)
-- Dependencies: 2034 2034
-- Name: pk_t_requerimiento_unidad; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_requerimiento_unidad
    ADD CONSTRAINT pk_t_requerimiento_unidad PRIMARY KEY (nro_req);


--
-- TOC entry 2863 (class 2606 OID 17250)
-- Dependencies: 2002 2002
-- Name: pk_t_tienda_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tienda_cliente
    ADD CONSTRAINT pk_t_tienda_cliente PRIMARY KEY (codtienda);


--
-- TOC entry 2879 (class 2606 OID 17252)
-- Dependencies: 2010 2010
-- Name: pk_t_tracking; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tracking
    ADD CONSTRAINT pk_t_tracking PRIMARY KEY (codtracking);


--
-- TOC entry 2881 (class 2606 OID 17254)
-- Dependencies: 2011 2011
-- Name: pk_t_tracking_guia; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tracking_guia
    ADD CONSTRAINT pk_t_tracking_guia PRIMARY KEY (cod_tracking_guia);


--
-- TOC entry 2889 (class 2606 OID 17256)
-- Dependencies: 2015 2015
-- Name: pk_tablaconfig; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tablaconfig
    ADD CONSTRAINT pk_tablaconfig PRIMARY KEY (codigo);


--
-- TOC entry 2859 (class 2606 OID 17258)
-- Dependencies: 2000 2000 2000
-- Name: pk_tablas; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tablas
    ADD CONSTRAINT pk_tablas PRIMARY KEY (codtabla, codigo);


--
-- TOC entry 2861 (class 2606 OID 17260)
-- Dependencies: 2001 2001 2001
-- Name: pk_tem; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_temp_eecc
    ADD CONSTRAINT pk_tem PRIMARY KEY (serie, orden);


--
-- TOC entry 2893 (class 2606 OID 17262)
-- Dependencies: 2017 2017 2017
-- Name: pk_tipoentrega; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tipoentrega
    ADD CONSTRAINT pk_tipoentrega PRIMARY KEY (codestado, codmotivo);


--
-- TOC entry 2895 (class 2606 OID 17264)
-- Dependencies: 2018 2018 2018
-- Name: pk_tipoentregacli; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tipoentregacli
    ADD CONSTRAINT pk_tipoentregacli PRIMARY KEY (codcliente, codmotivo);


--
-- TOC entry 2869 (class 2606 OID 17266)
-- Dependencies: 2005 2005
-- Name: pk_tipopago; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipo_pago
    ADD CONSTRAINT pk_tipopago PRIMARY KEY (codtipopago);


--
-- TOC entry 2877 (class 2606 OID 17268)
-- Dependencies: 2009 2009
-- Name: pk_tipopersonal; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipopersonal
    ADD CONSTRAINT pk_tipopersonal PRIMARY KEY (codtipopersonal);


--
-- TOC entry 2903 (class 2606 OID 17502)
-- Dependencies: 2022 2022
-- Name: pk_traint; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tracking_inter
    ADD CONSTRAINT pk_traint PRIMARY KEY (codtracking);


--
-- TOC entry 2899 (class 2606 OID 17270)
-- Dependencies: 2020 2020
-- Name: pk_zonas; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY zonas
    ADD CONSTRAINT pk_zonas PRIMARY KEY (codzona);


--
-- TOC entry 2813 (class 2606 OID 17272)
-- Dependencies: 1977 1977
-- Name: pkcodmotivo; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_motivoanula
    ADD CONSTRAINT pkcodmotivo PRIMARY KEY (cod_motivo);


--
-- TOC entry 2652 (class 2606 OID 17274)
-- Dependencies: 1909 1909 1909 1909
-- Name: pkey_contacto; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY contactos
    ADD CONSTRAINT pkey_contacto PRIMARY KEY (codcliente, codareacliente, codcontacto);


--
-- TOC entry 2719 (class 2606 OID 17276)
-- Dependencies: 1933 1933
-- Name: pkey_rutapath; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY rutapath
    ADD CONSTRAINT pkey_rutapath PRIMARY KEY (codigo);


--
-- TOC entry 2767 (class 2606 OID 17278)
-- Dependencies: 1956 1956
-- Name: pktipo_documento; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_documento
    ADD CONSTRAINT pktipo_documento PRIMARY KEY (tipo_documento);


--
-- TOC entry 2769 (class 2606 OID 17280)
-- Dependencies: 1957 1957
-- Name: pktipo_emision; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_emision
    ADD CONSTRAINT pktipo_emision PRIMARY KEY (tipo_emision);


--
-- TOC entry 2811 (class 2606 OID 17282)
-- Dependencies: 1976 1976
-- Name: pktmoneda; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_moneda
    ADD CONSTRAINT pktmoneda PRIMARY KEY (tipo_moneda);


--
-- TOC entry 2648 (class 2606 OID 17284)
-- Dependencies: 1907 1907
-- Name: pkunicocliente; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cliente
    ADD CONSTRAINT pkunicocliente UNIQUE (cliente);


--
-- TOC entry 2743 (class 2606 OID 17286)
-- Dependencies: 1943 1943 1943 1943 1943 1943
-- Name: pky_bono; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_bono
    ADD CONSTRAINT pky_bono PRIMARY KEY (itembon, codbono, codsede, serieguia, nroguia);


--
-- TOC entry 2773 (class 2606 OID 17288)
-- Dependencies: 1959 1959
-- Name: pky_codestadoguia; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_estado_guia
    ADD CONSTRAINT pky_codestadoguia PRIMARY KEY (codestadoguia);


--
-- TOC entry 2779 (class 2606 OID 17290)
-- Dependencies: 1962 1962
-- Name: pky_codestadoorden; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_estados_orden
    ADD CONSTRAINT pky_codestadoorden PRIMARY KEY (codestadoorden);


--
-- TOC entry 2873 (class 2606 OID 17292)
-- Dependencies: 2007 2007
-- Name: pky_codsancion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipo_sancion
    ADD CONSTRAINT pky_codsancion PRIMARY KEY (codtiposancion);


--
-- TOC entry 2849 (class 2606 OID 17294)
-- Dependencies: 1995 1995
-- Name: pky_codserieguia; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_serie_guia
    ADD CONSTRAINT pky_codserieguia PRIMARY KEY (codserieguia);


--
-- TOC entry 2851 (class 2606 OID 17296)
-- Dependencies: 1996 1996
-- Name: pky_codserieorden; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_serie_orden
    ADD CONSTRAINT pky_codserieorden PRIMARY KEY (codserieorden);


--
-- TOC entry 2865 (class 2606 OID 17298)
-- Dependencies: 2003 2003
-- Name: pky_codtipobono; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipo_bono
    ADD CONSTRAINT pky_codtipobono PRIMARY KEY (codtipobono);


--
-- TOC entry 2658 (class 2606 OID 17300)
-- Dependencies: 1910 1910 1910
-- Name: pky_despacho; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY despacho
    ADD CONSTRAINT pky_despacho PRIMARY KEY (serieguia, nroguia);


--
-- TOC entry 2664 (class 2606 OID 17302)
-- Dependencies: 1911 1911 1911 1911 1911 1911
-- Name: pky_detdespacho; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY detdespacho
    ADD CONSTRAINT pky_detdespacho PRIMARY KEY (serieguia, nroguia, serie, orden, correlativo);


--
-- TOC entry 2689 (class 2606 OID 17316)
-- Dependencies: 1918 1918
-- Name: pky_items; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY items
    ADD CONSTRAINT pky_items PRIMARY KEY (codigo);


--
-- TOC entry 2831 (class 2606 OID 17318)
-- Dependencies: 1986 1986
-- Name: pky_planilla; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_planilla
    ADD CONSTRAINT pky_planilla PRIMARY KEY (codplanilla);


--
-- TOC entry 2723 (class 2606 OID 17320)
-- Dependencies: 1935 1935 1935
-- Name: pky_t_admin_acceso; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_admin_acceso
    ADD CONSTRAINT pky_t_admin_acceso PRIMARY KEY (tipo_acceso, correlativo);


--
-- TOC entry 2733 (class 2606 OID 17322)
-- Dependencies: 1938 1938 1938
-- Name: pky_t_apoyo_cab; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_apoyo_cab
    ADD CONSTRAINT pky_t_apoyo_cab PRIMARY KEY (serie, orden);


--
-- TOC entry 2735 (class 2606 OID 17324)
-- Dependencies: 1939 1939 1939 1939 1939 1939 1939
-- Name: pky_t_apoyo_det; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_apoyo_det
    ADD CONSTRAINT pky_t_apoyo_det PRIMARY KEY (serie, orden, codigopersonal, cod_tipo_apoyo, desde, hasta);


--
-- TOC entry 2739 (class 2606 OID 17326)
-- Dependencies: 1941 1941 1941
-- Name: pky_t_apoyo_personal; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_apoyo_personal
    ADD CONSTRAINT pky_t_apoyo_personal PRIMARY KEY (fecha_guia, codigopersonal);


--
-- TOC entry 2983 (class 2606 OID 180605)
-- Dependencies: 2063 2063 2063 2063 2063 2063
-- Name: pky_t_apoyo_sueldo; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_apoyo_sueldo
    ADD CONSTRAINT pky_t_apoyo_sueldo PRIMARY KEY (serie, orden, desde, hasta, codigopersonal);


--
-- TOC entry 2905 (class 2606 OID 17671)
-- Dependencies: 2023 2023 2023 2023 2023
-- Name: pky_t_apoyo_verifica; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_apoyo_verifica
    ADD CONSTRAINT pky_t_apoyo_verifica PRIMARY KEY (serie, orden, desde, hasta);


--
-- TOC entry 2749 (class 2606 OID 17328)
-- Dependencies: 1946 1946 1946
-- Name: pky_t_cliente_personal; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_cliente_personal
    ADD CONSTRAINT pky_t_cliente_personal PRIMARY KEY (codcliente, codigopersonal);


--
-- TOC entry 2751 (class 2606 OID 17330)
-- Dependencies: 1947 1947 1947 1947
-- Name: pky_t_confirmacion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_confirmacion
    ADD CONSTRAINT pky_t_confirmacion PRIMARY KEY (serie, orden, correlativo);


--
-- TOC entry 2909 (class 2606 OID 18964)
-- Dependencies: 2025 2025 2025 2025 2025
-- Name: pky_t_coordinacion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_coordinacion
    ADD CONSTRAINT pky_t_coordinacion PRIMARY KEY (serie, orden, correlativo, items);


--
-- TOC entry 2755 (class 2606 OID 17332)
-- Dependencies: 1949 1949 1949
-- Name: pky_t_correos; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_correo_personal
    ADD CONSTRAINT pky_t_correos PRIMARY KEY (coddepartamento, codigopersonal);


--
-- TOC entry 2785 (class 2606 OID 17334)
-- Dependencies: 1965 1965 1965 1965
-- Name: pky_t_flete; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_flete
    ADD CONSTRAINT pky_t_flete PRIMARY KEY (cod_tipo_flete, serieguia, nroguia);


--
-- TOC entry 2787 (class 2606 OID 17336)
-- Dependencies: 1966 1966 1966
-- Name: pky_t_guia_devolucion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_guia_devolucion
    ADD CONSTRAINT pky_t_guia_devolucion PRIMARY KEY (serieguia, nroguia);


--
-- TOC entry 2790 (class 2606 OID 17338)
-- Dependencies: 1967 1967 1967 1967 1967
-- Name: pky_t_guia_devolucion_det; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_guia_devolucion_det
    ADD CONSTRAINT pky_t_guia_devolucion_det PRIMARY KEY (serieguia, nroguia, seriedevolucion, nrodevolucion);


--
-- TOC entry 2792 (class 2606 OID 17340)
-- Dependencies: 1968 1968 1968
-- Name: pky_t_guia_interna; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_guia_interna
    ADD CONSTRAINT pky_t_guia_interna PRIMARY KEY (serieguia, nroguia);


--
-- TOC entry 2797 (class 2606 OID 17342)
-- Dependencies: 1969 1969 1969 1969 1969 1969
-- Name: pky_t_guia_interna_det; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_guia_interna_det
    ADD CONSTRAINT pky_t_guia_interna_det PRIMARY KEY (serieguia, nroguia, serie, orden, correlativo);


--
-- TOC entry 2961 (class 2606 OID 163045)
-- Dependencies: 2051 2051 2051 2051
-- Name: pky_t_guia_zona; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_guia_zona
    ADD CONSTRAINT pky_t_guia_zona PRIMARY KEY (serieguia, nroguia, codzona);


--
-- TOC entry 2985 (class 2606 OID 180915)
-- Dependencies: 2064 2064 2064 2064 2064
-- Name: pky_t_imagen_delete; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_imagen_delete
    ADD CONSTRAINT pky_t_imagen_delete PRIMARY KEY (serie, orden, correlativo, items);


--
-- TOC entry 2799 (class 2606 OID 17349)
-- Dependencies: 1970 1970
-- Name: pky_t_items; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_items
    ADD CONSTRAINT pky_t_items PRIMARY KEY (cod_item);


--
-- TOC entry 2815 (class 2606 OID 17351)
-- Dependencies: 1978 1978 1978
-- Name: pky_t_movimiento_orden; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_movimiento_orden
    ADD CONSTRAINT pky_t_movimiento_orden PRIMARY KEY (codmovimiento, correlativo);


--
-- TOC entry 2823 (class 2606 OID 17353)
-- Dependencies: 1982 1982 1982
-- Name: pky_t_orden_pago; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_orden_pago
    ADD CONSTRAINT pky_t_orden_pago PRIMARY KEY (serie, orden);


--
-- TOC entry 2835 (class 2606 OID 17355)
-- Dependencies: 1988 1988 1988 1988
-- Name: pky_t_planilladet; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_planilladet
    ADD CONSTRAINT pky_t_planilladet PRIMARY KEY (codplanilla, codtipopanilla, codpersonal);


--
-- TOC entry 2847 (class 2606 OID 17357)
-- Dependencies: 1994 1994 1994 1994 1994
-- Name: pky_t_sancion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_sancion
    ADD CONSTRAINT pky_t_sancion PRIMARY KEY (itemsa, codsancion, serieguia, nroguia);


--
-- TOC entry 2973 (class 2606 OID 163385)
-- Dependencies: 2057 2057 2057
-- Name: pky_t_seccion; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_seccion
    ADD CONSTRAINT pky_t_seccion PRIMARY KEY (codcliente, cod_seccion);


--
-- TOC entry 2971 (class 2606 OID 163379)
-- Dependencies: 2056 2056 2056 2056 2056 2056 2056
-- Name: pky_t_seccion_det; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_seccion_det
    ADD CONSTRAINT pky_t_seccion_det PRIMARY KEY (codcliente, cod_seccion, nro_carta, serie, orden, correlativo);


--
-- TOC entry 2883 (class 2606 OID 17359)
-- Dependencies: 2012 2012 2012 2012
-- Name: pky_t_tracking; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tracking_mov
    ADD CONSTRAINT pky_t_tracking PRIMARY KEY (serie, orden, codtracking);


--
-- TOC entry 2917 (class 2606 OID 18506)
-- Dependencies: 2029 2029 2029 2029
-- Name: pky_t_tracking_guia; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tracking_mov_guia
    ADD CONSTRAINT pky_t_tracking_guia PRIMARY KEY (serieguia, nroguia, codtracking);


--
-- TOC entry 2885 (class 2606 OID 17363)
-- Dependencies: 2013 2013 2013
-- Name: pky_t_ubigeos_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ubigeos_cliente
    ADD CONSTRAINT pky_t_ubigeos_cliente PRIMARY KEY (codcliente, cod_ubigeo_cliente);


--
-- TOC entry 2947 (class 2606 OID 162593)
-- Dependencies: 2044 2044 2044
-- Name: pky_t_venta; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_venta
    ADD CONSTRAINT pky_t_venta PRIMARY KEY (serie_fac, nro_fac);


--
-- TOC entry 2853 (class 2606 OID 17365)
-- Dependencies: 1997 1997 1997
-- Name: px_servcliente; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_serviciocliente
    ADD CONSTRAINT px_servcliente PRIMARY KEY (codservicio, codcliente);


--
-- TOC entry 2737 (class 2606 OID 17367)
-- Dependencies: 1940 1940 1940 1940
-- Name: t_apoyo_extra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_apoyo_extra
    ADD CONSTRAINT t_apoyo_extra_pkey PRIMARY KEY (codplanilla, codigopersonal, itemextra);


--
-- TOC entry 2741 (class 2606 OID 17369)
-- Dependencies: 1942 1942
-- Name: t_banco_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_banco
    ADD CONSTRAINT t_banco_pkey PRIMARY KEY (codbanco);


--
-- TOC entry 2753 (class 2606 OID 17371)
-- Dependencies: 1948 1948 1948
-- Name: t_confirmacion_orden_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_confirmacion_orden
    ADD CONSTRAINT t_confirmacion_orden_pkey PRIMARY KEY (serie, orden);


--
-- TOC entry 2757 (class 2606 OID 17373)
-- Dependencies: 1950 1950 1950 1950 1950
-- Name: t_ctasbancaria_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ctasbancaria
    ADD CONSTRAINT t_ctasbancaria_pkey PRIMARY KEY (codagente, codbanco, nrocuenta, moneda);


--
-- TOC entry 2951 (class 2606 OID 162774)
-- Dependencies: 2046 2046
-- Name: t_destinos_undtransporte_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_destinos_undtransporte
    ADD CONSTRAINT t_destinos_undtransporte_pkey PRIMARY KEY (nrodestino);


--
-- TOC entry 2937 (class 2606 OID 19232)
-- Dependencies: 2039 2039 2039 2039
-- Name: t_equivalencia_pk; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_equivalencia
    ADD CONSTRAINT t_equivalencia_pk PRIMARY KEY (serie, orden, correlativo);


--
-- TOC entry 2953 (class 2606 OID 162843)
-- Dependencies: 2047 2047 2047
-- Name: t_mov_fecha_ciclo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_mov_fecha_ciclo
    ADD CONSTRAINT t_mov_fecha_ciclo_pkey PRIMARY KEY (items, ciclo);


--
-- TOC entry 2919 (class 2606 OID 18763)
-- Dependencies: 2030 2030 2030
-- Name: t_ordventa_prodac_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_ordventa_prodac
    ADD CONSTRAINT t_ordventa_prodac_pkey PRIMARY KEY (item_pedido, codcliente);


--
-- TOC entry 2833 (class 2606 OID 17375)
-- Dependencies: 1987 1987 1987 1987 1987 1987
-- Name: t_planilla_plus_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_planilla_plus
    ADD CONSTRAINT t_planilla_plus_pkey PRIMARY KEY (codplanilla, codigopersonal, tipomovimiento, tipodescuento, itemdescto);


--
-- TOC entry 2957 (class 2606 OID 163000)
-- Dependencies: 2049 2049 2049 2049 2049
-- Name: t_req_und_img_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_req_und_img
    ADD CONSTRAINT t_req_und_img_pkey PRIMARY KEY (item, nro_req, cod_vuelta, hora);


--
-- TOC entry 2867 (class 2606 OID 17377)
-- Dependencies: 2004 2004
-- Name: t_tipo_descuento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_tipo_descuento
    ADD CONSTRAINT t_tipo_descuento_pkey PRIMARY KEY (coddescuento);


--
-- TOC entry 2887 (class 2606 OID 17379)
-- Dependencies: 2014 2014 2014
-- Name: t_usuarioagente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_usuarioagente
    ADD CONSTRAINT t_usuarioagente_pkey PRIMARY KEY (usuarioag, codagente);


--
-- TOC entry 2915 (class 2606 OID 17916)
-- Dependencies: 2028 2028
-- Name: t_wongmetro_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY t_wongmetro
    ADD CONSTRAINT t_wongmetro_pkey PRIMARY KEY (codigo);


--
-- TOC entry 2979 (class 2606 OID 177845)
-- Dependencies: 2060 2060 2060
-- Name: tab_solicitud_sgs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tab_solicitud_sgs
    ADD CONSTRAINT tab_solicitud_sgs_pkey PRIMARY KEY (serie_solicitud, nro_solicitud);


--
-- TOC entry 2891 (class 2606 OID 17381)
-- Dependencies: 2016 2016
-- Name: tarifabd_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tarifabd
    ADD CONSTRAINT tarifabd_pkey PRIMARY KEY (codigo);


--
-- TOC entry 2897 (class 2606 OID 17386)
-- Dependencies: 2019 2019
-- Name: ubigeos_pk; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY ubigeos
    ADD CONSTRAINT ubigeos_pk PRIMARY KEY (ubigeo);


--
-- TOC entry 2708 (class 1259 OID 17387)
-- Dependencies: 1928
-- Name: Idx_codrecojo; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX "Idx_codrecojo" ON ordenes USING btree (codrecojo);


--
-- TOC entry 2665 (class 1259 OID 17392)
-- Dependencies: 1912 1912 1912 1912
-- Name: idx_codbarra; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codbarra ON detordenes USING btree (serie, orden, correlativo, tipoingreso);


--
-- TOC entry 2666 (class 1259 OID 17393)
-- Dependencies: 1912
-- Name: idx_codigo; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codigo ON detordenes USING btree (codigo);


--
-- TOC entry 2667 (class 1259 OID 17394)
-- Dependencies: 1912
-- Name: idx_codigo1; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codigo1 ON detordenes USING btree (codigo1);


--
-- TOC entry 2668 (class 1259 OID 17395)
-- Dependencies: 1912
-- Name: idx_codigo2; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codigo2 ON detordenes USING btree (codigo2);


--
-- TOC entry 2669 (class 1259 OID 17396)
-- Dependencies: 1912
-- Name: idx_codigo3; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codigo3 ON detordenes USING btree (codigo3);


--
-- TOC entry 2670 (class 1259 OID 17397)
-- Dependencies: 1912
-- Name: idx_codigo4; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codigo4 ON detordenes USING btree (codigo4);


--
-- TOC entry 2671 (class 1259 OID 17398)
-- Dependencies: 1912
-- Name: idx_codigo5; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codigo5 ON detordenes USING btree (codigo5);


--
-- TOC entry 2653 (class 1259 OID 17399)
-- Dependencies: 1910
-- Name: idx_codmensajero; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_codmensajero ON despacho USING btree (codmensajero);


--
-- TOC entry 2672 (class 1259 OID 17400)
-- Dependencies: 1912 1912
-- Name: idx_digitacion; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_digitacion ON detordenes USING btree (tipoingreso, fec_digitacion);


--
-- TOC entry 2654 (class 1259 OID 17401)
-- Dependencies: 1910 1910 1910
-- Name: idx_estado_mens_tipoofi; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_estado_mens_tipoofi ON despacho USING btree (codestadoguia, codmensajero, tipofi);


--
-- TOC entry 2673 (class 1259 OID 162661)
-- Dependencies: 1912
-- Name: idx_fec_scaneo; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fec_scaneo ON detordenes USING btree (fec_scaneo);


--
-- TOC entry 2730 (class 1259 OID 17402)
-- Dependencies: 1938
-- Name: idx_fecha_cierre; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fecha_cierre ON t_apoyo_cab USING btree (fecha_cierre);


--
-- TOC entry 2655 (class 1259 OID 17403)
-- Dependencies: 1910
-- Name: idx_fecha_flete; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fecha_flete ON despacho USING btree (fechaflete);


--
-- TOC entry 2731 (class 1259 OID 17404)
-- Dependencies: 1938
-- Name: idx_fechaingreso; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fechaingreso ON t_apoyo_cab USING btree (fecha_ingreso);


--
-- TOC entry 2709 (class 1259 OID 17405)
-- Dependencies: 1928
-- Name: idx_fecing; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fecing ON ordenes USING btree (fechaingreso);


--
-- TOC entry 2710 (class 1259 OID 17406)
-- Dependencies: 1928 1928 1928
-- Name: idx_fecing_cli_estado; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fecing_cli_estado ON ordenes USING btree (fechaingreso, codcliente, estadoorden);


--
-- TOC entry 2711 (class 1259 OID 17407)
-- Dependencies: 1928 1928
-- Name: idx_fecing_estado; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fecing_estado ON ordenes USING btree (fechaingreso, estadoorden);


--
-- TOC entry 2656 (class 1259 OID 17408)
-- Dependencies: 1910 1910
-- Name: idx_fecsalida_tipoofi; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_fecsalida_tipoofi ON despacho USING btree (fecsalida, tipofi);


--
-- TOC entry 2659 (class 1259 OID 17409)
-- Dependencies: 1911 1911 1911
-- Name: idx_guia_estado; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_guia_estado ON detdespacho USING btree (serieguia, nroguia, codestado);


--
-- TOC entry 2794 (class 1259 OID 17418)
-- Dependencies: 1969 1969
-- Name: idx_guia_interna_det_serieguia_nroguia; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_guia_interna_det_serieguia_nroguia ON t_guia_interna_det USING btree (serieguia, nroguia);


--
-- TOC entry 2674 (class 1259 OID 17419)
-- Dependencies: 1912 1912 1912
-- Name: idx_liquidacion; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_liquidacion ON detordenes USING btree (serieliquidacion, nroliquidacion, liquidado);


--
-- TOC entry 2675 (class 1259 OID 17420)
-- Dependencies: 1912
-- Name: idx_llave; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_llave ON detordenes USING btree (llave);


--
-- TOC entry 2676 (class 1259 OID 17421)
-- Dependencies: 1912 1912
-- Name: idx_llavecli; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_llavecli ON detordenes USING btree (llave, codcliente);


--
-- TOC entry 2660 (class 1259 OID 17422)
-- Dependencies: 1911 1911 1911 1911
-- Name: idx_orden_correla_estado; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_orden_correla_estado ON detdespacho USING btree (serie, orden, correlativo, codestado);


--
-- TOC entry 2661 (class 1259 OID 17423)
-- Dependencies: 1911 1911 1911
-- Name: idx_orden_correlativo; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_orden_correlativo ON detdespacho USING btree (serie, orden, correlativo);


--
-- TOC entry 2677 (class 1259 OID 17424)
-- Dependencies: 1912 1912 1912 1912
-- Name: idx_orden_estado_tipoing; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_orden_estado_tipoing ON detordenes USING btree (serie, orden, codestado, tipoingreso);


--
-- TOC entry 2662 (class 1259 OID 17425)
-- Dependencies: 1911
-- Name: idx_sede; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_sede ON detdespacho USING btree (codsede);


--
-- TOC entry 2795 (class 1259 OID 180433)
-- Dependencies: 1969 1969 1969
-- Name: idx_tguiainterna_serie_ord_correl; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX idx_tguiainterna_serie_ord_correl ON t_guia_interna_det USING btree (serie, orden, correlativo);


--
-- TOC entry 2788 (class 1259 OID 17428)
-- Dependencies: 1966
-- Name: t_guia_devolucion_idx_fecsalida; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX t_guia_devolucion_idx_fecsalida ON t_guia_devolucion USING btree (fecsalida);


--
-- TOC entry 2793 (class 1259 OID 17429)
-- Dependencies: 1968
-- Name: t_guia_interna_idx_fecsalida; Type: INDEX; Schema: public; Owner: postgres; Tablespace: 
--

CREATE INDEX t_guia_interna_idx_fecsalida ON t_guia_interna USING btree (fecsalida);


--
-- TOC entry 2988 (class 2606 OID 17430)
-- Dependencies: 1903 1906 2639
-- Name: bprogram_bgrupo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY bprogram
    ADD CONSTRAINT bprogram_bgrupo_fkey FOREIGN KEY (grupo) REFERENCES bgrupo(grupo);


--
-- TOC entry 2993 (class 0 OID 0)
-- Dependencies: 6
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2011-03-19 12:31:54

--
-- PostgreSQL database dump complete
--

