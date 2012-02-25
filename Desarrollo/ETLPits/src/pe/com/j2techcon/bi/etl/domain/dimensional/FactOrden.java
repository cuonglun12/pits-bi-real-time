package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.math.BigDecimal;

public class FactOrden {
    private Integer ordenKey;

    private Integer ordenKeyCliente;

    private Integer ordenKeyServicio;

    private Integer ordenKeyProducto;

    private Integer ordenKeyTipoReparto;

    private Integer ordenKeyTipoDocumento;

    private Integer ordenKeyTipoPago;

    private Integer ordenKeyMoneda;

    private Integer ordenKeyFecReg;

    private Integer ordenKeyFecIni;

    private Integer ordenKeyFecVen;

    private Integer ordenKeyFecCie;

    private Integer ordenKeyFecDev;

    private Integer ordenKeyEstado;

    private Short ordenAtenEnFec;

    private Short ordenAtenFueraFec;

    private Short ordenIndUnidad;

    private Integer ordenCntDiasExc;

    private Integer ordenCntCargos;

    private Integer ordenCntCargosAnu;

    private Integer ordenCntCargosEnt;

    private Integer ordenCntCargosFueZon;

    private Integer ordenCntCargosMot;

    private Integer ordenCntCargosPerd;

    private Integer ordenCntCargosRee;

    private BigDecimal ordenMonImporte;

    private BigDecimal ordenMonDescuento;

    private BigDecimal ordenMonIgv;

    private BigDecimal ordenMonTotal;

    public Integer getOrdenKey() {
        return ordenKey;
    }

    public void setOrdenKey(Integer ordenKey) {
        this.ordenKey = ordenKey;
    }

    public Integer getOrdenKeyCliente() {
        return ordenKeyCliente;
    }

    public void setOrdenKeyCliente(Integer ordenKeyCliente) {
        this.ordenKeyCliente = ordenKeyCliente;
    }

    public Integer getOrdenKeyServicio() {
        return ordenKeyServicio;
    }

    public void setOrdenKeyServicio(Integer ordenKeyServicio) {
        this.ordenKeyServicio = ordenKeyServicio;
    }

    public Integer getOrdenKeyProducto() {
        return ordenKeyProducto;
    }

    public void setOrdenKeyProducto(Integer ordenKeyProducto) {
        this.ordenKeyProducto = ordenKeyProducto;
    }

    public Integer getOrdenKeyTipoReparto() {
        return ordenKeyTipoReparto;
    }

    public void setOrdenKeyTipoReparto(Integer ordenKeyTipoReparto) {
        this.ordenKeyTipoReparto = ordenKeyTipoReparto;
    }

    public Integer getOrdenKeyTipoDocumento() {
        return ordenKeyTipoDocumento;
    }

    public void setOrdenKeyTipoDocumento(Integer ordenKeyTipoDocumento) {
        this.ordenKeyTipoDocumento = ordenKeyTipoDocumento;
    }

    public Integer getOrdenKeyTipoPago() {
        return ordenKeyTipoPago;
    }

    public void setOrdenKeyTipoPago(Integer ordenKeyTipoPago) {
        this.ordenKeyTipoPago = ordenKeyTipoPago;
    }

    public Integer getOrdenKeyMoneda() {
        return ordenKeyMoneda;
    }

    public void setOrdenKeyMoneda(Integer ordenKeyMoneda) {
        this.ordenKeyMoneda = ordenKeyMoneda;
    }

    public Integer getOrdenKeyFecReg() {
        return ordenKeyFecReg;
    }

    public void setOrdenKeyFecReg(Integer ordenKeyFecReg) {
        this.ordenKeyFecReg = ordenKeyFecReg;
    }

    public Integer getOrdenKeyFecIni() {
        return ordenKeyFecIni;
    }

    public void setOrdenKeyFecIni(Integer ordenKeyFecIni) {
        this.ordenKeyFecIni = ordenKeyFecIni;
    }

    public Integer getOrdenKeyFecVen() {
        return ordenKeyFecVen;
    }

    public void setOrdenKeyFecVen(Integer ordenKeyFecVen) {
        this.ordenKeyFecVen = ordenKeyFecVen;
    }

    public Integer getOrdenKeyFecCie() {
        return ordenKeyFecCie;
    }

    public void setOrdenKeyFecCie(Integer ordenKeyFecCie) {
        this.ordenKeyFecCie = ordenKeyFecCie;
    }

    public Integer getOrdenKeyFecDev() {
        return ordenKeyFecDev;
    }

    public void setOrdenKeyFecDev(Integer ordenKeyFecDev) {
        this.ordenKeyFecDev = ordenKeyFecDev;
    }

    public Integer getOrdenKeyEstado() {
        return ordenKeyEstado;
    }

    public void setOrdenKeyEstado(Integer ordenKeyEstado) {
        this.ordenKeyEstado = ordenKeyEstado;
    }

    public Short getOrdenAtenEnFec() {
        return ordenAtenEnFec;
    }

    public void setOrdenAtenEnFec(Short ordenAtenEnFec) {
        this.ordenAtenEnFec = ordenAtenEnFec;
    }

    public Short getOrdenAtenFueraFec() {
        return ordenAtenFueraFec;
    }

    public void setOrdenAtenFueraFec(Short ordenAtenFueraFec) {
        this.ordenAtenFueraFec = ordenAtenFueraFec;
    }

