package pe.com.j2techcon.bi.etl.domain.generic;

public class TAreaCliente {
    private Integer areCliId;

    private Integer cliId;

    private Integer areCliCodTip;

    private Integer ubiId;

    private String areCliDes;

    private String areCliDesDir;

    private String areCliCod;

    private Integer fecNumCam;

    private String codIndCam;

    public Integer getAreCliId() {
        return areCliId;
    }

    public void setAreCliId(Integer areCliId) {
        this.areCliId = areCliId;
    }

    public Integer getCliId() {
        return cliId;
    }

    public void setCliId(Integer cliId) {
        this.cliId = cliId;
    }

    public Integer getAreCliCodTip() {
        return areCliCodTip;
    }

    public void setAreCliCodTip(Integer areCliCodTip) {
        this.areCliCodTip = areCliCodTip;
    }

    public Integer getUbiId() {
        return ubiId;
    }

    public void setUbiId(Integer ubiId) {
        this.ubiId = ubiId;
    }

    public String getAreCliDes() {
        return areCliDes;
    }

    public void setAreCliDes(String areCliDes) {
        this.areCliDes = areCliDes == null ? null : areCliDes.trim();
    }

    public String getAreCliDesDir() {
        return areCliDesDir;
    }

    public void setAreCliDesDir(String areCliDesDir) {
        this.areCliDesDir = areCliDesDir == null ? null : areCliDesDir.trim();
    }

    public String getAreCliCod() {
        return areCliCod;
    }

    public void setAreCliCod(String areCliCod) {
        this.areCliCod = areCliCod == null ? null : areCliCod.trim();
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

	@Override
	public String toString() {
		return "TAreaCliente [areCliId=" + areCliId + ", cliId=" + cliId
				+ ", areCliCodTip=" + areCliCodTip + ", ubiId=" + ubiId
				+ ", areCliDes=" + areCliDes + ", areCliDesDir=" + areCliDesDir
				+ ", areCliCod=" + areCliCod + ", fecNumCam=" + fecNumCam
				+ ", codIndCam=" + codIndCam + "]";
	}
}