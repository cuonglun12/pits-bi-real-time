package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoRuta {
    private Integer tipoRutaKey;

    private String tipoRutaCod;

    private String tipoRutaDesc;

    private Integer procId;

    public Integer getTipoRutaKey() {
        return tipoRutaKey;
    }

    public void setTipoRutaKey(Integer tipoRutaKey) {
        this.tipoRutaKey = tipoRutaKey;
    }

    public String getTipoRutaCod() {
        return tipoRutaCod;
    }

    public void setTipoRutaCod(String tipoRutaCod) {
        this.tipoRutaCod = tipoRutaCod == null ? null : tipoRutaCod.trim();
    }

    public String getTipoRutaDesc() {
        return tipoRutaDesc;
    }

    public void setTipoRutaDesc(String tipoRutaDesc) {
        this.tipoRutaDesc = tipoRutaDesc == null ? null : tipoRutaDesc.trim();
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
		return "DimTipoRuta [tipoRutaKey=" + tipoRutaKey + ", tipoRutaCod="
				+ tipoRutaCod + ", tipoRutaDesc=" + tipoRutaDesc + ", procId="
				+ procId + "]";
	}
}