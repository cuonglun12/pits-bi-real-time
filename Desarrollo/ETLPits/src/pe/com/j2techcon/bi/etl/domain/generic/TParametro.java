package pe.com.j2techcon.bi.etl.domain.generic;

public class TParametro {
    private Integer paramId;

    private Integer paramCodTip;

    private String paramCod;

    private String paramDes;

    private Integer paramRef;

    private Integer fecNumCam;

    private String codIndCam;

    public Integer getParamId() {
        return paramId;
    }

    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public Integer getParamCodTip() {
        return paramCodTip;
    }

    public void setParamCodTip(Integer paramCodTip) {
        this.paramCodTip = paramCodTip;
    }

    public String getParamCod() {
        return paramCod;
    }

    public void setParamCod(String paramCod) {
        this.paramCod = paramCod == null ? null : paramCod.trim();
    }

    public String getParamDes() {
        return paramDes;
    }

    public void setParamDes(String paramDes) {
        this.paramDes = paramDes == null ? null : paramDes.trim();
    }

    public Integer getParamRef() {
        return paramRef;
    }

    public void setParamRef(Integer paramRef) {
        this.paramRef = paramRef;
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
		return "TParametro [paramId=" + paramId + ", paramCodTip="
				+ paramCodTip + ", paramCod=" + paramCod + ", paramDes="
				+ paramDes + ", paramRef=" + paramRef + ", fecNumCam="
				+ fecNumCam + ", codIndCam=" + codIndCam + "]";
	}
}