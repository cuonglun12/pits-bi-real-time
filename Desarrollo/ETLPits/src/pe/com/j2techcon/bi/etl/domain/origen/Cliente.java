package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.Date;

public class Cliente {
    private String codcliente;

    private String ruc;

    private String cliente;

    private String tipocliente;

    private String rubro;

    private String alias;

    private String direccion;

    private String ubigeo;

    private String codpais;

    private String telefono;

    private String movil;

    private String lim;

    private String codejecutiva;

    private String email;

    private String tipoCredito;

    private String tipoFacturacion;

    private String usuario;

    private Date fecha;

    private Date fechamod;

    private String usuariomod;

    private String periodoFac;

    private Integer diasCredito;

    private BigDecimal credito;

    private BigDecimal creditoUtilizado;

    private BigDecimal creditoDisponible;

    private BigDecimal sobregiro;

    private Short estado;

    private String observacion;

    private Date fechaInicioCredito;

    private Date fechaVenceCredito;

    private String tipoDocumento;

    private String referencia;

    private String telefono1;

    private String codEncuesta;

    private Long hPactada;

    private BigDecimal tCliente;

    private BigDecimal tHAdicional;

    private BigDecimal tKmAdicional;

    private String email2;

    private String clasifica;

    private String codempresa;

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente == null ? null : codcliente.trim();
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc == null ? null : ruc.trim();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente == null ? null : cliente.trim();
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente == null ? null : tipocliente.trim();
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro == null ? null : rubro.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion == null ? null : direccion.trim();
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo == null ? null : ubigeo.trim();
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais == null ? null : codpais.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono == null ? null : telefono.trim();
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil == null ? null : movil.trim();
    }

    public String getLim() {
        return lim;
    }

    public void setLim(String lim) {
        this.lim = lim == null ? null : lim.trim();
    }

    public String getCodejecutiva() {
        return codejecutiva;
    }

    public void setCodejecutiva(String codejecutiva) {
        this.codejecutiva = codejecutiva == null ? null : codejecutiva.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito == null ? null : tipoCredito.trim();
    }

    public String getTipoFacturacion() {
        return tipoFacturacion;
    }

    public void setTipoFacturacion(String tipoFacturacion) {
        this.tipoFacturacion = tipoFacturacion == null ? null : tipoFacturacion.trim();
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

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod == null ? null : usuariomod.trim();
    }

    public String getPeriodoFac() {
        return periodoFac;
    }

    public void setPeriodoFac(String periodoFac) {
        this.periodoFac = periodoFac == null ? null : periodoFac.trim();
    }

    public Integer getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(Integer diasCredito) {
        this.diasCredito = diasCredito;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    public BigDecimal getCreditoUtilizado() {
        return creditoUtilizado;
    }

    public void setCreditoUtilizado(BigDecimal creditoUtilizado) {
        this.creditoUtilizado = creditoUtilizado;
    }

    public BigDecimal getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(BigDecimal creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    public BigDecimal getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(BigDecimal sobregiro) {
        this.sobregiro = sobregiro;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion == null ? null : observacion.trim();
    }

    public Date getFechaInicioCredito() {
        return fechaInicioCredito;
    }

    public void setFechaInicioCredito(Date fechaInicioCredito) {
        this.fechaInicioCredito = fechaInicioCredito;
    }

    public Date getFechaVenceCredito() {
        return fechaVenceCredito;
    }

    public void setFechaVenceCredito(Date fechaVenceCredito) {
        this.fechaVenceCredito = fechaVenceCredito;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento == null ? null : tipoDocumento.trim();
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia == null ? null : referencia.trim();
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1 == null ? null : telefono1.trim();
    }

    public String getCodEncuesta() {
        return codEncuesta;
    }

    public void setCodEncuesta(String codEncuesta) {
        this.codEncuesta = codEncuesta == null ? null : codEncuesta.trim();
    }

    public Long gethPactada() {
        return hPactada;
    }

    public void sethPactada(Long hPactada) {
        this.hPactada = hPactada;
    }

    public BigDecimal gettCliente() {
        return tCliente;
    }

    public void settCliente(BigDecimal tCliente) {
        this.tCliente = tCliente;
    }

    public BigDecimal gettHAdicional() {
        return tHAdicional;
    }

    public void settHAdicional(BigDecimal tHAdicional) {
        this.tHAdicional = tHAdicional;
    }

    public BigDecimal gettKmAdicional() {
        return tKmAdicional;
    }

    public void settKmAdicional(BigDecimal tKmAdicional) {
        this.tKmAdicional = tKmAdicional;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    public String getClasifica() {
        return clasifica;
    }

    public void setClasifica(String clasifica) {
        this.clasifica = clasifica == null ? null : clasifica.trim();
    }

    public String getCodempresa() {
        return codempresa;
    }

    public void setCodempresa(String codempresa) {
        this.codempresa = codempresa == null ? null : codempresa.trim();
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
        this.biCodIndCam = biCodIndCam == null ? null : biCodIndCam.trim();
    }
    
    public void clear(){
    	codcliente=null;
    	ruc=null;
    	cliente=null;
    	tipocliente=null;
    	rubro=null;
    	alias=null;
    	direccion=null;
    	ubigeo=null;
    	codpais=null;
    	telefono=null;
    	movil=null;
    	lim=null;
    	codejecutiva=null;
    	email=null;
    	tipoCredito=null;
    	tipoFacturacion=null;
    	usuario=null;
    	fecha=null;
    	fechamod=null;
    	usuariomod=null;
    	periodoFac=null;
    	diasCredito=null;
    	credito=null;
    	creditoUtilizado=null;
    	creditoDisponible=null;
    	sobregiro=null;
    	estado=null;
    	observacion=null;
    	fechaInicioCredito=null;
    	fechaVenceCredito=null;
    	tipoDocumento=null;
    	referencia=null;
    	telefono1=null;
    	codEncuesta=null;
    	hPactada=null;
    	tCliente=null;
    	tHAdicional=null;
    	tKmAdicional=null;
    	email2=null;
    	clasifica=null;
    	codempresa=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }

	@Override
	public String toString() {
		return "Cliente [codcliente=" + codcliente + ", ruc=" + ruc
				+ ", cliente=" + cliente + ", tipocliente=" + tipocliente
				+ ", rubro=" + rubro + ", alias=" + alias + ", direccion="
				+ direccion + ", ubigeo=" + ubigeo + ", codpais=" + codpais
				+ ", telefono=" + telefono + ", movil=" + movil + ", lim="
				+ lim + ", codejecutiva=" + codejecutiva + ", email=" + email
				+ ", tipoCredito=" + tipoCredito + ", tipoFacturacion="
				+ tipoFacturacion + ", usuario=" + usuario + ", fecha=" + fecha
				+ ", fechamod=" + fechamod + ", usuariomod=" + usuariomod
				+ ", periodoFac=" + periodoFac + ", diasCredito=" + diasCredito
				+ ", credito=" + credito + ", creditoUtilizado="
				+ creditoUtilizado + ", creditoDisponible=" + creditoDisponible
				+ ", sobregiro=" + sobregiro + ", estado=" + estado
				+ ", observacion=" + observacion + ", fechaInicioCredito="
				+ fechaInicioCredito + ", fechaVenceCredito="
				+ fechaVenceCredito + ", tipoDocumento=" + tipoDocumento
				+ ", referencia=" + referencia + ", telefono1=" + telefono1
				+ ", codEncuesta=" + codEncuesta + ", hPactada=" + hPactada
				+ ", tCliente=" + tCliente + ", tHAdicional=" + tHAdicional
				+ ", tKmAdicional=" + tKmAdicional + ", email2=" + email2
				+ ", clasifica=" + clasifica + ", codempresa=" + codempresa
				+ ", biFecNumCam=" + biFecNumCam + ", biCodIndCam="
				+ biCodIndCam + "]";
	}
}