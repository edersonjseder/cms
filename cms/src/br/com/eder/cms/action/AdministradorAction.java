package br.com.eder.cms.action;

import java.util.List;

import br.com.eder.cms.delegate.AdministradorDelegate;
import br.com.eder.cms.model.Administrador;

import com.opensymphony.xwork2.ActionSupport;


public class AdministradorAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Administrador administrador;
	private AdministradorDelegate administradorDelegate;
	private List<Administrador> listaAdministrador;
	private String campoUsuario;
	private String campoSenha;
	private String campoSenhaConfirm;
	private String campoDica;
	private String campoEmail;

	public String exibirAdministrador(){
		return SUCCESS;
	}
	    
	    public String execute(){
	    	return SUCCESS;
	    }
	    
	    public String exibir(){
	    	
	    	administradorDelegate = new AdministradorDelegate();
	    	
			try{
				
				listaAdministrador = administradorDelegate.buscar();
				
				
			} catch (Exception e) {
				return ERROR;
			}
			return SUCCESS;
		}
	    
	    public String logarAdministrador(){
			
	    	administradorDelegate = new AdministradorDelegate();
			administrador = new Administrador();
			administrador.setLogin(campoUsuario);
			
			try{
				
				administrador = administradorDelegate.loga(administrador);
				
				if((administrador.getLogin().equals(campoUsuario)) && (administrador.getSenha().equals(campoSenha)))
					return SUCCESS;
				
			} catch (Exception e) {
				return ERROR;
			}
			return ERROR;
		}
	    
	    public String insere(){
	    	
	    	administrador = new Administrador();
	    	
	    	administrador.setLogin(campoUsuario);
	    	if(campoSenha.equals(campoSenhaConfirm)){
	    		administrador.setSenha(campoSenha);
	    	}
	    	else
	    		return ERROR;
	    	
	    	administrador.setDica(campoDica);
	    	administrador.setEmail(campoEmail);
	    	
	    	administradorDelegate = new AdministradorDelegate();
	    	administradorDelegate.inserir(administrador);
	    	
	    	return SUCCESS;
	    }
	    
	    public String exclui(){
			
			try{
				administrador = new Administrador();
				administrador.setLogin(campoUsuario);
				
				administradorDelegate = new AdministradorDelegate();
				administradorDelegate.excluir(administrador);
				
			} catch (Exception e) {
				return ERROR;
			}
	    	
	    	
	    	return SUCCESS;
	    }
	    

		public String getCampoUsuario() {
			return campoUsuario;
		}

		public void setCampoUsuario(String campoUsuario) {
			this.campoUsuario = campoUsuario;
		}

		public String getCampoSenha() {
			return campoSenha;
		}

		public void setCampoSenha(String campoSenha) {
			this.campoSenha = campoSenha;
		}

		public String getCampoDica() {
			return campoDica;
		}

		public void setCampoDica(String campoDica) {
			this.campoDica = campoDica;
		}

		public String getCampoEmail() {
			return campoEmail;
		}

		public void setCampoEmail(String campoEmail) {
			this.campoEmail = campoEmail;
		}

		public void setAdministrador(Administrador administrador) {
			this.administrador = administrador;
		}

		public Administrador getAdministrador() {
			return administrador;
		}

		public void setListaAdministrador(List<Administrador> listaAdministrador) {
			this.listaAdministrador = listaAdministrador;
		}

		public List<Administrador> getListaAdministrador() {
			return listaAdministrador;
		}

		public void setCampoSenhaConfirm(String campoSenhaConfirm) {
			this.campoSenhaConfirm = campoSenhaConfirm;
		}

		public String getCampoSenhaConfirm() {
			return campoSenhaConfirm;
		}

		public AdministradorDelegate getAdministradorDelegate() {
			return administradorDelegate;
		}

		public void setAdministradorDelegate(AdministradorDelegate administradorDelegate) {
			this.administradorDelegate = administradorDelegate;
		}
	    
	    

}
