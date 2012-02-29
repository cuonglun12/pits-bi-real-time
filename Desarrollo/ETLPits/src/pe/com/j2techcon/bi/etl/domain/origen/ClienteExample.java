package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClienteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClienteExample() {
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

        public Criteria andClienteIsNull() {
            addCriterion("cliente is null");
            return (Criteria) this;
        }

        public Criteria andClienteIsNotNull() {
            addCriterion("cliente is not null");
            return (Criteria) this;
        }

        public Criteria andClienteEqualTo(String value) {
            addCriterion("cliente =", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteNotEqualTo(String value) {
            addCriterion("cliente <>", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteGreaterThan(String value) {
            addCriterion("cliente >", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteGreaterThanOrEqualTo(String value) {
            addCriterion("cliente >=", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteLessThan(String value) {
            addCriterion("cliente <", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteLessThanOrEqualTo(String value) {
            addCriterion("cliente <=", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteLike(String value) {
            addCriterion("cliente like", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteNotLike(String value) {
            addCriterion("cliente not like", value, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteIn(List<String> values) {
            addCriterion("cliente in", values, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteNotIn(List<String> values) {
            addCriterion("cliente not in", values, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteBetween(String value1, String value2) {
            addCriterion("cliente between", value1, value2, "cliente");
            return (Criteria) this;
        }

        public Criteria andClienteNotBetween(String value1, String value2) {
            addCriterion("cliente not between", value1, value2, "cliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteIsNull() {
            addCriterion("tipocliente is null");
            return (Criteria) this;
        }

        public Criteria andTipoclienteIsNotNull() {
            addCriterion("tipocliente is not null");
            return (Criteria) this;
        }

        public Criteria andTipoclienteEqualTo(String value) {
            addCriterion("tipocliente =", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteNotEqualTo(String value) {
            addCriterion("tipocliente <>", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteGreaterThan(String value) {
            addCriterion("tipocliente >", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteGreaterThanOrEqualTo(String value) {
            addCriterion("tipocliente >=", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteLessThan(String value) {
            addCriterion("tipocliente <", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteLessThanOrEqualTo(String value) {
            addCriterion("tipocliente <=", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteLike(String value) {
            addCriterion("tipocliente like", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteNotLike(String value) {
            addCriterion("tipocliente not like", value, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteIn(List<String> values) {
            addCriterion("tipocliente in", values, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteNotIn(List<String> values) {
            addCriterion("tipocliente not in", values, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteBetween(String value1, String value2) {
            addCriterion("tipocliente between", value1, value2, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andTipoclienteNotBetween(String value1, String value2) {
            addCriterion("tipocliente not between", value1, value2, "tipocliente");
            return (Criteria) this;
        }

        public Criteria andRubroIsNull() {
            addCriterion("rubro is null");
            return (Criteria) this;
        }

        public Criteria andRubroIsNotNull() {
            addCriterion("rubro is not null");
            return (Criteria) this;
        }

        public Criteria andRubroEqualTo(String value) {
            addCriterion("rubro =", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroNotEqualTo(String value) {
            addCriterion("rubro <>", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroGreaterThan(String value) {
            addCriterion("rubro >", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroGreaterThanOrEqualTo(String value) {
            addCriterion("rubro >=", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroLessThan(String value) {
            addCriterion("rubro <", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroLessThanOrEqualTo(String value) {
            addCriterion("rubro <=", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroLike(String value) {
            addCriterion("rubro like", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroNotLike(String value) {
            addCriterion("rubro not like", value, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroIn(List<String> values) {
            addCriterion("rubro in", values, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroNotIn(List<String> values) {
            addCriterion("rubro not in", values, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroBetween(String value1, String value2) {
            addCriterion("rubro between", value1, value2, "rubro");
            return (Criteria) this;
        }

        public Criteria andRubroNotBetween(String value1, String value2) {
            addCriterion("rubro not between", value1, value2, "rubro");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
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

        public Criteria andLimIsNull() {
            addCriterion("lim is null");
            return (Criteria) this;
        }

        public Criteria andLimIsNotNull() {
            addCriterion("lim is not null");
            return (Criteria) this;
        }

        public Criteria andLimEqualTo(String value) {
            addCriterion("lim =", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimNotEqualTo(String value) {
            addCriterion("lim <>", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimGreaterThan(String value) {
            addCriterion("lim >", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimGreaterThanOrEqualTo(String value) {
            addCriterion("lim >=", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimLessThan(String value) {
            addCriterion("lim <", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimLessThanOrEqualTo(String value) {
            addCriterion("lim <=", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimLike(String value) {
            addCriterion("lim like", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimNotLike(String value) {
            addCriterion("lim not like", value, "lim");
            return (Criteria) this;
        }

        public Criteria andLimIn(List<String> values) {
            addCriterion("lim in", values, "lim");
            return (Criteria) this;
        }

        public Criteria andLimNotIn(List<String> values) {
            addCriterion("lim not in", values, "lim");
            return (Criteria) this;
        }

        public Criteria andLimBetween(String value1, String value2) {
            addCriterion("lim between", value1, value2, "lim");
            return (Criteria) this;
        }

        public Criteria andLimNotBetween(String value1, String value2) {
            addCriterion("lim not between", value1, value2, "lim");
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

        public Criteria andTipoCreditoIsNull() {
            addCriterion("tipo_credito is null");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoIsNotNull() {
            addCriterion("tipo_credito is not null");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoEqualTo(String value) {
            addCriterion("tipo_credito =", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoNotEqualTo(String value) {
            addCriterion("tipo_credito <>", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoGreaterThan(String value) {
            addCriterion("tipo_credito >", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_credito >=", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoLessThan(String value) {
            addCriterion("tipo_credito <", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoLessThanOrEqualTo(String value) {
            addCriterion("tipo_credito <=", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoLike(String value) {
            addCriterion("tipo_credito like", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoNotLike(String value) {
            addCriterion("tipo_credito not like", value, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoIn(List<String> values) {
            addCriterion("tipo_credito in", values, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoNotIn(List<String> values) {
            addCriterion("tipo_credito not in", values, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoBetween(String value1, String value2) {
            addCriterion("tipo_credito between", value1, value2, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoCreditoNotBetween(String value1, String value2) {
            addCriterion("tipo_credito not between", value1, value2, "tipoCredito");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionIsNull() {
            addCriterion("tipo_facturacion is null");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionIsNotNull() {
            addCriterion("tipo_facturacion is not null");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionEqualTo(String value) {
            addCriterion("tipo_facturacion =", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionNotEqualTo(String value) {
            addCriterion("tipo_facturacion <>", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionGreaterThan(String value) {
            addCriterion("tipo_facturacion >", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_facturacion >=", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionLessThan(String value) {
            addCriterion("tipo_facturacion <", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionLessThanOrEqualTo(String value) {
            addCriterion("tipo_facturacion <=", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionLike(String value) {
            addCriterion("tipo_facturacion like", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionNotLike(String value) {
            addCriterion("tipo_facturacion not like", value, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionIn(List<String> values) {
            addCriterion("tipo_facturacion in", values, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionNotIn(List<String> values) {
            addCriterion("tipo_facturacion not in", values, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionBetween(String value1, String value2) {
            addCriterion("tipo_facturacion between", value1, value2, "tipoFacturacion");
            return (Criteria) this;
        }

        public Criteria andTipoFacturacionNotBetween(String value1, String value2) {
            addCriterion("tipo_facturacion not between", value1, value2, "tipoFacturacion");
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

        public Criteria andPeriodoFacIsNull() {
            addCriterion("periodo_fac is null");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacIsNotNull() {
            addCriterion("periodo_fac is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacEqualTo(String value) {
            addCriterion("periodo_fac =", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacNotEqualTo(String value) {
            addCriterion("periodo_fac <>", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacGreaterThan(String value) {
            addCriterion("periodo_fac >", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacGreaterThanOrEqualTo(String value) {
            addCriterion("periodo_fac >=", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacLessThan(String value) {
            addCriterion("periodo_fac <", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacLessThanOrEqualTo(String value) {
            addCriterion("periodo_fac <=", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacLike(String value) {
            addCriterion("periodo_fac like", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacNotLike(String value) {
            addCriterion("periodo_fac not like", value, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacIn(List<String> values) {
            addCriterion("periodo_fac in", values, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacNotIn(List<String> values) {
            addCriterion("periodo_fac not in", values, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacBetween(String value1, String value2) {
            addCriterion("periodo_fac between", value1, value2, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andPeriodoFacNotBetween(String value1, String value2) {
            addCriterion("periodo_fac not between", value1, value2, "periodoFac");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoIsNull() {
            addCriterion("dias_credito is null");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoIsNotNull() {
            addCriterion("dias_credito is not null");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoEqualTo(Integer value) {
            addCriterion("dias_credito =", value, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoNotEqualTo(Integer value) {
            addCriterion("dias_credito <>", value, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoGreaterThan(Integer value) {
            addCriterion("dias_credito >", value, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dias_credito >=", value, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoLessThan(Integer value) {
            addCriterion("dias_credito <", value, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoLessThanOrEqualTo(Integer value) {
            addCriterion("dias_credito <=", value, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoIn(List<Integer> values) {
            addCriterion("dias_credito in", values, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoNotIn(List<Integer> values) {
            addCriterion("dias_credito not in", values, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoBetween(Integer value1, Integer value2) {
            addCriterion("dias_credito between", value1, value2, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andDiasCreditoNotBetween(Integer value1, Integer value2) {
            addCriterion("dias_credito not between", value1, value2, "diasCredito");
            return (Criteria) this;
        }

        public Criteria andCreditoIsNull() {
            addCriterion("credito is null");
            return (Criteria) this;
        }

        public Criteria andCreditoIsNotNull() {
            addCriterion("credito is not null");
            return (Criteria) this;
        }

        public Criteria andCreditoEqualTo(BigDecimal value) {
            addCriterion("credito =", value, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoNotEqualTo(BigDecimal value) {
            addCriterion("credito <>", value, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoGreaterThan(BigDecimal value) {
            addCriterion("credito >", value, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credito >=", value, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoLessThan(BigDecimal value) {
            addCriterion("credito <", value, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credito <=", value, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoIn(List<BigDecimal> values) {
            addCriterion("credito in", values, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoNotIn(List<BigDecimal> values) {
            addCriterion("credito not in", values, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credito between", value1, value2, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credito not between", value1, value2, "credito");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoIsNull() {
            addCriterion("credito_utilizado is null");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoIsNotNull() {
            addCriterion("credito_utilizado is not null");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoEqualTo(BigDecimal value) {
            addCriterion("credito_utilizado =", value, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoNotEqualTo(BigDecimal value) {
            addCriterion("credito_utilizado <>", value, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoGreaterThan(BigDecimal value) {
            addCriterion("credito_utilizado >", value, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credito_utilizado >=", value, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoLessThan(BigDecimal value) {
            addCriterion("credito_utilizado <", value, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credito_utilizado <=", value, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoIn(List<BigDecimal> values) {
            addCriterion("credito_utilizado in", values, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoNotIn(List<BigDecimal> values) {
            addCriterion("credito_utilizado not in", values, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credito_utilizado between", value1, value2, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoUtilizadoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credito_utilizado not between", value1, value2, "creditoUtilizado");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleIsNull() {
            addCriterion("credito_disponible is null");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleIsNotNull() {
            addCriterion("credito_disponible is not null");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleEqualTo(BigDecimal value) {
            addCriterion("credito_disponible =", value, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleNotEqualTo(BigDecimal value) {
            addCriterion("credito_disponible <>", value, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleGreaterThan(BigDecimal value) {
            addCriterion("credito_disponible >", value, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credito_disponible >=", value, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleLessThan(BigDecimal value) {
            addCriterion("credito_disponible <", value, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credito_disponible <=", value, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleIn(List<BigDecimal> values) {
            addCriterion("credito_disponible in", values, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleNotIn(List<BigDecimal> values) {
            addCriterion("credito_disponible not in", values, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credito_disponible between", value1, value2, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andCreditoDisponibleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credito_disponible not between", value1, value2, "creditoDisponible");
            return (Criteria) this;
        }

        public Criteria andSobregiroIsNull() {
            addCriterion("sobregiro is null");
            return (Criteria) this;
        }

        public Criteria andSobregiroIsNotNull() {
            addCriterion("sobregiro is not null");
            return (Criteria) this;
        }

        public Criteria andSobregiroEqualTo(BigDecimal value) {
            addCriterion("sobregiro =", value, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroNotEqualTo(BigDecimal value) {
            addCriterion("sobregiro <>", value, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroGreaterThan(BigDecimal value) {
            addCriterion("sobregiro >", value, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sobregiro >=", value, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroLessThan(BigDecimal value) {
            addCriterion("sobregiro <", value, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sobregiro <=", value, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroIn(List<BigDecimal> values) {
            addCriterion("sobregiro in", values, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroNotIn(List<BigDecimal> values) {
            addCriterion("sobregiro not in", values, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sobregiro between", value1, value2, "sobregiro");
            return (Criteria) this;
        }

        public Criteria andSobregiroNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sobregiro not between", value1, value2, "sobregiro");
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

        public Criteria andFechaInicioCreditoIsNull() {
            addCriterion("fecha_inicio_credito is null");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoIsNotNull() {
            addCriterion("fecha_inicio_credito is not null");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio_credito =", value, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio_credito <>", value, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha_inicio_credito >", value, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio_credito >=", value, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoLessThan(Date value) {
            addCriterionForJDBCDate("fecha_inicio_credito <", value, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_inicio_credito <=", value, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_inicio_credito in", values, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_inicio_credito not in", values, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_inicio_credito between", value1, value2, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaInicioCreditoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_inicio_credito not between", value1, value2, "fechaInicioCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoIsNull() {
            addCriterion("fecha_vence_credito is null");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoIsNotNull() {
            addCriterion("fecha_vence_credito is not null");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_vence_credito =", value, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoNotEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_vence_credito <>", value, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoGreaterThan(Date value) {
            addCriterionForJDBCDate("fecha_vence_credito >", value, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_vence_credito >=", value, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoLessThan(Date value) {
            addCriterionForJDBCDate("fecha_vence_credito <", value, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fecha_vence_credito <=", value, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_vence_credito in", values, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoNotIn(List<Date> values) {
            addCriterionForJDBCDate("fecha_vence_credito not in", values, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_vence_credito between", value1, value2, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andFechaVenceCreditoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fecha_vence_credito not between", value1, value2, "fechaVenceCredito");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIsNull() {
            addCriterion("tipo_documento is null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIsNotNull() {
            addCriterion("tipo_documento is not null");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoEqualTo(String value) {
            addCriterion("tipo_documento =", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotEqualTo(String value) {
            addCriterion("tipo_documento <>", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoGreaterThan(String value) {
            addCriterion("tipo_documento >", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_documento >=", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLessThan(String value) {
            addCriterion("tipo_documento <", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLessThanOrEqualTo(String value) {
            addCriterion("tipo_documento <=", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoLike(String value) {
            addCriterion("tipo_documento like", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotLike(String value) {
            addCriterion("tipo_documento not like", value, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoIn(List<String> values) {
            addCriterion("tipo_documento in", values, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotIn(List<String> values) {
            addCriterion("tipo_documento not in", values, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoBetween(String value1, String value2) {
            addCriterion("tipo_documento between", value1, value2, "tipoDocumento");
            return (Criteria) this;
        }

        public Criteria andTipoDocumentoNotBetween(String value1, String value2) {
            addCriterion("tipo_documento not between", value1, value2, "tipoDocumento");
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

        public Criteria andTelefono1IsNull() {
            addCriterion("telefono1 is null");
            return (Criteria) this;
        }

        public Criteria andTelefono1IsNotNull() {
            addCriterion("telefono1 is not null");
            return (Criteria) this;
        }

        public Criteria andTelefono1EqualTo(String value) {
            addCriterion("telefono1 =", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1NotEqualTo(String value) {
            addCriterion("telefono1 <>", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1GreaterThan(String value) {
            addCriterion("telefono1 >", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1GreaterThanOrEqualTo(String value) {
            addCriterion("telefono1 >=", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1LessThan(String value) {
            addCriterion("telefono1 <", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1LessThanOrEqualTo(String value) {
            addCriterion("telefono1 <=", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1Like(String value) {
            addCriterion("telefono1 like", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1NotLike(String value) {
            addCriterion("telefono1 not like", value, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1In(List<String> values) {
            addCriterion("telefono1 in", values, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1NotIn(List<String> values) {
            addCriterion("telefono1 not in", values, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1Between(String value1, String value2) {
            addCriterion("telefono1 between", value1, value2, "telefono1");
            return (Criteria) this;
        }

        public Criteria andTelefono1NotBetween(String value1, String value2) {
            addCriterion("telefono1 not between", value1, value2, "telefono1");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaIsNull() {
            addCriterion("cod_encuesta is null");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaIsNotNull() {
            addCriterion("cod_encuesta is not null");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaEqualTo(String value) {
            addCriterion("cod_encuesta =", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaNotEqualTo(String value) {
            addCriterion("cod_encuesta <>", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaGreaterThan(String value) {
            addCriterion("cod_encuesta >", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaGreaterThanOrEqualTo(String value) {
            addCriterion("cod_encuesta >=", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaLessThan(String value) {
            addCriterion("cod_encuesta <", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaLessThanOrEqualTo(String value) {
            addCriterion("cod_encuesta <=", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaLike(String value) {
            addCriterion("cod_encuesta like", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaNotLike(String value) {
            addCriterion("cod_encuesta not like", value, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaIn(List<String> values) {
            addCriterion("cod_encuesta in", values, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaNotIn(List<String> values) {
            addCriterion("cod_encuesta not in", values, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaBetween(String value1, String value2) {
            addCriterion("cod_encuesta between", value1, value2, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andCodEncuestaNotBetween(String value1, String value2) {
            addCriterion("cod_encuesta not between", value1, value2, "codEncuesta");
            return (Criteria) this;
        }

        public Criteria andHPactadaIsNull() {
            addCriterion("h_pactada is null");
            return (Criteria) this;
        }

        public Criteria andHPactadaIsNotNull() {
            addCriterion("h_pactada is not null");
            return (Criteria) this;
        }

        public Criteria andHPactadaEqualTo(Long value) {
            addCriterion("h_pactada =", value, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaNotEqualTo(Long value) {
            addCriterion("h_pactada <>", value, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaGreaterThan(Long value) {
            addCriterion("h_pactada >", value, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaGreaterThanOrEqualTo(Long value) {
            addCriterion("h_pactada >=", value, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaLessThan(Long value) {
            addCriterion("h_pactada <", value, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaLessThanOrEqualTo(Long value) {
            addCriterion("h_pactada <=", value, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaIn(List<Long> values) {
            addCriterion("h_pactada in", values, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaNotIn(List<Long> values) {
            addCriterion("h_pactada not in", values, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaBetween(Long value1, Long value2) {
            addCriterion("h_pactada between", value1, value2, "hPactada");
            return (Criteria) this;
        }

        public Criteria andHPactadaNotBetween(Long value1, Long value2) {
            addCriterion("h_pactada not between", value1, value2, "hPactada");
            return (Criteria) this;
        }

        public Criteria andTClienteIsNull() {
            addCriterion("t_cliente is null");
            return (Criteria) this;
        }

        public Criteria andTClienteIsNotNull() {
            addCriterion("t_cliente is not null");
            return (Criteria) this;
        }

        public Criteria andTClienteEqualTo(BigDecimal value) {
            addCriterion("t_cliente =", value, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteNotEqualTo(BigDecimal value) {
            addCriterion("t_cliente <>", value, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteGreaterThan(BigDecimal value) {
            addCriterion("t_cliente >", value, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t_cliente >=", value, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteLessThan(BigDecimal value) {
            addCriterion("t_cliente <", value, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t_cliente <=", value, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteIn(List<BigDecimal> values) {
            addCriterion("t_cliente in", values, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteNotIn(List<BigDecimal> values) {
            addCriterion("t_cliente not in", values, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_cliente between", value1, value2, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTClienteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_cliente not between", value1, value2, "tCliente");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalIsNull() {
            addCriterion("t_h_adicional is null");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalIsNotNull() {
            addCriterion("t_h_adicional is not null");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalEqualTo(BigDecimal value) {
            addCriterion("t_h_adicional =", value, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalNotEqualTo(BigDecimal value) {
            addCriterion("t_h_adicional <>", value, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalGreaterThan(BigDecimal value) {
            addCriterion("t_h_adicional >", value, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t_h_adicional >=", value, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalLessThan(BigDecimal value) {
            addCriterion("t_h_adicional <", value, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t_h_adicional <=", value, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalIn(List<BigDecimal> values) {
            addCriterion("t_h_adicional in", values, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalNotIn(List<BigDecimal> values) {
            addCriterion("t_h_adicional not in", values, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_h_adicional between", value1, value2, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTHAdicionalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_h_adicional not between", value1, value2, "tHAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalIsNull() {
            addCriterion("t_km_adicional is null");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalIsNotNull() {
            addCriterion("t_km_adicional is not null");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalEqualTo(BigDecimal value) {
            addCriterion("t_km_adicional =", value, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalNotEqualTo(BigDecimal value) {
            addCriterion("t_km_adicional <>", value, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalGreaterThan(BigDecimal value) {
            addCriterion("t_km_adicional >", value, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t_km_adicional >=", value, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalLessThan(BigDecimal value) {
            addCriterion("t_km_adicional <", value, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t_km_adicional <=", value, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalIn(List<BigDecimal> values) {
            addCriterion("t_km_adicional in", values, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalNotIn(List<BigDecimal> values) {
            addCriterion("t_km_adicional not in", values, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_km_adicional between", value1, value2, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andTKmAdicionalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t_km_adicional not between", value1, value2, "tKmAdicional");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNull() {
            addCriterion("email_2 is null");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNotNull() {
            addCriterion("email_2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail2EqualTo(String value) {
            addCriterion("email_2 =", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotEqualTo(String value) {
            addCriterion("email_2 <>", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThan(String value) {
            addCriterion("email_2 >", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThanOrEqualTo(String value) {
            addCriterion("email_2 >=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThan(String value) {
            addCriterion("email_2 <", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThanOrEqualTo(String value) {
            addCriterion("email_2 <=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Like(String value) {
            addCriterion("email_2 like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotLike(String value) {
            addCriterion("email_2 not like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2In(List<String> values) {
            addCriterion("email_2 in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotIn(List<String> values) {
            addCriterion("email_2 not in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Between(String value1, String value2) {
            addCriterion("email_2 between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotBetween(String value1, String value2) {
            addCriterion("email_2 not between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andClasificaIsNull() {
            addCriterion("clasifica is null");
            return (Criteria) this;
        }

        public Criteria andClasificaIsNotNull() {
            addCriterion("clasifica is not null");
            return (Criteria) this;
        }

        public Criteria andClasificaEqualTo(String value) {
            addCriterion("clasifica =", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaNotEqualTo(String value) {
            addCriterion("clasifica <>", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaGreaterThan(String value) {
            addCriterion("clasifica >", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaGreaterThanOrEqualTo(String value) {
            addCriterion("clasifica >=", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaLessThan(String value) {
            addCriterion("clasifica <", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaLessThanOrEqualTo(String value) {
            addCriterion("clasifica <=", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaLike(String value) {
            addCriterion("clasifica like", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaNotLike(String value) {
            addCriterion("clasifica not like", value, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaIn(List<String> values) {
            addCriterion("clasifica in", values, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaNotIn(List<String> values) {
            addCriterion("clasifica not in", values, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaBetween(String value1, String value2) {
            addCriterion("clasifica between", value1, value2, "clasifica");
            return (Criteria) this;
        }

        public Criteria andClasificaNotBetween(String value1, String value2) {
            addCriterion("clasifica not between", value1, value2, "clasifica");
            return (Criteria) this;
        }

        public Criteria andCodempresaIsNull() {
            addCriterion("codempresa is null");
            return (Criteria) this;
        }

        public Criteria andCodempresaIsNotNull() {
            addCriterion("codempresa is not null");
            return (Criteria) this;
        }

        public Criteria andCodempresaEqualTo(String value) {
            addCriterion("codempresa =", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaNotEqualTo(String value) {
            addCriterion("codempresa <>", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaGreaterThan(String value) {
            addCriterion("codempresa >", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaGreaterThanOrEqualTo(String value) {
            addCriterion("codempresa >=", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaLessThan(String value) {
            addCriterion("codempresa <", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaLessThanOrEqualTo(String value) {
            addCriterion("codempresa <=", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaLike(String value) {
            addCriterion("codempresa like", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaNotLike(String value) {
            addCriterion("codempresa not like", value, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaIn(List<String> values) {
            addCriterion("codempresa in", values, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaNotIn(List<String> values) {
            addCriterion("codempresa not in", values, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaBetween(String value1, String value2) {
            addCriterion("codempresa between", value1, value2, "codempresa");
            return (Criteria) this;
        }

        public Criteria andCodempresaNotBetween(String value1, String value2) {
            addCriterion("codempresa not between", value1, value2, "codempresa");
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