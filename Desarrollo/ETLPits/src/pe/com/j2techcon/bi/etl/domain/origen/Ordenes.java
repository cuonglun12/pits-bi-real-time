package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.Date;

public class Ordenes {
    private String serie;

	private String orden;

	private String preorden;

	private String codcliente;

	private String codareacliente;

	private String codambito;

	private String codnegocio;

	private String codservicio;

	private String codproducto;

	private String codtiporeparto;

	private Long cntAdmision;

	private Long cntDigitado;

	private BigDecimal peso;

	private Date fechaingreso;

	private Date fechainicio;

	private Date fechavencimiento;

	private Date fechadevolucion;

	private String estadoorden;

	private String estadoout;

	private Short bloqueo;

	private Short volantes;

	private Short valorado;

	private Short liquidado;

	private String nroliquidacion;

	private String usuario;

	private Date fecha;

	private String usuariomod;

	private Date fechamod;

	private String codejecutiva;

	private String glosa;

	private Short facturado;

	private String facSerie;

	private String eeccSerie;

	private String eeccNumero;

	private BigDecimal importe;

	private BigDecimal descuento;

	private BigDecimal venta;

	private BigDecimal igv;

	private BigDecimal total;

	private String coserie;

	private Integer conumero;

	private String codtipooperador;

	private String seoperador;

	private BigDecimal tarifaUrbana;

	private BigDecimal tarifaPeriferica;

	private BigDecimal tarifaExtrema;

	private BigDecimal inafecto;

	private Short tipocotizacion;

	private String moneda;

	private BigDecimal tipoCambio;

	private Integer facNumero;

	private String tipodocumento;

	private String observacion;

	private String grupo;

	private String codorigen;

	private String codzona;

	private BigDecimal importePlus;

	private BigDecimal tarifaAdicional;

	private BigDecimal importeServicio;

	private BigDecimal importePeriferico;

	private BigDecimal montoPeriferico;

	private Long cntPeriferico;

	private Short codtracking;

	private String usuarioRecojo;

	private Date fechaRecojo;

	private Short flagRecojo;

	private Short tipoPagoOrden;

	private String ciudadOrigen;

	private String ciudadDestino;

	private BigDecimal valorDeclarado;

	private String prioridad;

	private String nrooperador;

	private String codrecojo;

	private String codConformidad;

	private String obsConformidad;

	private String usuConformidad;

	private Date fecConformidad;

	private Short codActiva;

	private String ususarioActiva;

	private Date fechaActiva;

	private String tTransporte;

	private String serieDevc;

	private String nroDevc;

	private String estadoDevc;

	private String observacion2;

	private String serieguiasol;

	private String nroguiasol;

	private Short flagTipoOrden;

	private String codigo;

	private Short cntM3;

	private String tipoUnidad;

	private String codSubServicio;

	private String usuarioAnula;

	private Date fechaAnula;

