package pe.com.j2techcon.bi.etl.util;

public class Constantes {
	
	private int	paramCodeTipoAreaCliente;
	
	private int paramCodeEstadoCargoDespacho;
	private String paramCodeEstadoCargoDespachoDigitado;
	private String paramCodeEstadoCargoDespachoRuta;
	private String paramCodeEstadoCargoDespachoEntregado;
	private String paramCodeEstadoCargoDespachoMotivado;
	private String paramCodeEstadoCargoDespachoReenviado;
	private String paramCodeEstadoCargoDespachoFueraZona;
	private String paramCodeEstadoCargoDespachoPerdido;
	private String paramCodeEstadoCargoDespachoAnulado;
	private String paramCodeEstadoCargoDespachoNoDistribuido;
	private String paramCodeEstadoCargoDespachoRetenido;
	private String paramCodeEstadoCargoDespachoSinFisico;
	private String paramCodeEstadoCargoDespachoProvincia;
	private String paramCodeEstadoCargoDespachoSupervision;
	private String paramCodeEstadoCargoDespachoRobo;
	
	private int	paramCodeEstadoCargoDespachoVerificacion;
	
	private int	paramCodeMotivoCargoDespacho;
	
	private int	paramCodeEstadoCargo;
	private String paramCodeEstadoCargoOrdenDigitado;
	private String paramCodeEstadoCargoOrdenClasificado;
	private String paramCodeEstadoCargoOrdenRuta;
	private String paramCodeEstadoCargoOrdenEntregado;
	private String paramCodeEstadoCargoOrdenMotivado;
	private String paramCodeEstadoCargoOrdenReenviado;
	private String paramCodeEstadoCargoOrdenFueraZona;
	private String paramCodeEstadoCargoOrdenPerdido;
	private String paramCodeEstadoCargoOrdenAnulado;
	private String paramCodeEstadoCargoOrdenNoDistribuido;
	private String paramCodeEstadoCargoOrdenRetenido;
	private String paramCodeEstadoCargoOrdenSinFisico;
	private String paramCodeEstadoCargoOrdenProvincia;
	private String paramCodeEstadoCargoOrdenSupervision;
	private String paramCodeEstadoCargoOrdenRobo;
	private String paramCodeEstadoCargoOrdenSiLlego;
	private String paramCodeEstadoCargoOrdenRecepcionado;
	
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
	private String paramCodeTipoNegocioMensajeria;
	
	private int	paramCodeTipoServicio;
	
	private int	paramCodeTipoDocumento;
	private String paramCodeTipoDocumentoRuc;
	private String paramCodeTipoDocumentoDni;
	
	private int	paramCodeEstadoDespacho;
	private String paramCodeEstadoDespachoDespacho;
	private String paramCodeEstadoDespachoRuta;
	private String paramCodeEstadoDespachoCerrado;
	private String paramCodeEstadoDespachoGenerado;
	private String paramCodeEstadoDespachoPagado;
	private String paramCodeEstadoDespachoAnulado;
	
	private int	paramCodeEstadoDespachoVerificacion;
	
	private int	paramCodeTipoDespacho;
	
	private int	paramCodeTipoRuta;
	
	private int	paramCodeCategoriaEmpleado;
	
	private int	paramCodeEstadoOrden;
	private String paramCodeEstadoOrdenGenerado;
	private String paramCodeEstadoOrdenPendiente;
	private String paramCodeEstadoOrdenCerrado;
	private String paramCodeEstadoOrdenAnulado;
	
	private int	paramCodeTipoIngreso;
	
	private int	paramCodeTipoMoneda;
	private String paramCodeTipoMonedaNuevoSol;
	private String paramCodeTipoMonedaDolar;
	
	private int	paramCodeTipoPago;
	
	private int	paramCodeTipoReparto;
	
	private int	paramCodeTipoProducto;
	
	private int	paramCodeTipoSede;
	
	private int	paramCodeUbigeoPais;
	
	private int	paramCodeUbigeoDepartamento;
	
	private int	paramCodeUbigeoProvincia;
	
	private int	paramCodeUbigeoDistrito;

	private int paramCodeEstadoFacturado;
	private String paramCodeEstadoFacturadoSi;
	private String paramCodeEstadoFacturadoNo;
	
	private int paramCodeTipoAmbito;
	private String paramCodeTipoAmbitoLocal;
	
	private int paramCodeEstadoLiquidacion;
	private String paramCodeEstadoLiquidacionPendiente;
	private String paramCodeEstadoLiquidacionParcial;
	private String paramCodeEstadoLiquidacionTotal;
	
	private String paramCodeNoDefinido;

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
	private String stateProcessCanceled;

	private String typeProcessSimple;
	private String typeProcessReProcess;
	
	private String loadProcessToGeneric;
	private String loadProcessToDimensional;
	
	private int resultTransactionNoResult;
	
	private int resultProcessStarted;
	private int resultProcessCompletedCorrectly;
	private int resultProcessCompletedErrors;
	
	private int sizePage;
	
	private int maxHoursProcess;
	private int maxHoursFirstProcess;
	
	private int idTableGenericTAreaCliente;
	private int idTableGenericTCargo;
	private int idTableGenericTCargoDespacho;
	private int idTableGenericTCliente;
	private int idTableGenericTCotizacion;
	private int idTableGenericTDespacho;
	private int idTableGenericTEmpleado;
	private int idTableGenericTEmpleadoCategoria;
	private int idTableGenericTLiquidacion;
	private int idTableGenericTOrden;
	private int idTableGenericTParametro;
	private int idTableGenericTProducto;
	private int idTableGenericTSede;
	private int idTableGenericTServicio;
	private int idTableGenericTUbigeo;
	private int idTableGenericTZona;

