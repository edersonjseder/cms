package br.com.eder.cms.service.basic;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.eder.cms.hibernate.HibernateUtility;
import br.com.eder.cms.model.ItemTopico;
import br.com.eder.cms.model.Topicos;
import br.com.eder.cms.model.dao.SecaoDAO;
import br.com.eder.cms.model.dao.TopicosDAO;

public class BasicItemTopicoService {
	
	public List<ItemTopico> buscarItemTopico(){
		Session session = HibernateUtility.getSession();
		Transaction transacao = session.beginTransaction();
		List<ItemTopico> list = null;
		
		
		try{
	        Criteria selectAll = session.createCriteria(ItemTopico.class);   
	        transacao.commit();
	        list = selectAll.list();
	        session.close();
	        
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}
	
	public void incluir(ItemTopico itemTopico) {
		Session sessao = HibernateUtility.getSession();
		Transaction transaction = sessao.beginTransaction();
		
		ItemTopico iTopico = new ItemTopico();
		TopicosDAO dao = new TopicosDAO(sessao);
		dao.retrieve(itemTopico.getTopicos().getIdTopicos());
		
		try{
			iTopico.setIdItemTopico(itemTopico.getIdItemTopico());
			iTopico.setTopicos(itemTopico.getTopicos());
			iTopico.setNome(itemTopico.getNome());
			iTopico.setDescricao(itemTopico.getDescricao());
			iTopico.setStatus(itemTopico.getStatus());
			
			sessao.save(iTopico);
			transaction.commit();
			sessao.close();
		}catch(Exception e){}
		
	}
	
	public void excluir(ItemTopico itemTopico){
		Session session = HibernateUtility.getSession();
		Transaction t = session.beginTransaction();
		
		try{
			
			session.delete(itemTopico);
			t.commit();
			
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
	}
	
}
