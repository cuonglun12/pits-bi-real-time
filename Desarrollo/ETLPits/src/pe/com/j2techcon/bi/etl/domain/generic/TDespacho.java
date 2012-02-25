package pe.com.j2techcon.bi.etl.domain.generic;

import java.math.BigDecimal;
import java.util.Date;

public class TDespacho {
    private Integer despId;

    private Integer despCodTipDoc;

    private String despSerieDoc;

    private String despNumeroDoc;

    private Integer sedId;

    private Integer zonId;

    private Integer empCatId;

    private Integer despCodTip;

    private Integer despCodTipRut;

    private Integer despCodVer;

    private BigDecimal despMonPasaje;

    private Integer despCntCargos;

    private Date despFecSal;

    private Date despFecRetPro;

    private Date despFecRetRea;

    private Date despFecVer;

    private BigDecimal despCanPas;

    private Integer despCodEst;

    private Integer fecNumCam;

    private String codIndCam;

    public Integer getDespId() {
        return despId;
    }

    public void setDespId(Integer despId) {
        this.despId = despId;
    }

    public Integer getDespCodTipDoc() {
        return despCodTipDoc;
    }

    public void setDespCodTipDoc(Integer despCodTipDoc) {
        this.despCodTipDoc = despCodTipDoc;
    }

    public String getDespSerieDoc() {
        return despSerieDoc;
    }

    public void setDespSerieDoc(String despSerieDoc) {
        this.despSerieDoc = despSerieDoc == null ? null : despSerieDoc.trim();
    }

    public String getDespNumeroDoc() {
        return despNumeroDoc;
    }

    public void setDespNumeroDoc(String despNumeroDoc) {
        this.despNumeroDoc = despNumeroDoc == null ? null : despNumeroDoc.trim();
    }

    public Integer getSedId() {
        return sedId;
    }

    public void setSedId(Integer sedId) {
        this.sedId = sedId;
    }

    public Integer getZonId() {
        return zonId;
    }

    public void setZonId(Integer zonId) {
        this.zonId = zonId;
    }

    public Integer getEmpCatId() {
        return empCatId;
    }

    public void setEmpCatId(Integer empCatId) {
        this.empCatId = empCatId;
    }

    public Integer getDespCodTip() {
        return despCodTip;
    }

    public void setDespCodTip(Integer despCodTip) {
        this.despCodTip = despCodTip;
    }

    public Integer getDespCodTipRut() {
        return despCodTipRut;
    }

    public void setDespCodTipRut(Integer despCodTipRut) {
        this.despCodTipRut = despCodTipRut;
    }

    public Integer getDespCodVer() {
        return despCodVer;
    }

    public void setDespCodVer(Integer despCodVer) {
        this.despCodVer = despCodVer;
    }

    public BigDecimal getDespMonPasaje() {
        return despMonPasaje;
    }

    public void setDespMonPasaje(BigDecimal despMonPasaje) {
        this.despMonPasaje = despMonPasaje;
    }

    public Integer getDespCntCargos() {
        return despCntCargos;
    }

    public void setDespCntCargos(Integer despCntCargos) {
        this.despCntCargos = despCntCargos;
    }

    public Date getDespFecSal() {
        return despFecSal;
    }

    public void setDespFecSal(Date despFecSal) {
        this.despFecSal = despFecSal;
    }

    public Date getDespFecRetPro() {
        return despFecRetPro;
    }

    public void setDespFecRetPro(Date despFecRetPro) {
        this.despFecRetPro = despFecRetPro;
    }

    public Date getDespFecRetRea() {
        return despFecRetRea;
    }

    public void setDespFecRetRea(Date despFecRetRea) {
        this.despFecRetRea = despFecRetRea;
    }

    public Date getDespFecVer() {
        return despFecVer;
    }

    public void setDespFecVer(Date despFecVer) {
        this.despFecVer = despFecVer;
    }

    public BigDecimal getDespCanPas() {
        return despCanPas;
    }

    public void setDespCanPas(BigDecimal despCanPas) {
        this.despCanPas = despCanPas;
    }

    public Integer getDespCodEst() {
        return despCodEst;
    }

    public void setDespCodEst(Integer despCodEst) {
        this.despCodEst = despCodEst;
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
		return "TDespacho [despId=" + despId + ", despCodTipDoc="
				+ despCodTipDoc + ", despSerieDoc=" + despSerieDoc
				+ ", despNumeroDoc=" + despNumeroDoc + ", sedId=" + sedId
				+ ", zonId=" + zonId + ", empCatId=" + empCatId
				+ ", despCodTip=" + despCodTip + ", despCodTipRut="
				+ despCodTipRut + ", despCodVer=" + despCodVer
				+ ", despMonPasaje=" + despMonPasaje + ", despCntCargos="
				+ despCntCargos + ", despFecSal=" + despFecSal
				+ ", despFecRetPro=" + despFecRetPro + ", despFecRetRea="
				+ despFecRetRea + ", despFecVer=" + despFecVer
				+ ", despCanPas=" + despCanPas + ", despCodEst=" + despCodEst
				+ ", fecNumCam=" + fecNumCam + ", codIndCam=" + codIndCam + "]";
	}
}