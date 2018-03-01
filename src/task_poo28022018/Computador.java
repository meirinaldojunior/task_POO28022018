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
public class Computador {
    
    String modelo;
    String processador;
    String fabricante;
    int    memoria;

    Computador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    
    
}
