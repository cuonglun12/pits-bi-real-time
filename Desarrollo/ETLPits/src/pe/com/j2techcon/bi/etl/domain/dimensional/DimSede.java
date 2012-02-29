package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimSede {
    private Integer sedeKey;

    private String sedeCod;

    private Integer sedeCodTipo;

    private String sedeDescTipo;

    private Integer sedeCodPais;

    private String sedeDescPais;

    private Integer sedeCodDepartamento;

    private String sedeDescDepartamento;

    private Integer sedeCodProvincia;

    private String sedeDescProvincia;

    private Integer sedeCodDistrito;

    private String sedeDescDistrito;

    private String sedeDesc;

    private Integer procId;

    public Integer getSedeKey() {
        return sedeKey;
    }

    public void setSedeKey(Integer sedeKey) {
        this.sedeKey = sedeKey;
    }

    public String getSedeCod() {
        return sedeCod;
    }

    public void setSedeCod(String sedeCod) {
        this.sedeCod = sedeCod == null ? null : sedeCod.trim();
    }

    public Integer getSedeCodTipo() {
        return sedeCodTipo;
    }

    public void setSedeCodTipo(Integer sedeCodTipo) {
        this.sedeCodTipo = sedeCodTipo;
    }

    public String getSedeDescTipo() {
        return sedeDescTipo;
    }

    public void setSedeDescTipo(String sedeDescTipo) {
        this.sedeDescTipo = sedeDescTipo == null ? null : sedeDescTipo.trim();
    }

    public Integer getSedeCodPais() {
        return sedeCodPais;
    }

    public void setSedeCodPais(Integer sedeCodPais) {
        this.sedeCodPais = sedeCodPais;
    }

    public String getSedeDescPais() {
        return sedeDescPais;
    }

    public void setSedeDescPais(String sedeDescPais) {
        this.sedeDescPais = sedeDescPais == null ? null : sedeDescPais.trim();
    }

    public Integer getSedeCodDepartamento() {
        return sedeCodDepartamento;
    }

    public void setSedeCodDepartamento(Integer sedeCodDepartamento) {
        this.sedeCodDepartamento = sedeCodDepartamento;
    }

    public String getSedeDescDepartamento() {
        return sedeDescDepartamento;
    }

    public void setSedeDescDepartamento(String sedeDescDepartamento) {
        this.sedeDescDepartamento = sedeDescDepartamento == null ? null : sedeDescDepartamento.trim();
    }

    public Integer getSedeCodProvincia() {
        return sedeCodProvincia;
    }

    public void setSedeCodProvincia(Integer sedeCodProvincia) {
        this.sedeCodProvincia = sedeCodProvincia;
    }

    public String getSedeDescProvincia() {
        return sedeDescProvincia;
    }

    public void setSedeDescProvincia(String sedeDescProvincia) {
        this.sedeDescProvincia = sedeDescProvincia == null ? null : sedeDescProvincia.trim();
    }

    public Integer getSedeCodDistrito() {
        return sedeCodDistrito;
    }

    public void setSedeCodDistrito(Integer sedeCodDistrito) {
        this.sedeCodDistrito = sedeCodDistrito;
    }

    public String getSedeDescDistrito() {
        return sedeDescDistrito;
    }

    public void setSedeDescDistrito(String sedeDescDistrito) {
        this.sedeDescDistrito = sedeDescDistrito == null ? null : sedeDescDistrito.trim();
    }

    public String getSedeDesc() {
        return sedeDesc;
    }

    public void setSedeDesc(String sedeDesc) {
        this.sedeDesc = sedeDesc == null ? null : sedeDesc.trim();
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	sedeKey=null;
    	sedeCod=null;
    	sedeCodTipo=null;
    	sedeDescTipo=null;
    	sedeCodPais=null;
    	sedeDescPais=null;
    	sedeCodDepartamento=null;
    	sedeDescDepartamento=null;
    	sedeCodProvincia=null;
    	sedeDescProvincia=null;
    	sedeCodDistrito=null;
    	sedeDescDistrito=null;
    	sedeDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimSede [sedeKey=" + sedeKey + ", sedeCod=" + sedeCod
				+ ", sedeCodTipo=" + sedeCodTipo + ", sedeDescTipo="
				+ sedeDescTipo + ", sedeCodPais=" + sedeCodPais
				+ ", sedeDescPais=" + sedeDescPais + ", sedeCodDepartamento="
				+ sedeCodDepartamento + ", sedeDescDepartamento="
				+ sedeDescDepartamento + ", sedeCodProvincia="
				+ sedeCodProvincia + ", sedeDescProvincia=" + sedeDescProvincia
				+ ", sedeCodDistrito=" + sedeCodDistrito
				+ ", sedeDescDistrito=" + sedeDescDistrito + ", sedeDesc="
				+ sedeDesc + ", procId=" + procId + "]";
	}
}