    public Short getOrdenIndUnidad() {
        return ordenIndUnidad;
    }

    public void setOrdenIndUnidad(Short ordenIndUnidad) {
        this.ordenIndUnidad = ordenIndUnidad;
    }

    public Integer getOrdenCntDiasExc() {
        return ordenCntDiasExc;
    }

    public void setOrdenCntDiasExc(Integer ordenCntDiasExc) {
        this.ordenCntDiasExc = ordenCntDiasExc;
    }

    public Integer getOrdenCntCargos() {
        return ordenCntCargos;
    }

    public void setOrdenCntCargos(Integer ordenCntCargos) {
        this.ordenCntCargos = ordenCntCargos;
    }

    public Integer getOrdenCntCargosAnu() {
        return ordenCntCargosAnu;
    }

    public void setOrdenCntCargosAnu(Integer ordenCntCargosAnu) {
        this.ordenCntCargosAnu = ordenCntCargosAnu;
    }

    public Integer getOrdenCntCargosEnt() {
        return ordenCntCargosEnt;
    }

    public void setOrdenCntCargosEnt(Integer ordenCntCargosEnt) {
        this.ordenCntCargosEnt = ordenCntCargosEnt;
    }

    public Integer getOrdenCntCargosFueZon() {
        return ordenCntCargosFueZon;
    }

    public void setOrdenCntCargosFueZon(Integer ordenCntCargosFueZon) {
        this.ordenCntCargosFueZon = ordenCntCargosFueZon;
    }

    public Integer getOrdenCntCargosMot() {
        return ordenCntCargosMot;
    }

    public void setOrdenCntCargosMot(Integer ordenCntCargosMot) {
        this.ordenCntCargosMot = ordenCntCargosMot;
    }

    public Integer getOrdenCntCargosPerd() {
        return ordenCntCargosPerd;
    }

    public void setOrdenCntCargosPerd(Integer ordenCntCargosPerd) {
        this.ordenCntCargosPerd = ordenCntCargosPerd;
    }

    public Integer getOrdenCntCargosRee() {
        return ordenCntCargosRee;
    }

    public void setOrdenCntCargosRee(Integer ordenCntCargosRee) {
        this.ordenCntCargosRee = ordenCntCargosRee;
    }

    public BigDecimal getOrdenMonImporte() {
        return ordenMonImporte;
    }

    public void setOrdenMonImporte(BigDecimal ordenMonImporte) {
        this.ordenMonImporte = ordenMonImporte;
    }

    public BigDecimal getOrdenMonDescuento() {
        return ordenMonDescuento;
    }

    public void setOrdenMonDescuento(BigDecimal ordenMonDescuento) {
        this.ordenMonDescuento = ordenMonDescuento;
    }

    public BigDecimal getOrdenMonIgv() {
        return ordenMonIgv;
    }

    public void setOrdenMonIgv(BigDecimal ordenMonIgv) {
        this.ordenMonIgv = ordenMonIgv;
    }

    public BigDecimal getOrdenMonTotal() {
        return ordenMonTotal;
    }

    public void setOrdenMonTotal(BigDecimal ordenMonTotal) {
        this.ordenMonTotal = ordenMonTotal;
    }

	@Override
	public String toString() {
		return "FactOrden [ordenKey=" + ordenKey + ", ordenKeyCliente="
				+ ordenKeyCliente + ", ordenKeyServicio=" + ordenKeyServicio
				+ ", ordenKeyProducto=" + ordenKeyProducto
				+ ", ordenKeyTipoReparto=" + ordenKeyTipoReparto
				+ ", ordenKeyTipoDocumento=" + ordenKeyTipoDocumento
				+ ", ordenKeyTipoPago=" + ordenKeyTipoPago
				+ ", ordenKeyMoneda=" + ordenKeyMoneda + ", ordenKeyFecReg="
				+ ordenKeyFecReg + ", ordenKeyFecIni=" + ordenKeyFecIni
				+ ", ordenKeyFecVen=" + ordenKeyFecVen + ", ordenKeyFecCie="
				+ ordenKeyFecCie + ", ordenKeyFecDev=" + ordenKeyFecDev
				+ ", ordenKeyEstado=" + ordenKeyEstado + ", ordenAtenEnFec="
				+ ordenAtenEnFec + ", ordenAtenFueraFec=" + ordenAtenFueraFec
				+ ", ordenIndUnidad=" + ordenIndUnidad + ", ordenCntDiasExc="
				+ ordenCntDiasExc + ", ordenCntCargos=" + ordenCntCargos
				+ ", ordenCntCargosAnu=" + ordenCntCargosAnu
				+ ", ordenCntCargosEnt=" + ordenCntCargosEnt
				+ ", ordenCntCargosFueZon=" + ordenCntCargosFueZon
				+ ", ordenCntCargosMot=" + ordenCntCargosMot
				+ ", ordenCntCargosPerd=" + ordenCntCargosPerd
				+ ", ordenCntCargosRee=" + ordenCntCargosRee
				+ ", ordenMonImporte=" + ordenMonImporte
				+ ", ordenMonDescuento=" + ordenMonDescuento + ", ordenMonIgv="
				+ ordenMonIgv + ", ordenMonTotal=" + ordenMonTotal + "]";
	}
}