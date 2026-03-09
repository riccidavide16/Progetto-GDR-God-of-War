/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

/**
 *
 * @author Utente
 */
public class Nemico {
    
    private String nome;
    private int vita;
    private int attacco;
    
    public Nemico(String nome,int vita,int attacco)
    {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
    }

    public String getNome() {
        return nome;
    }

    public int getVita() {
        return vita;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }
    
}
