package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimUbigeoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimUbigeoExample() {
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

        public Criteria andUbigeoKeyIsNull() {
            addCriterion("ubigeo_key is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyIsNotNull() {
            addCriterion("ubigeo_key is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyEqualTo(Integer value) {
            addCriterion("ubigeo_key =", value, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyNotEqualTo(Integer value) {
            addCriterion("ubigeo_key <>", value, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyGreaterThan(Integer value) {
            addCriterion("ubigeo_key >", value, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_key >=", value, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyLessThan(Integer value) {
            addCriterion("ubigeo_key <", value, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_key <=", value, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyIn(List<Integer> values) {
            addCriterion("ubigeo_key in", values, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyNotIn(List<Integer> values) {
            addCriterion("ubigeo_key not in", values, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_key between", value1, value2, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_key not between", value1, value2, "ubigeoKey");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisIsNull() {
            addCriterion("ubigeo_cod_pais is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisIsNotNull() {
            addCriterion("ubigeo_cod_pais is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisEqualTo(Integer value) {
            addCriterion("ubigeo_cod_pais =", value, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisNotEqualTo(Integer value) {
            addCriterion("ubigeo_cod_pais <>", value, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisGreaterThan(Integer value) {
            addCriterion("ubigeo_cod_pais >", value, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_pais >=", value, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisLessThan(Integer value) {
            addCriterion("ubigeo_cod_pais <", value, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisLessThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_pais <=", value, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisIn(List<Integer> values) {
            addCriterion("ubigeo_cod_pais in", values, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisNotIn(List<Integer> values) {
            addCriterion("ubigeo_cod_pais not in", values, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_pais between", value1, value2, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodPaisNotBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_pais not between", value1, value2, "ubigeoCodPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisIsNull() {
            addCriterion("ubigeo_des_pais is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisIsNotNull() {
            addCriterion("ubigeo_des_pais is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisEqualTo(String value) {
            addCriterion("ubigeo_des_pais =", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisNotEqualTo(String value) {
            addCriterion("ubigeo_des_pais <>", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisGreaterThan(String value) {
            addCriterion("ubigeo_des_pais >", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeo_des_pais >=", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisLessThan(String value) {
            addCriterion("ubigeo_des_pais <", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisLessThanOrEqualTo(String value) {
            addCriterion("ubigeo_des_pais <=", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisLike(String value) {
            addCriterion("ubigeo_des_pais like", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisNotLike(String value) {
            addCriterion("ubigeo_des_pais not like", value, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisIn(List<String> values) {
            addCriterion("ubigeo_des_pais in", values, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisNotIn(List<String> values) {
            addCriterion("ubigeo_des_pais not in", values, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisBetween(String value1, String value2) {
            addCriterion("ubigeo_des_pais between", value1, value2, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoDesPaisNotBetween(String value1, String value2) {
            addCriterion("ubigeo_des_pais not between", value1, value2, "ubigeoDesPais");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoIsNull() {
            addCriterion("ubigeo_cod_departamento is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoIsNotNull() {
            addCriterion("ubigeo_cod_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoEqualTo(Integer value) {
            addCriterion("ubigeo_cod_departamento =", value, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoNotEqualTo(Integer value) {
            addCriterion("ubigeo_cod_departamento <>", value, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoGreaterThan(Integer value) {
            addCriterion("ubigeo_cod_departamento >", value, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_departamento >=", value, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoLessThan(Integer value) {
            addCriterion("ubigeo_cod_departamento <", value, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoLessThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_departamento <=", value, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoIn(List<Integer> values) {
            addCriterion("ubigeo_cod_departamento in", values, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoNotIn(List<Integer> values) {
            addCriterion("ubigeo_cod_departamento not in", values, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_departamento between", value1, value2, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDepartamentoNotBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_departamento not between", value1, value2, "ubigeoCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoIsNull() {
            addCriterion("ubigeo_desc_departamento is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoIsNotNull() {
            addCriterion("ubigeo_desc_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoEqualTo(String value) {
            addCriterion("ubigeo_desc_departamento =", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoNotEqualTo(String value) {
            addCriterion("ubigeo_desc_departamento <>", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoGreaterThan(String value) {
            addCriterion("ubigeo_desc_departamento >", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeo_desc_departamento >=", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoLessThan(String value) {
            addCriterion("ubigeo_desc_departamento <", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("ubigeo_desc_departamento <=", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoLike(String value) {
            addCriterion("ubigeo_desc_departamento like", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoNotLike(String value) {
            addCriterion("ubigeo_desc_departamento not like", value, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoIn(List<String> values) {
            addCriterion("ubigeo_desc_departamento in", values, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoNotIn(List<String> values) {
            addCriterion("ubigeo_desc_departamento not in", values, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoBetween(String value1, String value2) {
            addCriterion("ubigeo_desc_departamento between", value1, value2, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDepartamentoNotBetween(String value1, String value2) {
            addCriterion("ubigeo_desc_departamento not between", value1, value2, "ubigeoDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaIsNull() {
            addCriterion("ubigeo_cod_provincia is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaIsNotNull() {
            addCriterion("ubigeo_cod_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaEqualTo(Integer value) {
            addCriterion("ubigeo_cod_provincia =", value, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaNotEqualTo(Integer value) {
            addCriterion("ubigeo_cod_provincia <>", value, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaGreaterThan(Integer value) {
            addCriterion("ubigeo_cod_provincia >", value, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_provincia >=", value, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaLessThan(Integer value) {
            addCriterion("ubigeo_cod_provincia <", value, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaLessThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_provincia <=", value, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaIn(List<Integer> values) {
            addCriterion("ubigeo_cod_provincia in", values, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaNotIn(List<Integer> values) {
            addCriterion("ubigeo_cod_provincia not in", values, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_provincia between", value1, value2, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodProvinciaNotBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_provincia not between", value1, value2, "ubigeoCodProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaIsNull() {
            addCriterion("ubigeo_desc_provincia is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaIsNotNull() {
            addCriterion("ubigeo_desc_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaEqualTo(String value) {
            addCriterion("ubigeo_desc_provincia =", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaNotEqualTo(String value) {
            addCriterion("ubigeo_desc_provincia <>", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaGreaterThan(String value) {
            addCriterion("ubigeo_desc_provincia >", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeo_desc_provincia >=", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaLessThan(String value) {
            addCriterion("ubigeo_desc_provincia <", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaLessThanOrEqualTo(String value) {
            addCriterion("ubigeo_desc_provincia <=", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaLike(String value) {
            addCriterion("ubigeo_desc_provincia like", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaNotLike(String value) {
            addCriterion("ubigeo_desc_provincia not like", value, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaIn(List<String> values) {
            addCriterion("ubigeo_desc_provincia in", values, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaNotIn(List<String> values) {
            addCriterion("ubigeo_desc_provincia not in", values, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaBetween(String value1, String value2) {
            addCriterion("ubigeo_desc_provincia between", value1, value2, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescProvinciaNotBetween(String value1, String value2) {
            addCriterion("ubigeo_desc_provincia not between", value1, value2, "ubigeoDescProvincia");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoIsNull() {
            addCriterion("ubigeo_cod_distrito is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoIsNotNull() {
            addCriterion("ubigeo_cod_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoEqualTo(Integer value) {
            addCriterion("ubigeo_cod_distrito =", value, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoNotEqualTo(Integer value) {
            addCriterion("ubigeo_cod_distrito <>", value, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoGreaterThan(Integer value) {
            addCriterion("ubigeo_cod_distrito >", value, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_distrito >=", value, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoLessThan(Integer value) {
            addCriterion("ubigeo_cod_distrito <", value, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoLessThanOrEqualTo(Integer value) {
            addCriterion("ubigeo_cod_distrito <=", value, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoIn(List<Integer> values) {
            addCriterion("ubigeo_cod_distrito in", values, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoNotIn(List<Integer> values) {
            addCriterion("ubigeo_cod_distrito not in", values, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_distrito between", value1, value2, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoCodDistritoNotBetween(Integer value1, Integer value2) {
            addCriterion("ubigeo_cod_distrito not between", value1, value2, "ubigeoCodDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoIsNull() {
            addCriterion("ubigeo_desc_distrito is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoIsNotNull() {
            addCriterion("ubigeo_desc_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoEqualTo(String value) {
            addCriterion("ubigeo_desc_distrito =", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoNotEqualTo(String value) {
            addCriterion("ubigeo_desc_distrito <>", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoGreaterThan(String value) {
            addCriterion("ubigeo_desc_distrito >", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeo_desc_distrito >=", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoLessThan(String value) {
            addCriterion("ubigeo_desc_distrito <", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoLessThanOrEqualTo(String value) {
            addCriterion("ubigeo_desc_distrito <=", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoLike(String value) {
            addCriterion("ubigeo_desc_distrito like", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoNotLike(String value) {
            addCriterion("ubigeo_desc_distrito not like", value, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoIn(List<String> values) {
            addCriterion("ubigeo_desc_distrito in", values, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoNotIn(List<String> values) {
            addCriterion("ubigeo_desc_distrito not in", values, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoBetween(String value1, String value2) {
            addCriterion("ubigeo_desc_distrito between", value1, value2, "ubigeoDescDistrito");
            return (Criteria) this;
        }

        public Criteria andUbigeoDescDistritoNotBetween(String value1, String value2) {
            addCriterion("ubigeo_desc_distrito not between", value1, value2, "ubigeoDescDistrito");
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