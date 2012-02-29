package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.math.BigDecimal;

public class FactDespacho {
    private Integer despachoKey;

    private Integer despachoKeySede;

    private Integer despachoKeyZona;

    private Integer despachoKeyPersonal;

    private Integer despachoKeyTipoRuta;

    private Integer despachoKeyFecSal;

    private Integer despachoKeyFecRetp;

    private Integer despachoKeyFecRetr;

    private Integer despachoKeyEstado;

    private BigDecimal despachoMonPasaje;

    private Short despachoIndUnidad;

    private Integer despachoCntDiasExc;

    private Integer despachoCntCargos;

    private Integer despachoCntEnt;

    private Integer despachoCntMot;

    private Integer despachoCntRee;

    private Integer despachoCntAnu;

    private Integer despachoCntFueZon;

    private Integer despachoCntPerd;

    private Short despachoTrabEnFec;

    private Short despachoTrabFueraFec;

    private Integer procId;

    public Integer getDespachoKey() {
        return despachoKey;
    }

    public void setDespachoKey(Integer despachoKey) {
        this.despachoKey = despachoKey;
    }

    public Integer getDespachoKeySede() {
        return despachoKeySede;
    }

    public void setDespachoKeySede(Integer despachoKeySede) {
        this.despachoKeySede = despachoKeySede;
    }

    public Integer getDespachoKeyZona() {
        return despachoKeyZona;
    }

    public void setDespachoKeyZona(Integer despachoKeyZona) {
        this.despachoKeyZona = despachoKeyZona;
    }

    public Integer getDespachoKeyPersonal() {
        return despachoKeyPersonal;
    }

    public void setDespachoKeyPersonal(Integer despachoKeyPersonal) {
        this.despachoKeyPersonal = despachoKeyPersonal;
    }

    public Integer getDespachoKeyTipoRuta() {
        return despachoKeyTipoRuta;
    }

    public void setDespachoKeyTipoRuta(Integer despachoKeyTipoRuta) {
        this.despachoKeyTipoRuta = despachoKeyTipoRuta;
    }

    public Integer getDespachoKeyFecSal() {
        return despachoKeyFecSal;
    }

    public void setDespachoKeyFecSal(Integer despachoKeyFecSal) {
        this.despachoKeyFecSal = despachoKeyFecSal;
    }

    public Integer getDespachoKeyFecRetp() {
        return despachoKeyFecRetp;
    }

    public void setDespachoKeyFecRetp(Integer despachoKeyFecRetp) {
        this.despachoKeyFecRetp = despachoKeyFecRetp;
    }

    public Integer getDespachoKeyFecRetr() {
        return despachoKeyFecRetr;
    }

    public void setDespachoKeyFecRetr(Integer despachoKeyFecRetr) {
        this.despachoKeyFecRetr = despachoKeyFecRetr;
    }

    public Integer getDespachoKeyEstado() {
        return despachoKeyEstado;
    }

    public void setDespachoKeyEstado(Integer despachoKeyEstado) {
        this.despachoKeyEstado = despachoKeyEstado;
    }

    public BigDecimal getDespachoMonPasaje() {
        return despachoMonPasaje;
    }

    public void setDespachoMonPasaje(BigDecimal despachoMonPasaje) {
        this.despachoMonPasaje = despachoMonPasaje;
    }

    public Short getDespachoIndUnidad() {
        return despachoIndUnidad;
    }

    public void setDespachoIndUnidad(Short despachoIndUnidad) {
        this.despachoIndUnidad = despachoIndUnidad;
    }

    public Integer getDespachoCntDiasExc() {
        return despachoCntDiasExc;
    }

    public void setDespachoCntDiasExc(Integer despachoCntDiasExc) {
        this.despachoCntDiasExc = despachoCntDiasExc;
    }

    public Integer getDespachoCntCargos() {
        return despachoCntCargos;
    }

    public void setDespachoCntCargos(Integer despachoCntCargos) {
        this.despachoCntCargos = despachoCntCargos;
    }

    public Integer getDespachoCntEnt() {
        return despachoCntEnt;
    }

