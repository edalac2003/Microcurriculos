package com.udea.proint1.microcurriculo.dto;

// Generated 21/10/2014 12:17:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;

/**
 * TbAdmPersona generated by hbm2java
 */
public class TbAdmPersona implements java.io.Serializable {	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String vrIdpersona;	
	private String vrNombres;
	private String vrApellidos;
	private String vrEmail;
	private String vrTelefono;
	private TbAdmCiudad tbAdmCiudad;
	private TbAdmTipoidentificacion tbAdmTipoidentificacion;
	private int blEstado;
	private String vrModusuario;
	private Date dtModfecha;

	public TbAdmPersona() {
		
	}

	public TbAdmPersona(String vrIdpersona, String vrNombres, String vrApellidos, String vrEmail, String vrTelefono, int blEstado) {
		super();
		this.vrIdpersona = vrIdpersona;
		this.vrNombres = vrNombres;
		this.vrApellidos = vrApellidos;
		this.vrEmail = vrEmail;
		this.vrTelefono = vrTelefono;
		this.blEstado = blEstado;
	}

	public TbAdmPersona(String vrIdpersona, String vrNombres, String vrApellidos, String vrEmail, String vrTelefono,
			TbAdmCiudad tbAdmCiudad, TbAdmTipoidentificacion tbAdmTipoidentificacion, int blEstado,
			String vrModusuario, Date dtModfecha) {
		super();
		this.vrIdpersona = vrIdpersona;
		this.vrNombres = vrNombres;
		this.vrApellidos = vrApellidos;
		this.vrEmail = vrEmail;
		this.vrTelefono = vrTelefono;
		this.tbAdmCiudad = tbAdmCiudad;
		this.tbAdmTipoidentificacion = tbAdmTipoidentificacion;
		this.blEstado = blEstado;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
	}

	public String getVrIdpersona() {
		return this.vrIdpersona;
	}

	public void setVrIdpersona(String vrIdpersona) {
		this.vrIdpersona = vrIdpersona;
	}

	public TbAdmCiudad getTbAdmCiudad() {
		return this.tbAdmCiudad;
	}

	public void setTbAdmCiudad(TbAdmCiudad tbAdmCiudad) {
		this.tbAdmCiudad = tbAdmCiudad;
	}

	public TbAdmTipoidentificacion getTbAdmTipoidentificacion() {
		return this.tbAdmTipoidentificacion;
	}

	public void setTbAdmTipoidentificacion(
			TbAdmTipoidentificacion tbAdmTipoidentificacion) {
		this.tbAdmTipoidentificacion = tbAdmTipoidentificacion;
	}

	public String getVrNombres() {
		return this.vrNombres;
	}

	public void setVrNombres(String vrNombres) {
		this.vrNombres = vrNombres;
	}

	public String getVrApellidos() {
		return this.vrApellidos;
	}

	public void setVrApellidos(String vrApellidos) {
		this.vrApellidos = vrApellidos;
	}

	public String getVrEmail() {
		return this.vrEmail;
	}

	public void setVrEmail(String vrEmail) {
		this.vrEmail = vrEmail;
	}

	public String getVrTelefono() {
		return this.vrTelefono;
	}

	public void setVrTelefono(String vrTelefono) {
		this.vrTelefono = vrTelefono;
	}

	public int getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(int blEstado) {
		this.blEstado = blEstado;
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