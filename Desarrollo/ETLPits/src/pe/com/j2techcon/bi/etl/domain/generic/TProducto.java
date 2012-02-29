package pe.com.j2techcon.bi.etl.domain.generic;

import java.math.BigDecimal;

public class TProducto {
    private Integer prodId;

    private Integer prodCodTip;

    private Integer prodCodAmb;

    private Integer prodCodNeg;

    private String prodCod;

    private String prodDes;

    private BigDecimal prodPre;

    private Integer fecNumCam;

    private String codIndCam;

    private Integer procId;

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getProdCodTip() {
        return prodCodTip;
    }

    public void setProdCodTip(Integer prodCodTip) {
        this.prodCodTip = prodCodTip;
    }

    public Integer getProdCodAmb() {
        return prodCodAmb;
    }

    public void setProdCodAmb(Integer prodCodAmb) {
        this.prodCodAmb = prodCodAmb;
    }

    public Integer getProdCodNeg() {
        return prodCodNeg;
    }

    public void setProdCodNeg(Integer prodCodNeg) {
        this.prodCodNeg = prodCodNeg;
    }

    public String getProdCod() {
        return prodCod;
    }

    public void setProdCod(String prodCod) {
        this.prodCod = prodCod == null ? null : prodCod.trim();
    }

    public String getProdDes() {
        return prodDes;
    }

    public void setProdDes(String prodDes) {
        this.prodDes = prodDes == null ? null : prodDes.trim();
    }

    public BigDecimal getProdPre() {
        return prodPre;
    }

    public void setProdPre(BigDecimal prodPre) {
        this.prodPre = prodPre;
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

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	prodId=null;
    	prodCodTip=null;
    	prodCodAmb=null;
    	prodCodNeg=null;
    	prodCod=null;
    	prodDes=null;
    	prodPre=null;
    	fecNumCam=null;
    	codIndCam=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "TProducto [prodId=" + prodId + ", prodCodTip=" + prodCodTip
				+ ", prodCodAmb=" + prodCodAmb + ", prodCodNeg=" + prodCodNeg
				+ ", prodCod=" + prodCod + ", prodDes=" + prodDes
				+ ", prodPre=" + prodPre + ", fecNumCam=" + fecNumCam
				+ ", codIndCam=" + codIndCam + ", procId=" + procId + "]";
	}
}