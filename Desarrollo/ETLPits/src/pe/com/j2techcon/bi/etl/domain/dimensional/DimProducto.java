package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimProducto {
    private Integer productoKey;

    private String productoCod;

    private Integer productoCodTip;

    private String productoDescTip;

    private String productoDesc;

    private Integer procId;

    public Integer getProductoKey() {
        return productoKey;
    }

    public void setProductoKey(Integer productoKey) {
        this.productoKey = productoKey;
    }

    public String getProductoCod() {
        return productoCod;
    }

    public void setProductoCod(String productoCod) {
        this.productoCod = productoCod == null ? null : productoCod.trim();
    }

    public Integer getProductoCodTip() {
        return productoCodTip;
    }

    public void setProductoCodTip(Integer productoCodTip) {
        this.productoCodTip = productoCodTip;
    }

    public String getProductoDescTip() {
        return productoDescTip;
    }

    public void setProductoDescTip(String productoDescTip) {
        this.productoDescTip = productoDescTip == null ? null : productoDescTip.trim();
    }

    public String getProductoDesc() {
        return productoDesc;
    }

    public void setProductoDesc(String productoDesc) {
        this.productoDesc = productoDesc == null ? null : productoDesc.trim();
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	productoKey=null;
    	productoCod=null;
    	productoCodTip=null;
    	productoDescTip=null;
    	productoDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimProducto [productoKey=" + productoKey + ", productoCod="
				+ productoCod + ", productoCodTip=" + productoCodTip
				+ ", productoDescTip=" + productoDescTip + ", productoDesc="
				+ productoDesc + ", procId=" + procId + "]";
	}
}