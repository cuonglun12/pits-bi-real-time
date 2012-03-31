package pe.com.j2techcon.bi.etl.domain.dimensional;

public class FactEnvio {
    private Integer envioKey;

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

    private Short envioIndDig;

    private Short envioIndRut;

    private Short envioIndPro;

    private Short envioIndRob;

    private Integer procId;

    public Integer getEnvioKey() {
        return envioKey;
    }

    public void setEnvioKey(Integer envioKey) {
        this.envioKey = envioKey;
    }

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

    public Short getEnvioIndDig() {
        return envioIndDig;
    }

    public void setEnvioIndDig(Short envioIndDig) {
        this.envioIndDig = envioIndDig;
    }

    public Short getEnvioIndRut() {
        return envioIndRut;
    }

    public void setEnvioIndRut(Short envioIndRut) {
        this.envioIndRut = envioIndRut;
    }

    public Short getEnvioIndPro() {
        return envioIndPro;
    }

    public void setEnvioIndPro(Short envioIndPro) {
        this.envioIndPro = envioIndPro;
    }

    public Short getEnvioIndRob() {
        return envioIndRob;
    }

    public void setEnvioIndRob(Short envioIndRob) {
        this.envioIndRob = envioIndRob;
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	envioKey=null;
    	envioKeyClienteArea=null;
    	envioKeyServicio=null;
    	envioKeyProducto=null;
    	envioKeyZona=null;
    	envioKeyPersonal=null;
    	envioKeyFecSal=null;
    	envioKeyFecRetp=null;
    	envioKeyFecRetr=null;
    	envioKeyEstado=null;
    	envioIndUnidad=null;
    	envioIndEnt=null;
    	envioIndMot=null;
    	envioIndRee=null;
    	envioIndAnu=null;
    	envioIndFueZon=null;
    	envioIndPerd=null;
    	envioIndDig=null;
    	envioIndRut=null;
    	envioIndPro=null;
    	envioIndRob=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "FactEnvio [envioKey=" + envioKey + ", envioKeyClienteArea="
				+ envioKeyClienteArea + ", envioKeyServicio="
				+ envioKeyServicio + ", envioKeyProducto=" + envioKeyProducto
				+ ", envioKeyZona=" + envioKeyZona + ", envioKeyPersonal="
				+ envioKeyPersonal + ", envioKeyFecSal=" + envioKeyFecSal
				+ ", envioKeyFecRetp=" + envioKeyFecRetp + ", envioKeyFecRetr="
				+ envioKeyFecRetr + ", envioKeyEstado=" + envioKeyEstado
				+ ", envioIndUnidad=" + envioIndUnidad + ", envioIndEnt="
				+ envioIndEnt + ", envioIndMot=" + envioIndMot
				+ ", envioIndRee=" + envioIndRee + ", envioIndAnu="
				+ envioIndAnu + ", envioIndFueZon=" + envioIndFueZon
				+ ", envioIndPerd=" + envioIndPerd + ", envioIndDig="
				+ envioIndDig + ", envioIndRut=" + envioIndRut
				+ ", envioIndPro=" + envioIndPro + ", envioIndRob="
				+ envioIndRob + ", procId=" + procId + "]";
	}
}