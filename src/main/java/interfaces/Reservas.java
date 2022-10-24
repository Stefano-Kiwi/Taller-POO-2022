/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import inventario.Almacenamiento;
import inventario.Reserva;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Altamirano
 */
public class Reservas extends javax.swing.JFrame {

    /**
     * Creates new form Reservas
     */
    public Reservas() {
        initComponents();
        cargarDatos();
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
        TablaReservas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Fecha1TextField = new javax.swing.JTextField();
        Fecha2TextField = new javax.swing.JTextField();
        FiltrarBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESERVAS");

        TablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo de la obra", "DNI solicitante", "Fecha reserva"
            }
        ));
        jScrollPane1.setViewportView(TablaReservas);

        jLabel1.setText("Filtrar reservas entre las fechas:");

        Fecha1TextField.setText("dd/mm/aaaa");
        Fecha1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha1TextFieldActionPerformed(evt);
            }
        });

        Fecha2TextField.setText("dd/mm/aaaa");

        FiltrarBoton.setText("Filtrar");
        FiltrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarBotonActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha 1");

        jLabel3.setText("Fecha 2");

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fecha1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fecha2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(FiltrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fecha1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Fecha2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FiltrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Fecha1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha1TextFieldActionPerformed

    private void FiltrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarBotonActionPerformed
        Almacenamiento a = new Almacenamiento();
        a.obtenerObras("recursos/ListadoDeObras.txt");
        a.ObtenerReservas("recursos/Reservas.txt");
        List<Reserva> reservas = a.getReservas();

        List<Reserva> reservaFiltradasFecha = new ArrayList();

        String fecha1[] = Fecha1TextField.getText().split("/");
        LocalDate localfecha1 = LocalDate.of(Integer.parseInt(fecha1[2]), Integer.parseInt(fecha1[1]), Integer.parseInt(fecha1[0]));
        String fecha2[] = Fecha2TextField.getText().split("/");
        LocalDate localfecha2 = LocalDate.of(Integer.parseInt(fecha2[2]), Integer.parseInt(fecha2[1]), Integer.parseInt(fecha2[0]));
        
        if(localfecha1.isAfter(localfecha2)){
           JOptionPane.showMessageDialog(null, "LA FECHA 1 DEBE SER ANTERIOR A LA FECHA 2", "Ventana emergente", 1);  
        } else {

        for (Reserva reserva : reservas) {
            if (localfecha1.isBefore(reserva.getFecha()) && localfecha2.isAfter(reserva.getFecha())) {
                reservaFiltradasFecha.add(reserva);
            }
        }
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Titulo de la obra");
        modelo.addColumn("DNI solicitante");
        modelo.addColumn("Fecha reserva");
        TablaReservas.setModel(modelo);
        
        for (Reserva reserva1 : reservaFiltradasFecha) {
         String[] campos = reserva1.tablaGUI().split(",");
         modelo.addRow(campos);
         }
        }
    }//GEN-LAST:event_FiltrarBotonActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        new Administracion().setVisible(true);
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservas().setVisible(true);
            }
        });
    }
 public void cargarDatos() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Titulo de la obra");
        modelo.addColumn("DNI solicitante");
        modelo.addColumn("Fecha reserva");
        TablaReservas.setModel(modelo);
        
        Almacenamiento a = new Almacenamiento();
        a.obtenerObras("recursos/ListadoDeObras.txt");
        a.ObtenerReservas("recursos/Reservas.txt");
        List<Reserva> reservas = a.getReservas();
        
        for (Reserva reserva1 : reservas) {
         String[] campos = reserva1.tablaGUI().split(",");
         modelo.addRow(campos);
         }   
     }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fecha1TextField;
    private javax.swing.JTextField Fecha2TextField;
    private javax.swing.JButton FiltrarBoton;
    private javax.swing.JTable TablaReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
