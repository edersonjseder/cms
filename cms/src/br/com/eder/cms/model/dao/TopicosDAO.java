package br.com.eder.cms.model.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.eder.cms.model.Topicos;

public class TopicosDAO {

	private Session session;
	
	public TopicosDAO (Session session) {
		this.session = session;
	}
	
	public void insert(Topicos topicos){
		this.session.save(topicos);
	}
	
	public void delete(Topicos topicos){
		this.session.delete(topicos);
	}
	
	public Topicos retrieve(Integer idTopicos){
		return (Topicos) this.session.load(Topicos.class, idTopicos);
	}
	
	public void update(Topicos topicos){
		this.session.update(topicos);
	}

}
