package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TServicioExample {
	
	protected String paginationByClause;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TServicioExample() {
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

        public Criteria andServIdIsNull() {
            addCriterion("serv_id is null");
            return (Criteria) this;
        }

        public Criteria andServIdIsNotNull() {
            addCriterion("serv_id is not null");
            return (Criteria) this;
        }

        public Criteria andServIdEqualTo(Integer value) {
            addCriterion("serv_id =", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotEqualTo(Integer value) {
            addCriterion("serv_id <>", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThan(Integer value) {
            addCriterion("serv_id >", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("serv_id >=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThan(Integer value) {
            addCriterion("serv_id <", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThanOrEqualTo(Integer value) {
            addCriterion("serv_id <=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdIn(List<Integer> values) {
            addCriterion("serv_id in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotIn(List<Integer> values) {
            addCriterion("serv_id not in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdBetween(Integer value1, Integer value2) {
            addCriterion("serv_id between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotBetween(Integer value1, Integer value2) {
            addCriterion("serv_id not between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andServCodIsNull() {
            addCriterion("serv_cod is null");
            return (Criteria) this;
        }

        public Criteria andServCodIsNotNull() {
            addCriterion("serv_cod is not null");
            return (Criteria) this;
        }

        public Criteria andServCodEqualTo(String value) {
            addCriterion("serv_cod =", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodNotEqualTo(String value) {
            addCriterion("serv_cod <>", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodGreaterThan(String value) {
            addCriterion("serv_cod >", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodGreaterThanOrEqualTo(String value) {
            addCriterion("serv_cod >=", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodLessThan(String value) {
            addCriterion("serv_cod <", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodLessThanOrEqualTo(String value) {
            addCriterion("serv_cod <=", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodLike(String value) {
            addCriterion("serv_cod like", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodNotLike(String value) {
            addCriterion("serv_cod not like", value, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodIn(List<String> values) {
            addCriterion("serv_cod in", values, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodNotIn(List<String> values) {
            addCriterion("serv_cod not in", values, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodBetween(String value1, String value2) {
            addCriterion("serv_cod between", value1, value2, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodNotBetween(String value1, String value2) {
            addCriterion("serv_cod not between", value1, value2, "servCod");
            return (Criteria) this;
        }

        public Criteria andServCodNegIsNull() {
            addCriterion("serv_cod_neg is null");
            return (Criteria) this;
        }

        public Criteria andServCodNegIsNotNull() {
            addCriterion("serv_cod_neg is not null");
            return (Criteria) this;
        }

        public Criteria andServCodNegEqualTo(Integer value) {
            addCriterion("serv_cod_neg =", value, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegNotEqualTo(Integer value) {
            addCriterion("serv_cod_neg <>", value, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegGreaterThan(Integer value) {
            addCriterion("serv_cod_neg >", value, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegGreaterThanOrEqualTo(Integer value) {
            addCriterion("serv_cod_neg >=", value, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegLessThan(Integer value) {
            addCriterion("serv_cod_neg <", value, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegLessThanOrEqualTo(Integer value) {
            addCriterion("serv_cod_neg <=", value, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegIn(List<Integer> values) {
            addCriterion("serv_cod_neg in", values, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegNotIn(List<Integer> values) {
            addCriterion("serv_cod_neg not in", values, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegBetween(Integer value1, Integer value2) {
            addCriterion("serv_cod_neg between", value1, value2, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodNegNotBetween(Integer value1, Integer value2) {
            addCriterion("serv_cod_neg not between", value1, value2, "servCodNeg");
            return (Criteria) this;
        }

        public Criteria andServCodAmbIsNull() {
            addCriterion("serv_cod_amb is null");
            return (Criteria) this;
        }

        public Criteria andServCodAmbIsNotNull() {
            addCriterion("serv_cod_amb is not null");
            return (Criteria) this;
        }

        public Criteria andServCodAmbEqualTo(Integer value) {
            addCriterion("serv_cod_amb =", value, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbNotEqualTo(Integer value) {
            addCriterion("serv_cod_amb <>", value, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbGreaterThan(Integer value) {
            addCriterion("serv_cod_amb >", value, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbGreaterThanOrEqualTo(Integer value) {
            addCriterion("serv_cod_amb >=", value, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbLessThan(Integer value) {
            addCriterion("serv_cod_amb <", value, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbLessThanOrEqualTo(Integer value) {
            addCriterion("serv_cod_amb <=", value, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbIn(List<Integer> values) {
            addCriterion("serv_cod_amb in", values, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbNotIn(List<Integer> values) {
            addCriterion("serv_cod_amb not in", values, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbBetween(Integer value1, Integer value2) {
            addCriterion("serv_cod_amb between", value1, value2, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServCodAmbNotBetween(Integer value1, Integer value2) {
            addCriterion("serv_cod_amb not between", value1, value2, "servCodAmb");
            return (Criteria) this;
        }

        public Criteria andServDesIsNull() {
            addCriterion("serv_des is null");
            return (Criteria) this;
        }

        public Criteria andServDesIsNotNull() {
            addCriterion("serv_des is not null");
            return (Criteria) this;
        }

        public Criteria andServDesEqualTo(String value) {
            addCriterion("serv_des =", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesNotEqualTo(String value) {
            addCriterion("serv_des <>", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesGreaterThan(String value) {
            addCriterion("serv_des >", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesGreaterThanOrEqualTo(String value) {
            addCriterion("serv_des >=", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesLessThan(String value) {
            addCriterion("serv_des <", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesLessThanOrEqualTo(String value) {
            addCriterion("serv_des <=", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesLike(String value) {
            addCriterion("serv_des like", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesNotLike(String value) {
            addCriterion("serv_des not like", value, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesIn(List<String> values) {
            addCriterion("serv_des in", values, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesNotIn(List<String> values) {
            addCriterion("serv_des not in", values, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesBetween(String value1, String value2) {
            addCriterion("serv_des between", value1, value2, "servDes");
            return (Criteria) this;
        }

        public Criteria andServDesNotBetween(String value1, String value2) {
            addCriterion("serv_des not between", value1, value2, "servDes");
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