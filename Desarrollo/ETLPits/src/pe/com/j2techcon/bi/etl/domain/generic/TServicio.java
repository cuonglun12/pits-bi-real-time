package pe.com.j2techcon.bi.etl.domain.generic;

public class TServicio {
    private Integer servId;

    private String sevCod;

    private Integer servCodNeg;

    private Integer servCodAmb;

    private String servDes;

    private String codIndCam;

    private Integer fecNumCam;

    private Integer procId;

    public Integer getServId() {
        return servId;
    }

    public void setServId(Integer servId) {
        this.servId = servId;
    }

    public String getSevCod() {
        return sevCod;
    }

    public void setSevCod(String sevCod) {
        this.sevCod = sevCod == null ? null : sevCod.trim();
    }

    public Integer getServCodNeg() {
        return servCodNeg;
    }

    public void setServCodNeg(Integer servCodNeg) {
        this.servCodNeg = servCodNeg;
    }

    public Integer getServCodAmb() {
        return servCodAmb;
    }

    public void setServCodAmb(Integer servCodAmb) {
        this.servCodAmb = servCodAmb;
    }

    public String getServDes() {
        return servDes;
    }

    public void setServDes(String servDes) {
        this.servDes = servDes == null ? null : servDes.trim();
    }

    public String getCodIndCam() {
        return codIndCam;
    }

    public void setCodIndCam(String codIndCam) {
        this.codIndCam = codIndCam == null ? null : codIndCam.trim();
    }

    public Integer getFecNumCam() {
        return fecNumCam;
    }

    public void setFecNumCam(Integer fecNumCam) {
        this.fecNumCam = fecNumCam;
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
		return "TServicio [servId=" + servId + ", sevCod=" + sevCod
				+ ", servCodNeg=" + servCodNeg + ", servCodAmb=" + servCodAmb
				+ ", servDes=" + servDes + ", codIndCam=" + codIndCam
				+ ", fecNumCam=" + fecNumCam + ", procId=" + procId + "]";
	}
}