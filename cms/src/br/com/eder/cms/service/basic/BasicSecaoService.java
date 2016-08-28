package br.com.eder.cms.service.basic;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.eder.cms.hibernate.HibernateUtility;
import br.com.eder.cms.model.Administrador;
import br.com.eder.cms.model.Secao;
import br.com.eder.cms.model.dao.AdministradorDAO;
import br.com.eder.cms.model.dao.SecaoDAO;

public class BasicSecaoService {
	
	public List<Secao> buscarSecao(){
		Session session = HibernateUtility.getSession();
		Transaction transacao = session.beginTransaction();
		List<Secao> list = null;
		
		
		try{
	        Criteria selectAll = session.createCriteria(Secao.class);   
	        transacao.commit();
	        list = selectAll.list();
	        session.close();
	        
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}
	
	public void incluir(Secao secao) {
		Session sessao = HibernateUtility.getSession();
		Transaction transaction = sessao.beginTransaction();
		
		Secao sec = new Secao();
		
		try{
			sec.setIdSecao(secao.getIdSecao());
			sec.setNome(secao.getNome());
			sec.setStatus(secao.getStatus());
			
			sessao.save(sec);
			
			transaction.commit();
			sessao.close();
		}catch(Exception e){}
		
	}
	
	public void excluir(Secao secao){
		Session session = HibernateUtility.getSession();
		Transaction t = session.beginTransaction();
		
		try{
			
			session.delete(secao);
			t.commit();
			
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public Secao buscarSecao(Integer idSecao){
		Session session = HibernateUtility.getSession();
		Secao secao = new Secao();
		try{
			SecaoDAO dao = new SecaoDAO(session);
			secao = dao.retrieve(idSecao);
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return secao;
	}
	
}
