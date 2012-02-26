package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TProductosExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TProductosExample() {
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

		public Criteria andProductoIsNull() {
			addCriterion("producto is null");
			return (Criteria) this;
		}

		public Criteria andProductoIsNotNull() {
			addCriterion("producto is not null");
			return (Criteria) this;
		}

		public Criteria andProductoEqualTo(String value) {
			addCriterion("producto =", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoNotEqualTo(String value) {
			addCriterion("producto <>", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoGreaterThan(String value) {
			addCriterion("producto >", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoGreaterThanOrEqualTo(String value) {
			addCriterion("producto >=", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoLessThan(String value) {
			addCriterion("producto <", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoLessThanOrEqualTo(String value) {
			addCriterion("producto <=", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoLike(String value) {
			addCriterion("producto like", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoNotLike(String value) {
			addCriterion("producto not like", value, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoIn(List<String> values) {
			addCriterion("producto in", values, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoNotIn(List<String> values) {
			addCriterion("producto not in", values, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoBetween(String value1, String value2) {
			addCriterion("producto between", value1, value2, "producto");
			return (Criteria) this;
		}

		public Criteria andProductoNotBetween(String value1, String value2) {
			addCriterion("producto not between", value1, value2, "producto");
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

		public Criteria andTipoproductoIsNull() {
			addCriterion("tipoproducto is null");
			return (Criteria) this;
		}

		public Criteria andTipoproductoIsNotNull() {
			addCriterion("tipoproducto is not null");
			return (Criteria) this;
		}

		public Criteria andTipoproductoEqualTo(String value) {
			addCriterion("tipoproducto =", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoNotEqualTo(String value) {
			addCriterion("tipoproducto <>", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoGreaterThan(String value) {
			addCriterion("tipoproducto >", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoGreaterThanOrEqualTo(String value) {
			addCriterion("tipoproducto >=", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoLessThan(String value) {
			addCriterion("tipoproducto <", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoLessThanOrEqualTo(String value) {
			addCriterion("tipoproducto <=", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoLike(String value) {
			addCriterion("tipoproducto like", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoNotLike(String value) {
			addCriterion("tipoproducto not like", value, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoIn(List<String> values) {
			addCriterion("tipoproducto in", values, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoNotIn(List<String> values) {
			addCriterion("tipoproducto not in", values, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoBetween(String value1, String value2) {
			addCriterion("tipoproducto between", value1, value2, "tipoproducto");
			return (Criteria) this;
		}

		public Criteria andTipoproductoNotBetween(String value1, String value2) {
			addCriterion("tipoproducto not between", value1, value2,
					"tipoproducto");
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

		public Criteria andObsIsNull() {
			addCriterion("obs is null");
			return (Criteria) this;
		}

		public Criteria andObsIsNotNull() {
			addCriterion("obs is not null");
			return (Criteria) this;
		}

		public Criteria andObsEqualTo(String value) {
			addCriterion("obs =", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsNotEqualTo(String value) {
			addCriterion("obs <>", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsGreaterThan(String value) {
			addCriterion("obs >", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsGreaterThanOrEqualTo(String value) {
			addCriterion("obs >=", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsLessThan(String value) {
			addCriterion("obs <", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsLessThanOrEqualTo(String value) {
			addCriterion("obs <=", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsLike(String value) {
			addCriterion("obs like", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsNotLike(String value) {
			addCriterion("obs not like", value, "obs");
			return (Criteria) this;
		}

		public Criteria andObsIn(List<String> values) {
			addCriterion("obs in", values, "obs");
			return (Criteria) this;
		}

		public Criteria andObsNotIn(List<String> values) {
			addCriterion("obs not in", values, "obs");
			return (Criteria) this;
		}

		public Criteria andObsBetween(String value1, String value2) {
			addCriterion("obs between", value1, value2, "obs");
			return (Criteria) this;
		}

		public Criteria andObsNotBetween(String value1, String value2) {
			addCriterion("obs not between", value1, value2, "obs");
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

    public TProductosExample() {
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

        public Criteria andProductoIsNull() {
            addCriterion("producto is null");
            return (Criteria) this;
        }

        public Criteria andProductoIsNotNull() {
            addCriterion("producto is not null");
            return (Criteria) this;
        }

        public Criteria andProductoEqualTo(String value) {
            addCriterion("producto =", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoNotEqualTo(String value) {
            addCriterion("producto <>", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoGreaterThan(String value) {
            addCriterion("producto >", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoGreaterThanOrEqualTo(String value) {
            addCriterion("producto >=", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoLessThan(String value) {
            addCriterion("producto <", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoLessThanOrEqualTo(String value) {
            addCriterion("producto <=", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoLike(String value) {
            addCriterion("producto like", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoNotLike(String value) {
            addCriterion("producto not like", value, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoIn(List<String> values) {
            addCriterion("producto in", values, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoNotIn(List<String> values) {
            addCriterion("producto not in", values, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoBetween(String value1, String value2) {
            addCriterion("producto between", value1, value2, "producto");
            return (Criteria) this;
        }

        public Criteria andProductoNotBetween(String value1, String value2) {
            addCriterion("producto not between", value1, value2, "producto");
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

        public Criteria andTipoproductoIsNull() {
            addCriterion("tipoproducto is null");
            return (Criteria) this;
        }

        public Criteria andTipoproductoIsNotNull() {
            addCriterion("tipoproducto is not null");
            return (Criteria) this;
        }

        public Criteria andTipoproductoEqualTo(String value) {
            addCriterion("tipoproducto =", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoNotEqualTo(String value) {
            addCriterion("tipoproducto <>", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoGreaterThan(String value) {
            addCriterion("tipoproducto >", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoGreaterThanOrEqualTo(String value) {
            addCriterion("tipoproducto >=", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoLessThan(String value) {
            addCriterion("tipoproducto <", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoLessThanOrEqualTo(String value) {
            addCriterion("tipoproducto <=", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoLike(String value) {
            addCriterion("tipoproducto like", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoNotLike(String value) {
            addCriterion("tipoproducto not like", value, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoIn(List<String> values) {
            addCriterion("tipoproducto in", values, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoNotIn(List<String> values) {
            addCriterion("tipoproducto not in", values, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoBetween(String value1, String value2) {
            addCriterion("tipoproducto between", value1, value2, "tipoproducto");
            return (Criteria) this;
        }

        public Criteria andTipoproductoNotBetween(String value1, String value2) {
            addCriterion("tipoproducto not between", value1, value2, "tipoproducto");
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

        public Criteria andObsIsNull() {
            addCriterion("obs is null");
            return (Criteria) this;
        }

        public Criteria andObsIsNotNull() {
            addCriterion("obs is not null");
            return (Criteria) this;
        }

        public Criteria andObsEqualTo(String value) {
            addCriterion("obs =", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsNotEqualTo(String value) {
            addCriterion("obs <>", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsGreaterThan(String value) {
            addCriterion("obs >", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsGreaterThanOrEqualTo(String value) {
            addCriterion("obs >=", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsLessThan(String value) {
            addCriterion("obs <", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsLessThanOrEqualTo(String value) {
            addCriterion("obs <=", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsLike(String value) {
            addCriterion("obs like", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsNotLike(String value) {
            addCriterion("obs not like", value, "obs");
            return (Criteria) this;
        }

        public Criteria andObsIn(List<String> values) {
            addCriterion("obs in", values, "obs");
            return (Criteria) this;
        }

        public Criteria andObsNotIn(List<String> values) {
            addCriterion("obs not in", values, "obs");
            return (Criteria) this;
        }

        public Criteria andObsBetween(String value1, String value2) {
            addCriterion("obs between", value1, value2, "obs");
            return (Criteria) this;
        }

        public Criteria andObsNotBetween(String value1, String value2) {
            addCriterion("obs not between", value1, value2, "obs");
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