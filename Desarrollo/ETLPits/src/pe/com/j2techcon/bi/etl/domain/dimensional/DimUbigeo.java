package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimUbigeo {
    private Integer ubigeoKey;

    private Integer ubigeoCodPais;

    private String ubigeoDesPais;

    private Integer ubigeoCodDepartamento;

    private String ubigeoDescDepartamento;

    private Integer ubigeoCodProvincia;

    private String ubigeoDescProvincia;

    private Integer ubigeoCodDistrito;

    private String ubigeoDescDistrito;

    public Integer getUbigeoKey() {
        return ubigeoKey;
    }

    public void setUbigeoKey(Integer ubigeoKey) {
        this.ubigeoKey = ubigeoKey;
    }

    public Integer getUbigeoCodPais() {
        return ubigeoCodPais;
    }

    public void setUbigeoCodPais(Integer ubigeoCodPais) {
        this.ubigeoCodPais = ubigeoCodPais;
    }

    public String getUbigeoDesPais() {
        return ubigeoDesPais;
    }

    public void setUbigeoDesPais(String ubigeoDesPais) {
        this.ubigeoDesPais = ubigeoDesPais == null ? null : ubigeoDesPais.trim();
    }

    public Integer getUbigeoCodDepartamento() {
        return ubigeoCodDepartamento;
    }

    public void setUbigeoCodDepartamento(Integer ubigeoCodDepartamento) {
        this.ubigeoCodDepartamento = ubigeoCodDepartamento;
    }

    public String getUbigeoDescDepartamento() {
        return ubigeoDescDepartamento;
    }

    public void setUbigeoDescDepartamento(String ubigeoDescDepartamento) {
        this.ubigeoDescDepartamento = ubigeoDescDepartamento == null ? null : ubigeoDescDepartamento.trim();
    }

    public Integer getUbigeoCodProvincia() {
        return ubigeoCodProvincia;
    }

    public void setUbigeoCodProvincia(Integer ubigeoCodProvincia) {
        this.ubigeoCodProvincia = ubigeoCodProvincia;
    }

    public String getUbigeoDescProvincia() {
        return ubigeoDescProvincia;
    }

    public void setUbigeoDescProvincia(String ubigeoDescProvincia) {
        this.ubigeoDescProvincia = ubigeoDescProvincia == null ? null : ubigeoDescProvincia.trim();
    }

    public Integer getUbigeoCodDistrito() {
        return ubigeoCodDistrito;
    }

    public void setUbigeoCodDistrito(Integer ubigeoCodDistrito) {
        this.ubigeoCodDistrito = ubigeoCodDistrito;
    }

    public String getUbigeoDescDistrito() {
        return ubigeoDescDistrito;
    }

    public void setUbigeoDescDistrito(String ubigeoDescDistrito) {
        this.ubigeoDescDistrito = ubigeoDescDistrito == null ? null : ubigeoDescDistrito.trim();
    }
    
    public void clear(){
        ubigeoKey = null;
        ubigeoCodPais = null;
        ubigeoDesPais = null;
        ubigeoCodDepartamento = null;
        ubigeoDescDepartamento = null;
        ubigeoCodProvincia = null;
        ubigeoDescProvincia = null;
        ubigeoCodDistrito = null;
        ubigeoDescDistrito = null;
    }

	@Override
	public String toString() {
		return "DimUbigeo [ubigeoKey=" + ubigeoKey + ", ubigeoCodPais="
				+ ubigeoCodPais + ", ubigeoDesPais=" + ubigeoDesPais
				+ ", ubigeoCodDepartamento=" + ubigeoCodDepartamento
				+ ", ubigeoDescDepartamento=" + ubigeoDescDepartamento
				+ ", ubigeoCodProvincia=" + ubigeoCodProvincia
				+ ", ubigeoDescProvincia=" + ubigeoDescProvincia
				+ ", ubigeoCodDistrito=" + ubigeoCodDistrito
				+ ", ubigeoDescDistrito=" + ubigeoDescDistrito + "]";
	}
}