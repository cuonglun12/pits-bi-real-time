package pe.com.j2techcon.bi.etl.domain.dimensional;

public class FactEnvio {
    private Integer envioKeyClienteArea;

    private Integer envioKeyServicio;

    private Integer envioKeyProducto;

    private Integer envioKeyZona;

    private Integer envioKeyPersonal;

    private Integer envioKeyFecSal;

    private Integer envioKeyFecRetp;

    private Integer envioKeyFecRetr;

    private Integer envioKeyEstado;

    private Short envioIndUnidad;

    private Short envioIndEnt;

    private Short envioIndMot;

    private Short envioIndRee;

    private Short envioIndAnu;

    private Short envioIndFueZon;

    private Short envioIndPerd;

    private Integer procId;

    public Integer getEnvioKeyClienteArea() {
        return envioKeyClienteArea;
    }

    public void setEnvioKeyClienteArea(Integer envioKeyClienteArea) {
        this.envioKeyClienteArea = envioKeyClienteArea;
    }

    public Integer getEnvioKeyServicio() {
        return envioKeyServicio;
    }

    public void setEnvioKeyServicio(Integer envioKeyServicio) {
        this.envioKeyServicio = envioKeyServicio;
    }

    public Integer getEnvioKeyProducto() {
        return envioKeyProducto;
    }

    public void setEnvioKeyProducto(Integer envioKeyProducto) {
        this.envioKeyProducto = envioKeyProducto;
    }

    public Integer getEnvioKeyZona() {
        return envioKeyZona;
    }

    public void setEnvioKeyZona(Integer envioKeyZona) {
        this.envioKeyZona = envioKeyZona;
    }

    public Integer getEnvioKeyPersonal() {
        return envioKeyPersonal;
    }

    public void setEnvioKeyPersonal(Integer envioKeyPersonal) {
        this.envioKeyPersonal = envioKeyPersonal;
    }

    public Integer getEnvioKeyFecSal() {
        return envioKeyFecSal;
    }

    public void setEnvioKeyFecSal(Integer envioKeyFecSal) {
        this.envioKeyFecSal = envioKeyFecSal;
    }

    public Integer getEnvioKeyFecRetp() {
        return envioKeyFecRetp;
    }

    public void setEnvioKeyFecRetp(Integer envioKeyFecRetp) {
        this.envioKeyFecRetp = envioKeyFecRetp;
    }

    public Integer getEnvioKeyFecRetr() {
        return envioKeyFecRetr;
    }

    public void setEnvioKeyFecRetr(Integer envioKeyFecRetr) {
        this.envioKeyFecRetr = envioKeyFecRetr;
    }

    public Integer getEnvioKeyEstado() {
        return envioKeyEstado;
    }

    public void setEnvioKeyEstado(Integer envioKeyEstado) {
        this.envioKeyEstado = envioKeyEstado;
    }

    public Short getEnvioIndUnidad() {
        return envioIndUnidad;
    }

    public void setEnvioIndUnidad(Short envioIndUnidad) {
        this.envioIndUnidad = envioIndUnidad;
    }

    public Short getEnvioIndEnt() {
        return envioIndEnt;
    }

    public void setEnvioIndEnt(Short envioIndEnt) {
        this.envioIndEnt = envioIndEnt;
    }

    public Short getEnvioIndMot() {
        return envioIndMot;
    }

    public void setEnvioIndMot(Short envioIndMot) {
        this.envioIndMot = envioIndMot;
    }

    public Short getEnvioIndRee() {
        return envioIndRee;
    }

    public void setEnvioIndRee(Short envioIndRee) {
        this.envioIndRee = envioIndRee;
    }

    public Short getEnvioIndAnu() {
        return envioIndAnu;
    }

    public void setEnvioIndAnu(Short envioIndAnu) {
        this.envioIndAnu = envioIndAnu;
    }

    public Short getEnvioIndFueZon() {
        return envioIndFueZon;
    }

    public void setEnvioIndFueZon(Short envioIndFueZon) {
        this.envioIndFueZon = envioIndFueZon;
    }

    public Short getEnvioIndPerd() {
        return envioIndPerd;
    }

    public void setEnvioIndPerd(Short envioIndPerd) {
        this.envioIndPerd = envioIndPerd;
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	
    }

	@Override
	public String toString() {
		return "FactEnvio [envioKeyClienteArea=" + envioKeyClienteArea
				+ ", envioKeyServicio=" + envioKeyServicio
				+ ", envioKeyProducto=" + envioKeyProducto + ", envioKeyZona="
				+ envioKeyZona + ", envioKeyPersonal=" + envioKeyPersonal
				+ ", envioKeyFecSal=" + envioKeyFecSal + ", envioKeyFecRetp="
				+ envioKeyFecRetp + ", envioKeyFecRetr=" + envioKeyFecRetr
				+ ", envioKeyEstado=" + envioKeyEstado + ", envioIndUnidad="
				+ envioIndUnidad + ", envioIndEnt=" + envioIndEnt
				+ ", envioIndMot=" + envioIndMot + ", envioIndRee="
				+ envioIndRee + ", envioIndAnu=" + envioIndAnu
				+ ", envioIndFueZon=" + envioIndFueZon + ", envioIndPerd="
				+ envioIndPerd + ", procId=" + procId + "]";
	}
}