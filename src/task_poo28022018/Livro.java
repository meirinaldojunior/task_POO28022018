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
public class Livro {
    
    private String nome;
    private String editora;
    private String escritor;
    private int    anoPub;

    public Livro(String nome, String editora, String escritor, int anoPub) {
        this.nome = nome;
        this.editora = editora;
        this.escritor = escritor;
        this.anoPub = anoPub;
    }

    public String getNome() {
        return nome;
    }

    public String getEditora() {
        return editora;
    }

    public String getEscritor() {
        return escritor;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
    
    
}