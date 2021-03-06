/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Ingresar_Empleado.Lista;
import static Interfaces.Ventana_Buscar.e;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC 2
 */
public class Ventana_Eliminar extends javax.swing.JFrame {

    public static int pos;

    public Ventana_Eliminar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/Icon.png"));
        return retValue;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        DNI = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Job = new javax.swing.JTextField();
        No = new javax.swing.JButton();
        Yes = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("¿Seguro que desea eliminar este empleado?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cargo Empleado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre Completo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("No. Cédula");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 190, 80, -1));

        ID.setEnabled(false);
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, -1));

        DNI.setEnabled(false);
        getContentPane().add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 170, -1));

        Name.setEnabled(false);
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("No. Empleado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Job.setEnabled(false);
        getContentPane().add(Job, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, -1));

        No.setBackground(new java.awt.Color(102, 0, 0));
        No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        getContentPane().add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 90, -1));

        Yes.setBackground(new java.awt.Color(51, 102, 0));
        Yes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Yes.setText("Si");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });
        getContentPane().add(Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 90, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo3.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
        Ingresar_Empleado.Lista.remove(pos);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Empleados.dat"));
            oos.writeObject(Ingresar_Empleado.Lista);
            oos.close();
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        Ventana_Principal vp = new Ventana_Principal();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_YesActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        Ventana_Principal vp = new Ventana_Principal();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Eliminar().setVisible(true);
            }
        });
    }

    public void obtenerDatos() {

        Name.setText(Ingresar_Empleado.Lista.get(pos).getName());
        Job.setText(Ingresar_Empleado.Lista.get(pos).getJob());
        DNI.setText(Ingresar_Empleado.Lista.get(pos).getDNI());
        ID.setText(Ingresar_Empleado.Lista.get(pos).getID());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Job;
    private javax.swing.JTextField Name;
    private javax.swing.JButton No;
    private javax.swing.JButton Yes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
