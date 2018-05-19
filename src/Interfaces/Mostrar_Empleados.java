/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Empleado;
import static Interfaces.Ingresar_Empleado.Lista;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author PC 2
 */
public class Mostrar_Empleados extends javax.swing.JFrame {

    DefaultTableModel model;
    String data[][] = {};
    String header[] = {"No. INSS", "Nombre Completo", "Cargo Empleado", "Años de Antiguedad", "Horas Extras", "Comisiones por Ventas", "Salario Mensual",
        "Pago de Horas Extras", "Pago por Antiguedad", "Total de Ingresos", "INSS Laboral", "IR Laboral", "Deducciones Bancarias",
        "Deducciones Hospitalarias", "Sindicato Laboral", "Deuda Laboral", "Retención Laboral", "Total de Deducciones", "Neto a Recibir",
        "INSS Patronal", "Inatec", "Vacaciones", "Treceavo Mes", "Indemnización"};

    public Mostrar_Empleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        /*
        Tabla_Empleados.setOpaque(false);
        ((DefaultTableCellRenderer) Tabla_Empleados.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);*/
        
        ((DefaultTableCellRenderer) Tabla_Empleados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);

        Tabla_Empleados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Tabla_Empleados.doLayout();

        model = new DefaultTableModel(data, header);
        Tabla_Empleados.setModel(model);
        startTable();
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/Icon.png"));
        return retValue;
    }

    public void startTable() {
        Tabla_Empleados.removeAll();
        model.setRowCount(0);
        tableGenerator(Ingresar_Empleado.Lista);
    }

    public void tableGenerator(LinkedList<Empleado> empleado) {

        DecimalFormat decimales = new DecimalFormat("0.00");

        for (Empleado e : empleado) {

            String inss_id, name, job, antiguedad_years, extra_hours, commisions, salary, extra_hours_amount, antiguedad, total_income, inss, ir, deductions_bank,
                    deductions_hospital, deductions_Syndicate, deductions_debt, deductions_retention, total_deduction, net_to_receive, inss_patronal, inatec,
                    vacations, bonus, compensation;

            inss_id = e.getID_INSS();
            name = e.getName();
            job = e.getJob();
            antiguedad_years = String.valueOf(e.getAntiguedad_Years());
            extra_hours = String.valueOf(e.getExtra_Hours());
            commisions = String.valueOf(decimales.format(e.getCommisions()));
            salary = String.valueOf(e.getSalary());
            extra_hours_amount = String.valueOf(decimales.format(e.getExtra_Hours_Amount()));
            antiguedad = String.valueOf(decimales.format(e.getAntiguedad()));
            total_income = String.valueOf(decimales.format(e.getTotal_Income()));
            inss = String.valueOf(decimales.format(e.getINSS()));
            ir = String.valueOf(decimales.format(e.getIR()));
            deductions_bank = String.valueOf(decimales.format(e.getDeduction_Bank()));
            deductions_hospital = String.valueOf(decimales.format(e.getDeduction_Hospital()));
            deductions_Syndicate = String.valueOf(decimales.format(e.getDeduction_Syndicate()));
            deductions_debt = String.valueOf(decimales.format(e.getDeduction_debt()));
            deductions_retention = String.valueOf(decimales.format(e.getDeduction_retention()));
            total_deduction = String.valueOf(decimales.format(e.getTotal_Deductions()));
            net_to_receive = String.valueOf(decimales.format(e.getNet_To_Receive()));
            inss_patronal = String.valueOf(decimales.format(e.getINSS_Patronal()));
            inatec = String.valueOf(decimales.format(e.getInatec()));
            vacations = String.valueOf(decimales.format(e.getVacations()));
            bonus = String.valueOf(decimales.format(e.getBonus()));
            compensation = String.valueOf(decimales.format(e.getCompensation()));

            String datas[] = {inss_id, name, job, antiguedad_years, extra_hours, commisions, salary, extra_hours_amount, antiguedad, total_income, inss, ir,
                deductions_bank, deductions_hospital, deductions_Syndicate, deductions_debt, deductions_retention, total_deduction, net_to_receive, inss_patronal,
                inatec, vacations, bonus, compensation};
            model.addRow(datas);
            
            ((DefaultTableCellRenderer) Tabla_Empleados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
            
            TableColumnModel columnModel = Tabla_Empleados.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(250);
            columnModel.getColumn(2).setPreferredWidth(150);
            columnModel.getColumn(3).setPreferredWidth(120);
            columnModel.getColumn(4).setPreferredWidth(90);
            columnModel.getColumn(5).setPreferredWidth(150);
            columnModel.getColumn(6).setPreferredWidth(100);
            columnModel.getColumn(7).setPreferredWidth(140);
            columnModel.getColumn(8).setPreferredWidth(130);
            columnModel.getColumn(9).setPreferredWidth(110);
            columnModel.getColumn(10).setPreferredWidth(100);
            columnModel.getColumn(11).setPreferredWidth(90);
            columnModel.getColumn(12).setPreferredWidth(150);
            columnModel.getColumn(13).setPreferredWidth(150);
            columnModel.getColumn(14).setPreferredWidth(150);
            columnModel.getColumn(15).setPreferredWidth(150);
            columnModel.getColumn(16).setPreferredWidth(150);
            columnModel.getColumn(17).setPreferredWidth(140);
            columnModel.getColumn(18).setPreferredWidth(100);
            columnModel.getColumn(19).setPreferredWidth(100);
            columnModel.getColumn(20).setPreferredWidth(100);
            columnModel.getColumn(21).setPreferredWidth(100);
            columnModel.getColumn(22).setPreferredWidth(100);
            columnModel.getColumn(23).setPreferredWidth(100);

            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            Tabla_Empleados.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(1).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(6).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(7).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(8).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(9).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(10).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(11).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(12).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(13).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(14).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(15).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(16).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(17).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(18).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(19).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(20).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(21).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(22).setCellRenderer(tcr);
            Tabla_Empleados.getColumnModel().getColumn(23).setCellRenderer(tcr);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Empleados = new javax.swing.JTable();
        Dato_Buscar = new javax.swing.JTextField();
        Opcion = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();
        End = new javax.swing.JButton();
        Banner = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Nomina Mensual - Nómina de Empleados");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Empleados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tabla_Empleados.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla_Empleados.setRowHeight(30);
        jScrollPane1.setViewportView(Tabla_Empleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1050, 320));

        Dato_Buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(Dato_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 180, 30));

        Opcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre Completo", "No. Empleado", "No. Cédula", "No. INSS" }));
        getContentPane().add(Opcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 160, 30));

        Buscar.setBackground(new java.awt.Color(153, 153, 0));
        Buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 100, 30));

        End.setBackground(new java.awt.Color(153, 102, 0));
        End.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        End.setText("Volver al menú");
        End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndActionPerformed(evt);
            }
        });
        getContentPane().add(End, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, 40));

        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banner.png"))); // NOI18N
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (Dato_Buscar.getText().isEmpty()) {
            startTable();
        } else {
            LinkedList<Empleado> buscado = buscarEmpleado();
            if (buscado == null) {
                JOptionPane.showMessageDialog(null, "No se encontró ningún resultado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                startSearchTable(buscado);
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndActionPerformed
        Ventana_Principal vp = new Ventana_Principal();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EndActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Empleados().setVisible(true);
            }
        });
    }

    public LinkedList<Empleado> buscarEmpleado() {
        int pos = -1, op = Opcion.getSelectedIndex();
        String dato = Dato_Buscar.getText();
        LinkedList<Empleado> search_result = new LinkedList<>();

        switch (op) {
            case 0:
                for (Empleado e : Ingresar_Empleado.Lista) {
                    if (e.getName().equalsIgnoreCase(dato)) {
                        pos = Ingresar_Empleado.Lista.indexOf(e);
                        search_result.add(Ingresar_Empleado.Lista.get(pos));
                    }
                }
                if (pos == -1) {
                    search_result = null;
                }
                break;

            case 1:
                for (Empleado e : Ingresar_Empleado.Lista) {
                    if (e.getID().equalsIgnoreCase(dato)) {
                        pos = Ingresar_Empleado.Lista.indexOf(e);
                        search_result.add(Ingresar_Empleado.Lista.get(pos));
                    }
                }
                if (pos == -1) {
                    search_result = null;
                }
                break;

            case 2:
                for (Empleado e : Ingresar_Empleado.Lista) {
                    if (e.getDNI().equalsIgnoreCase(dato)) {
                        pos = Ingresar_Empleado.Lista.indexOf(e);
                        search_result.add(Ingresar_Empleado.Lista.get(pos));
                    }
                }
                if (pos == -1) {
                    search_result = null;
                }
                break;
                
            case 3:
                for (Empleado e : Ingresar_Empleado.Lista) {
                    if (e.getID_INSS().equalsIgnoreCase(dato)) {
                        pos = Ingresar_Empleado.Lista.indexOf(e);
                        search_result.add(Ingresar_Empleado.Lista.get(pos));
                    }
                }
                if (pos == -1) {
                    search_result = null;
                }
                break;
        }
        return search_result;
    }

    public void startSearchTable(LinkedList<Empleado> e) {
        Tabla_Empleados.removeAll();
        model.setRowCount(0);
        tableGenerator(e);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Dato_Buscar;
    private javax.swing.JButton End;
    private javax.swing.JLabel Fondo;
    private javax.swing.JComboBox<String> Opcion;
    private javax.swing.JTable Tabla_Empleados;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
