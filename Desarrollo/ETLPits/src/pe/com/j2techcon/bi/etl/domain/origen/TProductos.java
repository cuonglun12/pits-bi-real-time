package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.Date;

public class TProductos {
    private String codproducto;

    private String producto;

    private String codnegocio;

    private String codambito;

    private Short estado;

    private String usuario;

    private String usuariomod;

    private String codcliente;

    private String tipoproducto;

    private Date fecha;

    private Date fechamod;

    private String obs;

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodnegocio() {
        return codnegocio;
    }

    public void setCodnegocio(String codnegocio) {
        this.codnegocio = codnegocio;
    }

    public String getCodambito() {
        return codambito;
    }

    public void setCodambito(String codambito) {
        this.codambito = codambito;
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

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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
    	codproducto=null;
    	producto=null;
    	codnegocio=null;
    	codambito=null;
    	estado=null;
    	usuario=null;
    	usuariomod=null;
    	codcliente=null;
    	tipoproducto=null;
    	fecha=null;
    	fechamod=null;
    	obs=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }

	@Override
	public String toString() {
		return "TProductos [codproducto=" + codproducto + ", producto="
				+ producto + ", codnegocio=" + codnegocio + ", codambito="
				+ codambito + ", estado=" + estado + ", usuario=" + usuario
				+ ", usuariomod=" + usuariomod + ", codcliente=" + codcliente
				+ ", tipoproducto=" + tipoproducto + ", fecha=" + fecha
				+ ", fechamod=" + fechamod + ", obs=" + obs + ", biFecNumCam="
				+ biFecNumCam + ", biCodIndCam=" + biCodIndCam + "]";
	}
}