package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimTipoRepartoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimTipoRepartoExample() {
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

        public Criteria andTipoRepartoKeyIsNull() {
            addCriterion("tipo_reparto_key is null");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyIsNotNull() {
            addCriterion("tipo_reparto_key is not null");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyEqualTo(Integer value) {
            addCriterion("tipo_reparto_key =", value, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyNotEqualTo(Integer value) {
            addCriterion("tipo_reparto_key <>", value, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyGreaterThan(Integer value) {
            addCriterion("tipo_reparto_key >", value, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipo_reparto_key >=", value, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyLessThan(Integer value) {
            addCriterion("tipo_reparto_key <", value, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("tipo_reparto_key <=", value, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyIn(List<Integer> values) {
            addCriterion("tipo_reparto_key in", values, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyNotIn(List<Integer> values) {
            addCriterion("tipo_reparto_key not in", values, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyBetween(Integer value1, Integer value2) {
            addCriterion("tipo_reparto_key between", value1, value2, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("tipo_reparto_key not between", value1, value2, "tipoRepartoKey");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodIsNull() {
            addCriterion("tipo_reparto_cod is null");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodIsNotNull() {
            addCriterion("tipo_reparto_cod is not null");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodEqualTo(String value) {
            addCriterion("tipo_reparto_cod =", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodNotEqualTo(String value) {
            addCriterion("tipo_reparto_cod <>", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodGreaterThan(String value) {
            addCriterion("tipo_reparto_cod >", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_reparto_cod >=", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodLessThan(String value) {
            addCriterion("tipo_reparto_cod <", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodLessThanOrEqualTo(String value) {
            addCriterion("tipo_reparto_cod <=", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodLike(String value) {
            addCriterion("tipo_reparto_cod like", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodNotLike(String value) {
            addCriterion("tipo_reparto_cod not like", value, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodIn(List<String> values) {
            addCriterion("tipo_reparto_cod in", values, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodNotIn(List<String> values) {
            addCriterion("tipo_reparto_cod not in", values, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodBetween(String value1, String value2) {
            addCriterion("tipo_reparto_cod between", value1, value2, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoCodNotBetween(String value1, String value2) {
            addCriterion("tipo_reparto_cod not between", value1, value2, "tipoRepartoCod");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescIsNull() {
            addCriterion("tipo_reparto_desc is null");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescIsNotNull() {
            addCriterion("tipo_reparto_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescEqualTo(String value) {
            addCriterion("tipo_reparto_desc =", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescNotEqualTo(String value) {
            addCriterion("tipo_reparto_desc <>", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescGreaterThan(String value) {
            addCriterion("tipo_reparto_desc >", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_reparto_desc >=", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescLessThan(String value) {
            addCriterion("tipo_reparto_desc <", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescLessThanOrEqualTo(String value) {
            addCriterion("tipo_reparto_desc <=", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescLike(String value) {
            addCriterion("tipo_reparto_desc like", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescNotLike(String value) {
            addCriterion("tipo_reparto_desc not like", value, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescIn(List<String> values) {
            addCriterion("tipo_reparto_desc in", values, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescNotIn(List<String> values) {
            addCriterion("tipo_reparto_desc not in", values, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescBetween(String value1, String value2) {
            addCriterion("tipo_reparto_desc between", value1, value2, "tipoRepartoDesc");
            return (Criteria) this;
        }

        public Criteria andTipoRepartoDescNotBetween(String value1, String value2) {
            addCriterion("tipo_reparto_desc not between", value1, value2, "tipoRepartoDesc");
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