package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TEmpleadoCategoriaExample {
	
	protected String paginationByClause;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEmpleadoCategoriaExample() {
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

        public Criteria andEmpCatIdIsNull() {
            addCriterion("emp_cat_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdIsNotNull() {
            addCriterion("emp_cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdEqualTo(Integer value) {
            addCriterion("emp_cat_id =", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdNotEqualTo(Integer value) {
            addCriterion("emp_cat_id <>", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdGreaterThan(Integer value) {
            addCriterion("emp_cat_id >", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_cat_id >=", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdLessThan(Integer value) {
            addCriterion("emp_cat_id <", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_cat_id <=", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdIn(List<Integer> values) {
            addCriterion("emp_cat_id in", values, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdNotIn(List<Integer> values) {
            addCriterion("emp_cat_id not in", values, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_cat_id between", value1, value2, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_cat_id not between", value1, value2, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpCodIsNull() {
            addCriterion("emp_cod is null");
            return (Criteria) this;
        }

        public Criteria andEmpCodIsNotNull() {
            addCriterion("emp_cod is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCodEqualTo(String value) {
            addCriterion("emp_cod =", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotEqualTo(String value) {
            addCriterion("emp_cod <>", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodGreaterThan(String value) {
            addCriterion("emp_cod >", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodGreaterThanOrEqualTo(String value) {
            addCriterion("emp_cod >=", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodLessThan(String value) {
            addCriterion("emp_cod <", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodLessThanOrEqualTo(String value) {
            addCriterion("emp_cod <=", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodLike(String value) {
            addCriterion("emp_cod like", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotLike(String value) {
            addCriterion("emp_cod not like", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodIn(List<String> values) {
            addCriterion("emp_cod in", values, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotIn(List<String> values) {
            addCriterion("emp_cod not in", values, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodBetween(String value1, String value2) {
            addCriterion("emp_cod between", value1, value2, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotBetween(String value1, String value2) {
            addCriterion("emp_cod not between", value1, value2, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipIsNull() {
            addCriterion("emp_cat_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipIsNotNull() {
            addCriterion("emp_cat_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipEqualTo(Integer value) {
            addCriterion("emp_cat_cod_tip =", value, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipNotEqualTo(Integer value) {
            addCriterion("emp_cat_cod_tip <>", value, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipGreaterThan(Integer value) {
            addCriterion("emp_cat_cod_tip >", value, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_cat_cod_tip >=", value, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipLessThan(Integer value) {
            addCriterion("emp_cat_cod_tip <", value, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("emp_cat_cod_tip <=", value, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipIn(List<Integer> values) {
            addCriterion("emp_cat_cod_tip in", values, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipNotIn(List<Integer> values) {
            addCriterion("emp_cat_cod_tip not in", values, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipBetween(Integer value1, Integer value2) {
            addCriterion("emp_cat_cod_tip between", value1, value2, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_cat_cod_tip not between", value1, value2, "empCatCodTip");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodIsNull() {
            addCriterion("emp_cat_cod is null");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodIsNotNull() {
            addCriterion("emp_cat_cod is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodEqualTo(String value) {
            addCriterion("emp_cat_cod =", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodNotEqualTo(String value) {
            addCriterion("emp_cat_cod <>", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodGreaterThan(String value) {
            addCriterion("emp_cat_cod >", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodGreaterThanOrEqualTo(String value) {
            addCriterion("emp_cat_cod >=", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodLessThan(String value) {
            addCriterion("emp_cat_cod <", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodLessThanOrEqualTo(String value) {
            addCriterion("emp_cat_cod <=", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodLike(String value) {
            addCriterion("emp_cat_cod like", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodNotLike(String value) {
            addCriterion("emp_cat_cod not like", value, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodIn(List<String> values) {
            addCriterion("emp_cat_cod in", values, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodNotIn(List<String> values) {
            addCriterion("emp_cat_cod not in", values, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodBetween(String value1, String value2) {
            addCriterion("emp_cat_cod between", value1, value2, "empCatCod");
            return (Criteria) this;
        }

        public Criteria andEmpCatCodNotBetween(String value1, String value2) {
            addCriterion("emp_cat_cod not between", value1, value2, "empCatCod");
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