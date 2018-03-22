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
        aluno.setNome("Junior");
        aluno.setIdade(21);
        aluno.setCpf("123321123312");
        aluno.imprimeAluno(aluno);
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Meirinaldo");
        aluno2.setIdade(21);
        aluno2.setCpf("123123123");
        aluno2.imprimeAluno(aluno2);
        
        //========= CARROS ==========//
        Carro carro      = new Carro();
        carro.setCarro("Corolla");
        carro.setModelo("Sedan");
        carro.setFabricante("Toyota");
        carro.setAno(2018);
        carro.imprimeCarro(carro);
        
        Carro carro2      = new Carro();
        carro2.setCarro("Sw4");
        carro2.setModelo("Sedan");
        carro2.setFabricante("Toyota");
        carro2.setAno(2018);
        carro2.imprimeCarro(carro2);
        
        //========= COMPUTADORES =======//
        Computador computador  = new Computador();
        computador.setFabricante("Apple");
        computador.setMemoria(8);
        computador.setModelo("MacBook Pro 2017");
        computador.setProcessador("Core i7");
        computador.imprimeComputador(computador);

        Computador computador2  = new Computador();
        computador2.setFabricante("Dell");
        computador2.setMemoria(16);
        computador2.setModelo("Inpiron");
        computador2.setProcessador("Core i7");
        computador2.imprimeComputador(computador2);
        
        //======== FORNECEDORES =======//
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("José");
        fornecedor.setIdade(21);
        fornecedor.setCpf("1234543345");
        computador.imprimeComputador(computador);
        
        Fornecedor fornecedor2 = new Fornecedor();
        fornecedor2.setNome("Maria");
        fornecedor2.setIdade(30);
        fornecedor2.setCpf("12343123123");
        fornecedor.imprimeFornecedor(fornecedor2);
        
        //======== LIVROS ===========//   
        Livro livro = new Livro();
        livro.setNome("Java 8");
        livro.setEscritor("Casa do Código");
        livro.setEscritor("Seu Zé");
        livro.setAnoPub(2017);
        livro.imprimeLivro(livro);
        
        Livro livro2 = new Livro();
        livro2.setNome("Micros serviços com Node.js");
        livro2.setEditora("Novatec");
        livro2.setEscritor("Fictício");
        livro2.setAnoPub(2018);
        livro2.imprimeLivro(livro);
          
    }
    
}
