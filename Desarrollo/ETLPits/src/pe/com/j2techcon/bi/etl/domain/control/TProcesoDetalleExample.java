package pe.com.j2techcon.bi.etl.domain.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TProcesoDetalleExample {
	
	protected String paginationByClause;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProcesoDetalleExample() {
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

        public Criteria andProcDetIdIsNull() {
            addCriterion("proc_det_id is null");
            return (Criteria) this;
        }

        public Criteria andProcDetIdIsNotNull() {
            addCriterion("proc_det_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetIdEqualTo(Integer value) {
            addCriterion("proc_det_id =", value, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdNotEqualTo(Integer value) {
            addCriterion("proc_det_id <>", value, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdGreaterThan(Integer value) {
            addCriterion("proc_det_id >", value, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_det_id >=", value, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdLessThan(Integer value) {
            addCriterion("proc_det_id <", value, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdLessThanOrEqualTo(Integer value) {
            addCriterion("proc_det_id <=", value, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdIn(List<Integer> values) {
            addCriterion("proc_det_id in", values, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdNotIn(List<Integer> values) {
            addCriterion("proc_det_id not in", values, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_id between", value1, value2, "procDetId");
            return (Criteria) this;
        }

        public Criteria andProcDetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_id not between", value1, value2, "procDetId");
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

        public Criteria andProcTipIsNull() {
            addCriterion("proc_tip is null");
            return (Criteria) this;
        }

        public Criteria andProcTipIsNotNull() {
            addCriterion("proc_tip is not null");
            return (Criteria) this;
        }

        public Criteria andProcTipEqualTo(String value) {
            addCriterion("proc_tip =", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipNotEqualTo(String value) {
            addCriterion("proc_tip <>", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipGreaterThan(String value) {
            addCriterion("proc_tip >", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipGreaterThanOrEqualTo(String value) {
            addCriterion("proc_tip >=", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipLessThan(String value) {
            addCriterion("proc_tip <", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipLessThanOrEqualTo(String value) {
            addCriterion("proc_tip <=", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipLike(String value) {
            addCriterion("proc_tip like", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipNotLike(String value) {
            addCriterion("proc_tip not like", value, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipIn(List<String> values) {
            addCriterion("proc_tip in", values, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipNotIn(List<String> values) {
            addCriterion("proc_tip not in", values, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipBetween(String value1, String value2) {
            addCriterion("proc_tip between", value1, value2, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcTipNotBetween(String value1, String value2) {
            addCriterion("proc_tip not between", value1, value2, "procTip");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableIsNull() {
            addCriterion("proc_det_id_table is null");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableIsNotNull() {
            addCriterion("proc_det_id_table is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableEqualTo(Integer value) {
            addCriterion("proc_det_id_table =", value, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableNotEqualTo(Integer value) {
            addCriterion("proc_det_id_table <>", value, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableGreaterThan(Integer value) {
            addCriterion("proc_det_id_table >", value, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_det_id_table >=", value, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableLessThan(Integer value) {
            addCriterion("proc_det_id_table <", value, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableLessThanOrEqualTo(Integer value) {
            addCriterion("proc_det_id_table <=", value, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableIn(List<Integer> values) {
            addCriterion("proc_det_id_table in", values, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableNotIn(List<Integer> values) {
            addCriterion("proc_det_id_table not in", values, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_id_table between", value1, value2, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetIdTableNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_id_table not between", value1, value2, "procDetIdTable");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeIsNull() {
            addCriterion("proc_det_fec_desde is null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeIsNotNull() {
            addCriterion("proc_det_fec_desde is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeEqualTo(Date value) {
            addCriterion("proc_det_fec_desde =", value, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeNotEqualTo(Date value) {
            addCriterion("proc_det_fec_desde <>", value, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeGreaterThan(Date value) {
            addCriterion("proc_det_fec_desde >", value, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_desde >=", value, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeLessThan(Date value) {
            addCriterion("proc_det_fec_desde <", value, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeLessThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_desde <=", value, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeIn(List<Date> values) {
            addCriterion("proc_det_fec_desde in", values, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeNotIn(List<Date> values) {
            addCriterion("proc_det_fec_desde not in", values, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_desde between", value1, value2, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecDesdeNotBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_desde not between", value1, value2, "procDetFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaIsNull() {
            addCriterion("proc_det_fec_hasta is null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaIsNotNull() {
            addCriterion("proc_det_fec_hasta is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaEqualTo(Date value) {
            addCriterion("proc_det_fec_hasta =", value, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaNotEqualTo(Date value) {
            addCriterion("proc_det_fec_hasta <>", value, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaGreaterThan(Date value) {
            addCriterion("proc_det_fec_hasta >", value, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_hasta >=", value, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaLessThan(Date value) {
            addCriterion("proc_det_fec_hasta <", value, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaLessThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_hasta <=", value, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaIn(List<Date> values) {
            addCriterion("proc_det_fec_hasta in", values, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaNotIn(List<Date> values) {
            addCriterion("proc_det_fec_hasta not in", values, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_hasta between", value1, value2, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetFecHastaNotBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_hasta not between", value1, value2, "procDetFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotIsNull() {
            addCriterion("proc_det_num_reg_tot is null");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotIsNotNull() {
            addCriterion("proc_det_num_reg_tot is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_tot =", value, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotNotEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_tot <>", value, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotGreaterThan(Integer value) {
            addCriterion("proc_det_num_reg_tot >", value, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_tot >=", value, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotLessThan(Integer value) {
            addCriterion("proc_det_num_reg_tot <", value, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotLessThanOrEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_tot <=", value, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotIn(List<Integer> values) {
            addCriterion("proc_det_num_reg_tot in", values, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotNotIn(List<Integer> values) {
            addCriterion("proc_det_num_reg_tot not in", values, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_num_reg_tot between", value1, value2, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegTotNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_num_reg_tot not between", value1, value2, "procDetNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProIsNull() {
            addCriterion("proc_det_num_reg_pro is null");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProIsNotNull() {
            addCriterion("proc_det_num_reg_pro is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_pro =", value, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProNotEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_pro <>", value, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProGreaterThan(Integer value) {
            addCriterion("proc_det_num_reg_pro >", value, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_pro >=", value, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProLessThan(Integer value) {
            addCriterion("proc_det_num_reg_pro <", value, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProLessThanOrEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_pro <=", value, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProIn(List<Integer> values) {
            addCriterion("proc_det_num_reg_pro in", values, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProNotIn(List<Integer> values) {
            addCriterion("proc_det_num_reg_pro not in", values, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_num_reg_pro between", value1, value2, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegProNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_num_reg_pro not between", value1, value2, "procDetNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecIsNull() {
            addCriterion("proc_det_num_reg_rec is null");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecIsNotNull() {
            addCriterion("proc_det_num_reg_rec is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_rec =", value, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecNotEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_rec <>", value, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecGreaterThan(Integer value) {
            addCriterion("proc_det_num_reg_rec >", value, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_rec >=", value, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecLessThan(Integer value) {
            addCriterion("proc_det_num_reg_rec <", value, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecLessThanOrEqualTo(Integer value) {
            addCriterion("proc_det_num_reg_rec <=", value, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecIn(List<Integer> values) {
            addCriterion("proc_det_num_reg_rec in", values, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecNotIn(List<Integer> values) {
            addCriterion("proc_det_num_reg_rec not in", values, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_num_reg_rec between", value1, value2, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetNumRegRecNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_det_num_reg_rec not between", value1, value2, "procDetNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniIsNull() {
            addCriterion("proc_det_fec_ini is null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniIsNotNull() {
            addCriterion("proc_det_fec_ini is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniEqualTo(Date value) {
            addCriterion("proc_det_fec_ini =", value, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniNotEqualTo(Date value) {
            addCriterion("proc_det_fec_ini <>", value, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniGreaterThan(Date value) {
            addCriterion("proc_det_fec_ini >", value, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_ini >=", value, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniLessThan(Date value) {
            addCriterion("proc_det_fec_ini <", value, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniLessThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_ini <=", value, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniIn(List<Date> values) {
            addCriterion("proc_det_fec_ini in", values, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniNotIn(List<Date> values) {
            addCriterion("proc_det_fec_ini not in", values, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_ini between", value1, value2, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecIniNotBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_ini not between", value1, value2, "procDetFecIni");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinIsNull() {
            addCriterion("proc_det_fec_fin is null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinIsNotNull() {
            addCriterion("proc_det_fec_fin is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinEqualTo(Date value) {
            addCriterion("proc_det_fec_fin =", value, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinNotEqualTo(Date value) {
            addCriterion("proc_det_fec_fin <>", value, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinGreaterThan(Date value) {
            addCriterion("proc_det_fec_fin >", value, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_fin >=", value, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinLessThan(Date value) {
            addCriterion("proc_det_fec_fin <", value, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinLessThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_fin <=", value, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinIn(List<Date> values) {
            addCriterion("proc_det_fec_fin in", values, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinNotIn(List<Date> values) {
            addCriterion("proc_det_fec_fin not in", values, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_fin between", value1, value2, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecFinNotBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_fin not between", value1, value2, "procDetFecFin");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActIsNull() {
            addCriterion("proc_det_fec_act is null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActIsNotNull() {
            addCriterion("proc_det_fec_act is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActEqualTo(Date value) {
            addCriterion("proc_det_fec_act =", value, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActNotEqualTo(Date value) {
            addCriterion("proc_det_fec_act <>", value, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActGreaterThan(Date value) {
            addCriterion("proc_det_fec_act >", value, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_act >=", value, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActLessThan(Date value) {
            addCriterion("proc_det_fec_act <", value, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActLessThanOrEqualTo(Date value) {
            addCriterion("proc_det_fec_act <=", value, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActIn(List<Date> values) {
            addCriterion("proc_det_fec_act in", values, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActNotIn(List<Date> values) {
            addCriterion("proc_det_fec_act not in", values, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_act between", value1, value2, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetFecActNotBetween(Date value1, Date value2) {
            addCriterion("proc_det_fec_act not between", value1, value2, "procDetFecAct");
            return (Criteria) this;
        }

        public Criteria andProcDetEstIsNull() {
            addCriterion("proc_det_est is null");
            return (Criteria) this;
        }

        public Criteria andProcDetEstIsNotNull() {
            addCriterion("proc_det_est is not null");
            return (Criteria) this;
        }

        public Criteria andProcDetEstEqualTo(String value) {
            addCriterion("proc_det_est =", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstNotEqualTo(String value) {
            addCriterion("proc_det_est <>", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstGreaterThan(String value) {
            addCriterion("proc_det_est >", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstGreaterThanOrEqualTo(String value) {
            addCriterion("proc_det_est >=", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstLessThan(String value) {
            addCriterion("proc_det_est <", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstLessThanOrEqualTo(String value) {
            addCriterion("proc_det_est <=", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstLike(String value) {
            addCriterion("proc_det_est like", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstNotLike(String value) {
            addCriterion("proc_det_est not like", value, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstIn(List<String> values) {
            addCriterion("proc_det_est in", values, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstNotIn(List<String> values) {
            addCriterion("proc_det_est not in", values, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstBetween(String value1, String value2) {
            addCriterion("proc_det_est between", value1, value2, "procDetEst");
            return (Criteria) this;
        }

        public Criteria andProcDetEstNotBetween(String value1, String value2) {
            addCriterion("proc_det_est not between", value1, value2, "procDetEst");
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