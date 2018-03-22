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
    
    Fornecedor(){
        
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }
    
    public void imprimeFornecedor(Fornecedor fornecedor){
        System.out.println("================================");
        System.out.println("Fornecedor: "+fornecedor.getNome());
        System.out.println("CPF: "+fornecedor.getCpf());
        System.out.println("COD Setor: "+fornecedor.getCodSetor());
        System.out.println("Idade: "+fornecedor.getIdade());
    }
    
}
