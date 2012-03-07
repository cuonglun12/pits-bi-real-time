package pe.com.j2techcon.bi.etl.util;

public class Constantes {
	
	private int	paramCodeTipoAreaCliente;
	
	private int	paramCodeEstadoCargoDespacho;
	private String paramCodeEstadoCargoDespachoEntregado;
	private String paramCodeEstadoCargoDespachoMotivado;
	private String paramCodeEstadoCargoDespachoReenviado;
	private String paramCodeEstadoCargoDespachoAnulado;
	private String paramCodeEstadoCargoDespachoFueraZona;
	private String paramCodeEstadoCargoDespachoPerdido;
	
	private int	paramCodeEstadoCargoDespachoVerificacion;
	private int	paramCodeMotivoCargoDespacho;
	private int	paramCodeEstadoCargo;
	private int	paramCodeMotivoCargo;
	private int	paramCodeTipoIngresoCargo;
	private int	paramCodeCategoriaCliente;
	private int	paramCodeTipoCliente;
	private int	paramCodeTipoCredito;
	private int	paramCodeTipoDocumentoTrabajo;
	private int	paramCodeTipoFacturacion;
	private int	paramCodeTipoCambio;
	private int	paramCodeEstadoCotizacion;
	private int	paramCodeTipoNegocio;
	private int	paramCodeTipoServicio;
	private int	paramCodeTipoDocumento;
	private int	paramCodeEstadoDespacho;
	private int	paramCodeEstadoDespachoVerificacion;
	private int	paramCodeTipoDespacho;
	private int	paramCodeTipoRuta;
	private int	paramCodeCategoriaEmpleado;
	private int	paramCodeEstadoOrden;
	private int	paramCodeTipoIngreso;
	private int	paramCodeTipoMoneda;
	private int	paramCodeTipoPago;
	private int	paramCodeTipoReparto;
	private int	paramCodeTipoProducto;
	private int	paramCodeTipoSede;
	private int	paramCodeUbigeoPais;
	private int	paramCodeUbigeoDepartamento;
	private int	paramCodeUbigeoProvincia;
	private int	paramCodeUbigeoDistrito;

	private String valueStringDefault;
	private int valueNumberDefault;
	
	private int valueNumberUnit;
	private int valueNumberCero;
	
	private String stateRecordNew;
	private String stateRecordProcessed;
	private String stateRecordInconsistent;
	
	private String stateProcessStarted;
	private String stateProcessCompletedCorrectly;
	private String stateProcessCompletedErrors;

	private String typeProcessSimple;
	private String typeProcessReProcess;
	
	private int resultTransactionNoResult;
	
	private int resultProcessStarted;
	private int resultProcessCompletedCorrectly;
	private int resultProcessCompletedErrors;
	
	private int sizePage;

	public int getParamCodeTipoAreaCliente() {
		return paramCodeTipoAreaCliente;
	}

	public void setParamCodeTipoAreaCliente(int paramCodeTipoAreaCliente) {
		this.paramCodeTipoAreaCliente = paramCodeTipoAreaCliente;
	}

	public int getParamCodeEstadoCargoDespacho() {
		return paramCodeEstadoCargoDespacho;
	}

	public void setParamCodeEstadoCargoDespacho(int paramCodeEstadoCargoDespacho) {
		this.paramCodeEstadoCargoDespacho = paramCodeEstadoCargoDespacho;
	}

	public String getParamCodeEstadoCargoDespachoEntregado() {
		return paramCodeEstadoCargoDespachoEntregado;
	}

	public void setParamCodeEstadoCargoDespachoEntregado(
			String paramCodeEstadoCargoDespachoEntregado) {
		this.paramCodeEstadoCargoDespachoEntregado = paramCodeEstadoCargoDespachoEntregado;
	}

	public String getParamCodeEstadoCargoDespachoMotivado() {
		return paramCodeEstadoCargoDespachoMotivado;
	}

	public void setParamCodeEstadoCargoDespachoMotivado(
			String paramCodeEstadoCargoDespachoMotivado) {
		this.paramCodeEstadoCargoDespachoMotivado = paramCodeEstadoCargoDespachoMotivado;
	}

	public String getParamCodeEstadoCargoDespachoReenviado() {
		return paramCodeEstadoCargoDespachoReenviado;
	}

	public void setParamCodeEstadoCargoDespachoReenviado(
			String paramCodeEstadoCargoDespachoReenviado) {
		this.paramCodeEstadoCargoDespachoReenviado = paramCodeEstadoCargoDespachoReenviado;
	}

