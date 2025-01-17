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
        this.codtipopersonal = codtipopersonal;
    }

    public String getTipopersonal() {
        return tipopersonal;
    }

    public void setTipopersonal(String tipopersonal) {
        this.tipopersonal = tipopersonal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        this.usuariomod = usuariomod;
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
    
    public void clear(){
    	codtipopersonal=null;
    	tipopersonal=null;
    	usuario=null;
    	fecha=null;
    	usuariomod=null;
    	fechamod=null;
    	anulado=null;
    }

	@Override
	public String toString() {
		return "TTipopersonal [codtipopersonal=" + codtipopersonal
				+ ", tipopersonal=" + tipopersonal + ", usuario=" + usuario
				+ ", fecha=" + fecha + ", usuariomod=" + usuariomod
				+ ", fechamod=" + fechamod + ", anulado=" + anulado + "]";
	}
}