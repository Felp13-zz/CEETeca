package models;
// Generated 20/11/2018 13:58:57 by Hibernate Tools 4.3.1



/**
 * Endereco generated by hbm2java
 */
public class Endereco  implements java.io.Serializable {


     private EnderecoId id;
     private Pessoa pessoa;
     private String lougradouroEndereco;
     private String bairroEndereco;
     private String cidadeEndereco;
     private String estadoEndereco;
     private int numeroEndereco;
     private String complementoEndereco;

    public Endereco() {
    }

    public Endereco(EnderecoId id, Pessoa pessoa, String lougradouroEndereco, String bairroEndereco, String cidadeEndereco, String estadoEndereco, int numeroEndereco, String complementoEndereco) {
       this.id = id;
       this.pessoa = pessoa;
       this.lougradouroEndereco = lougradouroEndereco;
       this.bairroEndereco = bairroEndereco;
       this.cidadeEndereco = cidadeEndereco;
       this.estadoEndereco = estadoEndereco;
       this.numeroEndereco = numeroEndereco;
       this.complementoEndereco = complementoEndereco;
    }
   
    public EnderecoId getId() {
        return this.id;
    }
    
    public void setId(EnderecoId id) {
        this.id = id;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getLougradouroEndereco() {
        return this.lougradouroEndereco;
    }
    
    public void setLougradouroEndereco(String lougradouroEndereco) {
        this.lougradouroEndereco = lougradouroEndereco;
    }
    public String getBairroEndereco() {
        return this.bairroEndereco;
    }
    
    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }
    public String getCidadeEndereco() {
        return this.cidadeEndereco;
    }
    
    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }
    public String getEstadoEndereco() {
        return this.estadoEndereco;
    }
    
    public void setEstadoEndereco(String estadoEndereco) {
        this.estadoEndereco = estadoEndereco;
    }
    public int getNumeroEndereco() {
        return this.numeroEndereco;
    }
    
    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }
    public String getComplementoEndereco() {
        return this.complementoEndereco;
    }
    
    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }




}

