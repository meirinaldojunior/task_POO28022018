/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_poo28022018;

/**
 *
 * @author meirinaldojunior
 */
public class Fornecedor extends Pessoa{
    
    
    private int codSetor;

    public Fornecedor(String nome, String cpf, int idade, int codSetor) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.codSetor = codSetor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }
    
    
    
}
