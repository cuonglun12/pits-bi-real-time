package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.Date;

public class TCargo {
    private Integer cargId;

    private Integer cargCorr;

    private Integer ordId;

    private Integer prodId;

    private Integer zonId;

    private Integer zonIdNew;

    private Integer cargCodMov;

    private Integer cargCodTipIng;

    private Date cargCodFecDes;

    private Date cargCodFecRec;

    private String cargDestinatario;

    private String cargDir;

    private String cargRef;

    private String cargNewDir;

    private String cargNewRef;

    private Integer cargCodEst;

    private Integer fecNumCam;

    private String codIndCam;

    public Integer getCargId() {
        return cargId;
    }

    public void setCargId(Integer cargId) {
        this.cargId = cargId;
    }

    public Integer getCargCorr() {
        return cargCorr;
    }

    public void setCargCorr(Integer cargCorr) {
        this.cargCorr = cargCorr;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
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

    public Date getCargCodFecDes() {
        return cargCodFecDes;
    }

    public void setCargCodFecDes(Date cargCodFecDes) {
        this.cargCodFecDes = cargCodFecDes;
    }

    public Date getCargCodFecRec() {
        return cargCodFecRec;
    }

    public void setCargCodFecRec(Date cargCodFecRec) {
        this.cargCodFecRec = cargCodFecRec;
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
		return "TCargo [cargId=" + cargId + ", cargCorr=" + cargCorr
				+ ", ordId=" + ordId + ", prodId=" + prodId + ", zonId="
				+ zonId + ", zonIdNew=" + zonIdNew + ", cargCodMov="
				+ cargCodMov + ", cargCodTipIng=" + cargCodTipIng
				+ ", cargCodFecDes=" + cargCodFecDes + ", cargCodFecRec="
				+ cargCodFecRec + ", cargDestinatario=" + cargDestinatario
				+ ", cargDir=" + cargDir + ", cargRef=" + cargRef
				+ ", cargNewDir=" + cargNewDir + ", cargNewRef=" + cargNewRef
				+ ", cargCodEst=" + cargCodEst + ", fecNumCam=" + fecNumCam
				+ ", codIndCam=" + codIndCam + "]";
	}
}