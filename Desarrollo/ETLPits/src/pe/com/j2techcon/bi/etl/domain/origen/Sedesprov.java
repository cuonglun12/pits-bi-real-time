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
        this.codsede = codsede;
    }

    public String getNomsede() {
        return nomsede;
    }

    public void setNomsede(String nomsede) {
        this.nomsede = nomsede;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        this.aliasSede = aliasSede;
    }

    public String getIpSede() {
        return ipSede;
    }

    public void setIpSede(String ipSede) {
        this.ipSede = ipSede;
    }

    public String getNroMaqReg() {
        return nroMaqReg;
    }

    public void setNroMaqReg(String nroMaqReg) {
        this.nroMaqReg = nroMaqReg;
    }

    public String getNroAutorizacion() {
        return nroAutorizacion;
    }

    public void setNroAutorizacion(String nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
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
        this.biCodIndCam = biCodIndCam;
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