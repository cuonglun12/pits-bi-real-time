package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoDocumento {
    private Integer tipoDocumentoKey;

    private String tipoDocumentoCod;

    private String tipoDocumentoDesc;

    private String codIndCam;

    private Integer fecNumCam;

    public Integer getTipoDocumentoKey() {
        return tipoDocumentoKey;
    }

    public void setTipoDocumentoKey(Integer tipoDocumentoKey) {
        this.tipoDocumentoKey = tipoDocumentoKey;
    }

    public String getTipoDocumentoCod() {
        return tipoDocumentoCod;
    }

    public void setTipoDocumentoCod(String tipoDocumentoCod) {
        this.tipoDocumentoCod = tipoDocumentoCod == null ? null : tipoDocumentoCod.trim();
    }

    public String getTipoDocumentoDesc() {
        return tipoDocumentoDesc;
    }

    public void setTipoDocumentoDesc(String tipoDocumentoDesc) {
        this.tipoDocumentoDesc = tipoDocumentoDesc == null ? null : tipoDocumentoDesc.trim();
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
		return "DimTipoDocumento [tipoDocumentoKey=" + tipoDocumentoKey
				+ ", tipoDocumentoCod=" + tipoDocumentoCod
				+ ", tipoDocumentoDesc=" + tipoDocumentoDesc + ", codIndCam="
				+ codIndCam + ", fecNumCam=" + fecNumCam + "]";
	}
}