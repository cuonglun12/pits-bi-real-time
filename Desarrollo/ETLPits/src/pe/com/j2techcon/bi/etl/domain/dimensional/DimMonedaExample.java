package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimMonedaExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimMonedaExample() {
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

        public Criteria andMonedaKeyIsNull() {
            addCriterion("moneda_key is null");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyIsNotNull() {
            addCriterion("moneda_key is not null");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyEqualTo(Integer value) {
            addCriterion("moneda_key =", value, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyNotEqualTo(Integer value) {
            addCriterion("moneda_key <>", value, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyGreaterThan(Integer value) {
            addCriterion("moneda_key >", value, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("moneda_key >=", value, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyLessThan(Integer value) {
            addCriterion("moneda_key <", value, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyLessThanOrEqualTo(Integer value) {
            addCriterion("moneda_key <=", value, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyIn(List<Integer> values) {
            addCriterion("moneda_key in", values, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyNotIn(List<Integer> values) {
            addCriterion("moneda_key not in", values, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyBetween(Integer value1, Integer value2) {
            addCriterion("moneda_key between", value1, value2, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("moneda_key not between", value1, value2, "monedaKey");
            return (Criteria) this;
        }

        public Criteria andMonedaCodIsNull() {
            addCriterion("moneda_cod is null");
            return (Criteria) this;
        }

        public Criteria andMonedaCodIsNotNull() {
            addCriterion("moneda_cod is not null");
            return (Criteria) this;
        }

        public Criteria andMonedaCodEqualTo(String value) {
            addCriterion("moneda_cod =", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodNotEqualTo(String value) {
            addCriterion("moneda_cod <>", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodGreaterThan(String value) {
            addCriterion("moneda_cod >", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodGreaterThanOrEqualTo(String value) {
            addCriterion("moneda_cod >=", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodLessThan(String value) {
            addCriterion("moneda_cod <", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodLessThanOrEqualTo(String value) {
            addCriterion("moneda_cod <=", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodLike(String value) {
            addCriterion("moneda_cod like", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodNotLike(String value) {
            addCriterion("moneda_cod not like", value, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodIn(List<String> values) {
            addCriterion("moneda_cod in", values, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodNotIn(List<String> values) {
            addCriterion("moneda_cod not in", values, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodBetween(String value1, String value2) {
            addCriterion("moneda_cod between", value1, value2, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaCodNotBetween(String value1, String value2) {
            addCriterion("moneda_cod not between", value1, value2, "monedaCod");
            return (Criteria) this;
        }

        public Criteria andMonedaDescIsNull() {
            addCriterion("moneda_desc is null");
            return (Criteria) this;
        }

        public Criteria andMonedaDescIsNotNull() {
            addCriterion("moneda_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMonedaDescEqualTo(String value) {
            addCriterion("moneda_desc =", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescNotEqualTo(String value) {
            addCriterion("moneda_desc <>", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescGreaterThan(String value) {
            addCriterion("moneda_desc >", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescGreaterThanOrEqualTo(String value) {
            addCriterion("moneda_desc >=", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescLessThan(String value) {
            addCriterion("moneda_desc <", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescLessThanOrEqualTo(String value) {
            addCriterion("moneda_desc <=", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescLike(String value) {
            addCriterion("moneda_desc like", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescNotLike(String value) {
            addCriterion("moneda_desc not like", value, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescIn(List<String> values) {
            addCriterion("moneda_desc in", values, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescNotIn(List<String> values) {
            addCriterion("moneda_desc not in", values, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescBetween(String value1, String value2) {
            addCriterion("moneda_desc between", value1, value2, "monedaDesc");
            return (Criteria) this;
        }

        public Criteria andMonedaDescNotBetween(String value1, String value2) {
            addCriterion("moneda_desc not between", value1, value2, "monedaDesc");
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