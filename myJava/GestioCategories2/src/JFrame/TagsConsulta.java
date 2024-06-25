package JFrame;

import javax.swing.table.DefaultTableModel;
import Classes.*;
import static Classes.Categoria.getNumeroTags;
import java.util.*;
import javax.swing.JOptionPane;



/**
 * 
 * Programa per gestionar les categories
 * 04/02/2020
 * @author svyatossemenyuk
 * GRUP 1: Xavi Naves - Xavier Romeu - Javier Perez - Svyatos Semenyuk
 * @version v5 (versio final, amb CRUD, CSV import/export, Logs, ArrayList tot)
 */

public class TagsConsulta extends javax.swing.JFrame {
    
    public static LlistaCategories li;
    
    /**
     * Creates new form Consulta
     */
    public TagsConsulta() {
        initComponents();
        
        //Emplenar Taula amb DADES.
        emplenarTaula();
        //Centrar el frame al executar-se.
        this.setLocationRelativeTo(null);
        
        //Missatge d'error en cas de que no hi hagin TAGS per mostrar.
        int contTags = getNumeroTags(); 
        if (contTags == 0) {
            missatgeCons("No hi han categories per mostrar!", "GestioCategories - Consulta");
        }
        
        
        
    }

    //Metode per crear missatges/alertes.
    public void missatgeCons (String missatge, String titol){
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

        info1 = new javax.swing.JLabel();
        Inici = new javax.swing.JButton();
        Consulta = new javax.swing.JButton();
        Alta = new javax.swing.JButton();
        Modifica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TextField_Filter = new javax.swing.JTextField();
        elimina = new javax.swing.JButton();
        Info1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GestioCategories - Consulta");
        setPreferredSize(new java.awt.Dimension(550, 450));

        info1.setText("Totes les CATEGORIES:");
        info1.setToolTipText("");

        Inici.setText("INICI");
        Inici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciActionPerformed(evt);
            }
        });

        Consulta.setText("CONSULTA");
        Consulta.setActionCommand("");
        Consulta.setSelected(true);
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
        Modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        TextField_Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_FilterActionPerformed(evt);
            }
        });
        TextField_Filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_FilterKeyTyped(evt);
            }
        });

        elimina.setText("ELIMINA");
        elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaActionPerformed(evt);
            }
        });

        Info1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Info1.setText("CONSULTA DE CATEGORIES");
        Info1.setToolTipText("");
        Info1.setPreferredSize(new java.awt.Dimension(148, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Info1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Inici, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elimina, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(info1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Info1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consulta)
                    .addComponent(Alta)
                    .addComponent(Inici)
                    .addComponent(elimina)
                    .addComponent(Modifica))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
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

    private void TextField_FilterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_FilterKeyTyped
        consulta(TextField_Filter.getText());    }//GEN-LAST:event_TextField_FilterKeyTyped

    private void TextField_FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_FilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_FilterActionPerformed

    private void eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaActionPerformed
        /****************************************/
        // Anem a la finestra d'eliminar
        TagsElimina BOTOalta = new TagsElimina();
        BOTOalta.setVisible(true);       //la fem visible
        dispose();                       //eliminem la finestra actual
        /****************************************/    }//GEN-LAST:event_eliminaActionPerformed

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
            java.util.logging.Logger.getLogger(TagsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TagsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TagsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TagsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TagsConsulta().setVisible(true);
            }
        });
    }
    
        // Aquest mètode s'encarrega de aplicar un filtre i retornar les incidències que coincideixin
//    public void consulta(String filter) {
//
//        Object columnNames[] = {"ID", "Nom", "Descripcio"};
//        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//        
//        int max = Categoria.getNumeroTags();
//        
//        for (int i = 0; i < max; i++) {
//            Categoria tag1 = LlistaCategories.returnList()[i];
//            String x = tag1.toString2(tag1);
//
//            if (x.toLowerCase().contains(filter.toLowerCase())) {
//                Object rowData[] = {tag1.getId_tag(), tag1.getName(), tag1.getDesc()};
//                model.addRow(rowData);
//            }
//        }
//        jTable1.setModel(model);
//
//    }
 
    
    // METODES
    public void consulta(String filter) {

        Object columnNames[] = {"ID", "Nom", "Descripcio"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        ListIterator tagIter = LlistaCategories.ArrayTags.listIterator();
        
        
        while (tagIter.hasNext()) {
            Categoria e = LlistaCategories.ArrayTags.get(tagIter.nextIndex());

            String x = Categoria.toString(e);

            if (x.toLowerCase().contains(filter.toLowerCase())) {
                
                Object rowData[] = {e.getId_tag(), e.getName(), e.getDesc()};
                model.addRow(rowData);
                
            }
            tagIter.next();
        }
        jTable1.setModel(model);

    }
    
    
    
    
    
//    // Metode per emplenar la taula
//    public void emplenarTaula() {
//        Object columnNames[] = {"ID", "Nom", "Descripcio"};
//        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//        
//        int max = Categoria.getNumeroTags();
//        
//        for (int i = 0; i < max; i++) {
//
//            Categoria e = LlistaCategories.returnList()[i];
//            Object rowData[] = {e.getId_tag(), e.getName(), e.getDesc()};
//            model.addRow(rowData);
//        }
//        jTable1.setModel(model);
//    }

    // Plena la taula amb les incidències de l'array
    public void emplenarTaula() {
        
       
        Object columnNames[] = {"ID", "Nom", "Descripcio"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        ListIterator tagIter = LlistaCategories.ArrayTags.listIterator();
        
        while (tagIter.hasNext()) {
            Categoria e = LlistaCategories.ArrayTags.get(tagIter.nextIndex());
                Object rowData[] = {e.getId_tag(), e.getName(), e.getDesc()};
                model.addRow(rowData);
            tagIter.next();
        }
        
        
        jTable1.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alta;
    private javax.swing.JButton Consulta;
    private javax.swing.JLabel Info1;
    private javax.swing.JButton Inici;
    private javax.swing.JButton Modifica;
    private javax.swing.JTextField TextField_Filter;
    private javax.swing.JButton elimina;
    private javax.swing.JLabel info1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}