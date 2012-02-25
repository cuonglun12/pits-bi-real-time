package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.Date;

public class TCargoDespacho {
    private Integer carDespId;

    private Integer despId;

    private Integer cargId;

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

    private Integer fecNumCam;

    private String codIndCam;

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
		return "TCargoDespacho [carDespId=" + carDespId + ", despId=" + despId
				+ ", cargId=" + cargId + ", zonId=" + zonId
				+ ", carDespCodMov=" + carDespCodMov + ", carDespCodVer="
				+ carDespCodVer + ", carDespDir=" + carDespDir
				+ ", carDespRef=" + carDespRef + ", carDespFecSal="
				+ carDespFecSal + ", carDespFecRetPro=" + carDespFecRetPro
				+ ", carDespFecRetRea=" + carDespFecRetRea + ", carDespFecVer="
				+ carDespFecVer + ", carDespCodEst=" + carDespCodEst
				+ ", fecNumCam=" + fecNumCam + ", codIndCam=" + codIndCam + "]";
	}
}