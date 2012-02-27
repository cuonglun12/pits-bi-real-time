package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimTipoRutaExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimTipoRutaExample() {
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

        public Criteria andTipoRutaKeyIsNull() {
            addCriterion("tipo_ruta_key is null");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyIsNotNull() {
            addCriterion("tipo_ruta_key is not null");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyEqualTo(Integer value) {
            addCriterion("tipo_ruta_key =", value, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyNotEqualTo(Integer value) {
            addCriterion("tipo_ruta_key <>", value, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyGreaterThan(Integer value) {
            addCriterion("tipo_ruta_key >", value, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipo_ruta_key >=", value, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyLessThan(Integer value) {
            addCriterion("tipo_ruta_key <", value, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyLessThanOrEqualTo(Integer value) {
            addCriterion("tipo_ruta_key <=", value, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyIn(List<Integer> values) {
            addCriterion("tipo_ruta_key in", values, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyNotIn(List<Integer> values) {
            addCriterion("tipo_ruta_key not in", values, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyBetween(Integer value1, Integer value2) {
            addCriterion("tipo_ruta_key between", value1, value2, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("tipo_ruta_key not between", value1, value2, "tipoRutaKey");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodIsNull() {
            addCriterion("tipo_ruta_cod is null");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodIsNotNull() {
            addCriterion("tipo_ruta_cod is not null");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodEqualTo(String value) {
            addCriterion("tipo_ruta_cod =", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodNotEqualTo(String value) {
            addCriterion("tipo_ruta_cod <>", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodGreaterThan(String value) {
            addCriterion("tipo_ruta_cod >", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_ruta_cod >=", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodLessThan(String value) {
            addCriterion("tipo_ruta_cod <", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodLessThanOrEqualTo(String value) {
            addCriterion("tipo_ruta_cod <=", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodLike(String value) {
            addCriterion("tipo_ruta_cod like", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodNotLike(String value) {
            addCriterion("tipo_ruta_cod not like", value, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodIn(List<String> values) {
            addCriterion("tipo_ruta_cod in", values, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodNotIn(List<String> values) {
            addCriterion("tipo_ruta_cod not in", values, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodBetween(String value1, String value2) {
            addCriterion("tipo_ruta_cod between", value1, value2, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaCodNotBetween(String value1, String value2) {
            addCriterion("tipo_ruta_cod not between", value1, value2, "tipoRutaCod");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescIsNull() {
            addCriterion("tipo_ruta_desc is null");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescIsNotNull() {
            addCriterion("tipo_ruta_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescEqualTo(String value) {
            addCriterion("tipo_ruta_desc =", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescNotEqualTo(String value) {
            addCriterion("tipo_ruta_desc <>", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescGreaterThan(String value) {
            addCriterion("tipo_ruta_desc >", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_ruta_desc >=", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescLessThan(String value) {
            addCriterion("tipo_ruta_desc <", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescLessThanOrEqualTo(String value) {
            addCriterion("tipo_ruta_desc <=", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescLike(String value) {
            addCriterion("tipo_ruta_desc like", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescNotLike(String value) {
            addCriterion("tipo_ruta_desc not like", value, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescIn(List<String> values) {
            addCriterion("tipo_ruta_desc in", values, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescNotIn(List<String> values) {
            addCriterion("tipo_ruta_desc not in", values, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescBetween(String value1, String value2) {
            addCriterion("tipo_ruta_desc between", value1, value2, "tipoRutaDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRutaDescNotBetween(String value1, String value2) {
            addCriterion("tipo_ruta_desc not between", value1, value2, "tipoRutaDesc");
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