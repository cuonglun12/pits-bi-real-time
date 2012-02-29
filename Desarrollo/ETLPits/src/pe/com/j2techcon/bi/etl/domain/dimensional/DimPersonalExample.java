package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class DimPersonalExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimPersonalExample() {
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

        public Criteria andPersonalKeyIsNull() {
            addCriterion("personal_key is null");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyIsNotNull() {
            addCriterion("personal_key is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyEqualTo(Integer value) {
            addCriterion("personal_key =", value, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyNotEqualTo(Integer value) {
            addCriterion("personal_key <>", value, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyGreaterThan(Integer value) {
            addCriterion("personal_key >", value, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("personal_key >=", value, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyLessThan(Integer value) {
            addCriterion("personal_key <", value, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyLessThanOrEqualTo(Integer value) {
            addCriterion("personal_key <=", value, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyIn(List<Integer> values) {
            addCriterion("personal_key in", values, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyNotIn(List<Integer> values) {
            addCriterion("personal_key not in", values, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyBetween(Integer value1, Integer value2) {
            addCriterion("personal_key between", value1, value2, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("personal_key not between", value1, value2, "personalKey");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoIsNull() {
            addCriterion("personal_codigo is null");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoIsNotNull() {
            addCriterion("personal_codigo is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoEqualTo(String value) {
            addCriterion("personal_codigo =", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoNotEqualTo(String value) {
            addCriterion("personal_codigo <>", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoGreaterThan(String value) {
            addCriterion("personal_codigo >", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoGreaterThanOrEqualTo(String value) {
            addCriterion("personal_codigo >=", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoLessThan(String value) {
            addCriterion("personal_codigo <", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoLessThanOrEqualTo(String value) {
            addCriterion("personal_codigo <=", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoLike(String value) {
            addCriterion("personal_codigo like", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoNotLike(String value) {
            addCriterion("personal_codigo not like", value, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoIn(List<String> values) {
            addCriterion("personal_codigo in", values, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoNotIn(List<String> values) {
            addCriterion("personal_codigo not in", values, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoBetween(String value1, String value2) {
            addCriterion("personal_codigo between", value1, value2, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoNotBetween(String value1, String value2) {
            addCriterion("personal_codigo not between", value1, value2, "personalCodigo");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaIsNull() {
            addCriterion("personal_codigo_categoria is null");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaIsNotNull() {
            addCriterion("personal_codigo_categoria is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaEqualTo(Integer value) {
            addCriterion("personal_codigo_categoria =", value, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaNotEqualTo(Integer value) {
            addCriterion("personal_codigo_categoria <>", value, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaGreaterThan(Integer value) {
            addCriterion("personal_codigo_categoria >", value, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaGreaterThanOrEqualTo(Integer value) {
            addCriterion("personal_codigo_categoria >=", value, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaLessThan(Integer value) {
            addCriterion("personal_codigo_categoria <", value, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaLessThanOrEqualTo(Integer value) {
            addCriterion("personal_codigo_categoria <=", value, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaIn(List<Integer> values) {
            addCriterion("personal_codigo_categoria in", values, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaNotIn(List<Integer> values) {
            addCriterion("personal_codigo_categoria not in", values, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaBetween(Integer value1, Integer value2) {
            addCriterion("personal_codigo_categoria between", value1, value2, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalCodigoCategoriaNotBetween(Integer value1, Integer value2) {
            addCriterion("personal_codigo_categoria not between", value1, value2, "personalCodigoCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaIsNull() {
            addCriterion("personal_descripcion_categoria is null");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaIsNotNull() {
            addCriterion("personal_descripcion_categoria is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaEqualTo(String value) {
            addCriterion("personal_descripcion_categoria =", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaNotEqualTo(String value) {
            addCriterion("personal_descripcion_categoria <>", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaGreaterThan(String value) {
            addCriterion("personal_descripcion_categoria >", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaGreaterThanOrEqualTo(String value) {
            addCriterion("personal_descripcion_categoria >=", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaLessThan(String value) {
            addCriterion("personal_descripcion_categoria <", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaLessThanOrEqualTo(String value) {
            addCriterion("personal_descripcion_categoria <=", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaLike(String value) {
            addCriterion("personal_descripcion_categoria like", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaNotLike(String value) {
            addCriterion("personal_descripcion_categoria not like", value, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaIn(List<String> values) {
            addCriterion("personal_descripcion_categoria in", values, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaNotIn(List<String> values) {
            addCriterion("personal_descripcion_categoria not in", values, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaBetween(String value1, String value2) {
            addCriterion("personal_descripcion_categoria between", value1, value2, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalDescripcionCategoriaNotBetween(String value1, String value2) {
            addCriterion("personal_descripcion_categoria not between", value1, value2, "personalDescripcionCategoria");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreIsNull() {
            addCriterion("personal_nombre is null");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreIsNotNull() {
            addCriterion("personal_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreEqualTo(String value) {
            addCriterion("personal_nombre =", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreNotEqualTo(String value) {
            addCriterion("personal_nombre <>", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreGreaterThan(String value) {
            addCriterion("personal_nombre >", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreGreaterThanOrEqualTo(String value) {
            addCriterion("personal_nombre >=", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreLessThan(String value) {
            addCriterion("personal_nombre <", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreLessThanOrEqualTo(String value) {
            addCriterion("personal_nombre <=", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreLike(String value) {
            addCriterion("personal_nombre like", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreNotLike(String value) {
            addCriterion("personal_nombre not like", value, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreIn(List<String> values) {
            addCriterion("personal_nombre in", values, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreNotIn(List<String> values) {
            addCriterion("personal_nombre not in", values, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreBetween(String value1, String value2) {
            addCriterion("personal_nombre between", value1, value2, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalNombreNotBetween(String value1, String value2) {
            addCriterion("personal_nombre not between", value1, value2, "personalNombre");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoIsNull() {
            addCriterion("personal_sexo is null");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoIsNotNull() {
            addCriterion("personal_sexo is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoEqualTo(String value) {
            addCriterion("personal_sexo =", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoNotEqualTo(String value) {
            addCriterion("personal_sexo <>", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoGreaterThan(String value) {
            addCriterion("personal_sexo >", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoGreaterThanOrEqualTo(String value) {
            addCriterion("personal_sexo >=", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoLessThan(String value) {
            addCriterion("personal_sexo <", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoLessThanOrEqualTo(String value) {
            addCriterion("personal_sexo <=", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoLike(String value) {
            addCriterion("personal_sexo like", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoNotLike(String value) {
            addCriterion("personal_sexo not like", value, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoIn(List<String> values) {
            addCriterion("personal_sexo in", values, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoNotIn(List<String> values) {
            addCriterion("personal_sexo not in", values, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoBetween(String value1, String value2) {
            addCriterion("personal_sexo between", value1, value2, "personalSexo");
            return (Criteria) this;
        }

        public Criteria andPersonalSexoNotBetween(String value1, String value2) {
            addCriterion("personal_sexo not between", value1, value2, "personalSexo");
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