package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.Date;

public class Zonas {
    private String codzona;

    private String codpostal;

    private String codclasificador;

    private String bonozona;

    private String descripcion;

    private BigDecimal pasaje;

    private BigDecimal monto;

    private Date fecha;

    private String usuariomod;

    private Date fechamod;

    private Short estado;

    private String usuario;

    private BigDecimal bono;

    private Short efectividad;

    private String ubigeo;

    private String tipozona;

    private Short cantidad;

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getCodclasificador() {
        return codclasificador;
    }

    public void setCodclasificador(String codclasificador) {
        this.codclasificador = codclasificador;
    }

    public String getBonozona() {
        return bonozona;
    }

    public void setBonozona(String bonozona) {
        this.bonozona = bonozona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPasaje() {
        return pasaje;
    }

    public void setPasaje(BigDecimal pasaje) {
        this.pasaje = pasaje;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getBono() {
        return bono;
    }

    public void setBono(BigDecimal bono) {
        this.bono = bono;
    }

    public Short getEfectividad() {
        return efectividad;
    }

    public void setEfectividad(Short efectividad) {
        this.efectividad = efectividad;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getTipozona() {
        return tipozona;
    }

    public void setTipozona(String tipozona) {
        this.tipozona = tipozona;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
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
        codzona = null;
        codpostal = null;
        codclasificador = null;
        bonozona = null;
        descripcion = null;
        pasaje = null;
        monto = null;
        fecha = null;
        usuariomod = null;
        fechamod = null;
        estado = null;
        usuario = null;
        bono = null;
        efectividad = null;
        ubigeo = null;
        tipozona = null;
        cantidad = null;
        biFecNumCam = null;
        biCodIndCam = null;
    }

	@Override
	public String toString() {
		return "Zonas [codzona=" + codzona + ", codpostal=" + codpostal
				+ ", codclasificador=" + codclasificador + ", bonozona="
				+ bonozona + ", descripcion=" + descripcion + ", pasaje="
				+ pasaje + ", monto=" + monto + ", fecha=" + fecha
				+ ", usuariomod=" + usuariomod + ", fechamod=" + fechamod
				+ ", estado=" + estado + ", usuario=" + usuario + ", bono="
				+ bono + ", efectividad=" + efectividad + ", ubigeo=" + ubigeo
				+ ", tipozona=" + tipozona + ", cantidad=" + cantidad
				+ ", biFecNumCam=" + biFecNumCam + ", biCodIndCam="
				+ biCodIndCam + "]";
	}
}