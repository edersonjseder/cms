package br.com.eder.cms.service.basic;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.eder.cms.hibernate.HibernateUtility;
import br.com.eder.cms.model.Administrador;
import br.com.eder.cms.model.dao.AdministradorDAO;

public class BasicAdministradorService {
	
	public Administrador buscarAdministrador(String idUsuario){
		Session session = HibernateUtility.getSession();
		Administrador admin = new Administrador();
		try{
			AdministradorDAO dao = new AdministradorDAO(session);
			admin = dao.retrieve(idUsuario);
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return admin;
	}
	
	public List<Administrador> buscarUsuarios(){
		Session session = HibernateUtility.getSession();
		Transaction transacao = session.beginTransaction();
		List<Administrador> list = null;
		
		
		try{
	        Criteria selectAll = session.createCriteria(Administrador.class);   
	        transacao.commit();
	        list = selectAll.list();
	        session.close();
	        
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}
	
	public void incluir(Administrador admin) {
		Session sessao = HibernateUtility.getSession();
		Transaction transaction = sessao.beginTransaction();
		
		Administrador administrador = new Administrador();
		
		try{
			administrador.setLogin(admin.getLogin());
			administrador.setSenha(admin.getSenha());
			administrador.setDica(admin.getDica());
			administrador.setEmail(admin.getEmail());
			
			sessao.save(administrador);
			
			transaction.commit();
			sessao.close();
		}catch(Exception e){}
		
	}
	
	public void excluir(Administrador usuario){
		Session session = HibernateUtility.getSession();
		Transaction t = session.beginTransaction();
		
		try{
			
			session.delete(usuario);
			t.commit();
			
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
	}
	
}
