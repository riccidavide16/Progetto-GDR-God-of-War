/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Utente
 */
public class FileManager {
    
    
    private String file = "salvataggio.txt";
    
    public void salvaPartita(DatiPartita dati) throws IOException {

        try {

            PrintWriter writer = new PrintWriter(new FileWriter(file));

            writer.println(dati.getNome());
            writer.println(dati.getVita());
            writer.println(dati.getAttacco());
            writer.println(dati.getRune());
            writer.println(dati.getTurno());

            writer.close();


        }
        catch (IOException e){
            
        }
    }
    
}
