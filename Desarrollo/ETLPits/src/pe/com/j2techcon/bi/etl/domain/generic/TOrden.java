package pe.com.j2techcon.bi.etl.domain.generic;

import java.math.BigDecimal;
import java.util.Date;

public class TOrden {
    private Integer ordId;

    private Integer cotiId;

    private Integer codAreCli;

    private Integer empCatId;

    private Integer ordCodTipRep;

    private Integer servId;

    private Integer prodId;

    private Integer ordCodTipPag;

    private Integer ordCodTipIng;

    private Integer ordCodTipMon;

    private Integer ordCodTipDoc;

    private String ordSerieDoc;

    private String ordNumDoc;

    private BigDecimal ordTipCambio;

    private Integer ordCntCargos;

    private Date ordFecIni;

    private Date ordFecVen;

    private Date ordFecCie;

    private Date ordFecDev;

    private Date ordFecLiq;

    private BigDecimal ordImporte;

    private BigDecimal ordDescuento;

    private BigDecimal ordVenta;

    private BigDecimal ordIgv;

    private BigDecimal ordTotal;

    private Integer ordCodEst;

    private Integer fecNumCam;

    private String codIndCam;

    private Integer procId;

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getCotiId() {
        return cotiId;
    }

    public void setCotiId(Integer cotiId) {
        this.cotiId = cotiId;
    }

    public Integer getCodAreCli() {
        return codAreCli;
    }

    public void setCodAreCli(Integer codAreCli) {
        this.codAreCli = codAreCli;
    }

    public Integer getEmpCatId() {
        return empCatId;
    }

    public void setEmpCatId(Integer empCatId) {
        this.empCatId = empCatId;
    }

    public Integer getOrdCodTipRep() {
        return ordCodTipRep;
    }

    public void setOrdCodTipRep(Integer ordCodTipRep) {
        this.ordCodTipRep = ordCodTipRep;
    }

    public Integer getServId() {
        return servId;
    }

    public void setServId(Integer servId) {
        this.servId = servId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getOrdCodTipPag() {
        return ordCodTipPag;
    }

    public void setOrdCodTipPag(Integer ordCodTipPag) {
        this.ordCodTipPag = ordCodTipPag;
    }

    public Integer getOrdCodTipIng() {
        return ordCodTipIng;
    }

    public void setOrdCodTipIng(Integer ordCodTipIng) {
        this.ordCodTipIng = ordCodTipIng;
    }

    public Integer getOrdCodTipMon() {
        return ordCodTipMon;
    }

    public void setOrdCodTipMon(Integer ordCodTipMon) {
        this.ordCodTipMon = ordCodTipMon;
    }

    public Integer getOrdCodTipDoc() {
        return ordCodTipDoc;
    }

    public void setOrdCodTipDoc(Integer ordCodTipDoc) {
        this.ordCodTipDoc = ordCodTipDoc;
    }

    public String getOrdSerieDoc() {
        return ordSerieDoc;
    }

    public void setOrdSerieDoc(String ordSerieDoc) {
        this.ordSerieDoc = ordSerieDoc == null ? null : ordSerieDoc.trim();
    }

    public String getOrdNumDoc() {
        return ordNumDoc;
    }

    public void setOrdNumDoc(String ordNumDoc) {
        this.ordNumDoc = ordNumDoc == null ? null : ordNumDoc.trim();
    }

    public BigDecimal getOrdTipCambio() {
        return ordTipCambio;
    }

    public void setOrdTipCambio(BigDecimal ordTipCambio) {
        this.ordTipCambio = ordTipCambio;
    }

    public Integer getOrdCntCargos() {
        return ordCntCargos;
    }

    public void setOrdCntCargos(Integer ordCntCargos) {
        this.ordCntCargos = ordCntCargos;
    }

    public Date getOrdFecIni() {
        return ordFecIni;
    }

    public void setOrdFecIni(Date ordFecIni) {
        this.ordFecIni = ordFecIni;
    }

    public Date getOrdFecVen() {
        return ordFecVen;
    }

    public void setOrdFecVen(Date ordFecVen) {
        this.ordFecVen = ordFecVen;
    }

    public Date getOrdFecCie() {
        return ordFecCie;
    }

    public void setOrdFecCie(Date ordFecCie) {
        this.ordFecCie = ordFecCie;
    }

    public Date getOrdFecDev() {
        return ordFecDev;
    }

    public void setOrdFecDev(Date ordFecDev) {
        this.ordFecDev = ordFecDev;
    }

    public Date getOrdFecLiq() {
        return ordFecLiq;
    }

    public void setOrdFecLiq(Date ordFecLiq) {
        this.ordFecLiq = ordFecLiq;
    }

    public BigDecimal getOrdImporte() {
        return ordImporte;
    }

    public void setOrdImporte(BigDecimal ordImporte) {
        this.ordImporte = ordImporte;
    }

    public BigDecimal getOrdDescuento() {
        return ordDescuento;
    }

    public void setOrdDescuento(BigDecimal ordDescuento) {
        this.ordDescuento = ordDescuento;
    }

    public BigDecimal getOrdVenta() {
        return ordVenta;
    }

    public void setOrdVenta(BigDecimal ordVenta) {
        this.ordVenta = ordVenta;
    }

    public BigDecimal getOrdIgv() {
        return ordIgv;
    }

    public void setOrdIgv(BigDecimal ordIgv) {
        this.ordIgv = ordIgv;
    }

    public BigDecimal getOrdTotal() {
        return ordTotal;
    }

    public void setOrdTotal(BigDecimal ordTotal) {
        this.ordTotal = ordTotal;
    }

    public Integer getOrdCodEst() {
        return ordCodEst;
    }

    public void setOrdCodEst(Integer ordCodEst) {
        this.ordCodEst = ordCodEst;
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
    	
    }

	@Override
	public String toString() {
		return "TOrden [ordId=" + ordId + ", cotiId=" + cotiId + ", codAreCli="
				+ codAreCli + ", empCatId=" + empCatId + ", ordCodTipRep="
				+ ordCodTipRep + ", servId=" + servId + ", prodId=" + prodId
				+ ", ordCodTipPag=" + ordCodTipPag + ", ordCodTipIng="
				+ ordCodTipIng + ", ordCodTipMon=" + ordCodTipMon
				+ ", ordCodTipDoc=" + ordCodTipDoc + ", ordSerieDoc="
				+ ordSerieDoc + ", ordNumDoc=" + ordNumDoc + ", ordTipCambio="
				+ ordTipCambio + ", ordCntCargos=" + ordCntCargos
				+ ", ordFecIni=" + ordFecIni + ", ordFecVen=" + ordFecVen
				+ ", ordFecCie=" + ordFecCie + ", ordFecDev=" + ordFecDev
				+ ", ordFecLiq=" + ordFecLiq + ", ordImporte=" + ordImporte
				+ ", ordDescuento=" + ordDescuento + ", ordVenta=" + ordVenta
				+ ", ordIgv=" + ordIgv + ", ordTotal=" + ordTotal
				+ ", ordCodEst=" + ordCodEst + ", fecNumCam=" + fecNumCam
				+ ", codIndCam=" + codIndCam + ", procId=" + procId + "]";
	}
}