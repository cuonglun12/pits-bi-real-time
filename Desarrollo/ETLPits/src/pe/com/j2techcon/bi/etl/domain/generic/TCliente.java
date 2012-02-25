package pe.com.j2techcon.bi.etl.domain.generic;

public class TCliente {
    private Integer cliId;

    private Integer cliCodTip;

    private Integer cliCodCat;

    private Integer cliCodTipDoc;

    private String cliNumTipDoc;

    private String cliDesRazSoc;

    private String cliDesApePat;

    private String cliDesApeMat;

    private String cliDesNom;

    private Integer cliCodTipFac;

    private Integer cliCodTipCre;

    private Integer ubiId;

    private String cliCod;

    private String cliNumTel;

    private String cliDesCor;

    private String cliDesDir;

    private Integer fecNumCam;

    private String codIndCam;

    public Integer getCliId() {
        return cliId;
    }

    public void setCliId(Integer cliId) {
        this.cliId = cliId;
    }

    public Integer getCliCodTip() {
        return cliCodTip;
    }

    public void setCliCodTip(Integer cliCodTip) {
        this.cliCodTip = cliCodTip;
    }

    public Integer getCliCodCat() {
        return cliCodCat;
    }

    public void setCliCodCat(Integer cliCodCat) {
        this.cliCodCat = cliCodCat;
    }

    public Integer getCliCodTipDoc() {
        return cliCodTipDoc;
    }

    public void setCliCodTipDoc(Integer cliCodTipDoc) {
        this.cliCodTipDoc = cliCodTipDoc;
    }

    public String getCliNumTipDoc() {
        return cliNumTipDoc;
    }

    public void setCliNumTipDoc(String cliNumTipDoc) {
        this.cliNumTipDoc = cliNumTipDoc == null ? null : cliNumTipDoc.trim();
    }

    public String getCliDesRazSoc() {
        return cliDesRazSoc;
    }

    public void setCliDesRazSoc(String cliDesRazSoc) {
        this.cliDesRazSoc = cliDesRazSoc == null ? null : cliDesRazSoc.trim();
    }

    public String getCliDesApePat() {
        return cliDesApePat;
    }

    public void setCliDesApePat(String cliDesApePat) {
        this.cliDesApePat = cliDesApePat == null ? null : cliDesApePat.trim();
    }

    public String getCliDesApeMat() {
        return cliDesApeMat;
    }

    public void setCliDesApeMat(String cliDesApeMat) {
        this.cliDesApeMat = cliDesApeMat == null ? null : cliDesApeMat.trim();
    }

    public String getCliDesNom() {
        return cliDesNom;
    }

    public void setCliDesNom(String cliDesNom) {
        this.cliDesNom = cliDesNom == null ? null : cliDesNom.trim();
    }

    public Integer getCliCodTipFac() {
        return cliCodTipFac;
    }

    public void setCliCodTipFac(Integer cliCodTipFac) {
        this.cliCodTipFac = cliCodTipFac;
    }

    public Integer getCliCodTipCre() {
        return cliCodTipCre;
    }

    public void setCliCodTipCre(Integer cliCodTipCre) {
        this.cliCodTipCre = cliCodTipCre;
    }

    public Integer getUbiId() {
        return ubiId;
    }

    public void setUbiId(Integer ubiId) {
        this.ubiId = ubiId;
    }

    public String getCliCod() {
        return cliCod;
    }

    public void setCliCod(String cliCod) {
        this.cliCod = cliCod == null ? null : cliCod.trim();
    }

    public String getCliNumTel() {
        return cliNumTel;
    }

    public void setCliNumTel(String cliNumTel) {
        this.cliNumTel = cliNumTel == null ? null : cliNumTel.trim();
    }

    public String getCliDesCor() {
        return cliDesCor;
    }

    public void setCliDesCor(String cliDesCor) {
        this.cliDesCor = cliDesCor == null ? null : cliDesCor.trim();
    }

    public String getCliDesDir() {
        return cliDesDir;
    }

    public void setCliDesDir(String cliDesDir) {
        this.cliDesDir = cliDesDir == null ? null : cliDesDir.trim();
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
		return "TCliente [cliId=" + cliId + ", cliCodTip=" + cliCodTip
				+ ", cliCodCat=" + cliCodCat + ", cliCodTipDoc=" + cliCodTipDoc
				+ ", cliNumTipDoc=" + cliNumTipDoc + ", cliDesRazSoc="
				+ cliDesRazSoc + ", cliDesApePat=" + cliDesApePat
				+ ", cliDesApeMat=" + cliDesApeMat + ", cliDesNom=" + cliDesNom
				+ ", cliCodTipFac=" + cliCodTipFac + ", cliCodTipCre="
				+ cliCodTipCre + ", ubiId=" + ubiId + ", cliCod=" + cliCod
				+ ", cliNumTel=" + cliNumTel + ", cliDesCor=" + cliDesCor
				+ ", cliDesDir=" + cliDesDir + ", fecNumCam=" + fecNumCam
				+ ", codIndCam=" + codIndCam + "]";
	}
}