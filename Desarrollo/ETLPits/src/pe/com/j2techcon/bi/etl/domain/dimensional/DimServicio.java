package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimServicio {
    private Integer servicioKey;

    private String servicioCod;

    private Integer servicioCodAmbito;

    private String servicioDescAmbito;

    private Integer servicioCodNegocio;

    private String servicioDescNegocio;

    private String servicioDesc;

    private Integer procId;

    public Integer getServicioKey() {
        return servicioKey;
    }

    public void setServicioKey(Integer servicioKey) {
        this.servicioKey = servicioKey;
    }

    public String getServicioCod() {
        return servicioCod;
    }

    public void setServicioCod(String servicioCod) {
        this.servicioCod = servicioCod == null ? null : servicioCod.trim();
    }

    public Integer getServicioCodAmbito() {
        return servicioCodAmbito;
    }

    public void setServicioCodAmbito(Integer servicioCodAmbito) {
        this.servicioCodAmbito = servicioCodAmbito;
    }

    public String getServicioDescAmbito() {
        return servicioDescAmbito;
    }

    public void setServicioDescAmbito(String servicioDescAmbito) {
        this.servicioDescAmbito = servicioDescAmbito == null ? null : servicioDescAmbito.trim();
    }

    public Integer getServicioCodNegocio() {
        return servicioCodNegocio;
    }

    public void setServicioCodNegocio(Integer servicioCodNegocio) {
        this.servicioCodNegocio = servicioCodNegocio;
    }

    public String getServicioDescNegocio() {
        return servicioDescNegocio;
    }

    public void setServicioDescNegocio(String servicioDescNegocio) {
        this.servicioDescNegocio = servicioDescNegocio == null ? null : servicioDescNegocio.trim();
    }

    public String getServicioDesc() {
        return servicioDesc;
    }

    public void setServicioDesc(String servicioDesc) {
        this.servicioDesc = servicioDesc == null ? null : servicioDesc.trim();
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
		return "DimServicio [servicioKey=" + servicioKey + ", servicioCod="
				+ servicioCod + ", servicioCodAmbito=" + servicioCodAmbito
				+ ", servicioDescAmbito=" + servicioDescAmbito
				+ ", servicioCodNegocio=" + servicioCodNegocio
				+ ", servicioDescNegocio=" + servicioDescNegocio
				+ ", servicioDesc=" + servicioDesc + ", procId=" + procId + "]";
	}
}