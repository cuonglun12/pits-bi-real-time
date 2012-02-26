package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.Date;

public class TTipopersonal {
    private String codtipopersonal;

    private String tipopersonal;

    private String usuario;

    private Date fecha;

    private String usuariomod;

    private Date fechamod;

    private Short anulado;

    public String getCodtipopersonal() {
        return codtipopersonal;
    }

    public void setCodtipopersonal(String codtipopersonal) {
        this.codtipopersonal = codtipopersonal == null ? null : codtipopersonal.trim();
    }

    public String getTipopersonal() {
        return tipopersonal;
    }

    public void setTipopersonal(String tipopersonal) {
        this.tipopersonal = tipopersonal == null ? null : tipopersonal.trim();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario == null ? null : usuario.trim();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod == null ? null : usuariomod.trim();
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    public Short getAnulado() {
        return anulado;
    }

    public void setAnulado(Short anulado) {
        this.anulado = anulado;
    }
}