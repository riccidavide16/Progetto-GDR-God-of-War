/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;


/**
 *
 * @author Utente
 */
public class Personaggio {
    
    private String nome;
    private int vita;
    private int attacco;
    private int rune;
    private String eff;
    private int value;
    private Personaggio p;

    public Personaggio(String nome, int vita, int attacco,String eff, int value) {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
        this.eff = eff;
        this.value = value;
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

    public int getRune() {
        return rune;
    }

    public void setRune(int rune) {
        this.rune = rune;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }
    
    public void attacca(Nemico n){
         n.setVita(n.getVita() - attacco);
    }
    
    public void subisciDanno(int danno) {
        vita -= danno;
        if (vita < 0){
             vita = 0;
        }
           
    }

    
    public void aggiungiRuna(){
        rune++;
    }
    
    
    public String abilitàSpeciale(Nemico n)
    {
        if (eff.equals("moltiplica"))
        {
           int danno = attacco * value;
           n.subisciDanno(danno);
           
           return "ABILITA' ATTIVATA : " + danno + "danni";
        }
        else if (eff.equals("somma")){
         
         p.setVita(p.getVita() + value);
         
         return"ABILITA' ATTIVATA : " + vita + "vita aggiunta";
        }  
        
        return "nessuna abulita";
    }
        
        
        
        
  }
    
    
   


