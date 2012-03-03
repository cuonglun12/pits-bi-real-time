package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TParametroExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TParametroExample() {
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

        public Criteria andParamIdIsNull() {
            addCriterion("param_id is null");
            return (Criteria) this;
        }

        public Criteria andParamIdIsNotNull() {
            addCriterion("param_id is not null");
            return (Criteria) this;
        }

        public Criteria andParamIdEqualTo(Integer value) {
            addCriterion("param_id =", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotEqualTo(Integer value) {
            addCriterion("param_id <>", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThan(Integer value) {
            addCriterion("param_id >", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_id >=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThan(Integer value) {
            addCriterion("param_id <", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThanOrEqualTo(Integer value) {
            addCriterion("param_id <=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdIn(List<Integer> values) {
            addCriterion("param_id in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotIn(List<Integer> values) {
            addCriterion("param_id not in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdBetween(Integer value1, Integer value2) {
            addCriterion("param_id between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("param_id not between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamCodTipIsNull() {
            addCriterion("param_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andParamCodTipIsNotNull() {
            addCriterion("param_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andParamCodTipEqualTo(Integer value) {
            addCriterion("param_cod_tip =", value, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipNotEqualTo(Integer value) {
            addCriterion("param_cod_tip <>", value, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipGreaterThan(Integer value) {
            addCriterion("param_cod_tip >", value, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_cod_tip >=", value, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipLessThan(Integer value) {
            addCriterion("param_cod_tip <", value, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("param_cod_tip <=", value, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipIn(List<Integer> values) {
            addCriterion("param_cod_tip in", values, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipNotIn(List<Integer> values) {
            addCriterion("param_cod_tip not in", values, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipBetween(Integer value1, Integer value2) {
            addCriterion("param_cod_tip between", value1, value2, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("param_cod_tip not between", value1, value2, "paramCodTip");
            return (Criteria) this;
        }

        public Criteria andParamCodIsNull() {
            addCriterion("param_cod is null");
            return (Criteria) this;
        }

        public Criteria andParamCodIsNotNull() {
            addCriterion("param_cod is not null");
            return (Criteria) this;
        }

        public Criteria andParamCodEqualTo(String value) {
            addCriterion("param_cod =", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodNotEqualTo(String value) {
            addCriterion("param_cod <>", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodGreaterThan(String value) {
            addCriterion("param_cod >", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodGreaterThanOrEqualTo(String value) {
            addCriterion("param_cod >=", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodLessThan(String value) {
            addCriterion("param_cod <", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodLessThanOrEqualTo(String value) {
            addCriterion("param_cod <=", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodLike(String value) {
            addCriterion("param_cod like", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodNotLike(String value) {
            addCriterion("param_cod not like", value, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodIn(List<String> values) {
            addCriterion("param_cod in", values, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodNotIn(List<String> values) {
            addCriterion("param_cod not in", values, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodBetween(String value1, String value2) {
            addCriterion("param_cod between", value1, value2, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamCodNotBetween(String value1, String value2) {
            addCriterion("param_cod not between", value1, value2, "paramCod");
            return (Criteria) this;
        }

        public Criteria andParamDesIsNull() {
            addCriterion("param_des is null");
            return (Criteria) this;
        }

        public Criteria andParamDesIsNotNull() {
            addCriterion("param_des is not null");
            return (Criteria) this;
        }

        public Criteria andParamDesEqualTo(String value) {
            addCriterion("param_des =", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesNotEqualTo(String value) {
            addCriterion("param_des <>", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesGreaterThan(String value) {
            addCriterion("param_des >", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesGreaterThanOrEqualTo(String value) {
            addCriterion("param_des >=", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesLessThan(String value) {
            addCriterion("param_des <", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesLessThanOrEqualTo(String value) {
            addCriterion("param_des <=", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesLike(String value) {
            addCriterion("param_des like", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesNotLike(String value) {
            addCriterion("param_des not like", value, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesIn(List<String> values) {
            addCriterion("param_des in", values, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesNotIn(List<String> values) {
            addCriterion("param_des not in", values, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesBetween(String value1, String value2) {
            addCriterion("param_des between", value1, value2, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamDesNotBetween(String value1, String value2) {
            addCriterion("param_des not between", value1, value2, "paramDes");
            return (Criteria) this;
        }

        public Criteria andParamRefIsNull() {
            addCriterion("param_ref is null");
            return (Criteria) this;
        }

        public Criteria andParamRefIsNotNull() {
            addCriterion("param_ref is not null");
            return (Criteria) this;
        }

        public Criteria andParamRefEqualTo(Integer value) {
            addCriterion("param_ref =", value, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefNotEqualTo(Integer value) {
            addCriterion("param_ref <>", value, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefGreaterThan(Integer value) {
            addCriterion("param_ref >", value, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_ref >=", value, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefLessThan(Integer value) {
            addCriterion("param_ref <", value, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefLessThanOrEqualTo(Integer value) {
            addCriterion("param_ref <=", value, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefIn(List<Integer> values) {
            addCriterion("param_ref in", values, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefNotIn(List<Integer> values) {
            addCriterion("param_ref not in", values, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefBetween(Integer value1, Integer value2) {
            addCriterion("param_ref between", value1, value2, "paramRef");
            return (Criteria) this;
        }

        public Criteria andParamRefNotBetween(Integer value1, Integer value2) {
            addCriterion("param_ref not between", value1, value2, "paramRef");
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

        public Criteria andFecNumCamEqualTo(Long value) {
            addCriterion("fec_num_cam =", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotEqualTo(Long value) {
            addCriterion("fec_num_cam <>", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThan(Long value) {
            addCriterion("fec_num_cam >", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThanOrEqualTo(Long value) {
            addCriterion("fec_num_cam >=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThan(Long value) {
            addCriterion("fec_num_cam <", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThanOrEqualTo(Long value) {
            addCriterion("fec_num_cam <=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIn(List<Long> values) {
            addCriterion("fec_num_cam in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotIn(List<Long> values) {
            addCriterion("fec_num_cam not in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamBetween(Long value1, Long value2) {
            addCriterion("fec_num_cam between", value1, value2, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotBetween(Long value1, Long value2) {
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