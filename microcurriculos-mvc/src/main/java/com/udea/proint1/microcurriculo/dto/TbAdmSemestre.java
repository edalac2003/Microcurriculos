package com.udea.proint1.microcurriculo.dto;

// Generated 21/10/2014 12:17:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TbAdmSemestre generated by hbm2java
 */
public class TbAdmSemestre implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vrIdsemestre;
	private String vrNombre;
	private Date dtFechainicio;
	private Date dtFechafin;
	private String vrModusuario;
	private Boolean blHabilitado;
	private Date dtModfecha;

	
	public TbAdmSemestre() {
		super();
	}

	public TbAdmSemestre(String vrIdsemestre) {
		this.vrIdsemestre = vrIdsemestre;
	}

	public TbAdmSemestre(String vrIdsemestre, String vrNombre, Date dtFechainicio, 
			Date dtFechafin, String vrModusuario, Boolean blHabilitado, Date dtModfecha) {
		this.vrIdsemestre = vrIdsemestre;
		this.vrNombre = vrNombre;
		this.dtFechainicio = dtFechainicio;
		this.dtFechafin = dtFechafin;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
		this.blHabilitado = blHabilitado;
	}

	public String getVrIdsemestre() {
		return this.vrIdsemestre;
	}

	public void setVrIdsemestre(String vrIdsemestre) {
		this.vrIdsemestre = vrIdsemestre;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public Date getDtFechainicio() {
		return this.dtFechainicio;
	}

	public void setDtFechainicio(Date dtFechainicio) {
		this.dtFechainicio = dtFechainicio;
	}

	public Date getDtFechafin() {
		return this.dtFechafin;
	}

	public void setDtFechafin(Date dtFechafin) {
		this.dtFechafin = dtFechafin;
	}

	public String getVrModusuario() {
		return this.vrModusuario;
	}

	public void setVrModusuario(String vrModusuario) {
		this.vrModusuario = vrModusuario;
	}

	public Date getDtModfecha() {
		return this.dtModfecha;
	}

	public void setDtModfecha(Date dtModfecha) {
		this.dtModfecha = dtModfecha;
	}

	public Boolean getBlHabilitado() {
		return blHabilitado;
	}

	public void setBlHabilitado(Boolean blHabilitado) {
		this.blHabilitado = blHabilitado;
	}
}
