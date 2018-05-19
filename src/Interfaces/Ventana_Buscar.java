/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Empleado;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import javax.swing.JFrame;

/**
 *
 * @author PC 2
 */
public class Ventana_Buscar extends javax.swing.JFrame {

    public static Empleado e;

    public Ventana_Buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
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
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ID_INSS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Main = new javax.swing.JButton();
        Civil_State = new javax.swing.JTextField();
        Born_Year = new javax.swing.JTextField();
        Place = new javax.swing.JTextField();
        Job = new javax.swing.JTextField();
        Salary = new javax.swing.JTextField();
        Departament = new javax.swing.JTextField();
        See_Studies = new javax.swing.JButton();
        See_Son = new javax.swing.JButton();
        Phone = new javax.swing.JTextField();
        Born_Country = new javax.swing.JTextField();
        Home = new javax.swing.JTextField();
        Career = new javax.swing.JTextField();
        Workday = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        Start_Day = new javax.swing.JTextField();
        Contracting = new javax.swing.JTextField();
        Antiguedad_Years = new javax.swing.JTextField();
        Extra_Hours = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Academic_Level = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Nomina Mensual - Búsqueda de Empleado");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banner.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Completo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 152, -1, 30));

        Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name.setEnabled(false);
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 490, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("No. INSS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 152, 80, 30));

        ID_INSS.setEnabled(false);
        getContentPane().add(ID_INSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Año de Nacimiento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Estado Civil");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Lugar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Nivel Academico");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Cargo Empleado");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Tipo de Contratación");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Lugar de Nacimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Hijos del Empleado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Telèfono/Celular");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Estudios Realizados");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 160, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Departamento");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Horas Extras");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("No. de Identificador");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Direcciòn Domiciliaria");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Profesiòn");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("No. Empleado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Fecha de Ingreso");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Jornada Laboral");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        Main.setBackground(new java.awt.Color(153, 102, 0));
        Main.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Main.setText("Volver al menú");
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
            }
        });
        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 170, 40));

        Civil_State.setEnabled(false);
        getContentPane().add(Civil_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, -1));

        Born_Year.setEnabled(false);
        getContentPane().add(Born_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, -1));

        Place.setEnabled(false);
        getContentPane().add(Place, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 140, -1));

        Job.setEnabled(false);
        getContentPane().add(Job, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 140, -1));

        Salary.setEnabled(false);
        getContentPane().add(Salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 140, -1));

        Departament.setEnabled(false);
        getContentPane().add(Departament, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 140, -1));

        See_Studies.setBackground(new java.awt.Color(153, 153, 0));
        See_Studies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        See_Studies.setText("Ver Estudios");
        See_Studies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                See_StudiesActionPerformed(evt);
            }
        });
        getContentPane().add(See_Studies, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 140, -1));

        See_Son.setBackground(new java.awt.Color(153, 153, 0));
        See_Son.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        See_Son.setText("Ver Hijos");
        See_Son.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                See_SonActionPerformed(evt);
            }
        });
        getContentPane().add(See_Son, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 140, 30));

        Phone.setEnabled(false);
        getContentPane().add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 140, -1));

        Born_Country.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Born_Country.setEnabled(false);
        getContentPane().add(Born_Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 140, -1));

        Home.setEnabled(false);
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 140, -1));

        Career.setEnabled(false);
        getContentPane().add(Career, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 140, -1));

        Workday.setEnabled(false);
        getContentPane().add(Workday, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 140, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Salario Mensual");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, -1));

        DNI.setEnabled(false);
        getContentPane().add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 210, 140, -1));

        ID.setEnabled(false);
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 140, -1));

        Start_Day.setEnabled(false);
        getContentPane().add(Start_Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 140, -1));

        Contracting.setEnabled(false);
        getContentPane().add(Contracting, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 140, -1));

        Antiguedad_Years.setEnabled(false);
        getContentPane().add(Antiguedad_Years, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 140, 30));

        Extra_Hours.setEnabled(false);
        getContentPane().add(Extra_Hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, 140, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Años de Antiguedad");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 492, -1, 30));

        Academic_Level.setEnabled(false);
        getContentPane().add(Academic_Level, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 140, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        Ventana_Principal v = new Ventana_Principal();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MainActionPerformed

    private void See_StudiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_See_StudiesActionPerformed
        Ver_Estudios ve = new Ver_Estudios();
        ve.setVisible(true);
    }//GEN-LAST:event_See_StudiesActionPerformed

    private void See_SonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_See_SonActionPerformed
        Ver_Hijos vh = new Ver_Hijos();
        vh.setVisible(true);
    }//GEN-LAST:event_See_SonActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Buscar().setVisible(true);
            }
        });
    }

    public void obtenerDatos() {
        try {
            if (e.getStudies_Info().getFirst()== null) { }
        } catch (NoSuchElementException e) {
            See_Studies.setEnabled(false);
        }
        if (!e.getChildrens()) {
            See_Son.setEnabled(false);
        }

        Name.setText(e.getName());
        ID_INSS.setText(e.getID_INSS());
        Born_Year.setText(e.getBorn_year());
        Born_Country.setText(e.getBorn_Country());
        DNI.setText(e.getDNI());
        Civil_State.setText(e.getCivil_State());
        Home.setText(e.getHome());
        Place.setText(e.getPlace());
        Phone.setText(String.valueOf(e.getPhone()));
        Career.setText(e.getCareer());
        Academic_Level.setText(e.getAcademic_Level());
        ID.setText(e.getID());
        Job.setText(e.getJob());
        Departament.setText(e.getDepartament());
        Start_Day.setText(e.getStart_Day());
        Contracting.setText(e.getContracting());
        Salary.setText(String.valueOf(e.getSalary()));
        Antiguedad_Years.setText(String.valueOf(e.getAntiguedad_Years()));
        Workday.setText(String.valueOf(e.getWorkday()));
        Extra_Hours.setText(String.valueOf(e.getExtra_Hours()));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Academic_Level;
    private javax.swing.JTextField Antiguedad_Years;
    private javax.swing.JTextField Born_Country;
    private javax.swing.JTextField Born_Year;
    private javax.swing.JTextField Career;
    private javax.swing.JTextField Civil_State;
    private javax.swing.JTextField Contracting;
    private javax.swing.JTextField DNI;
    private javax.swing.JTextField Departament;
    private javax.swing.JTextField Extra_Hours;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField Home;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ID_INSS;
    private javax.swing.JTextField Job;
    private javax.swing.JButton Main;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField Place;
    private javax.swing.JTextField Salary;
    private javax.swing.JButton See_Son;
    private javax.swing.JButton See_Studies;
    private javax.swing.JTextField Start_Day;
    private javax.swing.JTextField Workday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
