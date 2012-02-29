package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimTipoDocumentoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimTipoDocumentoExample() {
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

        public Criteria andTipoDocumentoKeyIsNull() {
            addCriterion("tipo_documento_key is null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyIsNotNull() {
            addCriterion("tipo_documento_key is not null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyEqualTo(Integer value) {
            addCriterion("tipo_documento_key =", value, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyNotEqualTo(Integer value) {
            addCriterion("tipo_documento_key <>", value, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyGreaterThan(Integer value) {
            addCriterion("tipo_documento_key >", value, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipo_documento_key >=", value, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyLessThan(Integer value) {
            addCriterion("tipo_documento_key <", value, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("tipo_documento_key <=", value, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyIn(List<Integer> values) {
            addCriterion("tipo_documento_key in", values, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyNotIn(List<Integer> values) {
            addCriterion("tipo_documento_key not in", values, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyBetween(Integer value1, Integer value2) {
            addCriterion("tipo_documento_key between", value1, value2, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("tipo_documento_key not between", value1, value2, "tipoDocumentoKey");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodIsNull() {
            addCriterion("tipo_documento_cod is null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodIsNotNull() {
            addCriterion("tipo_documento_cod is not null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodEqualTo(String value) {
            addCriterion("tipo_documento_cod =", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodNotEqualTo(String value) {
            addCriterion("tipo_documento_cod <>", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodGreaterThan(String value) {
            addCriterion("tipo_documento_cod >", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_documento_cod >=", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodLessThan(String value) {
            addCriterion("tipo_documento_cod <", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodLessThanOrEqualTo(String value) {
            addCriterion("tipo_documento_cod <=", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodLike(String value) {
            addCriterion("tipo_documento_cod like", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodNotLike(String value) {
            addCriterion("tipo_documento_cod not like", value, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodIn(List<String> values) {
            addCriterion("tipo_documento_cod in", values, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodNotIn(List<String> values) {
            addCriterion("tipo_documento_cod not in", values, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodBetween(String value1, String value2) {
            addCriterion("tipo_documento_cod between", value1, value2, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoCodNotBetween(String value1, String value2) {
            addCriterion("tipo_documento_cod not between", value1, value2, "tipoDocumentoCod");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescIsNull() {
            addCriterion("tipo_documento_desc is null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescIsNotNull() {
            addCriterion("tipo_documento_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescEqualTo(String value) {
            addCriterion("tipo_documento_desc =", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescNotEqualTo(String value) {
            addCriterion("tipo_documento_desc <>", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescGreaterThan(String value) {
            addCriterion("tipo_documento_desc >", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_documento_desc >=", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescLessThan(String value) {
            addCriterion("tipo_documento_desc <", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescLessThanOrEqualTo(String value) {
            addCriterion("tipo_documento_desc <=", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescLike(String value) {
            addCriterion("tipo_documento_desc like", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescNotLike(String value) {
            addCriterion("tipo_documento_desc not like", value, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescIn(List<String> values) {
            addCriterion("tipo_documento_desc in", values, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescNotIn(List<String> values) {
            addCriterion("tipo_documento_desc not in", values, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescBetween(String value1, String value2) {
            addCriterion("tipo_documento_desc between", value1, value2, "tipoDocumentoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoDescNotBetween(String value1, String value2) {
            addCriterion("tipo_documento_desc not between", value1, value2, "tipoDocumentoDesc");
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