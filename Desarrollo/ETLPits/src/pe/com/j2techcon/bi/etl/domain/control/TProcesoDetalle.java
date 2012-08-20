package pe.com.j2techcon.bi.etl.domain.control;

import java.util.Date;

public class TProcesoDetalle {
    private Integer procDetId;

    private Integer procId;

    private String procTip;

    private Integer procDetIdTable;

    private Date procDetFecDesde;

    private Date procDetFecHasta;

    private Integer procDetNumRegTot;

    private Integer procDetNumRegPro;

    private Integer procDetNumRegRec;

    private Date procDetFecIni;

    private Date procDetFecFin;

    private Date procDetFecAct;

    private String procDetEst;

    public Integer getProcDetId() {
        return procDetId;
    }

    public void setProcDetId(Integer procDetId) {
        this.procDetId = procDetId;
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }

    public String getProcTip() {
        return procTip;
    }

    public void setProcTip(String procTip) {
        this.procTip = procTip == null ? null : procTip.trim();
    }

    public Integer getProcDetIdTable() {
        return procDetIdTable;
    }

    public void setProcDetIdTable(Integer procDetIdTable) {
        this.procDetIdTable = procDetIdTable;
    }

    public Date getProcDetFecDesde() {
        return procDetFecDesde;
    }

    public void setProcDetFecDesde(Date procDetFecDesde) {
        this.procDetFecDesde = procDetFecDesde;
    }

    public Date getProcDetFecHasta() {
        return procDetFecHasta;
    }

    public void setProcDetFecHasta(Date procDetFecHasta) {
        this.procDetFecHasta = procDetFecHasta;
    }

    public Integer getProcDetNumRegTot() {
        return procDetNumRegTot;
    }

    public void setProcDetNumRegTot(Integer procDetNumRegTot) {
        this.procDetNumRegTot = procDetNumRegTot;
    }

    public Integer getProcDetNumRegPro() {
        return procDetNumRegPro;
    }

    public void setProcDetNumRegPro(Integer procDetNumRegPro) {
        this.procDetNumRegPro = procDetNumRegPro;
    }

    public Integer getProcDetNumRegRec() {
        return procDetNumRegRec;
    }

    public void setProcDetNumRegRec(Integer procDetNumRegRec) {
        this.procDetNumRegRec = procDetNumRegRec;
    }

    public Date getProcDetFecIni() {
        return procDetFecIni;
    }

    public void setProcDetFecIni(Date procDetFecIni) {
        this.procDetFecIni = procDetFecIni;
    }

    public Date getProcDetFecFin() {
        return procDetFecFin;
    }

    public void setProcDetFecFin(Date procDetFecFin) {
        this.procDetFecFin = procDetFecFin;
    }

    public Date getProcDetFecAct() {
        return procDetFecAct;
    }

    public void setProcDetFecAct(Date procDetFecAct) {
        this.procDetFecAct = procDetFecAct;
    }

    public String getProcDetEst() {
        return procDetEst;
    }

    public void setProcDetEst(String procDetEst) {
        this.procDetEst = procDetEst == null ? null : procDetEst.trim();
    }
    
    public void clear(){
        procDetId = null;
        procId = null;
        procTip = null;
        procDetIdTable = null;
        procDetFecDesde = null;
        procDetFecHasta = null;
        procDetNumRegTot = null;
        procDetNumRegPro = null;
        procDetNumRegRec = null;
        procDetFecIni = null;
        procDetFecFin = null;
        procDetFecAct = null;
        procDetEst = null;
    }

	@Override
	public String toString() {
		return "TProcesoDetalle [procDetId=" + procDetId + ", procId=" + procId
				+ ", procTip=" + procTip + ", procDetIdTable=" + procDetIdTable
				+ ", procDetFecDesde=" + procDetFecDesde + ", procDetFecHasta="
				+ procDetFecHasta + ", procDetNumRegTot=" + procDetNumRegTot
				+ ", procDetNumRegPro=" + procDetNumRegPro
				+ ", procDetNumRegRec=" + procDetNumRegRec + ", procDetFecIni="
				+ procDetFecIni + ", procDetFecFin=" + procDetFecFin
				+ ", procDetFecAct=" + procDetFecAct + ", procDetEst="
				+ procDetEst + "]";
	}
}