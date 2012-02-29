package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimZona {
    private Integer zonaKey;

    private Integer zonaCodPais;

    private String zonaDescPais;

    private Integer zonaCodDepartamento;

    private String zonaDescDepartamento;

    private Integer zonaCodProvincia;

    private String zonaDescProvincia;

    private Integer zonaCodDistrito;

    private String zonaDescDistrito;

    private String zonaCod;

    private String zonaCodPostal;

    private Integer procId;

    public Integer getZonaKey() {
        return zonaKey;
    }

    public void setZonaKey(Integer zonaKey) {
        this.zonaKey = zonaKey;
    }

    public Integer getZonaCodPais() {
        return zonaCodPais;
    }

    public void setZonaCodPais(Integer zonaCodPais) {
        this.zonaCodPais = zonaCodPais;
    }

    public String getZonaDescPais() {
        return zonaDescPais;
    }

    public void setZonaDescPais(String zonaDescPais) {
        this.zonaDescPais = zonaDescPais == null ? null : zonaDescPais.trim();
    }

    public Integer getZonaCodDepartamento() {
        return zonaCodDepartamento;
    }

    public void setZonaCodDepartamento(Integer zonaCodDepartamento) {
        this.zonaCodDepartamento = zonaCodDepartamento;
    }

    public String getZonaDescDepartamento() {
        return zonaDescDepartamento;
    }

    public void setZonaDescDepartamento(String zonaDescDepartamento) {
        this.zonaDescDepartamento = zonaDescDepartamento == null ? null : zonaDescDepartamento.trim();
    }

    public Integer getZonaCodProvincia() {
        return zonaCodProvincia;
    }

    public void setZonaCodProvincia(Integer zonaCodProvincia) {
        this.zonaCodProvincia = zonaCodProvincia;
    }

    public String getZonaDescProvincia() {
        return zonaDescProvincia;
    }

    public void setZonaDescProvincia(String zonaDescProvincia) {
        this.zonaDescProvincia = zonaDescProvincia == null ? null : zonaDescProvincia.trim();
    }

    public Integer getZonaCodDistrito() {
        return zonaCodDistrito;
    }

    public void setZonaCodDistrito(Integer zonaCodDistrito) {
        this.zonaCodDistrito = zonaCodDistrito;
    }

    public String getZonaDescDistrito() {
        return zonaDescDistrito;
    }

    public void setZonaDescDistrito(String zonaDescDistrito) {
        this.zonaDescDistrito = zonaDescDistrito == null ? null : zonaDescDistrito.trim();
    }

    public String getZonaCod() {
        return zonaCod;
    }

    public void setZonaCod(String zonaCod) {
        this.zonaCod = zonaCod == null ? null : zonaCod.trim();
    }

    public String getZonaCodPostal() {
        return zonaCodPostal;
    }

    public void setZonaCodPostal(String zonaCodPostal) {
        this.zonaCodPostal = zonaCodPostal == null ? null : zonaCodPostal.trim();
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	zonaKey=null;
    	zonaCodPais=null;
    	zonaDescPais=null;
    	zonaCodDepartamento=null;
    	zonaDescDepartamento=null;
    	zonaCodProvincia=null;
    	zonaDescProvincia=null;
    	zonaCodDistrito=null;
    	zonaDescDistrito=null;
    	zonaCod=null;
    	zonaCodPostal=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimZona [zonaKey=" + zonaKey + ", zonaCodPais=" + zonaCodPais
				+ ", zonaDescPais=" + zonaDescPais + ", zonaCodDepartamento="
				+ zonaCodDepartamento + ", zonaDescDepartamento="
				+ zonaDescDepartamento + ", zonaCodProvincia="
				+ zonaCodProvincia + ", zonaDescProvincia=" + zonaDescProvincia
				+ ", zonaCodDistrito=" + zonaCodDistrito
				+ ", zonaDescDistrito=" + zonaDescDistrito + ", zonaCod="
				+ zonaCod + ", zonaCodPostal=" + zonaCodPostal + ", procId="
				+ procId + "]";
	}
}