package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimCliente {
    private Integer clienteAreaKey;

    private Integer clienteKey;

    private Integer clienteCodTip;

    private String clienteDescTip;

    private Integer clienteCodCategoria;

    private String clienteDescCategoria;

    private Integer clienteCodFacturacion;

    private String clienteDescFacturacion;

    private Integer clienteCodCredito;

    private String clienteDescCredito;

    private Integer clienteCodTipDoc;

    private String clienteDescTipDoc;

    private String clienteNumTipDoc;

    private String clienteDesc;

    private String clienteAreaCod;

    private String clienteAreaDesc;

    private Integer procId;

    public Integer getClienteAreaKey() {
        return clienteAreaKey;
    }

    public void setClienteAreaKey(Integer clienteAreaKey) {
        this.clienteAreaKey = clienteAreaKey;
    }

    public Integer getClienteKey() {
        return clienteKey;
    }

    public void setClienteKey(Integer clienteKey) {
        this.clienteKey = clienteKey;
    }

    public Integer getClienteCodTip() {
        return clienteCodTip;
    }

    public void setClienteCodTip(Integer clienteCodTip) {
        this.clienteCodTip = clienteCodTip;
    }

    public String getClienteDescTip() {
        return clienteDescTip;
    }

    public void setClienteDescTip(String clienteDescTip) {
        this.clienteDescTip = clienteDescTip == null ? null : clienteDescTip.trim();
    }

    public Integer getClienteCodCategoria() {
        return clienteCodCategoria;
    }

    public void setClienteCodCategoria(Integer clienteCodCategoria) {
        this.clienteCodCategoria = clienteCodCategoria;
    }

    public String getClienteDescCategoria() {
        return clienteDescCategoria;
    }

    public void setClienteDescCategoria(String clienteDescCategoria) {
        this.clienteDescCategoria = clienteDescCategoria == null ? null : clienteDescCategoria.trim();
    }

    public Integer getClienteCodFacturacion() {
        return clienteCodFacturacion;
    }

    public void setClienteCodFacturacion(Integer clienteCodFacturacion) {
        this.clienteCodFacturacion = clienteCodFacturacion;
    }

    public String getClienteDescFacturacion() {
        return clienteDescFacturacion;
    }

    public void setClienteDescFacturacion(String clienteDescFacturacion) {
        this.clienteDescFacturacion = clienteDescFacturacion == null ? null : clienteDescFacturacion.trim();
    }

    public Integer getClienteCodCredito() {
        return clienteCodCredito;
    }

    public void setClienteCodCredito(Integer clienteCodCredito) {
        this.clienteCodCredito = clienteCodCredito;
    }

    public String getClienteDescCredito() {
        return clienteDescCredito;
    }

    public void setClienteDescCredito(String clienteDescCredito) {
        this.clienteDescCredito = clienteDescCredito == null ? null : clienteDescCredito.trim();
    }

    public Integer getClienteCodTipDoc() {
        return clienteCodTipDoc;
    }

    public void setClienteCodTipDoc(Integer clienteCodTipDoc) {
        this.clienteCodTipDoc = clienteCodTipDoc;
    }

    public String getClienteDescTipDoc() {
        return clienteDescTipDoc;
    }

    public void setClienteDescTipDoc(String clienteDescTipDoc) {
        this.clienteDescTipDoc = clienteDescTipDoc == null ? null : clienteDescTipDoc.trim();
    }

    public String getClienteNumTipDoc() {
        return clienteNumTipDoc;
    }

    public void setClienteNumTipDoc(String clienteNumTipDoc) {
        this.clienteNumTipDoc = clienteNumTipDoc == null ? null : clienteNumTipDoc.trim();
    }

    public String getClienteDesc() {
        return clienteDesc;
    }

    public void setClienteDesc(String clienteDesc) {
        this.clienteDesc = clienteDesc == null ? null : clienteDesc.trim();
    }

    public String getClienteAreaCod() {
        return clienteAreaCod;
    }

    public void setClienteAreaCod(String clienteAreaCod) {
        this.clienteAreaCod = clienteAreaCod == null ? null : clienteAreaCod.trim();
    }

    public String getClienteAreaDesc() {
        return clienteAreaDesc;
    }

    public void setClienteAreaDesc(String clienteAreaDesc) {
        this.clienteAreaDesc = clienteAreaDesc == null ? null : clienteAreaDesc.trim();
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	clienteAreaKey=null;
    	clienteKey=null;
    	clienteCodTip=null;
    	clienteDescTip=null;
    	clienteCodCategoria=null;
    	clienteDescCategoria=null;
    	clienteCodFacturacion=null;
    	clienteDescFacturacion=null;
    	clienteCodCredito=null;
    	clienteDescCredito=null;
    	clienteCodTipDoc=null;
    	clienteDescTipDoc=null;
    	clienteNumTipDoc=null;
    	clienteDesc=null;
    	clienteAreaCod=null;
    	clienteAreaDesc=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "DimCliente [clienteAreaKey=" + clienteAreaKey + ", clienteKey="
				+ clienteKey + ", clienteCodTip=" + clienteCodTip
				+ ", clienteDescTip=" + clienteDescTip
				+ ", clienteCodCategoria=" + clienteCodCategoria
				+ ", clienteDescCategoria=" + clienteDescCategoria
				+ ", clienteCodFacturacion=" + clienteCodFacturacion
				+ ", clienteDescFacturacion=" + clienteDescFacturacion
				+ ", clienteCodCredito=" + clienteCodCredito
				+ ", clienteDescCredito=" + clienteDescCredito
				+ ", clienteCodTipDoc=" + clienteCodTipDoc
				+ ", clienteDescTipDoc=" + clienteDescTipDoc
				+ ", clienteNumTipDoc=" + clienteNumTipDoc + ", clienteDesc="
				+ clienteDesc + ", clienteAreaCod=" + clienteAreaCod
				+ ", clienteAreaDesc=" + clienteAreaDesc
				+ ", procId=" + procId + "]";
	}
}