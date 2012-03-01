package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.Date;

public class TCotizacion {
    private Integer cotiId;

    private Integer empCatId;

    private Integer areCliId;

    private Integer cotiCodAmb;

    private Integer cotiCodServ;

    private Integer cotiCodNeg;

    private Integer cotiCodTipDoc;

    private String cotiSerieDoc;

    private String cotiNumDoc;

    private Integer cotiCodEst;

    private Date cotiFecApro;

    private Date cotiFecIni;

    private Date cotiFecFin;

    private Integer fecNumCam;

    private String codIndCam;

    private Integer procId;

    public Integer getCotiId() {
        return cotiId;
    }

    public void setCotiId(Integer cotiId) {
        this.cotiId = cotiId;
    }

    public Integer getEmpCatId() {
        return empCatId;
    }

    public void setEmpCatId(Integer empCatId) {
        this.empCatId = empCatId;
    }

    public Integer getAreCliId() {
        return areCliId;
    }

    public void setAreCliId(Integer areCliId) {
        this.areCliId = areCliId;
    }

    public Integer getCotiCodAmb() {
        return cotiCodAmb;
    }

    public void setCotiCodAmb(Integer cotiCodAmb) {
        this.cotiCodAmb = cotiCodAmb;
    }

    public Integer getCotiCodServ() {
        return cotiCodServ;
    }

    public void setCotiCodServ(Integer cotiCodServ) {
        this.cotiCodServ = cotiCodServ;
    }

    public Integer getCotiCodNeg() {
        return cotiCodNeg;
    }

    public void setCotiCodNeg(Integer cotiCodNeg) {
        this.cotiCodNeg = cotiCodNeg;
    }

    public Integer getCotiCodTipDoc() {
        return cotiCodTipDoc;
    }

    public void setCotiCodTipDoc(Integer cotiCodTipDoc) {
        this.cotiCodTipDoc = cotiCodTipDoc;
    }

    public String getCotiSerieDoc() {
        return cotiSerieDoc;
    }

    public void setCotiSerieDoc(String cotiSerieDoc) {
        this.cotiSerieDoc = cotiSerieDoc == null ? null : cotiSerieDoc.trim();
    }

    public String getCotiNumDoc() {
        return cotiNumDoc;
    }

    public void setCotiNumDoc(String cotiNumDoc) {
        this.cotiNumDoc = cotiNumDoc == null ? null : cotiNumDoc.trim();
    }

    public Integer getCotiCodEst() {
        return cotiCodEst;
    }

    public void setCotiCodEst(Integer cotiCodEst) {
        this.cotiCodEst = cotiCodEst;
    }

    public Date getCotiFecApro() {
        return cotiFecApro;
    }

    public void setCotiFecApro(Date cotiFecApro) {
        this.cotiFecApro = cotiFecApro;
    }

    public Date getCotiFecIni() {
        return cotiFecIni;
    }

    public void setCotiFecIni(Date cotiFecIni) {
        this.cotiFecIni = cotiFecIni;
    }

    public Date getCotiFecFin() {
        return cotiFecFin;
    }

    public void setCotiFecFin(Date cotiFecFin) {
        this.cotiFecFin = cotiFecFin;
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
    	cotiId=null;
    	empCatId=null;
    	areCliId=null;
    	cotiCodAmb=null;
    	cotiCodServ=null;
    	cotiCodNeg=null;
    	cotiCodTipDoc=null;
    	cotiSerieDoc=null;
    	cotiNumDoc=null;
    	cotiCodEst=null;
    	cotiFecApro=null;
    	cotiFecIni=null;
    	cotiFecFin=null;
    	fecNumCam=null;
    	codIndCam=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "TCotizacion [cotiId=" + cotiId + ", empCatId=" + empCatId
				+ ", areCliId=" + areCliId + ", cotiCodAmb=" + cotiCodAmb
				+ ", cotiCodServ=" + cotiCodServ + ", cotiCodNeg=" + cotiCodNeg
				+ ", cotiCodTipDoc=" + cotiCodTipDoc + ", cotiSerieDoc="
				+ cotiSerieDoc + ", cotiNumDoc=" + cotiNumDoc + ", cotiCodEst="
				+ cotiCodEst + ", cotiFecApro=" + cotiFecApro + ", cotiFecIni="
				+ cotiFecIni + ", cotiFecFin=" + cotiFecFin + ", fecNumCam="
				+ fecNumCam + ", codIndCam=" + codIndCam + ", procId=" + procId
				+ "]";
	}
}