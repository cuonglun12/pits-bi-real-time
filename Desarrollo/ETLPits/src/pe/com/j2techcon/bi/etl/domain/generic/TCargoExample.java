package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCargoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCargoExample() {
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

        public Criteria andCargIdIsNull() {
            addCriterion("carg_id is null");
            return (Criteria) this;
        }

        public Criteria andCargIdIsNotNull() {
            addCriterion("carg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCargIdEqualTo(Integer value) {
            addCriterion("carg_id =", value, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdNotEqualTo(Integer value) {
            addCriterion("carg_id <>", value, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdGreaterThan(Integer value) {
            addCriterion("carg_id >", value, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carg_id >=", value, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdLessThan(Integer value) {
            addCriterion("carg_id <", value, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdLessThanOrEqualTo(Integer value) {
            addCriterion("carg_id <=", value, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdIn(List<Integer> values) {
            addCriterion("carg_id in", values, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdNotIn(List<Integer> values) {
            addCriterion("carg_id not in", values, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdBetween(Integer value1, Integer value2) {
            addCriterion("carg_id between", value1, value2, "cargId");
            return (Criteria) this;
        }

        public Criteria andCargIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carg_id not between", value1, value2, "cargId");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocIsNull() {
            addCriterion("ord_cod_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocIsNotNull() {
            addCriterion("ord_cod_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocEqualTo(Integer value) {
            addCriterion("ord_cod_tip_doc =", value, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocNotEqualTo(Integer value) {
            addCriterion("ord_cod_tip_doc <>", value, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocGreaterThan(Integer value) {
            addCriterion("ord_cod_tip_doc >", value, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_doc >=", value, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocLessThan(Integer value) {
            addCriterion("ord_cod_tip_doc <", value, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocLessThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_doc <=", value, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocIn(List<Integer> values) {
            addCriterion("ord_cod_tip_doc in", values, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocNotIn(List<Integer> values) {
            addCriterion("ord_cod_tip_doc not in", values, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_doc between", value1, value2, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipDocNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_doc not between", value1, value2, "ordCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocIsNull() {
            addCriterion("ord_serie_doc is null");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocIsNotNull() {
            addCriterion("ord_serie_doc is not null");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocEqualTo(String value) {
            addCriterion("ord_serie_doc =", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocNotEqualTo(String value) {
            addCriterion("ord_serie_doc <>", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocGreaterThan(String value) {
            addCriterion("ord_serie_doc >", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocGreaterThanOrEqualTo(String value) {
            addCriterion("ord_serie_doc >=", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocLessThan(String value) {
            addCriterion("ord_serie_doc <", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocLessThanOrEqualTo(String value) {
            addCriterion("ord_serie_doc <=", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocLike(String value) {
            addCriterion("ord_serie_doc like", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocNotLike(String value) {
            addCriterion("ord_serie_doc not like", value, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocIn(List<String> values) {
            addCriterion("ord_serie_doc in", values, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocNotIn(List<String> values) {
            addCriterion("ord_serie_doc not in", values, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocBetween(String value1, String value2) {
            addCriterion("ord_serie_doc between", value1, value2, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdSerieDocNotBetween(String value1, String value2) {
            addCriterion("ord_serie_doc not between", value1, value2, "ordSerieDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocIsNull() {
            addCriterion("ord_num_doc is null");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocIsNotNull() {
            addCriterion("ord_num_doc is not null");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocEqualTo(String value) {
            addCriterion("ord_num_doc =", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocNotEqualTo(String value) {
            addCriterion("ord_num_doc <>", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocGreaterThan(String value) {
            addCriterion("ord_num_doc >", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocGreaterThanOrEqualTo(String value) {
            addCriterion("ord_num_doc >=", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocLessThan(String value) {
            addCriterion("ord_num_doc <", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocLessThanOrEqualTo(String value) {
            addCriterion("ord_num_doc <=", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocLike(String value) {
            addCriterion("ord_num_doc like", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocNotLike(String value) {
            addCriterion("ord_num_doc not like", value, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocIn(List<String> values) {
            addCriterion("ord_num_doc in", values, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocNotIn(List<String> values) {
            addCriterion("ord_num_doc not in", values, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocBetween(String value1, String value2) {
            addCriterion("ord_num_doc between", value1, value2, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andOrdNumDocNotBetween(String value1, String value2) {
            addCriterion("ord_num_doc not between", value1, value2, "ordNumDoc");
            return (Criteria) this;
        }

        public Criteria andCargCorrIsNull() {
            addCriterion("carg_corr is null");
            return (Criteria) this;
        }

        public Criteria andCargCorrIsNotNull() {
            addCriterion("carg_corr is not null");
            return (Criteria) this;
        }

        public Criteria andCargCorrEqualTo(Integer value) {
            addCriterion("carg_corr =", value, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrNotEqualTo(Integer value) {
            addCriterion("carg_corr <>", value, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrGreaterThan(Integer value) {
            addCriterion("carg_corr >", value, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrGreaterThanOrEqualTo(Integer value) {
            addCriterion("carg_corr >=", value, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrLessThan(Integer value) {
            addCriterion("carg_corr <", value, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrLessThanOrEqualTo(Integer value) {
            addCriterion("carg_corr <=", value, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrIn(List<Integer> values) {
            addCriterion("carg_corr in", values, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrNotIn(List<Integer> values) {
            addCriterion("carg_corr not in", values, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrBetween(Integer value1, Integer value2) {
            addCriterion("carg_corr between", value1, value2, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCorrNotBetween(Integer value1, Integer value2) {
            addCriterion("carg_corr not between", value1, value2, "cargCorr");
            return (Criteria) this;
        }

        public Criteria andCargCodCompIsNull() {
            addCriterion("carg_cod_comp is null");
            return (Criteria) this;
        }

        public Criteria andCargCodCompIsNotNull() {
            addCriterion("carg_cod_comp is not null");
            return (Criteria) this;
        }

        public Criteria andCargCodCompEqualTo(String value) {
            addCriterion("carg_cod_comp =", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompNotEqualTo(String value) {
            addCriterion("carg_cod_comp <>", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompGreaterThan(String value) {
            addCriterion("carg_cod_comp >", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompGreaterThanOrEqualTo(String value) {
            addCriterion("carg_cod_comp >=", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompLessThan(String value) {
            addCriterion("carg_cod_comp <", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompLessThanOrEqualTo(String value) {
            addCriterion("carg_cod_comp <=", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompLike(String value) {
            addCriterion("carg_cod_comp like", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompNotLike(String value) {
            addCriterion("carg_cod_comp not like", value, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompIn(List<String> values) {
            addCriterion("carg_cod_comp in", values, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompNotIn(List<String> values) {
            addCriterion("carg_cod_comp not in", values, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompBetween(String value1, String value2) {
            addCriterion("carg_cod_comp between", value1, value2, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andCargCodCompNotBetween(String value1, String value2) {
            addCriterion("carg_cod_comp not between", value1, value2, "cargCodComp");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNull() {
            addCriterion("ord_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdIdIsNotNull() {
            addCriterion("ord_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIdEqualTo(Integer value) {
            addCriterion("ord_id =", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotEqualTo(Integer value) {
            addCriterion("ord_id <>", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThan(Integer value) {
            addCriterion("ord_id >", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_id >=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThan(Integer value) {
            addCriterion("ord_id <", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ord_id <=", value, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdIn(List<Integer> values) {
            addCriterion("ord_id in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotIn(List<Integer> values) {
            addCriterion("ord_id not in", values, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdBetween(Integer value1, Integer value2) {
            addCriterion("ord_id between", value1, value2, "ordId");
            return (Criteria) this;
        }

        public Criteria andOrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_id not between", value1, value2, "ordId");
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

        public Criteria andZonIdNewIsNull() {
            addCriterion("zon_id_new is null");
            return (Criteria) this;
        }

        public Criteria andZonIdNewIsNotNull() {
            addCriterion("zon_id_new is not null");
            return (Criteria) this;
        }

        public Criteria andZonIdNewEqualTo(Integer value) {
            addCriterion("zon_id_new =", value, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewNotEqualTo(Integer value) {
            addCriterion("zon_id_new <>", value, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewGreaterThan(Integer value) {
            addCriterion("zon_id_new >", value, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("zon_id_new >=", value, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewLessThan(Integer value) {
            addCriterion("zon_id_new <", value, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewLessThanOrEqualTo(Integer value) {
            addCriterion("zon_id_new <=", value, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewIn(List<Integer> values) {
            addCriterion("zon_id_new in", values, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewNotIn(List<Integer> values) {
            addCriterion("zon_id_new not in", values, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewBetween(Integer value1, Integer value2) {
            addCriterion("zon_id_new between", value1, value2, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andZonIdNewNotBetween(Integer value1, Integer value2) {
            addCriterion("zon_id_new not between", value1, value2, "zonIdNew");
            return (Criteria) this;
        }

        public Criteria andCargCodMovIsNull() {
            addCriterion("carg_cod_mov is null");
            return (Criteria) this;
        }

        public Criteria andCargCodMovIsNotNull() {
            addCriterion("carg_cod_mov is not null");
            return (Criteria) this;
        }

        public Criteria andCargCodMovEqualTo(Integer value) {
            addCriterion("carg_cod_mov =", value, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovNotEqualTo(Integer value) {
            addCriterion("carg_cod_mov <>", value, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovGreaterThan(Integer value) {
            addCriterion("carg_cod_mov >", value, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovGreaterThanOrEqualTo(Integer value) {
            addCriterion("carg_cod_mov >=", value, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovLessThan(Integer value) {
            addCriterion("carg_cod_mov <", value, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovLessThanOrEqualTo(Integer value) {
            addCriterion("carg_cod_mov <=", value, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovIn(List<Integer> values) {
            addCriterion("carg_cod_mov in", values, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovNotIn(List<Integer> values) {
            addCriterion("carg_cod_mov not in", values, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovBetween(Integer value1, Integer value2) {
            addCriterion("carg_cod_mov between", value1, value2, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodMovNotBetween(Integer value1, Integer value2) {
            addCriterion("carg_cod_mov not between", value1, value2, "cargCodMov");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngIsNull() {
            addCriterion("carg_cod_tip_ing is null");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngIsNotNull() {
            addCriterion("carg_cod_tip_ing is not null");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngEqualTo(Integer value) {
            addCriterion("carg_cod_tip_ing =", value, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngNotEqualTo(Integer value) {
            addCriterion("carg_cod_tip_ing <>", value, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngGreaterThan(Integer value) {
            addCriterion("carg_cod_tip_ing >", value, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngGreaterThanOrEqualTo(Integer value) {
            addCriterion("carg_cod_tip_ing >=", value, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngLessThan(Integer value) {
            addCriterion("carg_cod_tip_ing <", value, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngLessThanOrEqualTo(Integer value) {
            addCriterion("carg_cod_tip_ing <=", value, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngIn(List<Integer> values) {
            addCriterion("carg_cod_tip_ing in", values, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngNotIn(List<Integer> values) {
            addCriterion("carg_cod_tip_ing not in", values, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngBetween(Integer value1, Integer value2) {
            addCriterion("carg_cod_tip_ing between", value1, value2, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargCodTipIngNotBetween(Integer value1, Integer value2) {
            addCriterion("carg_cod_tip_ing not between", value1, value2, "cargCodTipIng");
            return (Criteria) this;
        }

        public Criteria andCargFecDesIsNull() {
            addCriterion("carg_fec_des is null");
            return (Criteria) this;
        }

        public Criteria andCargFecDesIsNotNull() {
            addCriterion("carg_fec_des is not null");
            return (Criteria) this;
        }

        public Criteria andCargFecDesEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_des =", value, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesNotEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_des <>", value, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesGreaterThan(Date value) {
            addCriterionForJDBCDate("carg_fec_des >", value, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_des >=", value, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesLessThan(Date value) {
            addCriterionForJDBCDate("carg_fec_des <", value, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_des <=", value, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesIn(List<Date> values) {
            addCriterionForJDBCDate("carg_fec_des in", values, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesNotIn(List<Date> values) {
            addCriterionForJDBCDate("carg_fec_des not in", values, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carg_fec_des between", value1, value2, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecDesNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carg_fec_des not between", value1, value2, "cargFecDes");
            return (Criteria) this;
        }

        public Criteria andCargFecRecIsNull() {
            addCriterion("carg_fec_rec is null");
            return (Criteria) this;
        }

        public Criteria andCargFecRecIsNotNull() {
            addCriterion("carg_fec_rec is not null");
            return (Criteria) this;
        }

        public Criteria andCargFecRecEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_rec =", value, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecNotEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_rec <>", value, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecGreaterThan(Date value) {
            addCriterionForJDBCDate("carg_fec_rec >", value, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_rec >=", value, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecLessThan(Date value) {
            addCriterionForJDBCDate("carg_fec_rec <", value, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carg_fec_rec <=", value, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecIn(List<Date> values) {
            addCriterionForJDBCDate("carg_fec_rec in", values, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecNotIn(List<Date> values) {
            addCriterionForJDBCDate("carg_fec_rec not in", values, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carg_fec_rec between", value1, value2, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargFecRecNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carg_fec_rec not between", value1, value2, "cargFecRec");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioIsNull() {
            addCriterion("carg_destinatario is null");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioIsNotNull() {
            addCriterion("carg_destinatario is not null");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioEqualTo(String value) {
            addCriterion("carg_destinatario =", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioNotEqualTo(String value) {
            addCriterion("carg_destinatario <>", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioGreaterThan(String value) {
            addCriterion("carg_destinatario >", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioGreaterThanOrEqualTo(String value) {
            addCriterion("carg_destinatario >=", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioLessThan(String value) {
            addCriterion("carg_destinatario <", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioLessThanOrEqualTo(String value) {
            addCriterion("carg_destinatario <=", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioLike(String value) {
            addCriterion("carg_destinatario like", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioNotLike(String value) {
            addCriterion("carg_destinatario not like", value, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioIn(List<String> values) {
            addCriterion("carg_destinatario in", values, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioNotIn(List<String> values) {
            addCriterion("carg_destinatario not in", values, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioBetween(String value1, String value2) {
            addCriterion("carg_destinatario between", value1, value2, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDestinatarioNotBetween(String value1, String value2) {
            addCriterion("carg_destinatario not between", value1, value2, "cargDestinatario");
            return (Criteria) this;
        }

        public Criteria andCargDirIsNull() {
            addCriterion("carg_dir is null");
            return (Criteria) this;
        }

        public Criteria andCargDirIsNotNull() {
            addCriterion("carg_dir is not null");
            return (Criteria) this;
        }

        public Criteria andCargDirEqualTo(String value) {
            addCriterion("carg_dir =", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirNotEqualTo(String value) {
            addCriterion("carg_dir <>", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirGreaterThan(String value) {
            addCriterion("carg_dir >", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirGreaterThanOrEqualTo(String value) {
            addCriterion("carg_dir >=", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirLessThan(String value) {
            addCriterion("carg_dir <", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirLessThanOrEqualTo(String value) {
            addCriterion("carg_dir <=", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirLike(String value) {
            addCriterion("carg_dir like", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirNotLike(String value) {
            addCriterion("carg_dir not like", value, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirIn(List<String> values) {
            addCriterion("carg_dir in", values, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirNotIn(List<String> values) {
            addCriterion("carg_dir not in", values, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirBetween(String value1, String value2) {
            addCriterion("carg_dir between", value1, value2, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargDirNotBetween(String value1, String value2) {
            addCriterion("carg_dir not between", value1, value2, "cargDir");
            return (Criteria) this;
        }

        public Criteria andCargRefIsNull() {
            addCriterion("carg_ref is null");
            return (Criteria) this;
        }

        public Criteria andCargRefIsNotNull() {
            addCriterion("carg_ref is not null");
            return (Criteria) this;
        }

        public Criteria andCargRefEqualTo(String value) {
            addCriterion("carg_ref =", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefNotEqualTo(String value) {
            addCriterion("carg_ref <>", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefGreaterThan(String value) {
            addCriterion("carg_ref >", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefGreaterThanOrEqualTo(String value) {
            addCriterion("carg_ref >=", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefLessThan(String value) {
            addCriterion("carg_ref <", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefLessThanOrEqualTo(String value) {
            addCriterion("carg_ref <=", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefLike(String value) {
            addCriterion("carg_ref like", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefNotLike(String value) {
            addCriterion("carg_ref not like", value, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefIn(List<String> values) {
            addCriterion("carg_ref in", values, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefNotIn(List<String> values) {
            addCriterion("carg_ref not in", values, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefBetween(String value1, String value2) {
            addCriterion("carg_ref between", value1, value2, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargRefNotBetween(String value1, String value2) {
            addCriterion("carg_ref not between", value1, value2, "cargRef");
            return (Criteria) this;
        }

        public Criteria andCargNewDirIsNull() {
            addCriterion("carg_new_dir is null");
            return (Criteria) this;
        }

        public Criteria andCargNewDirIsNotNull() {
            addCriterion("carg_new_dir is not null");
            return (Criteria) this;
        }

        public Criteria andCargNewDirEqualTo(String value) {
            addCriterion("carg_new_dir =", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirNotEqualTo(String value) {
            addCriterion("carg_new_dir <>", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirGreaterThan(String value) {
            addCriterion("carg_new_dir >", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirGreaterThanOrEqualTo(String value) {
            addCriterion("carg_new_dir >=", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirLessThan(String value) {
            addCriterion("carg_new_dir <", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirLessThanOrEqualTo(String value) {
            addCriterion("carg_new_dir <=", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirLike(String value) {
            addCriterion("carg_new_dir like", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirNotLike(String value) {
            addCriterion("carg_new_dir not like", value, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirIn(List<String> values) {
            addCriterion("carg_new_dir in", values, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirNotIn(List<String> values) {
            addCriterion("carg_new_dir not in", values, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirBetween(String value1, String value2) {
            addCriterion("carg_new_dir between", value1, value2, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewDirNotBetween(String value1, String value2) {
            addCriterion("carg_new_dir not between", value1, value2, "cargNewDir");
            return (Criteria) this;
        }

        public Criteria andCargNewRefIsNull() {
            addCriterion("carg_new_ref is null");
            return (Criteria) this;
        }

        public Criteria andCargNewRefIsNotNull() {
            addCriterion("carg_new_ref is not null");
            return (Criteria) this;
        }

        public Criteria andCargNewRefEqualTo(String value) {
            addCriterion("carg_new_ref =", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefNotEqualTo(String value) {
            addCriterion("carg_new_ref <>", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefGreaterThan(String value) {
            addCriterion("carg_new_ref >", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefGreaterThanOrEqualTo(String value) {
            addCriterion("carg_new_ref >=", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefLessThan(String value) {
            addCriterion("carg_new_ref <", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefLessThanOrEqualTo(String value) {
            addCriterion("carg_new_ref <=", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefLike(String value) {
            addCriterion("carg_new_ref like", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefNotLike(String value) {
            addCriterion("carg_new_ref not like", value, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefIn(List<String> values) {
            addCriterion("carg_new_ref in", values, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefNotIn(List<String> values) {
            addCriterion("carg_new_ref not in", values, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefBetween(String value1, String value2) {
            addCriterion("carg_new_ref between", value1, value2, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargNewRefNotBetween(String value1, String value2) {
            addCriterion("carg_new_ref not between", value1, value2, "cargNewRef");
            return (Criteria) this;
        }

        public Criteria andCargCodEstIsNull() {
            addCriterion("carg_cod_est is null");
            return (Criteria) this;
        }

        public Criteria andCargCodEstIsNotNull() {
            addCriterion("carg_cod_est is not null");
            return (Criteria) this;
        }

        public Criteria andCargCodEstEqualTo(Integer value) {
            addCriterion("carg_cod_est =", value, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstNotEqualTo(Integer value) {
            addCriterion("carg_cod_est <>", value, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstGreaterThan(Integer value) {
            addCriterion("carg_cod_est >", value, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstGreaterThanOrEqualTo(Integer value) {
            addCriterion("carg_cod_est >=", value, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstLessThan(Integer value) {
            addCriterion("carg_cod_est <", value, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstLessThanOrEqualTo(Integer value) {
            addCriterion("carg_cod_est <=", value, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstIn(List<Integer> values) {
            addCriterion("carg_cod_est in", values, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstNotIn(List<Integer> values) {
            addCriterion("carg_cod_est not in", values, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstBetween(Integer value1, Integer value2) {
            addCriterion("carg_cod_est between", value1, value2, "cargCodEst");
            return (Criteria) this;
        }

        public Criteria andCargCodEstNotBetween(Integer value1, Integer value2) {
            addCriterion("carg_cod_est not between", value1, value2, "cargCodEst");
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

        public Criteria andFecNumCamEqualTo(Long value) {
            addCriterion("fec_num_cam =", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotEqualTo(Long value) {
            addCriterion("fec_num_cam <>", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThan(Long value) {
            addCriterion("fec_num_cam >", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamGreaterThanOrEqualTo(Long value) {
            addCriterion("fec_num_cam >=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThan(Long value) {
            addCriterion("fec_num_cam <", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamLessThanOrEqualTo(Long value) {
            addCriterion("fec_num_cam <=", value, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamIn(List<Long> values) {
            addCriterion("fec_num_cam in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotIn(List<Long> values) {
            addCriterion("fec_num_cam not in", values, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamBetween(Long value1, Long value2) {
            addCriterion("fec_num_cam between", value1, value2, "fecNumCam");
            return (Criteria) this;
        }

        public Criteria andFecNumCamNotBetween(Long value1, Long value2) {
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

        public Criteria andProcIdIsNull() {
            addCriterion("proc_id is null");
            return (Criteria) this;
        }

        public Criteria andProcIdIsNotNull() {
            addCriterion("proc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcIdEqualTo(Integer value) {
            addCriterion("proc_id =", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotEqualTo(Integer value) {
            addCriterion("proc_id <>", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdGreaterThan(Integer value) {
            addCriterion("proc_id >", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_id >=", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdLessThan(Integer value) {
            addCriterion("proc_id <", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdLessThanOrEqualTo(Integer value) {
            addCriterion("proc_id <=", value, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdIn(List<Integer> values) {
            addCriterion("proc_id in", values, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotIn(List<Integer> values) {
            addCriterion("proc_id not in", values, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdBetween(Integer value1, Integer value2) {
            addCriterion("proc_id between", value1, value2, "procId");
            return (Criteria) this;
        }

        public Criteria andProcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_id not between", value1, value2, "procId");
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