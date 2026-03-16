/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Utente
 */
public class FileManager {
    
    
    private String file = "salvataggio.txt";
    
    public void salvaPartita(DatiPartita dati) throws IOException {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            writer.write(dati.getNome());
            writer.write(dati.getVita());
            writer.write(dati.getAttacco());
            writer.write(dati.getRune());
            writer.write(dati.getTurno());

            writer.close();

        }
        catch (IOException e){
            
        }
    }
    public void caricaPartita(){
        
    }    
}
