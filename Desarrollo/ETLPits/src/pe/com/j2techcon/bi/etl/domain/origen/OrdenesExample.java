package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdenesExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public OrdenesExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andSerieIsNull() {
			addCriterion("serie is null");
			return (Criteria) this;
		}

		public Criteria andSerieIsNotNull() {
			addCriterion("serie is not null");
			return (Criteria) this;
		}

		public Criteria andSerieEqualTo(String value) {
			addCriterion("serie =", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieNotEqualTo(String value) {
			addCriterion("serie <>", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieGreaterThan(String value) {
			addCriterion("serie >", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieGreaterThanOrEqualTo(String value) {
			addCriterion("serie >=", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieLessThan(String value) {
			addCriterion("serie <", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieLessThanOrEqualTo(String value) {
			addCriterion("serie <=", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieLike(String value) {
			addCriterion("serie like", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieNotLike(String value) {
			addCriterion("serie not like", value, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieIn(List<String> values) {
			addCriterion("serie in", values, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieNotIn(List<String> values) {
			addCriterion("serie not in", values, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieBetween(String value1, String value2) {
			addCriterion("serie between", value1, value2, "serie");
			return (Criteria) this;
		}

		public Criteria andSerieNotBetween(String value1, String value2) {
			addCriterion("serie not between", value1, value2, "serie");
			return (Criteria) this;
		}

		public Criteria andOrdenIsNull() {
			addCriterion("orden is null");
			return (Criteria) this;
		}

		public Criteria andOrdenIsNotNull() {
			addCriterion("orden is not null");
			return (Criteria) this;
		}

		public Criteria andOrdenEqualTo(String value) {
			addCriterion("orden =", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenNotEqualTo(String value) {
			addCriterion("orden <>", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenGreaterThan(String value) {
			addCriterion("orden >", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenGreaterThanOrEqualTo(String value) {
			addCriterion("orden >=", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenLessThan(String value) {
			addCriterion("orden <", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenLessThanOrEqualTo(String value) {
			addCriterion("orden <=", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenLike(String value) {
			addCriterion("orden like", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenNotLike(String value) {
			addCriterion("orden not like", value, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenIn(List<String> values) {
			addCriterion("orden in", values, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenNotIn(List<String> values) {
			addCriterion("orden not in", values, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenBetween(String value1, String value2) {
			addCriterion("orden between", value1, value2, "orden");
			return (Criteria) this;
		}

		public Criteria andOrdenNotBetween(String value1, String value2) {
			addCriterion("orden not between", value1, value2, "orden");
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

		public Criteria andCodambitoIsNull() {
			addCriterion("codambito is null");
			return (Criteria) this;
		}

		public Criteria andCodambitoIsNotNull() {
			addCriterion("codambito is not null");
			return (Criteria) this;
		}

		public Criteria andCodambitoEqualTo(String value) {
			addCriterion("codambito =", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoNotEqualTo(String value) {
			addCriterion("codambito <>", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoGreaterThan(String value) {
			addCriterion("codambito >", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoGreaterThanOrEqualTo(String value) {
			addCriterion("codambito >=", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoLessThan(String value) {
			addCriterion("codambito <", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoLessThanOrEqualTo(String value) {
			addCriterion("codambito <=", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoLike(String value) {
			addCriterion("codambito like", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoNotLike(String value) {
			addCriterion("codambito not like", value, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoIn(List<String> values) {
			addCriterion("codambito in", values, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoNotIn(List<String> values) {
			addCriterion("codambito not in", values, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoBetween(String value1, String value2) {
			addCriterion("codambito between", value1, value2, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodambitoNotBetween(String value1, String value2) {
			addCriterion("codambito not between", value1, value2, "codambito");
			return (Criteria) this;
		}

		public Criteria andCodnegocioIsNull() {
			addCriterion("codnegocio is null");
			return (Criteria) this;
		}

		public Criteria andCodnegocioIsNotNull() {
			addCriterion("codnegocio is not null");
			return (Criteria) this;
		}

		public Criteria andCodnegocioEqualTo(String value) {
			addCriterion("codnegocio =", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioNotEqualTo(String value) {
			addCriterion("codnegocio <>", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioGreaterThan(String value) {
			addCriterion("codnegocio >", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioGreaterThanOrEqualTo(String value) {
			addCriterion("codnegocio >=", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioLessThan(String value) {
			addCriterion("codnegocio <", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioLessThanOrEqualTo(String value) {
			addCriterion("codnegocio <=", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioLike(String value) {
			addCriterion("codnegocio like", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioNotLike(String value) {
			addCriterion("codnegocio not like", value, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioIn(List<String> values) {
			addCriterion("codnegocio in", values, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioNotIn(List<String> values) {
			addCriterion("codnegocio not in", values, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioBetween(String value1, String value2) {
			addCriterion("codnegocio between", value1, value2, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodnegocioNotBetween(String value1, String value2) {
			addCriterion("codnegocio not between", value1, value2, "codnegocio");
			return (Criteria) this;
		}

		public Criteria andCodservicioIsNull() {
			addCriterion("codservicio is null");
			return (Criteria) this;
		}

		public Criteria andCodservicioIsNotNull() {
			addCriterion("codservicio is not null");
			return (Criteria) this;
		}

		public Criteria andCodservicioEqualTo(String value) {
			addCriterion("codservicio =", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioNotEqualTo(String value) {
			addCriterion("codservicio <>", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioGreaterThan(String value) {
			addCriterion("codservicio >", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioGreaterThanOrEqualTo(String value) {
			addCriterion("codservicio >=", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioLessThan(String value) {
			addCriterion("codservicio <", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioLessThanOrEqualTo(String value) {
			addCriterion("codservicio <=", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioLike(String value) {
			addCriterion("codservicio like", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioNotLike(String value) {
			addCriterion("codservicio not like", value, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioIn(List<String> values) {
			addCriterion("codservicio in", values, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioNotIn(List<String> values) {
			addCriterion("codservicio not in", values, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioBetween(String value1, String value2) {
			addCriterion("codservicio between", value1, value2, "codservicio");
			return (Criteria) this;
		}

		public Criteria andCodservicioNotBetween(String value1, String value2) {
			addCriterion("codservicio not between", value1, value2,
					"codservicio");
			return (Criteria) this;
		}

		public Criteria andCodproductoIsNull() {
			addCriterion("codproducto is null");
			return (Criteria) this;
		}

		public Criteria andCodproductoIsNotNull() {
			addCriterion("codproducto is not null");
			return (Criteria) this;
		}

		public Criteria andCodproductoEqualTo(String value) {
			addCriterion("codproducto =", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoNotEqualTo(String value) {
			addCriterion("codproducto <>", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoGreaterThan(String value) {
			addCriterion("codproducto >", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoGreaterThanOrEqualTo(String value) {
			addCriterion("codproducto >=", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoLessThan(String value) {
			addCriterion("codproducto <", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoLessThanOrEqualTo(String value) {
			addCriterion("codproducto <=", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoLike(String value) {
			addCriterion("codproducto like", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoNotLike(String value) {
			addCriterion("codproducto not like", value, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoIn(List<String> values) {
			addCriterion("codproducto in", values, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoNotIn(List<String> values) {
			addCriterion("codproducto not in", values, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoBetween(String value1, String value2) {
			addCriterion("codproducto between", value1, value2, "codproducto");
			return (Criteria) this;
		}

		public Criteria andCodproductoNotBetween(String value1, String value2) {
			addCriterion("codproducto not between", value1, value2,
					"codproducto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoIsNull() {
			addCriterion("codtiporeparto is null");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoIsNotNull() {
			addCriterion("codtiporeparto is not null");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoEqualTo(String value) {
			addCriterion("codtiporeparto =", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoNotEqualTo(String value) {
			addCriterion("codtiporeparto <>", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoGreaterThan(String value) {
			addCriterion("codtiporeparto >", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoGreaterThanOrEqualTo(String value) {
			addCriterion("codtiporeparto >=", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoLessThan(String value) {
			addCriterion("codtiporeparto <", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoLessThanOrEqualTo(String value) {
			addCriterion("codtiporeparto <=", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoLike(String value) {
			addCriterion("codtiporeparto like", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoNotLike(String value) {
			addCriterion("codtiporeparto not like", value, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoIn(List<String> values) {
			addCriterion("codtiporeparto in", values, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoNotIn(List<String> values) {
			addCriterion("codtiporeparto not in", values, "codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoBetween(String value1, String value2) {
			addCriterion("codtiporeparto between", value1, value2,
					"codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCodtiporepartoNotBetween(String value1, String value2) {
			addCriterion("codtiporeparto not between", value1, value2,
					"codtiporeparto");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionIsNull() {
			addCriterion("cnt_admision is null");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionIsNotNull() {
			addCriterion("cnt_admision is not null");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionEqualTo(Long value) {
			addCriterion("cnt_admision =", value, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionNotEqualTo(Long value) {
			addCriterion("cnt_admision <>", value, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionGreaterThan(Long value) {
			addCriterion("cnt_admision >", value, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionGreaterThanOrEqualTo(Long value) {
			addCriterion("cnt_admision >=", value, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionLessThan(Long value) {
			addCriterion("cnt_admision <", value, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionLessThanOrEqualTo(Long value) {
			addCriterion("cnt_admision <=", value, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionIn(List<Long> values) {
			addCriterion("cnt_admision in", values, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionNotIn(List<Long> values) {
			addCriterion("cnt_admision not in", values, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionBetween(Long value1, Long value2) {
			addCriterion("cnt_admision between", value1, value2, "cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntAdmisionNotBetween(Long value1, Long value2) {
			addCriterion("cnt_admision not between", value1, value2,
					"cntAdmision");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoIsNull() {
			addCriterion("cnt_digitado is null");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoIsNotNull() {
			addCriterion("cnt_digitado is not null");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoEqualTo(Long value) {
			addCriterion("cnt_digitado =", value, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoNotEqualTo(Long value) {
			addCriterion("cnt_digitado <>", value, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoGreaterThan(Long value) {
			addCriterion("cnt_digitado >", value, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoGreaterThanOrEqualTo(Long value) {
			addCriterion("cnt_digitado >=", value, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoLessThan(Long value) {
			addCriterion("cnt_digitado <", value, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoLessThanOrEqualTo(Long value) {
			addCriterion("cnt_digitado <=", value, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoIn(List<Long> values) {
			addCriterion("cnt_digitado in", values, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoNotIn(List<Long> values) {
			addCriterion("cnt_digitado not in", values, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoBetween(Long value1, Long value2) {
			addCriterion("cnt_digitado between", value1, value2, "cntDigitado");
			return (Criteria) this;
		}

		public Criteria andCntDigitadoNotBetween(Long value1, Long value2) {
			addCriterion("cnt_digitado not between", value1, value2,
					"cntDigitado");
			return (Criteria) this;
		}

		public Criteria andPesoIsNull() {
			addCriterion("peso is null");
			return (Criteria) this;
		}

		public Criteria andPesoIsNotNull() {
			addCriterion("peso is not null");
			return (Criteria) this;
		}

		public Criteria andPesoEqualTo(BigDecimal value) {
			addCriterion("peso =", value, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoNotEqualTo(BigDecimal value) {
			addCriterion("peso <>", value, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoGreaterThan(BigDecimal value) {
			addCriterion("peso >", value, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("peso >=", value, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoLessThan(BigDecimal value) {
			addCriterion("peso <", value, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("peso <=", value, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoIn(List<BigDecimal> values) {
			addCriterion("peso in", values, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoNotIn(List<BigDecimal> values) {
			addCriterion("peso not in", values, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("peso between", value1, value2, "peso");
			return (Criteria) this;
		}

		public Criteria andPesoNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("peso not between", value1, value2, "peso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoIsNull() {
			addCriterion("fechaingreso is null");
			return (Criteria) this;
		}

		public Criteria andFechaingresoIsNotNull() {
			addCriterion("fechaingreso is not null");
			return (Criteria) this;
		}

		public Criteria andFechaingresoEqualTo(Date value) {
			addCriterionForJDBCDate("fechaingreso =", value, "fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoNotEqualTo(Date value) {
			addCriterionForJDBCDate("fechaingreso <>", value, "fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoGreaterThan(Date value) {
			addCriterionForJDBCDate("fechaingreso >", value, "fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechaingreso >=", value, "fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoLessThan(Date value) {
			addCriterionForJDBCDate("fechaingreso <", value, "fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechaingreso <=", value, "fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoIn(List<Date> values) {
			addCriterionForJDBCDate("fechaingreso in", values, "fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoNotIn(List<Date> values) {
			addCriterionForJDBCDate("fechaingreso not in", values,
					"fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechaingreso between", value1, value2,
					"fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechaingresoNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechaingreso not between", value1, value2,
					"fechaingreso");
			return (Criteria) this;
		}

		public Criteria andFechainicioIsNull() {
			addCriterion("fechainicio is null");
			return (Criteria) this;
		}

		public Criteria andFechainicioIsNotNull() {
			addCriterion("fechainicio is not null");
			return (Criteria) this;
		}

		public Criteria andFechainicioEqualTo(Date value) {
			addCriterionForJDBCDate("fechainicio =", value, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioNotEqualTo(Date value) {
			addCriterionForJDBCDate("fechainicio <>", value, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioGreaterThan(Date value) {
			addCriterionForJDBCDate("fechainicio >", value, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechainicio >=", value, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioLessThan(Date value) {
			addCriterionForJDBCDate("fechainicio <", value, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechainicio <=", value, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioIn(List<Date> values) {
			addCriterionForJDBCDate("fechainicio in", values, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioNotIn(List<Date> values) {
			addCriterionForJDBCDate("fechainicio not in", values, "fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechainicio between", value1, value2,
					"fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechainicioNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechainicio not between", value1, value2,
					"fechainicio");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoIsNull() {
			addCriterion("fechavencimiento is null");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoIsNotNull() {
			addCriterion("fechavencimiento is not null");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoEqualTo(Date value) {
			addCriterionForJDBCDate("fechavencimiento =", value,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoNotEqualTo(Date value) {
			addCriterionForJDBCDate("fechavencimiento <>", value,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoGreaterThan(Date value) {
			addCriterionForJDBCDate("fechavencimiento >", value,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechavencimiento >=", value,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoLessThan(Date value) {
			addCriterionForJDBCDate("fechavencimiento <", value,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechavencimiento <=", value,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoIn(List<Date> values) {
			addCriterionForJDBCDate("fechavencimiento in", values,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoNotIn(List<Date> values) {
			addCriterionForJDBCDate("fechavencimiento not in", values,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechavencimiento between", value1, value2,
					"fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechavencimientoNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechavencimiento not between", value1,
					value2, "fechavencimiento");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionIsNull() {
			addCriterion("fechadevolucion is null");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionIsNotNull() {
			addCriterion("fechadevolucion is not null");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionEqualTo(Date value) {
			addCriterionForJDBCDate("fechadevolucion =", value,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionNotEqualTo(Date value) {
			addCriterionForJDBCDate("fechadevolucion <>", value,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionGreaterThan(Date value) {
			addCriterionForJDBCDate("fechadevolucion >", value,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechadevolucion >=", value,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionLessThan(Date value) {
			addCriterionForJDBCDate("fechadevolucion <", value,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fechadevolucion <=", value,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionIn(List<Date> values) {
			addCriterionForJDBCDate("fechadevolucion in", values,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionNotIn(List<Date> values) {
			addCriterionForJDBCDate("fechadevolucion not in", values,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechadevolucion between", value1, value2,
					"fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andFechadevolucionNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fechadevolucion not between", value1,
					value2, "fechadevolucion");
			return (Criteria) this;
		}

		public Criteria andEstadoordenIsNull() {
			addCriterion("estadoorden is null");
			return (Criteria) this;
		}

		public Criteria andEstadoordenIsNotNull() {
			addCriterion("estadoorden is not null");
			return (Criteria) this;
		}

		public Criteria andEstadoordenEqualTo(String value) {
			addCriterion("estadoorden =", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenNotEqualTo(String value) {
			addCriterion("estadoorden <>", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenGreaterThan(String value) {
			addCriterion("estadoorden >", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenGreaterThanOrEqualTo(String value) {
			addCriterion("estadoorden >=", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenLessThan(String value) {
			addCriterion("estadoorden <", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenLessThanOrEqualTo(String value) {
			addCriterion("estadoorden <=", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenLike(String value) {
			addCriterion("estadoorden like", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenNotLike(String value) {
			addCriterion("estadoorden not like", value, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenIn(List<String> values) {
			addCriterion("estadoorden in", values, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenNotIn(List<String> values) {
			addCriterion("estadoorden not in", values, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenBetween(String value1, String value2) {
			addCriterion("estadoorden between", value1, value2, "estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadoordenNotBetween(String value1, String value2) {
			addCriterion("estadoorden not between", value1, value2,
					"estadoorden");
			return (Criteria) this;
		}

		public Criteria andEstadooutIsNull() {
			addCriterion("estadoout is null");
			return (Criteria) this;
		}

		public Criteria andEstadooutIsNotNull() {
			addCriterion("estadoout is not null");
			return (Criteria) this;
		}

		public Criteria andEstadooutEqualTo(String value) {
			addCriterion("estadoout =", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutNotEqualTo(String value) {
			addCriterion("estadoout <>", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutGreaterThan(String value) {
			addCriterion("estadoout >", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutGreaterThanOrEqualTo(String value) {
			addCriterion("estadoout >=", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutLessThan(String value) {
			addCriterion("estadoout <", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutLessThanOrEqualTo(String value) {
			addCriterion("estadoout <=", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutLike(String value) {
			addCriterion("estadoout like", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutNotLike(String value) {
			addCriterion("estadoout not like", value, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutIn(List<String> values) {
			addCriterion("estadoout in", values, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutNotIn(List<String> values) {
			addCriterion("estadoout not in", values, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutBetween(String value1, String value2) {
			addCriterion("estadoout between", value1, value2, "estadoout");
			return (Criteria) this;
		}

		public Criteria andEstadooutNotBetween(String value1, String value2) {
			addCriterion("estadoout not between", value1, value2, "estadoout");
			return (Criteria) this;
		}

		public Criteria andBloqueoIsNull() {
			addCriterion("bloqueo is null");
			return (Criteria) this;
		}

		public Criteria andBloqueoIsNotNull() {
			addCriterion("bloqueo is not null");
			return (Criteria) this;
		}

		public Criteria andBloqueoEqualTo(Short value) {
			addCriterion("bloqueo =", value, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoNotEqualTo(Short value) {
			addCriterion("bloqueo <>", value, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoGreaterThan(Short value) {
			addCriterion("bloqueo >", value, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoGreaterThanOrEqualTo(Short value) {
			addCriterion("bloqueo >=", value, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoLessThan(Short value) {
			addCriterion("bloqueo <", value, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoLessThanOrEqualTo(Short value) {
			addCriterion("bloqueo <=", value, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoIn(List<Short> values) {
			addCriterion("bloqueo in", values, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoNotIn(List<Short> values) {
			addCriterion("bloqueo not in", values, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoBetween(Short value1, Short value2) {
			addCriterion("bloqueo between", value1, value2, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andBloqueoNotBetween(Short value1, Short value2) {
			addCriterion("bloqueo not between", value1, value2, "bloqueo");
			return (Criteria) this;
		}

		public Criteria andVolantesIsNull() {
			addCriterion("volantes is null");
			return (Criteria) this;
		}

		public Criteria andVolantesIsNotNull() {
			addCriterion("volantes is not null");
			return (Criteria) this;
		}

		public Criteria andVolantesEqualTo(Short value) {
			addCriterion("volantes =", value, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesNotEqualTo(Short value) {
			addCriterion("volantes <>", value, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesGreaterThan(Short value) {
			addCriterion("volantes >", value, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesGreaterThanOrEqualTo(Short value) {
			addCriterion("volantes >=", value, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesLessThan(Short value) {
			addCriterion("volantes <", value, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesLessThanOrEqualTo(Short value) {
			addCriterion("volantes <=", value, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesIn(List<Short> values) {
			addCriterion("volantes in", values, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesNotIn(List<Short> values) {
			addCriterion("volantes not in", values, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesBetween(Short value1, Short value2) {
			addCriterion("volantes between", value1, value2, "volantes");
			return (Criteria) this;
		}

		public Criteria andVolantesNotBetween(Short value1, Short value2) {
			addCriterion("volantes not between", value1, value2, "volantes");
			return (Criteria) this;
		}

		public Criteria andValoradoIsNull() {
			addCriterion("valorado is null");
			return (Criteria) this;
		}

		public Criteria andValoradoIsNotNull() {
			addCriterion("valorado is not null");
			return (Criteria) this;
		}

		public Criteria andValoradoEqualTo(Short value) {
			addCriterion("valorado =", value, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoNotEqualTo(Short value) {
			addCriterion("valorado <>", value, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoGreaterThan(Short value) {
			addCriterion("valorado >", value, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoGreaterThanOrEqualTo(Short value) {
			addCriterion("valorado >=", value, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoLessThan(Short value) {
			addCriterion("valorado <", value, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoLessThanOrEqualTo(Short value) {
			addCriterion("valorado <=", value, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoIn(List<Short> values) {
			addCriterion("valorado in", values, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoNotIn(List<Short> values) {
			addCriterion("valorado not in", values, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoBetween(Short value1, Short value2) {
			addCriterion("valorado between", value1, value2, "valorado");
			return (Criteria) this;
		}

		public Criteria andValoradoNotBetween(Short value1, Short value2) {
			addCriterion("valorado not between", value1, value2, "valorado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoIsNull() {
			addCriterion("liquidado is null");
			return (Criteria) this;
		}

		public Criteria andLiquidadoIsNotNull() {
			addCriterion("liquidado is not null");
			return (Criteria) this;
		}

		public Criteria andLiquidadoEqualTo(Short value) {
			addCriterion("liquidado =", value, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoNotEqualTo(Short value) {
			addCriterion("liquidado <>", value, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoGreaterThan(Short value) {
			addCriterion("liquidado >", value, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoGreaterThanOrEqualTo(Short value) {
			addCriterion("liquidado >=", value, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoLessThan(Short value) {
			addCriterion("liquidado <", value, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoLessThanOrEqualTo(Short value) {
			addCriterion("liquidado <=", value, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoIn(List<Short> values) {
			addCriterion("liquidado in", values, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoNotIn(List<Short> values) {
			addCriterion("liquidado not in", values, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoBetween(Short value1, Short value2) {
			addCriterion("liquidado between", value1, value2, "liquidado");
			return (Criteria) this;
		}

		public Criteria andLiquidadoNotBetween(Short value1, Short value2) {
			addCriterion("liquidado not between", value1, value2, "liquidado");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionIsNull() {
			addCriterion("nroliquidacion is null");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionIsNotNull() {
			addCriterion("nroliquidacion is not null");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionEqualTo(String value) {
			addCriterion("nroliquidacion =", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionNotEqualTo(String value) {
			addCriterion("nroliquidacion <>", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionGreaterThan(String value) {
			addCriterion("nroliquidacion >", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionGreaterThanOrEqualTo(String value) {
			addCriterion("nroliquidacion >=", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionLessThan(String value) {
			addCriterion("nroliquidacion <", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionLessThanOrEqualTo(String value) {
			addCriterion("nroliquidacion <=", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionLike(String value) {
			addCriterion("nroliquidacion like", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionNotLike(String value) {
			addCriterion("nroliquidacion not like", value, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionIn(List<String> values) {
			addCriterion("nroliquidacion in", values, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionNotIn(List<String> values) {
			addCriterion("nroliquidacion not in", values, "nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionBetween(String value1, String value2) {
			addCriterion("nroliquidacion between", value1, value2,
					"nroliquidacion");
			return (Criteria) this;
		}

		public Criteria andNroliquidacionNotBetween(String value1, String value2) {
			addCriterion("nroliquidacion not between", value1, value2,
					"nroliquidacion");
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

		public Criteria andGlosaIsNull() {
			addCriterion("glosa is null");
			return (Criteria) this;
		}

		public Criteria andGlosaIsNotNull() {
			addCriterion("glosa is not null");
			return (Criteria) this;
		}

		public Criteria andGlosaEqualTo(String value) {
			addCriterion("glosa =", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaNotEqualTo(String value) {
			addCriterion("glosa <>", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaGreaterThan(String value) {
			addCriterion("glosa >", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaGreaterThanOrEqualTo(String value) {
			addCriterion("glosa >=", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaLessThan(String value) {
			addCriterion("glosa <", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaLessThanOrEqualTo(String value) {
			addCriterion("glosa <=", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaLike(String value) {
			addCriterion("glosa like", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaNotLike(String value) {
			addCriterion("glosa not like", value, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaIn(List<String> values) {
			addCriterion("glosa in", values, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaNotIn(List<String> values) {
			addCriterion("glosa not in", values, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaBetween(String value1, String value2) {
			addCriterion("glosa between", value1, value2, "glosa");
			return (Criteria) this;
		}

		public Criteria andGlosaNotBetween(String value1, String value2) {
			addCriterion("glosa not between", value1, value2, "glosa");
			return (Criteria) this;
		}

		public Criteria andFacturadoIsNull() {
			addCriterion("facturado is null");
			return (Criteria) this;
		}

		public Criteria andFacturadoIsNotNull() {
			addCriterion("facturado is not null");
			return (Criteria) this;
		}

		public Criteria andFacturadoEqualTo(Short value) {
			addCriterion("facturado =", value, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoNotEqualTo(Short value) {
			addCriterion("facturado <>", value, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoGreaterThan(Short value) {
			addCriterion("facturado >", value, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoGreaterThanOrEqualTo(Short value) {
			addCriterion("facturado >=", value, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoLessThan(Short value) {
			addCriterion("facturado <", value, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoLessThanOrEqualTo(Short value) {
			addCriterion("facturado <=", value, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoIn(List<Short> values) {
			addCriterion("facturado in", values, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoNotIn(List<Short> values) {
			addCriterion("facturado not in", values, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoBetween(Short value1, Short value2) {
			addCriterion("facturado between", value1, value2, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacturadoNotBetween(Short value1, Short value2) {
			addCriterion("facturado not between", value1, value2, "facturado");
			return (Criteria) this;
		}

		public Criteria andFacSerieIsNull() {
			addCriterion("fac_serie is null");
			return (Criteria) this;
		}

		public Criteria andFacSerieIsNotNull() {
			addCriterion("fac_serie is not null");
			return (Criteria) this;
		}

		public Criteria andFacSerieEqualTo(String value) {
			addCriterion("fac_serie =", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieNotEqualTo(String value) {
			addCriterion("fac_serie <>", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieGreaterThan(String value) {
			addCriterion("fac_serie >", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieGreaterThanOrEqualTo(String value) {
			addCriterion("fac_serie >=", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieLessThan(String value) {
			addCriterion("fac_serie <", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieLessThanOrEqualTo(String value) {
			addCriterion("fac_serie <=", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieLike(String value) {
			addCriterion("fac_serie like", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieNotLike(String value) {
			addCriterion("fac_serie not like", value, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieIn(List<String> values) {
			addCriterion("fac_serie in", values, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieNotIn(List<String> values) {
			addCriterion("fac_serie not in", values, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieBetween(String value1, String value2) {
			addCriterion("fac_serie between", value1, value2, "facSerie");
			return (Criteria) this;
		}

		public Criteria andFacSerieNotBetween(String value1, String value2) {
			addCriterion("fac_serie not between", value1, value2, "facSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieIsNull() {
			addCriterion("eecc_serie is null");
			return (Criteria) this;
		}

		public Criteria andEeccSerieIsNotNull() {
			addCriterion("eecc_serie is not null");
			return (Criteria) this;
		}

		public Criteria andEeccSerieEqualTo(String value) {
			addCriterion("eecc_serie =", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieNotEqualTo(String value) {
			addCriterion("eecc_serie <>", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieGreaterThan(String value) {
			addCriterion("eecc_serie >", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieGreaterThanOrEqualTo(String value) {
			addCriterion("eecc_serie >=", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieLessThan(String value) {
			addCriterion("eecc_serie <", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieLessThanOrEqualTo(String value) {
			addCriterion("eecc_serie <=", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieLike(String value) {
			addCriterion("eecc_serie like", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieNotLike(String value) {
			addCriterion("eecc_serie not like", value, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieIn(List<String> values) {
			addCriterion("eecc_serie in", values, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieNotIn(List<String> values) {
			addCriterion("eecc_serie not in", values, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieBetween(String value1, String value2) {
			addCriterion("eecc_serie between", value1, value2, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccSerieNotBetween(String value1, String value2) {
			addCriterion("eecc_serie not between", value1, value2, "eeccSerie");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroIsNull() {
			addCriterion("eecc_numero is null");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroIsNotNull() {
			addCriterion("eecc_numero is not null");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroEqualTo(String value) {
			addCriterion("eecc_numero =", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroNotEqualTo(String value) {
			addCriterion("eecc_numero <>", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroGreaterThan(String value) {
			addCriterion("eecc_numero >", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroGreaterThanOrEqualTo(String value) {
			addCriterion("eecc_numero >=", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroLessThan(String value) {
			addCriterion("eecc_numero <", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroLessThanOrEqualTo(String value) {
			addCriterion("eecc_numero <=", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroLike(String value) {
			addCriterion("eecc_numero like", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroNotLike(String value) {
			addCriterion("eecc_numero not like", value, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroIn(List<String> values) {
			addCriterion("eecc_numero in", values, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroNotIn(List<String> values) {
			addCriterion("eecc_numero not in", values, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroBetween(String value1, String value2) {
			addCriterion("eecc_numero between", value1, value2, "eeccNumero");
			return (Criteria) this;
		}

		public Criteria andEeccNumeroNotBetween(String value1, String value2) {
			addCriterion("eecc_numero not between", value1, value2,
					"eeccNumero");
			return (Criteria) this;
		}

		public Criteria andImporteIsNull() {
			addCriterion("importe is null");
			return (Criteria) this;
		}

		public Criteria andImporteIsNotNull() {
			addCriterion("importe is not null");
			return (Criteria) this;
		}

		public Criteria andImporteEqualTo(BigDecimal value) {
			addCriterion("importe =", value, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteNotEqualTo(BigDecimal value) {
			addCriterion("importe <>", value, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteGreaterThan(BigDecimal value) {
			addCriterion("importe >", value, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("importe >=", value, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteLessThan(BigDecimal value) {
			addCriterion("importe <", value, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteLessThanOrEqualTo(BigDecimal value) {
			addCriterion("importe <=", value, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteIn(List<BigDecimal> values) {
			addCriterion("importe in", values, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteNotIn(List<BigDecimal> values) {
			addCriterion("importe not in", values, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("importe between", value1, value2, "importe");
			return (Criteria) this;
		}

		public Criteria andImporteNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("importe not between", value1, value2, "importe");
			return (Criteria) this;
		}

		public Criteria andDescuentoIsNull() {
			addCriterion("descuento is null");
			return (Criteria) this;
		}

		public Criteria andDescuentoIsNotNull() {
			addCriterion("descuento is not null");
			return (Criteria) this;
		}

		public Criteria andDescuentoEqualTo(BigDecimal value) {
			addCriterion("descuento =", value, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoNotEqualTo(BigDecimal value) {
			addCriterion("descuento <>", value, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoGreaterThan(BigDecimal value) {
			addCriterion("descuento >", value, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("descuento >=", value, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoLessThan(BigDecimal value) {
			addCriterion("descuento <", value, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("descuento <=", value, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoIn(List<BigDecimal> values) {
			addCriterion("descuento in", values, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoNotIn(List<BigDecimal> values) {
			addCriterion("descuento not in", values, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("descuento between", value1, value2, "descuento");
			return (Criteria) this;
		}

		public Criteria andDescuentoNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("descuento not between", value1, value2, "descuento");
			return (Criteria) this;
		}

		public Criteria andVentaIsNull() {
			addCriterion("venta is null");
			return (Criteria) this;
		}

		public Criteria andVentaIsNotNull() {
			addCriterion("venta is not null");
			return (Criteria) this;
		}

		public Criteria andVentaEqualTo(BigDecimal value) {
			addCriterion("venta =", value, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaNotEqualTo(BigDecimal value) {
			addCriterion("venta <>", value, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaGreaterThan(BigDecimal value) {
			addCriterion("venta >", value, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("venta >=", value, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaLessThan(BigDecimal value) {
			addCriterion("venta <", value, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaLessThanOrEqualTo(BigDecimal value) {
			addCriterion("venta <=", value, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaIn(List<BigDecimal> values) {
			addCriterion("venta in", values, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaNotIn(List<BigDecimal> values) {
			addCriterion("venta not in", values, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("venta between", value1, value2, "venta");
			return (Criteria) this;
		}

		public Criteria andVentaNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("venta not between", value1, value2, "venta");
			return (Criteria) this;
		}

		public Criteria andIgvIsNull() {
			addCriterion("igv is null");
			return (Criteria) this;
		}

		public Criteria andIgvIsNotNull() {
			addCriterion("igv is not null");
			return (Criteria) this;
		}

		public Criteria andIgvEqualTo(BigDecimal value) {
			addCriterion("igv =", value, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvNotEqualTo(BigDecimal value) {
			addCriterion("igv <>", value, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvGreaterThan(BigDecimal value) {
			addCriterion("igv >", value, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("igv >=", value, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvLessThan(BigDecimal value) {
			addCriterion("igv <", value, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvLessThanOrEqualTo(BigDecimal value) {
			addCriterion("igv <=", value, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvIn(List<BigDecimal> values) {
			addCriterion("igv in", values, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvNotIn(List<BigDecimal> values) {
			addCriterion("igv not in", values, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("igv between", value1, value2, "igv");
			return (Criteria) this;
		}

		public Criteria andIgvNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("igv not between", value1, value2, "igv");
			return (Criteria) this;
		}

		public Criteria andTotalIsNull() {
			addCriterion("total is null");
			return (Criteria) this;
		}

		public Criteria andTotalIsNotNull() {
			addCriterion("total is not null");
			return (Criteria) this;
		}

		public Criteria andTotalEqualTo(BigDecimal value) {
			addCriterion("total =", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotEqualTo(BigDecimal value) {
			addCriterion("total <>", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalGreaterThan(BigDecimal value) {
			addCriterion("total >", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("total >=", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalLessThan(BigDecimal value) {
			addCriterion("total <", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
			addCriterion("total <=", value, "total");
			return (Criteria) this;
		}

		public Criteria andTotalIn(List<BigDecimal> values) {
			addCriterion("total in", values, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotIn(List<BigDecimal> values) {
			addCriterion("total not in", values, "total");
			return (Criteria) this;
		}

		public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("total between", value1, value2, "total");
			return (Criteria) this;
		}

		public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("total not between", value1, value2, "total");
			return (Criteria) this;
		}

		public Criteria andCoserieIsNull() {
			addCriterion("coserie is null");
			return (Criteria) this;
		}

		public Criteria andCoserieIsNotNull() {
			addCriterion("coserie is not null");
			return (Criteria) this;
		}

		public Criteria andCoserieEqualTo(String value) {
			addCriterion("coserie =", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieNotEqualTo(String value) {
			addCriterion("coserie <>", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieGreaterThan(String value) {
			addCriterion("coserie >", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieGreaterThanOrEqualTo(String value) {
			addCriterion("coserie >=", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieLessThan(String value) {
			addCriterion("coserie <", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieLessThanOrEqualTo(String value) {
			addCriterion("coserie <=", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieLike(String value) {
			addCriterion("coserie like", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieNotLike(String value) {
			addCriterion("coserie not like", value, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieIn(List<String> values) {
			addCriterion("coserie in", values, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieNotIn(List<String> values) {
			addCriterion("coserie not in", values, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieBetween(String value1, String value2) {
			addCriterion("coserie between", value1, value2, "coserie");
			return (Criteria) this;
		}

		public Criteria andCoserieNotBetween(String value1, String value2) {
			addCriterion("coserie not between", value1, value2, "coserie");
			return (Criteria) this;
		}

		public Criteria andConumeroIsNull() {
			addCriterion("conumero is null");
			return (Criteria) this;
		}

		public Criteria andConumeroIsNotNull() {
			addCriterion("conumero is not null");
			return (Criteria) this;
		}

		public Criteria andConumeroEqualTo(Integer value) {
			addCriterion("conumero =", value, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroNotEqualTo(Integer value) {
			addCriterion("conumero <>", value, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroGreaterThan(Integer value) {
			addCriterion("conumero >", value, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroGreaterThanOrEqualTo(Integer value) {
			addCriterion("conumero >=", value, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroLessThan(Integer value) {
			addCriterion("conumero <", value, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroLessThanOrEqualTo(Integer value) {
			addCriterion("conumero <=", value, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroIn(List<Integer> values) {
			addCriterion("conumero in", values, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroNotIn(List<Integer> values) {
			addCriterion("conumero not in", values, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroBetween(Integer value1, Integer value2) {
			addCriterion("conumero between", value1, value2, "conumero");
			return (Criteria) this;
		}

		public Criteria andConumeroNotBetween(Integer value1, Integer value2) {
			addCriterion("conumero not between", value1, value2, "conumero");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorIsNull() {
			addCriterion("codtipooperador is null");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorIsNotNull() {
			addCriterion("codtipooperador is not null");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorEqualTo(String value) {
			addCriterion("codtipooperador =", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorNotEqualTo(String value) {
			addCriterion("codtipooperador <>", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorGreaterThan(String value) {
			addCriterion("codtipooperador >", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorGreaterThanOrEqualTo(String value) {
			addCriterion("codtipooperador >=", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorLessThan(String value) {
			addCriterion("codtipooperador <", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorLessThanOrEqualTo(String value) {
			addCriterion("codtipooperador <=", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorLike(String value) {
			addCriterion("codtipooperador like", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorNotLike(String value) {
			addCriterion("codtipooperador not like", value, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorIn(List<String> values) {
			addCriterion("codtipooperador in", values, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorNotIn(List<String> values) {
			addCriterion("codtipooperador not in", values, "codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorBetween(String value1, String value2) {
			addCriterion("codtipooperador between", value1, value2,
					"codtipooperador");
			return (Criteria) this;
		}

		public Criteria andCodtipooperadorNotBetween(String value1,
				String value2) {
			addCriterion("codtipooperador not between", value1, value2,
					"codtipooperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorIsNull() {
			addCriterion("seoperador is null");
			return (Criteria) this;
		}

		public Criteria andSeoperadorIsNotNull() {
			addCriterion("seoperador is not null");
			return (Criteria) this;
		}

		public Criteria andSeoperadorEqualTo(String value) {
			addCriterion("seoperador =", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorNotEqualTo(String value) {
			addCriterion("seoperador <>", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorGreaterThan(String value) {
			addCriterion("seoperador >", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorGreaterThanOrEqualTo(String value) {
			addCriterion("seoperador >=", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorLessThan(String value) {
			addCriterion("seoperador <", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorLessThanOrEqualTo(String value) {
			addCriterion("seoperador <=", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorLike(String value) {
			addCriterion("seoperador like", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorNotLike(String value) {
			addCriterion("seoperador not like", value, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorIn(List<String> values) {
			addCriterion("seoperador in", values, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorNotIn(List<String> values) {
			addCriterion("seoperador not in", values, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorBetween(String value1, String value2) {
			addCriterion("seoperador between", value1, value2, "seoperador");
			return (Criteria) this;
		}

		public Criteria andSeoperadorNotBetween(String value1, String value2) {
			addCriterion("seoperador not between", value1, value2, "seoperador");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaIsNull() {
			addCriterion("tarifa_urbana is null");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaIsNotNull() {
			addCriterion("tarifa_urbana is not null");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaEqualTo(BigDecimal value) {
			addCriterion("tarifa_urbana =", value, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaNotEqualTo(BigDecimal value) {
			addCriterion("tarifa_urbana <>", value, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaGreaterThan(BigDecimal value) {
			addCriterion("tarifa_urbana >", value, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_urbana >=", value, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaLessThan(BigDecimal value) {
			addCriterion("tarifa_urbana <", value, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_urbana <=", value, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaIn(List<BigDecimal> values) {
			addCriterion("tarifa_urbana in", values, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaNotIn(List<BigDecimal> values) {
			addCriterion("tarifa_urbana not in", values, "tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_urbana between", value1, value2,
					"tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaUrbanaNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_urbana not between", value1, value2,
					"tarifaUrbana");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaIsNull() {
			addCriterion("tarifa_periferica is null");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaIsNotNull() {
			addCriterion("tarifa_periferica is not null");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaEqualTo(BigDecimal value) {
			addCriterion("tarifa_periferica =", value, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaNotEqualTo(BigDecimal value) {
			addCriterion("tarifa_periferica <>", value, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaGreaterThan(BigDecimal value) {
			addCriterion("tarifa_periferica >", value, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_periferica >=", value, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaLessThan(BigDecimal value) {
			addCriterion("tarifa_periferica <", value, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_periferica <=", value, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaIn(List<BigDecimal> values) {
			addCriterion("tarifa_periferica in", values, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaNotIn(List<BigDecimal> values) {
			addCriterion("tarifa_periferica not in", values, "tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_periferica between", value1, value2,
					"tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaPerifericaNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_periferica not between", value1, value2,
					"tarifaPeriferica");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaIsNull() {
			addCriterion("tarifa_extrema is null");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaIsNotNull() {
			addCriterion("tarifa_extrema is not null");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaEqualTo(BigDecimal value) {
			addCriterion("tarifa_extrema =", value, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaNotEqualTo(BigDecimal value) {
			addCriterion("tarifa_extrema <>", value, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaGreaterThan(BigDecimal value) {
			addCriterion("tarifa_extrema >", value, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_extrema >=", value, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaLessThan(BigDecimal value) {
			addCriterion("tarifa_extrema <", value, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_extrema <=", value, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaIn(List<BigDecimal> values) {
			addCriterion("tarifa_extrema in", values, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaNotIn(List<BigDecimal> values) {
			addCriterion("tarifa_extrema not in", values, "tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_extrema between", value1, value2,
					"tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andTarifaExtremaNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_extrema not between", value1, value2,
					"tarifaExtrema");
			return (Criteria) this;
		}

		public Criteria andInafectoIsNull() {
			addCriterion("inafecto is null");
			return (Criteria) this;
		}

		public Criteria andInafectoIsNotNull() {
			addCriterion("inafecto is not null");
			return (Criteria) this;
		}

		public Criteria andInafectoEqualTo(BigDecimal value) {
			addCriterion("inafecto =", value, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoNotEqualTo(BigDecimal value) {
			addCriterion("inafecto <>", value, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoGreaterThan(BigDecimal value) {
			addCriterion("inafecto >", value, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("inafecto >=", value, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoLessThan(BigDecimal value) {
			addCriterion("inafecto <", value, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("inafecto <=", value, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoIn(List<BigDecimal> values) {
			addCriterion("inafecto in", values, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoNotIn(List<BigDecimal> values) {
			addCriterion("inafecto not in", values, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("inafecto between", value1, value2, "inafecto");
			return (Criteria) this;
		}

		public Criteria andInafectoNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("inafecto not between", value1, value2, "inafecto");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionIsNull() {
			addCriterion("tipocotizacion is null");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionIsNotNull() {
			addCriterion("tipocotizacion is not null");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionEqualTo(Short value) {
			addCriterion("tipocotizacion =", value, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionNotEqualTo(Short value) {
			addCriterion("tipocotizacion <>", value, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionGreaterThan(Short value) {
			addCriterion("tipocotizacion >", value, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionGreaterThanOrEqualTo(Short value) {
			addCriterion("tipocotizacion >=", value, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionLessThan(Short value) {
			addCriterion("tipocotizacion <", value, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionLessThanOrEqualTo(Short value) {
			addCriterion("tipocotizacion <=", value, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionIn(List<Short> values) {
			addCriterion("tipocotizacion in", values, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionNotIn(List<Short> values) {
			addCriterion("tipocotizacion not in", values, "tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionBetween(Short value1, Short value2) {
			addCriterion("tipocotizacion between", value1, value2,
					"tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andTipocotizacionNotBetween(Short value1, Short value2) {
			addCriterion("tipocotizacion not between", value1, value2,
					"tipocotizacion");
			return (Criteria) this;
		}

		public Criteria andMonedaIsNull() {
			addCriterion("moneda is null");
			return (Criteria) this;
		}

		public Criteria andMonedaIsNotNull() {
			addCriterion("moneda is not null");
			return (Criteria) this;
		}

		public Criteria andMonedaEqualTo(String value) {
			addCriterion("moneda =", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaNotEqualTo(String value) {
			addCriterion("moneda <>", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaGreaterThan(String value) {
			addCriterion("moneda >", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaGreaterThanOrEqualTo(String value) {
			addCriterion("moneda >=", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaLessThan(String value) {
			addCriterion("moneda <", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaLessThanOrEqualTo(String value) {
			addCriterion("moneda <=", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaLike(String value) {
			addCriterion("moneda like", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaNotLike(String value) {
			addCriterion("moneda not like", value, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaIn(List<String> values) {
			addCriterion("moneda in", values, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaNotIn(List<String> values) {
			addCriterion("moneda not in", values, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaBetween(String value1, String value2) {
			addCriterion("moneda between", value1, value2, "moneda");
			return (Criteria) this;
		}

		public Criteria andMonedaNotBetween(String value1, String value2) {
			addCriterion("moneda not between", value1, value2, "moneda");
			return (Criteria) this;
		}

		public Criteria andTipoCambioIsNull() {
			addCriterion("tipo_cambio is null");
			return (Criteria) this;
		}

		public Criteria andTipoCambioIsNotNull() {
			addCriterion("tipo_cambio is not null");
			return (Criteria) this;
		}

		public Criteria andTipoCambioEqualTo(BigDecimal value) {
			addCriterion("tipo_cambio =", value, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioNotEqualTo(BigDecimal value) {
			addCriterion("tipo_cambio <>", value, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioGreaterThan(BigDecimal value) {
			addCriterion("tipo_cambio >", value, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tipo_cambio >=", value, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioLessThan(BigDecimal value) {
			addCriterion("tipo_cambio <", value, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tipo_cambio <=", value, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioIn(List<BigDecimal> values) {
			addCriterion("tipo_cambio in", values, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioNotIn(List<BigDecimal> values) {
			addCriterion("tipo_cambio not in", values, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tipo_cambio between", value1, value2, "tipoCambio");
			return (Criteria) this;
		}

		public Criteria andTipoCambioNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tipo_cambio not between", value1, value2,
					"tipoCambio");
			return (Criteria) this;
		}

		public Criteria andFacNumeroIsNull() {
			addCriterion("fac_numero is null");
			return (Criteria) this;
		}

		public Criteria andFacNumeroIsNotNull() {
			addCriterion("fac_numero is not null");
			return (Criteria) this;
		}

		public Criteria andFacNumeroEqualTo(Integer value) {
			addCriterion("fac_numero =", value, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroNotEqualTo(Integer value) {
			addCriterion("fac_numero <>", value, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroGreaterThan(Integer value) {
			addCriterion("fac_numero >", value, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroGreaterThanOrEqualTo(Integer value) {
			addCriterion("fac_numero >=", value, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroLessThan(Integer value) {
			addCriterion("fac_numero <", value, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroLessThanOrEqualTo(Integer value) {
			addCriterion("fac_numero <=", value, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroIn(List<Integer> values) {
			addCriterion("fac_numero in", values, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroNotIn(List<Integer> values) {
			addCriterion("fac_numero not in", values, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroBetween(Integer value1, Integer value2) {
			addCriterion("fac_numero between", value1, value2, "facNumero");
			return (Criteria) this;
		}

		public Criteria andFacNumeroNotBetween(Integer value1, Integer value2) {
			addCriterion("fac_numero not between", value1, value2, "facNumero");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoIsNull() {
			addCriterion("tipodocumento is null");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoIsNotNull() {
			addCriterion("tipodocumento is not null");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoEqualTo(String value) {
			addCriterion("tipodocumento =", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoNotEqualTo(String value) {
			addCriterion("tipodocumento <>", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoGreaterThan(String value) {
			addCriterion("tipodocumento >", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoGreaterThanOrEqualTo(String value) {
			addCriterion("tipodocumento >=", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoLessThan(String value) {
			addCriterion("tipodocumento <", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoLessThanOrEqualTo(String value) {
			addCriterion("tipodocumento <=", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoLike(String value) {
			addCriterion("tipodocumento like", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoNotLike(String value) {
			addCriterion("tipodocumento not like", value, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoIn(List<String> values) {
			addCriterion("tipodocumento in", values, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoNotIn(List<String> values) {
			addCriterion("tipodocumento not in", values, "tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoBetween(String value1, String value2) {
			addCriterion("tipodocumento between", value1, value2,
					"tipodocumento");
			return (Criteria) this;
		}

		public Criteria andTipodocumentoNotBetween(String value1, String value2) {
			addCriterion("tipodocumento not between", value1, value2,
					"tipodocumento");
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

		public Criteria andGrupoIsNull() {
			addCriterion("grupo is null");
			return (Criteria) this;
		}

		public Criteria andGrupoIsNotNull() {
			addCriterion("grupo is not null");
			return (Criteria) this;
		}

		public Criteria andGrupoEqualTo(String value) {
			addCriterion("grupo =", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoNotEqualTo(String value) {
			addCriterion("grupo <>", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoGreaterThan(String value) {
			addCriterion("grupo >", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoGreaterThanOrEqualTo(String value) {
			addCriterion("grupo >=", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoLessThan(String value) {
			addCriterion("grupo <", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoLessThanOrEqualTo(String value) {
			addCriterion("grupo <=", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoLike(String value) {
			addCriterion("grupo like", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoNotLike(String value) {
			addCriterion("grupo not like", value, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoIn(List<String> values) {
			addCriterion("grupo in", values, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoNotIn(List<String> values) {
			addCriterion("grupo not in", values, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoBetween(String value1, String value2) {
			addCriterion("grupo between", value1, value2, "grupo");
			return (Criteria) this;
		}

		public Criteria andGrupoNotBetween(String value1, String value2) {
			addCriterion("grupo not between", value1, value2, "grupo");
			return (Criteria) this;
		}

		public Criteria andCodorigenIsNull() {
			addCriterion("codorigen is null");
			return (Criteria) this;
		}

		public Criteria andCodorigenIsNotNull() {
			addCriterion("codorigen is not null");
			return (Criteria) this;
		}

		public Criteria andCodorigenEqualTo(String value) {
			addCriterion("codorigen =", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenNotEqualTo(String value) {
			addCriterion("codorigen <>", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenGreaterThan(String value) {
			addCriterion("codorigen >", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenGreaterThanOrEqualTo(String value) {
			addCriterion("codorigen >=", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenLessThan(String value) {
			addCriterion("codorigen <", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenLessThanOrEqualTo(String value) {
			addCriterion("codorigen <=", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenLike(String value) {
			addCriterion("codorigen like", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenNotLike(String value) {
			addCriterion("codorigen not like", value, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenIn(List<String> values) {
			addCriterion("codorigen in", values, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenNotIn(List<String> values) {
			addCriterion("codorigen not in", values, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenBetween(String value1, String value2) {
			addCriterion("codorigen between", value1, value2, "codorigen");
			return (Criteria) this;
		}

		public Criteria andCodorigenNotBetween(String value1, String value2) {
			addCriterion("codorigen not between", value1, value2, "codorigen");
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

		public Criteria andImportePlusIsNull() {
			addCriterion("importe_plus is null");
			return (Criteria) this;
		}

		public Criteria andImportePlusIsNotNull() {
			addCriterion("importe_plus is not null");
			return (Criteria) this;
		}

		public Criteria andImportePlusEqualTo(BigDecimal value) {
			addCriterion("importe_plus =", value, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusNotEqualTo(BigDecimal value) {
			addCriterion("importe_plus <>", value, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusGreaterThan(BigDecimal value) {
			addCriterion("importe_plus >", value, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("importe_plus >=", value, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusLessThan(BigDecimal value) {
			addCriterion("importe_plus <", value, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusLessThanOrEqualTo(BigDecimal value) {
			addCriterion("importe_plus <=", value, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusIn(List<BigDecimal> values) {
			addCriterion("importe_plus in", values, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusNotIn(List<BigDecimal> values) {
			addCriterion("importe_plus not in", values, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("importe_plus between", value1, value2, "importePlus");
			return (Criteria) this;
		}

		public Criteria andImportePlusNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("importe_plus not between", value1, value2,
					"importePlus");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalIsNull() {
			addCriterion("tarifa_adicional is null");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalIsNotNull() {
			addCriterion("tarifa_adicional is not null");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalEqualTo(BigDecimal value) {
			addCriterion("tarifa_adicional =", value, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalNotEqualTo(BigDecimal value) {
			addCriterion("tarifa_adicional <>", value, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalGreaterThan(BigDecimal value) {
			addCriterion("tarifa_adicional >", value, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_adicional >=", value, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalLessThan(BigDecimal value) {
			addCriterion("tarifa_adicional <", value, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalLessThanOrEqualTo(BigDecimal value) {
			addCriterion("tarifa_adicional <=", value, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalIn(List<BigDecimal> values) {
			addCriterion("tarifa_adicional in", values, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalNotIn(List<BigDecimal> values) {
			addCriterion("tarifa_adicional not in", values, "tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_adicional between", value1, value2,
					"tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andTarifaAdicionalNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("tarifa_adicional not between", value1, value2,
					"tarifaAdicional");
			return (Criteria) this;
		}

		public Criteria andImporteServicioIsNull() {
			addCriterion("importe_servicio is null");
			return (Criteria) this;
		}

		public Criteria andImporteServicioIsNotNull() {
			addCriterion("importe_servicio is not null");
			return (Criteria) this;
		}

		public Criteria andImporteServicioEqualTo(BigDecimal value) {
			addCriterion("importe_servicio =", value, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioNotEqualTo(BigDecimal value) {
			addCriterion("importe_servicio <>", value, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioGreaterThan(BigDecimal value) {
			addCriterion("importe_servicio >", value, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("importe_servicio >=", value, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioLessThan(BigDecimal value) {
			addCriterion("importe_servicio <", value, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioLessThanOrEqualTo(BigDecimal value) {
			addCriterion("importe_servicio <=", value, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioIn(List<BigDecimal> values) {
			addCriterion("importe_servicio in", values, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioNotIn(List<BigDecimal> values) {
			addCriterion("importe_servicio not in", values, "importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("importe_servicio between", value1, value2,
					"importeServicio");
			return (Criteria) this;
		}

		public Criteria andImporteServicioNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("importe_servicio not between", value1, value2,
					"importeServicio");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoIsNull() {
			addCriterion("importe_periferico is null");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoIsNotNull() {
			addCriterion("importe_periferico is not null");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoEqualTo(BigDecimal value) {
			addCriterion("importe_periferico =", value, "importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoNotEqualTo(BigDecimal value) {
			addCriterion("importe_periferico <>", value, "importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoGreaterThan(BigDecimal value) {
			addCriterion("importe_periferico >", value, "importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("importe_periferico >=", value, "importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoLessThan(BigDecimal value) {
			addCriterion("importe_periferico <", value, "importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("importe_periferico <=", value, "importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoIn(List<BigDecimal> values) {
			addCriterion("importe_periferico in", values, "importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoNotIn(List<BigDecimal> values) {
			addCriterion("importe_periferico not in", values,
					"importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("importe_periferico between", value1, value2,
					"importePeriferico");
			return (Criteria) this;
		}

		public Criteria andImportePerifericoNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("importe_periferico not between", value1, value2,
					"importePeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoIsNull() {
			addCriterion("monto_periferico is null");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoIsNotNull() {
			addCriterion("monto_periferico is not null");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoEqualTo(BigDecimal value) {
			addCriterion("monto_periferico =", value, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoNotEqualTo(BigDecimal value) {
			addCriterion("monto_periferico <>", value, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoGreaterThan(BigDecimal value) {
			addCriterion("monto_periferico >", value, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("monto_periferico >=", value, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoLessThan(BigDecimal value) {
			addCriterion("monto_periferico <", value, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("monto_periferico <=", value, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoIn(List<BigDecimal> values) {
			addCriterion("monto_periferico in", values, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoNotIn(List<BigDecimal> values) {
			addCriterion("monto_periferico not in", values, "montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("monto_periferico between", value1, value2,
					"montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andMontoPerifericoNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("monto_periferico not between", value1, value2,
					"montoPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoIsNull() {
			addCriterion("cnt_periferico is null");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoIsNotNull() {
			addCriterion("cnt_periferico is not null");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoEqualTo(Long value) {
			addCriterion("cnt_periferico =", value, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoNotEqualTo(Long value) {
			addCriterion("cnt_periferico <>", value, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoGreaterThan(Long value) {
			addCriterion("cnt_periferico >", value, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoGreaterThanOrEqualTo(Long value) {
			addCriterion("cnt_periferico >=", value, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoLessThan(Long value) {
			addCriterion("cnt_periferico <", value, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoLessThanOrEqualTo(Long value) {
			addCriterion("cnt_periferico <=", value, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoIn(List<Long> values) {
			addCriterion("cnt_periferico in", values, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoNotIn(List<Long> values) {
			addCriterion("cnt_periferico not in", values, "cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoBetween(Long value1, Long value2) {
			addCriterion("cnt_periferico between", value1, value2,
					"cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCntPerifericoNotBetween(Long value1, Long value2) {
			addCriterion("cnt_periferico not between", value1, value2,
					"cntPeriferico");
			return (Criteria) this;
		}

		public Criteria andCodtrackingIsNull() {
			addCriterion("codtracking is null");
			return (Criteria) this;
		}

		public Criteria andCodtrackingIsNotNull() {
			addCriterion("codtracking is not null");
			return (Criteria) this;
		}

		public Criteria andCodtrackingEqualTo(Short value) {
			addCriterion("codtracking =", value, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingNotEqualTo(Short value) {
			addCriterion("codtracking <>", value, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingGreaterThan(Short value) {
			addCriterion("codtracking >", value, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingGreaterThanOrEqualTo(Short value) {
			addCriterion("codtracking >=", value, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingLessThan(Short value) {
			addCriterion("codtracking <", value, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingLessThanOrEqualTo(Short value) {
			addCriterion("codtracking <=", value, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingIn(List<Short> values) {
			addCriterion("codtracking in", values, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingNotIn(List<Short> values) {
			addCriterion("codtracking not in", values, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingBetween(Short value1, Short value2) {
			addCriterion("codtracking between", value1, value2, "codtracking");
			return (Criteria) this;
		}

		public Criteria andCodtrackingNotBetween(Short value1, Short value2) {
			addCriterion("codtracking not between", value1, value2,
					"codtracking");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoIsNull() {
			addCriterion("usuario_recojo is null");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoIsNotNull() {
			addCriterion("usuario_recojo is not null");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoEqualTo(String value) {
			addCriterion("usuario_recojo =", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoNotEqualTo(String value) {
			addCriterion("usuario_recojo <>", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoGreaterThan(String value) {
			addCriterion("usuario_recojo >", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoGreaterThanOrEqualTo(String value) {
			addCriterion("usuario_recojo >=", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoLessThan(String value) {
			addCriterion("usuario_recojo <", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoLessThanOrEqualTo(String value) {
			addCriterion("usuario_recojo <=", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoLike(String value) {
			addCriterion("usuario_recojo like", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoNotLike(String value) {
			addCriterion("usuario_recojo not like", value, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoIn(List<String> values) {
			addCriterion("usuario_recojo in", values, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoNotIn(List<String> values) {
			addCriterion("usuario_recojo not in", values, "usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoBetween(String value1, String value2) {
			addCriterion("usuario_recojo between", value1, value2,
					"usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andUsuarioRecojoNotBetween(String value1, String value2) {
			addCriterion("usuario_recojo not between", value1, value2,
					"usuarioRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoIsNull() {
			addCriterion("fecha_recojo is null");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoIsNotNull() {
			addCriterion("fecha_recojo is not null");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoEqualTo(Date value) {
			addCriterion("fecha_recojo =", value, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoNotEqualTo(Date value) {
			addCriterion("fecha_recojo <>", value, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoGreaterThan(Date value) {
			addCriterion("fecha_recojo >", value, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha_recojo >=", value, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoLessThan(Date value) {
			addCriterion("fecha_recojo <", value, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoLessThanOrEqualTo(Date value) {
			addCriterion("fecha_recojo <=", value, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoIn(List<Date> values) {
			addCriterion("fecha_recojo in", values, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoNotIn(List<Date> values) {
			addCriterion("fecha_recojo not in", values, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoBetween(Date value1, Date value2) {
			addCriterion("fecha_recojo between", value1, value2, "fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFechaRecojoNotBetween(Date value1, Date value2) {
			addCriterion("fecha_recojo not between", value1, value2,
					"fechaRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoIsNull() {
			addCriterion("flag_recojo is null");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoIsNotNull() {
			addCriterion("flag_recojo is not null");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoEqualTo(Short value) {
			addCriterion("flag_recojo =", value, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoNotEqualTo(Short value) {
			addCriterion("flag_recojo <>", value, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoGreaterThan(Short value) {
			addCriterion("flag_recojo >", value, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoGreaterThanOrEqualTo(Short value) {
			addCriterion("flag_recojo >=", value, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoLessThan(Short value) {
			addCriterion("flag_recojo <", value, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoLessThanOrEqualTo(Short value) {
			addCriterion("flag_recojo <=", value, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoIn(List<Short> values) {
			addCriterion("flag_recojo in", values, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoNotIn(List<Short> values) {
			addCriterion("flag_recojo not in", values, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoBetween(Short value1, Short value2) {
			addCriterion("flag_recojo between", value1, value2, "flagRecojo");
			return (Criteria) this;
		}

		public Criteria andFlagRecojoNotBetween(Short value1, Short value2) {
			addCriterion("flag_recojo not between", value1, value2,
					"flagRecojo");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenIsNull() {
			addCriterion("tipo_pago_orden is null");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenIsNotNull() {
			addCriterion("tipo_pago_orden is not null");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenEqualTo(Short value) {
			addCriterion("tipo_pago_orden =", value, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenNotEqualTo(Short value) {
			addCriterion("tipo_pago_orden <>", value, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenGreaterThan(Short value) {
			addCriterion("tipo_pago_orden >", value, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenGreaterThanOrEqualTo(Short value) {
			addCriterion("tipo_pago_orden >=", value, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenLessThan(Short value) {
			addCriterion("tipo_pago_orden <", value, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenLessThanOrEqualTo(Short value) {
			addCriterion("tipo_pago_orden <=", value, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenIn(List<Short> values) {
			addCriterion("tipo_pago_orden in", values, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenNotIn(List<Short> values) {
			addCriterion("tipo_pago_orden not in", values, "tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenBetween(Short value1, Short value2) {
			addCriterion("tipo_pago_orden between", value1, value2,
					"tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andTipoPagoOrdenNotBetween(Short value1, Short value2) {
			addCriterion("tipo_pago_orden not between", value1, value2,
					"tipoPagoOrden");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenIsNull() {
			addCriterion("ciudad_origen is null");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenIsNotNull() {
			addCriterion("ciudad_origen is not null");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenEqualTo(String value) {
			addCriterion("ciudad_origen =", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenNotEqualTo(String value) {
			addCriterion("ciudad_origen <>", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenGreaterThan(String value) {
			addCriterion("ciudad_origen >", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenGreaterThanOrEqualTo(String value) {
			addCriterion("ciudad_origen >=", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenLessThan(String value) {
			addCriterion("ciudad_origen <", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenLessThanOrEqualTo(String value) {
			addCriterion("ciudad_origen <=", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenLike(String value) {
			addCriterion("ciudad_origen like", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenNotLike(String value) {
			addCriterion("ciudad_origen not like", value, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenIn(List<String> values) {
			addCriterion("ciudad_origen in", values, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenNotIn(List<String> values) {
			addCriterion("ciudad_origen not in", values, "ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenBetween(String value1, String value2) {
			addCriterion("ciudad_origen between", value1, value2,
					"ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadOrigenNotBetween(String value1, String value2) {
			addCriterion("ciudad_origen not between", value1, value2,
					"ciudadOrigen");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoIsNull() {
			addCriterion("ciudad_destino is null");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoIsNotNull() {
			addCriterion("ciudad_destino is not null");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoEqualTo(String value) {
			addCriterion("ciudad_destino =", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoNotEqualTo(String value) {
			addCriterion("ciudad_destino <>", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoGreaterThan(String value) {
			addCriterion("ciudad_destino >", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoGreaterThanOrEqualTo(String value) {
			addCriterion("ciudad_destino >=", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoLessThan(String value) {
			addCriterion("ciudad_destino <", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoLessThanOrEqualTo(String value) {
			addCriterion("ciudad_destino <=", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoLike(String value) {
			addCriterion("ciudad_destino like", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoNotLike(String value) {
			addCriterion("ciudad_destino not like", value, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoIn(List<String> values) {
			addCriterion("ciudad_destino in", values, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoNotIn(List<String> values) {
			addCriterion("ciudad_destino not in", values, "ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoBetween(String value1, String value2) {
			addCriterion("ciudad_destino between", value1, value2,
					"ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andCiudadDestinoNotBetween(String value1, String value2) {
			addCriterion("ciudad_destino not between", value1, value2,
					"ciudadDestino");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoIsNull() {
			addCriterion("valor_declarado is null");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoIsNotNull() {
			addCriterion("valor_declarado is not null");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoEqualTo(BigDecimal value) {
			addCriterion("valor_declarado =", value, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoNotEqualTo(BigDecimal value) {
			addCriterion("valor_declarado <>", value, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoGreaterThan(BigDecimal value) {
			addCriterion("valor_declarado >", value, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("valor_declarado >=", value, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoLessThan(BigDecimal value) {
			addCriterion("valor_declarado <", value, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("valor_declarado <=", value, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoIn(List<BigDecimal> values) {
			addCriterion("valor_declarado in", values, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoNotIn(List<BigDecimal> values) {
			addCriterion("valor_declarado not in", values, "valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("valor_declarado between", value1, value2,
					"valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andValorDeclaradoNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("valor_declarado not between", value1, value2,
					"valorDeclarado");
			return (Criteria) this;
		}

		public Criteria andPrioridadIsNull() {
			addCriterion("prioridad is null");
			return (Criteria) this;
		}

		public Criteria andPrioridadIsNotNull() {
			addCriterion("prioridad is not null");
			return (Criteria) this;
		}

		public Criteria andPrioridadEqualTo(String value) {
			addCriterion("prioridad =", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadNotEqualTo(String value) {
			addCriterion("prioridad <>", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadGreaterThan(String value) {
			addCriterion("prioridad >", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadGreaterThanOrEqualTo(String value) {
			addCriterion("prioridad >=", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadLessThan(String value) {
			addCriterion("prioridad <", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadLessThanOrEqualTo(String value) {
			addCriterion("prioridad <=", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadLike(String value) {
			addCriterion("prioridad like", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadNotLike(String value) {
			addCriterion("prioridad not like", value, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadIn(List<String> values) {
			addCriterion("prioridad in", values, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadNotIn(List<String> values) {
			addCriterion("prioridad not in", values, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadBetween(String value1, String value2) {
			addCriterion("prioridad between", value1, value2, "prioridad");
			return (Criteria) this;
		}

		public Criteria andPrioridadNotBetween(String value1, String value2) {
			addCriterion("prioridad not between", value1, value2, "prioridad");
			return (Criteria) this;
		}

		public Criteria andNrooperadorIsNull() {
			addCriterion("nrooperador is null");
			return (Criteria) this;
		}

		public Criteria andNrooperadorIsNotNull() {
			addCriterion("nrooperador is not null");
			return (Criteria) this;
		}

		public Criteria andNrooperadorEqualTo(String value) {
			addCriterion("nrooperador =", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorNotEqualTo(String value) {
			addCriterion("nrooperador <>", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorGreaterThan(String value) {
			addCriterion("nrooperador >", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorGreaterThanOrEqualTo(String value) {
			addCriterion("nrooperador >=", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorLessThan(String value) {
			addCriterion("nrooperador <", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorLessThanOrEqualTo(String value) {
			addCriterion("nrooperador <=", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorLike(String value) {
			addCriterion("nrooperador like", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorNotLike(String value) {
			addCriterion("nrooperador not like", value, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorIn(List<String> values) {
			addCriterion("nrooperador in", values, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorNotIn(List<String> values) {
			addCriterion("nrooperador not in", values, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorBetween(String value1, String value2) {
			addCriterion("nrooperador between", value1, value2, "nrooperador");
			return (Criteria) this;
		}

		public Criteria andNrooperadorNotBetween(String value1, String value2) {
			addCriterion("nrooperador not between", value1, value2,
					"nrooperador");
			return (Criteria) this;
		}

		public Criteria andCodrecojoIsNull() {
			addCriterion("codrecojo is null");
			return (Criteria) this;
		}

		public Criteria andCodrecojoIsNotNull() {
			addCriterion("codrecojo is not null");
			return (Criteria) this;
		}

		public Criteria andCodrecojoEqualTo(String value) {
			addCriterion("codrecojo =", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoNotEqualTo(String value) {
			addCriterion("codrecojo <>", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoGreaterThan(String value) {
			addCriterion("codrecojo >", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoGreaterThanOrEqualTo(String value) {
			addCriterion("codrecojo >=", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoLessThan(String value) {
			addCriterion("codrecojo <", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoLessThanOrEqualTo(String value) {
			addCriterion("codrecojo <=", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoLike(String value) {
			addCriterion("codrecojo like", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoNotLike(String value) {
			addCriterion("codrecojo not like", value, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoIn(List<String> values) {
			addCriterion("codrecojo in", values, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoNotIn(List<String> values) {
			addCriterion("codrecojo not in", values, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoBetween(String value1, String value2) {
			addCriterion("codrecojo between", value1, value2, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodrecojoNotBetween(String value1, String value2) {
			addCriterion("codrecojo not between", value1, value2, "codrecojo");
			return (Criteria) this;
		}

		public Criteria andCodConformidadIsNull() {
			addCriterion("cod_conformidad is null");
			return (Criteria) this;
		}

		public Criteria andCodConformidadIsNotNull() {
			addCriterion("cod_conformidad is not null");
			return (Criteria) this;
		}

		public Criteria andCodConformidadEqualTo(String value) {
			addCriterion("cod_conformidad =", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadNotEqualTo(String value) {
			addCriterion("cod_conformidad <>", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadGreaterThan(String value) {
			addCriterion("cod_conformidad >", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadGreaterThanOrEqualTo(String value) {
			addCriterion("cod_conformidad >=", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadLessThan(String value) {
			addCriterion("cod_conformidad <", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadLessThanOrEqualTo(String value) {
			addCriterion("cod_conformidad <=", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadLike(String value) {
			addCriterion("cod_conformidad like", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadNotLike(String value) {
			addCriterion("cod_conformidad not like", value, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadIn(List<String> values) {
			addCriterion("cod_conformidad in", values, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadNotIn(List<String> values) {
			addCriterion("cod_conformidad not in", values, "codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadBetween(String value1, String value2) {
			addCriterion("cod_conformidad between", value1, value2,
					"codConformidad");
			return (Criteria) this;
		}

		public Criteria andCodConformidadNotBetween(String value1, String value2) {
			addCriterion("cod_conformidad not between", value1, value2,
					"codConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadIsNull() {
			addCriterion("obs_conformidad is null");
			return (Criteria) this;
		}

		public Criteria andObsConformidadIsNotNull() {
			addCriterion("obs_conformidad is not null");
			return (Criteria) this;
		}

		public Criteria andObsConformidadEqualTo(String value) {
			addCriterion("obs_conformidad =", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadNotEqualTo(String value) {
			addCriterion("obs_conformidad <>", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadGreaterThan(String value) {
			addCriterion("obs_conformidad >", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadGreaterThanOrEqualTo(String value) {
			addCriterion("obs_conformidad >=", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadLessThan(String value) {
			addCriterion("obs_conformidad <", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadLessThanOrEqualTo(String value) {
			addCriterion("obs_conformidad <=", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadLike(String value) {
			addCriterion("obs_conformidad like", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadNotLike(String value) {
			addCriterion("obs_conformidad not like", value, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadIn(List<String> values) {
			addCriterion("obs_conformidad in", values, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadNotIn(List<String> values) {
			addCriterion("obs_conformidad not in", values, "obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadBetween(String value1, String value2) {
			addCriterion("obs_conformidad between", value1, value2,
					"obsConformidad");
			return (Criteria) this;
		}

		public Criteria andObsConformidadNotBetween(String value1, String value2) {
			addCriterion("obs_conformidad not between", value1, value2,
					"obsConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadIsNull() {
			addCriterion("usu_conformidad is null");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadIsNotNull() {
			addCriterion("usu_conformidad is not null");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadEqualTo(String value) {
			addCriterion("usu_conformidad =", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadNotEqualTo(String value) {
			addCriterion("usu_conformidad <>", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadGreaterThan(String value) {
			addCriterion("usu_conformidad >", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadGreaterThanOrEqualTo(String value) {
			addCriterion("usu_conformidad >=", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadLessThan(String value) {
			addCriterion("usu_conformidad <", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadLessThanOrEqualTo(String value) {
			addCriterion("usu_conformidad <=", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadLike(String value) {
			addCriterion("usu_conformidad like", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadNotLike(String value) {
			addCriterion("usu_conformidad not like", value, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadIn(List<String> values) {
			addCriterion("usu_conformidad in", values, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadNotIn(List<String> values) {
			addCriterion("usu_conformidad not in", values, "usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadBetween(String value1, String value2) {
			addCriterion("usu_conformidad between", value1, value2,
					"usuConformidad");
			return (Criteria) this;
		}

		public Criteria andUsuConformidadNotBetween(String value1, String value2) {
			addCriterion("usu_conformidad not between", value1, value2,
					"usuConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadIsNull() {
			addCriterion("fec_conformidad is null");
			return (Criteria) this;
		}

		public Criteria andFecConformidadIsNotNull() {
			addCriterion("fec_conformidad is not null");
			return (Criteria) this;
		}

		public Criteria andFecConformidadEqualTo(Date value) {
			addCriterion("fec_conformidad =", value, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadNotEqualTo(Date value) {
			addCriterion("fec_conformidad <>", value, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadGreaterThan(Date value) {
			addCriterion("fec_conformidad >", value, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadGreaterThanOrEqualTo(Date value) {
			addCriterion("fec_conformidad >=", value, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadLessThan(Date value) {
			addCriterion("fec_conformidad <", value, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadLessThanOrEqualTo(Date value) {
			addCriterion("fec_conformidad <=", value, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadIn(List<Date> values) {
			addCriterion("fec_conformidad in", values, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadNotIn(List<Date> values) {
			addCriterion("fec_conformidad not in", values, "fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadBetween(Date value1, Date value2) {
			addCriterion("fec_conformidad between", value1, value2,
					"fecConformidad");
			return (Criteria) this;
		}

		public Criteria andFecConformidadNotBetween(Date value1, Date value2) {
			addCriterion("fec_conformidad not between", value1, value2,
					"fecConformidad");
			return (Criteria) this;
		}

		public Criteria andCodActivaIsNull() {
			addCriterion("cod_activa is null");
			return (Criteria) this;
		}

		public Criteria andCodActivaIsNotNull() {
			addCriterion("cod_activa is not null");
			return (Criteria) this;
		}

		public Criteria andCodActivaEqualTo(Short value) {
			addCriterion("cod_activa =", value, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaNotEqualTo(Short value) {
			addCriterion("cod_activa <>", value, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaGreaterThan(Short value) {
			addCriterion("cod_activa >", value, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaGreaterThanOrEqualTo(Short value) {
			addCriterion("cod_activa >=", value, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaLessThan(Short value) {
			addCriterion("cod_activa <", value, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaLessThanOrEqualTo(Short value) {
			addCriterion("cod_activa <=", value, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaIn(List<Short> values) {
			addCriterion("cod_activa in", values, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaNotIn(List<Short> values) {
			addCriterion("cod_activa not in", values, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaBetween(Short value1, Short value2) {
			addCriterion("cod_activa between", value1, value2, "codActiva");
			return (Criteria) this;
		}

		public Criteria andCodActivaNotBetween(Short value1, Short value2) {
			addCriterion("cod_activa not between", value1, value2, "codActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaIsNull() {
			addCriterion("ususario_activa is null");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaIsNotNull() {
			addCriterion("ususario_activa is not null");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaEqualTo(String value) {
			addCriterion("ususario_activa =", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaNotEqualTo(String value) {
			addCriterion("ususario_activa <>", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaGreaterThan(String value) {
			addCriterion("ususario_activa >", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaGreaterThanOrEqualTo(String value) {
			addCriterion("ususario_activa >=", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaLessThan(String value) {
			addCriterion("ususario_activa <", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaLessThanOrEqualTo(String value) {
			addCriterion("ususario_activa <=", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaLike(String value) {
			addCriterion("ususario_activa like", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaNotLike(String value) {
			addCriterion("ususario_activa not like", value, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaIn(List<String> values) {
			addCriterion("ususario_activa in", values, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaNotIn(List<String> values) {
			addCriterion("ususario_activa not in", values, "ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaBetween(String value1, String value2) {
			addCriterion("ususario_activa between", value1, value2,
					"ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andUsusarioActivaNotBetween(String value1, String value2) {
			addCriterion("ususario_activa not between", value1, value2,
					"ususarioActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaIsNull() {
			addCriterion("fecha_activa is null");
			return (Criteria) this;
		}

		public Criteria andFechaActivaIsNotNull() {
			addCriterion("fecha_activa is not null");
			return (Criteria) this;
		}

		public Criteria andFechaActivaEqualTo(Date value) {
			addCriterion("fecha_activa =", value, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaNotEqualTo(Date value) {
			addCriterion("fecha_activa <>", value, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaGreaterThan(Date value) {
			addCriterion("fecha_activa >", value, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha_activa >=", value, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaLessThan(Date value) {
			addCriterion("fecha_activa <", value, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaLessThanOrEqualTo(Date value) {
			addCriterion("fecha_activa <=", value, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaIn(List<Date> values) {
			addCriterion("fecha_activa in", values, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaNotIn(List<Date> values) {
			addCriterion("fecha_activa not in", values, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaBetween(Date value1, Date value2) {
			addCriterion("fecha_activa between", value1, value2, "fechaActiva");
			return (Criteria) this;
		}

		public Criteria andFechaActivaNotBetween(Date value1, Date value2) {
			addCriterion("fecha_activa not between", value1, value2,
					"fechaActiva");
			return (Criteria) this;
		}

		public Criteria andTTransporteIsNull() {
			addCriterion("t_transporte is null");
			return (Criteria) this;
		}

		public Criteria andTTransporteIsNotNull() {
			addCriterion("t_transporte is not null");
			return (Criteria) this;
		}

		public Criteria andTTransporteEqualTo(String value) {
			addCriterion("t_transporte =", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteNotEqualTo(String value) {
			addCriterion("t_transporte <>", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteGreaterThan(String value) {
			addCriterion("t_transporte >", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteGreaterThanOrEqualTo(String value) {
			addCriterion("t_transporte >=", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteLessThan(String value) {
			addCriterion("t_transporte <", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteLessThanOrEqualTo(String value) {
			addCriterion("t_transporte <=", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteLike(String value) {
			addCriterion("t_transporte like", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteNotLike(String value) {
			addCriterion("t_transporte not like", value, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteIn(List<String> values) {
			addCriterion("t_transporte in", values, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteNotIn(List<String> values) {
			addCriterion("t_transporte not in", values, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteBetween(String value1, String value2) {
			addCriterion("t_transporte between", value1, value2, "tTransporte");
			return (Criteria) this;
		}

		public Criteria andTTransporteNotBetween(String value1, String value2) {
			addCriterion("t_transporte not between", value1, value2,
					"tTransporte");
			return (Criteria) this;
		}

		public Criteria andSerieDevcIsNull() {
			addCriterion("serie_devc is null");
			return (Criteria) this;
		}

		public Criteria andSerieDevcIsNotNull() {
			addCriterion("serie_devc is not null");
			return (Criteria) this;
		}

		public Criteria andSerieDevcEqualTo(String value) {
			addCriterion("serie_devc =", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcNotEqualTo(String value) {
			addCriterion("serie_devc <>", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcGreaterThan(String value) {
			addCriterion("serie_devc >", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcGreaterThanOrEqualTo(String value) {
			addCriterion("serie_devc >=", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcLessThan(String value) {
			addCriterion("serie_devc <", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcLessThanOrEqualTo(String value) {
			addCriterion("serie_devc <=", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcLike(String value) {
			addCriterion("serie_devc like", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcNotLike(String value) {
			addCriterion("serie_devc not like", value, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcIn(List<String> values) {
			addCriterion("serie_devc in", values, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcNotIn(List<String> values) {
			addCriterion("serie_devc not in", values, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcBetween(String value1, String value2) {
			addCriterion("serie_devc between", value1, value2, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andSerieDevcNotBetween(String value1, String value2) {
			addCriterion("serie_devc not between", value1, value2, "serieDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcIsNull() {
			addCriterion("nro_devc is null");
			return (Criteria) this;
		}

		public Criteria andNroDevcIsNotNull() {
			addCriterion("nro_devc is not null");
			return (Criteria) this;
		}

		public Criteria andNroDevcEqualTo(String value) {
			addCriterion("nro_devc =", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcNotEqualTo(String value) {
			addCriterion("nro_devc <>", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcGreaterThan(String value) {
			addCriterion("nro_devc >", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcGreaterThanOrEqualTo(String value) {
			addCriterion("nro_devc >=", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcLessThan(String value) {
			addCriterion("nro_devc <", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcLessThanOrEqualTo(String value) {
			addCriterion("nro_devc <=", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcLike(String value) {
			addCriterion("nro_devc like", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcNotLike(String value) {
			addCriterion("nro_devc not like", value, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcIn(List<String> values) {
			addCriterion("nro_devc in", values, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcNotIn(List<String> values) {
			addCriterion("nro_devc not in", values, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcBetween(String value1, String value2) {
			addCriterion("nro_devc between", value1, value2, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andNroDevcNotBetween(String value1, String value2) {
			addCriterion("nro_devc not between", value1, value2, "nroDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcIsNull() {
			addCriterion("estado_devc is null");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcIsNotNull() {
			addCriterion("estado_devc is not null");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcEqualTo(String value) {
			addCriterion("estado_devc =", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcNotEqualTo(String value) {
			addCriterion("estado_devc <>", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcGreaterThan(String value) {
			addCriterion("estado_devc >", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcGreaterThanOrEqualTo(String value) {
			addCriterion("estado_devc >=", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcLessThan(String value) {
			addCriterion("estado_devc <", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcLessThanOrEqualTo(String value) {
			addCriterion("estado_devc <=", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcLike(String value) {
			addCriterion("estado_devc like", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcNotLike(String value) {
			addCriterion("estado_devc not like", value, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcIn(List<String> values) {
			addCriterion("estado_devc in", values, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcNotIn(List<String> values) {
			addCriterion("estado_devc not in", values, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcBetween(String value1, String value2) {
			addCriterion("estado_devc between", value1, value2, "estadoDevc");
			return (Criteria) this;
		}

		public Criteria andEstadoDevcNotBetween(String value1, String value2) {
			addCriterion("estado_devc not between", value1, value2,
					"estadoDevc");
			return (Criteria) this;
		}

		public Criteria andObservacion2IsNull() {
			addCriterion("observacion2 is null");
			return (Criteria) this;
		}

		public Criteria andObservacion2IsNotNull() {
			addCriterion("observacion2 is not null");
			return (Criteria) this;
		}

		public Criteria andObservacion2EqualTo(String value) {
			addCriterion("observacion2 =", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2NotEqualTo(String value) {
			addCriterion("observacion2 <>", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2GreaterThan(String value) {
			addCriterion("observacion2 >", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2GreaterThanOrEqualTo(String value) {
			addCriterion("observacion2 >=", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2LessThan(String value) {
			addCriterion("observacion2 <", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2LessThanOrEqualTo(String value) {
			addCriterion("observacion2 <=", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2Like(String value) {
			addCriterion("observacion2 like", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2NotLike(String value) {
			addCriterion("observacion2 not like", value, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2In(List<String> values) {
			addCriterion("observacion2 in", values, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2NotIn(List<String> values) {
			addCriterion("observacion2 not in", values, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2Between(String value1, String value2) {
			addCriterion("observacion2 between", value1, value2, "observacion2");
			return (Criteria) this;
		}

		public Criteria andObservacion2NotBetween(String value1, String value2) {
			addCriterion("observacion2 not between", value1, value2,
					"observacion2");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolIsNull() {
			addCriterion("serieguiasol is null");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolIsNotNull() {
			addCriterion("serieguiasol is not null");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolEqualTo(String value) {
			addCriterion("serieguiasol =", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolNotEqualTo(String value) {
			addCriterion("serieguiasol <>", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolGreaterThan(String value) {
			addCriterion("serieguiasol >", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolGreaterThanOrEqualTo(String value) {
			addCriterion("serieguiasol >=", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolLessThan(String value) {
			addCriterion("serieguiasol <", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolLessThanOrEqualTo(String value) {
			addCriterion("serieguiasol <=", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolLike(String value) {
			addCriterion("serieguiasol like", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolNotLike(String value) {
			addCriterion("serieguiasol not like", value, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolIn(List<String> values) {
			addCriterion("serieguiasol in", values, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolNotIn(List<String> values) {
			addCriterion("serieguiasol not in", values, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolBetween(String value1, String value2) {
			addCriterion("serieguiasol between", value1, value2, "serieguiasol");
			return (Criteria) this;
		}

		public Criteria andSerieguiasolNotBetween(String value1, String value2) {
			addCriterion("serieguiasol not between", value1, value2,
					"serieguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolIsNull() {
			addCriterion("nroguiasol is null");
			return (Criteria) this;
		}

		public Criteria andNroguiasolIsNotNull() {
			addCriterion("nroguiasol is not null");
			return (Criteria) this;
		}

		public Criteria andNroguiasolEqualTo(String value) {
			addCriterion("nroguiasol =", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolNotEqualTo(String value) {
			addCriterion("nroguiasol <>", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolGreaterThan(String value) {
			addCriterion("nroguiasol >", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolGreaterThanOrEqualTo(String value) {
			addCriterion("nroguiasol >=", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolLessThan(String value) {
			addCriterion("nroguiasol <", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolLessThanOrEqualTo(String value) {
			addCriterion("nroguiasol <=", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolLike(String value) {
			addCriterion("nroguiasol like", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolNotLike(String value) {
			addCriterion("nroguiasol not like", value, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolIn(List<String> values) {
			addCriterion("nroguiasol in", values, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolNotIn(List<String> values) {
			addCriterion("nroguiasol not in", values, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolBetween(String value1, String value2) {
			addCriterion("nroguiasol between", value1, value2, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andNroguiasolNotBetween(String value1, String value2) {
			addCriterion("nroguiasol not between", value1, value2, "nroguiasol");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenIsNull() {
			addCriterion("flag_tipo_orden is null");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenIsNotNull() {
			addCriterion("flag_tipo_orden is not null");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenEqualTo(Short value) {
			addCriterion("flag_tipo_orden =", value, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenNotEqualTo(Short value) {
			addCriterion("flag_tipo_orden <>", value, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenGreaterThan(Short value) {
			addCriterion("flag_tipo_orden >", value, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenGreaterThanOrEqualTo(Short value) {
			addCriterion("flag_tipo_orden >=", value, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenLessThan(Short value) {
			addCriterion("flag_tipo_orden <", value, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenLessThanOrEqualTo(Short value) {
			addCriterion("flag_tipo_orden <=", value, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenIn(List<Short> values) {
			addCriterion("flag_tipo_orden in", values, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenNotIn(List<Short> values) {
			addCriterion("flag_tipo_orden not in", values, "flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenBetween(Short value1, Short value2) {
			addCriterion("flag_tipo_orden between", value1, value2,
					"flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andFlagTipoOrdenNotBetween(Short value1, Short value2) {
			addCriterion("flag_tipo_orden not between", value1, value2,
					"flagTipoOrden");
			return (Criteria) this;
		}

		public Criteria andCodigoIsNull() {
			addCriterion("codigo is null");
			return (Criteria) this;
		}

		public Criteria andCodigoIsNotNull() {
			addCriterion("codigo is not null");
			return (Criteria) this;
		}

		public Criteria andCodigoEqualTo(String value) {
			addCriterion("codigo =", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotEqualTo(String value) {
			addCriterion("codigo <>", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoGreaterThan(String value) {
			addCriterion("codigo >", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoGreaterThanOrEqualTo(String value) {
			addCriterion("codigo >=", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoLessThan(String value) {
			addCriterion("codigo <", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoLessThanOrEqualTo(String value) {
			addCriterion("codigo <=", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoLike(String value) {
			addCriterion("codigo like", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotLike(String value) {
			addCriterion("codigo not like", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoIn(List<String> values) {
			addCriterion("codigo in", values, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotIn(List<String> values) {
			addCriterion("codigo not in", values, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoBetween(String value1, String value2) {
			addCriterion("codigo between", value1, value2, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotBetween(String value1, String value2) {
			addCriterion("codigo not between", value1, value2, "codigo");
			return (Criteria) this;
		}

		public Criteria andCntM3IsNull() {
			addCriterion("cnt_m3 is null");
			return (Criteria) this;
		}

		public Criteria andCntM3IsNotNull() {
			addCriterion("cnt_m3 is not null");
			return (Criteria) this;
		}

		public Criteria andCntM3EqualTo(Short value) {
			addCriterion("cnt_m3 =", value, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3NotEqualTo(Short value) {
			addCriterion("cnt_m3 <>", value, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3GreaterThan(Short value) {
			addCriterion("cnt_m3 >", value, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3GreaterThanOrEqualTo(Short value) {
			addCriterion("cnt_m3 >=", value, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3LessThan(Short value) {
			addCriterion("cnt_m3 <", value, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3LessThanOrEqualTo(Short value) {
			addCriterion("cnt_m3 <=", value, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3In(List<Short> values) {
			addCriterion("cnt_m3 in", values, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3NotIn(List<Short> values) {
			addCriterion("cnt_m3 not in", values, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3Between(Short value1, Short value2) {
			addCriterion("cnt_m3 between", value1, value2, "cntM3");
			return (Criteria) this;
		}

		public Criteria andCntM3NotBetween(Short value1, Short value2) {
			addCriterion("cnt_m3 not between", value1, value2, "cntM3");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadIsNull() {
			addCriterion("tipo_unidad is null");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadIsNotNull() {
			addCriterion("tipo_unidad is not null");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadEqualTo(String value) {
			addCriterion("tipo_unidad =", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadNotEqualTo(String value) {
			addCriterion("tipo_unidad <>", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadGreaterThan(String value) {
			addCriterion("tipo_unidad >", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadGreaterThanOrEqualTo(String value) {
			addCriterion("tipo_unidad >=", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadLessThan(String value) {
			addCriterion("tipo_unidad <", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadLessThanOrEqualTo(String value) {
			addCriterion("tipo_unidad <=", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadLike(String value) {
			addCriterion("tipo_unidad like", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadNotLike(String value) {
			addCriterion("tipo_unidad not like", value, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadIn(List<String> values) {
			addCriterion("tipo_unidad in", values, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadNotIn(List<String> values) {
			addCriterion("tipo_unidad not in", values, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadBetween(String value1, String value2) {
			addCriterion("tipo_unidad between", value1, value2, "tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andTipoUnidadNotBetween(String value1, String value2) {
			addCriterion("tipo_unidad not between", value1, value2,
					"tipoUnidad");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioIsNull() {
			addCriterion("cod_sub_servicio is null");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioIsNotNull() {
			addCriterion("cod_sub_servicio is not null");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioEqualTo(String value) {
			addCriterion("cod_sub_servicio =", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioNotEqualTo(String value) {
			addCriterion("cod_sub_servicio <>", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioGreaterThan(String value) {
			addCriterion("cod_sub_servicio >", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioGreaterThanOrEqualTo(String value) {
			addCriterion("cod_sub_servicio >=", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioLessThan(String value) {
			addCriterion("cod_sub_servicio <", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioLessThanOrEqualTo(String value) {
			addCriterion("cod_sub_servicio <=", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioLike(String value) {
			addCriterion("cod_sub_servicio like", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioNotLike(String value) {
			addCriterion("cod_sub_servicio not like", value, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioIn(List<String> values) {
			addCriterion("cod_sub_servicio in", values, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioNotIn(List<String> values) {
			addCriterion("cod_sub_servicio not in", values, "codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioBetween(String value1, String value2) {
			addCriterion("cod_sub_servicio between", value1, value2,
					"codSubServicio");
			return (Criteria) this;
		}

		public Criteria andCodSubServicioNotBetween(String value1, String value2) {
			addCriterion("cod_sub_servicio not between", value1, value2,
					"codSubServicio");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaIsNull() {
			addCriterion("usuario_anula is null");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaIsNotNull() {
			addCriterion("usuario_anula is not null");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaEqualTo(String value) {
			addCriterion("usuario_anula =", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaNotEqualTo(String value) {
			addCriterion("usuario_anula <>", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaGreaterThan(String value) {
			addCriterion("usuario_anula >", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaGreaterThanOrEqualTo(String value) {
			addCriterion("usuario_anula >=", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaLessThan(String value) {
			addCriterion("usuario_anula <", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaLessThanOrEqualTo(String value) {
			addCriterion("usuario_anula <=", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaLike(String value) {
			addCriterion("usuario_anula like", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaNotLike(String value) {
			addCriterion("usuario_anula not like", value, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaIn(List<String> values) {
			addCriterion("usuario_anula in", values, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaNotIn(List<String> values) {
			addCriterion("usuario_anula not in", values, "usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaBetween(String value1, String value2) {
			addCriterion("usuario_anula between", value1, value2,
					"usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andUsuarioAnulaNotBetween(String value1, String value2) {
			addCriterion("usuario_anula not between", value1, value2,
					"usuarioAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaIsNull() {
			addCriterion("fecha_anula is null");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaIsNotNull() {
			addCriterion("fecha_anula is not null");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaEqualTo(Date value) {
			addCriterion("fecha_anula =", value, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaNotEqualTo(Date value) {
			addCriterion("fecha_anula <>", value, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaGreaterThan(Date value) {
			addCriterion("fecha_anula >", value, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha_anula >=", value, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaLessThan(Date value) {
			addCriterion("fecha_anula <", value, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaLessThanOrEqualTo(Date value) {
			addCriterion("fecha_anula <=", value, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaIn(List<Date> values) {
			addCriterion("fecha_anula in", values, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaNotIn(List<Date> values) {
			addCriterion("fecha_anula not in", values, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaBetween(Date value1, Date value2) {
			addCriterion("fecha_anula between", value1, value2, "fechaAnula");
			return (Criteria) this;
		}

		public Criteria andFechaAnulaNotBetween(Date value1, Date value2) {
			addCriterion("fecha_anula not between", value1, value2,
					"fechaAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaIsNull() {
			addCriterion("obs_anula is null");
			return (Criteria) this;
		}

		public Criteria andObsAnulaIsNotNull() {
			addCriterion("obs_anula is not null");
			return (Criteria) this;
		}

		public Criteria andObsAnulaEqualTo(String value) {
			addCriterion("obs_anula =", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaNotEqualTo(String value) {
			addCriterion("obs_anula <>", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaGreaterThan(String value) {
			addCriterion("obs_anula >", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaGreaterThanOrEqualTo(String value) {
			addCriterion("obs_anula >=", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaLessThan(String value) {
			addCriterion("obs_anula <", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaLessThanOrEqualTo(String value) {
			addCriterion("obs_anula <=", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaLike(String value) {
			addCriterion("obs_anula like", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaNotLike(String value) {
			addCriterion("obs_anula not like", value, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaIn(List<String> values) {
			addCriterion("obs_anula in", values, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaNotIn(List<String> values) {
			addCriterion("obs_anula not in", values, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaBetween(String value1, String value2) {
			addCriterion("obs_anula between", value1, value2, "obsAnula");
			return (Criteria) this;
		}

		public Criteria andObsAnulaNotBetween(String value1, String value2) {
			addCriterion("obs_anula not between", value1, value2, "obsAnula");
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

    public OrdenesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSerieIsNull() {
            addCriterion("serie is null");
            return (Criteria) this;
        }

        public Criteria andSerieIsNotNull() {
            addCriterion("serie is not null");
            return (Criteria) this;
        }

        public Criteria andSerieEqualTo(String value) {
            addCriterion("serie =", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotEqualTo(String value) {
            addCriterion("serie <>", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieGreaterThan(String value) {
            addCriterion("serie >", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieGreaterThanOrEqualTo(String value) {
            addCriterion("serie >=", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieLessThan(String value) {
            addCriterion("serie <", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieLessThanOrEqualTo(String value) {
            addCriterion("serie <=", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieLike(String value) {
            addCriterion("serie like", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotLike(String value) {
            addCriterion("serie not like", value, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieIn(List<String> values) {
            addCriterion("serie in", values, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotIn(List<String> values) {
            addCriterion("serie not in", values, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieBetween(String value1, String value2) {
            addCriterion("serie between", value1, value2, "serie");
            return (Criteria) this;
        }

        public Criteria andSerieNotBetween(String value1, String value2) {
            addCriterion("serie not between", value1, value2, "serie");
            return (Criteria) this;
        }

        public Criteria andOrdenIsNull() {
            addCriterion("orden is null");
            return (Criteria) this;
        }

        public Criteria andOrdenIsNotNull() {
            addCriterion("orden is not null");
            return (Criteria) this;
        }

        public Criteria andOrdenEqualTo(String value) {
            addCriterion("orden =", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenNotEqualTo(String value) {
            addCriterion("orden <>", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenGreaterThan(String value) {
            addCriterion("orden >", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenGreaterThanOrEqualTo(String value) {
            addCriterion("orden >=", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenLessThan(String value) {
            addCriterion("orden <", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenLessThanOrEqualTo(String value) {
            addCriterion("orden <=", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenLike(String value) {
            addCriterion("orden like", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenNotLike(String value) {
            addCriterion("orden not like", value, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenIn(List<String> values) {
            addCriterion("orden in", values, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenNotIn(List<String> values) {
            addCriterion("orden not in", values, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenBetween(String value1, String value2) {
            addCriterion("orden between", value1, value2, "orden");
            return (Criteria) this;
        }

        public Criteria andOrdenNotBetween(String value1, String value2) {
            addCriterion("orden not between", value1, value2, "orden");
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

        public Criteria andCodambitoIsNull() {
            addCriterion("codambito is null");
            return (Criteria) this;
        }

        public Criteria andCodambitoIsNotNull() {
            addCriterion("codambito is not null");
            return (Criteria) this;
        }

        public Criteria andCodambitoEqualTo(String value) {
            addCriterion("codambito =", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoNotEqualTo(String value) {
            addCriterion("codambito <>", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoGreaterThan(String value) {
            addCriterion("codambito >", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoGreaterThanOrEqualTo(String value) {
            addCriterion("codambito >=", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoLessThan(String value) {
            addCriterion("codambito <", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoLessThanOrEqualTo(String value) {
            addCriterion("codambito <=", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoLike(String value) {
            addCriterion("codambito like", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoNotLike(String value) {
            addCriterion("codambito not like", value, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoIn(List<String> values) {
            addCriterion("codambito in", values, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoNotIn(List<String> values) {
            addCriterion("codambito not in", values, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoBetween(String value1, String value2) {
            addCriterion("codambito between", value1, value2, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodambitoNotBetween(String value1, String value2) {
            addCriterion("codambito not between", value1, value2, "codambito");
            return (Criteria) this;
        }

        public Criteria andCodnegocioIsNull() {
            addCriterion("codnegocio is null");
            return (Criteria) this;
        }

        public Criteria andCodnegocioIsNotNull() {
            addCriterion("codnegocio is not null");
            return (Criteria) this;
        }

        public Criteria andCodnegocioEqualTo(String value) {
            addCriterion("codnegocio =", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioNotEqualTo(String value) {
            addCriterion("codnegocio <>", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioGreaterThan(String value) {
            addCriterion("codnegocio >", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioGreaterThanOrEqualTo(String value) {
            addCriterion("codnegocio >=", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioLessThan(String value) {
            addCriterion("codnegocio <", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioLessThanOrEqualTo(String value) {
            addCriterion("codnegocio <=", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioLike(String value) {
            addCriterion("codnegocio like", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioNotLike(String value) {
            addCriterion("codnegocio not like", value, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioIn(List<String> values) {
            addCriterion("codnegocio in", values, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioNotIn(List<String> values) {
            addCriterion("codnegocio not in", values, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioBetween(String value1, String value2) {
            addCriterion("codnegocio between", value1, value2, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodnegocioNotBetween(String value1, String value2) {
            addCriterion("codnegocio not between", value1, value2, "codnegocio");
            return (Criteria) this;
        }

        public Criteria andCodservicioIsNull() {
            addCriterion("codservicio is null");
            return (Criteria) this;
        }

        public Criteria andCodservicioIsNotNull() {
            addCriterion("codservicio is not null");
            return (Criteria) this;
        }

        public Criteria andCodservicioEqualTo(String value) {
            addCriterion("codservicio =", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioNotEqualTo(String value) {
            addCriterion("codservicio <>", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioGreaterThan(String value) {
            addCriterion("codservicio >", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioGreaterThanOrEqualTo(String value) {
            addCriterion("codservicio >=", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioLessThan(String value) {
            addCriterion("codservicio <", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioLessThanOrEqualTo(String value) {
            addCriterion("codservicio <=", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioLike(String value) {
            addCriterion("codservicio like", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioNotLike(String value) {
            addCriterion("codservicio not like", value, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioIn(List<String> values) {
            addCriterion("codservicio in", values, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioNotIn(List<String> values) {
            addCriterion("codservicio not in", values, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioBetween(String value1, String value2) {
            addCriterion("codservicio between", value1, value2, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodservicioNotBetween(String value1, String value2) {
            addCriterion("codservicio not between", value1, value2, "codservicio");
            return (Criteria) this;
        }

        public Criteria andCodproductoIsNull() {
            addCriterion("codproducto is null");
            return (Criteria) this;
        }

        public Criteria andCodproductoIsNotNull() {
            addCriterion("codproducto is not null");
            return (Criteria) this;
        }

        public Criteria andCodproductoEqualTo(String value) {
            addCriterion("codproducto =", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotEqualTo(String value) {
            addCriterion("codproducto <>", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoGreaterThan(String value) {
            addCriterion("codproducto >", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoGreaterThanOrEqualTo(String value) {
            addCriterion("codproducto >=", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoLessThan(String value) {
            addCriterion("codproducto <", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoLessThanOrEqualTo(String value) {
            addCriterion("codproducto <=", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoLike(String value) {
            addCriterion("codproducto like", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotLike(String value) {
            addCriterion("codproducto not like", value, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoIn(List<String> values) {
            addCriterion("codproducto in", values, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotIn(List<String> values) {
            addCriterion("codproducto not in", values, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoBetween(String value1, String value2) {
            addCriterion("codproducto between", value1, value2, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodproductoNotBetween(String value1, String value2) {
            addCriterion("codproducto not between", value1, value2, "codproducto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoIsNull() {
            addCriterion("codtiporeparto is null");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoIsNotNull() {
            addCriterion("codtiporeparto is not null");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoEqualTo(String value) {
            addCriterion("codtiporeparto =", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoNotEqualTo(String value) {
            addCriterion("codtiporeparto <>", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoGreaterThan(String value) {
            addCriterion("codtiporeparto >", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoGreaterThanOrEqualTo(String value) {
            addCriterion("codtiporeparto >=", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoLessThan(String value) {
            addCriterion("codtiporeparto <", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoLessThanOrEqualTo(String value) {
            addCriterion("codtiporeparto <=", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoLike(String value) {
            addCriterion("codtiporeparto like", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoNotLike(String value) {
            addCriterion("codtiporeparto not like", value, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoIn(List<String> values) {
            addCriterion("codtiporeparto in", values, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoNotIn(List<String> values) {
            addCriterion("codtiporeparto not in", values, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoBetween(String value1, String value2) {
            addCriterion("codtiporeparto between", value1, value2, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCodtiporepartoNotBetween(String value1, String value2) {
            addCriterion("codtiporeparto not between", value1, value2, "codtiporeparto");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionIsNull() {
            addCriterion("cnt_admision is null");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionIsNotNull() {
            addCriterion("cnt_admision is not null");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionEqualTo(Long value) {
            addCriterion("cnt_admision =", value, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionNotEqualTo(Long value) {
            addCriterion("cnt_admision <>", value, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionGreaterThan(Long value) {
            addCriterion("cnt_admision >", value, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionGreaterThanOrEqualTo(Long value) {
            addCriterion("cnt_admision >=", value, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionLessThan(Long value) {
            addCriterion("cnt_admision <", value, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionLessThanOrEqualTo(Long value) {
            addCriterion("cnt_admision <=", value, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionIn(List<Long> values) {
            addCriterion("cnt_admision in", values, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionNotIn(List<Long> values) {
            addCriterion("cnt_admision not in", values, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionBetween(Long value1, Long value2) {
            addCriterion("cnt_admision between", value1, value2, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntAdmisionNotBetween(Long value1, Long value2) {
            addCriterion("cnt_admision not between", value1, value2, "cntAdmision");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoIsNull() {
            addCriterion("cnt_digitado is null");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoIsNotNull() {
            addCriterion("cnt_digitado is not null");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoEqualTo(Long value) {
            addCriterion("cnt_digitado =", value, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoNotEqualTo(Long value) {
            addCriterion("cnt_digitado <>", value, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoGreaterThan(Long value) {
            addCriterion("cnt_digitado >", value, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoGreaterThanOrEqualTo(Long value) {
            addCriterion("cnt_digitado >=", value, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoLessThan(Long value) {
            addCriterion("cnt_digitado <", value, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoLessThanOrEqualTo(Long value) {
            addCriterion("cnt_digitado <=", value, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoIn(List<Long> values) {
            addCriterion("cnt_digitado in", values, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoNotIn(List<Long> values) {
            addCriterion("cnt_digitado not in", values, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoBetween(Long value1, Long value2) {
            addCriterion("cnt_digitado between", value1, value2, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andCntDigitadoNotBetween(Long value1, Long value2) {
            addCriterion("cnt_digitado not between", value1, value2, "cntDigitado");
            return (Criteria) this;
        }

        public Criteria andPesoIsNull() {
            addCriterion("peso is null");
            return (Criteria) this;
        }

        public Criteria andPesoIsNotNull() {
            addCriterion("peso is not null");
            return (Criteria) this;
        }

        public Criteria andPesoEqualTo(BigDecimal value) {
            addCriterion("peso =", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotEqualTo(BigDecimal value) {
            addCriterion("peso <>", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoGreaterThan(BigDecimal value) {
            addCriterion("peso >", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("peso >=", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoLessThan(BigDecimal value) {
            addCriterion("peso <", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("peso <=", value, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoIn(List<BigDecimal> values) {
            addCriterion("peso in", values, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotIn(List<BigDecimal> values) {
            addCriterion("peso not in", values, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peso between", value1, value2, "peso");
            return (Criteria) this;
        }

        public Criteria andPesoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("peso not between", value1, value2, "peso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoIsNull() {
            addCriterion("fechaingreso is null");
            return (Criteria) this;
        }

        public Criteria andFechaingresoIsNotNull() {
            addCriterion("fechaingreso is not null");
            return (Criteria) this;
        }

        public Criteria andFechaingresoEqualTo(Date value) {
            addCriterionForJDBCDate("fechaingreso =", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechaingreso <>", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoGreaterThan(Date value) {
            addCriterionForJDBCDate("fechaingreso >", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaingreso >=", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoLessThan(Date value) {
            addCriterionForJDBCDate("fechaingreso <", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaingreso <=", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoIn(List<Date> values) {
            addCriterionForJDBCDate("fechaingreso in", values, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechaingreso not in", values, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaingreso between", value1, value2, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaingreso not between", value1, value2, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechainicioIsNull() {
            addCriterion("fechainicio is null");
            return (Criteria) this;
        }

        public Criteria andFechainicioIsNotNull() {
            addCriterion("fechainicio is not null");
            return (Criteria) this;
        }

        public Criteria andFechainicioEqualTo(Date value) {
            addCriterionForJDBCDate("fechainicio =", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechainicio <>", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioGreaterThan(Date value) {
            addCriterionForJDBCDate("fechainicio >", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechainicio >=", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioLessThan(Date value) {
            addCriterionForJDBCDate("fechainicio <", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechainicio <=", value, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioIn(List<Date> values) {
            addCriterionForJDBCDate("fechainicio in", values, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechainicio not in", values, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechainicio between", value1, value2, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechainicioNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechainicio not between", value1, value2, "fechainicio");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoIsNull() {
            addCriterion("fechavencimiento is null");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoIsNotNull() {
            addCriterion("fechavencimiento is not null");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento =", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento <>", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoGreaterThan(Date value) {
            addCriterionForJDBCDate("fechavencimiento >", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento >=", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoLessThan(Date value) {
            addCriterionForJDBCDate("fechavencimiento <", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechavencimiento <=", value, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoIn(List<Date> values) {
            addCriterionForJDBCDate("fechavencimiento in", values, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechavencimiento not in", values, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechavencimiento between", value1, value2, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechavencimientoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechavencimiento not between", value1, value2, "fechavencimiento");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionIsNull() {
            addCriterion("fechadevolucion is null");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionIsNotNull() {
            addCriterion("fechadevolucion is not null");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionEqualTo(Date value) {
            addCriterionForJDBCDate("fechadevolucion =", value, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechadevolucion <>", value, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionGreaterThan(Date value) {
            addCriterionForJDBCDate("fechadevolucion >", value, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechadevolucion >=", value, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionLessThan(Date value) {
            addCriterionForJDBCDate("fechadevolucion <", value, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechadevolucion <=", value, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionIn(List<Date> values) {
            addCriterionForJDBCDate("fechadevolucion in", values, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechadevolucion not in", values, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechadevolucion between", value1, value2, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andFechadevolucionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechadevolucion not between", value1, value2, "fechadevolucion");
            return (Criteria) this;
        }

        public Criteria andEstadoordenIsNull() {
            addCriterion("estadoorden is null");
            return (Criteria) this;
        }

        public Criteria andEstadoordenIsNotNull() {
            addCriterion("estadoorden is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoordenEqualTo(String value) {
            addCriterion("estadoorden =", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenNotEqualTo(String value) {
            addCriterion("estadoorden <>", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenGreaterThan(String value) {
            addCriterion("estadoorden >", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenGreaterThanOrEqualTo(String value) {
            addCriterion("estadoorden >=", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenLessThan(String value) {
            addCriterion("estadoorden <", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenLessThanOrEqualTo(String value) {
            addCriterion("estadoorden <=", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenLike(String value) {
            addCriterion("estadoorden like", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenNotLike(String value) {
            addCriterion("estadoorden not like", value, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenIn(List<String> values) {
            addCriterion("estadoorden in", values, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenNotIn(List<String> values) {
            addCriterion("estadoorden not in", values, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenBetween(String value1, String value2) {
            addCriterion("estadoorden between", value1, value2, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadoordenNotBetween(String value1, String value2) {
            addCriterion("estadoorden not between", value1, value2, "estadoorden");
            return (Criteria) this;
        }

        public Criteria andEstadooutIsNull() {
            addCriterion("estadoout is null");
            return (Criteria) this;
        }

        public Criteria andEstadooutIsNotNull() {
            addCriterion("estadoout is not null");
            return (Criteria) this;
        }

        public Criteria andEstadooutEqualTo(String value) {
            addCriterion("estadoout =", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutNotEqualTo(String value) {
            addCriterion("estadoout <>", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutGreaterThan(String value) {
            addCriterion("estadoout >", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutGreaterThanOrEqualTo(String value) {
            addCriterion("estadoout >=", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutLessThan(String value) {
            addCriterion("estadoout <", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutLessThanOrEqualTo(String value) {
            addCriterion("estadoout <=", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutLike(String value) {
            addCriterion("estadoout like", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutNotLike(String value) {
            addCriterion("estadoout not like", value, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutIn(List<String> values) {
            addCriterion("estadoout in", values, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutNotIn(List<String> values) {
            addCriterion("estadoout not in", values, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutBetween(String value1, String value2) {
            addCriterion("estadoout between", value1, value2, "estadoout");
            return (Criteria) this;
        }

        public Criteria andEstadooutNotBetween(String value1, String value2) {
            addCriterion("estadoout not between", value1, value2, "estadoout");
            return (Criteria) this;
        }

        public Criteria andBloqueoIsNull() {
            addCriterion("bloqueo is null");
            return (Criteria) this;
        }

        public Criteria andBloqueoIsNotNull() {
            addCriterion("bloqueo is not null");
            return (Criteria) this;
        }

        public Criteria andBloqueoEqualTo(Short value) {
            addCriterion("bloqueo =", value, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoNotEqualTo(Short value) {
            addCriterion("bloqueo <>", value, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoGreaterThan(Short value) {
            addCriterion("bloqueo >", value, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoGreaterThanOrEqualTo(Short value) {
            addCriterion("bloqueo >=", value, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoLessThan(Short value) {
            addCriterion("bloqueo <", value, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoLessThanOrEqualTo(Short value) {
            addCriterion("bloqueo <=", value, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoIn(List<Short> values) {
            addCriterion("bloqueo in", values, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoNotIn(List<Short> values) {
            addCriterion("bloqueo not in", values, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoBetween(Short value1, Short value2) {
            addCriterion("bloqueo between", value1, value2, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andBloqueoNotBetween(Short value1, Short value2) {
            addCriterion("bloqueo not between", value1, value2, "bloqueo");
            return (Criteria) this;
        }

        public Criteria andVolantesIsNull() {
            addCriterion("volantes is null");
            return (Criteria) this;
        }

        public Criteria andVolantesIsNotNull() {
            addCriterion("volantes is not null");
            return (Criteria) this;
        }

        public Criteria andVolantesEqualTo(Short value) {
            addCriterion("volantes =", value, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesNotEqualTo(Short value) {
            addCriterion("volantes <>", value, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesGreaterThan(Short value) {
            addCriterion("volantes >", value, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesGreaterThanOrEqualTo(Short value) {
            addCriterion("volantes >=", value, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesLessThan(Short value) {
            addCriterion("volantes <", value, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesLessThanOrEqualTo(Short value) {
            addCriterion("volantes <=", value, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesIn(List<Short> values) {
            addCriterion("volantes in", values, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesNotIn(List<Short> values) {
            addCriterion("volantes not in", values, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesBetween(Short value1, Short value2) {
            addCriterion("volantes between", value1, value2, "volantes");
            return (Criteria) this;
        }

        public Criteria andVolantesNotBetween(Short value1, Short value2) {
            addCriterion("volantes not between", value1, value2, "volantes");
            return (Criteria) this;
        }

        public Criteria andValoradoIsNull() {
            addCriterion("valorado is null");
            return (Criteria) this;
        }

        public Criteria andValoradoIsNotNull() {
            addCriterion("valorado is not null");
            return (Criteria) this;
        }

        public Criteria andValoradoEqualTo(Short value) {
            addCriterion("valorado =", value, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoNotEqualTo(Short value) {
            addCriterion("valorado <>", value, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoGreaterThan(Short value) {
            addCriterion("valorado >", value, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoGreaterThanOrEqualTo(Short value) {
            addCriterion("valorado >=", value, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoLessThan(Short value) {
            addCriterion("valorado <", value, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoLessThanOrEqualTo(Short value) {
            addCriterion("valorado <=", value, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoIn(List<Short> values) {
            addCriterion("valorado in", values, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoNotIn(List<Short> values) {
            addCriterion("valorado not in", values, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoBetween(Short value1, Short value2) {
            addCriterion("valorado between", value1, value2, "valorado");
            return (Criteria) this;
        }

        public Criteria andValoradoNotBetween(Short value1, Short value2) {
            addCriterion("valorado not between", value1, value2, "valorado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoIsNull() {
            addCriterion("liquidado is null");
            return (Criteria) this;
        }

        public Criteria andLiquidadoIsNotNull() {
            addCriterion("liquidado is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidadoEqualTo(Short value) {
            addCriterion("liquidado =", value, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoNotEqualTo(Short value) {
            addCriterion("liquidado <>", value, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoGreaterThan(Short value) {
            addCriterion("liquidado >", value, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoGreaterThanOrEqualTo(Short value) {
            addCriterion("liquidado >=", value, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoLessThan(Short value) {
            addCriterion("liquidado <", value, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoLessThanOrEqualTo(Short value) {
            addCriterion("liquidado <=", value, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoIn(List<Short> values) {
            addCriterion("liquidado in", values, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoNotIn(List<Short> values) {
            addCriterion("liquidado not in", values, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoBetween(Short value1, Short value2) {
            addCriterion("liquidado between", value1, value2, "liquidado");
            return (Criteria) this;
        }

        public Criteria andLiquidadoNotBetween(Short value1, Short value2) {
            addCriterion("liquidado not between", value1, value2, "liquidado");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionIsNull() {
            addCriterion("nroliquidacion is null");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionIsNotNull() {
            addCriterion("nroliquidacion is not null");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionEqualTo(String value) {
            addCriterion("nroliquidacion =", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionNotEqualTo(String value) {
            addCriterion("nroliquidacion <>", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionGreaterThan(String value) {
            addCriterion("nroliquidacion >", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionGreaterThanOrEqualTo(String value) {
            addCriterion("nroliquidacion >=", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionLessThan(String value) {
            addCriterion("nroliquidacion <", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionLessThanOrEqualTo(String value) {
            addCriterion("nroliquidacion <=", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionLike(String value) {
            addCriterion("nroliquidacion like", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionNotLike(String value) {
            addCriterion("nroliquidacion not like", value, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionIn(List<String> values) {
            addCriterion("nroliquidacion in", values, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionNotIn(List<String> values) {
            addCriterion("nroliquidacion not in", values, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionBetween(String value1, String value2) {
            addCriterion("nroliquidacion between", value1, value2, "nroliquidacion");
            return (Criteria) this;
        }

        public Criteria andNroliquidacionNotBetween(String value1, String value2) {
            addCriterion("nroliquidacion not between", value1, value2, "nroliquidacion");
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

        public Criteria andGlosaIsNull() {
            addCriterion("glosa is null");
            return (Criteria) this;
        }

        public Criteria andGlosaIsNotNull() {
            addCriterion("glosa is not null");
            return (Criteria) this;
        }

        public Criteria andGlosaEqualTo(String value) {
            addCriterion("glosa =", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaNotEqualTo(String value) {
            addCriterion("glosa <>", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaGreaterThan(String value) {
            addCriterion("glosa >", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaGreaterThanOrEqualTo(String value) {
            addCriterion("glosa >=", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaLessThan(String value) {
            addCriterion("glosa <", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaLessThanOrEqualTo(String value) {
            addCriterion("glosa <=", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaLike(String value) {
            addCriterion("glosa like", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaNotLike(String value) {
            addCriterion("glosa not like", value, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaIn(List<String> values) {
            addCriterion("glosa in", values, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaNotIn(List<String> values) {
            addCriterion("glosa not in", values, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaBetween(String value1, String value2) {
            addCriterion("glosa between", value1, value2, "glosa");
            return (Criteria) this;
        }

        public Criteria andGlosaNotBetween(String value1, String value2) {
            addCriterion("glosa not between", value1, value2, "glosa");
            return (Criteria) this;
        }

        public Criteria andFacturadoIsNull() {
            addCriterion("facturado is null");
            return (Criteria) this;
        }

        public Criteria andFacturadoIsNotNull() {
            addCriterion("facturado is not null");
            return (Criteria) this;
        }

        public Criteria andFacturadoEqualTo(Short value) {
            addCriterion("facturado =", value, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoNotEqualTo(Short value) {
            addCriterion("facturado <>", value, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoGreaterThan(Short value) {
            addCriterion("facturado >", value, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoGreaterThanOrEqualTo(Short value) {
            addCriterion("facturado >=", value, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoLessThan(Short value) {
            addCriterion("facturado <", value, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoLessThanOrEqualTo(Short value) {
            addCriterion("facturado <=", value, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoIn(List<Short> values) {
            addCriterion("facturado in", values, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoNotIn(List<Short> values) {
            addCriterion("facturado not in", values, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoBetween(Short value1, Short value2) {
            addCriterion("facturado between", value1, value2, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacturadoNotBetween(Short value1, Short value2) {
            addCriterion("facturado not between", value1, value2, "facturado");
            return (Criteria) this;
        }

        public Criteria andFacSerieIsNull() {
            addCriterion("fac_serie is null");
            return (Criteria) this;
        }

        public Criteria andFacSerieIsNotNull() {
            addCriterion("fac_serie is not null");
            return (Criteria) this;
        }

        public Criteria andFacSerieEqualTo(String value) {
            addCriterion("fac_serie =", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieNotEqualTo(String value) {
            addCriterion("fac_serie <>", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieGreaterThan(String value) {
            addCriterion("fac_serie >", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieGreaterThanOrEqualTo(String value) {
            addCriterion("fac_serie >=", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieLessThan(String value) {
            addCriterion("fac_serie <", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieLessThanOrEqualTo(String value) {
            addCriterion("fac_serie <=", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieLike(String value) {
            addCriterion("fac_serie like", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieNotLike(String value) {
            addCriterion("fac_serie not like", value, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieIn(List<String> values) {
            addCriterion("fac_serie in", values, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieNotIn(List<String> values) {
            addCriterion("fac_serie not in", values, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieBetween(String value1, String value2) {
            addCriterion("fac_serie between", value1, value2, "facSerie");
            return (Criteria) this;
        }

        public Criteria andFacSerieNotBetween(String value1, String value2) {
            addCriterion("fac_serie not between", value1, value2, "facSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieIsNull() {
            addCriterion("eecc_serie is null");
            return (Criteria) this;
        }

        public Criteria andEeccSerieIsNotNull() {
            addCriterion("eecc_serie is not null");
            return (Criteria) this;
        }

        public Criteria andEeccSerieEqualTo(String value) {
            addCriterion("eecc_serie =", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieNotEqualTo(String value) {
            addCriterion("eecc_serie <>", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieGreaterThan(String value) {
            addCriterion("eecc_serie >", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieGreaterThanOrEqualTo(String value) {
            addCriterion("eecc_serie >=", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieLessThan(String value) {
            addCriterion("eecc_serie <", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieLessThanOrEqualTo(String value) {
            addCriterion("eecc_serie <=", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieLike(String value) {
            addCriterion("eecc_serie like", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieNotLike(String value) {
            addCriterion("eecc_serie not like", value, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieIn(List<String> values) {
            addCriterion("eecc_serie in", values, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieNotIn(List<String> values) {
            addCriterion("eecc_serie not in", values, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieBetween(String value1, String value2) {
            addCriterion("eecc_serie between", value1, value2, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccSerieNotBetween(String value1, String value2) {
            addCriterion("eecc_serie not between", value1, value2, "eeccSerie");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroIsNull() {
            addCriterion("eecc_numero is null");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroIsNotNull() {
            addCriterion("eecc_numero is not null");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroEqualTo(String value) {
            addCriterion("eecc_numero =", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroNotEqualTo(String value) {
            addCriterion("eecc_numero <>", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroGreaterThan(String value) {
            addCriterion("eecc_numero >", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroGreaterThanOrEqualTo(String value) {
            addCriterion("eecc_numero >=", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroLessThan(String value) {
            addCriterion("eecc_numero <", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroLessThanOrEqualTo(String value) {
            addCriterion("eecc_numero <=", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroLike(String value) {
            addCriterion("eecc_numero like", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroNotLike(String value) {
            addCriterion("eecc_numero not like", value, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroIn(List<String> values) {
            addCriterion("eecc_numero in", values, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroNotIn(List<String> values) {
            addCriterion("eecc_numero not in", values, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroBetween(String value1, String value2) {
            addCriterion("eecc_numero between", value1, value2, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andEeccNumeroNotBetween(String value1, String value2) {
            addCriterion("eecc_numero not between", value1, value2, "eeccNumero");
            return (Criteria) this;
        }

        public Criteria andImporteIsNull() {
            addCriterion("importe is null");
            return (Criteria) this;
        }

        public Criteria andImporteIsNotNull() {
            addCriterion("importe is not null");
            return (Criteria) this;
        }

        public Criteria andImporteEqualTo(BigDecimal value) {
            addCriterion("importe =", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotEqualTo(BigDecimal value) {
            addCriterion("importe <>", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteGreaterThan(BigDecimal value) {
            addCriterion("importe >", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("importe >=", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteLessThan(BigDecimal value) {
            addCriterion("importe <", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("importe <=", value, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteIn(List<BigDecimal> values) {
            addCriterion("importe in", values, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotIn(List<BigDecimal> values) {
            addCriterion("importe not in", values, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe between", value1, value2, "importe");
            return (Criteria) this;
        }

        public Criteria andImporteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe not between", value1, value2, "importe");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNull() {
            addCriterion("descuento is null");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNotNull() {
            addCriterion("descuento is not null");
            return (Criteria) this;
        }

        public Criteria andDescuentoEqualTo(BigDecimal value) {
            addCriterion("descuento =", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("descuento <>", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThan(BigDecimal value) {
            addCriterion("descuento >", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("descuento >=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThan(BigDecimal value) {
            addCriterion("descuento <", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("descuento <=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoIn(List<BigDecimal> values) {
            addCriterion("descuento in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("descuento not in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("descuento between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("descuento not between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andVentaIsNull() {
            addCriterion("venta is null");
            return (Criteria) this;
        }

        public Criteria andVentaIsNotNull() {
            addCriterion("venta is not null");
            return (Criteria) this;
        }

        public Criteria andVentaEqualTo(BigDecimal value) {
            addCriterion("venta =", value, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaNotEqualTo(BigDecimal value) {
            addCriterion("venta <>", value, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaGreaterThan(BigDecimal value) {
            addCriterion("venta >", value, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("venta >=", value, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaLessThan(BigDecimal value) {
            addCriterion("venta <", value, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("venta <=", value, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaIn(List<BigDecimal> values) {
            addCriterion("venta in", values, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaNotIn(List<BigDecimal> values) {
            addCriterion("venta not in", values, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("venta between", value1, value2, "venta");
            return (Criteria) this;
        }

        public Criteria andVentaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("venta not between", value1, value2, "venta");
            return (Criteria) this;
        }

        public Criteria andIgvIsNull() {
            addCriterion("igv is null");
            return (Criteria) this;
        }

        public Criteria andIgvIsNotNull() {
            addCriterion("igv is not null");
            return (Criteria) this;
        }

        public Criteria andIgvEqualTo(BigDecimal value) {
            addCriterion("igv =", value, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvNotEqualTo(BigDecimal value) {
            addCriterion("igv <>", value, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvGreaterThan(BigDecimal value) {
            addCriterion("igv >", value, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("igv >=", value, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvLessThan(BigDecimal value) {
            addCriterion("igv <", value, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("igv <=", value, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvIn(List<BigDecimal> values) {
            addCriterion("igv in", values, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvNotIn(List<BigDecimal> values) {
            addCriterion("igv not in", values, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("igv between", value1, value2, "igv");
            return (Criteria) this;
        }

        public Criteria andIgvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("igv not between", value1, value2, "igv");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCoserieIsNull() {
            addCriterion("coserie is null");
            return (Criteria) this;
        }

        public Criteria andCoserieIsNotNull() {
            addCriterion("coserie is not null");
            return (Criteria) this;
        }

        public Criteria andCoserieEqualTo(String value) {
            addCriterion("coserie =", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotEqualTo(String value) {
            addCriterion("coserie <>", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieGreaterThan(String value) {
            addCriterion("coserie >", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieGreaterThanOrEqualTo(String value) {
            addCriterion("coserie >=", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieLessThan(String value) {
            addCriterion("coserie <", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieLessThanOrEqualTo(String value) {
            addCriterion("coserie <=", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieLike(String value) {
            addCriterion("coserie like", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotLike(String value) {
            addCriterion("coserie not like", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieIn(List<String> values) {
            addCriterion("coserie in", values, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotIn(List<String> values) {
            addCriterion("coserie not in", values, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieBetween(String value1, String value2) {
            addCriterion("coserie between", value1, value2, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotBetween(String value1, String value2) {
            addCriterion("coserie not between", value1, value2, "coserie");
            return (Criteria) this;
        }

        public Criteria andConumeroIsNull() {
            addCriterion("conumero is null");
            return (Criteria) this;
        }

        public Criteria andConumeroIsNotNull() {
            addCriterion("conumero is not null");
            return (Criteria) this;
        }

        public Criteria andConumeroEqualTo(Integer value) {
            addCriterion("conumero =", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroNotEqualTo(Integer value) {
            addCriterion("conumero <>", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroGreaterThan(Integer value) {
            addCriterion("conumero >", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroGreaterThanOrEqualTo(Integer value) {
            addCriterion("conumero >=", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroLessThan(Integer value) {
            addCriterion("conumero <", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroLessThanOrEqualTo(Integer value) {
            addCriterion("conumero <=", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroIn(List<Integer> values) {
            addCriterion("conumero in", values, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroNotIn(List<Integer> values) {
            addCriterion("conumero not in", values, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroBetween(Integer value1, Integer value2) {
            addCriterion("conumero between", value1, value2, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroNotBetween(Integer value1, Integer value2) {
            addCriterion("conumero not between", value1, value2, "conumero");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorIsNull() {
            addCriterion("codtipooperador is null");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorIsNotNull() {
            addCriterion("codtipooperador is not null");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorEqualTo(String value) {
            addCriterion("codtipooperador =", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorNotEqualTo(String value) {
            addCriterion("codtipooperador <>", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorGreaterThan(String value) {
            addCriterion("codtipooperador >", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorGreaterThanOrEqualTo(String value) {
            addCriterion("codtipooperador >=", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorLessThan(String value) {
            addCriterion("codtipooperador <", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorLessThanOrEqualTo(String value) {
            addCriterion("codtipooperador <=", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorLike(String value) {
            addCriterion("codtipooperador like", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorNotLike(String value) {
            addCriterion("codtipooperador not like", value, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorIn(List<String> values) {
            addCriterion("codtipooperador in", values, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorNotIn(List<String> values) {
            addCriterion("codtipooperador not in", values, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorBetween(String value1, String value2) {
            addCriterion("codtipooperador between", value1, value2, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andCodtipooperadorNotBetween(String value1, String value2) {
            addCriterion("codtipooperador not between", value1, value2, "codtipooperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorIsNull() {
            addCriterion("seoperador is null");
            return (Criteria) this;
        }

        public Criteria andSeoperadorIsNotNull() {
            addCriterion("seoperador is not null");
            return (Criteria) this;
        }

        public Criteria andSeoperadorEqualTo(String value) {
            addCriterion("seoperador =", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorNotEqualTo(String value) {
            addCriterion("seoperador <>", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorGreaterThan(String value) {
            addCriterion("seoperador >", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorGreaterThanOrEqualTo(String value) {
            addCriterion("seoperador >=", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorLessThan(String value) {
            addCriterion("seoperador <", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorLessThanOrEqualTo(String value) {
            addCriterion("seoperador <=", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorLike(String value) {
            addCriterion("seoperador like", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorNotLike(String value) {
            addCriterion("seoperador not like", value, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorIn(List<String> values) {
            addCriterion("seoperador in", values, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorNotIn(List<String> values) {
            addCriterion("seoperador not in", values, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorBetween(String value1, String value2) {
            addCriterion("seoperador between", value1, value2, "seoperador");
            return (Criteria) this;
        }

        public Criteria andSeoperadorNotBetween(String value1, String value2) {
            addCriterion("seoperador not between", value1, value2, "seoperador");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaIsNull() {
            addCriterion("tarifa_urbana is null");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaIsNotNull() {
            addCriterion("tarifa_urbana is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbana =", value, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbana <>", value, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaGreaterThan(BigDecimal value) {
            addCriterion("tarifa_urbana >", value, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbana >=", value, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaLessThan(BigDecimal value) {
            addCriterion("tarifa_urbana <", value, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbana <=", value, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaIn(List<BigDecimal> values) {
            addCriterion("tarifa_urbana in", values, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_urbana not in", values, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_urbana between", value1, value2, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_urbana not between", value1, value2, "tarifaUrbana");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaIsNull() {
            addCriterion("tarifa_periferica is null");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaIsNotNull() {
            addCriterion("tarifa_periferica is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaEqualTo(BigDecimal value) {
            addCriterion("tarifa_periferica =", value, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_periferica <>", value, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaGreaterThan(BigDecimal value) {
            addCriterion("tarifa_periferica >", value, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_periferica >=", value, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaLessThan(BigDecimal value) {
            addCriterion("tarifa_periferica <", value, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_periferica <=", value, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaIn(List<BigDecimal> values) {
            addCriterion("tarifa_periferica in", values, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_periferica not in", values, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_periferica between", value1, value2, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_periferica not between", value1, value2, "tarifaPeriferica");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaIsNull() {
            addCriterion("tarifa_extrema is null");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaIsNotNull() {
            addCriterion("tarifa_extrema is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaEqualTo(BigDecimal value) {
            addCriterion("tarifa_extrema =", value, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_extrema <>", value, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaGreaterThan(BigDecimal value) {
            addCriterion("tarifa_extrema >", value, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_extrema >=", value, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaLessThan(BigDecimal value) {
            addCriterion("tarifa_extrema <", value, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_extrema <=", value, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaIn(List<BigDecimal> values) {
            addCriterion("tarifa_extrema in", values, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_extrema not in", values, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_extrema between", value1, value2, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_extrema not between", value1, value2, "tarifaExtrema");
            return (Criteria) this;
        }

        public Criteria andInafectoIsNull() {
            addCriterion("inafecto is null");
            return (Criteria) this;
        }

        public Criteria andInafectoIsNotNull() {
            addCriterion("inafecto is not null");
            return (Criteria) this;
        }

        public Criteria andInafectoEqualTo(BigDecimal value) {
            addCriterion("inafecto =", value, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoNotEqualTo(BigDecimal value) {
            addCriterion("inafecto <>", value, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoGreaterThan(BigDecimal value) {
            addCriterion("inafecto >", value, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inafecto >=", value, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoLessThan(BigDecimal value) {
            addCriterion("inafecto <", value, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inafecto <=", value, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoIn(List<BigDecimal> values) {
            addCriterion("inafecto in", values, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoNotIn(List<BigDecimal> values) {
            addCriterion("inafecto not in", values, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inafecto between", value1, value2, "inafecto");
            return (Criteria) this;
        }

        public Criteria andInafectoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inafecto not between", value1, value2, "inafecto");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionIsNull() {
            addCriterion("tipocotizacion is null");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionIsNotNull() {
            addCriterion("tipocotizacion is not null");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionEqualTo(Short value) {
            addCriterion("tipocotizacion =", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionNotEqualTo(Short value) {
            addCriterion("tipocotizacion <>", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionGreaterThan(Short value) {
            addCriterion("tipocotizacion >", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionGreaterThanOrEqualTo(Short value) {
            addCriterion("tipocotizacion >=", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionLessThan(Short value) {
            addCriterion("tipocotizacion <", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionLessThanOrEqualTo(Short value) {
            addCriterion("tipocotizacion <=", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionIn(List<Short> values) {
            addCriterion("tipocotizacion in", values, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionNotIn(List<Short> values) {
            addCriterion("tipocotizacion not in", values, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionBetween(Short value1, Short value2) {
            addCriterion("tipocotizacion between", value1, value2, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionNotBetween(Short value1, Short value2) {
            addCriterion("tipocotizacion not between", value1, value2, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andMonedaIsNull() {
            addCriterion("moneda is null");
            return (Criteria) this;
        }

        public Criteria andMonedaIsNotNull() {
            addCriterion("moneda is not null");
            return (Criteria) this;
        }

        public Criteria andMonedaEqualTo(String value) {
            addCriterion("moneda =", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaNotEqualTo(String value) {
            addCriterion("moneda <>", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaGreaterThan(String value) {
            addCriterion("moneda >", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaGreaterThanOrEqualTo(String value) {
            addCriterion("moneda >=", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaLessThan(String value) {
            addCriterion("moneda <", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaLessThanOrEqualTo(String value) {
            addCriterion("moneda <=", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaLike(String value) {
            addCriterion("moneda like", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaNotLike(String value) {
            addCriterion("moneda not like", value, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaIn(List<String> values) {
            addCriterion("moneda in", values, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaNotIn(List<String> values) {
            addCriterion("moneda not in", values, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaBetween(String value1, String value2) {
            addCriterion("moneda between", value1, value2, "moneda");
            return (Criteria) this;
        }

        public Criteria andMonedaNotBetween(String value1, String value2) {
            addCriterion("moneda not between", value1, value2, "moneda");
            return (Criteria) this;
        }

        public Criteria andTipoCambioIsNull() {
            addCriterion("tipo_cambio is null");
            return (Criteria) this;
        }

        public Criteria andTipoCambioIsNotNull() {
            addCriterion("tipo_cambio is not null");
            return (Criteria) this;
        }

        public Criteria andTipoCambioEqualTo(BigDecimal value) {
            addCriterion("tipo_cambio =", value, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioNotEqualTo(BigDecimal value) {
            addCriterion("tipo_cambio <>", value, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioGreaterThan(BigDecimal value) {
            addCriterion("tipo_cambio >", value, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tipo_cambio >=", value, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioLessThan(BigDecimal value) {
            addCriterion("tipo_cambio <", value, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tipo_cambio <=", value, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioIn(List<BigDecimal> values) {
            addCriterion("tipo_cambio in", values, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioNotIn(List<BigDecimal> values) {
            addCriterion("tipo_cambio not in", values, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tipo_cambio between", value1, value2, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andTipoCambioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tipo_cambio not between", value1, value2, "tipoCambio");
            return (Criteria) this;
        }

        public Criteria andFacNumeroIsNull() {
            addCriterion("fac_numero is null");
            return (Criteria) this;
        }

        public Criteria andFacNumeroIsNotNull() {
            addCriterion("fac_numero is not null");
            return (Criteria) this;
        }

        public Criteria andFacNumeroEqualTo(Integer value) {
            addCriterion("fac_numero =", value, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroNotEqualTo(Integer value) {
            addCriterion("fac_numero <>", value, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroGreaterThan(Integer value) {
            addCriterion("fac_numero >", value, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroGreaterThanOrEqualTo(Integer value) {
            addCriterion("fac_numero >=", value, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroLessThan(Integer value) {
            addCriterion("fac_numero <", value, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroLessThanOrEqualTo(Integer value) {
            addCriterion("fac_numero <=", value, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroIn(List<Integer> values) {
            addCriterion("fac_numero in", values, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroNotIn(List<Integer> values) {
            addCriterion("fac_numero not in", values, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroBetween(Integer value1, Integer value2) {
            addCriterion("fac_numero between", value1, value2, "facNumero");
            return (Criteria) this;
        }

        public Criteria andFacNumeroNotBetween(Integer value1, Integer value2) {
            addCriterion("fac_numero not between", value1, value2, "facNumero");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoIsNull() {
            addCriterion("tipodocumento is null");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoIsNotNull() {
            addCriterion("tipodocumento is not null");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoEqualTo(String value) {
            addCriterion("tipodocumento =", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoNotEqualTo(String value) {
            addCriterion("tipodocumento <>", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoGreaterThan(String value) {
            addCriterion("tipodocumento >", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("tipodocumento >=", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoLessThan(String value) {
            addCriterion("tipodocumento <", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoLessThanOrEqualTo(String value) {
            addCriterion("tipodocumento <=", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoLike(String value) {
            addCriterion("tipodocumento like", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoNotLike(String value) {
            addCriterion("tipodocumento not like", value, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoIn(List<String> values) {
            addCriterion("tipodocumento in", values, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoNotIn(List<String> values) {
            addCriterion("tipodocumento not in", values, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoBetween(String value1, String value2) {
            addCriterion("tipodocumento between", value1, value2, "tipodocumento");
            return (Criteria) this;
        }

        public Criteria andTipodocumentoNotBetween(String value1, String value2) {
            addCriterion("tipodocumento not between", value1, value2, "tipodocumento");
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

        public Criteria andGrupoIsNull() {
            addCriterion("grupo is null");
            return (Criteria) this;
        }

        public Criteria andGrupoIsNotNull() {
            addCriterion("grupo is not null");
            return (Criteria) this;
        }

        public Criteria andGrupoEqualTo(String value) {
            addCriterion("grupo =", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoNotEqualTo(String value) {
            addCriterion("grupo <>", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoGreaterThan(String value) {
            addCriterion("grupo >", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoGreaterThanOrEqualTo(String value) {
            addCriterion("grupo >=", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoLessThan(String value) {
            addCriterion("grupo <", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoLessThanOrEqualTo(String value) {
            addCriterion("grupo <=", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoLike(String value) {
            addCriterion("grupo like", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoNotLike(String value) {
            addCriterion("grupo not like", value, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoIn(List<String> values) {
            addCriterion("grupo in", values, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoNotIn(List<String> values) {
            addCriterion("grupo not in", values, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoBetween(String value1, String value2) {
            addCriterion("grupo between", value1, value2, "grupo");
            return (Criteria) this;
        }

        public Criteria andGrupoNotBetween(String value1, String value2) {
            addCriterion("grupo not between", value1, value2, "grupo");
            return (Criteria) this;
        }

        public Criteria andCodorigenIsNull() {
            addCriterion("codorigen is null");
            return (Criteria) this;
        }

        public Criteria andCodorigenIsNotNull() {
            addCriterion("codorigen is not null");
            return (Criteria) this;
        }

        public Criteria andCodorigenEqualTo(String value) {
            addCriterion("codorigen =", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenNotEqualTo(String value) {
            addCriterion("codorigen <>", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenGreaterThan(String value) {
            addCriterion("codorigen >", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenGreaterThanOrEqualTo(String value) {
            addCriterion("codorigen >=", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenLessThan(String value) {
            addCriterion("codorigen <", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenLessThanOrEqualTo(String value) {
            addCriterion("codorigen <=", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenLike(String value) {
            addCriterion("codorigen like", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenNotLike(String value) {
            addCriterion("codorigen not like", value, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenIn(List<String> values) {
            addCriterion("codorigen in", values, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenNotIn(List<String> values) {
            addCriterion("codorigen not in", values, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenBetween(String value1, String value2) {
            addCriterion("codorigen between", value1, value2, "codorigen");
            return (Criteria) this;
        }

        public Criteria andCodorigenNotBetween(String value1, String value2) {
            addCriterion("codorigen not between", value1, value2, "codorigen");
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

        public Criteria andImportePlusIsNull() {
            addCriterion("importe_plus is null");
            return (Criteria) this;
        }

        public Criteria andImportePlusIsNotNull() {
            addCriterion("importe_plus is not null");
            return (Criteria) this;
        }

        public Criteria andImportePlusEqualTo(BigDecimal value) {
            addCriterion("importe_plus =", value, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusNotEqualTo(BigDecimal value) {
            addCriterion("importe_plus <>", value, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusGreaterThan(BigDecimal value) {
            addCriterion("importe_plus >", value, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("importe_plus >=", value, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusLessThan(BigDecimal value) {
            addCriterion("importe_plus <", value, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("importe_plus <=", value, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusIn(List<BigDecimal> values) {
            addCriterion("importe_plus in", values, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusNotIn(List<BigDecimal> values) {
            addCriterion("importe_plus not in", values, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe_plus between", value1, value2, "importePlus");
            return (Criteria) this;
        }

        public Criteria andImportePlusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe_plus not between", value1, value2, "importePlus");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalIsNull() {
            addCriterion("tarifa_adicional is null");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalIsNotNull() {
            addCriterion("tarifa_adicional is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalEqualTo(BigDecimal value) {
            addCriterion("tarifa_adicional =", value, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_adicional <>", value, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalGreaterThan(BigDecimal value) {
            addCriterion("tarifa_adicional >", value, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_adicional >=", value, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalLessThan(BigDecimal value) {
            addCriterion("tarifa_adicional <", value, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_adicional <=", value, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalIn(List<BigDecimal> values) {
            addCriterion("tarifa_adicional in", values, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_adicional not in", values, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_adicional between", value1, value2, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andTarifaAdicionalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_adicional not between", value1, value2, "tarifaAdicional");
            return (Criteria) this;
        }

        public Criteria andImporteServicioIsNull() {
            addCriterion("importe_servicio is null");
            return (Criteria) this;
        }

        public Criteria andImporteServicioIsNotNull() {
            addCriterion("importe_servicio is not null");
            return (Criteria) this;
        }

        public Criteria andImporteServicioEqualTo(BigDecimal value) {
            addCriterion("importe_servicio =", value, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioNotEqualTo(BigDecimal value) {
            addCriterion("importe_servicio <>", value, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioGreaterThan(BigDecimal value) {
            addCriterion("importe_servicio >", value, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("importe_servicio >=", value, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioLessThan(BigDecimal value) {
            addCriterion("importe_servicio <", value, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("importe_servicio <=", value, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioIn(List<BigDecimal> values) {
            addCriterion("importe_servicio in", values, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioNotIn(List<BigDecimal> values) {
            addCriterion("importe_servicio not in", values, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe_servicio between", value1, value2, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImporteServicioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe_servicio not between", value1, value2, "importeServicio");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoIsNull() {
            addCriterion("importe_periferico is null");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoIsNotNull() {
            addCriterion("importe_periferico is not null");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoEqualTo(BigDecimal value) {
            addCriterion("importe_periferico =", value, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoNotEqualTo(BigDecimal value) {
            addCriterion("importe_periferico <>", value, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoGreaterThan(BigDecimal value) {
            addCriterion("importe_periferico >", value, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("importe_periferico >=", value, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoLessThan(BigDecimal value) {
            addCriterion("importe_periferico <", value, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("importe_periferico <=", value, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoIn(List<BigDecimal> values) {
            addCriterion("importe_periferico in", values, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoNotIn(List<BigDecimal> values) {
            addCriterion("importe_periferico not in", values, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe_periferico between", value1, value2, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andImportePerifericoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("importe_periferico not between", value1, value2, "importePeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoIsNull() {
            addCriterion("monto_periferico is null");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoIsNotNull() {
            addCriterion("monto_periferico is not null");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoEqualTo(BigDecimal value) {
            addCriterion("monto_periferico =", value, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoNotEqualTo(BigDecimal value) {
            addCriterion("monto_periferico <>", value, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoGreaterThan(BigDecimal value) {
            addCriterion("monto_periferico >", value, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monto_periferico >=", value, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoLessThan(BigDecimal value) {
            addCriterion("monto_periferico <", value, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monto_periferico <=", value, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoIn(List<BigDecimal> values) {
            addCriterion("monto_periferico in", values, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoNotIn(List<BigDecimal> values) {
            addCriterion("monto_periferico not in", values, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monto_periferico between", value1, value2, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andMontoPerifericoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monto_periferico not between", value1, value2, "montoPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoIsNull() {
            addCriterion("cnt_periferico is null");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoIsNotNull() {
            addCriterion("cnt_periferico is not null");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoEqualTo(Long value) {
            addCriterion("cnt_periferico =", value, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoNotEqualTo(Long value) {
            addCriterion("cnt_periferico <>", value, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoGreaterThan(Long value) {
            addCriterion("cnt_periferico >", value, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoGreaterThanOrEqualTo(Long value) {
            addCriterion("cnt_periferico >=", value, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoLessThan(Long value) {
            addCriterion("cnt_periferico <", value, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoLessThanOrEqualTo(Long value) {
            addCriterion("cnt_periferico <=", value, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoIn(List<Long> values) {
            addCriterion("cnt_periferico in", values, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoNotIn(List<Long> values) {
            addCriterion("cnt_periferico not in", values, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoBetween(Long value1, Long value2) {
            addCriterion("cnt_periferico between", value1, value2, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCntPerifericoNotBetween(Long value1, Long value2) {
            addCriterion("cnt_periferico not between", value1, value2, "cntPeriferico");
            return (Criteria) this;
        }

        public Criteria andCodtrackingIsNull() {
            addCriterion("codtracking is null");
            return (Criteria) this;
        }

        public Criteria andCodtrackingIsNotNull() {
            addCriterion("codtracking is not null");
            return (Criteria) this;
        }

        public Criteria andCodtrackingEqualTo(Short value) {
            addCriterion("codtracking =", value, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingNotEqualTo(Short value) {
            addCriterion("codtracking <>", value, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingGreaterThan(Short value) {
            addCriterion("codtracking >", value, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingGreaterThanOrEqualTo(Short value) {
            addCriterion("codtracking >=", value, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingLessThan(Short value) {
            addCriterion("codtracking <", value, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingLessThanOrEqualTo(Short value) {
            addCriterion("codtracking <=", value, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingIn(List<Short> values) {
            addCriterion("codtracking in", values, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingNotIn(List<Short> values) {
            addCriterion("codtracking not in", values, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingBetween(Short value1, Short value2) {
            addCriterion("codtracking between", value1, value2, "codtracking");
            return (Criteria) this;
        }

        public Criteria andCodtrackingNotBetween(Short value1, Short value2) {
            addCriterion("codtracking not between", value1, value2, "codtracking");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoIsNull() {
            addCriterion("usuario_recojo is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoIsNotNull() {
            addCriterion("usuario_recojo is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoEqualTo(String value) {
            addCriterion("usuario_recojo =", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoNotEqualTo(String value) {
            addCriterion("usuario_recojo <>", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoGreaterThan(String value) {
            addCriterion("usuario_recojo >", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoGreaterThanOrEqualTo(String value) {
            addCriterion("usuario_recojo >=", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoLessThan(String value) {
            addCriterion("usuario_recojo <", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoLessThanOrEqualTo(String value) {
            addCriterion("usuario_recojo <=", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoLike(String value) {
            addCriterion("usuario_recojo like", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoNotLike(String value) {
            addCriterion("usuario_recojo not like", value, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoIn(List<String> values) {
            addCriterion("usuario_recojo in", values, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoNotIn(List<String> values) {
            addCriterion("usuario_recojo not in", values, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoBetween(String value1, String value2) {
            addCriterion("usuario_recojo between", value1, value2, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andUsuarioRecojoNotBetween(String value1, String value2) {
            addCriterion("usuario_recojo not between", value1, value2, "usuarioRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoIsNull() {
            addCriterion("fecha_recojo is null");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoIsNotNull() {
            addCriterion("fecha_recojo is not null");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoEqualTo(Date value) {
            addCriterion("fecha_recojo =", value, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoNotEqualTo(Date value) {
            addCriterion("fecha_recojo <>", value, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoGreaterThan(Date value) {
            addCriterion("fecha_recojo >", value, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_recojo >=", value, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoLessThan(Date value) {
            addCriterion("fecha_recojo <", value, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoLessThanOrEqualTo(Date value) {
            addCriterion("fecha_recojo <=", value, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoIn(List<Date> values) {
            addCriterion("fecha_recojo in", values, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoNotIn(List<Date> values) {
            addCriterion("fecha_recojo not in", values, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoBetween(Date value1, Date value2) {
            addCriterion("fecha_recojo between", value1, value2, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFechaRecojoNotBetween(Date value1, Date value2) {
            addCriterion("fecha_recojo not between", value1, value2, "fechaRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoIsNull() {
            addCriterion("flag_recojo is null");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoIsNotNull() {
            addCriterion("flag_recojo is not null");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoEqualTo(Short value) {
            addCriterion("flag_recojo =", value, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoNotEqualTo(Short value) {
            addCriterion("flag_recojo <>", value, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoGreaterThan(Short value) {
            addCriterion("flag_recojo >", value, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoGreaterThanOrEqualTo(Short value) {
            addCriterion("flag_recojo >=", value, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoLessThan(Short value) {
            addCriterion("flag_recojo <", value, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoLessThanOrEqualTo(Short value) {
            addCriterion("flag_recojo <=", value, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoIn(List<Short> values) {
            addCriterion("flag_recojo in", values, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoNotIn(List<Short> values) {
            addCriterion("flag_recojo not in", values, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoBetween(Short value1, Short value2) {
            addCriterion("flag_recojo between", value1, value2, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andFlagRecojoNotBetween(Short value1, Short value2) {
            addCriterion("flag_recojo not between", value1, value2, "flagRecojo");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenIsNull() {
            addCriterion("tipo_pago_orden is null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenIsNotNull() {
            addCriterion("tipo_pago_orden is not null");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenEqualTo(Short value) {
            addCriterion("tipo_pago_orden =", value, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenNotEqualTo(Short value) {
            addCriterion("tipo_pago_orden <>", value, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenGreaterThan(Short value) {
            addCriterion("tipo_pago_orden >", value, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenGreaterThanOrEqualTo(Short value) {
            addCriterion("tipo_pago_orden >=", value, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenLessThan(Short value) {
            addCriterion("tipo_pago_orden <", value, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenLessThanOrEqualTo(Short value) {
            addCriterion("tipo_pago_orden <=", value, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenIn(List<Short> values) {
            addCriterion("tipo_pago_orden in", values, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenNotIn(List<Short> values) {
            addCriterion("tipo_pago_orden not in", values, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenBetween(Short value1, Short value2) {
            addCriterion("tipo_pago_orden between", value1, value2, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andTipoPagoOrdenNotBetween(Short value1, Short value2) {
            addCriterion("tipo_pago_orden not between", value1, value2, "tipoPagoOrden");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenIsNull() {
            addCriterion("ciudad_origen is null");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenIsNotNull() {
            addCriterion("ciudad_origen is not null");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenEqualTo(String value) {
            addCriterion("ciudad_origen =", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenNotEqualTo(String value) {
            addCriterion("ciudad_origen <>", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenGreaterThan(String value) {
            addCriterion("ciudad_origen >", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenGreaterThanOrEqualTo(String value) {
            addCriterion("ciudad_origen >=", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenLessThan(String value) {
            addCriterion("ciudad_origen <", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenLessThanOrEqualTo(String value) {
            addCriterion("ciudad_origen <=", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenLike(String value) {
            addCriterion("ciudad_origen like", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenNotLike(String value) {
            addCriterion("ciudad_origen not like", value, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenIn(List<String> values) {
            addCriterion("ciudad_origen in", values, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenNotIn(List<String> values) {
            addCriterion("ciudad_origen not in", values, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenBetween(String value1, String value2) {
            addCriterion("ciudad_origen between", value1, value2, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadOrigenNotBetween(String value1, String value2) {
            addCriterion("ciudad_origen not between", value1, value2, "ciudadOrigen");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoIsNull() {
            addCriterion("ciudad_destino is null");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoIsNotNull() {
            addCriterion("ciudad_destino is not null");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoEqualTo(String value) {
            addCriterion("ciudad_destino =", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoNotEqualTo(String value) {
            addCriterion("ciudad_destino <>", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoGreaterThan(String value) {
            addCriterion("ciudad_destino >", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoGreaterThanOrEqualTo(String value) {
            addCriterion("ciudad_destino >=", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoLessThan(String value) {
            addCriterion("ciudad_destino <", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoLessThanOrEqualTo(String value) {
            addCriterion("ciudad_destino <=", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoLike(String value) {
            addCriterion("ciudad_destino like", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoNotLike(String value) {
            addCriterion("ciudad_destino not like", value, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoIn(List<String> values) {
            addCriterion("ciudad_destino in", values, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoNotIn(List<String> values) {
            addCriterion("ciudad_destino not in", values, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoBetween(String value1, String value2) {
            addCriterion("ciudad_destino between", value1, value2, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andCiudadDestinoNotBetween(String value1, String value2) {
            addCriterion("ciudad_destino not between", value1, value2, "ciudadDestino");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoIsNull() {
            addCriterion("valor_declarado is null");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoIsNotNull() {
            addCriterion("valor_declarado is not null");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoEqualTo(BigDecimal value) {
            addCriterion("valor_declarado =", value, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoNotEqualTo(BigDecimal value) {
            addCriterion("valor_declarado <>", value, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoGreaterThan(BigDecimal value) {
            addCriterion("valor_declarado >", value, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valor_declarado >=", value, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoLessThan(BigDecimal value) {
            addCriterion("valor_declarado <", value, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valor_declarado <=", value, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoIn(List<BigDecimal> values) {
            addCriterion("valor_declarado in", values, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoNotIn(List<BigDecimal> values) {
            addCriterion("valor_declarado not in", values, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valor_declarado between", value1, value2, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andValorDeclaradoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valor_declarado not between", value1, value2, "valorDeclarado");
            return (Criteria) this;
        }

        public Criteria andPrioridadIsNull() {
            addCriterion("prioridad is null");
            return (Criteria) this;
        }

        public Criteria andPrioridadIsNotNull() {
            addCriterion("prioridad is not null");
            return (Criteria) this;
        }

        public Criteria andPrioridadEqualTo(String value) {
            addCriterion("prioridad =", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadNotEqualTo(String value) {
            addCriterion("prioridad <>", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadGreaterThan(String value) {
            addCriterion("prioridad >", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadGreaterThanOrEqualTo(String value) {
            addCriterion("prioridad >=", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadLessThan(String value) {
            addCriterion("prioridad <", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadLessThanOrEqualTo(String value) {
            addCriterion("prioridad <=", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadLike(String value) {
            addCriterion("prioridad like", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadNotLike(String value) {
            addCriterion("prioridad not like", value, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadIn(List<String> values) {
            addCriterion("prioridad in", values, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadNotIn(List<String> values) {
            addCriterion("prioridad not in", values, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadBetween(String value1, String value2) {
            addCriterion("prioridad between", value1, value2, "prioridad");
            return (Criteria) this;
        }

        public Criteria andPrioridadNotBetween(String value1, String value2) {
            addCriterion("prioridad not between", value1, value2, "prioridad");
            return (Criteria) this;
        }

        public Criteria andNrooperadorIsNull() {
            addCriterion("nrooperador is null");
            return (Criteria) this;
        }

        public Criteria andNrooperadorIsNotNull() {
            addCriterion("nrooperador is not null");
            return (Criteria) this;
        }

        public Criteria andNrooperadorEqualTo(String value) {
            addCriterion("nrooperador =", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorNotEqualTo(String value) {
            addCriterion("nrooperador <>", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorGreaterThan(String value) {
            addCriterion("nrooperador >", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorGreaterThanOrEqualTo(String value) {
            addCriterion("nrooperador >=", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorLessThan(String value) {
            addCriterion("nrooperador <", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorLessThanOrEqualTo(String value) {
            addCriterion("nrooperador <=", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorLike(String value) {
            addCriterion("nrooperador like", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorNotLike(String value) {
            addCriterion("nrooperador not like", value, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorIn(List<String> values) {
            addCriterion("nrooperador in", values, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorNotIn(List<String> values) {
            addCriterion("nrooperador not in", values, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorBetween(String value1, String value2) {
            addCriterion("nrooperador between", value1, value2, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andNrooperadorNotBetween(String value1, String value2) {
            addCriterion("nrooperador not between", value1, value2, "nrooperador");
            return (Criteria) this;
        }

        public Criteria andCodrecojoIsNull() {
            addCriterion("codrecojo is null");
            return (Criteria) this;
        }

        public Criteria andCodrecojoIsNotNull() {
            addCriterion("codrecojo is not null");
            return (Criteria) this;
        }

        public Criteria andCodrecojoEqualTo(String value) {
            addCriterion("codrecojo =", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoNotEqualTo(String value) {
            addCriterion("codrecojo <>", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoGreaterThan(String value) {
            addCriterion("codrecojo >", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoGreaterThanOrEqualTo(String value) {
            addCriterion("codrecojo >=", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoLessThan(String value) {
            addCriterion("codrecojo <", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoLessThanOrEqualTo(String value) {
            addCriterion("codrecojo <=", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoLike(String value) {
            addCriterion("codrecojo like", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoNotLike(String value) {
            addCriterion("codrecojo not like", value, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoIn(List<String> values) {
            addCriterion("codrecojo in", values, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoNotIn(List<String> values) {
            addCriterion("codrecojo not in", values, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoBetween(String value1, String value2) {
            addCriterion("codrecojo between", value1, value2, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodrecojoNotBetween(String value1, String value2) {
            addCriterion("codrecojo not between", value1, value2, "codrecojo");
            return (Criteria) this;
        }

        public Criteria andCodConformidadIsNull() {
            addCriterion("cod_conformidad is null");
            return (Criteria) this;
        }

        public Criteria andCodConformidadIsNotNull() {
            addCriterion("cod_conformidad is not null");
            return (Criteria) this;
        }

        public Criteria andCodConformidadEqualTo(String value) {
            addCriterion("cod_conformidad =", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadNotEqualTo(String value) {
            addCriterion("cod_conformidad <>", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadGreaterThan(String value) {
            addCriterion("cod_conformidad >", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadGreaterThanOrEqualTo(String value) {
            addCriterion("cod_conformidad >=", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadLessThan(String value) {
            addCriterion("cod_conformidad <", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadLessThanOrEqualTo(String value) {
            addCriterion("cod_conformidad <=", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadLike(String value) {
            addCriterion("cod_conformidad like", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadNotLike(String value) {
            addCriterion("cod_conformidad not like", value, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadIn(List<String> values) {
            addCriterion("cod_conformidad in", values, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadNotIn(List<String> values) {
            addCriterion("cod_conformidad not in", values, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadBetween(String value1, String value2) {
            addCriterion("cod_conformidad between", value1, value2, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andCodConformidadNotBetween(String value1, String value2) {
            addCriterion("cod_conformidad not between", value1, value2, "codConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadIsNull() {
            addCriterion("obs_conformidad is null");
            return (Criteria) this;
        }

        public Criteria andObsConformidadIsNotNull() {
            addCriterion("obs_conformidad is not null");
            return (Criteria) this;
        }

        public Criteria andObsConformidadEqualTo(String value) {
            addCriterion("obs_conformidad =", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadNotEqualTo(String value) {
            addCriterion("obs_conformidad <>", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadGreaterThan(String value) {
            addCriterion("obs_conformidad >", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadGreaterThanOrEqualTo(String value) {
            addCriterion("obs_conformidad >=", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadLessThan(String value) {
            addCriterion("obs_conformidad <", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadLessThanOrEqualTo(String value) {
            addCriterion("obs_conformidad <=", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadLike(String value) {
            addCriterion("obs_conformidad like", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadNotLike(String value) {
            addCriterion("obs_conformidad not like", value, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadIn(List<String> values) {
            addCriterion("obs_conformidad in", values, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadNotIn(List<String> values) {
            addCriterion("obs_conformidad not in", values, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadBetween(String value1, String value2) {
            addCriterion("obs_conformidad between", value1, value2, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andObsConformidadNotBetween(String value1, String value2) {
            addCriterion("obs_conformidad not between", value1, value2, "obsConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadIsNull() {
            addCriterion("usu_conformidad is null");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadIsNotNull() {
            addCriterion("usu_conformidad is not null");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadEqualTo(String value) {
            addCriterion("usu_conformidad =", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadNotEqualTo(String value) {
            addCriterion("usu_conformidad <>", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadGreaterThan(String value) {
            addCriterion("usu_conformidad >", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadGreaterThanOrEqualTo(String value) {
            addCriterion("usu_conformidad >=", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadLessThan(String value) {
            addCriterion("usu_conformidad <", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadLessThanOrEqualTo(String value) {
            addCriterion("usu_conformidad <=", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadLike(String value) {
            addCriterion("usu_conformidad like", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadNotLike(String value) {
            addCriterion("usu_conformidad not like", value, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadIn(List<String> values) {
            addCriterion("usu_conformidad in", values, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadNotIn(List<String> values) {
            addCriterion("usu_conformidad not in", values, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadBetween(String value1, String value2) {
            addCriterion("usu_conformidad between", value1, value2, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andUsuConformidadNotBetween(String value1, String value2) {
            addCriterion("usu_conformidad not between", value1, value2, "usuConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadIsNull() {
            addCriterion("fec_conformidad is null");
            return (Criteria) this;
        }

        public Criteria andFecConformidadIsNotNull() {
            addCriterion("fec_conformidad is not null");
            return (Criteria) this;
        }

        public Criteria andFecConformidadEqualTo(Date value) {
            addCriterion("fec_conformidad =", value, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadNotEqualTo(Date value) {
            addCriterion("fec_conformidad <>", value, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadGreaterThan(Date value) {
            addCriterion("fec_conformidad >", value, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_conformidad >=", value, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadLessThan(Date value) {
            addCriterion("fec_conformidad <", value, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadLessThanOrEqualTo(Date value) {
            addCriterion("fec_conformidad <=", value, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadIn(List<Date> values) {
            addCriterion("fec_conformidad in", values, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadNotIn(List<Date> values) {
            addCriterion("fec_conformidad not in", values, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadBetween(Date value1, Date value2) {
            addCriterion("fec_conformidad between", value1, value2, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andFecConformidadNotBetween(Date value1, Date value2) {
            addCriterion("fec_conformidad not between", value1, value2, "fecConformidad");
            return (Criteria) this;
        }

        public Criteria andCodActivaIsNull() {
            addCriterion("cod_activa is null");
            return (Criteria) this;
        }

        public Criteria andCodActivaIsNotNull() {
            addCriterion("cod_activa is not null");
            return (Criteria) this;
        }

        public Criteria andCodActivaEqualTo(Short value) {
            addCriterion("cod_activa =", value, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaNotEqualTo(Short value) {
            addCriterion("cod_activa <>", value, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaGreaterThan(Short value) {
            addCriterion("cod_activa >", value, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaGreaterThanOrEqualTo(Short value) {
            addCriterion("cod_activa >=", value, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaLessThan(Short value) {
            addCriterion("cod_activa <", value, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaLessThanOrEqualTo(Short value) {
            addCriterion("cod_activa <=", value, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaIn(List<Short> values) {
            addCriterion("cod_activa in", values, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaNotIn(List<Short> values) {
            addCriterion("cod_activa not in", values, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaBetween(Short value1, Short value2) {
            addCriterion("cod_activa between", value1, value2, "codActiva");
            return (Criteria) this;
        }

        public Criteria andCodActivaNotBetween(Short value1, Short value2) {
            addCriterion("cod_activa not between", value1, value2, "codActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaIsNull() {
            addCriterion("ususario_activa is null");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaIsNotNull() {
            addCriterion("ususario_activa is not null");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaEqualTo(String value) {
            addCriterion("ususario_activa =", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaNotEqualTo(String value) {
            addCriterion("ususario_activa <>", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaGreaterThan(String value) {
            addCriterion("ususario_activa >", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaGreaterThanOrEqualTo(String value) {
            addCriterion("ususario_activa >=", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaLessThan(String value) {
            addCriterion("ususario_activa <", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaLessThanOrEqualTo(String value) {
            addCriterion("ususario_activa <=", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaLike(String value) {
            addCriterion("ususario_activa like", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaNotLike(String value) {
            addCriterion("ususario_activa not like", value, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaIn(List<String> values) {
            addCriterion("ususario_activa in", values, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaNotIn(List<String> values) {
            addCriterion("ususario_activa not in", values, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaBetween(String value1, String value2) {
            addCriterion("ususario_activa between", value1, value2, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andUsusarioActivaNotBetween(String value1, String value2) {
            addCriterion("ususario_activa not between", value1, value2, "ususarioActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaIsNull() {
            addCriterion("fecha_activa is null");
            return (Criteria) this;
        }

        public Criteria andFechaActivaIsNotNull() {
            addCriterion("fecha_activa is not null");
            return (Criteria) this;
        }

        public Criteria andFechaActivaEqualTo(Date value) {
            addCriterion("fecha_activa =", value, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaNotEqualTo(Date value) {
            addCriterion("fecha_activa <>", value, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaGreaterThan(Date value) {
            addCriterion("fecha_activa >", value, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_activa >=", value, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaLessThan(Date value) {
            addCriterion("fecha_activa <", value, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaLessThanOrEqualTo(Date value) {
            addCriterion("fecha_activa <=", value, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaIn(List<Date> values) {
            addCriterion("fecha_activa in", values, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaNotIn(List<Date> values) {
            addCriterion("fecha_activa not in", values, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaBetween(Date value1, Date value2) {
            addCriterion("fecha_activa between", value1, value2, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andFechaActivaNotBetween(Date value1, Date value2) {
            addCriterion("fecha_activa not between", value1, value2, "fechaActiva");
            return (Criteria) this;
        }

        public Criteria andTTransporteIsNull() {
            addCriterion("t_transporte is null");
            return (Criteria) this;
        }

        public Criteria andTTransporteIsNotNull() {
            addCriterion("t_transporte is not null");
            return (Criteria) this;
        }

        public Criteria andTTransporteEqualTo(String value) {
            addCriterion("t_transporte =", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotEqualTo(String value) {
            addCriterion("t_transporte <>", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteGreaterThan(String value) {
            addCriterion("t_transporte >", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteGreaterThanOrEqualTo(String value) {
            addCriterion("t_transporte >=", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteLessThan(String value) {
            addCriterion("t_transporte <", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteLessThanOrEqualTo(String value) {
            addCriterion("t_transporte <=", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteLike(String value) {
            addCriterion("t_transporte like", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotLike(String value) {
            addCriterion("t_transporte not like", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteIn(List<String> values) {
            addCriterion("t_transporte in", values, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotIn(List<String> values) {
            addCriterion("t_transporte not in", values, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteBetween(String value1, String value2) {
            addCriterion("t_transporte between", value1, value2, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotBetween(String value1, String value2) {
            addCriterion("t_transporte not between", value1, value2, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andSerieDevcIsNull() {
            addCriterion("serie_devc is null");
            return (Criteria) this;
        }

        public Criteria andSerieDevcIsNotNull() {
            addCriterion("serie_devc is not null");
            return (Criteria) this;
        }

        public Criteria andSerieDevcEqualTo(String value) {
            addCriterion("serie_devc =", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcNotEqualTo(String value) {
            addCriterion("serie_devc <>", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcGreaterThan(String value) {
            addCriterion("serie_devc >", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcGreaterThanOrEqualTo(String value) {
            addCriterion("serie_devc >=", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcLessThan(String value) {
            addCriterion("serie_devc <", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcLessThanOrEqualTo(String value) {
            addCriterion("serie_devc <=", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcLike(String value) {
            addCriterion("serie_devc like", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcNotLike(String value) {
            addCriterion("serie_devc not like", value, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcIn(List<String> values) {
            addCriterion("serie_devc in", values, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcNotIn(List<String> values) {
            addCriterion("serie_devc not in", values, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcBetween(String value1, String value2) {
            addCriterion("serie_devc between", value1, value2, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andSerieDevcNotBetween(String value1, String value2) {
            addCriterion("serie_devc not between", value1, value2, "serieDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcIsNull() {
            addCriterion("nro_devc is null");
            return (Criteria) this;
        }

        public Criteria andNroDevcIsNotNull() {
            addCriterion("nro_devc is not null");
            return (Criteria) this;
        }

        public Criteria andNroDevcEqualTo(String value) {
            addCriterion("nro_devc =", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcNotEqualTo(String value) {
            addCriterion("nro_devc <>", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcGreaterThan(String value) {
            addCriterion("nro_devc >", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcGreaterThanOrEqualTo(String value) {
            addCriterion("nro_devc >=", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcLessThan(String value) {
            addCriterion("nro_devc <", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcLessThanOrEqualTo(String value) {
            addCriterion("nro_devc <=", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcLike(String value) {
            addCriterion("nro_devc like", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcNotLike(String value) {
            addCriterion("nro_devc not like", value, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcIn(List<String> values) {
            addCriterion("nro_devc in", values, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcNotIn(List<String> values) {
            addCriterion("nro_devc not in", values, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcBetween(String value1, String value2) {
            addCriterion("nro_devc between", value1, value2, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andNroDevcNotBetween(String value1, String value2) {
            addCriterion("nro_devc not between", value1, value2, "nroDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcIsNull() {
            addCriterion("estado_devc is null");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcIsNotNull() {
            addCriterion("estado_devc is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcEqualTo(String value) {
            addCriterion("estado_devc =", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcNotEqualTo(String value) {
            addCriterion("estado_devc <>", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcGreaterThan(String value) {
            addCriterion("estado_devc >", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcGreaterThanOrEqualTo(String value) {
            addCriterion("estado_devc >=", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcLessThan(String value) {
            addCriterion("estado_devc <", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcLessThanOrEqualTo(String value) {
            addCriterion("estado_devc <=", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcLike(String value) {
            addCriterion("estado_devc like", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcNotLike(String value) {
            addCriterion("estado_devc not like", value, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcIn(List<String> values) {
            addCriterion("estado_devc in", values, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcNotIn(List<String> values) {
            addCriterion("estado_devc not in", values, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcBetween(String value1, String value2) {
            addCriterion("estado_devc between", value1, value2, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andEstadoDevcNotBetween(String value1, String value2) {
            addCriterion("estado_devc not between", value1, value2, "estadoDevc");
            return (Criteria) this;
        }

        public Criteria andObservacion2IsNull() {
            addCriterion("observacion2 is null");
            return (Criteria) this;
        }

        public Criteria andObservacion2IsNotNull() {
            addCriterion("observacion2 is not null");
            return (Criteria) this;
        }

        public Criteria andObservacion2EqualTo(String value) {
            addCriterion("observacion2 =", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2NotEqualTo(String value) {
            addCriterion("observacion2 <>", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2GreaterThan(String value) {
            addCriterion("observacion2 >", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2GreaterThanOrEqualTo(String value) {
            addCriterion("observacion2 >=", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2LessThan(String value) {
            addCriterion("observacion2 <", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2LessThanOrEqualTo(String value) {
            addCriterion("observacion2 <=", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2Like(String value) {
            addCriterion("observacion2 like", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2NotLike(String value) {
            addCriterion("observacion2 not like", value, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2In(List<String> values) {
            addCriterion("observacion2 in", values, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2NotIn(List<String> values) {
            addCriterion("observacion2 not in", values, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2Between(String value1, String value2) {
            addCriterion("observacion2 between", value1, value2, "observacion2");
            return (Criteria) this;
        }

        public Criteria andObservacion2NotBetween(String value1, String value2) {
            addCriterion("observacion2 not between", value1, value2, "observacion2");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolIsNull() {
            addCriterion("serieguiasol is null");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolIsNotNull() {
            addCriterion("serieguiasol is not null");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolEqualTo(String value) {
            addCriterion("serieguiasol =", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolNotEqualTo(String value) {
            addCriterion("serieguiasol <>", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolGreaterThan(String value) {
            addCriterion("serieguiasol >", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolGreaterThanOrEqualTo(String value) {
            addCriterion("serieguiasol >=", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolLessThan(String value) {
            addCriterion("serieguiasol <", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolLessThanOrEqualTo(String value) {
            addCriterion("serieguiasol <=", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolLike(String value) {
            addCriterion("serieguiasol like", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolNotLike(String value) {
            addCriterion("serieguiasol not like", value, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolIn(List<String> values) {
            addCriterion("serieguiasol in", values, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolNotIn(List<String> values) {
            addCriterion("serieguiasol not in", values, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolBetween(String value1, String value2) {
            addCriterion("serieguiasol between", value1, value2, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andSerieguiasolNotBetween(String value1, String value2) {
            addCriterion("serieguiasol not between", value1, value2, "serieguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolIsNull() {
            addCriterion("nroguiasol is null");
            return (Criteria) this;
        }

        public Criteria andNroguiasolIsNotNull() {
            addCriterion("nroguiasol is not null");
            return (Criteria) this;
        }

        public Criteria andNroguiasolEqualTo(String value) {
            addCriterion("nroguiasol =", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolNotEqualTo(String value) {
            addCriterion("nroguiasol <>", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolGreaterThan(String value) {
            addCriterion("nroguiasol >", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolGreaterThanOrEqualTo(String value) {
            addCriterion("nroguiasol >=", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolLessThan(String value) {
            addCriterion("nroguiasol <", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolLessThanOrEqualTo(String value) {
            addCriterion("nroguiasol <=", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolLike(String value) {
            addCriterion("nroguiasol like", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolNotLike(String value) {
            addCriterion("nroguiasol not like", value, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolIn(List<String> values) {
            addCriterion("nroguiasol in", values, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolNotIn(List<String> values) {
            addCriterion("nroguiasol not in", values, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolBetween(String value1, String value2) {
            addCriterion("nroguiasol between", value1, value2, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andNroguiasolNotBetween(String value1, String value2) {
            addCriterion("nroguiasol not between", value1, value2, "nroguiasol");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenIsNull() {
            addCriterion("flag_tipo_orden is null");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenIsNotNull() {
            addCriterion("flag_tipo_orden is not null");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenEqualTo(Short value) {
            addCriterion("flag_tipo_orden =", value, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenNotEqualTo(Short value) {
            addCriterion("flag_tipo_orden <>", value, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenGreaterThan(Short value) {
            addCriterion("flag_tipo_orden >", value, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenGreaterThanOrEqualTo(Short value) {
            addCriterion("flag_tipo_orden >=", value, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenLessThan(Short value) {
            addCriterion("flag_tipo_orden <", value, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenLessThanOrEqualTo(Short value) {
            addCriterion("flag_tipo_orden <=", value, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenIn(List<Short> values) {
            addCriterion("flag_tipo_orden in", values, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenNotIn(List<Short> values) {
            addCriterion("flag_tipo_orden not in", values, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenBetween(Short value1, Short value2) {
            addCriterion("flag_tipo_orden between", value1, value2, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andFlagTipoOrdenNotBetween(Short value1, Short value2) {
            addCriterion("flag_tipo_orden not between", value1, value2, "flagTipoOrden");
            return (Criteria) this;
        }

        public Criteria andCodigoIsNull() {
            addCriterion("codigo is null");
            return (Criteria) this;
        }

        public Criteria andCodigoIsNotNull() {
            addCriterion("codigo is not null");
            return (Criteria) this;
        }

        public Criteria andCodigoEqualTo(String value) {
            addCriterion("codigo =", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotEqualTo(String value) {
            addCriterion("codigo <>", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoGreaterThan(String value) {
            addCriterion("codigo >", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoGreaterThanOrEqualTo(String value) {
            addCriterion("codigo >=", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLessThan(String value) {
            addCriterion("codigo <", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLessThanOrEqualTo(String value) {
            addCriterion("codigo <=", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoLike(String value) {
            addCriterion("codigo like", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotLike(String value) {
            addCriterion("codigo not like", value, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoIn(List<String> values) {
            addCriterion("codigo in", values, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotIn(List<String> values) {
            addCriterion("codigo not in", values, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoBetween(String value1, String value2) {
            addCriterion("codigo between", value1, value2, "codigo");
            return (Criteria) this;
        }

        public Criteria andCodigoNotBetween(String value1, String value2) {
            addCriterion("codigo not between", value1, value2, "codigo");
            return (Criteria) this;
        }

        public Criteria andCntM3IsNull() {
            addCriterion("cnt_m3 is null");
            return (Criteria) this;
        }

        public Criteria andCntM3IsNotNull() {
            addCriterion("cnt_m3 is not null");
            return (Criteria) this;
        }

        public Criteria andCntM3EqualTo(Short value) {
            addCriterion("cnt_m3 =", value, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3NotEqualTo(Short value) {
            addCriterion("cnt_m3 <>", value, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3GreaterThan(Short value) {
            addCriterion("cnt_m3 >", value, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3GreaterThanOrEqualTo(Short value) {
            addCriterion("cnt_m3 >=", value, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3LessThan(Short value) {
            addCriterion("cnt_m3 <", value, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3LessThanOrEqualTo(Short value) {
            addCriterion("cnt_m3 <=", value, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3In(List<Short> values) {
            addCriterion("cnt_m3 in", values, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3NotIn(List<Short> values) {
            addCriterion("cnt_m3 not in", values, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3Between(Short value1, Short value2) {
            addCriterion("cnt_m3 between", value1, value2, "cntM3");
            return (Criteria) this;
        }

        public Criteria andCntM3NotBetween(Short value1, Short value2) {
            addCriterion("cnt_m3 not between", value1, value2, "cntM3");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadIsNull() {
            addCriterion("tipo_unidad is null");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadIsNotNull() {
            addCriterion("tipo_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadEqualTo(String value) {
            addCriterion("tipo_unidad =", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadNotEqualTo(String value) {
            addCriterion("tipo_unidad <>", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadGreaterThan(String value) {
            addCriterion("tipo_unidad >", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_unidad >=", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadLessThan(String value) {
            addCriterion("tipo_unidad <", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadLessThanOrEqualTo(String value) {
            addCriterion("tipo_unidad <=", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadLike(String value) {
            addCriterion("tipo_unidad like", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadNotLike(String value) {
            addCriterion("tipo_unidad not like", value, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadIn(List<String> values) {
            addCriterion("tipo_unidad in", values, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadNotIn(List<String> values) {
            addCriterion("tipo_unidad not in", values, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadBetween(String value1, String value2) {
            addCriterion("tipo_unidad between", value1, value2, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andTipoUnidadNotBetween(String value1, String value2) {
            addCriterion("tipo_unidad not between", value1, value2, "tipoUnidad");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioIsNull() {
            addCriterion("cod_sub_servicio is null");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioIsNotNull() {
            addCriterion("cod_sub_servicio is not null");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioEqualTo(String value) {
            addCriterion("cod_sub_servicio =", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioNotEqualTo(String value) {
            addCriterion("cod_sub_servicio <>", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioGreaterThan(String value) {
            addCriterion("cod_sub_servicio >", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioGreaterThanOrEqualTo(String value) {
            addCriterion("cod_sub_servicio >=", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioLessThan(String value) {
            addCriterion("cod_sub_servicio <", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioLessThanOrEqualTo(String value) {
            addCriterion("cod_sub_servicio <=", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioLike(String value) {
            addCriterion("cod_sub_servicio like", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioNotLike(String value) {
            addCriterion("cod_sub_servicio not like", value, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioIn(List<String> values) {
            addCriterion("cod_sub_servicio in", values, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioNotIn(List<String> values) {
            addCriterion("cod_sub_servicio not in", values, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioBetween(String value1, String value2) {
            addCriterion("cod_sub_servicio between", value1, value2, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andCodSubServicioNotBetween(String value1, String value2) {
            addCriterion("cod_sub_servicio not between", value1, value2, "codSubServicio");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaIsNull() {
            addCriterion("usuario_anula is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaIsNotNull() {
            addCriterion("usuario_anula is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaEqualTo(String value) {
            addCriterion("usuario_anula =", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaNotEqualTo(String value) {
            addCriterion("usuario_anula <>", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaGreaterThan(String value) {
            addCriterion("usuario_anula >", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaGreaterThanOrEqualTo(String value) {
            addCriterion("usuario_anula >=", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaLessThan(String value) {
            addCriterion("usuario_anula <", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaLessThanOrEqualTo(String value) {
            addCriterion("usuario_anula <=", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaLike(String value) {
            addCriterion("usuario_anula like", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaNotLike(String value) {
            addCriterion("usuario_anula not like", value, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaIn(List<String> values) {
            addCriterion("usuario_anula in", values, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaNotIn(List<String> values) {
            addCriterion("usuario_anula not in", values, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaBetween(String value1, String value2) {
            addCriterion("usuario_anula between", value1, value2, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andUsuarioAnulaNotBetween(String value1, String value2) {
            addCriterion("usuario_anula not between", value1, value2, "usuarioAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaIsNull() {
            addCriterion("fecha_anula is null");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaIsNotNull() {
            addCriterion("fecha_anula is not null");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaEqualTo(Date value) {
            addCriterion("fecha_anula =", value, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaNotEqualTo(Date value) {
            addCriterion("fecha_anula <>", value, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaGreaterThan(Date value) {
            addCriterion("fecha_anula >", value, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_anula >=", value, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaLessThan(Date value) {
            addCriterion("fecha_anula <", value, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaLessThanOrEqualTo(Date value) {
            addCriterion("fecha_anula <=", value, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaIn(List<Date> values) {
            addCriterion("fecha_anula in", values, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaNotIn(List<Date> values) {
            addCriterion("fecha_anula not in", values, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaBetween(Date value1, Date value2) {
            addCriterion("fecha_anula between", value1, value2, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andFechaAnulaNotBetween(Date value1, Date value2) {
            addCriterion("fecha_anula not between", value1, value2, "fechaAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaIsNull() {
            addCriterion("obs_anula is null");
            return (Criteria) this;
        }

        public Criteria andObsAnulaIsNotNull() {
            addCriterion("obs_anula is not null");
            return (Criteria) this;
        }

        public Criteria andObsAnulaEqualTo(String value) {
            addCriterion("obs_anula =", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaNotEqualTo(String value) {
            addCriterion("obs_anula <>", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaGreaterThan(String value) {
            addCriterion("obs_anula >", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaGreaterThanOrEqualTo(String value) {
            addCriterion("obs_anula >=", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaLessThan(String value) {
            addCriterion("obs_anula <", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaLessThanOrEqualTo(String value) {
            addCriterion("obs_anula <=", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaLike(String value) {
            addCriterion("obs_anula like", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaNotLike(String value) {
            addCriterion("obs_anula not like", value, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaIn(List<String> values) {
            addCriterion("obs_anula in", values, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaNotIn(List<String> values) {
            addCriterion("obs_anula not in", values, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaBetween(String value1, String value2) {
            addCriterion("obs_anula between", value1, value2, "obsAnula");
            return (Criteria) this;
        }

        public Criteria andObsAnulaNotBetween(String value1, String value2) {
            addCriterion("obs_anula not between", value1, value2, "obsAnula");
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