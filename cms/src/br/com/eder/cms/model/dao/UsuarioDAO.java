package br.com.eder.cms.model.dao;

import org.hibernate.Session;

import br.com.eder.cms.model.Usuario;

public class UsuarioDAO {

	private Session session;
	
	public UsuarioDAO (Session session) {
		this.session = session;
	}
	
	public void insert(Usuario usuario){
		this.session.save(usuario);
	}
	
	public void delete(Usuario usuario){
		this.session.delete(usuario);
	}
	
	public Usuario retrieve(String idUsuario){
		return (Usuario) this.session.load(Usuario.class, new String(idUsuario));
	}
	
	public void update(Usuario usuario){
		this.session.update(usuario);
	}

}
