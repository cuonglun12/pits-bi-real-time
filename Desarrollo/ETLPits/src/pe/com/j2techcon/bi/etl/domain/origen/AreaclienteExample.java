package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaclienteExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public AreaclienteExample() {
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

		public Criteria andCodareaclienteIsNull() {
			addCriterion("codareacliente is null");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteIsNotNull() {
			addCriterion("codareacliente is not null");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteEqualTo(String value) {
			addCriterion("codareacliente =", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteNotEqualTo(String value) {
			addCriterion("codareacliente <>", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteGreaterThan(String value) {
			addCriterion("codareacliente >", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteGreaterThanOrEqualTo(String value) {
			addCriterion("codareacliente >=", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteLessThan(String value) {
			addCriterion("codareacliente <", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteLessThanOrEqualTo(String value) {
			addCriterion("codareacliente <=", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteLike(String value) {
			addCriterion("codareacliente like", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteNotLike(String value) {
			addCriterion("codareacliente not like", value, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteIn(List<String> values) {
			addCriterion("codareacliente in", values, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteNotIn(List<String> values) {
			addCriterion("codareacliente not in", values, "codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteBetween(String value1, String value2) {
			addCriterion("codareacliente between", value1, value2,
					"codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodareaclienteNotBetween(String value1, String value2) {
			addCriterion("codareacliente not between", value1, value2,
					"codareacliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteIsNull() {
			addCriterion("codcliente is null");
			return (Criteria) this;
		}

		public Criteria andCodclienteIsNotNull() {
			addCriterion("codcliente is not null");
			return (Criteria) this;
		}

		public Criteria andCodclienteEqualTo(String value) {
			addCriterion("codcliente =", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteNotEqualTo(String value) {
			addCriterion("codcliente <>", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteGreaterThan(String value) {
			addCriterion("codcliente >", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteGreaterThanOrEqualTo(String value) {
			addCriterion("codcliente >=", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteLessThan(String value) {
			addCriterion("codcliente <", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteLessThanOrEqualTo(String value) {
			addCriterion("codcliente <=", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteLike(String value) {
			addCriterion("codcliente like", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteNotLike(String value) {
			addCriterion("codcliente not like", value, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteIn(List<String> values) {
			addCriterion("codcliente in", values, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteNotIn(List<String> values) {
			addCriterion("codcliente not in", values, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteBetween(String value1, String value2) {
			addCriterion("codcliente between", value1, value2, "codcliente");
			return (Criteria) this;
		}

		public Criteria andCodclienteNotBetween(String value1, String value2) {
			addCriterion("codcliente not between", value1, value2, "codcliente");
			return (Criteria) this;
		}

		public Criteria andRucIsNull() {
			addCriterion("ruc is null");
			return (Criteria) this;
		}

		public Criteria andRucIsNotNull() {
			addCriterion("ruc is not null");
			return (Criteria) this;
		}

		public Criteria andRucEqualTo(String value) {
			addCriterion("ruc =", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucNotEqualTo(String value) {
			addCriterion("ruc <>", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucGreaterThan(String value) {
			addCriterion("ruc >", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucGreaterThanOrEqualTo(String value) {
			addCriterion("ruc >=", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucLessThan(String value) {
			addCriterion("ruc <", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucLessThanOrEqualTo(String value) {
			addCriterion("ruc <=", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucLike(String value) {
			addCriterion("ruc like", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucNotLike(String value) {
			addCriterion("ruc not like", value, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucIn(List<String> values) {
			addCriterion("ruc in", values, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucNotIn(List<String> values) {
			addCriterion("ruc not in", values, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucBetween(String value1, String value2) {
			addCriterion("ruc between", value1, value2, "ruc");
			return (Criteria) this;
		}

		public Criteria andRucNotBetween(String value1, String value2) {
			addCriterion("ruc not between", value1, value2, "ruc");
			return (Criteria) this;
		}

		public Criteria andAreaclienteIsNull() {
			addCriterion("areacliente is null");
			return (Criteria) this;
		}

		public Criteria andAreaclienteIsNotNull() {
			addCriterion("areacliente is not null");
			return (Criteria) this;
		}

		public Criteria andAreaclienteEqualTo(String value) {
			addCriterion("areacliente =", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteNotEqualTo(String value) {
			addCriterion("areacliente <>", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteGreaterThan(String value) {
			addCriterion("areacliente >", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteGreaterThanOrEqualTo(String value) {
			addCriterion("areacliente >=", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteLessThan(String value) {
			addCriterion("areacliente <", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteLessThanOrEqualTo(String value) {
			addCriterion("areacliente <=", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteLike(String value) {
			addCriterion("areacliente like", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteNotLike(String value) {
			addCriterion("areacliente not like", value, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteIn(List<String> values) {
			addCriterion("areacliente in", values, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteNotIn(List<String> values) {
			addCriterion("areacliente not in", values, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteBetween(String value1, String value2) {
			addCriterion("areacliente between", value1, value2, "areacliente");
			return (Criteria) this;
		}

		public Criteria andAreaclienteNotBetween(String value1, String value2) {
			addCriterion("areacliente not between", value1, value2,
					"areacliente");
			return (Criteria) this;
		}

		public Criteria andDireccionIsNull() {
			addCriterion("direccion is null");
			return (Criteria) this;
		}

		public Criteria andDireccionIsNotNull() {
			addCriterion("direccion is not null");
			return (Criteria) this;
		}

		public Criteria andDireccionEqualTo(String value) {
			addCriterion("direccion =", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionNotEqualTo(String value) {
			addCriterion("direccion <>", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionGreaterThan(String value) {
			addCriterion("direccion >", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionGreaterThanOrEqualTo(String value) {
			addCriterion("direccion >=", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionLessThan(String value) {
			addCriterion("direccion <", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionLessThanOrEqualTo(String value) {
			addCriterion("direccion <=", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionLike(String value) {
			addCriterion("direccion like", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionNotLike(String value) {
			addCriterion("direccion not like", value, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionIn(List<String> values) {
			addCriterion("direccion in", values, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionNotIn(List<String> values) {
			addCriterion("direccion not in", values, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionBetween(String value1, String value2) {
			addCriterion("direccion between", value1, value2, "direccion");
			return (Criteria) this;
		}

		public Criteria andDireccionNotBetween(String value1, String value2) {
			addCriterion("direccion not between", value1, value2, "direccion");
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

		public Criteria andCodpaisIsNull() {
			addCriterion("codpais is null");
			return (Criteria) this;
		}

		public Criteria andCodpaisIsNotNull() {
			addCriterion("codpais is not null");
			return (Criteria) this;
		}

		public Criteria andCodpaisEqualTo(String value) {
			addCriterion("codpais =", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisNotEqualTo(String value) {
			addCriterion("codpais <>", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisGreaterThan(String value) {
			addCriterion("codpais >", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisGreaterThanOrEqualTo(String value) {
			addCriterion("codpais >=", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisLessThan(String value) {
			addCriterion("codpais <", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisLessThanOrEqualTo(String value) {
			addCriterion("codpais <=", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisLike(String value) {
			addCriterion("codpais like", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisNotLike(String value) {
			addCriterion("codpais not like", value, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisIn(List<String> values) {
			addCriterion("codpais in", values, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisNotIn(List<String> values) {
			addCriterion("codpais not in", values, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisBetween(String value1, String value2) {
			addCriterion("codpais between", value1, value2, "codpais");
			return (Criteria) this;
		}

		public Criteria andCodpaisNotBetween(String value1, String value2) {
			addCriterion("codpais not between", value1, value2, "codpais");
			return (Criteria) this;
		}

		public Criteria andTelefonoIsNull() {
			addCriterion("telefono is null");
			return (Criteria) this;
		}

		public Criteria andTelefonoIsNotNull() {
			addCriterion("telefono is not null");
			return (Criteria) this;
		}

		public Criteria andTelefonoEqualTo(String value) {
			addCriterion("telefono =", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoNotEqualTo(String value) {
			addCriterion("telefono <>", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoGreaterThan(String value) {
			addCriterion("telefono >", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
			addCriterion("telefono >=", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoLessThan(String value) {
			addCriterion("telefono <", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoLessThanOrEqualTo(String value) {
			addCriterion("telefono <=", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoLike(String value) {
			addCriterion("telefono like", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoNotLike(String value) {
			addCriterion("telefono not like", value, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoIn(List<String> values) {
			addCriterion("telefono in", values, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoNotIn(List<String> values) {
			addCriterion("telefono not in", values, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoBetween(String value1, String value2) {
			addCriterion("telefono between", value1, value2, "telefono");
			return (Criteria) this;
		}

		public Criteria andTelefonoNotBetween(String value1, String value2) {
			addCriterion("telefono not between", value1, value2, "telefono");
			return (Criteria) this;
		}

		public Criteria andMovilIsNull() {
			addCriterion("movil is null");
			return (Criteria) this;
		}

		public Criteria andMovilIsNotNull() {
			addCriterion("movil is not null");
			return (Criteria) this;
		}

		public Criteria andMovilEqualTo(String value) {
			addCriterion("movil =", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilNotEqualTo(String value) {
			addCriterion("movil <>", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilGreaterThan(String value) {
			addCriterion("movil >", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilGreaterThanOrEqualTo(String value) {
			addCriterion("movil >=", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilLessThan(String value) {
			addCriterion("movil <", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilLessThanOrEqualTo(String value) {
			addCriterion("movil <=", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilLike(String value) {
			addCriterion("movil like", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilNotLike(String value) {
			addCriterion("movil not like", value, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilIn(List<String> values) {
			addCriterion("movil in", values, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilNotIn(List<String> values) {
			addCriterion("movil not in", values, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilBetween(String value1, String value2) {
			addCriterion("movil between", value1, value2, "movil");
			return (Criteria) this;
		}

		public Criteria andMovilNotBetween(String value1, String value2) {
			addCriterion("movil not between", value1, value2, "movil");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaIsNull() {
			addCriterion("codejecutiva is null");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaIsNotNull() {
			addCriterion("codejecutiva is not null");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaEqualTo(String value) {
			addCriterion("codejecutiva =", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaNotEqualTo(String value) {
			addCriterion("codejecutiva <>", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaGreaterThan(String value) {
			addCriterion("codejecutiva >", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaGreaterThanOrEqualTo(String value) {
			addCriterion("codejecutiva >=", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaLessThan(String value) {
			addCriterion("codejecutiva <", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaLessThanOrEqualTo(String value) {
			addCriterion("codejecutiva <=", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaLike(String value) {
			addCriterion("codejecutiva like", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaNotLike(String value) {
			addCriterion("codejecutiva not like", value, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaIn(List<String> values) {
			addCriterion("codejecutiva in", values, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaNotIn(List<String> values) {
			addCriterion("codejecutiva not in", values, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaBetween(String value1, String value2) {
			addCriterion("codejecutiva between", value1, value2, "codejecutiva");
			return (Criteria) this;
		}

		public Criteria andCodejecutivaNotBetween(String value1, String value2) {
			addCriterion("codejecutiva not between", value1, value2,
					"codejecutiva");
			return (Criteria) this;
		}

		public Criteria andObservacionIsNull() {
			addCriterion("observacion is null");
			return (Criteria) this;
		}

		public Criteria andObservacionIsNotNull() {
			addCriterion("observacion is not null");
			return (Criteria) this;
		}

		public Criteria andObservacionEqualTo(String value) {
			addCriterion("observacion =", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotEqualTo(String value) {
			addCriterion("observacion <>", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionGreaterThan(String value) {
			addCriterion("observacion >", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionGreaterThanOrEqualTo(String value) {
			addCriterion("observacion >=", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionLessThan(String value) {
			addCriterion("observacion <", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionLessThanOrEqualTo(String value) {
			addCriterion("observacion <=", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionLike(String value) {
			addCriterion("observacion like", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotLike(String value) {
			addCriterion("observacion not like", value, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionIn(List<String> values) {
			addCriterion("observacion in", values, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotIn(List<String> values) {
			addCriterion("observacion not in", values, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionBetween(String value1, String value2) {
			addCriterion("observacion between", value1, value2, "observacion");
			return (Criteria) this;
		}

		public Criteria andObservacionNotBetween(String value1, String value2) {
			addCriterion("observacion not between", value1, value2,
					"observacion");
			return (Criteria) this;
		}

		public Criteria andUsuarioIsNull() {
			addCriterion("usuario is null");
			return (Criteria) this;
		}

		public Criteria andUsuarioIsNotNull() {
			addCriterion("usuario is not null");
			return (Criteria) this;
		}

		public Criteria andUsuarioEqualTo(String value) {
			addCriterion("usuario =", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioNotEqualTo(String value) {
			addCriterion("usuario <>", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioGreaterThan(String value) {
			addCriterion("usuario >", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioGreaterThanOrEqualTo(String value) {
			addCriterion("usuario >=", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioLessThan(String value) {
			addCriterion("usuario <", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioLessThanOrEqualTo(String value) {
			addCriterion("usuario <=", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioLike(String value) {
			addCriterion("usuario like", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioNotLike(String value) {
			addCriterion("usuario not like", value, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioIn(List<String> values) {
			addCriterion("usuario in", values, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioNotIn(List<String> values) {
			addCriterion("usuario not in", values, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioBetween(String value1, String value2) {
			addCriterion("usuario between", value1, value2, "usuario");
			return (Criteria) this;
		}

		public Criteria andUsuarioNotBetween(String value1, String value2) {
			addCriterion("usuario not between", value1, value2, "usuario");
			return (Criteria) this;
		}

		public Criteria andFechaIsNull() {
			addCriterion("fecha is null");
			return (Criteria) this;
		}

		public Criteria andFechaIsNotNull() {
			addCriterion("fecha is not null");
			return (Criteria) this;
		}

		public Criteria andFechaEqualTo(Date value) {
			addCriterion("fecha =", value, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaNotEqualTo(Date value) {
			addCriterion("fecha <>", value, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaGreaterThan(Date value) {
			addCriterion("fecha >", value, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha >=", value, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaLessThan(Date value) {
			addCriterion("fecha <", value, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaLessThanOrEqualTo(Date value) {
			addCriterion("fecha <=", value, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaIn(List<Date> values) {
			addCriterion("fecha in", values, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaNotIn(List<Date> values) {
			addCriterion("fecha not in", values, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaBetween(Date value1, Date value2) {
			addCriterion("fecha between", value1, value2, "fecha");
			return (Criteria) this;
		}

		public Criteria andFechaNotBetween(Date value1, Date value2) {
			addCriterion("fecha not between", value1, value2, "fecha");
			return (Criteria) this;
		}

		public Criteria andUsuariomodIsNull() {
			addCriterion("usuariomod is null");
			return (Criteria) this;
		}

		public Criteria andUsuariomodIsNotNull() {
			addCriterion("usuariomod is not null");
			return (Criteria) this;
		}

		public Criteria andUsuariomodEqualTo(String value) {
			addCriterion("usuariomod =", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodNotEqualTo(String value) {
			addCriterion("usuariomod <>", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodGreaterThan(String value) {
			addCriterion("usuariomod >", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodGreaterThanOrEqualTo(String value) {
			addCriterion("usuariomod >=", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodLessThan(String value) {
			addCriterion("usuariomod <", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodLessThanOrEqualTo(String value) {
			addCriterion("usuariomod <=", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodLike(String value) {
			addCriterion("usuariomod like", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodNotLike(String value) {
			addCriterion("usuariomod not like", value, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodIn(List<String> values) {
			addCriterion("usuariomod in", values, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodNotIn(List<String> values) {
			addCriterion("usuariomod not in", values, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodBetween(String value1, String value2) {
			addCriterion("usuariomod between", value1, value2, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andUsuariomodNotBetween(String value1, String value2) {
			addCriterion("usuariomod not between", value1, value2, "usuariomod");
			return (Criteria) this;
		}

		public Criteria andFechamodIsNull() {
			addCriterion("fechamod is null");
			return (Criteria) this;
		}

		public Criteria andFechamodIsNotNull() {
			addCriterion("fechamod is not null");
			return (Criteria) this;
		}

		public Criteria andFechamodEqualTo(Date value) {
			addCriterion("fechamod =", value, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodNotEqualTo(Date value) {
			addCriterion("fechamod <>", value, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodGreaterThan(Date value) {
			addCriterion("fechamod >", value, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodGreaterThanOrEqualTo(Date value) {
			addCriterion("fechamod >=", value, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodLessThan(Date value) {
			addCriterion("fechamod <", value, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodLessThanOrEqualTo(Date value) {
			addCriterion("fechamod <=", value, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodIn(List<Date> values) {
			addCriterion("fechamod in", values, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodNotIn(List<Date> values) {
			addCriterion("fechamod not in", values, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodBetween(Date value1, Date value2) {
			addCriterion("fechamod between", value1, value2, "fechamod");
			return (Criteria) this;
		}

		public Criteria andFechamodNotBetween(Date value1, Date value2) {
			addCriterion("fechamod not between", value1, value2, "fechamod");
			return (Criteria) this;
		}

		public Criteria andEstadoIsNull() {
			addCriterion("estado is null");
			return (Criteria) this;
		}

		public Criteria andEstadoIsNotNull() {
			addCriterion("estado is not null");
			return (Criteria) this;
		}

		public Criteria andEstadoEqualTo(Short value) {
			addCriterion("estado =", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoNotEqualTo(Short value) {
			addCriterion("estado <>", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoGreaterThan(Short value) {
			addCriterion("estado >", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoGreaterThanOrEqualTo(Short value) {
			addCriterion("estado >=", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoLessThan(Short value) {
			addCriterion("estado <", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoLessThanOrEqualTo(Short value) {
			addCriterion("estado <=", value, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoIn(List<Short> values) {
			addCriterion("estado in", values, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoNotIn(List<Short> values) {
			addCriterion("estado not in", values, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoBetween(Short value1, Short value2) {
			addCriterion("estado between", value1, value2, "estado");
			return (Criteria) this;
		}

		public Criteria andEstadoNotBetween(Short value1, Short value2) {
			addCriterion("estado not between", value1, value2, "estado");
			return (Criteria) this;
		}

		public Criteria andContactoIsNull() {
			addCriterion("contacto is null");
			return (Criteria) this;
		}

		public Criteria andContactoIsNotNull() {
			addCriterion("contacto is not null");
			return (Criteria) this;
		}

		public Criteria andContactoEqualTo(String value) {
			addCriterion("contacto =", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoNotEqualTo(String value) {
			addCriterion("contacto <>", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoGreaterThan(String value) {
			addCriterion("contacto >", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoGreaterThanOrEqualTo(String value) {
			addCriterion("contacto >=", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoLessThan(String value) {
			addCriterion("contacto <", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoLessThanOrEqualTo(String value) {
			addCriterion("contacto <=", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoLike(String value) {
			addCriterion("contacto like", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoNotLike(String value) {
			addCriterion("contacto not like", value, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoIn(List<String> values) {
			addCriterion("contacto in", values, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoNotIn(List<String> values) {
			addCriterion("contacto not in", values, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoBetween(String value1, String value2) {
			addCriterion("contacto between", value1, value2, "contacto");
			return (Criteria) this;
		}

		public Criteria andContactoNotBetween(String value1, String value2) {
			addCriterion("contacto not between", value1, value2, "contacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoIsNull() {
			addCriterion("areacontacto is null");
			return (Criteria) this;
		}

		public Criteria andAreacontactoIsNotNull() {
			addCriterion("areacontacto is not null");
			return (Criteria) this;
		}

		public Criteria andAreacontactoEqualTo(String value) {
			addCriterion("areacontacto =", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoNotEqualTo(String value) {
			addCriterion("areacontacto <>", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoGreaterThan(String value) {
			addCriterion("areacontacto >", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoGreaterThanOrEqualTo(String value) {
			addCriterion("areacontacto >=", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoLessThan(String value) {
			addCriterion("areacontacto <", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoLessThanOrEqualTo(String value) {
			addCriterion("areacontacto <=", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoLike(String value) {
			addCriterion("areacontacto like", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoNotLike(String value) {
			addCriterion("areacontacto not like", value, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoIn(List<String> values) {
			addCriterion("areacontacto in", values, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoNotIn(List<String> values) {
			addCriterion("areacontacto not in", values, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoBetween(String value1, String value2) {
			addCriterion("areacontacto between", value1, value2, "areacontacto");
			return (Criteria) this;
		}

		public Criteria andAreacontactoNotBetween(String value1, String value2) {
			addCriterion("areacontacto not between", value1, value2,
					"areacontacto");
			return (Criteria) this;
		}

		public Criteria andPreordenIsNull() {
			addCriterion("preorden is null");
			return (Criteria) this;
		}

		public Criteria andPreordenIsNotNull() {
			addCriterion("preorden is not null");
			return (Criteria) this;
		}

		public Criteria andPreordenEqualTo(String value) {
			addCriterion("preorden =", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenNotEqualTo(String value) {
			addCriterion("preorden <>", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenGreaterThan(String value) {
			addCriterion("preorden >", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenGreaterThanOrEqualTo(String value) {
			addCriterion("preorden >=", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenLessThan(String value) {
			addCriterion("preorden <", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenLessThanOrEqualTo(String value) {
			addCriterion("preorden <=", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenLike(String value) {
			addCriterion("preorden like", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenNotLike(String value) {
			addCriterion("preorden not like", value, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenIn(List<String> values) {
			addCriterion("preorden in", values, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenNotIn(List<String> values) {
			addCriterion("preorden not in", values, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenBetween(String value1, String value2) {
			addCriterion("preorden between", value1, value2, "preorden");
			return (Criteria) this;
		}

		public Criteria andPreordenNotBetween(String value1, String value2) {
			addCriterion("preorden not between", value1, value2, "preorden");
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

    public AreaclienteExample() {
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

        public Criteria andCodareaclienteIsNull() {
            addCriterion("codareacliente is null");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteIsNotNull() {
            addCriterion("codareacliente is not null");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteEqualTo(String value) {
            addCriterion("codareacliente =", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteNotEqualTo(String value) {
            addCriterion("codareacliente <>", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteGreaterThan(String value) {
            addCriterion("codareacliente >", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteGreaterThanOrEqualTo(String value) {
            addCriterion("codareacliente >=", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteLessThan(String value) {
            addCriterion("codareacliente <", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteLessThanOrEqualTo(String value) {
            addCriterion("codareacliente <=", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteLike(String value) {
            addCriterion("codareacliente like", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteNotLike(String value) {
            addCriterion("codareacliente not like", value, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteIn(List<String> values) {
            addCriterion("codareacliente in", values, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteNotIn(List<String> values) {
            addCriterion("codareacliente not in", values, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteBetween(String value1, String value2) {
            addCriterion("codareacliente between", value1, value2, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodareaclienteNotBetween(String value1, String value2) {
            addCriterion("codareacliente not between", value1, value2, "codareacliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteIsNull() {
            addCriterion("codcliente is null");
            return (Criteria) this;
        }

        public Criteria andCodclienteIsNotNull() {
            addCriterion("codcliente is not null");
            return (Criteria) this;
        }

        public Criteria andCodclienteEqualTo(String value) {
            addCriterion("codcliente =", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteNotEqualTo(String value) {
            addCriterion("codcliente <>", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteGreaterThan(String value) {
            addCriterion("codcliente >", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteGreaterThanOrEqualTo(String value) {
            addCriterion("codcliente >=", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteLessThan(String value) {
            addCriterion("codcliente <", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteLessThanOrEqualTo(String value) {
            addCriterion("codcliente <=", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteLike(String value) {
            addCriterion("codcliente like", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteNotLike(String value) {
            addCriterion("codcliente not like", value, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteIn(List<String> values) {
            addCriterion("codcliente in", values, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteNotIn(List<String> values) {
            addCriterion("codcliente not in", values, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteBetween(String value1, String value2) {
            addCriterion("codcliente between", value1, value2, "codcliente");
            return (Criteria) this;
        }

        public Criteria andCodclienteNotBetween(String value1, String value2) {
            addCriterion("codcliente not between", value1, value2, "codcliente");
            return (Criteria) this;
        }

        public Criteria andRucIsNull() {
            addCriterion("ruc is null");
            return (Criteria) this;
        }

        public Criteria andRucIsNotNull() {
            addCriterion("ruc is not null");
            return (Criteria) this;
        }

        public Criteria andRucEqualTo(String value) {
            addCriterion("ruc =", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucNotEqualTo(String value) {
            addCriterion("ruc <>", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucGreaterThan(String value) {
            addCriterion("ruc >", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucGreaterThanOrEqualTo(String value) {
            addCriterion("ruc >=", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucLessThan(String value) {
            addCriterion("ruc <", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucLessThanOrEqualTo(String value) {
            addCriterion("ruc <=", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucLike(String value) {
            addCriterion("ruc like", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucNotLike(String value) {
            addCriterion("ruc not like", value, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucIn(List<String> values) {
            addCriterion("ruc in", values, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucNotIn(List<String> values) {
            addCriterion("ruc not in", values, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucBetween(String value1, String value2) {
            addCriterion("ruc between", value1, value2, "ruc");
            return (Criteria) this;
        }

        public Criteria andRucNotBetween(String value1, String value2) {
            addCriterion("ruc not between", value1, value2, "ruc");
            return (Criteria) this;
        }

        public Criteria andAreaclienteIsNull() {
            addCriterion("areacliente is null");
            return (Criteria) this;
        }

        public Criteria andAreaclienteIsNotNull() {
            addCriterion("areacliente is not null");
            return (Criteria) this;
        }

        public Criteria andAreaclienteEqualTo(String value) {
            addCriterion("areacliente =", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteNotEqualTo(String value) {
            addCriterion("areacliente <>", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteGreaterThan(String value) {
            addCriterion("areacliente >", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteGreaterThanOrEqualTo(String value) {
            addCriterion("areacliente >=", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteLessThan(String value) {
            addCriterion("areacliente <", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteLessThanOrEqualTo(String value) {
            addCriterion("areacliente <=", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteLike(String value) {
            addCriterion("areacliente like", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteNotLike(String value) {
            addCriterion("areacliente not like", value, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteIn(List<String> values) {
            addCriterion("areacliente in", values, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteNotIn(List<String> values) {
            addCriterion("areacliente not in", values, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteBetween(String value1, String value2) {
            addCriterion("areacliente between", value1, value2, "areacliente");
            return (Criteria) this;
        }

        public Criteria andAreaclienteNotBetween(String value1, String value2) {
            addCriterion("areacliente not between", value1, value2, "areacliente");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNull() {
            addCriterion("direccion is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("direccion is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("direccion =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("direccion <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("direccion >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("direccion >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("direccion <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("direccion <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("direccion like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("direccion not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("direccion in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("direccion not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("direccion between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("direccion not between", value1, value2, "direccion");
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

        public Criteria andCodpaisIsNull() {
            addCriterion("codpais is null");
            return (Criteria) this;
        }

        public Criteria andCodpaisIsNotNull() {
            addCriterion("codpais is not null");
            return (Criteria) this;
        }

        public Criteria andCodpaisEqualTo(String value) {
            addCriterion("codpais =", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisNotEqualTo(String value) {
            addCriterion("codpais <>", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisGreaterThan(String value) {
            addCriterion("codpais >", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisGreaterThanOrEqualTo(String value) {
            addCriterion("codpais >=", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisLessThan(String value) {
            addCriterion("codpais <", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisLessThanOrEqualTo(String value) {
            addCriterion("codpais <=", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisLike(String value) {
            addCriterion("codpais like", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisNotLike(String value) {
            addCriterion("codpais not like", value, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisIn(List<String> values) {
            addCriterion("codpais in", values, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisNotIn(List<String> values) {
            addCriterion("codpais not in", values, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisBetween(String value1, String value2) {
            addCriterion("codpais between", value1, value2, "codpais");
            return (Criteria) this;
        }

        public Criteria andCodpaisNotBetween(String value1, String value2) {
            addCriterion("codpais not between", value1, value2, "codpais");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNull() {
            addCriterion("telefono is null");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNotNull() {
            addCriterion("telefono is not null");
            return (Criteria) this;
        }

        public Criteria andTelefonoEqualTo(String value) {
            addCriterion("telefono =", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotEqualTo(String value) {
            addCriterion("telefono <>", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThan(String value) {
            addCriterion("telefono >", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("telefono >=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThan(String value) {
            addCriterion("telefono <", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThanOrEqualTo(String value) {
            addCriterion("telefono <=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLike(String value) {
            addCriterion("telefono like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotLike(String value) {
            addCriterion("telefono not like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoIn(List<String> values) {
            addCriterion("telefono in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotIn(List<String> values) {
            addCriterion("telefono not in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoBetween(String value1, String value2) {
            addCriterion("telefono between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotBetween(String value1, String value2) {
            addCriterion("telefono not between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andMovilIsNull() {
            addCriterion("movil is null");
            return (Criteria) this;
        }

        public Criteria andMovilIsNotNull() {
            addCriterion("movil is not null");
            return (Criteria) this;
        }

        public Criteria andMovilEqualTo(String value) {
            addCriterion("movil =", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilNotEqualTo(String value) {
            addCriterion("movil <>", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilGreaterThan(String value) {
            addCriterion("movil >", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilGreaterThanOrEqualTo(String value) {
            addCriterion("movil >=", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilLessThan(String value) {
            addCriterion("movil <", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilLessThanOrEqualTo(String value) {
            addCriterion("movil <=", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilLike(String value) {
            addCriterion("movil like", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilNotLike(String value) {
            addCriterion("movil not like", value, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilIn(List<String> values) {
            addCriterion("movil in", values, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilNotIn(List<String> values) {
            addCriterion("movil not in", values, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilBetween(String value1, String value2) {
            addCriterion("movil between", value1, value2, "movil");
            return (Criteria) this;
        }

        public Criteria andMovilNotBetween(String value1, String value2) {
            addCriterion("movil not between", value1, value2, "movil");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaIsNull() {
            addCriterion("codejecutiva is null");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaIsNotNull() {
            addCriterion("codejecutiva is not null");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaEqualTo(String value) {
            addCriterion("codejecutiva =", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaNotEqualTo(String value) {
            addCriterion("codejecutiva <>", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaGreaterThan(String value) {
            addCriterion("codejecutiva >", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaGreaterThanOrEqualTo(String value) {
            addCriterion("codejecutiva >=", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaLessThan(String value) {
            addCriterion("codejecutiva <", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaLessThanOrEqualTo(String value) {
            addCriterion("codejecutiva <=", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaLike(String value) {
            addCriterion("codejecutiva like", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaNotLike(String value) {
            addCriterion("codejecutiva not like", value, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaIn(List<String> values) {
            addCriterion("codejecutiva in", values, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaNotIn(List<String> values) {
            addCriterion("codejecutiva not in", values, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaBetween(String value1, String value2) {
            addCriterion("codejecutiva between", value1, value2, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andCodejecutivaNotBetween(String value1, String value2) {
            addCriterion("codejecutiva not between", value1, value2, "codejecutiva");
            return (Criteria) this;
        }

        public Criteria andObservacionIsNull() {
            addCriterion("observacion is null");
            return (Criteria) this;
        }

        public Criteria andObservacionIsNotNull() {
            addCriterion("observacion is not null");
            return (Criteria) this;
        }

        public Criteria andObservacionEqualTo(String value) {
            addCriterion("observacion =", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotEqualTo(String value) {
            addCriterion("observacion <>", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionGreaterThan(String value) {
            addCriterion("observacion >", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionGreaterThanOrEqualTo(String value) {
            addCriterion("observacion >=", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLessThan(String value) {
            addCriterion("observacion <", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLessThanOrEqualTo(String value) {
            addCriterion("observacion <=", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionLike(String value) {
            addCriterion("observacion like", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotLike(String value) {
            addCriterion("observacion not like", value, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionIn(List<String> values) {
            addCriterion("observacion in", values, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotIn(List<String> values) {
            addCriterion("observacion not in", values, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionBetween(String value1, String value2) {
            addCriterion("observacion between", value1, value2, "observacion");
            return (Criteria) this;
        }

        public Criteria andObservacionNotBetween(String value1, String value2) {
            addCriterion("observacion not between", value1, value2, "observacion");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNull() {
            addCriterion("usuario is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNotNull() {
            addCriterion("usuario is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioEqualTo(String value) {
            addCriterion("usuario =", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotEqualTo(String value) {
            addCriterion("usuario <>", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThan(String value) {
            addCriterion("usuario >", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("usuario >=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThan(String value) {
            addCriterion("usuario <", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThanOrEqualTo(String value) {
            addCriterion("usuario <=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLike(String value) {
            addCriterion("usuario like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotLike(String value) {
            addCriterion("usuario not like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioIn(List<String> values) {
            addCriterion("usuario in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotIn(List<String> values) {
            addCriterion("usuario not in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioBetween(String value1, String value2) {
            addCriterion("usuario between", value1, value2, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotBetween(String value1, String value2) {
            addCriterion("usuario not between", value1, value2, "usuario");
            return (Criteria) this;
        }

        public Criteria andFechaIsNull() {
            addCriterion("fecha is null");
            return (Criteria) this;
        }

        public Criteria andFechaIsNotNull() {
            addCriterion("fecha is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEqualTo(Date value) {
            addCriterion("fecha =", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotEqualTo(Date value) {
            addCriterion("fecha <>", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThan(Date value) {
            addCriterion("fecha >", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha >=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThan(Date value) {
            addCriterion("fecha <", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThanOrEqualTo(Date value) {
            addCriterion("fecha <=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaIn(List<Date> values) {
            addCriterion("fecha in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotIn(List<Date> values) {
            addCriterion("fecha not in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaBetween(Date value1, Date value2) {
            addCriterion("fecha between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotBetween(Date value1, Date value2) {
            addCriterion("fecha not between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andUsuariomodIsNull() {
            addCriterion("usuariomod is null");
            return (Criteria) this;
        }

        public Criteria andUsuariomodIsNotNull() {
            addCriterion("usuariomod is not null");
            return (Criteria) this;
        }

        public Criteria andUsuariomodEqualTo(String value) {
            addCriterion("usuariomod =", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodNotEqualTo(String value) {
            addCriterion("usuariomod <>", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodGreaterThan(String value) {
            addCriterion("usuariomod >", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodGreaterThanOrEqualTo(String value) {
            addCriterion("usuariomod >=", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodLessThan(String value) {
            addCriterion("usuariomod <", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodLessThanOrEqualTo(String value) {
            addCriterion("usuariomod <=", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodLike(String value) {
            addCriterion("usuariomod like", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodNotLike(String value) {
            addCriterion("usuariomod not like", value, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodIn(List<String> values) {
            addCriterion("usuariomod in", values, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodNotIn(List<String> values) {
            addCriterion("usuariomod not in", values, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodBetween(String value1, String value2) {
            addCriterion("usuariomod between", value1, value2, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andUsuariomodNotBetween(String value1, String value2) {
            addCriterion("usuariomod not between", value1, value2, "usuariomod");
            return (Criteria) this;
        }

        public Criteria andFechamodIsNull() {
            addCriterion("fechamod is null");
            return (Criteria) this;
        }

        public Criteria andFechamodIsNotNull() {
            addCriterion("fechamod is not null");
            return (Criteria) this;
        }

        public Criteria andFechamodEqualTo(Date value) {
            addCriterion("fechamod =", value, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodNotEqualTo(Date value) {
            addCriterion("fechamod <>", value, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodGreaterThan(Date value) {
            addCriterion("fechamod >", value, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodGreaterThanOrEqualTo(Date value) {
            addCriterion("fechamod >=", value, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodLessThan(Date value) {
            addCriterion("fechamod <", value, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodLessThanOrEqualTo(Date value) {
            addCriterion("fechamod <=", value, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodIn(List<Date> values) {
            addCriterion("fechamod in", values, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodNotIn(List<Date> values) {
            addCriterion("fechamod not in", values, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodBetween(Date value1, Date value2) {
            addCriterion("fechamod between", value1, value2, "fechamod");
            return (Criteria) this;
        }

        public Criteria andFechamodNotBetween(Date value1, Date value2) {
            addCriterion("fechamod not between", value1, value2, "fechamod");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNull() {
            addCriterion("estado is null");
            return (Criteria) this;
        }

        public Criteria andEstadoIsNotNull() {
            addCriterion("estado is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoEqualTo(Short value) {
            addCriterion("estado =", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotEqualTo(Short value) {
            addCriterion("estado <>", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThan(Short value) {
            addCriterion("estado >", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoGreaterThanOrEqualTo(Short value) {
            addCriterion("estado >=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThan(Short value) {
            addCriterion("estado <", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoLessThanOrEqualTo(Short value) {
            addCriterion("estado <=", value, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoIn(List<Short> values) {
            addCriterion("estado in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotIn(List<Short> values) {
            addCriterion("estado not in", values, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoBetween(Short value1, Short value2) {
            addCriterion("estado between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andEstadoNotBetween(Short value1, Short value2) {
            addCriterion("estado not between", value1, value2, "estado");
            return (Criteria) this;
        }

        public Criteria andContactoIsNull() {
            addCriterion("contacto is null");
            return (Criteria) this;
        }

        public Criteria andContactoIsNotNull() {
            addCriterion("contacto is not null");
            return (Criteria) this;
        }

        public Criteria andContactoEqualTo(String value) {
            addCriterion("contacto =", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotEqualTo(String value) {
            addCriterion("contacto <>", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoGreaterThan(String value) {
            addCriterion("contacto >", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoGreaterThanOrEqualTo(String value) {
            addCriterion("contacto >=", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoLessThan(String value) {
            addCriterion("contacto <", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoLessThanOrEqualTo(String value) {
            addCriterion("contacto <=", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoLike(String value) {
            addCriterion("contacto like", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotLike(String value) {
            addCriterion("contacto not like", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoIn(List<String> values) {
            addCriterion("contacto in", values, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotIn(List<String> values) {
            addCriterion("contacto not in", values, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoBetween(String value1, String value2) {
            addCriterion("contacto between", value1, value2, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotBetween(String value1, String value2) {
            addCriterion("contacto not between", value1, value2, "contacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoIsNull() {
            addCriterion("areacontacto is null");
            return (Criteria) this;
        }

        public Criteria andAreacontactoIsNotNull() {
            addCriterion("areacontacto is not null");
            return (Criteria) this;
        }

        public Criteria andAreacontactoEqualTo(String value) {
            addCriterion("areacontacto =", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotEqualTo(String value) {
            addCriterion("areacontacto <>", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoGreaterThan(String value) {
            addCriterion("areacontacto >", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoGreaterThanOrEqualTo(String value) {
            addCriterion("areacontacto >=", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoLessThan(String value) {
            addCriterion("areacontacto <", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoLessThanOrEqualTo(String value) {
            addCriterion("areacontacto <=", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoLike(String value) {
            addCriterion("areacontacto like", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotLike(String value) {
            addCriterion("areacontacto not like", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoIn(List<String> values) {
            addCriterion("areacontacto in", values, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotIn(List<String> values) {
            addCriterion("areacontacto not in", values, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoBetween(String value1, String value2) {
            addCriterion("areacontacto between", value1, value2, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotBetween(String value1, String value2) {
            addCriterion("areacontacto not between", value1, value2, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andPreordenIsNull() {
            addCriterion("preorden is null");
            return (Criteria) this;
        }

        public Criteria andPreordenIsNotNull() {
            addCriterion("preorden is not null");
            return (Criteria) this;
        }

        public Criteria andPreordenEqualTo(String value) {
            addCriterion("preorden =", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenNotEqualTo(String value) {
            addCriterion("preorden <>", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenGreaterThan(String value) {
            addCriterion("preorden >", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenGreaterThanOrEqualTo(String value) {
            addCriterion("preorden >=", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenLessThan(String value) {
            addCriterion("preorden <", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenLessThanOrEqualTo(String value) {
            addCriterion("preorden <=", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenLike(String value) {
            addCriterion("preorden like", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenNotLike(String value) {
            addCriterion("preorden not like", value, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenIn(List<String> values) {
            addCriterion("preorden in", values, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenNotIn(List<String> values) {
            addCriterion("preorden not in", values, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenBetween(String value1, String value2) {
            addCriterion("preorden between", value1, value2, "preorden");
            return (Criteria) this;
        }

        public Criteria andPreordenNotBetween(String value1, String value2) {
            addCriterion("preorden not between", value1, value2, "preorden");
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