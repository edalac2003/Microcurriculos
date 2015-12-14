package com.udea.proint1.microcurriculo.dto;

// Generated 21/10/2014 12:17:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.Set;

/**
 * TbMicObjetivos generated by hbm2java
 */
public class TbMicObjetivo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbIdobjetivo;
	private String vrDescripcion;
	private String vrModusuario;
	private Date dtModfecha;
	
	public TbMicObjetivo() {
		super();
	}

	public TbMicObjetivo(String vrDescripcion, String vrModusuario, Date dtModfecha) {
		super();
		this.vrDescripcion = vrDescripcion;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
	}

	@SuppressWarnings("rawtypes")
	public TbMicObjetivo(String vrDescripcion, String vrModusuario, Date dtModfecha, Set tbMicObjetivosxmicros) {
		this.vrDescripcion = vrDescripcion;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
//		this.tbMicObjetivosxmicros = tbMicObjetivosxmicros;
	}

	public int getNbIdobjetivo() {
		return this.nbIdobjetivo;
	}

	public void setNbIdobjetivo(int nbIdobjetivo) {
		this.nbIdobjetivo = nbIdobjetivo;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
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
