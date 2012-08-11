package pe.com.j2techcon.bi.etl.domain.origen;

import java.math.BigDecimal;
import java.util.Date;

public class Detordenes {
    private String serie;

    private String orden;

    private String correlativo;

    private String tipoingreso;

    private String userDigitacion;

    private String preorden;

    private String codcliente;

    private String codareacliente;

    private String empresa;

    private String llaveempresa;

    private String destinatario;

    private String llavedestina;

    private String cargo;

    private String direccion;

    private String distrito;

    private String referencia;

    private String codpostal;

    private String ubigeo;

    private String codzona;

    private String cuadrante;

    private String nuevadireccion;

    private String nuevareferencia;

    private String nuevocodpostal;

    private String nuevoubigeo;

    private String llave;

    private String codigo;

    private String codigo1;

    private String codigo2;

    private String codigo3;

    private String codigo4;

    private String codigo5;

    private String codigo6;

    private String codestado;

    private String codmotivo;

    private String codestadodesc;

    private String codmotivodesc;

    private String codestadoant;

    private String codmotivoant;

    private String codestadocli;

    private String codmotivocli;

    private Date fecDigitacion;

    private Date horaDigitacion;

    private String userDigitacionmod;

    private Date fecDigitacionmod;

    private Date horaDigitacionmod;

    private String userDescargo;

    private Date fecDescargo;

    private Date fecrecepcion;

    private Integer torre;

    private String nroguia;

    private Short ajuste;

    private Short liquidado;

    private String nroliquidacion;

    private String recepcion;

    private String recepcionDni;

    private String parentesco;

    private String colorcasa;

    private String puerta;

    private String nropisos;

    private String suministro;

    private String telefono;

    private String ventana;

    private String tipoviv;

    private String vecinoizq;

    private String vecinoder;

    private String material;

    private String estadoviv;

    private String rejacolor;

    private String locald;

    private String imagen;

    private String userScaneo;

    private Date fecScaneo;

    private Integer sesionscaneo;

    private Short tiposcaneo;

    private BigDecimal monto;

    private String oficina;

    private String moneda;

    private String coordinado;

    private Date fechaCoor;

    private String userCoor;

    private String observacion;

    private Integer nropiezas;

    private BigDecimal peso;

    private BigDecimal pesoreal;

    private String cargoagente;

    private Integer nrocargoagente;

    private String codenvio;

    private BigDecimal ancho;

    private BigDecimal largo;

    private BigDecimal alto;

    private BigDecimal vbase;

    private BigDecimal vexceso;

    private Short bloqueo;

    private String ruc;

    private String dni;

    private Short flagdescargo;

    private String nuevodistrito;

    private String serieliquidacion;

    private String serieguia;

    private String userCuadre;

    private Date fechaCuadre;

    private String estCuadre;

    private String flagCoor;

    private String useruarioCoor;

    private Date fechaCoordinacion;

    private String serieguiasol;

    private String nroguiasol;

    private String imagenFtp;

    private String usuarioFtp;

    private Date fechaFtp;

    private String usuarioWs;

    private String usuarioCoordina;

    private Date fechaCoordina;

    private Date biFecNumCam;

