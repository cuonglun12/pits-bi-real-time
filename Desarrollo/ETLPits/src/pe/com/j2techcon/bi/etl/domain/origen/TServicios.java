package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.Date;

public class TServicios {
    private String codservicio;

    private String servicio;

    private String codnegocio;

    private String codambito;

    private Short estado;

    private Short dias;

    private Date fecha;

    private String usuario;

    private Date fechamod;

    private String usuariomod;

    private String tiposervicio;

    private String obs;

    private BigDecimal precioPeriferia;

    private Integer codCentroCosto;

    private Short tipo1;

    private Date biFecNumCam;

    private String biCodIndCam;

    public String getCodservicio() {
        return codservicio;
    }

    public void setCodservicio(String codservicio) {
        this.codservicio = codservicio == null ? null : codservicio.trim();
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio == null ? null : servicio.trim();
    }

    public String getCodnegocio() {
        return codnegocio;
    }

    public void setCodnegocio(String codnegocio) {
        this.codnegocio = codnegocio == null ? null : codnegocio.trim();
    }

    public String getCodambito() {
        return codambito;
    }

    public void setCodambito(String codambito) {
        this.codambito = codambito == null ? null : codambito.trim();
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Short getDias() {
        return dias;
    }

    public void setDias(Short dias) {
        this.dias = dias;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario == null ? null : usuario.trim();
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

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio == null ? null : tiposervicio.trim();
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs == null ? null : obs.trim();
    }

    public BigDecimal getPrecioPeriferia() {
        return precioPeriferia;
    }

    public void setPrecioPeriferia(BigDecimal precioPeriferia) {
        this.precioPeriferia = precioPeriferia;
    }

    public Integer getCodCentroCosto() {
        return codCentroCosto;
    }

    public void setCodCentroCosto(Integer codCentroCosto) {
        this.codCentroCosto = codCentroCosto;
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
    	codservicio=null;
    	servicio=null;
    	codnegocio=null;
    	codambito=null;
    	estado=null;
    	dias=null;
    	fecha=null;
    	usuario=null;
    	fechamod=null;
    	usuariomod=null;
    	tiposervicio=null;
    	obs=null;
    	precioPeriferia=null;
    	codCentroCosto=null;
    	tipo1=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }

	@Override
	public String toString() {
		return "TServicios [codservicio=" + codservicio + ", servicio="
				+ servicio + ", codnegocio=" + codnegocio + ", codambito="
				+ codambito + ", estado=" + estado + ", dias=" + dias
				+ ", fecha=" + fecha + ", usuario=" + usuario + ", fechamod="
				+ fechamod + ", usuariomod=" + usuariomod + ", tiposervicio="
				+ tiposervicio + ", obs=" + obs + ", precioPeriferia="
				+ precioPeriferia + ", codCentroCosto=" + codCentroCosto
				+ ", tipo1=" + tipo1 + ", biFecNumCam=" + biFecNumCam
				+ ", biCodIndCam=" + biCodIndCam + "]";
	}
}