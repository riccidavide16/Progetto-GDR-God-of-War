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
    private Nemico n;
    private int turno;
    private boolean partitaFinita;
    private boolean inCombattimento;
    
    
    
    
    

    public GameManager(Personaggio p) {
        this.p = p;
        this.turno = 0;
        this.partitaFinita = false;
        this.inCombattimento = false;
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
       if(risultato.getTipo().equals("combattimento")){
           n = evento.creaNemico(risultato.getNomeNemico());
           inCombattimento = true;
       }
       turno++;

       
       return risultato;
    }
    public String attacco(){
        n.setVita(n.getVita() - p.getAttacco());

        String testo = "Colpito il SELCIARINO, ";
        if(n.getVita() < 0){
            testo += "Hai sconfitto " + n.getNome();
            inCombattimento = false;
            return testo;
        }
        p.subisciDanno(n.getAttacco());
        testo += "Il SELCIARINO ti ha colpito";
        if(p.getVita() < 0){
            partitaFinita = true;
            testo += "Sei morto, Vergognati";
        }
        
        return testo;
    }
    
    public String abilitaSpeciale() {

    if (!inCombattimento) return "Non sei in combattimento";

    String risultato = p.abilitàSpeciale(n);

    // controllo morte nemico
    if (!n.isVivo()) {
        risultato += "\nHai sconfitto " + n.getNome();
        inCombattimento = false;
        n = null;
    }

    return risultato;
}
    
}
