package com.udea.proint1.microcurriculo.dto;

// Generated 21/10/2014 12:17:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.Set;

/**
 * TbAdmCiudades generated by hbm2java
 */
public class TbAdmCiudad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbIdciudad;
	private TbAdmDepartamento tbAdmDepartamento;
	private String vrNombre;
	private String vrModusuario;
	private Date dtModfecha;

	public TbAdmCiudad() {
	}

	public TbAdmCiudad(int nbIdciudad,
			TbAdmDepartamento tbAdmDepartamento) {
		this.nbIdciudad = nbIdciudad;
		this.tbAdmDepartamento = tbAdmDepartamento;
	}

	@SuppressWarnings("rawtypes")
	public TbAdmCiudad(int nbIdciudad,
			TbAdmDepartamento tbAdmDepartamento, String vrNombre,
			String vrModusuario, Date dtModfecha, Set tbAdmPersona) {
		this.nbIdciudad = nbIdciudad;
		this.tbAdmDepartamento = tbAdmDepartamento;
		this.vrNombre = vrNombre;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
//		this.tbAdmPersona = tbAdmPersona;
	}

	public int getNbIdciudad() {
		return this.nbIdciudad;
	}

	public void setNbIdciudad(int nbIdciudad) {
		this.nbIdciudad = nbIdciudad;
	}

	public TbAdmDepartamento getTbAdmDepartamento() {
		return this.tbAdmDepartamento;
	}

	public void setTbAdmDepartamento(TbAdmDepartamento tbAdmDepartamento) {
		this.tbAdmDepartamento = tbAdmDepartamento;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
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