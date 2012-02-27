package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FactOrdenExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactOrdenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getPaginationByClause() {
		return paginationByClause;
	}

	public void setPaginationByClause(String paginationByClause) {
		this.paginationByClause = paginationByClause;
	}

	public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        paginationByClause = null;
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrdenKeyIsNull() {
            addCriterion("orden_key is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyIsNotNull() {
            addCriterion("orden_key is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEqualTo(Integer value) {
            addCriterion("orden_key =", value, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyNotEqualTo(Integer value) {
            addCriterion("orden_key <>", value, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyGreaterThan(Integer value) {
            addCriterion("orden_key >", value, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key >=", value, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyLessThan(Integer value) {
            addCriterion("orden_key <", value, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key <=", value, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyIn(List<Integer> values) {
            addCriterion("orden_key in", values, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyNotIn(List<Integer> values) {
            addCriterion("orden_key not in", values, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyBetween(Integer value1, Integer value2) {
            addCriterion("orden_key between", value1, value2, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key not between", value1, value2, "ordenKey");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteIsNull() {
            addCriterion("orden_key_cliente is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteIsNotNull() {
            addCriterion("orden_key_cliente is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteEqualTo(Integer value) {
            addCriterion("orden_key_cliente =", value, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteNotEqualTo(Integer value) {
            addCriterion("orden_key_cliente <>", value, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteGreaterThan(Integer value) {
            addCriterion("orden_key_cliente >", value, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_cliente >=", value, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteLessThan(Integer value) {
            addCriterion("orden_key_cliente <", value, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_cliente <=", value, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteIn(List<Integer> values) {
            addCriterion("orden_key_cliente in", values, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteNotIn(List<Integer> values) {
            addCriterion("orden_key_cliente not in", values, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_cliente between", value1, value2, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyClienteNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_cliente not between", value1, value2, "ordenKeyCliente");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioIsNull() {
            addCriterion("orden_key_servicio is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioIsNotNull() {
            addCriterion("orden_key_servicio is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioEqualTo(Integer value) {
            addCriterion("orden_key_servicio =", value, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioNotEqualTo(Integer value) {
            addCriterion("orden_key_servicio <>", value, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioGreaterThan(Integer value) {
            addCriterion("orden_key_servicio >", value, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_servicio >=", value, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioLessThan(Integer value) {
            addCriterion("orden_key_servicio <", value, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_servicio <=", value, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioIn(List<Integer> values) {
            addCriterion("orden_key_servicio in", values, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioNotIn(List<Integer> values) {
            addCriterion("orden_key_servicio not in", values, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_servicio between", value1, value2, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyServicioNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_servicio not between", value1, value2, "ordenKeyServicio");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoIsNull() {
            addCriterion("orden_key_producto is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoIsNotNull() {
            addCriterion("orden_key_producto is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoEqualTo(Integer value) {
            addCriterion("orden_key_producto =", value, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoNotEqualTo(Integer value) {
            addCriterion("orden_key_producto <>", value, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoGreaterThan(Integer value) {
            addCriterion("orden_key_producto >", value, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_producto >=", value, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoLessThan(Integer value) {
            addCriterion("orden_key_producto <", value, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_producto <=", value, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoIn(List<Integer> values) {
            addCriterion("orden_key_producto in", values, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoNotIn(List<Integer> values) {
            addCriterion("orden_key_producto not in", values, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_producto between", value1, value2, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyProductoNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_producto not between", value1, value2, "ordenKeyProducto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoIsNull() {
            addCriterion("orden_key_tipo_reparto is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoIsNotNull() {
            addCriterion("orden_key_tipo_reparto is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoEqualTo(Integer value) {
            addCriterion("orden_key_tipo_reparto =", value, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoNotEqualTo(Integer value) {
            addCriterion("orden_key_tipo_reparto <>", value, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoGreaterThan(Integer value) {
            addCriterion("orden_key_tipo_reparto >", value, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_tipo_reparto >=", value, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoLessThan(Integer value) {
            addCriterion("orden_key_tipo_reparto <", value, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_tipo_reparto <=", value, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoIn(List<Integer> values) {
            addCriterion("orden_key_tipo_reparto in", values, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoNotIn(List<Integer> values) {
            addCriterion("orden_key_tipo_reparto not in", values, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_tipo_reparto between", value1, value2, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoRepartoNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_tipo_reparto not between", value1, value2, "ordenKeyTipoReparto");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoIsNull() {
            addCriterion("orden_key_tipo_documento is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoIsNotNull() {
            addCriterion("orden_key_tipo_documento is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoEqualTo(Integer value) {
            addCriterion("orden_key_tipo_documento =", value, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoNotEqualTo(Integer value) {
            addCriterion("orden_key_tipo_documento <>", value, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoGreaterThan(Integer value) {
            addCriterion("orden_key_tipo_documento >", value, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_tipo_documento >=", value, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoLessThan(Integer value) {
            addCriterion("orden_key_tipo_documento <", value, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_tipo_documento <=", value, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoIn(List<Integer> values) {
            addCriterion("orden_key_tipo_documento in", values, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoNotIn(List<Integer> values) {
            addCriterion("orden_key_tipo_documento not in", values, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_tipo_documento between", value1, value2, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoDocumentoNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_tipo_documento not between", value1, value2, "ordenKeyTipoDocumento");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoIsNull() {
            addCriterion("orden_key_tipo_pago is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoIsNotNull() {
            addCriterion("orden_key_tipo_pago is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoEqualTo(Integer value) {
            addCriterion("orden_key_tipo_pago =", value, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoNotEqualTo(Integer value) {
            addCriterion("orden_key_tipo_pago <>", value, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoGreaterThan(Integer value) {
            addCriterion("orden_key_tipo_pago >", value, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_tipo_pago >=", value, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoLessThan(Integer value) {
            addCriterion("orden_key_tipo_pago <", value, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_tipo_pago <=", value, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoIn(List<Integer> values) {
            addCriterion("orden_key_tipo_pago in", values, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoNotIn(List<Integer> values) {
            addCriterion("orden_key_tipo_pago not in", values, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_tipo_pago between", value1, value2, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyTipoPagoNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_tipo_pago not between", value1, value2, "ordenKeyTipoPago");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaIsNull() {
            addCriterion("orden_key_moneda is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaIsNotNull() {
            addCriterion("orden_key_moneda is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaEqualTo(Integer value) {
            addCriterion("orden_key_moneda =", value, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaNotEqualTo(Integer value) {
            addCriterion("orden_key_moneda <>", value, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaGreaterThan(Integer value) {
            addCriterion("orden_key_moneda >", value, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_moneda >=", value, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaLessThan(Integer value) {
            addCriterion("orden_key_moneda <", value, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_moneda <=", value, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaIn(List<Integer> values) {
            addCriterion("orden_key_moneda in", values, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaNotIn(List<Integer> values) {
            addCriterion("orden_key_moneda not in", values, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_moneda between", value1, value2, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyMonedaNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_moneda not between", value1, value2, "ordenKeyMoneda");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegIsNull() {
            addCriterion("orden_key_fec_reg is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegIsNotNull() {
            addCriterion("orden_key_fec_reg is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegEqualTo(Integer value) {
            addCriterion("orden_key_fec_reg =", value, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegNotEqualTo(Integer value) {
            addCriterion("orden_key_fec_reg <>", value, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegGreaterThan(Integer value) {
            addCriterion("orden_key_fec_reg >", value, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_reg >=", value, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegLessThan(Integer value) {
            addCriterion("orden_key_fec_reg <", value, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_reg <=", value, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegIn(List<Integer> values) {
            addCriterion("orden_key_fec_reg in", values, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegNotIn(List<Integer> values) {
            addCriterion("orden_key_fec_reg not in", values, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_reg between", value1, value2, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecRegNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_reg not between", value1, value2, "ordenKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniIsNull() {
            addCriterion("orden_key_fec_ini is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniIsNotNull() {
            addCriterion("orden_key_fec_ini is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniEqualTo(Integer value) {
            addCriterion("orden_key_fec_ini =", value, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniNotEqualTo(Integer value) {
            addCriterion("orden_key_fec_ini <>", value, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniGreaterThan(Integer value) {
            addCriterion("orden_key_fec_ini >", value, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_ini >=", value, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniLessThan(Integer value) {
            addCriterion("orden_key_fec_ini <", value, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_ini <=", value, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniIn(List<Integer> values) {
            addCriterion("orden_key_fec_ini in", values, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniNotIn(List<Integer> values) {
            addCriterion("orden_key_fec_ini not in", values, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_ini between", value1, value2, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecIniNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_ini not between", value1, value2, "ordenKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenIsNull() {
            addCriterion("orden_key_fec_ven is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenIsNotNull() {
            addCriterion("orden_key_fec_ven is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenEqualTo(Integer value) {
            addCriterion("orden_key_fec_ven =", value, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenNotEqualTo(Integer value) {
            addCriterion("orden_key_fec_ven <>", value, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenGreaterThan(Integer value) {
            addCriterion("orden_key_fec_ven >", value, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_ven >=", value, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenLessThan(Integer value) {
            addCriterion("orden_key_fec_ven <", value, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_ven <=", value, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenIn(List<Integer> values) {
            addCriterion("orden_key_fec_ven in", values, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenNotIn(List<Integer> values) {
            addCriterion("orden_key_fec_ven not in", values, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_ven between", value1, value2, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecVenNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_ven not between", value1, value2, "ordenKeyFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieIsNull() {
            addCriterion("orden_key_fec_cie is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieIsNotNull() {
            addCriterion("orden_key_fec_cie is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieEqualTo(Integer value) {
            addCriterion("orden_key_fec_cie =", value, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieNotEqualTo(Integer value) {
            addCriterion("orden_key_fec_cie <>", value, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieGreaterThan(Integer value) {
            addCriterion("orden_key_fec_cie >", value, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_cie >=", value, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieLessThan(Integer value) {
            addCriterion("orden_key_fec_cie <", value, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_cie <=", value, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieIn(List<Integer> values) {
            addCriterion("orden_key_fec_cie in", values, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieNotIn(List<Integer> values) {
            addCriterion("orden_key_fec_cie not in", values, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_cie between", value1, value2, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecCieNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_cie not between", value1, value2, "ordenKeyFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevIsNull() {
            addCriterion("orden_key_fec_dev is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevIsNotNull() {
            addCriterion("orden_key_fec_dev is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevEqualTo(Integer value) {
            addCriterion("orden_key_fec_dev =", value, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevNotEqualTo(Integer value) {
            addCriterion("orden_key_fec_dev <>", value, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevGreaterThan(Integer value) {
            addCriterion("orden_key_fec_dev >", value, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_dev >=", value, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevLessThan(Integer value) {
            addCriterion("orden_key_fec_dev <", value, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_fec_dev <=", value, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevIn(List<Integer> values) {
            addCriterion("orden_key_fec_dev in", values, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevNotIn(List<Integer> values) {
            addCriterion("orden_key_fec_dev not in", values, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_dev between", value1, value2, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyFecDevNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_fec_dev not between", value1, value2, "ordenKeyFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoIsNull() {
            addCriterion("orden_key_estado is null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoIsNotNull() {
            addCriterion("orden_key_estado is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoEqualTo(Integer value) {
            addCriterion("orden_key_estado =", value, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoNotEqualTo(Integer value) {
            addCriterion("orden_key_estado <>", value, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoGreaterThan(Integer value) {
            addCriterion("orden_key_estado >", value, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_key_estado >=", value, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoLessThan(Integer value) {
            addCriterion("orden_key_estado <", value, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("orden_key_estado <=", value, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoIn(List<Integer> values) {
            addCriterion("orden_key_estado in", values, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoNotIn(List<Integer> values) {
            addCriterion("orden_key_estado not in", values, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_estado between", value1, value2, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenKeyEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_key_estado not between", value1, value2, "ordenKeyEstado");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecIsNull() {
            addCriterion("orden_aten_en_fec is null");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecIsNotNull() {
            addCriterion("orden_aten_en_fec is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecEqualTo(Short value) {
            addCriterion("orden_aten_en_fec =", value, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecNotEqualTo(Short value) {
            addCriterion("orden_aten_en_fec <>", value, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecGreaterThan(Short value) {
            addCriterion("orden_aten_en_fec >", value, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecGreaterThanOrEqualTo(Short value) {
            addCriterion("orden_aten_en_fec >=", value, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecLessThan(Short value) {
            addCriterion("orden_aten_en_fec <", value, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecLessThanOrEqualTo(Short value) {
            addCriterion("orden_aten_en_fec <=", value, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecIn(List<Short> values) {
            addCriterion("orden_aten_en_fec in", values, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecNotIn(List<Short> values) {
            addCriterion("orden_aten_en_fec not in", values, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecBetween(Short value1, Short value2) {
            addCriterion("orden_aten_en_fec between", value1, value2, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenEnFecNotBetween(Short value1, Short value2) {
            addCriterion("orden_aten_en_fec not between", value1, value2, "ordenAtenEnFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecIsNull() {
            addCriterion("orden_aten_fuera_fec is null");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecIsNotNull() {
            addCriterion("orden_aten_fuera_fec is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecEqualTo(Short value) {
            addCriterion("orden_aten_fuera_fec =", value, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecNotEqualTo(Short value) {
            addCriterion("orden_aten_fuera_fec <>", value, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecGreaterThan(Short value) {
            addCriterion("orden_aten_fuera_fec >", value, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecGreaterThanOrEqualTo(Short value) {
            addCriterion("orden_aten_fuera_fec >=", value, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecLessThan(Short value) {
            addCriterion("orden_aten_fuera_fec <", value, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecLessThanOrEqualTo(Short value) {
            addCriterion("orden_aten_fuera_fec <=", value, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecIn(List<Short> values) {
            addCriterion("orden_aten_fuera_fec in", values, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecNotIn(List<Short> values) {
            addCriterion("orden_aten_fuera_fec not in", values, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecBetween(Short value1, Short value2) {
            addCriterion("orden_aten_fuera_fec between", value1, value2, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenAtenFueraFecNotBetween(Short value1, Short value2) {
            addCriterion("orden_aten_fuera_fec not between", value1, value2, "ordenAtenFueraFec");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadIsNull() {
            addCriterion("orden_ind_unidad is null");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadIsNotNull() {
            addCriterion("orden_ind_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadEqualTo(Short value) {
            addCriterion("orden_ind_unidad =", value, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadNotEqualTo(Short value) {
            addCriterion("orden_ind_unidad <>", value, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadGreaterThan(Short value) {
            addCriterion("orden_ind_unidad >", value, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadGreaterThanOrEqualTo(Short value) {
            addCriterion("orden_ind_unidad >=", value, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadLessThan(Short value) {
            addCriterion("orden_ind_unidad <", value, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadLessThanOrEqualTo(Short value) {
            addCriterion("orden_ind_unidad <=", value, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadIn(List<Short> values) {
            addCriterion("orden_ind_unidad in", values, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadNotIn(List<Short> values) {
            addCriterion("orden_ind_unidad not in", values, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadBetween(Short value1, Short value2) {
            addCriterion("orden_ind_unidad between", value1, value2, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenIndUnidadNotBetween(Short value1, Short value2) {
            addCriterion("orden_ind_unidad not between", value1, value2, "ordenIndUnidad");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcIsNull() {
            addCriterion("orden_cnt_dias_exc is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcIsNotNull() {
            addCriterion("orden_cnt_dias_exc is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcEqualTo(Integer value) {
            addCriterion("orden_cnt_dias_exc =", value, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcNotEqualTo(Integer value) {
            addCriterion("orden_cnt_dias_exc <>", value, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcGreaterThan(Integer value) {
            addCriterion("orden_cnt_dias_exc >", value, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_dias_exc >=", value, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcLessThan(Integer value) {
            addCriterion("orden_cnt_dias_exc <", value, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_dias_exc <=", value, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcIn(List<Integer> values) {
            addCriterion("orden_cnt_dias_exc in", values, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcNotIn(List<Integer> values) {
            addCriterion("orden_cnt_dias_exc not in", values, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_dias_exc between", value1, value2, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntDiasExcNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_dias_exc not between", value1, value2, "ordenCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosIsNull() {
            addCriterion("orden_cnt_cargos is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosIsNotNull() {
            addCriterion("orden_cnt_cargos is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos =", value, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosNotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos <>", value, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosGreaterThan(Integer value) {
            addCriterion("orden_cnt_cargos >", value, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos >=", value, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosLessThan(Integer value) {
            addCriterion("orden_cnt_cargos <", value, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos <=", value, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos in", values, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosNotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos not in", values, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos between", value1, value2, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos not between", value1, value2, "ordenCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuIsNull() {
            addCriterion("orden_cnt_cargos_anu is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuIsNotNull() {
            addCriterion("orden_cnt_cargos_anu is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_anu =", value, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuNotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_anu <>", value, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuGreaterThan(Integer value) {
            addCriterion("orden_cnt_cargos_anu >", value, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_anu >=", value, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuLessThan(Integer value) {
            addCriterion("orden_cnt_cargos_anu <", value, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_anu <=", value, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_anu in", values, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuNotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_anu not in", values, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_anu between", value1, value2, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosAnuNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_anu not between", value1, value2, "ordenCntCargosAnu");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntIsNull() {
            addCriterion("orden_cnt_cargos_ent is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntIsNotNull() {
            addCriterion("orden_cnt_cargos_ent is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ent =", value, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntNotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ent <>", value, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntGreaterThan(Integer value) {
            addCriterion("orden_cnt_cargos_ent >", value, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ent >=", value, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntLessThan(Integer value) {
            addCriterion("orden_cnt_cargos_ent <", value, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ent <=", value, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_ent in", values, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntNotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_ent not in", values, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_ent between", value1, value2, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosEntNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_ent not between", value1, value2, "ordenCntCargosEnt");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonIsNull() {
            addCriterion("orden_cnt_cargos_fue_zon is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonIsNotNull() {
            addCriterion("orden_cnt_cargos_fue_zon is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_fue_zon =", value, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonNotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_fue_zon <>", value, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonGreaterThan(Integer value) {
            addCriterion("orden_cnt_cargos_fue_zon >", value, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_fue_zon >=", value, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonLessThan(Integer value) {
            addCriterion("orden_cnt_cargos_fue_zon <", value, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_fue_zon <=", value, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_fue_zon in", values, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonNotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_fue_zon not in", values, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_fue_zon between", value1, value2, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosFueZonNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_fue_zon not between", value1, value2, "ordenCntCargosFueZon");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotIsNull() {
            addCriterion("orden_cnt_cargos_mot is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotIsNotNull() {
            addCriterion("orden_cnt_cargos_mot is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_mot =", value, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotNotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_mot <>", value, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotGreaterThan(Integer value) {
            addCriterion("orden_cnt_cargos_mot >", value, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_mot >=", value, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotLessThan(Integer value) {
            addCriterion("orden_cnt_cargos_mot <", value, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_mot <=", value, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_mot in", values, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotNotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_mot not in", values, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_mot between", value1, value2, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosMotNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_mot not between", value1, value2, "ordenCntCargosMot");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdIsNull() {
            addCriterion("orden_cnt_cargos_perd is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdIsNotNull() {
            addCriterion("orden_cnt_cargos_perd is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_perd =", value, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdNotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_perd <>", value, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdGreaterThan(Integer value) {
            addCriterion("orden_cnt_cargos_perd >", value, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_perd >=", value, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdLessThan(Integer value) {
            addCriterion("orden_cnt_cargos_perd <", value, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_perd <=", value, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_perd in", values, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdNotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_perd not in", values, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_perd between", value1, value2, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosPerdNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_perd not between", value1, value2, "ordenCntCargosPerd");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeIsNull() {
            addCriterion("orden_cnt_cargos_ree is null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeIsNotNull() {
            addCriterion("orden_cnt_cargos_ree is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ree =", value, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeNotEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ree <>", value, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeGreaterThan(Integer value) {
            addCriterion("orden_cnt_cargos_ree >", value, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ree >=", value, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeLessThan(Integer value) {
            addCriterion("orden_cnt_cargos_ree <", value, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeLessThanOrEqualTo(Integer value) {
            addCriterion("orden_cnt_cargos_ree <=", value, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_ree in", values, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeNotIn(List<Integer> values) {
            addCriterion("orden_cnt_cargos_ree not in", values, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_ree between", value1, value2, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenCntCargosReeNotBetween(Integer value1, Integer value2) {
            addCriterion("orden_cnt_cargos_ree not between", value1, value2, "ordenCntCargosRee");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteIsNull() {
            addCriterion("orden_mon_importe is null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteIsNotNull() {
            addCriterion("orden_mon_importe is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteEqualTo(BigDecimal value) {
            addCriterion("orden_mon_importe =", value, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteNotEqualTo(BigDecimal value) {
            addCriterion("orden_mon_importe <>", value, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteGreaterThan(BigDecimal value) {
            addCriterion("orden_mon_importe >", value, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_importe >=", value, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteLessThan(BigDecimal value) {
            addCriterion("orden_mon_importe <", value, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_importe <=", value, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteIn(List<BigDecimal> values) {
            addCriterion("orden_mon_importe in", values, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteNotIn(List<BigDecimal> values) {
            addCriterion("orden_mon_importe not in", values, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_importe between", value1, value2, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonImporteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_importe not between", value1, value2, "ordenMonImporte");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoIsNull() {
            addCriterion("orden_mon_descuento is null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoIsNotNull() {
            addCriterion("orden_mon_descuento is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoEqualTo(BigDecimal value) {
            addCriterion("orden_mon_descuento =", value, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("orden_mon_descuento <>", value, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoGreaterThan(BigDecimal value) {
            addCriterion("orden_mon_descuento >", value, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_descuento >=", value, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoLessThan(BigDecimal value) {
            addCriterion("orden_mon_descuento <", value, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_descuento <=", value, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoIn(List<BigDecimal> values) {
            addCriterion("orden_mon_descuento in", values, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("orden_mon_descuento not in", values, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_descuento between", value1, value2, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_descuento not between", value1, value2, "ordenMonDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvIsNull() {
            addCriterion("orden_mon_igv is null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvIsNotNull() {
            addCriterion("orden_mon_igv is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvEqualTo(BigDecimal value) {
            addCriterion("orden_mon_igv =", value, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvNotEqualTo(BigDecimal value) {
            addCriterion("orden_mon_igv <>", value, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvGreaterThan(BigDecimal value) {
            addCriterion("orden_mon_igv >", value, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_igv >=", value, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvLessThan(BigDecimal value) {
            addCriterion("orden_mon_igv <", value, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_igv <=", value, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvIn(List<BigDecimal> values) {
            addCriterion("orden_mon_igv in", values, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvNotIn(List<BigDecimal> values) {
            addCriterion("orden_mon_igv not in", values, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_igv between", value1, value2, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonIgvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_igv not between", value1, value2, "ordenMonIgv");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalIsNull() {
            addCriterion("orden_mon_total is null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalIsNotNull() {
            addCriterion("orden_mon_total is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalEqualTo(BigDecimal value) {
            addCriterion("orden_mon_total =", value, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalNotEqualTo(BigDecimal value) {
            addCriterion("orden_mon_total <>", value, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalGreaterThan(BigDecimal value) {
            addCriterion("orden_mon_total >", value, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_total >=", value, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalLessThan(BigDecimal value) {
            addCriterion("orden_mon_total <", value, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orden_mon_total <=", value, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalIn(List<BigDecimal> values) {
            addCriterion("orden_mon_total in", values, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalNotIn(List<BigDecimal> values) {
            addCriterion("orden_mon_total not in", values, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_total between", value1, value2, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andOrdenMonTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orden_mon_total not between", value1, value2, "ordenMonTotal");
            return (Criteria) this;
        }

        public Criteria andProcIdIsNull() {
            addCriterion("proc_id is null");
            return (Criteria) this;
        }

        public Criteria andProcIdIsNotNull() {
            addCriterion("proc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcIdEqualTo(Integer value) {
            addCriterion("proc_id =", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotEqualTo(Integer value) {
            addCriterion("proc_id <>", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdGreaterThan(Integer value) {
            addCriterion("proc_id >", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_id >=", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdLessThan(Integer value) {
            addCriterion("proc_id <", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdLessThanOrEqualTo(Integer value) {
            addCriterion("proc_id <=", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdIn(List<Integer> values) {
            addCriterion("proc_id in", values, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotIn(List<Integer> values) {
            addCriterion("proc_id not in", values, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdBetween(Integer value1, Integer value2) {
            addCriterion("proc_id between", value1, value2, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_id not between", value1, value2, "procId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}