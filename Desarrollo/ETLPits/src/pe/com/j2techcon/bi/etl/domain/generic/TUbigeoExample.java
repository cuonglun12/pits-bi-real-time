package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TUbigeoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUbigeoExample() {
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

        public Criteria andUbiCodIsNull() {
            addCriterion("ubi_cod is null");
            return (Criteria) this;
        }

        public Criteria andUbiCodIsNotNull() {
            addCriterion("ubi_cod is not null");
            return (Criteria) this;
        }

        public Criteria andUbiCodEqualTo(String value) {
            addCriterion("ubi_cod =", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodNotEqualTo(String value) {
            addCriterion("ubi_cod <>", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodGreaterThan(String value) {
            addCriterion("ubi_cod >", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodGreaterThanOrEqualTo(String value) {
            addCriterion("ubi_cod >=", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodLessThan(String value) {
            addCriterion("ubi_cod <", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodLessThanOrEqualTo(String value) {
            addCriterion("ubi_cod <=", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodLike(String value) {
            addCriterion("ubi_cod like", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodNotLike(String value) {
            addCriterion("ubi_cod not like", value, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodIn(List<String> values) {
            addCriterion("ubi_cod in", values, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodNotIn(List<String> values) {
            addCriterion("ubi_cod not in", values, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodBetween(String value1, String value2) {
            addCriterion("ubi_cod between", value1, value2, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodNotBetween(String value1, String value2) {
            addCriterion("ubi_cod not between", value1, value2, "ubiCod");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisIsNull() {
            addCriterion("ubi_cod_pais is null");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisIsNotNull() {
            addCriterion("ubi_cod_pais is not null");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisEqualTo(Integer value) {
            addCriterion("ubi_cod_pais =", value, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisNotEqualTo(Integer value) {
            addCriterion("ubi_cod_pais <>", value, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisGreaterThan(Integer value) {
            addCriterion("ubi_cod_pais >", value, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_pais >=", value, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisLessThan(Integer value) {
            addCriterion("ubi_cod_pais <", value, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisLessThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_pais <=", value, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisIn(List<Integer> values) {
            addCriterion("ubi_cod_pais in", values, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisNotIn(List<Integer> values) {
            addCriterion("ubi_cod_pais not in", values, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_pais between", value1, value2, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodPaisNotBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_pais not between", value1, value2, "ubiCodPais");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoIsNull() {
            addCriterion("ubi_cod_departamento is null");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoIsNotNull() {
            addCriterion("ubi_cod_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoEqualTo(Integer value) {
            addCriterion("ubi_cod_departamento =", value, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoNotEqualTo(Integer value) {
            addCriterion("ubi_cod_departamento <>", value, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoGreaterThan(Integer value) {
            addCriterion("ubi_cod_departamento >", value, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_departamento >=", value, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoLessThan(Integer value) {
            addCriterion("ubi_cod_departamento <", value, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoLessThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_departamento <=", value, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoIn(List<Integer> values) {
            addCriterion("ubi_cod_departamento in", values, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoNotIn(List<Integer> values) {
            addCriterion("ubi_cod_departamento not in", values, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_departamento between", value1, value2, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodDepartamentoNotBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_departamento not between", value1, value2, "ubiCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaIsNull() {
            addCriterion("ubi_cod_provincia is null");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaIsNotNull() {
            addCriterion("ubi_cod_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaEqualTo(Integer value) {
            addCriterion("ubi_cod_provincia =", value, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaNotEqualTo(Integer value) {
            addCriterion("ubi_cod_provincia <>", value, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaGreaterThan(Integer value) {
            addCriterion("ubi_cod_provincia >", value, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_provincia >=", value, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaLessThan(Integer value) {
            addCriterion("ubi_cod_provincia <", value, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaLessThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_provincia <=", value, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaIn(List<Integer> values) {
            addCriterion("ubi_cod_provincia in", values, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaNotIn(List<Integer> values) {
            addCriterion("ubi_cod_provincia not in", values, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_provincia between", value1, value2, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodProvinciaNotBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_provincia not between", value1, value2, "ubiCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoIsNull() {
            addCriterion("ubi_cod_distrito is null");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoIsNotNull() {
            addCriterion("ubi_cod_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoEqualTo(Integer value) {
            addCriterion("ubi_cod_distrito =", value, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoNotEqualTo(Integer value) {
            addCriterion("ubi_cod_distrito <>", value, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoGreaterThan(Integer value) {
            addCriterion("ubi_cod_distrito >", value, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_distrito >=", value, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoLessThan(Integer value) {
            addCriterion("ubi_cod_distrito <", value, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoLessThanOrEqualTo(Integer value) {
            addCriterion("ubi_cod_distrito <=", value, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoIn(List<Integer> values) {
            addCriterion("ubi_cod_distrito in", values, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoNotIn(List<Integer> values) {
            addCriterion("ubi_cod_distrito not in", values, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_distrito between", value1, value2, "ubiCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbiCodDistritoNotBetween(Integer value1, Integer value2) {
            addCriterion("ubi_cod_distrito not between", value1, value2, "ubiCodDistrito");
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