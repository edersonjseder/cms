package br.com.eder.cms.action;

import java.util.List;

import br.com.eder.cms.delegate.UsuarioDelegate;
import br.com.eder.cms.model.Usuario;

import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private UsuarioDelegate usuarioDelegate;
	private List<Usuario> listaUsuario;
	private String campoUsuario;
	private String campoSenha;
	private String campoSenhaConfirm;
	private String campoEmail;

		public String exibirUsuario(){
			return SUCCESS;
		}
	    
	    public String execute(){
	    	return SUCCESS;
	    }
	    
	    public String exibirUsuarios(){

			usuarioDelegate = new UsuarioDelegate();
	    	
			try{
				
				listaUsuario = usuarioDelegate.buscarUsuario();
				
				
			} catch (Exception e) {
				return ERROR;
			}
			return SUCCESS;
		}
	    
	    public String logarUsuario(){
			
	    	usuarioDelegate = new UsuarioDelegate();
			usuario = new Usuario();
			usuario.setUsuario(campoUsuario);
			
			try{
				
				usuario = usuarioDelegate.logaUsuario(usuario);
				
				if((usuario.getUsuario().equals(campoUsuario)) && (usuario.getSenha().equals(campoSenha)))
					return SUCCESS;
				
			} catch (Exception e) {
				return ERROR;
			}
			return ERROR;
		}
	    
	    public String insereUsuario(){
	    	
	    	usuario = new Usuario();
	    	
	    	usuario.setUsuario(campoUsuario);
	    	if(campoSenha.equals(campoSenhaConfirm)){
	    		usuario.setSenha(campoSenha);
	    	}
	    	else
	    		return ERROR;
	    	
	    	usuario.setEmail(campoEmail);
	    	
	    	usuarioDelegate = new UsuarioDelegate();
	    	usuarioDelegate.inserirUsuario(usuario);
	    	
	    	return SUCCESS;
	    }
	    
	    public String excluiUsuario(){
	    	
			try{
				usuario = new Usuario();
				usuario.setUsuario(campoUsuario);
				
				usuarioDelegate = new UsuarioDelegate();
				usuarioDelegate.excluirUsuario(usuario);
				
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

		public String getCampoEmail() {
			return campoEmail;
		}

		public void setCampoEmail(String campoEmail) {
			this.campoEmail = campoEmail;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setListaUsuario(List<Usuario> listaUsuario) {
			this.listaUsuario = listaUsuario;
		}

		public List<Usuario> getListaUsuario() {
			return listaUsuario;
		}

		public UsuarioDelegate getUsuarioDelegate() {
			return usuarioDelegate;
		}

		public void setUsuarioDelegate(UsuarioDelegate usuarioDelegate) {
			this.usuarioDelegate = usuarioDelegate;
		}

		public String getCampoSenhaConfirm() {
			return campoSenhaConfirm;
		}

		public void setCampoSenhaConfirm(String campoSenhaConfirm) {
			this.campoSenhaConfirm = campoSenhaConfirm;
		}
	    

}
