package br.com.eder.cms.model.dao;

import org.hibernate.Session;

import br.com.eder.cms.model.ItemTopico;

public class ItemTopicoDAO {

	private Session session;
	
	private ItemTopicoDAO (Session session) {
		this.session = session;
	}
	
	public void insert(ItemTopico itemTopico){
		this.session.save(itemTopico);
	}
	
	public void delete(ItemTopico itemTopico){
		this.session.delete(itemTopico);
	}
	
	public ItemTopico retrieve(Long idItemTopico){
		return (ItemTopico) this.session.load(ItemTopico.class, idItemTopico);
	}
	
	public void update(ItemTopico itemTopico){
		this.session.update(itemTopico);
	}

}
