package br.com.eder.cms.action;

import br.com.eder.cms.model.Administrador;
import br.com.eder.cms.service.basic.BasicAdministradorService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAdministradorAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Administrador admin;
	private String usuario;
	private String senha;
	private String focus;
	private final String USER = "admin";
	private final String PASSWORD = "123";
	
	public String logarAdmin(){
		
				
		BasicAdministradorService bas = new BasicAdministradorService();
		admin = new Administrador();
		
		try{
			
			admin = bas.buscarAdministrador(usuario);
			
			if((admin.getUsuario().equals(usuario)) && (admin.getSenha().equals(senha)))
				if((admin.getUsuario().equals(USER)) && (admin.getSenha().equals(PASSWORD)))
				return SUCCESS;
			
		} catch (Exception e) {
			return ERROR;
		}
		return ERROR;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}

	public Administrador getAdmin() {
		return admin;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}
	
	public void setFocus(String focus) {
		this.focus = focus;
	}

	public String getFocus() {
		return focus;
	}

}
