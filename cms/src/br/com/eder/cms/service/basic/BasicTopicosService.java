package br.com.eder.cms.service.basic;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.eder.cms.hibernate.HibernateUtility;
import br.com.eder.cms.model.Topicos;
import br.com.eder.cms.model.dao.SecaoDAO;

public class BasicTopicosService {
	
	public List<Topicos> buscarTopicos(){
		Session session = HibernateUtility.getSession();
		Transaction transacao = session.beginTransaction();
		List<Topicos> list = null;
		
		
		try{
	        Criteria selectAll = session.createCriteria(Topicos.class);   
	        transacao.commit();
	        list = selectAll.list();
	        session.close();
	        
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}
	
	public void incluir(Topicos topico) {
		Session sessao = HibernateUtility.getSession();
		Transaction transaction = sessao.beginTransaction();
		
		Topicos topicos = new Topicos();
		SecaoDAO dao = new SecaoDAO(sessao);
		dao.retrieve(topico.getSecao().getIdSecao());
		
		try{
			topicos.setIdTopicos(topico.getIdTopicos());
			topicos.setSecao(topico.getSecao());
			topicos.setNome(topico.getNome());
			topicos.setDetalhe(topico.getDetalhe());
			topicos.setStatus(topico.getStatus());
			
			sessao.save(topicos);
			transaction.commit();
			sessao.close();
		}catch(Exception e){}
		
	}
	
	public void excluir(Topicos topico){
		Session session = HibernateUtility.getSession();
		Transaction t = session.beginTransaction();
		
		try{
			
			session.delete(topico);
			t.commit();
			
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
	}
	
}
