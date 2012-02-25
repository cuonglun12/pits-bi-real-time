package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCargoDespachoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCargoDespachoExample() {
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

        public Criteria andCarDespIdIsNull() {
            addCriterion("car_desp_id is null");
            return (Criteria) this;
        }

        public Criteria andCarDespIdIsNotNull() {
            addCriterion("car_desp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespIdEqualTo(Integer value) {
            addCriterion("car_desp_id =", value, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdNotEqualTo(Integer value) {
            addCriterion("car_desp_id <>", value, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdGreaterThan(Integer value) {
            addCriterion("car_desp_id >", value, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_desp_id >=", value, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdLessThan(Integer value) {
            addCriterion("car_desp_id <", value, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_desp_id <=", value, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdIn(List<Integer> values) {
            addCriterion("car_desp_id in", values, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdNotIn(List<Integer> values) {
            addCriterion("car_desp_id not in", values, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_id between", value1, value2, "carDespId");
            return (Criteria) this;
        }

        public Criteria andCarDespIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_id not between", value1, value2, "carDespId");
            return (Criteria) this;
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

        public Criteria andCarDespCodMovIsNull() {
            addCriterion("car_desp_cod_mov is null");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovIsNotNull() {
            addCriterion("car_desp_cod_mov is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovEqualTo(Integer value) {
            addCriterion("car_desp_cod_mov =", value, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovNotEqualTo(Integer value) {
            addCriterion("car_desp_cod_mov <>", value, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovGreaterThan(Integer value) {
            addCriterion("car_desp_cod_mov >", value, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_desp_cod_mov >=", value, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovLessThan(Integer value) {
            addCriterion("car_desp_cod_mov <", value, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovLessThanOrEqualTo(Integer value) {
            addCriterion("car_desp_cod_mov <=", value, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovIn(List<Integer> values) {
            addCriterion("car_desp_cod_mov in", values, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovNotIn(List<Integer> values) {
            addCriterion("car_desp_cod_mov not in", values, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_cod_mov between", value1, value2, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodMovNotBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_cod_mov not between", value1, value2, "carDespCodMov");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerIsNull() {
            addCriterion("car_desp_cod_ver is null");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerIsNotNull() {
            addCriterion("car_desp_cod_ver is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerEqualTo(Integer value) {
            addCriterion("car_desp_cod_ver =", value, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerNotEqualTo(Integer value) {
            addCriterion("car_desp_cod_ver <>", value, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerGreaterThan(Integer value) {
            addCriterion("car_desp_cod_ver >", value, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_desp_cod_ver >=", value, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerLessThan(Integer value) {
            addCriterion("car_desp_cod_ver <", value, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerLessThanOrEqualTo(Integer value) {
            addCriterion("car_desp_cod_ver <=", value, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerIn(List<Integer> values) {
            addCriterion("car_desp_cod_ver in", values, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerNotIn(List<Integer> values) {
            addCriterion("car_desp_cod_ver not in", values, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_cod_ver between", value1, value2, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodVerNotBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_cod_ver not between", value1, value2, "carDespCodVer");
            return (Criteria) this;
        }

        public Criteria andCarDespDirIsNull() {
            addCriterion("car_desp_dir is null");
            return (Criteria) this;
        }

        public Criteria andCarDespDirIsNotNull() {
            addCriterion("car_desp_dir is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespDirEqualTo(String value) {
            addCriterion("car_desp_dir =", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirNotEqualTo(String value) {
            addCriterion("car_desp_dir <>", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirGreaterThan(String value) {
            addCriterion("car_desp_dir >", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirGreaterThanOrEqualTo(String value) {
            addCriterion("car_desp_dir >=", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirLessThan(String value) {
            addCriterion("car_desp_dir <", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirLessThanOrEqualTo(String value) {
            addCriterion("car_desp_dir <=", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirLike(String value) {
            addCriterion("car_desp_dir like", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirNotLike(String value) {
            addCriterion("car_desp_dir not like", value, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirIn(List<String> values) {
            addCriterion("car_desp_dir in", values, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirNotIn(List<String> values) {
            addCriterion("car_desp_dir not in", values, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirBetween(String value1, String value2) {
            addCriterion("car_desp_dir between", value1, value2, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespDirNotBetween(String value1, String value2) {
            addCriterion("car_desp_dir not between", value1, value2, "carDespDir");
            return (Criteria) this;
        }

        public Criteria andCarDespRefIsNull() {
            addCriterion("car_desp_ref is null");
            return (Criteria) this;
        }

        public Criteria andCarDespRefIsNotNull() {
            addCriterion("car_desp_ref is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespRefEqualTo(String value) {
            addCriterion("car_desp_ref =", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefNotEqualTo(String value) {
            addCriterion("car_desp_ref <>", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefGreaterThan(String value) {
            addCriterion("car_desp_ref >", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefGreaterThanOrEqualTo(String value) {
            addCriterion("car_desp_ref >=", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefLessThan(String value) {
            addCriterion("car_desp_ref <", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefLessThanOrEqualTo(String value) {
            addCriterion("car_desp_ref <=", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefLike(String value) {
            addCriterion("car_desp_ref like", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefNotLike(String value) {
            addCriterion("car_desp_ref not like", value, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefIn(List<String> values) {
            addCriterion("car_desp_ref in", values, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefNotIn(List<String> values) {
            addCriterion("car_desp_ref not in", values, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefBetween(String value1, String value2) {
            addCriterion("car_desp_ref between", value1, value2, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespRefNotBetween(String value1, String value2) {
            addCriterion("car_desp_ref not between", value1, value2, "carDespRef");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalIsNull() {
            addCriterion("car_desp_fec_sal is null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalIsNotNull() {
            addCriterion("car_desp_fec_sal is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_sal =", value, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalNotEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_sal <>", value, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalGreaterThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_sal >", value, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_sal >=", value, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalLessThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_sal <", value, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_sal <=", value, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_sal in", values, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalNotIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_sal not in", values, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_sal between", value1, value2, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecSalNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_sal not between", value1, value2, "carDespFecSal");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProIsNull() {
            addCriterion("car_desp_fec_ret_pro is null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProIsNotNull() {
            addCriterion("car_desp_fec_ret_pro is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro =", value, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProNotEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro <>", value, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProGreaterThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro >", value, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro >=", value, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProLessThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro <", value, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro <=", value, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro in", values, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProNotIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro not in", values, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro between", value1, value2, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetProNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_ret_pro not between", value1, value2, "carDespFecRetPro");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaIsNull() {
            addCriterion("car_desp_fec_ret_rea is null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaIsNotNull() {
            addCriterion("car_desp_fec_ret_rea is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea =", value, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaNotEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea <>", value, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaGreaterThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea >", value, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea >=", value, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaLessThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea <", value, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea <=", value, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea in", values, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaNotIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea not in", values, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea between", value1, value2, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecRetReaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_ret_rea not between", value1, value2, "carDespFecRetRea");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerIsNull() {
            addCriterion("car_desp_fec_ver is null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerIsNotNull() {
            addCriterion("car_desp_fec_ver is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ver =", value, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerNotEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ver <>", value, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerGreaterThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ver >", value, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ver >=", value, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerLessThan(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ver <", value, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("car_desp_fec_ver <=", value, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_ver in", values, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerNotIn(List<Date> values) {
            addCriterionForJDBCDate("car_desp_fec_ver not in", values, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_ver between", value1, value2, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespFecVerNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("car_desp_fec_ver not between", value1, value2, "carDespFecVer");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstIsNull() {
            addCriterion("car_desp_cod_est is null");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstIsNotNull() {
            addCriterion("car_desp_cod_est is not null");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstEqualTo(Integer value) {
            addCriterion("car_desp_cod_est =", value, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstNotEqualTo(Integer value) {
            addCriterion("car_desp_cod_est <>", value, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstGreaterThan(Integer value) {
            addCriterion("car_desp_cod_est >", value, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_desp_cod_est >=", value, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstLessThan(Integer value) {
            addCriterion("car_desp_cod_est <", value, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstLessThanOrEqualTo(Integer value) {
            addCriterion("car_desp_cod_est <=", value, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstIn(List<Integer> values) {
            addCriterion("car_desp_cod_est in", values, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstNotIn(List<Integer> values) {
            addCriterion("car_desp_cod_est not in", values, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_cod_est between", value1, value2, "carDespCodEst");
            return (Criteria) this;
        }

        public Criteria andCarDespCodEstNotBetween(Integer value1, Integer value2) {
            addCriterion("car_desp_cod_est not between", value1, value2, "carDespCodEst");
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