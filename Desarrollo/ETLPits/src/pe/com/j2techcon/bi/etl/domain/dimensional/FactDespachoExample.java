package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FactDespachoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactDespachoExample() {
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

        public Criteria andDespachoKeyIsNull() {
            addCriterion("despacho_key is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyIsNotNull() {
            addCriterion("despacho_key is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEqualTo(Integer value) {
            addCriterion("despacho_key =", value, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyNotEqualTo(Integer value) {
            addCriterion("despacho_key <>", value, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyGreaterThan(Integer value) {
            addCriterion("despacho_key >", value, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key >=", value, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyLessThan(Integer value) {
            addCriterion("despacho_key <", value, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key <=", value, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyIn(List<Integer> values) {
            addCriterion("despacho_key in", values, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyNotIn(List<Integer> values) {
            addCriterion("despacho_key not in", values, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key between", value1, value2, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key not between", value1, value2, "despachoKey");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeIsNull() {
            addCriterion("despacho_key_sede is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeIsNotNull() {
            addCriterion("despacho_key_sede is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeEqualTo(Integer value) {
            addCriterion("despacho_key_sede =", value, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeNotEqualTo(Integer value) {
            addCriterion("despacho_key_sede <>", value, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeGreaterThan(Integer value) {
            addCriterion("despacho_key_sede >", value, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_sede >=", value, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeLessThan(Integer value) {
            addCriterion("despacho_key_sede <", value, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_sede <=", value, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeIn(List<Integer> values) {
            addCriterion("despacho_key_sede in", values, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeNotIn(List<Integer> values) {
            addCriterion("despacho_key_sede not in", values, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_sede between", value1, value2, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeySedeNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_sede not between", value1, value2, "despachoKeySede");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaIsNull() {
            addCriterion("despacho_key_zona is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaIsNotNull() {
            addCriterion("despacho_key_zona is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaEqualTo(Integer value) {
            addCriterion("despacho_key_zona =", value, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaNotEqualTo(Integer value) {
            addCriterion("despacho_key_zona <>", value, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaGreaterThan(Integer value) {
            addCriterion("despacho_key_zona >", value, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_zona >=", value, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaLessThan(Integer value) {
            addCriterion("despacho_key_zona <", value, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_zona <=", value, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaIn(List<Integer> values) {
            addCriterion("despacho_key_zona in", values, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaNotIn(List<Integer> values) {
            addCriterion("despacho_key_zona not in", values, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_zona between", value1, value2, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyZonaNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_zona not between", value1, value2, "despachoKeyZona");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalIsNull() {
            addCriterion("despacho_key_personal is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalIsNotNull() {
            addCriterion("despacho_key_personal is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalEqualTo(Integer value) {
            addCriterion("despacho_key_personal =", value, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalNotEqualTo(Integer value) {
            addCriterion("despacho_key_personal <>", value, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalGreaterThan(Integer value) {
            addCriterion("despacho_key_personal >", value, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_personal >=", value, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalLessThan(Integer value) {
            addCriterion("despacho_key_personal <", value, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_personal <=", value, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalIn(List<Integer> values) {
            addCriterion("despacho_key_personal in", values, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalNotIn(List<Integer> values) {
            addCriterion("despacho_key_personal not in", values, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_personal between", value1, value2, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyPersonalNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_personal not between", value1, value2, "despachoKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaIsNull() {
            addCriterion("despacho_key_tipo_ruta is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaIsNotNull() {
            addCriterion("despacho_key_tipo_ruta is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaEqualTo(Integer value) {
            addCriterion("despacho_key_tipo_ruta =", value, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaNotEqualTo(Integer value) {
            addCriterion("despacho_key_tipo_ruta <>", value, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaGreaterThan(Integer value) {
            addCriterion("despacho_key_tipo_ruta >", value, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_tipo_ruta >=", value, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaLessThan(Integer value) {
            addCriterion("despacho_key_tipo_ruta <", value, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_tipo_ruta <=", value, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaIn(List<Integer> values) {
            addCriterion("despacho_key_tipo_ruta in", values, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaNotIn(List<Integer> values) {
            addCriterion("despacho_key_tipo_ruta not in", values, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_tipo_ruta between", value1, value2, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyTipoRutaNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_tipo_ruta not between", value1, value2, "despachoKeyTipoRuta");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalIsNull() {
            addCriterion("despacho_key_fec_sal is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalIsNotNull() {
            addCriterion("despacho_key_fec_sal is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalEqualTo(Integer value) {
            addCriterion("despacho_key_fec_sal =", value, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalNotEqualTo(Integer value) {
            addCriterion("despacho_key_fec_sal <>", value, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalGreaterThan(Integer value) {
            addCriterion("despacho_key_fec_sal >", value, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_fec_sal >=", value, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalLessThan(Integer value) {
            addCriterion("despacho_key_fec_sal <", value, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_fec_sal <=", value, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalIn(List<Integer> values) {
            addCriterion("despacho_key_fec_sal in", values, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalNotIn(List<Integer> values) {
            addCriterion("despacho_key_fec_sal not in", values, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_fec_sal between", value1, value2, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecSalNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_fec_sal not between", value1, value2, "despachoKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpIsNull() {
            addCriterion("despacho_key_fec_retp is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpIsNotNull() {
            addCriterion("despacho_key_fec_retp is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retp =", value, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpNotEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retp <>", value, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpGreaterThan(Integer value) {
            addCriterion("despacho_key_fec_retp >", value, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retp >=", value, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpLessThan(Integer value) {
            addCriterion("despacho_key_fec_retp <", value, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retp <=", value, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpIn(List<Integer> values) {
            addCriterion("despacho_key_fec_retp in", values, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpNotIn(List<Integer> values) {
            addCriterion("despacho_key_fec_retp not in", values, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_fec_retp between", value1, value2, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetpNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_fec_retp not between", value1, value2, "despachoKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrIsNull() {
            addCriterion("despacho_key_fec_retr is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrIsNotNull() {
            addCriterion("despacho_key_fec_retr is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retr =", value, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrNotEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retr <>", value, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrGreaterThan(Integer value) {
            addCriterion("despacho_key_fec_retr >", value, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retr >=", value, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrLessThan(Integer value) {
            addCriterion("despacho_key_fec_retr <", value, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_fec_retr <=", value, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrIn(List<Integer> values) {
            addCriterion("despacho_key_fec_retr in", values, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrNotIn(List<Integer> values) {
            addCriterion("despacho_key_fec_retr not in", values, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_fec_retr between", value1, value2, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyFecRetrNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_fec_retr not between", value1, value2, "despachoKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoIsNull() {
            addCriterion("despacho_key_estado is null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoIsNotNull() {
            addCriterion("despacho_key_estado is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoEqualTo(Integer value) {
            addCriterion("despacho_key_estado =", value, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoNotEqualTo(Integer value) {
            addCriterion("despacho_key_estado <>", value, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoGreaterThan(Integer value) {
            addCriterion("despacho_key_estado >", value, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_estado >=", value, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoLessThan(Integer value) {
            addCriterion("despacho_key_estado <", value, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_key_estado <=", value, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoIn(List<Integer> values) {
            addCriterion("despacho_key_estado in", values, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoNotIn(List<Integer> values) {
            addCriterion("despacho_key_estado not in", values, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_estado between", value1, value2, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoKeyEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_key_estado not between", value1, value2, "despachoKeyEstado");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeIsNull() {
            addCriterion("despacho_mon_pasaje is null");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeIsNotNull() {
            addCriterion("despacho_mon_pasaje is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeEqualTo(BigDecimal value) {
            addCriterion("despacho_mon_pasaje =", value, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeNotEqualTo(BigDecimal value) {
            addCriterion("despacho_mon_pasaje <>", value, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeGreaterThan(BigDecimal value) {
            addCriterion("despacho_mon_pasaje >", value, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("despacho_mon_pasaje >=", value, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeLessThan(BigDecimal value) {
            addCriterion("despacho_mon_pasaje <", value, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("despacho_mon_pasaje <=", value, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeIn(List<BigDecimal> values) {
            addCriterion("despacho_mon_pasaje in", values, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeNotIn(List<BigDecimal> values) {
            addCriterion("despacho_mon_pasaje not in", values, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("despacho_mon_pasaje between", value1, value2, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoMonPasajeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("despacho_mon_pasaje not between", value1, value2, "despachoMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadIsNull() {
            addCriterion("despacho_ind_unidad is null");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadIsNotNull() {
            addCriterion("despacho_ind_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadEqualTo(Short value) {
            addCriterion("despacho_ind_unidad =", value, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadNotEqualTo(Short value) {
            addCriterion("despacho_ind_unidad <>", value, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadGreaterThan(Short value) {
            addCriterion("despacho_ind_unidad >", value, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadGreaterThanOrEqualTo(Short value) {
            addCriterion("despacho_ind_unidad >=", value, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadLessThan(Short value) {
            addCriterion("despacho_ind_unidad <", value, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadLessThanOrEqualTo(Short value) {
            addCriterion("despacho_ind_unidad <=", value, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadIn(List<Short> values) {
            addCriterion("despacho_ind_unidad in", values, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadNotIn(List<Short> values) {
            addCriterion("despacho_ind_unidad not in", values, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadBetween(Short value1, Short value2) {
            addCriterion("despacho_ind_unidad between", value1, value2, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoIndUnidadNotBetween(Short value1, Short value2) {
            addCriterion("despacho_ind_unidad not between", value1, value2, "despachoIndUnidad");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcIsNull() {
            addCriterion("despacho_cnt_dias_exc is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcIsNotNull() {
            addCriterion("despacho_cnt_dias_exc is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcEqualTo(Integer value) {
            addCriterion("despacho_cnt_dias_exc =", value, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_dias_exc <>", value, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcGreaterThan(Integer value) {
            addCriterion("despacho_cnt_dias_exc >", value, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_dias_exc >=", value, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcLessThan(Integer value) {
            addCriterion("despacho_cnt_dias_exc <", value, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_dias_exc <=", value, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcIn(List<Integer> values) {
            addCriterion("despacho_cnt_dias_exc in", values, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_dias_exc not in", values, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_dias_exc between", value1, value2, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntDiasExcNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_dias_exc not between", value1, value2, "despachoCntDiasExc");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosIsNull() {
            addCriterion("despacho_cnt_cargos is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosIsNotNull() {
            addCriterion("despacho_cnt_cargos is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosEqualTo(Integer value) {
            addCriterion("despacho_cnt_cargos =", value, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_cargos <>", value, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosGreaterThan(Integer value) {
            addCriterion("despacho_cnt_cargos >", value, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_cargos >=", value, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosLessThan(Integer value) {
            addCriterion("despacho_cnt_cargos <", value, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_cargos <=", value, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosIn(List<Integer> values) {
            addCriterion("despacho_cnt_cargos in", values, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_cargos not in", values, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_cargos between", value1, value2, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntCargosNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_cargos not between", value1, value2, "despachoCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntIsNull() {
            addCriterion("despacho_cnt_ent is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntIsNotNull() {
            addCriterion("despacho_cnt_ent is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntEqualTo(Integer value) {
            addCriterion("despacho_cnt_ent =", value, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_ent <>", value, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntGreaterThan(Integer value) {
            addCriterion("despacho_cnt_ent >", value, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_ent >=", value, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntLessThan(Integer value) {
            addCriterion("despacho_cnt_ent <", value, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_ent <=", value, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntIn(List<Integer> values) {
            addCriterion("despacho_cnt_ent in", values, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_ent not in", values, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_ent between", value1, value2, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntEntNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_ent not between", value1, value2, "despachoCntEnt");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotIsNull() {
            addCriterion("despacho_cnt_mot is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotIsNotNull() {
            addCriterion("despacho_cnt_mot is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotEqualTo(Integer value) {
            addCriterion("despacho_cnt_mot =", value, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_mot <>", value, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotGreaterThan(Integer value) {
            addCriterion("despacho_cnt_mot >", value, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_mot >=", value, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotLessThan(Integer value) {
            addCriterion("despacho_cnt_mot <", value, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_mot <=", value, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotIn(List<Integer> values) {
            addCriterion("despacho_cnt_mot in", values, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_mot not in", values, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_mot between", value1, value2, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntMotNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_mot not between", value1, value2, "despachoCntMot");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeIsNull() {
            addCriterion("despacho_cnt_ree is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeIsNotNull() {
            addCriterion("despacho_cnt_ree is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeEqualTo(Integer value) {
            addCriterion("despacho_cnt_ree =", value, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_ree <>", value, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeGreaterThan(Integer value) {
            addCriterion("despacho_cnt_ree >", value, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_ree >=", value, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeLessThan(Integer value) {
            addCriterion("despacho_cnt_ree <", value, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_ree <=", value, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeIn(List<Integer> values) {
            addCriterion("despacho_cnt_ree in", values, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_ree not in", values, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_ree between", value1, value2, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntReeNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_ree not between", value1, value2, "despachoCntRee");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuIsNull() {
            addCriterion("despacho_cnt_anu is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuIsNotNull() {
            addCriterion("despacho_cnt_anu is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuEqualTo(Integer value) {
            addCriterion("despacho_cnt_anu =", value, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_anu <>", value, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuGreaterThan(Integer value) {
            addCriterion("despacho_cnt_anu >", value, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_anu >=", value, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuLessThan(Integer value) {
            addCriterion("despacho_cnt_anu <", value, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_anu <=", value, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuIn(List<Integer> values) {
            addCriterion("despacho_cnt_anu in", values, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_anu not in", values, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_anu between", value1, value2, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntAnuNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_anu not between", value1, value2, "despachoCntAnu");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonIsNull() {
            addCriterion("despacho_cnt_fue_zon is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonIsNotNull() {
            addCriterion("despacho_cnt_fue_zon is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonEqualTo(Integer value) {
            addCriterion("despacho_cnt_fue_zon =", value, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_fue_zon <>", value, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonGreaterThan(Integer value) {
            addCriterion("despacho_cnt_fue_zon >", value, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_fue_zon >=", value, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonLessThan(Integer value) {
            addCriterion("despacho_cnt_fue_zon <", value, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_fue_zon <=", value, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonIn(List<Integer> values) {
            addCriterion("despacho_cnt_fue_zon in", values, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_fue_zon not in", values, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_fue_zon between", value1, value2, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntFueZonNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_fue_zon not between", value1, value2, "despachoCntFueZon");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdIsNull() {
            addCriterion("despacho_cnt_perd is null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdIsNotNull() {
            addCriterion("despacho_cnt_perd is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdEqualTo(Integer value) {
            addCriterion("despacho_cnt_perd =", value, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdNotEqualTo(Integer value) {
            addCriterion("despacho_cnt_perd <>", value, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdGreaterThan(Integer value) {
            addCriterion("despacho_cnt_perd >", value, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdGreaterThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_perd >=", value, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdLessThan(Integer value) {
            addCriterion("despacho_cnt_perd <", value, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdLessThanOrEqualTo(Integer value) {
            addCriterion("despacho_cnt_perd <=", value, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdIn(List<Integer> values) {
            addCriterion("despacho_cnt_perd in", values, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdNotIn(List<Integer> values) {
            addCriterion("despacho_cnt_perd not in", values, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_perd between", value1, value2, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoCntPerdNotBetween(Integer value1, Integer value2) {
            addCriterion("despacho_cnt_perd not between", value1, value2, "despachoCntPerd");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecIsNull() {
            addCriterion("despacho_trab_en_fec is null");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecIsNotNull() {
            addCriterion("despacho_trab_en_fec is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecEqualTo(Short value) {
            addCriterion("despacho_trab_en_fec =", value, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecNotEqualTo(Short value) {
            addCriterion("despacho_trab_en_fec <>", value, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecGreaterThan(Short value) {
            addCriterion("despacho_trab_en_fec >", value, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecGreaterThanOrEqualTo(Short value) {
            addCriterion("despacho_trab_en_fec >=", value, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecLessThan(Short value) {
            addCriterion("despacho_trab_en_fec <", value, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecLessThanOrEqualTo(Short value) {
            addCriterion("despacho_trab_en_fec <=", value, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecIn(List<Short> values) {
            addCriterion("despacho_trab_en_fec in", values, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecNotIn(List<Short> values) {
            addCriterion("despacho_trab_en_fec not in", values, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecBetween(Short value1, Short value2) {
            addCriterion("despacho_trab_en_fec between", value1, value2, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabEnFecNotBetween(Short value1, Short value2) {
            addCriterion("despacho_trab_en_fec not between", value1, value2, "despachoTrabEnFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecIsNull() {
            addCriterion("despacho_trab_fuera_fec is null");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecIsNotNull() {
            addCriterion("despacho_trab_fuera_fec is not null");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecEqualTo(Short value) {
            addCriterion("despacho_trab_fuera_fec =", value, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecNotEqualTo(Short value) {
            addCriterion("despacho_trab_fuera_fec <>", value, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecGreaterThan(Short value) {
            addCriterion("despacho_trab_fuera_fec >", value, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecGreaterThanOrEqualTo(Short value) {
            addCriterion("despacho_trab_fuera_fec >=", value, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecLessThan(Short value) {
            addCriterion("despacho_trab_fuera_fec <", value, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecLessThanOrEqualTo(Short value) {
            addCriterion("despacho_trab_fuera_fec <=", value, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecIn(List<Short> values) {
            addCriterion("despacho_trab_fuera_fec in", values, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecNotIn(List<Short> values) {
            addCriterion("despacho_trab_fuera_fec not in", values, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecBetween(Short value1, Short value2) {
            addCriterion("despacho_trab_fuera_fec between", value1, value2, "despachoTrabFueraFec");
            return (Criteria) this;
        }

        public Criteria andDespachoTrabFueraFecNotBetween(Short value1, Short value2) {
            addCriterion("despacho_trab_fuera_fec not between", value1, value2, "despachoTrabFueraFec");
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