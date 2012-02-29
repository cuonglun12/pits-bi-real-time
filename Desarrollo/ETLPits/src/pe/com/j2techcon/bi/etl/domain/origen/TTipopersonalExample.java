package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTipopersonalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTipopersonalExample() {
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

        public Criteria andCodtipopersonalIsNull() {
            addCriterion("codtipopersonal is null");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalIsNotNull() {
            addCriterion("codtipopersonal is not null");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalEqualTo(String value) {
            addCriterion("codtipopersonal =", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalNotEqualTo(String value) {
            addCriterion("codtipopersonal <>", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalGreaterThan(String value) {
            addCriterion("codtipopersonal >", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalGreaterThanOrEqualTo(String value) {
            addCriterion("codtipopersonal >=", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalLessThan(String value) {
            addCriterion("codtipopersonal <", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalLessThanOrEqualTo(String value) {
            addCriterion("codtipopersonal <=", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalLike(String value) {
            addCriterion("codtipopersonal like", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalNotLike(String value) {
            addCriterion("codtipopersonal not like", value, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalIn(List<String> values) {
            addCriterion("codtipopersonal in", values, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalNotIn(List<String> values) {
            addCriterion("codtipopersonal not in", values, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalBetween(String value1, String value2) {
            addCriterion("codtipopersonal between", value1, value2, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andCodtipopersonalNotBetween(String value1, String value2) {
            addCriterion("codtipopersonal not between", value1, value2, "codtipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalIsNull() {
            addCriterion("tipopersonal is null");
            return (Criteria) this;
        }

        public Criteria andTipopersonalIsNotNull() {
            addCriterion("tipopersonal is not null");
            return (Criteria) this;
        }

        public Criteria andTipopersonalEqualTo(String value) {
            addCriterion("tipopersonal =", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalNotEqualTo(String value) {
            addCriterion("tipopersonal <>", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalGreaterThan(String value) {
            addCriterion("tipopersonal >", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalGreaterThanOrEqualTo(String value) {
            addCriterion("tipopersonal >=", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalLessThan(String value) {
            addCriterion("tipopersonal <", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalLessThanOrEqualTo(String value) {
            addCriterion("tipopersonal <=", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalLike(String value) {
            addCriterion("tipopersonal like", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalNotLike(String value) {
            addCriterion("tipopersonal not like", value, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalIn(List<String> values) {
            addCriterion("tipopersonal in", values, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalNotIn(List<String> values) {
            addCriterion("tipopersonal not in", values, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalBetween(String value1, String value2) {
            addCriterion("tipopersonal between", value1, value2, "tipopersonal");
            return (Criteria) this;
        }

        public Criteria andTipopersonalNotBetween(String value1, String value2) {
            addCriterion("tipopersonal not between", value1, value2, "tipopersonal");
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

        public Criteria andAnuladoIsNull() {
            addCriterion("anulado is null");
            return (Criteria) this;
        }

        public Criteria andAnuladoIsNotNull() {
            addCriterion("anulado is not null");
            return (Criteria) this;
        }

        public Criteria andAnuladoEqualTo(Short value) {
            addCriterion("anulado =", value, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoNotEqualTo(Short value) {
            addCriterion("anulado <>", value, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoGreaterThan(Short value) {
            addCriterion("anulado >", value, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoGreaterThanOrEqualTo(Short value) {
            addCriterion("anulado >=", value, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoLessThan(Short value) {
            addCriterion("anulado <", value, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoLessThanOrEqualTo(Short value) {
            addCriterion("anulado <=", value, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoIn(List<Short> values) {
            addCriterion("anulado in", values, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoNotIn(List<Short> values) {
            addCriterion("anulado not in", values, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoBetween(Short value1, Short value2) {
            addCriterion("anulado between", value1, value2, "anulado");
            return (Criteria) this;
        }

        public Criteria andAnuladoNotBetween(Short value1, Short value2) {
            addCriterion("anulado not between", value1, value2, "anulado");
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