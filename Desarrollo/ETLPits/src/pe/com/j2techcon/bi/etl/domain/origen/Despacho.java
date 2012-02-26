package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.Date;

public class Despacho {
    private String serieguia;

	private String nroguia;

	private Date fecsalida;

	private Date fecretorno;

	private String codmensajero;

	private BigDecimal pasaje;

	private Integer total;

	private Integer entregados;

	private Integer motivos;

	private Integer reenvios;

	private Integer anulados;

	private Integer fuerazona;

	private Integer perdidos;

	private String observacion;

	private String tiporuta;

	private BigDecimal monto;

	private String codestadoguia;

	private String estadoveri;

	private String usuariodesp;

	private Date fechadesp;

	private String usuariocierre;

	private Date fechacierre;

	private String codtipopago;

	private String horaretorno;

	private String codzona;

	private String userasigna;

	private Date fecasigna;

	private String codorigen;

	private String codsede;

	private Short tipofi;

	private String usuarioflete;

	private Date fechaflete;

	private Short nrocaja;

	private String flete;

	private Date horasalida;

	private Date horaflete;

	private String usuariomod;

	private Date fechamod;

	private String codplanilla;

	private String brevete;

	private String codAyudante;

	private String codUnidad;

	private String placa;

	private String desUnidad;

	private Short codTrackingGuia;

	private Short flagEnvio;

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

	public Date getFecsalida() {
		return fecsalida;
	}

	public void setFecsalida(Date fecsalida) {
		this.fecsalida = fecsalida;
	}

	public Date getFecretorno() {
		return fecretorno;
	}

	public void setFecretorno(Date fecretorno) {
		this.fecretorno = fecretorno;
	}

	public String getCodmensajero() {
		return codmensajero;
	}

	public void setCodmensajero(String codmensajero) {
		this.codmensajero = codmensajero == null ? null : codmensajero.trim();
	}

	public BigDecimal getPasaje() {
		return pasaje;
	}

