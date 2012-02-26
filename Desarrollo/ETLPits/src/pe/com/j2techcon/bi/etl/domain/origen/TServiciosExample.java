package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TServiciosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TServiciosExample() {
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

        public Criteria andServicioIsNull() {
            addCriterion("servicio is null");
            return (Criteria) this;
        }

        public Criteria andServicioIsNotNull() {
            addCriterion("servicio is not null");
            return (Criteria) this;
        }

        public Criteria andServicioEqualTo(String value) {
            addCriterion("servicio =", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioNotEqualTo(String value) {
            addCriterion("servicio <>", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioGreaterThan(String value) {
            addCriterion("servicio >", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioGreaterThanOrEqualTo(String value) {
            addCriterion("servicio >=", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioLessThan(String value) {
            addCriterion("servicio <", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioLessThanOrEqualTo(String value) {
            addCriterion("servicio <=", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioLike(String value) {
            addCriterion("servicio like", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioNotLike(String value) {
            addCriterion("servicio not like", value, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioIn(List<String> values) {
            addCriterion("servicio in", values, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioNotIn(List<String> values) {
            addCriterion("servicio not in", values, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioBetween(String value1, String value2) {
            addCriterion("servicio between", value1, value2, "servicio");
            return (Criteria) this;
        }

        public Criteria andServicioNotBetween(String value1, String value2) {
            addCriterion("servicio not between", value1, value2, "servicio");
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

        public Criteria andDiasIsNull() {
            addCriterion("dias is null");
            return (Criteria) this;
        }

        public Criteria andDiasIsNotNull() {
            addCriterion("dias is not null");
            return (Criteria) this;
        }

        public Criteria andDiasEqualTo(Short value) {
            addCriterion("dias =", value, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasNotEqualTo(Short value) {
            addCriterion("dias <>", value, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasGreaterThan(Short value) {
            addCriterion("dias >", value, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasGreaterThanOrEqualTo(Short value) {
            addCriterion("dias >=", value, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasLessThan(Short value) {
            addCriterion("dias <", value, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasLessThanOrEqualTo(Short value) {
            addCriterion("dias <=", value, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasIn(List<Short> values) {
            addCriterion("dias in", values, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasNotIn(List<Short> values) {
            addCriterion("dias not in", values, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasBetween(Short value1, Short value2) {
            addCriterion("dias between", value1, value2, "dias");
            return (Criteria) this;
        }

        public Criteria andDiasNotBetween(Short value1, Short value2) {
            addCriterion("dias not between", value1, value2, "dias");
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

        public Criteria andTiposervicioIsNull() {
            addCriterion("tiposervicio is null");
            return (Criteria) this;
        }

        public Criteria andTiposervicioIsNotNull() {
            addCriterion("tiposervicio is not null");
            return (Criteria) this;
        }

        public Criteria andTiposervicioEqualTo(String value) {
            addCriterion("tiposervicio =", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotEqualTo(String value) {
            addCriterion("tiposervicio <>", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioGreaterThan(String value) {
            addCriterion("tiposervicio >", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioGreaterThanOrEqualTo(String value) {
            addCriterion("tiposervicio >=", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioLessThan(String value) {
            addCriterion("tiposervicio <", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioLessThanOrEqualTo(String value) {
            addCriterion("tiposervicio <=", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioLike(String value) {
            addCriterion("tiposervicio like", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotLike(String value) {
            addCriterion("tiposervicio not like", value, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioIn(List<String> values) {
            addCriterion("tiposervicio in", values, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotIn(List<String> values) {
            addCriterion("tiposervicio not in", values, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioBetween(String value1, String value2) {
            addCriterion("tiposervicio between", value1, value2, "tiposervicio");
            return (Criteria) this;
        }

        public Criteria andTiposervicioNotBetween(String value1, String value2) {
            addCriterion("tiposervicio not between", value1, value2, "tiposervicio");
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

        public Criteria andPrecioPeriferiaIsNull() {
            addCriterion("precio_periferia is null");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaIsNotNull() {
            addCriterion("precio_periferia is not null");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaEqualTo(BigDecimal value) {
            addCriterion("precio_periferia =", value, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaNotEqualTo(BigDecimal value) {
            addCriterion("precio_periferia <>", value, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaGreaterThan(BigDecimal value) {
            addCriterion("precio_periferia >", value, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("precio_periferia >=", value, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaLessThan(BigDecimal value) {
            addCriterion("precio_periferia <", value, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("precio_periferia <=", value, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaIn(List<BigDecimal> values) {
            addCriterion("precio_periferia in", values, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaNotIn(List<BigDecimal> values) {
            addCriterion("precio_periferia not in", values, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("precio_periferia between", value1, value2, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andPrecioPeriferiaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("precio_periferia not between", value1, value2, "precioPeriferia");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoIsNull() {
            addCriterion("cod_centro_costo is null");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoIsNotNull() {
            addCriterion("cod_centro_costo is not null");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoEqualTo(Integer value) {
            addCriterion("cod_centro_costo =", value, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoNotEqualTo(Integer value) {
            addCriterion("cod_centro_costo <>", value, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoGreaterThan(Integer value) {
            addCriterion("cod_centro_costo >", value, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cod_centro_costo >=", value, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoLessThan(Integer value) {
            addCriterion("cod_centro_costo <", value, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoLessThanOrEqualTo(Integer value) {
            addCriterion("cod_centro_costo <=", value, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoIn(List<Integer> values) {
            addCriterion("cod_centro_costo in", values, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoNotIn(List<Integer> values) {
            addCriterion("cod_centro_costo not in", values, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoBetween(Integer value1, Integer value2) {
            addCriterion("cod_centro_costo between", value1, value2, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andCodCentroCostoNotBetween(Integer value1, Integer value2) {
            addCriterion("cod_centro_costo not between", value1, value2, "codCentroCosto");
            return (Criteria) this;
        }

        public Criteria andTipo1IsNull() {
            addCriterion("tipo1 is null");
            return (Criteria) this;
        }

        public Criteria andTipo1IsNotNull() {
            addCriterion("tipo1 is not null");
            return (Criteria) this;
        }

        public Criteria andTipo1EqualTo(Short value) {
            addCriterion("tipo1 =", value, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1NotEqualTo(Short value) {
            addCriterion("tipo1 <>", value, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1GreaterThan(Short value) {
            addCriterion("tipo1 >", value, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1GreaterThanOrEqualTo(Short value) {
            addCriterion("tipo1 >=", value, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1LessThan(Short value) {
            addCriterion("tipo1 <", value, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1LessThanOrEqualTo(Short value) {
            addCriterion("tipo1 <=", value, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1In(List<Short> values) {
            addCriterion("tipo1 in", values, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1NotIn(List<Short> values) {
            addCriterion("tipo1 not in", values, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1Between(Short value1, Short value2) {
            addCriterion("tipo1 between", value1, value2, "tipo1");
            return (Criteria) this;
        }

        public Criteria andTipo1NotBetween(Short value1, Short value2) {
            addCriterion("tipo1 not between", value1, value2, "tipo1");
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