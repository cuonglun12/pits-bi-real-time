package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimEstado {
    private Integer estadoKey;

    private String estadoCodTipo;

    private String estadoDescTipo;

    private String estadoCod;

    private String estadoDesc;

    private String codIndCam;

    private Integer fecNumCam;

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
		return "DimEstado [estadoKey=" + estadoKey + ", estadoCodTipo="
				+ estadoCodTipo + ", estadoDescTipo=" + estadoDescTipo
				+ ", estadoCod=" + estadoCod + ", estadoDesc=" + estadoDesc
				+ ", codIndCam=" + codIndCam + ", fecNumCam=" + fecNumCam + "]";
	}
    
    
}