	public String getParamCodeEstadoCargoDespachoAnulado() {
		return paramCodeEstadoCargoDespachoAnulado;
	}

	public void setParamCodeEstadoCargoDespachoAnulado(
			String paramCodeEstadoCargoDespachoAnulado) {
		this.paramCodeEstadoCargoDespachoAnulado = paramCodeEstadoCargoDespachoAnulado;
	}

	public String getParamCodeEstadoCargoDespachoFueraZona() {
		return paramCodeEstadoCargoDespachoFueraZona;
	}

	public void setParamCodeEstadoCargoDespachoFueraZona(
			String paramCodeEstadoCargoDespachoFueraZona) {
		this.paramCodeEstadoCargoDespachoFueraZona = paramCodeEstadoCargoDespachoFueraZona;
	}

	public String getParamCodeEstadoCargoDespachoPerdido() {
		return paramCodeEstadoCargoDespachoPerdido;
	}

	public void setParamCodeEstadoCargoDespachoPerdido(
			String paramCodeEstadoCargoDespachoPerdido) {
		this.paramCodeEstadoCargoDespachoPerdido = paramCodeEstadoCargoDespachoPerdido;
	}

	public int getParamCodeEstadoCargoDespachoVerificacion() {
		return paramCodeEstadoCargoDespachoVerificacion;
	}

	public void setParamCodeEstadoCargoDespachoVerificacion(
			int paramCodeEstadoCargoDespachoVerificacion) {
		this.paramCodeEstadoCargoDespachoVerificacion = paramCodeEstadoCargoDespachoVerificacion;
	}

	public int getParamCodeMotivoCargoDespacho() {
		return paramCodeMotivoCargoDespacho;
	}

	public void setParamCodeMotivoCargoDespacho(int paramCodeMotivoCargoDespacho) {
		this.paramCodeMotivoCargoDespacho = paramCodeMotivoCargoDespacho;
	}

	public int getParamCodeEstadoCargo() {
		return paramCodeEstadoCargo;
	}

	public void setParamCodeEstadoCargo(int paramCodeEstadoCargo) {
		this.paramCodeEstadoCargo = paramCodeEstadoCargo;
	}

	public int getParamCodeMotivoCargo() {
		return paramCodeMotivoCargo;
	}

	public void setParamCodeMotivoCargo(int paramCodeMotivoCargo) {
		this.paramCodeMotivoCargo = paramCodeMotivoCargo;
	}

	public int getParamCodeTipoIngresoCargo() {
		return paramCodeTipoIngresoCargo;
	}

	public void setParamCodeTipoIngresoCargo(int paramCodeTipoIngresoCargo) {
		this.paramCodeTipoIngresoCargo = paramCodeTipoIngresoCargo;
	}

	public int getParamCodeCategoriaCliente() {
		return paramCodeCategoriaCliente;
	}

	public void setParamCodeCategoriaCliente(int paramCodeCategoriaCliente) {
		this.paramCodeCategoriaCliente = paramCodeCategoriaCliente;
	}

	public int getParamCodeTipoCliente() {
		return paramCodeTipoCliente;
	}

	public void setParamCodeTipoCliente(int paramCodeTipoCliente) {
		this.paramCodeTipoCliente = paramCodeTipoCliente;
	}

	public int getParamCodeTipoCredito() {
		return paramCodeTipoCredito;
	}

	public void setParamCodeTipoCredito(int paramCodeTipoCredito) {
		this.paramCodeTipoCredito = paramCodeTipoCredito;
	}

	public int getParamCodeTipoDocumentoTrabajo() {
		return paramCodeTipoDocumentoTrabajo;
	}

	public void setParamCodeTipoDocumentoTrabajo(int paramCodeTipoDocumentoTrabajo) {
		this.paramCodeTipoDocumentoTrabajo = paramCodeTipoDocumentoTrabajo;
	}

	public int getParamCodeTipoFacturacion() {
		return paramCodeTipoFacturacion;
	}

	public void setParamCodeTipoFacturacion(int paramCodeTipoFacturacion) {
		this.paramCodeTipoFacturacion = paramCodeTipoFacturacion;
	}

	public int getParamCodeTipoCambio() {
		return paramCodeTipoCambio;
	}

	public void setParamCodeTipoCambio(int paramCodeTipoCambio) {
		this.paramCodeTipoCambio = paramCodeTipoCambio;
	}

	public int getParamCodeEstadoCotizacion() {
		return paramCodeEstadoCotizacion;
	}

	public void setParamCodeEstadoCotizacion(int paramCodeEstadoCotizacion) {
		this.paramCodeEstadoCotizacion = paramCodeEstadoCotizacion;
	}

