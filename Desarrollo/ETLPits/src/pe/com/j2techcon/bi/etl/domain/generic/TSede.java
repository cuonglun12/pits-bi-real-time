package pe.com.j2techcon.bi.etl.domain.generic;

public class TSede {
    private Integer sedId;

    private String sedCod;

    private Integer ubiId;

    private Integer sedCodTip;

    private String sedDes;

    private Integer fecNumCam;

    private String codIndCam;

    private Integer procId;

    public Integer getSedId() {
        return sedId;
    }

    public void setSedId(Integer sedId) {
        this.sedId = sedId;
    }

    public String getSedCod() {
        return sedCod;
    }

    public void setSedCod(String sedCod) {
        this.sedCod = sedCod == null ? null : sedCod.trim();
    }

    public Integer getUbiId() {
        return ubiId;
    }

    public void setUbiId(Integer ubiId) {
        this.ubiId = ubiId;
    }

    public Integer getSedCodTip() {
        return sedCodTip;
    }

    public void setSedCodTip(Integer sedCodTip) {
        this.sedCodTip = sedCodTip;
    }

    public String getSedDes() {
        return sedDes;
    }

    public void setSedDes(String sedDes) {
        this.sedDes = sedDes == null ? null : sedDes.trim();
    }

    public Integer getFecNumCam() {
        return fecNumCam;
    }

    public void setFecNumCam(Integer fecNumCam) {
        this.fecNumCam = fecNumCam;
    }

    public String getCodIndCam() {
        return codIndCam;
    }

    public void setCodIndCam(String codIndCam) {
        this.codIndCam = codIndCam == null ? null : codIndCam.trim();
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
		return "TSede [sedId=" + sedId + ", sedCod=" + sedCod + ", ubiId="
				+ ubiId + ", sedCodTip=" + sedCodTip + ", sedDes=" + sedDes
				+ ", fecNumCam=" + fecNumCam + ", codIndCam=" + codIndCam
				+ ", procId=" + procId + "]";
	}
}