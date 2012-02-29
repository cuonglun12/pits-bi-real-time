package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TClienteExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TClienteExample() {
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

        public Criteria andCliIdIsNull() {
            addCriterion("cli_id is null");
            return (Criteria) this;
        }

        public Criteria andCliIdIsNotNull() {
            addCriterion("cli_id is not null");
            return (Criteria) this;
        }

        public Criteria andCliIdEqualTo(Integer value) {
            addCriterion("cli_id =", value, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdNotEqualTo(Integer value) {
            addCriterion("cli_id <>", value, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdGreaterThan(Integer value) {
            addCriterion("cli_id >", value, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_id >=", value, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdLessThan(Integer value) {
            addCriterion("cli_id <", value, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdLessThanOrEqualTo(Integer value) {
            addCriterion("cli_id <=", value, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdIn(List<Integer> values) {
            addCriterion("cli_id in", values, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdNotIn(List<Integer> values) {
            addCriterion("cli_id not in", values, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdBetween(Integer value1, Integer value2) {
            addCriterion("cli_id between", value1, value2, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_id not between", value1, value2, "cliId");
            return (Criteria) this;
        }

        public Criteria andCliCodTipIsNull() {
            addCriterion("cli_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipIsNotNull() {
            addCriterion("cli_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipEqualTo(Integer value) {
            addCriterion("cli_cod_tip =", value, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipNotEqualTo(Integer value) {
            addCriterion("cli_cod_tip <>", value, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipGreaterThan(Integer value) {
            addCriterion("cli_cod_tip >", value, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip >=", value, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipLessThan(Integer value) {
            addCriterion("cli_cod_tip <", value, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip <=", value, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipIn(List<Integer> values) {
            addCriterion("cli_cod_tip in", values, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipNotIn(List<Integer> values) {
            addCriterion("cli_cod_tip not in", values, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip between", value1, value2, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip not between", value1, value2, "cliCodTip");
            return (Criteria) this;
        }

        public Criteria andCliCodCatIsNull() {
            addCriterion("cli_cod_cat is null");
            return (Criteria) this;
        }

        public Criteria andCliCodCatIsNotNull() {
            addCriterion("cli_cod_cat is not null");
            return (Criteria) this;
        }

        public Criteria andCliCodCatEqualTo(Integer value) {
            addCriterion("cli_cod_cat =", value, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatNotEqualTo(Integer value) {
            addCriterion("cli_cod_cat <>", value, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatGreaterThan(Integer value) {
            addCriterion("cli_cod_cat >", value, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_cat >=", value, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatLessThan(Integer value) {
            addCriterion("cli_cod_cat <", value, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatLessThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_cat <=", value, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatIn(List<Integer> values) {
            addCriterion("cli_cod_cat in", values, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatNotIn(List<Integer> values) {
            addCriterion("cli_cod_cat not in", values, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_cat between", value1, value2, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodCatNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_cat not between", value1, value2, "cliCodCat");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocIsNull() {
            addCriterion("cli_cod_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocIsNotNull() {
            addCriterion("cli_cod_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocEqualTo(Integer value) {
            addCriterion("cli_cod_tip_doc =", value, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocNotEqualTo(Integer value) {
            addCriterion("cli_cod_tip_doc <>", value, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocGreaterThan(Integer value) {
            addCriterion("cli_cod_tip_doc >", value, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip_doc >=", value, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocLessThan(Integer value) {
            addCriterion("cli_cod_tip_doc <", value, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocLessThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip_doc <=", value, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocIn(List<Integer> values) {
            addCriterion("cli_cod_tip_doc in", values, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocNotIn(List<Integer> values) {
            addCriterion("cli_cod_tip_doc not in", values, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip_doc between", value1, value2, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliCodTipDocNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip_doc not between", value1, value2, "cliCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocIsNull() {
            addCriterion("cli_num_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocIsNotNull() {
            addCriterion("cli_num_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocEqualTo(String value) {
            addCriterion("cli_num_tip_doc =", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocNotEqualTo(String value) {
            addCriterion("cli_num_tip_doc <>", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocGreaterThan(String value) {
            addCriterion("cli_num_tip_doc >", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocGreaterThanOrEqualTo(String value) {
            addCriterion("cli_num_tip_doc >=", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocLessThan(String value) {
            addCriterion("cli_num_tip_doc <", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocLessThanOrEqualTo(String value) {
            addCriterion("cli_num_tip_doc <=", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocLike(String value) {
            addCriterion("cli_num_tip_doc like", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocNotLike(String value) {
            addCriterion("cli_num_tip_doc not like", value, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocIn(List<String> values) {
            addCriterion("cli_num_tip_doc in", values, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocNotIn(List<String> values) {
            addCriterion("cli_num_tip_doc not in", values, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocBetween(String value1, String value2) {
            addCriterion("cli_num_tip_doc between", value1, value2, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliNumTipDocNotBetween(String value1, String value2) {
            addCriterion("cli_num_tip_doc not between", value1, value2, "cliNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocIsNull() {
            addCriterion("cli_des_raz_soc is null");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocIsNotNull() {
            addCriterion("cli_des_raz_soc is not null");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocEqualTo(String value) {
            addCriterion("cli_des_raz_soc =", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocNotEqualTo(String value) {
            addCriterion("cli_des_raz_soc <>", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocGreaterThan(String value) {
            addCriterion("cli_des_raz_soc >", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocGreaterThanOrEqualTo(String value) {
            addCriterion("cli_des_raz_soc >=", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocLessThan(String value) {
            addCriterion("cli_des_raz_soc <", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocLessThanOrEqualTo(String value) {
            addCriterion("cli_des_raz_soc <=", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocLike(String value) {
            addCriterion("cli_des_raz_soc like", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocNotLike(String value) {
            addCriterion("cli_des_raz_soc not like", value, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocIn(List<String> values) {
            addCriterion("cli_des_raz_soc in", values, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocNotIn(List<String> values) {
            addCriterion("cli_des_raz_soc not in", values, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocBetween(String value1, String value2) {
            addCriterion("cli_des_raz_soc between", value1, value2, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesRazSocNotBetween(String value1, String value2) {
            addCriterion("cli_des_raz_soc not between", value1, value2, "cliDesRazSoc");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatIsNull() {
            addCriterion("cli_des_ape_pat is null");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatIsNotNull() {
            addCriterion("cli_des_ape_pat is not null");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatEqualTo(String value) {
            addCriterion("cli_des_ape_pat =", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatNotEqualTo(String value) {
            addCriterion("cli_des_ape_pat <>", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatGreaterThan(String value) {
            addCriterion("cli_des_ape_pat >", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatGreaterThanOrEqualTo(String value) {
            addCriterion("cli_des_ape_pat >=", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatLessThan(String value) {
            addCriterion("cli_des_ape_pat <", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatLessThanOrEqualTo(String value) {
            addCriterion("cli_des_ape_pat <=", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatLike(String value) {
            addCriterion("cli_des_ape_pat like", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatNotLike(String value) {
            addCriterion("cli_des_ape_pat not like", value, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatIn(List<String> values) {
            addCriterion("cli_des_ape_pat in", values, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatNotIn(List<String> values) {
            addCriterion("cli_des_ape_pat not in", values, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatBetween(String value1, String value2) {
            addCriterion("cli_des_ape_pat between", value1, value2, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApePatNotBetween(String value1, String value2) {
            addCriterion("cli_des_ape_pat not between", value1, value2, "cliDesApePat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatIsNull() {
            addCriterion("cli_des_ape_mat is null");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatIsNotNull() {
            addCriterion("cli_des_ape_mat is not null");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatEqualTo(String value) {
            addCriterion("cli_des_ape_mat =", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatNotEqualTo(String value) {
            addCriterion("cli_des_ape_mat <>", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatGreaterThan(String value) {
            addCriterion("cli_des_ape_mat >", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatGreaterThanOrEqualTo(String value) {
            addCriterion("cli_des_ape_mat >=", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatLessThan(String value) {
            addCriterion("cli_des_ape_mat <", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatLessThanOrEqualTo(String value) {
            addCriterion("cli_des_ape_mat <=", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatLike(String value) {
            addCriterion("cli_des_ape_mat like", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatNotLike(String value) {
            addCriterion("cli_des_ape_mat not like", value, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatIn(List<String> values) {
            addCriterion("cli_des_ape_mat in", values, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatNotIn(List<String> values) {
            addCriterion("cli_des_ape_mat not in", values, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatBetween(String value1, String value2) {
            addCriterion("cli_des_ape_mat between", value1, value2, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesApeMatNotBetween(String value1, String value2) {
            addCriterion("cli_des_ape_mat not between", value1, value2, "cliDesApeMat");
            return (Criteria) this;
        }

        public Criteria andCliDesNomIsNull() {
            addCriterion("cli_des_nom is null");
            return (Criteria) this;
        }

        public Criteria andCliDesNomIsNotNull() {
            addCriterion("cli_des_nom is not null");
            return (Criteria) this;
        }

        public Criteria andCliDesNomEqualTo(String value) {
            addCriterion("cli_des_nom =", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomNotEqualTo(String value) {
            addCriterion("cli_des_nom <>", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomGreaterThan(String value) {
            addCriterion("cli_des_nom >", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomGreaterThanOrEqualTo(String value) {
            addCriterion("cli_des_nom >=", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomLessThan(String value) {
            addCriterion("cli_des_nom <", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomLessThanOrEqualTo(String value) {
            addCriterion("cli_des_nom <=", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomLike(String value) {
            addCriterion("cli_des_nom like", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomNotLike(String value) {
            addCriterion("cli_des_nom not like", value, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomIn(List<String> values) {
            addCriterion("cli_des_nom in", values, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomNotIn(List<String> values) {
            addCriterion("cli_des_nom not in", values, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomBetween(String value1, String value2) {
            addCriterion("cli_des_nom between", value1, value2, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliDesNomNotBetween(String value1, String value2) {
            addCriterion("cli_des_nom not between", value1, value2, "cliDesNom");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacIsNull() {
            addCriterion("cli_cod_tip_fac is null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacIsNotNull() {
            addCriterion("cli_cod_tip_fac is not null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacEqualTo(Integer value) {
            addCriterion("cli_cod_tip_fac =", value, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacNotEqualTo(Integer value) {
            addCriterion("cli_cod_tip_fac <>", value, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacGreaterThan(Integer value) {
            addCriterion("cli_cod_tip_fac >", value, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip_fac >=", value, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacLessThan(Integer value) {
            addCriterion("cli_cod_tip_fac <", value, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacLessThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip_fac <=", value, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacIn(List<Integer> values) {
            addCriterion("cli_cod_tip_fac in", values, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacNotIn(List<Integer> values) {
            addCriterion("cli_cod_tip_fac not in", values, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip_fac between", value1, value2, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipFacNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip_fac not between", value1, value2, "cliCodTipFac");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreIsNull() {
            addCriterion("cli_cod_tip_cre is null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreIsNotNull() {
            addCriterion("cli_cod_tip_cre is not null");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreEqualTo(Integer value) {
            addCriterion("cli_cod_tip_cre =", value, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreNotEqualTo(Integer value) {
            addCriterion("cli_cod_tip_cre <>", value, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreGreaterThan(Integer value) {
            addCriterion("cli_cod_tip_cre >", value, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip_cre >=", value, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreLessThan(Integer value) {
            addCriterion("cli_cod_tip_cre <", value, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreLessThanOrEqualTo(Integer value) {
            addCriterion("cli_cod_tip_cre <=", value, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreIn(List<Integer> values) {
            addCriterion("cli_cod_tip_cre in", values, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreNotIn(List<Integer> values) {
            addCriterion("cli_cod_tip_cre not in", values, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip_cre between", value1, value2, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andCliCodTipCreNotBetween(Integer value1, Integer value2) {
            addCriterion("cli_cod_tip_cre not between", value1, value2, "cliCodTipCre");
            return (Criteria) this;
        }

        public Criteria andUbiIdIsNull() {
            addCriterion("ubi_id is null");
            return (Criteria) this;
        }

        public Criteria andUbiIdIsNotNull() {
            addCriterion("ubi_id is not null");
            return (Criteria) this;
        }

        public Criteria andUbiIdEqualTo(Integer value) {
            addCriterion("ubi_id =", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdNotEqualTo(Integer value) {
            addCriterion("ubi_id <>", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdGreaterThan(Integer value) {
            addCriterion("ubi_id >", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubi_id >=", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdLessThan(Integer value) {
            addCriterion("ubi_id <", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ubi_id <=", value, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdIn(List<Integer> values) {
            addCriterion("ubi_id in", values, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdNotIn(List<Integer> values) {
            addCriterion("ubi_id not in", values, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdBetween(Integer value1, Integer value2) {
            addCriterion("ubi_id between", value1, value2, "ubiId");
            return (Criteria) this;
        }

        public Criteria andUbiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ubi_id not between", value1, value2, "ubiId");
            return (Criteria) this;
        }

        public Criteria andCliCodIsNull() {
            addCriterion("cli_cod is null");
            return (Criteria) this;
        }

        public Criteria andCliCodIsNotNull() {
            addCriterion("cli_cod is not null");
            return (Criteria) this;
        }

        public Criteria andCliCodEqualTo(String value) {
            addCriterion("cli_cod =", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodNotEqualTo(String value) {
            addCriterion("cli_cod <>", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodGreaterThan(String value) {
            addCriterion("cli_cod >", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodGreaterThanOrEqualTo(String value) {
            addCriterion("cli_cod >=", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodLessThan(String value) {
            addCriterion("cli_cod <", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodLessThanOrEqualTo(String value) {
            addCriterion("cli_cod <=", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodLike(String value) {
            addCriterion("cli_cod like", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodNotLike(String value) {
            addCriterion("cli_cod not like", value, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodIn(List<String> values) {
            addCriterion("cli_cod in", values, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodNotIn(List<String> values) {
            addCriterion("cli_cod not in", values, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodBetween(String value1, String value2) {
            addCriterion("cli_cod between", value1, value2, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliCodNotBetween(String value1, String value2) {
            addCriterion("cli_cod not between", value1, value2, "cliCod");
            return (Criteria) this;
        }

        public Criteria andCliNumTelIsNull() {
            addCriterion("cli_num_tel is null");
            return (Criteria) this;
        }

        public Criteria andCliNumTelIsNotNull() {
            addCriterion("cli_num_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCliNumTelEqualTo(String value) {
            addCriterion("cli_num_tel =", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelNotEqualTo(String value) {
            addCriterion("cli_num_tel <>", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelGreaterThan(String value) {
            addCriterion("cli_num_tel >", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelGreaterThanOrEqualTo(String value) {
            addCriterion("cli_num_tel >=", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelLessThan(String value) {
            addCriterion("cli_num_tel <", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelLessThanOrEqualTo(String value) {
            addCriterion("cli_num_tel <=", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelLike(String value) {
            addCriterion("cli_num_tel like", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelNotLike(String value) {
            addCriterion("cli_num_tel not like", value, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelIn(List<String> values) {
            addCriterion("cli_num_tel in", values, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelNotIn(List<String> values) {
            addCriterion("cli_num_tel not in", values, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelBetween(String value1, String value2) {
            addCriterion("cli_num_tel between", value1, value2, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliNumTelNotBetween(String value1, String value2) {
            addCriterion("cli_num_tel not between", value1, value2, "cliNumTel");
            return (Criteria) this;
        }

        public Criteria andCliDesCorIsNull() {
            addCriterion("cli_des_cor is null");
            return (Criteria) this;
        }

        public Criteria andCliDesCorIsNotNull() {
            addCriterion("cli_des_cor is not null");
            return (Criteria) this;
        }

        public Criteria andCliDesCorEqualTo(String value) {
            addCriterion("cli_des_cor =", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorNotEqualTo(String value) {
            addCriterion("cli_des_cor <>", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorGreaterThan(String value) {
            addCriterion("cli_des_cor >", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorGreaterThanOrEqualTo(String value) {
            addCriterion("cli_des_cor >=", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorLessThan(String value) {
            addCriterion("cli_des_cor <", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorLessThanOrEqualTo(String value) {
            addCriterion("cli_des_cor <=", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorLike(String value) {
            addCriterion("cli_des_cor like", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorNotLike(String value) {
            addCriterion("cli_des_cor not like", value, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorIn(List<String> values) {
            addCriterion("cli_des_cor in", values, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorNotIn(List<String> values) {
            addCriterion("cli_des_cor not in", values, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorBetween(String value1, String value2) {
            addCriterion("cli_des_cor between", value1, value2, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesCorNotBetween(String value1, String value2) {
            addCriterion("cli_des_cor not between", value1, value2, "cliDesCor");
            return (Criteria) this;
        }

        public Criteria andCliDesDirIsNull() {
            addCriterion("cli_des_dir is null");
            return (Criteria) this;
        }

        public Criteria andCliDesDirIsNotNull() {
            addCriterion("cli_des_dir is not null");
            return (Criteria) this;
        }

        public Criteria andCliDesDirEqualTo(String value) {
            addCriterion("cli_des_dir =", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirNotEqualTo(String value) {
            addCriterion("cli_des_dir <>", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirGreaterThan(String value) {
            addCriterion("cli_des_dir >", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirGreaterThanOrEqualTo(String value) {
            addCriterion("cli_des_dir >=", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirLessThan(String value) {
            addCriterion("cli_des_dir <", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirLessThanOrEqualTo(String value) {
            addCriterion("cli_des_dir <=", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirLike(String value) {
            addCriterion("cli_des_dir like", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirNotLike(String value) {
            addCriterion("cli_des_dir not like", value, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirIn(List<String> values) {
            addCriterion("cli_des_dir in", values, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirNotIn(List<String> values) {
            addCriterion("cli_des_dir not in", values, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirBetween(String value1, String value2) {
            addCriterion("cli_des_dir between", value1, value2, "cliDesDir");
            return (Criteria) this;
        }

        public Criteria andCliDesDirNotBetween(String value1, String value2) {
            addCriterion("cli_des_dir not between", value1, value2, "cliDesDir");
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