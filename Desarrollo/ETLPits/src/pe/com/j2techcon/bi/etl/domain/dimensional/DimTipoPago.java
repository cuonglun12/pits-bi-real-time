package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoPago {
    private Integer tipoPagoKey;

    private String tipoPagoCod;

    private String tipoPagoDesc;

    private Integer procId;

    public Integer getTipoPagoKey() {
        return tipoPagoKey;
    }

    public void setTipoPagoKey(Integer tipoPagoKey) {
        this.tipoPagoKey = tipoPagoKey;
    }

    public String getTipoPagoCod() {
        return tipoPagoCod;
    }

    public void setTipoPagoCod(String tipoPagoCod) {
        this.tipoPagoCod = tipoPagoCod == null ? null : tipoPagoCod.trim();
    }

    public String getTipoPagoDesc() {
        return tipoPagoDesc;
    }

    public void setTipoPagoDesc(String tipoPagoDesc) {
        this.tipoPagoDesc = tipoPagoDesc == null ? null : tipoPagoDesc.trim();
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	tipoPagoKey=null;
    	tipoPagoCod=null;
    	tipoPagoDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimTipoPago [tipoPagoKey=" + tipoPagoKey + ", tipoPagoCod="
				+ tipoPagoCod + ", tipoPagoDesc=" + tipoPagoDesc + ", procId="
				+ procId + "]";
	}
}