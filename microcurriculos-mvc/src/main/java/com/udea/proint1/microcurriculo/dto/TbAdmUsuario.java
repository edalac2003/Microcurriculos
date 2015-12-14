package com.udea.proint1.microcurriculo.dto;

// Generated 21/10/2014 12:17:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TbAdmUsuarios generated by hbm2java
 */

public class TbAdmUsuario implements java.io.Serializable {	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vrLogin;
	private TbAdmPersona tbAdmPersona;
	private String vrPassword;
	private int blEstado;
	private String vrModusuario;
	private Date dtModfecha;

	public TbAdmUsuario() {
		super();
	}

	public TbAdmUsuario(TbAdmPersona tbAdmPersona, String vrLogin) {
		this.tbAdmPersona = tbAdmPersona;
		this.vrLogin = vrLogin;
	}


	public TbAdmUsuario(String vrLogin, TbAdmPersona tbAdmPersona,
			String vrPassword, int blEstado, String vrModusuario, Date dtModfecha) {
		super();
		this.vrLogin = vrLogin;
		this.tbAdmPersona = tbAdmPersona;
		this.vrPassword = vrPassword;
		this.blEstado = blEstado;
		this.vrModusuario = vrModusuario;
		this.dtModfecha = dtModfecha;
	}

	public TbAdmPersona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(TbAdmPersona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public String getVrLogin() {
		return this.vrLogin;
	}

	public void setVrLogin(String vrLogin) {
		this.vrLogin = vrLogin;
	}

	public String getVrPassword() {
		return this.vrPassword;
	}

	public void setVrPassword(String vrPassword) {
		this.vrPassword = vrPassword;
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