package pe.com.j2techcon.bi.etl.domain.generic;

public class TEmpleadoCategoria {
    private Integer empCatId;

    private Integer empId;

    private Integer empCatCodTip;

    private String empCatCod;

    private Integer fecNumCam;

    private String codIndCam;

    private Integer procId;

    public Integer getEmpCatId() {
        return empCatId;
    }

    public void setEmpCatId(Integer empCatId) {
        this.empCatId = empCatId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpCatCodTip() {
        return empCatCodTip;
    }

    public void setEmpCatCodTip(Integer empCatCodTip) {
        this.empCatCodTip = empCatCodTip;
    }

    public String getEmpCatCod() {
        return empCatCod;
    }

    public void setEmpCatCod(String empCatCod) {
        this.empCatCod = empCatCod == null ? null : empCatCod.trim();
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
		return "TEmpleadoCategoria [empCatId=" + empCatId + ", empId=" + empId
				+ ", empCatCodTip=" + empCatCodTip + ", empCatCod=" + empCatCod
				+ ", fecNumCam=" + fecNumCam + ", codIndCam=" + codIndCam
				+ ", procId=" + procId + "]";
	}
}