package pe.com.j2techcon.bi.etl.domain.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TProductoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProductoExample() {
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

        public Criteria andProdIdIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Integer value) {
            addCriterion("prod_id =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Integer value) {
            addCriterion("prod_id <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Integer value) {
            addCriterion("prod_id >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_id >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Integer value) {
            addCriterion("prod_id <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_id <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Integer> values) {
            addCriterion("prod_id in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Integer> values) {
            addCriterion("prod_id not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_id between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_id not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdCodTipIsNull() {
            addCriterion("prod_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andProdCodTipIsNotNull() {
            addCriterion("prod_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodTipEqualTo(Integer value) {
            addCriterion("prod_cod_tip =", value, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipNotEqualTo(Integer value) {
            addCriterion("prod_cod_tip <>", value, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipGreaterThan(Integer value) {
            addCriterion("prod_cod_tip >", value, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_cod_tip >=", value, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipLessThan(Integer value) {
            addCriterion("prod_cod_tip <", value, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("prod_cod_tip <=", value, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipIn(List<Integer> values) {
            addCriterion("prod_cod_tip in", values, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipNotIn(List<Integer> values) {
            addCriterion("prod_cod_tip not in", values, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipBetween(Integer value1, Integer value2) {
            addCriterion("prod_cod_tip between", value1, value2, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_cod_tip not between", value1, value2, "prodCodTip");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbIsNull() {
            addCriterion("prod_cod_amb is null");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbIsNotNull() {
            addCriterion("prod_cod_amb is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbEqualTo(Integer value) {
            addCriterion("prod_cod_amb =", value, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbNotEqualTo(Integer value) {
            addCriterion("prod_cod_amb <>", value, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbGreaterThan(Integer value) {
            addCriterion("prod_cod_amb >", value, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_cod_amb >=", value, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbLessThan(Integer value) {
            addCriterion("prod_cod_amb <", value, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbLessThanOrEqualTo(Integer value) {
            addCriterion("prod_cod_amb <=", value, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbIn(List<Integer> values) {
            addCriterion("prod_cod_amb in", values, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbNotIn(List<Integer> values) {
            addCriterion("prod_cod_amb not in", values, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbBetween(Integer value1, Integer value2) {
            addCriterion("prod_cod_amb between", value1, value2, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodAmbNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_cod_amb not between", value1, value2, "prodCodAmb");
            return (Criteria) this;
        }

        public Criteria andProdCodNegIsNull() {
            addCriterion("prod_cod_neg is null");
            return (Criteria) this;
        }

        public Criteria andProdCodNegIsNotNull() {
            addCriterion("prod_cod_neg is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodNegEqualTo(Integer value) {
            addCriterion("prod_cod_neg =", value, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegNotEqualTo(Integer value) {
            addCriterion("prod_cod_neg <>", value, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegGreaterThan(Integer value) {
            addCriterion("prod_cod_neg >", value, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_cod_neg >=", value, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegLessThan(Integer value) {
            addCriterion("prod_cod_neg <", value, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegLessThanOrEqualTo(Integer value) {
            addCriterion("prod_cod_neg <=", value, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegIn(List<Integer> values) {
            addCriterion("prod_cod_neg in", values, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegNotIn(List<Integer> values) {
            addCriterion("prod_cod_neg not in", values, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegBetween(Integer value1, Integer value2) {
            addCriterion("prod_cod_neg between", value1, value2, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodNegNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_cod_neg not between", value1, value2, "prodCodNeg");
            return (Criteria) this;
        }

        public Criteria andProdCodIsNull() {
            addCriterion("prod_cod is null");
            return (Criteria) this;
        }

        public Criteria andProdCodIsNotNull() {
            addCriterion("prod_cod is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodEqualTo(String value) {
            addCriterion("prod_cod =", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodNotEqualTo(String value) {
            addCriterion("prod_cod <>", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodGreaterThan(String value) {
            addCriterion("prod_cod >", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodGreaterThanOrEqualTo(String value) {
            addCriterion("prod_cod >=", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodLessThan(String value) {
            addCriterion("prod_cod <", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodLessThanOrEqualTo(String value) {
            addCriterion("prod_cod <=", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodLike(String value) {
            addCriterion("prod_cod like", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodNotLike(String value) {
            addCriterion("prod_cod not like", value, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodIn(List<String> values) {
            addCriterion("prod_cod in", values, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodNotIn(List<String> values) {
            addCriterion("prod_cod not in", values, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodBetween(String value1, String value2) {
            addCriterion("prod_cod between", value1, value2, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdCodNotBetween(String value1, String value2) {
            addCriterion("prod_cod not between", value1, value2, "prodCod");
            return (Criteria) this;
        }

        public Criteria andProdDesIsNull() {
            addCriterion("prod_des is null");
            return (Criteria) this;
        }

        public Criteria andProdDesIsNotNull() {
            addCriterion("prod_des is not null");
            return (Criteria) this;
        }

        public Criteria andProdDesEqualTo(String value) {
            addCriterion("prod_des =", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesNotEqualTo(String value) {
            addCriterion("prod_des <>", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesGreaterThan(String value) {
            addCriterion("prod_des >", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesGreaterThanOrEqualTo(String value) {
            addCriterion("prod_des >=", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesLessThan(String value) {
            addCriterion("prod_des <", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesLessThanOrEqualTo(String value) {
            addCriterion("prod_des <=", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesLike(String value) {
            addCriterion("prod_des like", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesNotLike(String value) {
            addCriterion("prod_des not like", value, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesIn(List<String> values) {
            addCriterion("prod_des in", values, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesNotIn(List<String> values) {
            addCriterion("prod_des not in", values, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesBetween(String value1, String value2) {
            addCriterion("prod_des between", value1, value2, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdDesNotBetween(String value1, String value2) {
            addCriterion("prod_des not between", value1, value2, "prodDes");
            return (Criteria) this;
        }

        public Criteria andProdPreIsNull() {
            addCriterion("prod_pre is null");
            return (Criteria) this;
        }

        public Criteria andProdPreIsNotNull() {
            addCriterion("prod_pre is not null");
            return (Criteria) this;
        }

        public Criteria andProdPreEqualTo(BigDecimal value) {
            addCriterion("prod_pre =", value, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreNotEqualTo(BigDecimal value) {
            addCriterion("prod_pre <>", value, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreGreaterThan(BigDecimal value) {
            addCriterion("prod_pre >", value, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prod_pre >=", value, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreLessThan(BigDecimal value) {
            addCriterion("prod_pre <", value, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prod_pre <=", value, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreIn(List<BigDecimal> values) {
            addCriterion("prod_pre in", values, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreNotIn(List<BigDecimal> values) {
            addCriterion("prod_pre not in", values, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prod_pre between", value1, value2, "prodPre");
            return (Criteria) this;
        }

        public Criteria andProdPreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prod_pre not between", value1, value2, "prodPre");
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