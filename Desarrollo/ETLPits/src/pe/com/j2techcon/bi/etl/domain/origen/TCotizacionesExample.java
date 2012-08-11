package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCotizacionesExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCotizacionesExample() {
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

        public Criteria andCoserieIsNull() {
            addCriterion("coserie is null");
            return (Criteria) this;
        }

        public Criteria andCoserieIsNotNull() {
            addCriterion("coserie is not null");
            return (Criteria) this;
        }

        public Criteria andCoserieEqualTo(String value) {
            addCriterion("coserie =", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotEqualTo(String value) {
            addCriterion("coserie <>", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieGreaterThan(String value) {
            addCriterion("coserie >", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieGreaterThanOrEqualTo(String value) {
            addCriterion("coserie >=", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieLessThan(String value) {
            addCriterion("coserie <", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieLessThanOrEqualTo(String value) {
            addCriterion("coserie <=", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieLike(String value) {
            addCriterion("coserie like", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotLike(String value) {
            addCriterion("coserie not like", value, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieIn(List<String> values) {
            addCriterion("coserie in", values, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotIn(List<String> values) {
            addCriterion("coserie not in", values, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieBetween(String value1, String value2) {
            addCriterion("coserie between", value1, value2, "coserie");
            return (Criteria) this;
        }

        public Criteria andCoserieNotBetween(String value1, String value2) {
            addCriterion("coserie not between", value1, value2, "coserie");
            return (Criteria) this;
        }

        public Criteria andConumeroIsNull() {
            addCriterion("conumero is null");
            return (Criteria) this;
        }

        public Criteria andConumeroIsNotNull() {
            addCriterion("conumero is not null");
            return (Criteria) this;
        }

        public Criteria andConumeroEqualTo(BigDecimal value) {
            addCriterion("conumero =", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroNotEqualTo(BigDecimal value) {
            addCriterion("conumero <>", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroGreaterThan(BigDecimal value) {
            addCriterion("conumero >", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("conumero >=", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroLessThan(BigDecimal value) {
            addCriterion("conumero <", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroLessThanOrEqualTo(BigDecimal value) {
            addCriterion("conumero <=", value, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroIn(List<BigDecimal> values) {
            addCriterion("conumero in", values, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroNotIn(List<BigDecimal> values) {
            addCriterion("conumero not in", values, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conumero between", value1, value2, "conumero");
            return (Criteria) this;
        }

        public Criteria andConumeroNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conumero not between", value1, value2, "conumero");
            return (Criteria) this;
        }

        public Criteria andRucDniIsNull() {
            addCriterion("ruc_dni is null");
            return (Criteria) this;
        }

        public Criteria andRucDniIsNotNull() {
            addCriterion("ruc_dni is not null");
            return (Criteria) this;
        }

        public Criteria andRucDniEqualTo(String value) {
            addCriterion("ruc_dni =", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniNotEqualTo(String value) {
            addCriterion("ruc_dni <>", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniGreaterThan(String value) {
            addCriterion("ruc_dni >", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniGreaterThanOrEqualTo(String value) {
            addCriterion("ruc_dni >=", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniLessThan(String value) {
            addCriterion("ruc_dni <", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniLessThanOrEqualTo(String value) {
            addCriterion("ruc_dni <=", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniLike(String value) {
            addCriterion("ruc_dni like", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniNotLike(String value) {
            addCriterion("ruc_dni not like", value, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniIn(List<String> values) {
            addCriterion("ruc_dni in", values, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniNotIn(List<String> values) {
            addCriterion("ruc_dni not in", values, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniBetween(String value1, String value2) {
            addCriterion("ruc_dni between", value1, value2, "rucDni");
            return (Criteria) this;
        }

        public Criteria andRucDniNotBetween(String value1, String value2) {
            addCriterion("ruc_dni not between", value1, value2, "rucDni");
            return (Criteria) this;
        }

        public Criteria andContactoIsNull() {
            addCriterion("contacto is null");
            return (Criteria) this;
        }

        public Criteria andContactoIsNotNull() {
            addCriterion("contacto is not null");
            return (Criteria) this;
        }

        public Criteria andContactoEqualTo(String value) {
            addCriterion("contacto =", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotEqualTo(String value) {
            addCriterion("contacto <>", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoGreaterThan(String value) {
            addCriterion("contacto >", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoGreaterThanOrEqualTo(String value) {
            addCriterion("contacto >=", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoLessThan(String value) {
            addCriterion("contacto <", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoLessThanOrEqualTo(String value) {
            addCriterion("contacto <=", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoLike(String value) {
            addCriterion("contacto like", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotLike(String value) {
            addCriterion("contacto not like", value, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoIn(List<String> values) {
            addCriterion("contacto in", values, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotIn(List<String> values) {
            addCriterion("contacto not in", values, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoBetween(String value1, String value2) {
            addCriterion("contacto between", value1, value2, "contacto");
            return (Criteria) this;
        }

        public Criteria andContactoNotBetween(String value1, String value2) {
            addCriterion("contacto not between", value1, value2, "contacto");
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

        public Criteria andCodpaiscontactoIsNull() {
            addCriterion("codpaiscontacto is null");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoIsNotNull() {
            addCriterion("codpaiscontacto is not null");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoEqualTo(String value) {
            addCriterion("codpaiscontacto =", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoNotEqualTo(String value) {
            addCriterion("codpaiscontacto <>", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoGreaterThan(String value) {
            addCriterion("codpaiscontacto >", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoGreaterThanOrEqualTo(String value) {
            addCriterion("codpaiscontacto >=", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoLessThan(String value) {
            addCriterion("codpaiscontacto <", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoLessThanOrEqualTo(String value) {
            addCriterion("codpaiscontacto <=", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoLike(String value) {
            addCriterion("codpaiscontacto like", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoNotLike(String value) {
            addCriterion("codpaiscontacto not like", value, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoIn(List<String> values) {
            addCriterion("codpaiscontacto in", values, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoNotIn(List<String> values) {
            addCriterion("codpaiscontacto not in", values, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoBetween(String value1, String value2) {
            addCriterion("codpaiscontacto between", value1, value2, "codpaiscontacto");
            return (Criteria) this;
        }

        public Criteria andCodpaiscontactoNotBetween(String value1, String value2) {
            addCriterion("codpaiscontacto not between", value1, value2, "codpaiscontacto");
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

        public Criteria andAnexoIsNull() {
            addCriterion("anexo is null");
            return (Criteria) this;
        }

        public Criteria andAnexoIsNotNull() {
            addCriterion("anexo is not null");
            return (Criteria) this;
        }

        public Criteria andAnexoEqualTo(String value) {
            addCriterion("anexo =", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoNotEqualTo(String value) {
            addCriterion("anexo <>", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoGreaterThan(String value) {
            addCriterion("anexo >", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoGreaterThanOrEqualTo(String value) {
            addCriterion("anexo >=", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoLessThan(String value) {
            addCriterion("anexo <", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoLessThanOrEqualTo(String value) {
            addCriterion("anexo <=", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoLike(String value) {
            addCriterion("anexo like", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoNotLike(String value) {
            addCriterion("anexo not like", value, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoIn(List<String> values) {
            addCriterion("anexo in", values, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoNotIn(List<String> values) {
            addCriterion("anexo not in", values, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoBetween(String value1, String value2) {
            addCriterion("anexo between", value1, value2, "anexo");
            return (Criteria) this;
        }

        public Criteria andAnexoNotBetween(String value1, String value2) {
            addCriterion("anexo not between", value1, value2, "anexo");
            return (Criteria) this;
        }

        public Criteria andCelularIsNull() {
            addCriterion("celular is null");
            return (Criteria) this;
        }

        public Criteria andCelularIsNotNull() {
            addCriterion("celular is not null");
            return (Criteria) this;
        }

        public Criteria andCelularEqualTo(String value) {
            addCriterion("celular =", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotEqualTo(String value) {
            addCriterion("celular <>", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularGreaterThan(String value) {
            addCriterion("celular >", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularGreaterThanOrEqualTo(String value) {
            addCriterion("celular >=", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularLessThan(String value) {
            addCriterion("celular <", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularLessThanOrEqualTo(String value) {
            addCriterion("celular <=", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularLike(String value) {
            addCriterion("celular like", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotLike(String value) {
            addCriterion("celular not like", value, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularIn(List<String> values) {
            addCriterion("celular in", values, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotIn(List<String> values) {
            addCriterion("celular not in", values, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularBetween(String value1, String value2) {
            addCriterion("celular between", value1, value2, "celular");
            return (Criteria) this;
        }

        public Criteria andCelularNotBetween(String value1, String value2) {
            addCriterion("celular not between", value1, value2, "celular");
            return (Criteria) this;
        }

        public Criteria andAreacontactoIsNull() {
            addCriterion("areacontacto is null");
            return (Criteria) this;
        }

        public Criteria andAreacontactoIsNotNull() {
            addCriterion("areacontacto is not null");
            return (Criteria) this;
        }

        public Criteria andAreacontactoEqualTo(String value) {
            addCriterion("areacontacto =", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotEqualTo(String value) {
            addCriterion("areacontacto <>", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoGreaterThan(String value) {
            addCriterion("areacontacto >", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoGreaterThanOrEqualTo(String value) {
            addCriterion("areacontacto >=", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoLessThan(String value) {
            addCriterion("areacontacto <", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoLessThanOrEqualTo(String value) {
            addCriterion("areacontacto <=", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoLike(String value) {
            addCriterion("areacontacto like", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotLike(String value) {
            addCriterion("areacontacto not like", value, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoIn(List<String> values) {
            addCriterion("areacontacto in", values, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotIn(List<String> values) {
            addCriterion("areacontacto not in", values, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoBetween(String value1, String value2) {
            addCriterion("areacontacto between", value1, value2, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andAreacontactoNotBetween(String value1, String value2) {
            addCriterion("areacontacto not between", value1, value2, "areacontacto");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaIsNull() {
            addCriterion("codtipoentrega is null");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaIsNotNull() {
            addCriterion("codtipoentrega is not null");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaEqualTo(String value) {
            addCriterion("codtipoentrega =", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaNotEqualTo(String value) {
            addCriterion("codtipoentrega <>", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaGreaterThan(String value) {
            addCriterion("codtipoentrega >", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaGreaterThanOrEqualTo(String value) {
            addCriterion("codtipoentrega >=", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaLessThan(String value) {
            addCriterion("codtipoentrega <", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaLessThanOrEqualTo(String value) {
            addCriterion("codtipoentrega <=", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaLike(String value) {
            addCriterion("codtipoentrega like", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaNotLike(String value) {
            addCriterion("codtipoentrega not like", value, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaIn(List<String> values) {
            addCriterion("codtipoentrega in", values, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaNotIn(List<String> values) {
            addCriterion("codtipoentrega not in", values, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaBetween(String value1, String value2) {
            addCriterion("codtipoentrega between", value1, value2, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCodtipoentregaNotBetween(String value1, String value2) {
            addCriterion("codtipoentrega not between", value1, value2, "codtipoentrega");
            return (Criteria) this;
        }

        public Criteria andCargocontactoIsNull() {
            addCriterion("cargocontacto is null");
            return (Criteria) this;
        }

        public Criteria andCargocontactoIsNotNull() {
            addCriterion("cargocontacto is not null");
            return (Criteria) this;
        }

        public Criteria andCargocontactoEqualTo(String value) {
            addCriterion("cargocontacto =", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoNotEqualTo(String value) {
            addCriterion("cargocontacto <>", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoGreaterThan(String value) {
            addCriterion("cargocontacto >", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoGreaterThanOrEqualTo(String value) {
            addCriterion("cargocontacto >=", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoLessThan(String value) {
            addCriterion("cargocontacto <", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoLessThanOrEqualTo(String value) {
            addCriterion("cargocontacto <=", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoLike(String value) {
            addCriterion("cargocontacto like", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoNotLike(String value) {
            addCriterion("cargocontacto not like", value, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoIn(List<String> values) {
            addCriterion("cargocontacto in", values, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoNotIn(List<String> values) {
            addCriterion("cargocontacto not in", values, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoBetween(String value1, String value2) {
            addCriterion("cargocontacto between", value1, value2, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andCargocontactoNotBetween(String value1, String value2) {
            addCriterion("cargocontacto not between", value1, value2, "cargocontacto");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenIsNull() {
            addCriterion("codpaisorigen is null");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenIsNotNull() {
            addCriterion("codpaisorigen is not null");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenEqualTo(String value) {
            addCriterion("codpaisorigen =", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenNotEqualTo(String value) {
            addCriterion("codpaisorigen <>", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenGreaterThan(String value) {
            addCriterion("codpaisorigen >", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenGreaterThanOrEqualTo(String value) {
            addCriterion("codpaisorigen >=", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenLessThan(String value) {
            addCriterion("codpaisorigen <", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenLessThanOrEqualTo(String value) {
            addCriterion("codpaisorigen <=", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenLike(String value) {
            addCriterion("codpaisorigen like", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenNotLike(String value) {
            addCriterion("codpaisorigen not like", value, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenIn(List<String> values) {
            addCriterion("codpaisorigen in", values, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenNotIn(List<String> values) {
            addCriterion("codpaisorigen not in", values, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenBetween(String value1, String value2) {
            addCriterion("codpaisorigen between", value1, value2, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisorigenNotBetween(String value1, String value2) {
            addCriterion("codpaisorigen not between", value1, value2, "codpaisorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenIsNull() {
            addCriterion("ciudadorigen is null");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenIsNotNull() {
            addCriterion("ciudadorigen is not null");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenEqualTo(String value) {
            addCriterion("ciudadorigen =", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenNotEqualTo(String value) {
            addCriterion("ciudadorigen <>", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenGreaterThan(String value) {
            addCriterion("ciudadorigen >", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenGreaterThanOrEqualTo(String value) {
            addCriterion("ciudadorigen >=", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenLessThan(String value) {
            addCriterion("ciudadorigen <", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenLessThanOrEqualTo(String value) {
            addCriterion("ciudadorigen <=", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenLike(String value) {
            addCriterion("ciudadorigen like", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenNotLike(String value) {
            addCriterion("ciudadorigen not like", value, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenIn(List<String> values) {
            addCriterion("ciudadorigen in", values, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenNotIn(List<String> values) {
            addCriterion("ciudadorigen not in", values, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenBetween(String value1, String value2) {
            addCriterion("ciudadorigen between", value1, value2, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andCiudadorigenNotBetween(String value1, String value2) {
            addCriterion("ciudadorigen not between", value1, value2, "ciudadorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenIsNull() {
            addCriterion("puertoorigen is null");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenIsNotNull() {
            addCriterion("puertoorigen is not null");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenEqualTo(String value) {
            addCriterion("puertoorigen =", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenNotEqualTo(String value) {
            addCriterion("puertoorigen <>", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenGreaterThan(String value) {
            addCriterion("puertoorigen >", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenGreaterThanOrEqualTo(String value) {
            addCriterion("puertoorigen >=", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenLessThan(String value) {
            addCriterion("puertoorigen <", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenLessThanOrEqualTo(String value) {
            addCriterion("puertoorigen <=", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenLike(String value) {
            addCriterion("puertoorigen like", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenNotLike(String value) {
            addCriterion("puertoorigen not like", value, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenIn(List<String> values) {
            addCriterion("puertoorigen in", values, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenNotIn(List<String> values) {
            addCriterion("puertoorigen not in", values, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenBetween(String value1, String value2) {
            addCriterion("puertoorigen between", value1, value2, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andPuertoorigenNotBetween(String value1, String value2) {
            addCriterion("puertoorigen not between", value1, value2, "puertoorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenIsNull() {
            addCriterion("obsorigen is null");
            return (Criteria) this;
        }

        public Criteria andObsorigenIsNotNull() {
            addCriterion("obsorigen is not null");
            return (Criteria) this;
        }

        public Criteria andObsorigenEqualTo(String value) {
            addCriterion("obsorigen =", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenNotEqualTo(String value) {
            addCriterion("obsorigen <>", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenGreaterThan(String value) {
            addCriterion("obsorigen >", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenGreaterThanOrEqualTo(String value) {
            addCriterion("obsorigen >=", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenLessThan(String value) {
            addCriterion("obsorigen <", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenLessThanOrEqualTo(String value) {
            addCriterion("obsorigen <=", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenLike(String value) {
            addCriterion("obsorigen like", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenNotLike(String value) {
            addCriterion("obsorigen not like", value, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenIn(List<String> values) {
            addCriterion("obsorigen in", values, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenNotIn(List<String> values) {
            addCriterion("obsorigen not in", values, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenBetween(String value1, String value2) {
            addCriterion("obsorigen between", value1, value2, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andObsorigenNotBetween(String value1, String value2) {
            addCriterion("obsorigen not between", value1, value2, "obsorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenIsNull() {
            addCriterion("transporteorigen is null");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenIsNotNull() {
            addCriterion("transporteorigen is not null");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenEqualTo(String value) {
            addCriterion("transporteorigen =", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenNotEqualTo(String value) {
            addCriterion("transporteorigen <>", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenGreaterThan(String value) {
            addCriterion("transporteorigen >", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenGreaterThanOrEqualTo(String value) {
            addCriterion("transporteorigen >=", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenLessThan(String value) {
            addCriterion("transporteorigen <", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenLessThanOrEqualTo(String value) {
            addCriterion("transporteorigen <=", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenLike(String value) {
            addCriterion("transporteorigen like", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenNotLike(String value) {
            addCriterion("transporteorigen not like", value, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenIn(List<String> values) {
            addCriterion("transporteorigen in", values, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenNotIn(List<String> values) {
            addCriterion("transporteorigen not in", values, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenBetween(String value1, String value2) {
            addCriterion("transporteorigen between", value1, value2, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andTransporteorigenNotBetween(String value1, String value2) {
            addCriterion("transporteorigen not between", value1, value2, "transporteorigen");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoIsNull() {
            addCriterion("codpaisdestino is null");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoIsNotNull() {
            addCriterion("codpaisdestino is not null");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoEqualTo(String value) {
            addCriterion("codpaisdestino =", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoNotEqualTo(String value) {
            addCriterion("codpaisdestino <>", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoGreaterThan(String value) {
            addCriterion("codpaisdestino >", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoGreaterThanOrEqualTo(String value) {
            addCriterion("codpaisdestino >=", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoLessThan(String value) {
            addCriterion("codpaisdestino <", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoLessThanOrEqualTo(String value) {
            addCriterion("codpaisdestino <=", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoLike(String value) {
            addCriterion("codpaisdestino like", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoNotLike(String value) {
            addCriterion("codpaisdestino not like", value, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoIn(List<String> values) {
            addCriterion("codpaisdestino in", values, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoNotIn(List<String> values) {
            addCriterion("codpaisdestino not in", values, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoBetween(String value1, String value2) {
            addCriterion("codpaisdestino between", value1, value2, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCodpaisdestinoNotBetween(String value1, String value2) {
            addCriterion("codpaisdestino not between", value1, value2, "codpaisdestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoIsNull() {
            addCriterion("ciudaddestino is null");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoIsNotNull() {
            addCriterion("ciudaddestino is not null");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoEqualTo(String value) {
            addCriterion("ciudaddestino =", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoNotEqualTo(String value) {
            addCriterion("ciudaddestino <>", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoGreaterThan(String value) {
            addCriterion("ciudaddestino >", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoGreaterThanOrEqualTo(String value) {
            addCriterion("ciudaddestino >=", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoLessThan(String value) {
            addCriterion("ciudaddestino <", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoLessThanOrEqualTo(String value) {
            addCriterion("ciudaddestino <=", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoLike(String value) {
            addCriterion("ciudaddestino like", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoNotLike(String value) {
            addCriterion("ciudaddestino not like", value, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoIn(List<String> values) {
            addCriterion("ciudaddestino in", values, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoNotIn(List<String> values) {
            addCriterion("ciudaddestino not in", values, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoBetween(String value1, String value2) {
            addCriterion("ciudaddestino between", value1, value2, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andCiudaddestinoNotBetween(String value1, String value2) {
            addCriterion("ciudaddestino not between", value1, value2, "ciudaddestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoIsNull() {
            addCriterion("puertodestino is null");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoIsNotNull() {
            addCriterion("puertodestino is not null");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoEqualTo(String value) {
            addCriterion("puertodestino =", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoNotEqualTo(String value) {
            addCriterion("puertodestino <>", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoGreaterThan(String value) {
            addCriterion("puertodestino >", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoGreaterThanOrEqualTo(String value) {
            addCriterion("puertodestino >=", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoLessThan(String value) {
            addCriterion("puertodestino <", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoLessThanOrEqualTo(String value) {
            addCriterion("puertodestino <=", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoLike(String value) {
            addCriterion("puertodestino like", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoNotLike(String value) {
            addCriterion("puertodestino not like", value, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoIn(List<String> values) {
            addCriterion("puertodestino in", values, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoNotIn(List<String> values) {
            addCriterion("puertodestino not in", values, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoBetween(String value1, String value2) {
            addCriterion("puertodestino between", value1, value2, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andPuertodestinoNotBetween(String value1, String value2) {
            addCriterion("puertodestino not between", value1, value2, "puertodestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoIsNull() {
            addCriterion("transportedestino is null");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoIsNotNull() {
            addCriterion("transportedestino is not null");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoEqualTo(String value) {
            addCriterion("transportedestino =", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoNotEqualTo(String value) {
            addCriterion("transportedestino <>", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoGreaterThan(String value) {
            addCriterion("transportedestino >", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoGreaterThanOrEqualTo(String value) {
            addCriterion("transportedestino >=", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoLessThan(String value) {
            addCriterion("transportedestino <", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoLessThanOrEqualTo(String value) {
            addCriterion("transportedestino <=", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoLike(String value) {
            addCriterion("transportedestino like", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoNotLike(String value) {
            addCriterion("transportedestino not like", value, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoIn(List<String> values) {
            addCriterion("transportedestino in", values, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoNotIn(List<String> values) {
            addCriterion("transportedestino not in", values, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoBetween(String value1, String value2) {
            addCriterion("transportedestino between", value1, value2, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andTransportedestinoNotBetween(String value1, String value2) {
            addCriterion("transportedestino not between", value1, value2, "transportedestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoIsNull() {
            addCriterion("obsdestino is null");
            return (Criteria) this;
        }

        public Criteria andObsdestinoIsNotNull() {
            addCriterion("obsdestino is not null");
            return (Criteria) this;
        }

        public Criteria andObsdestinoEqualTo(String value) {
            addCriterion("obsdestino =", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoNotEqualTo(String value) {
            addCriterion("obsdestino <>", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoGreaterThan(String value) {
            addCriterion("obsdestino >", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoGreaterThanOrEqualTo(String value) {
            addCriterion("obsdestino >=", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoLessThan(String value) {
            addCriterion("obsdestino <", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoLessThanOrEqualTo(String value) {
            addCriterion("obsdestino <=", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoLike(String value) {
            addCriterion("obsdestino like", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoNotLike(String value) {
            addCriterion("obsdestino not like", value, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoIn(List<String> values) {
            addCriterion("obsdestino in", values, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoNotIn(List<String> values) {
            addCriterion("obsdestino not in", values, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoBetween(String value1, String value2) {
            addCriterion("obsdestino between", value1, value2, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObsdestinoNotBetween(String value1, String value2) {
            addCriterion("obsdestino not between", value1, value2, "obsdestino");
            return (Criteria) this;
        }

        public Criteria andObscotizacionIsNull() {
            addCriterion("obscotizacion is null");
            return (Criteria) this;
        }

        public Criteria andObscotizacionIsNotNull() {
            addCriterion("obscotizacion is not null");
            return (Criteria) this;
        }

        public Criteria andObscotizacionEqualTo(String value) {
            addCriterion("obscotizacion =", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionNotEqualTo(String value) {
            addCriterion("obscotizacion <>", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionGreaterThan(String value) {
            addCriterion("obscotizacion >", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionGreaterThanOrEqualTo(String value) {
            addCriterion("obscotizacion >=", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionLessThan(String value) {
            addCriterion("obscotizacion <", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionLessThanOrEqualTo(String value) {
            addCriterion("obscotizacion <=", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionLike(String value) {
            addCriterion("obscotizacion like", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionNotLike(String value) {
            addCriterion("obscotizacion not like", value, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionIn(List<String> values) {
            addCriterion("obscotizacion in", values, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionNotIn(List<String> values) {
            addCriterion("obscotizacion not in", values, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionBetween(String value1, String value2) {
            addCriterion("obscotizacion between", value1, value2, "obscotizacion");
            return (Criteria) this;
        }

        public Criteria andObscotizacionNotBetween(String value1, String value2) {
            addCriterion("obscotizacion not between", value1, value2, "obscotizacion");
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

        public Criteria andPesoapoxIsNull() {
            addCriterion("pesoapox is null");
            return (Criteria) this;
        }

        public Criteria andPesoapoxIsNotNull() {
            addCriterion("pesoapox is not null");
            return (Criteria) this;
        }

        public Criteria andPesoapoxEqualTo(BigDecimal value) {
            addCriterion("pesoapox =", value, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxNotEqualTo(BigDecimal value) {
            addCriterion("pesoapox <>", value, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxGreaterThan(BigDecimal value) {
            addCriterion("pesoapox >", value, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pesoapox >=", value, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxLessThan(BigDecimal value) {
            addCriterion("pesoapox <", value, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pesoapox <=", value, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxIn(List<BigDecimal> values) {
            addCriterion("pesoapox in", values, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxNotIn(List<BigDecimal> values) {
            addCriterion("pesoapox not in", values, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pesoapox between", value1, value2, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesoapoxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pesoapox not between", value1, value2, "pesoapox");
            return (Criteria) this;
        }

        public Criteria andPesototalIsNull() {
            addCriterion("pesototal is null");
            return (Criteria) this;
        }

        public Criteria andPesototalIsNotNull() {
            addCriterion("pesototal is not null");
            return (Criteria) this;
        }

        public Criteria andPesototalEqualTo(BigDecimal value) {
            addCriterion("pesototal =", value, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalNotEqualTo(BigDecimal value) {
            addCriterion("pesototal <>", value, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalGreaterThan(BigDecimal value) {
            addCriterion("pesototal >", value, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pesototal >=", value, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalLessThan(BigDecimal value) {
            addCriterion("pesototal <", value, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pesototal <=", value, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalIn(List<BigDecimal> values) {
            addCriterion("pesototal in", values, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalNotIn(List<BigDecimal> values) {
            addCriterion("pesototal not in", values, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pesototal between", value1, value2, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPesototalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pesototal not between", value1, value2, "pesototal");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioIsNull() {
            addCriterion("preciounitario is null");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioIsNotNull() {
            addCriterion("preciounitario is not null");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioEqualTo(BigDecimal value) {
            addCriterion("preciounitario =", value, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioNotEqualTo(BigDecimal value) {
            addCriterion("preciounitario <>", value, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioGreaterThan(BigDecimal value) {
            addCriterion("preciounitario >", value, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preciounitario >=", value, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioLessThan(BigDecimal value) {
            addCriterion("preciounitario <", value, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preciounitario <=", value, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioIn(List<BigDecimal> values) {
            addCriterion("preciounitario in", values, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioNotIn(List<BigDecimal> values) {
            addCriterion("preciounitario not in", values, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciounitario between", value1, value2, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciounitarioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciounitario not between", value1, value2, "preciounitario");
            return (Criteria) this;
        }

        public Criteria andPreciototalIsNull() {
            addCriterion("preciototal is null");
            return (Criteria) this;
        }

        public Criteria andPreciototalIsNotNull() {
            addCriterion("preciototal is not null");
            return (Criteria) this;
        }

        public Criteria andPreciototalEqualTo(BigDecimal value) {
            addCriterion("preciototal =", value, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalNotEqualTo(BigDecimal value) {
            addCriterion("preciototal <>", value, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalGreaterThan(BigDecimal value) {
            addCriterion("preciototal >", value, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preciototal >=", value, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalLessThan(BigDecimal value) {
            addCriterion("preciototal <", value, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preciototal <=", value, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalIn(List<BigDecimal> values) {
            addCriterion("preciototal in", values, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalNotIn(List<BigDecimal> values) {
            addCriterion("preciototal not in", values, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciototal between", value1, value2, "preciototal");
            return (Criteria) this;
        }

        public Criteria andPreciototalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciototal not between", value1, value2, "preciototal");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNull() {
            addCriterion("descuento is null");
            return (Criteria) this;
        }

        public Criteria andDescuentoIsNotNull() {
            addCriterion("descuento is not null");
            return (Criteria) this;
        }

        public Criteria andDescuentoEqualTo(BigDecimal value) {
            addCriterion("descuento =", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("descuento <>", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThan(BigDecimal value) {
            addCriterion("descuento >", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("descuento >=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThan(BigDecimal value) {
            addCriterion("descuento <", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("descuento <=", value, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoIn(List<BigDecimal> values) {
            addCriterion("descuento in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("descuento not in", values, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("descuento between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("descuento not between", value1, value2, "descuento");
            return (Criteria) this;
        }

        public Criteria andMontonetoIsNull() {
            addCriterion("montoneto is null");
            return (Criteria) this;
        }

        public Criteria andMontonetoIsNotNull() {
            addCriterion("montoneto is not null");
            return (Criteria) this;
        }

        public Criteria andMontonetoEqualTo(BigDecimal value) {
            addCriterion("montoneto =", value, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoNotEqualTo(BigDecimal value) {
            addCriterion("montoneto <>", value, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoGreaterThan(BigDecimal value) {
            addCriterion("montoneto >", value, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("montoneto >=", value, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoLessThan(BigDecimal value) {
            addCriterion("montoneto <", value, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("montoneto <=", value, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoIn(List<BigDecimal> values) {
            addCriterion("montoneto in", values, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoNotIn(List<BigDecimal> values) {
            addCriterion("montoneto not in", values, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("montoneto between", value1, value2, "montoneto");
            return (Criteria) this;
        }

        public Criteria andMontonetoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("montoneto not between", value1, value2, "montoneto");
            return (Criteria) this;
        }

        public Criteria andPorcentajeIsNull() {
            addCriterion("porcentaje is null");
            return (Criteria) this;
        }

        public Criteria andPorcentajeIsNotNull() {
            addCriterion("porcentaje is not null");
            return (Criteria) this;
        }

        public Criteria andPorcentajeEqualTo(Integer value) {
            addCriterion("porcentaje =", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeNotEqualTo(Integer value) {
            addCriterion("porcentaje <>", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeGreaterThan(Integer value) {
            addCriterion("porcentaje >", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeGreaterThanOrEqualTo(Integer value) {
            addCriterion("porcentaje >=", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeLessThan(Integer value) {
            addCriterion("porcentaje <", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeLessThanOrEqualTo(Integer value) {
            addCriterion("porcentaje <=", value, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeIn(List<Integer> values) {
            addCriterion("porcentaje in", values, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeNotIn(List<Integer> values) {
            addCriterion("porcentaje not in", values, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeBetween(Integer value1, Integer value2) {
            addCriterion("porcentaje between", value1, value2, "porcentaje");
            return (Criteria) this;
        }

        public Criteria andPorcentajeNotBetween(Integer value1, Integer value2) {
            addCriterion("porcentaje not between", value1, value2, "porcentaje");
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

        public Criteria andMontopagarIsNull() {
            addCriterion("montopagar is null");
            return (Criteria) this;
        }

        public Criteria andMontopagarIsNotNull() {
            addCriterion("montopagar is not null");
            return (Criteria) this;
        }

        public Criteria andMontopagarEqualTo(BigDecimal value) {
            addCriterion("montopagar =", value, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarNotEqualTo(BigDecimal value) {
            addCriterion("montopagar <>", value, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarGreaterThan(BigDecimal value) {
            addCriterion("montopagar >", value, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("montopagar >=", value, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarLessThan(BigDecimal value) {
            addCriterion("montopagar <", value, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("montopagar <=", value, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarIn(List<BigDecimal> values) {
            addCriterion("montopagar in", values, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarNotIn(List<BigDecimal> values) {
            addCriterion("montopagar not in", values, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("montopagar between", value1, value2, "montopagar");
            return (Criteria) this;
        }

        public Criteria andMontopagarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("montopagar not between", value1, value2, "montopagar");
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

        public Criteria andFleteEqualTo(BigDecimal value) {
            addCriterion("flete =", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteNotEqualTo(BigDecimal value) {
            addCriterion("flete <>", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteGreaterThan(BigDecimal value) {
            addCriterion("flete >", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("flete >=", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteLessThan(BigDecimal value) {
            addCriterion("flete <", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("flete <=", value, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteIn(List<BigDecimal> values) {
            addCriterion("flete in", values, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteNotIn(List<BigDecimal> values) {
            addCriterion("flete not in", values, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flete between", value1, value2, "flete");
            return (Criteria) this;
        }

        public Criteria andFleteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flete not between", value1, value2, "flete");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeIsNull() {
            addCriterion("desaduanaje is null");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeIsNotNull() {
            addCriterion("desaduanaje is not null");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeEqualTo(BigDecimal value) {
            addCriterion("desaduanaje =", value, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeNotEqualTo(BigDecimal value) {
            addCriterion("desaduanaje <>", value, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeGreaterThan(BigDecimal value) {
            addCriterion("desaduanaje >", value, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("desaduanaje >=", value, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeLessThan(BigDecimal value) {
            addCriterion("desaduanaje <", value, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("desaduanaje <=", value, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeIn(List<BigDecimal> values) {
            addCriterion("desaduanaje in", values, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeNotIn(List<BigDecimal> values) {
            addCriterion("desaduanaje not in", values, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("desaduanaje between", value1, value2, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andDesaduanajeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("desaduanaje not between", value1, value2, "desaduanaje");
            return (Criteria) this;
        }

        public Criteria andSeguroIsNull() {
            addCriterion("seguro is null");
            return (Criteria) this;
        }

        public Criteria andSeguroIsNotNull() {
            addCriterion("seguro is not null");
            return (Criteria) this;
        }

        public Criteria andSeguroEqualTo(BigDecimal value) {
            addCriterion("seguro =", value, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroNotEqualTo(BigDecimal value) {
            addCriterion("seguro <>", value, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroGreaterThan(BigDecimal value) {
            addCriterion("seguro >", value, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seguro >=", value, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroLessThan(BigDecimal value) {
            addCriterion("seguro <", value, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seguro <=", value, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroIn(List<BigDecimal> values) {
            addCriterion("seguro in", values, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroNotIn(List<BigDecimal> values) {
            addCriterion("seguro not in", values, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seguro between", value1, value2, "seguro");
            return (Criteria) this;
        }

        public Criteria andSeguroNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seguro not between", value1, value2, "seguro");
            return (Criteria) this;
        }

        public Criteria andComisionIsNull() {
            addCriterion("comision is null");
            return (Criteria) this;
        }

        public Criteria andComisionIsNotNull() {
            addCriterion("comision is not null");
            return (Criteria) this;
        }

        public Criteria andComisionEqualTo(BigDecimal value) {
            addCriterion("comision =", value, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionNotEqualTo(BigDecimal value) {
            addCriterion("comision <>", value, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionGreaterThan(BigDecimal value) {
            addCriterion("comision >", value, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("comision >=", value, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionLessThan(BigDecimal value) {
            addCriterion("comision <", value, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("comision <=", value, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionIn(List<BigDecimal> values) {
            addCriterion("comision in", values, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionNotIn(List<BigDecimal> values) {
            addCriterion("comision not in", values, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comision between", value1, value2, "comision");
            return (Criteria) this;
        }

        public Criteria andComisionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comision not between", value1, value2, "comision");
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

        public Criteria andCantidadEqualTo(BigDecimal value) {
            addCriterion("cantidad =", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotEqualTo(BigDecimal value) {
            addCriterion("cantidad <>", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThan(BigDecimal value) {
            addCriterion("cantidad >", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cantidad >=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThan(BigDecimal value) {
            addCriterion("cantidad <", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cantidad <=", value, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadIn(List<BigDecimal> values) {
            addCriterion("cantidad in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotIn(List<BigDecimal> values) {
            addCriterion("cantidad not in", values, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cantidad between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCantidadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cantidad not between", value1, value2, "cantidad");
            return (Criteria) this;
        }

        public Criteria andCntposicionesIsNull() {
            addCriterion("cntposiciones is null");
            return (Criteria) this;
        }

        public Criteria andCntposicionesIsNotNull() {
            addCriterion("cntposiciones is not null");
            return (Criteria) this;
        }

        public Criteria andCntposicionesEqualTo(BigDecimal value) {
            addCriterion("cntposiciones =", value, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesNotEqualTo(BigDecimal value) {
            addCriterion("cntposiciones <>", value, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesGreaterThan(BigDecimal value) {
            addCriterion("cntposiciones >", value, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cntposiciones >=", value, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesLessThan(BigDecimal value) {
            addCriterion("cntposiciones <", value, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cntposiciones <=", value, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesIn(List<BigDecimal> values) {
            addCriterion("cntposiciones in", values, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesNotIn(List<BigDecimal> values) {
            addCriterion("cntposiciones not in", values, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cntposiciones between", value1, value2, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntposicionesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cntposiciones not between", value1, value2, "cntposiciones");
            return (Criteria) this;
        }

        public Criteria andCntunidadesIsNull() {
            addCriterion("cntunidades is null");
            return (Criteria) this;
        }

        public Criteria andCntunidadesIsNotNull() {
            addCriterion("cntunidades is not null");
            return (Criteria) this;
        }

        public Criteria andCntunidadesEqualTo(BigDecimal value) {
            addCriterion("cntunidades =", value, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesNotEqualTo(BigDecimal value) {
            addCriterion("cntunidades <>", value, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesGreaterThan(BigDecimal value) {
            addCriterion("cntunidades >", value, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cntunidades >=", value, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesLessThan(BigDecimal value) {
            addCriterion("cntunidades <", value, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cntunidades <=", value, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesIn(List<BigDecimal> values) {
            addCriterion("cntunidades in", values, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesNotIn(List<BigDecimal> values) {
            addCriterion("cntunidades not in", values, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cntunidades between", value1, value2, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntunidadesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cntunidades not between", value1, value2, "cntunidades");
            return (Criteria) this;
        }

        public Criteria andCntpersonasIsNull() {
            addCriterion("cntpersonas is null");
            return (Criteria) this;
        }

        public Criteria andCntpersonasIsNotNull() {
            addCriterion("cntpersonas is not null");
            return (Criteria) this;
        }

        public Criteria andCntpersonasEqualTo(BigDecimal value) {
            addCriterion("cntpersonas =", value, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasNotEqualTo(BigDecimal value) {
            addCriterion("cntpersonas <>", value, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasGreaterThan(BigDecimal value) {
            addCriterion("cntpersonas >", value, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cntpersonas >=", value, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasLessThan(BigDecimal value) {
            addCriterion("cntpersonas <", value, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cntpersonas <=", value, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasIn(List<BigDecimal> values) {
            addCriterion("cntpersonas in", values, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasNotIn(List<BigDecimal> values) {
            addCriterion("cntpersonas not in", values, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cntpersonas between", value1, value2, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andCntpersonasNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cntpersonas not between", value1, value2, "cntpersonas");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaIsNull() {
            addCriterion("unidadmedida is null");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaIsNotNull() {
            addCriterion("unidadmedida is not null");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaEqualTo(String value) {
            addCriterion("unidadmedida =", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaNotEqualTo(String value) {
            addCriterion("unidadmedida <>", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaGreaterThan(String value) {
            addCriterion("unidadmedida >", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaGreaterThanOrEqualTo(String value) {
            addCriterion("unidadmedida >=", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaLessThan(String value) {
            addCriterion("unidadmedida <", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaLessThanOrEqualTo(String value) {
            addCriterion("unidadmedida <=", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaLike(String value) {
            addCriterion("unidadmedida like", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaNotLike(String value) {
            addCriterion("unidadmedida not like", value, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaIn(List<String> values) {
            addCriterion("unidadmedida in", values, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaNotIn(List<String> values) {
            addCriterion("unidadmedida not in", values, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaBetween(String value1, String value2) {
            addCriterion("unidadmedida between", value1, value2, "unidadmedida");
            return (Criteria) this;
        }

        public Criteria andUnidadmedidaNotBetween(String value1, String value2) {
            addCriterion("unidadmedida not between", value1, value2, "unidadmedida");
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

        public Criteria andVolumenIsNull() {
            addCriterion("volumen is null");
            return (Criteria) this;
        }

        public Criteria andVolumenIsNotNull() {
            addCriterion("volumen is not null");
            return (Criteria) this;
        }

        public Criteria andVolumenEqualTo(BigDecimal value) {
            addCriterion("volumen =", value, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenNotEqualTo(BigDecimal value) {
            addCriterion("volumen <>", value, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenGreaterThan(BigDecimal value) {
            addCriterion("volumen >", value, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volumen >=", value, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenLessThan(BigDecimal value) {
            addCriterion("volumen <", value, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volumen <=", value, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenIn(List<BigDecimal> values) {
            addCriterion("volumen in", values, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenNotIn(List<BigDecimal> values) {
            addCriterion("volumen not in", values, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volumen between", value1, value2, "volumen");
            return (Criteria) this;
        }

        public Criteria andVolumenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volumen not between", value1, value2, "volumen");
            return (Criteria) this;
        }

        public Criteria andNumerodiasIsNull() {
            addCriterion("numerodias is null");
            return (Criteria) this;
        }

        public Criteria andNumerodiasIsNotNull() {
            addCriterion("numerodias is not null");
            return (Criteria) this;
        }

        public Criteria andNumerodiasEqualTo(BigDecimal value) {
            addCriterion("numerodias =", value, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasNotEqualTo(BigDecimal value) {
            addCriterion("numerodias <>", value, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasGreaterThan(BigDecimal value) {
            addCriterion("numerodias >", value, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("numerodias >=", value, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasLessThan(BigDecimal value) {
            addCriterion("numerodias <", value, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasLessThanOrEqualTo(BigDecimal value) {
            addCriterion("numerodias <=", value, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasIn(List<BigDecimal> values) {
            addCriterion("numerodias in", values, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasNotIn(List<BigDecimal> values) {
            addCriterion("numerodias not in", values, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("numerodias between", value1, value2, "numerodias");
            return (Criteria) this;
        }

        public Criteria andNumerodiasNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("numerodias not between", value1, value2, "numerodias");
            return (Criteria) this;
        }

        public Criteria andReserieIsNull() {
            addCriterion("reserie is null");
            return (Criteria) this;
        }

        public Criteria andReserieIsNotNull() {
            addCriterion("reserie is not null");
            return (Criteria) this;
        }

        public Criteria andReserieEqualTo(String value) {
            addCriterion("reserie =", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieNotEqualTo(String value) {
            addCriterion("reserie <>", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieGreaterThan(String value) {
            addCriterion("reserie >", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieGreaterThanOrEqualTo(String value) {
            addCriterion("reserie >=", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieLessThan(String value) {
            addCriterion("reserie <", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieLessThanOrEqualTo(String value) {
            addCriterion("reserie <=", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieLike(String value) {
            addCriterion("reserie like", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieNotLike(String value) {
            addCriterion("reserie not like", value, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieIn(List<String> values) {
            addCriterion("reserie in", values, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieNotIn(List<String> values) {
            addCriterion("reserie not in", values, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieBetween(String value1, String value2) {
            addCriterion("reserie between", value1, value2, "reserie");
            return (Criteria) this;
        }

        public Criteria andReserieNotBetween(String value1, String value2) {
            addCriterion("reserie not between", value1, value2, "reserie");
            return (Criteria) this;
        }

        public Criteria andRenumroIsNull() {
            addCriterion("renumro is null");
            return (Criteria) this;
        }

        public Criteria andRenumroIsNotNull() {
            addCriterion("renumro is not null");
            return (Criteria) this;
        }

        public Criteria andRenumroEqualTo(Integer value) {
            addCriterion("renumro =", value, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroNotEqualTo(Integer value) {
            addCriterion("renumro <>", value, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroGreaterThan(Integer value) {
            addCriterion("renumro >", value, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroGreaterThanOrEqualTo(Integer value) {
            addCriterion("renumro >=", value, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroLessThan(Integer value) {
            addCriterion("renumro <", value, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroLessThanOrEqualTo(Integer value) {
            addCriterion("renumro <=", value, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroIn(List<Integer> values) {
            addCriterion("renumro in", values, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroNotIn(List<Integer> values) {
            addCriterion("renumro not in", values, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroBetween(Integer value1, Integer value2) {
            addCriterion("renumro between", value1, value2, "renumro");
            return (Criteria) this;
        }

        public Criteria andRenumroNotBetween(Integer value1, Integer value2) {
            addCriterion("renumro not between", value1, value2, "renumro");
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

        public Criteria andRutaimagenIsNull() {
            addCriterion("rutaimagen is null");
            return (Criteria) this;
        }

        public Criteria andRutaimagenIsNotNull() {
            addCriterion("rutaimagen is not null");
            return (Criteria) this;
        }

        public Criteria andRutaimagenEqualTo(String value) {
            addCriterion("rutaimagen =", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenNotEqualTo(String value) {
            addCriterion("rutaimagen <>", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenGreaterThan(String value) {
            addCriterion("rutaimagen >", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenGreaterThanOrEqualTo(String value) {
            addCriterion("rutaimagen >=", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenLessThan(String value) {
            addCriterion("rutaimagen <", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenLessThanOrEqualTo(String value) {
            addCriterion("rutaimagen <=", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenLike(String value) {
            addCriterion("rutaimagen like", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenNotLike(String value) {
            addCriterion("rutaimagen not like", value, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenIn(List<String> values) {
            addCriterion("rutaimagen in", values, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenNotIn(List<String> values) {
            addCriterion("rutaimagen not in", values, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenBetween(String value1, String value2) {
            addCriterion("rutaimagen between", value1, value2, "rutaimagen");
            return (Criteria) this;
        }

        public Criteria andRutaimagenNotBetween(String value1, String value2) {
            addCriterion("rutaimagen not between", value1, value2, "rutaimagen");
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

        public Criteria andObsproductoIsNull() {
            addCriterion("obsproducto is null");
            return (Criteria) this;
        }

        public Criteria andObsproductoIsNotNull() {
            addCriterion("obsproducto is not null");
            return (Criteria) this;
        }

        public Criteria andObsproductoEqualTo(String value) {
            addCriterion("obsproducto =", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoNotEqualTo(String value) {
            addCriterion("obsproducto <>", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoGreaterThan(String value) {
            addCriterion("obsproducto >", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoGreaterThanOrEqualTo(String value) {
            addCriterion("obsproducto >=", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoLessThan(String value) {
            addCriterion("obsproducto <", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoLessThanOrEqualTo(String value) {
            addCriterion("obsproducto <=", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoLike(String value) {
            addCriterion("obsproducto like", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoNotLike(String value) {
            addCriterion("obsproducto not like", value, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoIn(List<String> values) {
            addCriterion("obsproducto in", values, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoNotIn(List<String> values) {
            addCriterion("obsproducto not in", values, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoBetween(String value1, String value2) {
            addCriterion("obsproducto between", value1, value2, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andObsproductoNotBetween(String value1, String value2) {
            addCriterion("obsproducto not between", value1, value2, "obsproducto");
            return (Criteria) this;
        }

        public Criteria andCodencuestaIsNull() {
            addCriterion("codencuesta is null");
            return (Criteria) this;
        }

        public Criteria andCodencuestaIsNotNull() {
            addCriterion("codencuesta is not null");
            return (Criteria) this;
        }

        public Criteria andCodencuestaEqualTo(String value) {
            addCriterion("codencuesta =", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaNotEqualTo(String value) {
            addCriterion("codencuesta <>", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaGreaterThan(String value) {
            addCriterion("codencuesta >", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaGreaterThanOrEqualTo(String value) {
            addCriterion("codencuesta >=", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaLessThan(String value) {
            addCriterion("codencuesta <", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaLessThanOrEqualTo(String value) {
            addCriterion("codencuesta <=", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaLike(String value) {
            addCriterion("codencuesta like", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaNotLike(String value) {
            addCriterion("codencuesta not like", value, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaIn(List<String> values) {
            addCriterion("codencuesta in", values, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaNotIn(List<String> values) {
            addCriterion("codencuesta not in", values, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaBetween(String value1, String value2) {
            addCriterion("codencuesta between", value1, value2, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andCodencuestaNotBetween(String value1, String value2) {
            addCriterion("codencuesta not between", value1, value2, "codencuesta");
            return (Criteria) this;
        }

        public Criteria andImoIsNull() {
            addCriterion("imo is null");
            return (Criteria) this;
        }

        public Criteria andImoIsNotNull() {
            addCriterion("imo is not null");
            return (Criteria) this;
        }

        public Criteria andImoEqualTo(String value) {
            addCriterion("imo =", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotEqualTo(String value) {
            addCriterion("imo <>", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoGreaterThan(String value) {
            addCriterion("imo >", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoGreaterThanOrEqualTo(String value) {
            addCriterion("imo >=", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoLessThan(String value) {
            addCriterion("imo <", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoLessThanOrEqualTo(String value) {
            addCriterion("imo <=", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoLike(String value) {
            addCriterion("imo like", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotLike(String value) {
            addCriterion("imo not like", value, "imo");
            return (Criteria) this;
        }

        public Criteria andImoIn(List<String> values) {
            addCriterion("imo in", values, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotIn(List<String> values) {
            addCriterion("imo not in", values, "imo");
            return (Criteria) this;
        }

        public Criteria andImoBetween(String value1, String value2) {
            addCriterion("imo between", value1, value2, "imo");
            return (Criteria) this;
        }

        public Criteria andImoNotBetween(String value1, String value2) {
            addCriterion("imo not between", value1, value2, "imo");
            return (Criteria) this;
        }

        public Criteria andUmmIsNull() {
            addCriterion("umm is null");
            return (Criteria) this;
        }

        public Criteria andUmmIsNotNull() {
            addCriterion("umm is not null");
            return (Criteria) this;
        }

        public Criteria andUmmEqualTo(String value) {
            addCriterion("umm =", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmNotEqualTo(String value) {
            addCriterion("umm <>", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmGreaterThan(String value) {
            addCriterion("umm >", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmGreaterThanOrEqualTo(String value) {
            addCriterion("umm >=", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmLessThan(String value) {
            addCriterion("umm <", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmLessThanOrEqualTo(String value) {
            addCriterion("umm <=", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmLike(String value) {
            addCriterion("umm like", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmNotLike(String value) {
            addCriterion("umm not like", value, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmIn(List<String> values) {
            addCriterion("umm in", values, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmNotIn(List<String> values) {
            addCriterion("umm not in", values, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmBetween(String value1, String value2) {
            addCriterion("umm between", value1, value2, "umm");
            return (Criteria) this;
        }

        public Criteria andUmmNotBetween(String value1, String value2) {
            addCriterion("umm not between", value1, value2, "umm");
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

        public Criteria andMotivoanulacionIsNull() {
            addCriterion("motivoanulacion is null");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionIsNotNull() {
            addCriterion("motivoanulacion is not null");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionEqualTo(String value) {
            addCriterion("motivoanulacion =", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionNotEqualTo(String value) {
            addCriterion("motivoanulacion <>", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionGreaterThan(String value) {
            addCriterion("motivoanulacion >", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionGreaterThanOrEqualTo(String value) {
            addCriterion("motivoanulacion >=", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionLessThan(String value) {
            addCriterion("motivoanulacion <", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionLessThanOrEqualTo(String value) {
            addCriterion("motivoanulacion <=", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionLike(String value) {
            addCriterion("motivoanulacion like", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionNotLike(String value) {
            addCriterion("motivoanulacion not like", value, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionIn(List<String> values) {
            addCriterion("motivoanulacion in", values, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionNotIn(List<String> values) {
            addCriterion("motivoanulacion not in", values, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionBetween(String value1, String value2) {
            addCriterion("motivoanulacion between", value1, value2, "motivoanulacion");
            return (Criteria) this;
        }

        public Criteria andMotivoanulacionNotBetween(String value1, String value2) {
            addCriterion("motivoanulacion not between", value1, value2, "motivoanulacion");
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

        public Criteria andTipocotizacionIsNull() {
            addCriterion("tipocotizacion is null");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionIsNotNull() {
            addCriterion("tipocotizacion is not null");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionEqualTo(Short value) {
            addCriterion("tipocotizacion =", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionNotEqualTo(Short value) {
            addCriterion("tipocotizacion <>", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionGreaterThan(Short value) {
            addCriterion("tipocotizacion >", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionGreaterThanOrEqualTo(Short value) {
            addCriterion("tipocotizacion >=", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionLessThan(Short value) {
            addCriterion("tipocotizacion <", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionLessThanOrEqualTo(Short value) {
            addCriterion("tipocotizacion <=", value, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionIn(List<Short> values) {
            addCriterion("tipocotizacion in", values, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionNotIn(List<Short> values) {
            addCriterion("tipocotizacion not in", values, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionBetween(Short value1, Short value2) {
            addCriterion("tipocotizacion between", value1, value2, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andTipocotizacionNotBetween(Short value1, Short value2) {
            addCriterion("tipocotizacion not between", value1, value2, "tipocotizacion");
            return (Criteria) this;
        }

        public Criteria andFechaanulaIsNull() {
            addCriterion("fechaanula is null");
            return (Criteria) this;
        }

        public Criteria andFechaanulaIsNotNull() {
            addCriterion("fechaanula is not null");
            return (Criteria) this;
        }

        public Criteria andFechaanulaEqualTo(Date value) {
            addCriterion("fechaanula =", value, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaNotEqualTo(Date value) {
            addCriterion("fechaanula <>", value, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaGreaterThan(Date value) {
            addCriterion("fechaanula >", value, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaGreaterThanOrEqualTo(Date value) {
            addCriterion("fechaanula >=", value, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaLessThan(Date value) {
            addCriterion("fechaanula <", value, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaLessThanOrEqualTo(Date value) {
            addCriterion("fechaanula <=", value, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaIn(List<Date> values) {
            addCriterion("fechaanula in", values, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaNotIn(List<Date> values) {
            addCriterion("fechaanula not in", values, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaBetween(Date value1, Date value2) {
            addCriterion("fechaanula between", value1, value2, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andFechaanulaNotBetween(Date value1, Date value2) {
            addCriterion("fechaanula not between", value1, value2, "fechaanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaIsNull() {
            addCriterion("usuarioanula is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaIsNotNull() {
            addCriterion("usuarioanula is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaEqualTo(String value) {
            addCriterion("usuarioanula =", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaNotEqualTo(String value) {
            addCriterion("usuarioanula <>", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaGreaterThan(String value) {
            addCriterion("usuarioanula >", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaGreaterThanOrEqualTo(String value) {
            addCriterion("usuarioanula >=", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaLessThan(String value) {
            addCriterion("usuarioanula <", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaLessThanOrEqualTo(String value) {
            addCriterion("usuarioanula <=", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaLike(String value) {
            addCriterion("usuarioanula like", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaNotLike(String value) {
            addCriterion("usuarioanula not like", value, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaIn(List<String> values) {
            addCriterion("usuarioanula in", values, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaNotIn(List<String> values) {
            addCriterion("usuarioanula not in", values, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaBetween(String value1, String value2) {
            addCriterion("usuarioanula between", value1, value2, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioanulaNotBetween(String value1, String value2) {
            addCriterion("usuarioanula not between", value1, value2, "usuarioanula");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaIsNull() {
            addCriterion("usuarioaprueba is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaIsNotNull() {
            addCriterion("usuarioaprueba is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaEqualTo(String value) {
            addCriterion("usuarioaprueba =", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaNotEqualTo(String value) {
            addCriterion("usuarioaprueba <>", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaGreaterThan(String value) {
            addCriterion("usuarioaprueba >", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaGreaterThanOrEqualTo(String value) {
            addCriterion("usuarioaprueba >=", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaLessThan(String value) {
            addCriterion("usuarioaprueba <", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaLessThanOrEqualTo(String value) {
            addCriterion("usuarioaprueba <=", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaLike(String value) {
            addCriterion("usuarioaprueba like", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaNotLike(String value) {
            addCriterion("usuarioaprueba not like", value, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaIn(List<String> values) {
            addCriterion("usuarioaprueba in", values, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaNotIn(List<String> values) {
            addCriterion("usuarioaprueba not in", values, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaBetween(String value1, String value2) {
            addCriterion("usuarioaprueba between", value1, value2, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andUsuarioapruebaNotBetween(String value1, String value2) {
            addCriterion("usuarioaprueba not between", value1, value2, "usuarioaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaIsNull() {
            addCriterion("fechaaprueba is null");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaIsNotNull() {
            addCriterion("fechaaprueba is not null");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaEqualTo(Date value) {
            addCriterion("fechaaprueba =", value, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaNotEqualTo(Date value) {
            addCriterion("fechaaprueba <>", value, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaGreaterThan(Date value) {
            addCriterion("fechaaprueba >", value, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaGreaterThanOrEqualTo(Date value) {
            addCriterion("fechaaprueba >=", value, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaLessThan(Date value) {
            addCriterion("fechaaprueba <", value, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaLessThanOrEqualTo(Date value) {
            addCriterion("fechaaprueba <=", value, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaIn(List<Date> values) {
            addCriterion("fechaaprueba in", values, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaNotIn(List<Date> values) {
            addCriterion("fechaaprueba not in", values, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaBetween(Date value1, Date value2) {
            addCriterion("fechaaprueba between", value1, value2, "fechaaprueba");
            return (Criteria) this;
        }

        public Criteria andFechaapruebaNotBetween(Date value1, Date value2) {
            addCriterion("fechaaprueba not between", value1, value2, "fechaaprueba");
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

        public Criteria andSubserviciosIsNull() {
            addCriterion("subservicios is null");
            return (Criteria) this;
        }

        public Criteria andSubserviciosIsNotNull() {
            addCriterion("subservicios is not null");
            return (Criteria) this;
        }

        public Criteria andSubserviciosEqualTo(String value) {
            addCriterion("subservicios =", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosNotEqualTo(String value) {
            addCriterion("subservicios <>", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosGreaterThan(String value) {
            addCriterion("subservicios >", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosGreaterThanOrEqualTo(String value) {
            addCriterion("subservicios >=", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosLessThan(String value) {
            addCriterion("subservicios <", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosLessThanOrEqualTo(String value) {
            addCriterion("subservicios <=", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosLike(String value) {
            addCriterion("subservicios like", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosNotLike(String value) {
            addCriterion("subservicios not like", value, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosIn(List<String> values) {
            addCriterion("subservicios in", values, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosNotIn(List<String> values) {
            addCriterion("subservicios not in", values, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosBetween(String value1, String value2) {
            addCriterion("subservicios between", value1, value2, "subservicios");
            return (Criteria) this;
        }

        public Criteria andSubserviciosNotBetween(String value1, String value2) {
            addCriterion("subservicios not between", value1, value2, "subservicios");
            return (Criteria) this;
        }

        public Criteria andPplanoIsNull() {
            addCriterion("pplano is null");
            return (Criteria) this;
        }

        public Criteria andPplanoIsNotNull() {
            addCriterion("pplano is not null");
            return (Criteria) this;
        }

        public Criteria andPplanoEqualTo(String value) {
            addCriterion("pplano =", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoNotEqualTo(String value) {
            addCriterion("pplano <>", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoGreaterThan(String value) {
            addCriterion("pplano >", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoGreaterThanOrEqualTo(String value) {
            addCriterion("pplano >=", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoLessThan(String value) {
            addCriterion("pplano <", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoLessThanOrEqualTo(String value) {
            addCriterion("pplano <=", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoLike(String value) {
            addCriterion("pplano like", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoNotLike(String value) {
            addCriterion("pplano not like", value, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoIn(List<String> values) {
            addCriterion("pplano in", values, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoNotIn(List<String> values) {
            addCriterion("pplano not in", values, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoBetween(String value1, String value2) {
            addCriterion("pplano between", value1, value2, "pplano");
            return (Criteria) this;
        }

        public Criteria andPplanoNotBetween(String value1, String value2) {
            addCriterion("pplano not between", value1, value2, "pplano");
            return (Criteria) this;
        }

        public Criteria andPrealIsNull() {
            addCriterion("preal is null");
            return (Criteria) this;
        }

        public Criteria andPrealIsNotNull() {
            addCriterion("preal is not null");
            return (Criteria) this;
        }

        public Criteria andPrealEqualTo(String value) {
            addCriterion("preal =", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealNotEqualTo(String value) {
            addCriterion("preal <>", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealGreaterThan(String value) {
            addCriterion("preal >", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealGreaterThanOrEqualTo(String value) {
            addCriterion("preal >=", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealLessThan(String value) {
            addCriterion("preal <", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealLessThanOrEqualTo(String value) {
            addCriterion("preal <=", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealLike(String value) {
            addCriterion("preal like", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealNotLike(String value) {
            addCriterion("preal not like", value, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealIn(List<String> values) {
            addCriterion("preal in", values, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealNotIn(List<String> values) {
            addCriterion("preal not in", values, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealBetween(String value1, String value2) {
            addCriterion("preal between", value1, value2, "preal");
            return (Criteria) this;
        }

        public Criteria andPrealNotBetween(String value1, String value2) {
            addCriterion("preal not between", value1, value2, "preal");
            return (Criteria) this;
        }

        public Criteria andCodDestinoIsNull() {
            addCriterion("cod_destino is null");
            return (Criteria) this;
        }

        public Criteria andCodDestinoIsNotNull() {
            addCriterion("cod_destino is not null");
            return (Criteria) this;
        }

        public Criteria andCodDestinoEqualTo(String value) {
            addCriterion("cod_destino =", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoNotEqualTo(String value) {
            addCriterion("cod_destino <>", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoGreaterThan(String value) {
            addCriterion("cod_destino >", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoGreaterThanOrEqualTo(String value) {
            addCriterion("cod_destino >=", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoLessThan(String value) {
            addCriterion("cod_destino <", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoLessThanOrEqualTo(String value) {
            addCriterion("cod_destino <=", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoLike(String value) {
            addCriterion("cod_destino like", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoNotLike(String value) {
            addCriterion("cod_destino not like", value, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoIn(List<String> values) {
            addCriterion("cod_destino in", values, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoNotIn(List<String> values) {
            addCriterion("cod_destino not in", values, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoBetween(String value1, String value2) {
            addCriterion("cod_destino between", value1, value2, "codDestino");
            return (Criteria) this;
        }

        public Criteria andCodDestinoNotBetween(String value1, String value2) {
            addCriterion("cod_destino not between", value1, value2, "codDestino");
            return (Criteria) this;
        }

        public Criteria andTTransporteIsNull() {
            addCriterion("t_transporte is null");
            return (Criteria) this;
        }

        public Criteria andTTransporteIsNotNull() {
            addCriterion("t_transporte is not null");
            return (Criteria) this;
        }

        public Criteria andTTransporteEqualTo(String value) {
            addCriterion("t_transporte =", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotEqualTo(String value) {
            addCriterion("t_transporte <>", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteGreaterThan(String value) {
            addCriterion("t_transporte >", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteGreaterThanOrEqualTo(String value) {
            addCriterion("t_transporte >=", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteLessThan(String value) {
            addCriterion("t_transporte <", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteLessThanOrEqualTo(String value) {
            addCriterion("t_transporte <=", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteLike(String value) {
            addCriterion("t_transporte like", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotLike(String value) {
            addCriterion("t_transporte not like", value, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteIn(List<String> values) {
            addCriterion("t_transporte in", values, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotIn(List<String> values) {
            addCriterion("t_transporte not in", values, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteBetween(String value1, String value2) {
            addCriterion("t_transporte between", value1, value2, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andTTransporteNotBetween(String value1, String value2) {
            addCriterion("t_transporte not between", value1, value2, "tTransporte");
            return (Criteria) this;
        }

        public Criteria andPreciokadicIsNull() {
            addCriterion("preciokadic is null");
            return (Criteria) this;
        }

        public Criteria andPreciokadicIsNotNull() {
            addCriterion("preciokadic is not null");
            return (Criteria) this;
        }

        public Criteria andPreciokadicEqualTo(BigDecimal value) {
            addCriterion("preciokadic =", value, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicNotEqualTo(BigDecimal value) {
            addCriterion("preciokadic <>", value, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicGreaterThan(BigDecimal value) {
            addCriterion("preciokadic >", value, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preciokadic >=", value, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicLessThan(BigDecimal value) {
            addCriterion("preciokadic <", value, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preciokadic <=", value, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicIn(List<BigDecimal> values) {
            addCriterion("preciokadic in", values, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicNotIn(List<BigDecimal> values) {
            addCriterion("preciokadic not in", values, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciokadic between", value1, value2, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciokadic not between", value1, value2, "preciokadic");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoIsNull() {
            addCriterion("preciokadic_plano is null");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoIsNotNull() {
            addCriterion("preciokadic_plano is not null");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoEqualTo(BigDecimal value) {
            addCriterion("preciokadic_plano =", value, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoNotEqualTo(BigDecimal value) {
            addCriterion("preciokadic_plano <>", value, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoGreaterThan(BigDecimal value) {
            addCriterion("preciokadic_plano >", value, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preciokadic_plano >=", value, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoLessThan(BigDecimal value) {
            addCriterion("preciokadic_plano <", value, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preciokadic_plano <=", value, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoIn(List<BigDecimal> values) {
            addCriterion("preciokadic_plano in", values, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoNotIn(List<BigDecimal> values) {
            addCriterion("preciokadic_plano not in", values, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciokadic_plano between", value1, value2, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andPreciokadicPlanoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preciokadic_plano not between", value1, value2, "preciokadicPlano");
            return (Criteria) this;
        }

        public Criteria andKgBaseIsNull() {
            addCriterion("kg_base is null");
            return (Criteria) this;
        }

        public Criteria andKgBaseIsNotNull() {
            addCriterion("kg_base is not null");
            return (Criteria) this;
        }

        public Criteria andKgBaseEqualTo(Integer value) {
            addCriterion("kg_base =", value, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseNotEqualTo(Integer value) {
            addCriterion("kg_base <>", value, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseGreaterThan(Integer value) {
            addCriterion("kg_base >", value, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("kg_base >=", value, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseLessThan(Integer value) {
            addCriterion("kg_base <", value, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseLessThanOrEqualTo(Integer value) {
            addCriterion("kg_base <=", value, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseIn(List<Integer> values) {
            addCriterion("kg_base in", values, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseNotIn(List<Integer> values) {
            addCriterion("kg_base not in", values, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseBetween(Integer value1, Integer value2) {
            addCriterion("kg_base between", value1, value2, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgBaseNotBetween(Integer value1, Integer value2) {
            addCriterion("kg_base not between", value1, value2, "kgBase");
            return (Criteria) this;
        }

        public Criteria andKgRecojoIsNull() {
            addCriterion("kg_recojo is null");
            return (Criteria) this;
        }

        public Criteria andKgRecojoIsNotNull() {
            addCriterion("kg_recojo is not null");
            return (Criteria) this;
        }

        public Criteria andKgRecojoEqualTo(BigDecimal value) {
            addCriterion("kg_recojo =", value, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoNotEqualTo(BigDecimal value) {
            addCriterion("kg_recojo <>", value, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoGreaterThan(BigDecimal value) {
            addCriterion("kg_recojo >", value, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kg_recojo >=", value, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoLessThan(BigDecimal value) {
            addCriterion("kg_recojo <", value, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kg_recojo <=", value, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoIn(List<BigDecimal> values) {
            addCriterion("kg_recojo in", values, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoNotIn(List<BigDecimal> values) {
            addCriterion("kg_recojo not in", values, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kg_recojo between", value1, value2, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgRecojoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kg_recojo not between", value1, value2, "kgRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoIsNull() {
            addCriterion("kg_adicional_recojo is null");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoIsNotNull() {
            addCriterion("kg_adicional_recojo is not null");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoEqualTo(BigDecimal value) {
            addCriterion("kg_adicional_recojo =", value, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoNotEqualTo(BigDecimal value) {
            addCriterion("kg_adicional_recojo <>", value, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoGreaterThan(BigDecimal value) {
            addCriterion("kg_adicional_recojo >", value, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kg_adicional_recojo >=", value, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoLessThan(BigDecimal value) {
            addCriterion("kg_adicional_recojo <", value, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kg_adicional_recojo <=", value, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoIn(List<BigDecimal> values) {
            addCriterion("kg_adicional_recojo in", values, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoNotIn(List<BigDecimal> values) {
            addCriterion("kg_adicional_recojo not in", values, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kg_adicional_recojo between", value1, value2, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andKgAdicionalRecojoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kg_adicional_recojo not between", value1, value2, "kgAdicionalRecojo");
            return (Criteria) this;
        }

        public Criteria andRecojoIsNull() {
            addCriterion("recojo is null");
            return (Criteria) this;
        }

        public Criteria andRecojoIsNotNull() {
            addCriterion("recojo is not null");
            return (Criteria) this;
        }

        public Criteria andRecojoEqualTo(String value) {
            addCriterion("recojo =", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoNotEqualTo(String value) {
            addCriterion("recojo <>", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoGreaterThan(String value) {
            addCriterion("recojo >", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoGreaterThanOrEqualTo(String value) {
            addCriterion("recojo >=", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoLessThan(String value) {
            addCriterion("recojo <", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoLessThanOrEqualTo(String value) {
            addCriterion("recojo <=", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoLike(String value) {
            addCriterion("recojo like", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoNotLike(String value) {
            addCriterion("recojo not like", value, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoIn(List<String> values) {
            addCriterion("recojo in", values, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoNotIn(List<String> values) {
            addCriterion("recojo not in", values, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoBetween(String value1, String value2) {
            addCriterion("recojo between", value1, value2, "recojo");
            return (Criteria) this;
        }

        public Criteria andRecojoNotBetween(String value1, String value2) {
            addCriterion("recojo not between", value1, value2, "recojo");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenIsNull() {
            addCriterion("ubigeo_origen is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenIsNotNull() {
            addCriterion("ubigeo_origen is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenEqualTo(String value) {
            addCriterion("ubigeo_origen =", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenNotEqualTo(String value) {
            addCriterion("ubigeo_origen <>", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenGreaterThan(String value) {
            addCriterion("ubigeo_origen >", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeo_origen >=", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenLessThan(String value) {
            addCriterion("ubigeo_origen <", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenLessThanOrEqualTo(String value) {
            addCriterion("ubigeo_origen <=", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenLike(String value) {
            addCriterion("ubigeo_origen like", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenNotLike(String value) {
            addCriterion("ubigeo_origen not like", value, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenIn(List<String> values) {
            addCriterion("ubigeo_origen in", values, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenNotIn(List<String> values) {
            addCriterion("ubigeo_origen not in", values, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenBetween(String value1, String value2) {
            addCriterion("ubigeo_origen between", value1, value2, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoOrigenNotBetween(String value1, String value2) {
            addCriterion("ubigeo_origen not between", value1, value2, "ubigeoOrigen");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoIsNull() {
            addCriterion("ubigeo_destino is null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoIsNotNull() {
            addCriterion("ubigeo_destino is not null");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoEqualTo(String value) {
            addCriterion("ubigeo_destino =", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoNotEqualTo(String value) {
            addCriterion("ubigeo_destino <>", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoGreaterThan(String value) {
            addCriterion("ubigeo_destino >", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoGreaterThanOrEqualTo(String value) {
            addCriterion("ubigeo_destino >=", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoLessThan(String value) {
            addCriterion("ubigeo_destino <", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoLessThanOrEqualTo(String value) {
            addCriterion("ubigeo_destino <=", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoLike(String value) {
            addCriterion("ubigeo_destino like", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoNotLike(String value) {
            addCriterion("ubigeo_destino not like", value, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoIn(List<String> values) {
            addCriterion("ubigeo_destino in", values, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoNotIn(List<String> values) {
            addCriterion("ubigeo_destino not in", values, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoBetween(String value1, String value2) {
            addCriterion("ubigeo_destino between", value1, value2, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andUbigeoDestinoNotBetween(String value1, String value2) {
            addCriterion("ubigeo_destino not between", value1, value2, "ubigeoDestino");
            return (Criteria) this;
        }

        public Criteria andCodunidadIsNull() {
            addCriterion("codunidad is null");
            return (Criteria) this;
        }

        public Criteria andCodunidadIsNotNull() {
            addCriterion("codunidad is not null");
            return (Criteria) this;
        }

        public Criteria andCodunidadEqualTo(String value) {
            addCriterion("codunidad =", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadNotEqualTo(String value) {
            addCriterion("codunidad <>", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadGreaterThan(String value) {
            addCriterion("codunidad >", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadGreaterThanOrEqualTo(String value) {
            addCriterion("codunidad >=", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadLessThan(String value) {
            addCriterion("codunidad <", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadLessThanOrEqualTo(String value) {
            addCriterion("codunidad <=", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadLike(String value) {
            addCriterion("codunidad like", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadNotLike(String value) {
            addCriterion("codunidad not like", value, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadIn(List<String> values) {
            addCriterion("codunidad in", values, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadNotIn(List<String> values) {
            addCriterion("codunidad not in", values, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadBetween(String value1, String value2) {
            addCriterion("codunidad between", value1, value2, "codunidad");
            return (Criteria) this;
        }

        public Criteria andCodunidadNotBetween(String value1, String value2) {
            addCriterion("codunidad not between", value1, value2, "codunidad");
            return (Criteria) this;
        }

        public Criteria andDesServicioIsNull() {
            addCriterion("des_servicio is null");
            return (Criteria) this;
        }

        public Criteria andDesServicioIsNotNull() {
            addCriterion("des_servicio is not null");
            return (Criteria) this;
        }

        public Criteria andDesServicioEqualTo(String value) {
            addCriterion("des_servicio =", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioNotEqualTo(String value) {
            addCriterion("des_servicio <>", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioGreaterThan(String value) {
            addCriterion("des_servicio >", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioGreaterThanOrEqualTo(String value) {
            addCriterion("des_servicio >=", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioLessThan(String value) {
            addCriterion("des_servicio <", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioLessThanOrEqualTo(String value) {
            addCriterion("des_servicio <=", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioLike(String value) {
            addCriterion("des_servicio like", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioNotLike(String value) {
            addCriterion("des_servicio not like", value, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioIn(List<String> values) {
            addCriterion("des_servicio in", values, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioNotIn(List<String> values) {
            addCriterion("des_servicio not in", values, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioBetween(String value1, String value2) {
            addCriterion("des_servicio between", value1, value2, "desServicio");
            return (Criteria) this;
        }

        public Criteria andDesServicioNotBetween(String value1, String value2) {
            addCriterion("des_servicio not between", value1, value2, "desServicio");
            return (Criteria) this;
        }

        public Criteria andZonalIsNull() {
            addCriterion("zonal is null");
            return (Criteria) this;
        }

        public Criteria andZonalIsNotNull() {
            addCriterion("zonal is not null");
            return (Criteria) this;
        }

        public Criteria andZonalEqualTo(String value) {
            addCriterion("zonal =", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalNotEqualTo(String value) {
            addCriterion("zonal <>", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalGreaterThan(String value) {
            addCriterion("zonal >", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalGreaterThanOrEqualTo(String value) {
            addCriterion("zonal >=", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalLessThan(String value) {
            addCriterion("zonal <", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalLessThanOrEqualTo(String value) {
            addCriterion("zonal <=", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalLike(String value) {
            addCriterion("zonal like", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalNotLike(String value) {
            addCriterion("zonal not like", value, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalIn(List<String> values) {
            addCriterion("zonal in", values, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalNotIn(List<String> values) {
            addCriterion("zonal not in", values, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalBetween(String value1, String value2) {
            addCriterion("zonal between", value1, value2, "zonal");
            return (Criteria) this;
        }

        public Criteria andZonalNotBetween(String value1, String value2) {
            addCriterion("zonal not between", value1, value2, "zonal");
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