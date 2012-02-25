package pe.com.j2techcon.bi.etl.domain.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TDespachoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDespachoExample() {
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

        public Criteria andDespIdIsNull() {
            addCriterion("desp_id is null");
            return (Criteria) this;
        }

        public Criteria andDespIdIsNotNull() {
            addCriterion("desp_id is not null");
            return (Criteria) this;
        }

        public Criteria andDespIdEqualTo(Integer value) {
            addCriterion("desp_id =", value, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdNotEqualTo(Integer value) {
            addCriterion("desp_id <>", value, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdGreaterThan(Integer value) {
            addCriterion("desp_id >", value, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("desp_id >=", value, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdLessThan(Integer value) {
            addCriterion("desp_id <", value, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdLessThanOrEqualTo(Integer value) {
            addCriterion("desp_id <=", value, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdIn(List<Integer> values) {
            addCriterion("desp_id in", values, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdNotIn(List<Integer> values) {
            addCriterion("desp_id not in", values, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdBetween(Integer value1, Integer value2) {
            addCriterion("desp_id between", value1, value2, "despId");
            return (Criteria) this;
        }

        public Criteria andDespIdNotBetween(Integer value1, Integer value2) {
            addCriterion("desp_id not between", value1, value2, "despId");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocIsNull() {
            addCriterion("desp_cod_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocIsNotNull() {
            addCriterion("desp_cod_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocEqualTo(Integer value) {
            addCriterion("desp_cod_tip_doc =", value, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocNotEqualTo(Integer value) {
            addCriterion("desp_cod_tip_doc <>", value, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocGreaterThan(Integer value) {
            addCriterion("desp_cod_tip_doc >", value, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_tip_doc >=", value, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocLessThan(Integer value) {
            addCriterion("desp_cod_tip_doc <", value, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocLessThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_tip_doc <=", value, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocIn(List<Integer> values) {
            addCriterion("desp_cod_tip_doc in", values, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocNotIn(List<Integer> values) {
            addCriterion("desp_cod_tip_doc not in", values, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_tip_doc between", value1, value2, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespCodTipDocNotBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_tip_doc not between", value1, value2, "despCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocIsNull() {
            addCriterion("desp_serie_doc is null");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocIsNotNull() {
            addCriterion("desp_serie_doc is not null");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocEqualTo(String value) {
            addCriterion("desp_serie_doc =", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocNotEqualTo(String value) {
            addCriterion("desp_serie_doc <>", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocGreaterThan(String value) {
            addCriterion("desp_serie_doc >", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocGreaterThanOrEqualTo(String value) {
            addCriterion("desp_serie_doc >=", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocLessThan(String value) {
            addCriterion("desp_serie_doc <", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocLessThanOrEqualTo(String value) {
            addCriterion("desp_serie_doc <=", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocLike(String value) {
            addCriterion("desp_serie_doc like", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocNotLike(String value) {
            addCriterion("desp_serie_doc not like", value, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocIn(List<String> values) {
            addCriterion("desp_serie_doc in", values, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocNotIn(List<String> values) {
            addCriterion("desp_serie_doc not in", values, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocBetween(String value1, String value2) {
            addCriterion("desp_serie_doc between", value1, value2, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespSerieDocNotBetween(String value1, String value2) {
            addCriterion("desp_serie_doc not between", value1, value2, "despSerieDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocIsNull() {
            addCriterion("desp_numero_doc is null");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocIsNotNull() {
            addCriterion("desp_numero_doc is not null");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocEqualTo(String value) {
            addCriterion("desp_numero_doc =", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocNotEqualTo(String value) {
            addCriterion("desp_numero_doc <>", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocGreaterThan(String value) {
            addCriterion("desp_numero_doc >", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocGreaterThanOrEqualTo(String value) {
            addCriterion("desp_numero_doc >=", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocLessThan(String value) {
            addCriterion("desp_numero_doc <", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocLessThanOrEqualTo(String value) {
            addCriterion("desp_numero_doc <=", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocLike(String value) {
            addCriterion("desp_numero_doc like", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocNotLike(String value) {
            addCriterion("desp_numero_doc not like", value, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocIn(List<String> values) {
            addCriterion("desp_numero_doc in", values, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocNotIn(List<String> values) {
            addCriterion("desp_numero_doc not in", values, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocBetween(String value1, String value2) {
            addCriterion("desp_numero_doc between", value1, value2, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andDespNumeroDocNotBetween(String value1, String value2) {
            addCriterion("desp_numero_doc not between", value1, value2, "despNumeroDoc");
            return (Criteria) this;
        }

        public Criteria andSedIdIsNull() {
            addCriterion("sed_id is null");
            return (Criteria) this;
        }

        public Criteria andSedIdIsNotNull() {
            addCriterion("sed_id is not null");
            return (Criteria) this;
        }

        public Criteria andSedIdEqualTo(Integer value) {
            addCriterion("sed_id =", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdNotEqualTo(Integer value) {
            addCriterion("sed_id <>", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdGreaterThan(Integer value) {
            addCriterion("sed_id >", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sed_id >=", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdLessThan(Integer value) {
            addCriterion("sed_id <", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdLessThanOrEqualTo(Integer value) {
            addCriterion("sed_id <=", value, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdIn(List<Integer> values) {
            addCriterion("sed_id in", values, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdNotIn(List<Integer> values) {
            addCriterion("sed_id not in", values, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdBetween(Integer value1, Integer value2) {
            addCriterion("sed_id between", value1, value2, "sedId");
            return (Criteria) this;
        }

        public Criteria andSedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sed_id not between", value1, value2, "sedId");
            return (Criteria) this;
        }

        public Criteria andZonIdIsNull() {
            addCriterion("zon_id is null");
            return (Criteria) this;
        }

        public Criteria andZonIdIsNotNull() {
            addCriterion("zon_id is not null");
            return (Criteria) this;
        }

        public Criteria andZonIdEqualTo(Integer value) {
            addCriterion("zon_id =", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdNotEqualTo(Integer value) {
            addCriterion("zon_id <>", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdGreaterThan(Integer value) {
            addCriterion("zon_id >", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zon_id >=", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdLessThan(Integer value) {
            addCriterion("zon_id <", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdLessThanOrEqualTo(Integer value) {
            addCriterion("zon_id <=", value, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdIn(List<Integer> values) {
            addCriterion("zon_id in", values, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdNotIn(List<Integer> values) {
            addCriterion("zon_id not in", values, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdBetween(Integer value1, Integer value2) {
            addCriterion("zon_id between", value1, value2, "zonId");
            return (Criteria) this;
        }

        public Criteria andZonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zon_id not between", value1, value2, "zonId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdIsNull() {
            addCriterion("emp_cat_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdIsNotNull() {
            addCriterion("emp_cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdEqualTo(Integer value) {
            addCriterion("emp_cat_id =", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdNotEqualTo(Integer value) {
            addCriterion("emp_cat_id <>", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdGreaterThan(Integer value) {
            addCriterion("emp_cat_id >", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_cat_id >=", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdLessThan(Integer value) {
            addCriterion("emp_cat_id <", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_cat_id <=", value, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdIn(List<Integer> values) {
            addCriterion("emp_cat_id in", values, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdNotIn(List<Integer> values) {
            addCriterion("emp_cat_id not in", values, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_cat_id between", value1, value2, "empCatId");
            return (Criteria) this;
        }

        public Criteria andEmpCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_cat_id not between", value1, value2, "empCatId");
            return (Criteria) this;
        }

        public Criteria andDespCodTipIsNull() {
            addCriterion("desp_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andDespCodTipIsNotNull() {
            addCriterion("desp_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andDespCodTipEqualTo(Integer value) {
            addCriterion("desp_cod_tip =", value, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipNotEqualTo(Integer value) {
            addCriterion("desp_cod_tip <>", value, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipGreaterThan(Integer value) {
            addCriterion("desp_cod_tip >", value, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_tip >=", value, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipLessThan(Integer value) {
            addCriterion("desp_cod_tip <", value, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_tip <=", value, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipIn(List<Integer> values) {
            addCriterion("desp_cod_tip in", values, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipNotIn(List<Integer> values) {
            addCriterion("desp_cod_tip not in", values, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_tip between", value1, value2, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_tip not between", value1, value2, "despCodTip");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutIsNull() {
            addCriterion("desp_cod_tip_rut is null");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutIsNotNull() {
            addCriterion("desp_cod_tip_rut is not null");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutEqualTo(Integer value) {
            addCriterion("desp_cod_tip_rut =", value, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutNotEqualTo(Integer value) {
            addCriterion("desp_cod_tip_rut <>", value, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutGreaterThan(Integer value) {
            addCriterion("desp_cod_tip_rut >", value, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutGreaterThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_tip_rut >=", value, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutLessThan(Integer value) {
            addCriterion("desp_cod_tip_rut <", value, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutLessThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_tip_rut <=", value, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutIn(List<Integer> values) {
            addCriterion("desp_cod_tip_rut in", values, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutNotIn(List<Integer> values) {
            addCriterion("desp_cod_tip_rut not in", values, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_tip_rut between", value1, value2, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodTipRutNotBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_tip_rut not between", value1, value2, "despCodTipRut");
            return (Criteria) this;
        }

        public Criteria andDespCodVerIsNull() {
            addCriterion("desp_cod_ver is null");
            return (Criteria) this;
        }

        public Criteria andDespCodVerIsNotNull() {
            addCriterion("desp_cod_ver is not null");
            return (Criteria) this;
        }

        public Criteria andDespCodVerEqualTo(Integer value) {
            addCriterion("desp_cod_ver =", value, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerNotEqualTo(Integer value) {
            addCriterion("desp_cod_ver <>", value, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerGreaterThan(Integer value) {
            addCriterion("desp_cod_ver >", value, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerGreaterThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_ver >=", value, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerLessThan(Integer value) {
            addCriterion("desp_cod_ver <", value, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerLessThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_ver <=", value, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerIn(List<Integer> values) {
            addCriterion("desp_cod_ver in", values, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerNotIn(List<Integer> values) {
            addCriterion("desp_cod_ver not in", values, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_ver between", value1, value2, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespCodVerNotBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_ver not between", value1, value2, "despCodVer");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeIsNull() {
            addCriterion("desp_mon_pasaje is null");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeIsNotNull() {
            addCriterion("desp_mon_pasaje is not null");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeEqualTo(BigDecimal value) {
            addCriterion("desp_mon_pasaje =", value, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeNotEqualTo(BigDecimal value) {
            addCriterion("desp_mon_pasaje <>", value, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeGreaterThan(BigDecimal value) {
            addCriterion("desp_mon_pasaje >", value, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("desp_mon_pasaje >=", value, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeLessThan(BigDecimal value) {
            addCriterion("desp_mon_pasaje <", value, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("desp_mon_pasaje <=", value, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeIn(List<BigDecimal> values) {
            addCriterion("desp_mon_pasaje in", values, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeNotIn(List<BigDecimal> values) {
            addCriterion("desp_mon_pasaje not in", values, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("desp_mon_pasaje between", value1, value2, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespMonPasajeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("desp_mon_pasaje not between", value1, value2, "despMonPasaje");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosIsNull() {
            addCriterion("desp_cnt_cargos is null");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosIsNotNull() {
            addCriterion("desp_cnt_cargos is not null");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosEqualTo(Integer value) {
            addCriterion("desp_cnt_cargos =", value, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosNotEqualTo(Integer value) {
            addCriterion("desp_cnt_cargos <>", value, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosGreaterThan(Integer value) {
            addCriterion("desp_cnt_cargos >", value, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosGreaterThanOrEqualTo(Integer value) {
            addCriterion("desp_cnt_cargos >=", value, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosLessThan(Integer value) {
            addCriterion("desp_cnt_cargos <", value, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosLessThanOrEqualTo(Integer value) {
            addCriterion("desp_cnt_cargos <=", value, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosIn(List<Integer> values) {
            addCriterion("desp_cnt_cargos in", values, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosNotIn(List<Integer> values) {
            addCriterion("desp_cnt_cargos not in", values, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosBetween(Integer value1, Integer value2) {
            addCriterion("desp_cnt_cargos between", value1, value2, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespCntCargosNotBetween(Integer value1, Integer value2) {
            addCriterion("desp_cnt_cargos not between", value1, value2, "despCntCargos");
            return (Criteria) this;
        }

        public Criteria andDespFecSalIsNull() {
            addCriterion("desp_fec_sal is null");
            return (Criteria) this;
        }

        public Criteria andDespFecSalIsNotNull() {
            addCriterion("desp_fec_sal is not null");
            return (Criteria) this;
        }

        public Criteria andDespFecSalEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_sal =", value, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalNotEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_sal <>", value, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalGreaterThan(Date value) {
            addCriterionForJDBCDate("desp_fec_sal >", value, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_sal >=", value, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalLessThan(Date value) {
            addCriterionForJDBCDate("desp_fec_sal <", value, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_sal <=", value, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_sal in", values, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalNotIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_sal not in", values, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_sal between", value1, value2, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecSalNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_sal not between", value1, value2, "despFecSal");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProIsNull() {
            addCriterion("desp_fec_ret_pro is null");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProIsNotNull() {
            addCriterion("desp_fec_ret_pro is not null");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_pro =", value, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProNotEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_pro <>", value, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProGreaterThan(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_pro >", value, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_pro >=", value, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProLessThan(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_pro <", value, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_pro <=", value, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_ret_pro in", values, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProNotIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_ret_pro not in", values, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_ret_pro between", value1, value2, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetProNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_ret_pro not between", value1, value2, "despFecRetPro");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaIsNull() {
            addCriterion("desp_fec_ret_rea is null");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaIsNotNull() {
            addCriterion("desp_fec_ret_rea is not null");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_rea =", value, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaNotEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_rea <>", value, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaGreaterThan(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_rea >", value, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_rea >=", value, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaLessThan(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_rea <", value, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ret_rea <=", value, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_ret_rea in", values, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaNotIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_ret_rea not in", values, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_ret_rea between", value1, value2, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecRetReaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_ret_rea not between", value1, value2, "despFecRetRea");
            return (Criteria) this;
        }

        public Criteria andDespFecVerIsNull() {
            addCriterion("desp_fec_ver is null");
            return (Criteria) this;
        }

        public Criteria andDespFecVerIsNotNull() {
            addCriterion("desp_fec_ver is not null");
            return (Criteria) this;
        }

        public Criteria andDespFecVerEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ver =", value, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerNotEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ver <>", value, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerGreaterThan(Date value) {
            addCriterionForJDBCDate("desp_fec_ver >", value, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ver >=", value, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerLessThan(Date value) {
            addCriterionForJDBCDate("desp_fec_ver <", value, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("desp_fec_ver <=", value, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_ver in", values, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerNotIn(List<Date> values) {
            addCriterionForJDBCDate("desp_fec_ver not in", values, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_ver between", value1, value2, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespFecVerNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("desp_fec_ver not between", value1, value2, "despFecVer");
            return (Criteria) this;
        }

        public Criteria andDespCanPasIsNull() {
            addCriterion("desp_can_pas is null");
            return (Criteria) this;
        }

        public Criteria andDespCanPasIsNotNull() {
            addCriterion("desp_can_pas is not null");
            return (Criteria) this;
        }

        public Criteria andDespCanPasEqualTo(BigDecimal value) {
            addCriterion("desp_can_pas =", value, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasNotEqualTo(BigDecimal value) {
            addCriterion("desp_can_pas <>", value, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasGreaterThan(BigDecimal value) {
            addCriterion("desp_can_pas >", value, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("desp_can_pas >=", value, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasLessThan(BigDecimal value) {
            addCriterion("desp_can_pas <", value, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasLessThanOrEqualTo(BigDecimal value) {
            addCriterion("desp_can_pas <=", value, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasIn(List<BigDecimal> values) {
            addCriterion("desp_can_pas in", values, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasNotIn(List<BigDecimal> values) {
            addCriterion("desp_can_pas not in", values, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("desp_can_pas between", value1, value2, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCanPasNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("desp_can_pas not between", value1, value2, "despCanPas");
            return (Criteria) this;
        }

        public Criteria andDespCodEstIsNull() {
            addCriterion("desp_cod_est is null");
            return (Criteria) this;
        }

        public Criteria andDespCodEstIsNotNull() {
            addCriterion("desp_cod_est is not null");
            return (Criteria) this;
        }

        public Criteria andDespCodEstEqualTo(Integer value) {
            addCriterion("desp_cod_est =", value, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstNotEqualTo(Integer value) {
            addCriterion("desp_cod_est <>", value, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstGreaterThan(Integer value) {
            addCriterion("desp_cod_est >", value, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstGreaterThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_est >=", value, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstLessThan(Integer value) {
            addCriterion("desp_cod_est <", value, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstLessThanOrEqualTo(Integer value) {
            addCriterion("desp_cod_est <=", value, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstIn(List<Integer> values) {
            addCriterion("desp_cod_est in", values, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstNotIn(List<Integer> values) {
            addCriterion("desp_cod_est not in", values, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_est between", value1, value2, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andDespCodEstNotBetween(Integer value1, Integer value2) {
            addCriterion("desp_cod_est not between", value1, value2, "despCodEst");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIsNull() {
            addCriterion("fec_num_cam is null");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIsNotNull() {
            addCriterion("fec_num_cam is not null");
            return (Criteria) this;
        }

        public Criteria andFecNumCamEqualTo(Integer value) {
            addCriterion("fec_num_cam =", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotEqualTo(Integer value) {
            addCriterion("fec_num_cam <>", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThan(Integer value) {
            addCriterion("fec_num_cam >", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThanOrEqualTo(Integer value) {
            addCriterion("fec_num_cam >=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThan(Integer value) {
            addCriterion("fec_num_cam <", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThanOrEqualTo(Integer value) {
            addCriterion("fec_num_cam <=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIn(List<Integer> values) {
            addCriterion("fec_num_cam in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotIn(List<Integer> values) {
            addCriterion("fec_num_cam not in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamBetween(Integer value1, Integer value2) {
            addCriterion("fec_num_cam between", value1, value2, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotBetween(Integer value1, Integer value2) {
            addCriterion("fec_num_cam not between", value1, value2, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamIsNull() {
            addCriterion("cod_ind_cam is null");
            return (Criteria) this;
        }

        public Criteria andCodIndCamIsNotNull() {
            addCriterion("cod_ind_cam is not null");
            return (Criteria) this;
        }

        public Criteria andCodIndCamEqualTo(String value) {
            addCriterion("cod_ind_cam =", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotEqualTo(String value) {
            addCriterion("cod_ind_cam <>", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamGreaterThan(String value) {
            addCriterion("cod_ind_cam >", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamGreaterThanOrEqualTo(String value) {
            addCriterion("cod_ind_cam >=", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamLessThan(String value) {
            addCriterion("cod_ind_cam <", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamLessThanOrEqualTo(String value) {
            addCriterion("cod_ind_cam <=", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamLike(String value) {
            addCriterion("cod_ind_cam like", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotLike(String value) {
            addCriterion("cod_ind_cam not like", value, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamIn(List<String> values) {
            addCriterion("cod_ind_cam in", values, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotIn(List<String> values) {
            addCriterion("cod_ind_cam not in", values, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamBetween(String value1, String value2) {
            addCriterion("cod_ind_cam between", value1, value2, "codIndCam");
            return (Criteria) this;
        }

        public Criteria andCodIndCamNotBetween(String value1, String value2) {
            addCriterion("cod_ind_cam not between", value1, value2, "codIndCam");
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