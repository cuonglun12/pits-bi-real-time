package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.Date;

public class Detdespacho {
    private String serieguia;

    private String nroguia;

    private String serie;

    private String orden;

    private String correlativo;

    private String codorigen;

    private String codsede;

    private String codclienteb;

    private String estacion;

    private String contador;

    private Short volante;

    private String codzona;

    private String codestado;

    private String codmotivo;

    private String estadoveri;

    private Date fecasignado;

    private String userCla;

    private Date fecCla;

    private String userRecep;

    private Date fecRecep;

    public String getSerieguia() {
        return serieguia;
    }

    public void setSerieguia(String serieguia) {
        this.serieguia = serieguia == null ? null : serieguia.trim();
    }

    public String getNroguia() {
        return nroguia;
    }

    public void setNroguia(String nroguia) {
        this.nroguia = nroguia == null ? null : nroguia.trim();
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie == null ? null : serie.trim();
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden == null ? null : orden.trim();
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo == null ? null : correlativo.trim();
    }

    public String getCodorigen() {
        return codorigen;
    }

    public void setCodorigen(String codorigen) {
        this.codorigen = codorigen == null ? null : codorigen.trim();
    }

    public String getCodsede() {
        return codsede;
    }

    public void setCodsede(String codsede) {
        this.codsede = codsede == null ? null : codsede.trim();
    }

    public String getCodclienteb() {
        return codclienteb;
    }

    public void setCodclienteb(String codclienteb) {
        this.codclienteb = codclienteb == null ? null : codclienteb.trim();
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion == null ? null : estacion.trim();
    }

    public String getContador() {
        return contador;
    }

    public void setContador(String contador) {
        this.contador = contador == null ? null : contador.trim();
    }

    public Short getVolante() {
        return volante;
    }

    public void setVolante(Short volante) {
        this.volante = volante;
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona == null ? null : codzona.trim();
    }

    public String getCodestado() {
        return codestado;
    }

    public void setCodestado(String codestado) {
        this.codestado = codestado == null ? null : codestado.trim();
    }

    public String getCodmotivo() {
        return codmotivo;
    }

    public void setCodmotivo(String codmotivo) {
        this.codmotivo = codmotivo == null ? null : codmotivo.trim();
    }

    public String getEstadoveri() {
        return estadoveri;
    }

    public void setEstadoveri(String estadoveri) {
        this.estadoveri = estadoveri == null ? null : estadoveri.trim();
    }

    public Date getFecasignado() {
        return fecasignado;
    }

    public void setFecasignado(Date fecasignado) {
        this.fecasignado = fecasignado;
    }

    public String getUserCla() {
        return userCla;
    }

    public void setUserCla(String userCla) {
        this.userCla = userCla == null ? null : userCla.trim();
    }

    public Date getFecCla() {
        return fecCla;
    }

    public void setFecCla(Date fecCla) {
        this.fecCla = fecCla;
    }

    public String getUserRecep() {
        return userRecep;
    }

    public void setUserRecep(String userRecep) {
        this.userRecep = userRecep == null ? null : userRecep.trim();
    }

    public Date getFecRecep() {
        return fecRecep;
    }

    public void setFecRecep(Date fecRecep) {
        this.fecRecep = fecRecep;
    }
}