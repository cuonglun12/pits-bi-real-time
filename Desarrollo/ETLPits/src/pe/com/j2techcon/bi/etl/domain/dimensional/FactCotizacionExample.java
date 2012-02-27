package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FactCotizacionExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactCotizacionExample() {
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

        public Criteria andCotizacionKeyIsNull() {
            addCriterion("cotizacion_key is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyIsNotNull() {
            addCriterion("cotizacion_key is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEqualTo(Integer value) {
            addCriterion("cotizacion_key =", value, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyNotEqualTo(Integer value) {
            addCriterion("cotizacion_key <>", value, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyGreaterThan(Integer value) {
            addCriterion("cotizacion_key >", value, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key >=", value, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyLessThan(Integer value) {
            addCriterion("cotizacion_key <", value, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key <=", value, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyIn(List<Integer> values) {
            addCriterion("cotizacion_key in", values, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyNotIn(List<Integer> values) {
            addCriterion("cotizacion_key not in", values, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key between", value1, value2, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key not between", value1, value2, "cotizacionKey");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteIsNull() {
            addCriterion("cotizacion_key_cliente is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteIsNotNull() {
            addCriterion("cotizacion_key_cliente is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteEqualTo(Integer value) {
            addCriterion("cotizacion_key_cliente =", value, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_cliente <>", value, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteGreaterThan(Integer value) {
            addCriterion("cotizacion_key_cliente >", value, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_cliente >=", value, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteLessThan(Integer value) {
            addCriterion("cotizacion_key_cliente <", value, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_cliente <=", value, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteIn(List<Integer> values) {
            addCriterion("cotizacion_key_cliente in", values, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_cliente not in", values, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_cliente between", value1, value2, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyClienteNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_cliente not between", value1, value2, "cotizacionKeyCliente");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioIsNull() {
            addCriterion("cotizacion_key_servicio is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioIsNotNull() {
            addCriterion("cotizacion_key_servicio is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioEqualTo(Integer value) {
            addCriterion("cotizacion_key_servicio =", value, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_servicio <>", value, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioGreaterThan(Integer value) {
            addCriterion("cotizacion_key_servicio >", value, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_servicio >=", value, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioLessThan(Integer value) {
            addCriterion("cotizacion_key_servicio <", value, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_servicio <=", value, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioIn(List<Integer> values) {
            addCriterion("cotizacion_key_servicio in", values, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_servicio not in", values, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_servicio between", value1, value2, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyServicioNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_servicio not between", value1, value2, "cotizacionKeyServicio");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoIsNull() {
            addCriterion("cotizacion_key_producto is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoIsNotNull() {
            addCriterion("cotizacion_key_producto is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoEqualTo(Integer value) {
            addCriterion("cotizacion_key_producto =", value, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_producto <>", value, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoGreaterThan(Integer value) {
            addCriterion("cotizacion_key_producto >", value, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_producto >=", value, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoLessThan(Integer value) {
            addCriterion("cotizacion_key_producto <", value, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_producto <=", value, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoIn(List<Integer> values) {
            addCriterion("cotizacion_key_producto in", values, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_producto not in", values, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_producto between", value1, value2, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyProductoNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_producto not between", value1, value2, "cotizacionKeyProducto");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegIsNull() {
            addCriterion("cotizacion_key_fec_reg is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegIsNotNull() {
            addCriterion("cotizacion_key_fec_reg is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_reg =", value, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_reg <>", value, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegGreaterThan(Integer value) {
            addCriterion("cotizacion_key_fec_reg >", value, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_reg >=", value, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegLessThan(Integer value) {
            addCriterion("cotizacion_key_fec_reg <", value, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_reg <=", value, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_reg in", values, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_reg not in", values, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_reg between", value1, value2, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecRegNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_reg not between", value1, value2, "cotizacionKeyFecReg");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproIsNull() {
            addCriterion("cotizacion_key_fec_apro is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproIsNotNull() {
            addCriterion("cotizacion_key_fec_apro is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_apro =", value, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_apro <>", value, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproGreaterThan(Integer value) {
            addCriterion("cotizacion_key_fec_apro >", value, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_apro >=", value, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproLessThan(Integer value) {
            addCriterion("cotizacion_key_fec_apro <", value, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_apro <=", value, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_apro in", values, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_apro not in", values, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_apro between", value1, value2, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecAproNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_apro not between", value1, value2, "cotizacionKeyFecApro");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniIsNull() {
            addCriterion("cotizacion_key_fec_ini is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniIsNotNull() {
            addCriterion("cotizacion_key_fec_ini is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_ini =", value, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_ini <>", value, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniGreaterThan(Integer value) {
            addCriterion("cotizacion_key_fec_ini >", value, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_ini >=", value, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniLessThan(Integer value) {
            addCriterion("cotizacion_key_fec_ini <", value, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_ini <=", value, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_ini in", values, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_ini not in", values, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_ini between", value1, value2, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecIniNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_ini not between", value1, value2, "cotizacionKeyFecIni");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinIsNull() {
            addCriterion("cotizacion_key_fec_fin is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinIsNotNull() {
            addCriterion("cotizacion_key_fec_fin is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_fin =", value, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_fin <>", value, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinGreaterThan(Integer value) {
            addCriterion("cotizacion_key_fec_fin >", value, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_fin >=", value, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinLessThan(Integer value) {
            addCriterion("cotizacion_key_fec_fin <", value, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_fec_fin <=", value, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_fin in", values, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_fec_fin not in", values, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_fin between", value1, value2, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyFecFinNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_fec_fin not between", value1, value2, "cotizacionKeyFecFin");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoIsNull() {
            addCriterion("cotizacion_key_estado is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoIsNotNull() {
            addCriterion("cotizacion_key_estado is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoEqualTo(Integer value) {
            addCriterion("cotizacion_key_estado =", value, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoNotEqualTo(Integer value) {
            addCriterion("cotizacion_key_estado <>", value, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoGreaterThan(Integer value) {
            addCriterion("cotizacion_key_estado >", value, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_estado >=", value, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoLessThan(Integer value) {
            addCriterion("cotizacion_key_estado <", value, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_key_estado <=", value, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoIn(List<Integer> values) {
            addCriterion("cotizacion_key_estado in", values, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoNotIn(List<Integer> values) {
            addCriterion("cotizacion_key_estado not in", values, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_estado between", value1, value2, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionKeyEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_key_estado not between", value1, value2, "cotizacionKeyEstado");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntIsNull() {
            addCriterion("cotizacion_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntIsNotNull() {
            addCriterion("cotizacion_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntEqualTo(Integer value) {
            addCriterion("cotizacion_cnt =", value, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt <>", value, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt >", value, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt >=", value, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntLessThan(Integer value) {
            addCriterion("cotizacion_cnt <", value, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt <=", value, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntIn(List<Integer> values) {
            addCriterion("cotizacion_cnt in", values, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt not in", values, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt between", value1, value2, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt not between", value1, value2, "cotizacionCnt");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalIsNull() {
            addCriterion("cotizacion_cnt_ord_total is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalIsNotNull() {
            addCriterion("cotizacion_cnt_ord_total is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_total =", value, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_total <>", value, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_total >", value, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_total >=", value, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalLessThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_total <", value, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_total <=", value, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_total in", values, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_total not in", values, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_total between", value1, value2, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_total not between", value1, value2, "cotizacionCntOrdTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabIsNull() {
            addCriterion("cotizacion_cnt_ord_en_trab is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabIsNotNull() {
            addCriterion("cotizacion_cnt_ord_en_trab is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_en_trab =", value, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_en_trab <>", value, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_en_trab >", value, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_en_trab >=", value, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabLessThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_en_trab <", value, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_en_trab <=", value, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_en_trab in", values, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_en_trab not in", values, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_en_trab between", value1, value2, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdEnTrabNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_en_trab not between", value1, value2, "cotizacionCntOrdEnTrab");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerIsNull() {
            addCriterion("cotizacion_cnt_ord_cer is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerIsNotNull() {
            addCriterion("cotizacion_cnt_ord_cer is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cer =", value, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cer <>", value, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_cer >", value, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cer >=", value, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerLessThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_cer <", value, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cer <=", value, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_cer in", values, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_cer not in", values, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_cer between", value1, value2, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCerNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_cer not between", value1, value2, "cotizacionCntOrdCer");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoIsNull() {
            addCriterion("cotizacion_cnt_ord_catiempo is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoIsNotNull() {
            addCriterion("cotizacion_cnt_ord_catiempo is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_catiempo =", value, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_catiempo <>", value, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_catiempo >", value, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_catiempo >=", value, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoLessThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_catiempo <", value, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_catiempo <=", value, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_catiempo in", values, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_catiempo not in", values, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_catiempo between", value1, value2, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCatiempoNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_catiempo not between", value1, value2, "cotizacionCntOrdCatiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoIsNull() {
            addCriterion("cotizacion_cnt_ord_cftiempo is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoIsNotNull() {
            addCriterion("cotizacion_cnt_ord_cftiempo is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cftiempo =", value, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cftiempo <>", value, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_cftiempo >", value, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cftiempo >=", value, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoLessThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_cftiempo <", value, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_cftiempo <=", value, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_cftiempo in", values, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_cftiempo not in", values, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_cftiempo between", value1, value2, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCftiempoNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_cftiempo not between", value1, value2, "cotizacionCntOrdCftiempo");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacIsNull() {
            addCriterion("cotizacion_cnt_ord_fac is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacIsNotNull() {
            addCriterion("cotizacion_cnt_ord_fac is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_fac =", value, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_fac <>", value, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_fac >", value, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_fac >=", value, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacLessThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_fac <", value, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_fac <=", value, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_fac in", values, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_fac not in", values, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_fac between", value1, value2, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdFacNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_fac not between", value1, value2, "cotizacionCntOrdFac");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanIsNull() {
            addCriterion("cotizacion_cnt_ord_can is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanIsNotNull() {
            addCriterion("cotizacion_cnt_ord_can is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_can =", value, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanNotEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_can <>", value, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanGreaterThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_can >", value, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanGreaterThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_can >=", value, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanLessThan(Integer value) {
            addCriterion("cotizacion_cnt_ord_can <", value, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanLessThanOrEqualTo(Integer value) {
            addCriterion("cotizacion_cnt_ord_can <=", value, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_can in", values, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanNotIn(List<Integer> values) {
            addCriterion("cotizacion_cnt_ord_can not in", values, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_can between", value1, value2, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionCntOrdCanNotBetween(Integer value1, Integer value2) {
            addCriterion("cotizacion_cnt_ord_can not between", value1, value2, "cotizacionCntOrdCan");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteIsNull() {
            addCriterion("cotizacion_mon_importe is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteIsNotNull() {
            addCriterion("cotizacion_mon_importe is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_importe =", value, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteNotEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_importe <>", value, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteGreaterThan(BigDecimal value) {
            addCriterion("cotizacion_mon_importe >", value, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_importe >=", value, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteLessThan(BigDecimal value) {
            addCriterion("cotizacion_mon_importe <", value, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_importe <=", value, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteIn(List<BigDecimal> values) {
            addCriterion("cotizacion_mon_importe in", values, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteNotIn(List<BigDecimal> values) {
            addCriterion("cotizacion_mon_importe not in", values, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotizacion_mon_importe between", value1, value2, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonImporteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotizacion_mon_importe not between", value1, value2, "cotizacionMonImporte");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvIsNull() {
            addCriterion("cotizacion_mon_igv is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvIsNotNull() {
            addCriterion("cotizacion_mon_igv is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_igv =", value, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvNotEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_igv <>", value, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvGreaterThan(BigDecimal value) {
            addCriterion("cotizacion_mon_igv >", value, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_igv >=", value, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvLessThan(BigDecimal value) {
            addCriterion("cotizacion_mon_igv <", value, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_igv <=", value, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvIn(List<BigDecimal> values) {
            addCriterion("cotizacion_mon_igv in", values, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvNotIn(List<BigDecimal> values) {
            addCriterion("cotizacion_mon_igv not in", values, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotizacion_mon_igv between", value1, value2, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonIgvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotizacion_mon_igv not between", value1, value2, "cotizacionMonIgv");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalIsNull() {
            addCriterion("cotizacion_mon_total is null");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalIsNotNull() {
            addCriterion("cotizacion_mon_total is not null");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_total =", value, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalNotEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_total <>", value, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalGreaterThan(BigDecimal value) {
            addCriterion("cotizacion_mon_total >", value, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_total >=", value, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalLessThan(BigDecimal value) {
            addCriterion("cotizacion_mon_total <", value, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cotizacion_mon_total <=", value, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalIn(List<BigDecimal> values) {
            addCriterion("cotizacion_mon_total in", values, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalNotIn(List<BigDecimal> values) {
            addCriterion("cotizacion_mon_total not in", values, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotizacion_mon_total between", value1, value2, "cotizacionMonTotal");
            return (Criteria) this;
        }

        public Criteria andCotizacionMonTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotizacion_mon_total not between", value1, value2, "cotizacionMonTotal");
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