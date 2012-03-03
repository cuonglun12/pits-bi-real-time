package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.Date;

public class TEmpleado {
    private Integer empId;

    private String empCod;

    private Integer empCodTipDoc;

    private String empNumTipDoc;

    private String empDesApePat;

    private String empDesApeMat;

    private String empDesNom;

    private Date empFecNac;

    private String empSex;

    private String codIndCam;

    private Long fecNumCam;

    private Integer procId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpCod() {
        return empCod;
    }

    public void setEmpCod(String empCod) {
        this.empCod = empCod == null ? null : empCod.trim();
    }

    public Integer getEmpCodTipDoc() {
        return empCodTipDoc;
    }

    public void setEmpCodTipDoc(Integer empCodTipDoc) {
        this.empCodTipDoc = empCodTipDoc;
    }

    public String getEmpNumTipDoc() {
        return empNumTipDoc;
    }

    public void setEmpNumTipDoc(String empNumTipDoc) {
        this.empNumTipDoc = empNumTipDoc == null ? null : empNumTipDoc.trim();
    }

    public String getEmpDesApePat() {
        return empDesApePat;
    }

    public void setEmpDesApePat(String empDesApePat) {
        this.empDesApePat = empDesApePat == null ? null : empDesApePat.trim();
    }

    public String getEmpDesApeMat() {
        return empDesApeMat;
    }

    public void setEmpDesApeMat(String empDesApeMat) {
        this.empDesApeMat = empDesApeMat == null ? null : empDesApeMat.trim();
    }

    public String getEmpDesNom() {
        return empDesNom;
    }

    public void setEmpDesNom(String empDesNom) {
        this.empDesNom = empDesNom == null ? null : empDesNom.trim();
    }

    public Date getEmpFecNac() {
        return empFecNac;
    }

    public void setEmpFecNac(Date empFecNac) {
        this.empFecNac = empFecNac;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public String getCodIndCam() {
        return codIndCam;
    }

    public void setCodIndCam(String codIndCam) {
        this.codIndCam = codIndCam == null ? null : codIndCam.trim();
    }

    public Long getFecNumCam() {
        return fecNumCam;
    }

    public void setFecNumCam(Long fecNumCam) {
        this.fecNumCam = fecNumCam;
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	empId=null;
    	empCod=null;
    	empCodTipDoc=null;
    	empNumTipDoc=null;
    	empDesApePat=null;
    	empDesApeMat=null;
    	empDesNom=null;
    	empFecNac=null;
    	empSex=null;
    	codIndCam=null;
    	fecNumCam=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "TEmpleado [empId=" + empId + ", empCod=" + empCod
				+ ", empCodTipDoc=" + empCodTipDoc + ", empNumTipDoc="
				+ empNumTipDoc + ", empDesApePat=" + empDesApePat
				+ ", empDesApeMat=" + empDesApeMat + ", empDesNom=" + empDesNom
				+ ", empFecNac=" + empFecNac + ", empSex=" + empSex
				+ ", codIndCam=" + codIndCam + ", fecNumCam=" + fecNumCam
				+ ", procId=" + procId + "]";
	}
}