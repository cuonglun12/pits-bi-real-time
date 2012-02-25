package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimZonaExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimZonaExample() {
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

        public Criteria andZonaKeyIsNull() {
            addCriterion("zona_key is null");
            return (Criteria) this;
        }

        public Criteria andZonaKeyIsNotNull() {
            addCriterion("zona_key is not null");
            return (Criteria) this;
        }

        public Criteria andZonaKeyEqualTo(Integer value) {
            addCriterion("zona_key =", value, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyNotEqualTo(Integer value) {
            addCriterion("zona_key <>", value, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyGreaterThan(Integer value) {
            addCriterion("zona_key >", value, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("zona_key >=", value, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyLessThan(Integer value) {
            addCriterion("zona_key <", value, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyLessThanOrEqualTo(Integer value) {
            addCriterion("zona_key <=", value, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyIn(List<Integer> values) {
            addCriterion("zona_key in", values, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyNotIn(List<Integer> values) {
            addCriterion("zona_key not in", values, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyBetween(Integer value1, Integer value2) {
            addCriterion("zona_key between", value1, value2, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("zona_key not between", value1, value2, "zonaKey");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisIsNull() {
            addCriterion("zona_cod_pais is null");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisIsNotNull() {
            addCriterion("zona_cod_pais is not null");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisEqualTo(Integer value) {
            addCriterion("zona_cod_pais =", value, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisNotEqualTo(Integer value) {
            addCriterion("zona_cod_pais <>", value, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisGreaterThan(Integer value) {
            addCriterion("zona_cod_pais >", value, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisGreaterThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_pais >=", value, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisLessThan(Integer value) {
            addCriterion("zona_cod_pais <", value, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisLessThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_pais <=", value, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisIn(List<Integer> values) {
            addCriterion("zona_cod_pais in", values, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisNotIn(List<Integer> values) {
            addCriterion("zona_cod_pais not in", values, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_pais between", value1, value2, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodPaisNotBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_pais not between", value1, value2, "zonaCodPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisIsNull() {
            addCriterion("zona_desc_pais is null");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisIsNotNull() {
            addCriterion("zona_desc_pais is not null");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisEqualTo(String value) {
            addCriterion("zona_desc_pais =", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisNotEqualTo(String value) {
            addCriterion("zona_desc_pais <>", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisGreaterThan(String value) {
            addCriterion("zona_desc_pais >", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisGreaterThanOrEqualTo(String value) {
            addCriterion("zona_desc_pais >=", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisLessThan(String value) {
            addCriterion("zona_desc_pais <", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisLessThanOrEqualTo(String value) {
            addCriterion("zona_desc_pais <=", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisLike(String value) {
            addCriterion("zona_desc_pais like", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisNotLike(String value) {
            addCriterion("zona_desc_pais not like", value, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisIn(List<String> values) {
            addCriterion("zona_desc_pais in", values, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisNotIn(List<String> values) {
            addCriterion("zona_desc_pais not in", values, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisBetween(String value1, String value2) {
            addCriterion("zona_desc_pais between", value1, value2, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaDescPaisNotBetween(String value1, String value2) {
            addCriterion("zona_desc_pais not between", value1, value2, "zonaDescPais");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoIsNull() {
            addCriterion("zona_cod_departamento is null");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoIsNotNull() {
            addCriterion("zona_cod_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoEqualTo(Integer value) {
            addCriterion("zona_cod_departamento =", value, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoNotEqualTo(Integer value) {
            addCriterion("zona_cod_departamento <>", value, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoGreaterThan(Integer value) {
            addCriterion("zona_cod_departamento >", value, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_departamento >=", value, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoLessThan(Integer value) {
            addCriterion("zona_cod_departamento <", value, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoLessThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_departamento <=", value, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoIn(List<Integer> values) {
            addCriterion("zona_cod_departamento in", values, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoNotIn(List<Integer> values) {
            addCriterion("zona_cod_departamento not in", values, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_departamento between", value1, value2, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodDepartamentoNotBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_departamento not between", value1, value2, "zonaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoIsNull() {
            addCriterion("zona_desc_departamento is null");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoIsNotNull() {
            addCriterion("zona_desc_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoEqualTo(String value) {
            addCriterion("zona_desc_departamento =", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoNotEqualTo(String value) {
            addCriterion("zona_desc_departamento <>", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoGreaterThan(String value) {
            addCriterion("zona_desc_departamento >", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("zona_desc_departamento >=", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoLessThan(String value) {
            addCriterion("zona_desc_departamento <", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("zona_desc_departamento <=", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoLike(String value) {
            addCriterion("zona_desc_departamento like", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoNotLike(String value) {
            addCriterion("zona_desc_departamento not like", value, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoIn(List<String> values) {
            addCriterion("zona_desc_departamento in", values, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoNotIn(List<String> values) {
            addCriterion("zona_desc_departamento not in", values, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoBetween(String value1, String value2) {
            addCriterion("zona_desc_departamento between", value1, value2, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaDescDepartamentoNotBetween(String value1, String value2) {
            addCriterion("zona_desc_departamento not between", value1, value2, "zonaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaIsNull() {
            addCriterion("zona_cod_provincia is null");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaIsNotNull() {
            addCriterion("zona_cod_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaEqualTo(Integer value) {
            addCriterion("zona_cod_provincia =", value, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaNotEqualTo(Integer value) {
            addCriterion("zona_cod_provincia <>", value, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaGreaterThan(Integer value) {
            addCriterion("zona_cod_provincia >", value, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_provincia >=", value, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaLessThan(Integer value) {
            addCriterion("zona_cod_provincia <", value, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaLessThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_provincia <=", value, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaIn(List<Integer> values) {
            addCriterion("zona_cod_provincia in", values, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaNotIn(List<Integer> values) {
            addCriterion("zona_cod_provincia not in", values, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_provincia between", value1, value2, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodProvinciaNotBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_provincia not between", value1, value2, "zonaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaIsNull() {
            addCriterion("zona_desc_provincia is null");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaIsNotNull() {
            addCriterion("zona_desc_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaEqualTo(String value) {
            addCriterion("zona_desc_provincia =", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaNotEqualTo(String value) {
            addCriterion("zona_desc_provincia <>", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaGreaterThan(String value) {
            addCriterion("zona_desc_provincia >", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("zona_desc_provincia >=", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaLessThan(String value) {
            addCriterion("zona_desc_provincia <", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaLessThanOrEqualTo(String value) {
            addCriterion("zona_desc_provincia <=", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaLike(String value) {
            addCriterion("zona_desc_provincia like", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaNotLike(String value) {
            addCriterion("zona_desc_provincia not like", value, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaIn(List<String> values) {
            addCriterion("zona_desc_provincia in", values, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaNotIn(List<String> values) {
            addCriterion("zona_desc_provincia not in", values, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaBetween(String value1, String value2) {
            addCriterion("zona_desc_provincia between", value1, value2, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaDescProvinciaNotBetween(String value1, String value2) {
            addCriterion("zona_desc_provincia not between", value1, value2, "zonaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoIsNull() {
            addCriterion("zona_cod_distrito is null");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoIsNotNull() {
            addCriterion("zona_cod_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoEqualTo(Integer value) {
            addCriterion("zona_cod_distrito =", value, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoNotEqualTo(Integer value) {
            addCriterion("zona_cod_distrito <>", value, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoGreaterThan(Integer value) {
            addCriterion("zona_cod_distrito >", value, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_distrito >=", value, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoLessThan(Integer value) {
            addCriterion("zona_cod_distrito <", value, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoLessThanOrEqualTo(Integer value) {
            addCriterion("zona_cod_distrito <=", value, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoIn(List<Integer> values) {
            addCriterion("zona_cod_distrito in", values, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoNotIn(List<Integer> values) {
            addCriterion("zona_cod_distrito not in", values, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_distrito between", value1, value2, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodDistritoNotBetween(Integer value1, Integer value2) {
            addCriterion("zona_cod_distrito not between", value1, value2, "zonaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoIsNull() {
            addCriterion("zona_desc_distrito is null");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoIsNotNull() {
            addCriterion("zona_desc_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoEqualTo(String value) {
            addCriterion("zona_desc_distrito =", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoNotEqualTo(String value) {
            addCriterion("zona_desc_distrito <>", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoGreaterThan(String value) {
            addCriterion("zona_desc_distrito >", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("zona_desc_distrito >=", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoLessThan(String value) {
            addCriterion("zona_desc_distrito <", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoLessThanOrEqualTo(String value) {
            addCriterion("zona_desc_distrito <=", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoLike(String value) {
            addCriterion("zona_desc_distrito like", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoNotLike(String value) {
            addCriterion("zona_desc_distrito not like", value, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoIn(List<String> values) {
            addCriterion("zona_desc_distrito in", values, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoNotIn(List<String> values) {
            addCriterion("zona_desc_distrito not in", values, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoBetween(String value1, String value2) {
            addCriterion("zona_desc_distrito between", value1, value2, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaDescDistritoNotBetween(String value1, String value2) {
            addCriterion("zona_desc_distrito not between", value1, value2, "zonaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andZonaCodIsNull() {
            addCriterion("zona_cod is null");
            return (Criteria) this;
        }

        public Criteria andZonaCodIsNotNull() {
            addCriterion("zona_cod is not null");
            return (Criteria) this;
        }

        public Criteria andZonaCodEqualTo(String value) {
            addCriterion("zona_cod =", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodNotEqualTo(String value) {
            addCriterion("zona_cod <>", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodGreaterThan(String value) {
            addCriterion("zona_cod >", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodGreaterThanOrEqualTo(String value) {
            addCriterion("zona_cod >=", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodLessThan(String value) {
            addCriterion("zona_cod <", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodLessThanOrEqualTo(String value) {
            addCriterion("zona_cod <=", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodLike(String value) {
            addCriterion("zona_cod like", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodNotLike(String value) {
            addCriterion("zona_cod not like", value, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodIn(List<String> values) {
            addCriterion("zona_cod in", values, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodNotIn(List<String> values) {
            addCriterion("zona_cod not in", values, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodBetween(String value1, String value2) {
            addCriterion("zona_cod between", value1, value2, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodNotBetween(String value1, String value2) {
            addCriterion("zona_cod not between", value1, value2, "zonaCod");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalIsNull() {
            addCriterion("zona_cod_postal is null");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalIsNotNull() {
            addCriterion("zona_cod_postal is not null");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalEqualTo(String value) {
            addCriterion("zona_cod_postal =", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalNotEqualTo(String value) {
            addCriterion("zona_cod_postal <>", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalGreaterThan(String value) {
            addCriterion("zona_cod_postal >", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalGreaterThanOrEqualTo(String value) {
            addCriterion("zona_cod_postal >=", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalLessThan(String value) {
            addCriterion("zona_cod_postal <", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalLessThanOrEqualTo(String value) {
            addCriterion("zona_cod_postal <=", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalLike(String value) {
            addCriterion("zona_cod_postal like", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalNotLike(String value) {
            addCriterion("zona_cod_postal not like", value, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalIn(List<String> values) {
            addCriterion("zona_cod_postal in", values, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalNotIn(List<String> values) {
            addCriterion("zona_cod_postal not in", values, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalBetween(String value1, String value2) {
            addCriterion("zona_cod_postal between", value1, value2, "zonaCodPostal");
            return (Criteria) this;
        }

        public Criteria andZonaCodPostalNotBetween(String value1, String value2) {
            addCriterion("zona_cod_postal not between", value1, value2, "zonaCodPostal");
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