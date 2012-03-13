package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimFacturadoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimFacturadoExample() {
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

        public Criteria andFacturadoKeyIsNull() {
            addCriterion("facturado_key is null");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyIsNotNull() {
            addCriterion("facturado_key is not null");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyEqualTo(Integer value) {
            addCriterion("facturado_key =", value, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyNotEqualTo(Integer value) {
            addCriterion("facturado_key <>", value, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyGreaterThan(Integer value) {
            addCriterion("facturado_key >", value, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("facturado_key >=", value, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyLessThan(Integer value) {
            addCriterion("facturado_key <", value, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("facturado_key <=", value, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyIn(List<Integer> values) {
            addCriterion("facturado_key in", values, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyNotIn(List<Integer> values) {
            addCriterion("facturado_key not in", values, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyBetween(Integer value1, Integer value2) {
            addCriterion("facturado_key between", value1, value2, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("facturado_key not between", value1, value2, "facturadoKey");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodIsNull() {
            addCriterion("facturado_cod is null");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodIsNotNull() {
            addCriterion("facturado_cod is not null");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodEqualTo(String value) {
            addCriterion("facturado_cod =", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodNotEqualTo(String value) {
            addCriterion("facturado_cod <>", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodGreaterThan(String value) {
            addCriterion("facturado_cod >", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodGreaterThanOrEqualTo(String value) {
            addCriterion("facturado_cod >=", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodLessThan(String value) {
            addCriterion("facturado_cod <", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodLessThanOrEqualTo(String value) {
            addCriterion("facturado_cod <=", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodLike(String value) {
            addCriterion("facturado_cod like", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodNotLike(String value) {
            addCriterion("facturado_cod not like", value, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodIn(List<String> values) {
            addCriterion("facturado_cod in", values, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodNotIn(List<String> values) {
            addCriterion("facturado_cod not in", values, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodBetween(String value1, String value2) {
            addCriterion("facturado_cod between", value1, value2, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoCodNotBetween(String value1, String value2) {
            addCriterion("facturado_cod not between", value1, value2, "facturadoCod");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescIsNull() {
            addCriterion("facturado_desc is null");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescIsNotNull() {
            addCriterion("facturado_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescEqualTo(String value) {
            addCriterion("facturado_desc =", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescNotEqualTo(String value) {
            addCriterion("facturado_desc <>", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescGreaterThan(String value) {
            addCriterion("facturado_desc >", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescGreaterThanOrEqualTo(String value) {
            addCriterion("facturado_desc >=", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescLessThan(String value) {
            addCriterion("facturado_desc <", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescLessThanOrEqualTo(String value) {
            addCriterion("facturado_desc <=", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescLike(String value) {
            addCriterion("facturado_desc like", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescNotLike(String value) {
            addCriterion("facturado_desc not like", value, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescIn(List<String> values) {
            addCriterion("facturado_desc in", values, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescNotIn(List<String> values) {
            addCriterion("facturado_desc not in", values, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescBetween(String value1, String value2) {
            addCriterion("facturado_desc between", value1, value2, "facturadoDesc");
            return (Criteria) this;
        }

        public Criteria andFacturadoDescNotBetween(String value1, String value2) {
            addCriterion("facturado_desc not between", value1, value2, "facturadoDesc");
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