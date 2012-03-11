package pe.com.j2techcon.bi.etl.domain.dimensional;

import java.util.ArrayList;
import java.util.List;

public class FactEnvioExample {
	
	protected String paginationByClause;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactEnvioExample() {
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

        public Criteria andEnvioKeyClienteAreaIsNull() {
            addCriterion("envio_key_cliente_area is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaIsNotNull() {
            addCriterion("envio_key_cliente_area is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaEqualTo(Integer value) {
            addCriterion("envio_key_cliente_area =", value, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaNotEqualTo(Integer value) {
            addCriterion("envio_key_cliente_area <>", value, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaGreaterThan(Integer value) {
            addCriterion("envio_key_cliente_area >", value, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_cliente_area >=", value, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaLessThan(Integer value) {
            addCriterion("envio_key_cliente_area <", value, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_cliente_area <=", value, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaIn(List<Integer> values) {
            addCriterion("envio_key_cliente_area in", values, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaNotIn(List<Integer> values) {
            addCriterion("envio_key_cliente_area not in", values, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_cliente_area between", value1, value2, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyClienteAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_cliente_area not between", value1, value2, "envioKeyClienteArea");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioIsNull() {
            addCriterion("envio_key_servicio is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioIsNotNull() {
            addCriterion("envio_key_servicio is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioEqualTo(Integer value) {
            addCriterion("envio_key_servicio =", value, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioNotEqualTo(Integer value) {
            addCriterion("envio_key_servicio <>", value, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioGreaterThan(Integer value) {
            addCriterion("envio_key_servicio >", value, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_servicio >=", value, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioLessThan(Integer value) {
            addCriterion("envio_key_servicio <", value, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_servicio <=", value, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioIn(List<Integer> values) {
            addCriterion("envio_key_servicio in", values, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioNotIn(List<Integer> values) {
            addCriterion("envio_key_servicio not in", values, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_servicio between", value1, value2, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyServicioNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_servicio not between", value1, value2, "envioKeyServicio");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoIsNull() {
            addCriterion("envio_key_producto is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoIsNotNull() {
            addCriterion("envio_key_producto is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoEqualTo(Integer value) {
            addCriterion("envio_key_producto =", value, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoNotEqualTo(Integer value) {
            addCriterion("envio_key_producto <>", value, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoGreaterThan(Integer value) {
            addCriterion("envio_key_producto >", value, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_producto >=", value, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoLessThan(Integer value) {
            addCriterion("envio_key_producto <", value, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_producto <=", value, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoIn(List<Integer> values) {
            addCriterion("envio_key_producto in", values, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoNotIn(List<Integer> values) {
            addCriterion("envio_key_producto not in", values, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_producto between", value1, value2, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyProductoNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_producto not between", value1, value2, "envioKeyProducto");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaIsNull() {
            addCriterion("envio_key_zona is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaIsNotNull() {
            addCriterion("envio_key_zona is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaEqualTo(Integer value) {
            addCriterion("envio_key_zona =", value, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaNotEqualTo(Integer value) {
            addCriterion("envio_key_zona <>", value, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaGreaterThan(Integer value) {
            addCriterion("envio_key_zona >", value, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_zona >=", value, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaLessThan(Integer value) {
            addCriterion("envio_key_zona <", value, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_zona <=", value, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaIn(List<Integer> values) {
            addCriterion("envio_key_zona in", values, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaNotIn(List<Integer> values) {
            addCriterion("envio_key_zona not in", values, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_zona between", value1, value2, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyZonaNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_zona not between", value1, value2, "envioKeyZona");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalIsNull() {
            addCriterion("envio_key_personal is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalIsNotNull() {
            addCriterion("envio_key_personal is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalEqualTo(Integer value) {
            addCriterion("envio_key_personal =", value, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalNotEqualTo(Integer value) {
            addCriterion("envio_key_personal <>", value, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalGreaterThan(Integer value) {
            addCriterion("envio_key_personal >", value, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_personal >=", value, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalLessThan(Integer value) {
            addCriterion("envio_key_personal <", value, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_personal <=", value, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalIn(List<Integer> values) {
            addCriterion("envio_key_personal in", values, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalNotIn(List<Integer> values) {
            addCriterion("envio_key_personal not in", values, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_personal between", value1, value2, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyPersonalNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_personal not between", value1, value2, "envioKeyPersonal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalIsNull() {
            addCriterion("envio_key_fec_sal is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalIsNotNull() {
            addCriterion("envio_key_fec_sal is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalEqualTo(Integer value) {
            addCriterion("envio_key_fec_sal =", value, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalNotEqualTo(Integer value) {
            addCriterion("envio_key_fec_sal <>", value, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalGreaterThan(Integer value) {
            addCriterion("envio_key_fec_sal >", value, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_fec_sal >=", value, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalLessThan(Integer value) {
            addCriterion("envio_key_fec_sal <", value, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_fec_sal <=", value, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalIn(List<Integer> values) {
            addCriterion("envio_key_fec_sal in", values, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalNotIn(List<Integer> values) {
            addCriterion("envio_key_fec_sal not in", values, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_fec_sal between", value1, value2, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecSalNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_fec_sal not between", value1, value2, "envioKeyFecSal");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpIsNull() {
            addCriterion("envio_key_fec_retp is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpIsNotNull() {
            addCriterion("envio_key_fec_retp is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpEqualTo(Integer value) {
            addCriterion("envio_key_fec_retp =", value, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpNotEqualTo(Integer value) {
            addCriterion("envio_key_fec_retp <>", value, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpGreaterThan(Integer value) {
            addCriterion("envio_key_fec_retp >", value, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_fec_retp >=", value, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpLessThan(Integer value) {
            addCriterion("envio_key_fec_retp <", value, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_fec_retp <=", value, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpIn(List<Integer> values) {
            addCriterion("envio_key_fec_retp in", values, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpNotIn(List<Integer> values) {
            addCriterion("envio_key_fec_retp not in", values, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_fec_retp between", value1, value2, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetpNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_fec_retp not between", value1, value2, "envioKeyFecRetp");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrIsNull() {
            addCriterion("envio_key_fec_retr is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrIsNotNull() {
            addCriterion("envio_key_fec_retr is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrEqualTo(Integer value) {
            addCriterion("envio_key_fec_retr =", value, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrNotEqualTo(Integer value) {
            addCriterion("envio_key_fec_retr <>", value, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrGreaterThan(Integer value) {
            addCriterion("envio_key_fec_retr >", value, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_fec_retr >=", value, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrLessThan(Integer value) {
            addCriterion("envio_key_fec_retr <", value, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_fec_retr <=", value, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrIn(List<Integer> values) {
            addCriterion("envio_key_fec_retr in", values, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrNotIn(List<Integer> values) {
            addCriterion("envio_key_fec_retr not in", values, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_fec_retr between", value1, value2, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyFecRetrNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_fec_retr not between", value1, value2, "envioKeyFecRetr");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoIsNull() {
            addCriterion("envio_key_estado is null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoIsNotNull() {
            addCriterion("envio_key_estado is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoEqualTo(Integer value) {
            addCriterion("envio_key_estado =", value, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoNotEqualTo(Integer value) {
            addCriterion("envio_key_estado <>", value, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoGreaterThan(Integer value) {
            addCriterion("envio_key_estado >", value, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoGreaterThanOrEqualTo(Integer value) {
            addCriterion("envio_key_estado >=", value, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoLessThan(Integer value) {
            addCriterion("envio_key_estado <", value, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoLessThanOrEqualTo(Integer value) {
            addCriterion("envio_key_estado <=", value, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoIn(List<Integer> values) {
            addCriterion("envio_key_estado in", values, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoNotIn(List<Integer> values) {
            addCriterion("envio_key_estado not in", values, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_estado between", value1, value2, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioKeyEstadoNotBetween(Integer value1, Integer value2) {
            addCriterion("envio_key_estado not between", value1, value2, "envioKeyEstado");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadIsNull() {
            addCriterion("envio_ind_unidad is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadIsNotNull() {
            addCriterion("envio_ind_unidad is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadEqualTo(Short value) {
            addCriterion("envio_ind_unidad =", value, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadNotEqualTo(Short value) {
            addCriterion("envio_ind_unidad <>", value, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadGreaterThan(Short value) {
            addCriterion("envio_ind_unidad >", value, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_unidad >=", value, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadLessThan(Short value) {
            addCriterion("envio_ind_unidad <", value, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_unidad <=", value, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadIn(List<Short> values) {
            addCriterion("envio_ind_unidad in", values, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadNotIn(List<Short> values) {
            addCriterion("envio_ind_unidad not in", values, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadBetween(Short value1, Short value2) {
            addCriterion("envio_ind_unidad between", value1, value2, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndUnidadNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_unidad not between", value1, value2, "envioIndUnidad");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntIsNull() {
            addCriterion("envio_ind_ent is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntIsNotNull() {
            addCriterion("envio_ind_ent is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntEqualTo(Short value) {
            addCriterion("envio_ind_ent =", value, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntNotEqualTo(Short value) {
            addCriterion("envio_ind_ent <>", value, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntGreaterThan(Short value) {
            addCriterion("envio_ind_ent >", value, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_ent >=", value, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntLessThan(Short value) {
            addCriterion("envio_ind_ent <", value, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_ent <=", value, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntIn(List<Short> values) {
            addCriterion("envio_ind_ent in", values, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntNotIn(List<Short> values) {
            addCriterion("envio_ind_ent not in", values, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntBetween(Short value1, Short value2) {
            addCriterion("envio_ind_ent between", value1, value2, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndEntNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_ent not between", value1, value2, "envioIndEnt");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotIsNull() {
            addCriterion("envio_ind_mot is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotIsNotNull() {
            addCriterion("envio_ind_mot is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotEqualTo(Short value) {
            addCriterion("envio_ind_mot =", value, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotNotEqualTo(Short value) {
            addCriterion("envio_ind_mot <>", value, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotGreaterThan(Short value) {
            addCriterion("envio_ind_mot >", value, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_mot >=", value, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotLessThan(Short value) {
            addCriterion("envio_ind_mot <", value, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_mot <=", value, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotIn(List<Short> values) {
            addCriterion("envio_ind_mot in", values, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotNotIn(List<Short> values) {
            addCriterion("envio_ind_mot not in", values, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_mot between", value1, value2, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndMotNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_mot not between", value1, value2, "envioIndMot");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeIsNull() {
            addCriterion("envio_ind_ree is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeIsNotNull() {
            addCriterion("envio_ind_ree is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeEqualTo(Short value) {
            addCriterion("envio_ind_ree =", value, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeNotEqualTo(Short value) {
            addCriterion("envio_ind_ree <>", value, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeGreaterThan(Short value) {
            addCriterion("envio_ind_ree >", value, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_ree >=", value, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeLessThan(Short value) {
            addCriterion("envio_ind_ree <", value, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_ree <=", value, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeIn(List<Short> values) {
            addCriterion("envio_ind_ree in", values, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeNotIn(List<Short> values) {
            addCriterion("envio_ind_ree not in", values, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeBetween(Short value1, Short value2) {
            addCriterion("envio_ind_ree between", value1, value2, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndReeNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_ree not between", value1, value2, "envioIndRee");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuIsNull() {
            addCriterion("envio_ind_anu is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuIsNotNull() {
            addCriterion("envio_ind_anu is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuEqualTo(Short value) {
            addCriterion("envio_ind_anu =", value, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuNotEqualTo(Short value) {
            addCriterion("envio_ind_anu <>", value, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuGreaterThan(Short value) {
            addCriterion("envio_ind_anu >", value, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_anu >=", value, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuLessThan(Short value) {
            addCriterion("envio_ind_anu <", value, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_anu <=", value, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuIn(List<Short> values) {
            addCriterion("envio_ind_anu in", values, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuNotIn(List<Short> values) {
            addCriterion("envio_ind_anu not in", values, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuBetween(Short value1, Short value2) {
            addCriterion("envio_ind_anu between", value1, value2, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndAnuNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_anu not between", value1, value2, "envioIndAnu");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonIsNull() {
            addCriterion("envio_ind_fue_zon is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonIsNotNull() {
            addCriterion("envio_ind_fue_zon is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonEqualTo(Short value) {
            addCriterion("envio_ind_fue_zon =", value, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonNotEqualTo(Short value) {
            addCriterion("envio_ind_fue_zon <>", value, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonGreaterThan(Short value) {
            addCriterion("envio_ind_fue_zon >", value, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_fue_zon >=", value, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonLessThan(Short value) {
            addCriterion("envio_ind_fue_zon <", value, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_fue_zon <=", value, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonIn(List<Short> values) {
            addCriterion("envio_ind_fue_zon in", values, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonNotIn(List<Short> values) {
            addCriterion("envio_ind_fue_zon not in", values, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonBetween(Short value1, Short value2) {
            addCriterion("envio_ind_fue_zon between", value1, value2, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndFueZonNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_fue_zon not between", value1, value2, "envioIndFueZon");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdIsNull() {
            addCriterion("envio_ind_perd is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdIsNotNull() {
            addCriterion("envio_ind_perd is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdEqualTo(Short value) {
            addCriterion("envio_ind_perd =", value, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdNotEqualTo(Short value) {
            addCriterion("envio_ind_perd <>", value, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdGreaterThan(Short value) {
            addCriterion("envio_ind_perd >", value, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_perd >=", value, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdLessThan(Short value) {
            addCriterion("envio_ind_perd <", value, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_perd <=", value, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdIn(List<Short> values) {
            addCriterion("envio_ind_perd in", values, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdNotIn(List<Short> values) {
            addCriterion("envio_ind_perd not in", values, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdBetween(Short value1, Short value2) {
            addCriterion("envio_ind_perd between", value1, value2, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndPerdNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_perd not between", value1, value2, "envioIndPerd");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigIsNull() {
            addCriterion("envio_ind_dig is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigIsNotNull() {
            addCriterion("envio_ind_dig is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigEqualTo(Short value) {
            addCriterion("envio_ind_dig =", value, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigNotEqualTo(Short value) {
            addCriterion("envio_ind_dig <>", value, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigGreaterThan(Short value) {
            addCriterion("envio_ind_dig >", value, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_dig >=", value, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigLessThan(Short value) {
            addCriterion("envio_ind_dig <", value, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_dig <=", value, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigIn(List<Short> values) {
            addCriterion("envio_ind_dig in", values, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigNotIn(List<Short> values) {
            addCriterion("envio_ind_dig not in", values, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigBetween(Short value1, Short value2) {
            addCriterion("envio_ind_dig between", value1, value2, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndDigNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_dig not between", value1, value2, "envioIndDig");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutIsNull() {
            addCriterion("envio_ind_rut is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutIsNotNull() {
            addCriterion("envio_ind_rut is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutEqualTo(Short value) {
            addCriterion("envio_ind_rut =", value, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutNotEqualTo(Short value) {
            addCriterion("envio_ind_rut <>", value, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutGreaterThan(Short value) {
            addCriterion("envio_ind_rut >", value, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_rut >=", value, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutLessThan(Short value) {
            addCriterion("envio_ind_rut <", value, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_rut <=", value, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutIn(List<Short> values) {
            addCriterion("envio_ind_rut in", values, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutNotIn(List<Short> values) {
            addCriterion("envio_ind_rut not in", values, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutBetween(Short value1, Short value2) {
            addCriterion("envio_ind_rut between", value1, value2, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRutNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_rut not between", value1, value2, "envioIndRut");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProIsNull() {
            addCriterion("envio_ind_pro is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProIsNotNull() {
            addCriterion("envio_ind_pro is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProEqualTo(Short value) {
            addCriterion("envio_ind_pro =", value, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProNotEqualTo(Short value) {
            addCriterion("envio_ind_pro <>", value, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProGreaterThan(Short value) {
            addCriterion("envio_ind_pro >", value, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_pro >=", value, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProLessThan(Short value) {
            addCriterion("envio_ind_pro <", value, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_pro <=", value, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProIn(List<Short> values) {
            addCriterion("envio_ind_pro in", values, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProNotIn(List<Short> values) {
            addCriterion("envio_ind_pro not in", values, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProBetween(Short value1, Short value2) {
            addCriterion("envio_ind_pro between", value1, value2, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndProNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_pro not between", value1, value2, "envioIndPro");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobIsNull() {
            addCriterion("envio_ind_rob is null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobIsNotNull() {
            addCriterion("envio_ind_rob is not null");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobEqualTo(Short value) {
            addCriterion("envio_ind_rob =", value, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobNotEqualTo(Short value) {
            addCriterion("envio_ind_rob <>", value, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobGreaterThan(Short value) {
            addCriterion("envio_ind_rob >", value, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobGreaterThanOrEqualTo(Short value) {
            addCriterion("envio_ind_rob >=", value, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobLessThan(Short value) {
            addCriterion("envio_ind_rob <", value, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobLessThanOrEqualTo(Short value) {
            addCriterion("envio_ind_rob <=", value, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobIn(List<Short> values) {
            addCriterion("envio_ind_rob in", values, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobNotIn(List<Short> values) {
            addCriterion("envio_ind_rob not in", values, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobBetween(Short value1, Short value2) {
            addCriterion("envio_ind_rob between", value1, value2, "envioIndRob");
            return (Criteria) this;
        }

        public Criteria andEnvioIndRobNotBetween(Short value1, Short value2) {
            addCriterion("envio_ind_rob not between", value1, value2, "envioIndRob");
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