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

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }
    
    public void attacca(Nemico n){
         n.setVita(n.getVita() - attacco);
    }
    
    public void aggiungiRuna(){
        rune++;
    }
    
    
    public void abilitàSpeciale(Nemico n)
    {
        if (eff == "Molt")
        {
           attacco = attacco * value;
        }
        else if (eff == "som"){
         
        n.setVita(n.getVita()-(attacco + 10));
        
        attacco = attacco + value;
        }  
        
        
    }
        
        
        
        
  }
    
    
   


