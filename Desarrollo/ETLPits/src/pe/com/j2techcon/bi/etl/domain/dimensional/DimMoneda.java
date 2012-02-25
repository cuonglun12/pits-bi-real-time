package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimMoneda {
    private Integer monedaKey;

    private String monedaCod;

    private String monedaDesc;

    private String codIndCam;

    private Integer fecNumCam;

    public Integer getMonedaKey() {
        return monedaKey;
    }

    public void setMonedaKey(Integer monedaKey) {
        this.monedaKey = monedaKey;
    }

    public String getMonedaCod() {
        return monedaCod;
    }

    public void setMonedaCod(String monedaCod) {
        this.monedaCod = monedaCod == null ? null : monedaCod.trim();
    }

    public String getMonedaDesc() {
        return monedaDesc;
    }

    public void setMonedaDesc(String monedaDesc) {
        this.monedaDesc = monedaDesc == null ? null : monedaDesc.trim();
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
		return "DimMoneda [monedaKey=" + monedaKey + ", monedaCod=" + monedaCod
				+ ", monedaDesc=" + monedaDesc + ", codIndCam=" + codIndCam
				+ ", fecNumCam=" + fecNumCam + "]";
	}
    
    
}