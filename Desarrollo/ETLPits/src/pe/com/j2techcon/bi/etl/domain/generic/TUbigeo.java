package pe.com.j2techcon.bi.etl.domain.generic;

public class TUbigeo {
    private Integer ubiId;

    private String ubiCod;

    private Integer ubiCodPais;

    private Integer ubiCodDepartamento;

    private Integer ubiCodProvincia;

    private Integer ubiCodDistrito;

    private String codIndCam;

    private Integer fecNumCam;

    public Integer getUbiId() {
        return ubiId;
    }

    public void setUbiId(Integer ubiId) {
        this.ubiId = ubiId;
    }

    public String getUbiCod() {
        return ubiCod;
    }

    public void setUbiCod(String ubiCod) {
        this.ubiCod = ubiCod == null ? null : ubiCod.trim();
    }

    public Integer getUbiCodPais() {
        return ubiCodPais;
    }

    public void setUbiCodPais(Integer ubiCodPais) {
        this.ubiCodPais = ubiCodPais;
    }

    public Integer getUbiCodDepartamento() {
        return ubiCodDepartamento;
    }

    public void setUbiCodDepartamento(Integer ubiCodDepartamento) {
        this.ubiCodDepartamento = ubiCodDepartamento;
    }

    public Integer getUbiCodProvincia() {
        return ubiCodProvincia;
    }

    public void setUbiCodProvincia(Integer ubiCodProvincia) {
        this.ubiCodProvincia = ubiCodProvincia;
    }

    public Integer getUbiCodDistrito() {
        return ubiCodDistrito;
    }

    public void setUbiCodDistrito(Integer ubiCodDistrito) {
        this.ubiCodDistrito = ubiCodDistrito;
    }

    public String getCodIndCam() {
        return codIndCam;
    }

    public void setCodIndCam(String codIndCam) {
        this.codIndCam = codIndCam == null ? null : codIndCam.trim();
    }

    public Integer getFecNumCam() {
        return fecNumCam;
    }

    public void setFecNumCam(Integer fecNumCam) {
        this.fecNumCam = fecNumCam;
    }

	@Override
	public String toString() {
		return "TUbigeo [ubiId=" + ubiId + ", ubiCod=" + ubiCod
				+ ", ubiCodPais=" + ubiCodPais + ", ubiCodDepartamento="
				+ ubiCodDepartamento + ", ubiCodProvincia=" + ubiCodProvincia
				+ ", ubiCodDistrito=" + ubiCodDistrito + ", codIndCam="
				+ codIndCam + ", fecNumCam=" + fecNumCam + "]";
	}
}