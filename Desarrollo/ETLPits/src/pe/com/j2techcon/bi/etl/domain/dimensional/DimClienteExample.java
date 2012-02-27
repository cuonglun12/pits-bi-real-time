package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimClienteExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimClienteExample() {
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

        public Criteria andClienteKeyIsNull() {
            addCriterion("cliente_key is null");
            return (Criteria) this;
        }

        public Criteria andClienteKeyIsNotNull() {
            addCriterion("cliente_key is not null");
            return (Criteria) this;
        }

        public Criteria andClienteKeyEqualTo(Integer value) {
            addCriterion("cliente_key =", value, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyNotEqualTo(Integer value) {
            addCriterion("cliente_key <>", value, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyGreaterThan(Integer value) {
            addCriterion("cliente_key >", value, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_key >=", value, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyLessThan(Integer value) {
            addCriterion("cliente_key <", value, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_key <=", value, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyIn(List<Integer> values) {
            addCriterion("cliente_key in", values, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyNotIn(List<Integer> values) {
            addCriterion("cliente_key not in", values, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyBetween(Integer value1, Integer value2) {
            addCriterion("cliente_key between", value1, value2, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_key not between", value1, value2, "clienteKey");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipIsNull() {
            addCriterion("cliente_cod_tip is null");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipIsNotNull() {
            addCriterion("cliente_cod_tip is not null");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipEqualTo(Integer value) {
            addCriterion("cliente_cod_tip =", value, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipNotEqualTo(Integer value) {
            addCriterion("cliente_cod_tip <>", value, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipGreaterThan(Integer value) {
            addCriterion("cliente_cod_tip >", value, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_tip >=", value, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipLessThan(Integer value) {
            addCriterion("cliente_cod_tip <", value, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_tip <=", value, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipIn(List<Integer> values) {
            addCriterion("cliente_cod_tip in", values, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipNotIn(List<Integer> values) {
            addCriterion("cliente_cod_tip not in", values, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_tip between", value1, value2, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_tip not between", value1, value2, "clienteCodTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipIsNull() {
            addCriterion("cliente_desc_tip is null");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipIsNotNull() {
            addCriterion("cliente_desc_tip is not null");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipEqualTo(String value) {
            addCriterion("cliente_desc_tip =", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipNotEqualTo(String value) {
            addCriterion("cliente_desc_tip <>", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipGreaterThan(String value) {
            addCriterion("cliente_desc_tip >", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_desc_tip >=", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipLessThan(String value) {
            addCriterion("cliente_desc_tip <", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipLessThanOrEqualTo(String value) {
            addCriterion("cliente_desc_tip <=", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipLike(String value) {
            addCriterion("cliente_desc_tip like", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipNotLike(String value) {
            addCriterion("cliente_desc_tip not like", value, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipIn(List<String> values) {
            addCriterion("cliente_desc_tip in", values, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipNotIn(List<String> values) {
            addCriterion("cliente_desc_tip not in", values, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipBetween(String value1, String value2) {
            addCriterion("cliente_desc_tip between", value1, value2, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipNotBetween(String value1, String value2) {
            addCriterion("cliente_desc_tip not between", value1, value2, "clienteDescTip");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaIsNull() {
            addCriterion("cliente_cod_categoria is null");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaIsNotNull() {
            addCriterion("cliente_cod_categoria is not null");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaEqualTo(Integer value) {
            addCriterion("cliente_cod_categoria =", value, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaNotEqualTo(Integer value) {
            addCriterion("cliente_cod_categoria <>", value, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaGreaterThan(Integer value) {
            addCriterion("cliente_cod_categoria >", value, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_categoria >=", value, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaLessThan(Integer value) {
            addCriterion("cliente_cod_categoria <", value, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_categoria <=", value, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaIn(List<Integer> values) {
            addCriterion("cliente_cod_categoria in", values, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaNotIn(List<Integer> values) {
            addCriterion("cliente_cod_categoria not in", values, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_categoria between", value1, value2, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodCategoriaNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_categoria not between", value1, value2, "clienteCodCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaIsNull() {
            addCriterion("cliente_desc_categoria is null");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaIsNotNull() {
            addCriterion("cliente_desc_categoria is not null");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaEqualTo(String value) {
            addCriterion("cliente_desc_categoria =", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaNotEqualTo(String value) {
            addCriterion("cliente_desc_categoria <>", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaGreaterThan(String value) {
            addCriterion("cliente_desc_categoria >", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_desc_categoria >=", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaLessThan(String value) {
            addCriterion("cliente_desc_categoria <", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaLessThanOrEqualTo(String value) {
            addCriterion("cliente_desc_categoria <=", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaLike(String value) {
            addCriterion("cliente_desc_categoria like", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaNotLike(String value) {
            addCriterion("cliente_desc_categoria not like", value, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaIn(List<String> values) {
            addCriterion("cliente_desc_categoria in", values, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaNotIn(List<String> values) {
            addCriterion("cliente_desc_categoria not in", values, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaBetween(String value1, String value2) {
            addCriterion("cliente_desc_categoria between", value1, value2, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteDescCategoriaNotBetween(String value1, String value2) {
            addCriterion("cliente_desc_categoria not between", value1, value2, "clienteDescCategoria");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionIsNull() {
            addCriterion("cliente_cod_facturacion is null");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionIsNotNull() {
            addCriterion("cliente_cod_facturacion is not null");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionEqualTo(Integer value) {
            addCriterion("cliente_cod_facturacion =", value, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionNotEqualTo(Integer value) {
            addCriterion("cliente_cod_facturacion <>", value, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionGreaterThan(Integer value) {
            addCriterion("cliente_cod_facturacion >", value, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_facturacion >=", value, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionLessThan(Integer value) {
            addCriterion("cliente_cod_facturacion <", value, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_facturacion <=", value, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionIn(List<Integer> values) {
            addCriterion("cliente_cod_facturacion in", values, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionNotIn(List<Integer> values) {
            addCriterion("cliente_cod_facturacion not in", values, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_facturacion between", value1, value2, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodFacturacionNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_facturacion not between", value1, value2, "clienteCodFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionIsNull() {
            addCriterion("cliente_desc_facturacion is null");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionIsNotNull() {
            addCriterion("cliente_desc_facturacion is not null");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionEqualTo(String value) {
            addCriterion("cliente_desc_facturacion =", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionNotEqualTo(String value) {
            addCriterion("cliente_desc_facturacion <>", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionGreaterThan(String value) {
            addCriterion("cliente_desc_facturacion >", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_desc_facturacion >=", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionLessThan(String value) {
            addCriterion("cliente_desc_facturacion <", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionLessThanOrEqualTo(String value) {
            addCriterion("cliente_desc_facturacion <=", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionLike(String value) {
            addCriterion("cliente_desc_facturacion like", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionNotLike(String value) {
            addCriterion("cliente_desc_facturacion not like", value, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionIn(List<String> values) {
            addCriterion("cliente_desc_facturacion in", values, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionNotIn(List<String> values) {
            addCriterion("cliente_desc_facturacion not in", values, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionBetween(String value1, String value2) {
            addCriterion("cliente_desc_facturacion between", value1, value2, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteDescFacturacionNotBetween(String value1, String value2) {
            addCriterion("cliente_desc_facturacion not between", value1, value2, "clienteDescFacturacion");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoIsNull() {
            addCriterion("cliente_cod_credito is null");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoIsNotNull() {
            addCriterion("cliente_cod_credito is not null");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoEqualTo(Integer value) {
            addCriterion("cliente_cod_credito =", value, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoNotEqualTo(Integer value) {
            addCriterion("cliente_cod_credito <>", value, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoGreaterThan(Integer value) {
            addCriterion("cliente_cod_credito >", value, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_credito >=", value, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoLessThan(Integer value) {
            addCriterion("cliente_cod_credito <", value, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_credito <=", value, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoIn(List<Integer> values) {
            addCriterion("cliente_cod_credito in", values, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoNotIn(List<Integer> values) {
            addCriterion("cliente_cod_credito not in", values, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_credito between", value1, value2, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodCreditoNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_credito not between", value1, value2, "clienteCodCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoIsNull() {
            addCriterion("cliente_desc_credito is null");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoIsNotNull() {
            addCriterion("cliente_desc_credito is not null");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoEqualTo(String value) {
            addCriterion("cliente_desc_credito =", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoNotEqualTo(String value) {
            addCriterion("cliente_desc_credito <>", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoGreaterThan(String value) {
            addCriterion("cliente_desc_credito >", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_desc_credito >=", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoLessThan(String value) {
            addCriterion("cliente_desc_credito <", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoLessThanOrEqualTo(String value) {
            addCriterion("cliente_desc_credito <=", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoLike(String value) {
            addCriterion("cliente_desc_credito like", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoNotLike(String value) {
            addCriterion("cliente_desc_credito not like", value, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoIn(List<String> values) {
            addCriterion("cliente_desc_credito in", values, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoNotIn(List<String> values) {
            addCriterion("cliente_desc_credito not in", values, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoBetween(String value1, String value2) {
            addCriterion("cliente_desc_credito between", value1, value2, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteDescCreditoNotBetween(String value1, String value2) {
            addCriterion("cliente_desc_credito not between", value1, value2, "clienteDescCredito");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocIsNull() {
            addCriterion("cliente_cod_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocIsNotNull() {
            addCriterion("cliente_cod_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocEqualTo(Integer value) {
            addCriterion("cliente_cod_tip_doc =", value, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocNotEqualTo(Integer value) {
            addCriterion("cliente_cod_tip_doc <>", value, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocGreaterThan(Integer value) {
            addCriterion("cliente_cod_tip_doc >", value, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_tip_doc >=", value, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocLessThan(Integer value) {
            addCriterion("cliente_cod_tip_doc <", value, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_cod_tip_doc <=", value, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocIn(List<Integer> values) {
            addCriterion("cliente_cod_tip_doc in", values, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocNotIn(List<Integer> values) {
            addCriterion("cliente_cod_tip_doc not in", values, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_tip_doc between", value1, value2, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteCodTipDocNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_cod_tip_doc not between", value1, value2, "clienteCodTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocIsNull() {
            addCriterion("cliente_desc_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocIsNotNull() {
            addCriterion("cliente_desc_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocEqualTo(String value) {
            addCriterion("cliente_desc_tip_doc =", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocNotEqualTo(String value) {
            addCriterion("cliente_desc_tip_doc <>", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocGreaterThan(String value) {
            addCriterion("cliente_desc_tip_doc >", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_desc_tip_doc >=", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocLessThan(String value) {
            addCriterion("cliente_desc_tip_doc <", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocLessThanOrEqualTo(String value) {
            addCriterion("cliente_desc_tip_doc <=", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocLike(String value) {
            addCriterion("cliente_desc_tip_doc like", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocNotLike(String value) {
            addCriterion("cliente_desc_tip_doc not like", value, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocIn(List<String> values) {
            addCriterion("cliente_desc_tip_doc in", values, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocNotIn(List<String> values) {
            addCriterion("cliente_desc_tip_doc not in", values, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocBetween(String value1, String value2) {
            addCriterion("cliente_desc_tip_doc between", value1, value2, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescTipDocNotBetween(String value1, String value2) {
            addCriterion("cliente_desc_tip_doc not between", value1, value2, "clienteDescTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocIsNull() {
            addCriterion("cliente_num_tip_doc is null");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocIsNotNull() {
            addCriterion("cliente_num_tip_doc is not null");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocEqualTo(String value) {
            addCriterion("cliente_num_tip_doc =", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocNotEqualTo(String value) {
            addCriterion("cliente_num_tip_doc <>", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocGreaterThan(String value) {
            addCriterion("cliente_num_tip_doc >", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_num_tip_doc >=", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocLessThan(String value) {
            addCriterion("cliente_num_tip_doc <", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocLessThanOrEqualTo(String value) {
            addCriterion("cliente_num_tip_doc <=", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocLike(String value) {
            addCriterion("cliente_num_tip_doc like", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocNotLike(String value) {
            addCriterion("cliente_num_tip_doc not like", value, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocIn(List<String> values) {
            addCriterion("cliente_num_tip_doc in", values, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocNotIn(List<String> values) {
            addCriterion("cliente_num_tip_doc not in", values, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocBetween(String value1, String value2) {
            addCriterion("cliente_num_tip_doc between", value1, value2, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteNumTipDocNotBetween(String value1, String value2) {
            addCriterion("cliente_num_tip_doc not between", value1, value2, "clienteNumTipDoc");
            return (Criteria) this;
        }

        public Criteria andClienteDescIsNull() {
            addCriterion("cliente_desc is null");
            return (Criteria) this;
        }

        public Criteria andClienteDescIsNotNull() {
            addCriterion("cliente_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClienteDescEqualTo(String value) {
            addCriterion("cliente_desc =", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescNotEqualTo(String value) {
            addCriterion("cliente_desc <>", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescGreaterThan(String value) {
            addCriterion("cliente_desc >", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_desc >=", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescLessThan(String value) {
            addCriterion("cliente_desc <", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescLessThanOrEqualTo(String value) {
            addCriterion("cliente_desc <=", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescLike(String value) {
            addCriterion("cliente_desc like", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescNotLike(String value) {
            addCriterion("cliente_desc not like", value, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescIn(List<String> values) {
            addCriterion("cliente_desc in", values, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescNotIn(List<String> values) {
            addCriterion("cliente_desc not in", values, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescBetween(String value1, String value2) {
            addCriterion("cliente_desc between", value1, value2, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteDescNotBetween(String value1, String value2) {
            addCriterion("cliente_desc not between", value1, value2, "clienteDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyIsNull() {
            addCriterion("cliente_area_key is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyIsNotNull() {
            addCriterion("cliente_area_key is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyEqualTo(Integer value) {
            addCriterion("cliente_area_key =", value, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyNotEqualTo(Integer value) {
            addCriterion("cliente_area_key <>", value, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyGreaterThan(Integer value) {
            addCriterion("cliente_area_key >", value, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_key >=", value, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyLessThan(Integer value) {
            addCriterion("cliente_area_key <", value, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_key <=", value, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyIn(List<Integer> values) {
            addCriterion("cliente_area_key in", values, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyNotIn(List<Integer> values) {
            addCriterion("cliente_area_key not in", values, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_key between", value1, value2, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_key not between", value1, value2, "clienteAreaKey");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodIsNull() {
            addCriterion("cliente_area_cod is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodIsNotNull() {
            addCriterion("cliente_area_cod is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodEqualTo(String value) {
            addCriterion("cliente_area_cod =", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodNotEqualTo(String value) {
            addCriterion("cliente_area_cod <>", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodGreaterThan(String value) {
            addCriterion("cliente_area_cod >", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_area_cod >=", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodLessThan(String value) {
            addCriterion("cliente_area_cod <", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodLessThanOrEqualTo(String value) {
            addCriterion("cliente_area_cod <=", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodLike(String value) {
            addCriterion("cliente_area_cod like", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodNotLike(String value) {
            addCriterion("cliente_area_cod not like", value, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodIn(List<String> values) {
            addCriterion("cliente_area_cod in", values, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodNotIn(List<String> values) {
            addCriterion("cliente_area_cod not in", values, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodBetween(String value1, String value2) {
            addCriterion("cliente_area_cod between", value1, value2, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodNotBetween(String value1, String value2) {
            addCriterion("cliente_area_cod not between", value1, value2, "clienteAreaCod");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescIsNull() {
            addCriterion("cliente_area_desc is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescIsNotNull() {
            addCriterion("cliente_area_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescEqualTo(String value) {
            addCriterion("cliente_area_desc =", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescNotEqualTo(String value) {
            addCriterion("cliente_area_desc <>", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescGreaterThan(String value) {
            addCriterion("cliente_area_desc >", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc >=", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescLessThan(String value) {
            addCriterion("cliente_area_desc <", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescLessThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc <=", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescLike(String value) {
            addCriterion("cliente_area_desc like", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescNotLike(String value) {
            addCriterion("cliente_area_desc not like", value, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescIn(List<String> values) {
            addCriterion("cliente_area_desc in", values, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescNotIn(List<String> values) {
            addCriterion("cliente_area_desc not in", values, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescBetween(String value1, String value2) {
            addCriterion("cliente_area_desc between", value1, value2, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescNotBetween(String value1, String value2) {
            addCriterion("cliente_area_desc not between", value1, value2, "clienteAreaDesc");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisIsNull() {
            addCriterion("cliente_area_cod_pais is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisIsNotNull() {
            addCriterion("cliente_area_cod_pais is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisEqualTo(Integer value) {
            addCriterion("cliente_area_cod_pais =", value, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisNotEqualTo(Integer value) {
            addCriterion("cliente_area_cod_pais <>", value, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisGreaterThan(Integer value) {
            addCriterion("cliente_area_cod_pais >", value, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_pais >=", value, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisLessThan(Integer value) {
            addCriterion("cliente_area_cod_pais <", value, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_pais <=", value, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisIn(List<Integer> values) {
            addCriterion("cliente_area_cod_pais in", values, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisNotIn(List<Integer> values) {
            addCriterion("cliente_area_cod_pais not in", values, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_pais between", value1, value2, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodPaisNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_pais not between", value1, value2, "clienteAreaCodPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisIsNull() {
            addCriterion("cliente_area_des_pais is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisIsNotNull() {
            addCriterion("cliente_area_des_pais is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisEqualTo(String value) {
            addCriterion("cliente_area_des_pais =", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisNotEqualTo(String value) {
            addCriterion("cliente_area_des_pais <>", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisGreaterThan(String value) {
            addCriterion("cliente_area_des_pais >", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_area_des_pais >=", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisLessThan(String value) {
            addCriterion("cliente_area_des_pais <", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisLessThanOrEqualTo(String value) {
            addCriterion("cliente_area_des_pais <=", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisLike(String value) {
            addCriterion("cliente_area_des_pais like", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisNotLike(String value) {
            addCriterion("cliente_area_des_pais not like", value, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisIn(List<String> values) {
            addCriterion("cliente_area_des_pais in", values, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisNotIn(List<String> values) {
            addCriterion("cliente_area_des_pais not in", values, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisBetween(String value1, String value2) {
            addCriterion("cliente_area_des_pais between", value1, value2, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDesPaisNotBetween(String value1, String value2) {
            addCriterion("cliente_area_des_pais not between", value1, value2, "clienteAreaDesPais");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoIsNull() {
            addCriterion("cliente_area_cod_departamento is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoIsNotNull() {
            addCriterion("cliente_area_cod_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoEqualTo(Integer value) {
            addCriterion("cliente_area_cod_departamento =", value, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoNotEqualTo(Integer value) {
            addCriterion("cliente_area_cod_departamento <>", value, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoGreaterThan(Integer value) {
            addCriterion("cliente_area_cod_departamento >", value, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_departamento >=", value, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoLessThan(Integer value) {
            addCriterion("cliente_area_cod_departamento <", value, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_departamento <=", value, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoIn(List<Integer> values) {
            addCriterion("cliente_area_cod_departamento in", values, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoNotIn(List<Integer> values) {
            addCriterion("cliente_area_cod_departamento not in", values, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_departamento between", value1, value2, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDepartamentoNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_departamento not between", value1, value2, "clienteAreaCodDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoIsNull() {
            addCriterion("cliente_area_desc_departamento is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoIsNotNull() {
            addCriterion("cliente_area_desc_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoEqualTo(String value) {
            addCriterion("cliente_area_desc_departamento =", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoNotEqualTo(String value) {
            addCriterion("cliente_area_desc_departamento <>", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoGreaterThan(String value) {
            addCriterion("cliente_area_desc_departamento >", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc_departamento >=", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoLessThan(String value) {
            addCriterion("cliente_area_desc_departamento <", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc_departamento <=", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoLike(String value) {
            addCriterion("cliente_area_desc_departamento like", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoNotLike(String value) {
            addCriterion("cliente_area_desc_departamento not like", value, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoIn(List<String> values) {
            addCriterion("cliente_area_desc_departamento in", values, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoNotIn(List<String> values) {
            addCriterion("cliente_area_desc_departamento not in", values, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoBetween(String value1, String value2) {
            addCriterion("cliente_area_desc_departamento between", value1, value2, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDepartamentoNotBetween(String value1, String value2) {
            addCriterion("cliente_area_desc_departamento not between", value1, value2, "clienteAreaDescDepartamento");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaIsNull() {
            addCriterion("cliente_area_cod_provincia is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaIsNotNull() {
            addCriterion("cliente_area_cod_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaEqualTo(Integer value) {
            addCriterion("cliente_area_cod_provincia =", value, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaNotEqualTo(Integer value) {
            addCriterion("cliente_area_cod_provincia <>", value, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaGreaterThan(Integer value) {
            addCriterion("cliente_area_cod_provincia >", value, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_provincia >=", value, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaLessThan(Integer value) {
            addCriterion("cliente_area_cod_provincia <", value, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_provincia <=", value, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaIn(List<Integer> values) {
            addCriterion("cliente_area_cod_provincia in", values, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaNotIn(List<Integer> values) {
            addCriterion("cliente_area_cod_provincia not in", values, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_provincia between", value1, value2, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodProvinciaNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_provincia not between", value1, value2, "clienteAreaCodProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaIsNull() {
            addCriterion("cliente_area_desc_provincia is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaIsNotNull() {
            addCriterion("cliente_area_desc_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaEqualTo(String value) {
            addCriterion("cliente_area_desc_provincia =", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaNotEqualTo(String value) {
            addCriterion("cliente_area_desc_provincia <>", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaGreaterThan(String value) {
            addCriterion("cliente_area_desc_provincia >", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc_provincia >=", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaLessThan(String value) {
            addCriterion("cliente_area_desc_provincia <", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaLessThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc_provincia <=", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaLike(String value) {
            addCriterion("cliente_area_desc_provincia like", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaNotLike(String value) {
            addCriterion("cliente_area_desc_provincia not like", value, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaIn(List<String> values) {
            addCriterion("cliente_area_desc_provincia in", values, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaNotIn(List<String> values) {
            addCriterion("cliente_area_desc_provincia not in", values, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaBetween(String value1, String value2) {
            addCriterion("cliente_area_desc_provincia between", value1, value2, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescProvinciaNotBetween(String value1, String value2) {
            addCriterion("cliente_area_desc_provincia not between", value1, value2, "clienteAreaDescProvincia");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoIsNull() {
            addCriterion("cliente_area_cod_distrito is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoIsNotNull() {
            addCriterion("cliente_area_cod_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoEqualTo(Integer value) {
            addCriterion("cliente_area_cod_distrito =", value, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoNotEqualTo(Integer value) {
            addCriterion("cliente_area_cod_distrito <>", value, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoGreaterThan(Integer value) {
            addCriterion("cliente_area_cod_distrito >", value, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_distrito >=", value, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoLessThan(Integer value) {
            addCriterion("cliente_area_cod_distrito <", value, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoLessThanOrEqualTo(Integer value) {
            addCriterion("cliente_area_cod_distrito <=", value, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoIn(List<Integer> values) {
            addCriterion("cliente_area_cod_distrito in", values, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoNotIn(List<Integer> values) {
            addCriterion("cliente_area_cod_distrito not in", values, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_distrito between", value1, value2, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaCodDistritoNotBetween(Integer value1, Integer value2) {
            addCriterion("cliente_area_cod_distrito not between", value1, value2, "clienteAreaCodDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoIsNull() {
            addCriterion("cliente_area_desc_distrito is null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoIsNotNull() {
            addCriterion("cliente_area_desc_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoEqualTo(String value) {
            addCriterion("cliente_area_desc_distrito =", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoNotEqualTo(String value) {
            addCriterion("cliente_area_desc_distrito <>", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoGreaterThan(String value) {
            addCriterion("cliente_area_desc_distrito >", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc_distrito >=", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoLessThan(String value) {
            addCriterion("cliente_area_desc_distrito <", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoLessThanOrEqualTo(String value) {
            addCriterion("cliente_area_desc_distrito <=", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoLike(String value) {
            addCriterion("cliente_area_desc_distrito like", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoNotLike(String value) {
            addCriterion("cliente_area_desc_distrito not like", value, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoIn(List<String> values) {
            addCriterion("cliente_area_desc_distrito in", values, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoNotIn(List<String> values) {
            addCriterion("cliente_area_desc_distrito not in", values, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoBetween(String value1, String value2) {
            addCriterion("cliente_area_desc_distrito between", value1, value2, "clienteAreaDescDistrito");
            return (Criteria) this;
        }

        public Criteria andClienteAreaDescDistritoNotBetween(String value1, String value2) {
            addCriterion("cliente_area_desc_distrito not between", value1, value2, "clienteAreaDescDistrito");
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