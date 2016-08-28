package br.com.eder.cms.delegate;

import java.util.List;

import br.com.eder.cms.model.Administrador;
import br.com.eder.cms.service.basic.BasicAdministradorService;

public class AdministradorDelegate {
	
	private BasicAdministradorService basicAdministradorService;
	private List<Administrador> listaAdministrador;
	private Administrador administrador;
	
	
	public List<Administrador> buscar(){
		
		basicAdministradorService = new BasicAdministradorService();
		listaAdministrador = null;
			
	    listaAdministrador = basicAdministradorService.buscarUsuarios();
	    
		return listaAdministrador;
	}

	public void inserir(Administrador admin){
		
		
		basicAdministradorService = new BasicAdministradorService();
		
		basicAdministradorService.incluir(admin);
		
	}
	
	public void excluir(Administrador admin){
		
		basicAdministradorService = new BasicAdministradorService();
		basicAdministradorService.excluir(admin);
		
	}
	
	
	
	public Administrador loga(Administrador admin){
		
		basicAdministradorService = new BasicAdministradorService();
		admin = basicAdministradorService.buscarAdministrador(admin.getLogin());
		
		return admin;
	}
	
	public BasicAdministradorService getBasicAdministradorService() {
		return basicAdministradorService;
	}

	public void setBasicAdministradorService(
			BasicAdministradorService basicAdministradorService) {
		this.basicAdministradorService = basicAdministradorService;
	}

	public void setListaAdministrador(List<Administrador> listaAdministrador) {
		this.listaAdministrador = listaAdministrador;
	}

	public List<Administrador> getListaAdministrador() {
		return listaAdministrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

}
