package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoReparto {
    private Integer tipoRepartoKey;

    private String tipoRepartoCod;

    private String tipoRepartoDesc;

    private Integer procId;

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

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	tipoRepartoKey=null;
    	tipoRepartoCod=null;
    	tipoRepartoDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimTipoReparto [tipoRepartoKey=" + tipoRepartoKey
				+ ", tipoRepartoCod=" + tipoRepartoCod + ", tipoRepartoDesc="
				+ tipoRepartoDesc + ", procId=" + procId + "]";
	}
}