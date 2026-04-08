/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

            BufferedWriter writer = new BufferedWriter(new FileWriter("salvataggio.txt"));

            writer.write(dati.getNome() + "\n");
            writer.write(dati.getVita() + "\n");
            writer.write(dati.getAttacco() + "\n");
            writer.write(dati.getRune() + "\n");
            writer.write(dati.getTurno() + "\n");

            writer.close();

        }
        catch (IOException e){
            
        }
    }
    public DatiPartita caricaPartita() throws FileNotFoundException, IOException{
        try {
            BufferedReader reader =  new BufferedReader(new FileReader("salvataggio.txt"));
            String nome = reader.readLine();
            int vita = Integer.parseInt(reader.readLine());
            int attacco = Integer.parseInt(reader.readLine());
            int turno = Integer.parseInt(reader.readLine());
            int runa = Integer.parseInt(reader.readLine());

            reader.close();
            
            return new DatiPartita(nome,vita,attacco,turno,runa);
        }
        catch (IOException e){
            return null;
        }
    }    
}
