package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DimTiempoExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimTiempoExample() {
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

        public Criteria andTiempoKeyIsNull() {
            addCriterion("tiempo_key is null");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyIsNotNull() {
            addCriterion("tiempo_key is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyEqualTo(Integer value) {
            addCriterion("tiempo_key =", value, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyNotEqualTo(Integer value) {
            addCriterion("tiempo_key <>", value, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyGreaterThan(Integer value) {
            addCriterion("tiempo_key >", value, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tiempo_key >=", value, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyLessThan(Integer value) {
            addCriterion("tiempo_key <", value, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyLessThanOrEqualTo(Integer value) {
            addCriterion("tiempo_key <=", value, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyIn(List<Integer> values) {
            addCriterion("tiempo_key in", values, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyNotIn(List<Integer> values) {
            addCriterion("tiempo_key not in", values, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyBetween(Integer value1, Integer value2) {
            addCriterion("tiempo_key between", value1, value2, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("tiempo_key not between", value1, value2, "tiempoKey");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaIsNull() {
            addCriterion("tiempo_fecha is null");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaIsNotNull() {
            addCriterion("tiempo_fecha is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaEqualTo(Date value) {
            addCriterionForJDBCDate("tiempo_fecha =", value, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaNotEqualTo(Date value) {
            addCriterionForJDBCDate("tiempo_fecha <>", value, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaGreaterThan(Date value) {
            addCriterionForJDBCDate("tiempo_fecha >", value, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tiempo_fecha >=", value, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaLessThan(Date value) {
            addCriterionForJDBCDate("tiempo_fecha <", value, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tiempo_fecha <=", value, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaIn(List<Date> values) {
            addCriterionForJDBCDate("tiempo_fecha in", values, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaNotIn(List<Date> values) {
            addCriterionForJDBCDate("tiempo_fecha not in", values, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tiempo_fecha between", value1, value2, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoFechaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tiempo_fecha not between", value1, value2, "tiempoFecha");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaIsNull() {
            addCriterion("tiempo_dia_semana is null");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaIsNotNull() {
            addCriterion("tiempo_dia_semana is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaEqualTo(Short value) {
            addCriterion("tiempo_dia_semana =", value, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaNotEqualTo(Short value) {
            addCriterion("tiempo_dia_semana <>", value, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaGreaterThan(Short value) {
            addCriterion("tiempo_dia_semana >", value, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_dia_semana >=", value, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaLessThan(Short value) {
            addCriterion("tiempo_dia_semana <", value, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_dia_semana <=", value, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaIn(List<Short> values) {
            addCriterion("tiempo_dia_semana in", values, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaNotIn(List<Short> values) {
            addCriterion("tiempo_dia_semana not in", values, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaBetween(Short value1, Short value2) {
            addCriterion("tiempo_dia_semana between", value1, value2, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaSemanaNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_dia_semana not between", value1, value2, "tiempoDiaSemana");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesIsNull() {
            addCriterion("tiempo_dia_mes is null");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesIsNotNull() {
            addCriterion("tiempo_dia_mes is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesEqualTo(Short value) {
            addCriterion("tiempo_dia_mes =", value, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesNotEqualTo(Short value) {
            addCriterion("tiempo_dia_mes <>", value, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesGreaterThan(Short value) {
            addCriterion("tiempo_dia_mes >", value, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_dia_mes >=", value, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesLessThan(Short value) {
            addCriterion("tiempo_dia_mes <", value, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_dia_mes <=", value, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesIn(List<Short> values) {
            addCriterion("tiempo_dia_mes in", values, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesNotIn(List<Short> values) {
            addCriterion("tiempo_dia_mes not in", values, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesBetween(Short value1, Short value2) {
            addCriterion("tiempo_dia_mes between", value1, value2, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoDiaMesNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_dia_mes not between", value1, value2, "tiempoDiaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaIsNull() {
            addCriterion("tiempo_nombre_dia is null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaIsNotNull() {
            addCriterion("tiempo_nombre_dia is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaEqualTo(String value) {
            addCriterion("tiempo_nombre_dia =", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaNotEqualTo(String value) {
            addCriterion("tiempo_nombre_dia <>", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaGreaterThan(String value) {
            addCriterion("tiempo_nombre_dia >", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaGreaterThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_dia >=", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaLessThan(String value) {
            addCriterion("tiempo_nombre_dia <", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaLessThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_dia <=", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaLike(String value) {
            addCriterion("tiempo_nombre_dia like", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaNotLike(String value) {
            addCriterion("tiempo_nombre_dia not like", value, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaIn(List<String> values) {
            addCriterion("tiempo_nombre_dia in", values, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaNotIn(List<String> values) {
            addCriterion("tiempo_nombre_dia not in", values, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_dia between", value1, value2, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreDiaNotBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_dia not between", value1, value2, "tiempoNombreDia");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesIsNull() {
            addCriterion("tiempo_semana_mes is null");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesIsNotNull() {
            addCriterion("tiempo_semana_mes is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesEqualTo(Short value) {
            addCriterion("tiempo_semana_mes =", value, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesNotEqualTo(Short value) {
            addCriterion("tiempo_semana_mes <>", value, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesGreaterThan(Short value) {
            addCriterion("tiempo_semana_mes >", value, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_semana_mes >=", value, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesLessThan(Short value) {
            addCriterion("tiempo_semana_mes <", value, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_semana_mes <=", value, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesIn(List<Short> values) {
            addCriterion("tiempo_semana_mes in", values, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesNotIn(List<Short> values) {
            addCriterion("tiempo_semana_mes not in", values, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesBetween(Short value1, Short value2) {
            addCriterion("tiempo_semana_mes between", value1, value2, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaMesNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_semana_mes not between", value1, value2, "tiempoSemanaMes");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioIsNull() {
            addCriterion("tiempo_semana_anio is null");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioIsNotNull() {
            addCriterion("tiempo_semana_anio is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioEqualTo(Short value) {
            addCriterion("tiempo_semana_anio =", value, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioNotEqualTo(Short value) {
            addCriterion("tiempo_semana_anio <>", value, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioGreaterThan(Short value) {
            addCriterion("tiempo_semana_anio >", value, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_semana_anio >=", value, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioLessThan(Short value) {
            addCriterion("tiempo_semana_anio <", value, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_semana_anio <=", value, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioIn(List<Short> values) {
            addCriterion("tiempo_semana_anio in", values, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioNotIn(List<Short> values) {
            addCriterion("tiempo_semana_anio not in", values, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioBetween(Short value1, Short value2) {
            addCriterion("tiempo_semana_anio between", value1, value2, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoSemanaAnioNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_semana_anio not between", value1, value2, "tiempoSemanaAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoMesIsNull() {
            addCriterion("tiempo_mes is null");
            return (Criteria) this;
        }

        public Criteria andTiempoMesIsNotNull() {
            addCriterion("tiempo_mes is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoMesEqualTo(Short value) {
            addCriterion("tiempo_mes =", value, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesNotEqualTo(Short value) {
            addCriterion("tiempo_mes <>", value, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesGreaterThan(Short value) {
            addCriterion("tiempo_mes >", value, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_mes >=", value, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesLessThan(Short value) {
            addCriterion("tiempo_mes <", value, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_mes <=", value, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesIn(List<Short> values) {
            addCriterion("tiempo_mes in", values, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesNotIn(List<Short> values) {
            addCriterion("tiempo_mes not in", values, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesBetween(Short value1, Short value2) {
            addCriterion("tiempo_mes between", value1, value2, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoMesNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_mes not between", value1, value2, "tiempoMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesIsNull() {
            addCriterion("tiempo_nombre_mes is null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesIsNotNull() {
            addCriterion("tiempo_nombre_mes is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesEqualTo(String value) {
            addCriterion("tiempo_nombre_mes =", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesNotEqualTo(String value) {
            addCriterion("tiempo_nombre_mes <>", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesGreaterThan(String value) {
            addCriterion("tiempo_nombre_mes >", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesGreaterThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_mes >=", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesLessThan(String value) {
            addCriterion("tiempo_nombre_mes <", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesLessThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_mes <=", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesLike(String value) {
            addCriterion("tiempo_nombre_mes like", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesNotLike(String value) {
            addCriterion("tiempo_nombre_mes not like", value, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesIn(List<String> values) {
            addCriterion("tiempo_nombre_mes in", values, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesNotIn(List<String> values) {
            addCriterion("tiempo_nombre_mes not in", values, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_mes between", value1, value2, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreMesNotBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_mes not between", value1, value2, "tiempoNombreMes");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreIsNull() {
            addCriterion("tiempo_trimestre is null");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreIsNotNull() {
            addCriterion("tiempo_trimestre is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreEqualTo(Short value) {
            addCriterion("tiempo_trimestre =", value, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreNotEqualTo(Short value) {
            addCriterion("tiempo_trimestre <>", value, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreGreaterThan(Short value) {
            addCriterion("tiempo_trimestre >", value, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_trimestre >=", value, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreLessThan(Short value) {
            addCriterion("tiempo_trimestre <", value, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_trimestre <=", value, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreIn(List<Short> values) {
            addCriterion("tiempo_trimestre in", values, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreNotIn(List<Short> values) {
            addCriterion("tiempo_trimestre not in", values, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreBetween(Short value1, Short value2) {
            addCriterion("tiempo_trimestre between", value1, value2, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoTrimestreNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_trimestre not between", value1, value2, "tiempoTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreIsNull() {
            addCriterion("tiempo_nombre_trimestre is null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreIsNotNull() {
            addCriterion("tiempo_nombre_trimestre is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreEqualTo(String value) {
            addCriterion("tiempo_nombre_trimestre =", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreNotEqualTo(String value) {
            addCriterion("tiempo_nombre_trimestre <>", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreGreaterThan(String value) {
            addCriterion("tiempo_nombre_trimestre >", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreGreaterThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_trimestre >=", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreLessThan(String value) {
            addCriterion("tiempo_nombre_trimestre <", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreLessThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_trimestre <=", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreLike(String value) {
            addCriterion("tiempo_nombre_trimestre like", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreNotLike(String value) {
            addCriterion("tiempo_nombre_trimestre not like", value, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreIn(List<String> values) {
            addCriterion("tiempo_nombre_trimestre in", values, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreNotIn(List<String> values) {
            addCriterion("tiempo_nombre_trimestre not in", values, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_trimestre between", value1, value2, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreTrimestreNotBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_trimestre not between", value1, value2, "tiempoNombreTrimestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreIsNull() {
            addCriterion("tiempo_semestre is null");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreIsNotNull() {
            addCriterion("tiempo_semestre is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreEqualTo(Short value) {
            addCriterion("tiempo_semestre =", value, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreNotEqualTo(Short value) {
            addCriterion("tiempo_semestre <>", value, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreGreaterThan(Short value) {
            addCriterion("tiempo_semestre >", value, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_semestre >=", value, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreLessThan(Short value) {
            addCriterion("tiempo_semestre <", value, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_semestre <=", value, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreIn(List<Short> values) {
            addCriterion("tiempo_semestre in", values, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreNotIn(List<Short> values) {
            addCriterion("tiempo_semestre not in", values, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreBetween(Short value1, Short value2) {
            addCriterion("tiempo_semestre between", value1, value2, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoSemestreNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_semestre not between", value1, value2, "tiempoSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreIsNull() {
            addCriterion("tiempo_nombre_semestre is null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreIsNotNull() {
            addCriterion("tiempo_nombre_semestre is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreEqualTo(String value) {
            addCriterion("tiempo_nombre_semestre =", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreNotEqualTo(String value) {
            addCriterion("tiempo_nombre_semestre <>", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreGreaterThan(String value) {
            addCriterion("tiempo_nombre_semestre >", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreGreaterThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_semestre >=", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreLessThan(String value) {
            addCriterion("tiempo_nombre_semestre <", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreLessThanOrEqualTo(String value) {
            addCriterion("tiempo_nombre_semestre <=", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreLike(String value) {
            addCriterion("tiempo_nombre_semestre like", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreNotLike(String value) {
            addCriterion("tiempo_nombre_semestre not like", value, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreIn(List<String> values) {
            addCriterion("tiempo_nombre_semestre in", values, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreNotIn(List<String> values) {
            addCriterion("tiempo_nombre_semestre not in", values, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_semestre between", value1, value2, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoNombreSemestreNotBetween(String value1, String value2) {
            addCriterion("tiempo_nombre_semestre not between", value1, value2, "tiempoNombreSemestre");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioIsNull() {
            addCriterion("tiempo_anio is null");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioIsNotNull() {
            addCriterion("tiempo_anio is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioEqualTo(Short value) {
            addCriterion("tiempo_anio =", value, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioNotEqualTo(Short value) {
            addCriterion("tiempo_anio <>", value, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioGreaterThan(Short value) {
            addCriterion("tiempo_anio >", value, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioGreaterThanOrEqualTo(Short value) {
            addCriterion("tiempo_anio >=", value, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioLessThan(Short value) {
            addCriterion("tiempo_anio <", value, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioLessThanOrEqualTo(Short value) {
            addCriterion("tiempo_anio <=", value, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioIn(List<Short> values) {
            addCriterion("tiempo_anio in", values, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioNotIn(List<Short> values) {
            addCriterion("tiempo_anio not in", values, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioBetween(Short value1, Short value2) {
            addCriterion("tiempo_anio between", value1, value2, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoAnioNotBetween(Short value1, Short value2) {
            addCriterion("tiempo_anio not between", value1, value2, "tiempoAnio");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoIsNull() {
            addCriterion("tiempo_es_feriado is null");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoIsNotNull() {
            addCriterion("tiempo_es_feriado is not null");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoEqualTo(String value) {
            addCriterion("tiempo_es_feriado =", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoNotEqualTo(String value) {
            addCriterion("tiempo_es_feriado <>", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoGreaterThan(String value) {
            addCriterion("tiempo_es_feriado >", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoGreaterThanOrEqualTo(String value) {
            addCriterion("tiempo_es_feriado >=", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoLessThan(String value) {
            addCriterion("tiempo_es_feriado <", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoLessThanOrEqualTo(String value) {
            addCriterion("tiempo_es_feriado <=", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoLike(String value) {
            addCriterion("tiempo_es_feriado like", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoNotLike(String value) {
            addCriterion("tiempo_es_feriado not like", value, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoIn(List<String> values) {
            addCriterion("tiempo_es_feriado in", values, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoNotIn(List<String> values) {
            addCriterion("tiempo_es_feriado not in", values, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoBetween(String value1, String value2) {
            addCriterion("tiempo_es_feriado between", value1, value2, "tiempoEsFeriado");
            return (Criteria) this;
        }

        public Criteria andTiempoEsFeriadoNotBetween(String value1, String value2) {
            addCriterion("tiempo_es_feriado not between", value1, value2, "tiempoEsFeriado");
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