package interfaces;

import acceso.DatosDeAcceso;
import acceso.Lector;
import inventario.Almacenamiento;
import inventario.Obra;
import inventario.Reserva;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefa
 */
public class HacerReservas extends javax.swing.JFrame {

    
    private int NumOpcion;
    
    
    public HacerReservas() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        DNITextField = new javax.swing.JTextField();
        BusquedaTextField = new javax.swing.JTextField();
        LibroBusquedaComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        FechaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESERVA");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese los datos de la reserva...");

        DNITextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNITextFieldActionPerformed(evt);
            }
        });

        BusquedaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaTextFieldActionPerformed(evt);
            }
        });

        LibroBusquedaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Buscar por...","Titulo","ISBN"}));

        jLabel4.setText("Numero de documento del solicitante");

        jLabel2.setText("Titulo o ISBN de la obra a reservar");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reservar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        FechaTextField.setText("dd/mm/aaaa");
        FechaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de reserva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(DNITextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LibroBusquedaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BusquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(FechaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DNITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BusquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LibroBusquedaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusquedaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaTextFieldActionPerformed

    private void DNITextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNITextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNITextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    DatosDeAcceso da=new DatosDeAcceso();        
    da.obtenerLectores("recursos/ListadoDeLectores.txt");
    List<Lector> lectores=da.getLectores();
    Almacenamiento a = new Almacenamiento();
    a.obtenerObras("recursos/ListadoDeObras.txt");
    
    int nroDocumento=Integer.valueOf(DNITextField.getText());
        //FILTRA EL LECTOR POR SU DOCUMENTO
        Lector lector=null;    
        for(Lector lector1:lectores){
            if(lector1.getNumDocumento()==nroDocumento){
                lector=lector1;
                break;
            }
        }
        
        switch (LibroBusquedaComboBox.getSelectedItem().toString()){
            case "Titulo":
                NumOpcion = 1;
                break;
            case "ISBN":
                NumOpcion = 4;
                break;
        }
        
        List<Obra> Resultado= new ArrayList();
        Resultado=a.busquedaObras(NumOpcion, BusquedaTextField.getText());
        
        
        Obra obra = null;
        for (Obra obra1 : Resultado) {
            if(obra1.getTitulo().equalsIgnoreCase(BusquedaTextField.getText()) || obra1.getISBN().equalsIgnoreCase(BusquedaTextField.getText())){
                obra = obra1;
            }
        }
        
        String[] fechaArr = FechaTextField.getText().split("/");
        LocalDate fechaReserva = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));
        
        
        
        
        
        Reserva reserva = new Reserva(obra, lector, fechaReserva);
        
        a.escribirCSV("recursos/Reservas.txt", reserva.toCSV(1));   
        
        this.setVisible(false);
        new Consultas().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Consultas().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FechaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(HacerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BusquedaTextField;
    private javax.swing.JTextField DNITextField;
    private javax.swing.JTextField FechaTextField;
    private javax.swing.JComboBox<String> LibroBusquedaComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
