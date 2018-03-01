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
    
    String modelo;
    String fabricante;
    int    ano;

    public Carro(String modelo, String fabricante, int ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
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
    
    
    
}
