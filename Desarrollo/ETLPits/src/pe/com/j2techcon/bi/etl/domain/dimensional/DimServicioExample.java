package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimServicioExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimServicioExample() {
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

        public Criteria andServicioKeyIsNull() {
            addCriterion("servicio_key is null");
            return (Criteria) this;
        }

        public Criteria andServicioKeyIsNotNull() {
            addCriterion("servicio_key is not null");
            return (Criteria) this;
        }

        public Criteria andServicioKeyEqualTo(Integer value) {
            addCriterion("servicio_key =", value, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyNotEqualTo(Integer value) {
            addCriterion("servicio_key <>", value, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyGreaterThan(Integer value) {
            addCriterion("servicio_key >", value, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicio_key >=", value, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyLessThan(Integer value) {
            addCriterion("servicio_key <", value, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyLessThanOrEqualTo(Integer value) {
            addCriterion("servicio_key <=", value, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyIn(List<Integer> values) {
            addCriterion("servicio_key in", values, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyNotIn(List<Integer> values) {
            addCriterion("servicio_key not in", values, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyBetween(Integer value1, Integer value2) {
            addCriterion("servicio_key between", value1, value2, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("servicio_key not between", value1, value2, "servicioKey");
            return (Criteria) this;
        }

        public Criteria andServicioCodIsNull() {
            addCriterion("servicio_cod is null");
            return (Criteria) this;
        }

        public Criteria andServicioCodIsNotNull() {
            addCriterion("servicio_cod is not null");
            return (Criteria) this;
        }

        public Criteria andServicioCodEqualTo(String value) {
            addCriterion("servicio_cod =", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodNotEqualTo(String value) {
            addCriterion("servicio_cod <>", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodGreaterThan(String value) {
            addCriterion("servicio_cod >", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodGreaterThanOrEqualTo(String value) {
            addCriterion("servicio_cod >=", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodLessThan(String value) {
            addCriterion("servicio_cod <", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodLessThanOrEqualTo(String value) {
            addCriterion("servicio_cod <=", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodLike(String value) {
            addCriterion("servicio_cod like", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodNotLike(String value) {
            addCriterion("servicio_cod not like", value, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodIn(List<String> values) {
            addCriterion("servicio_cod in", values, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodNotIn(List<String> values) {
            addCriterion("servicio_cod not in", values, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodBetween(String value1, String value2) {
            addCriterion("servicio_cod between", value1, value2, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodNotBetween(String value1, String value2) {
            addCriterion("servicio_cod not between", value1, value2, "servicioCod");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoIsNull() {
            addCriterion("servicio_cod_ambito is null");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoIsNotNull() {
            addCriterion("servicio_cod_ambito is not null");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoEqualTo(Integer value) {
            addCriterion("servicio_cod_ambito =", value, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoNotEqualTo(Integer value) {
            addCriterion("servicio_cod_ambito <>", value, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoGreaterThan(Integer value) {
            addCriterion("servicio_cod_ambito >", value, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicio_cod_ambito >=", value, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoLessThan(Integer value) {
            addCriterion("servicio_cod_ambito <", value, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoLessThanOrEqualTo(Integer value) {
            addCriterion("servicio_cod_ambito <=", value, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoIn(List<Integer> values) {
            addCriterion("servicio_cod_ambito in", values, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoNotIn(List<Integer> values) {
            addCriterion("servicio_cod_ambito not in", values, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoBetween(Integer value1, Integer value2) {
            addCriterion("servicio_cod_ambito between", value1, value2, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodAmbitoNotBetween(Integer value1, Integer value2) {
            addCriterion("servicio_cod_ambito not between", value1, value2, "servicioCodAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoIsNull() {
            addCriterion("servicio_desc_ambito is null");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoIsNotNull() {
            addCriterion("servicio_desc_ambito is not null");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoEqualTo(String value) {
            addCriterion("servicio_desc_ambito =", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoNotEqualTo(String value) {
            addCriterion("servicio_desc_ambito <>", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoGreaterThan(String value) {
            addCriterion("servicio_desc_ambito >", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoGreaterThanOrEqualTo(String value) {
            addCriterion("servicio_desc_ambito >=", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoLessThan(String value) {
            addCriterion("servicio_desc_ambito <", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoLessThanOrEqualTo(String value) {
            addCriterion("servicio_desc_ambito <=", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoLike(String value) {
            addCriterion("servicio_desc_ambito like", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoNotLike(String value) {
            addCriterion("servicio_desc_ambito not like", value, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoIn(List<String> values) {
            addCriterion("servicio_desc_ambito in", values, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoNotIn(List<String> values) {
            addCriterion("servicio_desc_ambito not in", values, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoBetween(String value1, String value2) {
            addCriterion("servicio_desc_ambito between", value1, value2, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioDescAmbitoNotBetween(String value1, String value2) {
            addCriterion("servicio_desc_ambito not between", value1, value2, "servicioDescAmbito");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioIsNull() {
            addCriterion("servicio_cod_negocio is null");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioIsNotNull() {
            addCriterion("servicio_cod_negocio is not null");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioEqualTo(Integer value) {
            addCriterion("servicio_cod_negocio =", value, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioNotEqualTo(Integer value) {
            addCriterion("servicio_cod_negocio <>", value, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioGreaterThan(Integer value) {
            addCriterion("servicio_cod_negocio >", value, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicio_cod_negocio >=", value, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioLessThan(Integer value) {
            addCriterion("servicio_cod_negocio <", value, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioLessThanOrEqualTo(Integer value) {
            addCriterion("servicio_cod_negocio <=", value, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioIn(List<Integer> values) {
            addCriterion("servicio_cod_negocio in", values, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioNotIn(List<Integer> values) {
            addCriterion("servicio_cod_negocio not in", values, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioBetween(Integer value1, Integer value2) {
            addCriterion("servicio_cod_negocio between", value1, value2, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioCodNegocioNotBetween(Integer value1, Integer value2) {
            addCriterion("servicio_cod_negocio not between", value1, value2, "servicioCodNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioIsNull() {
            addCriterion("servicio_desc_negocio is null");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioIsNotNull() {
            addCriterion("servicio_desc_negocio is not null");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioEqualTo(String value) {
            addCriterion("servicio_desc_negocio =", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioNotEqualTo(String value) {
            addCriterion("servicio_desc_negocio <>", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioGreaterThan(String value) {
            addCriterion("servicio_desc_negocio >", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioGreaterThanOrEqualTo(String value) {
            addCriterion("servicio_desc_negocio >=", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioLessThan(String value) {
            addCriterion("servicio_desc_negocio <", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioLessThanOrEqualTo(String value) {
            addCriterion("servicio_desc_negocio <=", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioLike(String value) {
            addCriterion("servicio_desc_negocio like", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioNotLike(String value) {
            addCriterion("servicio_desc_negocio not like", value, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioIn(List<String> values) {
            addCriterion("servicio_desc_negocio in", values, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioNotIn(List<String> values) {
            addCriterion("servicio_desc_negocio not in", values, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioBetween(String value1, String value2) {
            addCriterion("servicio_desc_negocio between", value1, value2, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescNegocioNotBetween(String value1, String value2) {
            addCriterion("servicio_desc_negocio not between", value1, value2, "servicioDescNegocio");
            return (Criteria) this;
        }

        public Criteria andServicioDescIsNull() {
            addCriterion("servicio_desc is null");
            return (Criteria) this;
        }

        public Criteria andServicioDescIsNotNull() {
            addCriterion("servicio_desc is not null");
            return (Criteria) this;
        }

        public Criteria andServicioDescEqualTo(String value) {
            addCriterion("servicio_desc =", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescNotEqualTo(String value) {
            addCriterion("servicio_desc <>", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescGreaterThan(String value) {
            addCriterion("servicio_desc >", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescGreaterThanOrEqualTo(String value) {
            addCriterion("servicio_desc >=", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescLessThan(String value) {
            addCriterion("servicio_desc <", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescLessThanOrEqualTo(String value) {
            addCriterion("servicio_desc <=", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescLike(String value) {
            addCriterion("servicio_desc like", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescNotLike(String value) {
            addCriterion("servicio_desc not like", value, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescIn(List<String> values) {
            addCriterion("servicio_desc in", values, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescNotIn(List<String> values) {
            addCriterion("servicio_desc not in", values, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescBetween(String value1, String value2) {
            addCriterion("servicio_desc between", value1, value2, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andServicioDescNotBetween(String value1, String value2) {
            addCriterion("servicio_desc not between", value1, value2, "servicioDesc");
            return (Criteria) this;
        }

        public Criteria andCodIndCamIsNull() {
            addCriterion("cod_ind_cam is null");
            return (Criteria) this;
        }

        public Criteria andCodIndCamIsNotNull() {
            addCriterion("cod_ind_cam is not null");
            return (Criteria) this;
        }

        public Criteria andCodIndCamEqualTo(String value) {
            addCriterion("cod_ind_cam =", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotEqualTo(String value) {
            addCriterion("cod_ind_cam <>", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamGreaterThan(String value) {
            addCriterion("cod_ind_cam >", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamGreaterThanOrEqualTo(String value) {
            addCriterion("cod_ind_cam >=", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamLessThan(String value) {
            addCriterion("cod_ind_cam <", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamLessThanOrEqualTo(String value) {
            addCriterion("cod_ind_cam <=", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamLike(String value) {
            addCriterion("cod_ind_cam like", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotLike(String value) {
            addCriterion("cod_ind_cam not like", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamIn(List<String> values) {
            addCriterion("cod_ind_cam in", values, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotIn(List<String> values) {
            addCriterion("cod_ind_cam not in", values, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamBetween(String value1, String value2) {
            addCriterion("cod_ind_cam between", value1, value2, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotBetween(String value1, String value2) {
            addCriterion("cod_ind_cam not between", value1, value2, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIsNull() {
            addCriterion("fec_num_cam is null");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIsNotNull() {
            addCriterion("fec_num_cam is not null");
            return (Criteria) this;
        }

        public Criteria andFecNumCamEqualTo(Integer value) {
            addCriterion("fec_num_cam =", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotEqualTo(Integer value) {
            addCriterion("fec_num_cam <>", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThan(Integer value) {
            addCriterion("fec_num_cam >", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThanOrEqualTo(Integer value) {
            addCriterion("fec_num_cam >=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThan(Integer value) {
            addCriterion("fec_num_cam <", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThanOrEqualTo(Integer value) {
            addCriterion("fec_num_cam <=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIn(List<Integer> values) {
            addCriterion("fec_num_cam in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotIn(List<Integer> values) {
            addCriterion("fec_num_cam not in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamBetween(Integer value1, Integer value2) {
            addCriterion("fec_num_cam between", value1, value2, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotBetween(Integer value1, Integer value2) {
            addCriterion("fec_num_cam not between", value1, value2, "fecNumCam");
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