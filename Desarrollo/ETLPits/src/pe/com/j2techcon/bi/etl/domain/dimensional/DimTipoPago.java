package pe.com.j2techcon.bi.etl.domain.dimensional;

public class DimTipoPago {
    private Integer tipoPagoKey;

    private String tipoPagoCod;

    private String tipoPagoDesc;

    private String codIndCam;

    private Integer fecNumCam;

    public Integer getTipoPagoKey() {
        return tipoPagoKey;
    }

    public void setTipoPagoKey(Integer tipoPagoKey) {
        this.tipoPagoKey = tipoPagoKey;
    }

    public String getTipoPagoCod() {
        return tipoPagoCod;
    }

    public void setTipoPagoCod(String tipoPagoCod) {
        this.tipoPagoCod = tipoPagoCod == null ? null : tipoPagoCod.trim();
    }

    public String getTipoPagoDesc() {
        return tipoPagoDesc;
    }

    public void setTipoPagoDesc(String tipoPagoDesc) {
        this.tipoPagoDesc = tipoPagoDesc == null ? null : tipoPagoDesc.trim();
    }

    public String getCodIndCam() {
        return codIndCam;
    }

    public void setCodIndCam(String codIndCam) {
        this.codIndCam = codIndCam == null ? null : codIndCam.trim();
    }

    public Integer getFecNumCam() {
        return fecNumCam;
    }

    public void setFecNumCam(Integer fecNumCam) {
        this.fecNumCam = fecNumCam;
    }

	@Override
	public String toString() {
		return "DimTipoPago [tipoPagoKey=" + tipoPagoKey + ", tipoPagoCod="
				+ tipoPagoCod + ", tipoPagoDesc=" + tipoPagoDesc
				+ ", codIndCam=" + codIndCam + ", fecNumCam=" + fecNumCam + "]";
	}
}