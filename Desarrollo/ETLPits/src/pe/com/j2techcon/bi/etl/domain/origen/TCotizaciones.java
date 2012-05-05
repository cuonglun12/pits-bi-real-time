package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.Date;

public class TCotizaciones {
    private String coserie;

    private BigDecimal conumero;

    private String rucDni;

    private String contacto;

    private String direccion;

    private String email;

    private String codpaiscontacto;

    private String ubigeo;

    private String codpostal;

    private String telefono;

    private String anexo;

    private String celular;

    private String areacontacto;

    private String codtipoentrega;

    private String cargocontacto;

    private String fax;

    private String codpaisorigen;

    private String ciudadorigen;

    private String puertoorigen;

    private String obsorigen;

    private String transporteorigen;

    private String codpaisdestino;

    private String ciudaddestino;

    private String puertodestino;

    private String transportedestino;

    private String obsdestino;

    private String obscotizacion;

    private String codnegocio;

    private String codambito;

    private String codservicio;

    private String codproducto;

    private BigDecimal peso;

    private BigDecimal pesoapox;

    private BigDecimal pesototal;

    private BigDecimal preciounitario;

    private BigDecimal preciototal;

    private BigDecimal descuento;

    private BigDecimal montoneto;

    private Integer porcentaje;

    private String moneda;

    private BigDecimal montopagar;

    private BigDecimal flete;

    private BigDecimal desaduanaje;

    private BigDecimal seguro;

    private BigDecimal comision;

    private BigDecimal cantidad;

    private BigDecimal cntposiciones;

    private BigDecimal cntunidades;

    private BigDecimal cntpersonas;

    private String unidadmedida;

    private BigDecimal largo;

    private BigDecimal ancho;

    private BigDecimal alto;

    private BigDecimal volumen;

    private BigDecimal numerodias;

    private String reserie;

    private Integer renumro;

    private String tipoproducto;

    private String rutaimagen;

    private String producto;

    private String obsproducto;

    private String codencuesta;

    private String imo;

    private String umm;

    private String serie;

    private String orden;

    private Short estado;

    private String empresa;

    private String usuario;

    private Date fecha;

    private String usuariomod;

    private Date fechamod;

    private String motivoanulacion;

    private String codcliente;

    private String codareacliente;

    private Short tipocotizacion;

    private Date fechaanula;

    private String usuarioanula;

    private String usuarioaprueba;

    private Date fechaaprueba;

    private String codzona;

    private String subservicios;

    private String pplano;

    private String preal;

    private String codDestino;

    private String tTransporte;

    private BigDecimal preciokadic;

    private BigDecimal preciokadicPlano;

    private Integer kgBase;

    private BigDecimal kgRecojo;

    private BigDecimal kgAdicionalRecojo;

    private String recojo;

    private String ubigeoOrigen;

    private String ubigeoDestino;

    private String codunidad;

    private String desServicio;

    private String zonal;

    public String getCoserie() {
        return coserie;
    }

    public void setCoserie(String coserie) {
        this.coserie = coserie == null ? null : coserie.trim();
    }

    public BigDecimal getConumero() {
        return conumero;
    }

    public void setConumero(BigDecimal conumero) {
        this.conumero = conumero;
    }

    public String getRucDni() {
        return rucDni;
    }

