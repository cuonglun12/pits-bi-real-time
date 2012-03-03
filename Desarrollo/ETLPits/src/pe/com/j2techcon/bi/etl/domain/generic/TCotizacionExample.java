package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCotizacionExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCotizacionExample() {
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

        public Criteria andAreCliIdIsNull() {
            addCriterion("are_cli_id is null");
            return (Criteria) this;
        }

        public Criteria andAreCliIdIsNotNull() {
            addCriterion("are_cli_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreCliIdEqualTo(Integer value) {
            addCriterion("are_cli_id =", value, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdNotEqualTo(Integer value) {
            addCriterion("are_cli_id <>", value, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdGreaterThan(Integer value) {
            addCriterion("are_cli_id >", value, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("are_cli_id >=", value, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdLessThan(Integer value) {
            addCriterion("are_cli_id <", value, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdLessThanOrEqualTo(Integer value) {
            addCriterion("are_cli_id <=", value, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdIn(List<Integer> values) {
            addCriterion("are_cli_id in", values, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdNotIn(List<Integer> values) {
            addCriterion("are_cli_id not in", values, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdBetween(Integer value1, Integer value2) {
            addCriterion("are_cli_id between", value1, value2, "areCliId");
            return (Criteria) this;
        }

        public Criteria andAreCliIdNotBetween(Integer value1, Integer value2) {
            addCriterion("are_cli_id not between", value1, value2, "areCliId");
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

        public Criteria andCotiCodAmbIsNull() {
            addCriterion("coti_cod_amb is null");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbIsNotNull() {
            addCriterion("coti_cod_amb is not null");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbEqualTo(Integer value) {
            addCriterion("coti_cod_amb =", value, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbNotEqualTo(Integer value) {
            addCriterion("coti_cod_amb <>", value, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbGreaterThan(Integer value) {
            addCriterion("coti_cod_amb >", value, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbGreaterThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_amb >=", value, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbLessThan(Integer value) {
            addCriterion("coti_cod_amb <", value, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbLessThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_amb <=", value, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbIn(List<Integer> values) {
            addCriterion("coti_cod_amb in", values, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbNotIn(List<Integer> values) {
            addCriterion("coti_cod_amb not in", values, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_amb between", value1, value2, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodAmbNotBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_amb not between", value1, value2, "cotiCodAmb");
            return (Criteria) this;
        }

        public Criteria andCotiCodServIsNull() {
            addCriterion("coti_cod_serv is null");
            return (Criteria) this;
        }

        public Criteria andCotiCodServIsNotNull() {
            addCriterion("coti_cod_serv is not null");
            return (Criteria) this;
        }

        public Criteria andCotiCodServEqualTo(Integer value) {
            addCriterion("coti_cod_serv =", value, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServNotEqualTo(Integer value) {
            addCriterion("coti_cod_serv <>", value, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServGreaterThan(Integer value) {
            addCriterion("coti_cod_serv >", value, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServGreaterThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_serv >=", value, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServLessThan(Integer value) {
            addCriterion("coti_cod_serv <", value, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServLessThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_serv <=", value, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServIn(List<Integer> values) {
            addCriterion("coti_cod_serv in", values, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServNotIn(List<Integer> values) {
            addCriterion("coti_cod_serv not in", values, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_serv between", value1, value2, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodServNotBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_serv not between", value1, value2, "cotiCodServ");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegIsNull() {
            addCriterion("coti_cod_neg is null");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegIsNotNull() {
            addCriterion("coti_cod_neg is not null");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegEqualTo(Integer value) {
            addCriterion("coti_cod_neg =", value, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegNotEqualTo(Integer value) {
            addCriterion("coti_cod_neg <>", value, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegGreaterThan(Integer value) {
            addCriterion("coti_cod_neg >", value, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegGreaterThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_neg >=", value, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegLessThan(Integer value) {
            addCriterion("coti_cod_neg <", value, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegLessThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_neg <=", value, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegIn(List<Integer> values) {
            addCriterion("coti_cod_neg in", values, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegNotIn(List<Integer> values) {
            addCriterion("coti_cod_neg not in", values, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_neg between", value1, value2, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodNegNotBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_neg not between", value1, value2, "cotiCodNeg");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocIsNull() {
            addCriterion("coti_cod_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocIsNotNull() {
            addCriterion("coti_cod_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocEqualTo(Integer value) {
            addCriterion("coti_cod_tip_doc =", value, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocNotEqualTo(Integer value) {
            addCriterion("coti_cod_tip_doc <>", value, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocGreaterThan(Integer value) {
            addCriterion("coti_cod_tip_doc >", value, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_tip_doc >=", value, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocLessThan(Integer value) {
            addCriterion("coti_cod_tip_doc <", value, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocLessThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_tip_doc <=", value, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocIn(List<Integer> values) {
            addCriterion("coti_cod_tip_doc in", values, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocNotIn(List<Integer> values) {
            addCriterion("coti_cod_tip_doc not in", values, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_tip_doc between", value1, value2, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodTipDocNotBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_tip_doc not between", value1, value2, "cotiCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocIsNull() {
            addCriterion("coti_serie_doc is null");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocIsNotNull() {
            addCriterion("coti_serie_doc is not null");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocEqualTo(String value) {
            addCriterion("coti_serie_doc =", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocNotEqualTo(String value) {
            addCriterion("coti_serie_doc <>", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocGreaterThan(String value) {
            addCriterion("coti_serie_doc >", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocGreaterThanOrEqualTo(String value) {
            addCriterion("coti_serie_doc >=", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocLessThan(String value) {
            addCriterion("coti_serie_doc <", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocLessThanOrEqualTo(String value) {
            addCriterion("coti_serie_doc <=", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocLike(String value) {
            addCriterion("coti_serie_doc like", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocNotLike(String value) {
            addCriterion("coti_serie_doc not like", value, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocIn(List<String> values) {
            addCriterion("coti_serie_doc in", values, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocNotIn(List<String> values) {
            addCriterion("coti_serie_doc not in", values, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocBetween(String value1, String value2) {
            addCriterion("coti_serie_doc between", value1, value2, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiSerieDocNotBetween(String value1, String value2) {
            addCriterion("coti_serie_doc not between", value1, value2, "cotiSerieDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocIsNull() {
            addCriterion("coti_num_doc is null");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocIsNotNull() {
            addCriterion("coti_num_doc is not null");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocEqualTo(String value) {
            addCriterion("coti_num_doc =", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocNotEqualTo(String value) {
            addCriterion("coti_num_doc <>", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocGreaterThan(String value) {
            addCriterion("coti_num_doc >", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocGreaterThanOrEqualTo(String value) {
            addCriterion("coti_num_doc >=", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocLessThan(String value) {
            addCriterion("coti_num_doc <", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocLessThanOrEqualTo(String value) {
            addCriterion("coti_num_doc <=", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocLike(String value) {
            addCriterion("coti_num_doc like", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocNotLike(String value) {
            addCriterion("coti_num_doc not like", value, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocIn(List<String> values) {
            addCriterion("coti_num_doc in", values, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocNotIn(List<String> values) {
            addCriterion("coti_num_doc not in", values, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocBetween(String value1, String value2) {
            addCriterion("coti_num_doc between", value1, value2, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiNumDocNotBetween(String value1, String value2) {
            addCriterion("coti_num_doc not between", value1, value2, "cotiNumDoc");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstIsNull() {
            addCriterion("coti_cod_est is null");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstIsNotNull() {
            addCriterion("coti_cod_est is not null");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstEqualTo(Integer value) {
            addCriterion("coti_cod_est =", value, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstNotEqualTo(Integer value) {
            addCriterion("coti_cod_est <>", value, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstGreaterThan(Integer value) {
            addCriterion("coti_cod_est >", value, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstGreaterThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_est >=", value, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstLessThan(Integer value) {
            addCriterion("coti_cod_est <", value, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstLessThanOrEqualTo(Integer value) {
            addCriterion("coti_cod_est <=", value, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstIn(List<Integer> values) {
            addCriterion("coti_cod_est in", values, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstNotIn(List<Integer> values) {
            addCriterion("coti_cod_est not in", values, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_est between", value1, value2, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiCodEstNotBetween(Integer value1, Integer value2) {
            addCriterion("coti_cod_est not between", value1, value2, "cotiCodEst");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproIsNull() {
            addCriterion("coti_fec_apro is null");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproIsNotNull() {
            addCriterion("coti_fec_apro is not null");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_apro =", value, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproNotEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_apro <>", value, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproGreaterThan(Date value) {
            addCriterionForJDBCDate("coti_fec_apro >", value, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_apro >=", value, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproLessThan(Date value) {
            addCriterionForJDBCDate("coti_fec_apro <", value, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_apro <=", value, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproIn(List<Date> values) {
            addCriterionForJDBCDate("coti_fec_apro in", values, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproNotIn(List<Date> values) {
            addCriterionForJDBCDate("coti_fec_apro not in", values, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coti_fec_apro between", value1, value2, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecAproNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coti_fec_apro not between", value1, value2, "cotiFecApro");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniIsNull() {
            addCriterion("coti_fec_ini is null");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniIsNotNull() {
            addCriterion("coti_fec_ini is not null");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_ini =", value, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniNotEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_ini <>", value, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniGreaterThan(Date value) {
            addCriterionForJDBCDate("coti_fec_ini >", value, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_ini >=", value, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniLessThan(Date value) {
            addCriterionForJDBCDate("coti_fec_ini <", value, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_ini <=", value, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniIn(List<Date> values) {
            addCriterionForJDBCDate("coti_fec_ini in", values, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniNotIn(List<Date> values) {
            addCriterionForJDBCDate("coti_fec_ini not in", values, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coti_fec_ini between", value1, value2, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecIniNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coti_fec_ini not between", value1, value2, "cotiFecIni");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinIsNull() {
            addCriterion("coti_fec_fin is null");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinIsNotNull() {
            addCriterion("coti_fec_fin is not null");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_fin =", value, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinNotEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_fin <>", value, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinGreaterThan(Date value) {
            addCriterionForJDBCDate("coti_fec_fin >", value, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_fin >=", value, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinLessThan(Date value) {
            addCriterionForJDBCDate("coti_fec_fin <", value, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("coti_fec_fin <=", value, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinIn(List<Date> values) {
            addCriterionForJDBCDate("coti_fec_fin in", values, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinNotIn(List<Date> values) {
            addCriterionForJDBCDate("coti_fec_fin not in", values, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coti_fec_fin between", value1, value2, "cotiFecFin");
            return (Criteria) this;
        }

        public Criteria andCotiFecFinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("coti_fec_fin not between", value1, value2, "cotiFecFin");
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