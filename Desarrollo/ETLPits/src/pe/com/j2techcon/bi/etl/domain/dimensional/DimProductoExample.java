package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimProductoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimProductoExample() {
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

        public Criteria andProductoKeyIsNull() {
            addCriterion("producto_key is null");
            return (Criteria) this;
        }

        public Criteria andProductoKeyIsNotNull() {
            addCriterion("producto_key is not null");
            return (Criteria) this;
        }

        public Criteria andProductoKeyEqualTo(Integer value) {
            addCriterion("producto_key =", value, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyNotEqualTo(Integer value) {
            addCriterion("producto_key <>", value, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyGreaterThan(Integer value) {
            addCriterion("producto_key >", value, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("producto_key >=", value, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyLessThan(Integer value) {
            addCriterion("producto_key <", value, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("producto_key <=", value, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyIn(List<Integer> values) {
            addCriterion("producto_key in", values, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyNotIn(List<Integer> values) {
            addCriterion("producto_key not in", values, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyBetween(Integer value1, Integer value2) {
            addCriterion("producto_key between", value1, value2, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("producto_key not between", value1, value2, "productoKey");
            return (Criteria) this;
        }

        public Criteria andProductoCodIsNull() {
            addCriterion("producto_cod is null");
            return (Criteria) this;
        }

        public Criteria andProductoCodIsNotNull() {
            addCriterion("producto_cod is not null");
            return (Criteria) this;
        }

        public Criteria andProductoCodEqualTo(String value) {
            addCriterion("producto_cod =", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodNotEqualTo(String value) {
            addCriterion("producto_cod <>", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodGreaterThan(String value) {
            addCriterion("producto_cod >", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodGreaterThanOrEqualTo(String value) {
            addCriterion("producto_cod >=", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodLessThan(String value) {
            addCriterion("producto_cod <", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodLessThanOrEqualTo(String value) {
            addCriterion("producto_cod <=", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodLike(String value) {
            addCriterion("producto_cod like", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodNotLike(String value) {
            addCriterion("producto_cod not like", value, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodIn(List<String> values) {
            addCriterion("producto_cod in", values, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodNotIn(List<String> values) {
            addCriterion("producto_cod not in", values, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodBetween(String value1, String value2) {
            addCriterion("producto_cod between", value1, value2, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodNotBetween(String value1, String value2) {
            addCriterion("producto_cod not between", value1, value2, "productoCod");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipIsNull() {
            addCriterion("producto_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipIsNotNull() {
            addCriterion("producto_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipEqualTo(Integer value) {
            addCriterion("producto_cod_tip =", value, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipNotEqualTo(Integer value) {
            addCriterion("producto_cod_tip <>", value, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipGreaterThan(Integer value) {
            addCriterion("producto_cod_tip >", value, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("producto_cod_tip >=", value, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipLessThan(Integer value) {
            addCriterion("producto_cod_tip <", value, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("producto_cod_tip <=", value, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipIn(List<Integer> values) {
            addCriterion("producto_cod_tip in", values, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipNotIn(List<Integer> values) {
            addCriterion("producto_cod_tip not in", values, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipBetween(Integer value1, Integer value2) {
            addCriterion("producto_cod_tip between", value1, value2, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("producto_cod_tip not between", value1, value2, "productoCodTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipIsNull() {
            addCriterion("producto_desc_tip is null");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipIsNotNull() {
            addCriterion("producto_desc_tip is not null");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipEqualTo(String value) {
            addCriterion("producto_desc_tip =", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipNotEqualTo(String value) {
            addCriterion("producto_desc_tip <>", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipGreaterThan(String value) {
            addCriterion("producto_desc_tip >", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipGreaterThanOrEqualTo(String value) {
            addCriterion("producto_desc_tip >=", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipLessThan(String value) {
            addCriterion("producto_desc_tip <", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipLessThanOrEqualTo(String value) {
            addCriterion("producto_desc_tip <=", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipLike(String value) {
            addCriterion("producto_desc_tip like", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipNotLike(String value) {
            addCriterion("producto_desc_tip not like", value, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipIn(List<String> values) {
            addCriterion("producto_desc_tip in", values, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipNotIn(List<String> values) {
            addCriterion("producto_desc_tip not in", values, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipBetween(String value1, String value2) {
            addCriterion("producto_desc_tip between", value1, value2, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescTipNotBetween(String value1, String value2) {
            addCriterion("producto_desc_tip not between", value1, value2, "productoDescTip");
            return (Criteria) this;
        }

        public Criteria andProductoDescIsNull() {
            addCriterion("producto_desc is null");
            return (Criteria) this;
        }

        public Criteria andProductoDescIsNotNull() {
            addCriterion("producto_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProductoDescEqualTo(String value) {
            addCriterion("producto_desc =", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescNotEqualTo(String value) {
            addCriterion("producto_desc <>", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescGreaterThan(String value) {
            addCriterion("producto_desc >", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescGreaterThanOrEqualTo(String value) {
            addCriterion("producto_desc >=", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescLessThan(String value) {
            addCriterion("producto_desc <", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescLessThanOrEqualTo(String value) {
            addCriterion("producto_desc <=", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescLike(String value) {
            addCriterion("producto_desc like", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescNotLike(String value) {
            addCriterion("producto_desc not like", value, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescIn(List<String> values) {
            addCriterion("producto_desc in", values, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescNotIn(List<String> values) {
            addCriterion("producto_desc not in", values, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescBetween(String value1, String value2) {
            addCriterion("producto_desc between", value1, value2, "productoDesc");
            return (Criteria) this;
        }

        public Criteria andProductoDescNotBetween(String value1, String value2) {
            addCriterion("producto_desc not between", value1, value2, "productoDesc");
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