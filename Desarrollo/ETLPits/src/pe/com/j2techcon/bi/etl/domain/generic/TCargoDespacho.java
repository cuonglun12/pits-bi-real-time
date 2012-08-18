package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.Date;

public class TCargoDespacho {
    private Integer carDespId;

    private Integer despId;

    private Integer cargId;

    private Integer despCodTipDoc;

    private String despSerieDoc;

    private String despNumeroDoc;

    private Integer ordCodTipDoc;

    private String ordSerieDoc;

    private String ordNumDoc;

    private Integer cargCorr;

    private Integer zonId;

    private Integer carDespCodMov;

    private Integer carDespCodVer;

    private String carDespDir;

    private String carDespRef;

    private Date carDespFecSal;

    private Date carDespFecRetPro;

    private Date carDespFecRetRea;

    private Date carDespFecVer;

    private Integer carDespCodEst;

    private Long fecNumCam;

    private String codIndCam;

    private Integer procId;

    public Integer getCarDespId() {
        return carDespId;
    }

    public void setCarDespId(Integer carDespId) {
        this.carDespId = carDespId;
    }

    public Integer getDespId() {
        return despId;
    }

    public void setDespId(Integer despId) {
        this.despId = despId;
    }

    public Integer getCargId() {
        return cargId;
    }

    public void setCargId(Integer cargId) {
        this.cargId = cargId;
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

    public Integer getCargCorr() {
        return cargCorr;
    }

    public void setCargCorr(Integer cargCorr) {
        this.cargCorr = cargCorr;
    }

    public Integer getZonId() {
        return zonId;
    }

    public void setZonId(Integer zonId) {
        this.zonId = zonId;
    }

    public Integer getCarDespCodMov() {
        return carDespCodMov;
    }

    public void setCarDespCodMov(Integer carDespCodMov) {
        this.carDespCodMov = carDespCodMov;
    }

    public Integer getCarDespCodVer() {
        return carDespCodVer;
    }

    public void setCarDespCodVer(Integer carDespCodVer) {
        this.carDespCodVer = carDespCodVer;
    }

    public String getCarDespDir() {
        return carDespDir;
    }

    public void setCarDespDir(String carDespDir) {
        this.carDespDir = carDespDir == null ? null : carDespDir.trim();
    }

    public String getCarDespRef() {
        return carDespRef;
    }

    public void setCarDespRef(String carDespRef) {
        this.carDespRef = carDespRef == null ? null : carDespRef.trim();
    }

    public Date getCarDespFecSal() {
        return carDespFecSal;
    }

    public void setCarDespFecSal(Date carDespFecSal) {
        this.carDespFecSal = carDespFecSal;
    }

    public Date getCarDespFecRetPro() {
        return carDespFecRetPro;
    }

    public void setCarDespFecRetPro(Date carDespFecRetPro) {
        this.carDespFecRetPro = carDespFecRetPro;
    }

    public Date getCarDespFecRetRea() {
        return carDespFecRetRea;
    }

    public void setCarDespFecRetRea(Date carDespFecRetRea) {
        this.carDespFecRetRea = carDespFecRetRea;
    }

    public Date getCarDespFecVer() {
        return carDespFecVer;
    }

    public void setCarDespFecVer(Date carDespFecVer) {
        this.carDespFecVer = carDespFecVer;
    }

    public Integer getCarDespCodEst() {
        return carDespCodEst;
    }

    public void setCarDespCodEst(Integer carDespCodEst) {
        this.carDespCodEst = carDespCodEst;
    }

    public Long getFecNumCam() {
        return fecNumCam;
    }

    public void setFecNumCam(Long fecNumCam) {
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
    	carDespId = null;
    	despId = null;
    	cargId = null;
    	despCodTipDoc = null;
    	despSerieDoc = null;
    	despNumeroDoc = null;
    	ordCodTipDoc = null;
    	ordSerieDoc = null;
    	ordNumDoc = null;
    	cargCorr = null;
    	zonId = null;
    	carDespCodMov = null;
    	carDespCodVer = null;
    	carDespDir = null;
    	carDespRef = null;
    	carDespFecSal = null;
    	carDespFecRetPro = null;
    	carDespFecRetRea = null;
    	carDespFecVer = null;
    	carDespCodEst = null;
    	fecNumCam = null;
    	codIndCam = null;
    	procId = null;
    }

	@Override
	public String toString() {
		return "TCargoDespacho [carDespId=" + carDespId + ", despId=" + despId
				+ ", cargId=" + cargId + ", despCodTipDoc=" + despCodTipDoc
				+ ", despSerieDoc=" + despSerieDoc + ", despNumeroDoc="
				+ despNumeroDoc + ", ordCodTipDoc=" + ordCodTipDoc
				+ ", ordSerieDoc=" + ordSerieDoc + ", ordNumDoc=" + ordNumDoc
				+ ", cargCorr=" + cargCorr + ", zonId=" + zonId
				+ ", carDespCodMov=" + carDespCodMov + ", carDespCodVer="
				+ carDespCodVer + ", carDespDir=" + carDespDir
				+ ", carDespRef=" + carDespRef + ", carDespFecSal="
				+ carDespFecSal + ", carDespFecRetPro=" + carDespFecRetPro
				+ ", carDespFecRetRea=" + carDespFecRetRea + ", carDespFecVer="
				+ carDespFecVer + ", carDespCodEst=" + carDespCodEst
				+ ", fecNumCam=" + fecNumCam + ", codIndCam=" + codIndCam
				+ ", procId=" + procId + "]";
	}
    
}