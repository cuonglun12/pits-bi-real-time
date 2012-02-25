package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimSedeExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimSedeExample() {
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

        public Criteria andSedeKeyIsNull() {
            addCriterion("sede_key is null");
            return (Criteria) this;
        }

        public Criteria andSedeKeyIsNotNull() {
            addCriterion("sede_key is not null");
            return (Criteria) this;
        }

        public Criteria andSedeKeyEqualTo(Integer value) {
            addCriterion("sede_key =", value, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyNotEqualTo(Integer value) {
            addCriterion("sede_key <>", value, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyGreaterThan(Integer value) {
            addCriterion("sede_key >", value, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sede_key >=", value, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyLessThan(Integer value) {
            addCriterion("sede_key <", value, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyLessThanOrEqualTo(Integer value) {
            addCriterion("sede_key <=", value, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyIn(List<Integer> values) {
            addCriterion("sede_key in", values, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyNotIn(List<Integer> values) {
            addCriterion("sede_key not in", values, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyBetween(Integer value1, Integer value2) {
            addCriterion("sede_key between", value1, value2, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("sede_key not between", value1, value2, "sedeKey");
            return (Criteria) this;
        }

        public Criteria andSedeCodIsNull() {
            addCriterion("sede_cod is null");
            return (Criteria) this;
        }

        public Criteria andSedeCodIsNotNull() {
            addCriterion("sede_cod is not null");
            return (Criteria) this;
        }

        public Criteria andSedeCodEqualTo(String value) {
            addCriterion("sede_cod =", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodNotEqualTo(String value) {
            addCriterion("sede_cod <>", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodGreaterThan(String value) {
            addCriterion("sede_cod >", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodGreaterThanOrEqualTo(String value) {
            addCriterion("sede_cod >=", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodLessThan(String value) {
            addCriterion("sede_cod <", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodLessThanOrEqualTo(String value) {
            addCriterion("sede_cod <=", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodLike(String value) {
            addCriterion("sede_cod like", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodNotLike(String value) {
            addCriterion("sede_cod not like", value, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodIn(List<String> values) {
            addCriterion("sede_cod in", values, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodNotIn(List<String> values) {
            addCriterion("sede_cod not in", values, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodBetween(String value1, String value2) {
            addCriterion("sede_cod between", value1, value2, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodNotBetween(String value1, String value2) {
            addCriterion("sede_cod not between", value1, value2, "sedeCod");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoIsNull() {
            addCriterion("sede_cod_tipo is null");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoIsNotNull() {
            addCriterion("sede_cod_tipo is not null");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoEqualTo(Integer value) {
            addCriterion("sede_cod_tipo =", value, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoNotEqualTo(Integer value) {
            addCriterion("sede_cod_tipo <>", value, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoGreaterThan(Integer value) {
            addCriterion("sede_cod_tipo >", value, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_tipo >=", value, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoLessThan(Integer value) {
            addCriterion("sede_cod_tipo <", value, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoLessThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_tipo <=", value, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoIn(List<Integer> values) {
            addCriterion("sede_cod_tipo in", values, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoNotIn(List<Integer> values) {
            addCriterion("sede_cod_tipo not in", values, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_tipo between", value1, value2, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodTipoNotBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_tipo not between", value1, value2, "sedeCodTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoIsNull() {
            addCriterion("sede_desc_tipo is null");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoIsNotNull() {
            addCriterion("sede_desc_tipo is not null");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoEqualTo(String value) {
            addCriterion("sede_desc_tipo =", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoNotEqualTo(String value) {
            addCriterion("sede_desc_tipo <>", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoGreaterThan(String value) {
            addCriterion("sede_desc_tipo >", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoGreaterThanOrEqualTo(String value) {
            addCriterion("sede_desc_tipo >=", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoLessThan(String value) {
            addCriterion("sede_desc_tipo <", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoLessThanOrEqualTo(String value) {
            addCriterion("sede_desc_tipo <=", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoLike(String value) {
            addCriterion("sede_desc_tipo like", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoNotLike(String value) {
            addCriterion("sede_desc_tipo not like", value, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoIn(List<String> values) {
            addCriterion("sede_desc_tipo in", values, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoNotIn(List<String> values) {
            addCriterion("sede_desc_tipo not in", values, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoBetween(String value1, String value2) {
            addCriterion("sede_desc_tipo between", value1, value2, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeDescTipoNotBetween(String value1, String value2) {
            addCriterion("sede_desc_tipo not between", value1, value2, "sedeDescTipo");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisIsNull() {
            addCriterion("sede_cod_pais is null");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisIsNotNull() {
            addCriterion("sede_cod_pais is not null");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisEqualTo(Integer value) {
            addCriterion("sede_cod_pais =", value, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisNotEqualTo(Integer value) {
            addCriterion("sede_cod_pais <>", value, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisGreaterThan(Integer value) {
            addCriterion("sede_cod_pais >", value, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisGreaterThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_pais >=", value, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisLessThan(Integer value) {
            addCriterion("sede_cod_pais <", value, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisLessThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_pais <=", value, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisIn(List<Integer> values) {
            addCriterion("sede_cod_pais in", values, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisNotIn(List<Integer> values) {
            addCriterion("sede_cod_pais not in", values, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_pais between", value1, value2, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodPaisNotBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_pais not between", value1, value2, "sedeCodPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisIsNull() {
            addCriterion("sede_desc_pais is null");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisIsNotNull() {
            addCriterion("sede_desc_pais is not null");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisEqualTo(String value) {
            addCriterion("sede_desc_pais =", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisNotEqualTo(String value) {
            addCriterion("sede_desc_pais <>", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisGreaterThan(String value) {
            addCriterion("sede_desc_pais >", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisGreaterThanOrEqualTo(String value) {
            addCriterion("sede_desc_pais >=", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisLessThan(String value) {
            addCriterion("sede_desc_pais <", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisLessThanOrEqualTo(String value) {
            addCriterion("sede_desc_pais <=", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisLike(String value) {
            addCriterion("sede_desc_pais like", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisNotLike(String value) {
            addCriterion("sede_desc_pais not like", value, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisIn(List<String> values) {
            addCriterion("sede_desc_pais in", values, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisNotIn(List<String> values) {
            addCriterion("sede_desc_pais not in", values, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisBetween(String value1, String value2) {
            addCriterion("sede_desc_pais between", value1, value2, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeDescPaisNotBetween(String value1, String value2) {
            addCriterion("sede_desc_pais not between", value1, value2, "sedeDescPais");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoIsNull() {
            addCriterion("sede_cod_departamento is null");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoIsNotNull() {
            addCriterion("sede_cod_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoEqualTo(Integer value) {
            addCriterion("sede_cod_departamento =", value, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoNotEqualTo(Integer value) {
            addCriterion("sede_cod_departamento <>", value, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoGreaterThan(Integer value) {
            addCriterion("sede_cod_departamento >", value, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_departamento >=", value, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoLessThan(Integer value) {
            addCriterion("sede_cod_departamento <", value, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoLessThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_departamento <=", value, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoIn(List<Integer> values) {
            addCriterion("sede_cod_departamento in", values, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoNotIn(List<Integer> values) {
            addCriterion("sede_cod_departamento not in", values, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_departamento between", value1, value2, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodDepartamentoNotBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_departamento not between", value1, value2, "sedeCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoIsNull() {
            addCriterion("sede_desc_departamento is null");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoIsNotNull() {
            addCriterion("sede_desc_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoEqualTo(String value) {
            addCriterion("sede_desc_departamento =", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoNotEqualTo(String value) {
            addCriterion("sede_desc_departamento <>", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoGreaterThan(String value) {
            addCriterion("sede_desc_departamento >", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("sede_desc_departamento >=", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoLessThan(String value) {
            addCriterion("sede_desc_departamento <", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("sede_desc_departamento <=", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoLike(String value) {
            addCriterion("sede_desc_departamento like", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoNotLike(String value) {
            addCriterion("sede_desc_departamento not like", value, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoIn(List<String> values) {
            addCriterion("sede_desc_departamento in", values, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoNotIn(List<String> values) {
            addCriterion("sede_desc_departamento not in", values, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoBetween(String value1, String value2) {
            addCriterion("sede_desc_departamento between", value1, value2, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeDescDepartamentoNotBetween(String value1, String value2) {
            addCriterion("sede_desc_departamento not between", value1, value2, "sedeDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaIsNull() {
            addCriterion("sede_cod_provincia is null");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaIsNotNull() {
            addCriterion("sede_cod_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaEqualTo(Integer value) {
            addCriterion("sede_cod_provincia =", value, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaNotEqualTo(Integer value) {
            addCriterion("sede_cod_provincia <>", value, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaGreaterThan(Integer value) {
            addCriterion("sede_cod_provincia >", value, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_provincia >=", value, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaLessThan(Integer value) {
            addCriterion("sede_cod_provincia <", value, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaLessThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_provincia <=", value, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaIn(List<Integer> values) {
            addCriterion("sede_cod_provincia in", values, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaNotIn(List<Integer> values) {
            addCriterion("sede_cod_provincia not in", values, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_provincia between", value1, value2, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodProvinciaNotBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_provincia not between", value1, value2, "sedeCodProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaIsNull() {
            addCriterion("sede_desc_provincia is null");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaIsNotNull() {
            addCriterion("sede_desc_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaEqualTo(String value) {
            addCriterion("sede_desc_provincia =", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaNotEqualTo(String value) {
            addCriterion("sede_desc_provincia <>", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaGreaterThan(String value) {
            addCriterion("sede_desc_provincia >", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("sede_desc_provincia >=", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaLessThan(String value) {
            addCriterion("sede_desc_provincia <", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaLessThanOrEqualTo(String value) {
            addCriterion("sede_desc_provincia <=", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaLike(String value) {
            addCriterion("sede_desc_provincia like", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaNotLike(String value) {
            addCriterion("sede_desc_provincia not like", value, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaIn(List<String> values) {
            addCriterion("sede_desc_provincia in", values, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaNotIn(List<String> values) {
            addCriterion("sede_desc_provincia not in", values, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaBetween(String value1, String value2) {
            addCriterion("sede_desc_provincia between", value1, value2, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeDescProvinciaNotBetween(String value1, String value2) {
            addCriterion("sede_desc_provincia not between", value1, value2, "sedeDescProvincia");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoIsNull() {
            addCriterion("sede_cod_distrito is null");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoIsNotNull() {
            addCriterion("sede_cod_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoEqualTo(Integer value) {
            addCriterion("sede_cod_distrito =", value, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoNotEqualTo(Integer value) {
            addCriterion("sede_cod_distrito <>", value, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoGreaterThan(Integer value) {
            addCriterion("sede_cod_distrito >", value, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_distrito >=", value, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoLessThan(Integer value) {
            addCriterion("sede_cod_distrito <", value, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoLessThanOrEqualTo(Integer value) {
            addCriterion("sede_cod_distrito <=", value, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoIn(List<Integer> values) {
            addCriterion("sede_cod_distrito in", values, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoNotIn(List<Integer> values) {
            addCriterion("sede_cod_distrito not in", values, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_distrito between", value1, value2, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeCodDistritoNotBetween(Integer value1, Integer value2) {
            addCriterion("sede_cod_distrito not between", value1, value2, "sedeCodDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoIsNull() {
            addCriterion("sede_desc_distrito is null");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoIsNotNull() {
            addCriterion("sede_desc_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoEqualTo(String value) {
            addCriterion("sede_desc_distrito =", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoNotEqualTo(String value) {
            addCriterion("sede_desc_distrito <>", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoGreaterThan(String value) {
            addCriterion("sede_desc_distrito >", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("sede_desc_distrito >=", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoLessThan(String value) {
            addCriterion("sede_desc_distrito <", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoLessThanOrEqualTo(String value) {
            addCriterion("sede_desc_distrito <=", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoLike(String value) {
            addCriterion("sede_desc_distrito like", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoNotLike(String value) {
            addCriterion("sede_desc_distrito not like", value, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoIn(List<String> values) {
            addCriterion("sede_desc_distrito in", values, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoNotIn(List<String> values) {
            addCriterion("sede_desc_distrito not in", values, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoBetween(String value1, String value2) {
            addCriterion("sede_desc_distrito between", value1, value2, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescDistritoNotBetween(String value1, String value2) {
            addCriterion("sede_desc_distrito not between", value1, value2, "sedeDescDistrito");
            return (Criteria) this;
        }

        public Criteria andSedeDescIsNull() {
            addCriterion("sede_desc is null");
            return (Criteria) this;
        }

        public Criteria andSedeDescIsNotNull() {
            addCriterion("sede_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSedeDescEqualTo(String value) {
            addCriterion("sede_desc =", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescNotEqualTo(String value) {
            addCriterion("sede_desc <>", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescGreaterThan(String value) {
            addCriterion("sede_desc >", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescGreaterThanOrEqualTo(String value) {
            addCriterion("sede_desc >=", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescLessThan(String value) {
            addCriterion("sede_desc <", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescLessThanOrEqualTo(String value) {
            addCriterion("sede_desc <=", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescLike(String value) {
            addCriterion("sede_desc like", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescNotLike(String value) {
            addCriterion("sede_desc not like", value, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescIn(List<String> values) {
            addCriterion("sede_desc in", values, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescNotIn(List<String> values) {
            addCriterion("sede_desc not in", values, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescBetween(String value1, String value2) {
            addCriterion("sede_desc between", value1, value2, "sedeDesc");
            return (Criteria) this;
        }

        public Criteria andSedeDescNotBetween(String value1, String value2) {
            addCriterion("sede_desc not between", value1, value2, "sedeDesc");
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