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
public class Task_POO28022018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //========= ALUNOS =========//
        Aluno aluno = new Aluno();
        aluno.nome  = "Junior";
        aluno.idade = 21;
        aluno.cpf   = "123321123312";
        
        Aluno aluno2 = new Aluno();
        aluno2.nome  = "Meirinaldo";
        aluno2.idade = 21;
        aluno2.cpf   = "123123123";
        
        //========= CARROS ==========//
        Carro carro      = new Carro();
        carro.modelo     = "Corola";
        carro.fabricante = "Toyota";
        carro.ano        = 2018;
        
        Carro carro2      = new Carro();
        carro2.modelo     = "Sw4";
        carro2.fabricante = "Toyota";
        carro2.ano        = 2018;
        
        //========= COMPUTADORES =======//
        Computador computador  = new Computador();
        computador.fabricante  = "Apple";
        computador.memoria     = 8;
        computador.modelo      = "MacBook Pro 2017";
        computador.processador = "Core i7";
        
        Computador computador2  = new Computador();
        computador2.fabricante  = "Dell";
        computador2.memoria     = 16;
        computador2.modelo      = "Inpiron";
        computador2.processador = "Core i7";
        
        //======== FORNECEDORES =======//
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.nome   = "José";
        fornecedor.idade  = 21;
        fornecedor.cpf    = "1234543345";
        
        Fornecedor fornecedor2 = new Fornecedor();
        fornecedor2.nome  = "Maria";
        fornecedor2.idade = 30;
        fornecedor2.cpf   = "12343123123";
        
        //======== LIVROS ===========//   
        Livro livro = new Livro();
        livro.nome        = "Java 8";
        livro.editora     = "Casa do Código";
        livro.escritor    = "Seu Zé";
        livro.anoPub      = 2017;
        
        Livro livro2 = new Livro();
        livro2.nome       = "Micros serviços com Node.js";
        livro2.editora    = "Novatec";
        livro2.escritor   = "Fictício";
        livro2.anoPub     = 2018;
          
    }
    
}