    public void setRucDni(String rucDni) {
        this.rucDni = rucDni == null ? null : rucDni.trim();
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto == null ? null : contacto.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion == null ? null : direccion.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCodpaiscontacto() {
        return codpaiscontacto;
    }

    public void setCodpaiscontacto(String codpaiscontacto) {
        this.codpaiscontacto = codpaiscontacto == null ? null : codpaiscontacto.trim();
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo == null ? null : ubigeo.trim();
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal == null ? null : codpostal.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono == null ? null : telefono.trim();
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo == null ? null : anexo.trim();
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular == null ? null : celular.trim();
    }

    public String getAreacontacto() {
        return areacontacto;
    }

    public void setAreacontacto(String areacontacto) {
        this.areacontacto = areacontacto == null ? null : areacontacto.trim();
    }

    public String getCodtipoentrega() {
        return codtipoentrega;
    }

    public void setCodtipoentrega(String codtipoentrega) {
        this.codtipoentrega = codtipoentrega == null ? null : codtipoentrega.trim();
    }

    public String getCargocontacto() {
        return cargocontacto;
    }

    public void setCargocontacto(String cargocontacto) {
        this.cargocontacto = cargocontacto == null ? null : cargocontacto.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getCodpaisorigen() {
        return codpaisorigen;
    }

    public void setCodpaisorigen(String codpaisorigen) {
        this.codpaisorigen = codpaisorigen == null ? null : codpaisorigen.trim();
    }

    public String getCiudadorigen() {
        return ciudadorigen;
    }

    public void setCiudadorigen(String ciudadorigen) {
        this.ciudadorigen = ciudadorigen == null ? null : ciudadorigen.trim();
    }

    public String getPuertoorigen() {
        return puertoorigen;
    }

    public void setPuertoorigen(String puertoorigen) {
        this.puertoorigen = puertoorigen == null ? null : puertoorigen.trim();
    }

    public String getObsorigen() {
        return obsorigen;
    }

    public void setObsorigen(String obsorigen) {
        this.obsorigen = obsorigen == null ? null : obsorigen.trim();
    }

    public String getTransporteorigen() {
        return transporteorigen;
    }

    public void setTransporteorigen(String transporteorigen) {
        this.transporteorigen = transporteorigen == null ? null : transporteorigen.trim();
    }

    public String getCodpaisdestino() {
        return codpaisdestino;
    }

    public void setCodpaisdestino(String codpaisdestino) {
        this.codpaisdestino = codpaisdestino == null ? null : codpaisdestino.trim();
    }

    public String getCiudaddestino() {
        return ciudaddestino;
    }

    public void setCiudaddestino(String ciudaddestino) {
        this.ciudaddestino = ciudaddestino == null ? null : ciudaddestino.trim();
    }

    public String getPuertodestino() {
        return puertodestino;
    }

    public void setPuertodestino(String puertodestino) {
        this.puertodestino = puertodestino == null ? null : puertodestino.trim();
    }

    public String getTransportedestino() {
        return transportedestino;
    }

    public void setTransportedestino(String transportedestino) {
        this.transportedestino = transportedestino == null ? null : transportedestino.trim();
    }

    public String getObsdestino() {
        return obsdestino;
    }

    public void setObsdestino(String obsdestino) {
        this.obsdestino = obsdestino == null ? null : obsdestino.trim();
    }

    public String getObscotizacion() {
        return obscotizacion;
    }

    public void setObscotizacion(String obscotizacion) {
        this.obscotizacion = obscotizacion == null ? null : obscotizacion.trim();
    }

    public String getCodnegocio() {
        return codnegocio;
    }

    public void setCodnegocio(String codnegocio) {
        this.codnegocio = codnegocio == null ? null : codnegocio.trim();
    }

    public String getCodambito() {
        return codambito;
    }

    public void setCodambito(String codambito) {
        this.codambito = codambito == null ? null : codambito.trim();
    }

    public String getCodservicio() {
        return codservicio;
    }

    public void setCodservicio(String codservicio) {
        this.codservicio = codservicio == null ? null : codservicio.trim();
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto == null ? null : codproducto.trim();
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getPesoapox() {
        return pesoapox;
    }

    public void setPesoapox(BigDecimal pesoapox) {
        this.pesoapox = pesoapox;
    }

    public BigDecimal getPesototal() {
        return pesototal;
    }

    public void setPesototal(BigDecimal pesototal) {
        this.pesototal = pesototal;
    }

    public BigDecimal getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    public BigDecimal getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(BigDecimal preciototal) {
        this.preciototal = preciototal;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getMontoneto() {
        return montoneto;
    }

    public void setMontoneto(BigDecimal montoneto) {
        this.montoneto = montoneto;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda == null ? null : moneda.trim();
    }

    public BigDecimal getMontopagar() {
        return montopagar;
    }

    public void setMontopagar(BigDecimal montopagar) {
        this.montopagar = montopagar;
    }

    public BigDecimal getFlete() {
        return flete;
    }

    public void setFlete(BigDecimal flete) {
        this.flete = flete;
    }

    public BigDecimal getDesaduanaje() {
        return desaduanaje;
    }

    public void setDesaduanaje(BigDecimal desaduanaje) {
        this.desaduanaje = desaduanaje;
    }

    public BigDecimal getSeguro() {
        return seguro;
    }

    public void setSeguro(BigDecimal seguro) {
        this.seguro = seguro;
    }

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCntposiciones() {
        return cntposiciones;
    }

    public void setCntposiciones(BigDecimal cntposiciones) {
        this.cntposiciones = cntposiciones;
    }

    public BigDecimal getCntunidades() {
        return cntunidades;
    }

    public void setCntunidades(BigDecimal cntunidades) {
        this.cntunidades = cntunidades;
    }

    public BigDecimal getCntpersonas() {
        return cntpersonas;
    }

    public void setCntpersonas(BigDecimal cntpersonas) {
        this.cntpersonas = cntpersonas;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida == null ? null : unidadmedida.trim();
    }

    public BigDecimal getLargo() {
        return largo;
    }

    public void setLargo(BigDecimal largo) {
        this.largo = largo;
    }

    public BigDecimal getAncho() {
        return ancho;
    }

    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    public BigDecimal getAlto() {
        return alto;
    }

    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }

    public BigDecimal getVolumen() {
        return volumen;
    }

    public void setVolumen(BigDecimal volumen) {
        this.volumen = volumen;
    }

    public BigDecimal getNumerodias() {
        return numerodias;
    }

    public void setNumerodias(BigDecimal numerodias) {
        this.numerodias = numerodias;
    }

    public String getReserie() {
        return reserie;
    }

    public void setReserie(String reserie) {
        this.reserie = reserie == null ? null : reserie.trim();
    }

    public Integer getRenumro() {
        return renumro;
    }

    public void setRenumro(Integer renumro) {
        this.renumro = renumro;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto == null ? null : tipoproducto.trim();
    }

    public String getRutaimagen() {
        return rutaimagen;
    }

    public void setRutaimagen(String rutaimagen) {
        this.rutaimagen = rutaimagen == null ? null : rutaimagen.trim();
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto == null ? null : producto.trim();
    }

    public String getObsproducto() {
        return obsproducto;
    }

    public void setObsproducto(String obsproducto) {
        this.obsproducto = obsproducto == null ? null : obsproducto.trim();
    }

    public String getCodencuesta() {
        return codencuesta;
    }

    public void setCodencuesta(String codencuesta) {
        this.codencuesta = codencuesta == null ? null : codencuesta.trim();
    }

    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo == null ? null : imo.trim();
    }

    public String getUmm() {
        return umm;
    }

    public void setUmm(String umm) {
        this.umm = umm == null ? null : umm.trim();
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie == null ? null : serie.trim();
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden == null ? null : orden.trim();
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa == null ? null : empresa.trim();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario == null ? null : usuario.trim();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod == null ? null : usuariomod.trim();
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    public String getMotivoanulacion() {
        return motivoanulacion;
    }

    public void setMotivoanulacion(String motivoanulacion) {
        this.motivoanulacion = motivoanulacion == null ? null : motivoanulacion.trim();
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente == null ? null : codcliente.trim();
    }

    public String getCodareacliente() {
        return codareacliente;
    }

    public void setCodareacliente(String codareacliente) {
        this.codareacliente = codareacliente == null ? null : codareacliente.trim();
    }

    public Short getTipocotizacion() {
        return tipocotizacion;
    }

    public void setTipocotizacion(Short tipocotizacion) {
        this.tipocotizacion = tipocotizacion;
    }

    public Date getFechaanula() {
        return fechaanula;
    }

    public void setFechaanula(Date fechaanula) {
        this.fechaanula = fechaanula;
    }

    public String getUsuarioanula() {
        return usuarioanula;
    }

    public void setUsuarioanula(String usuarioanula) {
        this.usuarioanula = usuarioanula == null ? null : usuarioanula.trim();
    }

    public String getUsuarioaprueba() {
        return usuarioaprueba;
    }

    public void setUsuarioaprueba(String usuarioaprueba) {
        this.usuarioaprueba = usuarioaprueba == null ? null : usuarioaprueba.trim();
    }

    public Date getFechaaprueba() {
        return fechaaprueba;
    }

    public void setFechaaprueba(Date fechaaprueba) {
        this.fechaaprueba = fechaaprueba;
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona == null ? null : codzona.trim();
    }

    public String getSubservicios() {
        return subservicios;
    }

    public void setSubservicios(String subservicios) {
        this.subservicios = subservicios == null ? null : subservicios.trim();
    }

    public String getPplano() {
        return pplano;
    }

    public void setPplano(String pplano) {
        this.pplano = pplano == null ? null : pplano.trim();
    }

    public String getPreal() {
        return preal;
    }

    public void setPreal(String preal) {
        this.preal = preal == null ? null : preal.trim();
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino == null ? null : codDestino.trim();
    }

    public String gettTransporte() {
        return tTransporte;
    }

    public void settTransporte(String tTransporte) {
        this.tTransporte = tTransporte == null ? null : tTransporte.trim();
    }

    public BigDecimal getPreciokadic() {
        return preciokadic;
    }

    public void setPreciokadic(BigDecimal preciokadic) {
        this.preciokadic = preciokadic;
    }

    public BigDecimal getPreciokadicPlano() {
        return preciokadicPlano;
    }

    public void setPreciokadicPlano(BigDecimal preciokadicPlano) {
        this.preciokadicPlano = preciokadicPlano;
    }

    public Integer getKgBase() {
        return kgBase;
    }

    public void setKgBase(Integer kgBase) {
        this.kgBase = kgBase;
    }

    public BigDecimal getKgRecojo() {
        return kgRecojo;
    }

    public void setKgRecojo(BigDecimal kgRecojo) {
        this.kgRecojo = kgRecojo;
    }

    public BigDecimal getKgAdicionalRecojo() {
        return kgAdicionalRecojo;
    }

    public void setKgAdicionalRecojo(BigDecimal kgAdicionalRecojo) {
        this.kgAdicionalRecojo = kgAdicionalRecojo;
    }

    public String getRecojo() {
        return recojo;
    }

    public void setRecojo(String recojo) {
        this.recojo = recojo == null ? null : recojo.trim();
    }

    public String getUbigeoOrigen() {
        return ubigeoOrigen;
    }

    public void setUbigeoOrigen(String ubigeoOrigen) {
        this.ubigeoOrigen = ubigeoOrigen == null ? null : ubigeoOrigen.trim();
    }

    public String getUbigeoDestino() {
        return ubigeoDestino;
    }

    public void setUbigeoDestino(String ubigeoDestino) {
        this.ubigeoDestino = ubigeoDestino == null ? null : ubigeoDestino.trim();
    }

    public String getCodunidad() {
        return codunidad;
    }

    public void setCodunidad(String codunidad) {
        this.codunidad = codunidad == null ? null : codunidad.trim();
    }

    public String getDesServicio() {
        return desServicio;
    }

    public void setDesServicio(String desServicio) {
        this.desServicio = desServicio == null ? null : desServicio.trim();
    }

    public String getZonal() {
        return zonal;
    }

    public void setZonal(String zonal) {
        this.zonal = zonal == null ? null : zonal.trim();
    }
}