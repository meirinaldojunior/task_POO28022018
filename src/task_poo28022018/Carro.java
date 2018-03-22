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
public class Carro {
    
    private String carro;
    private String modelo;
    private String fabricante;
    private int    ano;

    Carro() {
        
    }

    public String getCarro(){
        return carro;
    }
    
    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setCarro(String carro){
        this.carro = carro;
    }
    
    public void imprimeCarro(Carro carro){
        System.out.println("================================");
        System.out.println("Carro Cadastrado: "+carro.carro);
        System.out.println("Modelo do carro: "+carro.modelo);
    }
    
    
    
}