	private int idTableDimensionalDimCliente;
	private int idTableDimensionalDimEstado;
	private int idTableDimensionalDimFacturado;
	private int idTableDimensionalDimMoneda;
	private int idTableDimensionalDimPersonal;
	private int idTableDimensionalDimProducto;
	private int idTableDimensionalDimSede;
	private int idTableDimensionalDimServicio;
	private int idTableDimensionalDimTiempo;
	private int idTableDimensionalDimTipoDocumento;
	private int idTableDimensionalDimTipoPago;
	private int idTableDimensionalDimTipoReparto;
	private int idTableDimensionalDimTipoRuta;
	private int idTableDimensionalDimUbigeo;
	private int idTableDimensionalDimZona;
	private int idTableDimensionalFactCotizacion;
	private int idTableDimensionalFactDespacho;
	private int idTableDimensionalFactEnvio;
	private int idTableDimensionalFactOrden;
	
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
	public String getParamCodeEstadoCargoDespachoDigitado() {
		return paramCodeEstadoCargoDespachoDigitado;
	}
	public void setParamCodeEstadoCargoDespachoDigitado(
			String paramCodeEstadoCargoDespachoDigitado) {
		this.paramCodeEstadoCargoDespachoDigitado = paramCodeEstadoCargoDespachoDigitado;
	}
	public String getParamCodeEstadoCargoDespachoRuta() {
		return paramCodeEstadoCargoDespachoRuta;
	}
	public void setParamCodeEstadoCargoDespachoRuta(
			String paramCodeEstadoCargoDespachoRuta) {
		this.paramCodeEstadoCargoDespachoRuta = paramCodeEstadoCargoDespachoRuta;
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
	public String getParamCodeEstadoCargoDespachoAnulado() {
		return paramCodeEstadoCargoDespachoAnulado;
	}
	public void setParamCodeEstadoCargoDespachoAnulado(
			String paramCodeEstadoCargoDespachoAnulado) {
		this.paramCodeEstadoCargoDespachoAnulado = paramCodeEstadoCargoDespachoAnulado;
	}
	public String getParamCodeEstadoCargoDespachoNoDistribuido() {
		return paramCodeEstadoCargoDespachoNoDistribuido;
	}
	public void setParamCodeEstadoCargoDespachoNoDistribuido(
			String paramCodeEstadoCargoDespachoNoDistribuido) {
		this.paramCodeEstadoCargoDespachoNoDistribuido = paramCodeEstadoCargoDespachoNoDistribuido;
	}
	public String getParamCodeEstadoCargoDespachoRetenido() {
		return paramCodeEstadoCargoDespachoRetenido;
	}
	public void setParamCodeEstadoCargoDespachoRetenido(
			String paramCodeEstadoCargoDespachoRetenido) {
		this.paramCodeEstadoCargoDespachoRetenido = paramCodeEstadoCargoDespachoRetenido;
	}
	public String getParamCodeEstadoCargoDespachoSinFisico() {
		return paramCodeEstadoCargoDespachoSinFisico;
	}
	public void setParamCodeEstadoCargoDespachoSinFisico(
			String paramCodeEstadoCargoDespachoSinFisico) {
		this.paramCodeEstadoCargoDespachoSinFisico = paramCodeEstadoCargoDespachoSinFisico;
	}
	public String getParamCodeEstadoCargoDespachoProvincia() {
		return paramCodeEstadoCargoDespachoProvincia;
	}
	public void setParamCodeEstadoCargoDespachoProvincia(
			String paramCodeEstadoCargoDespachoProvincia) {
		this.paramCodeEstadoCargoDespachoProvincia = paramCodeEstadoCargoDespachoProvincia;
	}
	public String getParamCodeEstadoCargoDespachoSupervision() {
		return paramCodeEstadoCargoDespachoSupervision;
	}
	public void setParamCodeEstadoCargoDespachoSupervision(
			String paramCodeEstadoCargoDespachoSupervision) {
		this.paramCodeEstadoCargoDespachoSupervision = paramCodeEstadoCargoDespachoSupervision;
	}
	public String getParamCodeEstadoCargoDespachoRobo() {
		return paramCodeEstadoCargoDespachoRobo;
	}
	public void setParamCodeEstadoCargoDespachoRobo(
			String paramCodeEstadoCargoDespachoRobo) {
		this.paramCodeEstadoCargoDespachoRobo = paramCodeEstadoCargoDespachoRobo;
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
	public String getParamCodeEstadoCargoOrdenDigitado() {
		return paramCodeEstadoCargoOrdenDigitado;
	}
	public void setParamCodeEstadoCargoOrdenDigitado(
			String paramCodeEstadoCargoOrdenDigitado) {
		this.paramCodeEstadoCargoOrdenDigitado = paramCodeEstadoCargoOrdenDigitado;
	}
	public String getParamCodeEstadoCargoOrdenClasificado() {
		return paramCodeEstadoCargoOrdenClasificado;
	}
	public void setParamCodeEstadoCargoOrdenClasificado(
			String paramCodeEstadoCargoOrdenClasificado) {
		this.paramCodeEstadoCargoOrdenClasificado = paramCodeEstadoCargoOrdenClasificado;
	}
	public String getParamCodeEstadoCargoOrdenRuta() {
		return paramCodeEstadoCargoOrdenRuta;
	}
	public void setParamCodeEstadoCargoOrdenRuta(
			String paramCodeEstadoCargoOrdenRuta) {
		this.paramCodeEstadoCargoOrdenRuta = paramCodeEstadoCargoOrdenRuta;
	}
	public String getParamCodeEstadoCargoOrdenEntregado() {
		return paramCodeEstadoCargoOrdenEntregado;
	}
	public void setParamCodeEstadoCargoOrdenEntregado(
			String paramCodeEstadoCargoOrdenEntregado) {
		this.paramCodeEstadoCargoOrdenEntregado = paramCodeEstadoCargoOrdenEntregado;
	}
	public String getParamCodeEstadoCargoOrdenMotivado() {
		return paramCodeEstadoCargoOrdenMotivado;
	}
	public void setParamCodeEstadoCargoOrdenMotivado(
			String paramCodeEstadoCargoOrdenMotivado) {
		this.paramCodeEstadoCargoOrdenMotivado = paramCodeEstadoCargoOrdenMotivado;
	}
	public String getParamCodeEstadoCargoOrdenReenviado() {
		return paramCodeEstadoCargoOrdenReenviado;
	}
	public void setParamCodeEstadoCargoOrdenReenviado(
			String paramCodeEstadoCargoOrdenReenviado) {
		this.paramCodeEstadoCargoOrdenReenviado = paramCodeEstadoCargoOrdenReenviado;
	}
	public String getParamCodeEstadoCargoOrdenFueraZona() {
		return paramCodeEstadoCargoOrdenFueraZona;
	}
	public void setParamCodeEstadoCargoOrdenFueraZona(
			String paramCodeEstadoCargoOrdenFueraZona) {
		this.paramCodeEstadoCargoOrdenFueraZona = paramCodeEstadoCargoOrdenFueraZona;
	}
	public String getParamCodeEstadoCargoOrdenPerdido() {
		return paramCodeEstadoCargoOrdenPerdido;
	}
	public void setParamCodeEstadoCargoOrdenPerdido(
			String paramCodeEstadoCargoOrdenPerdido) {
		this.paramCodeEstadoCargoOrdenPerdido = paramCodeEstadoCargoOrdenPerdido;
	}
	public String getParamCodeEstadoCargoOrdenAnulado() {
		return paramCodeEstadoCargoOrdenAnulado;
	}
	public void setParamCodeEstadoCargoOrdenAnulado(
			String paramCodeEstadoCargoOrdenAnulado) {
		this.paramCodeEstadoCargoOrdenAnulado = paramCodeEstadoCargoOrdenAnulado;
	}
	public String getParamCodeEstadoCargoOrdenNoDistribuido() {
		return paramCodeEstadoCargoOrdenNoDistribuido;
	}
	public void setParamCodeEstadoCargoOrdenNoDistribuido(
			String paramCodeEstadoCargoOrdenNoDistribuido) {
		this.paramCodeEstadoCargoOrdenNoDistribuido = paramCodeEstadoCargoOrdenNoDistribuido;
	}
	public String getParamCodeEstadoCargoOrdenRetenido() {
		return paramCodeEstadoCargoOrdenRetenido;
	}
	public void setParamCodeEstadoCargoOrdenRetenido(
			String paramCodeEstadoCargoOrdenRetenido) {
		this.paramCodeEstadoCargoOrdenRetenido = paramCodeEstadoCargoOrdenRetenido;
	}
	public String getParamCodeEstadoCargoOrdenSinFisico() {
		return paramCodeEstadoCargoOrdenSinFisico;
	}
	public void setParamCodeEstadoCargoOrdenSinFisico(
			String paramCodeEstadoCargoOrdenSinFisico) {
		this.paramCodeEstadoCargoOrdenSinFisico = paramCodeEstadoCargoOrdenSinFisico;
	}
	public String getParamCodeEstadoCargoOrdenProvincia() {
		return paramCodeEstadoCargoOrdenProvincia;
	}
	public void setParamCodeEstadoCargoOrdenProvincia(
			String paramCodeEstadoCargoOrdenProvincia) {
		this.paramCodeEstadoCargoOrdenProvincia = paramCodeEstadoCargoOrdenProvincia;
	}
	public String getParamCodeEstadoCargoOrdenSupervision() {
		return paramCodeEstadoCargoOrdenSupervision;
	}
	public void setParamCodeEstadoCargoOrdenSupervision(
			String paramCodeEstadoCargoOrdenSupervision) {
		this.paramCodeEstadoCargoOrdenSupervision = paramCodeEstadoCargoOrdenSupervision;
	}
	public String getParamCodeEstadoCargoOrdenRobo() {
		return paramCodeEstadoCargoOrdenRobo;
	}
	public void setParamCodeEstadoCargoOrdenRobo(
			String paramCodeEstadoCargoOrdenRobo) {
		this.paramCodeEstadoCargoOrdenRobo = paramCodeEstadoCargoOrdenRobo;
	}
	public String getParamCodeEstadoCargoOrdenSiLlego() {
		return paramCodeEstadoCargoOrdenSiLlego;
	}
	public void setParamCodeEstadoCargoOrdenSiLlego(
			String paramCodeEstadoCargoOrdenSiLlego) {
		this.paramCodeEstadoCargoOrdenSiLlego = paramCodeEstadoCargoOrdenSiLlego;
	}
	public String getParamCodeEstadoCargoOrdenRecepcionado() {
		return paramCodeEstadoCargoOrdenRecepcionado;
	}
	public void setParamCodeEstadoCargoOrdenRecepcionado(
			String paramCodeEstadoCargoOrdenRecepcionado) {
		this.paramCodeEstadoCargoOrdenRecepcionado = paramCodeEstadoCargoOrdenRecepcionado;
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
	public String getParamCodeTipoNegocioMensajeria() {
		return paramCodeTipoNegocioMensajeria;
	}
	public void setParamCodeTipoNegocioMensajeria(
			String paramCodeTipoNegocioMensajeria) {
		this.paramCodeTipoNegocioMensajeria = paramCodeTipoNegocioMensajeria;
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
	public String getParamCodeTipoDocumentoRuc() {
		return paramCodeTipoDocumentoRuc;
	}
	public void setParamCodeTipoDocumentoRuc(String paramCodeTipoDocumentoRuc) {
		this.paramCodeTipoDocumentoRuc = paramCodeTipoDocumentoRuc;
	}
	public String getParamCodeTipoDocumentoDni() {
		return paramCodeTipoDocumentoDni;
	}
	public void setParamCodeTipoDocumentoDni(String paramCodeTipoDocumentoDni) {
		this.paramCodeTipoDocumentoDni = paramCodeTipoDocumentoDni;
	}
	public int getParamCodeEstadoDespacho() {
		return paramCodeEstadoDespacho;
	}
	public void setParamCodeEstadoDespacho(int paramCodeEstadoDespacho) {
		this.paramCodeEstadoDespacho = paramCodeEstadoDespacho;
	}
	public String getParamCodeEstadoDespachoDespacho() {
		return paramCodeEstadoDespachoDespacho;
	}
	public void setParamCodeEstadoDespachoDespacho(
			String paramCodeEstadoDespachoDespacho) {
		this.paramCodeEstadoDespachoDespacho = paramCodeEstadoDespachoDespacho;
	}
	public String getParamCodeEstadoDespachoRuta() {
		return paramCodeEstadoDespachoRuta;
	}
	public void setParamCodeEstadoDespachoRuta(String paramCodeEstadoDespachoRuta) {
		this.paramCodeEstadoDespachoRuta = paramCodeEstadoDespachoRuta;
	}
	public String getParamCodeEstadoDespachoCerrado() {
		return paramCodeEstadoDespachoCerrado;
	}
	public void setParamCodeEstadoDespachoCerrado(
			String paramCodeEstadoDespachoCerrado) {
		this.paramCodeEstadoDespachoCerrado = paramCodeEstadoDespachoCerrado;
	}
	public String getParamCodeEstadoDespachoGenerado() {
		return paramCodeEstadoDespachoGenerado;
	}
	public void setParamCodeEstadoDespachoGenerado(
			String paramCodeEstadoDespachoGenerado) {
		this.paramCodeEstadoDespachoGenerado = paramCodeEstadoDespachoGenerado;
	}
	public String getParamCodeEstadoDespachoPagado() {
		return paramCodeEstadoDespachoPagado;
	}
	public void setParamCodeEstadoDespachoPagado(
			String paramCodeEstadoDespachoPagado) {
		this.paramCodeEstadoDespachoPagado = paramCodeEstadoDespachoPagado;
	}
	public String getParamCodeEstadoDespachoAnulado() {
		return paramCodeEstadoDespachoAnulado;
	}
	public void setParamCodeEstadoDespachoAnulado(
			String paramCodeEstadoDespachoAnulado) {
		this.paramCodeEstadoDespachoAnulado = paramCodeEstadoDespachoAnulado;
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
	public String getParamCodeEstadoOrdenGenerado() {
		return paramCodeEstadoOrdenGenerado;
	}
	public void setParamCodeEstadoOrdenGenerado(String paramCodeEstadoOrdenGenerado) {
		this.paramCodeEstadoOrdenGenerado = paramCodeEstadoOrdenGenerado;
	}
	public String getParamCodeEstadoOrdenPendiente() {
		return paramCodeEstadoOrdenPendiente;
	}
	public void setParamCodeEstadoOrdenPendiente(
			String paramCodeEstadoOrdenPendiente) {
		this.paramCodeEstadoOrdenPendiente = paramCodeEstadoOrdenPendiente;
	}
	public String getParamCodeEstadoOrdenCerrado() {
		return paramCodeEstadoOrdenCerrado;
	}
	public void setParamCodeEstadoOrdenCerrado(String paramCodeEstadoOrdenCerrado) {
		this.paramCodeEstadoOrdenCerrado = paramCodeEstadoOrdenCerrado;
	}
	public String getParamCodeEstadoOrdenAnulado() {
		return paramCodeEstadoOrdenAnulado;
	}
	public void setParamCodeEstadoOrdenAnulado(String paramCodeEstadoOrdenAnulado) {
		this.paramCodeEstadoOrdenAnulado = paramCodeEstadoOrdenAnulado;
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
	public String getParamCodeTipoMonedaNuevoSol() {
		return paramCodeTipoMonedaNuevoSol;
	}
	public void setParamCodeTipoMonedaNuevoSol(String paramCodeTipoMonedaNuevoSol) {
		this.paramCodeTipoMonedaNuevoSol = paramCodeTipoMonedaNuevoSol;
	}
	public String getParamCodeTipoMonedaDolar() {
		return paramCodeTipoMonedaDolar;
	}
	public void setParamCodeTipoMonedaDolar(String paramCodeTipoMonedaDolar) {
		this.paramCodeTipoMonedaDolar = paramCodeTipoMonedaDolar;
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
	public int getParamCodeEstadoFacturado() {
		return paramCodeEstadoFacturado;
	}
	public void setParamCodeEstadoFacturado(int paramCodeEstadoFacturado) {
		this.paramCodeEstadoFacturado = paramCodeEstadoFacturado;
	}
	public String getParamCodeEstadoFacturadoSi() {
		return paramCodeEstadoFacturadoSi;
	}
	public void setParamCodeEstadoFacturadoSi(String paramCodeEstadoFacturadoSi) {
		this.paramCodeEstadoFacturadoSi = paramCodeEstadoFacturadoSi;
	}
	public String getParamCodeEstadoFacturadoNo() {
		return paramCodeEstadoFacturadoNo;
	}
	public void setParamCodeEstadoFacturadoNo(String paramCodeEstadoFacturadoNo) {
		this.paramCodeEstadoFacturadoNo = paramCodeEstadoFacturadoNo;
	}
	public int getParamCodeTipoAmbito() {
		return paramCodeTipoAmbito;
	}
	public void setParamCodeTipoAmbito(int paramCodeTipoAmbito) {
		this.paramCodeTipoAmbito = paramCodeTipoAmbito;
	}
	public String getParamCodeTipoAmbitoLocal() {
		return paramCodeTipoAmbitoLocal;
	}
	public void setParamCodeTipoAmbitoLocal(String paramCodeTipoAmbitoLocal) {
		this.paramCodeTipoAmbitoLocal = paramCodeTipoAmbitoLocal;
	}
	public int getParamCodeEstadoLiquidacion() {
		return paramCodeEstadoLiquidacion;
	}
	public void setParamCodeEstadoLiquidacion(int paramCodeEstadoLiquidacion) {
		this.paramCodeEstadoLiquidacion = paramCodeEstadoLiquidacion;
	}
	public String getParamCodeEstadoLiquidacionPendiente() {
		return paramCodeEstadoLiquidacionPendiente;
	}
	public void setParamCodeEstadoLiquidacionPendiente(
			String paramCodeEstadoLiquidacionPendiente) {
		this.paramCodeEstadoLiquidacionPendiente = paramCodeEstadoLiquidacionPendiente;
	}
	public String getParamCodeEstadoLiquidacionParcial() {
		return paramCodeEstadoLiquidacionParcial;
	}
	public void setParamCodeEstadoLiquidacionParcial(
			String paramCodeEstadoLiquidacionParcial) {
		this.paramCodeEstadoLiquidacionParcial = paramCodeEstadoLiquidacionParcial;
	}
	public String getParamCodeEstadoLiquidacionTotal() {
		return paramCodeEstadoLiquidacionTotal;
	}
	public void setParamCodeEstadoLiquidacionTotal(
			String paramCodeEstadoLiquidacionTotal) {
		this.paramCodeEstadoLiquidacionTotal = paramCodeEstadoLiquidacionTotal;
	}
	public String getParamCodeNoDefinido() {
		return paramCodeNoDefinido;
	}
	public void setParamCodeNoDefinido(String paramCodeNoDefinido) {
		this.paramCodeNoDefinido = paramCodeNoDefinido;
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
	public String getStateProcessCanceled() {
		return stateProcessCanceled;
	}
	public void setStateProcessCanceled(String stateProcessCanceled) {
		this.stateProcessCanceled = stateProcessCanceled;
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
	public String getLoadProcessToGeneric() {
		return loadProcessToGeneric;
	}
	public void setLoadProcessToGeneric(String loadProcessToGeneric) {
		this.loadProcessToGeneric = loadProcessToGeneric;
	}
	public String getLoadProcessToDimensional() {
		return loadProcessToDimensional;
	}
	public void setLoadProcessToDimensional(String loadProcessToDimensional) {
		this.loadProcessToDimensional = loadProcessToDimensional;
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
	public int getMaxHoursProcess() {
		return maxHoursProcess;
	}
	public void setMaxHoursProcess(int maxHoursProcess) {
		this.maxHoursProcess = maxHoursProcess;
	}
	public int getMaxHoursFirstProcess() {
		return maxHoursFirstProcess;
	}
	public void setMaxHoursFirstProcess(int maxHoursFirstProcess) {
		this.maxHoursFirstProcess = maxHoursFirstProcess;
	}
	public int getSizePage() {
		return sizePage;
	}
	public void setSizePage(int sizePage) {
		this.sizePage = sizePage;
	}
	public int getIdTableGenericTAreaCliente() {
		return idTableGenericTAreaCliente;
	}
	public void setIdTableGenericTAreaCliente(int idTableGenericTAreaCliente) {
		this.idTableGenericTAreaCliente = idTableGenericTAreaCliente;
	}
	public int getIdTableGenericTCargo() {
		return idTableGenericTCargo;
	}
	public void setIdTableGenericTCargo(int idTableGenericTCargo) {
		this.idTableGenericTCargo = idTableGenericTCargo;
	}
	public int getIdTableGenericTCargoDespacho() {
		return idTableGenericTCargoDespacho;
	}
	public void setIdTableGenericTCargoDespacho(int idTableGenericTCargoDespacho) {
		this.idTableGenericTCargoDespacho = idTableGenericTCargoDespacho;
	}
	public int getIdTableGenericTCliente() {
		return idTableGenericTCliente;
	}
	public void setIdTableGenericTCliente(int idTableGenericTCliente) {
		this.idTableGenericTCliente = idTableGenericTCliente;
	}
	public int getIdTableGenericTCotizacion() {
		return idTableGenericTCotizacion;
	}
	public void setIdTableGenericTCotizacion(int idTableGenericTCotizacion) {
		this.idTableGenericTCotizacion = idTableGenericTCotizacion;
	}
	public int getIdTableGenericTDespacho() {
		return idTableGenericTDespacho;
	}
	public void setIdTableGenericTDespacho(int idTableGenericTDespacho) {
		this.idTableGenericTDespacho = idTableGenericTDespacho;
	}
	public int getIdTableGenericTEmpleado() {
		return idTableGenericTEmpleado;
	}
	public void setIdTableGenericTEmpleado(int idTableGenericTEmpleado) {
		this.idTableGenericTEmpleado = idTableGenericTEmpleado;
	}
	public int getIdTableGenericTEmpleadoCategoria() {
		return idTableGenericTEmpleadoCategoria;
	}
	public void setIdTableGenericTEmpleadoCategoria(
			int idTableGenericTEmpleadoCategoria) {
		this.idTableGenericTEmpleadoCategoria = idTableGenericTEmpleadoCategoria;
	}
	public int getIdTableGenericTLiquidacion() {
		return idTableGenericTLiquidacion;
	}
	public void setIdTableGenericTLiquidacion(int idTableGenericTLiquidacion) {
		this.idTableGenericTLiquidacion = idTableGenericTLiquidacion;
	}
	public int getIdTableGenericTOrden() {
		return idTableGenericTOrden;
	}
	public void setIdTableGenericTOrden(int idTableGenericTOrden) {
		this.idTableGenericTOrden = idTableGenericTOrden;
	}
	public int getIdTableGenericTParametro() {
		return idTableGenericTParametro;
	}
	public void setIdTableGenericTParametro(int idTableGenericTParametro) {
		this.idTableGenericTParametro = idTableGenericTParametro;
	}
	public int getIdTableGenericTProducto() {
		return idTableGenericTProducto;
	}
	public void setIdTableGenericTProducto(int idTableGenericTProducto) {
		this.idTableGenericTProducto = idTableGenericTProducto;
	}
	public int getIdTableGenericTSede() {
		return idTableGenericTSede;
	}
	public void setIdTableGenericTSede(int idTableGenericTSede) {
		this.idTableGenericTSede = idTableGenericTSede;
	}
	public int getIdTableGenericTServicio() {
		return idTableGenericTServicio;
	}
	public void setIdTableGenericTServicio(int idTableGenericTServicio) {
		this.idTableGenericTServicio = idTableGenericTServicio;
	}
	public int getIdTableGenericTUbigeo() {
		return idTableGenericTUbigeo;
	}
	public void setIdTableGenericTUbigeo(int idTableGenericTUbigeo) {
		this.idTableGenericTUbigeo = idTableGenericTUbigeo;
	}
	public int getIdTableGenericTZona() {
		return idTableGenericTZona;
	}
	public void setIdTableGenericTZona(int idTableGenericTZona) {
		this.idTableGenericTZona = idTableGenericTZona;
	}
	public int getIdTableDimensionalDimCliente() {
		return idTableDimensionalDimCliente;
	}
	public void setIdTableDimensionalDimCliente(int idTableDimensionalDimCliente) {
		this.idTableDimensionalDimCliente = idTableDimensionalDimCliente;
	}
	public int getIdTableDimensionalDimEstado() {
		return idTableDimensionalDimEstado;
	}
	public void setIdTableDimensionalDimEstado(int idTableDimensionalDimEstado) {
		this.idTableDimensionalDimEstado = idTableDimensionalDimEstado;
	}
	public int getIdTableDimensionalDimFacturado() {
		return idTableDimensionalDimFacturado;
	}
	public void setIdTableDimensionalDimFacturado(int idTableDimensionalDimFacturado) {
		this.idTableDimensionalDimFacturado = idTableDimensionalDimFacturado;
	}
	public int getIdTableDimensionalDimMoneda() {
		return idTableDimensionalDimMoneda;
	}
	public void setIdTableDimensionalDimMoneda(int idTableDimensionalDimMoneda) {
		this.idTableDimensionalDimMoneda = idTableDimensionalDimMoneda;
	}
	public int getIdTableDimensionalDimPersonal() {
		return idTableDimensionalDimPersonal;
	}
	public void setIdTableDimensionalDimPersonal(int idTableDimensionalDimPersonal) {
		this.idTableDimensionalDimPersonal = idTableDimensionalDimPersonal;
	}
	public int getIdTableDimensionalDimProducto() {
		return idTableDimensionalDimProducto;
	}
	public void setIdTableDimensionalDimProducto(int idTableDimensionalDimProducto) {
		this.idTableDimensionalDimProducto = idTableDimensionalDimProducto;
	}
	public int getIdTableDimensionalDimSede() {
		return idTableDimensionalDimSede;
	}
	public void setIdTableDimensionalDimSede(int idTableDimensionalDimSede) {
		this.idTableDimensionalDimSede = idTableDimensionalDimSede;
	}
	public int getIdTableDimensionalDimServicio() {
		return idTableDimensionalDimServicio;
	}
	public void setIdTableDimensionalDimServicio(int idTableDimensionalDimServicio) {
		this.idTableDimensionalDimServicio = idTableDimensionalDimServicio;
	}
	public int getIdTableDimensionalDimTiempo() {
		return idTableDimensionalDimTiempo;
	}
	public void setIdTableDimensionalDimTiempo(int idTableDimensionalDimTiempo) {
		this.idTableDimensionalDimTiempo = idTableDimensionalDimTiempo;
	}
	public int getIdTableDimensionalDimTipoDocumento() {
		return idTableDimensionalDimTipoDocumento;
	}
	public void setIdTableDimensionalDimTipoDocumento(
			int idTableDimensionalDimTipoDocumento) {
		this.idTableDimensionalDimTipoDocumento = idTableDimensionalDimTipoDocumento;
	}
	public int getIdTableDimensionalDimTipoPago() {
		return idTableDimensionalDimTipoPago;
	}
	public void setIdTableDimensionalDimTipoPago(int idTableDimensionalDimTipoPago) {
		this.idTableDimensionalDimTipoPago = idTableDimensionalDimTipoPago;
	}
	public int getIdTableDimensionalDimTipoReparto() {
		return idTableDimensionalDimTipoReparto;
	}
	public void setIdTableDimensionalDimTipoReparto(
			int idTableDimensionalDimTipoReparto) {
		this.idTableDimensionalDimTipoReparto = idTableDimensionalDimTipoReparto;
	}
	public int getIdTableDimensionalDimTipoRuta() {
		return idTableDimensionalDimTipoRuta;
	}
	public void setIdTableDimensionalDimTipoRuta(int idTableDimensionalDimTipoRuta) {
		this.idTableDimensionalDimTipoRuta = idTableDimensionalDimTipoRuta;
	}
	public int getIdTableDimensionalDimUbigeo() {
		return idTableDimensionalDimUbigeo;
	}
	public void setIdTableDimensionalDimUbigeo(int idTableDimensionalDimUbigeo) {
		this.idTableDimensionalDimUbigeo = idTableDimensionalDimUbigeo;
	}
	public int getIdTableDimensionalDimZona() {
		return idTableDimensionalDimZona;
	}
	public void setIdTableDimensionalDimZona(int idTableDimensionalDimZona) {
		this.idTableDimensionalDimZona = idTableDimensionalDimZona;
	}
	public int getIdTableDimensionalFactCotizacion() {
		return idTableDimensionalFactCotizacion;
	}
	public void setIdTableDimensionalFactCotizacion(
			int idTableDimensionalFactCotizacion) {
		this.idTableDimensionalFactCotizacion = idTableDimensionalFactCotizacion;
	}
	public int getIdTableDimensionalFactDespacho() {
		return idTableDimensionalFactDespacho;
	}
	public void setIdTableDimensionalFactDespacho(int idTableDimensionalFactDespacho) {
		this.idTableDimensionalFactDespacho = idTableDimensionalFactDespacho;
	}
	public int getIdTableDimensionalFactEnvio() {
		return idTableDimensionalFactEnvio;
	}
	public void setIdTableDimensionalFactEnvio(int idTableDimensionalFactEnvio) {
		this.idTableDimensionalFactEnvio = idTableDimensionalFactEnvio;
	}
	public int getIdTableDimensionalFactOrden() {
		return idTableDimensionalFactOrden;
	}
	public void setIdTableDimensionalFactOrden(int idTableDimensionalFactOrden) {
		this.idTableDimensionalFactOrden = idTableDimensionalFactOrden;
	}
	@Override
	public String toString() {
		return "Constantes [paramCodeTipoAreaCliente="
				+ paramCodeTipoAreaCliente + ", paramCodeEstadoCargoDespacho="
				+ paramCodeEstadoCargoDespacho
				+ ", paramCodeEstadoCargoDespachoDigitado="
				+ paramCodeEstadoCargoDespachoDigitado
				+ ", paramCodeEstadoCargoDespachoRuta="
				+ paramCodeEstadoCargoDespachoRuta
				+ ", paramCodeEstadoCargoDespachoEntregado="
				+ paramCodeEstadoCargoDespachoEntregado
				+ ", paramCodeEstadoCargoDespachoMotivado="
				+ paramCodeEstadoCargoDespachoMotivado
				+ ", paramCodeEstadoCargoDespachoReenviado="
				+ paramCodeEstadoCargoDespachoReenviado
				+ ", paramCodeEstadoCargoDespachoFueraZona="
				+ paramCodeEstadoCargoDespachoFueraZona
				+ ", paramCodeEstadoCargoDespachoPerdido="
				+ paramCodeEstadoCargoDespachoPerdido
				+ ", paramCodeEstadoCargoDespachoAnulado="
				+ paramCodeEstadoCargoDespachoAnulado
				+ ", paramCodeEstadoCargoDespachoNoDistribuido="
				+ paramCodeEstadoCargoDespachoNoDistribuido
				+ ", paramCodeEstadoCargoDespachoRetenido="
				+ paramCodeEstadoCargoDespachoRetenido
				+ ", paramCodeEstadoCargoDespachoSinFisico="
				+ paramCodeEstadoCargoDespachoSinFisico
				+ ", paramCodeEstadoCargoDespachoProvincia="
				+ paramCodeEstadoCargoDespachoProvincia
				+ ", paramCodeEstadoCargoDespachoSupervision="
				+ paramCodeEstadoCargoDespachoSupervision
				+ ", paramCodeEstadoCargoDespachoRobo="
				+ paramCodeEstadoCargoDespachoRobo
				+ ", paramCodeEstadoCargoDespachoVerificacion="
				+ paramCodeEstadoCargoDespachoVerificacion
				+ ", paramCodeMotivoCargoDespacho="
				+ paramCodeMotivoCargoDespacho + ", paramCodeEstadoCargo="
				+ paramCodeEstadoCargo + ", paramCodeEstadoCargoOrdenDigitado="
				+ paramCodeEstadoCargoOrdenDigitado
				+ ", paramCodeEstadoCargoOrdenClasificado="
				+ paramCodeEstadoCargoOrdenClasificado
				+ ", paramCodeEstadoCargoOrdenRuta="
				+ paramCodeEstadoCargoOrdenRuta
				+ ", paramCodeEstadoCargoOrdenEntregado="
				+ paramCodeEstadoCargoOrdenEntregado
				+ ", paramCodeEstadoCargoOrdenMotivado="
				+ paramCodeEstadoCargoOrdenMotivado
				+ ", paramCodeEstadoCargoOrdenReenviado="
				+ paramCodeEstadoCargoOrdenReenviado
				+ ", paramCodeEstadoCargoOrdenFueraZona="
				+ paramCodeEstadoCargoOrdenFueraZona
				+ ", paramCodeEstadoCargoOrdenPerdido="
				+ paramCodeEstadoCargoOrdenPerdido
				+ ", paramCodeEstadoCargoOrdenAnulado="
				+ paramCodeEstadoCargoOrdenAnulado
				+ ", paramCodeEstadoCargoOrdenNoDistribuido="
				+ paramCodeEstadoCargoOrdenNoDistribuido
				+ ", paramCodeEstadoCargoOrdenRetenido="
				+ paramCodeEstadoCargoOrdenRetenido
				+ ", paramCodeEstadoCargoOrdenSinFisico="
				+ paramCodeEstadoCargoOrdenSinFisico
				+ ", paramCodeEstadoCargoOrdenProvincia="
				+ paramCodeEstadoCargoOrdenProvincia
				+ ", paramCodeEstadoCargoOrdenSupervision="
				+ paramCodeEstadoCargoOrdenSupervision
				+ ", paramCodeEstadoCargoOrdenRobo="
				+ paramCodeEstadoCargoOrdenRobo
				+ ", paramCodeEstadoCargoOrdenSiLlego="
				+ paramCodeEstadoCargoOrdenSiLlego
				+ ", paramCodeEstadoCargoOrdenRecepcionado="
				+ paramCodeEstadoCargoOrdenRecepcionado
				+ ", paramCodeMotivoCargo=" + paramCodeMotivoCargo
				+ ", paramCodeTipoIngresoCargo=" + paramCodeTipoIngresoCargo
				+ ", paramCodeCategoriaCliente=" + paramCodeCategoriaCliente
				+ ", paramCodeTipoCliente=" + paramCodeTipoCliente
				+ ", paramCodeTipoCredito=" + paramCodeTipoCredito
				+ ", paramCodeTipoDocumentoTrabajo="
				+ paramCodeTipoDocumentoTrabajo + ", paramCodeTipoFacturacion="
				+ paramCodeTipoFacturacion + ", paramCodeTipoCambio="
				+ paramCodeTipoCambio + ", paramCodeEstadoCotizacion="
				+ paramCodeEstadoCotizacion + ", paramCodeTipoNegocio="
				+ paramCodeTipoNegocio + ", paramCodeTipoNegocioMensajeria="
				+ paramCodeTipoNegocioMensajeria + ", paramCodeTipoServicio="
				+ paramCodeTipoServicio + ", paramCodeTipoDocumento="
				+ paramCodeTipoDocumento + ", paramCodeTipoDocumentoRuc="
				+ paramCodeTipoDocumentoRuc + ", paramCodeTipoDocumentoDni="
				+ paramCodeTipoDocumentoDni + ", paramCodeEstadoDespacho="
				+ paramCodeEstadoDespacho
				+ ", paramCodeEstadoDespachoDespacho="
				+ paramCodeEstadoDespachoDespacho
				+ ", paramCodeEstadoDespachoRuta="
				+ paramCodeEstadoDespachoRuta
				+ ", paramCodeEstadoDespachoCerrado="
				+ paramCodeEstadoDespachoCerrado
				+ ", paramCodeEstadoDespachoGenerado="
				+ paramCodeEstadoDespachoGenerado
				+ ", paramCodeEstadoDespachoPagado="
				+ paramCodeEstadoDespachoPagado
				+ ", paramCodeEstadoDespachoAnulado="
				+ paramCodeEstadoDespachoAnulado
				+ ", paramCodeEstadoDespachoVerificacion="
				+ paramCodeEstadoDespachoVerificacion
				+ ", paramCodeTipoDespacho=" + paramCodeTipoDespacho
				+ ", paramCodeTipoRuta=" + paramCodeTipoRuta
				+ ", paramCodeCategoriaEmpleado=" + paramCodeCategoriaEmpleado
				+ ", paramCodeEstadoOrden=" + paramCodeEstadoOrden
				+ ", paramCodeEstadoOrdenGenerado="
				+ paramCodeEstadoOrdenGenerado
				+ ", paramCodeEstadoOrdenPendiente="
				+ paramCodeEstadoOrdenPendiente
				+ ", paramCodeEstadoOrdenCerrado="
				+ paramCodeEstadoOrdenCerrado
				+ ", paramCodeEstadoOrdenAnulado="
				+ paramCodeEstadoOrdenAnulado + ", paramCodeTipoIngreso="
				+ paramCodeTipoIngreso + ", paramCodeTipoMoneda="
				+ paramCodeTipoMoneda + ", paramCodeTipoMonedaNuevoSol="
				+ paramCodeTipoMonedaNuevoSol + ", paramCodeTipoMonedaDolar="
				+ paramCodeTipoMonedaDolar + ", paramCodeTipoPago="
				+ paramCodeTipoPago + ", paramCodeTipoReparto="
				+ paramCodeTipoReparto + ", paramCodeTipoProducto="
				+ paramCodeTipoProducto + ", paramCodeTipoSede="
				+ paramCodeTipoSede + ", paramCodeUbigeoPais="
				+ paramCodeUbigeoPais + ", paramCodeUbigeoDepartamento="
				+ paramCodeUbigeoDepartamento + ", paramCodeUbigeoProvincia="
				+ paramCodeUbigeoProvincia + ", paramCodeUbigeoDistrito="
				+ paramCodeUbigeoDistrito + ", paramCodeEstadoFacturado="
				+ paramCodeEstadoFacturado + ", paramCodeEstadoFacturadoSi="
				+ paramCodeEstadoFacturadoSi + ", paramCodeEstadoFacturadoNo="
				+ paramCodeEstadoFacturadoNo + ", paramCodeTipoAmbito="
				+ paramCodeTipoAmbito + ", paramCodeTipoAmbitoLocal="
				+ paramCodeTipoAmbitoLocal + ", paramCodeEstadoLiquidacion="
				+ paramCodeEstadoLiquidacion
				+ ", paramCodeEstadoLiquidacionPendiente="
				+ paramCodeEstadoLiquidacionPendiente
				+ ", paramCodeEstadoLiquidacionParcial="
				+ paramCodeEstadoLiquidacionParcial
				+ ", paramCodeEstadoLiquidacionTotal="
				+ paramCodeEstadoLiquidacionTotal + ", paramCodeNoDefinido="
				+ paramCodeNoDefinido + ", valueStringDefault="
				+ valueStringDefault + ", valueNumberDefault="
				+ valueNumberDefault + ", valueNumberUnit=" + valueNumberUnit
				+ ", valueNumberCero=" + valueNumberCero + ", stateRecordNew="
				+ stateRecordNew + ", stateRecordProcessed="
				+ stateRecordProcessed + ", stateRecordInconsistent="
				+ stateRecordInconsistent + ", stateProcessStarted="
				+ stateProcessStarted + ", stateProcessCompletedCorrectly="
				+ stateProcessCompletedCorrectly
				+ ", stateProcessCompletedErrors="
				+ stateProcessCompletedErrors + ", stateProcessCanceled="
				+ stateProcessCanceled + ", typeProcessSimple="
				+ typeProcessSimple + ", typeProcessReProcess="
				+ typeProcessReProcess + ", loadProcessToGeneric="
				+ loadProcessToGeneric + ", loadProcessToDimensional="
				+ loadProcessToDimensional + ", resultTransactionNoResult="
				+ resultTransactionNoResult + ", resultProcessStarted="
				+ resultProcessStarted + ", resultProcessCompletedCorrectly="
				+ resultProcessCompletedCorrectly
				+ ", resultProcessCompletedErrors="
				+ resultProcessCompletedErrors + ", sizePage=" + sizePage
				+ ", idTableGenericTAreaCliente=" + idTableGenericTAreaCliente
				+ ", idTableGenericTCargo=" + idTableGenericTCargo
				+ ", idTableGenericTCargoDespacho="
				+ idTableGenericTCargoDespacho + ", idTableGenericTCliente="
				+ idTableGenericTCliente + ", idTableGenericTCotizacion="
				+ idTableGenericTCotizacion + ", idTableGenericTDespacho="
				+ idTableGenericTDespacho + ", idTableGenericTEmpleado="
				+ idTableGenericTEmpleado
				+ ", idTableGenericTEmpleadoCategoria="
				+ idTableGenericTEmpleadoCategoria
				+ ", idTableGenericTLiquidacion=" + idTableGenericTLiquidacion
				+ ", idTableGenericTOrden=" + idTableGenericTOrden
				+ ", idTableGenericTParametro=" + idTableGenericTParametro
				+ ", idTableGenericTProducto=" + idTableGenericTProducto
				+ ", idTableGenericTSede=" + idTableGenericTSede
				+ ", idTableGenericTServicio=" + idTableGenericTServicio
				+ ", idTableGenericTUbigeo=" + idTableGenericTUbigeo
				+ ", idTableGenericTZona=" + idTableGenericTZona
				+ ", idTableDimensionalDimCliente="
				+ idTableDimensionalDimCliente
				+ ", idTableDimensionalDimEstado="
				+ idTableDimensionalDimEstado
				+ ", idTableDimensionalDimFacturado="
				+ idTableDimensionalDimFacturado
				+ ", idTableDimensionalDimMoneda="
				+ idTableDimensionalDimMoneda
				+ ", idTableDimensionalDimPersonal="
				+ idTableDimensionalDimPersonal
				+ ", idTableDimensionalDimProducto="
				+ idTableDimensionalDimProducto
				+ ", idTableDimensionalDimSede=" + idTableDimensionalDimSede
				+ ", idTableDimensionalDimServicio="
				+ idTableDimensionalDimServicio
				+ ", idTableDimensionalDimTiempo="
				+ idTableDimensionalDimTiempo
				+ ", idTableDimensionalDimTipoDocumento="
				+ idTableDimensionalDimTipoDocumento
				+ ", idTableDimensionalDimTipoPago="
				+ idTableDimensionalDimTipoPago
				+ ", idTableDimensionalDimTipoReparto="
				+ idTableDimensionalDimTipoReparto
				+ ", idTableDimensionalDimTipoRuta="
				+ idTableDimensionalDimTipoRuta
				+ ", idTableDimensionalDimUbigeo="
				+ idTableDimensionalDimUbigeo + ", idTableDimensionalDimZona="
				+ idTableDimensionalDimZona
				+ ", idTableDimensionalFactCotizacion="
				+ idTableDimensionalFactCotizacion
				+ ", idTableDimensionalFactDespacho="
				+ idTableDimensionalFactDespacho
				+ ", idTableDimensionalFactEnvio="
				+ idTableDimensionalFactEnvio
				+ ", idTableDimensionalFactOrden="
				+ idTableDimensionalFactOrden + "]";
	}
}


