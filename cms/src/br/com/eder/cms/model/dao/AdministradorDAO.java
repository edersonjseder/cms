package br.com.eder.cms.model.dao;

import org.hibernate.Session;

import br.com.eder.cms.model.Administrador;

public class AdministradorDAO {

	private Session session;
	
	public AdministradorDAO (Session session) {
		this.session = session;
	}
	
	public void insert(Administrador administrador){
		this.session.save(administrador);
	}
	
	public void delete(Administrador administrador){
		this.session.delete(administrador);
	}
	
	public Administrador retrieve(String idUsuario){
		return (Administrador) this.session.load(Administrador.class, new String(idUsuario));
	}
	
	public void update(Administrador administrador){
		this.session.update(administrador);
	}

}
