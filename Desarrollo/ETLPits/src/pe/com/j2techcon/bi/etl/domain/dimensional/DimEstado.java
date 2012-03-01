package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimEstado {
    private Integer estadoKey;

    private String estadoCodTipo;

    private String estadoDescTipo;

    private String estadoCod;

    private String estadoDesc;

    private Integer procId;

    public Integer getEstadoKey() {
        return estadoKey;
    }

    public void setEstadoKey(Integer estadoKey) {
        this.estadoKey = estadoKey;
    }

    public String getEstadoCodTipo() {
        return estadoCodTipo;
    }

    public void setEstadoCodTipo(String estadoCodTipo) {
        this.estadoCodTipo = estadoCodTipo == null ? null : estadoCodTipo.trim();
    }

    public String getEstadoDescTipo() {
        return estadoDescTipo;
    }

    public void setEstadoDescTipo(String estadoDescTipo) {
        this.estadoDescTipo = estadoDescTipo == null ? null : estadoDescTipo.trim();
    }

    public String getEstadoCod() {
        return estadoCod;
    }

    public void setEstadoCod(String estadoCod) {
        this.estadoCod = estadoCod == null ? null : estadoCod.trim();
    }

    public String getEstadoDesc() {
        return estadoDesc;
    }

    public void setEstadoDesc(String estadoDesc) {
        this.estadoDesc = estadoDesc == null ? null : estadoDesc.trim();
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	estadoKey=null;
    	estadoCodTipo=null;
    	estadoDescTipo=null;
    	estadoCod=null;
    	estadoDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimEstado [estadoKey=" + estadoKey + ", estadoCodTipo="
				+ estadoCodTipo + ", estadoDescTipo=" + estadoDescTipo
				+ ", estadoCod=" + estadoCod + ", estadoDesc=" + estadoDesc
				+ ", procId=" + procId + "]";
	}
}