	public int getParamCodeTipoNegocio() {
		return paramCodeTipoNegocio;
	}

	public void setParamCodeTipoNegocio(int paramCodeTipoNegocio) {
		this.paramCodeTipoNegocio = paramCodeTipoNegocio;
	}

	public int getParamCodeTipoServicio() {
		return paramCodeTipoServicio;
	}

	public void setParamCodeTipoServicio(int paramCodeTipoServicio) {
		this.paramCodeTipoServicio = paramCodeTipoServicio;
	}

	public int getParamCodeTipoDocumento() {
		return paramCodeTipoDocumento;
	}

	public void setParamCodeTipoDocumento(int paramCodeTipoDocumento) {
		this.paramCodeTipoDocumento = paramCodeTipoDocumento;
	}

	public int getParamCodeEstadoDespacho() {
		return paramCodeEstadoDespacho;
	}

	public void setParamCodeEstadoDespacho(int paramCodeEstadoDespacho) {
		this.paramCodeEstadoDespacho = paramCodeEstadoDespacho;
	}

	public int getParamCodeEstadoDespachoVerificacion() {
		return paramCodeEstadoDespachoVerificacion;
	}

	public void setParamCodeEstadoDespachoVerificacion(
			int paramCodeEstadoDespachoVerificacion) {
		this.paramCodeEstadoDespachoVerificacion = paramCodeEstadoDespachoVerificacion;
	}

	public int getParamCodeTipoDespacho() {
		return paramCodeTipoDespacho;
	}

	public void setParamCodeTipoDespacho(int paramCodeTipoDespacho) {
		this.paramCodeTipoDespacho = paramCodeTipoDespacho;
	}

	public int getParamCodeTipoRuta() {
		return paramCodeTipoRuta;
	}

	public void setParamCodeTipoRuta(int paramCodeTipoRuta) {
		this.paramCodeTipoRuta = paramCodeTipoRuta;
	}

	public int getParamCodeCategoriaEmpleado() {
		return paramCodeCategoriaEmpleado;
	}

	public void setParamCodeCategoriaEmpleado(int paramCodeCategoriaEmpleado) {
		this.paramCodeCategoriaEmpleado = paramCodeCategoriaEmpleado;
	}

	public int getParamCodeEstadoOrden() {
		return paramCodeEstadoOrden;
	}

	public void setParamCodeEstadoOrden(int paramCodeEstadoOrden) {
		this.paramCodeEstadoOrden = paramCodeEstadoOrden;
	}

	public int getParamCodeTipoIngreso() {
		return paramCodeTipoIngreso;
	}

	public void setParamCodeTipoIngreso(int paramCodeTipoIngreso) {
		this.paramCodeTipoIngreso = paramCodeTipoIngreso;
	}

	public int getParamCodeTipoMoneda() {
		return paramCodeTipoMoneda;
	}

	public void setParamCodeTipoMoneda(int paramCodeTipoMoneda) {
		this.paramCodeTipoMoneda = paramCodeTipoMoneda;
	}

	public int getParamCodeTipoPago() {
		return paramCodeTipoPago;
	}

	public void setParamCodeTipoPago(int paramCodeTipoPago) {
		this.paramCodeTipoPago = paramCodeTipoPago;
	}

	public int getParamCodeTipoReparto() {
		return paramCodeTipoReparto;
	}

	public void setParamCodeTipoReparto(int paramCodeTipoReparto) {
		this.paramCodeTipoReparto = paramCodeTipoReparto;
	}

	public int getParamCodeTipoProducto() {
		return paramCodeTipoProducto;
	}

	public void setParamCodeTipoProducto(int paramCodeTipoProducto) {
		this.paramCodeTipoProducto = paramCodeTipoProducto;
	}

	public int getParamCodeTipoSede() {
		return paramCodeTipoSede;
	}

	public void setParamCodeTipoSede(int paramCodeTipoSede) {
		this.paramCodeTipoSede = paramCodeTipoSede;
	}

	public int getParamCodeUbigeoPais() {
		return paramCodeUbigeoPais;
	}

	public void setParamCodeUbigeoPais(int paramCodeUbigeoPais) {
		this.paramCodeUbigeoPais = paramCodeUbigeoPais;
	}

	public int getParamCodeUbigeoDepartamento() {
		return paramCodeUbigeoDepartamento;
	}

	public void setParamCodeUbigeoDepartamento(int paramCodeUbigeoDepartamento) {
		this.paramCodeUbigeoDepartamento = paramCodeUbigeoDepartamento;
	}

