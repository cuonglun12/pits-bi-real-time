package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.Date;

public class Sedesprov {
    private String codsede;

    private String nomsede;

    private String direccion;

    private String ubigeo;

    private String ciudad;

    private String url;

    private Short estado;

    private String aliasSede;

    private String ipSede;

    private String nroMaqReg;

    private String nroAutorizacion;

    private Short tipo;

    private Short tipo1;

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getCodsede() {
        return codsede;
    }

    public void setCodsede(String codsede) {
        this.codsede = codsede == null ? null : codsede.trim();
    }

    public String getNomsede() {
        return nomsede;
    }

    public void setNomsede(String nomsede) {
        this.nomsede = nomsede == null ? null : nomsede.trim();
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad == null ? null : ciudad.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public String getAliasSede() {
        return aliasSede;
    }

    public void setAliasSede(String aliasSede) {
        this.aliasSede = aliasSede == null ? null : aliasSede.trim();
    }

    public String getIpSede() {
        return ipSede;
    }

    public void setIpSede(String ipSede) {
        this.ipSede = ipSede == null ? null : ipSede.trim();
    }

    public String getNroMaqReg() {
        return nroMaqReg;
    }

    public void setNroMaqReg(String nroMaqReg) {
        this.nroMaqReg = nroMaqReg == null ? null : nroMaqReg.trim();
    }

    public String getNroAutorizacion() {
        return nroAutorizacion;
    }

    public void setNroAutorizacion(String nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion == null ? null : nroAutorizacion.trim();
    }

    public Short getTipo() {
        return tipo;
    }

    public void setTipo(Short tipo) {
        this.tipo = tipo;
    }

    public Short getTipo1() {
        return tipo1;
    }

    public void setTipo1(Short tipo1) {
        this.tipo1 = tipo1;
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
    	codsede=null;
    	nomsede=null;
    	direccion=null;
    	ubigeo=null;
    	ciudad=null;
    	url=null;
    	estado=null;
    	aliasSede=null;
    	ipSede=null;
    	nroMaqReg=null;
    	nroAutorizacion=null;
    	tipo=null;
    	tipo1=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }

	@Override
	public String toString() {
		return "Sedesprov [codsede=" + codsede + ", nomsede=" + nomsede
				+ ", direccion=" + direccion + ", ubigeo=" + ubigeo
				+ ", ciudad=" + ciudad + ", url=" + url + ", estado=" + estado
				+ ", aliasSede=" + aliasSede + ", ipSede=" + ipSede
				+ ", nroMaqReg=" + nroMaqReg + ", nroAutorizacion="
				+ nroAutorizacion + ", tipo=" + tipo + ", tipo1=" + tipo1
				+ ", biFecNumCam=" + biFecNumCam + ", biCodIndCam="
				+ biCodIndCam + "]";
	}
}