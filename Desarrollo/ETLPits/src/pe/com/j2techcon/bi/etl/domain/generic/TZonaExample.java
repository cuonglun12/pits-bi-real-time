package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TZonaExample {
	
	protected String paginationByClause;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZonaExample() {
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

        public Criteria andZonIdIsNull() {
            addCriterion("zon_id is null");
            return (Criteria) this;
        }

        public Criteria andZonIdIsNotNull() {
            addCriterion("zon_id is not null");
            return (Criteria) this;
        }

        public Criteria andZonIdEqualTo(Integer value) {
            addCriterion("zon_id =", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdNotEqualTo(Integer value) {
            addCriterion("zon_id <>", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdGreaterThan(Integer value) {
            addCriterion("zon_id >", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zon_id >=", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdLessThan(Integer value) {
            addCriterion("zon_id <", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdLessThanOrEqualTo(Integer value) {
            addCriterion("zon_id <=", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdIn(List<Integer> values) {
            addCriterion("zon_id in", values, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdNotIn(List<Integer> values) {
            addCriterion("zon_id not in", values, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdBetween(Integer value1, Integer value2) {
            addCriterion("zon_id between", value1, value2, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zon_id not between", value1, value2, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonCodIsNull() {
            addCriterion("zon_cod is null");
            return (Criteria) this;
        }

        public Criteria andZonCodIsNotNull() {
            addCriterion("zon_cod is not null");
            return (Criteria) this;
        }

        public Criteria andZonCodEqualTo(String value) {
            addCriterion("zon_cod =", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodNotEqualTo(String value) {
            addCriterion("zon_cod <>", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodGreaterThan(String value) {
            addCriterion("zon_cod >", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodGreaterThanOrEqualTo(String value) {
            addCriterion("zon_cod >=", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodLessThan(String value) {
            addCriterion("zon_cod <", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodLessThanOrEqualTo(String value) {
            addCriterion("zon_cod <=", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodLike(String value) {
            addCriterion("zon_cod like", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodNotLike(String value) {
            addCriterion("zon_cod not like", value, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodIn(List<String> values) {
            addCriterion("zon_cod in", values, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodNotIn(List<String> values) {
            addCriterion("zon_cod not in", values, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodBetween(String value1, String value2) {
            addCriterion("zon_cod between", value1, value2, "zonCod");
            return (Criteria) this;
        }

        public Criteria andZonCodNotBetween(String value1, String value2) {
            addCriterion("zon_cod not between", value1, value2, "zonCod");
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

        public Criteria andZonDesIsNull() {
            addCriterion("zon_des is null");
            return (Criteria) this;
        }

        public Criteria andZonDesIsNotNull() {
            addCriterion("zon_des is not null");
            return (Criteria) this;
        }

        public Criteria andZonDesEqualTo(String value) {
            addCriterion("zon_des =", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesNotEqualTo(String value) {
            addCriterion("zon_des <>", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesGreaterThan(String value) {
            addCriterion("zon_des >", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesGreaterThanOrEqualTo(String value) {
            addCriterion("zon_des >=", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesLessThan(String value) {
            addCriterion("zon_des <", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesLessThanOrEqualTo(String value) {
            addCriterion("zon_des <=", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesLike(String value) {
            addCriterion("zon_des like", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesNotLike(String value) {
            addCriterion("zon_des not like", value, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesIn(List<String> values) {
            addCriterion("zon_des in", values, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesNotIn(List<String> values) {
            addCriterion("zon_des not in", values, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesBetween(String value1, String value2) {
            addCriterion("zon_des between", value1, value2, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonDesNotBetween(String value1, String value2) {
            addCriterion("zon_des not between", value1, value2, "zonDes");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalIsNull() {
            addCriterion("zon_cod_postal is null");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalIsNotNull() {
            addCriterion("zon_cod_postal is not null");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalEqualTo(String value) {
            addCriterion("zon_cod_postal =", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalNotEqualTo(String value) {
            addCriterion("zon_cod_postal <>", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalGreaterThan(String value) {
            addCriterion("zon_cod_postal >", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalGreaterThanOrEqualTo(String value) {
            addCriterion("zon_cod_postal >=", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalLessThan(String value) {
            addCriterion("zon_cod_postal <", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalLessThanOrEqualTo(String value) {
            addCriterion("zon_cod_postal <=", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalLike(String value) {
            addCriterion("zon_cod_postal like", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalNotLike(String value) {
            addCriterion("zon_cod_postal not like", value, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalIn(List<String> values) {
            addCriterion("zon_cod_postal in", values, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalNotIn(List<String> values) {
            addCriterion("zon_cod_postal not in", values, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalBetween(String value1, String value2) {
            addCriterion("zon_cod_postal between", value1, value2, "zonCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonCodPostalNotBetween(String value1, String value2) {
            addCriterion("zon_cod_postal not between", value1, value2, "zonCodPostal");
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