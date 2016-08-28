package br.com.eder.cms.model;


/**
 * Administrador generated by hbm2java
 */
public class Administrador  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
     private String senha;
     private String dica;
     private String email;

    public Administrador() {
    }
    
    
    public Administrador(String id) {
    	this.setLogin(id);
    }
   
	private int hashCode = Integer.MIN_VALUE;

    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
		this.hashCode = Integer.MIN_VALUE;
    }
    
       
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
		this.hashCode = Integer.MIN_VALUE;
    }
    
       
    public String getDica() {
        return this.dica;
    }
    
    public void setDica(String dica) {
        this.dica = dica;
		this.hashCode = Integer.MIN_VALUE;
    }
    
       
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
		this.hashCode = Integer.MIN_VALUE;
    }
    
       


	 	public boolean equals (Object obj) {
			if (null == obj) return false;
			if (!(obj instanceof Administrador)) return false;
			else {
				Administrador castOther = (Administrador) obj;
				if (null == this.getLogin() || null == castOther.getLogin()) return false;
				else return (this.getLogin().equals(castOther.getLogin()));
			}
		}
	
		public int hashCode () {
			if (Integer.MIN_VALUE == this.hashCode) {
				if (null == this.getLogin()) return super.hashCode();
				else {
					String hashStr = this.getClass().getName() + ":" + this.getLogin().hashCode();
					this.hashCode = hashStr.hashCode();
				}
			}
			return this.hashCode;
		}
		
}


