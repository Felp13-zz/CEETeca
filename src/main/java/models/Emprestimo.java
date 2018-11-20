package models;
// Generated 20/11/2018 13:58:57 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Emprestimo generated by hbm2java
 */
public class Emprestimo  implements java.io.Serializable {


     private int codigoEmprestimo;
     private Pessoa pessoa;
     private int quantidadeLivroEmprestimo;
     private Date dtSaidaEmprestimo;
     private Date dtDevolucaoEmprestimo;
     private Set livroHasEmprestimos = new HashSet(0);

    public Emprestimo() {
    }

	
    public Emprestimo(int codigoEmprestimo, Pessoa pessoa, int quantidadeLivroEmprestimo, Date dtSaidaEmprestimo, Date dtDevolucaoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
        this.pessoa = pessoa;
        this.quantidadeLivroEmprestimo = quantidadeLivroEmprestimo;
        this.dtSaidaEmprestimo = dtSaidaEmprestimo;
        this.dtDevolucaoEmprestimo = dtDevolucaoEmprestimo;
    }
    public Emprestimo(int codigoEmprestimo, Pessoa pessoa, int quantidadeLivroEmprestimo, Date dtSaidaEmprestimo, Date dtDevolucaoEmprestimo, Set livroHasEmprestimos) {
       this.codigoEmprestimo = codigoEmprestimo;
       this.pessoa = pessoa;
       this.quantidadeLivroEmprestimo = quantidadeLivroEmprestimo;
       this.dtSaidaEmprestimo = dtSaidaEmprestimo;
       this.dtDevolucaoEmprestimo = dtDevolucaoEmprestimo;
       this.livroHasEmprestimos = livroHasEmprestimos;
    }
   
    public int getCodigoEmprestimo() {
        return this.codigoEmprestimo;
    }
    
    public void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public int getQuantidadeLivroEmprestimo() {
        return this.quantidadeLivroEmprestimo;
    }
    
    public void setQuantidadeLivroEmprestimo(int quantidadeLivroEmprestimo) {
        this.quantidadeLivroEmprestimo = quantidadeLivroEmprestimo;
    }
    public Date getDtSaidaEmprestimo() {
        return this.dtSaidaEmprestimo;
    }
    
    public void setDtSaidaEmprestimo(Date dtSaidaEmprestimo) {
        this.dtSaidaEmprestimo = dtSaidaEmprestimo;
    }
    public Date getDtDevolucaoEmprestimo() {
        return this.dtDevolucaoEmprestimo;
    }
    
    public void setDtDevolucaoEmprestimo(Date dtDevolucaoEmprestimo) {
        this.dtDevolucaoEmprestimo = dtDevolucaoEmprestimo;
    }
    public Set getLivroHasEmprestimos() {
        return this.livroHasEmprestimos;
    }
    
    public void setLivroHasEmprestimos(Set livroHasEmprestimos) {
        this.livroHasEmprestimos = livroHasEmprestimos;
    }




}

