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

    public String generaNemico() {
        int r1 = r.nextInt(3);

        if (r1 == 0) {
            return "Balder";
        }
        if (r1 == 1) {
            return "Odino";
        }
        return "Thor";
    }

    public EventoRisultato generaEvento(Personaggio p) {
        int evento = (int)(Math.random() * 3) + 1;
        EventoRisultato r = new EventoRisultato();

        if (evento == 1) {
            r.setTipo("Vita");
            r.setTesto("Un Dio Greco ti ha donato 20 punti vita");
            p.setVita(p.getVita() + 20);

        } else if (evento == 2) {

            r.setTipo("attacco");
            r.setTesto("Un Dio Greco crede in te e ti ha rafforzato con 5 di attacco");
            p.setAttacco(p.getAttacco() + 5);

        } else if (evento == 3) {
            r.setTipo("combattimento");
            r.setTesto("Il fato ha voleto che devi combattere");

            String n1 = generaNemico();
            r.setNomeNemico(n1);

        }

        return r;
    }

    public Nemico creaNemico(String nome) {

        if (nome.equals("Thor")) {
            return new Nemico("Thor", 50, 10);
        } else if (nome.equals("Baldur")) {
            return new Nemico("Baldur", 70, 12);
        } else {
            return new Nemico("Odino", 40, 15);
        }
    }
}
