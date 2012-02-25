package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoRuta {
    private Integer tipoRutaKey;

    private String tipoRutaCod;

    private String tipoRutaDesc;

    private String codIndCam;

    private Integer fecNumCam;

    public Integer getTipoRutaKey() {
        return tipoRutaKey;
    }

    public void setTipoRutaKey(Integer tipoRutaKey) {
        this.tipoRutaKey = tipoRutaKey;
    }

    public String getTipoRutaCod() {
        return tipoRutaCod;
    }

    public void setTipoRutaCod(String tipoRutaCod) {
        this.tipoRutaCod = tipoRutaCod == null ? null : tipoRutaCod.trim();
    }

    public String getTipoRutaDesc() {
        return tipoRutaDesc;
    }

    public void setTipoRutaDesc(String tipoRutaDesc) {
        this.tipoRutaDesc = tipoRutaDesc == null ? null : tipoRutaDesc.trim();
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
		return "DimTipoRuta [tipoRutaKey=" + tipoRutaKey + ", tipoRutaCod="
				+ tipoRutaCod + ", tipoRutaDesc=" + tipoRutaDesc
				+ ", codIndCam=" + codIndCam + ", fecNumCam=" + fecNumCam + "]";
	}
}