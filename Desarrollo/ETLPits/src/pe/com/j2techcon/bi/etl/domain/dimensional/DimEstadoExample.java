package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimEstadoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimEstadoExample() {
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

        public Criteria andEstadoKeyIsNull() {
            addCriterion("estado_key is null");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyIsNotNull() {
            addCriterion("estado_key is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyEqualTo(Integer value) {
            addCriterion("estado_key =", value, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyNotEqualTo(Integer value) {
            addCriterion("estado_key <>", value, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyGreaterThan(Integer value) {
            addCriterion("estado_key >", value, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("estado_key >=", value, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyLessThan(Integer value) {
            addCriterion("estado_key <", value, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("estado_key <=", value, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyIn(List<Integer> values) {
            addCriterion("estado_key in", values, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyNotIn(List<Integer> values) {
            addCriterion("estado_key not in", values, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyBetween(Integer value1, Integer value2) {
            addCriterion("estado_key between", value1, value2, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("estado_key not between", value1, value2, "estadoKey");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoIsNull() {
            addCriterion("estado_cod_tipo is null");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoIsNotNull() {
            addCriterion("estado_cod_tipo is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoEqualTo(String value) {
            addCriterion("estado_cod_tipo =", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoNotEqualTo(String value) {
            addCriterion("estado_cod_tipo <>", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoGreaterThan(String value) {
            addCriterion("estado_cod_tipo >", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoGreaterThanOrEqualTo(String value) {
            addCriterion("estado_cod_tipo >=", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoLessThan(String value) {
            addCriterion("estado_cod_tipo <", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoLessThanOrEqualTo(String value) {
            addCriterion("estado_cod_tipo <=", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoLike(String value) {
            addCriterion("estado_cod_tipo like", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoNotLike(String value) {
            addCriterion("estado_cod_tipo not like", value, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoIn(List<String> values) {
            addCriterion("estado_cod_tipo in", values, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoNotIn(List<String> values) {
            addCriterion("estado_cod_tipo not in", values, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoBetween(String value1, String value2) {
            addCriterion("estado_cod_tipo between", value1, value2, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodTipoNotBetween(String value1, String value2) {
            addCriterion("estado_cod_tipo not between", value1, value2, "estadoCodTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoIsNull() {
            addCriterion("estado_desc_tipo is null");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoIsNotNull() {
            addCriterion("estado_desc_tipo is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoEqualTo(String value) {
            addCriterion("estado_desc_tipo =", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoNotEqualTo(String value) {
            addCriterion("estado_desc_tipo <>", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoGreaterThan(String value) {
            addCriterion("estado_desc_tipo >", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoGreaterThanOrEqualTo(String value) {
            addCriterion("estado_desc_tipo >=", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoLessThan(String value) {
            addCriterion("estado_desc_tipo <", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoLessThanOrEqualTo(String value) {
            addCriterion("estado_desc_tipo <=", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoLike(String value) {
            addCriterion("estado_desc_tipo like", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoNotLike(String value) {
            addCriterion("estado_desc_tipo not like", value, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoIn(List<String> values) {
            addCriterion("estado_desc_tipo in", values, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoNotIn(List<String> values) {
            addCriterion("estado_desc_tipo not in", values, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoBetween(String value1, String value2) {
            addCriterion("estado_desc_tipo between", value1, value2, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoDescTipoNotBetween(String value1, String value2) {
            addCriterion("estado_desc_tipo not between", value1, value2, "estadoDescTipo");
            return (Criteria) this;
        }

        public Criteria andEstadoCodIsNull() {
            addCriterion("estado_cod is null");
            return (Criteria) this;
        }

        public Criteria andEstadoCodIsNotNull() {
            addCriterion("estado_cod is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoCodEqualTo(String value) {
            addCriterion("estado_cod =", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodNotEqualTo(String value) {
            addCriterion("estado_cod <>", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodGreaterThan(String value) {
            addCriterion("estado_cod >", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodGreaterThanOrEqualTo(String value) {
            addCriterion("estado_cod >=", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodLessThan(String value) {
            addCriterion("estado_cod <", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodLessThanOrEqualTo(String value) {
            addCriterion("estado_cod <=", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodLike(String value) {
            addCriterion("estado_cod like", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodNotLike(String value) {
            addCriterion("estado_cod not like", value, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodIn(List<String> values) {
            addCriterion("estado_cod in", values, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodNotIn(List<String> values) {
            addCriterion("estado_cod not in", values, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodBetween(String value1, String value2) {
            addCriterion("estado_cod between", value1, value2, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoCodNotBetween(String value1, String value2) {
            addCriterion("estado_cod not between", value1, value2, "estadoCod");
            return (Criteria) this;
        }

        public Criteria andEstadoDescIsNull() {
            addCriterion("estado_desc is null");
            return (Criteria) this;
        }

        public Criteria andEstadoDescIsNotNull() {
            addCriterion("estado_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoDescEqualTo(String value) {
            addCriterion("estado_desc =", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescNotEqualTo(String value) {
            addCriterion("estado_desc <>", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescGreaterThan(String value) {
            addCriterion("estado_desc >", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescGreaterThanOrEqualTo(String value) {
            addCriterion("estado_desc >=", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescLessThan(String value) {
            addCriterion("estado_desc <", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescLessThanOrEqualTo(String value) {
            addCriterion("estado_desc <=", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescLike(String value) {
            addCriterion("estado_desc like", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescNotLike(String value) {
            addCriterion("estado_desc not like", value, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescIn(List<String> values) {
            addCriterion("estado_desc in", values, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescNotIn(List<String> values) {
            addCriterion("estado_desc not in", values, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescBetween(String value1, String value2) {
            addCriterion("estado_desc between", value1, value2, "estadoDesc");
            return (Criteria) this;
        }

        public Criteria andEstadoDescNotBetween(String value1, String value2) {
            addCriterion("estado_desc not between", value1, value2, "estadoDesc");
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