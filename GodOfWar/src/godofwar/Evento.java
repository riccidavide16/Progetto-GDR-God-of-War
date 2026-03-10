/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

import java.util.Random;

/**
 *
 * @author Utente
 */
public class Evento {
    
    Random r = new Random();
    
    private Personaggio p;
    private Nemico n;
    private int evento = r.nextInt(4) ;

    public Evento() {
        
    }
    
    
    public Nemico generaNemico(){
        Nemico[] nemici= {
            new Nemico("Baldur",80,12),
            new Nemico("Thor",100,18),
            new Nemico("Odino",90,15)
        
        };
        return nemici[r.nextInt(nemici.length)];
    }
    
    public void combattimento(Personaggio p1, Nemico n1){
        String ris = "hai incontrato"+ n1.getNome();
         while(n1.getVita() > 0 && p1.getVita() > 0) {

            n1.setVita(n1.getVita() - p1.getAttacco());

            if(n1.getVita() > 0) {
                p1.setVita(p1.getVita() - n1.getAttacco());
            }
        }

        if(p1.getVita() > 0) {
            p1.aggiungiRuna();
            ris += "Hai sconfitto " + n1.getNome() + " e ottenuto 1 runa";
        }
        else {
            ris += "Sei stato sconfitto";
        }
    }
    
    public Void generaEvento(){
      
        if(evento == 0){
            p.setVita(p.getVita()+20);
            
        }
        else if(evento == 1){
            p.setAttacco(p.getAttacco()+ 5);
           
        }
        else  if(evento == 2){
             n = generaNemico();
            combattimento(p,n);
        }
        
        return null;
        
        
    }
    
    
}
