package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.math.BigDecimal;

public class FactCotizacion {
    private Integer cotizacionKey;

    private Integer cotizacionKeyCliente;

    private Integer cotizacionKeyServicio;

    private Integer cotizacionKeyProducto;

    private Integer cotizacionKeyFecReg;

    private Integer cotizacionKeyFecApro;

    private Integer cotizacionKeyFecIni;

    private Integer cotizacionKeyFecFin;

    private Integer cotizacionKeyEstado;

    private Short cotizacionCnt;

    private Integer cotizacionCntOrdTotal;

    private Integer cotizacionCntOrdEnTrab;

    private Integer cotizacionCntOrdCer;

    private Integer cotizacionCntOrdCatiempo;

    private Integer cotizacionCntOrdCftiempo;

    private Integer cotizacionCntOrdFac;

    private Integer cotizacionCntOrdCan;

    private BigDecimal cotizacionMonImporte;

    private BigDecimal cotizacionMonIgv;

    private BigDecimal cotizacionMonTotal;

    public Integer getCotizacionKey() {
        return cotizacionKey;
    }

    public void setCotizacionKey(Integer cotizacionKey) {
        this.cotizacionKey = cotizacionKey;
    }

    public Integer getCotizacionKeyCliente() {
        return cotizacionKeyCliente;
    }

    public void setCotizacionKeyCliente(Integer cotizacionKeyCliente) {
        this.cotizacionKeyCliente = cotizacionKeyCliente;
    }

    public Integer getCotizacionKeyServicio() {
        return cotizacionKeyServicio;
    }

    public void setCotizacionKeyServicio(Integer cotizacionKeyServicio) {
        this.cotizacionKeyServicio = cotizacionKeyServicio;
    }

    public Integer getCotizacionKeyProducto() {
        return cotizacionKeyProducto;
    }

    public void setCotizacionKeyProducto(Integer cotizacionKeyProducto) {
        this.cotizacionKeyProducto = cotizacionKeyProducto;
    }

    public Integer getCotizacionKeyFecReg() {
        return cotizacionKeyFecReg;
    }

    public void setCotizacionKeyFecReg(Integer cotizacionKeyFecReg) {
        this.cotizacionKeyFecReg = cotizacionKeyFecReg;
    }

    public Integer getCotizacionKeyFecApro() {
        return cotizacionKeyFecApro;
    }

    public void setCotizacionKeyFecApro(Integer cotizacionKeyFecApro) {
        this.cotizacionKeyFecApro = cotizacionKeyFecApro;
    }

    public Integer getCotizacionKeyFecIni() {
        return cotizacionKeyFecIni;
    }

    public void setCotizacionKeyFecIni(Integer cotizacionKeyFecIni) {
        this.cotizacionKeyFecIni = cotizacionKeyFecIni;
    }

    public Integer getCotizacionKeyFecFin() {
        return cotizacionKeyFecFin;
    }

    public void setCotizacionKeyFecFin(Integer cotizacionKeyFecFin) {
        this.cotizacionKeyFecFin = cotizacionKeyFecFin;
    }

    public Integer getCotizacionKeyEstado() {
        return cotizacionKeyEstado;
    }

    public void setCotizacionKeyEstado(Integer cotizacionKeyEstado) {
        this.cotizacionKeyEstado = cotizacionKeyEstado;
    }

    public Short getCotizacionCnt() {
        return cotizacionCnt;
    }

    public void setCotizacionCnt(Short cotizacionCnt) {
        this.cotizacionCnt = cotizacionCnt;
    }

    public Integer getCotizacionCntOrdTotal() {
        return cotizacionCntOrdTotal;
    }

    public void setCotizacionCntOrdTotal(Integer cotizacionCntOrdTotal) {
        this.cotizacionCntOrdTotal = cotizacionCntOrdTotal;
    }

    public Integer getCotizacionCntOrdEnTrab() {
        return cotizacionCntOrdEnTrab;
    }

