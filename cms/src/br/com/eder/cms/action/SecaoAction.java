package br.com.eder.cms.action;

import java.util.List;

import br.com.eder.cms.model.Secao;
import br.com.eder.cms.model.Topicos;
import br.com.eder.cms.service.basic.BasicSecaoService;
import br.com.eder.cms.service.basic.BasicTopicosService;

import com.opensymphony.xwork2.ActionSupport;

public class SecaoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BasicSecaoService bss;
	private List<Secao> listaSecao;
	private String numSecao;
	private String nomeSecao;
	private String detalheSecao;
	private String statusSecao;
	private Secao secao;
	private Integer numeroSecao;
	
	public String exibirSecao(){

		bss = new BasicSecaoService();
		listaSecao = null;
		try{
			
			listaSecao = bss.buscarSecao();
			
			
		} catch (Exception e) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String execute(){
    	return SUCCESS;
    }
	
	public String insereSecao(){
    	
		secao = new Secao();
    	bss = new BasicSecaoService();
    	numeroSecao = Integer.parseInt(numSecao);
    	
    	secao.setIdSecao(numeroSecao);
    	secao.setNome(nomeSecao);
    	secao.setStatus(statusSecao);
    	
    	bss.incluir(secao);
    	
    	return SUCCESS;
    }
	
	 public String excluiSecao(){
	    	
		 bss = new BasicSecaoService();
			
			try{
				secao = new Secao();
				numeroSecao = Integer.parseInt(numSecao);
				
				secao.setIdSecao(numeroSecao);
				secao.setNome(nomeSecao);
				bss.excluir(secao);
				
			} catch (Exception e) {
				return ERROR;
			}
	    	
	    	
	    	return SUCCESS;
	    }

	public void setListaSecao(List<Secao> listaSecao) {
		this.listaSecao = listaSecao;
	}

	public List<Secao> getListaSecao() {
		return listaSecao;
	}

	public void setBss(BasicSecaoService bss) {
		this.bss = bss;
	}

	public String getNumSecao() {
		return numSecao;
	}

	public void setNumSecao(String numSecao) {
		this.numSecao = numSecao;
	}

	public String getNomeSecao() {
		return nomeSecao;
	}

	public void setNomeSecao(String nomeSecao) {
		this.nomeSecao = nomeSecao;
	}

	public String getDetalheSecao() {
		return detalheSecao;
	}

	public void setDetalheSecao(String detalheSecao) {
		this.detalheSecao = detalheSecao;
	}

	public String getStatusSecao() {
		return statusSecao;
	}

	public void setStatusSecao(String statusSecao) {
		this.statusSecao = statusSecao;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	public BasicSecaoService getBss() {
		return bss;
	}

	public void setNumeroSecao(Integer numeroSecao) {
		this.numeroSecao = numeroSecao;
	}

	public Integer getNumeroSecao() {
		return numeroSecao;
	}

}