	public void setPasaje(BigDecimal pasaje) {
		this.pasaje = pasaje;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getEntregados() {
		return entregados;
	}

	public void setEntregados(Integer entregados) {
		this.entregados = entregados;
	}

	public Integer getMotivos() {
		return motivos;
	}

	public void setMotivos(Integer motivos) {
		this.motivos = motivos;
	}

	public Integer getReenvios() {
		return reenvios;
	}

	public void setReenvios(Integer reenvios) {
		this.reenvios = reenvios;
	}

	public Integer getAnulados() {
		return anulados;
	}

	public void setAnulados(Integer anulados) {
		this.anulados = anulados;
	}

	public Integer getFuerazona() {
		return fuerazona;
	}

	public void setFuerazona(Integer fuerazona) {
		this.fuerazona = fuerazona;
	}

	public Integer getPerdidos() {
		return perdidos;
	}

	public void setPerdidos(Integer perdidos) {
		this.perdidos = perdidos;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion == null ? null : observacion.trim();
	}

	public String getTiporuta() {
		return tiporuta;
	}

	public void setTiporuta(String tiporuta) {
		this.tiporuta = tiporuta == null ? null : tiporuta.trim();
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getCodestadoguia() {
		return codestadoguia;
	}

	public void setCodestadoguia(String codestadoguia) {
		this.codestadoguia = codestadoguia == null ? null : codestadoguia
				.trim();
	}

	public String getEstadoveri() {
		return estadoveri;
	}

	public void setEstadoveri(String estadoveri) {
		this.estadoveri = estadoveri == null ? null : estadoveri.trim();
	}

	public String getUsuariodesp() {
		return usuariodesp;
	}

	public void setUsuariodesp(String usuariodesp) {
		this.usuariodesp = usuariodesp == null ? null : usuariodesp.trim();
	}

	public Date getFechadesp() {
		return fechadesp;
	}

	public void setFechadesp(Date fechadesp) {
		this.fechadesp = fechadesp;
	}

	public String getUsuariocierre() {
		return usuariocierre;
	}

	public void setUsuariocierre(String usuariocierre) {
		this.usuariocierre = usuariocierre == null ? null : usuariocierre
				.trim();
	}

	public Date getFechacierre() {
		return fechacierre;
	}

	public void setFechacierre(Date fechacierre) {
		this.fechacierre = fechacierre;
	}

	public String getCodtipopago() {
		return codtipopago;
	}

	public void setCodtipopago(String codtipopago) {
		this.codtipopago = codtipopago == null ? null : codtipopago.trim();
	}

	public String getHoraretorno() {
		return horaretorno;
	}

	public void setHoraretorno(String horaretorno) {
		this.horaretorno = horaretorno == null ? null : horaretorno.trim();
	}

	public String getCodzona() {
		return codzona;
	}

	public void setCodzona(String codzona) {
		this.codzona = codzona == null ? null : codzona.trim();
	}

	public String getUserasigna() {
		return userasigna;
	}

	public void setUserasigna(String userasigna) {
		this.userasigna = userasigna == null ? null : userasigna.trim();
	}

	public Date getFecasigna() {
		return fecasigna;
	}

	public void setFecasigna(Date fecasigna) {
		this.fecasigna = fecasigna;
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

	public Short getTipofi() {
		return tipofi;
	}

	public void setTipofi(Short tipofi) {
		this.tipofi = tipofi;
	}

	public String getUsuarioflete() {
		return usuarioflete;
	}

	public void setUsuarioflete(String usuarioflete) {
		this.usuarioflete = usuarioflete == null ? null : usuarioflete.trim();
	}

	public Date getFechaflete() {
		return fechaflete;
	}

	public void setFechaflete(Date fechaflete) {
		this.fechaflete = fechaflete;
	}

	public Short getNrocaja() {
		return nrocaja;
	}

	public void setNrocaja(Short nrocaja) {
		this.nrocaja = nrocaja;
	}

	public String getFlete() {
		return flete;
	}

	public void setFlete(String flete) {
		this.flete = flete == null ? null : flete.trim();
	}

	public Date getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(Date horasalida) {
		this.horasalida = horasalida;
	}

	public Date getHoraflete() {
		return horaflete;
	}

	public void setHoraflete(Date horaflete) {
		this.horaflete = horaflete;
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

	public String getCodplanilla() {
		return codplanilla;
	}

	public void setCodplanilla(String codplanilla) {
		this.codplanilla = codplanilla == null ? null : codplanilla.trim();
	}

	public String getBrevete() {
		return brevete;
	}

	public void setBrevete(String brevete) {
		this.brevete = brevete == null ? null : brevete.trim();
	}

	public String getCodAyudante() {
		return codAyudante;
	}

	public void setCodAyudante(String codAyudante) {
		this.codAyudante = codAyudante == null ? null : codAyudante.trim();
	}

	public String getCodUnidad() {
		return codUnidad;
	}

	public void setCodUnidad(String codUnidad) {
		this.codUnidad = codUnidad == null ? null : codUnidad.trim();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa == null ? null : placa.trim();
	}

	public String getDesUnidad() {
		return desUnidad;
	}

	public void setDesUnidad(String desUnidad) {
		this.desUnidad = desUnidad == null ? null : desUnidad.trim();
	}

	public Short getCodTrackingGuia() {
		return codTrackingGuia;
	}

	public void setCodTrackingGuia(Short codTrackingGuia) {
		this.codTrackingGuia = codTrackingGuia;
	}

	public Short getFlagEnvio() {
		return flagEnvio;
	}

	public void setFlagEnvio(Short flagEnvio) {
		this.flagEnvio = flagEnvio;
	}

	private String serieguia;

    private String nroguia;

    private Date fecsalida;

    private Date fecretorno;

    private String codmensajero;

    private BigDecimal pasaje;

    private Integer total;

    private Integer entregados;

    private Integer motivos;

    private Integer reenvios;

    private Integer anulados;

    private Integer fuerazona;

    private Integer perdidos;

    private String observacion;

    private String tiporuta;

    private BigDecimal monto;

    private String codestadoguia;

    private String estadoveri;

    private String usuariodesp;

    private Date fechadesp;

    private String usuariocierre;

    private Date fechacierre;

    private String codtipopago;

    private String horaretorno;

    private String codzona;

    private String userasigna;

    private Date fecasigna;

    private String codorigen;

    private String codsede;

    private Short tipofi;

    private String usuarioflete;

    private Date fechaflete;

    private Short nrocaja;

    private String flete;

    private Date horasalida;

    private Date horaflete;

    private String usuariomod;

    private Date fechamod;

    private String codplanilla;

    private String brevete;

    private String codAyudante;

    private String codUnidad;

    private String placa;

    private String desUnidad;

    private Short codTrackingGuia;

    private Short flagEnvio;

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

    public Date getFecsalida() {
        return fecsalida;
    }

    public void setFecsalida(Date fecsalida) {
        this.fecsalida = fecsalida;
    }

    public Date getFecretorno() {
        return fecretorno;
    }

    public void setFecretorno(Date fecretorno) {
        this.fecretorno = fecretorno;
    }

    public String getCodmensajero() {
        return codmensajero;
    }

    public void setCodmensajero(String codmensajero) {
        this.codmensajero = codmensajero == null ? null : codmensajero.trim();
    }

    public BigDecimal getPasaje() {
        return pasaje;
    }

    public void setPasaje(BigDecimal pasaje) {
        this.pasaje = pasaje;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getEntregados() {
        return entregados;
    }

    public void setEntregados(Integer entregados) {
        this.entregados = entregados;
    }

    public Integer getMotivos() {
        return motivos;
    }

    public void setMotivos(Integer motivos) {
        this.motivos = motivos;
    }

    public Integer getReenvios() {
        return reenvios;
    }

    public void setReenvios(Integer reenvios) {
        this.reenvios = reenvios;
    }

    public Integer getAnulados() {
        return anulados;
    }

    public void setAnulados(Integer anulados) {
        this.anulados = anulados;
    }

    public Integer getFuerazona() {
        return fuerazona;
    }

    public void setFuerazona(Integer fuerazona) {
        this.fuerazona = fuerazona;
    }

    public Integer getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(Integer perdidos) {
        this.perdidos = perdidos;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion == null ? null : observacion.trim();
    }

    public String getTiporuta() {
        return tiporuta;
    }

    public void setTiporuta(String tiporuta) {
        this.tiporuta = tiporuta == null ? null : tiporuta.trim();
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getCodestadoguia() {
        return codestadoguia;
    }

    public void setCodestadoguia(String codestadoguia) {
        this.codestadoguia = codestadoguia == null ? null : codestadoguia.trim();
    }

    public String getEstadoveri() {
        return estadoveri;
    }

    public void setEstadoveri(String estadoveri) {
        this.estadoveri = estadoveri == null ? null : estadoveri.trim();
    }

    public String getUsuariodesp() {
        return usuariodesp;
    }

    public void setUsuariodesp(String usuariodesp) {
        this.usuariodesp = usuariodesp == null ? null : usuariodesp.trim();
    }

    public Date getFechadesp() {
        return fechadesp;
    }

    public void setFechadesp(Date fechadesp) {
        this.fechadesp = fechadesp;
    }

    public String getUsuariocierre() {
        return usuariocierre;
    }

    public void setUsuariocierre(String usuariocierre) {
        this.usuariocierre = usuariocierre == null ? null : usuariocierre.trim();
    }

    public Date getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }

    public String getCodtipopago() {
        return codtipopago;
    }

    public void setCodtipopago(String codtipopago) {
        this.codtipopago = codtipopago == null ? null : codtipopago.trim();
    }

    public String getHoraretorno() {
        return horaretorno;
    }

    public void setHoraretorno(String horaretorno) {
        this.horaretorno = horaretorno == null ? null : horaretorno.trim();
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona == null ? null : codzona.trim();
    }

    public String getUserasigna() {
        return userasigna;
    }

    public void setUserasigna(String userasigna) {
        this.userasigna = userasigna == null ? null : userasigna.trim();
    }

    public Date getFecasigna() {
        return fecasigna;
    }

    public void setFecasigna(Date fecasigna) {
        this.fecasigna = fecasigna;
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

    public Short getTipofi() {
        return tipofi;
    }

    public void setTipofi(Short tipofi) {
        this.tipofi = tipofi;
    }

    public String getUsuarioflete() {
        return usuarioflete;
    }

    public void setUsuarioflete(String usuarioflete) {
        this.usuarioflete = usuarioflete == null ? null : usuarioflete.trim();
    }

    public Date getFechaflete() {
        return fechaflete;
    }

    public void setFechaflete(Date fechaflete) {
        this.fechaflete = fechaflete;
    }

    public Short getNrocaja() {
        return nrocaja;
    }

    public void setNrocaja(Short nrocaja) {
        this.nrocaja = nrocaja;
    }

    public String getFlete() {
        return flete;
    }

    public void setFlete(String flete) {
        this.flete = flete == null ? null : flete.trim();
    }

    public Date getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Date horasalida) {
        this.horasalida = horasalida;
    }

    public Date getHoraflete() {
        return horaflete;
    }

    public void setHoraflete(Date horaflete) {
        this.horaflete = horaflete;
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

    public String getCodplanilla() {
        return codplanilla;
    }

    public void setCodplanilla(String codplanilla) {
        this.codplanilla = codplanilla == null ? null : codplanilla.trim();
    }

    public String getBrevete() {
        return brevete;
    }

    public void setBrevete(String brevete) {
        this.brevete = brevete == null ? null : brevete.trim();
    }

    public String getCodAyudante() {
        return codAyudante;
    }

    public void setCodAyudante(String codAyudante) {
        this.codAyudante = codAyudante == null ? null : codAyudante.trim();
    }

    public String getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(String codUnidad) {
        this.codUnidad = codUnidad == null ? null : codUnidad.trim();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa == null ? null : placa.trim();
    }

    public String getDesUnidad() {
        return desUnidad;
    }

    public void setDesUnidad(String desUnidad) {
        this.desUnidad = desUnidad == null ? null : desUnidad.trim();
    }

    public Short getCodTrackingGuia() {
        return codTrackingGuia;
    }

    public void setCodTrackingGuia(Short codTrackingGuia) {
        this.codTrackingGuia = codTrackingGuia;
    }

    public Short getFlagEnvio() {
        return flagEnvio;
    }

    public void setFlagEnvio(Short flagEnvio) {
        this.flagEnvio = flagEnvio;
    }
}