    public void setCotizacionCntOrdEnTrab(Integer cotizacionCntOrdEnTrab) {
        this.cotizacionCntOrdEnTrab = cotizacionCntOrdEnTrab;
    }

    public Integer getCotizacionCntOrdCer() {
        return cotizacionCntOrdCer;
    }

    public void setCotizacionCntOrdCer(Integer cotizacionCntOrdCer) {
        this.cotizacionCntOrdCer = cotizacionCntOrdCer;
    }

    public Integer getCotizacionCntOrdCatiempo() {
        return cotizacionCntOrdCatiempo;
    }

    public void setCotizacionCntOrdCatiempo(Integer cotizacionCntOrdCatiempo) {
        this.cotizacionCntOrdCatiempo = cotizacionCntOrdCatiempo;
    }

    public Integer getCotizacionCntOrdCftiempo() {
        return cotizacionCntOrdCftiempo;
    }

    public void setCotizacionCntOrdCftiempo(Integer cotizacionCntOrdCftiempo) {
        this.cotizacionCntOrdCftiempo = cotizacionCntOrdCftiempo;
    }

    public Integer getCotizacionCntOrdFac() {
        return cotizacionCntOrdFac;
    }

    public void setCotizacionCntOrdFac(Integer cotizacionCntOrdFac) {
        this.cotizacionCntOrdFac = cotizacionCntOrdFac;
    }

    public Integer getCotizacionCntOrdCan() {
        return cotizacionCntOrdCan;
    }

    public void setCotizacionCntOrdCan(Integer cotizacionCntOrdCan) {
        this.cotizacionCntOrdCan = cotizacionCntOrdCan;
    }

    public BigDecimal getCotizacionMonImporte() {
        return cotizacionMonImporte;
    }

    public void setCotizacionMonImporte(BigDecimal cotizacionMonImporte) {
        this.cotizacionMonImporte = cotizacionMonImporte;
    }

    public BigDecimal getCotizacionMonIgv() {
        return cotizacionMonIgv;
    }

    public void setCotizacionMonIgv(BigDecimal cotizacionMonIgv) {
        this.cotizacionMonIgv = cotizacionMonIgv;
    }

    public BigDecimal getCotizacionMonTotal() {
        return cotizacionMonTotal;
    }

    public void setCotizacionMonTotal(BigDecimal cotizacionMonTotal) {
        this.cotizacionMonTotal = cotizacionMonTotal;
    }

	@Override
	public String toString() {
		return "FactCotizacion [cotizacionKey=" + cotizacionKey
				+ ", cotizacionKeyCliente=" + cotizacionKeyCliente
				+ ", cotizacionKeyServicio=" + cotizacionKeyServicio
				+ ", cotizacionKeyProducto=" + cotizacionKeyProducto
				+ ", cotizacionKeyFecReg=" + cotizacionKeyFecReg
				+ ", cotizacionKeyFecApro=" + cotizacionKeyFecApro
				+ ", cotizacionKeyFecIni=" + cotizacionKeyFecIni
				+ ", cotizacionKeyFecFin=" + cotizacionKeyFecFin
				+ ", cotizacionKeyEstado=" + cotizacionKeyEstado
				+ ", cotizacionCnt=" + cotizacionCnt
				+ ", cotizacionCntOrdTotal=" + cotizacionCntOrdTotal
				+ ", cotizacionCntOrdEnTrab=" + cotizacionCntOrdEnTrab
				+ ", cotizacionCntOrdCer=" + cotizacionCntOrdCer
				+ ", cotizacionCntOrdCatiempo=" + cotizacionCntOrdCatiempo
				+ ", cotizacionCntOrdCftiempo=" + cotizacionCntOrdCftiempo
				+ ", cotizacionCntOrdFac=" + cotizacionCntOrdFac
				+ ", cotizacionCntOrdCan=" + cotizacionCntOrdCan
				+ ", cotizacionMonImporte=" + cotizacionMonImporte
				+ ", cotizacionMonIgv=" + cotizacionMonIgv
				+ ", cotizacionMonTotal=" + cotizacionMonTotal + "]";
	}
}