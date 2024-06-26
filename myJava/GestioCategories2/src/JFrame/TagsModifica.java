package JFrame;

import Classes.*;
import javax.swing.JOptionPane;



/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class TagsModifica extends javax.swing.JFrame {

    /**
     * Creates new form GestioEmpreses_Modifica
     */
    public TagsModifica() {
        initComponents();
        //Centrar el frame al executar-se.
        this.setLocationRelativeTo(null);
        
        //Numero de ID de empresa que hem escollit, a partir de getFiltre()
        int id = TagsModificaFiltre.getFiltre();
        nextTag.setText(String.valueOf(id));
        
        //Mostrem les dades anteriors que volem modificar del objecte
        CampNom.setText(LlistaCategories.ArrayTags.get(id).getName());
        CampDesc.setText(LlistaCategories.ArrayTags.get(id).getDesc());
        
    }
    
    //Metode per crear missatges/alertes.
    public void missatgeModifica (String missatge, String titol){
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

        Inici = new javax.swing.JButton();
        Consulta = new javax.swing.JButton();
        Alta = new javax.swing.JButton();
        Modifica = new javax.swing.JButton();
        Info2 = new javax.swing.JLabel();
        Info3 = new javax.swing.JLabel();
        nextTag = new javax.swing.JLabel();
        CampNom = new javax.swing.JTextField();
        CampDesc = new javax.swing.JTextField();
        confirma = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        elimina = new javax.swing.JButton();
        Info1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GestioCategories - Modifica");
        setPreferredSize(new java.awt.Dimension(550, 450));

        Inici.setText("INICI");
        Inici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciActionPerformed(evt);
            }
        });

        Consulta.setText("CONSULTA");
        Consulta.setActionCommand("");
        Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaActionPerformed(evt);
            }
        });

        Alta.setText("ALTA");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });

        Modifica.setText("MODIFICA");
        Modifica.setSelected(true);
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });

        Info2.setText("CATEGORIA:");
        Info2.setToolTipText("");

        Info3.setText("DESCRIPCIO:");
        Info3.setToolTipText("");

        nextTag.setToolTipText("");

        CampNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampNomActionPerformed(evt);
            }
        });

        CampDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampDescActionPerformed(evt);
            }
        });

        confirma.setText("CONFIRMA");
        confirma.setActionCommand("");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        cancela.setText("CANCELA");
        cancela.setActionCommand("");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });

        elimina.setText("ELIMINA");
        elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaActionPerformed(evt);
            }
        });

        Info1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Info1.setText("MODIFICA UNA CATEGORIA");
        Info1.setToolTipText("");
        Info1.setPreferredSize(new java.awt.Dimension(148, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Info3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Info2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nextTag, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(CampNom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CampDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Inici, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(elimina, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(Modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Info1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Info1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consulta)
                    .addComponent(Alta)
                    .addComponent(Inici)
                    .addComponent(Modifica)
                    .addComponent(elimina))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextTag, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Info2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(Info3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancela)
                    .addComponent(confirma))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciActionPerformed
        /****************************************/
        // Tornem a la finestra principal
        TagsInici BOTOinici = new TagsInici(TagsInici.li);
        BOTOinici.setVisible(true);            //la fem visible
        dispose();                             //eliminem la finestra actual
        /****************************************/
    }//GEN-LAST:event_IniciActionPerformed

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

    private void CampNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampNomActionPerformed

    private void CampDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampDescActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        
        //Modificacio d'una empresa
        Moduls.ModulModifica.ModificaCategoria(Integer.parseInt(nextTag.getText()), CampNom.getText(), CampDesc.getText());
        
        //Missatges d'informacio
        missatgeModifica("S'ha modificat la categoria", "GetioCategories - Modifica");
        
        //Tornariem enrere.  
        TagsConsulta enrere = new TagsConsulta();
        enrere.setVisible(true);
        dispose();
    }//GEN-LAST:event_confirmaActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        // Tornem a la finestra principal
        TagsInici BOTOinici = new TagsInici(TagsInici.li);
        BOTOinici.setVisible(true);            //la fem visible
        dispose();                             //eliminem la finestra actual
    }//GEN-LAST:event_cancelaActionPerformed

    private void eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaActionPerformed
        TagsElimina elimina = new TagsElimina();
        elimina.setVisible(true);            //la fem visible
        dispose();
    }//GEN-LAST:event_eliminaActionPerformed

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
            java.util.logging.Logger.getLogger(TagsModifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TagsModifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TagsModifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TagsModifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TagsModifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alta;
    private javax.swing.JTextField CampDesc;
    private javax.swing.JTextField CampNom;
    private javax.swing.JButton Consulta;
    private javax.swing.JLabel Info1;
    private javax.swing.JLabel Info2;
    private javax.swing.JLabel Info3;
    private javax.swing.JButton Inici;
    private javax.swing.JButton Modifica;
    private javax.swing.JButton cancela;
    private javax.swing.JButton confirma;
    private javax.swing.JButton elimina;
    private javax.swing.JLabel nextTag;
    // End of variables declaration//GEN-END:variables
}
