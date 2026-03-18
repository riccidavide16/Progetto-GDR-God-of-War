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
    private String risp;
    

    public GameManager(Personaggio p) {
        this.p = p;
        this.turno = 1;
        this.partitaFinita = false;
        evento = new Evento();
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
    public String avviaGioco(){
        
       evento.generaEvento(p);
       risp = " turno" + turno;
       turno++;
       if(turno == 10){
           partitaFinita = true;
       }
       return risp;
    }
    
}