	private String obsAnula;

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie == null ? null : serie.trim();
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden == null ? null : orden.trim();
	}

	public String getPreorden() {
		return preorden;
	}

	public void setPreorden(String preorden) {
		this.preorden = preorden == null ? null : preorden.trim();
	}

	public String getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente == null ? null : codcliente.trim();
	}

	public String getCodareacliente() {
		return codareacliente;
	}

	public void setCodareacliente(String codareacliente) {
		this.codareacliente = codareacliente == null ? null : codareacliente
				.trim();
	}

	public String getCodambito() {
		return codambito;
	}

	public void setCodambito(String codambito) {
		this.codambito = codambito == null ? null : codambito.trim();
	}

	public String getCodnegocio() {
		return codnegocio;
	}

	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio == null ? null : codnegocio.trim();
	}

	public String getCodservicio() {
		return codservicio;
	}

	public void setCodservicio(String codservicio) {
		this.codservicio = codservicio == null ? null : codservicio.trim();
	}

	public String getCodproducto() {
		return codproducto;
	}

	public void setCodproducto(String codproducto) {
		this.codproducto = codproducto == null ? null : codproducto.trim();
	}

	public String getCodtiporeparto() {
		return codtiporeparto;
	}

	public void setCodtiporeparto(String codtiporeparto) {
		this.codtiporeparto = codtiporeparto == null ? null : codtiporeparto
				.trim();
	}

	public Long getCntAdmision() {
		return cntAdmision;
	}

	public void setCntAdmision(Long cntAdmision) {
		this.cntAdmision = cntAdmision;
	}

	public Long getCntDigitado() {
		return cntDigitado;
	}

	public void setCntDigitado(Long cntDigitado) {
		this.cntDigitado = cntDigitado;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public Date getFechadevolucion() {
		return fechadevolucion;
	}

	public void setFechadevolucion(Date fechadevolucion) {
		this.fechadevolucion = fechadevolucion;
	}

	public String getEstadoorden() {
		return estadoorden;
	}

	public void setEstadoorden(String estadoorden) {
		this.estadoorden = estadoorden == null ? null : estadoorden.trim();
	}

	public String getEstadoout() {
		return estadoout;
	}

	public void setEstadoout(String estadoout) {
		this.estadoout = estadoout == null ? null : estadoout.trim();
	}

	public Short getBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(Short bloqueo) {
		this.bloqueo = bloqueo;
	}

	public Short getVolantes() {
		return volantes;
	}

	public void setVolantes(Short volantes) {
		this.volantes = volantes;
	}

	public Short getValorado() {
		return valorado;
	}

	public void setValorado(Short valorado) {
		this.valorado = valorado;
	}

	public Short getLiquidado() {
		return liquidado;
	}

	public void setLiquidado(Short liquidado) {
		this.liquidado = liquidado;
	}

	public String getNroliquidacion() {
		return nroliquidacion;
	}

	public void setNroliquidacion(String nroliquidacion) {
		this.nroliquidacion = nroliquidacion == null ? null : nroliquidacion
				.trim();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario == null ? null : usuario.trim();
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsuariomod() {
		return usuariomod;
	}

	public void setUsuariomod(String usuariomod) {
		this.usuariomod = usuariomod == null ? null : usuariomod.trim();
	}

	public Date getFechamod() {
		return fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}

	public String getCodejecutiva() {
		return codejecutiva;
	}

	public void setCodejecutiva(String codejecutiva) {
		this.codejecutiva = codejecutiva == null ? null : codejecutiva.trim();
	}

	public String getGlosa() {
		return glosa;
	}

	public void setGlosa(String glosa) {
		this.glosa = glosa == null ? null : glosa.trim();
	}

	public Short getFacturado() {
		return facturado;
	}

	public void setFacturado(Short facturado) {
		this.facturado = facturado;
	}

	public String getFacSerie() {
		return facSerie;
	}

	public void setFacSerie(String facSerie) {
		this.facSerie = facSerie == null ? null : facSerie.trim();
	}

	public String getEeccSerie() {
		return eeccSerie;
	}

	public void setEeccSerie(String eeccSerie) {
		this.eeccSerie = eeccSerie == null ? null : eeccSerie.trim();
	}

	public String getEeccNumero() {
		return eeccNumero;
	}

	public void setEeccNumero(String eeccNumero) {
		this.eeccNumero = eeccNumero == null ? null : eeccNumero.trim();
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public BigDecimal getVenta() {
		return venta;
	}

	public void setVenta(BigDecimal venta) {
		this.venta = venta;
	}

	public BigDecimal getIgv() {
		return igv;
	}

	public void setIgv(BigDecimal igv) {
		this.igv = igv;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getCoserie() {
		return coserie;
	}

	public void setCoserie(String coserie) {
		this.coserie = coserie == null ? null : coserie.trim();
	}

	public Integer getConumero() {
		return conumero;
	}

	public void setConumero(Integer conumero) {
		this.conumero = conumero;
	}

	public String getCodtipooperador() {
		return codtipooperador;
	}

	public void setCodtipooperador(String codtipooperador) {
		this.codtipooperador = codtipooperador == null ? null : codtipooperador
				.trim();
	}

	public String getSeoperador() {
		return seoperador;
	}

	public void setSeoperador(String seoperador) {
		this.seoperador = seoperador == null ? null : seoperador.trim();
	}

	public BigDecimal getTarifaUrbana() {
		return tarifaUrbana;
	}

	public void setTarifaUrbana(BigDecimal tarifaUrbana) {
		this.tarifaUrbana = tarifaUrbana;
	}

	public BigDecimal getTarifaPeriferica() {
		return tarifaPeriferica;
	}

	public void setTarifaPeriferica(BigDecimal tarifaPeriferica) {
		this.tarifaPeriferica = tarifaPeriferica;
	}

	public BigDecimal getTarifaExtrema() {
		return tarifaExtrema;
	}

	public void setTarifaExtrema(BigDecimal tarifaExtrema) {
		this.tarifaExtrema = tarifaExtrema;
	}

	public BigDecimal getInafecto() {
		return inafecto;
	}

	public void setInafecto(BigDecimal inafecto) {
		this.inafecto = inafecto;
	}

	public Short getTipocotizacion() {
		return tipocotizacion;
	}

	public void setTipocotizacion(Short tipocotizacion) {
		this.tipocotizacion = tipocotizacion;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda == null ? null : moneda.trim();
	}

	public BigDecimal getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(BigDecimal tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public Integer getFacNumero() {
		return facNumero;
	}

	public void setFacNumero(Integer facNumero) {
		this.facNumero = facNumero;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento == null ? null : tipodocumento
				.trim();
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion == null ? null : observacion.trim();
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo == null ? null : grupo.trim();
	}

	public String getCodorigen() {
		return codorigen;
	}

	public void setCodorigen(String codorigen) {
		this.codorigen = codorigen == null ? null : codorigen.trim();
	}

	public String getCodzona() {
		return codzona;
	}

	public void setCodzona(String codzona) {
		this.codzona = codzona == null ? null : codzona.trim();
	}

	public BigDecimal getImportePlus() {
		return importePlus;
	}

	public void setImportePlus(BigDecimal importePlus) {
		this.importePlus = importePlus;
	}

	public BigDecimal getTarifaAdicional() {
		return tarifaAdicional;
	}

	public void setTarifaAdicional(BigDecimal tarifaAdicional) {
		this.tarifaAdicional = tarifaAdicional;
	}

	public BigDecimal getImporteServicio() {
		return importeServicio;
	}

	public void setImporteServicio(BigDecimal importeServicio) {
		this.importeServicio = importeServicio;
	}

	public BigDecimal getImportePeriferico() {
		return importePeriferico;
	}

	public void setImportePeriferico(BigDecimal importePeriferico) {
		this.importePeriferico = importePeriferico;
	}

	public BigDecimal getMontoPeriferico() {
		return montoPeriferico;
	}

	public void setMontoPeriferico(BigDecimal montoPeriferico) {
		this.montoPeriferico = montoPeriferico;
	}

	public Long getCntPeriferico() {
		return cntPeriferico;
	}

	public void setCntPeriferico(Long cntPeriferico) {
		this.cntPeriferico = cntPeriferico;
	}

	public Short getCodtracking() {
		return codtracking;
	}

	public void setCodtracking(Short codtracking) {
		this.codtracking = codtracking;
	}

	public String getUsuarioRecojo() {
		return usuarioRecojo;
	}

	public void setUsuarioRecojo(String usuarioRecojo) {
		this.usuarioRecojo = usuarioRecojo == null ? null : usuarioRecojo
				.trim();
	}

	public Date getFechaRecojo() {
		return fechaRecojo;
	}

	public void setFechaRecojo(Date fechaRecojo) {
		this.fechaRecojo = fechaRecojo;
	}

	public Short getFlagRecojo() {
		return flagRecojo;
	}

	public void setFlagRecojo(Short flagRecojo) {
		this.flagRecojo = flagRecojo;
	}

	public Short getTipoPagoOrden() {
		return tipoPagoOrden;
	}

	public void setTipoPagoOrden(Short tipoPagoOrden) {
		this.tipoPagoOrden = tipoPagoOrden;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen == null ? null : ciudadOrigen.trim();
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino == null ? null : ciudadDestino
				.trim();
	}

	public BigDecimal getValorDeclarado() {
		return valorDeclarado;
	}

	public void setValorDeclarado(BigDecimal valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad == null ? null : prioridad.trim();
	}

	public String getNrooperador() {
		return nrooperador;
	}

	public void setNrooperador(String nrooperador) {
		this.nrooperador = nrooperador == null ? null : nrooperador.trim();
	}

	public String getCodrecojo() {
		return codrecojo;
	}

	public void setCodrecojo(String codrecojo) {
		this.codrecojo = codrecojo == null ? null : codrecojo.trim();
	}

	public String getCodConformidad() {
		return codConformidad;
	}

	public void setCodConformidad(String codConformidad) {
		this.codConformidad = codConformidad == null ? null : codConformidad
				.trim();
	}

	public String getObsConformidad() {
		return obsConformidad;
	}

	public void setObsConformidad(String obsConformidad) {
		this.obsConformidad = obsConformidad == null ? null : obsConformidad
				.trim();
	}

	public String getUsuConformidad() {
		return usuConformidad;
	}

	public void setUsuConformidad(String usuConformidad) {
		this.usuConformidad = usuConformidad == null ? null : usuConformidad
				.trim();
	}

	public Date getFecConformidad() {
		return fecConformidad;
	}

	public void setFecConformidad(Date fecConformidad) {
		this.fecConformidad = fecConformidad;
	}

	public Short getCodActiva() {
		return codActiva;
	}

	public void setCodActiva(Short codActiva) {
		this.codActiva = codActiva;
	}

	public String getUsusarioActiva() {
		return ususarioActiva;
	}

	public void setUsusarioActiva(String ususarioActiva) {
		this.ususarioActiva = ususarioActiva == null ? null : ususarioActiva
				.trim();
	}

	public Date getFechaActiva() {
		return fechaActiva;
	}

	public void setFechaActiva(Date fechaActiva) {
		this.fechaActiva = fechaActiva;
	}

	public String gettTransporte() {
		return tTransporte;
	}

	public void settTransporte(String tTransporte) {
		this.tTransporte = tTransporte == null ? null : tTransporte.trim();
	}

	public String getSerieDevc() {
		return serieDevc;
	}

	public void setSerieDevc(String serieDevc) {
		this.serieDevc = serieDevc == null ? null : serieDevc.trim();
	}

	public String getNroDevc() {
		return nroDevc;
	}

	public void setNroDevc(String nroDevc) {
		this.nroDevc = nroDevc == null ? null : nroDevc.trim();
	}

	public String getEstadoDevc() {
		return estadoDevc;
	}

	public void setEstadoDevc(String estadoDevc) {
		this.estadoDevc = estadoDevc == null ? null : estadoDevc.trim();
	}

	public String getObservacion2() {
		return observacion2;
	}

	public void setObservacion2(String observacion2) {
		this.observacion2 = observacion2 == null ? null : observacion2.trim();
	}

	public String getSerieguiasol() {
		return serieguiasol;
	}

	public void setSerieguiasol(String serieguiasol) {
		this.serieguiasol = serieguiasol == null ? null : serieguiasol.trim();
	}

	public String getNroguiasol() {
		return nroguiasol;
	}

	public void setNroguiasol(String nroguiasol) {
		this.nroguiasol = nroguiasol == null ? null : nroguiasol.trim();
	}

	public Short getFlagTipoOrden() {
		return flagTipoOrden;
	}

	public void setFlagTipoOrden(Short flagTipoOrden) {
		this.flagTipoOrden = flagTipoOrden;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo == null ? null : codigo.trim();
	}

	public Short getCntM3() {
		return cntM3;
	}

	public void setCntM3(Short cntM3) {
		this.cntM3 = cntM3;
	}

	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad == null ? null : tipoUnidad.trim();
	}

	public String getCodSubServicio() {
		return codSubServicio;
	}

	public void setCodSubServicio(String codSubServicio) {
		this.codSubServicio = codSubServicio == null ? null : codSubServicio
				.trim();
	}

	public String getUsuarioAnula() {
		return usuarioAnula;
	}

	public void setUsuarioAnula(String usuarioAnula) {
		this.usuarioAnula = usuarioAnula == null ? null : usuarioAnula.trim();
	}

	public Date getFechaAnula() {
		return fechaAnula;
	}

	public void setFechaAnula(Date fechaAnula) {
		this.fechaAnula = fechaAnula;
	}

	public String getObsAnula() {
		return obsAnula;
	}

	public void setObsAnula(String obsAnula) {
		this.obsAnula = obsAnula == null ? null : obsAnula.trim();
	}

	private String serie;

    private String orden;

    private String preorden;

    private String codcliente;

    private String codareacliente;

    private String codambito;

    private String codnegocio;

    private String codservicio;

    private String codproducto;

    private String codtiporeparto;

    private Long cntAdmision;

    private Long cntDigitado;

    private BigDecimal peso;

    private Date fechaingreso;

    private Date fechainicio;

    private Date fechavencimiento;

    private Date fechadevolucion;

    private String estadoorden;

    private String estadoout;

    private Short bloqueo;

    private Short volantes;

    private Short valorado;

    private Short liquidado;

    private String nroliquidacion;

    private String usuario;

    private Date fecha;

    private String usuariomod;

    private Date fechamod;

    private String codejecutiva;

    private String glosa;

    private Short facturado;

    private String facSerie;

    private String eeccSerie;

    private String eeccNumero;

    private BigDecimal importe;

    private BigDecimal descuento;

    private BigDecimal venta;

    private BigDecimal igv;

    private BigDecimal total;

    private String coserie;

    private Integer conumero;

    private String codtipooperador;

    private String seoperador;

    private BigDecimal tarifaUrbana;

    private BigDecimal tarifaPeriferica;

    private BigDecimal tarifaExtrema;

    private BigDecimal inafecto;

    private Short tipocotizacion;

    private String moneda;

    private BigDecimal tipoCambio;

    private Integer facNumero;

    private String tipodocumento;

    private String observacion;

    private String grupo;

    private String codorigen;

    private String codzona;

    private BigDecimal importePlus;

    private BigDecimal tarifaAdicional;

    private BigDecimal importeServicio;

    private BigDecimal importePeriferico;

    private BigDecimal montoPeriferico;

    private Long cntPeriferico;

    private Short codtracking;

    private String usuarioRecojo;

    private Date fechaRecojo;

    private Short flagRecojo;

    private Short tipoPagoOrden;

    private String ciudadOrigen;

    private String ciudadDestino;

    private BigDecimal valorDeclarado;

    private String prioridad;

    private String nrooperador;

    private String codrecojo;

    private String codConformidad;

    private String obsConformidad;

    private String usuConformidad;

    private Date fecConformidad;

    private Short codActiva;

    private String ususarioActiva;

    private Date fechaActiva;

    private String tTransporte;

    private String serieDevc;

    private String nroDevc;

    private String estadoDevc;

    private String observacion2;

    private String serieguiasol;

    private String nroguiasol;

    private Short flagTipoOrden;

    private String codigo;

    private Short cntM3;

    private String tipoUnidad;

    private String codSubServicio;

    private String usuarioAnula;

    private Date fechaAnula;

    private String obsAnula;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie == null ? null : serie.trim();
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden == null ? null : orden.trim();
    }

    public String getPreorden() {
        return preorden;
    }

    public void setPreorden(String preorden) {
        this.preorden = preorden == null ? null : preorden.trim();
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente == null ? null : codcliente.trim();
    }

    public String getCodareacliente() {
        return codareacliente;
    }

    public void setCodareacliente(String codareacliente) {
        this.codareacliente = codareacliente == null ? null : codareacliente.trim();
    }

    public String getCodambito() {
        return codambito;
    }

    public void setCodambito(String codambito) {
        this.codambito = codambito == null ? null : codambito.trim();
    }

    public String getCodnegocio() {
        return codnegocio;
    }

    public void setCodnegocio(String codnegocio) {
        this.codnegocio = codnegocio == null ? null : codnegocio.trim();
    }

    public String getCodservicio() {
        return codservicio;
    }

    public void setCodservicio(String codservicio) {
        this.codservicio = codservicio == null ? null : codservicio.trim();
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto == null ? null : codproducto.trim();
    }

    public String getCodtiporeparto() {
        return codtiporeparto;
    }

    public void setCodtiporeparto(String codtiporeparto) {
        this.codtiporeparto = codtiporeparto == null ? null : codtiporeparto.trim();
    }

    public Long getCntAdmision() {
        return cntAdmision;
    }

    public void setCntAdmision(Long cntAdmision) {
        this.cntAdmision = cntAdmision;
    }

    public Long getCntDigitado() {
        return cntDigitado;
    }

    public void setCntDigitado(Long cntDigitado) {
        this.cntDigitado = cntDigitado;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public String getEstadoorden() {
        return estadoorden;
    }

    public void setEstadoorden(String estadoorden) {
        this.estadoorden = estadoorden == null ? null : estadoorden.trim();
    }

    public String getEstadoout() {
        return estadoout;
    }

    public void setEstadoout(String estadoout) {
        this.estadoout = estadoout == null ? null : estadoout.trim();
    }

    public Short getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(Short bloqueo) {
        this.bloqueo = bloqueo;
    }

    public Short getVolantes() {
        return volantes;
    }

    public void setVolantes(Short volantes) {
        this.volantes = volantes;
    }

    public Short getValorado() {
        return valorado;
    }

    public void setValorado(Short valorado) {
        this.valorado = valorado;
    }

    public Short getLiquidado() {
        return liquidado;
    }

    public void setLiquidado(Short liquidado) {
        this.liquidado = liquidado;
    }

    public String getNroliquidacion() {
        return nroliquidacion;
    }

    public void setNroliquidacion(String nroliquidacion) {
        this.nroliquidacion = nroliquidacion == null ? null : nroliquidacion.trim();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario == null ? null : usuario.trim();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod == null ? null : usuariomod.trim();
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    public String getCodejecutiva() {
        return codejecutiva;
    }

    public void setCodejecutiva(String codejecutiva) {
        this.codejecutiva = codejecutiva == null ? null : codejecutiva.trim();
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa == null ? null : glosa.trim();
    }

    public Short getFacturado() {
        return facturado;
    }

    public void setFacturado(Short facturado) {
        this.facturado = facturado;
    }

    public String getFacSerie() {
        return facSerie;
    }

    public void setFacSerie(String facSerie) {
        this.facSerie = facSerie == null ? null : facSerie.trim();
    }

    public String getEeccSerie() {
        return eeccSerie;
    }

    public void setEeccSerie(String eeccSerie) {
        this.eeccSerie = eeccSerie == null ? null : eeccSerie.trim();
    }

    public String getEeccNumero() {
        return eeccNumero;
    }

    public void setEeccNumero(String eeccNumero) {
        this.eeccNumero = eeccNumero == null ? null : eeccNumero.trim();
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getVenta() {
        return venta;
    }

    public void setVenta(BigDecimal venta) {
        this.venta = venta;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getCoserie() {
        return coserie;
    }

    public void setCoserie(String coserie) {
        this.coserie = coserie == null ? null : coserie.trim();
    }

    public Integer getConumero() {
        return conumero;
    }

    public void setConumero(Integer conumero) {
        this.conumero = conumero;
    }

    public String getCodtipooperador() {
        return codtipooperador;
    }

    public void setCodtipooperador(String codtipooperador) {
        this.codtipooperador = codtipooperador == null ? null : codtipooperador.trim();
    }

    public String getSeoperador() {
        return seoperador;
    }

    public void setSeoperador(String seoperador) {
        this.seoperador = seoperador == null ? null : seoperador.trim();
    }

    public BigDecimal getTarifaUrbana() {
        return tarifaUrbana;
    }

    public void setTarifaUrbana(BigDecimal tarifaUrbana) {
        this.tarifaUrbana = tarifaUrbana;
    }

    public BigDecimal getTarifaPeriferica() {
        return tarifaPeriferica;
    }

    public void setTarifaPeriferica(BigDecimal tarifaPeriferica) {
        this.tarifaPeriferica = tarifaPeriferica;
    }

    public BigDecimal getTarifaExtrema() {
        return tarifaExtrema;
    }

    public void setTarifaExtrema(BigDecimal tarifaExtrema) {
        this.tarifaExtrema = tarifaExtrema;
    }

    public BigDecimal getInafecto() {
        return inafecto;
    }

    public void setInafecto(BigDecimal inafecto) {
        this.inafecto = inafecto;
    }

    public Short getTipocotizacion() {
        return tipocotizacion;
    }

    public void setTipocotizacion(Short tipocotizacion) {
        this.tipocotizacion = tipocotizacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda == null ? null : moneda.trim();
    }

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Integer getFacNumero() {
        return facNumero;
    }

    public void setFacNumero(Integer facNumero) {
        this.facNumero = facNumero;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento == null ? null : tipodocumento.trim();
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion == null ? null : observacion.trim();
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo == null ? null : grupo.trim();
    }

    public String getCodorigen() {
        return codorigen;
    }

    public void setCodorigen(String codorigen) {
        this.codorigen = codorigen == null ? null : codorigen.trim();
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona == null ? null : codzona.trim();
    }

    public BigDecimal getImportePlus() {
        return importePlus;
    }

    public void setImportePlus(BigDecimal importePlus) {
        this.importePlus = importePlus;
    }

    public BigDecimal getTarifaAdicional() {
        return tarifaAdicional;
    }

    public void setTarifaAdicional(BigDecimal tarifaAdicional) {
        this.tarifaAdicional = tarifaAdicional;
    }

    public BigDecimal getImporteServicio() {
        return importeServicio;
    }

    public void setImporteServicio(BigDecimal importeServicio) {
        this.importeServicio = importeServicio;
    }

    public BigDecimal getImportePeriferico() {
        return importePeriferico;
    }

    public void setImportePeriferico(BigDecimal importePeriferico) {
        this.importePeriferico = importePeriferico;
    }

    public BigDecimal getMontoPeriferico() {
        return montoPeriferico;
    }

    public void setMontoPeriferico(BigDecimal montoPeriferico) {
        this.montoPeriferico = montoPeriferico;
    }

    public Long getCntPeriferico() {
        return cntPeriferico;
    }

    public void setCntPeriferico(Long cntPeriferico) {
        this.cntPeriferico = cntPeriferico;
    }

    public Short getCodtracking() {
        return codtracking;
    }

    public void setCodtracking(Short codtracking) {
        this.codtracking = codtracking;
    }

    public String getUsuarioRecojo() {
        return usuarioRecojo;
    }

    public void setUsuarioRecojo(String usuarioRecojo) {
        this.usuarioRecojo = usuarioRecojo == null ? null : usuarioRecojo.trim();
    }

    public Date getFechaRecojo() {
        return fechaRecojo;
    }

    public void setFechaRecojo(Date fechaRecojo) {
        this.fechaRecojo = fechaRecojo;
    }

    public Short getFlagRecojo() {
        return flagRecojo;
    }

    public void setFlagRecojo(Short flagRecojo) {
        this.flagRecojo = flagRecojo;
    }

    public Short getTipoPagoOrden() {
        return tipoPagoOrden;
    }

    public void setTipoPagoOrden(Short tipoPagoOrden) {
        this.tipoPagoOrden = tipoPagoOrden;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen == null ? null : ciudadOrigen.trim();
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino == null ? null : ciudadDestino.trim();
    }

    public BigDecimal getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(BigDecimal valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad == null ? null : prioridad.trim();
    }

    public String getNrooperador() {
        return nrooperador;
    }

    public void setNrooperador(String nrooperador) {
        this.nrooperador = nrooperador == null ? null : nrooperador.trim();
    }

    public String getCodrecojo() {
        return codrecojo;
    }

    public void setCodrecojo(String codrecojo) {
        this.codrecojo = codrecojo == null ? null : codrecojo.trim();
    }

    public String getCodConformidad() {
        return codConformidad;
    }

    public void setCodConformidad(String codConformidad) {
        this.codConformidad = codConformidad == null ? null : codConformidad.trim();
    }

    public String getObsConformidad() {
        return obsConformidad;
    }

    public void setObsConformidad(String obsConformidad) {
        this.obsConformidad = obsConformidad == null ? null : obsConformidad.trim();
    }

    public String getUsuConformidad() {
        return usuConformidad;
    }

    public void setUsuConformidad(String usuConformidad) {
        this.usuConformidad = usuConformidad == null ? null : usuConformidad.trim();
    }

    public Date getFecConformidad() {
        return fecConformidad;
    }

    public void setFecConformidad(Date fecConformidad) {
        this.fecConformidad = fecConformidad;
    }

    public Short getCodActiva() {
        return codActiva;
    }

    public void setCodActiva(Short codActiva) {
        this.codActiva = codActiva;
    }

    public String getUsusarioActiva() {
        return ususarioActiva;
    }

    public void setUsusarioActiva(String ususarioActiva) {
        this.ususarioActiva = ususarioActiva == null ? null : ususarioActiva.trim();
    }

    public Date getFechaActiva() {
        return fechaActiva;
    }

    public void setFechaActiva(Date fechaActiva) {
        this.fechaActiva = fechaActiva;
    }

    public String gettTransporte() {
        return tTransporte;
    }

    public void settTransporte(String tTransporte) {
        this.tTransporte = tTransporte == null ? null : tTransporte.trim();
    }

    public String getSerieDevc() {
        return serieDevc;
    }

    public void setSerieDevc(String serieDevc) {
        this.serieDevc = serieDevc == null ? null : serieDevc.trim();
    }

    public String getNroDevc() {
        return nroDevc;
    }

    public void setNroDevc(String nroDevc) {
        this.nroDevc = nroDevc == null ? null : nroDevc.trim();
    }

    public String getEstadoDevc() {
        return estadoDevc;
    }

    public void setEstadoDevc(String estadoDevc) {
        this.estadoDevc = estadoDevc == null ? null : estadoDevc.trim();
    }

    public String getObservacion2() {
        return observacion2;
    }

    public void setObservacion2(String observacion2) {
        this.observacion2 = observacion2 == null ? null : observacion2.trim();
    }

    public String getSerieguiasol() {
        return serieguiasol;
    }

    public void setSerieguiasol(String serieguiasol) {
        this.serieguiasol = serieguiasol == null ? null : serieguiasol.trim();
    }

    public String getNroguiasol() {
        return nroguiasol;
    }

    public void setNroguiasol(String nroguiasol) {
        this.nroguiasol = nroguiasol == null ? null : nroguiasol.trim();
    }

    public Short getFlagTipoOrden() {
        return flagTipoOrden;
    }

    public void setFlagTipoOrden(Short flagTipoOrden) {
        this.flagTipoOrden = flagTipoOrden;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo == null ? null : codigo.trim();
    }

    public Short getCntM3() {
        return cntM3;
    }

    public void setCntM3(Short cntM3) {
        this.cntM3 = cntM3;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad == null ? null : tipoUnidad.trim();
    }

    public String getCodSubServicio() {
        return codSubServicio;
    }

    public void setCodSubServicio(String codSubServicio) {
        this.codSubServicio = codSubServicio == null ? null : codSubServicio.trim();
    }

    public String getUsuarioAnula() {
        return usuarioAnula;
    }

    public void setUsuarioAnula(String usuarioAnula) {
        this.usuarioAnula = usuarioAnula == null ? null : usuarioAnula.trim();
    }

    public Date getFechaAnula() {
        return fechaAnula;
    }

    public void setFechaAnula(Date fechaAnula) {
        this.fechaAnula = fechaAnula;
    }

    public String getObsAnula() {
        return obsAnula;
    }

    public void setObsAnula(String obsAnula) {
        this.obsAnula = obsAnula == null ? null : obsAnula.trim();
    }
}