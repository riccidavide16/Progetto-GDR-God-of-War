/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;


/**
 *
 * @author Utente
 */
public class GameManager {
    private Personaggio p;
    private Evento evento;
    private int turno;
    private boolean partitaFinita;
    private String eventoTesto ;
    
    
    

    public GameManager(Personaggio p) {
        this.p = p;
        this.turno = 0;
        this.partitaFinita = false;
        evento = new Evento();
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
   

    public Personaggio getPersonaggio() {
        return p;
    }
    
    
    public EventoRisultato avviaGioco(){
        
      partitaFinita = false;
      if(turno == 10 || p.getVita() == 0){
           
           partitaFinita = true;
       }
       
       EventoRisultato risultato = evento.generaEvento(p);
       turno++;

       
       
       
       return risultato;
    }
    
}
