/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import Aux.*;
import Classes.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumne
 */
public class Categories extends javax.swing.JFrame {

    public static LlistaCategories li;

    /**
     * Creates new form Categories
     */
    public Categories() {
        initComponents();
        setLocationRelativeTo(null);
        
        emplenarTaula();
    }
    
    
    //Metode per crear missatges/alertes.
    public void missatgeInici(String missatge, String titol) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        csvCat = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExportCSV = new javax.swing.JMenuItem();
        ImportCSV = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel1.setText("GESTIÓ DE CATEGORIES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Tornar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Baixa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificació");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setText("Busqueda:");

        jMenu1.setText("File");

        ExportCSV.setText("Export Categories to CSV file");
        ExportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportCSVActionPerformed(evt);
            }
        });
        jMenu1.add(ExportCSV);

        ImportCSV.setText("Import Categories from CSV file");
        ImportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportCSVActionPerformed(evt);
            }
        });
        jMenu1.add(ImportCSV);

        csvCat.add(jMenu1);

        setJMenuBar(csvCat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CategoriesAlta c = new CategoriesAlta();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int id = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            Moduls.ModulBaixa.baixaCategoria(id);
            emplenarTaula();
        } catch (Exception e){
            Dialog.dialog("No s'ha sel·leccionat cap entitat.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int id = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            
            CategoriesModificar e = new CategoriesModificar(id);
            e.setVisible(true);
            dispose();
            emplenarTaula();
        } catch (Exception e){
            Dialog.dialog("No s'ha sel·leccionat cap entitat.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        consulta(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyPressed

    private void ExportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportCSVActionPerformed
                
        
        CSV csv = new CSV(li);
        csv.exportCat();
        Filelog.importExportCategory(0);

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
            Filelog.importExportCategory(1);
            CSV.importarCategoria(ruta);
            //Missatges d'informacio
            missatgeInici("S'han importat els registres d'un fitxer CSV", "");
        } else {
            missatgeInici("Has cancelat l'importacio", "");
        }

        Categories mostra = new Categories(); //Mostrem resultats
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
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categories().setVisible(true);
            }
        });
    }
    
    public void emplenarTaula() {
        Object columnNames[] = {"ID", "Nom", "Descripció", "Estat"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (int i = 0; i < LlistaCategories.llistaCategoria.size(); i++) {

            Categoria e = LlistaCategories.returnList().get(i);
                Object rowData[] = {e.getId(), e.getName(), e.getDescription(), e.getStatus()};
                model.addRow(rowData);  
        }
        jTable1.setModel(model);
    }
    
    public void consulta(String filter) {

        Object columnNames[] = {"ID", "Nom", "Descripció", "Estat"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        for (int i = 0; i < LlistaCategories.llistaCategoria.size(); i++) {
            
            Categoria e = LlistaCategories.returnList().get(i);
            String x = e.toString();

            if (x.toLowerCase().contains(filter.toLowerCase())) {
                Object rowData[] = {e.getId(), e.getName(), e.getDescription(), e.getStatus()};
                model.addRow(rowData);
            }
        }
        jTable1.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExportCSV;
    private javax.swing.JMenuItem ImportCSV;
    private javax.swing.JMenuBar csvCat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
