package pe.com.j2techcon.bi.etl.domain.origen;

import java.util.ArrayList;
import java.util.List;

public class SedesprovExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SedesprovExample() {
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

        public Criteria andNomsedeIsNull() {
            addCriterion("nomsede is null");
            return (Criteria) this;
        }

        public Criteria andNomsedeIsNotNull() {
            addCriterion("nomsede is not null");
            return (Criteria) this;
        }

        public Criteria andNomsedeEqualTo(String value) {
            addCriterion("nomsede =", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeNotEqualTo(String value) {
            addCriterion("nomsede <>", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeGreaterThan(String value) {
            addCriterion("nomsede >", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeGreaterThanOrEqualTo(String value) {
            addCriterion("nomsede >=", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeLessThan(String value) {
            addCriterion("nomsede <", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeLessThanOrEqualTo(String value) {
            addCriterion("nomsede <=", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeLike(String value) {
            addCriterion("nomsede like", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeNotLike(String value) {
            addCriterion("nomsede not like", value, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeIn(List<String> values) {
            addCriterion("nomsede in", values, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeNotIn(List<String> values) {
            addCriterion("nomsede not in", values, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeBetween(String value1, String value2) {
            addCriterion("nomsede between", value1, value2, "nomsede");
            return (Criteria) this;
        }

        public Criteria andNomsedeNotBetween(String value1, String value2) {
            addCriterion("nomsede not between", value1, value2, "nomsede");
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

        public Criteria andCiudadIsNull() {
            addCriterion("ciudad is null");
            return (Criteria) this;
        }

        public Criteria andCiudadIsNotNull() {
            addCriterion("ciudad is not null");
            return (Criteria) this;
        }

        public Criteria andCiudadEqualTo(String value) {
            addCriterion("ciudad =", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadNotEqualTo(String value) {
            addCriterion("ciudad <>", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadGreaterThan(String value) {
            addCriterion("ciudad >", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadGreaterThanOrEqualTo(String value) {
            addCriterion("ciudad >=", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadLessThan(String value) {
            addCriterion("ciudad <", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadLessThanOrEqualTo(String value) {
            addCriterion("ciudad <=", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadLike(String value) {
            addCriterion("ciudad like", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadNotLike(String value) {
            addCriterion("ciudad not like", value, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadIn(List<String> values) {
            addCriterion("ciudad in", values, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadNotIn(List<String> values) {
            addCriterion("ciudad not in", values, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadBetween(String value1, String value2) {
            addCriterion("ciudad between", value1, value2, "ciudad");
            return (Criteria) this;
        }

        public Criteria andCiudadNotBetween(String value1, String value2) {
            addCriterion("ciudad not between", value1, value2, "ciudad");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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

        public Criteria andAliasSedeIsNull() {
            addCriterion("alias_sede is null");
            return (Criteria) this;
        }

        public Criteria andAliasSedeIsNotNull() {
            addCriterion("alias_sede is not null");
            return (Criteria) this;
        }

        public Criteria andAliasSedeEqualTo(String value) {
            addCriterion("alias_sede =", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeNotEqualTo(String value) {
            addCriterion("alias_sede <>", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeGreaterThan(String value) {
            addCriterion("alias_sede >", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeGreaterThanOrEqualTo(String value) {
            addCriterion("alias_sede >=", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeLessThan(String value) {
            addCriterion("alias_sede <", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeLessThanOrEqualTo(String value) {
            addCriterion("alias_sede <=", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeLike(String value) {
            addCriterion("alias_sede like", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeNotLike(String value) {
            addCriterion("alias_sede not like", value, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeIn(List<String> values) {
            addCriterion("alias_sede in", values, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeNotIn(List<String> values) {
            addCriterion("alias_sede not in", values, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeBetween(String value1, String value2) {
            addCriterion("alias_sede between", value1, value2, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andAliasSedeNotBetween(String value1, String value2) {
            addCriterion("alias_sede not between", value1, value2, "aliasSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeIsNull() {
            addCriterion("ip_sede is null");
            return (Criteria) this;
        }

        public Criteria andIpSedeIsNotNull() {
            addCriterion("ip_sede is not null");
            return (Criteria) this;
        }

        public Criteria andIpSedeEqualTo(String value) {
            addCriterion("ip_sede =", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeNotEqualTo(String value) {
            addCriterion("ip_sede <>", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeGreaterThan(String value) {
            addCriterion("ip_sede >", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeGreaterThanOrEqualTo(String value) {
            addCriterion("ip_sede >=", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeLessThan(String value) {
            addCriterion("ip_sede <", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeLessThanOrEqualTo(String value) {
            addCriterion("ip_sede <=", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeLike(String value) {
            addCriterion("ip_sede like", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeNotLike(String value) {
            addCriterion("ip_sede not like", value, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeIn(List<String> values) {
            addCriterion("ip_sede in", values, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeNotIn(List<String> values) {
            addCriterion("ip_sede not in", values, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeBetween(String value1, String value2) {
            addCriterion("ip_sede between", value1, value2, "ipSede");
            return (Criteria) this;
        }

        public Criteria andIpSedeNotBetween(String value1, String value2) {
            addCriterion("ip_sede not between", value1, value2, "ipSede");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegIsNull() {
            addCriterion("nro_maq_reg is null");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegIsNotNull() {
            addCriterion("nro_maq_reg is not null");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegEqualTo(String value) {
            addCriterion("nro_maq_reg =", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegNotEqualTo(String value) {
            addCriterion("nro_maq_reg <>", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegGreaterThan(String value) {
            addCriterion("nro_maq_reg >", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegGreaterThanOrEqualTo(String value) {
            addCriterion("nro_maq_reg >=", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegLessThan(String value) {
            addCriterion("nro_maq_reg <", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegLessThanOrEqualTo(String value) {
            addCriterion("nro_maq_reg <=", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegLike(String value) {
            addCriterion("nro_maq_reg like", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegNotLike(String value) {
            addCriterion("nro_maq_reg not like", value, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegIn(List<String> values) {
            addCriterion("nro_maq_reg in", values, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegNotIn(List<String> values) {
            addCriterion("nro_maq_reg not in", values, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegBetween(String value1, String value2) {
            addCriterion("nro_maq_reg between", value1, value2, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroMaqRegNotBetween(String value1, String value2) {
            addCriterion("nro_maq_reg not between", value1, value2, "nroMaqReg");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionIsNull() {
            addCriterion("nro_autorizacion is null");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionIsNotNull() {
            addCriterion("nro_autorizacion is not null");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionEqualTo(String value) {
            addCriterion("nro_autorizacion =", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionNotEqualTo(String value) {
            addCriterion("nro_autorizacion <>", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionGreaterThan(String value) {
            addCriterion("nro_autorizacion >", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionGreaterThanOrEqualTo(String value) {
            addCriterion("nro_autorizacion >=", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionLessThan(String value) {
            addCriterion("nro_autorizacion <", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionLessThanOrEqualTo(String value) {
            addCriterion("nro_autorizacion <=", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionLike(String value) {
            addCriterion("nro_autorizacion like", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionNotLike(String value) {
            addCriterion("nro_autorizacion not like", value, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionIn(List<String> values) {
            addCriterion("nro_autorizacion in", values, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionNotIn(List<String> values) {
            addCriterion("nro_autorizacion not in", values, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionBetween(String value1, String value2) {
            addCriterion("nro_autorizacion between", value1, value2, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andNroAutorizacionNotBetween(String value1, String value2) {
            addCriterion("nro_autorizacion not between", value1, value2, "nroAutorizacion");
            return (Criteria) this;
        }

        public Criteria andTipoIsNull() {
            addCriterion("tipo is null");
            return (Criteria) this;
        }

        public Criteria andTipoIsNotNull() {
            addCriterion("tipo is not null");
            return (Criteria) this;
        }

        public Criteria andTipoEqualTo(Short value) {
            addCriterion("tipo =", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotEqualTo(Short value) {
            addCriterion("tipo <>", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoGreaterThan(Short value) {
            addCriterion("tipo >", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoGreaterThanOrEqualTo(Short value) {
            addCriterion("tipo >=", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoLessThan(Short value) {
            addCriterion("tipo <", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoLessThanOrEqualTo(Short value) {
            addCriterion("tipo <=", value, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoIn(List<Short> values) {
            addCriterion("tipo in", values, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotIn(List<Short> values) {
            addCriterion("tipo not in", values, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoBetween(Short value1, Short value2) {
            addCriterion("tipo between", value1, value2, "tipo");
            return (Criteria) this;
        }

        public Criteria andTipoNotBetween(Short value1, Short value2) {
            addCriterion("tipo not between", value1, value2, "tipo");
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