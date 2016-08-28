package br.com.eder.cms.service.basic;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.eder.cms.hibernate.HibernateUtility;
import br.com.eder.cms.model.Usuario;
import br.com.eder.cms.model.dao.UsuarioDAO;

public class BasicUsuarioService {
	
	public Usuario buscarUsuario(String idUsuario){
		Session session = HibernateUtility.getSession();
		Usuario admin = new Usuario();
		try{
			UsuarioDAO dao = new UsuarioDAO(session);
			admin = dao.retrieve(idUsuario);
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return admin;
	}
	
	public List<Usuario> buscarUsuarios(){
		Session session = HibernateUtility.getSession();
		Transaction transacao = session.beginTransaction();
		List<Usuario> list = null;
		
		
		try{
	        Criteria selectAll = session.createCriteria(Usuario.class);   
	        transacao.commit();
	        list = selectAll.list();
	        session.close();
	        
		}catch(HibernateException e){
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}
	
	public void incluirUsuario(Usuario admin) {
		Session sessao = HibernateUtility.getSession();
		Transaction transaction = sessao.beginTransaction();
		
		Usuario usuario = new Usuario();
		
		try{
			usuario.setUsuario(admin.getUsuario());
			usuario.setSenha(admin.getSenha());
			usuario.setEmail(admin.getEmail());
			
			sessao.save(usuario);
			
			transaction.commit();
			sessao.close();
		}catch(Exception e){}
		
	}
	
	public void excluirUsuario(Usuario usuario){
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
