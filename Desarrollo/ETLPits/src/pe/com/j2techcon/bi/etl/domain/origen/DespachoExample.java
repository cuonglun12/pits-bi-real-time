package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DespachoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DespachoExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andFecsalidaIsNull() {
            addCriterion("fecsalida is null");
            return (Criteria) this;
        }

        public Criteria andFecsalidaIsNotNull() {
            addCriterion("fecsalida is not null");
            return (Criteria) this;
        }

        public Criteria andFecsalidaEqualTo(Date value) {
            addCriterionForJDBCDate("fecsalida =", value, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecsalida <>", value, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaGreaterThan(Date value) {
            addCriterionForJDBCDate("fecsalida >", value, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecsalida >=", value, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaLessThan(Date value) {
            addCriterionForJDBCDate("fecsalida <", value, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecsalida <=", value, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaIn(List<Date> values) {
            addCriterionForJDBCDate("fecsalida in", values, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecsalida not in", values, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecsalida between", value1, value2, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecsalidaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecsalida not between", value1, value2, "fecsalida");
            return (Criteria) this;
        }

        public Criteria andFecretornoIsNull() {
            addCriterion("fecretorno is null");
            return (Criteria) this;
        }

        public Criteria andFecretornoIsNotNull() {
            addCriterion("fecretorno is not null");
            return (Criteria) this;
        }

        public Criteria andFecretornoEqualTo(Date value) {
            addCriterionForJDBCDate("fecretorno =", value, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecretorno <>", value, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoGreaterThan(Date value) {
            addCriterionForJDBCDate("fecretorno >", value, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecretorno >=", value, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoLessThan(Date value) {
            addCriterionForJDBCDate("fecretorno <", value, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecretorno <=", value, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoIn(List<Date> values) {
            addCriterionForJDBCDate("fecretorno in", values, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecretorno not in", values, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecretorno between", value1, value2, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andFecretornoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecretorno not between", value1, value2, "fecretorno");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroIsNull() {
            addCriterion("codmensajero is null");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroIsNotNull() {
            addCriterion("codmensajero is not null");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroEqualTo(String value) {
            addCriterion("codmensajero =", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroNotEqualTo(String value) {
            addCriterion("codmensajero <>", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroGreaterThan(String value) {
            addCriterion("codmensajero >", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroGreaterThanOrEqualTo(String value) {
            addCriterion("codmensajero >=", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroLessThan(String value) {
            addCriterion("codmensajero <", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroLessThanOrEqualTo(String value) {
            addCriterion("codmensajero <=", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroLike(String value) {
            addCriterion("codmensajero like", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroNotLike(String value) {
            addCriterion("codmensajero not like", value, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroIn(List<String> values) {
            addCriterion("codmensajero in", values, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroNotIn(List<String> values) {
            addCriterion("codmensajero not in", values, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroBetween(String value1, String value2) {
            addCriterion("codmensajero between", value1, value2, "codmensajero");
            return (Criteria) this;
        }

        public Criteria andCodmensajeroNotBetween(String value1, String value2) {
            addCriterion("codmensajero not between", value1, value2, "codmensajero");
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andEntregadosIsNull() {
            addCriterion("entregados is null");
            return (Criteria) this;
        }

        public Criteria andEntregadosIsNotNull() {
            addCriterion("entregados is not null");
            return (Criteria) this;
        }

        public Criteria andEntregadosEqualTo(Integer value) {
            addCriterion("entregados =", value, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosNotEqualTo(Integer value) {
            addCriterion("entregados <>", value, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosGreaterThan(Integer value) {
            addCriterion("entregados >", value, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosGreaterThanOrEqualTo(Integer value) {
            addCriterion("entregados >=", value, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosLessThan(Integer value) {
            addCriterion("entregados <", value, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosLessThanOrEqualTo(Integer value) {
            addCriterion("entregados <=", value, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosIn(List<Integer> values) {
            addCriterion("entregados in", values, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosNotIn(List<Integer> values) {
            addCriterion("entregados not in", values, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosBetween(Integer value1, Integer value2) {
            addCriterion("entregados between", value1, value2, "entregados");
            return (Criteria) this;
        }

        public Criteria andEntregadosNotBetween(Integer value1, Integer value2) {
            addCriterion("entregados not between", value1, value2, "entregados");
            return (Criteria) this;
        }

        public Criteria andMotivosIsNull() {
            addCriterion("motivos is null");
            return (Criteria) this;
        }

        public Criteria andMotivosIsNotNull() {
            addCriterion("motivos is not null");
            return (Criteria) this;
        }

        public Criteria andMotivosEqualTo(Integer value) {
            addCriterion("motivos =", value, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosNotEqualTo(Integer value) {
            addCriterion("motivos <>", value, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosGreaterThan(Integer value) {
            addCriterion("motivos >", value, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosGreaterThanOrEqualTo(Integer value) {
            addCriterion("motivos >=", value, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosLessThan(Integer value) {
            addCriterion("motivos <", value, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosLessThanOrEqualTo(Integer value) {
            addCriterion("motivos <=", value, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosIn(List<Integer> values) {
            addCriterion("motivos in", values, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosNotIn(List<Integer> values) {
            addCriterion("motivos not in", values, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosBetween(Integer value1, Integer value2) {
            addCriterion("motivos between", value1, value2, "motivos");
            return (Criteria) this;
        }

        public Criteria andMotivosNotBetween(Integer value1, Integer value2) {
            addCriterion("motivos not between", value1, value2, "motivos");
            return (Criteria) this;
        }

        public Criteria andReenviosIsNull() {
            addCriterion("reenvios is null");
            return (Criteria) this;
        }

        public Criteria andReenviosIsNotNull() {
            addCriterion("reenvios is not null");
            return (Criteria) this;
        }

        public Criteria andReenviosEqualTo(Integer value) {
            addCriterion("reenvios =", value, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosNotEqualTo(Integer value) {
            addCriterion("reenvios <>", value, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosGreaterThan(Integer value) {
            addCriterion("reenvios >", value, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosGreaterThanOrEqualTo(Integer value) {
            addCriterion("reenvios >=", value, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosLessThan(Integer value) {
            addCriterion("reenvios <", value, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosLessThanOrEqualTo(Integer value) {
            addCriterion("reenvios <=", value, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosIn(List<Integer> values) {
            addCriterion("reenvios in", values, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosNotIn(List<Integer> values) {
            addCriterion("reenvios not in", values, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosBetween(Integer value1, Integer value2) {
            addCriterion("reenvios between", value1, value2, "reenvios");
            return (Criteria) this;
        }

        public Criteria andReenviosNotBetween(Integer value1, Integer value2) {
            addCriterion("reenvios not between", value1, value2, "reenvios");
            return (Criteria) this;
        }

        public Criteria andAnuladosIsNull() {
            addCriterion("anulados is null");
            return (Criteria) this;
        }

        public Criteria andAnuladosIsNotNull() {
            addCriterion("anulados is not null");
            return (Criteria) this;
        }

        public Criteria andAnuladosEqualTo(Integer value) {
            addCriterion("anulados =", value, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosNotEqualTo(Integer value) {
            addCriterion("anulados <>", value, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosGreaterThan(Integer value) {
            addCriterion("anulados >", value, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosGreaterThanOrEqualTo(Integer value) {
            addCriterion("anulados >=", value, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosLessThan(Integer value) {
            addCriterion("anulados <", value, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosLessThanOrEqualTo(Integer value) {
            addCriterion("anulados <=", value, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosIn(List<Integer> values) {
            addCriterion("anulados in", values, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosNotIn(List<Integer> values) {
            addCriterion("anulados not in", values, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosBetween(Integer value1, Integer value2) {
            addCriterion("anulados between", value1, value2, "anulados");
            return (Criteria) this;
        }

        public Criteria andAnuladosNotBetween(Integer value1, Integer value2) {
            addCriterion("anulados not between", value1, value2, "anulados");
            return (Criteria) this;
        }

        public Criteria andFuerazonaIsNull() {
            addCriterion("fuerazona is null");
            return (Criteria) this;
        }

        public Criteria andFuerazonaIsNotNull() {
            addCriterion("fuerazona is not null");
            return (Criteria) this;
        }

        public Criteria andFuerazonaEqualTo(Integer value) {
            addCriterion("fuerazona =", value, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaNotEqualTo(Integer value) {
            addCriterion("fuerazona <>", value, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaGreaterThan(Integer value) {
            addCriterion("fuerazona >", value, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuerazona >=", value, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaLessThan(Integer value) {
            addCriterion("fuerazona <", value, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaLessThanOrEqualTo(Integer value) {
            addCriterion("fuerazona <=", value, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaIn(List<Integer> values) {
            addCriterion("fuerazona in", values, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaNotIn(List<Integer> values) {
            addCriterion("fuerazona not in", values, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaBetween(Integer value1, Integer value2) {
            addCriterion("fuerazona between", value1, value2, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andFuerazonaNotBetween(Integer value1, Integer value2) {
            addCriterion("fuerazona not between", value1, value2, "fuerazona");
            return (Criteria) this;
        }

        public Criteria andPerdidosIsNull() {
            addCriterion("perdidos is null");
            return (Criteria) this;
        }

        public Criteria andPerdidosIsNotNull() {
            addCriterion("perdidos is not null");
            return (Criteria) this;
        }

        public Criteria andPerdidosEqualTo(Integer value) {
            addCriterion("perdidos =", value, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosNotEqualTo(Integer value) {
            addCriterion("perdidos <>", value, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosGreaterThan(Integer value) {
            addCriterion("perdidos >", value, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosGreaterThanOrEqualTo(Integer value) {
            addCriterion("perdidos >=", value, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosLessThan(Integer value) {
            addCriterion("perdidos <", value, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosLessThanOrEqualTo(Integer value) {
            addCriterion("perdidos <=", value, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosIn(List<Integer> values) {
            addCriterion("perdidos in", values, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosNotIn(List<Integer> values) {
            addCriterion("perdidos not in", values, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosBetween(Integer value1, Integer value2) {
            addCriterion("perdidos between", value1, value2, "perdidos");
            return (Criteria) this;
        }

        public Criteria andPerdidosNotBetween(Integer value1, Integer value2) {
            addCriterion("perdidos not between", value1, value2, "perdidos");
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

        public Criteria andTiporutaIsNull() {
            addCriterion("tiporuta is null");
            return (Criteria) this;
        }

        public Criteria andTiporutaIsNotNull() {
            addCriterion("tiporuta is not null");
            return (Criteria) this;
        }

        public Criteria andTiporutaEqualTo(String value) {
            addCriterion("tiporuta =", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaNotEqualTo(String value) {
            addCriterion("tiporuta <>", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaGreaterThan(String value) {
            addCriterion("tiporuta >", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaGreaterThanOrEqualTo(String value) {
            addCriterion("tiporuta >=", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaLessThan(String value) {
            addCriterion("tiporuta <", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaLessThanOrEqualTo(String value) {
            addCriterion("tiporuta <=", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaLike(String value) {
            addCriterion("tiporuta like", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaNotLike(String value) {
            addCriterion("tiporuta not like", value, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaIn(List<String> values) {
            addCriterion("tiporuta in", values, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaNotIn(List<String> values) {
            addCriterion("tiporuta not in", values, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaBetween(String value1, String value2) {
            addCriterion("tiporuta between", value1, value2, "tiporuta");
            return (Criteria) this;
        }

        public Criteria andTiporutaNotBetween(String value1, String value2) {
            addCriterion("tiporuta not between", value1, value2, "tiporuta");
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

        public Criteria andCodestadoguiaIsNull() {
            addCriterion("codestadoguia is null");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaIsNotNull() {
            addCriterion("codestadoguia is not null");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaEqualTo(String value) {
            addCriterion("codestadoguia =", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaNotEqualTo(String value) {
            addCriterion("codestadoguia <>", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaGreaterThan(String value) {
            addCriterion("codestadoguia >", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaGreaterThanOrEqualTo(String value) {
            addCriterion("codestadoguia >=", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaLessThan(String value) {
            addCriterion("codestadoguia <", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaLessThanOrEqualTo(String value) {
            addCriterion("codestadoguia <=", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaLike(String value) {
            addCriterion("codestadoguia like", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaNotLike(String value) {
            addCriterion("codestadoguia not like", value, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaIn(List<String> values) {
            addCriterion("codestadoguia in", values, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaNotIn(List<String> values) {
            addCriterion("codestadoguia not in", values, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaBetween(String value1, String value2) {
            addCriterion("codestadoguia between", value1, value2, "codestadoguia");
            return (Criteria) this;
        }

        public Criteria andCodestadoguiaNotBetween(String value1, String value2) {
            addCriterion("codestadoguia not between", value1, value2, "codestadoguia");
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

        public Criteria andUsuariodespIsNull() {
            addCriterion("usuariodesp is null");
            return (Criteria) this;
        }

        public Criteria andUsuariodespIsNotNull() {
            addCriterion("usuariodesp is not null");
            return (Criteria) this;
        }

        public Criteria andUsuariodespEqualTo(String value) {
            addCriterion("usuariodesp =", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespNotEqualTo(String value) {
            addCriterion("usuariodesp <>", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespGreaterThan(String value) {
            addCriterion("usuariodesp >", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespGreaterThanOrEqualTo(String value) {
            addCriterion("usuariodesp >=", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespLessThan(String value) {
            addCriterion("usuariodesp <", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespLessThanOrEqualTo(String value) {
            addCriterion("usuariodesp <=", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespLike(String value) {
            addCriterion("usuariodesp like", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespNotLike(String value) {
            addCriterion("usuariodesp not like", value, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespIn(List<String> values) {
            addCriterion("usuariodesp in", values, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespNotIn(List<String> values) {
            addCriterion("usuariodesp not in", values, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespBetween(String value1, String value2) {
            addCriterion("usuariodesp between", value1, value2, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andUsuariodespNotBetween(String value1, String value2) {
            addCriterion("usuariodesp not between", value1, value2, "usuariodesp");
            return (Criteria) this;
        }

        public Criteria andFechadespIsNull() {
            addCriterion("fechadesp is null");
            return (Criteria) this;
        }

        public Criteria andFechadespIsNotNull() {
            addCriterion("fechadesp is not null");
            return (Criteria) this;
        }

        public Criteria andFechadespEqualTo(Date value) {
            addCriterion("fechadesp =", value, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespNotEqualTo(Date value) {
            addCriterion("fechadesp <>", value, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespGreaterThan(Date value) {
            addCriterion("fechadesp >", value, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespGreaterThanOrEqualTo(Date value) {
            addCriterion("fechadesp >=", value, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespLessThan(Date value) {
            addCriterion("fechadesp <", value, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespLessThanOrEqualTo(Date value) {
            addCriterion("fechadesp <=", value, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespIn(List<Date> values) {
            addCriterion("fechadesp in", values, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespNotIn(List<Date> values) {
            addCriterion("fechadesp not in", values, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespBetween(Date value1, Date value2) {
            addCriterion("fechadesp between", value1, value2, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andFechadespNotBetween(Date value1, Date value2) {
            addCriterion("fechadesp not between", value1, value2, "fechadesp");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreIsNull() {
            addCriterion("usuariocierre is null");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreIsNotNull() {
            addCriterion("usuariocierre is not null");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreEqualTo(String value) {
            addCriterion("usuariocierre =", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreNotEqualTo(String value) {
            addCriterion("usuariocierre <>", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreGreaterThan(String value) {
            addCriterion("usuariocierre >", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreGreaterThanOrEqualTo(String value) {
            addCriterion("usuariocierre >=", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreLessThan(String value) {
            addCriterion("usuariocierre <", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreLessThanOrEqualTo(String value) {
            addCriterion("usuariocierre <=", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreLike(String value) {
            addCriterion("usuariocierre like", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreNotLike(String value) {
            addCriterion("usuariocierre not like", value, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreIn(List<String> values) {
            addCriterion("usuariocierre in", values, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreNotIn(List<String> values) {
            addCriterion("usuariocierre not in", values, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreBetween(String value1, String value2) {
            addCriterion("usuariocierre between", value1, value2, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andUsuariocierreNotBetween(String value1, String value2) {
            addCriterion("usuariocierre not between", value1, value2, "usuariocierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreIsNull() {
            addCriterion("fechacierre is null");
            return (Criteria) this;
        }

        public Criteria andFechacierreIsNotNull() {
            addCriterion("fechacierre is not null");
            return (Criteria) this;
        }

        public Criteria andFechacierreEqualTo(Date value) {
            addCriterion("fechacierre =", value, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreNotEqualTo(Date value) {
            addCriterion("fechacierre <>", value, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreGreaterThan(Date value) {
            addCriterion("fechacierre >", value, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreGreaterThanOrEqualTo(Date value) {
            addCriterion("fechacierre >=", value, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreLessThan(Date value) {
            addCriterion("fechacierre <", value, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreLessThanOrEqualTo(Date value) {
            addCriterion("fechacierre <=", value, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreIn(List<Date> values) {
            addCriterion("fechacierre in", values, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreNotIn(List<Date> values) {
            addCriterion("fechacierre not in", values, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreBetween(Date value1, Date value2) {
            addCriterion("fechacierre between", value1, value2, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andFechacierreNotBetween(Date value1, Date value2) {
            addCriterion("fechacierre not between", value1, value2, "fechacierre");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoIsNull() {
            addCriterion("codtipopago is null");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoIsNotNull() {
            addCriterion("codtipopago is not null");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoEqualTo(String value) {
            addCriterion("codtipopago =", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoNotEqualTo(String value) {
            addCriterion("codtipopago <>", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoGreaterThan(String value) {
            addCriterion("codtipopago >", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoGreaterThanOrEqualTo(String value) {
            addCriterion("codtipopago >=", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoLessThan(String value) {
            addCriterion("codtipopago <", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoLessThanOrEqualTo(String value) {
            addCriterion("codtipopago <=", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoLike(String value) {
            addCriterion("codtipopago like", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoNotLike(String value) {
            addCriterion("codtipopago not like", value, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoIn(List<String> values) {
            addCriterion("codtipopago in", values, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoNotIn(List<String> values) {
            addCriterion("codtipopago not in", values, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoBetween(String value1, String value2) {
            addCriterion("codtipopago between", value1, value2, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andCodtipopagoNotBetween(String value1, String value2) {
            addCriterion("codtipopago not between", value1, value2, "codtipopago");
            return (Criteria) this;
        }

        public Criteria andHoraretornoIsNull() {
            addCriterion("horaretorno is null");
            return (Criteria) this;
        }

        public Criteria andHoraretornoIsNotNull() {
            addCriterion("horaretorno is not null");
            return (Criteria) this;
        }

        public Criteria andHoraretornoEqualTo(String value) {
            addCriterion("horaretorno =", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoNotEqualTo(String value) {
            addCriterion("horaretorno <>", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoGreaterThan(String value) {
            addCriterion("horaretorno >", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoGreaterThanOrEqualTo(String value) {
            addCriterion("horaretorno >=", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoLessThan(String value) {
            addCriterion("horaretorno <", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoLessThanOrEqualTo(String value) {
            addCriterion("horaretorno <=", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoLike(String value) {
            addCriterion("horaretorno like", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoNotLike(String value) {
            addCriterion("horaretorno not like", value, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoIn(List<String> values) {
            addCriterion("horaretorno in", values, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoNotIn(List<String> values) {
            addCriterion("horaretorno not in", values, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoBetween(String value1, String value2) {
            addCriterion("horaretorno between", value1, value2, "horaretorno");
            return (Criteria) this;
        }

        public Criteria andHoraretornoNotBetween(String value1, String value2) {
            addCriterion("horaretorno not between", value1, value2, "horaretorno");
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

        public Criteria andUserasignaIsNull() {
            addCriterion("userasigna is null");
            return (Criteria) this;
        }

        public Criteria andUserasignaIsNotNull() {
            addCriterion("userasigna is not null");
            return (Criteria) this;
        }

        public Criteria andUserasignaEqualTo(String value) {
            addCriterion("userasigna =", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaNotEqualTo(String value) {
            addCriterion("userasigna <>", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaGreaterThan(String value) {
            addCriterion("userasigna >", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaGreaterThanOrEqualTo(String value) {
            addCriterion("userasigna >=", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaLessThan(String value) {
            addCriterion("userasigna <", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaLessThanOrEqualTo(String value) {
            addCriterion("userasigna <=", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaLike(String value) {
            addCriterion("userasigna like", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaNotLike(String value) {
            addCriterion("userasigna not like", value, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaIn(List<String> values) {
            addCriterion("userasigna in", values, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaNotIn(List<String> values) {
            addCriterion("userasigna not in", values, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaBetween(String value1, String value2) {
            addCriterion("userasigna between", value1, value2, "userasigna");
            return (Criteria) this;
        }

        public Criteria andUserasignaNotBetween(String value1, String value2) {
            addCriterion("userasigna not between", value1, value2, "userasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaIsNull() {
            addCriterion("fecasigna is null");
            return (Criteria) this;
        }

        public Criteria andFecasignaIsNotNull() {
            addCriterion("fecasigna is not null");
            return (Criteria) this;
        }

        public Criteria andFecasignaEqualTo(Date value) {
            addCriterion("fecasigna =", value, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaNotEqualTo(Date value) {
            addCriterion("fecasigna <>", value, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaGreaterThan(Date value) {
            addCriterion("fecasigna >", value, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecasigna >=", value, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaLessThan(Date value) {
            addCriterion("fecasigna <", value, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaLessThanOrEqualTo(Date value) {
            addCriterion("fecasigna <=", value, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaIn(List<Date> values) {
            addCriterion("fecasigna in", values, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaNotIn(List<Date> values) {
            addCriterion("fecasigna not in", values, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaBetween(Date value1, Date value2) {
            addCriterion("fecasigna between", value1, value2, "fecasigna");
            return (Criteria) this;
        }

        public Criteria andFecasignaNotBetween(Date value1, Date value2) {
            addCriterion("fecasigna not between", value1, value2, "fecasigna");
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

        public Criteria andTipofiIsNull() {
            addCriterion("tipofi is null");
            return (Criteria) this;
        }

        public Criteria andTipofiIsNotNull() {
            addCriterion("tipofi is not null");
            return (Criteria) this;
        }

        public Criteria andTipofiEqualTo(Short value) {
            addCriterion("tipofi =", value, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiNotEqualTo(Short value) {
            addCriterion("tipofi <>", value, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiGreaterThan(Short value) {
            addCriterion("tipofi >", value, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiGreaterThanOrEqualTo(Short value) {
            addCriterion("tipofi >=", value, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiLessThan(Short value) {
            addCriterion("tipofi <", value, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiLessThanOrEqualTo(Short value) {
            addCriterion("tipofi <=", value, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiIn(List<Short> values) {
            addCriterion("tipofi in", values, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiNotIn(List<Short> values) {
            addCriterion("tipofi not in", values, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiBetween(Short value1, Short value2) {
            addCriterion("tipofi between", value1, value2, "tipofi");
            return (Criteria) this;
        }

        public Criteria andTipofiNotBetween(Short value1, Short value2) {
            addCriterion("tipofi not between", value1, value2, "tipofi");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteIsNull() {
            addCriterion("usuarioflete is null");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteIsNotNull() {
            addCriterion("usuarioflete is not null");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteEqualTo(String value) {
            addCriterion("usuarioflete =", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteNotEqualTo(String value) {
            addCriterion("usuarioflete <>", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteGreaterThan(String value) {
            addCriterion("usuarioflete >", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteGreaterThanOrEqualTo(String value) {
            addCriterion("usuarioflete >=", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteLessThan(String value) {
            addCriterion("usuarioflete <", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteLessThanOrEqualTo(String value) {
            addCriterion("usuarioflete <=", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteLike(String value) {
            addCriterion("usuarioflete like", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteNotLike(String value) {
            addCriterion("usuarioflete not like", value, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteIn(List<String> values) {
            addCriterion("usuarioflete in", values, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteNotIn(List<String> values) {
            addCriterion("usuarioflete not in", values, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteBetween(String value1, String value2) {
            addCriterion("usuarioflete between", value1, value2, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andUsuariofleteNotBetween(String value1, String value2) {
            addCriterion("usuarioflete not between", value1, value2, "usuarioflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteIsNull() {
            addCriterion("fechaflete is null");
            return (Criteria) this;
        }

        public Criteria andFechafleteIsNotNull() {
            addCriterion("fechaflete is not null");
            return (Criteria) this;
        }

        public Criteria andFechafleteEqualTo(Date value) {
            addCriterionForJDBCDate("fechaflete =", value, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteNotEqualTo(Date value) {
            addCriterionForJDBCDate("fechaflete <>", value, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteGreaterThan(Date value) {
            addCriterionForJDBCDate("fechaflete >", value, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaflete >=", value, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteLessThan(Date value) {
            addCriterionForJDBCDate("fechaflete <", value, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fechaflete <=", value, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteIn(List<Date> values) {
            addCriterionForJDBCDate("fechaflete in", values, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteNotIn(List<Date> values) {
            addCriterionForJDBCDate("fechaflete not in", values, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaflete between", value1, value2, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andFechafleteNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fechaflete not between", value1, value2, "fechaflete");
            return (Criteria) this;
        }

        public Criteria andNrocajaIsNull() {
            addCriterion("nrocaja is null");
            return (Criteria) this;
        }

        public Criteria andNrocajaIsNotNull() {
            addCriterion("nrocaja is not null");
            return (Criteria) this;
        }

        public Criteria andNrocajaEqualTo(Short value) {
            addCriterion("nrocaja =", value, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaNotEqualTo(Short value) {
            addCriterion("nrocaja <>", value, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaGreaterThan(Short value) {
            addCriterion("nrocaja >", value, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaGreaterThanOrEqualTo(Short value) {
            addCriterion("nrocaja >=", value, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaLessThan(Short value) {
            addCriterion("nrocaja <", value, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaLessThanOrEqualTo(Short value) {
            addCriterion("nrocaja <=", value, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaIn(List<Short> values) {
            addCriterion("nrocaja in", values, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaNotIn(List<Short> values) {
            addCriterion("nrocaja not in", values, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaBetween(Short value1, Short value2) {
            addCriterion("nrocaja between", value1, value2, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andNrocajaNotBetween(Short value1, Short value2) {
            addCriterion("nrocaja not between", value1, value2, "nrocaja");
            return (Criteria) this;
        }

        public Criteria andFleteIsNull() {
            addCriterion("flete is null");
            return (Criteria) this;
        }

        public Criteria andFleteIsNotNull() {
            addCriterion("flete is not null");
            return (Criteria) this;
        }

        public Criteria andFleteEqualTo(String value) {
            addCriterion("flete =", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteNotEqualTo(String value) {
            addCriterion("flete <>", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteGreaterThan(String value) {
            addCriterion("flete >", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteGreaterThanOrEqualTo(String value) {
            addCriterion("flete >=", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteLessThan(String value) {
            addCriterion("flete <", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteLessThanOrEqualTo(String value) {
            addCriterion("flete <=", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteLike(String value) {
            addCriterion("flete like", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteNotLike(String value) {
            addCriterion("flete not like", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteIn(List<String> values) {
            addCriterion("flete in", values, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteNotIn(List<String> values) {
            addCriterion("flete not in", values, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteBetween(String value1, String value2) {
            addCriterion("flete between", value1, value2, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteNotBetween(String value1, String value2) {
            addCriterion("flete not between", value1, value2, "flete");
            return (Criteria) this;
        }

        public Criteria andHorasalidaIsNull() {
            addCriterion("horasalida is null");
            return (Criteria) this;
        }

        public Criteria andHorasalidaIsNotNull() {
            addCriterion("horasalida is not null");
            return (Criteria) this;
        }

        public Criteria andHorasalidaEqualTo(Date value) {
            addCriterion("horasalida =", value, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaNotEqualTo(Date value) {
            addCriterion("horasalida <>", value, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaGreaterThan(Date value) {
            addCriterion("horasalida >", value, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaGreaterThanOrEqualTo(Date value) {
            addCriterion("horasalida >=", value, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaLessThan(Date value) {
            addCriterion("horasalida <", value, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaLessThanOrEqualTo(Date value) {
            addCriterion("horasalida <=", value, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaIn(List<Date> values) {
            addCriterion("horasalida in", values, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaNotIn(List<Date> values) {
            addCriterion("horasalida not in", values, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaBetween(Date value1, Date value2) {
            addCriterion("horasalida between", value1, value2, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorasalidaNotBetween(Date value1, Date value2) {
            addCriterion("horasalida not between", value1, value2, "horasalida");
            return (Criteria) this;
        }

        public Criteria andHorafleteIsNull() {
            addCriterion("horaflete is null");
            return (Criteria) this;
        }

        public Criteria andHorafleteIsNotNull() {
            addCriterion("horaflete is not null");
            return (Criteria) this;
        }

        public Criteria andHorafleteEqualTo(Date value) {
            addCriterionForJDBCTime("horaflete =", value, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteNotEqualTo(Date value) {
            addCriterionForJDBCTime("horaflete <>", value, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteGreaterThan(Date value) {
            addCriterionForJDBCTime("horaflete >", value, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("horaflete >=", value, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteLessThan(Date value) {
            addCriterionForJDBCTime("horaflete <", value, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("horaflete <=", value, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteIn(List<Date> values) {
            addCriterionForJDBCTime("horaflete in", values, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteNotIn(List<Date> values) {
            addCriterionForJDBCTime("horaflete not in", values, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("horaflete between", value1, value2, "horaflete");
            return (Criteria) this;
        }

        public Criteria andHorafleteNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("horaflete not between", value1, value2, "horaflete");
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

        public Criteria andCodplanillaIsNull() {
            addCriterion("codplanilla is null");
            return (Criteria) this;
        }

        public Criteria andCodplanillaIsNotNull() {
            addCriterion("codplanilla is not null");
            return (Criteria) this;
        }

        public Criteria andCodplanillaEqualTo(String value) {
            addCriterion("codplanilla =", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaNotEqualTo(String value) {
            addCriterion("codplanilla <>", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaGreaterThan(String value) {
            addCriterion("codplanilla >", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaGreaterThanOrEqualTo(String value) {
            addCriterion("codplanilla >=", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaLessThan(String value) {
            addCriterion("codplanilla <", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaLessThanOrEqualTo(String value) {
            addCriterion("codplanilla <=", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaLike(String value) {
            addCriterion("codplanilla like", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaNotLike(String value) {
            addCriterion("codplanilla not like", value, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaIn(List<String> values) {
            addCriterion("codplanilla in", values, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaNotIn(List<String> values) {
            addCriterion("codplanilla not in", values, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaBetween(String value1, String value2) {
            addCriterion("codplanilla between", value1, value2, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andCodplanillaNotBetween(String value1, String value2) {
            addCriterion("codplanilla not between", value1, value2, "codplanilla");
            return (Criteria) this;
        }

        public Criteria andBreveteIsNull() {
            addCriterion("brevete is null");
            return (Criteria) this;
        }

        public Criteria andBreveteIsNotNull() {
            addCriterion("brevete is not null");
            return (Criteria) this;
        }

        public Criteria andBreveteEqualTo(String value) {
            addCriterion("brevete =", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteNotEqualTo(String value) {
            addCriterion("brevete <>", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteGreaterThan(String value) {
            addCriterion("brevete >", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteGreaterThanOrEqualTo(String value) {
            addCriterion("brevete >=", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteLessThan(String value) {
            addCriterion("brevete <", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteLessThanOrEqualTo(String value) {
            addCriterion("brevete <=", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteLike(String value) {
            addCriterion("brevete like", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteNotLike(String value) {
            addCriterion("brevete not like", value, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteIn(List<String> values) {
            addCriterion("brevete in", values, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteNotIn(List<String> values) {
            addCriterion("brevete not in", values, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteBetween(String value1, String value2) {
            addCriterion("brevete between", value1, value2, "brevete");
            return (Criteria) this;
        }

        public Criteria andBreveteNotBetween(String value1, String value2) {
            addCriterion("brevete not between", value1, value2, "brevete");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteIsNull() {
            addCriterion("cod_ayudante is null");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteIsNotNull() {
            addCriterion("cod_ayudante is not null");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteEqualTo(String value) {
            addCriterion("cod_ayudante =", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteNotEqualTo(String value) {
            addCriterion("cod_ayudante <>", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteGreaterThan(String value) {
            addCriterion("cod_ayudante >", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteGreaterThanOrEqualTo(String value) {
            addCriterion("cod_ayudante >=", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteLessThan(String value) {
            addCriterion("cod_ayudante <", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteLessThanOrEqualTo(String value) {
            addCriterion("cod_ayudante <=", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteLike(String value) {
            addCriterion("cod_ayudante like", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteNotLike(String value) {
            addCriterion("cod_ayudante not like", value, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteIn(List<String> values) {
            addCriterion("cod_ayudante in", values, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteNotIn(List<String> values) {
            addCriterion("cod_ayudante not in", values, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteBetween(String value1, String value2) {
            addCriterion("cod_ayudante between", value1, value2, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodAyudanteNotBetween(String value1, String value2) {
            addCriterion("cod_ayudante not between", value1, value2, "codAyudante");
            return (Criteria) this;
        }

        public Criteria andCodUnidadIsNull() {
            addCriterion("cod_unidad is null");
            return (Criteria) this;
        }

        public Criteria andCodUnidadIsNotNull() {
            addCriterion("cod_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andCodUnidadEqualTo(String value) {
            addCriterion("cod_unidad =", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadNotEqualTo(String value) {
            addCriterion("cod_unidad <>", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadGreaterThan(String value) {
            addCriterion("cod_unidad >", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadGreaterThanOrEqualTo(String value) {
            addCriterion("cod_unidad >=", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadLessThan(String value) {
            addCriterion("cod_unidad <", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadLessThanOrEqualTo(String value) {
            addCriterion("cod_unidad <=", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadLike(String value) {
            addCriterion("cod_unidad like", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadNotLike(String value) {
            addCriterion("cod_unidad not like", value, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadIn(List<String> values) {
            addCriterion("cod_unidad in", values, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadNotIn(List<String> values) {
            addCriterion("cod_unidad not in", values, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadBetween(String value1, String value2) {
            addCriterion("cod_unidad between", value1, value2, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andCodUnidadNotBetween(String value1, String value2) {
            addCriterion("cod_unidad not between", value1, value2, "codUnidad");
            return (Criteria) this;
        }

        public Criteria andPlacaIsNull() {
            addCriterion("placa is null");
            return (Criteria) this;
        }

        public Criteria andPlacaIsNotNull() {
            addCriterion("placa is not null");
            return (Criteria) this;
        }

        public Criteria andPlacaEqualTo(String value) {
            addCriterion("placa =", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotEqualTo(String value) {
            addCriterion("placa <>", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaGreaterThan(String value) {
            addCriterion("placa >", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaGreaterThanOrEqualTo(String value) {
            addCriterion("placa >=", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLessThan(String value) {
            addCriterion("placa <", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLessThanOrEqualTo(String value) {
            addCriterion("placa <=", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaLike(String value) {
            addCriterion("placa like", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotLike(String value) {
            addCriterion("placa not like", value, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaIn(List<String> values) {
            addCriterion("placa in", values, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotIn(List<String> values) {
            addCriterion("placa not in", values, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaBetween(String value1, String value2) {
            addCriterion("placa between", value1, value2, "placa");
            return (Criteria) this;
        }

        public Criteria andPlacaNotBetween(String value1, String value2) {
            addCriterion("placa not between", value1, value2, "placa");
            return (Criteria) this;
        }

        public Criteria andDesUnidadIsNull() {
            addCriterion("des_unidad is null");
            return (Criteria) this;
        }

        public Criteria andDesUnidadIsNotNull() {
            addCriterion("des_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andDesUnidadEqualTo(String value) {
            addCriterion("des_unidad =", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadNotEqualTo(String value) {
            addCriterion("des_unidad <>", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadGreaterThan(String value) {
            addCriterion("des_unidad >", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadGreaterThanOrEqualTo(String value) {
            addCriterion("des_unidad >=", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadLessThan(String value) {
            addCriterion("des_unidad <", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadLessThanOrEqualTo(String value) {
            addCriterion("des_unidad <=", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadLike(String value) {
            addCriterion("des_unidad like", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadNotLike(String value) {
            addCriterion("des_unidad not like", value, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadIn(List<String> values) {
            addCriterion("des_unidad in", values, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadNotIn(List<String> values) {
            addCriterion("des_unidad not in", values, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadBetween(String value1, String value2) {
            addCriterion("des_unidad between", value1, value2, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andDesUnidadNotBetween(String value1, String value2) {
            addCriterion("des_unidad not between", value1, value2, "desUnidad");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaIsNull() {
            addCriterion("cod_tracking_guia is null");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaIsNotNull() {
            addCriterion("cod_tracking_guia is not null");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaEqualTo(Short value) {
            addCriterion("cod_tracking_guia =", value, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaNotEqualTo(Short value) {
            addCriterion("cod_tracking_guia <>", value, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaGreaterThan(Short value) {
            addCriterion("cod_tracking_guia >", value, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaGreaterThanOrEqualTo(Short value) {
            addCriterion("cod_tracking_guia >=", value, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaLessThan(Short value) {
            addCriterion("cod_tracking_guia <", value, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaLessThanOrEqualTo(Short value) {
            addCriterion("cod_tracking_guia <=", value, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaIn(List<Short> values) {
            addCriterion("cod_tracking_guia in", values, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaNotIn(List<Short> values) {
            addCriterion("cod_tracking_guia not in", values, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaBetween(Short value1, Short value2) {
            addCriterion("cod_tracking_guia between", value1, value2, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andCodTrackingGuiaNotBetween(Short value1, Short value2) {
            addCriterion("cod_tracking_guia not between", value1, value2, "codTrackingGuia");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioIsNull() {
            addCriterion("flag_envio is null");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioIsNotNull() {
            addCriterion("flag_envio is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioEqualTo(Short value) {
            addCriterion("flag_envio =", value, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioNotEqualTo(Short value) {
            addCriterion("flag_envio <>", value, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioGreaterThan(Short value) {
            addCriterion("flag_envio >", value, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioGreaterThanOrEqualTo(Short value) {
            addCriterion("flag_envio >=", value, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioLessThan(Short value) {
            addCriterion("flag_envio <", value, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioLessThanOrEqualTo(Short value) {
            addCriterion("flag_envio <=", value, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioIn(List<Short> values) {
            addCriterion("flag_envio in", values, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioNotIn(List<Short> values) {
            addCriterion("flag_envio not in", values, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioBetween(Short value1, Short value2) {
            addCriterion("flag_envio between", value1, value2, "flagEnvio");
            return (Criteria) this;
        }

        public Criteria andFlagEnvioNotBetween(Short value1, Short value2) {
            addCriterion("flag_envio not between", value1, value2, "flagEnvio");
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