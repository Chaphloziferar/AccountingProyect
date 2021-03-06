/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Hijo;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author PC 2
 */
public class Ver_Hijos extends javax.swing.JFrame {

    DefaultTableModel model;
    String data[][] = {};
    String header[] = {"Nombre Completo", "Año de Nacimiento", "Edad"};

    public Ver_Hijos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        ((DefaultTableCellRenderer) Tabla_Hijos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);

        Tabla_Hijos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Tabla_Hijos.doLayout();

        model = new DefaultTableModel(data, header);
        Tabla_Hijos.setModel(model);
        startTable();
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/Icon.png"));
        return retValue;
    }

    public void startTable() {
        Tabla_Hijos.removeAll();
        model.setRowCount(0);
        tableGenerator(Ventana_Buscar.e.getSon_Info());
    }

    public void tableGenerator(LinkedList<Hijo> hijo) {

        for (Hijo h : hijo) {
            String Name, Born_Year, Age;

            Name = h.getSon_Name();
            Born_Year = h.getSon_Born_Date();
            Age = String.valueOf(h.getSon_Age());

            String datas[] = {Name, Born_Year, Age};
            model.addRow(datas);

            ((DefaultTableCellRenderer) Tabla_Hijos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

            TableColumnModel columnModel = Tabla_Hijos.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(230);
            columnModel.getColumn(1).setPreferredWidth(120);
            columnModel.getColumn(2).setPreferredWidth(70);

            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            Tabla_Hijos.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla_Hijos.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla_Hijos.getColumnModel().getColumn(2).setCellRenderer(tcr);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Hijos = new javax.swing.JTable();
        Back_Menu = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Datos del hijo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        Tabla_Hijos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla_Hijos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 350, 90));

        Back_Menu.setBackground(new java.awt.Color(153, 102, 0));
        Back_Menu.setText("Volver al Menú");
        Back_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Back_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo3.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_MenuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_Back_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(Ver_Hijos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Hijos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Hijos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Hijos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Hijos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Menu;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable Tabla_Hijos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
