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

    Aluno() {
        
    }

    public int getMatricula() {
        return matricula;
    }    
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    } 
    
    public void imprimeAluno(Aluno aluno){
        System.out.println("================================");
        System.out.println("Aluno cadastrado: "+aluno.nome);
        System.out.println("Matrícula do aluno cadastrado"+aluno.cpf);
        
    }
    
}
