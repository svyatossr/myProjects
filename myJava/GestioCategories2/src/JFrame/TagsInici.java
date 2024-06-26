package JFrame;

import Classes.*;
import static Classes.Categoria.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */


public class TagsInici extends javax.swing.JFrame {

    public static LlistaCategories li;
    public static boolean start = true;
    
    /**
     * Creates new form inici
     */
    public TagsInici(LlistaCategories li) {
        this.li = li;
        
        //LlistaCategories.init();
        initComponents();
        this.setLocationRelativeTo(null);                   //Centrar el frame al executar-se.
        
        int contTags = getNumeroTags();     
        conTags.setText(String.valueOf(contTags));     //Mostrem la quantitat de categories enregistrades.
        conTags.setHorizontalAlignment(conTags.CENTER);   /* centrem text */
        
        if (start == true) {
            Filelog.createFile();
            start = false;
            LlistaCategories.init();
        }
        
    }
    
    //Metode per crear missatges/alertes.
    public void missatgeInici (String missatge, String titol){
        JOptionPane.showMessageDialog(null, missatge, titol, JOptionPane.INFORMATION_MESSAGE);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JLabel();
        Consulta = new javax.swing.JButton();
        Alta = new javax.swing.JButton();
        Modifica = new javax.swing.JButton();
        conTags = new javax.swing.JLabel();
        Info1 = new javax.swing.JLabel();
        elimina = new javax.swing.JButton();
        Info2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExportCSV = new javax.swing.JMenuItem();
        ImportCSV = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GestioCategories - Inici");
        setPreferredSize(new java.awt.Dimension(550, 450));

        text1.setText("CATEGORIES EXISTENTS");
        text1.setToolTipText("");

        Consulta.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Consulta.setText("CONSULTA");
        Consulta.setActionCommand("");
        Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaActionPerformed(evt);
            }
        });

        Alta.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Alta.setText("ALTA");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });

        Modifica.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Modifica.setText("MODIFICA");
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });

        conTags.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        conTags.setToolTipText("");
        conTags.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                conTagsComponentAdded(evt);
            }
        });

        Info1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Info1.setText("GESTIO DE CATEGORIES");
        Info1.setToolTipText("");
        Info1.setPreferredSize(new java.awt.Dimension(148, 18));

        elimina.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        elimina.setText("ELIMINA");
        elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaActionPerformed(evt);
            }
        });

        Info2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Info2.setText("PROGRAMA");
        Info2.setToolTipText("");
        Info2.setPreferredSize(new java.awt.Dimension(148, 18));

        jMenu1.setText("File");

        ExportCSV.setText("Export to CSV file");
        ExportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportCSVActionPerformed(evt);
            }
        });
        jMenu1.add(ExportCSV);

        ImportCSV.setText("Import from CSV file");
        ImportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportCSVActionPerformed(evt);
            }
        });
        jMenu1.add(ImportCSV);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(Info2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(Info1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text1)
                                .addGap(76, 76, 76)
                                .addComponent(conTags, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(Alta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Modifica, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(elimina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Info2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Info1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elimina)
                            .addComponent(Alta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modifica)
                            .addComponent(Consulta))
                        .addGap(51, 51, 51)
                        .addComponent(text1)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(conTags, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaActionPerformed
        /****************************************/
        // Anem a la finestra de consulta
        TagsConsulta BOTOconsulta = new TagsConsulta();
        BOTOconsulta.setVisible(true);       //la fem visible
        dispose();                           //eliminem la finestra actual
        /****************************************/
    }//GEN-LAST:event_ConsultaActionPerformed

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaActionPerformed
        /****************************************/
        // Anem a la finestra d'alta
        TagsAlta BOTOalta = new TagsAlta();
        BOTOalta.setVisible(true);       //la fem visible
        dispose();                       //eliminem la finestra actual
        /****************************************/
    }//GEN-LAST:event_AltaActionPerformed

    private void ModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaActionPerformed
        /****************************************/
        // Anem a la finestra de modificar
        TagsModificaFiltre BOTOmodifica = new TagsModificaFiltre();
        BOTOmodifica.setVisible(true);       //la fem visible
        dispose();                           //eliminem la finestra actual
        /****************************************/
    }//GEN-LAST:event_ModificaActionPerformed

    private void conTagsComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_conTagsComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_conTagsComponentAdded

    private void eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaActionPerformed
        TagsElimina elimina = new TagsElimina();
        elimina.setVisible(true);            //la fem visible
        dispose();
    }//GEN-LAST:event_eliminaActionPerformed

    private void ExportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportCSVActionPerformed
        CSV csv = new CSV(li);
        csv.export();
        
        //Missatges d'informacio
        missatgeInici("S'han exportat els registres a un fitxer CSV", "GestioCategories - Inici");
    }//GEN-LAST:event_ExportCSVActionPerformed

    private void ImportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportCSVActionPerformed
        
        JFileChooser buscadorArxiu = new JFileChooser();
        buscadorArxiu.setCurrentDirectory(new java.io.File("."));
        buscadorArxiu.setDialogTitle("Selecciona el fitxer .csv per IMPORTAR");
        buscadorArxiu.setAcceptAllFileFilterUsed(false);
        String ruta = "";

        if (buscadorArxiu.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + buscadorArxiu.getCurrentDirectory());
            System.out.println("getSelectedFile(): " + buscadorArxiu.getSelectedFile());
            ruta = buscadorArxiu.getSelectedFile().getPath();
            CSV.importar(ruta);
        } else {
            System.out.println("No Selection ");
        }
        
        
        //Missatges d'informacio
        missatgeInici("S'han importat els registres d'un fitxer CSV", "GestioCategories - Inici");
        
        TagsConsulta mostra = new TagsConsulta(); //Mostrem resultats
        mostra.setVisible(true);            //la fem visible
        dispose();
    }//GEN-LAST:event_ImportCSVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TagsInici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TagsInici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TagsInici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TagsInici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TagsInici(li).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alta;
    private javax.swing.JButton Consulta;
    private javax.swing.JMenuItem ExportCSV;
    private javax.swing.JMenuItem ImportCSV;
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel Info2;
    private javax.swing.JButton Modifica;
    private javax.swing.JLabel conTags;
    private javax.swing.JButton elimina;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
