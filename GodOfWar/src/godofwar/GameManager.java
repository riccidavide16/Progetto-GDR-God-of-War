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
    

    public GameManager(Personaggio p) {
        this.p = p;
        this.turno = 0;
        this.partitaFinita = false;
    }
    
    public void avviaGioco(){
        
       evento.generaEvento();
       turno++;
       if(turno ==10){
           
       }
    }
    
}
