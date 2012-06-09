package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.math.BigDecimal;

public class FactCotizacion {
    private Integer cotizacionKey;

    private Integer cotizacionKeyClienteArea;

    private Integer cotizacionKeyUbigeoCliente;

    private Integer cotizacionKeyServicio;

    private Integer cotizacionKeyProducto;

    private Integer cotizacionKeyFecApro;

    private Integer cotizacionKeyFecIni;

    private Integer cotizacionKeyFecFin;

    private Integer cotizacionKeyEstado;

    private Short cotizacionIndUnidad;

    private Integer cotizacionCntOrdTotal;

    private Integer cotizacionCntOrdEnTrab;

    private Integer cotizacionCntOrdCer;

    private Integer cotizacionCntOrdCatiempo;

    private Integer cotizacionCntOrdCftiempo;

    private Integer cotizacionCntOrdFac;

    private Integer cotizacionCntOrdCan;

    private BigDecimal cotizacionMonOrdTot;

    private BigDecimal cotizacionMonOrdCan;

    private BigDecimal cotizacionMonOrdFac;

    private Integer procId;

    public Integer getCotizacionKey() {
        return cotizacionKey;
    }

    public void setCotizacionKey(Integer cotizacionKey) {
        this.cotizacionKey = cotizacionKey;
    }

    public Integer getCotizacionKeyClienteArea() {
        return cotizacionKeyClienteArea;
    }

    public void setCotizacionKeyClienteArea(Integer cotizacionKeyClienteArea) {
        this.cotizacionKeyClienteArea = cotizacionKeyClienteArea;
    }

    public Integer getCotizacionKeyUbigeoCliente() {
        return cotizacionKeyUbigeoCliente;
    }

    public void setCotizacionKeyUbigeoCliente(Integer cotizacionKeyUbigeoCliente) {
        this.cotizacionKeyUbigeoCliente = cotizacionKeyUbigeoCliente;
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

    public Short getCotizacionIndUnidad() {
        return cotizacionIndUnidad;
    }

    public void setCotizacionIndUnidad(Short cotizacionIndUnidad) {
        this.cotizacionIndUnidad = cotizacionIndUnidad;
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

    public BigDecimal getCotizacionMonOrdTot() {
        return cotizacionMonOrdTot;
    }

    public void setCotizacionMonOrdTot(BigDecimal cotizacionMonOrdTot) {
        this.cotizacionMonOrdTot = cotizacionMonOrdTot;
    }

    public BigDecimal getCotizacionMonOrdCan() {
        return cotizacionMonOrdCan;
    }

    public void setCotizacionMonOrdCan(BigDecimal cotizacionMonOrdCan) {
        this.cotizacionMonOrdCan = cotizacionMonOrdCan;
    }

    public BigDecimal getCotizacionMonOrdFac() {
        return cotizacionMonOrdFac;
    }

    public void setCotizacionMonOrdFac(BigDecimal cotizacionMonOrdFac) {
        this.cotizacionMonOrdFac = cotizacionMonOrdFac;
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }

    public void clear(){
    	cotizacionKey=null;
    	cotizacionKeyClienteArea=null;
    	cotizacionKeyUbigeoCliente=null;
    	cotizacionKeyServicio=null;
    	cotizacionKeyProducto=null;
    	cotizacionKeyFecApro=null;
    	cotizacionKeyFecIni=null;
    	cotizacionKeyFecFin=null;
    	cotizacionKeyEstado=null;
    	cotizacionIndUnidad=null;
    	cotizacionCntOrdTotal=null;
    	cotizacionCntOrdEnTrab=null;
    	cotizacionCntOrdCer=null;
    	cotizacionCntOrdCatiempo=null;
    	cotizacionCntOrdCftiempo=null;
    	cotizacionCntOrdFac=null;
    	cotizacionCntOrdCan=null;
    	cotizacionMonOrdTot=null;
    	cotizacionMonOrdCan=null;
    	cotizacionMonOrdFac=null;
    	procId=null;
    }
    
	@Override
	public String toString() {
		return "FactCotizacion [cotizacionKey=" + cotizacionKey
				+ ", cotizacionKeyClienteArea=" + cotizacionKeyClienteArea
				+ ", cotizacionKeyUbigeoCliente=" + cotizacionKeyUbigeoCliente
				+ ", cotizacionKeyServicio=" + cotizacionKeyServicio
				+ ", cotizacionKeyProducto=" + cotizacionKeyProducto
				+ ", cotizacionKeyFecApro=" + cotizacionKeyFecApro
				+ ", cotizacionKeyFecIni=" + cotizacionKeyFecIni
				+ ", cotizacionKeyFecFin=" + cotizacionKeyFecFin
				+ ", cotizacionKeyEstado=" + cotizacionKeyEstado
				+ ", cotizacionIndUnidad=" + cotizacionIndUnidad
				+ ", cotizacionCntOrdTotal=" + cotizacionCntOrdTotal
				+ ", cotizacionCntOrdEnTrab=" + cotizacionCntOrdEnTrab
				+ ", cotizacionCntOrdCer=" + cotizacionCntOrdCer
				+ ", cotizacionCntOrdCatiempo=" + cotizacionCntOrdCatiempo
				+ ", cotizacionCntOrdCftiempo=" + cotizacionCntOrdCftiempo
				+ ", cotizacionCntOrdFac=" + cotizacionCntOrdFac
				+ ", cotizacionCntOrdCan=" + cotizacionCntOrdCan
				+ ", cotizacionMonOrdTot=" + cotizacionMonOrdTot
				+ ", cotizacionMonOrdCan=" + cotizacionMonOrdCan
				+ ", cotizacionMonOrdFac=" + cotizacionMonOrdFac + ", procId="
				+ procId + "]";
	}
    
    
}