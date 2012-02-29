package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimMoneda {
    private Integer monedaKey;

    private String monedaCod;

    private String monedaDesc;

    private Integer procId;

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

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	monedaKey=null;
    	monedaCod=null;
    	monedaDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimMoneda [monedaKey=" + monedaKey + ", monedaCod=" + monedaCod
				+ ", monedaDesc=" + monedaDesc + ", procId=" + procId + "]";
	}
}