/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package godofwar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Utente
 */
public class FileManager {

    private static final String FILE_TXT = "salvataggio.txt";
    private static final String FILE_SER = "salvataggio.dat";

    public void salvaPartita(DatiPartita dati) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_TXT))) {
            writer.write(dati.getNome() + "\n");
            writer.write(dati.getVita() + "\n");
            writer.write(dati.getAttacco() + "\n");
            writer.write(dati.getRune() + "\n");
            writer.write(dati.getTurno() + "\n");
        }
    }

    public DatiPartita caricaPartita() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_TXT))) {
            String nome = reader.readLine();
            int vita = Integer.parseInt(reader.readLine());
            int attacco = Integer.parseInt(reader.readLine());
            int runa = Integer.parseInt(reader.readLine());
            int turno = Integer.parseInt(reader.readLine());

            return new DatiPartita(nome, vita, attacco, turno, runa);
        }
    }

    public void salvaPartitaSer(GameManager game) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_SER))) {
            out.writeObject(game);
        }
    }

    public GameManager caricaPartitaSer() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_SER))) {
            return (GameManager) in.readObject();
        }
    }
}
