package br.com.eder.cms.delegate;

import java.util.List;

import br.com.eder.cms.model.Usuario;
import br.com.eder.cms.service.basic.BasicUsuarioService;

public class UsuarioDelegate {
	
	private BasicUsuarioService basicUsuarioService;
	private List<Usuario> listaUsuario;
	private Usuario usuario;
	
	public List<Usuario> buscarUsuario(){
		
		basicUsuarioService = new BasicUsuarioService();
		listaUsuario = null;
				
		listaUsuario = basicUsuarioService.buscarUsuarios();
	    
		return listaUsuario;
	}
	
	public void inserirUsuario(Usuario usuario){
		
		basicUsuarioService = new BasicUsuarioService();
		basicUsuarioService.incluirUsuario(usuario) ;
		
	}
	
	public void excluirUsuario(Usuario usuario){
		
		basicUsuarioService = new BasicUsuarioService();
		basicUsuarioService.excluirUsuario(usuario);
		
	}
	
	public Usuario logaUsuario(Usuario usuario){
		
		basicUsuarioService = new BasicUsuarioService();
		usuario = basicUsuarioService.buscarUsuario(usuario.getUsuario());
		
		return usuario;
	}
	
	

	public BasicUsuarioService getBasicUsuarioService() {
		return basicUsuarioService;
	}

	public void setBasicUsuarioService(BasicUsuarioService basicUsuarioService) {
		this.basicUsuarioService = basicUsuarioService;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
