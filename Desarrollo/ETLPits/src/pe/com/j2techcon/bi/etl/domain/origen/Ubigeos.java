package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.Date;

public class Ubigeos {
    private String ubigeo;

    private String coddepa;

    private String codprov;

    private String codpos;

    private String departamento;

    private String provincia;

    private String distrito;

    private String nombre;

    private Short flagprov;

    private String codpostal;

    private String codzona;

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getCoddepa() {
        return coddepa;
    }

    public void setCoddepa(String coddepa) {
        this.coddepa = coddepa;
    }

    public String getCodprov() {
        return codprov;
    }

    public void setCodprov(String codprov) {
        this.codprov = codprov;
    }

    public String getCodpos() {
        return codpos;
    }

    public void setCodpos(String codpos) {
        this.codpos = codpos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getFlagprov() {
        return flagprov;
    }

    public void setFlagprov(Short flagprov) {
        this.flagprov = flagprov;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona;
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
    	ubigeo=null;
    	coddepa=null;
    	codprov=null;
    	codpos=null;
    	departamento=null;
    	provincia=null;
    	distrito=null;
    	nombre=null;
    	flagprov=null;
    	codpostal=null;
    	codzona=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }

	@Override
	public String toString() {
		return "Ubigeos [ubigeo=" + ubigeo + ", coddepa=" + coddepa
				+ ", codprov=" + codprov + ", codpos=" + codpos
				+ ", departamento=" + departamento + ", provincia=" + provincia
				+ ", distrito=" + distrito + ", nombre=" + nombre
				+ ", flagprov=" + flagprov + ", codpostal=" + codpostal
				+ ", codzona=" + codzona + ", biFecNumCam=" + biFecNumCam
				+ ", biCodIndCam=" + biCodIndCam + "]";
	}
}