package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoDocumento {
    private Integer tipoDocumentoKey;

    private String tipoDocumentoCod;

    private String tipoDocumentoDesc;

    private Integer procId;

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

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	tipoDocumentoKey=null;
    	tipoDocumentoCod=null;
    	tipoDocumentoDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimTipoDocumento [tipoDocumentoKey=" + tipoDocumentoKey
				+ ", tipoDocumentoCod=" + tipoDocumentoCod
				+ ", tipoDocumentoDesc=" + tipoDocumentoDesc + ", procId="
				+ procId + "]";
	}
}