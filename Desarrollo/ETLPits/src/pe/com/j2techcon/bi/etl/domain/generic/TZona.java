package pe.com.j2techcon.bi.etl.domain.generic;

public class TZona {
    private Integer zonId;

    private String zonCod;

    private Integer ubiId;

    private String zonDes;

    private String zonCodPostal;

    private String codIndCam;

    private Integer fecNumCam;

    private Integer procId;

    public Integer getZonId() {
        return zonId;
    }

    public void setZonId(Integer zonId) {
        this.zonId = zonId;
    }

    public String getZonCod() {
        return zonCod;
    }

    public void setZonCod(String zonCod) {
        this.zonCod = zonCod == null ? null : zonCod.trim();
    }

    public Integer getUbiId() {
        return ubiId;
    }

    public void setUbiId(Integer ubiId) {
        this.ubiId = ubiId;
    }

    public String getZonDes() {
        return zonDes;
    }

    public void setZonDes(String zonDes) {
        this.zonDes = zonDes == null ? null : zonDes.trim();
    }

    public String getZonCodPostal() {
        return zonCodPostal;
    }

    public void setZonCodPostal(String zonCodPostal) {
        this.zonCodPostal = zonCodPostal == null ? null : zonCodPostal.trim();
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
		return "TZona [zonId=" + zonId + ", zonCod=" + zonCod + ", ubiId="
				+ ubiId + ", zonDes=" + zonDes + ", zonCodPostal="
				+ zonCodPostal + ", codIndCam=" + codIndCam + ", fecNumCam="
				+ fecNumCam + ", procId=" + procId + "]";
	}
}