	public int getParamCodeUbigeoProvincia() {
		return paramCodeUbigeoProvincia;
	}

	public void setParamCodeUbigeoProvincia(int paramCodeUbigeoProvincia) {
		this.paramCodeUbigeoProvincia = paramCodeUbigeoProvincia;
	}

	public int getParamCodeUbigeoDistrito() {
		return paramCodeUbigeoDistrito;
	}

	public void setParamCodeUbigeoDistrito(int paramCodeUbigeoDistrito) {
		this.paramCodeUbigeoDistrito = paramCodeUbigeoDistrito;
	}

	public String getValueStringDefault() {
		return valueStringDefault;
	}

	public void setValueStringDefault(String valueStringDefault) {
		this.valueStringDefault = valueStringDefault;
	}

	public int getValueNumberDefault() {
		return valueNumberDefault;
	}

	public void setValueNumberDefault(int valueNumberDefault) {
		this.valueNumberDefault = valueNumberDefault;
	}

	public int getValueNumberUnit() {
		return valueNumberUnit;
	}

	public void setValueNumberUnit(int valueNumberUnit) {
		this.valueNumberUnit = valueNumberUnit;
	}

	public int getValueNumberCero() {
		return valueNumberCero;
	}

	public void setValueNumberCero(int valueNumberCero) {
		this.valueNumberCero = valueNumberCero;
	}

	public String getStateRecordNew() {
		return stateRecordNew;
	}

	public void setStateRecordNew(String stateRecordNew) {
		this.stateRecordNew = stateRecordNew;
	}

	public String getStateRecordProcessed() {
		return stateRecordProcessed;
	}

	public void setStateRecordProcessed(String stateRecordProcessed) {
		this.stateRecordProcessed = stateRecordProcessed;
	}

	public String getStateRecordInconsistent() {
		return stateRecordInconsistent;
	}

	public void setStateRecordInconsistent(String stateRecordInconsistent) {
		this.stateRecordInconsistent = stateRecordInconsistent;
	}

	public String getStateProcessStarted() {
		return stateProcessStarted;
	}

	public void setStateProcessStarted(String stateProcessStarted) {
		this.stateProcessStarted = stateProcessStarted;
	}

	public String getStateProcessCompletedCorrectly() {
		return stateProcessCompletedCorrectly;
	}

	public void setStateProcessCompletedCorrectly(
			String stateProcessCompletedCorrectly) {
		this.stateProcessCompletedCorrectly = stateProcessCompletedCorrectly;
	}

	public String getStateProcessCompletedErrors() {
		return stateProcessCompletedErrors;
	}

	public void setStateProcessCompletedErrors(String stateProcessCompletedErrors) {
		this.stateProcessCompletedErrors = stateProcessCompletedErrors;
	}

	public String getTypeProcessSimple() {
		return typeProcessSimple;
	}

	public void setTypeProcessSimple(String typeProcessSimple) {
		this.typeProcessSimple = typeProcessSimple;
	}

	public String getTypeProcessReProcess() {
		return typeProcessReProcess;
	}

	public void setTypeProcessReProcess(String typeProcessReProcess) {
		this.typeProcessReProcess = typeProcessReProcess;
	}

	public int getResultTransactionNoResult() {
		return resultTransactionNoResult;
	}

	public void setResultTransactionNoResult(int resultTransactionNoResult) {
		this.resultTransactionNoResult = resultTransactionNoResult;
	}

	public int getResultProcessStarted() {
		return resultProcessStarted;
	}

	public void setResultProcessStarted(int resultProcessStarted) {
		this.resultProcessStarted = resultProcessStarted;
	}

	public int getResultProcessCompletedCorrectly() {
		return resultProcessCompletedCorrectly;
	}

	public void setResultProcessCompletedCorrectly(
			int resultProcessCompletedCorrectly) {
		this.resultProcessCompletedCorrectly = resultProcessCompletedCorrectly;
	}

	public int getResultProcessCompletedErrors() {
		return resultProcessCompletedErrors;
	}

	public void setResultProcessCompletedErrors(int resultProcessCompletedErrors) {
		this.resultProcessCompletedErrors = resultProcessCompletedErrors;
	}

	public int getSizePage() {
		return sizePage;
	}

	public void setSizePage(int sizePage) {
		this.sizePage = sizePage;
	}