    private String biCodIndCam;

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

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo == null ? null : correlativo.trim();
    }

    public String getTipoingreso() {
        return tipoingreso;
    }

    public void setTipoingreso(String tipoingreso) {
        this.tipoingreso = tipoingreso == null ? null : tipoingreso.trim();
    }

    public String getUserDigitacion() {
        return userDigitacion;
    }

    public void setUserDigitacion(String userDigitacion) {
        this.userDigitacion = userDigitacion == null ? null : userDigitacion.trim();
    }

    public String getPreorden() {
        return preorden;
    }

    public void setPreorden(String preorden) {
        this.preorden = preorden == null ? null : preorden.trim();
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa == null ? null : empresa.trim();
    }

    public String getLlaveempresa() {
        return llaveempresa;
    }

    public void setLlaveempresa(String llaveempresa) {
        this.llaveempresa = llaveempresa == null ? null : llaveempresa.trim();
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario == null ? null : destinatario.trim();
    }

    public String getLlavedestina() {
        return llavedestina;
    }

    public void setLlavedestina(String llavedestina) {
        this.llavedestina = llavedestina == null ? null : llavedestina.trim();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo == null ? null : cargo.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion == null ? null : direccion.trim();
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito == null ? null : distrito.trim();
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia == null ? null : referencia.trim();
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal == null ? null : codpostal.trim();
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo == null ? null : ubigeo.trim();
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona == null ? null : codzona.trim();
    }

    public String getCuadrante() {
        return cuadrante;
    }

    public void setCuadrante(String cuadrante) {
        this.cuadrante = cuadrante == null ? null : cuadrante.trim();
    }

    public String getNuevadireccion() {
        return nuevadireccion;
    }

    public void setNuevadireccion(String nuevadireccion) {
        this.nuevadireccion = nuevadireccion == null ? null : nuevadireccion.trim();
    }

    public String getNuevareferencia() {
        return nuevareferencia;
    }

    public void setNuevareferencia(String nuevareferencia) {
        this.nuevareferencia = nuevareferencia == null ? null : nuevareferencia.trim();
    }

    public String getNuevocodpostal() {
        return nuevocodpostal;
    }

    public void setNuevocodpostal(String nuevocodpostal) {
        this.nuevocodpostal = nuevocodpostal == null ? null : nuevocodpostal.trim();
    }

    public String getNuevoubigeo() {
        return nuevoubigeo;
    }

    public void setNuevoubigeo(String nuevoubigeo) {
        this.nuevoubigeo = nuevoubigeo == null ? null : nuevoubigeo.trim();
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave == null ? null : llave.trim();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo == null ? null : codigo.trim();
    }

    public String getCodigo1() {
        return codigo1;
    }

    public void setCodigo1(String codigo1) {
        this.codigo1 = codigo1 == null ? null : codigo1.trim();
    }

    public String getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2 == null ? null : codigo2.trim();
    }

    public String getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3 == null ? null : codigo3.trim();
    }

    public String getCodigo4() {
        return codigo4;
    }

    public void setCodigo4(String codigo4) {
        this.codigo4 = codigo4 == null ? null : codigo4.trim();
    }

    public String getCodigo5() {
        return codigo5;
    }

    public void setCodigo5(String codigo5) {
        this.codigo5 = codigo5 == null ? null : codigo5.trim();
    }

    public String getCodigo6() {
        return codigo6;
    }

    public void setCodigo6(String codigo6) {
        this.codigo6 = codigo6 == null ? null : codigo6.trim();
    }

    public String getCodestado() {
        return codestado;
    }

    public void setCodestado(String codestado) {
        this.codestado = codestado == null ? null : codestado.trim();
    }

    public String getCodmotivo() {
        return codmotivo;
    }

    public void setCodmotivo(String codmotivo) {
        this.codmotivo = codmotivo == null ? null : codmotivo.trim();
    }

    public String getCodestadodesc() {
        return codestadodesc;
    }

    public void setCodestadodesc(String codestadodesc) {
        this.codestadodesc = codestadodesc == null ? null : codestadodesc.trim();
    }

    public String getCodmotivodesc() {
        return codmotivodesc;
    }

    public void setCodmotivodesc(String codmotivodesc) {
        this.codmotivodesc = codmotivodesc == null ? null : codmotivodesc.trim();
    }

    public String getCodestadoant() {
        return codestadoant;
    }

    public void setCodestadoant(String codestadoant) {
        this.codestadoant = codestadoant == null ? null : codestadoant.trim();
    }

    public String getCodmotivoant() {
        return codmotivoant;
    }

    public void setCodmotivoant(String codmotivoant) {
        this.codmotivoant = codmotivoant == null ? null : codmotivoant.trim();
    }

    public String getCodestadocli() {
        return codestadocli;
    }

    public void setCodestadocli(String codestadocli) {
        this.codestadocli = codestadocli == null ? null : codestadocli.trim();
    }

    public String getCodmotivocli() {
        return codmotivocli;
    }

    public void setCodmotivocli(String codmotivocli) {
        this.codmotivocli = codmotivocli == null ? null : codmotivocli.trim();
    }

    public Date getFecDigitacion() {
        return fecDigitacion;
    }

    public void setFecDigitacion(Date fecDigitacion) {
        this.fecDigitacion = fecDigitacion;
    }

    public Date getHoraDigitacion() {
        return horaDigitacion;
    }

    public void setHoraDigitacion(Date horaDigitacion) {
        this.horaDigitacion = horaDigitacion;
    }

    public String getUserDigitacionmod() {
        return userDigitacionmod;
    }

    public void setUserDigitacionmod(String userDigitacionmod) {
        this.userDigitacionmod = userDigitacionmod == null ? null : userDigitacionmod.trim();
    }

    public Date getFecDigitacionmod() {
        return fecDigitacionmod;
    }

    public void setFecDigitacionmod(Date fecDigitacionmod) {
        this.fecDigitacionmod = fecDigitacionmod;
    }

    public Date getHoraDigitacionmod() {
        return horaDigitacionmod;
    }

    public void setHoraDigitacionmod(Date horaDigitacionmod) {
        this.horaDigitacionmod = horaDigitacionmod;
    }

    public String getUserDescargo() {
        return userDescargo;
    }

    public void setUserDescargo(String userDescargo) {
        this.userDescargo = userDescargo == null ? null : userDescargo.trim();
    }

    public Date getFecDescargo() {
        return fecDescargo;
    }

    public void setFecDescargo(Date fecDescargo) {
        this.fecDescargo = fecDescargo;
    }

    public Date getFecrecepcion() {
        return fecrecepcion;
    }

    public void setFecrecepcion(Date fecrecepcion) {
        this.fecrecepcion = fecrecepcion;
    }

    public Integer getTorre() {
        return torre;
    }

    public void setTorre(Integer torre) {
        this.torre = torre;
    }

    public String getNroguia() {
        return nroguia;
    }

    public void setNroguia(String nroguia) {
        this.nroguia = nroguia == null ? null : nroguia.trim();
    }

    public Short getAjuste() {
        return ajuste;
    }

    public void setAjuste(Short ajuste) {
        this.ajuste = ajuste;
    }

    public Short getLiquidado() {
        return liquidado;
    }

    public void setLiquidado(Short liquidado) {
        this.liquidado = liquidado;
    }

    public String getNroliquidacion() {
        return nroliquidacion;
    }

    public void setNroliquidacion(String nroliquidacion) {
        this.nroliquidacion = nroliquidacion == null ? null : nroliquidacion.trim();
    }

    public String getRecepcion() {
        return recepcion;
    }

    public void setRecepcion(String recepcion) {
        this.recepcion = recepcion == null ? null : recepcion.trim();
    }

    public String getRecepcionDni() {
        return recepcionDni;
    }

    public void setRecepcionDni(String recepcionDni) {
        this.recepcionDni = recepcionDni == null ? null : recepcionDni.trim();
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco == null ? null : parentesco.trim();
    }

    public String getColorcasa() {
        return colorcasa;
    }

    public void setColorcasa(String colorcasa) {
        this.colorcasa = colorcasa == null ? null : colorcasa.trim();
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta == null ? null : puerta.trim();
    }

    public String getNropisos() {
        return nropisos;
    }

    public void setNropisos(String nropisos) {
        this.nropisos = nropisos == null ? null : nropisos.trim();
    }

    public String getSuministro() {
        return suministro;
    }

    public void setSuministro(String suministro) {
        this.suministro = suministro == null ? null : suministro.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono == null ? null : telefono.trim();
    }

    public String getVentana() {
        return ventana;
    }

    public void setVentana(String ventana) {
        this.ventana = ventana == null ? null : ventana.trim();
    }

    public String getTipoviv() {
        return tipoviv;
    }

    public void setTipoviv(String tipoviv) {
        this.tipoviv = tipoviv == null ? null : tipoviv.trim();
    }

    public String getVecinoizq() {
        return vecinoizq;
    }

    public void setVecinoizq(String vecinoizq) {
        this.vecinoizq = vecinoizq == null ? null : vecinoizq.trim();
    }

    public String getVecinoder() {
        return vecinoder;
    }

    public void setVecinoder(String vecinoder) {
        this.vecinoder = vecinoder == null ? null : vecinoder.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getEstadoviv() {
        return estadoviv;
    }

    public void setEstadoviv(String estadoviv) {
        this.estadoviv = estadoviv == null ? null : estadoviv.trim();
    }

    public String getRejacolor() {
        return rejacolor;
    }

    public void setRejacolor(String rejacolor) {
        this.rejacolor = rejacolor == null ? null : rejacolor.trim();
    }

    public String getLocald() {
        return locald;
    }

    public void setLocald(String locald) {
        this.locald = locald == null ? null : locald.trim();
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen == null ? null : imagen.trim();
    }

    public String getUserScaneo() {
        return userScaneo;
    }

    public void setUserScaneo(String userScaneo) {
        this.userScaneo = userScaneo == null ? null : userScaneo.trim();
    }

    public Date getFecScaneo() {
        return fecScaneo;
    }

    public void setFecScaneo(Date fecScaneo) {
        this.fecScaneo = fecScaneo;
    }

    public Integer getSesionscaneo() {
        return sesionscaneo;
    }

    public void setSesionscaneo(Integer sesionscaneo) {
        this.sesionscaneo = sesionscaneo;
    }

    public Short getTiposcaneo() {
        return tiposcaneo;
    }

    public void setTiposcaneo(Short tiposcaneo) {
        this.tiposcaneo = tiposcaneo;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina == null ? null : oficina.trim();
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda == null ? null : moneda.trim();
    }

    public String getCoordinado() {
        return coordinado;
    }

    public void setCoordinado(String coordinado) {
        this.coordinado = coordinado == null ? null : coordinado.trim();
    }

    public Date getFechaCoor() {
        return fechaCoor;
    }

    public void setFechaCoor(Date fechaCoor) {
        this.fechaCoor = fechaCoor;
    }

    public String getUserCoor() {
        return userCoor;
    }

    public void setUserCoor(String userCoor) {
        this.userCoor = userCoor == null ? null : userCoor.trim();
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion == null ? null : observacion.trim();
    }

    public Integer getNropiezas() {
        return nropiezas;
    }

    public void setNropiezas(Integer nropiezas) {
        this.nropiezas = nropiezas;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getPesoreal() {
        return pesoreal;
    }

    public void setPesoreal(BigDecimal pesoreal) {
        this.pesoreal = pesoreal;
    }

    public String getCargoagente() {
        return cargoagente;
    }

    public void setCargoagente(String cargoagente) {
        this.cargoagente = cargoagente == null ? null : cargoagente.trim();
    }

    public Integer getNrocargoagente() {
        return nrocargoagente;
    }

    public void setNrocargoagente(Integer nrocargoagente) {
        this.nrocargoagente = nrocargoagente;
    }

    public String getCodenvio() {
        return codenvio;
    }

    public void setCodenvio(String codenvio) {
        this.codenvio = codenvio == null ? null : codenvio.trim();
    }

    public BigDecimal getAncho() {
        return ancho;
    }

    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    public BigDecimal getLargo() {
        return largo;
    }

    public void setLargo(BigDecimal largo) {
        this.largo = largo;
    }

    public BigDecimal getAlto() {
        return alto;
    }

    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }

    public BigDecimal getVbase() {
        return vbase;
    }

    public void setVbase(BigDecimal vbase) {
        this.vbase = vbase;
    }

    public BigDecimal getVexceso() {
        return vexceso;
    }

    public void setVexceso(BigDecimal vexceso) {
        this.vexceso = vexceso;
    }

    public Short getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(Short bloqueo) {
        this.bloqueo = bloqueo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc == null ? null : ruc.trim();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni == null ? null : dni.trim();
    }

    public Short getFlagdescargo() {
        return flagdescargo;
    }

    public void setFlagdescargo(Short flagdescargo) {
        this.flagdescargo = flagdescargo;
    }

    public String getNuevodistrito() {
        return nuevodistrito;
    }

    public void setNuevodistrito(String nuevodistrito) {
        this.nuevodistrito = nuevodistrito == null ? null : nuevodistrito.trim();
    }

    public String getSerieliquidacion() {
        return serieliquidacion;
    }

    public void setSerieliquidacion(String serieliquidacion) {
        this.serieliquidacion = serieliquidacion == null ? null : serieliquidacion.trim();
    }

    public String getSerieguia() {
        return serieguia;
    }

    public void setSerieguia(String serieguia) {
        this.serieguia = serieguia == null ? null : serieguia.trim();
    }

    public String getUserCuadre() {
        return userCuadre;
    }

    public void setUserCuadre(String userCuadre) {
        this.userCuadre = userCuadre == null ? null : userCuadre.trim();
    }

    public Date getFechaCuadre() {
        return fechaCuadre;
    }

    public void setFechaCuadre(Date fechaCuadre) {
        this.fechaCuadre = fechaCuadre;
    }

    public String getEstCuadre() {
        return estCuadre;
    }

    public void setEstCuadre(String estCuadre) {
        this.estCuadre = estCuadre == null ? null : estCuadre.trim();
    }

    public String getFlagCoor() {
        return flagCoor;
    }

    public void setFlagCoor(String flagCoor) {
        this.flagCoor = flagCoor == null ? null : flagCoor.trim();
    }

    public String getUseruarioCoor() {
        return useruarioCoor;
    }

    public void setUseruarioCoor(String useruarioCoor) {
        this.useruarioCoor = useruarioCoor == null ? null : useruarioCoor.trim();
    }

    public Date getFechaCoordinacion() {
        return fechaCoordinacion;
    }

    public void setFechaCoordinacion(Date fechaCoordinacion) {
        this.fechaCoordinacion = fechaCoordinacion;
    }

    public String getSerieguiasol() {
        return serieguiasol;
    }

    public void setSerieguiasol(String serieguiasol) {
        this.serieguiasol = serieguiasol == null ? null : serieguiasol.trim();
    }

    public String getNroguiasol() {
        return nroguiasol;
    }

    public void setNroguiasol(String nroguiasol) {
        this.nroguiasol = nroguiasol == null ? null : nroguiasol.trim();
    }

    public String getImagenFtp() {
        return imagenFtp;
    }

    public void setImagenFtp(String imagenFtp) {
        this.imagenFtp = imagenFtp == null ? null : imagenFtp.trim();
    }

    public String getUsuarioFtp() {
        return usuarioFtp;
    }

    public void setUsuarioFtp(String usuarioFtp) {
        this.usuarioFtp = usuarioFtp == null ? null : usuarioFtp.trim();
    }

    public Date getFechaFtp() {
        return fechaFtp;
    }

    public void setFechaFtp(Date fechaFtp) {
        this.fechaFtp = fechaFtp;
    }

    public String getUsuarioWs() {
        return usuarioWs;
    }

    public void setUsuarioWs(String usuarioWs) {
        this.usuarioWs = usuarioWs == null ? null : usuarioWs.trim();
    }

    public String getUsuarioCoordina() {
        return usuarioCoordina;
    }

    public void setUsuarioCoordina(String usuarioCoordina) {
        this.usuarioCoordina = usuarioCoordina == null ? null : usuarioCoordina.trim();
    }

    public Date getFechaCoordina() {
        return fechaCoordina;
    }

    public void setFechaCoordina(Date fechaCoordina) {
        this.fechaCoordina = fechaCoordina;
    }

    public Date getBiFecNumCam() {
        return biFecNumCam;
    }

    public void setBiFecNumCam(Date biFecNumCam) {
        this.biFecNumCam = biFecNumCam;
    }

    public String getBiCodIndCam() {
        return biCodIndCam;
    }

    public void setBiCodIndCam(String biCodIndCam) {
        this.biCodIndCam = biCodIndCam == null ? null : biCodIndCam.trim();
    }
    
    public void clear(){
    	serie=null;
    	orden=null;
    	correlativo=null;
    	tipoingreso=null;
    	userDigitacion=null;
    	preorden=null;
    	codcliente=null;
    	codareacliente=null;
    	empresa=null;
    	llaveempresa=null;
    	destinatario=null;
    	llavedestina=null;
    	cargo=null;
    	direccion=null;
    	distrito=null;
    	referencia=null;
    	codpostal=null;
    	ubigeo=null;
    	codzona=null;
    	cuadrante=null;
    	nuevadireccion=null;
    	nuevareferencia=null;
    	nuevocodpostal=null;
    	nuevoubigeo=null;
    	llave=null;
    	codigo=null;
    	codigo1=null;
    	codigo2=null;
    	codigo3=null;
    	codigo4=null;
    	codigo5=null;
    	codigo6=null;
    	codestado=null;
    	codmotivo=null;
    	codestadodesc=null;
    	codmotivodesc=null;
    	codestadoant=null;
    	codmotivoant=null;
    	codestadocli=null;
    	codmotivocli=null;
    	fecDigitacion=null;
    	horaDigitacion=null;
    	userDigitacionmod=null;
    	fecDigitacionmod=null;
    	horaDigitacionmod=null;
    	userDescargo=null;
    	fecDescargo=null;
    	fecrecepcion=null;
    	torre=null;
    	nroguia=null;
    	ajuste=null;
    	liquidado=null;
    	nroliquidacion=null;
    	recepcion=null;
    	recepcionDni=null;
    	parentesco=null;
    	colorcasa=null;
    	puerta=null;
    	nropisos=null;
    	suministro=null;
    	telefono=null;
    	ventana=null;
    	tipoviv=null;
    	vecinoizq=null;
    	vecinoder=null;
    	material=null;
    	estadoviv=null;
    	rejacolor=null;
    	locald=null;
    	imagen=null;
    	userScaneo=null;
    	fecScaneo=null;
    	sesionscaneo=null;
    	tiposcaneo=null;
    	monto=null;
    	oficina=null;
    	moneda=null;
    	coordinado=null;
    	fechaCoor=null;
    	userCoor=null;
    	observacion=null;
    	nropiezas=null;
    	peso=null;
    	pesoreal=null;
    	cargoagente=null;
    	nrocargoagente=null;
    	codenvio=null;
    	ancho=null;
    	largo=null;
    	alto=null;
    	vbase=null;
    	vexceso=null;
    	bloqueo=null;
    	ruc=null;
    	dni=null;
    	flagdescargo=null;
    	nuevodistrito=null;
    	serieliquidacion=null;
    	serieguia=null;
    	userCuadre=null;
    	fechaCuadre=null;
    	estCuadre=null;
    	flagCoor=null;
    	useruarioCoor=null;
    	fechaCoordinacion=null;
    	serieguiasol=null;
    	nroguiasol=null;
    	imagenFtp=null;
    	usuarioFtp=null;
    	fechaFtp=null;
    	usuarioWs=null;
    	usuarioCoordina=null;
    	fechaCoordina=null;
    	biFecNumCam=null;
    	biCodIndCam=null;
    }

	@Override
	public String toString() {
		return "Detordenes [serie=" + serie + ", orden=" + orden
				+ ", correlativo=" + correlativo + ", tipoingreso="
				+ tipoingreso + ", userDigitacion=" + userDigitacion
				+ ", preorden=" + preorden + ", codcliente=" + codcliente
				+ ", codareacliente=" + codareacliente + ", empresa=" + empresa
				+ ", llaveempresa=" + llaveempresa + ", destinatario="
				+ destinatario + ", llavedestina=" + llavedestina + ", cargo="
				+ cargo + ", direccion=" + direccion + ", distrito=" + distrito
				+ ", referencia=" + referencia + ", codpostal=" + codpostal
				+ ", ubigeo=" + ubigeo + ", codzona=" + codzona
				+ ", cuadrante=" + cuadrante + ", nuevadireccion="
				+ nuevadireccion + ", nuevareferencia=" + nuevareferencia
				+ ", nuevocodpostal=" + nuevocodpostal + ", nuevoubigeo="
				+ nuevoubigeo + ", llave=" + llave + ", codigo=" + codigo
				+ ", codigo1=" + codigo1 + ", codigo2=" + codigo2
				+ ", codigo3=" + codigo3 + ", codigo4=" + codigo4
				+ ", codigo5=" + codigo5 + ", codigo6=" + codigo6
				+ ", codestado=" + codestado + ", codmotivo=" + codmotivo
				+ ", codestadodesc=" + codestadodesc + ", codmotivodesc="
				+ codmotivodesc + ", codestadoant=" + codestadoant
				+ ", codmotivoant=" + codmotivoant + ", codestadocli="
				+ codestadocli + ", codmotivocli=" + codmotivocli
				+ ", fecDigitacion=" + fecDigitacion + ", horaDigitacion="
				+ horaDigitacion + ", userDigitacionmod=" + userDigitacionmod
				+ ", fecDigitacionmod=" + fecDigitacionmod
				+ ", horaDigitacionmod=" + horaDigitacionmod
				+ ", userDescargo=" + userDescargo + ", fecDescargo="
				+ fecDescargo + ", fecrecepcion=" + fecrecepcion + ", torre="
				+ torre + ", nroguia=" + nroguia + ", ajuste=" + ajuste
				+ ", liquidado=" + liquidado + ", nroliquidacion="
				+ nroliquidacion + ", recepcion=" + recepcion
				+ ", recepcionDni=" + recepcionDni + ", parentesco="
				+ parentesco + ", colorcasa=" + colorcasa + ", puerta="
				+ puerta + ", nropisos=" + nropisos + ", suministro="
				+ suministro + ", telefono=" + telefono + ", ventana="
				+ ventana + ", tipoviv=" + tipoviv + ", vecinoizq=" + vecinoizq
				+ ", vecinoder=" + vecinoder + ", material=" + material
				+ ", estadoviv=" + estadoviv + ", rejacolor=" + rejacolor
				+ ", locald=" + locald + ", imagen=" + imagen + ", userScaneo="
				+ userScaneo + ", fecScaneo=" + fecScaneo + ", sesionscaneo="
				+ sesionscaneo + ", tiposcaneo=" + tiposcaneo + ", monto="
				+ monto + ", oficina=" + oficina + ", moneda=" + moneda
				+ ", coordinado=" + coordinado + ", fechaCoor=" + fechaCoor
				+ ", userCoor=" + userCoor + ", observacion=" + observacion
				+ ", nropiezas=" + nropiezas + ", peso=" + peso + ", pesoreal="
				+ pesoreal + ", cargoagente=" + cargoagente
				+ ", nrocargoagente=" + nrocargoagente + ", codenvio="
				+ codenvio + ", ancho=" + ancho + ", largo=" + largo
				+ ", alto=" + alto + ", vbase=" + vbase + ", vexceso="
				+ vexceso + ", bloqueo=" + bloqueo + ", ruc=" + ruc + ", dni="
				+ dni + ", flagdescargo=" + flagdescargo + ", nuevodistrito="
				+ nuevodistrito + ", serieliquidacion=" + serieliquidacion
				+ ", serieguia=" + serieguia + ", userCuadre=" + userCuadre
				+ ", fechaCuadre=" + fechaCuadre + ", estCuadre=" + estCuadre
				+ ", flagCoor=" + flagCoor + ", useruarioCoor=" + useruarioCoor
				+ ", fechaCoordinacion=" + fechaCoordinacion
				+ ", serieguiasol=" + serieguiasol + ", nroguiasol="
				+ nroguiasol + ", imagenFtp=" + imagenFtp + ", usuarioFtp="
				+ usuarioFtp + ", fechaFtp=" + fechaFtp + ", usuarioWs="
				+ usuarioWs + ", usuarioCoordina=" + usuarioCoordina
				+ ", fechaCoordina=" + fechaCoordina + ", biFecNumCam="
				+ biFecNumCam + ", biCodIndCam=" + biCodIndCam + "]";
	}
}