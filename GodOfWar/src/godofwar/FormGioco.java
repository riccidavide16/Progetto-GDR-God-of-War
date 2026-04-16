/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package godofwar;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Utente
 */
public class FormGioco extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormGioco.class.getName());
    private final FileManager fileManager = new FileManager();
    private Personaggio personaggio;
    private GameManager game;

    public FormGioco(Personaggio p) {
        this(new GameManager(p));
    }

    public FormGioco(GameManager game) {
        this.game = game;
        this.personaggio = game.getPersonaggio();
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        aggiornaInterfaccia();
        aggiornaImmagine();
        lbl_Evento.setHorizontalAlignment(JLabel.CENTER);
        lbl_Evento.setVerticalAlignment(JLabel.CENTER);
        lbl_Evento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }

    private void aggiornaInterfaccia() {
        lbl_valueVita.setText(" " + personaggio.getVita());
        lbl_valueRuna.setText(" " + personaggio.getRune());
        lbl_valueAttacco.setText(" " + personaggio.getAttacco());
        lbl_turnoValue.setText(" " + game.getTurno());
    }

    private void aggiornaImmagine() {

        if (personaggio.getNome().equals("Kratos")) {
            lbl_Personaggio.setIcon(new ImageIcon("src/immagini/kratos_PS4.png"));
        }

        if (personaggio.getNome().equals("Atreus")) {
            lbl_Personaggio.setIcon(new ImageIcon("src/immagini/Not_atreus_of_sparta.webp-removebg-preview.png/"));
        }

        if (personaggio.getNome().equals("Freya")) {
            lbl_Personaggio.setIcon(new ImageIcon("src/immagini/Freya_Render_God_Of_War_2018.png/"));
        }
    }

    private void setImage(String path) {

        java.net.URL url = getClass().getResource(path);

        if (url == null) {
            System.out.println("Immagine NON trovata: " + path);
            return;
        }

        ImageIcon icon = new ImageIcon(url);

        Image img = icon.getImage().getScaledInstance(
                lbl_Evento.getWidth(),
                lbl_Evento.getHeight(),
                Image.SCALE_SMOOTH
        );

        lbl_Evento.setIcon(new ImageIcon(img));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btm_AbilitaSpeciale = new javax.swing.JButton();
        lbl_runa = new javax.swing.JLabel();
        btm_Attacca = new javax.swing.JButton();
        lbl_valueRuna = new javax.swing.JLabel();
        lbl_Personaggio = new javax.swing.JLabel();
        lbl_Vita1 = new javax.swing.JLabel();
        lbl_valueVita = new javax.swing.JLabel();
        lbl_Evento = new javax.swing.JLabel();
        bmt_SalvaPartita = new javax.swing.JButton();
        salvaSer = new javax.swing.JButton();
        caricaSer = new javax.swing.JButton();
        lbl_attacco = new javax.swing.JLabel();
        lbl_valueAttacco = new javax.swing.JLabel();
        btm_turno = new javax.swing.JButton();
        lbl_turno = new javax.swing.JLabel();
        lbl_turnoValue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaEventi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        btm_AbilitaSpeciale.setBackground(new java.awt.Color(101, 119, 171));
        btm_AbilitaSpeciale.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 18)); // NOI18N
        btm_AbilitaSpeciale.setText("Abilita' Speciale");
        btm_AbilitaSpeciale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_AbilitaSpecialeActionPerformed(evt);
            }
        });
        jPanel1.add(btm_AbilitaSpeciale);
        btm_AbilitaSpeciale.setBounds(340, 690, 200, 30);

        lbl_runa.setBackground(new java.awt.Color(255, 255, 255));
        lbl_runa.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 2, 24)); // NOI18N
        lbl_runa.setForeground(new java.awt.Color(255, 255, 255));
        lbl_runa.setText("RUNE");
        lbl_runa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbl_runa);
        lbl_runa.setBounds(40, 720, 110, 28);

        btm_Attacca.setBackground(new java.awt.Color(101, 119, 171));
        btm_Attacca.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 18)); // NOI18N
        btm_Attacca.setText("Attacca");
        btm_Attacca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_AttaccaActionPerformed(evt);
            }
        });
        jPanel1.add(btm_Attacca);
        btm_Attacca.setBounds(340, 650, 200, 30);

        lbl_valueRuna.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 2, 24)); // NOI18N
        lbl_valueRuna.setForeground(new java.awt.Color(242, 242, 242));
        lbl_valueRuna.setText("0");
        jPanel1.add(lbl_valueRuna);
        lbl_valueRuna.setBounds(150, 720, 100, 30);

        lbl_Personaggio.setForeground(new java.awt.Color(242, 242, 242));
        jPanel1.add(lbl_Personaggio);
        lbl_Personaggio.setBounds(70, 160, 310, 420);

        lbl_Vita1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Vita1.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 2, 24)); // NOI18N
        lbl_Vita1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Vita1.setText("Vita");
        lbl_Vita1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbl_Vita1);
        lbl_Vita1.setBounds(40, 640, 70, 28);

        lbl_valueVita.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 2, 24)); // NOI18N
        lbl_valueVita.setForeground(new java.awt.Color(242, 242, 242));
        lbl_valueVita.setText("0");
        jPanel1.add(lbl_valueVita);
        lbl_valueVita.setBounds(130, 640, 100, 30);
        jPanel1.add(lbl_Evento);
        lbl_Evento.setBounds(520, 180, 430, 410);

        bmt_SalvaPartita.setBackground(new java.awt.Color(101, 119, 171));
        bmt_SalvaPartita.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 18)); // NOI18N
        bmt_SalvaPartita.setText("Salva Partita");
        bmt_SalvaPartita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmt_SalvaPartitaActionPerformed(evt);
            }
        });
        jPanel1.add(bmt_SalvaPartita);
        bmt_SalvaPartita.setBounds(20, 20, 170, 30);

        salvaSer.setBackground(new java.awt.Color(101, 119, 171));
        salvaSer.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 18)); // NOI18N
        salvaSer.setText("salvaSer");
        salvaSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaSerActionPerformed(evt);
            }
        });
        jPanel1.add(salvaSer);
        salvaSer.setBounds(210, 20, 170, 30);

        caricaSer.setBackground(new java.awt.Color(101, 119, 171));
        caricaSer.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 18)); // NOI18N
        caricaSer.setText("caricaSer");
        caricaSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caricaSerActionPerformed(evt);
            }
        });
        jPanel1.add(caricaSer);
        caricaSer.setBounds(400, 20, 170, 30);

        lbl_attacco.setBackground(new java.awt.Color(255, 255, 255));
        lbl_attacco.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 2, 24)); // NOI18N
        lbl_attacco.setForeground(new java.awt.Color(255, 255, 255));
        lbl_attacco.setText("Attacco");
        lbl_attacco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbl_attacco);
        lbl_attacco.setBounds(40, 680, 110, 28);

        lbl_valueAttacco.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 2, 24)); // NOI18N
        lbl_valueAttacco.setForeground(new java.awt.Color(242, 242, 242));
        lbl_valueAttacco.setText("0");
        jPanel1.add(lbl_valueAttacco);
        lbl_valueAttacco.setBounds(180, 680, 100, 30);

        btm_turno.setBackground(new java.awt.Color(101, 119, 171));
        btm_turno.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 18)); // NOI18N
        btm_turno.setText("Esplora");
        btm_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_turnoActionPerformed(evt);
            }
        });
        jPanel1.add(btm_turno);
        btm_turno.setBounds(570, 650, 140, 70);

        lbl_turno.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 24)); // NOI18N
        lbl_turno.setForeground(new java.awt.Color(242, 242, 242));
        lbl_turno.setText("TURNO");
        jPanel1.add(lbl_turno);
        lbl_turno.setBounds(510, 40, 130, 40);

        lbl_turnoValue.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 24)); // NOI18N
        lbl_turnoValue.setForeground(new java.awt.Color(242, 242, 242));
        lbl_turnoValue.setText("0");
        jPanel1.add(lbl_turnoValue);
        lbl_turnoValue.setBounds(650, 40, 70, 40);

        areaEventi.setEditable(false);
        areaEventi.setBackground(new java.awt.Color(0, 0, 0));
        areaEventi.setColumns(20);
        areaEventi.setFont(new java.awt.Font("Kratos TrueType - GOD $ WAR", 0, 14)); // NOI18N
        areaEventi.setForeground(new java.awt.Color(242, 242, 242));
        areaEventi.setRows(5);
        jScrollPane1.setViewportView(areaEventi);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(970, 10, 460, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utente\\Desktop\\Progetto-GDR God of War\\GodOfWar\\SfondoPersonaggio.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -80, 1430, 990);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1430, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_turnoActionPerformed

        EventoRisultato risultato = game.avviaGioco();
        areaEventi.setText("turno :" + game.getTurno() + "\n" + risultato.getTesto());
        lbl_valueVita.setText(" " + personaggio.getVita());
        lbl_valueRuna.setText(" " + personaggio.getRune());
        lbl_valueAttacco.setText(" " + personaggio.getAttacco());
        lbl_turnoValue.setText(" " + game.getTurno());

        if ("Combattimento".equalsIgnoreCase(risultato.getTipo())) {
            URL url2 = getClass().getResource("/immagini/balder.png");
            if (url2 == null) {
                System.out.println("ERRORE: immagine NON trovata!");
            } else {
                lbl_Evento.setIcon(new ImageIcon(url2));
            }
        } else if ("attacco".equalsIgnoreCase(risultato.getTipo())) {
            URL url1 = getClass().getResource("/immagini/dio_forza.png");
            if (url1 == null) {
                System.out.println("ERRORE: immagine NON trovata!");
            } else {
                lbl_Evento.setIcon(new ImageIcon(url1));
            }
        } else if ("cura".equalsIgnoreCase(risultato.getTipo()) || "vita".equalsIgnoreCase(risultato.getTipo())) {
            setImage("/immagini/vita.png");
        }

    }//GEN-LAST:event_btm_turnoActionPerformed

    private void bmt_SalvaPartitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmt_SalvaPartitaActionPerformed
        DatiPartita dati = new DatiPartita(
                personaggio.getNome(),
                personaggio.getVita(),
                personaggio.getAttacco(),
                game.getTurno(),
                personaggio.getRune()
        );

        try {
            fileManager.salvaPartita(dati);
            areaEventi.setText("Partita testuale salvata.");
        } catch (IOException ex) {
            areaEventi.setText("Errore nel salvataggio testuale: " + ex.getMessage());
        }
    }//GEN-LAST:event_bmt_SalvaPartitaActionPerformed

    private void salvaSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaSerActionPerformed
        try {
            fileManager.salvaPartitaSer(game);
            areaEventi.setText("Partita serializzata salvata.");
        } catch (IOException ex) {
            areaEventi.setText("Errore nel salvataggio serializzato: " + ex.getMessage());
        }
    }//GEN-LAST:event_salvaSerActionPerformed

    private void caricaSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caricaSerActionPerformed
        try {
            GameManager caricato = fileManager.caricaPartitaSer();
            this.game = caricato;
            this.personaggio = caricato.getPersonaggio();
            aggiornaInterfaccia();
            aggiornaImmagine();
            areaEventi.setText("Partita serializzata caricata.");
        } catch (IOException | ClassNotFoundException ex) {
            areaEventi.setText("Errore nel caricamento serializzato: " + ex.getMessage());
        }
    }//GEN-LAST:event_caricaSerActionPerformed

    private void btm_AttaccaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_AttaccaActionPerformed
        String ris = game.attacco();
        areaEventi.setText(ris);
        aggiornaInterfaccia();
    }//GEN-LAST:event_btm_AttaccaActionPerformed

    private void btm_AbilitaSpecialeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_AbilitaSpecialeActionPerformed
        String ris = game.abilitaSpeciale();
        areaEventi.setText(ris);
        aggiornaInterfaccia();
    }//GEN-LAST:event_btm_AbilitaSpecialeActionPerformed

    public static void main(String args[]) {

        Personaggio p = new Personaggio("Kratos", 120, 15, "moltiplica", 2);

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new FormGioco(p).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEventi;
    private javax.swing.JButton bmt_SalvaPartita;
    private javax.swing.JButton btm_AbilitaSpeciale;
    private javax.swing.JButton btm_Attacca;
    private javax.swing.JButton btm_turno;
    private javax.swing.JButton caricaSer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Evento;
    private javax.swing.JLabel lbl_Personaggio;
    private javax.swing.JLabel lbl_Vita1;
    private javax.swing.JLabel lbl_attacco;
    private javax.swing.JLabel lbl_runa;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JLabel lbl_turnoValue;
    private javax.swing.JLabel lbl_valueAttacco;
    private javax.swing.JLabel lbl_valueRuna;
    private javax.swing.JLabel lbl_valueVita;
    private javax.swing.JButton salvaSer;
    // End of variables declaration//GEN-END:variables
}
