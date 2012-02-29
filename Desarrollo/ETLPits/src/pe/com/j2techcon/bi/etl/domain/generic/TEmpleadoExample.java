package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TEmpleadoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TEmpleadoExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpCodIsNull() {
            addCriterion("emp_cod is null");
            return (Criteria) this;
        }

        public Criteria andEmpCodIsNotNull() {
            addCriterion("emp_cod is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCodEqualTo(String value) {
            addCriterion("emp_cod =", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotEqualTo(String value) {
            addCriterion("emp_cod <>", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodGreaterThan(String value) {
            addCriterion("emp_cod >", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodGreaterThanOrEqualTo(String value) {
            addCriterion("emp_cod >=", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodLessThan(String value) {
            addCriterion("emp_cod <", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodLessThanOrEqualTo(String value) {
            addCriterion("emp_cod <=", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodLike(String value) {
            addCriterion("emp_cod like", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotLike(String value) {
            addCriterion("emp_cod not like", value, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodIn(List<String> values) {
            addCriterion("emp_cod in", values, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotIn(List<String> values) {
            addCriterion("emp_cod not in", values, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodBetween(String value1, String value2) {
            addCriterion("emp_cod between", value1, value2, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodNotBetween(String value1, String value2) {
            addCriterion("emp_cod not between", value1, value2, "empCod");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocIsNull() {
            addCriterion("emp_cod_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocIsNotNull() {
            addCriterion("emp_cod_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocEqualTo(Integer value) {
            addCriterion("emp_cod_tip_doc =", value, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocNotEqualTo(Integer value) {
            addCriterion("emp_cod_tip_doc <>", value, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocGreaterThan(Integer value) {
            addCriterion("emp_cod_tip_doc >", value, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_cod_tip_doc >=", value, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocLessThan(Integer value) {
            addCriterion("emp_cod_tip_doc <", value, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocLessThanOrEqualTo(Integer value) {
            addCriterion("emp_cod_tip_doc <=", value, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocIn(List<Integer> values) {
            addCriterion("emp_cod_tip_doc in", values, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocNotIn(List<Integer> values) {
            addCriterion("emp_cod_tip_doc not in", values, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocBetween(Integer value1, Integer value2) {
            addCriterion("emp_cod_tip_doc between", value1, value2, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpCodTipDocNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_cod_tip_doc not between", value1, value2, "empCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocIsNull() {
            addCriterion("emp_num_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocIsNotNull() {
            addCriterion("emp_num_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocEqualTo(String value) {
            addCriterion("emp_num_tip_doc =", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocNotEqualTo(String value) {
            addCriterion("emp_num_tip_doc <>", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocGreaterThan(String value) {
            addCriterion("emp_num_tip_doc >", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocGreaterThanOrEqualTo(String value) {
            addCriterion("emp_num_tip_doc >=", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocLessThan(String value) {
            addCriterion("emp_num_tip_doc <", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocLessThanOrEqualTo(String value) {
            addCriterion("emp_num_tip_doc <=", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocLike(String value) {
            addCriterion("emp_num_tip_doc like", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocNotLike(String value) {
            addCriterion("emp_num_tip_doc not like", value, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocIn(List<String> values) {
            addCriterion("emp_num_tip_doc in", values, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocNotIn(List<String> values) {
            addCriterion("emp_num_tip_doc not in", values, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocBetween(String value1, String value2) {
            addCriterion("emp_num_tip_doc between", value1, value2, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpNumTipDocNotBetween(String value1, String value2) {
            addCriterion("emp_num_tip_doc not between", value1, value2, "empNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatIsNull() {
            addCriterion("emp_des_ape_pat is null");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatIsNotNull() {
            addCriterion("emp_des_ape_pat is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatEqualTo(String value) {
            addCriterion("emp_des_ape_pat =", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatNotEqualTo(String value) {
            addCriterion("emp_des_ape_pat <>", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatGreaterThan(String value) {
            addCriterion("emp_des_ape_pat >", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatGreaterThanOrEqualTo(String value) {
            addCriterion("emp_des_ape_pat >=", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatLessThan(String value) {
            addCriterion("emp_des_ape_pat <", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatLessThanOrEqualTo(String value) {
            addCriterion("emp_des_ape_pat <=", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatLike(String value) {
            addCriterion("emp_des_ape_pat like", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatNotLike(String value) {
            addCriterion("emp_des_ape_pat not like", value, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatIn(List<String> values) {
            addCriterion("emp_des_ape_pat in", values, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatNotIn(List<String> values) {
            addCriterion("emp_des_ape_pat not in", values, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatBetween(String value1, String value2) {
            addCriterion("emp_des_ape_pat between", value1, value2, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApePatNotBetween(String value1, String value2) {
            addCriterion("emp_des_ape_pat not between", value1, value2, "empDesApePat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatIsNull() {
            addCriterion("emp_des_ape_mat is null");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatIsNotNull() {
            addCriterion("emp_des_ape_mat is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatEqualTo(String value) {
            addCriterion("emp_des_ape_mat =", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatNotEqualTo(String value) {
            addCriterion("emp_des_ape_mat <>", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatGreaterThan(String value) {
            addCriterion("emp_des_ape_mat >", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatGreaterThanOrEqualTo(String value) {
            addCriterion("emp_des_ape_mat >=", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatLessThan(String value) {
            addCriterion("emp_des_ape_mat <", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatLessThanOrEqualTo(String value) {
            addCriterion("emp_des_ape_mat <=", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatLike(String value) {
            addCriterion("emp_des_ape_mat like", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatNotLike(String value) {
            addCriterion("emp_des_ape_mat not like", value, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatIn(List<String> values) {
            addCriterion("emp_des_ape_mat in", values, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatNotIn(List<String> values) {
            addCriterion("emp_des_ape_mat not in", values, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatBetween(String value1, String value2) {
            addCriterion("emp_des_ape_mat between", value1, value2, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesApeMatNotBetween(String value1, String value2) {
            addCriterion("emp_des_ape_mat not between", value1, value2, "empDesApeMat");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomIsNull() {
            addCriterion("emp_des_nom is null");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomIsNotNull() {
            addCriterion("emp_des_nom is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomEqualTo(String value) {
            addCriterion("emp_des_nom =", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomNotEqualTo(String value) {
            addCriterion("emp_des_nom <>", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomGreaterThan(String value) {
            addCriterion("emp_des_nom >", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomGreaterThanOrEqualTo(String value) {
            addCriterion("emp_des_nom >=", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomLessThan(String value) {
            addCriterion("emp_des_nom <", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomLessThanOrEqualTo(String value) {
            addCriterion("emp_des_nom <=", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomLike(String value) {
            addCriterion("emp_des_nom like", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomNotLike(String value) {
            addCriterion("emp_des_nom not like", value, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomIn(List<String> values) {
            addCriterion("emp_des_nom in", values, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomNotIn(List<String> values) {
            addCriterion("emp_des_nom not in", values, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomBetween(String value1, String value2) {
            addCriterion("emp_des_nom between", value1, value2, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpDesNomNotBetween(String value1, String value2) {
            addCriterion("emp_des_nom not between", value1, value2, "empDesNom");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacIsNull() {
            addCriterion("emp_fec_nac is null");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacIsNotNull() {
            addCriterion("emp_fec_nac is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacEqualTo(Date value) {
            addCriterionForJDBCDate("emp_fec_nac =", value, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_fec_nac <>", value, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_fec_nac >", value, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_fec_nac >=", value, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacLessThan(Date value) {
            addCriterionForJDBCDate("emp_fec_nac <", value, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_fec_nac <=", value, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacIn(List<Date> values) {
            addCriterionForJDBCDate("emp_fec_nac in", values, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_fec_nac not in", values, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_fec_nac between", value1, value2, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpFecNacNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_fec_nac not between", value1, value2, "empFecNac");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(String value) {
            addCriterion("emp_sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(String value) {
            addCriterion("emp_sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(String value) {
            addCriterion("emp_sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
            addCriterion("emp_sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(String value) {
            addCriterion("emp_sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(String value) {
            addCriterion("emp_sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLike(String value) {
            addCriterion("emp_sex like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotLike(String value) {
            addCriterion("emp_sex not like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<String> values) {
            addCriterion("emp_sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<String> values) {
            addCriterion("emp_sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(String value1, String value2) {
            addCriterion("emp_sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(String value1, String value2) {
            addCriterion("emp_sex not between", value1, value2, "empSex");
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