package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoReparto {
    private Integer tipoRepartoKey;

    private String tipoRepartoCod;

    private String tipoRepartoDesc;

    private String codIndCam;

    private Integer fecNumCam;

    public Integer getTipoRepartoKey() {
        return tipoRepartoKey;
    }

    public void setTipoRepartoKey(Integer tipoRepartoKey) {
        this.tipoRepartoKey = tipoRepartoKey;
    }

    public String getTipoRepartoCod() {
        return tipoRepartoCod;
    }

    public void setTipoRepartoCod(String tipoRepartoCod) {
        this.tipoRepartoCod = tipoRepartoCod == null ? null : tipoRepartoCod.trim();
    }

    public String getTipoRepartoDesc() {
        return tipoRepartoDesc;
    }

    public void setTipoRepartoDesc(String tipoRepartoDesc) {
        this.tipoRepartoDesc = tipoRepartoDesc == null ? null : tipoRepartoDesc.trim();
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

	@Override
	public String toString() {
		return "DimTipoReparto [tipoRepartoKey=" + tipoRepartoKey
				+ ", tipoRepartoCod=" + tipoRepartoCod + ", tipoRepartoDesc="
				+ tipoRepartoDesc + ", codIndCam=" + codIndCam + ", fecNumCam="
				+ fecNumCam + "]";
	}
}