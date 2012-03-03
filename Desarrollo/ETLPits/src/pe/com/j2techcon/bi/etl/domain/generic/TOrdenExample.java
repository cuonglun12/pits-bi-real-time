package pe.com.j2techcon.bi.etl.domain.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TOrdenExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrdenExample() {
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

        public Criteria andCotiIdIsNull() {
            addCriterion("coti_id is null");
            return (Criteria) this;
        }

        public Criteria andCotiIdIsNotNull() {
            addCriterion("coti_id is not null");
            return (Criteria) this;
        }

        public Criteria andCotiIdEqualTo(Integer value) {
            addCriterion("coti_id =", value, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdNotEqualTo(Integer value) {
            addCriterion("coti_id <>", value, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdGreaterThan(Integer value) {
            addCriterion("coti_id >", value, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coti_id >=", value, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdLessThan(Integer value) {
            addCriterion("coti_id <", value, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdLessThanOrEqualTo(Integer value) {
            addCriterion("coti_id <=", value, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdIn(List<Integer> values) {
            addCriterion("coti_id in", values, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdNotIn(List<Integer> values) {
            addCriterion("coti_id not in", values, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdBetween(Integer value1, Integer value2) {
            addCriterion("coti_id between", value1, value2, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCotiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coti_id not between", value1, value2, "cotiId");
            return (Criteria) this;
        }

        public Criteria andCodAreCliIsNull() {
            addCriterion("cod_are_cli is null");
            return (Criteria) this;
        }

        public Criteria andCodAreCliIsNotNull() {
            addCriterion("cod_are_cli is not null");
            return (Criteria) this;
        }

        public Criteria andCodAreCliEqualTo(Integer value) {
            addCriterion("cod_are_cli =", value, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliNotEqualTo(Integer value) {
            addCriterion("cod_are_cli <>", value, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliGreaterThan(Integer value) {
            addCriterion("cod_are_cli >", value, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliGreaterThanOrEqualTo(Integer value) {
            addCriterion("cod_are_cli >=", value, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliLessThan(Integer value) {
            addCriterion("cod_are_cli <", value, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliLessThanOrEqualTo(Integer value) {
            addCriterion("cod_are_cli <=", value, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliIn(List<Integer> values) {
            addCriterion("cod_are_cli in", values, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliNotIn(List<Integer> values) {
            addCriterion("cod_are_cli not in", values, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliBetween(Integer value1, Integer value2) {
            addCriterion("cod_are_cli between", value1, value2, "codAreCli");
            return (Criteria) this;
        }

        public Criteria andCodAreCliNotBetween(Integer value1, Integer value2) {
            addCriterion("cod_are_cli not between", value1, value2, "codAreCli");
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

        public Criteria andOrdCodTipRepIsNull() {
            addCriterion("ord_cod_tip_rep is null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepIsNotNull() {
            addCriterion("ord_cod_tip_rep is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepEqualTo(Integer value) {
            addCriterion("ord_cod_tip_rep =", value, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepNotEqualTo(Integer value) {
            addCriterion("ord_cod_tip_rep <>", value, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepGreaterThan(Integer value) {
            addCriterion("ord_cod_tip_rep >", value, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_rep >=", value, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepLessThan(Integer value) {
            addCriterion("ord_cod_tip_rep <", value, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepLessThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_rep <=", value, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepIn(List<Integer> values) {
            addCriterion("ord_cod_tip_rep in", values, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepNotIn(List<Integer> values) {
            addCriterion("ord_cod_tip_rep not in", values, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_rep between", value1, value2, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipRepNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_rep not between", value1, value2, "ordCodTipRep");
            return (Criteria) this;
        }

        public Criteria andServIdIsNull() {
            addCriterion("serv_id is null");
            return (Criteria) this;
        }

        public Criteria andServIdIsNotNull() {
            addCriterion("serv_id is not null");
            return (Criteria) this;
        }

        public Criteria andServIdEqualTo(Integer value) {
            addCriterion("serv_id =", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotEqualTo(Integer value) {
            addCriterion("serv_id <>", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThan(Integer value) {
            addCriterion("serv_id >", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("serv_id >=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThan(Integer value) {
            addCriterion("serv_id <", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdLessThanOrEqualTo(Integer value) {
            addCriterion("serv_id <=", value, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdIn(List<Integer> values) {
            addCriterion("serv_id in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotIn(List<Integer> values) {
            addCriterion("serv_id not in", values, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdBetween(Integer value1, Integer value2) {
            addCriterion("serv_id between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andServIdNotBetween(Integer value1, Integer value2) {
            addCriterion("serv_id not between", value1, value2, "servId");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Integer value) {
            addCriterion("prod_id =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Integer value) {
            addCriterion("prod_id <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Integer value) {
            addCriterion("prod_id >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_id >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Integer value) {
            addCriterion("prod_id <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_id <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Integer> values) {
            addCriterion("prod_id in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Integer> values) {
            addCriterion("prod_id not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_id between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_id not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagIsNull() {
            addCriterion("ord_cod_tip_pag is null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagIsNotNull() {
            addCriterion("ord_cod_tip_pag is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagEqualTo(Integer value) {
            addCriterion("ord_cod_tip_pag =", value, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagNotEqualTo(Integer value) {
            addCriterion("ord_cod_tip_pag <>", value, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagGreaterThan(Integer value) {
            addCriterion("ord_cod_tip_pag >", value, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_pag >=", value, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagLessThan(Integer value) {
            addCriterion("ord_cod_tip_pag <", value, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagLessThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_pag <=", value, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagIn(List<Integer> values) {
            addCriterion("ord_cod_tip_pag in", values, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagNotIn(List<Integer> values) {
            addCriterion("ord_cod_tip_pag not in", values, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_pag between", value1, value2, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipPagNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_pag not between", value1, value2, "ordCodTipPag");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngIsNull() {
            addCriterion("ord_cod_tip_ing is null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngIsNotNull() {
            addCriterion("ord_cod_tip_ing is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngEqualTo(Integer value) {
            addCriterion("ord_cod_tip_ing =", value, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngNotEqualTo(Integer value) {
            addCriterion("ord_cod_tip_ing <>", value, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngGreaterThan(Integer value) {
            addCriterion("ord_cod_tip_ing >", value, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_ing >=", value, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngLessThan(Integer value) {
            addCriterion("ord_cod_tip_ing <", value, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngLessThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_ing <=", value, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngIn(List<Integer> values) {
            addCriterion("ord_cod_tip_ing in", values, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngNotIn(List<Integer> values) {
            addCriterion("ord_cod_tip_ing not in", values, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_ing between", value1, value2, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipIngNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_ing not between", value1, value2, "ordCodTipIng");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonIsNull() {
            addCriterion("ord_cod_tip_mon is null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonIsNotNull() {
            addCriterion("ord_cod_tip_mon is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonEqualTo(Integer value) {
            addCriterion("ord_cod_tip_mon =", value, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonNotEqualTo(Integer value) {
            addCriterion("ord_cod_tip_mon <>", value, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonGreaterThan(Integer value) {
            addCriterion("ord_cod_tip_mon >", value, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_mon >=", value, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonLessThan(Integer value) {
            addCriterion("ord_cod_tip_mon <", value, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonLessThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_tip_mon <=", value, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonIn(List<Integer> values) {
            addCriterion("ord_cod_tip_mon in", values, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonNotIn(List<Integer> values) {
            addCriterion("ord_cod_tip_mon not in", values, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_mon between", value1, value2, "ordCodTipMon");
            return (Criteria) this;
        }

        public Criteria andOrdCodTipMonNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_tip_mon not between", value1, value2, "ordCodTipMon");
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

        public Criteria andOrdTipCambioIsNull() {
            addCriterion("ord_tip_cambio is null");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioIsNotNull() {
            addCriterion("ord_tip_cambio is not null");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioEqualTo(BigDecimal value) {
            addCriterion("ord_tip_cambio =", value, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioNotEqualTo(BigDecimal value) {
            addCriterion("ord_tip_cambio <>", value, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioGreaterThan(BigDecimal value) {
            addCriterion("ord_tip_cambio >", value, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_tip_cambio >=", value, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioLessThan(BigDecimal value) {
            addCriterion("ord_tip_cambio <", value, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_tip_cambio <=", value, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioIn(List<BigDecimal> values) {
            addCriterion("ord_tip_cambio in", values, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioNotIn(List<BigDecimal> values) {
            addCriterion("ord_tip_cambio not in", values, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_tip_cambio between", value1, value2, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdTipCambioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_tip_cambio not between", value1, value2, "ordTipCambio");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosIsNull() {
            addCriterion("ord_cnt_cargos is null");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosIsNotNull() {
            addCriterion("ord_cnt_cargos is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosEqualTo(Integer value) {
            addCriterion("ord_cnt_cargos =", value, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosNotEqualTo(Integer value) {
            addCriterion("ord_cnt_cargos <>", value, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosGreaterThan(Integer value) {
            addCriterion("ord_cnt_cargos >", value, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_cnt_cargos >=", value, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosLessThan(Integer value) {
            addCriterion("ord_cnt_cargos <", value, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosLessThanOrEqualTo(Integer value) {
            addCriterion("ord_cnt_cargos <=", value, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosIn(List<Integer> values) {
            addCriterion("ord_cnt_cargos in", values, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosNotIn(List<Integer> values) {
            addCriterion("ord_cnt_cargos not in", values, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosBetween(Integer value1, Integer value2) {
            addCriterion("ord_cnt_cargos between", value1, value2, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdCntCargosNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_cnt_cargos not between", value1, value2, "ordCntCargos");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniIsNull() {
            addCriterion("ord_fec_ini is null");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniIsNotNull() {
            addCriterion("ord_fec_ini is not null");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ini =", value, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniNotEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ini <>", value, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniGreaterThan(Date value) {
            addCriterionForJDBCDate("ord_fec_ini >", value, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ini >=", value, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniLessThan(Date value) {
            addCriterionForJDBCDate("ord_fec_ini <", value, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ini <=", value, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_ini in", values, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniNotIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_ini not in", values, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_ini between", value1, value2, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecIniNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_ini not between", value1, value2, "ordFecIni");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenIsNull() {
            addCriterion("ord_fec_ven is null");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenIsNotNull() {
            addCriterion("ord_fec_ven is not null");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ven =", value, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenNotEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ven <>", value, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenGreaterThan(Date value) {
            addCriterionForJDBCDate("ord_fec_ven >", value, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ven >=", value, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenLessThan(Date value) {
            addCriterionForJDBCDate("ord_fec_ven <", value, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_ven <=", value, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_ven in", values, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenNotIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_ven not in", values, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_ven between", value1, value2, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecVenNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_ven not between", value1, value2, "ordFecVen");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieIsNull() {
            addCriterion("ord_fec_cie is null");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieIsNotNull() {
            addCriterion("ord_fec_cie is not null");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_cie =", value, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieNotEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_cie <>", value, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieGreaterThan(Date value) {
            addCriterionForJDBCDate("ord_fec_cie >", value, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_cie >=", value, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieLessThan(Date value) {
            addCriterionForJDBCDate("ord_fec_cie <", value, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_cie <=", value, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_cie in", values, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieNotIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_cie not in", values, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_cie between", value1, value2, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecCieNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_cie not between", value1, value2, "ordFecCie");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevIsNull() {
            addCriterion("ord_fec_dev is null");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevIsNotNull() {
            addCriterion("ord_fec_dev is not null");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_dev =", value, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevNotEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_dev <>", value, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevGreaterThan(Date value) {
            addCriterionForJDBCDate("ord_fec_dev >", value, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_dev >=", value, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevLessThan(Date value) {
            addCriterionForJDBCDate("ord_fec_dev <", value, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_dev <=", value, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_dev in", values, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevNotIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_dev not in", values, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_dev between", value1, value2, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecDevNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_dev not between", value1, value2, "ordFecDev");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqIsNull() {
            addCriterion("ord_fec_liq is null");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqIsNotNull() {
            addCriterion("ord_fec_liq is not null");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_liq =", value, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqNotEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_liq <>", value, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqGreaterThan(Date value) {
            addCriterionForJDBCDate("ord_fec_liq >", value, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_liq >=", value, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqLessThan(Date value) {
            addCriterionForJDBCDate("ord_fec_liq <", value, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ord_fec_liq <=", value, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_liq in", values, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqNotIn(List<Date> values) {
            addCriterionForJDBCDate("ord_fec_liq not in", values, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_liq between", value1, value2, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdFecLiqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ord_fec_liq not between", value1, value2, "ordFecLiq");
            return (Criteria) this;
        }

        public Criteria andOrdImporteIsNull() {
            addCriterion("ord_importe is null");
            return (Criteria) this;
        }

        public Criteria andOrdImporteIsNotNull() {
            addCriterion("ord_importe is not null");
            return (Criteria) this;
        }

        public Criteria andOrdImporteEqualTo(BigDecimal value) {
            addCriterion("ord_importe =", value, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteNotEqualTo(BigDecimal value) {
            addCriterion("ord_importe <>", value, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteGreaterThan(BigDecimal value) {
            addCriterion("ord_importe >", value, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_importe >=", value, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteLessThan(BigDecimal value) {
            addCriterion("ord_importe <", value, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_importe <=", value, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteIn(List<BigDecimal> values) {
            addCriterion("ord_importe in", values, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteNotIn(List<BigDecimal> values) {
            addCriterion("ord_importe not in", values, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_importe between", value1, value2, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdImporteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_importe not between", value1, value2, "ordImporte");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoIsNull() {
            addCriterion("ord_descuento is null");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoIsNotNull() {
            addCriterion("ord_descuento is not null");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoEqualTo(BigDecimal value) {
            addCriterion("ord_descuento =", value, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoNotEqualTo(BigDecimal value) {
            addCriterion("ord_descuento <>", value, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoGreaterThan(BigDecimal value) {
            addCriterion("ord_descuento >", value, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_descuento >=", value, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoLessThan(BigDecimal value) {
            addCriterion("ord_descuento <", value, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_descuento <=", value, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoIn(List<BigDecimal> values) {
            addCriterion("ord_descuento in", values, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoNotIn(List<BigDecimal> values) {
            addCriterion("ord_descuento not in", values, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_descuento between", value1, value2, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdDescuentoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_descuento not between", value1, value2, "ordDescuento");
            return (Criteria) this;
        }

        public Criteria andOrdVentaIsNull() {
            addCriterion("ord_venta is null");
            return (Criteria) this;
        }

        public Criteria andOrdVentaIsNotNull() {
            addCriterion("ord_venta is not null");
            return (Criteria) this;
        }

        public Criteria andOrdVentaEqualTo(BigDecimal value) {
            addCriterion("ord_venta =", value, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaNotEqualTo(BigDecimal value) {
            addCriterion("ord_venta <>", value, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaGreaterThan(BigDecimal value) {
            addCriterion("ord_venta >", value, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_venta >=", value, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaLessThan(BigDecimal value) {
            addCriterion("ord_venta <", value, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_venta <=", value, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaIn(List<BigDecimal> values) {
            addCriterion("ord_venta in", values, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaNotIn(List<BigDecimal> values) {
            addCriterion("ord_venta not in", values, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_venta between", value1, value2, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdVentaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_venta not between", value1, value2, "ordVenta");
            return (Criteria) this;
        }

        public Criteria andOrdIgvIsNull() {
            addCriterion("ord_igv is null");
            return (Criteria) this;
        }

        public Criteria andOrdIgvIsNotNull() {
            addCriterion("ord_igv is not null");
            return (Criteria) this;
        }

        public Criteria andOrdIgvEqualTo(BigDecimal value) {
            addCriterion("ord_igv =", value, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvNotEqualTo(BigDecimal value) {
            addCriterion("ord_igv <>", value, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvGreaterThan(BigDecimal value) {
            addCriterion("ord_igv >", value, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_igv >=", value, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvLessThan(BigDecimal value) {
            addCriterion("ord_igv <", value, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_igv <=", value, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvIn(List<BigDecimal> values) {
            addCriterion("ord_igv in", values, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvNotIn(List<BigDecimal> values) {
            addCriterion("ord_igv not in", values, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_igv between", value1, value2, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdIgvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_igv not between", value1, value2, "ordIgv");
            return (Criteria) this;
        }

        public Criteria andOrdTotalIsNull() {
            addCriterion("ord_total is null");
            return (Criteria) this;
        }

        public Criteria andOrdTotalIsNotNull() {
            addCriterion("ord_total is not null");
            return (Criteria) this;
        }

        public Criteria andOrdTotalEqualTo(BigDecimal value) {
            addCriterion("ord_total =", value, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalNotEqualTo(BigDecimal value) {
            addCriterion("ord_total <>", value, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalGreaterThan(BigDecimal value) {
            addCriterion("ord_total >", value, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_total >=", value, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalLessThan(BigDecimal value) {
            addCriterion("ord_total <", value, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ord_total <=", value, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalIn(List<BigDecimal> values) {
            addCriterion("ord_total in", values, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalNotIn(List<BigDecimal> values) {
            addCriterion("ord_total not in", values, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_total between", value1, value2, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ord_total not between", value1, value2, "ordTotal");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstIsNull() {
            addCriterion("ord_cod_est is null");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstIsNotNull() {
            addCriterion("ord_cod_est is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstEqualTo(Integer value) {
            addCriterion("ord_cod_est =", value, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstNotEqualTo(Integer value) {
            addCriterion("ord_cod_est <>", value, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstGreaterThan(Integer value) {
            addCriterion("ord_cod_est >", value, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstGreaterThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_est >=", value, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstLessThan(Integer value) {
            addCriterion("ord_cod_est <", value, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstLessThanOrEqualTo(Integer value) {
            addCriterion("ord_cod_est <=", value, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstIn(List<Integer> values) {
            addCriterion("ord_cod_est in", values, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstNotIn(List<Integer> values) {
            addCriterion("ord_cod_est not in", values, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_est between", value1, value2, "ordCodEst");
            return (Criteria) this;
        }

        public Criteria andOrdCodEstNotBetween(Integer value1, Integer value2) {
            addCriterion("ord_cod_est not between", value1, value2, "ordCodEst");
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