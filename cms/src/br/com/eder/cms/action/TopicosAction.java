package br.com.eder.cms.action;

import java.util.List;

import br.com.eder.cms.model.Administrador;
import br.com.eder.cms.model.Secao;
import br.com.eder.cms.model.Topicos;
import br.com.eder.cms.service.basic.BasicAdministradorService;
import br.com.eder.cms.service.basic.BasicTopicosService;

import com.opensymphony.xwork2.ActionSupport;

public class TopicosAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BasicTopicosService bts;
	private List<Topicos> listaTopicos;
	private Integer numTopico;
	private Integer numSecao;
	private String nomeTopico;
	private String detalheTopico;
	private String statusTopico;
	private Secao secao;
	private Topicos topicos;
	
	public String exibirTopicos(){

		bts = new BasicTopicosService();
		listaTopicos = null;
		try{
			
			listaTopicos = bts.buscarTopicos();
			
			
		} catch (Exception e) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String execute(){
    	return SUCCESS;
    }
	
	  public String insereTopicos(){
	    	
	    	topicos = new Topicos();
	    	bts = new BasicTopicosService();
	    	secao = new Secao();
	    	secao.setIdSecao(numSecao);
	    	
	    	topicos.setIdTopicos(numTopico);
	    	topicos.setSecao(secao);
	    	topicos.setNome(nomeTopico);
	    	topicos.setDetalhe(detalheTopico);
	    	topicos.setStatus(statusTopico);
	    	
	    	bts.incluir(topicos);
	    	
	    	return SUCCESS;
	    }
	  
	  public String excluiTopicos(){
	    	
		  bts = new BasicTopicosService();
			
			try{
				topicos = new Topicos();
				topicos.setIdTopicos(numTopico);
				topicos.setNome(nomeTopico);
				
				bts.excluir(topicos);
				
			} catch (Exception e) {
				return ERROR;
			}
	    	
	    	
	    	return SUCCESS;
	    }

	public Integer getNumTopico() {
		return numTopico;
	}

	public void setNumTopico(Integer numTopico) {
		this.numTopico = numTopico;
	}

	public Integer getNumSecao() {
		return numSecao;
	}

	public void setNumSecao(Integer numSecao) {
		this.numSecao = numSecao;
	}

	public String getNomeTopico() {
		return nomeTopico;
	}

	public void setNomeTopico(String nomeTopico) {
		this.nomeTopico = nomeTopico;
	}

	public String getDetalheTopico() {
		return detalheTopico;
	}

	public void setDetalheTopico(String detalheTopico) {
		this.detalheTopico = detalheTopico;
	}

	public String getStatusTopico() {
		return statusTopico;
	}

	public void setStatusTopico(String statusTopico) {
		this.statusTopico = statusTopico;
	}

	public List<Topicos> getListaTopicos() {
		return listaTopicos;
	}

	public void setListaTopicos(List<Topicos> listaTopicos) {
		this.listaTopicos = listaTopicos;
	}

	public void setBts(BasicTopicosService bts) {
		this.bts = bts;
	}

	public BasicTopicosService getBts() {
		return bts;
	}

	public void setTopicos(Topicos topicos) {
		this.topicos = topicos;
	}

	public Topicos getTopicos() {
		return topicos;
	}

}
