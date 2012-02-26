package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.ArrayList;
import java.util.List;

public class UbigeosExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UbigeosExample() {
		oredCriteria = new ArrayList<Criteria>();
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andCoddepaIsNull() {
			addCriterion("coddepa is null");
			return (Criteria) this;
		}

		public Criteria andCoddepaIsNotNull() {
			addCriterion("coddepa is not null");
			return (Criteria) this;
		}

		public Criteria andCoddepaEqualTo(String value) {
			addCriterion("coddepa =", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaNotEqualTo(String value) {
			addCriterion("coddepa <>", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaGreaterThan(String value) {
			addCriterion("coddepa >", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaGreaterThanOrEqualTo(String value) {
			addCriterion("coddepa >=", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaLessThan(String value) {
			addCriterion("coddepa <", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaLessThanOrEqualTo(String value) {
			addCriterion("coddepa <=", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaLike(String value) {
			addCriterion("coddepa like", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaNotLike(String value) {
			addCriterion("coddepa not like", value, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaIn(List<String> values) {
			addCriterion("coddepa in", values, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaNotIn(List<String> values) {
			addCriterion("coddepa not in", values, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaBetween(String value1, String value2) {
			addCriterion("coddepa between", value1, value2, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCoddepaNotBetween(String value1, String value2) {
			addCriterion("coddepa not between", value1, value2, "coddepa");
			return (Criteria) this;
		}

		public Criteria andCodprovIsNull() {
			addCriterion("codprov is null");
			return (Criteria) this;
		}

		public Criteria andCodprovIsNotNull() {
			addCriterion("codprov is not null");
			return (Criteria) this;
		}

		public Criteria andCodprovEqualTo(String value) {
			addCriterion("codprov =", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovNotEqualTo(String value) {
			addCriterion("codprov <>", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovGreaterThan(String value) {
			addCriterion("codprov >", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovGreaterThanOrEqualTo(String value) {
			addCriterion("codprov >=", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovLessThan(String value) {
			addCriterion("codprov <", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovLessThanOrEqualTo(String value) {
			addCriterion("codprov <=", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovLike(String value) {
			addCriterion("codprov like", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovNotLike(String value) {
			addCriterion("codprov not like", value, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovIn(List<String> values) {
			addCriterion("codprov in", values, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovNotIn(List<String> values) {
			addCriterion("codprov not in", values, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovBetween(String value1, String value2) {
			addCriterion("codprov between", value1, value2, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodprovNotBetween(String value1, String value2) {
			addCriterion("codprov not between", value1, value2, "codprov");
			return (Criteria) this;
		}

		public Criteria andCodposIsNull() {
			addCriterion("codpos is null");
			return (Criteria) this;
		}

		public Criteria andCodposIsNotNull() {
			addCriterion("codpos is not null");
			return (Criteria) this;
		}

		public Criteria andCodposEqualTo(String value) {
			addCriterion("codpos =", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposNotEqualTo(String value) {
			addCriterion("codpos <>", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposGreaterThan(String value) {
			addCriterion("codpos >", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposGreaterThanOrEqualTo(String value) {
			addCriterion("codpos >=", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposLessThan(String value) {
			addCriterion("codpos <", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposLessThanOrEqualTo(String value) {
			addCriterion("codpos <=", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposLike(String value) {
			addCriterion("codpos like", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposNotLike(String value) {
			addCriterion("codpos not like", value, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposIn(List<String> values) {
			addCriterion("codpos in", values, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposNotIn(List<String> values) {
			addCriterion("codpos not in", values, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposBetween(String value1, String value2) {
			addCriterion("codpos between", value1, value2, "codpos");
			return (Criteria) this;
		}

		public Criteria andCodposNotBetween(String value1, String value2) {
			addCriterion("codpos not between", value1, value2, "codpos");
			return (Criteria) this;
		}

		public Criteria andUbigeoIsNull() {
			addCriterion("ubigeo is null");
			return (Criteria) this;
		}

		public Criteria andUbigeoIsNotNull() {
			addCriterion("ubigeo is not null");
			return (Criteria) this;
		}

		public Criteria andUbigeoEqualTo(String value) {
			addCriterion("ubigeo =", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoNotEqualTo(String value) {
			addCriterion("ubigeo <>", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoGreaterThan(String value) {
			addCriterion("ubigeo >", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoGreaterThanOrEqualTo(String value) {
			addCriterion("ubigeo >=", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoLessThan(String value) {
			addCriterion("ubigeo <", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoLessThanOrEqualTo(String value) {
			addCriterion("ubigeo <=", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoLike(String value) {
			addCriterion("ubigeo like", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoNotLike(String value) {
			addCriterion("ubigeo not like", value, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoIn(List<String> values) {
			addCriterion("ubigeo in", values, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoNotIn(List<String> values) {
			addCriterion("ubigeo not in", values, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoBetween(String value1, String value2) {
			addCriterion("ubigeo between", value1, value2, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andUbigeoNotBetween(String value1, String value2) {
			addCriterion("ubigeo not between", value1, value2, "ubigeo");
			return (Criteria) this;
		}

		public Criteria andDepartamentoIsNull() {
			addCriterion("departamento is null");
			return (Criteria) this;
		}

		public Criteria andDepartamentoIsNotNull() {
			addCriterion("departamento is not null");
			return (Criteria) this;
		}

		public Criteria andDepartamentoEqualTo(String value) {
			addCriterion("departamento =", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoNotEqualTo(String value) {
			addCriterion("departamento <>", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoGreaterThan(String value) {
			addCriterion("departamento >", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoGreaterThanOrEqualTo(String value) {
			addCriterion("departamento >=", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoLessThan(String value) {
			addCriterion("departamento <", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoLessThanOrEqualTo(String value) {
			addCriterion("departamento <=", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoLike(String value) {
			addCriterion("departamento like", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoNotLike(String value) {
			addCriterion("departamento not like", value, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoIn(List<String> values) {
			addCriterion("departamento in", values, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoNotIn(List<String> values) {
			addCriterion("departamento not in", values, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoBetween(String value1, String value2) {
			addCriterion("departamento between", value1, value2, "departamento");
			return (Criteria) this;
		}

		public Criteria andDepartamentoNotBetween(String value1, String value2) {
			addCriterion("departamento not between", value1, value2,
					"departamento");
			return (Criteria) this;
		}

		public Criteria andProvinciaIsNull() {
			addCriterion("provincia is null");
			return (Criteria) this;
		}

		public Criteria andProvinciaIsNotNull() {
			addCriterion("provincia is not null");
			return (Criteria) this;
		}

		public Criteria andProvinciaEqualTo(String value) {
			addCriterion("provincia =", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaNotEqualTo(String value) {
			addCriterion("provincia <>", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaGreaterThan(String value) {
			addCriterion("provincia >", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaGreaterThanOrEqualTo(String value) {
			addCriterion("provincia >=", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaLessThan(String value) {
			addCriterion("provincia <", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaLessThanOrEqualTo(String value) {
			addCriterion("provincia <=", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaLike(String value) {
			addCriterion("provincia like", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaNotLike(String value) {
			addCriterion("provincia not like", value, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaIn(List<String> values) {
			addCriterion("provincia in", values, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaNotIn(List<String> values) {
			addCriterion("provincia not in", values, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaBetween(String value1, String value2) {
			addCriterion("provincia between", value1, value2, "provincia");
			return (Criteria) this;
		}

		public Criteria andProvinciaNotBetween(String value1, String value2) {
			addCriterion("provincia not between", value1, value2, "provincia");
			return (Criteria) this;
		}

		public Criteria andDistritoIsNull() {
			addCriterion("distrito is null");
			return (Criteria) this;
		}

		public Criteria andDistritoIsNotNull() {
			addCriterion("distrito is not null");
			return (Criteria) this;
		}

		public Criteria andDistritoEqualTo(String value) {
			addCriterion("distrito =", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoNotEqualTo(String value) {
			addCriterion("distrito <>", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoGreaterThan(String value) {
			addCriterion("distrito >", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoGreaterThanOrEqualTo(String value) {
			addCriterion("distrito >=", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoLessThan(String value) {
			addCriterion("distrito <", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoLessThanOrEqualTo(String value) {
			addCriterion("distrito <=", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoLike(String value) {
			addCriterion("distrito like", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoNotLike(String value) {
			addCriterion("distrito not like", value, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoIn(List<String> values) {
			addCriterion("distrito in", values, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoNotIn(List<String> values) {
			addCriterion("distrito not in", values, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoBetween(String value1, String value2) {
			addCriterion("distrito between", value1, value2, "distrito");
			return (Criteria) this;
		}

		public Criteria andDistritoNotBetween(String value1, String value2) {
			addCriterion("distrito not between", value1, value2, "distrito");
			return (Criteria) this;
		}

		public Criteria andNombreIsNull() {
			addCriterion("nombre is null");
			return (Criteria) this;
		}

		public Criteria andNombreIsNotNull() {
			addCriterion("nombre is not null");
			return (Criteria) this;
		}

		public Criteria andNombreEqualTo(String value) {
			addCriterion("nombre =", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotEqualTo(String value) {
			addCriterion("nombre <>", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreGreaterThan(String value) {
			addCriterion("nombre >", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreGreaterThanOrEqualTo(String value) {
			addCriterion("nombre >=", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreLessThan(String value) {
			addCriterion("nombre <", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreLessThanOrEqualTo(String value) {
			addCriterion("nombre <=", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreLike(String value) {
			addCriterion("nombre like", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotLike(String value) {
			addCriterion("nombre not like", value, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreIn(List<String> values) {
			addCriterion("nombre in", values, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotIn(List<String> values) {
			addCriterion("nombre not in", values, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreBetween(String value1, String value2) {
			addCriterion("nombre between", value1, value2, "nombre");
			return (Criteria) this;
		}

		public Criteria andNombreNotBetween(String value1, String value2) {
			addCriterion("nombre not between", value1, value2, "nombre");
			return (Criteria) this;
		}

		public Criteria andFlagprovIsNull() {
			addCriterion("flagprov is null");
			return (Criteria) this;
		}

		public Criteria andFlagprovIsNotNull() {
			addCriterion("flagprov is not null");
			return (Criteria) this;
		}

		public Criteria andFlagprovEqualTo(Short value) {
			addCriterion("flagprov =", value, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovNotEqualTo(Short value) {
			addCriterion("flagprov <>", value, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovGreaterThan(Short value) {
			addCriterion("flagprov >", value, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovGreaterThanOrEqualTo(Short value) {
			addCriterion("flagprov >=", value, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovLessThan(Short value) {
			addCriterion("flagprov <", value, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovLessThanOrEqualTo(Short value) {
			addCriterion("flagprov <=", value, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovIn(List<Short> values) {
			addCriterion("flagprov in", values, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovNotIn(List<Short> values) {
			addCriterion("flagprov not in", values, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovBetween(Short value1, Short value2) {
			addCriterion("flagprov between", value1, value2, "flagprov");
			return (Criteria) this;
		}

		public Criteria andFlagprovNotBetween(Short value1, Short value2) {
			addCriterion("flagprov not between", value1, value2, "flagprov");
			return (Criteria) this;
		}

		public Criteria andCodpostalIsNull() {
			addCriterion("codpostal is null");
			return (Criteria) this;
		}

		public Criteria andCodpostalIsNotNull() {
			addCriterion("codpostal is not null");
			return (Criteria) this;
		}

		public Criteria andCodpostalEqualTo(String value) {
			addCriterion("codpostal =", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalNotEqualTo(String value) {
			addCriterion("codpostal <>", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalGreaterThan(String value) {
			addCriterion("codpostal >", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalGreaterThanOrEqualTo(String value) {
			addCriterion("codpostal >=", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalLessThan(String value) {
			addCriterion("codpostal <", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalLessThanOrEqualTo(String value) {
			addCriterion("codpostal <=", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalLike(String value) {
			addCriterion("codpostal like", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalNotLike(String value) {
			addCriterion("codpostal not like", value, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalIn(List<String> values) {
			addCriterion("codpostal in", values, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalNotIn(List<String> values) {
			addCriterion("codpostal not in", values, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalBetween(String value1, String value2) {
			addCriterion("codpostal between", value1, value2, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodpostalNotBetween(String value1, String value2) {
			addCriterion("codpostal not between", value1, value2, "codpostal");
			return (Criteria) this;
		}

		public Criteria andCodzonaIsNull() {
			addCriterion("codzona is null");
			return (Criteria) this;
		}

		public Criteria andCodzonaIsNotNull() {
			addCriterion("codzona is not null");
			return (Criteria) this;
		}

		public Criteria andCodzonaEqualTo(String value) {
			addCriterion("codzona =", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaNotEqualTo(String value) {
			addCriterion("codzona <>", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaGreaterThan(String value) {
			addCriterion("codzona >", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaGreaterThanOrEqualTo(String value) {
			addCriterion("codzona >=", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaLessThan(String value) {
			addCriterion("codzona <", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaLessThanOrEqualTo(String value) {
			addCriterion("codzona <=", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaLike(String value) {
			addCriterion("codzona like", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaNotLike(String value) {
			addCriterion("codzona not like", value, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaIn(List<String> values) {
			addCriterion("codzona in", values, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaNotIn(List<String> values) {
			addCriterion("codzona not in", values, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaBetween(String value1, String value2) {
			addCriterion("codzona between", value1, value2, "codzona");
			return (Criteria) this;
		}

		public Criteria andCodzonaNotBetween(String value1, String value2) {
			addCriterion("codzona not between", value1, value2, "codzona");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UbigeosExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andCoddepaIsNull() {
            addCriterion("coddepa is null");
            return (Criteria) this;
        }

        public Criteria andCoddepaIsNotNull() {
            addCriterion("coddepa is not null");
            return (Criteria) this;
        }

        public Criteria andCoddepaEqualTo(String value) {
            addCriterion("coddepa =", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaNotEqualTo(String value) {
            addCriterion("coddepa <>", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaGreaterThan(String value) {
            addCriterion("coddepa >", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaGreaterThanOrEqualTo(String value) {
            addCriterion("coddepa >=", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaLessThan(String value) {
            addCriterion("coddepa <", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaLessThanOrEqualTo(String value) {
            addCriterion("coddepa <=", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaLike(String value) {
            addCriterion("coddepa like", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaNotLike(String value) {
            addCriterion("coddepa not like", value, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaIn(List<String> values) {
            addCriterion("coddepa in", values, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaNotIn(List<String> values) {
            addCriterion("coddepa not in", values, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaBetween(String value1, String value2) {
            addCriterion("coddepa between", value1, value2, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCoddepaNotBetween(String value1, String value2) {
            addCriterion("coddepa not between", value1, value2, "coddepa");
            return (Criteria) this;
        }

        public Criteria andCodprovIsNull() {
            addCriterion("codprov is null");
            return (Criteria) this;
        }

        public Criteria andCodprovIsNotNull() {
            addCriterion("codprov is not null");
            return (Criteria) this;
        }

        public Criteria andCodprovEqualTo(String value) {
            addCriterion("codprov =", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovNotEqualTo(String value) {
            addCriterion("codprov <>", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovGreaterThan(String value) {
            addCriterion("codprov >", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovGreaterThanOrEqualTo(String value) {
            addCriterion("codprov >=", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovLessThan(String value) {
            addCriterion("codprov <", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovLessThanOrEqualTo(String value) {
            addCriterion("codprov <=", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovLike(String value) {
            addCriterion("codprov like", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovNotLike(String value) {
            addCriterion("codprov not like", value, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovIn(List<String> values) {
            addCriterion("codprov in", values, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovNotIn(List<String> values) {
            addCriterion("codprov not in", values, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovBetween(String value1, String value2) {
            addCriterion("codprov between", value1, value2, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodprovNotBetween(String value1, String value2) {
            addCriterion("codprov not between", value1, value2, "codprov");
            return (Criteria) this;
        }

        public Criteria andCodposIsNull() {
            addCriterion("codpos is null");
            return (Criteria) this;
        }

        public Criteria andCodposIsNotNull() {
            addCriterion("codpos is not null");
            return (Criteria) this;
        }

        public Criteria andCodposEqualTo(String value) {
            addCriterion("codpos =", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposNotEqualTo(String value) {
            addCriterion("codpos <>", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposGreaterThan(String value) {
            addCriterion("codpos >", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposGreaterThanOrEqualTo(String value) {
            addCriterion("codpos >=", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposLessThan(String value) {
            addCriterion("codpos <", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposLessThanOrEqualTo(String value) {
            addCriterion("codpos <=", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposLike(String value) {
            addCriterion("codpos like", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposNotLike(String value) {
            addCriterion("codpos not like", value, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposIn(List<String> values) {
            addCriterion("codpos in", values, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposNotIn(List<String> values) {
            addCriterion("codpos not in", values, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposBetween(String value1, String value2) {
            addCriterion("codpos between", value1, value2, "codpos");
            return (Criteria) this;
        }

        public Criteria andCodposNotBetween(String value1, String value2) {
            addCriterion("codpos not between", value1, value2, "codpos");
            return (Criteria) this;
        }

        public Criteria andUbigeoIsNull() {
            addCriterion("ubigeo is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoIsNotNull() {
            addCriterion("ubigeo is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoEqualTo(String value) {
            addCriterion("ubigeo =", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoNotEqualTo(String value) {
            addCriterion("ubigeo <>", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoGreaterThan(String value) {
            addCriterion("ubigeo >", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeo >=", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoLessThan(String value) {
            addCriterion("ubigeo <", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoLessThanOrEqualTo(String value) {
            addCriterion("ubigeo <=", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoLike(String value) {
            addCriterion("ubigeo like", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoNotLike(String value) {
            addCriterion("ubigeo not like", value, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoIn(List<String> values) {
            addCriterion("ubigeo in", values, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoNotIn(List<String> values) {
            addCriterion("ubigeo not in", values, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoBetween(String value1, String value2) {
            addCriterion("ubigeo between", value1, value2, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andUbigeoNotBetween(String value1, String value2) {
            addCriterion("ubigeo not between", value1, value2, "ubigeo");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIsNull() {
            addCriterion("departamento is null");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIsNotNull() {
            addCriterion("departamento is not null");
            return (Criteria) this;
        }

        public Criteria andDepartamentoEqualTo(String value) {
            addCriterion("departamento =", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotEqualTo(String value) {
            addCriterion("departamento <>", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoGreaterThan(String value) {
            addCriterion("departamento >", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("departamento >=", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLessThan(String value) {
            addCriterion("departamento <", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("departamento <=", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoLike(String value) {
            addCriterion("departamento like", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotLike(String value) {
            addCriterion("departamento not like", value, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoIn(List<String> values) {
            addCriterion("departamento in", values, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotIn(List<String> values) {
            addCriterion("departamento not in", values, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoBetween(String value1, String value2) {
            addCriterion("departamento between", value1, value2, "departamento");
            return (Criteria) this;
        }

        public Criteria andDepartamentoNotBetween(String value1, String value2) {
            addCriterion("departamento not between", value1, value2, "departamento");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNull() {
            addCriterion("provincia is null");
            return (Criteria) this;
        }

        public Criteria andProvinciaIsNotNull() {
            addCriterion("provincia is not null");
            return (Criteria) this;
        }

        public Criteria andProvinciaEqualTo(String value) {
            addCriterion("provincia =", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotEqualTo(String value) {
            addCriterion("provincia <>", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThan(String value) {
            addCriterion("provincia >", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("provincia >=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThan(String value) {
            addCriterion("provincia <", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLessThanOrEqualTo(String value) {
            addCriterion("provincia <=", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaLike(String value) {
            addCriterion("provincia like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotLike(String value) {
            addCriterion("provincia not like", value, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaIn(List<String> values) {
            addCriterion("provincia in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotIn(List<String> values) {
            addCriterion("provincia not in", values, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaBetween(String value1, String value2) {
            addCriterion("provincia between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andProvinciaNotBetween(String value1, String value2) {
            addCriterion("provincia not between", value1, value2, "provincia");
            return (Criteria) this;
        }

        public Criteria andDistritoIsNull() {
            addCriterion("distrito is null");
            return (Criteria) this;
        }

        public Criteria andDistritoIsNotNull() {
            addCriterion("distrito is not null");
            return (Criteria) this;
        }

        public Criteria andDistritoEqualTo(String value) {
            addCriterion("distrito =", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotEqualTo(String value) {
            addCriterion("distrito <>", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoGreaterThan(String value) {
            addCriterion("distrito >", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("distrito >=", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLessThan(String value) {
            addCriterion("distrito <", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLessThanOrEqualTo(String value) {
            addCriterion("distrito <=", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoLike(String value) {
            addCriterion("distrito like", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotLike(String value) {
            addCriterion("distrito not like", value, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoIn(List<String> values) {
            addCriterion("distrito in", values, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotIn(List<String> values) {
            addCriterion("distrito not in", values, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoBetween(String value1, String value2) {
            addCriterion("distrito between", value1, value2, "distrito");
            return (Criteria) this;
        }

        public Criteria andDistritoNotBetween(String value1, String value2) {
            addCriterion("distrito not between", value1, value2, "distrito");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andFlagprovIsNull() {
            addCriterion("flagprov is null");
            return (Criteria) this;
        }

        public Criteria andFlagprovIsNotNull() {
            addCriterion("flagprov is not null");
            return (Criteria) this;
        }

        public Criteria andFlagprovEqualTo(Short value) {
            addCriterion("flagprov =", value, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovNotEqualTo(Short value) {
            addCriterion("flagprov <>", value, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovGreaterThan(Short value) {
            addCriterion("flagprov >", value, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovGreaterThanOrEqualTo(Short value) {
            addCriterion("flagprov >=", value, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovLessThan(Short value) {
            addCriterion("flagprov <", value, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovLessThanOrEqualTo(Short value) {
            addCriterion("flagprov <=", value, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovIn(List<Short> values) {
            addCriterion("flagprov in", values, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovNotIn(List<Short> values) {
            addCriterion("flagprov not in", values, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovBetween(Short value1, Short value2) {
            addCriterion("flagprov between", value1, value2, "flagprov");
            return (Criteria) this;
        }

        public Criteria andFlagprovNotBetween(Short value1, Short value2) {
            addCriterion("flagprov not between", value1, value2, "flagprov");
            return (Criteria) this;
        }

        public Criteria andCodpostalIsNull() {
            addCriterion("codpostal is null");
            return (Criteria) this;
        }

        public Criteria andCodpostalIsNotNull() {
            addCriterion("codpostal is not null");
            return (Criteria) this;
        }

        public Criteria andCodpostalEqualTo(String value) {
            addCriterion("codpostal =", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalNotEqualTo(String value) {
            addCriterion("codpostal <>", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalGreaterThan(String value) {
            addCriterion("codpostal >", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalGreaterThanOrEqualTo(String value) {
            addCriterion("codpostal >=", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalLessThan(String value) {
            addCriterion("codpostal <", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalLessThanOrEqualTo(String value) {
            addCriterion("codpostal <=", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalLike(String value) {
            addCriterion("codpostal like", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalNotLike(String value) {
            addCriterion("codpostal not like", value, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalIn(List<String> values) {
            addCriterion("codpostal in", values, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalNotIn(List<String> values) {
            addCriterion("codpostal not in", values, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalBetween(String value1, String value2) {
            addCriterion("codpostal between", value1, value2, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodpostalNotBetween(String value1, String value2) {
            addCriterion("codpostal not between", value1, value2, "codpostal");
            return (Criteria) this;
        }

        public Criteria andCodzonaIsNull() {
            addCriterion("codzona is null");
            return (Criteria) this;
        }

        public Criteria andCodzonaIsNotNull() {
            addCriterion("codzona is not null");
            return (Criteria) this;
        }

        public Criteria andCodzonaEqualTo(String value) {
            addCriterion("codzona =", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaNotEqualTo(String value) {
            addCriterion("codzona <>", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaGreaterThan(String value) {
            addCriterion("codzona >", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaGreaterThanOrEqualTo(String value) {
            addCriterion("codzona >=", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaLessThan(String value) {
            addCriterion("codzona <", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaLessThanOrEqualTo(String value) {
            addCriterion("codzona <=", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaLike(String value) {
            addCriterion("codzona like", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaNotLike(String value) {
            addCriterion("codzona not like", value, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaIn(List<String> values) {
            addCriterion("codzona in", values, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaNotIn(List<String> values) {
            addCriterion("codzona not in", values, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaBetween(String value1, String value2) {
            addCriterion("codzona between", value1, value2, "codzona");
            return (Criteria) this;
        }

        public Criteria andCodzonaNotBetween(String value1, String value2) {
            addCriterion("codzona not between", value1, value2, "codzona");
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