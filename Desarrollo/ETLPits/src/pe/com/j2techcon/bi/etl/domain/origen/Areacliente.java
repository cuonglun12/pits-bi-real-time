package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.Date;

public class Areacliente {
    private String codareacliente;

    private String codcliente;

    private String ruc;

    private String areacliente;

    private String direccion;

    private String ubigeo;

    private String codpais;

    private String telefono;

    private String movil;

    private String email;

    private String codejecutiva;

    private String observacion;

    private String usuario;

    private Date fecha;

    private String usuariomod;

    private Date fechamod;

    private Short estado;

    private String contacto;

    private String areacontacto;

    private String preorden;

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getCodareacliente() {
        return codareacliente;
    }

    public void setCodareacliente(String codareacliente) {
        this.codareacliente = codareacliente;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getAreacliente() {
        return areacliente;
    }

    public void setAreacliente(String areacliente) {
        this.areacliente = areacliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodejecutiva() {
        return codejecutiva;
    }

    public void setCodejecutiva(String codejecutiva) {
        this.codejecutiva = codejecutiva;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getAreacontacto() {
        return areacontacto;
    }

    public void setAreacontacto(String areacontacto) {
        this.areacontacto = areacontacto;
    }

    public String getPreorden() {
        return preorden;
    }

    public void setPreorden(String preorden) {
        this.preorden = preorden;
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
    	codareacliente=null;
    	codcliente=null;
    	ruc=null;
    	areacliente=null;
    	direccion=null;
    	ubigeo=null;
    	codpais=null;
    	telefono=null;
    	movil=null;
    	email=null;
    	codejecutiva=null;
    	observacion=null;
    	usuario=null;
    	fecha=null;
    	usuariomod=null;
    	fechamod=null;
    	estado=null;
    	contacto=null;
    	areacontacto=null;
    	preorden=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }
    
	@Override
	public String toString() {
		return "Areacliente [codareacliente=" + codareacliente
				+ ", codcliente=" + codcliente + ", ruc=" + ruc
				+ ", areacliente=" + areacliente + ", direccion=" + direccion
				+ ", ubigeo=" + ubigeo + ", codpais=" + codpais + ", telefono="
				+ telefono + ", movil=" + movil + ", email=" + email
				+ ", codejecutiva=" + codejecutiva + ", observacion="
				+ observacion + ", usuario=" + usuario + ", fecha=" + fecha
				+ ", usuariomod=" + usuariomod + ", fechamod=" + fechamod
				+ ", estado=" + estado + ", contacto=" + contacto
				+ ", areacontacto=" + areacontacto + ", preorden=" + preorden
				+ ", biFecNumCam=" + biFecNumCam + ", biCodIndCam="
				+ biCodIndCam + "]";
	}
}