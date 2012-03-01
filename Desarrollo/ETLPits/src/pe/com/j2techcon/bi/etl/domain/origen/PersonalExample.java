package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalExample() {
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

        public Criteria andCodigopersonalIsNull() {
            addCriterion("codigopersonal is null");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalIsNotNull() {
            addCriterion("codigopersonal is not null");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalEqualTo(String value) {
            addCriterion("codigopersonal =", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalNotEqualTo(String value) {
            addCriterion("codigopersonal <>", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalGreaterThan(String value) {
            addCriterion("codigopersonal >", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalGreaterThanOrEqualTo(String value) {
            addCriterion("codigopersonal >=", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalLessThan(String value) {
            addCriterion("codigopersonal <", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalLessThanOrEqualTo(String value) {
            addCriterion("codigopersonal <=", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalLike(String value) {
            addCriterion("codigopersonal like", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalNotLike(String value) {
            addCriterion("codigopersonal not like", value, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalIn(List<String> values) {
            addCriterion("codigopersonal in", values, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalNotIn(List<String> values) {
            addCriterion("codigopersonal not in", values, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalBetween(String value1, String value2) {
            addCriterion("codigopersonal between", value1, value2, "codigopersonal");
            return (Criteria) this;
        }

        public Criteria andCodigopersonalNotBetween(String value1, String value2) {
            addCriterion("codigopersonal not between", value1, value2, "codigopersonal");
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

        public Criteria andTipopersIsNull() {
            addCriterion("tipopers is null");
            return (Criteria) this;
        }

        public Criteria andTipopersIsNotNull() {
            addCriterion("tipopers is not null");
            return (Criteria) this;
        }

        public Criteria andTipopersEqualTo(String value) {
            addCriterion("tipopers =", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersNotEqualTo(String value) {
            addCriterion("tipopers <>", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersGreaterThan(String value) {
            addCriterion("tipopers >", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersGreaterThanOrEqualTo(String value) {
            addCriterion("tipopers >=", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersLessThan(String value) {
            addCriterion("tipopers <", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersLessThanOrEqualTo(String value) {
            addCriterion("tipopers <=", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersLike(String value) {
            addCriterion("tipopers like", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersNotLike(String value) {
            addCriterion("tipopers not like", value, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersIn(List<String> values) {
            addCriterion("tipopers in", values, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersNotIn(List<String> values) {
            addCriterion("tipopers not in", values, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersBetween(String value1, String value2) {
            addCriterion("tipopers between", value1, value2, "tipopers");
            return (Criteria) this;
        }

        public Criteria andTipopersNotBetween(String value1, String value2) {
            addCriterion("tipopers not between", value1, value2, "tipopers");
            return (Criteria) this;
        }

        public Criteria andCodtipoIsNull() {
            addCriterion("codtipo is null");
            return (Criteria) this;
        }

        public Criteria andCodtipoIsNotNull() {
            addCriterion("codtipo is not null");
            return (Criteria) this;
        }

        public Criteria andCodtipoEqualTo(String value) {
            addCriterion("codtipo =", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoNotEqualTo(String value) {
            addCriterion("codtipo <>", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoGreaterThan(String value) {
            addCriterion("codtipo >", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoGreaterThanOrEqualTo(String value) {
            addCriterion("codtipo >=", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoLessThan(String value) {
            addCriterion("codtipo <", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoLessThanOrEqualTo(String value) {
            addCriterion("codtipo <=", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoLike(String value) {
            addCriterion("codtipo like", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoNotLike(String value) {
            addCriterion("codtipo not like", value, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoIn(List<String> values) {
            addCriterion("codtipo in", values, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoNotIn(List<String> values) {
            addCriterion("codtipo not in", values, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoBetween(String value1, String value2) {
            addCriterion("codtipo between", value1, value2, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCodtipoNotBetween(String value1, String value2) {
            addCriterion("codtipo not between", value1, value2, "codtipo");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoIsNull() {
            addCriterion("coddepartamento is null");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoIsNotNull() {
            addCriterion("coddepartamento is not null");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoEqualTo(String value) {
            addCriterion("coddepartamento =", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoNotEqualTo(String value) {
            addCriterion("coddepartamento <>", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoGreaterThan(String value) {
            addCriterion("coddepartamento >", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("coddepartamento >=", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoLessThan(String value) {
            addCriterion("coddepartamento <", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoLessThanOrEqualTo(String value) {
            addCriterion("coddepartamento <=", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoLike(String value) {
            addCriterion("coddepartamento like", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoNotLike(String value) {
            addCriterion("coddepartamento not like", value, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoIn(List<String> values) {
            addCriterion("coddepartamento in", values, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoNotIn(List<String> values) {
            addCriterion("coddepartamento not in", values, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoBetween(String value1, String value2) {
            addCriterion("coddepartamento between", value1, value2, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCoddepartamentoNotBetween(String value1, String value2) {
            addCriterion("coddepartamento not between", value1, value2, "coddepartamento");
            return (Criteria) this;
        }

        public Criteria andCodbancoIsNull() {
            addCriterion("codbanco is null");
            return (Criteria) this;
        }

        public Criteria andCodbancoIsNotNull() {
            addCriterion("codbanco is not null");
            return (Criteria) this;
        }

        public Criteria andCodbancoEqualTo(String value) {
            addCriterion("codbanco =", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoNotEqualTo(String value) {
            addCriterion("codbanco <>", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoGreaterThan(String value) {
            addCriterion("codbanco >", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoGreaterThanOrEqualTo(String value) {
            addCriterion("codbanco >=", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoLessThan(String value) {
            addCriterion("codbanco <", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoLessThanOrEqualTo(String value) {
            addCriterion("codbanco <=", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoLike(String value) {
            addCriterion("codbanco like", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoNotLike(String value) {
            addCriterion("codbanco not like", value, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoIn(List<String> values) {
            addCriterion("codbanco in", values, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoNotIn(List<String> values) {
            addCriterion("codbanco not in", values, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoBetween(String value1, String value2) {
            addCriterion("codbanco between", value1, value2, "codbanco");
            return (Criteria) this;
        }

        public Criteria andCodbancoNotBetween(String value1, String value2) {
            addCriterion("codbanco not between", value1, value2, "codbanco");
            return (Criteria) this;
        }

        public Criteria andTipopagoIsNull() {
            addCriterion("tipopago is null");
            return (Criteria) this;
        }

        public Criteria andTipopagoIsNotNull() {
            addCriterion("tipopago is not null");
            return (Criteria) this;
        }

        public Criteria andTipopagoEqualTo(String value) {
            addCriterion("tipopago =", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoNotEqualTo(String value) {
            addCriterion("tipopago <>", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoGreaterThan(String value) {
            addCriterion("tipopago >", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoGreaterThanOrEqualTo(String value) {
            addCriterion("tipopago >=", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoLessThan(String value) {
            addCriterion("tipopago <", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoLessThanOrEqualTo(String value) {
            addCriterion("tipopago <=", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoLike(String value) {
            addCriterion("tipopago like", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoNotLike(String value) {
            addCriterion("tipopago not like", value, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoIn(List<String> values) {
            addCriterion("tipopago in", values, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoNotIn(List<String> values) {
            addCriterion("tipopago not in", values, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoBetween(String value1, String value2) {
            addCriterion("tipopago between", value1, value2, "tipopago");
            return (Criteria) this;
        }

        public Criteria andTipopagoNotBetween(String value1, String value2) {
            addCriterion("tipopago not between", value1, value2, "tipopago");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andAppaternoIsNull() {
            addCriterion("appaterno is null");
            return (Criteria) this;
        }

        public Criteria andAppaternoIsNotNull() {
            addCriterion("appaterno is not null");
            return (Criteria) this;
        }

        public Criteria andAppaternoEqualTo(String value) {
            addCriterion("appaterno =", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoNotEqualTo(String value) {
            addCriterion("appaterno <>", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoGreaterThan(String value) {
            addCriterion("appaterno >", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoGreaterThanOrEqualTo(String value) {
            addCriterion("appaterno >=", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoLessThan(String value) {
            addCriterion("appaterno <", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoLessThanOrEqualTo(String value) {
            addCriterion("appaterno <=", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoLike(String value) {
            addCriterion("appaterno like", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoNotLike(String value) {
            addCriterion("appaterno not like", value, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoIn(List<String> values) {
            addCriterion("appaterno in", values, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoNotIn(List<String> values) {
            addCriterion("appaterno not in", values, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoBetween(String value1, String value2) {
            addCriterion("appaterno between", value1, value2, "appaterno");
            return (Criteria) this;
        }

        public Criteria andAppaternoNotBetween(String value1, String value2) {
            addCriterion("appaterno not between", value1, value2, "appaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoIsNull() {
            addCriterion("apmaterno is null");
            return (Criteria) this;
        }

        public Criteria andApmaternoIsNotNull() {
            addCriterion("apmaterno is not null");
            return (Criteria) this;
        }

        public Criteria andApmaternoEqualTo(String value) {
            addCriterion("apmaterno =", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoNotEqualTo(String value) {
            addCriterion("apmaterno <>", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoGreaterThan(String value) {
            addCriterion("apmaterno >", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoGreaterThanOrEqualTo(String value) {
            addCriterion("apmaterno >=", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoLessThan(String value) {
            addCriterion("apmaterno <", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoLessThanOrEqualTo(String value) {
            addCriterion("apmaterno <=", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoLike(String value) {
            addCriterion("apmaterno like", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoNotLike(String value) {
            addCriterion("apmaterno not like", value, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoIn(List<String> values) {
            addCriterion("apmaterno in", values, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoNotIn(List<String> values) {
            addCriterion("apmaterno not in", values, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoBetween(String value1, String value2) {
            addCriterion("apmaterno between", value1, value2, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andApmaternoNotBetween(String value1, String value2) {
            addCriterion("apmaterno not between", value1, value2, "apmaterno");
            return (Criteria) this;
        }

        public Criteria andNombresIsNull() {
            addCriterion("nombres is null");
            return (Criteria) this;
        }

        public Criteria andNombresIsNotNull() {
            addCriterion("nombres is not null");
            return (Criteria) this;
        }

        public Criteria andNombresEqualTo(String value) {
            addCriterion("nombres =", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotEqualTo(String value) {
            addCriterion("nombres <>", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThan(String value) {
            addCriterion("nombres >", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThanOrEqualTo(String value) {
            addCriterion("nombres >=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThan(String value) {
            addCriterion("nombres <", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThanOrEqualTo(String value) {
            addCriterion("nombres <=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLike(String value) {
            addCriterion("nombres like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotLike(String value) {
            addCriterion("nombres not like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresIn(List<String> values) {
            addCriterion("nombres in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotIn(List<String> values) {
            addCriterion("nombres not in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresBetween(String value1, String value2) {
            addCriterion("nombres between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotBetween(String value1, String value2) {
            addCriterion("nombres not between", value1, value2, "nombres");
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

        public Criteria andUbigeonacIsNull() {
            addCriterion("ubigeonac is null");
            return (Criteria) this;
        }

        public Criteria andUbigeonacIsNotNull() {
            addCriterion("ubigeonac is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeonacEqualTo(String value) {
            addCriterion("ubigeonac =", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacNotEqualTo(String value) {
            addCriterion("ubigeonac <>", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacGreaterThan(String value) {
            addCriterion("ubigeonac >", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeonac >=", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacLessThan(String value) {
            addCriterion("ubigeonac <", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacLessThanOrEqualTo(String value) {
            addCriterion("ubigeonac <=", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacLike(String value) {
            addCriterion("ubigeonac like", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacNotLike(String value) {
            addCriterion("ubigeonac not like", value, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacIn(List<String> values) {
            addCriterion("ubigeonac in", values, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacNotIn(List<String> values) {
            addCriterion("ubigeonac not in", values, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacBetween(String value1, String value2) {
            addCriterion("ubigeonac between", value1, value2, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andUbigeonacNotBetween(String value1, String value2) {
            addCriterion("ubigeonac not between", value1, value2, "ubigeonac");
            return (Criteria) this;
        }

        public Criteria andFechanacIsNull() {
            addCriterion("fechanac is null");
            return (Criteria) this;
        }

        public Criteria andFechanacIsNotNull() {
            addCriterion("fechanac is not null");
            return (Criteria) this;
        }

        public Criteria andFechanacEqualTo(Date value) {
            addCriterion("fechanac =", value, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacNotEqualTo(Date value) {
            addCriterion("fechanac <>", value, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacGreaterThan(Date value) {
            addCriterion("fechanac >", value, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacGreaterThanOrEqualTo(Date value) {
            addCriterion("fechanac >=", value, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacLessThan(Date value) {
            addCriterion("fechanac <", value, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacLessThanOrEqualTo(Date value) {
            addCriterion("fechanac <=", value, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacIn(List<Date> values) {
            addCriterion("fechanac in", values, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacNotIn(List<Date> values) {
            addCriterion("fechanac not in", values, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacBetween(Date value1, Date value2) {
            addCriterion("fechanac between", value1, value2, "fechanac");
            return (Criteria) this;
        }

        public Criteria andFechanacNotBetween(Date value1, Date value2) {
            addCriterion("fechanac not between", value1, value2, "fechanac");
            return (Criteria) this;
        }

        public Criteria andEstadocivilIsNull() {
            addCriterion("estadocivil is null");
            return (Criteria) this;
        }

        public Criteria andEstadocivilIsNotNull() {
            addCriterion("estadocivil is not null");
            return (Criteria) this;
        }

        public Criteria andEstadocivilEqualTo(String value) {
            addCriterion("estadocivil =", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilNotEqualTo(String value) {
            addCriterion("estadocivil <>", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilGreaterThan(String value) {
            addCriterion("estadocivil >", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilGreaterThanOrEqualTo(String value) {
            addCriterion("estadocivil >=", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilLessThan(String value) {
            addCriterion("estadocivil <", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilLessThanOrEqualTo(String value) {
            addCriterion("estadocivil <=", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilLike(String value) {
            addCriterion("estadocivil like", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilNotLike(String value) {
            addCriterion("estadocivil not like", value, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilIn(List<String> values) {
            addCriterion("estadocivil in", values, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilNotIn(List<String> values) {
            addCriterion("estadocivil not in", values, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilBetween(String value1, String value2) {
            addCriterion("estadocivil between", value1, value2, "estadocivil");
            return (Criteria) this;
        }

        public Criteria andEstadocivilNotBetween(String value1, String value2) {
            addCriterion("estadocivil not between", value1, value2, "estadocivil");
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

        public Criteria andLmilitarIsNull() {
            addCriterion("lmilitar is null");
            return (Criteria) this;
        }

        public Criteria andLmilitarIsNotNull() {
            addCriterion("lmilitar is not null");
            return (Criteria) this;
        }

        public Criteria andLmilitarEqualTo(String value) {
            addCriterion("lmilitar =", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarNotEqualTo(String value) {
            addCriterion("lmilitar <>", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarGreaterThan(String value) {
            addCriterion("lmilitar >", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarGreaterThanOrEqualTo(String value) {
            addCriterion("lmilitar >=", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarLessThan(String value) {
            addCriterion("lmilitar <", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarLessThanOrEqualTo(String value) {
            addCriterion("lmilitar <=", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarLike(String value) {
            addCriterion("lmilitar like", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarNotLike(String value) {
            addCriterion("lmilitar not like", value, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarIn(List<String> values) {
            addCriterion("lmilitar in", values, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarNotIn(List<String> values) {
            addCriterion("lmilitar not in", values, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarBetween(String value1, String value2) {
            addCriterion("lmilitar between", value1, value2, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andLmilitarNotBetween(String value1, String value2) {
            addCriterion("lmilitar not between", value1, value2, "lmilitar");
            return (Criteria) this;
        }

        public Criteria andNroafpIsNull() {
            addCriterion("nroafp is null");
            return (Criteria) this;
        }

        public Criteria andNroafpIsNotNull() {
            addCriterion("nroafp is not null");
            return (Criteria) this;
        }

        public Criteria andNroafpEqualTo(String value) {
            addCriterion("nroafp =", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpNotEqualTo(String value) {
            addCriterion("nroafp <>", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpGreaterThan(String value) {
            addCriterion("nroafp >", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpGreaterThanOrEqualTo(String value) {
            addCriterion("nroafp >=", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpLessThan(String value) {
            addCriterion("nroafp <", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpLessThanOrEqualTo(String value) {
            addCriterion("nroafp <=", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpLike(String value) {
            addCriterion("nroafp like", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpNotLike(String value) {
            addCriterion("nroafp not like", value, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpIn(List<String> values) {
            addCriterion("nroafp in", values, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpNotIn(List<String> values) {
            addCriterion("nroafp not in", values, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpBetween(String value1, String value2) {
            addCriterion("nroafp between", value1, value2, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNroafpNotBetween(String value1, String value2) {
            addCriterion("nroafp not between", value1, value2, "nroafp");
            return (Criteria) this;
        }

        public Criteria andNrorucIsNull() {
            addCriterion("nroruc is null");
            return (Criteria) this;
        }

        public Criteria andNrorucIsNotNull() {
            addCriterion("nroruc is not null");
            return (Criteria) this;
        }

        public Criteria andNrorucEqualTo(String value) {
            addCriterion("nroruc =", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucNotEqualTo(String value) {
            addCriterion("nroruc <>", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucGreaterThan(String value) {
            addCriterion("nroruc >", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucGreaterThanOrEqualTo(String value) {
            addCriterion("nroruc >=", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucLessThan(String value) {
            addCriterion("nroruc <", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucLessThanOrEqualTo(String value) {
            addCriterion("nroruc <=", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucLike(String value) {
            addCriterion("nroruc like", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucNotLike(String value) {
            addCriterion("nroruc not like", value, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucIn(List<String> values) {
            addCriterion("nroruc in", values, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucNotIn(List<String> values) {
            addCriterion("nroruc not in", values, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucBetween(String value1, String value2) {
            addCriterion("nroruc between", value1, value2, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrorucNotBetween(String value1, String value2) {
            addCriterion("nroruc not between", value1, value2, "nroruc");
            return (Criteria) this;
        }

        public Criteria andNrocuentaIsNull() {
            addCriterion("nrocuenta is null");
            return (Criteria) this;
        }

        public Criteria andNrocuentaIsNotNull() {
            addCriterion("nrocuenta is not null");
            return (Criteria) this;
        }

        public Criteria andNrocuentaEqualTo(String value) {
            addCriterion("nrocuenta =", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaNotEqualTo(String value) {
            addCriterion("nrocuenta <>", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaGreaterThan(String value) {
            addCriterion("nrocuenta >", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaGreaterThanOrEqualTo(String value) {
            addCriterion("nrocuenta >=", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaLessThan(String value) {
            addCriterion("nrocuenta <", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaLessThanOrEqualTo(String value) {
            addCriterion("nrocuenta <=", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaLike(String value) {
            addCriterion("nrocuenta like", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaNotLike(String value) {
            addCriterion("nrocuenta not like", value, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaIn(List<String> values) {
            addCriterion("nrocuenta in", values, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaNotIn(List<String> values) {
            addCriterion("nrocuenta not in", values, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaBetween(String value1, String value2) {
            addCriterion("nrocuenta between", value1, value2, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNrocuentaNotBetween(String value1, String value2) {
            addCriterion("nrocuenta not between", value1, value2, "nrocuenta");
            return (Criteria) this;
        }

        public Criteria andNroessaludIsNull() {
            addCriterion("nroessalud is null");
            return (Criteria) this;
        }

        public Criteria andNroessaludIsNotNull() {
            addCriterion("nroessalud is not null");
            return (Criteria) this;
        }

        public Criteria andNroessaludEqualTo(String value) {
            addCriterion("nroessalud =", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludNotEqualTo(String value) {
            addCriterion("nroessalud <>", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludGreaterThan(String value) {
            addCriterion("nroessalud >", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludGreaterThanOrEqualTo(String value) {
            addCriterion("nroessalud >=", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludLessThan(String value) {
            addCriterion("nroessalud <", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludLessThanOrEqualTo(String value) {
            addCriterion("nroessalud <=", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludLike(String value) {
            addCriterion("nroessalud like", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludNotLike(String value) {
            addCriterion("nroessalud not like", value, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludIn(List<String> values) {
            addCriterion("nroessalud in", values, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludNotIn(List<String> values) {
            addCriterion("nroessalud not in", values, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludBetween(String value1, String value2) {
            addCriterion("nroessalud between", value1, value2, "nroessalud");
            return (Criteria) this;
        }

        public Criteria andNroessaludNotBetween(String value1, String value2) {
            addCriterion("nroessalud not between", value1, value2, "nroessalud");
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

        public Criteria andCorreoIsNull() {
            addCriterion("correo is null");
            return (Criteria) this;
        }

        public Criteria andCorreoIsNotNull() {
            addCriterion("correo is not null");
            return (Criteria) this;
        }

        public Criteria andCorreoEqualTo(String value) {
            addCriterion("correo =", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotEqualTo(String value) {
            addCriterion("correo <>", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoGreaterThan(String value) {
            addCriterion("correo >", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoGreaterThanOrEqualTo(String value) {
            addCriterion("correo >=", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoLessThan(String value) {
            addCriterion("correo <", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoLessThanOrEqualTo(String value) {
            addCriterion("correo <=", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoLike(String value) {
            addCriterion("correo like", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotLike(String value) {
            addCriterion("correo not like", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoIn(List<String> values) {
            addCriterion("correo in", values, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotIn(List<String> values) {
            addCriterion("correo not in", values, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoBetween(String value1, String value2) {
            addCriterion("correo between", value1, value2, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotBetween(String value1, String value2) {
            addCriterion("correo not between", value1, value2, "correo");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalIsNull() {
            addCriterion("estadopersonal is null");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalIsNotNull() {
            addCriterion("estadopersonal is not null");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalEqualTo(String value) {
            addCriterion("estadopersonal =", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalNotEqualTo(String value) {
            addCriterion("estadopersonal <>", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalGreaterThan(String value) {
            addCriterion("estadopersonal >", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalGreaterThanOrEqualTo(String value) {
            addCriterion("estadopersonal >=", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalLessThan(String value) {
            addCriterion("estadopersonal <", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalLessThanOrEqualTo(String value) {
            addCriterion("estadopersonal <=", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalLike(String value) {
            addCriterion("estadopersonal like", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalNotLike(String value) {
            addCriterion("estadopersonal not like", value, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalIn(List<String> values) {
            addCriterion("estadopersonal in", values, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalNotIn(List<String> values) {
            addCriterion("estadopersonal not in", values, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalBetween(String value1, String value2) {
            addCriterion("estadopersonal between", value1, value2, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andEstadopersonalNotBetween(String value1, String value2) {
            addCriterion("estadopersonal not between", value1, value2, "estadopersonal");
            return (Criteria) this;
        }

        public Criteria andRecomendoIsNull() {
            addCriterion("recomendo is null");
            return (Criteria) this;
        }

        public Criteria andRecomendoIsNotNull() {
            addCriterion("recomendo is not null");
            return (Criteria) this;
        }

        public Criteria andRecomendoEqualTo(String value) {
            addCriterion("recomendo =", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoNotEqualTo(String value) {
            addCriterion("recomendo <>", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoGreaterThan(String value) {
            addCriterion("recomendo >", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoGreaterThanOrEqualTo(String value) {
            addCriterion("recomendo >=", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoLessThan(String value) {
            addCriterion("recomendo <", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoLessThanOrEqualTo(String value) {
            addCriterion("recomendo <=", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoLike(String value) {
            addCriterion("recomendo like", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoNotLike(String value) {
            addCriterion("recomendo not like", value, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoIn(List<String> values) {
            addCriterion("recomendo in", values, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoNotIn(List<String> values) {
            addCriterion("recomendo not in", values, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoBetween(String value1, String value2) {
            addCriterion("recomendo between", value1, value2, "recomendo");
            return (Criteria) this;
        }

        public Criteria andRecomendoNotBetween(String value1, String value2) {
            addCriterion("recomendo not between", value1, value2, "recomendo");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andUsuarioingesoIsNull() {
            addCriterion("usuarioingeso is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoIsNotNull() {
            addCriterion("usuarioingeso is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoEqualTo(String value) {
            addCriterion("usuarioingeso =", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoNotEqualTo(String value) {
            addCriterion("usuarioingeso <>", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoGreaterThan(String value) {
            addCriterion("usuarioingeso >", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoGreaterThanOrEqualTo(String value) {
            addCriterion("usuarioingeso >=", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoLessThan(String value) {
            addCriterion("usuarioingeso <", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoLessThanOrEqualTo(String value) {
            addCriterion("usuarioingeso <=", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoLike(String value) {
            addCriterion("usuarioingeso like", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoNotLike(String value) {
            addCriterion("usuarioingeso not like", value, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoIn(List<String> values) {
            addCriterion("usuarioingeso in", values, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoNotIn(List<String> values) {
            addCriterion("usuarioingeso not in", values, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoBetween(String value1, String value2) {
            addCriterion("usuarioingeso between", value1, value2, "usuarioingeso");
            return (Criteria) this;
        }

        public Criteria andUsuarioingesoNotBetween(String value1, String value2) {
            addCriterion("usuarioingeso not between", value1, value2, "usuarioingeso");
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
            addCriterion("fechaingreso =", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoNotEqualTo(Date value) {
            addCriterion("fechaingreso <>", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoGreaterThan(Date value) {
            addCriterion("fechaingreso >", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoGreaterThanOrEqualTo(Date value) {
            addCriterion("fechaingreso >=", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoLessThan(Date value) {
            addCriterion("fechaingreso <", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoLessThanOrEqualTo(Date value) {
            addCriterion("fechaingreso <=", value, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoIn(List<Date> values) {
            addCriterion("fechaingreso in", values, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoNotIn(List<Date> values) {
            addCriterion("fechaingreso not in", values, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoBetween(Date value1, Date value2) {
            addCriterion("fechaingreso between", value1, value2, "fechaingreso");
            return (Criteria) this;
        }

        public Criteria andFechaingresoNotBetween(Date value1, Date value2) {
            addCriterion("fechaingreso not between", value1, value2, "fechaingreso");
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

        public Criteria andFechaceseIsNull() {
            addCriterion("fechacese is null");
            return (Criteria) this;
        }

        public Criteria andFechaceseIsNotNull() {
            addCriterion("fechacese is not null");
            return (Criteria) this;
        }

        public Criteria andFechaceseEqualTo(Date value) {
            addCriterion("fechacese =", value, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseNotEqualTo(Date value) {
            addCriterion("fechacese <>", value, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseGreaterThan(Date value) {
            addCriterion("fechacese >", value, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseGreaterThanOrEqualTo(Date value) {
            addCriterion("fechacese >=", value, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseLessThan(Date value) {
            addCriterion("fechacese <", value, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseLessThanOrEqualTo(Date value) {
            addCriterion("fechacese <=", value, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseIn(List<Date> values) {
            addCriterion("fechacese in", values, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseNotIn(List<Date> values) {
            addCriterion("fechacese not in", values, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseBetween(Date value1, Date value2) {
            addCriterion("fechacese between", value1, value2, "fechacese");
            return (Criteria) this;
        }

        public Criteria andFechaceseNotBetween(Date value1, Date value2) {
            addCriterion("fechacese not between", value1, value2, "fechacese");
            return (Criteria) this;
        }

        public Criteria andHoraentradaIsNull() {
            addCriterion("horaentrada is null");
            return (Criteria) this;
        }

        public Criteria andHoraentradaIsNotNull() {
            addCriterion("horaentrada is not null");
            return (Criteria) this;
        }

        public Criteria andHoraentradaEqualTo(String value) {
            addCriterion("horaentrada =", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaNotEqualTo(String value) {
            addCriterion("horaentrada <>", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaGreaterThan(String value) {
            addCriterion("horaentrada >", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaGreaterThanOrEqualTo(String value) {
            addCriterion("horaentrada >=", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaLessThan(String value) {
            addCriterion("horaentrada <", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaLessThanOrEqualTo(String value) {
            addCriterion("horaentrada <=", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaLike(String value) {
            addCriterion("horaentrada like", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaNotLike(String value) {
            addCriterion("horaentrada not like", value, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaIn(List<String> values) {
            addCriterion("horaentrada in", values, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaNotIn(List<String> values) {
            addCriterion("horaentrada not in", values, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaBetween(String value1, String value2) {
            addCriterion("horaentrada between", value1, value2, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andHoraentradaNotBetween(String value1, String value2) {
            addCriterion("horaentrada not between", value1, value2, "horaentrada");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccIsNull() {
            addCriterion("tarifa_urbanacc is null");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccIsNotNull() {
            addCriterion("tarifa_urbanacc is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanacc =", value, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanacc <>", value, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccGreaterThan(BigDecimal value) {
            addCriterion("tarifa_urbanacc >", value, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanacc >=", value, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccLessThan(BigDecimal value) {
            addCriterion("tarifa_urbanacc <", value, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanacc <=", value, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccIn(List<BigDecimal> values) {
            addCriterion("tarifa_urbanacc in", values, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_urbanacc not in", values, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_urbanacc between", value1, value2, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanaccNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_urbanacc not between", value1, value2, "tarifaUrbanacc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascIsNull() {
            addCriterion("tarifa_urbanasc is null");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascIsNotNull() {
            addCriterion("tarifa_urbanasc is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanasc =", value, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanasc <>", value, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascGreaterThan(BigDecimal value) {
            addCriterion("tarifa_urbanasc >", value, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanasc >=", value, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascLessThan(BigDecimal value) {
            addCriterion("tarifa_urbanasc <", value, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_urbanasc <=", value, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascIn(List<BigDecimal> values) {
            addCriterion("tarifa_urbanasc in", values, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_urbanasc not in", values, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_urbanasc between", value1, value2, "tarifaUrbanasc");
            return (Criteria) this;
        }

        public Criteria andTarifaUrbanascNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_urbanasc not between", value1, value2, "tarifaUrbanasc");
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

        public Criteria andTarifaPerifericaccIsNull() {
            addCriterion("tarifa_perifericacc is null");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccIsNotNull() {
            addCriterion("tarifa_perifericacc is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericacc =", value, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericacc <>", value, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccGreaterThan(BigDecimal value) {
            addCriterion("tarifa_perifericacc >", value, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericacc >=", value, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccLessThan(BigDecimal value) {
            addCriterion("tarifa_perifericacc <", value, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericacc <=", value, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccIn(List<BigDecimal> values) {
            addCriterion("tarifa_perifericacc in", values, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_perifericacc not in", values, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_perifericacc between", value1, value2, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericaccNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_perifericacc not between", value1, value2, "tarifaPerifericacc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascIsNull() {
            addCriterion("tarifa_perifericasc is null");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascIsNotNull() {
            addCriterion("tarifa_perifericasc is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericasc =", value, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericasc <>", value, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascGreaterThan(BigDecimal value) {
            addCriterion("tarifa_perifericasc >", value, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericasc >=", value, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascLessThan(BigDecimal value) {
            addCriterion("tarifa_perifericasc <", value, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_perifericasc <=", value, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascIn(List<BigDecimal> values) {
            addCriterion("tarifa_perifericasc in", values, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_perifericasc not in", values, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_perifericasc between", value1, value2, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaPerifericascNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_perifericasc not between", value1, value2, "tarifaPerifericasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccIsNull() {
            addCriterion("tarifa_extremacc is null");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccIsNotNull() {
            addCriterion("tarifa_extremacc is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremacc =", value, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremacc <>", value, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccGreaterThan(BigDecimal value) {
            addCriterion("tarifa_extremacc >", value, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremacc >=", value, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccLessThan(BigDecimal value) {
            addCriterion("tarifa_extremacc <", value, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremacc <=", value, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccIn(List<BigDecimal> values) {
            addCriterion("tarifa_extremacc in", values, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_extremacc not in", values, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_extremacc between", value1, value2, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremaccNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_extremacc not between", value1, value2, "tarifaExtremacc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascIsNull() {
            addCriterion("tarifa_extremasc is null");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascIsNotNull() {
            addCriterion("tarifa_extremasc is not null");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremasc =", value, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascNotEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremasc <>", value, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascGreaterThan(BigDecimal value) {
            addCriterion("tarifa_extremasc >", value, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremasc >=", value, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascLessThan(BigDecimal value) {
            addCriterion("tarifa_extremasc <", value, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tarifa_extremasc <=", value, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascIn(List<BigDecimal> values) {
            addCriterion("tarifa_extremasc in", values, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascNotIn(List<BigDecimal> values) {
            addCriterion("tarifa_extremasc not in", values, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_extremasc between", value1, value2, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andTarifaExtremascNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tarifa_extremasc not between", value1, value2, "tarifaExtremasc");
            return (Criteria) this;
        }

        public Criteria andSexoIsNull() {
            addCriterion("sexo is null");
            return (Criteria) this;
        }

        public Criteria andSexoIsNotNull() {
            addCriterion("sexo is not null");
            return (Criteria) this;
        }

        public Criteria andSexoEqualTo(String value) {
            addCriterion("sexo =", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotEqualTo(String value) {
            addCriterion("sexo <>", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoGreaterThan(String value) {
            addCriterion("sexo >", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoGreaterThanOrEqualTo(String value) {
            addCriterion("sexo >=", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoLessThan(String value) {
            addCriterion("sexo <", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoLessThanOrEqualTo(String value) {
            addCriterion("sexo <=", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoLike(String value) {
            addCriterion("sexo like", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotLike(String value) {
            addCriterion("sexo not like", value, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoIn(List<String> values) {
            addCriterion("sexo in", values, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotIn(List<String> values) {
            addCriterion("sexo not in", values, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoBetween(String value1, String value2) {
            addCriterion("sexo between", value1, value2, "sexo");
            return (Criteria) this;
        }

        public Criteria andSexoNotBetween(String value1, String value2) {
            addCriterion("sexo not between", value1, value2, "sexo");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaIsNull() {
            addCriterion("correo_empresa is null");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaIsNotNull() {
            addCriterion("correo_empresa is not null");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaEqualTo(String value) {
            addCriterion("correo_empresa =", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaNotEqualTo(String value) {
            addCriterion("correo_empresa <>", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaGreaterThan(String value) {
            addCriterion("correo_empresa >", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaGreaterThanOrEqualTo(String value) {
            addCriterion("correo_empresa >=", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaLessThan(String value) {
            addCriterion("correo_empresa <", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaLessThanOrEqualTo(String value) {
            addCriterion("correo_empresa <=", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaLike(String value) {
            addCriterion("correo_empresa like", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaNotLike(String value) {
            addCriterion("correo_empresa not like", value, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaIn(List<String> values) {
            addCriterion("correo_empresa in", values, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaNotIn(List<String> values) {
            addCriterion("correo_empresa not in", values, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaBetween(String value1, String value2) {
            addCriterion("correo_empresa between", value1, value2, "correoEmpresa");
            return (Criteria) this;
        }

        public Criteria andCorreoEmpresaNotBetween(String value1, String value2) {
            addCriterion("correo_empresa not between", value1, value2, "correoEmpresa");
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

        public Criteria andDirempresaIsNull() {
            addCriterion("dirempresa is null");
            return (Criteria) this;
        }

        public Criteria andDirempresaIsNotNull() {
            addCriterion("dirempresa is not null");
            return (Criteria) this;
        }

        public Criteria andDirempresaEqualTo(String value) {
            addCriterion("dirempresa =", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaNotEqualTo(String value) {
            addCriterion("dirempresa <>", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaGreaterThan(String value) {
            addCriterion("dirempresa >", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaGreaterThanOrEqualTo(String value) {
            addCriterion("dirempresa >=", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaLessThan(String value) {
            addCriterion("dirempresa <", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaLessThanOrEqualTo(String value) {
            addCriterion("dirempresa <=", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaLike(String value) {
            addCriterion("dirempresa like", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaNotLike(String value) {
            addCriterion("dirempresa not like", value, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaIn(List<String> values) {
            addCriterion("dirempresa in", values, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaNotIn(List<String> values) {
            addCriterion("dirempresa not in", values, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaBetween(String value1, String value2) {
            addCriterion("dirempresa between", value1, value2, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andDirempresaNotBetween(String value1, String value2) {
            addCriterion("dirempresa not between", value1, value2, "dirempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaIsNull() {
            addCriterion("rucempresa is null");
            return (Criteria) this;
        }

        public Criteria andRucempresaIsNotNull() {
            addCriterion("rucempresa is not null");
            return (Criteria) this;
        }

        public Criteria andRucempresaEqualTo(String value) {
            addCriterion("rucempresa =", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaNotEqualTo(String value) {
            addCriterion("rucempresa <>", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaGreaterThan(String value) {
            addCriterion("rucempresa >", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaGreaterThanOrEqualTo(String value) {
            addCriterion("rucempresa >=", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaLessThan(String value) {
            addCriterion("rucempresa <", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaLessThanOrEqualTo(String value) {
            addCriterion("rucempresa <=", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaLike(String value) {
            addCriterion("rucempresa like", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaNotLike(String value) {
            addCriterion("rucempresa not like", value, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaIn(List<String> values) {
            addCriterion("rucempresa in", values, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaNotIn(List<String> values) {
            addCriterion("rucempresa not in", values, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaBetween(String value1, String value2) {
            addCriterion("rucempresa between", value1, value2, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andRucempresaNotBetween(String value1, String value2) {
            addCriterion("rucempresa not between", value1, value2, "rucempresa");
            return (Criteria) this;
        }

        public Criteria andTelefono2IsNull() {
            addCriterion("telefono2 is null");
            return (Criteria) this;
        }

        public Criteria andTelefono2IsNotNull() {
            addCriterion("telefono2 is not null");
            return (Criteria) this;
        }

        public Criteria andTelefono2EqualTo(String value) {
            addCriterion("telefono2 =", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2NotEqualTo(String value) {
            addCriterion("telefono2 <>", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2GreaterThan(String value) {
            addCriterion("telefono2 >", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2GreaterThanOrEqualTo(String value) {
            addCriterion("telefono2 >=", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2LessThan(String value) {
            addCriterion("telefono2 <", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2LessThanOrEqualTo(String value) {
            addCriterion("telefono2 <=", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2Like(String value) {
            addCriterion("telefono2 like", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2NotLike(String value) {
            addCriterion("telefono2 not like", value, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2In(List<String> values) {
            addCriterion("telefono2 in", values, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2NotIn(List<String> values) {
            addCriterion("telefono2 not in", values, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2Between(String value1, String value2) {
            addCriterion("telefono2 between", value1, value2, "telefono2");
            return (Criteria) this;
        }

        public Criteria andTelefono2NotBetween(String value1, String value2) {
            addCriterion("telefono2 not between", value1, value2, "telefono2");
            return (Criteria) this;
        }

        public Criteria andCorreo2IsNull() {
            addCriterion("correo2 is null");
            return (Criteria) this;
        }

        public Criteria andCorreo2IsNotNull() {
            addCriterion("correo2 is not null");
            return (Criteria) this;
        }

        public Criteria andCorreo2EqualTo(String value) {
            addCriterion("correo2 =", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2NotEqualTo(String value) {
            addCriterion("correo2 <>", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2GreaterThan(String value) {
            addCriterion("correo2 >", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2GreaterThanOrEqualTo(String value) {
            addCriterion("correo2 >=", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2LessThan(String value) {
            addCriterion("correo2 <", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2LessThanOrEqualTo(String value) {
            addCriterion("correo2 <=", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2Like(String value) {
            addCriterion("correo2 like", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2NotLike(String value) {
            addCriterion("correo2 not like", value, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2In(List<String> values) {
            addCriterion("correo2 in", values, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2NotIn(List<String> values) {
            addCriterion("correo2 not in", values, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2Between(String value1, String value2) {
            addCriterion("correo2 between", value1, value2, "correo2");
            return (Criteria) this;
        }

        public Criteria andCorreo2NotBetween(String value1, String value2) {
            addCriterion("correo2 not between", value1, value2, "correo2");
            return (Criteria) this;
        }

        public Criteria andCoddestinoIsNull() {
            addCriterion("coddestino is null");
            return (Criteria) this;
        }

        public Criteria andCoddestinoIsNotNull() {
            addCriterion("coddestino is not null");
            return (Criteria) this;
        }

        public Criteria andCoddestinoEqualTo(String value) {
            addCriterion("coddestino =", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoNotEqualTo(String value) {
            addCriterion("coddestino <>", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoGreaterThan(String value) {
            addCriterion("coddestino >", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoGreaterThanOrEqualTo(String value) {
            addCriterion("coddestino >=", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoLessThan(String value) {
            addCriterion("coddestino <", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoLessThanOrEqualTo(String value) {
            addCriterion("coddestino <=", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoLike(String value) {
            addCriterion("coddestino like", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoNotLike(String value) {
            addCriterion("coddestino not like", value, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoIn(List<String> values) {
            addCriterion("coddestino in", values, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoNotIn(List<String> values) {
            addCriterion("coddestino not in", values, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoBetween(String value1, String value2) {
            addCriterion("coddestino between", value1, value2, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCoddestinoNotBetween(String value1, String value2) {
            addCriterion("coddestino not between", value1, value2, "coddestino");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoIsNull() {
            addCriterion("codigojefedirecto is null");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoIsNotNull() {
            addCriterion("codigojefedirecto is not null");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoEqualTo(String value) {
            addCriterion("codigojefedirecto =", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoNotEqualTo(String value) {
            addCriterion("codigojefedirecto <>", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoGreaterThan(String value) {
            addCriterion("codigojefedirecto >", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoGreaterThanOrEqualTo(String value) {
            addCriterion("codigojefedirecto >=", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoLessThan(String value) {
            addCriterion("codigojefedirecto <", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoLessThanOrEqualTo(String value) {
            addCriterion("codigojefedirecto <=", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoLike(String value) {
            addCriterion("codigojefedirecto like", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoNotLike(String value) {
            addCriterion("codigojefedirecto not like", value, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoIn(List<String> values) {
            addCriterion("codigojefedirecto in", values, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoNotIn(List<String> values) {
            addCriterion("codigojefedirecto not in", values, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoBetween(String value1, String value2) {
            addCriterion("codigojefedirecto between", value1, value2, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andCodigojefedirectoNotBetween(String value1, String value2) {
            addCriterion("codigojefedirecto not between", value1, value2, "codigojefedirecto");
            return (Criteria) this;
        }

        public Criteria andZonaBonoIsNull() {
            addCriterion("zona_bono is null");
            return (Criteria) this;
        }

        public Criteria andZonaBonoIsNotNull() {
            addCriterion("zona_bono is not null");
            return (Criteria) this;
        }

        public Criteria andZonaBonoEqualTo(String value) {
            addCriterion("zona_bono =", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoNotEqualTo(String value) {
            addCriterion("zona_bono <>", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoGreaterThan(String value) {
            addCriterion("zona_bono >", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoGreaterThanOrEqualTo(String value) {
            addCriterion("zona_bono >=", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoLessThan(String value) {
            addCriterion("zona_bono <", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoLessThanOrEqualTo(String value) {
            addCriterion("zona_bono <=", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoLike(String value) {
            addCriterion("zona_bono like", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoNotLike(String value) {
            addCriterion("zona_bono not like", value, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoIn(List<String> values) {
            addCriterion("zona_bono in", values, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoNotIn(List<String> values) {
            addCriterion("zona_bono not in", values, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoBetween(String value1, String value2) {
            addCriterion("zona_bono between", value1, value2, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andZonaBonoNotBetween(String value1, String value2) {
            addCriterion("zona_bono not between", value1, value2, "zonaBono");
            return (Criteria) this;
        }

        public Criteria andCodventaIsNull() {
            addCriterion("codventa is null");
            return (Criteria) this;
        }

        public Criteria andCodventaIsNotNull() {
            addCriterion("codventa is not null");
            return (Criteria) this;
        }

        public Criteria andCodventaEqualTo(String value) {
            addCriterion("codventa =", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaNotEqualTo(String value) {
            addCriterion("codventa <>", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaGreaterThan(String value) {
            addCriterion("codventa >", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaGreaterThanOrEqualTo(String value) {
            addCriterion("codventa >=", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaLessThan(String value) {
            addCriterion("codventa <", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaLessThanOrEqualTo(String value) {
            addCriterion("codventa <=", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaLike(String value) {
            addCriterion("codventa like", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaNotLike(String value) {
            addCriterion("codventa not like", value, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaIn(List<String> values) {
            addCriterion("codventa in", values, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaNotIn(List<String> values) {
            addCriterion("codventa not in", values, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaBetween(String value1, String value2) {
            addCriterion("codventa between", value1, value2, "codventa");
            return (Criteria) this;
        }

        public Criteria andCodventaNotBetween(String value1, String value2) {
            addCriterion("codventa not between", value1, value2, "codventa");
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

        public Criteria andTipoComprobanteIsNull() {
            addCriterion("tipo_comprobante is null");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteIsNotNull() {
            addCriterion("tipo_comprobante is not null");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteEqualTo(String value) {
            addCriterion("tipo_comprobante =", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteNotEqualTo(String value) {
            addCriterion("tipo_comprobante <>", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteGreaterThan(String value) {
            addCriterion("tipo_comprobante >", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteGreaterThanOrEqualTo(String value) {
            addCriterion("tipo_comprobante >=", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteLessThan(String value) {
            addCriterion("tipo_comprobante <", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteLessThanOrEqualTo(String value) {
            addCriterion("tipo_comprobante <=", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteLike(String value) {
            addCriterion("tipo_comprobante like", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteNotLike(String value) {
            addCriterion("tipo_comprobante not like", value, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteIn(List<String> values) {
            addCriterion("tipo_comprobante in", values, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteNotIn(List<String> values) {
            addCriterion("tipo_comprobante not in", values, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteBetween(String value1, String value2) {
            addCriterion("tipo_comprobante between", value1, value2, "tipoComprobante");
            return (Criteria) this;
        }

        public Criteria andTipoComprobanteNotBetween(String value1, String value2) {
            addCriterion("tipo_comprobante not between", value1, value2, "tipoComprobante");
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