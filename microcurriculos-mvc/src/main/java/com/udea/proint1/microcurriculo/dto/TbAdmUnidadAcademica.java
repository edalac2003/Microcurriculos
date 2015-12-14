package com.udea.proint1.microcurriculo.dto;

// Generated 21/10/2014 12:17:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TbAdmUnidadAcademica generated by hbm2java
 */
public class TbAdmUnidadAcademica implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vrIdunidad;
	private String vrNombre;
	private TbAdmPersona vrResponsable;
	private String vrAlias;
	private String vrModusuario;
	private Date dtModfecha;


	public TbAdmUnidadAcademica() {
		super();
	}

	public TbAdmUnidadAcademica(String vrIdunidad) {
		this.vrIdunidad = vrIdunidad;
	}

	public TbAdmUnidadAcademica(String vrIdunidad, String vrNombre,	String vrModusuario, Date dtModfecha) {
		this.vrIdunidad = vrIdunidad;
		this.vrNombre = vrNombre;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
	}
	
	
	public TbAdmUnidadAcademica(String vrIdunidad, String vrNombre,
			TbAdmPersona vrResponsable, String vrAlias, String vrModusuario,
			Date dtModfecha) {
		super();
		this.vrIdunidad = vrIdunidad;
		this.vrNombre = vrNombre;
		this.vrResponsable = vrResponsable;
		this.vrAlias = vrAlias;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
	}

	public String getVrIdunidad() {
		return this.vrIdunidad;
	}

	public void setVrIdunidad(String vrIdunidad) {
		this.vrIdunidad = vrIdunidad;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public TbAdmPersona getVrResponsable() {
		return vrResponsable;
	}

	public void setVrResponsable(TbAdmPersona vrResponsable) {
		this.vrResponsable = vrResponsable;
	}

	public String getVrAlias() {
		return vrAlias;
	}

	public void setVrAlias(String vrAlias) {
		this.vrAlias = vrAlias;
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
}