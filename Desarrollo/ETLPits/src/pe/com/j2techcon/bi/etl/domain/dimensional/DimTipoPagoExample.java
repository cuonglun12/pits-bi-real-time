package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimTipoPagoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimTipoPagoExample() {
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

        public Criteria andTipoPagoKeyIsNull() {
            addCriterion("tipo_pago_key is null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyIsNotNull() {
            addCriterion("tipo_pago_key is not null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyEqualTo(Integer value) {
            addCriterion("tipo_pago_key =", value, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyNotEqualTo(Integer value) {
            addCriterion("tipo_pago_key <>", value, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyGreaterThan(Integer value) {
            addCriterion("tipo_pago_key >", value, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipo_pago_key >=", value, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyLessThan(Integer value) {
            addCriterion("tipo_pago_key <", value, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("tipo_pago_key <=", value, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyIn(List<Integer> values) {
            addCriterion("tipo_pago_key in", values, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyNotIn(List<Integer> values) {
            addCriterion("tipo_pago_key not in", values, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyBetween(Integer value1, Integer value2) {
            addCriterion("tipo_pago_key between", value1, value2, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("tipo_pago_key not between", value1, value2, "tipoPagoKey");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodIsNull() {
            addCriterion("tipo_pago_cod is null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodIsNotNull() {
            addCriterion("tipo_pago_cod is not null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodEqualTo(String value) {
            addCriterion("tipo_pago_cod =", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodNotEqualTo(String value) {
            addCriterion("tipo_pago_cod <>", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodGreaterThan(String value) {
            addCriterion("tipo_pago_cod >", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_pago_cod >=", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodLessThan(String value) {
            addCriterion("tipo_pago_cod <", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodLessThanOrEqualTo(String value) {
            addCriterion("tipo_pago_cod <=", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodLike(String value) {
            addCriterion("tipo_pago_cod like", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodNotLike(String value) {
            addCriterion("tipo_pago_cod not like", value, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodIn(List<String> values) {
            addCriterion("tipo_pago_cod in", values, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodNotIn(List<String> values) {
            addCriterion("tipo_pago_cod not in", values, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodBetween(String value1, String value2) {
            addCriterion("tipo_pago_cod between", value1, value2, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoCodNotBetween(String value1, String value2) {
            addCriterion("tipo_pago_cod not between", value1, value2, "tipoPagoCod");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescIsNull() {
            addCriterion("tipo_pago_desc is null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescIsNotNull() {
            addCriterion("tipo_pago_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescEqualTo(String value) {
            addCriterion("tipo_pago_desc =", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescNotEqualTo(String value) {
            addCriterion("tipo_pago_desc <>", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescGreaterThan(String value) {
            addCriterion("tipo_pago_desc >", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_pago_desc >=", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescLessThan(String value) {
            addCriterion("tipo_pago_desc <", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescLessThanOrEqualTo(String value) {
            addCriterion("tipo_pago_desc <=", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescLike(String value) {
            addCriterion("tipo_pago_desc like", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescNotLike(String value) {
            addCriterion("tipo_pago_desc not like", value, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescIn(List<String> values) {
            addCriterion("tipo_pago_desc in", values, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescNotIn(List<String> values) {
            addCriterion("tipo_pago_desc not in", values, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescBetween(String value1, String value2) {
            addCriterion("tipo_pago_desc between", value1, value2, "tipoPagoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoPagoDescNotBetween(String value1, String value2) {
            addCriterion("tipo_pago_desc not between", value1, value2, "tipoPagoDesc");
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