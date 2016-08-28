package br.com.eder.cms.action;

import java.util.List;

import br.com.eder.cms.model.Administrador;
import br.com.eder.cms.model.ItemTopico;
import br.com.eder.cms.model.Secao;
import br.com.eder.cms.model.Topicos;
import br.com.eder.cms.service.basic.BasicAdministradorService;
import br.com.eder.cms.service.basic.BasicItemTopicoService;
import br.com.eder.cms.service.basic.BasicTopicosService;

import com.opensymphony.xwork2.ActionSupport;

public class ItemTopicoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BasicItemTopicoService bits;
	private List<ItemTopico> listaItemTopico;
	private Integer numTopico;
	private String nomeItemTopico;
	private String descricaoItemTopico;
	private String statusItemTopico;
	private Integer numItemTopico;
	private Topicos topicos;
	private ItemTopico itemTopico;
	
	public String exibirItemTopico(){

		bits = new BasicItemTopicoService();
		listaItemTopico = null;
		try{
			
			listaItemTopico = bits.buscarItemTopico();
			
			
		} catch (Exception e) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String execute(){
    	return SUCCESS;
    }
	
	  public String insereItemTopico(){
	    	
		  itemTopico = new ItemTopico();
	    	bits = new BasicItemTopicoService();
	    	topicos = new Topicos();
	    	topicos.setIdTopicos(numTopico);
	    	
	    	itemTopico.setIdItemTopico(numItemTopico);
	    	itemTopico.setTopicos(topicos);
	    	itemTopico.setNome(nomeItemTopico);
	    	itemTopico.setDescricao(descricaoItemTopico);
	    	itemTopico.setStatus(statusItemTopico);
	    	
	    	bits.incluir(itemTopico);
	    	
	    	return SUCCESS;
	    }
	  
	  public String excluiItemTopico(){
	    	
		  bits = new BasicItemTopicoService();
			
			try{
				itemTopico = new ItemTopico();
				itemTopico.setIdItemTopico(numItemTopico);
				itemTopico.setNome(nomeItemTopico);
				
				bits.excluir(itemTopico);
				
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

	public String getNomeItemTopico() {
		return nomeItemTopico;
	}

	public void setNomeItemTopico(String nomeItemTopico) {
		this.nomeItemTopico = nomeItemTopico;
	}

	public String getDescricaoItemTopico() {
		return descricaoItemTopico;
	}

	public void setDescricaoItemTopico(String descricaoItemTopico) {
		this.descricaoItemTopico = descricaoItemTopico;
	}

	public String getStatusItemTopico() {
		return statusItemTopico;
	}

	public void setStatusItemTopico(String statusItemTopico) {
		this.statusItemTopico = statusItemTopico;
	}

	public void setTopicos(Topicos topicos) {
		this.topicos = topicos;
	}

	public Topicos getTopicos() {
		return topicos;
	}

	public void setBits(BasicItemTopicoService bits) {
		this.bits = bits;
	}

	public BasicItemTopicoService getBits() {
		return bits;
	}

	public void setListaItemTopico(List<ItemTopico> listaItemTopico) {
		this.listaItemTopico = listaItemTopico;
	}

	public List<ItemTopico> getListaItemTopico() {
		return listaItemTopico;
	}

	public void setItemTopico(ItemTopico itemTopico) {
		this.itemTopico = itemTopico;
	}

	public ItemTopico getItemTopico() {
		return itemTopico;
	}

	public Integer getNumItemTopico() {
		return numItemTopico;
	}

	public void setNumItemTopico(Integer numItemTopico) {
		this.numItemTopico = numItemTopico;
	}

}
