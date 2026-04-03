/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

/**
 *
 * @author Utente
 */
public class EventoRisultato {
    
    private String testo;
    private String tipo;
    
    public EventoRisultato(String te , String t){
        this.testo = te;
        this.tipo = t;
        
    }

    public String getTesto() {
        return testo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