	@Override
	public String toString() {
		return "Constantes [paramCodeTipoAreaCliente="
				+ paramCodeTipoAreaCliente + ", paramCodeEstadoCargoDespacho="
				+ paramCodeEstadoCargoDespacho
				+ ", paramCodeEstadoCargoDespachoEntregado="
				+ paramCodeEstadoCargoDespachoEntregado
				+ ", paramCodeEstadoCargoDespachoMotivado="
				+ paramCodeEstadoCargoDespachoMotivado
				+ ", paramCodeEstadoCargoDespachoReenviado="
				+ paramCodeEstadoCargoDespachoReenviado
				+ ", paramCodeEstadoCargoDespachoAnulado="
				+ paramCodeEstadoCargoDespachoAnulado
				+ ", paramCodeEstadoCargoDespachoFueraZona="
				+ paramCodeEstadoCargoDespachoFueraZona
				+ ", paramCodeEstadoCargoDespachoPerdido="
				+ paramCodeEstadoCargoDespachoPerdido
				+ ", paramCodeEstadoCargoDespachoVerificacion="
				+ paramCodeEstadoCargoDespachoVerificacion
				+ ", paramCodeMotivoCargoDespacho="
				+ paramCodeMotivoCargoDespacho + ", paramCodeEstadoCargo="
				+ paramCodeEstadoCargo + ", paramCodeMotivoCargo="
				+ paramCodeMotivoCargo + ", paramCodeTipoIngresoCargo="
				+ paramCodeTipoIngresoCargo + ", paramCodeCategoriaCliente="
				+ paramCodeCategoriaCliente + ", paramCodeTipoCliente="
				+ paramCodeTipoCliente + ", paramCodeTipoCredito="
				+ paramCodeTipoCredito + ", paramCodeTipoDocumentoTrabajo="
				+ paramCodeTipoDocumentoTrabajo + ", paramCodeTipoFacturacion="
				+ paramCodeTipoFacturacion + ", paramCodeTipoCambio="
				+ paramCodeTipoCambio + ", paramCodeEstadoCotizacion="
				+ paramCodeEstadoCotizacion + ", paramCodeTipoNegocio="
				+ paramCodeTipoNegocio + ", paramCodeTipoServicio="
				+ paramCodeTipoServicio + ", paramCodeTipoDocumento="
				+ paramCodeTipoDocumento + ", paramCodeEstadoDespacho="
				+ paramCodeEstadoDespacho
				+ ", paramCodeEstadoDespachoVerificacion="
				+ paramCodeEstadoDespachoVerificacion
				+ ", paramCodeTipoDespacho=" + paramCodeTipoDespacho
				+ ", paramCodeTipoRuta=" + paramCodeTipoRuta
				+ ", paramCodeCategoriaEmpleado=" + paramCodeCategoriaEmpleado
				+ ", paramCodeEstadoOrden=" + paramCodeEstadoOrden
				+ ", paramCodeTipoIngreso=" + paramCodeTipoIngreso
				+ ", paramCodeTipoMoneda=" + paramCodeTipoMoneda
				+ ", paramCodeTipoPago=" + paramCodeTipoPago
				+ ", paramCodeTipoReparto=" + paramCodeTipoReparto
				+ ", paramCodeTipoProducto=" + paramCodeTipoProducto
				+ ", paramCodeTipoSede=" + paramCodeTipoSede
				+ ", paramCodeUbigeoPais=" + paramCodeUbigeoPais
				+ ", paramCodeUbigeoDepartamento="
				+ paramCodeUbigeoDepartamento + ", paramCodeUbigeoProvincia="
				+ paramCodeUbigeoProvincia + ", paramCodeUbigeoDistrito="
				+ paramCodeUbigeoDistrito + ", valueStringDefault="
				+ valueStringDefault + ", valueNumberDefault="
				+ valueNumberDefault + ", stateRecordNew=" + stateRecordNew
				+ ", stateRecordProcessed=" + stateRecordProcessed
				+ ", stateRecordInconsistent=" + stateRecordInconsistent
				+ ", stateProcessStarted=" + stateProcessStarted
				+ ", stateProcessCompletedCorrectly="
				+ stateProcessCompletedCorrectly
				+ ", stateProcessCompletedErrors="
				+ stateProcessCompletedErrors + ", typeProcessSimple="
				+ typeProcessSimple + ", typeProcessReProcess="
				+ typeProcessReProcess + ", resultTransactionNoResult="
				+ resultTransactionNoResult + ", resultProcessStarted="
				+ resultProcessStarted + ", resultProcessCompletedCorrectly="
				+ resultProcessCompletedCorrectly
				+ ", resultProcessCompletedErrors="
				+ resultProcessCompletedErrors + ", sizePage=" + sizePage + "]";
	}

	
}


