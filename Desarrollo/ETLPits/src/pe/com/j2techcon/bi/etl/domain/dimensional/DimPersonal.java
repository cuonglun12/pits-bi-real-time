package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimPersonal {
    private Integer personalKey;

    private String personalCodigo;

    private Integer personalCodigoCategoria;

    private String personalDescripcionCategoria;

    private String personalNombre;

    private String personalSexo;

    private String codIndCam;

    private Integer fecNumCam;

    public Integer getPersonalKey() {
        return personalKey;
    }

    public void setPersonalKey(Integer personalKey) {
        this.personalKey = personalKey;
    }

    public String getPersonalCodigo() {
        return personalCodigo;
    }

    public void setPersonalCodigo(String personalCodigo) {
        this.personalCodigo = personalCodigo == null ? null : personalCodigo.trim();
    }

    public Integer getPersonalCodigoCategoria() {
        return personalCodigoCategoria;
    }

    public void setPersonalCodigoCategoria(Integer personalCodigoCategoria) {
        this.personalCodigoCategoria = personalCodigoCategoria;
    }

    public String getPersonalDescripcionCategoria() {
        return personalDescripcionCategoria;
    }

    public void setPersonalDescripcionCategoria(String personalDescripcionCategoria) {
        this.personalDescripcionCategoria = personalDescripcionCategoria == null ? null : personalDescripcionCategoria.trim();
    }

    public String getPersonalNombre() {
        return personalNombre;
    }

    public void setPersonalNombre(String personalNombre) {
        this.personalNombre = personalNombre == null ? null : personalNombre.trim();
    }

    public String getPersonalSexo() {
        return personalSexo;
    }

    public void setPersonalSexo(String personalSexo) {
        this.personalSexo = personalSexo == null ? null : personalSexo.trim();
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
		return "DimPersonal [personalKey=" + personalKey + ", personalCodigo="
				+ personalCodigo + ", personalCodigoCategoria="
				+ personalCodigoCategoria + ", personalDescripcionCategoria="
				+ personalDescripcionCategoria + ", personalNombre="
				+ personalNombre + ", personalSexo=" + personalSexo
				+ ", codIndCam=" + codIndCam + ", fecNumCam=" + fecNumCam + "]";
	}
}