    public void setDespachoCntEnt(Integer despachoCntEnt) {
        this.despachoCntEnt = despachoCntEnt;
    }

    public Integer getDespachoCntMot() {
        return despachoCntMot;
    }

    public void setDespachoCntMot(Integer despachoCntMot) {
        this.despachoCntMot = despachoCntMot;
    }

    public Integer getDespachoCntRee() {
        return despachoCntRee;
    }

    public void setDespachoCntRee(Integer despachoCntRee) {
        this.despachoCntRee = despachoCntRee;
    }

    public Integer getDespachoCntAnu() {
        return despachoCntAnu;
    }

    public void setDespachoCntAnu(Integer despachoCntAnu) {
        this.despachoCntAnu = despachoCntAnu;
    }

    public Integer getDespachoCntFueZon() {
        return despachoCntFueZon;
    }

    public void setDespachoCntFueZon(Integer despachoCntFueZon) {
        this.despachoCntFueZon = despachoCntFueZon;
    }

    public Integer getDespachoCntPerd() {
        return despachoCntPerd;
    }

    public void setDespachoCntPerd(Integer despachoCntPerd) {
        this.despachoCntPerd = despachoCntPerd;
    }

    public Short getDespachoTrabEnFec() {
        return despachoTrabEnFec;
    }

    public void setDespachoTrabEnFec(Short despachoTrabEnFec) {
        this.despachoTrabEnFec = despachoTrabEnFec;
    }

    public Short getDespachoTrabFueraFec() {
        return despachoTrabFueraFec;
    }

    public void setDespachoTrabFueraFec(Short despachoTrabFueraFec) {
        this.despachoTrabFueraFec = despachoTrabFueraFec;
    }

    public Integer getProcId() {
        return procId;
    }

    public void setProcId(Integer procId) {
        this.procId = procId;
    }
    
    public void clear(){
    	despachoKey=null;
    	despachoKeySede=null;
    	despachoKeyZona=null;
    	despachoKeyPersonal=null;
    	despachoKeyTipoRuta=null;
    	despachoKeyFecSal=null;
    	despachoKeyFecRetp=null;
    	despachoKeyFecRetr=null;
    	despachoKeyEstado=null;
    	despachoMonPasaje=null;
    	despachoIndUnidad=null;
    	despachoCntDiasExc=null;
    	despachoCntCargos=null;
    	despachoCntEnt=null;
    	despachoCntMot=null;
    	despachoCntRee=null;
    	despachoCntAnu=null;
    	despachoCntFueZon=null;
    	despachoCntPerd=null;
    	despachoTrabEnFec=null;
    	despachoTrabFueraFec=null;
    	procId=null;
    }

	@Override
	public String toString() {
		return "FactDespacho [despachoKey=" + despachoKey
				+ ", despachoKeySede=" + despachoKeySede + ", despachoKeyZona="
				+ despachoKeyZona + ", despachoKeyPersonal="
				+ despachoKeyPersonal + ", despachoKeyTipoRuta="
				+ despachoKeyTipoRuta + ", despachoKeyFecSal="
				+ despachoKeyFecSal + ", despachoKeyFecRetp="
				+ despachoKeyFecRetp + ", despachoKeyFecRetr="
				+ despachoKeyFecRetr + ", despachoKeyEstado="
				+ despachoKeyEstado + ", despachoMonPasaje="
				+ despachoMonPasaje + ", despachoIndUnidad="
				+ despachoIndUnidad + ", despachoCntDiasExc="
				+ despachoCntDiasExc + ", despachoCntCargos="
				+ despachoCntCargos + ", despachoCntEnt=" + despachoCntEnt
				+ ", despachoCntMot=" + despachoCntMot + ", despachoCntRee="
				+ despachoCntRee + ", despachoCntAnu=" + despachoCntAnu
				+ ", despachoCntFueZon=" + despachoCntFueZon
				+ ", despachoCntPerd=" + despachoCntPerd
				+ ", despachoTrabEnFec=" + despachoTrabEnFec
				+ ", despachoTrabFueraFec=" + despachoTrabFueraFec
				+ ", procId=" + procId + "]";
	}
}