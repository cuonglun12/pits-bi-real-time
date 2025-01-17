package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.Date;

public class TCargo {
    private Integer cargId;

    private Integer ordCodTipDoc;

    private String ordSerieDoc;

    private String ordNumDoc;

    private Integer cargCorr;

    private String cargCodComp;

    private Integer ordId;

    private Integer zonId;

    private Integer zonIdNew;

    private Integer cargCodMov;

    private Integer cargCodTipIng;

    private Date cargFecDes;

    private Date cargFecRec;

    private String cargDestinatario;

    private String cargDir;

    private String cargRef;

    private String cargNewDir;

    private String cargNewRef;

    private Integer cargCodEst;

    private Long fecNumCam;

    private String codIndCam;

    private Integer procId;

    public Integer getCargId() {
        return cargId;
    }

    public void setCargId(Integer cargId) {
        this.cargId = cargId;
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

    public String getCargCodComp() {
        return cargCodComp;
    }

    public void setCargCodComp(String cargCodComp) {
        this.cargCodComp = cargCodComp == null ? null : cargCodComp.trim();
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getZonId() {
        return zonId;
    }

    public void setZonId(Integer zonId) {
        this.zonId = zonId;
    }

    public Integer getZonIdNew() {
        return zonIdNew;
    }

    public void setZonIdNew(Integer zonIdNew) {
        this.zonIdNew = zonIdNew;
    }

    public Integer getCargCodMov() {
        return cargCodMov;
    }

    public void setCargCodMov(Integer cargCodMov) {
        this.cargCodMov = cargCodMov;
    }

    public Integer getCargCodTipIng() {
        return cargCodTipIng;
    }

    public void setCargCodTipIng(Integer cargCodTipIng) {
        this.cargCodTipIng = cargCodTipIng;
    }

    public Date getCargFecDes() {
        return cargFecDes;
    }

    public void setCargFecDes(Date cargFecDes) {
        this.cargFecDes = cargFecDes;
    }

    public Date getCargFecRec() {
        return cargFecRec;
    }

    public void setCargFecRec(Date cargFecRec) {
        this.cargFecRec = cargFecRec;
    }

    public String getCargDestinatario() {
        return cargDestinatario;
    }

    public void setCargDestinatario(String cargDestinatario) {
        this.cargDestinatario = cargDestinatario == null ? null : cargDestinatario.trim();
    }

    public String getCargDir() {
        return cargDir;
    }

    public void setCargDir(String cargDir) {
        this.cargDir = cargDir == null ? null : cargDir.trim();
    }

    public String getCargRef() {
        return cargRef;
    }

    public void setCargRef(String cargRef) {
        this.cargRef = cargRef == null ? null : cargRef.trim();
    }

    public String getCargNewDir() {
        return cargNewDir;
    }

    public void setCargNewDir(String cargNewDir) {
        this.cargNewDir = cargNewDir == null ? null : cargNewDir.trim();
    }

    public String getCargNewRef() {
        return cargNewRef;
    }

    public void setCargNewRef(String cargNewRef) {
        this.cargNewRef = cargNewRef == null ? null : cargNewRef.trim();
    }

    public Integer getCargCodEst() {
        return cargCodEst;
    }

    public void setCargCodEst(Integer cargCodEst) {
        this.cargCodEst = cargCodEst;
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
	
	public void clear() {
		cargId = null;
		ordCodTipDoc = null;
		ordSerieDoc = null;
		ordNumDoc = null;
		cargCorr = null;
		cargCodComp = null;
		ordId = null;
		zonId = null;
		zonIdNew = null;
		cargCodMov = null;
		cargCodTipIng = null;
		cargFecDes = null;
		cargFecRec = null;
		cargDestinatario = null;
		cargDir = null;
		cargRef = null;
		cargNewDir = null;
		cargNewRef = null;
		cargCodEst = null;
		fecNumCam = null;
		codIndCam = null;
		procId = null;
	}
	
	@Override
	public String toString() {
		return "TCargo [cargId="
				+ cargId
				+ ", ordCodTipDoc="
				+ ordCodTipDoc
				+ ", ordSerieDoc="
				+ ordSerieDoc
				+ ", ordNumDoc="
				+ ordNumDoc
				+ ", cargCorr="
				+ cargCorr
				+ ", cargCodComp="
				+ cargCodComp
				+ ", ordId="
				+ ordId
				+ ", zonId="
				+ zonId
				+ ", zonIdNew="
				+ zonIdNew
				+ ", cargCodMov="
				+ cargCodMov
				+ ", cargCodTipIng="
				+ cargCodTipIng
				+ ", cargFecDes="
				+ cargFecDes
				+ ", cargFecRec="
				+ cargFecRec
				+ ", cargDestinatario="
				+ cargDestinatario
				+ ", cargDir="
				+ cargDir
				+ ", cargRef="
				+ cargRef
				+ ", cargNewDir="
				+ cargNewDir
				+ ", cargNewRef="
				+ cargNewRef
				+ ", cargCodEst="
				+ cargCodEst
				+ ", fecNumCam="
				+ fecNumCam
				+ ", codIndCam="
				+ codIndCam
				+ ", procId="
				+ procId
				+ "]";
	}
}