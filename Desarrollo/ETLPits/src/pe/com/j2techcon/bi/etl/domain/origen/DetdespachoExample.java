package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DetdespachoExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public DetdespachoExample() {
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

		public Criteria andSerieguiaIsNull() {
			addCriterion("serieguia is null");
			return (Criteria) this;
		}

		public Criteria andSerieguiaIsNotNull() {
			addCriterion("serieguia is not null");
			return (Criteria) this;
		}

		public Criteria andSerieguiaEqualTo(String value) {
			addCriterion("serieguia =", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaNotEqualTo(String value) {
			addCriterion("serieguia <>", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaGreaterThan(String value) {
			addCriterion("serieguia >", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaGreaterThanOrEqualTo(String value) {
			addCriterion("serieguia >=", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaLessThan(String value) {
			addCriterion("serieguia <", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaLessThanOrEqualTo(String value) {
			addCriterion("serieguia <=", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaLike(String value) {
			addCriterion("serieguia like", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaNotLike(String value) {
			addCriterion("serieguia not like", value, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaIn(List<String> values) {
			addCriterion("serieguia in", values, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaNotIn(List<String> values) {
			addCriterion("serieguia not in", values, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaBetween(String value1, String value2) {
			addCriterion("serieguia between", value1, value2, "serieguia");
			return (Criteria) this;
		}

		public Criteria andSerieguiaNotBetween(String value1, String value2) {
			addCriterion("serieguia not between", value1, value2, "serieguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaIsNull() {
			addCriterion("nroguia is null");
			return (Criteria) this;
		}

		public Criteria andNroguiaIsNotNull() {
			addCriterion("nroguia is not null");
			return (Criteria) this;
		}

		public Criteria andNroguiaEqualTo(String value) {
			addCriterion("nroguia =", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaNotEqualTo(String value) {
			addCriterion("nroguia <>", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaGreaterThan(String value) {
			addCriterion("nroguia >", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaGreaterThanOrEqualTo(String value) {
			addCriterion("nroguia >=", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaLessThan(String value) {
			addCriterion("nroguia <", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaLessThanOrEqualTo(String value) {
			addCriterion("nroguia <=", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaLike(String value) {
			addCriterion("nroguia like", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaNotLike(String value) {
			addCriterion("nroguia not like", value, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaIn(List<String> values) {
			addCriterion("nroguia in", values, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaNotIn(List<String> values) {
			addCriterion("nroguia not in", values, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaBetween(String value1, String value2) {
			addCriterion("nroguia between", value1, value2, "nroguia");
			return (Criteria) this;
		}

		public Criteria andNroguiaNotBetween(String value1, String value2) {
			addCriterion("nroguia not between", value1, value2, "nroguia");
			return (Criteria) this;
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

		public Criteria andCorrelativoIsNull() {
			addCriterion("correlativo is null");
			return (Criteria) this;
		}

		public Criteria andCorrelativoIsNotNull() {
			addCriterion("correlativo is not null");
			return (Criteria) this;
		}

		public Criteria andCorrelativoEqualTo(String value) {
			addCriterion("correlativo =", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoNotEqualTo(String value) {
			addCriterion("correlativo <>", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoGreaterThan(String value) {
			addCriterion("correlativo >", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoGreaterThanOrEqualTo(String value) {
			addCriterion("correlativo >=", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoLessThan(String value) {
			addCriterion("correlativo <", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoLessThanOrEqualTo(String value) {
			addCriterion("correlativo <=", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoLike(String value) {
			addCriterion("correlativo like", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoNotLike(String value) {
			addCriterion("correlativo not like", value, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoIn(List<String> values) {
			addCriterion("correlativo in", values, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoNotIn(List<String> values) {
			addCriterion("correlativo not in", values, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoBetween(String value1, String value2) {
			addCriterion("correlativo between", value1, value2, "correlativo");
			return (Criteria) this;
		}

		public Criteria andCorrelativoNotBetween(String value1, String value2) {
			addCriterion("correlativo not between", value1, value2,
					"correlativo");
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

		public Criteria andCodsedeIsNull() {
			addCriterion("codsede is null");
			return (Criteria) this;
		}

		public Criteria andCodsedeIsNotNull() {
			addCriterion("codsede is not null");
			return (Criteria) this;
		}

		public Criteria andCodsedeEqualTo(String value) {
			addCriterion("codsede =", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeNotEqualTo(String value) {
			addCriterion("codsede <>", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeGreaterThan(String value) {
			addCriterion("codsede >", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeGreaterThanOrEqualTo(String value) {
			addCriterion("codsede >=", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeLessThan(String value) {
			addCriterion("codsede <", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeLessThanOrEqualTo(String value) {
			addCriterion("codsede <=", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeLike(String value) {
			addCriterion("codsede like", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeNotLike(String value) {
			addCriterion("codsede not like", value, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeIn(List<String> values) {
			addCriterion("codsede in", values, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeNotIn(List<String> values) {
			addCriterion("codsede not in", values, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeBetween(String value1, String value2) {
			addCriterion("codsede between", value1, value2, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodsedeNotBetween(String value1, String value2) {
			addCriterion("codsede not between", value1, value2, "codsede");
			return (Criteria) this;
		}

		public Criteria andCodclientebIsNull() {
			addCriterion("codclienteb is null");
			return (Criteria) this;
		}

		public Criteria andCodclientebIsNotNull() {
			addCriterion("codclienteb is not null");
			return (Criteria) this;
		}

		public Criteria andCodclientebEqualTo(String value) {
			addCriterion("codclienteb =", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebNotEqualTo(String value) {
			addCriterion("codclienteb <>", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebGreaterThan(String value) {
			addCriterion("codclienteb >", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebGreaterThanOrEqualTo(String value) {
			addCriterion("codclienteb >=", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebLessThan(String value) {
			addCriterion("codclienteb <", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebLessThanOrEqualTo(String value) {
			addCriterion("codclienteb <=", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebLike(String value) {
			addCriterion("codclienteb like", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebNotLike(String value) {
			addCriterion("codclienteb not like", value, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebIn(List<String> values) {
			addCriterion("codclienteb in", values, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebNotIn(List<String> values) {
			addCriterion("codclienteb not in", values, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebBetween(String value1, String value2) {
			addCriterion("codclienteb between", value1, value2, "codclienteb");
			return (Criteria) this;
		}

		public Criteria andCodclientebNotBetween(String value1, String value2) {
			addCriterion("codclienteb not between", value1, value2,
					"codclienteb");
			return (Criteria) this;
		}

		public Criteria andEstacionIsNull() {
			addCriterion("estacion is null");
			return (Criteria) this;
		}

		public Criteria andEstacionIsNotNull() {
			addCriterion("estacion is not null");
			return (Criteria) this;
		}

		public Criteria andEstacionEqualTo(String value) {
			addCriterion("estacion =", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionNotEqualTo(String value) {
			addCriterion("estacion <>", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionGreaterThan(String value) {
			addCriterion("estacion >", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionGreaterThanOrEqualTo(String value) {
			addCriterion("estacion >=", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionLessThan(String value) {
			addCriterion("estacion <", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionLessThanOrEqualTo(String value) {
			addCriterion("estacion <=", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionLike(String value) {
			addCriterion("estacion like", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionNotLike(String value) {
			addCriterion("estacion not like", value, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionIn(List<String> values) {
			addCriterion("estacion in", values, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionNotIn(List<String> values) {
			addCriterion("estacion not in", values, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionBetween(String value1, String value2) {
			addCriterion("estacion between", value1, value2, "estacion");
			return (Criteria) this;
		}

		public Criteria andEstacionNotBetween(String value1, String value2) {
			addCriterion("estacion not between", value1, value2, "estacion");
			return (Criteria) this;
		}

		public Criteria andContadorIsNull() {
			addCriterion("contador is null");
			return (Criteria) this;
		}

		public Criteria andContadorIsNotNull() {
			addCriterion("contador is not null");
			return (Criteria) this;
		}

		public Criteria andContadorEqualTo(String value) {
			addCriterion("contador =", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorNotEqualTo(String value) {
			addCriterion("contador <>", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorGreaterThan(String value) {
			addCriterion("contador >", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorGreaterThanOrEqualTo(String value) {
			addCriterion("contador >=", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorLessThan(String value) {
			addCriterion("contador <", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorLessThanOrEqualTo(String value) {
			addCriterion("contador <=", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorLike(String value) {
			addCriterion("contador like", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorNotLike(String value) {
			addCriterion("contador not like", value, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorIn(List<String> values) {
			addCriterion("contador in", values, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorNotIn(List<String> values) {
			addCriterion("contador not in", values, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorBetween(String value1, String value2) {
			addCriterion("contador between", value1, value2, "contador");
			return (Criteria) this;
		}

		public Criteria andContadorNotBetween(String value1, String value2) {
			addCriterion("contador not between", value1, value2, "contador");
			return (Criteria) this;
		}

		public Criteria andVolanteIsNull() {
			addCriterion("volante is null");
			return (Criteria) this;
		}

		public Criteria andVolanteIsNotNull() {
			addCriterion("volante is not null");
			return (Criteria) this;
		}

		public Criteria andVolanteEqualTo(Short value) {
			addCriterion("volante =", value, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteNotEqualTo(Short value) {
			addCriterion("volante <>", value, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteGreaterThan(Short value) {
			addCriterion("volante >", value, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteGreaterThanOrEqualTo(Short value) {
			addCriterion("volante >=", value, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteLessThan(Short value) {
			addCriterion("volante <", value, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteLessThanOrEqualTo(Short value) {
			addCriterion("volante <=", value, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteIn(List<Short> values) {
			addCriterion("volante in", values, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteNotIn(List<Short> values) {
			addCriterion("volante not in", values, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteBetween(Short value1, Short value2) {
			addCriterion("volante between", value1, value2, "volante");
			return (Criteria) this;
		}

		public Criteria andVolanteNotBetween(Short value1, Short value2) {
			addCriterion("volante not between", value1, value2, "volante");
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

		public Criteria andCodestadoIsNull() {
			addCriterion("codestado is null");
			return (Criteria) this;
		}

		public Criteria andCodestadoIsNotNull() {
			addCriterion("codestado is not null");
			return (Criteria) this;
		}

		public Criteria andCodestadoEqualTo(String value) {
			addCriterion("codestado =", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoNotEqualTo(String value) {
			addCriterion("codestado <>", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoGreaterThan(String value) {
			addCriterion("codestado >", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoGreaterThanOrEqualTo(String value) {
			addCriterion("codestado >=", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoLessThan(String value) {
			addCriterion("codestado <", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoLessThanOrEqualTo(String value) {
			addCriterion("codestado <=", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoLike(String value) {
			addCriterion("codestado like", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoNotLike(String value) {
			addCriterion("codestado not like", value, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoIn(List<String> values) {
			addCriterion("codestado in", values, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoNotIn(List<String> values) {
			addCriterion("codestado not in", values, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoBetween(String value1, String value2) {
			addCriterion("codestado between", value1, value2, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodestadoNotBetween(String value1, String value2) {
			addCriterion("codestado not between", value1, value2, "codestado");
			return (Criteria) this;
		}

		public Criteria andCodmotivoIsNull() {
			addCriterion("codmotivo is null");
			return (Criteria) this;
		}

		public Criteria andCodmotivoIsNotNull() {
			addCriterion("codmotivo is not null");
			return (Criteria) this;
		}

		public Criteria andCodmotivoEqualTo(String value) {
			addCriterion("codmotivo =", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoNotEqualTo(String value) {
			addCriterion("codmotivo <>", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoGreaterThan(String value) {
			addCriterion("codmotivo >", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoGreaterThanOrEqualTo(String value) {
			addCriterion("codmotivo >=", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoLessThan(String value) {
			addCriterion("codmotivo <", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoLessThanOrEqualTo(String value) {
			addCriterion("codmotivo <=", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoLike(String value) {
			addCriterion("codmotivo like", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoNotLike(String value) {
			addCriterion("codmotivo not like", value, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoIn(List<String> values) {
			addCriterion("codmotivo in", values, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoNotIn(List<String> values) {
			addCriterion("codmotivo not in", values, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoBetween(String value1, String value2) {
			addCriterion("codmotivo between", value1, value2, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andCodmotivoNotBetween(String value1, String value2) {
			addCriterion("codmotivo not between", value1, value2, "codmotivo");
			return (Criteria) this;
		}

		public Criteria andEstadoveriIsNull() {
			addCriterion("estadoveri is null");
			return (Criteria) this;
		}

		public Criteria andEstadoveriIsNotNull() {
			addCriterion("estadoveri is not null");
			return (Criteria) this;
		}

		public Criteria andEstadoveriEqualTo(String value) {
			addCriterion("estadoveri =", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriNotEqualTo(String value) {
			addCriterion("estadoveri <>", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriGreaterThan(String value) {
			addCriterion("estadoveri >", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriGreaterThanOrEqualTo(String value) {
			addCriterion("estadoveri >=", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriLessThan(String value) {
			addCriterion("estadoveri <", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriLessThanOrEqualTo(String value) {
			addCriterion("estadoveri <=", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriLike(String value) {
			addCriterion("estadoveri like", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriNotLike(String value) {
			addCriterion("estadoveri not like", value, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriIn(List<String> values) {
			addCriterion("estadoveri in", values, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriNotIn(List<String> values) {
			addCriterion("estadoveri not in", values, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriBetween(String value1, String value2) {
			addCriterion("estadoveri between", value1, value2, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andEstadoveriNotBetween(String value1, String value2) {
			addCriterion("estadoveri not between", value1, value2, "estadoveri");
			return (Criteria) this;
		}

		public Criteria andFecasignadoIsNull() {
			addCriterion("fecasignado is null");
			return (Criteria) this;
		}

		public Criteria andFecasignadoIsNotNull() {
			addCriterion("fecasignado is not null");
			return (Criteria) this;
		}

		public Criteria andFecasignadoEqualTo(Date value) {
			addCriterionForJDBCDate("fecasignado =", value, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoNotEqualTo(Date value) {
			addCriterionForJDBCDate("fecasignado <>", value, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoGreaterThan(Date value) {
			addCriterionForJDBCDate("fecasignado >", value, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fecasignado >=", value, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoLessThan(Date value) {
			addCriterionForJDBCDate("fecasignado <", value, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fecasignado <=", value, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoIn(List<Date> values) {
			addCriterionForJDBCDate("fecasignado in", values, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoNotIn(List<Date> values) {
			addCriterionForJDBCDate("fecasignado not in", values, "fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fecasignado between", value1, value2,
					"fecasignado");
			return (Criteria) this;
		}

		public Criteria andFecasignadoNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fecasignado not between", value1, value2,
					"fecasignado");
			return (Criteria) this;
		}

		public Criteria andUserClaIsNull() {
			addCriterion("user_cla is null");
			return (Criteria) this;
		}

		public Criteria andUserClaIsNotNull() {
			addCriterion("user_cla is not null");
			return (Criteria) this;
		}

		public Criteria andUserClaEqualTo(String value) {
			addCriterion("user_cla =", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaNotEqualTo(String value) {
			addCriterion("user_cla <>", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaGreaterThan(String value) {
			addCriterion("user_cla >", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaGreaterThanOrEqualTo(String value) {
			addCriterion("user_cla >=", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaLessThan(String value) {
			addCriterion("user_cla <", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaLessThanOrEqualTo(String value) {
			addCriterion("user_cla <=", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaLike(String value) {
			addCriterion("user_cla like", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaNotLike(String value) {
			addCriterion("user_cla not like", value, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaIn(List<String> values) {
			addCriterion("user_cla in", values, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaNotIn(List<String> values) {
			addCriterion("user_cla not in", values, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaBetween(String value1, String value2) {
			addCriterion("user_cla between", value1, value2, "userCla");
			return (Criteria) this;
		}

		public Criteria andUserClaNotBetween(String value1, String value2) {
			addCriterion("user_cla not between", value1, value2, "userCla");
			return (Criteria) this;
		}

		public Criteria andFecClaIsNull() {
			addCriterion("fec_cla is null");
			return (Criteria) this;
		}

		public Criteria andFecClaIsNotNull() {
			addCriterion("fec_cla is not null");
			return (Criteria) this;
		}

		public Criteria andFecClaEqualTo(Date value) {
			addCriterion("fec_cla =", value, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaNotEqualTo(Date value) {
			addCriterion("fec_cla <>", value, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaGreaterThan(Date value) {
			addCriterion("fec_cla >", value, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaGreaterThanOrEqualTo(Date value) {
			addCriterion("fec_cla >=", value, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaLessThan(Date value) {
			addCriterion("fec_cla <", value, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaLessThanOrEqualTo(Date value) {
			addCriterion("fec_cla <=", value, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaIn(List<Date> values) {
			addCriterion("fec_cla in", values, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaNotIn(List<Date> values) {
			addCriterion("fec_cla not in", values, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaBetween(Date value1, Date value2) {
			addCriterion("fec_cla between", value1, value2, "fecCla");
			return (Criteria) this;
		}

		public Criteria andFecClaNotBetween(Date value1, Date value2) {
			addCriterion("fec_cla not between", value1, value2, "fecCla");
			return (Criteria) this;
		}

		public Criteria andUserRecepIsNull() {
			addCriterion("user_recep is null");
			return (Criteria) this;
		}

		public Criteria andUserRecepIsNotNull() {
			addCriterion("user_recep is not null");
			return (Criteria) this;
		}

		public Criteria andUserRecepEqualTo(String value) {
			addCriterion("user_recep =", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepNotEqualTo(String value) {
			addCriterion("user_recep <>", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepGreaterThan(String value) {
			addCriterion("user_recep >", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepGreaterThanOrEqualTo(String value) {
			addCriterion("user_recep >=", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepLessThan(String value) {
			addCriterion("user_recep <", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepLessThanOrEqualTo(String value) {
			addCriterion("user_recep <=", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepLike(String value) {
			addCriterion("user_recep like", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepNotLike(String value) {
			addCriterion("user_recep not like", value, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepIn(List<String> values) {
			addCriterion("user_recep in", values, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepNotIn(List<String> values) {
			addCriterion("user_recep not in", values, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepBetween(String value1, String value2) {
			addCriterion("user_recep between", value1, value2, "userRecep");
			return (Criteria) this;
		}

		public Criteria andUserRecepNotBetween(String value1, String value2) {
			addCriterion("user_recep not between", value1, value2, "userRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepIsNull() {
			addCriterion("fec_recep is null");
			return (Criteria) this;
		}

		public Criteria andFecRecepIsNotNull() {
			addCriterion("fec_recep is not null");
			return (Criteria) this;
		}

		public Criteria andFecRecepEqualTo(Date value) {
			addCriterion("fec_recep =", value, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepNotEqualTo(Date value) {
			addCriterion("fec_recep <>", value, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepGreaterThan(Date value) {
			addCriterion("fec_recep >", value, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepGreaterThanOrEqualTo(Date value) {
			addCriterion("fec_recep >=", value, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepLessThan(Date value) {
			addCriterion("fec_recep <", value, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepLessThanOrEqualTo(Date value) {
			addCriterion("fec_recep <=", value, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepIn(List<Date> values) {
			addCriterion("fec_recep in", values, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepNotIn(List<Date> values) {
			addCriterion("fec_recep not in", values, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepBetween(Date value1, Date value2) {
			addCriterion("fec_recep between", value1, value2, "fecRecep");
			return (Criteria) this;
		}

		public Criteria andFecRecepNotBetween(Date value1, Date value2) {
			addCriterion("fec_recep not between", value1, value2, "fecRecep");
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

    public DetdespachoExample() {
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

        public Criteria andSerieguiaIsNull() {
            addCriterion("serieguia is null");
            return (Criteria) this;
        }

        public Criteria andSerieguiaIsNotNull() {
            addCriterion("serieguia is not null");
            return (Criteria) this;
        }

        public Criteria andSerieguiaEqualTo(String value) {
            addCriterion("serieguia =", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaNotEqualTo(String value) {
            addCriterion("serieguia <>", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaGreaterThan(String value) {
            addCriterion("serieguia >", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaGreaterThanOrEqualTo(String value) {
            addCriterion("serieguia >=", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaLessThan(String value) {
            addCriterion("serieguia <", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaLessThanOrEqualTo(String value) {
            addCriterion("serieguia <=", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaLike(String value) {
            addCriterion("serieguia like", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaNotLike(String value) {
            addCriterion("serieguia not like", value, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaIn(List<String> values) {
            addCriterion("serieguia in", values, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaNotIn(List<String> values) {
            addCriterion("serieguia not in", values, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaBetween(String value1, String value2) {
            addCriterion("serieguia between", value1, value2, "serieguia");
            return (Criteria) this;
        }

        public Criteria andSerieguiaNotBetween(String value1, String value2) {
            addCriterion("serieguia not between", value1, value2, "serieguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaIsNull() {
            addCriterion("nroguia is null");
            return (Criteria) this;
        }

        public Criteria andNroguiaIsNotNull() {
            addCriterion("nroguia is not null");
            return (Criteria) this;
        }

        public Criteria andNroguiaEqualTo(String value) {
            addCriterion("nroguia =", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaNotEqualTo(String value) {
            addCriterion("nroguia <>", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaGreaterThan(String value) {
            addCriterion("nroguia >", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaGreaterThanOrEqualTo(String value) {
            addCriterion("nroguia >=", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaLessThan(String value) {
            addCriterion("nroguia <", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaLessThanOrEqualTo(String value) {
            addCriterion("nroguia <=", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaLike(String value) {
            addCriterion("nroguia like", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaNotLike(String value) {
            addCriterion("nroguia not like", value, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaIn(List<String> values) {
            addCriterion("nroguia in", values, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaNotIn(List<String> values) {
            addCriterion("nroguia not in", values, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaBetween(String value1, String value2) {
            addCriterion("nroguia between", value1, value2, "nroguia");
            return (Criteria) this;
        }

        public Criteria andNroguiaNotBetween(String value1, String value2) {
            addCriterion("nroguia not between", value1, value2, "nroguia");
            return (Criteria) this;
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

        public Criteria andCorrelativoIsNull() {
            addCriterion("correlativo is null");
            return (Criteria) this;
        }

        public Criteria andCorrelativoIsNotNull() {
            addCriterion("correlativo is not null");
            return (Criteria) this;
        }

        public Criteria andCorrelativoEqualTo(String value) {
            addCriterion("correlativo =", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoNotEqualTo(String value) {
            addCriterion("correlativo <>", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoGreaterThan(String value) {
            addCriterion("correlativo >", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoGreaterThanOrEqualTo(String value) {
            addCriterion("correlativo >=", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoLessThan(String value) {
            addCriterion("correlativo <", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoLessThanOrEqualTo(String value) {
            addCriterion("correlativo <=", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoLike(String value) {
            addCriterion("correlativo like", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoNotLike(String value) {
            addCriterion("correlativo not like", value, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoIn(List<String> values) {
            addCriterion("correlativo in", values, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoNotIn(List<String> values) {
            addCriterion("correlativo not in", values, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoBetween(String value1, String value2) {
            addCriterion("correlativo between", value1, value2, "correlativo");
            return (Criteria) this;
        }

        public Criteria andCorrelativoNotBetween(String value1, String value2) {
            addCriterion("correlativo not between", value1, value2, "correlativo");
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

        public Criteria andCodsedeIsNull() {
            addCriterion("codsede is null");
            return (Criteria) this;
        }

        public Criteria andCodsedeIsNotNull() {
            addCriterion("codsede is not null");
            return (Criteria) this;
        }

        public Criteria andCodsedeEqualTo(String value) {
            addCriterion("codsede =", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeNotEqualTo(String value) {
            addCriterion("codsede <>", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeGreaterThan(String value) {
            addCriterion("codsede >", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeGreaterThanOrEqualTo(String value) {
            addCriterion("codsede >=", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeLessThan(String value) {
            addCriterion("codsede <", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeLessThanOrEqualTo(String value) {
            addCriterion("codsede <=", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeLike(String value) {
            addCriterion("codsede like", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeNotLike(String value) {
            addCriterion("codsede not like", value, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeIn(List<String> values) {
            addCriterion("codsede in", values, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeNotIn(List<String> values) {
            addCriterion("codsede not in", values, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeBetween(String value1, String value2) {
            addCriterion("codsede between", value1, value2, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodsedeNotBetween(String value1, String value2) {
            addCriterion("codsede not between", value1, value2, "codsede");
            return (Criteria) this;
        }

        public Criteria andCodclientebIsNull() {
            addCriterion("codclienteb is null");
            return (Criteria) this;
        }

        public Criteria andCodclientebIsNotNull() {
            addCriterion("codclienteb is not null");
            return (Criteria) this;
        }

        public Criteria andCodclientebEqualTo(String value) {
            addCriterion("codclienteb =", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebNotEqualTo(String value) {
            addCriterion("codclienteb <>", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebGreaterThan(String value) {
            addCriterion("codclienteb >", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebGreaterThanOrEqualTo(String value) {
            addCriterion("codclienteb >=", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebLessThan(String value) {
            addCriterion("codclienteb <", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebLessThanOrEqualTo(String value) {
            addCriterion("codclienteb <=", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebLike(String value) {
            addCriterion("codclienteb like", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebNotLike(String value) {
            addCriterion("codclienteb not like", value, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebIn(List<String> values) {
            addCriterion("codclienteb in", values, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebNotIn(List<String> values) {
            addCriterion("codclienteb not in", values, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebBetween(String value1, String value2) {
            addCriterion("codclienteb between", value1, value2, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andCodclientebNotBetween(String value1, String value2) {
            addCriterion("codclienteb not between", value1, value2, "codclienteb");
            return (Criteria) this;
        }

        public Criteria andEstacionIsNull() {
            addCriterion("estacion is null");
            return (Criteria) this;
        }

        public Criteria andEstacionIsNotNull() {
            addCriterion("estacion is not null");
            return (Criteria) this;
        }

        public Criteria andEstacionEqualTo(String value) {
            addCriterion("estacion =", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionNotEqualTo(String value) {
            addCriterion("estacion <>", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionGreaterThan(String value) {
            addCriterion("estacion >", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionGreaterThanOrEqualTo(String value) {
            addCriterion("estacion >=", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionLessThan(String value) {
            addCriterion("estacion <", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionLessThanOrEqualTo(String value) {
            addCriterion("estacion <=", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionLike(String value) {
            addCriterion("estacion like", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionNotLike(String value) {
            addCriterion("estacion not like", value, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionIn(List<String> values) {
            addCriterion("estacion in", values, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionNotIn(List<String> values) {
            addCriterion("estacion not in", values, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionBetween(String value1, String value2) {
            addCriterion("estacion between", value1, value2, "estacion");
            return (Criteria) this;
        }

        public Criteria andEstacionNotBetween(String value1, String value2) {
            addCriterion("estacion not between", value1, value2, "estacion");
            return (Criteria) this;
        }

        public Criteria andContadorIsNull() {
            addCriterion("contador is null");
            return (Criteria) this;
        }

        public Criteria andContadorIsNotNull() {
            addCriterion("contador is not null");
            return (Criteria) this;
        }

        public Criteria andContadorEqualTo(String value) {
            addCriterion("contador =", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorNotEqualTo(String value) {
            addCriterion("contador <>", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorGreaterThan(String value) {
            addCriterion("contador >", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorGreaterThanOrEqualTo(String value) {
            addCriterion("contador >=", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorLessThan(String value) {
            addCriterion("contador <", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorLessThanOrEqualTo(String value) {
            addCriterion("contador <=", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorLike(String value) {
            addCriterion("contador like", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorNotLike(String value) {
            addCriterion("contador not like", value, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorIn(List<String> values) {
            addCriterion("contador in", values, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorNotIn(List<String> values) {
            addCriterion("contador not in", values, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorBetween(String value1, String value2) {
            addCriterion("contador between", value1, value2, "contador");
            return (Criteria) this;
        }

        public Criteria andContadorNotBetween(String value1, String value2) {
            addCriterion("contador not between", value1, value2, "contador");
            return (Criteria) this;
        }

        public Criteria andVolanteIsNull() {
            addCriterion("volante is null");
            return (Criteria) this;
        }

        public Criteria andVolanteIsNotNull() {
            addCriterion("volante is not null");
            return (Criteria) this;
        }

        public Criteria andVolanteEqualTo(Short value) {
            addCriterion("volante =", value, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteNotEqualTo(Short value) {
            addCriterion("volante <>", value, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteGreaterThan(Short value) {
            addCriterion("volante >", value, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteGreaterThanOrEqualTo(Short value) {
            addCriterion("volante >=", value, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteLessThan(Short value) {
            addCriterion("volante <", value, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteLessThanOrEqualTo(Short value) {
            addCriterion("volante <=", value, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteIn(List<Short> values) {
            addCriterion("volante in", values, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteNotIn(List<Short> values) {
            addCriterion("volante not in", values, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteBetween(Short value1, Short value2) {
            addCriterion("volante between", value1, value2, "volante");
            return (Criteria) this;
        }

        public Criteria andVolanteNotBetween(Short value1, Short value2) {
            addCriterion("volante not between", value1, value2, "volante");
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

        public Criteria andCodestadoIsNull() {
            addCriterion("codestado is null");
            return (Criteria) this;
        }

        public Criteria andCodestadoIsNotNull() {
            addCriterion("codestado is not null");
            return (Criteria) this;
        }

        public Criteria andCodestadoEqualTo(String value) {
            addCriterion("codestado =", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoNotEqualTo(String value) {
            addCriterion("codestado <>", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoGreaterThan(String value) {
            addCriterion("codestado >", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoGreaterThanOrEqualTo(String value) {
            addCriterion("codestado >=", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoLessThan(String value) {
            addCriterion("codestado <", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoLessThanOrEqualTo(String value) {
            addCriterion("codestado <=", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoLike(String value) {
            addCriterion("codestado like", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoNotLike(String value) {
            addCriterion("codestado not like", value, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoIn(List<String> values) {
            addCriterion("codestado in", values, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoNotIn(List<String> values) {
            addCriterion("codestado not in", values, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoBetween(String value1, String value2) {
            addCriterion("codestado between", value1, value2, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodestadoNotBetween(String value1, String value2) {
            addCriterion("codestado not between", value1, value2, "codestado");
            return (Criteria) this;
        }

        public Criteria andCodmotivoIsNull() {
            addCriterion("codmotivo is null");
            return (Criteria) this;
        }

        public Criteria andCodmotivoIsNotNull() {
            addCriterion("codmotivo is not null");
            return (Criteria) this;
        }

        public Criteria andCodmotivoEqualTo(String value) {
            addCriterion("codmotivo =", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoNotEqualTo(String value) {
            addCriterion("codmotivo <>", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoGreaterThan(String value) {
            addCriterion("codmotivo >", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoGreaterThanOrEqualTo(String value) {
            addCriterion("codmotivo >=", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoLessThan(String value) {
            addCriterion("codmotivo <", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoLessThanOrEqualTo(String value) {
            addCriterion("codmotivo <=", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoLike(String value) {
            addCriterion("codmotivo like", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoNotLike(String value) {
            addCriterion("codmotivo not like", value, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoIn(List<String> values) {
            addCriterion("codmotivo in", values, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoNotIn(List<String> values) {
            addCriterion("codmotivo not in", values, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoBetween(String value1, String value2) {
            addCriterion("codmotivo between", value1, value2, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andCodmotivoNotBetween(String value1, String value2) {
            addCriterion("codmotivo not between", value1, value2, "codmotivo");
            return (Criteria) this;
        }

        public Criteria andEstadoveriIsNull() {
            addCriterion("estadoveri is null");
            return (Criteria) this;
        }

        public Criteria andEstadoveriIsNotNull() {
            addCriterion("estadoveri is not null");
            return (Criteria) this;
        }

        public Criteria andEstadoveriEqualTo(String value) {
            addCriterion("estadoveri =", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriNotEqualTo(String value) {
            addCriterion("estadoveri <>", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriGreaterThan(String value) {
            addCriterion("estadoveri >", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriGreaterThanOrEqualTo(String value) {
            addCriterion("estadoveri >=", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriLessThan(String value) {
            addCriterion("estadoveri <", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriLessThanOrEqualTo(String value) {
            addCriterion("estadoveri <=", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriLike(String value) {
            addCriterion("estadoveri like", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriNotLike(String value) {
            addCriterion("estadoveri not like", value, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriIn(List<String> values) {
            addCriterion("estadoveri in", values, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriNotIn(List<String> values) {
            addCriterion("estadoveri not in", values, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriBetween(String value1, String value2) {
            addCriterion("estadoveri between", value1, value2, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andEstadoveriNotBetween(String value1, String value2) {
            addCriterion("estadoveri not between", value1, value2, "estadoveri");
            return (Criteria) this;
        }

        public Criteria andFecasignadoIsNull() {
            addCriterion("fecasignado is null");
            return (Criteria) this;
        }

        public Criteria andFecasignadoIsNotNull() {
            addCriterion("fecasignado is not null");
            return (Criteria) this;
        }

        public Criteria andFecasignadoEqualTo(Date value) {
            addCriterionForJDBCDate("fecasignado =", value, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecasignado <>", value, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoGreaterThan(Date value) {
            addCriterionForJDBCDate("fecasignado >", value, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecasignado >=", value, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoLessThan(Date value) {
            addCriterionForJDBCDate("fecasignado <", value, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecasignado <=", value, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoIn(List<Date> values) {
            addCriterionForJDBCDate("fecasignado in", values, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecasignado not in", values, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecasignado between", value1, value2, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andFecasignadoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecasignado not between", value1, value2, "fecasignado");
            return (Criteria) this;
        }

        public Criteria andUserClaIsNull() {
            addCriterion("user_cla is null");
            return (Criteria) this;
        }

        public Criteria andUserClaIsNotNull() {
            addCriterion("user_cla is not null");
            return (Criteria) this;
        }

        public Criteria andUserClaEqualTo(String value) {
            addCriterion("user_cla =", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaNotEqualTo(String value) {
            addCriterion("user_cla <>", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaGreaterThan(String value) {
            addCriterion("user_cla >", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaGreaterThanOrEqualTo(String value) {
            addCriterion("user_cla >=", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaLessThan(String value) {
            addCriterion("user_cla <", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaLessThanOrEqualTo(String value) {
            addCriterion("user_cla <=", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaLike(String value) {
            addCriterion("user_cla like", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaNotLike(String value) {
            addCriterion("user_cla not like", value, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaIn(List<String> values) {
            addCriterion("user_cla in", values, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaNotIn(List<String> values) {
            addCriterion("user_cla not in", values, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaBetween(String value1, String value2) {
            addCriterion("user_cla between", value1, value2, "userCla");
            return (Criteria) this;
        }

        public Criteria andUserClaNotBetween(String value1, String value2) {
            addCriterion("user_cla not between", value1, value2, "userCla");
            return (Criteria) this;
        }

        public Criteria andFecClaIsNull() {
            addCriterion("fec_cla is null");
            return (Criteria) this;
        }

        public Criteria andFecClaIsNotNull() {
            addCriterion("fec_cla is not null");
            return (Criteria) this;
        }

        public Criteria andFecClaEqualTo(Date value) {
            addCriterion("fec_cla =", value, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaNotEqualTo(Date value) {
            addCriterion("fec_cla <>", value, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaGreaterThan(Date value) {
            addCriterion("fec_cla >", value, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_cla >=", value, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaLessThan(Date value) {
            addCriterion("fec_cla <", value, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaLessThanOrEqualTo(Date value) {
            addCriterion("fec_cla <=", value, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaIn(List<Date> values) {
            addCriterion("fec_cla in", values, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaNotIn(List<Date> values) {
            addCriterion("fec_cla not in", values, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaBetween(Date value1, Date value2) {
            addCriterion("fec_cla between", value1, value2, "fecCla");
            return (Criteria) this;
        }

        public Criteria andFecClaNotBetween(Date value1, Date value2) {
            addCriterion("fec_cla not between", value1, value2, "fecCla");
            return (Criteria) this;
        }

        public Criteria andUserRecepIsNull() {
            addCriterion("user_recep is null");
            return (Criteria) this;
        }

        public Criteria andUserRecepIsNotNull() {
            addCriterion("user_recep is not null");
            return (Criteria) this;
        }

        public Criteria andUserRecepEqualTo(String value) {
            addCriterion("user_recep =", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepNotEqualTo(String value) {
            addCriterion("user_recep <>", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepGreaterThan(String value) {
            addCriterion("user_recep >", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepGreaterThanOrEqualTo(String value) {
            addCriterion("user_recep >=", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepLessThan(String value) {
            addCriterion("user_recep <", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepLessThanOrEqualTo(String value) {
            addCriterion("user_recep <=", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepLike(String value) {
            addCriterion("user_recep like", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepNotLike(String value) {
            addCriterion("user_recep not like", value, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepIn(List<String> values) {
            addCriterion("user_recep in", values, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepNotIn(List<String> values) {
            addCriterion("user_recep not in", values, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepBetween(String value1, String value2) {
            addCriterion("user_recep between", value1, value2, "userRecep");
            return (Criteria) this;
        }

        public Criteria andUserRecepNotBetween(String value1, String value2) {
            addCriterion("user_recep not between", value1, value2, "userRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepIsNull() {
            addCriterion("fec_recep is null");
            return (Criteria) this;
        }

        public Criteria andFecRecepIsNotNull() {
            addCriterion("fec_recep is not null");
            return (Criteria) this;
        }

        public Criteria andFecRecepEqualTo(Date value) {
            addCriterion("fec_recep =", value, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepNotEqualTo(Date value) {
            addCriterion("fec_recep <>", value, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepGreaterThan(Date value) {
            addCriterion("fec_recep >", value, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_recep >=", value, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepLessThan(Date value) {
            addCriterion("fec_recep <", value, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepLessThanOrEqualTo(Date value) {
            addCriterion("fec_recep <=", value, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepIn(List<Date> values) {
            addCriterion("fec_recep in", values, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepNotIn(List<Date> values) {
            addCriterion("fec_recep not in", values, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepBetween(Date value1, Date value2) {
            addCriterion("fec_recep between", value1, value2, "fecRecep");
            return (Criteria) this;
        }

        public Criteria andFecRecepNotBetween(Date value1, Date value2) {
            addCriterion("fec_recep not between", value1, value2, "fecRecep");
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