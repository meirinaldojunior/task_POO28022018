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
public class Aluno extends Pessoa{
    
    private int matricula;

    public Aluno(int matricula, String nome, String cpf, int idade) {
        this.matricula = matricula;
        this.nome      = nome;
        this.cpf       = cpf;
        this.idade     = idade; 
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMatricula() {
        return matricula;
    }    
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    } 
    
}
