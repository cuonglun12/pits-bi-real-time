package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TSedeExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSedeExample() {
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

        public Criteria andSedIdIsNull() {
            addCriterion("sed_id is null");
            return (Criteria) this;
        }

        public Criteria andSedIdIsNotNull() {
            addCriterion("sed_id is not null");
            return (Criteria) this;
        }

        public Criteria andSedIdEqualTo(Integer value) {
            addCriterion("sed_id =", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdNotEqualTo(Integer value) {
            addCriterion("sed_id <>", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdGreaterThan(Integer value) {
            addCriterion("sed_id >", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sed_id >=", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdLessThan(Integer value) {
            addCriterion("sed_id <", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdLessThanOrEqualTo(Integer value) {
            addCriterion("sed_id <=", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdIn(List<Integer> values) {
            addCriterion("sed_id in", values, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdNotIn(List<Integer> values) {
            addCriterion("sed_id not in", values, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdBetween(Integer value1, Integer value2) {
            addCriterion("sed_id between", value1, value2, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sed_id not between", value1, value2, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedCodIsNull() {
            addCriterion("sed_cod is null");
            return (Criteria) this;
        }

        public Criteria andSedCodIsNotNull() {
            addCriterion("sed_cod is not null");
            return (Criteria) this;
        }

        public Criteria andSedCodEqualTo(String value) {
            addCriterion("sed_cod =", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodNotEqualTo(String value) {
            addCriterion("sed_cod <>", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodGreaterThan(String value) {
            addCriterion("sed_cod >", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodGreaterThanOrEqualTo(String value) {
            addCriterion("sed_cod >=", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodLessThan(String value) {
            addCriterion("sed_cod <", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodLessThanOrEqualTo(String value) {
            addCriterion("sed_cod <=", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodLike(String value) {
            addCriterion("sed_cod like", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodNotLike(String value) {
            addCriterion("sed_cod not like", value, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodIn(List<String> values) {
            addCriterion("sed_cod in", values, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodNotIn(List<String> values) {
            addCriterion("sed_cod not in", values, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodBetween(String value1, String value2) {
            addCriterion("sed_cod between", value1, value2, "sedCod");
            return (Criteria) this;
        }

        public Criteria andSedCodNotBetween(String value1, String value2) {
            addCriterion("sed_cod not between", value1, value2, "sedCod");
            return (Criteria) this;
        }

        public Criteria andUbiIdIsNull() {
            addCriterion("ubi_id is null");
            return (Criteria) this;
        }

        public Criteria andUbiIdIsNotNull() {
            addCriterion("ubi_id is not null");
            return (Criteria) this;
        }

        public Criteria andUbiIdEqualTo(Integer value) {
            addCriterion("ubi_id =", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdNotEqualTo(Integer value) {
            addCriterion("ubi_id <>", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdGreaterThan(Integer value) {
            addCriterion("ubi_id >", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubi_id >=", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdLessThan(Integer value) {
            addCriterion("ubi_id <", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ubi_id <=", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdIn(List<Integer> values) {
            addCriterion("ubi_id in", values, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdNotIn(List<Integer> values) {
            addCriterion("ubi_id not in", values, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdBetween(Integer value1, Integer value2) {
            addCriterion("ubi_id between", value1, value2, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ubi_id not between", value1, value2, "ubiId");
            return (Criteria) this;
        }

        public Criteria andSedCodTipIsNull() {
            addCriterion("sed_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andSedCodTipIsNotNull() {
            addCriterion("sed_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andSedCodTipEqualTo(Integer value) {
            addCriterion("sed_cod_tip =", value, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipNotEqualTo(Integer value) {
            addCriterion("sed_cod_tip <>", value, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipGreaterThan(Integer value) {
            addCriterion("sed_cod_tip >", value, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("sed_cod_tip >=", value, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipLessThan(Integer value) {
            addCriterion("sed_cod_tip <", value, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("sed_cod_tip <=", value, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipIn(List<Integer> values) {
            addCriterion("sed_cod_tip in", values, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipNotIn(List<Integer> values) {
            addCriterion("sed_cod_tip not in", values, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipBetween(Integer value1, Integer value2) {
            addCriterion("sed_cod_tip between", value1, value2, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("sed_cod_tip not between", value1, value2, "sedCodTip");
            return (Criteria) this;
        }

        public Criteria andSedDesIsNull() {
            addCriterion("sed_des is null");
            return (Criteria) this;
        }

        public Criteria andSedDesIsNotNull() {
            addCriterion("sed_des is not null");
            return (Criteria) this;
        }

        public Criteria andSedDesEqualTo(String value) {
            addCriterion("sed_des =", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesNotEqualTo(String value) {
            addCriterion("sed_des <>", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesGreaterThan(String value) {
            addCriterion("sed_des >", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesGreaterThanOrEqualTo(String value) {
            addCriterion("sed_des >=", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesLessThan(String value) {
            addCriterion("sed_des <", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesLessThanOrEqualTo(String value) {
            addCriterion("sed_des <=", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesLike(String value) {
            addCriterion("sed_des like", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesNotLike(String value) {
            addCriterion("sed_des not like", value, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesIn(List<String> values) {
            addCriterion("sed_des in", values, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesNotIn(List<String> values) {
            addCriterion("sed_des not in", values, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesBetween(String value1, String value2) {
            addCriterion("sed_des between", value1, value2, "sedDes");
            return (Criteria) this;
        }

        public Criteria andSedDesNotBetween(String value1, String value2) {
            addCriterion("sed_des not between", value1, value2, "sedDes");
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