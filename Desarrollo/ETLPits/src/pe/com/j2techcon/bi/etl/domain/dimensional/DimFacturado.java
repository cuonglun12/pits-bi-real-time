package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimFacturado {
    private Integer facturadoKey;

    private String facturadoCod;

    private String facturadoDesc;

    private Integer procId;

    public Integer getFacturadoKey() {
        return facturadoKey;
    }

    public void setFacturadoKey(Integer facturadoKey) {
        this.facturadoKey = facturadoKey;
    }

    public String getFacturadoCod() {
        return facturadoCod;
    }

    public void setFacturadoCod(String facturadoCod) {
        this.facturadoCod = facturadoCod == null ? null : facturadoCod.trim();
    }

    public String getFacturadoDesc() {
        return facturadoDesc;
    }

    public void setFacturadoDesc(String facturadoDesc) {
        this.facturadoDesc = facturadoDesc == null ? null : facturadoDesc.trim();
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	facturadoKey=null;
    	facturadoCod=null;
    	facturadoDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimFacturado [facturadoKey=" + facturadoKey + ", facturadoCod="
				+ facturadoCod + ", facturadoDesc=" + facturadoDesc
				+ ", procId=" + procId + "]";
	}
}