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
    
    
    private Nemico n1;
    private Personaggio p;
   

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
    
    public EventoRisultato combattimento(Personaggio p1){
        
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
            p1.setVita(0);
            ris += "Sei stato sconfitto ";
        }
        return new EventoRisultato(ris, "combattimento");
    }
    
    public EventoRisultato generaEvento(Personaggio p){
       int evento = r.nextInt(3) ;
       
        if(evento == 1){
            
            p.setVita(p.getVita()+20);
            return new EventoRisultato("Un Dio Greco di ha donato 20 di vita usala bene","Cura");
            
        }
        else if(evento == 2){
            
             p.setAttacco(p.getAttacco()+ 5);
             return new EventoRisultato("Un Dio Greco crede in te e ti ha rafforzato con 5 di attacco in piu","Attacco");
        }
        else {
           
             n1 = generaNemico();
            
            return combattimento(p);
        }
        
        
    }
    
    
}
