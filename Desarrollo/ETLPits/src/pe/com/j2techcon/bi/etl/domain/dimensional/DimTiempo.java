package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.Date;

public class DimTiempo {
    private Integer tiempoKey;

    private Date tiempoFecha;

    private Short tiempoDiaSemana;

    private Short tiempoDiaMes;

    private String tiempoNombreDia;

    private Short tiempoSemanaMes;

    private Short tiempoSemanaAnio;

    private Short tiempoMes;

    private String tiempoNombreMes;

    private Short tiempoTrimestre;

    private String tiempoNombreTrimestre;

    private Short tiempoSemestre;

    private String tiempoNombreSemestre;

    private Short tiempoAnio;

    private String tiempoEsFeriado;

    public Integer getTiempoKey() {
        return tiempoKey;
    }

    public void setTiempoKey(Integer tiempoKey) {
        this.tiempoKey = tiempoKey;
    }

    public Date getTiempoFecha() {
        return tiempoFecha;
    }

    public void setTiempoFecha(Date tiempoFecha) {
        this.tiempoFecha = tiempoFecha;
    }

    public Short getTiempoDiaSemana() {
        return tiempoDiaSemana;
    }

    public void setTiempoDiaSemana(Short tiempoDiaSemana) {
        this.tiempoDiaSemana = tiempoDiaSemana;
    }

    public Short getTiempoDiaMes() {
        return tiempoDiaMes;
    }

    public void setTiempoDiaMes(Short tiempoDiaMes) {
        this.tiempoDiaMes = tiempoDiaMes;
    }

    public String getTiempoNombreDia() {
        return tiempoNombreDia;
    }

    public void setTiempoNombreDia(String tiempoNombreDia) {
        this.tiempoNombreDia = tiempoNombreDia == null ? null : tiempoNombreDia.trim();
    }

    public Short getTiempoSemanaMes() {
        return tiempoSemanaMes;
    }

    public void setTiempoSemanaMes(Short tiempoSemanaMes) {
        this.tiempoSemanaMes = tiempoSemanaMes;
    }

    public Short getTiempoSemanaAnio() {
        return tiempoSemanaAnio;
    }

    public void setTiempoSemanaAnio(Short tiempoSemanaAnio) {
        this.tiempoSemanaAnio = tiempoSemanaAnio;
    }

    public Short getTiempoMes() {
        return tiempoMes;
    }

    public void setTiempoMes(Short tiempoMes) {
        this.tiempoMes = tiempoMes;
    }

    public String getTiempoNombreMes() {
        return tiempoNombreMes;
    }

    public void setTiempoNombreMes(String tiempoNombreMes) {
        this.tiempoNombreMes = tiempoNombreMes == null ? null : tiempoNombreMes.trim();
    }

    public Short getTiempoTrimestre() {
        return tiempoTrimestre;
    }

    public void setTiempoTrimestre(Short tiempoTrimestre) {
        this.tiempoTrimestre = tiempoTrimestre;
    }

    public String getTiempoNombreTrimestre() {
        return tiempoNombreTrimestre;
    }

    public void setTiempoNombreTrimestre(String tiempoNombreTrimestre) {
        this.tiempoNombreTrimestre = tiempoNombreTrimestre == null ? null : tiempoNombreTrimestre.trim();
    }

    public Short getTiempoSemestre() {
        return tiempoSemestre;
    }

    public void setTiempoSemestre(Short tiempoSemestre) {
        this.tiempoSemestre = tiempoSemestre;
    }

    public String getTiempoNombreSemestre() {
        return tiempoNombreSemestre;
    }

    public void setTiempoNombreSemestre(String tiempoNombreSemestre) {
        this.tiempoNombreSemestre = tiempoNombreSemestre == null ? null : tiempoNombreSemestre.trim();
    }

    public Short getTiempoAnio() {
        return tiempoAnio;
    }

    public void setTiempoAnio(Short tiempoAnio) {
        this.tiempoAnio = tiempoAnio;
    }

    public String getTiempoEsFeriado() {
        return tiempoEsFeriado;
    }

    public void setTiempoEsFeriado(String tiempoEsFeriado) {
        this.tiempoEsFeriado = tiempoEsFeriado == null ? null : tiempoEsFeriado.trim();
    }

	@Override
	public String toString() {
		return "DimTiempo [tiempoKey=" + tiempoKey + ", tiempoFecha="
				+ tiempoFecha + ", tiempoDiaSemana=" + tiempoDiaSemana
				+ ", tiempoDiaMes=" + tiempoDiaMes + ", tiempoNombreDia="
				+ tiempoNombreDia + ", tiempoSemanaMes=" + tiempoSemanaMes
				+ ", tiempoSemanaAnio=" + tiempoSemanaAnio + ", tiempoMes="
				+ tiempoMes + ", tiempoNombreMes=" + tiempoNombreMes
				+ ", tiempoTrimestre=" + tiempoTrimestre
				+ ", tiempoNombreTrimestre=" + tiempoNombreTrimestre
				+ ", tiempoSemestre=" + tiempoSemestre
				+ ", tiempoNombreSemestre=" + tiempoNombreSemestre
				+ ", tiempoAnio=" + tiempoAnio + ", tiempoEsFeriado="
				+ tiempoEsFeriado + "]";
	}
}