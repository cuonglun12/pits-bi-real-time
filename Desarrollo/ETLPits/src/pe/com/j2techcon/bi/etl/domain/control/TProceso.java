package pe.com.j2techcon.bi.etl.domain.control;

import java.util.Date;

public class TProceso {
    private Integer procId;

    private String procTip;

    private Date procFecDesde;

    private Date procFecHasta;

    private Integer procCntRegXBloque;

    private Integer procNumRegTot;

    private Integer procNumRegPro;

    private Integer procNumRegRec;

    private Date procFecIni;

    private Date procFecFin;

    private Date procFecAct;

    private String procEst;

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

    public Date getProcFecDesde() {
        return procFecDesde;
    }

    public void setProcFecDesde(Date procFecDesde) {
        this.procFecDesde = procFecDesde;
    }

    public Date getProcFecHasta() {
        return procFecHasta;
    }

    public void setProcFecHasta(Date procFecHasta) {
        this.procFecHasta = procFecHasta;
    }

    public Integer getProcCntRegXBloque() {
        return procCntRegXBloque;
    }

    public void setProcCntRegXBloque(Integer procCntRegXBloque) {
        this.procCntRegXBloque = procCntRegXBloque;
    }

    public Integer getProcNumRegTot() {
        return procNumRegTot;
    }

    public void setProcNumRegTot(Integer procNumRegTot) {
        this.procNumRegTot = procNumRegTot;
    }

    public Integer getProcNumRegPro() {
        return procNumRegPro;
    }

    public void setProcNumRegPro(Integer procNumRegPro) {
        this.procNumRegPro = procNumRegPro;
    }

    public Integer getProcNumRegRec() {
        return procNumRegRec;
    }

    public void setProcNumRegRec(Integer procNumRegRec) {
        this.procNumRegRec = procNumRegRec;
    }

    public Date getProcFecIni() {
        return procFecIni;
    }

    public void setProcFecIni(Date procFecIni) {
        this.procFecIni = procFecIni;
    }

    public Date getProcFecFin() {
        return procFecFin;
    }

    public void setProcFecFin(Date procFecFin) {
        this.procFecFin = procFecFin;
    }

    public Date getProcFecAct() {
        return procFecAct;
    }

    public void setProcFecAct(Date procFecAct) {
        this.procFecAct = procFecAct;
    }

    public String getProcEst() {
        return procEst;
    }

    public void setProcEst(String procEst) {
        this.procEst = procEst == null ? null : procEst.trim();
    }
    
    public void clear(){
    	procId=null;
    	procTip=null;
    	procFecDesde=null;
    	procFecHasta=null;
    	procCntRegXBloque=null;
    	procNumRegTot=null;
    	procNumRegPro=null;
    	procNumRegRec=null;
    	procFecIni=null;
    	procFecFin=null;
    	procFecAct=null;
    	procEst=null;
    }

	@Override
	public String toString() {
		return "TProceso [procId=" + procId + ", procTip=" + procTip
				+ ", procFecDesde=" + procFecDesde + ", procFecHasta="
				+ procFecHasta + ", procCntRegXBloque=" + procCntRegXBloque
				+ ", procNumRegTot=" + procNumRegTot + ", procNumRegPro="
				+ procNumRegPro + ", procNumRegRec=" + procNumRegRec
				+ ", procFecIni=" + procFecIni + ", procFecFin=" + procFecFin
				+ ", procFecAct=" + procFecAct + ", procEst=" + procEst + "]";
	}
}