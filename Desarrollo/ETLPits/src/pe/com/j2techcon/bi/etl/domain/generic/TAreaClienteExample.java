package pe.com.j2techcon.bi.etl.domain.generic;

import java.util.ArrayList;
import java.util.List;

public class TAreaClienteExample {
	
	protected String paginationByClause;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAreaClienteExample() {
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

        public Criteria andAreCliCodTipIsNull() {
            addCriterion("are_cli_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipIsNotNull() {
            addCriterion("are_cli_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipEqualTo(Integer value) {
            addCriterion("are_cli_cod_tip =", value, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipNotEqualTo(Integer value) {
            addCriterion("are_cli_cod_tip <>", value, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipGreaterThan(Integer value) {
            addCriterion("are_cli_cod_tip >", value, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("are_cli_cod_tip >=", value, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipLessThan(Integer value) {
            addCriterion("are_cli_cod_tip <", value, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("are_cli_cod_tip <=", value, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipIn(List<Integer> values) {
            addCriterion("are_cli_cod_tip in", values, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipNotIn(List<Integer> values) {
            addCriterion("are_cli_cod_tip not in", values, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipBetween(Integer value1, Integer value2) {
            addCriterion("are_cli_cod_tip between", value1, value2, "areCliCodTip");
            return (Criteria) this;
        }

        public Criteria andAreCliCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("are_cli_cod_tip not between", value1, value2, "areCliCodTip");
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

        public Criteria andAreCliDesIsNull() {
            addCriterion("are_cli_des is null");
            return (Criteria) this;
        }

        public Criteria andAreCliDesIsNotNull() {
            addCriterion("are_cli_des is not null");
            return (Criteria) this;
        }

        public Criteria andAreCliDesEqualTo(String value) {
            addCriterion("are_cli_des =", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesNotEqualTo(String value) {
            addCriterion("are_cli_des <>", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesGreaterThan(String value) {
            addCriterion("are_cli_des >", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesGreaterThanOrEqualTo(String value) {
            addCriterion("are_cli_des >=", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesLessThan(String value) {
            addCriterion("are_cli_des <", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesLessThanOrEqualTo(String value) {
            addCriterion("are_cli_des <=", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesLike(String value) {
            addCriterion("are_cli_des like", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesNotLike(String value) {
            addCriterion("are_cli_des not like", value, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesIn(List<String> values) {
            addCriterion("are_cli_des in", values, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesNotIn(List<String> values) {
            addCriterion("are_cli_des not in", values, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesBetween(String value1, String value2) {
            addCriterion("are_cli_des between", value1, value2, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesNotBetween(String value1, String value2) {
            addCriterion("are_cli_des not between", value1, value2, "areCliDes");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirIsNull() {
            addCriterion("are_cli_des_dir is null");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirIsNotNull() {
            addCriterion("are_cli_des_dir is not null");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirEqualTo(String value) {
            addCriterion("are_cli_des_dir =", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirNotEqualTo(String value) {
            addCriterion("are_cli_des_dir <>", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirGreaterThan(String value) {
            addCriterion("are_cli_des_dir >", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirGreaterThanOrEqualTo(String value) {
            addCriterion("are_cli_des_dir >=", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirLessThan(String value) {
            addCriterion("are_cli_des_dir <", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirLessThanOrEqualTo(String value) {
            addCriterion("are_cli_des_dir <=", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirLike(String value) {
            addCriterion("are_cli_des_dir like", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirNotLike(String value) {
            addCriterion("are_cli_des_dir not like", value, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirIn(List<String> values) {
            addCriterion("are_cli_des_dir in", values, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirNotIn(List<String> values) {
            addCriterion("are_cli_des_dir not in", values, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirBetween(String value1, String value2) {
            addCriterion("are_cli_des_dir between", value1, value2, "areCliDesDir");
            return (Criteria) this;
        }

        public Criteria andAreCliDesDirNotBetween(String value1, String value2) {
            addCriterion("are_cli_des_dir not between", value1, value2, "areCliDesDir");
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

        public Criteria andAreCliCodIsNull() {
            addCriterion("are_cli_cod is null");
            return (Criteria) this;
        }

        public Criteria andAreCliCodIsNotNull() {
            addCriterion("are_cli_cod is not null");
            return (Criteria) this;
        }

        public Criteria andAreCliCodEqualTo(String value) {
            addCriterion("are_cli_cod =", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodNotEqualTo(String value) {
            addCriterion("are_cli_cod <>", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodGreaterThan(String value) {
            addCriterion("are_cli_cod >", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodGreaterThanOrEqualTo(String value) {
            addCriterion("are_cli_cod >=", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodLessThan(String value) {
            addCriterion("are_cli_cod <", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodLessThanOrEqualTo(String value) {
            addCriterion("are_cli_cod <=", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodLike(String value) {
            addCriterion("are_cli_cod like", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodNotLike(String value) {
            addCriterion("are_cli_cod not like", value, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodIn(List<String> values) {
            addCriterion("are_cli_cod in", values, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodNotIn(List<String> values) {
            addCriterion("are_cli_cod not in", values, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodBetween(String value1, String value2) {
            addCriterion("are_cli_cod between", value1, value2, "areCliCod");
            return (Criteria) this;
        }

        public Criteria andAreCliCodNotBetween(String value1, String value2) {
            addCriterion("are_cli_cod not between", value1, value2, "areCliCod");
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