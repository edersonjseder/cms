package br.com.eder.cms.model.dao;

import org.hibernate.Session;

import br.com.eder.cms.model.Secao;

public class SecaoDAO {

	private Session session;
	
	public SecaoDAO (Session session) {
		this.session = session;
	}
	
	public void insert(Secao secao){
		this.session.save(secao);
	}
	
	public void delete(Secao secao){
		this.session.delete(secao);
	}
	
	public Secao retrieve(Integer idSecao){
		return (Secao) this.session.load(Secao.class, idSecao);
	}
	
	public void update(Secao secao){
		this.session.update(secao);
	}

}
