package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZonasExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ZonasExample() {
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

		public Criteria andCodclasificadorIsNull() {
			addCriterion("codclasificador is null");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorIsNotNull() {
			addCriterion("codclasificador is not null");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorEqualTo(String value) {
			addCriterion("codclasificador =", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorNotEqualTo(String value) {
			addCriterion("codclasificador <>", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorGreaterThan(String value) {
			addCriterion("codclasificador >", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorGreaterThanOrEqualTo(String value) {
			addCriterion("codclasificador >=", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorLessThan(String value) {
			addCriterion("codclasificador <", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorLessThanOrEqualTo(String value) {
			addCriterion("codclasificador <=", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorLike(String value) {
			addCriterion("codclasificador like", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorNotLike(String value) {
			addCriterion("codclasificador not like", value, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorIn(List<String> values) {
			addCriterion("codclasificador in", values, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorNotIn(List<String> values) {
			addCriterion("codclasificador not in", values, "codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorBetween(String value1, String value2) {
			addCriterion("codclasificador between", value1, value2,
					"codclasificador");
			return (Criteria) this;
		}

		public Criteria andCodclasificadorNotBetween(String value1,
				String value2) {
			addCriterion("codclasificador not between", value1, value2,
					"codclasificador");
			return (Criteria) this;
		}

		public Criteria andBonozonaIsNull() {
			addCriterion("bonozona is null");
			return (Criteria) this;
		}

		public Criteria andBonozonaIsNotNull() {
			addCriterion("bonozona is not null");
			return (Criteria) this;
		}

		public Criteria andBonozonaEqualTo(String value) {
			addCriterion("bonozona =", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaNotEqualTo(String value) {
			addCriterion("bonozona <>", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaGreaterThan(String value) {
			addCriterion("bonozona >", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaGreaterThanOrEqualTo(String value) {
			addCriterion("bonozona >=", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaLessThan(String value) {
			addCriterion("bonozona <", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaLessThanOrEqualTo(String value) {
			addCriterion("bonozona <=", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaLike(String value) {
			addCriterion("bonozona like", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaNotLike(String value) {
			addCriterion("bonozona not like", value, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaIn(List<String> values) {
			addCriterion("bonozona in", values, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaNotIn(List<String> values) {
			addCriterion("bonozona not in", values, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaBetween(String value1, String value2) {
			addCriterion("bonozona between", value1, value2, "bonozona");
			return (Criteria) this;
		}

		public Criteria andBonozonaNotBetween(String value1, String value2) {
			addCriterion("bonozona not between", value1, value2, "bonozona");
			return (Criteria) this;
		}

		public Criteria andDescripcionIsNull() {
			addCriterion("descripcion is null");
			return (Criteria) this;
		}

		public Criteria andDescripcionIsNotNull() {
			addCriterion("descripcion is not null");
			return (Criteria) this;
		}

		public Criteria andDescripcionEqualTo(String value) {
			addCriterion("descripcion =", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotEqualTo(String value) {
			addCriterion("descripcion <>", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionGreaterThan(String value) {
			addCriterion("descripcion >", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
			addCriterion("descripcion >=", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLessThan(String value) {
			addCriterion("descripcion <", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLessThanOrEqualTo(String value) {
			addCriterion("descripcion <=", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionLike(String value) {
			addCriterion("descripcion like", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotLike(String value) {
			addCriterion("descripcion not like", value, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionIn(List<String> values) {
			addCriterion("descripcion in", values, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotIn(List<String> values) {
			addCriterion("descripcion not in", values, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionBetween(String value1, String value2) {
			addCriterion("descripcion between", value1, value2, "descripcion");
			return (Criteria) this;
		}

		public Criteria andDescripcionNotBetween(String value1, String value2) {
			addCriterion("descripcion not between", value1, value2,
					"descripcion");
			return (Criteria) this;
		}

		public Criteria andPasajeIsNull() {
			addCriterion("pasaje is null");
			return (Criteria) this;
		}

		public Criteria andPasajeIsNotNull() {
			addCriterion("pasaje is not null");
			return (Criteria) this;
		}

		public Criteria andPasajeEqualTo(BigDecimal value) {
			addCriterion("pasaje =", value, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeNotEqualTo(BigDecimal value) {
			addCriterion("pasaje <>", value, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeGreaterThan(BigDecimal value) {
			addCriterion("pasaje >", value, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("pasaje >=", value, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeLessThan(BigDecimal value) {
			addCriterion("pasaje <", value, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("pasaje <=", value, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeIn(List<BigDecimal> values) {
			addCriterion("pasaje in", values, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeNotIn(List<BigDecimal> values) {
			addCriterion("pasaje not in", values, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("pasaje between", value1, value2, "pasaje");
			return (Criteria) this;
		}

		public Criteria andPasajeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("pasaje not between", value1, value2, "pasaje");
			return (Criteria) this;
		}

		public Criteria andMontoIsNull() {
			addCriterion("monto is null");
			return (Criteria) this;
		}

		public Criteria andMontoIsNotNull() {
			addCriterion("monto is not null");
			return (Criteria) this;
		}

		public Criteria andMontoEqualTo(BigDecimal value) {
			addCriterion("monto =", value, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoNotEqualTo(BigDecimal value) {
			addCriterion("monto <>", value, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoGreaterThan(BigDecimal value) {
			addCriterion("monto >", value, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("monto >=", value, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoLessThan(BigDecimal value) {
			addCriterion("monto <", value, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("monto <=", value, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoIn(List<BigDecimal> values) {
			addCriterion("monto in", values, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoNotIn(List<BigDecimal> values) {
			addCriterion("monto not in", values, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("monto between", value1, value2, "monto");
			return (Criteria) this;
		}

		public Criteria andMontoNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("monto not between", value1, value2, "monto");
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

		public Criteria andBonoIsNull() {
			addCriterion("bono is null");
			return (Criteria) this;
		}

		public Criteria andBonoIsNotNull() {
			addCriterion("bono is not null");
			return (Criteria) this;
		}

		public Criteria andBonoEqualTo(BigDecimal value) {
			addCriterion("bono =", value, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoNotEqualTo(BigDecimal value) {
			addCriterion("bono <>", value, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoGreaterThan(BigDecimal value) {
			addCriterion("bono >", value, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("bono >=", value, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoLessThan(BigDecimal value) {
			addCriterion("bono <", value, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoLessThanOrEqualTo(BigDecimal value) {
			addCriterion("bono <=", value, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoIn(List<BigDecimal> values) {
			addCriterion("bono in", values, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoNotIn(List<BigDecimal> values) {
			addCriterion("bono not in", values, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("bono between", value1, value2, "bono");
			return (Criteria) this;
		}

		public Criteria andBonoNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("bono not between", value1, value2, "bono");
			return (Criteria) this;
		}

		public Criteria andEfectividadIsNull() {
			addCriterion("efectividad is null");
			return (Criteria) this;
		}

		public Criteria andEfectividadIsNotNull() {
			addCriterion("efectividad is not null");
			return (Criteria) this;
		}

		public Criteria andEfectividadEqualTo(Short value) {
			addCriterion("efectividad =", value, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadNotEqualTo(Short value) {
			addCriterion("efectividad <>", value, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadGreaterThan(Short value) {
			addCriterion("efectividad >", value, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadGreaterThanOrEqualTo(Short value) {
			addCriterion("efectividad >=", value, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadLessThan(Short value) {
			addCriterion("efectividad <", value, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadLessThanOrEqualTo(Short value) {
			addCriterion("efectividad <=", value, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadIn(List<Short> values) {
			addCriterion("efectividad in", values, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadNotIn(List<Short> values) {
			addCriterion("efectividad not in", values, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadBetween(Short value1, Short value2) {
			addCriterion("efectividad between", value1, value2, "efectividad");
			return (Criteria) this;
		}

		public Criteria andEfectividadNotBetween(Short value1, Short value2) {
			addCriterion("efectividad not between", value1, value2,
					"efectividad");
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

		public Criteria andTipozonaIsNull() {
			addCriterion("tipozona is null");
			return (Criteria) this;
		}

		public Criteria andTipozonaIsNotNull() {
			addCriterion("tipozona is not null");
			return (Criteria) this;
		}

		public Criteria andTipozonaEqualTo(String value) {
			addCriterion("tipozona =", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaNotEqualTo(String value) {
			addCriterion("tipozona <>", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaGreaterThan(String value) {
			addCriterion("tipozona >", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaGreaterThanOrEqualTo(String value) {
			addCriterion("tipozona >=", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaLessThan(String value) {
			addCriterion("tipozona <", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaLessThanOrEqualTo(String value) {
			addCriterion("tipozona <=", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaLike(String value) {
			addCriterion("tipozona like", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaNotLike(String value) {
			addCriterion("tipozona not like", value, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaIn(List<String> values) {
			addCriterion("tipozona in", values, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaNotIn(List<String> values) {
			addCriterion("tipozona not in", values, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaBetween(String value1, String value2) {
			addCriterion("tipozona between", value1, value2, "tipozona");
			return (Criteria) this;
		}

		public Criteria andTipozonaNotBetween(String value1, String value2) {
			addCriterion("tipozona not between", value1, value2, "tipozona");
			return (Criteria) this;
		}

		public Criteria andCantidadIsNull() {
			addCriterion("cantidad is null");
			return (Criteria) this;
		}

		public Criteria andCantidadIsNotNull() {
			addCriterion("cantidad is not null");
			return (Criteria) this;
		}

		public Criteria andCantidadEqualTo(Short value) {
			addCriterion("cantidad =", value, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadNotEqualTo(Short value) {
			addCriterion("cantidad <>", value, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadGreaterThan(Short value) {
			addCriterion("cantidad >", value, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadGreaterThanOrEqualTo(Short value) {
			addCriterion("cantidad >=", value, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadLessThan(Short value) {
			addCriterion("cantidad <", value, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadLessThanOrEqualTo(Short value) {
			addCriterion("cantidad <=", value, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadIn(List<Short> values) {
			addCriterion("cantidad in", values, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadNotIn(List<Short> values) {
			addCriterion("cantidad not in", values, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadBetween(Short value1, Short value2) {
			addCriterion("cantidad between", value1, value2, "cantidad");
			return (Criteria) this;
		}

		public Criteria andCantidadNotBetween(Short value1, Short value2) {
			addCriterion("cantidad not between", value1, value2, "cantidad");
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

    public ZonasExample() {
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

        public Criteria andCodclasificadorIsNull() {
            addCriterion("codclasificador is null");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorIsNotNull() {
            addCriterion("codclasificador is not null");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorEqualTo(String value) {
            addCriterion("codclasificador =", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorNotEqualTo(String value) {
            addCriterion("codclasificador <>", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorGreaterThan(String value) {
            addCriterion("codclasificador >", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorGreaterThanOrEqualTo(String value) {
            addCriterion("codclasificador >=", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorLessThan(String value) {
            addCriterion("codclasificador <", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorLessThanOrEqualTo(String value) {
            addCriterion("codclasificador <=", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorLike(String value) {
            addCriterion("codclasificador like", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorNotLike(String value) {
            addCriterion("codclasificador not like", value, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorIn(List<String> values) {
            addCriterion("codclasificador in", values, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorNotIn(List<String> values) {
            addCriterion("codclasificador not in", values, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorBetween(String value1, String value2) {
            addCriterion("codclasificador between", value1, value2, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andCodclasificadorNotBetween(String value1, String value2) {
            addCriterion("codclasificador not between", value1, value2, "codclasificador");
            return (Criteria) this;
        }

        public Criteria andBonozonaIsNull() {
            addCriterion("bonozona is null");
            return (Criteria) this;
        }

        public Criteria andBonozonaIsNotNull() {
            addCriterion("bonozona is not null");
            return (Criteria) this;
        }

        public Criteria andBonozonaEqualTo(String value) {
            addCriterion("bonozona =", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaNotEqualTo(String value) {
            addCriterion("bonozona <>", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaGreaterThan(String value) {
            addCriterion("bonozona >", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaGreaterThanOrEqualTo(String value) {
            addCriterion("bonozona >=", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaLessThan(String value) {
            addCriterion("bonozona <", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaLessThanOrEqualTo(String value) {
            addCriterion("bonozona <=", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaLike(String value) {
            addCriterion("bonozona like", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaNotLike(String value) {
            addCriterion("bonozona not like", value, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaIn(List<String> values) {
            addCriterion("bonozona in", values, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaNotIn(List<String> values) {
            addCriterion("bonozona not in", values, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaBetween(String value1, String value2) {
            addCriterion("bonozona between", value1, value2, "bonozona");
            return (Criteria) this;
        }

        public Criteria andBonozonaNotBetween(String value1, String value2) {
            addCriterion("bonozona not between", value1, value2, "bonozona");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("descripcion is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("descripcion is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("descripcion =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("descripcion <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("descripcion >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("descripcion >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("descripcion <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("descripcion <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("descripcion like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("descripcion not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("descripcion in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("descripcion not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("descripcion between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("descripcion not between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andPasajeIsNull() {
            addCriterion("pasaje is null");
            return (Criteria) this;
        }

        public Criteria andPasajeIsNotNull() {
            addCriterion("pasaje is not null");
            return (Criteria) this;
        }

        public Criteria andPasajeEqualTo(BigDecimal value) {
            addCriterion("pasaje =", value, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeNotEqualTo(BigDecimal value) {
            addCriterion("pasaje <>", value, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeGreaterThan(BigDecimal value) {
            addCriterion("pasaje >", value, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pasaje >=", value, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeLessThan(BigDecimal value) {
            addCriterion("pasaje <", value, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pasaje <=", value, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeIn(List<BigDecimal> values) {
            addCriterion("pasaje in", values, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeNotIn(List<BigDecimal> values) {
            addCriterion("pasaje not in", values, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pasaje between", value1, value2, "pasaje");
            return (Criteria) this;
        }

        public Criteria andPasajeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pasaje not between", value1, value2, "pasaje");
            return (Criteria) this;
        }

        public Criteria andMontoIsNull() {
            addCriterion("monto is null");
            return (Criteria) this;
        }

        public Criteria andMontoIsNotNull() {
            addCriterion("monto is not null");
            return (Criteria) this;
        }

        public Criteria andMontoEqualTo(BigDecimal value) {
            addCriterion("monto =", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotEqualTo(BigDecimal value) {
            addCriterion("monto <>", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoGreaterThan(BigDecimal value) {
            addCriterion("monto >", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monto >=", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoLessThan(BigDecimal value) {
            addCriterion("monto <", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monto <=", value, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoIn(List<BigDecimal> values) {
            addCriterion("monto in", values, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotIn(List<BigDecimal> values) {
            addCriterion("monto not in", values, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monto between", value1, value2, "monto");
            return (Criteria) this;
        }

        public Criteria andMontoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monto not between", value1, value2, "monto");
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

        public Criteria andBonoIsNull() {
            addCriterion("bono is null");
            return (Criteria) this;
        }

        public Criteria andBonoIsNotNull() {
            addCriterion("bono is not null");
            return (Criteria) this;
        }

        public Criteria andBonoEqualTo(BigDecimal value) {
            addCriterion("bono =", value, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoNotEqualTo(BigDecimal value) {
            addCriterion("bono <>", value, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoGreaterThan(BigDecimal value) {
            addCriterion("bono >", value, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bono >=", value, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoLessThan(BigDecimal value) {
            addCriterion("bono <", value, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bono <=", value, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoIn(List<BigDecimal> values) {
            addCriterion("bono in", values, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoNotIn(List<BigDecimal> values) {
            addCriterion("bono not in", values, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bono between", value1, value2, "bono");
            return (Criteria) this;
        }

        public Criteria andBonoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bono not between", value1, value2, "bono");
            return (Criteria) this;
        }

        public Criteria andEfectividadIsNull() {
            addCriterion("efectividad is null");
            return (Criteria) this;
        }

        public Criteria andEfectividadIsNotNull() {
            addCriterion("efectividad is not null");
            return (Criteria) this;
        }

        public Criteria andEfectividadEqualTo(Short value) {
            addCriterion("efectividad =", value, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadNotEqualTo(Short value) {
            addCriterion("efectividad <>", value, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadGreaterThan(Short value) {
            addCriterion("efectividad >", value, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadGreaterThanOrEqualTo(Short value) {
            addCriterion("efectividad >=", value, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadLessThan(Short value) {
            addCriterion("efectividad <", value, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadLessThanOrEqualTo(Short value) {
            addCriterion("efectividad <=", value, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadIn(List<Short> values) {
            addCriterion("efectividad in", values, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadNotIn(List<Short> values) {
            addCriterion("efectividad not in", values, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadBetween(Short value1, Short value2) {
            addCriterion("efectividad between", value1, value2, "efectividad");
            return (Criteria) this;
        }

        public Criteria andEfectividadNotBetween(Short value1, Short value2) {
            addCriterion("efectividad not between", value1, value2, "efectividad");
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

        public Criteria andTipozonaIsNull() {
            addCriterion("tipozona is null");
            return (Criteria) this;
        }

        public Criteria andTipozonaIsNotNull() {
            addCriterion("tipozona is not null");
            return (Criteria) this;
        }

        public Criteria andTipozonaEqualTo(String value) {
            addCriterion("tipozona =", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaNotEqualTo(String value) {
            addCriterion("tipozona <>", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaGreaterThan(String value) {
            addCriterion("tipozona >", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaGreaterThanOrEqualTo(String value) {
            addCriterion("tipozona >=", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaLessThan(String value) {
            addCriterion("tipozona <", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaLessThanOrEqualTo(String value) {
            addCriterion("tipozona <=", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaLike(String value) {
            addCriterion("tipozona like", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaNotLike(String value) {
            addCriterion("tipozona not like", value, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaIn(List<String> values) {
            addCriterion("tipozona in", values, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaNotIn(List<String> values) {
            addCriterion("tipozona not in", values, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaBetween(String value1, String value2) {
            addCriterion("tipozona between", value1, value2, "tipozona");
            return (Criteria) this;
        }

        public Criteria andTipozonaNotBetween(String value1, String value2) {
            addCriterion("tipozona not between", value1, value2, "tipozona");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNull() {
            addCriterion("cantidad is null");
            return (Criteria) this;
        }

        public Criteria andCantidadIsNotNull() {
            addCriterion("cantidad is not null");
            return (Criteria) this;
        }

        public Criteria andCantidadEqualTo(Short value) {
            addCriterion("cantidad =", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotEqualTo(Short value) {
            addCriterion("cantidad <>", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThan(Short value) {
            addCriterion("cantidad >", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThanOrEqualTo(Short value) {
            addCriterion("cantidad >=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThan(Short value) {
            addCriterion("cantidad <", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThanOrEqualTo(Short value) {
            addCriterion("cantidad <=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadIn(List<Short> values) {
            addCriterion("cantidad in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotIn(List<Short> values) {
            addCriterion("cantidad not in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadBetween(Short value1, Short value2) {
            addCriterion("cantidad between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotBetween(Short value1, Short value2) {
            addCriterion("cantidad not between", value1, value2, "cantidad");
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