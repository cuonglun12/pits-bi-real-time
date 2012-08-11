package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DetordenesExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetordenesExample() {
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

        public Criteria andTipoingresoIsNull() {
            addCriterion("tipoingreso is null");
            return (Criteria) this;
        }

        public Criteria andTipoingresoIsNotNull() {
            addCriterion("tipoingreso is not null");
            return (Criteria) this;
        }

        public Criteria andTipoingresoEqualTo(String value) {
            addCriterion("tipoingreso =", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoNotEqualTo(String value) {
            addCriterion("tipoingreso <>", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoGreaterThan(String value) {
            addCriterion("tipoingreso >", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoGreaterThanOrEqualTo(String value) {
            addCriterion("tipoingreso >=", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoLessThan(String value) {
            addCriterion("tipoingreso <", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoLessThanOrEqualTo(String value) {
            addCriterion("tipoingreso <=", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoLike(String value) {
            addCriterion("tipoingreso like", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoNotLike(String value) {
            addCriterion("tipoingreso not like", value, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoIn(List<String> values) {
            addCriterion("tipoingreso in", values, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoNotIn(List<String> values) {
            addCriterion("tipoingreso not in", values, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoBetween(String value1, String value2) {
            addCriterion("tipoingreso between", value1, value2, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andTipoingresoNotBetween(String value1, String value2) {
            addCriterion("tipoingreso not between", value1, value2, "tipoingreso");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionIsNull() {
            addCriterion("user_digitacion is null");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionIsNotNull() {
            addCriterion("user_digitacion is not null");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionEqualTo(String value) {
            addCriterion("user_digitacion =", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionNotEqualTo(String value) {
            addCriterion("user_digitacion <>", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionGreaterThan(String value) {
            addCriterion("user_digitacion >", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionGreaterThanOrEqualTo(String value) {
            addCriterion("user_digitacion >=", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionLessThan(String value) {
            addCriterion("user_digitacion <", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionLessThanOrEqualTo(String value) {
            addCriterion("user_digitacion <=", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionLike(String value) {
            addCriterion("user_digitacion like", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionNotLike(String value) {
            addCriterion("user_digitacion not like", value, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionIn(List<String> values) {
            addCriterion("user_digitacion in", values, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionNotIn(List<String> values) {
            addCriterion("user_digitacion not in", values, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionBetween(String value1, String value2) {
            addCriterion("user_digitacion between", value1, value2, "userDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionNotBetween(String value1, String value2) {
            addCriterion("user_digitacion not between", value1, value2, "userDigitacion");
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

        public Criteria andEmpresaIsNull() {
            addCriterion("empresa is null");
            return (Criteria) this;
        }

        public Criteria andEmpresaIsNotNull() {
            addCriterion("empresa is not null");
            return (Criteria) this;
        }

        public Criteria andEmpresaEqualTo(String value) {
            addCriterion("empresa =", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaNotEqualTo(String value) {
            addCriterion("empresa <>", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaGreaterThan(String value) {
            addCriterion("empresa >", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaGreaterThanOrEqualTo(String value) {
            addCriterion("empresa >=", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaLessThan(String value) {
            addCriterion("empresa <", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaLessThanOrEqualTo(String value) {
            addCriterion("empresa <=", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaLike(String value) {
            addCriterion("empresa like", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaNotLike(String value) {
            addCriterion("empresa not like", value, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaIn(List<String> values) {
            addCriterion("empresa in", values, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaNotIn(List<String> values) {
            addCriterion("empresa not in", values, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaBetween(String value1, String value2) {
            addCriterion("empresa between", value1, value2, "empresa");
            return (Criteria) this;
        }

        public Criteria andEmpresaNotBetween(String value1, String value2) {
            addCriterion("empresa not between", value1, value2, "empresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaIsNull() {
            addCriterion("llaveempresa is null");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaIsNotNull() {
            addCriterion("llaveempresa is not null");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaEqualTo(String value) {
            addCriterion("llaveempresa =", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaNotEqualTo(String value) {
            addCriterion("llaveempresa <>", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaGreaterThan(String value) {
            addCriterion("llaveempresa >", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaGreaterThanOrEqualTo(String value) {
            addCriterion("llaveempresa >=", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaLessThan(String value) {
            addCriterion("llaveempresa <", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaLessThanOrEqualTo(String value) {
            addCriterion("llaveempresa <=", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaLike(String value) {
            addCriterion("llaveempresa like", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaNotLike(String value) {
            addCriterion("llaveempresa not like", value, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaIn(List<String> values) {
            addCriterion("llaveempresa in", values, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaNotIn(List<String> values) {
            addCriterion("llaveempresa not in", values, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaBetween(String value1, String value2) {
            addCriterion("llaveempresa between", value1, value2, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andLlaveempresaNotBetween(String value1, String value2) {
            addCriterion("llaveempresa not between", value1, value2, "llaveempresa");
            return (Criteria) this;
        }

        public Criteria andDestinatarioIsNull() {
            addCriterion("destinatario is null");
            return (Criteria) this;
        }

        public Criteria andDestinatarioIsNotNull() {
            addCriterion("destinatario is not null");
            return (Criteria) this;
        }

        public Criteria andDestinatarioEqualTo(String value) {
            addCriterion("destinatario =", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioNotEqualTo(String value) {
            addCriterion("destinatario <>", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioGreaterThan(String value) {
            addCriterion("destinatario >", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioGreaterThanOrEqualTo(String value) {
            addCriterion("destinatario >=", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioLessThan(String value) {
            addCriterion("destinatario <", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioLessThanOrEqualTo(String value) {
            addCriterion("destinatario <=", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioLike(String value) {
            addCriterion("destinatario like", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioNotLike(String value) {
            addCriterion("destinatario not like", value, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioIn(List<String> values) {
            addCriterion("destinatario in", values, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioNotIn(List<String> values) {
            addCriterion("destinatario not in", values, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioBetween(String value1, String value2) {
            addCriterion("destinatario between", value1, value2, "destinatario");
            return (Criteria) this;
        }

        public Criteria andDestinatarioNotBetween(String value1, String value2) {
            addCriterion("destinatario not between", value1, value2, "destinatario");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaIsNull() {
            addCriterion("llavedestina is null");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaIsNotNull() {
            addCriterion("llavedestina is not null");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaEqualTo(String value) {
            addCriterion("llavedestina =", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaNotEqualTo(String value) {
            addCriterion("llavedestina <>", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaGreaterThan(String value) {
            addCriterion("llavedestina >", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaGreaterThanOrEqualTo(String value) {
            addCriterion("llavedestina >=", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaLessThan(String value) {
            addCriterion("llavedestina <", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaLessThanOrEqualTo(String value) {
            addCriterion("llavedestina <=", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaLike(String value) {
            addCriterion("llavedestina like", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaNotLike(String value) {
            addCriterion("llavedestina not like", value, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaIn(List<String> values) {
            addCriterion("llavedestina in", values, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaNotIn(List<String> values) {
            addCriterion("llavedestina not in", values, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaBetween(String value1, String value2) {
            addCriterion("llavedestina between", value1, value2, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andLlavedestinaNotBetween(String value1, String value2) {
            addCriterion("llavedestina not between", value1, value2, "llavedestina");
            return (Criteria) this;
        }

        public Criteria andCargoIsNull() {
            addCriterion("cargo is null");
            return (Criteria) this;
        }

        public Criteria andCargoIsNotNull() {
            addCriterion("cargo is not null");
            return (Criteria) this;
        }

        public Criteria andCargoEqualTo(String value) {
            addCriterion("cargo =", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoNotEqualTo(String value) {
            addCriterion("cargo <>", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoGreaterThan(String value) {
            addCriterion("cargo >", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoGreaterThanOrEqualTo(String value) {
            addCriterion("cargo >=", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoLessThan(String value) {
            addCriterion("cargo <", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoLessThanOrEqualTo(String value) {
            addCriterion("cargo <=", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoLike(String value) {
            addCriterion("cargo like", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoNotLike(String value) {
            addCriterion("cargo not like", value, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoIn(List<String> values) {
            addCriterion("cargo in", values, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoNotIn(List<String> values) {
            addCriterion("cargo not in", values, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoBetween(String value1, String value2) {
            addCriterion("cargo between", value1, value2, "cargo");
            return (Criteria) this;
        }

        public Criteria andCargoNotBetween(String value1, String value2) {
            addCriterion("cargo not between", value1, value2, "cargo");
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

        public Criteria andReferenciaIsNull() {
            addCriterion("referencia is null");
            return (Criteria) this;
        }

        public Criteria andReferenciaIsNotNull() {
            addCriterion("referencia is not null");
            return (Criteria) this;
        }

        public Criteria andReferenciaEqualTo(String value) {
            addCriterion("referencia =", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotEqualTo(String value) {
            addCriterion("referencia <>", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaGreaterThan(String value) {
            addCriterion("referencia >", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaGreaterThanOrEqualTo(String value) {
            addCriterion("referencia >=", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaLessThan(String value) {
            addCriterion("referencia <", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaLessThanOrEqualTo(String value) {
            addCriterion("referencia <=", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaLike(String value) {
            addCriterion("referencia like", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotLike(String value) {
            addCriterion("referencia not like", value, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaIn(List<String> values) {
            addCriterion("referencia in", values, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotIn(List<String> values) {
            addCriterion("referencia not in", values, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaBetween(String value1, String value2) {
            addCriterion("referencia between", value1, value2, "referencia");
            return (Criteria) this;
        }

        public Criteria andReferenciaNotBetween(String value1, String value2) {
            addCriterion("referencia not between", value1, value2, "referencia");
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

        public Criteria andCuadranteIsNull() {
            addCriterion("cuadrante is null");
            return (Criteria) this;
        }

        public Criteria andCuadranteIsNotNull() {
            addCriterion("cuadrante is not null");
            return (Criteria) this;
        }

        public Criteria andCuadranteEqualTo(String value) {
            addCriterion("cuadrante =", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteNotEqualTo(String value) {
            addCriterion("cuadrante <>", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteGreaterThan(String value) {
            addCriterion("cuadrante >", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteGreaterThanOrEqualTo(String value) {
            addCriterion("cuadrante >=", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteLessThan(String value) {
            addCriterion("cuadrante <", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteLessThanOrEqualTo(String value) {
            addCriterion("cuadrante <=", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteLike(String value) {
            addCriterion("cuadrante like", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteNotLike(String value) {
            addCriterion("cuadrante not like", value, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteIn(List<String> values) {
            addCriterion("cuadrante in", values, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteNotIn(List<String> values) {
            addCriterion("cuadrante not in", values, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteBetween(String value1, String value2) {
            addCriterion("cuadrante between", value1, value2, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andCuadranteNotBetween(String value1, String value2) {
            addCriterion("cuadrante not between", value1, value2, "cuadrante");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionIsNull() {
            addCriterion("nuevadireccion is null");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionIsNotNull() {
            addCriterion("nuevadireccion is not null");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionEqualTo(String value) {
            addCriterion("nuevadireccion =", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionNotEqualTo(String value) {
            addCriterion("nuevadireccion <>", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionGreaterThan(String value) {
            addCriterion("nuevadireccion >", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionGreaterThanOrEqualTo(String value) {
            addCriterion("nuevadireccion >=", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionLessThan(String value) {
            addCriterion("nuevadireccion <", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionLessThanOrEqualTo(String value) {
            addCriterion("nuevadireccion <=", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionLike(String value) {
            addCriterion("nuevadireccion like", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionNotLike(String value) {
            addCriterion("nuevadireccion not like", value, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionIn(List<String> values) {
            addCriterion("nuevadireccion in", values, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionNotIn(List<String> values) {
            addCriterion("nuevadireccion not in", values, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionBetween(String value1, String value2) {
            addCriterion("nuevadireccion between", value1, value2, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevadireccionNotBetween(String value1, String value2) {
            addCriterion("nuevadireccion not between", value1, value2, "nuevadireccion");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaIsNull() {
            addCriterion("nuevareferencia is null");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaIsNotNull() {
            addCriterion("nuevareferencia is not null");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaEqualTo(String value) {
            addCriterion("nuevareferencia =", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaNotEqualTo(String value) {
            addCriterion("nuevareferencia <>", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaGreaterThan(String value) {
            addCriterion("nuevareferencia >", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaGreaterThanOrEqualTo(String value) {
            addCriterion("nuevareferencia >=", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaLessThan(String value) {
            addCriterion("nuevareferencia <", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaLessThanOrEqualTo(String value) {
            addCriterion("nuevareferencia <=", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaLike(String value) {
            addCriterion("nuevareferencia like", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaNotLike(String value) {
            addCriterion("nuevareferencia not like", value, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaIn(List<String> values) {
            addCriterion("nuevareferencia in", values, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaNotIn(List<String> values) {
            addCriterion("nuevareferencia not in", values, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaBetween(String value1, String value2) {
            addCriterion("nuevareferencia between", value1, value2, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevareferenciaNotBetween(String value1, String value2) {
            addCriterion("nuevareferencia not between", value1, value2, "nuevareferencia");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalIsNull() {
            addCriterion("nuevocodpostal is null");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalIsNotNull() {
            addCriterion("nuevocodpostal is not null");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalEqualTo(String value) {
            addCriterion("nuevocodpostal =", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalNotEqualTo(String value) {
            addCriterion("nuevocodpostal <>", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalGreaterThan(String value) {
            addCriterion("nuevocodpostal >", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalGreaterThanOrEqualTo(String value) {
            addCriterion("nuevocodpostal >=", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalLessThan(String value) {
            addCriterion("nuevocodpostal <", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalLessThanOrEqualTo(String value) {
            addCriterion("nuevocodpostal <=", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalLike(String value) {
            addCriterion("nuevocodpostal like", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalNotLike(String value) {
            addCriterion("nuevocodpostal not like", value, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalIn(List<String> values) {
            addCriterion("nuevocodpostal in", values, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalNotIn(List<String> values) {
            addCriterion("nuevocodpostal not in", values, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalBetween(String value1, String value2) {
            addCriterion("nuevocodpostal between", value1, value2, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevocodpostalNotBetween(String value1, String value2) {
            addCriterion("nuevocodpostal not between", value1, value2, "nuevocodpostal");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoIsNull() {
            addCriterion("nuevoubigeo is null");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoIsNotNull() {
            addCriterion("nuevoubigeo is not null");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoEqualTo(String value) {
            addCriterion("nuevoubigeo =", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoNotEqualTo(String value) {
            addCriterion("nuevoubigeo <>", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoGreaterThan(String value) {
            addCriterion("nuevoubigeo >", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoGreaterThanOrEqualTo(String value) {
            addCriterion("nuevoubigeo >=", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoLessThan(String value) {
            addCriterion("nuevoubigeo <", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoLessThanOrEqualTo(String value) {
            addCriterion("nuevoubigeo <=", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoLike(String value) {
            addCriterion("nuevoubigeo like", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoNotLike(String value) {
            addCriterion("nuevoubigeo not like", value, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoIn(List<String> values) {
            addCriterion("nuevoubigeo in", values, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoNotIn(List<String> values) {
            addCriterion("nuevoubigeo not in", values, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoBetween(String value1, String value2) {
            addCriterion("nuevoubigeo between", value1, value2, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andNuevoubigeoNotBetween(String value1, String value2) {
            addCriterion("nuevoubigeo not between", value1, value2, "nuevoubigeo");
            return (Criteria) this;
        }

        public Criteria andLlaveIsNull() {
            addCriterion("llave is null");
            return (Criteria) this;
        }

        public Criteria andLlaveIsNotNull() {
            addCriterion("llave is not null");
            return (Criteria) this;
        }

        public Criteria andLlaveEqualTo(String value) {
            addCriterion("llave =", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveNotEqualTo(String value) {
            addCriterion("llave <>", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveGreaterThan(String value) {
            addCriterion("llave >", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveGreaterThanOrEqualTo(String value) {
            addCriterion("llave >=", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveLessThan(String value) {
            addCriterion("llave <", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveLessThanOrEqualTo(String value) {
            addCriterion("llave <=", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveLike(String value) {
            addCriterion("llave like", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveNotLike(String value) {
            addCriterion("llave not like", value, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveIn(List<String> values) {
            addCriterion("llave in", values, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveNotIn(List<String> values) {
            addCriterion("llave not in", values, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveBetween(String value1, String value2) {
            addCriterion("llave between", value1, value2, "llave");
            return (Criteria) this;
        }

        public Criteria andLlaveNotBetween(String value1, String value2) {
            addCriterion("llave not between", value1, value2, "llave");
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

        public Criteria andCodigo1IsNull() {
            addCriterion("codigo1 is null");
            return (Criteria) this;
        }

        public Criteria andCodigo1IsNotNull() {
            addCriterion("codigo1 is not null");
            return (Criteria) this;
        }

        public Criteria andCodigo1EqualTo(String value) {
            addCriterion("codigo1 =", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1NotEqualTo(String value) {
            addCriterion("codigo1 <>", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1GreaterThan(String value) {
            addCriterion("codigo1 >", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1GreaterThanOrEqualTo(String value) {
            addCriterion("codigo1 >=", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1LessThan(String value) {
            addCriterion("codigo1 <", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1LessThanOrEqualTo(String value) {
            addCriterion("codigo1 <=", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1Like(String value) {
            addCriterion("codigo1 like", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1NotLike(String value) {
            addCriterion("codigo1 not like", value, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1In(List<String> values) {
            addCriterion("codigo1 in", values, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1NotIn(List<String> values) {
            addCriterion("codigo1 not in", values, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1Between(String value1, String value2) {
            addCriterion("codigo1 between", value1, value2, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo1NotBetween(String value1, String value2) {
            addCriterion("codigo1 not between", value1, value2, "codigo1");
            return (Criteria) this;
        }

        public Criteria andCodigo2IsNull() {
            addCriterion("codigo2 is null");
            return (Criteria) this;
        }

        public Criteria andCodigo2IsNotNull() {
            addCriterion("codigo2 is not null");
            return (Criteria) this;
        }

        public Criteria andCodigo2EqualTo(String value) {
            addCriterion("codigo2 =", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2NotEqualTo(String value) {
            addCriterion("codigo2 <>", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2GreaterThan(String value) {
            addCriterion("codigo2 >", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2GreaterThanOrEqualTo(String value) {
            addCriterion("codigo2 >=", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2LessThan(String value) {
            addCriterion("codigo2 <", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2LessThanOrEqualTo(String value) {
            addCriterion("codigo2 <=", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2Like(String value) {
            addCriterion("codigo2 like", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2NotLike(String value) {
            addCriterion("codigo2 not like", value, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2In(List<String> values) {
            addCriterion("codigo2 in", values, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2NotIn(List<String> values) {
            addCriterion("codigo2 not in", values, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2Between(String value1, String value2) {
            addCriterion("codigo2 between", value1, value2, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo2NotBetween(String value1, String value2) {
            addCriterion("codigo2 not between", value1, value2, "codigo2");
            return (Criteria) this;
        }

        public Criteria andCodigo3IsNull() {
            addCriterion("codigo3 is null");
            return (Criteria) this;
        }

        public Criteria andCodigo3IsNotNull() {
            addCriterion("codigo3 is not null");
            return (Criteria) this;
        }

        public Criteria andCodigo3EqualTo(String value) {
            addCriterion("codigo3 =", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3NotEqualTo(String value) {
            addCriterion("codigo3 <>", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3GreaterThan(String value) {
            addCriterion("codigo3 >", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3GreaterThanOrEqualTo(String value) {
            addCriterion("codigo3 >=", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3LessThan(String value) {
            addCriterion("codigo3 <", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3LessThanOrEqualTo(String value) {
            addCriterion("codigo3 <=", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3Like(String value) {
            addCriterion("codigo3 like", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3NotLike(String value) {
            addCriterion("codigo3 not like", value, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3In(List<String> values) {
            addCriterion("codigo3 in", values, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3NotIn(List<String> values) {
            addCriterion("codigo3 not in", values, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3Between(String value1, String value2) {
            addCriterion("codigo3 between", value1, value2, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo3NotBetween(String value1, String value2) {
            addCriterion("codigo3 not between", value1, value2, "codigo3");
            return (Criteria) this;
        }

        public Criteria andCodigo4IsNull() {
            addCriterion("codigo4 is null");
            return (Criteria) this;
        }

        public Criteria andCodigo4IsNotNull() {
            addCriterion("codigo4 is not null");
            return (Criteria) this;
        }

        public Criteria andCodigo4EqualTo(String value) {
            addCriterion("codigo4 =", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4NotEqualTo(String value) {
            addCriterion("codigo4 <>", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4GreaterThan(String value) {
            addCriterion("codigo4 >", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4GreaterThanOrEqualTo(String value) {
            addCriterion("codigo4 >=", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4LessThan(String value) {
            addCriterion("codigo4 <", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4LessThanOrEqualTo(String value) {
            addCriterion("codigo4 <=", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4Like(String value) {
            addCriterion("codigo4 like", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4NotLike(String value) {
            addCriterion("codigo4 not like", value, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4In(List<String> values) {
            addCriterion("codigo4 in", values, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4NotIn(List<String> values) {
            addCriterion("codigo4 not in", values, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4Between(String value1, String value2) {
            addCriterion("codigo4 between", value1, value2, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo4NotBetween(String value1, String value2) {
            addCriterion("codigo4 not between", value1, value2, "codigo4");
            return (Criteria) this;
        }

        public Criteria andCodigo5IsNull() {
            addCriterion("codigo5 is null");
            return (Criteria) this;
        }

        public Criteria andCodigo5IsNotNull() {
            addCriterion("codigo5 is not null");
            return (Criteria) this;
        }

        public Criteria andCodigo5EqualTo(String value) {
            addCriterion("codigo5 =", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5NotEqualTo(String value) {
            addCriterion("codigo5 <>", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5GreaterThan(String value) {
            addCriterion("codigo5 >", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5GreaterThanOrEqualTo(String value) {
            addCriterion("codigo5 >=", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5LessThan(String value) {
            addCriterion("codigo5 <", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5LessThanOrEqualTo(String value) {
            addCriterion("codigo5 <=", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5Like(String value) {
            addCriterion("codigo5 like", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5NotLike(String value) {
            addCriterion("codigo5 not like", value, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5In(List<String> values) {
            addCriterion("codigo5 in", values, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5NotIn(List<String> values) {
            addCriterion("codigo5 not in", values, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5Between(String value1, String value2) {
            addCriterion("codigo5 between", value1, value2, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo5NotBetween(String value1, String value2) {
            addCriterion("codigo5 not between", value1, value2, "codigo5");
            return (Criteria) this;
        }

        public Criteria andCodigo6IsNull() {
            addCriterion("codigo6 is null");
            return (Criteria) this;
        }

        public Criteria andCodigo6IsNotNull() {
            addCriterion("codigo6 is not null");
            return (Criteria) this;
        }

        public Criteria andCodigo6EqualTo(String value) {
            addCriterion("codigo6 =", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6NotEqualTo(String value) {
            addCriterion("codigo6 <>", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6GreaterThan(String value) {
            addCriterion("codigo6 >", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6GreaterThanOrEqualTo(String value) {
            addCriterion("codigo6 >=", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6LessThan(String value) {
            addCriterion("codigo6 <", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6LessThanOrEqualTo(String value) {
            addCriterion("codigo6 <=", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6Like(String value) {
            addCriterion("codigo6 like", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6NotLike(String value) {
            addCriterion("codigo6 not like", value, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6In(List<String> values) {
            addCriterion("codigo6 in", values, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6NotIn(List<String> values) {
            addCriterion("codigo6 not in", values, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6Between(String value1, String value2) {
            addCriterion("codigo6 between", value1, value2, "codigo6");
            return (Criteria) this;
        }

        public Criteria andCodigo6NotBetween(String value1, String value2) {
            addCriterion("codigo6 not between", value1, value2, "codigo6");
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

        public Criteria andCodestadodescIsNull() {
            addCriterion("codestadodesc is null");
            return (Criteria) this;
        }

        public Criteria andCodestadodescIsNotNull() {
            addCriterion("codestadodesc is not null");
            return (Criteria) this;
        }

        public Criteria andCodestadodescEqualTo(String value) {
            addCriterion("codestadodesc =", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescNotEqualTo(String value) {
            addCriterion("codestadodesc <>", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescGreaterThan(String value) {
            addCriterion("codestadodesc >", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescGreaterThanOrEqualTo(String value) {
            addCriterion("codestadodesc >=", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescLessThan(String value) {
            addCriterion("codestadodesc <", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescLessThanOrEqualTo(String value) {
            addCriterion("codestadodesc <=", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescLike(String value) {
            addCriterion("codestadodesc like", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescNotLike(String value) {
            addCriterion("codestadodesc not like", value, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescIn(List<String> values) {
            addCriterion("codestadodesc in", values, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescNotIn(List<String> values) {
            addCriterion("codestadodesc not in", values, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescBetween(String value1, String value2) {
            addCriterion("codestadodesc between", value1, value2, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadodescNotBetween(String value1, String value2) {
            addCriterion("codestadodesc not between", value1, value2, "codestadodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescIsNull() {
            addCriterion("codmotivodesc is null");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescIsNotNull() {
            addCriterion("codmotivodesc is not null");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescEqualTo(String value) {
            addCriterion("codmotivodesc =", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescNotEqualTo(String value) {
            addCriterion("codmotivodesc <>", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescGreaterThan(String value) {
            addCriterion("codmotivodesc >", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescGreaterThanOrEqualTo(String value) {
            addCriterion("codmotivodesc >=", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescLessThan(String value) {
            addCriterion("codmotivodesc <", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescLessThanOrEqualTo(String value) {
            addCriterion("codmotivodesc <=", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescLike(String value) {
            addCriterion("codmotivodesc like", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescNotLike(String value) {
            addCriterion("codmotivodesc not like", value, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescIn(List<String> values) {
            addCriterion("codmotivodesc in", values, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescNotIn(List<String> values) {
            addCriterion("codmotivodesc not in", values, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescBetween(String value1, String value2) {
            addCriterion("codmotivodesc between", value1, value2, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodmotivodescNotBetween(String value1, String value2) {
            addCriterion("codmotivodesc not between", value1, value2, "codmotivodesc");
            return (Criteria) this;
        }

        public Criteria andCodestadoantIsNull() {
            addCriterion("codestadoant is null");
            return (Criteria) this;
        }

        public Criteria andCodestadoantIsNotNull() {
            addCriterion("codestadoant is not null");
            return (Criteria) this;
        }

        public Criteria andCodestadoantEqualTo(String value) {
            addCriterion("codestadoant =", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantNotEqualTo(String value) {
            addCriterion("codestadoant <>", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantGreaterThan(String value) {
            addCriterion("codestadoant >", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantGreaterThanOrEqualTo(String value) {
            addCriterion("codestadoant >=", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantLessThan(String value) {
            addCriterion("codestadoant <", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantLessThanOrEqualTo(String value) {
            addCriterion("codestadoant <=", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantLike(String value) {
            addCriterion("codestadoant like", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantNotLike(String value) {
            addCriterion("codestadoant not like", value, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantIn(List<String> values) {
            addCriterion("codestadoant in", values, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantNotIn(List<String> values) {
            addCriterion("codestadoant not in", values, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantBetween(String value1, String value2) {
            addCriterion("codestadoant between", value1, value2, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodestadoantNotBetween(String value1, String value2) {
            addCriterion("codestadoant not between", value1, value2, "codestadoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantIsNull() {
            addCriterion("codmotivoant is null");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantIsNotNull() {
            addCriterion("codmotivoant is not null");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantEqualTo(String value) {
            addCriterion("codmotivoant =", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantNotEqualTo(String value) {
            addCriterion("codmotivoant <>", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantGreaterThan(String value) {
            addCriterion("codmotivoant >", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantGreaterThanOrEqualTo(String value) {
            addCriterion("codmotivoant >=", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantLessThan(String value) {
            addCriterion("codmotivoant <", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantLessThanOrEqualTo(String value) {
            addCriterion("codmotivoant <=", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantLike(String value) {
            addCriterion("codmotivoant like", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantNotLike(String value) {
            addCriterion("codmotivoant not like", value, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantIn(List<String> values) {
            addCriterion("codmotivoant in", values, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantNotIn(List<String> values) {
            addCriterion("codmotivoant not in", values, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantBetween(String value1, String value2) {
            addCriterion("codmotivoant between", value1, value2, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodmotivoantNotBetween(String value1, String value2) {
            addCriterion("codmotivoant not between", value1, value2, "codmotivoant");
            return (Criteria) this;
        }

        public Criteria andCodestadocliIsNull() {
            addCriterion("codestadocli is null");
            return (Criteria) this;
        }

        public Criteria andCodestadocliIsNotNull() {
            addCriterion("codestadocli is not null");
            return (Criteria) this;
        }

        public Criteria andCodestadocliEqualTo(String value) {
            addCriterion("codestadocli =", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliNotEqualTo(String value) {
            addCriterion("codestadocli <>", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliGreaterThan(String value) {
            addCriterion("codestadocli >", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliGreaterThanOrEqualTo(String value) {
            addCriterion("codestadocli >=", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliLessThan(String value) {
            addCriterion("codestadocli <", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliLessThanOrEqualTo(String value) {
            addCriterion("codestadocli <=", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliLike(String value) {
            addCriterion("codestadocli like", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliNotLike(String value) {
            addCriterion("codestadocli not like", value, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliIn(List<String> values) {
            addCriterion("codestadocli in", values, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliNotIn(List<String> values) {
            addCriterion("codestadocli not in", values, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliBetween(String value1, String value2) {
            addCriterion("codestadocli between", value1, value2, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodestadocliNotBetween(String value1, String value2) {
            addCriterion("codestadocli not between", value1, value2, "codestadocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliIsNull() {
            addCriterion("codmotivocli is null");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliIsNotNull() {
            addCriterion("codmotivocli is not null");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliEqualTo(String value) {
            addCriterion("codmotivocli =", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliNotEqualTo(String value) {
            addCriterion("codmotivocli <>", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliGreaterThan(String value) {
            addCriterion("codmotivocli >", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliGreaterThanOrEqualTo(String value) {
            addCriterion("codmotivocli >=", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliLessThan(String value) {
            addCriterion("codmotivocli <", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliLessThanOrEqualTo(String value) {
            addCriterion("codmotivocli <=", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliLike(String value) {
            addCriterion("codmotivocli like", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliNotLike(String value) {
            addCriterion("codmotivocli not like", value, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliIn(List<String> values) {
            addCriterion("codmotivocli in", values, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliNotIn(List<String> values) {
            addCriterion("codmotivocli not in", values, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliBetween(String value1, String value2) {
            addCriterion("codmotivocli between", value1, value2, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andCodmotivocliNotBetween(String value1, String value2) {
            addCriterion("codmotivocli not between", value1, value2, "codmotivocli");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionIsNull() {
            addCriterion("fec_digitacion is null");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionIsNotNull() {
            addCriterion("fec_digitacion is not null");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacion =", value, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionNotEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacion <>", value, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionGreaterThan(Date value) {
            addCriterionForJDBCDate("fec_digitacion >", value, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacion >=", value, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionLessThan(Date value) {
            addCriterionForJDBCDate("fec_digitacion <", value, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacion <=", value, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionIn(List<Date> values) {
            addCriterionForJDBCDate("fec_digitacion in", values, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionNotIn(List<Date> values) {
            addCriterionForJDBCDate("fec_digitacion not in", values, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fec_digitacion between", value1, value2, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fec_digitacion not between", value1, value2, "fecDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionIsNull() {
            addCriterion("hora_digitacion is null");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionIsNotNull() {
            addCriterion("hora_digitacion is not null");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionEqualTo(Date value) {
            addCriterion("hora_digitacion =", value, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionNotEqualTo(Date value) {
            addCriterion("hora_digitacion <>", value, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionGreaterThan(Date value) {
            addCriterion("hora_digitacion >", value, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionGreaterThanOrEqualTo(Date value) {
            addCriterion("hora_digitacion >=", value, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionLessThan(Date value) {
            addCriterion("hora_digitacion <", value, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionLessThanOrEqualTo(Date value) {
            addCriterion("hora_digitacion <=", value, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionIn(List<Date> values) {
            addCriterion("hora_digitacion in", values, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionNotIn(List<Date> values) {
            addCriterion("hora_digitacion not in", values, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionBetween(Date value1, Date value2) {
            addCriterion("hora_digitacion between", value1, value2, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionNotBetween(Date value1, Date value2) {
            addCriterion("hora_digitacion not between", value1, value2, "horaDigitacion");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodIsNull() {
            addCriterion("user_digitacionmod is null");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodIsNotNull() {
            addCriterion("user_digitacionmod is not null");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodEqualTo(String value) {
            addCriterion("user_digitacionmod =", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodNotEqualTo(String value) {
            addCriterion("user_digitacionmod <>", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodGreaterThan(String value) {
            addCriterion("user_digitacionmod >", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodGreaterThanOrEqualTo(String value) {
            addCriterion("user_digitacionmod >=", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodLessThan(String value) {
            addCriterion("user_digitacionmod <", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodLessThanOrEqualTo(String value) {
            addCriterion("user_digitacionmod <=", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodLike(String value) {
            addCriterion("user_digitacionmod like", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodNotLike(String value) {
            addCriterion("user_digitacionmod not like", value, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodIn(List<String> values) {
            addCriterion("user_digitacionmod in", values, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodNotIn(List<String> values) {
            addCriterion("user_digitacionmod not in", values, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodBetween(String value1, String value2) {
            addCriterion("user_digitacionmod between", value1, value2, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDigitacionmodNotBetween(String value1, String value2) {
            addCriterion("user_digitacionmod not between", value1, value2, "userDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodIsNull() {
            addCriterion("fec_digitacionmod is null");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodIsNotNull() {
            addCriterion("fec_digitacionmod is not null");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacionmod =", value, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodNotEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacionmod <>", value, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodGreaterThan(Date value) {
            addCriterionForJDBCDate("fec_digitacionmod >", value, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacionmod >=", value, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodLessThan(Date value) {
            addCriterionForJDBCDate("fec_digitacionmod <", value, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fec_digitacionmod <=", value, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodIn(List<Date> values) {
            addCriterionForJDBCDate("fec_digitacionmod in", values, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodNotIn(List<Date> values) {
            addCriterionForJDBCDate("fec_digitacionmod not in", values, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fec_digitacionmod between", value1, value2, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andFecDigitacionmodNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fec_digitacionmod not between", value1, value2, "fecDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodIsNull() {
            addCriterion("hora_digitacionmod is null");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodIsNotNull() {
            addCriterion("hora_digitacionmod is not null");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodEqualTo(Date value) {
            addCriterion("hora_digitacionmod =", value, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodNotEqualTo(Date value) {
            addCriterion("hora_digitacionmod <>", value, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodGreaterThan(Date value) {
            addCriterion("hora_digitacionmod >", value, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodGreaterThanOrEqualTo(Date value) {
            addCriterion("hora_digitacionmod >=", value, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodLessThan(Date value) {
            addCriterion("hora_digitacionmod <", value, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodLessThanOrEqualTo(Date value) {
            addCriterion("hora_digitacionmod <=", value, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodIn(List<Date> values) {
            addCriterion("hora_digitacionmod in", values, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodNotIn(List<Date> values) {
            addCriterion("hora_digitacionmod not in", values, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodBetween(Date value1, Date value2) {
            addCriterion("hora_digitacionmod between", value1, value2, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andHoraDigitacionmodNotBetween(Date value1, Date value2) {
            addCriterion("hora_digitacionmod not between", value1, value2, "horaDigitacionmod");
            return (Criteria) this;
        }

        public Criteria andUserDescargoIsNull() {
            addCriterion("user_descargo is null");
            return (Criteria) this;
        }

        public Criteria andUserDescargoIsNotNull() {
            addCriterion("user_descargo is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescargoEqualTo(String value) {
            addCriterion("user_descargo =", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoNotEqualTo(String value) {
            addCriterion("user_descargo <>", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoGreaterThan(String value) {
            addCriterion("user_descargo >", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoGreaterThanOrEqualTo(String value) {
            addCriterion("user_descargo >=", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoLessThan(String value) {
            addCriterion("user_descargo <", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoLessThanOrEqualTo(String value) {
            addCriterion("user_descargo <=", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoLike(String value) {
            addCriterion("user_descargo like", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoNotLike(String value) {
            addCriterion("user_descargo not like", value, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoIn(List<String> values) {
            addCriterion("user_descargo in", values, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoNotIn(List<String> values) {
            addCriterion("user_descargo not in", values, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoBetween(String value1, String value2) {
            addCriterion("user_descargo between", value1, value2, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andUserDescargoNotBetween(String value1, String value2) {
            addCriterion("user_descargo not between", value1, value2, "userDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoIsNull() {
            addCriterion("fec_descargo is null");
            return (Criteria) this;
        }

        public Criteria andFecDescargoIsNotNull() {
            addCriterion("fec_descargo is not null");
            return (Criteria) this;
        }

        public Criteria andFecDescargoEqualTo(Date value) {
            addCriterionForJDBCDate("fec_descargo =", value, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fec_descargo <>", value, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoGreaterThan(Date value) {
            addCriterionForJDBCDate("fec_descargo >", value, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fec_descargo >=", value, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoLessThan(Date value) {
            addCriterionForJDBCDate("fec_descargo <", value, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fec_descargo <=", value, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoIn(List<Date> values) {
            addCriterionForJDBCDate("fec_descargo in", values, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fec_descargo not in", values, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fec_descargo between", value1, value2, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecDescargoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fec_descargo not between", value1, value2, "fecDescargo");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionIsNull() {
            addCriterion("fecrecepcion is null");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionIsNotNull() {
            addCriterion("fecrecepcion is not null");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionEqualTo(Date value) {
            addCriterion("fecrecepcion =", value, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionNotEqualTo(Date value) {
            addCriterion("fecrecepcion <>", value, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionGreaterThan(Date value) {
            addCriterion("fecrecepcion >", value, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionGreaterThanOrEqualTo(Date value) {
            addCriterion("fecrecepcion >=", value, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionLessThan(Date value) {
            addCriterion("fecrecepcion <", value, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionLessThanOrEqualTo(Date value) {
            addCriterion("fecrecepcion <=", value, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionIn(List<Date> values) {
            addCriterion("fecrecepcion in", values, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionNotIn(List<Date> values) {
            addCriterion("fecrecepcion not in", values, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionBetween(Date value1, Date value2) {
            addCriterion("fecrecepcion between", value1, value2, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andFecrecepcionNotBetween(Date value1, Date value2) {
            addCriterion("fecrecepcion not between", value1, value2, "fecrecepcion");
            return (Criteria) this;
        }

        public Criteria andTorreIsNull() {
            addCriterion("torre_ is null");
            return (Criteria) this;
        }

        public Criteria andTorreIsNotNull() {
            addCriterion("torre_ is not null");
            return (Criteria) this;
        }

        public Criteria andTorreEqualTo(Integer value) {
            addCriterion("torre_ =", value, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreNotEqualTo(Integer value) {
            addCriterion("torre_ <>", value, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreGreaterThan(Integer value) {
            addCriterion("torre_ >", value, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreGreaterThanOrEqualTo(Integer value) {
            addCriterion("torre_ >=", value, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreLessThan(Integer value) {
            addCriterion("torre_ <", value, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreLessThanOrEqualTo(Integer value) {
            addCriterion("torre_ <=", value, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreIn(List<Integer> values) {
            addCriterion("torre_ in", values, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreNotIn(List<Integer> values) {
            addCriterion("torre_ not in", values, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreBetween(Integer value1, Integer value2) {
            addCriterion("torre_ between", value1, value2, "torre");
            return (Criteria) this;
        }

        public Criteria andTorreNotBetween(Integer value1, Integer value2) {
            addCriterion("torre_ not between", value1, value2, "torre");
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

        public Criteria andAjusteIsNull() {
            addCriterion("ajuste is null");
            return (Criteria) this;
        }

        public Criteria andAjusteIsNotNull() {
            addCriterion("ajuste is not null");
            return (Criteria) this;
        }

        public Criteria andAjusteEqualTo(Short value) {
            addCriterion("ajuste =", value, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteNotEqualTo(Short value) {
            addCriterion("ajuste <>", value, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteGreaterThan(Short value) {
            addCriterion("ajuste >", value, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteGreaterThanOrEqualTo(Short value) {
            addCriterion("ajuste >=", value, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteLessThan(Short value) {
            addCriterion("ajuste <", value, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteLessThanOrEqualTo(Short value) {
            addCriterion("ajuste <=", value, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteIn(List<Short> values) {
            addCriterion("ajuste in", values, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteNotIn(List<Short> values) {
            addCriterion("ajuste not in", values, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteBetween(Short value1, Short value2) {
            addCriterion("ajuste between", value1, value2, "ajuste");
            return (Criteria) this;
        }

        public Criteria andAjusteNotBetween(Short value1, Short value2) {
            addCriterion("ajuste not between", value1, value2, "ajuste");
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

        public Criteria andRecepcionIsNull() {
            addCriterion("recepcion is null");
            return (Criteria) this;
        }

        public Criteria andRecepcionIsNotNull() {
            addCriterion("recepcion is not null");
            return (Criteria) this;
        }

        public Criteria andRecepcionEqualTo(String value) {
            addCriterion("recepcion =", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionNotEqualTo(String value) {
            addCriterion("recepcion <>", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionGreaterThan(String value) {
            addCriterion("recepcion >", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionGreaterThanOrEqualTo(String value) {
            addCriterion("recepcion >=", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionLessThan(String value) {
            addCriterion("recepcion <", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionLessThanOrEqualTo(String value) {
            addCriterion("recepcion <=", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionLike(String value) {
            addCriterion("recepcion like", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionNotLike(String value) {
            addCriterion("recepcion not like", value, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionIn(List<String> values) {
            addCriterion("recepcion in", values, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionNotIn(List<String> values) {
            addCriterion("recepcion not in", values, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionBetween(String value1, String value2) {
            addCriterion("recepcion between", value1, value2, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionNotBetween(String value1, String value2) {
            addCriterion("recepcion not between", value1, value2, "recepcion");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniIsNull() {
            addCriterion("recepcion_dni is null");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniIsNotNull() {
            addCriterion("recepcion_dni is not null");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniEqualTo(String value) {
            addCriterion("recepcion_dni =", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniNotEqualTo(String value) {
            addCriterion("recepcion_dni <>", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniGreaterThan(String value) {
            addCriterion("recepcion_dni >", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniGreaterThanOrEqualTo(String value) {
            addCriterion("recepcion_dni >=", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniLessThan(String value) {
            addCriterion("recepcion_dni <", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniLessThanOrEqualTo(String value) {
            addCriterion("recepcion_dni <=", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniLike(String value) {
            addCriterion("recepcion_dni like", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniNotLike(String value) {
            addCriterion("recepcion_dni not like", value, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniIn(List<String> values) {
            addCriterion("recepcion_dni in", values, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniNotIn(List<String> values) {
            addCriterion("recepcion_dni not in", values, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniBetween(String value1, String value2) {
            addCriterion("recepcion_dni between", value1, value2, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andRecepcionDniNotBetween(String value1, String value2) {
            addCriterion("recepcion_dni not between", value1, value2, "recepcionDni");
            return (Criteria) this;
        }

        public Criteria andParentescoIsNull() {
            addCriterion("parentesco is null");
            return (Criteria) this;
        }

        public Criteria andParentescoIsNotNull() {
            addCriterion("parentesco is not null");
            return (Criteria) this;
        }

        public Criteria andParentescoEqualTo(String value) {
            addCriterion("parentesco =", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoNotEqualTo(String value) {
            addCriterion("parentesco <>", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoGreaterThan(String value) {
            addCriterion("parentesco >", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoGreaterThanOrEqualTo(String value) {
            addCriterion("parentesco >=", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoLessThan(String value) {
            addCriterion("parentesco <", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoLessThanOrEqualTo(String value) {
            addCriterion("parentesco <=", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoLike(String value) {
            addCriterion("parentesco like", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoNotLike(String value) {
            addCriterion("parentesco not like", value, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoIn(List<String> values) {
            addCriterion("parentesco in", values, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoNotIn(List<String> values) {
            addCriterion("parentesco not in", values, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoBetween(String value1, String value2) {
            addCriterion("parentesco between", value1, value2, "parentesco");
            return (Criteria) this;
        }

        public Criteria andParentescoNotBetween(String value1, String value2) {
            addCriterion("parentesco not between", value1, value2, "parentesco");
            return (Criteria) this;
        }

        public Criteria andColorcasaIsNull() {
            addCriterion("colorcasa is null");
            return (Criteria) this;
        }

        public Criteria andColorcasaIsNotNull() {
            addCriterion("colorcasa is not null");
            return (Criteria) this;
        }

        public Criteria andColorcasaEqualTo(String value) {
            addCriterion("colorcasa =", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaNotEqualTo(String value) {
            addCriterion("colorcasa <>", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaGreaterThan(String value) {
            addCriterion("colorcasa >", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaGreaterThanOrEqualTo(String value) {
            addCriterion("colorcasa >=", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaLessThan(String value) {
            addCriterion("colorcasa <", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaLessThanOrEqualTo(String value) {
            addCriterion("colorcasa <=", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaLike(String value) {
            addCriterion("colorcasa like", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaNotLike(String value) {
            addCriterion("colorcasa not like", value, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaIn(List<String> values) {
            addCriterion("colorcasa in", values, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaNotIn(List<String> values) {
            addCriterion("colorcasa not in", values, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaBetween(String value1, String value2) {
            addCriterion("colorcasa between", value1, value2, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andColorcasaNotBetween(String value1, String value2) {
            addCriterion("colorcasa not between", value1, value2, "colorcasa");
            return (Criteria) this;
        }

        public Criteria andPuertaIsNull() {
            addCriterion("puerta is null");
            return (Criteria) this;
        }

        public Criteria andPuertaIsNotNull() {
            addCriterion("puerta is not null");
            return (Criteria) this;
        }

        public Criteria andPuertaEqualTo(String value) {
            addCriterion("puerta =", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaNotEqualTo(String value) {
            addCriterion("puerta <>", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaGreaterThan(String value) {
            addCriterion("puerta >", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaGreaterThanOrEqualTo(String value) {
            addCriterion("puerta >=", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaLessThan(String value) {
            addCriterion("puerta <", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaLessThanOrEqualTo(String value) {
            addCriterion("puerta <=", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaLike(String value) {
            addCriterion("puerta like", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaNotLike(String value) {
            addCriterion("puerta not like", value, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaIn(List<String> values) {
            addCriterion("puerta in", values, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaNotIn(List<String> values) {
            addCriterion("puerta not in", values, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaBetween(String value1, String value2) {
            addCriterion("puerta between", value1, value2, "puerta");
            return (Criteria) this;
        }

        public Criteria andPuertaNotBetween(String value1, String value2) {
            addCriterion("puerta not between", value1, value2, "puerta");
            return (Criteria) this;
        }

        public Criteria andNropisosIsNull() {
            addCriterion("nropisos is null");
            return (Criteria) this;
        }

        public Criteria andNropisosIsNotNull() {
            addCriterion("nropisos is not null");
            return (Criteria) this;
        }

        public Criteria andNropisosEqualTo(String value) {
            addCriterion("nropisos =", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosNotEqualTo(String value) {
            addCriterion("nropisos <>", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosGreaterThan(String value) {
            addCriterion("nropisos >", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosGreaterThanOrEqualTo(String value) {
            addCriterion("nropisos >=", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosLessThan(String value) {
            addCriterion("nropisos <", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosLessThanOrEqualTo(String value) {
            addCriterion("nropisos <=", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosLike(String value) {
            addCriterion("nropisos like", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosNotLike(String value) {
            addCriterion("nropisos not like", value, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosIn(List<String> values) {
            addCriterion("nropisos in", values, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosNotIn(List<String> values) {
            addCriterion("nropisos not in", values, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosBetween(String value1, String value2) {
            addCriterion("nropisos between", value1, value2, "nropisos");
            return (Criteria) this;
        }

        public Criteria andNropisosNotBetween(String value1, String value2) {
            addCriterion("nropisos not between", value1, value2, "nropisos");
            return (Criteria) this;
        }

        public Criteria andSuministroIsNull() {
            addCriterion("suministro is null");
            return (Criteria) this;
        }

        public Criteria andSuministroIsNotNull() {
            addCriterion("suministro is not null");
            return (Criteria) this;
        }

        public Criteria andSuministroEqualTo(String value) {
            addCriterion("suministro =", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroNotEqualTo(String value) {
            addCriterion("suministro <>", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroGreaterThan(String value) {
            addCriterion("suministro >", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroGreaterThanOrEqualTo(String value) {
            addCriterion("suministro >=", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroLessThan(String value) {
            addCriterion("suministro <", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroLessThanOrEqualTo(String value) {
            addCriterion("suministro <=", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroLike(String value) {
            addCriterion("suministro like", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroNotLike(String value) {
            addCriterion("suministro not like", value, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroIn(List<String> values) {
            addCriterion("suministro in", values, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroNotIn(List<String> values) {
            addCriterion("suministro not in", values, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroBetween(String value1, String value2) {
            addCriterion("suministro between", value1, value2, "suministro");
            return (Criteria) this;
        }

        public Criteria andSuministroNotBetween(String value1, String value2) {
            addCriterion("suministro not between", value1, value2, "suministro");
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

        public Criteria andVentanaIsNull() {
            addCriterion("ventana is null");
            return (Criteria) this;
        }

        public Criteria andVentanaIsNotNull() {
            addCriterion("ventana is not null");
            return (Criteria) this;
        }

        public Criteria andVentanaEqualTo(String value) {
            addCriterion("ventana =", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaNotEqualTo(String value) {
            addCriterion("ventana <>", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaGreaterThan(String value) {
            addCriterion("ventana >", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaGreaterThanOrEqualTo(String value) {
            addCriterion("ventana >=", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaLessThan(String value) {
            addCriterion("ventana <", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaLessThanOrEqualTo(String value) {
            addCriterion("ventana <=", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaLike(String value) {
            addCriterion("ventana like", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaNotLike(String value) {
            addCriterion("ventana not like", value, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaIn(List<String> values) {
            addCriterion("ventana in", values, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaNotIn(List<String> values) {
            addCriterion("ventana not in", values, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaBetween(String value1, String value2) {
            addCriterion("ventana between", value1, value2, "ventana");
            return (Criteria) this;
        }

        public Criteria andVentanaNotBetween(String value1, String value2) {
            addCriterion("ventana not between", value1, value2, "ventana");
            return (Criteria) this;
        }

        public Criteria andTipovivIsNull() {
            addCriterion("tipoviv is null");
            return (Criteria) this;
        }

        public Criteria andTipovivIsNotNull() {
            addCriterion("tipoviv is not null");
            return (Criteria) this;
        }

        public Criteria andTipovivEqualTo(String value) {
            addCriterion("tipoviv =", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivNotEqualTo(String value) {
            addCriterion("tipoviv <>", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivGreaterThan(String value) {
            addCriterion("tipoviv >", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivGreaterThanOrEqualTo(String value) {
            addCriterion("tipoviv >=", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivLessThan(String value) {
            addCriterion("tipoviv <", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivLessThanOrEqualTo(String value) {
            addCriterion("tipoviv <=", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivLike(String value) {
            addCriterion("tipoviv like", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivNotLike(String value) {
            addCriterion("tipoviv not like", value, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivIn(List<String> values) {
            addCriterion("tipoviv in", values, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivNotIn(List<String> values) {
            addCriterion("tipoviv not in", values, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivBetween(String value1, String value2) {
            addCriterion("tipoviv between", value1, value2, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andTipovivNotBetween(String value1, String value2) {
            addCriterion("tipoviv not between", value1, value2, "tipoviv");
            return (Criteria) this;
        }

        public Criteria andVecinoizqIsNull() {
            addCriterion("vecinoizq is null");
            return (Criteria) this;
        }

        public Criteria andVecinoizqIsNotNull() {
            addCriterion("vecinoizq is not null");
            return (Criteria) this;
        }

        public Criteria andVecinoizqEqualTo(String value) {
            addCriterion("vecinoizq =", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqNotEqualTo(String value) {
            addCriterion("vecinoizq <>", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqGreaterThan(String value) {
            addCriterion("vecinoizq >", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqGreaterThanOrEqualTo(String value) {
            addCriterion("vecinoizq >=", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqLessThan(String value) {
            addCriterion("vecinoizq <", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqLessThanOrEqualTo(String value) {
            addCriterion("vecinoizq <=", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqLike(String value) {
            addCriterion("vecinoizq like", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqNotLike(String value) {
            addCriterion("vecinoizq not like", value, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqIn(List<String> values) {
            addCriterion("vecinoizq in", values, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqNotIn(List<String> values) {
            addCriterion("vecinoizq not in", values, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqBetween(String value1, String value2) {
            addCriterion("vecinoizq between", value1, value2, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoizqNotBetween(String value1, String value2) {
            addCriterion("vecinoizq not between", value1, value2, "vecinoizq");
            return (Criteria) this;
        }

        public Criteria andVecinoderIsNull() {
            addCriterion("vecinoder is null");
            return (Criteria) this;
        }

        public Criteria andVecinoderIsNotNull() {
            addCriterion("vecinoder is not null");
            return (Criteria) this;
        }

        public Criteria andVecinoderEqualTo(String value) {
            addCriterion("vecinoder =", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderNotEqualTo(String value) {
            addCriterion("vecinoder <>", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderGreaterThan(String value) {
            addCriterion("vecinoder >", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderGreaterThanOrEqualTo(String value) {
            addCriterion("vecinoder >=", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderLessThan(String value) {
            addCriterion("vecinoder <", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderLessThanOrEqualTo(String value) {
            addCriterion("vecinoder <=", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderLike(String value) {
            addCriterion("vecinoder like", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderNotLike(String value) {
            addCriterion("vecinoder not like", value, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderIn(List<String> values) {
            addCriterion("vecinoder in", values, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderNotIn(List<String> values) {
            addCriterion("vecinoder not in", values, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderBetween(String value1, String value2) {
            addCriterion("vecinoder between", value1, value2, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andVecinoderNotBetween(String value1, String value2) {
            addCriterion("vecinoder not between", value1, value2, "vecinoder");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andEstadovivIsNull() {
            addCriterion("estadoviv is null");
            return (Criteria) this;
        }

        public Criteria andEstadovivIsNotNull() {
            addCriterion("estadoviv is not null");
            return (Criteria) this;
        }

        public Criteria andEstadovivEqualTo(String value) {
            addCriterion("estadoviv =", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivNotEqualTo(String value) {
            addCriterion("estadoviv <>", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivGreaterThan(String value) {
            addCriterion("estadoviv >", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivGreaterThanOrEqualTo(String value) {
            addCriterion("estadoviv >=", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivLessThan(String value) {
            addCriterion("estadoviv <", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivLessThanOrEqualTo(String value) {
            addCriterion("estadoviv <=", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivLike(String value) {
            addCriterion("estadoviv like", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivNotLike(String value) {
            addCriterion("estadoviv not like", value, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivIn(List<String> values) {
            addCriterion("estadoviv in", values, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivNotIn(List<String> values) {
            addCriterion("estadoviv not in", values, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivBetween(String value1, String value2) {
            addCriterion("estadoviv between", value1, value2, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andEstadovivNotBetween(String value1, String value2) {
            addCriterion("estadoviv not between", value1, value2, "estadoviv");
            return (Criteria) this;
        }

        public Criteria andRejacolorIsNull() {
            addCriterion("rejacolor is null");
            return (Criteria) this;
        }

        public Criteria andRejacolorIsNotNull() {
            addCriterion("rejacolor is not null");
            return (Criteria) this;
        }

        public Criteria andRejacolorEqualTo(String value) {
            addCriterion("rejacolor =", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorNotEqualTo(String value) {
            addCriterion("rejacolor <>", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorGreaterThan(String value) {
            addCriterion("rejacolor >", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorGreaterThanOrEqualTo(String value) {
            addCriterion("rejacolor >=", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorLessThan(String value) {
            addCriterion("rejacolor <", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorLessThanOrEqualTo(String value) {
            addCriterion("rejacolor <=", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorLike(String value) {
            addCriterion("rejacolor like", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorNotLike(String value) {
            addCriterion("rejacolor not like", value, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorIn(List<String> values) {
            addCriterion("rejacolor in", values, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorNotIn(List<String> values) {
            addCriterion("rejacolor not in", values, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorBetween(String value1, String value2) {
            addCriterion("rejacolor between", value1, value2, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andRejacolorNotBetween(String value1, String value2) {
            addCriterion("rejacolor not between", value1, value2, "rejacolor");
            return (Criteria) this;
        }

        public Criteria andLocaldIsNull() {
            addCriterion("locald is null");
            return (Criteria) this;
        }

        public Criteria andLocaldIsNotNull() {
            addCriterion("locald is not null");
            return (Criteria) this;
        }

        public Criteria andLocaldEqualTo(String value) {
            addCriterion("locald =", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldNotEqualTo(String value) {
            addCriterion("locald <>", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldGreaterThan(String value) {
            addCriterion("locald >", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldGreaterThanOrEqualTo(String value) {
            addCriterion("locald >=", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldLessThan(String value) {
            addCriterion("locald <", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldLessThanOrEqualTo(String value) {
            addCriterion("locald <=", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldLike(String value) {
            addCriterion("locald like", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldNotLike(String value) {
            addCriterion("locald not like", value, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldIn(List<String> values) {
            addCriterion("locald in", values, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldNotIn(List<String> values) {
            addCriterion("locald not in", values, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldBetween(String value1, String value2) {
            addCriterion("locald between", value1, value2, "locald");
            return (Criteria) this;
        }

        public Criteria andLocaldNotBetween(String value1, String value2) {
            addCriterion("locald not between", value1, value2, "locald");
            return (Criteria) this;
        }

        public Criteria andImagenIsNull() {
            addCriterion("imagen is null");
            return (Criteria) this;
        }

        public Criteria andImagenIsNotNull() {
            addCriterion("imagen is not null");
            return (Criteria) this;
        }

        public Criteria andImagenEqualTo(String value) {
            addCriterion("imagen =", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotEqualTo(String value) {
            addCriterion("imagen <>", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenGreaterThan(String value) {
            addCriterion("imagen >", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenGreaterThanOrEqualTo(String value) {
            addCriterion("imagen >=", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenLessThan(String value) {
            addCriterion("imagen <", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenLessThanOrEqualTo(String value) {
            addCriterion("imagen <=", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenLike(String value) {
            addCriterion("imagen like", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotLike(String value) {
            addCriterion("imagen not like", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenIn(List<String> values) {
            addCriterion("imagen in", values, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotIn(List<String> values) {
            addCriterion("imagen not in", values, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenBetween(String value1, String value2) {
            addCriterion("imagen between", value1, value2, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotBetween(String value1, String value2) {
            addCriterion("imagen not between", value1, value2, "imagen");
            return (Criteria) this;
        }

        public Criteria andUserScaneoIsNull() {
            addCriterion("user_scaneo is null");
            return (Criteria) this;
        }

        public Criteria andUserScaneoIsNotNull() {
            addCriterion("user_scaneo is not null");
            return (Criteria) this;
        }

        public Criteria andUserScaneoEqualTo(String value) {
            addCriterion("user_scaneo =", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoNotEqualTo(String value) {
            addCriterion("user_scaneo <>", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoGreaterThan(String value) {
            addCriterion("user_scaneo >", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoGreaterThanOrEqualTo(String value) {
            addCriterion("user_scaneo >=", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoLessThan(String value) {
            addCriterion("user_scaneo <", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoLessThanOrEqualTo(String value) {
            addCriterion("user_scaneo <=", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoLike(String value) {
            addCriterion("user_scaneo like", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoNotLike(String value) {
            addCriterion("user_scaneo not like", value, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoIn(List<String> values) {
            addCriterion("user_scaneo in", values, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoNotIn(List<String> values) {
            addCriterion("user_scaneo not in", values, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoBetween(String value1, String value2) {
            addCriterion("user_scaneo between", value1, value2, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andUserScaneoNotBetween(String value1, String value2) {
            addCriterion("user_scaneo not between", value1, value2, "userScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoIsNull() {
            addCriterion("fec_scaneo is null");
            return (Criteria) this;
        }

        public Criteria andFecScaneoIsNotNull() {
            addCriterion("fec_scaneo is not null");
            return (Criteria) this;
        }

        public Criteria andFecScaneoEqualTo(Date value) {
            addCriterion("fec_scaneo =", value, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoNotEqualTo(Date value) {
            addCriterion("fec_scaneo <>", value, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoGreaterThan(Date value) {
            addCriterion("fec_scaneo >", value, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_scaneo >=", value, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoLessThan(Date value) {
            addCriterion("fec_scaneo <", value, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoLessThanOrEqualTo(Date value) {
            addCriterion("fec_scaneo <=", value, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoIn(List<Date> values) {
            addCriterion("fec_scaneo in", values, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoNotIn(List<Date> values) {
            addCriterion("fec_scaneo not in", values, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoBetween(Date value1, Date value2) {
            addCriterion("fec_scaneo between", value1, value2, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andFecScaneoNotBetween(Date value1, Date value2) {
            addCriterion("fec_scaneo not between", value1, value2, "fecScaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoIsNull() {
            addCriterion("sesionscaneo is null");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoIsNotNull() {
            addCriterion("sesionscaneo is not null");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoEqualTo(Integer value) {
            addCriterion("sesionscaneo =", value, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoNotEqualTo(Integer value) {
            addCriterion("sesionscaneo <>", value, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoGreaterThan(Integer value) {
            addCriterion("sesionscaneo >", value, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sesionscaneo >=", value, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoLessThan(Integer value) {
            addCriterion("sesionscaneo <", value, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoLessThanOrEqualTo(Integer value) {
            addCriterion("sesionscaneo <=", value, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoIn(List<Integer> values) {
            addCriterion("sesionscaneo in", values, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoNotIn(List<Integer> values) {
            addCriterion("sesionscaneo not in", values, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoBetween(Integer value1, Integer value2) {
            addCriterion("sesionscaneo between", value1, value2, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andSesionscaneoNotBetween(Integer value1, Integer value2) {
            addCriterion("sesionscaneo not between", value1, value2, "sesionscaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoIsNull() {
            addCriterion("tiposcaneo is null");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoIsNotNull() {
            addCriterion("tiposcaneo is not null");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoEqualTo(Short value) {
            addCriterion("tiposcaneo =", value, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoNotEqualTo(Short value) {
            addCriterion("tiposcaneo <>", value, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoGreaterThan(Short value) {
            addCriterion("tiposcaneo >", value, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoGreaterThanOrEqualTo(Short value) {
            addCriterion("tiposcaneo >=", value, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoLessThan(Short value) {
            addCriterion("tiposcaneo <", value, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoLessThanOrEqualTo(Short value) {
            addCriterion("tiposcaneo <=", value, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoIn(List<Short> values) {
            addCriterion("tiposcaneo in", values, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoNotIn(List<Short> values) {
            addCriterion("tiposcaneo not in", values, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoBetween(Short value1, Short value2) {
            addCriterion("tiposcaneo between", value1, value2, "tiposcaneo");
            return (Criteria) this;
        }

        public Criteria andTiposcaneoNotBetween(Short value1, Short value2) {
            addCriterion("tiposcaneo not between", value1, value2, "tiposcaneo");
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

        public Criteria andOficinaIsNull() {
            addCriterion("oficina is null");
            return (Criteria) this;
        }

        public Criteria andOficinaIsNotNull() {
            addCriterion("oficina is not null");
            return (Criteria) this;
        }

        public Criteria andOficinaEqualTo(String value) {
            addCriterion("oficina =", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaNotEqualTo(String value) {
            addCriterion("oficina <>", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaGreaterThan(String value) {
            addCriterion("oficina >", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaGreaterThanOrEqualTo(String value) {
            addCriterion("oficina >=", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaLessThan(String value) {
            addCriterion("oficina <", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaLessThanOrEqualTo(String value) {
            addCriterion("oficina <=", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaLike(String value) {
            addCriterion("oficina like", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaNotLike(String value) {
            addCriterion("oficina not like", value, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaIn(List<String> values) {
            addCriterion("oficina in", values, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaNotIn(List<String> values) {
            addCriterion("oficina not in", values, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaBetween(String value1, String value2) {
            addCriterion("oficina between", value1, value2, "oficina");
            return (Criteria) this;
        }

        public Criteria andOficinaNotBetween(String value1, String value2) {
            addCriterion("oficina not between", value1, value2, "oficina");
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

        public Criteria andCoordinadoIsNull() {
            addCriterion("coordinado is null");
            return (Criteria) this;
        }

        public Criteria andCoordinadoIsNotNull() {
            addCriterion("coordinado is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinadoEqualTo(String value) {
            addCriterion("coordinado =", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoNotEqualTo(String value) {
            addCriterion("coordinado <>", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoGreaterThan(String value) {
            addCriterion("coordinado >", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoGreaterThanOrEqualTo(String value) {
            addCriterion("coordinado >=", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoLessThan(String value) {
            addCriterion("coordinado <", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoLessThanOrEqualTo(String value) {
            addCriterion("coordinado <=", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoLike(String value) {
            addCriterion("coordinado like", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoNotLike(String value) {
            addCriterion("coordinado not like", value, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoIn(List<String> values) {
            addCriterion("coordinado in", values, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoNotIn(List<String> values) {
            addCriterion("coordinado not in", values, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoBetween(String value1, String value2) {
            addCriterion("coordinado between", value1, value2, "coordinado");
            return (Criteria) this;
        }

        public Criteria andCoordinadoNotBetween(String value1, String value2) {
            addCriterion("coordinado not between", value1, value2, "coordinado");
            return (Criteria) this;
        }

        public Criteria andFechaCoorIsNull() {
            addCriterion("fecha_coor is null");
            return (Criteria) this;
        }

        public Criteria andFechaCoorIsNotNull() {
            addCriterion("fecha_coor is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCoorEqualTo(Date value) {
            addCriterion("fecha_coor =", value, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorNotEqualTo(Date value) {
            addCriterion("fecha_coor <>", value, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorGreaterThan(Date value) {
            addCriterion("fecha_coor >", value, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_coor >=", value, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorLessThan(Date value) {
            addCriterion("fecha_coor <", value, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorLessThanOrEqualTo(Date value) {
            addCriterion("fecha_coor <=", value, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorIn(List<Date> values) {
            addCriterion("fecha_coor in", values, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorNotIn(List<Date> values) {
            addCriterion("fecha_coor not in", values, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorBetween(Date value1, Date value2) {
            addCriterion("fecha_coor between", value1, value2, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoorNotBetween(Date value1, Date value2) {
            addCriterion("fecha_coor not between", value1, value2, "fechaCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorIsNull() {
            addCriterion("user_coor is null");
            return (Criteria) this;
        }

        public Criteria andUserCoorIsNotNull() {
            addCriterion("user_coor is not null");
            return (Criteria) this;
        }

        public Criteria andUserCoorEqualTo(String value) {
            addCriterion("user_coor =", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorNotEqualTo(String value) {
            addCriterion("user_coor <>", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorGreaterThan(String value) {
            addCriterion("user_coor >", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorGreaterThanOrEqualTo(String value) {
            addCriterion("user_coor >=", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorLessThan(String value) {
            addCriterion("user_coor <", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorLessThanOrEqualTo(String value) {
            addCriterion("user_coor <=", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorLike(String value) {
            addCriterion("user_coor like", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorNotLike(String value) {
            addCriterion("user_coor not like", value, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorIn(List<String> values) {
            addCriterion("user_coor in", values, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorNotIn(List<String> values) {
            addCriterion("user_coor not in", values, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorBetween(String value1, String value2) {
            addCriterion("user_coor between", value1, value2, "userCoor");
            return (Criteria) this;
        }

        public Criteria andUserCoorNotBetween(String value1, String value2) {
            addCriterion("user_coor not between", value1, value2, "userCoor");
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

        public Criteria andNropiezasIsNull() {
            addCriterion("nropiezas is null");
            return (Criteria) this;
        }

        public Criteria andNropiezasIsNotNull() {
            addCriterion("nropiezas is not null");
            return (Criteria) this;
        }

        public Criteria andNropiezasEqualTo(Integer value) {
            addCriterion("nropiezas =", value, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasNotEqualTo(Integer value) {
            addCriterion("nropiezas <>", value, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasGreaterThan(Integer value) {
            addCriterion("nropiezas >", value, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasGreaterThanOrEqualTo(Integer value) {
            addCriterion("nropiezas >=", value, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasLessThan(Integer value) {
            addCriterion("nropiezas <", value, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasLessThanOrEqualTo(Integer value) {
            addCriterion("nropiezas <=", value, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasIn(List<Integer> values) {
            addCriterion("nropiezas in", values, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasNotIn(List<Integer> values) {
            addCriterion("nropiezas not in", values, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasBetween(Integer value1, Integer value2) {
            addCriterion("nropiezas between", value1, value2, "nropiezas");
            return (Criteria) this;
        }

        public Criteria andNropiezasNotBetween(Integer value1, Integer value2) {
            addCriterion("nropiezas not between", value1, value2, "nropiezas");
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

        public Criteria andPesorealIsNull() {
            addCriterion("pesoreal is null");
            return (Criteria) this;
        }

        public Criteria andPesorealIsNotNull() {
            addCriterion("pesoreal is not null");
            return (Criteria) this;
        }

        public Criteria andPesorealEqualTo(BigDecimal value) {
            addCriterion("pesoreal =", value, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealNotEqualTo(BigDecimal value) {
            addCriterion("pesoreal <>", value, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealGreaterThan(BigDecimal value) {
            addCriterion("pesoreal >", value, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pesoreal >=", value, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealLessThan(BigDecimal value) {
            addCriterion("pesoreal <", value, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pesoreal <=", value, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealIn(List<BigDecimal> values) {
            addCriterion("pesoreal in", values, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealNotIn(List<BigDecimal> values) {
            addCriterion("pesoreal not in", values, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pesoreal between", value1, value2, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andPesorealNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pesoreal not between", value1, value2, "pesoreal");
            return (Criteria) this;
        }

        public Criteria andCargoagenteIsNull() {
            addCriterion("cargoagente is null");
            return (Criteria) this;
        }

        public Criteria andCargoagenteIsNotNull() {
            addCriterion("cargoagente is not null");
            return (Criteria) this;
        }

        public Criteria andCargoagenteEqualTo(String value) {
            addCriterion("cargoagente =", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteNotEqualTo(String value) {
            addCriterion("cargoagente <>", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteGreaterThan(String value) {
            addCriterion("cargoagente >", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteGreaterThanOrEqualTo(String value) {
            addCriterion("cargoagente >=", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteLessThan(String value) {
            addCriterion("cargoagente <", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteLessThanOrEqualTo(String value) {
            addCriterion("cargoagente <=", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteLike(String value) {
            addCriterion("cargoagente like", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteNotLike(String value) {
            addCriterion("cargoagente not like", value, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteIn(List<String> values) {
            addCriterion("cargoagente in", values, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteNotIn(List<String> values) {
            addCriterion("cargoagente not in", values, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteBetween(String value1, String value2) {
            addCriterion("cargoagente between", value1, value2, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andCargoagenteNotBetween(String value1, String value2) {
            addCriterion("cargoagente not between", value1, value2, "cargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteIsNull() {
            addCriterion("nrocargoagente is null");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteIsNotNull() {
            addCriterion("nrocargoagente is not null");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteEqualTo(Integer value) {
            addCriterion("nrocargoagente =", value, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteNotEqualTo(Integer value) {
            addCriterion("nrocargoagente <>", value, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteGreaterThan(Integer value) {
            addCriterion("nrocargoagente >", value, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteGreaterThanOrEqualTo(Integer value) {
            addCriterion("nrocargoagente >=", value, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteLessThan(Integer value) {
            addCriterion("nrocargoagente <", value, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteLessThanOrEqualTo(Integer value) {
            addCriterion("nrocargoagente <=", value, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteIn(List<Integer> values) {
            addCriterion("nrocargoagente in", values, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteNotIn(List<Integer> values) {
            addCriterion("nrocargoagente not in", values, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteBetween(Integer value1, Integer value2) {
            addCriterion("nrocargoagente between", value1, value2, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andNrocargoagenteNotBetween(Integer value1, Integer value2) {
            addCriterion("nrocargoagente not between", value1, value2, "nrocargoagente");
            return (Criteria) this;
        }

        public Criteria andCodenvioIsNull() {
            addCriterion("codenvio is null");
            return (Criteria) this;
        }

        public Criteria andCodenvioIsNotNull() {
            addCriterion("codenvio is not null");
            return (Criteria) this;
        }

        public Criteria andCodenvioEqualTo(String value) {
            addCriterion("codenvio =", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioNotEqualTo(String value) {
            addCriterion("codenvio <>", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioGreaterThan(String value) {
            addCriterion("codenvio >", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioGreaterThanOrEqualTo(String value) {
            addCriterion("codenvio >=", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioLessThan(String value) {
            addCriterion("codenvio <", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioLessThanOrEqualTo(String value) {
            addCriterion("codenvio <=", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioLike(String value) {
            addCriterion("codenvio like", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioNotLike(String value) {
            addCriterion("codenvio not like", value, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioIn(List<String> values) {
            addCriterion("codenvio in", values, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioNotIn(List<String> values) {
            addCriterion("codenvio not in", values, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioBetween(String value1, String value2) {
            addCriterion("codenvio between", value1, value2, "codenvio");
            return (Criteria) this;
        }

        public Criteria andCodenvioNotBetween(String value1, String value2) {
            addCriterion("codenvio not between", value1, value2, "codenvio");
            return (Criteria) this;
        }

        public Criteria andAnchoIsNull() {
            addCriterion("ancho is null");
            return (Criteria) this;
        }

        public Criteria andAnchoIsNotNull() {
            addCriterion("ancho is not null");
            return (Criteria) this;
        }

        public Criteria andAnchoEqualTo(BigDecimal value) {
            addCriterion("ancho =", value, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoNotEqualTo(BigDecimal value) {
            addCriterion("ancho <>", value, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoGreaterThan(BigDecimal value) {
            addCriterion("ancho >", value, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ancho >=", value, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoLessThan(BigDecimal value) {
            addCriterion("ancho <", value, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ancho <=", value, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoIn(List<BigDecimal> values) {
            addCriterion("ancho in", values, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoNotIn(List<BigDecimal> values) {
            addCriterion("ancho not in", values, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ancho between", value1, value2, "ancho");
            return (Criteria) this;
        }

        public Criteria andAnchoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ancho not between", value1, value2, "ancho");
            return (Criteria) this;
        }

        public Criteria andLargoIsNull() {
            addCriterion("largo is null");
            return (Criteria) this;
        }

        public Criteria andLargoIsNotNull() {
            addCriterion("largo is not null");
            return (Criteria) this;
        }

        public Criteria andLargoEqualTo(BigDecimal value) {
            addCriterion("largo =", value, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoNotEqualTo(BigDecimal value) {
            addCriterion("largo <>", value, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoGreaterThan(BigDecimal value) {
            addCriterion("largo >", value, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("largo >=", value, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoLessThan(BigDecimal value) {
            addCriterion("largo <", value, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("largo <=", value, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoIn(List<BigDecimal> values) {
            addCriterion("largo in", values, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoNotIn(List<BigDecimal> values) {
            addCriterion("largo not in", values, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("largo between", value1, value2, "largo");
            return (Criteria) this;
        }

        public Criteria andLargoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("largo not between", value1, value2, "largo");
            return (Criteria) this;
        }

        public Criteria andAltoIsNull() {
            addCriterion("alto is null");
            return (Criteria) this;
        }

        public Criteria andAltoIsNotNull() {
            addCriterion("alto is not null");
            return (Criteria) this;
        }

        public Criteria andAltoEqualTo(BigDecimal value) {
            addCriterion("alto =", value, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoNotEqualTo(BigDecimal value) {
            addCriterion("alto <>", value, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoGreaterThan(BigDecimal value) {
            addCriterion("alto >", value, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("alto >=", value, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoLessThan(BigDecimal value) {
            addCriterion("alto <", value, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("alto <=", value, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoIn(List<BigDecimal> values) {
            addCriterion("alto in", values, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoNotIn(List<BigDecimal> values) {
            addCriterion("alto not in", values, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("alto between", value1, value2, "alto");
            return (Criteria) this;
        }

        public Criteria andAltoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("alto not between", value1, value2, "alto");
            return (Criteria) this;
        }

        public Criteria andVbaseIsNull() {
            addCriterion("vbase is null");
            return (Criteria) this;
        }

        public Criteria andVbaseIsNotNull() {
            addCriterion("vbase is not null");
            return (Criteria) this;
        }

        public Criteria andVbaseEqualTo(BigDecimal value) {
            addCriterion("vbase =", value, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseNotEqualTo(BigDecimal value) {
            addCriterion("vbase <>", value, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseGreaterThan(BigDecimal value) {
            addCriterion("vbase >", value, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vbase >=", value, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseLessThan(BigDecimal value) {
            addCriterion("vbase <", value, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vbase <=", value, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseIn(List<BigDecimal> values) {
            addCriterion("vbase in", values, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseNotIn(List<BigDecimal> values) {
            addCriterion("vbase not in", values, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vbase between", value1, value2, "vbase");
            return (Criteria) this;
        }

        public Criteria andVbaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vbase not between", value1, value2, "vbase");
            return (Criteria) this;
        }

        public Criteria andVexcesoIsNull() {
            addCriterion("vexceso is null");
            return (Criteria) this;
        }

        public Criteria andVexcesoIsNotNull() {
            addCriterion("vexceso is not null");
            return (Criteria) this;
        }

        public Criteria andVexcesoEqualTo(BigDecimal value) {
            addCriterion("vexceso =", value, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoNotEqualTo(BigDecimal value) {
            addCriterion("vexceso <>", value, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoGreaterThan(BigDecimal value) {
            addCriterion("vexceso >", value, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vexceso >=", value, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoLessThan(BigDecimal value) {
            addCriterion("vexceso <", value, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vexceso <=", value, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoIn(List<BigDecimal> values) {
            addCriterion("vexceso in", values, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoNotIn(List<BigDecimal> values) {
            addCriterion("vexceso not in", values, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vexceso between", value1, value2, "vexceso");
            return (Criteria) this;
        }

        public Criteria andVexcesoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vexceso not between", value1, value2, "vexceso");
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

        public Criteria andDniIsNull() {
            addCriterion("dni is null");
            return (Criteria) this;
        }

        public Criteria andDniIsNotNull() {
            addCriterion("dni is not null");
            return (Criteria) this;
        }

        public Criteria andDniEqualTo(String value) {
            addCriterion("dni =", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotEqualTo(String value) {
            addCriterion("dni <>", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniGreaterThan(String value) {
            addCriterion("dni >", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniGreaterThanOrEqualTo(String value) {
            addCriterion("dni >=", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLessThan(String value) {
            addCriterion("dni <", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLessThanOrEqualTo(String value) {
            addCriterion("dni <=", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniLike(String value) {
            addCriterion("dni like", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotLike(String value) {
            addCriterion("dni not like", value, "dni");
            return (Criteria) this;
        }

        public Criteria andDniIn(List<String> values) {
            addCriterion("dni in", values, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotIn(List<String> values) {
            addCriterion("dni not in", values, "dni");
            return (Criteria) this;
        }

        public Criteria andDniBetween(String value1, String value2) {
            addCriterion("dni between", value1, value2, "dni");
            return (Criteria) this;
        }

        public Criteria andDniNotBetween(String value1, String value2) {
            addCriterion("dni not between", value1, value2, "dni");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoIsNull() {
            addCriterion("flagdescargo is null");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoIsNotNull() {
            addCriterion("flagdescargo is not null");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoEqualTo(Short value) {
            addCriterion("flagdescargo =", value, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoNotEqualTo(Short value) {
            addCriterion("flagdescargo <>", value, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoGreaterThan(Short value) {
            addCriterion("flagdescargo >", value, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoGreaterThanOrEqualTo(Short value) {
            addCriterion("flagdescargo >=", value, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoLessThan(Short value) {
            addCriterion("flagdescargo <", value, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoLessThanOrEqualTo(Short value) {
            addCriterion("flagdescargo <=", value, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoIn(List<Short> values) {
            addCriterion("flagdescargo in", values, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoNotIn(List<Short> values) {
            addCriterion("flagdescargo not in", values, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoBetween(Short value1, Short value2) {
            addCriterion("flagdescargo between", value1, value2, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andFlagdescargoNotBetween(Short value1, Short value2) {
            addCriterion("flagdescargo not between", value1, value2, "flagdescargo");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoIsNull() {
            addCriterion("nuevodistrito is null");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoIsNotNull() {
            addCriterion("nuevodistrito is not null");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoEqualTo(String value) {
            addCriterion("nuevodistrito =", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoNotEqualTo(String value) {
            addCriterion("nuevodistrito <>", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoGreaterThan(String value) {
            addCriterion("nuevodistrito >", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoGreaterThanOrEqualTo(String value) {
            addCriterion("nuevodistrito >=", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoLessThan(String value) {
            addCriterion("nuevodistrito <", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoLessThanOrEqualTo(String value) {
            addCriterion("nuevodistrito <=", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoLike(String value) {
            addCriterion("nuevodistrito like", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoNotLike(String value) {
            addCriterion("nuevodistrito not like", value, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoIn(List<String> values) {
            addCriterion("nuevodistrito in", values, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoNotIn(List<String> values) {
            addCriterion("nuevodistrito not in", values, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoBetween(String value1, String value2) {
            addCriterion("nuevodistrito between", value1, value2, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andNuevodistritoNotBetween(String value1, String value2) {
            addCriterion("nuevodistrito not between", value1, value2, "nuevodistrito");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionIsNull() {
            addCriterion("serieliquidacion is null");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionIsNotNull() {
            addCriterion("serieliquidacion is not null");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionEqualTo(String value) {
            addCriterion("serieliquidacion =", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionNotEqualTo(String value) {
            addCriterion("serieliquidacion <>", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionGreaterThan(String value) {
            addCriterion("serieliquidacion >", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionGreaterThanOrEqualTo(String value) {
            addCriterion("serieliquidacion >=", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionLessThan(String value) {
            addCriterion("serieliquidacion <", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionLessThanOrEqualTo(String value) {
            addCriterion("serieliquidacion <=", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionLike(String value) {
            addCriterion("serieliquidacion like", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionNotLike(String value) {
            addCriterion("serieliquidacion not like", value, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionIn(List<String> values) {
            addCriterion("serieliquidacion in", values, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionNotIn(List<String> values) {
            addCriterion("serieliquidacion not in", values, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionBetween(String value1, String value2) {
            addCriterion("serieliquidacion between", value1, value2, "serieliquidacion");
            return (Criteria) this;
        }

        public Criteria andSerieliquidacionNotBetween(String value1, String value2) {
            addCriterion("serieliquidacion not between", value1, value2, "serieliquidacion");
            return (Criteria) this;
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

        public Criteria andUserCuadreIsNull() {
            addCriterion("user_cuadre is null");
            return (Criteria) this;
        }

        public Criteria andUserCuadreIsNotNull() {
            addCriterion("user_cuadre is not null");
            return (Criteria) this;
        }

        public Criteria andUserCuadreEqualTo(String value) {
            addCriterion("user_cuadre =", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreNotEqualTo(String value) {
            addCriterion("user_cuadre <>", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreGreaterThan(String value) {
            addCriterion("user_cuadre >", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreGreaterThanOrEqualTo(String value) {
            addCriterion("user_cuadre >=", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreLessThan(String value) {
            addCriterion("user_cuadre <", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreLessThanOrEqualTo(String value) {
            addCriterion("user_cuadre <=", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreLike(String value) {
            addCriterion("user_cuadre like", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreNotLike(String value) {
            addCriterion("user_cuadre not like", value, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreIn(List<String> values) {
            addCriterion("user_cuadre in", values, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreNotIn(List<String> values) {
            addCriterion("user_cuadre not in", values, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreBetween(String value1, String value2) {
            addCriterion("user_cuadre between", value1, value2, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andUserCuadreNotBetween(String value1, String value2) {
            addCriterion("user_cuadre not between", value1, value2, "userCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreIsNull() {
            addCriterion("fecha_cuadre is null");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreIsNotNull() {
            addCriterion("fecha_cuadre is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreEqualTo(Date value) {
            addCriterion("fecha_cuadre =", value, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreNotEqualTo(Date value) {
            addCriterion("fecha_cuadre <>", value, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreGreaterThan(Date value) {
            addCriterion("fecha_cuadre >", value, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_cuadre >=", value, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreLessThan(Date value) {
            addCriterion("fecha_cuadre <", value, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreLessThanOrEqualTo(Date value) {
            addCriterion("fecha_cuadre <=", value, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreIn(List<Date> values) {
            addCriterion("fecha_cuadre in", values, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreNotIn(List<Date> values) {
            addCriterion("fecha_cuadre not in", values, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreBetween(Date value1, Date value2) {
            addCriterion("fecha_cuadre between", value1, value2, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andFechaCuadreNotBetween(Date value1, Date value2) {
            addCriterion("fecha_cuadre not between", value1, value2, "fechaCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreIsNull() {
            addCriterion("est_cuadre is null");
            return (Criteria) this;
        }

        public Criteria andEstCuadreIsNotNull() {
            addCriterion("est_cuadre is not null");
            return (Criteria) this;
        }

        public Criteria andEstCuadreEqualTo(String value) {
            addCriterion("est_cuadre =", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreNotEqualTo(String value) {
            addCriterion("est_cuadre <>", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreGreaterThan(String value) {
            addCriterion("est_cuadre >", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreGreaterThanOrEqualTo(String value) {
            addCriterion("est_cuadre >=", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreLessThan(String value) {
            addCriterion("est_cuadre <", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreLessThanOrEqualTo(String value) {
            addCriterion("est_cuadre <=", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreLike(String value) {
            addCriterion("est_cuadre like", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreNotLike(String value) {
            addCriterion("est_cuadre not like", value, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreIn(List<String> values) {
            addCriterion("est_cuadre in", values, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreNotIn(List<String> values) {
            addCriterion("est_cuadre not in", values, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreBetween(String value1, String value2) {
            addCriterion("est_cuadre between", value1, value2, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andEstCuadreNotBetween(String value1, String value2) {
            addCriterion("est_cuadre not between", value1, value2, "estCuadre");
            return (Criteria) this;
        }

        public Criteria andFlagCoorIsNull() {
            addCriterion("flag_coor is null");
            return (Criteria) this;
        }

        public Criteria andFlagCoorIsNotNull() {
            addCriterion("flag_coor is not null");
            return (Criteria) this;
        }

        public Criteria andFlagCoorEqualTo(String value) {
            addCriterion("flag_coor =", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorNotEqualTo(String value) {
            addCriterion("flag_coor <>", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorGreaterThan(String value) {
            addCriterion("flag_coor >", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorGreaterThanOrEqualTo(String value) {
            addCriterion("flag_coor >=", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorLessThan(String value) {
            addCriterion("flag_coor <", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorLessThanOrEqualTo(String value) {
            addCriterion("flag_coor <=", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorLike(String value) {
            addCriterion("flag_coor like", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorNotLike(String value) {
            addCriterion("flag_coor not like", value, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorIn(List<String> values) {
            addCriterion("flag_coor in", values, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorNotIn(List<String> values) {
            addCriterion("flag_coor not in", values, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorBetween(String value1, String value2) {
            addCriterion("flag_coor between", value1, value2, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andFlagCoorNotBetween(String value1, String value2) {
            addCriterion("flag_coor not between", value1, value2, "flagCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorIsNull() {
            addCriterion("useruario_coor is null");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorIsNotNull() {
            addCriterion("useruario_coor is not null");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorEqualTo(String value) {
            addCriterion("useruario_coor =", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorNotEqualTo(String value) {
            addCriterion("useruario_coor <>", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorGreaterThan(String value) {
            addCriterion("useruario_coor >", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorGreaterThanOrEqualTo(String value) {
            addCriterion("useruario_coor >=", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorLessThan(String value) {
            addCriterion("useruario_coor <", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorLessThanOrEqualTo(String value) {
            addCriterion("useruario_coor <=", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorLike(String value) {
            addCriterion("useruario_coor like", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorNotLike(String value) {
            addCriterion("useruario_coor not like", value, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorIn(List<String> values) {
            addCriterion("useruario_coor in", values, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorNotIn(List<String> values) {
            addCriterion("useruario_coor not in", values, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorBetween(String value1, String value2) {
            addCriterion("useruario_coor between", value1, value2, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andUseruarioCoorNotBetween(String value1, String value2) {
            addCriterion("useruario_coor not between", value1, value2, "useruarioCoor");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionIsNull() {
            addCriterion("fecha_coordinacion is null");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionIsNotNull() {
            addCriterion("fecha_coordinacion is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionEqualTo(Date value) {
            addCriterion("fecha_coordinacion =", value, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionNotEqualTo(Date value) {
            addCriterion("fecha_coordinacion <>", value, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionGreaterThan(Date value) {
            addCriterion("fecha_coordinacion >", value, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_coordinacion >=", value, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionLessThan(Date value) {
            addCriterion("fecha_coordinacion <", value, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionLessThanOrEqualTo(Date value) {
            addCriterion("fecha_coordinacion <=", value, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionIn(List<Date> values) {
            addCriterion("fecha_coordinacion in", values, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionNotIn(List<Date> values) {
            addCriterion("fecha_coordinacion not in", values, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionBetween(Date value1, Date value2) {
            addCriterion("fecha_coordinacion between", value1, value2, "fechaCoordinacion");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinacionNotBetween(Date value1, Date value2) {
            addCriterion("fecha_coordinacion not between", value1, value2, "fechaCoordinacion");
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

        public Criteria andImagenFtpIsNull() {
            addCriterion("imagen_ftp is null");
            return (Criteria) this;
        }

        public Criteria andImagenFtpIsNotNull() {
            addCriterion("imagen_ftp is not null");
            return (Criteria) this;
        }

        public Criteria andImagenFtpEqualTo(String value) {
            addCriterion("imagen_ftp =", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpNotEqualTo(String value) {
            addCriterion("imagen_ftp <>", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpGreaterThan(String value) {
            addCriterion("imagen_ftp >", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpGreaterThanOrEqualTo(String value) {
            addCriterion("imagen_ftp >=", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpLessThan(String value) {
            addCriterion("imagen_ftp <", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpLessThanOrEqualTo(String value) {
            addCriterion("imagen_ftp <=", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpLike(String value) {
            addCriterion("imagen_ftp like", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpNotLike(String value) {
            addCriterion("imagen_ftp not like", value, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpIn(List<String> values) {
            addCriterion("imagen_ftp in", values, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpNotIn(List<String> values) {
            addCriterion("imagen_ftp not in", values, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpBetween(String value1, String value2) {
            addCriterion("imagen_ftp between", value1, value2, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andImagenFtpNotBetween(String value1, String value2) {
            addCriterion("imagen_ftp not between", value1, value2, "imagenFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpIsNull() {
            addCriterion("usuario_ftp is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpIsNotNull() {
            addCriterion("usuario_ftp is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpEqualTo(String value) {
            addCriterion("usuario_ftp =", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpNotEqualTo(String value) {
            addCriterion("usuario_ftp <>", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpGreaterThan(String value) {
            addCriterion("usuario_ftp >", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpGreaterThanOrEqualTo(String value) {
            addCriterion("usuario_ftp >=", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpLessThan(String value) {
            addCriterion("usuario_ftp <", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpLessThanOrEqualTo(String value) {
            addCriterion("usuario_ftp <=", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpLike(String value) {
            addCriterion("usuario_ftp like", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpNotLike(String value) {
            addCriterion("usuario_ftp not like", value, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpIn(List<String> values) {
            addCriterion("usuario_ftp in", values, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpNotIn(List<String> values) {
            addCriterion("usuario_ftp not in", values, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpBetween(String value1, String value2) {
            addCriterion("usuario_ftp between", value1, value2, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioFtpNotBetween(String value1, String value2) {
            addCriterion("usuario_ftp not between", value1, value2, "usuarioFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpIsNull() {
            addCriterion("fecha_ftp is null");
            return (Criteria) this;
        }

        public Criteria andFechaFtpIsNotNull() {
            addCriterion("fecha_ftp is not null");
            return (Criteria) this;
        }

        public Criteria andFechaFtpEqualTo(Date value) {
            addCriterion("fecha_ftp =", value, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpNotEqualTo(Date value) {
            addCriterion("fecha_ftp <>", value, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpGreaterThan(Date value) {
            addCriterion("fecha_ftp >", value, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_ftp >=", value, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpLessThan(Date value) {
            addCriterion("fecha_ftp <", value, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpLessThanOrEqualTo(Date value) {
            addCriterion("fecha_ftp <=", value, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpIn(List<Date> values) {
            addCriterion("fecha_ftp in", values, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpNotIn(List<Date> values) {
            addCriterion("fecha_ftp not in", values, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpBetween(Date value1, Date value2) {
            addCriterion("fecha_ftp between", value1, value2, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andFechaFtpNotBetween(Date value1, Date value2) {
            addCriterion("fecha_ftp not between", value1, value2, "fechaFtp");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsIsNull() {
            addCriterion("usuario_ws is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsIsNotNull() {
            addCriterion("usuario_ws is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsEqualTo(String value) {
            addCriterion("usuario_ws =", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsNotEqualTo(String value) {
            addCriterion("usuario_ws <>", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsGreaterThan(String value) {
            addCriterion("usuario_ws >", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsGreaterThanOrEqualTo(String value) {
            addCriterion("usuario_ws >=", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsLessThan(String value) {
            addCriterion("usuario_ws <", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsLessThanOrEqualTo(String value) {
            addCriterion("usuario_ws <=", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsLike(String value) {
            addCriterion("usuario_ws like", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsNotLike(String value) {
            addCriterion("usuario_ws not like", value, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsIn(List<String> values) {
            addCriterion("usuario_ws in", values, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsNotIn(List<String> values) {
            addCriterion("usuario_ws not in", values, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsBetween(String value1, String value2) {
            addCriterion("usuario_ws between", value1, value2, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioWsNotBetween(String value1, String value2) {
            addCriterion("usuario_ws not between", value1, value2, "usuarioWs");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaIsNull() {
            addCriterion("usuario_coordina is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaIsNotNull() {
            addCriterion("usuario_coordina is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaEqualTo(String value) {
            addCriterion("usuario_coordina =", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaNotEqualTo(String value) {
            addCriterion("usuario_coordina <>", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaGreaterThan(String value) {
            addCriterion("usuario_coordina >", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaGreaterThanOrEqualTo(String value) {
            addCriterion("usuario_coordina >=", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaLessThan(String value) {
            addCriterion("usuario_coordina <", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaLessThanOrEqualTo(String value) {
            addCriterion("usuario_coordina <=", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaLike(String value) {
            addCriterion("usuario_coordina like", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaNotLike(String value) {
            addCriterion("usuario_coordina not like", value, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaIn(List<String> values) {
            addCriterion("usuario_coordina in", values, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaNotIn(List<String> values) {
            addCriterion("usuario_coordina not in", values, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaBetween(String value1, String value2) {
            addCriterion("usuario_coordina between", value1, value2, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andUsuarioCoordinaNotBetween(String value1, String value2) {
            addCriterion("usuario_coordina not between", value1, value2, "usuarioCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaIsNull() {
            addCriterion("fecha_coordina is null");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaIsNotNull() {
            addCriterion("fecha_coordina is not null");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaEqualTo(Date value) {
            addCriterion("fecha_coordina =", value, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaNotEqualTo(Date value) {
            addCriterion("fecha_coordina <>", value, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaGreaterThan(Date value) {
            addCriterion("fecha_coordina >", value, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha_coordina >=", value, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaLessThan(Date value) {
            addCriterion("fecha_coordina <", value, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaLessThanOrEqualTo(Date value) {
            addCriterion("fecha_coordina <=", value, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaIn(List<Date> values) {
            addCriterion("fecha_coordina in", values, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaNotIn(List<Date> values) {
            addCriterion("fecha_coordina not in", values, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaBetween(Date value1, Date value2) {
            addCriterion("fecha_coordina between", value1, value2, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andFechaCoordinaNotBetween(Date value1, Date value2) {
            addCriterion("fecha_coordina not between", value1, value2, "fechaCoordina");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamIsNull() {
            addCriterion("bi_fec_num_cam is null");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamIsNotNull() {
            addCriterion("bi_fec_num_cam is not null");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamEqualTo(Date value) {
            addCriterion("bi_fec_num_cam =", value, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamNotEqualTo(Date value) {
            addCriterion("bi_fec_num_cam <>", value, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamGreaterThan(Date value) {
            addCriterion("bi_fec_num_cam >", value, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamGreaterThanOrEqualTo(Date value) {
            addCriterion("bi_fec_num_cam >=", value, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamLessThan(Date value) {
            addCriterion("bi_fec_num_cam <", value, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamLessThanOrEqualTo(Date value) {
            addCriterion("bi_fec_num_cam <=", value, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamIn(List<Date> values) {
            addCriterion("bi_fec_num_cam in", values, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamNotIn(List<Date> values) {
            addCriterion("bi_fec_num_cam not in", values, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamBetween(Date value1, Date value2) {
            addCriterion("bi_fec_num_cam between", value1, value2, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiFecNumCamNotBetween(Date value1, Date value2) {
            addCriterion("bi_fec_num_cam not between", value1, value2, "biFecNumCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamIsNull() {
            addCriterion("bi_cod_ind_cam is null");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamIsNotNull() {
            addCriterion("bi_cod_ind_cam is not null");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamEqualTo(String value) {
            addCriterion("bi_cod_ind_cam =", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamNotEqualTo(String value) {
            addCriterion("bi_cod_ind_cam <>", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamGreaterThan(String value) {
            addCriterion("bi_cod_ind_cam >", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamGreaterThanOrEqualTo(String value) {
            addCriterion("bi_cod_ind_cam >=", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamLessThan(String value) {
            addCriterion("bi_cod_ind_cam <", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamLessThanOrEqualTo(String value) {
            addCriterion("bi_cod_ind_cam <=", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamLike(String value) {
            addCriterion("bi_cod_ind_cam like", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamNotLike(String value) {
            addCriterion("bi_cod_ind_cam not like", value, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamIn(List<String> values) {
            addCriterion("bi_cod_ind_cam in", values, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamNotIn(List<String> values) {
            addCriterion("bi_cod_ind_cam not in", values, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamBetween(String value1, String value2) {
            addCriterion("bi_cod_ind_cam between", value1, value2, "biCodIndCam");
            return (Criteria) this;
        }

        public Criteria andBiCodIndCamNotBetween(String value1, String value2) {
            addCriterion("bi_cod_ind_cam not between", value1, value2, "biCodIndCam");
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