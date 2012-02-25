package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimProducto {
    private Integer productoKey;

    private String productoCod;

    private Integer productoCodTip;

    private String productoDescTip;

    private String productoDesc;

    private Integer fecNumCam;

    private String codIndCam;

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

    public Integer getFecNumCam() {
        return fecNumCam;
    }

    public void setFecNumCam(Integer fecNumCam) {
        this.fecNumCam = fecNumCam;
    }

    public String getCodIndCam() {
        return codIndCam;
    }

    public void setCodIndCam(String codIndCam) {
        this.codIndCam = codIndCam == null ? null : codIndCam.trim();
    }

	@Override
	public String toString() {
		return "DimProducto [productoKey=" + productoKey + ", productoCod="
				+ productoCod + ", productoCodTip=" + productoCodTip
				+ ", productoDescTip=" + productoDescTip + ", productoDesc="
				+ productoDesc + ", fecNumCam=" + fecNumCam + ", codIndCam="
				+ codIndCam + "]";
	}
}