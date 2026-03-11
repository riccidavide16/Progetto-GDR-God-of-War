/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

/**
 *
 * @author Utente
 */
public class DatiPartita {
    
    private String nome;
    private int vita;
    private int attacco;
    private int turno;
    private int runa;

    public DatiPartita(String nome, int vita, int attacco, int turno, int runa) {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
        this.turno = turno;
        this.runa = runa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public int getRune(){
        return runa;
    }
    
    public void setRune(int runa){
        this.runa = runa;
    }
    
    
}
