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

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getPreorden() {
        return preorden;
    }

    public void setPreorden(String preorden) {
        this.preorden = preorden;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getCodareacliente() {
        return codareacliente;
    }

    public void setCodareacliente(String codareacliente) {
        this.codareacliente = codareacliente;
    }

    public String getCodambito() {
        return codambito;
    }

    public void setCodambito(String codambito) {
        this.codambito = codambito;
    }

    public String getCodnegocio() {
        return codnegocio;
    }

    public void setCodnegocio(String codnegocio) {
        this.codnegocio = codnegocio;
    }

    public String getCodservicio() {
        return codservicio;
    }

    public void setCodservicio(String codservicio) {
        this.codservicio = codservicio;
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getCodtiporeparto() {
        return codtiporeparto;
    }

    public void setCodtiporeparto(String codtiporeparto) {
        this.codtiporeparto = codtiporeparto;
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
        this.estadoorden = estadoorden;
    }

    public String getEstadoout() {
        return estadoout;
    }

    public void setEstadoout(String estadoout) {
        this.estadoout = estadoout;
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
        this.nroliquidacion = nroliquidacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        this.usuariomod = usuariomod;
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
        this.codejecutiva = codejecutiva;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
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
        this.facSerie = facSerie;
    }

    public String getEeccSerie() {
        return eeccSerie;
    }

    public void setEeccSerie(String eeccSerie) {
        this.eeccSerie = eeccSerie;
    }

    public String getEeccNumero() {
        return eeccNumero;
    }

    public void setEeccNumero(String eeccNumero) {
        this.eeccNumero = eeccNumero;
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
        this.coserie = coserie;
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
        this.codtipooperador = codtipooperador;
    }

    public String getSeoperador() {
        return seoperador;
    }

    public void setSeoperador(String seoperador) {
        this.seoperador = seoperador;
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
        this.moneda = moneda;
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
        this.tipodocumento = tipodocumento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCodorigen() {
        return codorigen;
    }

    public void setCodorigen(String codorigen) {
        this.codorigen = codorigen;
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona;
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
        this.usuarioRecojo = usuarioRecojo;
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
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
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
        this.prioridad = prioridad;
    }

    public String getNrooperador() {
        return nrooperador;
    }

    public void setNrooperador(String nrooperador) {
        this.nrooperador = nrooperador;
    }

    public String getCodrecojo() {
        return codrecojo;
    }

    public void setCodrecojo(String codrecojo) {
        this.codrecojo = codrecojo;
    }

    public String getCodConformidad() {
        return codConformidad;
    }

    public void setCodConformidad(String codConformidad) {
        this.codConformidad = codConformidad;
    }

    public String getObsConformidad() {
        return obsConformidad;
    }

    public void setObsConformidad(String obsConformidad) {
        this.obsConformidad = obsConformidad;
    }

    public String getUsuConformidad() {
        return usuConformidad;
    }

    public void setUsuConformidad(String usuConformidad) {
        this.usuConformidad = usuConformidad;
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
        this.ususarioActiva = ususarioActiva;
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
        this.tTransporte = tTransporte;
    }

    public String getSerieDevc() {
        return serieDevc;
    }

    public void setSerieDevc(String serieDevc) {
        this.serieDevc = serieDevc;
    }

    public String getNroDevc() {
        return nroDevc;
    }

    public void setNroDevc(String nroDevc) {
        this.nroDevc = nroDevc;
    }

    public String getEstadoDevc() {
        return estadoDevc;
    }

    public void setEstadoDevc(String estadoDevc) {
        this.estadoDevc = estadoDevc;
    }

    public String getObservacion2() {
        return observacion2;
    }

    public void setObservacion2(String observacion2) {
        this.observacion2 = observacion2;
    }

    public String getSerieguiasol() {
        return serieguiasol;
    }

    public void setSerieguiasol(String serieguiasol) {
        this.serieguiasol = serieguiasol;
    }

    public String getNroguiasol() {
        return nroguiasol;
    }

    public void setNroguiasol(String nroguiasol) {
        this.nroguiasol = nroguiasol;
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
        this.codigo = codigo;
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
        this.tipoUnidad = tipoUnidad;
    }

    public String getCodSubServicio() {
        return codSubServicio;
    }

    public void setCodSubServicio(String codSubServicio) {
        this.codSubServicio = codSubServicio;
    }

    public String getUsuarioAnula() {
        return usuarioAnula;
    }

    public void setUsuarioAnula(String usuarioAnula) {
        this.usuarioAnula = usuarioAnula;
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
        this.obsAnula = obsAnula;
    }

    public Date getBiFecNumCam() {
        return biFecNumCam;
    }

    public void setBiFecNumCam(Date biFecNumCam) {
        this.biFecNumCam = biFecNumCam;
    }

    public String getBiCodIndCam() {
        return biCodIndCam;
    }

    public void setBiCodIndCam(String biCodIndCam) {
        this.biCodIndCam = biCodIndCam;
    }
    
    public void clear(){
    	serie=null;
    	orden=null;
    	preorden=null;
    	codcliente=null;
    	codareacliente=null;
    	codambito=null;
    	codnegocio=null;
    	codservicio=null;
    	codproducto=null;
    	codtiporeparto=null;
    	cntAdmision=null;
    	cntDigitado=null;
    	peso=null;
    	fechaingreso=null;
    	fechainicio=null;
    	fechavencimiento=null;
    	fechadevolucion=null;
    	estadoorden=null;
    	estadoout=null;
    	bloqueo=null;
    	volantes=null;
    	valorado=null;
    	liquidado=null;
    	nroliquidacion=null;
    	usuario=null;
    	fecha=null;
    	usuariomod=null;
    	fechamod=null;
    	codejecutiva=null;
    	glosa=null;
    	facturado=null;
    	facSerie=null;
    	eeccSerie=null;
    	eeccNumero=null;
    	importe=null;
    	descuento=null;
    	venta=null;
    	igv=null;
    	total=null;
    	coserie=null;
    	conumero=null;
    	codtipooperador=null;
    	seoperador=null;
    	tarifaUrbana=null;
    	tarifaPeriferica=null;
    	tarifaExtrema=null;
    	inafecto=null;
    	tipocotizacion=null;
    	moneda=null;
    	tipoCambio=null;
    	facNumero=null;
    	tipodocumento=null;
    	observacion=null;
    	grupo=null;
    	codorigen=null;
    	codzona=null;
    	importePlus=null;
    	tarifaAdicional=null;
    	importeServicio=null;
    	importePeriferico=null;
    	montoPeriferico=null;
    	cntPeriferico=null;
    	codtracking=null;
    	usuarioRecojo=null;
    	fechaRecojo=null;
    	flagRecojo=null;
    	tipoPagoOrden=null;
    	ciudadOrigen=null;
    	ciudadDestino=null;
    	valorDeclarado=null;
    	prioridad=null;
    	nrooperador=null;
    	codrecojo=null;
    	codConformidad=null;
    	obsConformidad=null;
    	usuConformidad=null;
    	fecConformidad=null;
    	codActiva=null;
    	ususarioActiva=null;
    	fechaActiva=null;
    	tTransporte=null;
    	serieDevc=null;
    	nroDevc=null;
    	estadoDevc=null;
    	observacion2=null;
    	serieguiasol=null;
    	nroguiasol=null;
    	flagTipoOrden=null;
    	codigo=null;
    	cntM3=null;
    	tipoUnidad=null;
    	codSubServicio=null;
    	usuarioAnula=null;
    	fechaAnula=null;
    	obsAnula=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }

	@Override
	public String toString() {
		return "Ordenes [serie=" + serie + ", orden=" + orden + ", preorden="
				+ preorden + ", codcliente=" + codcliente + ", codareacliente="
				+ codareacliente + ", codambito=" + codambito + ", codnegocio="
				+ codnegocio + ", codservicio=" + codservicio
				+ ", codproducto=" + codproducto + ", codtiporeparto="
				+ codtiporeparto + ", cntAdmision=" + cntAdmision
				+ ", cntDigitado=" + cntDigitado + ", peso=" + peso
				+ ", fechaingreso=" + fechaingreso + ", fechainicio="
				+ fechainicio + ", fechavencimiento=" + fechavencimiento
				+ ", fechadevolucion=" + fechadevolucion + ", estadoorden="
				+ estadoorden + ", estadoout=" + estadoout + ", bloqueo="
				+ bloqueo + ", volantes=" + volantes + ", valorado=" + valorado
				+ ", liquidado=" + liquidado + ", nroliquidacion="
				+ nroliquidacion + ", usuario=" + usuario + ", fecha=" + fecha
				+ ", usuariomod=" + usuariomod + ", fechamod=" + fechamod
				+ ", codejecutiva=" + codejecutiva + ", glosa=" + glosa
				+ ", facturado=" + facturado + ", facSerie=" + facSerie
				+ ", eeccSerie=" + eeccSerie + ", eeccNumero=" + eeccNumero
				+ ", importe=" + importe + ", descuento=" + descuento
				+ ", venta=" + venta + ", igv=" + igv + ", total=" + total
				+ ", coserie=" + coserie + ", conumero=" + conumero
				+ ", codtipooperador=" + codtipooperador + ", seoperador="
				+ seoperador + ", tarifaUrbana=" + tarifaUrbana
				+ ", tarifaPeriferica=" + tarifaPeriferica + ", tarifaExtrema="
				+ tarifaExtrema + ", inafecto=" + inafecto
				+ ", tipocotizacion=" + tipocotizacion + ", moneda=" + moneda
				+ ", tipoCambio=" + tipoCambio + ", facNumero=" + facNumero
				+ ", tipodocumento=" + tipodocumento + ", observacion="
				+ observacion + ", grupo=" + grupo + ", codorigen=" + codorigen
				+ ", codzona=" + codzona + ", importePlus=" + importePlus
				+ ", tarifaAdicional=" + tarifaAdicional + ", importeServicio="
				+ importeServicio + ", importePeriferico=" + importePeriferico
				+ ", montoPeriferico=" + montoPeriferico + ", cntPeriferico="
				+ cntPeriferico + ", codtracking=" + codtracking
				+ ", usuarioRecojo=" + usuarioRecojo + ", fechaRecojo="
				+ fechaRecojo + ", flagRecojo=" + flagRecojo
				+ ", tipoPagoOrden=" + tipoPagoOrden + ", ciudadOrigen="
				+ ciudadOrigen + ", ciudadDestino=" + ciudadDestino
				+ ", valorDeclarado=" + valorDeclarado + ", prioridad="
				+ prioridad + ", nrooperador=" + nrooperador + ", codrecojo="
				+ codrecojo + ", codConformidad=" + codConformidad
				+ ", obsConformidad=" + obsConformidad + ", usuConformidad="
				+ usuConformidad + ", fecConformidad=" + fecConformidad
				+ ", codActiva=" + codActiva + ", ususarioActiva="
				+ ususarioActiva + ", fechaActiva=" + fechaActiva
				+ ", tTransporte=" + tTransporte + ", serieDevc=" + serieDevc
				+ ", nroDevc=" + nroDevc + ", estadoDevc=" + estadoDevc
				+ ", observacion2=" + observacion2 + ", serieguiasol="
				+ serieguiasol + ", nroguiasol=" + nroguiasol
				+ ", flagTipoOrden=" + flagTipoOrden + ", codigo=" + codigo
				+ ", cntM3=" + cntM3 + ", tipoUnidad=" + tipoUnidad
				+ ", codSubServicio=" + codSubServicio + ", usuarioAnula="
				+ usuarioAnula + ", fechaAnula=" + fechaAnula + ", obsAnula="
				+ obsAnula + ", biFecNumCam=" + biFecNumCam + ", biCodIndCam="
				+ biCodIndCam + "]";
	}
}