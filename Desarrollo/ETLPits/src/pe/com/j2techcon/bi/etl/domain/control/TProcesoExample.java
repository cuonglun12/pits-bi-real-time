package pe.com.j2techcon.bi.etl.domain.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TProcesoExample {
    
	protected String paginationByClause;
	
	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProcesoExample() {
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

        public Criteria andProcFecDesdeIsNull() {
            addCriterion("proc_fec_desde is null");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeIsNotNull() {
            addCriterion("proc_fec_desde is not null");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeEqualTo(Date value) {
            addCriterion("proc_fec_desde =", value, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeNotEqualTo(Date value) {
            addCriterion("proc_fec_desde <>", value, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeGreaterThan(Date value) {
            addCriterion("proc_fec_desde >", value, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_fec_desde >=", value, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeLessThan(Date value) {
            addCriterion("proc_fec_desde <", value, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeLessThanOrEqualTo(Date value) {
            addCriterion("proc_fec_desde <=", value, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeIn(List<Date> values) {
            addCriterion("proc_fec_desde in", values, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeNotIn(List<Date> values) {
            addCriterion("proc_fec_desde not in", values, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeBetween(Date value1, Date value2) {
            addCriterion("proc_fec_desde between", value1, value2, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecDesdeNotBetween(Date value1, Date value2) {
            addCriterion("proc_fec_desde not between", value1, value2, "procFecDesde");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaIsNull() {
            addCriterion("proc_fec_hasta is null");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaIsNotNull() {
            addCriterion("proc_fec_hasta is not null");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaEqualTo(Date value) {
            addCriterion("proc_fec_hasta =", value, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaNotEqualTo(Date value) {
            addCriterion("proc_fec_hasta <>", value, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaGreaterThan(Date value) {
            addCriterion("proc_fec_hasta >", value, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_fec_hasta >=", value, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaLessThan(Date value) {
            addCriterion("proc_fec_hasta <", value, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaLessThanOrEqualTo(Date value) {
            addCriterion("proc_fec_hasta <=", value, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaIn(List<Date> values) {
            addCriterion("proc_fec_hasta in", values, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaNotIn(List<Date> values) {
            addCriterion("proc_fec_hasta not in", values, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaBetween(Date value1, Date value2) {
            addCriterion("proc_fec_hasta between", value1, value2, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcFecHastaNotBetween(Date value1, Date value2) {
            addCriterion("proc_fec_hasta not between", value1, value2, "procFecHasta");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueIsNull() {
            addCriterion("proc_cnt_reg_x_bloque is null");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueIsNotNull() {
            addCriterion("proc_cnt_reg_x_bloque is not null");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueEqualTo(Integer value) {
            addCriterion("proc_cnt_reg_x_bloque =", value, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueNotEqualTo(Integer value) {
            addCriterion("proc_cnt_reg_x_bloque <>", value, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueGreaterThan(Integer value) {
            addCriterion("proc_cnt_reg_x_bloque >", value, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_cnt_reg_x_bloque >=", value, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueLessThan(Integer value) {
            addCriterion("proc_cnt_reg_x_bloque <", value, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueLessThanOrEqualTo(Integer value) {
            addCriterion("proc_cnt_reg_x_bloque <=", value, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueIn(List<Integer> values) {
            addCriterion("proc_cnt_reg_x_bloque in", values, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueNotIn(List<Integer> values) {
            addCriterion("proc_cnt_reg_x_bloque not in", values, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueBetween(Integer value1, Integer value2) {
            addCriterion("proc_cnt_reg_x_bloque between", value1, value2, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcCntRegXBloqueNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_cnt_reg_x_bloque not between", value1, value2, "procCntRegXBloque");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotIsNull() {
            addCriterion("proc_num_reg_tot is null");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotIsNotNull() {
            addCriterion("proc_num_reg_tot is not null");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotEqualTo(Integer value) {
            addCriterion("proc_num_reg_tot =", value, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotNotEqualTo(Integer value) {
            addCriterion("proc_num_reg_tot <>", value, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotGreaterThan(Integer value) {
            addCriterion("proc_num_reg_tot >", value, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_num_reg_tot >=", value, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotLessThan(Integer value) {
            addCriterion("proc_num_reg_tot <", value, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotLessThanOrEqualTo(Integer value) {
            addCriterion("proc_num_reg_tot <=", value, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotIn(List<Integer> values) {
            addCriterion("proc_num_reg_tot in", values, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotNotIn(List<Integer> values) {
            addCriterion("proc_num_reg_tot not in", values, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotBetween(Integer value1, Integer value2) {
            addCriterion("proc_num_reg_tot between", value1, value2, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegTotNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_num_reg_tot not between", value1, value2, "procNumRegTot");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProIsNull() {
            addCriterion("proc_num_reg_pro is null");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProIsNotNull() {
            addCriterion("proc_num_reg_pro is not null");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProEqualTo(Integer value) {
            addCriterion("proc_num_reg_pro =", value, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProNotEqualTo(Integer value) {
            addCriterion("proc_num_reg_pro <>", value, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProGreaterThan(Integer value) {
            addCriterion("proc_num_reg_pro >", value, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_num_reg_pro >=", value, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProLessThan(Integer value) {
            addCriterion("proc_num_reg_pro <", value, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProLessThanOrEqualTo(Integer value) {
            addCriterion("proc_num_reg_pro <=", value, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProIn(List<Integer> values) {
            addCriterion("proc_num_reg_pro in", values, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProNotIn(List<Integer> values) {
            addCriterion("proc_num_reg_pro not in", values, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProBetween(Integer value1, Integer value2) {
            addCriterion("proc_num_reg_pro between", value1, value2, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegProNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_num_reg_pro not between", value1, value2, "procNumRegPro");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecIsNull() {
            addCriterion("proc_num_reg_rec is null");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecIsNotNull() {
            addCriterion("proc_num_reg_rec is not null");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecEqualTo(Integer value) {
            addCriterion("proc_num_reg_rec =", value, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecNotEqualTo(Integer value) {
            addCriterion("proc_num_reg_rec <>", value, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecGreaterThan(Integer value) {
            addCriterion("proc_num_reg_rec >", value, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecGreaterThanOrEqualTo(Integer value) {
            addCriterion("proc_num_reg_rec >=", value, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecLessThan(Integer value) {
            addCriterion("proc_num_reg_rec <", value, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecLessThanOrEqualTo(Integer value) {
            addCriterion("proc_num_reg_rec <=", value, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecIn(List<Integer> values) {
            addCriterion("proc_num_reg_rec in", values, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecNotIn(List<Integer> values) {
            addCriterion("proc_num_reg_rec not in", values, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecBetween(Integer value1, Integer value2) {
            addCriterion("proc_num_reg_rec between", value1, value2, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcNumRegRecNotBetween(Integer value1, Integer value2) {
            addCriterion("proc_num_reg_rec not between", value1, value2, "procNumRegRec");
            return (Criteria) this;
        }

        public Criteria andProcFecIniIsNull() {
            addCriterion("proc_fec_ini is null");
            return (Criteria) this;
        }

        public Criteria andProcFecIniIsNotNull() {
            addCriterion("proc_fec_ini is not null");
            return (Criteria) this;
        }

        public Criteria andProcFecIniEqualTo(Date value) {
            addCriterion("proc_fec_ini =", value, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniNotEqualTo(Date value) {
            addCriterion("proc_fec_ini <>", value, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniGreaterThan(Date value) {
            addCriterion("proc_fec_ini >", value, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_fec_ini >=", value, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniLessThan(Date value) {
            addCriterion("proc_fec_ini <", value, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniLessThanOrEqualTo(Date value) {
            addCriterion("proc_fec_ini <=", value, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniIn(List<Date> values) {
            addCriterion("proc_fec_ini in", values, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniNotIn(List<Date> values) {
            addCriterion("proc_fec_ini not in", values, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniBetween(Date value1, Date value2) {
            addCriterion("proc_fec_ini between", value1, value2, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecIniNotBetween(Date value1, Date value2) {
            addCriterion("proc_fec_ini not between", value1, value2, "procFecIni");
            return (Criteria) this;
        }

        public Criteria andProcFecFinIsNull() {
            addCriterion("proc_fec_fin is null");
            return (Criteria) this;
        }

        public Criteria andProcFecFinIsNotNull() {
            addCriterion("proc_fec_fin is not null");
            return (Criteria) this;
        }

        public Criteria andProcFecFinEqualTo(Date value) {
            addCriterion("proc_fec_fin =", value, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinNotEqualTo(Date value) {
            addCriterion("proc_fec_fin <>", value, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinGreaterThan(Date value) {
            addCriterion("proc_fec_fin >", value, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_fec_fin >=", value, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinLessThan(Date value) {
            addCriterion("proc_fec_fin <", value, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinLessThanOrEqualTo(Date value) {
            addCriterion("proc_fec_fin <=", value, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinIn(List<Date> values) {
            addCriterion("proc_fec_fin in", values, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinNotIn(List<Date> values) {
            addCriterion("proc_fec_fin not in", values, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinBetween(Date value1, Date value2) {
            addCriterion("proc_fec_fin between", value1, value2, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecFinNotBetween(Date value1, Date value2) {
            addCriterion("proc_fec_fin not between", value1, value2, "procFecFin");
            return (Criteria) this;
        }

        public Criteria andProcFecActIsNull() {
            addCriterion("proc_fec_act is null");
            return (Criteria) this;
        }

        public Criteria andProcFecActIsNotNull() {
            addCriterion("proc_fec_act is not null");
            return (Criteria) this;
        }

        public Criteria andProcFecActEqualTo(Date value) {
            addCriterion("proc_fec_act =", value, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActNotEqualTo(Date value) {
            addCriterion("proc_fec_act <>", value, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActGreaterThan(Date value) {
            addCriterion("proc_fec_act >", value, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActGreaterThanOrEqualTo(Date value) {
            addCriterion("proc_fec_act >=", value, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActLessThan(Date value) {
            addCriterion("proc_fec_act <", value, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActLessThanOrEqualTo(Date value) {
            addCriterion("proc_fec_act <=", value, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActIn(List<Date> values) {
            addCriterion("proc_fec_act in", values, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActNotIn(List<Date> values) {
            addCriterion("proc_fec_act not in", values, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActBetween(Date value1, Date value2) {
            addCriterion("proc_fec_act between", value1, value2, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcFecActNotBetween(Date value1, Date value2) {
            addCriterion("proc_fec_act not between", value1, value2, "procFecAct");
            return (Criteria) this;
        }

        public Criteria andProcEstIsNull() {
            addCriterion("proc_est is null");
            return (Criteria) this;
        }

        public Criteria andProcEstIsNotNull() {
            addCriterion("proc_est is not null");
            return (Criteria) this;
        }

        public Criteria andProcEstEqualTo(String value) {
            addCriterion("proc_est =", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstNotEqualTo(String value) {
            addCriterion("proc_est <>", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstGreaterThan(String value) {
            addCriterion("proc_est >", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstGreaterThanOrEqualTo(String value) {
            addCriterion("proc_est >=", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstLessThan(String value) {
            addCriterion("proc_est <", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstLessThanOrEqualTo(String value) {
            addCriterion("proc_est <=", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstLike(String value) {
            addCriterion("proc_est like", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstNotLike(String value) {
            addCriterion("proc_est not like", value, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstIn(List<String> values) {
            addCriterion("proc_est in", values, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstNotIn(List<String> values) {
            addCriterion("proc_est not in", values, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstBetween(String value1, String value2) {
            addCriterion("proc_est between", value1, value2, "procEst");
            return (Criteria) this;
        }

        public Criteria andProcEstNotBetween(String value1, String value2) {
            addCriterion("proc_est not between", value1, value2, "procEst");
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