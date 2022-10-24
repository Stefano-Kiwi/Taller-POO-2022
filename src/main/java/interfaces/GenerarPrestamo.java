package interfaces;
import acceso.Alumno;
import acceso.DatosDeAcceso;
import acceso.Docente;
import acceso.Lector;
import acceso.Multa;
import acceso.Prestamo;
import acceso.TipoPrestamo;
import inventario.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author Daniel Altamirano
 */
public class GenerarPrestamo extends javax.swing.JFrame {
    
    private int numOption;
    /**
     * Creates new form GenerarPrestamo
     */
    public GenerarPrestamo() {
        initComponents();
        this.duracionprestamoLabel.setVisible(false);
        this.duracionPrestamo.setVisible(false);
        
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        documento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        opcionBuscar = new javax.swing.JComboBox<>();
        botonPrestamo = new javax.swing.JButton();
        BusquedaLibro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fechaPrestamo = new javax.swing.JTextField();
        duracionprestamoLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        duracionPrestamo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tipoPrestamo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        horaPrestamo = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamo de ejemplares");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Documento lector");

        documento.setToolTipText("");
        documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Buscar libro por");

        opcionBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titulo o subtitulo", "Autor", "Genero", "ISBN","Coleccion"}));
        opcionBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opcionBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBuscarActionPerformed(evt);
            }
        });

        botonPrestamo.setBackground(new java.awt.Color(0, 0, 0));
        botonPrestamo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        botonPrestamo.setText("generar prestamo");
        botonPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrestamoActionPerformed(evt);
            }
        });

        BusquedaLibro.setToolTipText("");
        BusquedaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaLibroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de prestamo:");

        fechaPrestamo.setText("dd/mm/aaaa");
        fechaPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaPrestamoActionPerformed(evt);
            }
        });

        duracionprestamoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        duracionprestamoLabel.setText("duracion del prestamo");

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        duracionPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1","2","3","4"}));
        duracionPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionPrestamoActionPerformed(evt);
            }
        });

        jLabel7.setText("tipo prestamo");

        tipoPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sala", "Domicilio" }));
        tipoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPrestamoActionPerformed(evt);
            }
        });

        jLabel8.setText("hora prestamo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton3)
                        .addGap(270, 270, 270)
                        .addComponent(botonPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(horaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(opcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tipoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BusquedaLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(duracionprestamoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duracionPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opcionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(horaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(duracionprestamoLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracionPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(botonPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoActionPerformed

    private void opcionBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBuscarActionPerformed
        switch (opcionBuscar.getSelectedItem().toString()){
            case "Titulo o subtitulo":
                numOption = 1;
                break;
            case "Autor":
                numOption = 2;
                break;
            case "Genero":
                numOption = 3;
                break;
            case "ISBN":
                numOption = 4;
                break;
            case "Coleccion":
                numOption = 5;
                break;   
        }
    }//GEN-LAST:event_opcionBuscarActionPerformed

    private void botonPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrestamoActionPerformed
        //TRAE LAS OBRAS DISPONIBLES EN LA BIBLIOTECA
        Almacenamiento a = new Almacenamiento();
        a.obtenerObras("recursos/ListadoDeObras.txt");
        DatosDeAcceso da=new DatosDeAcceso();
        a.busquedaObras(numOption, BusquedaLibro.getText());
        List<Obra>Resultado=new ArrayList();
        Resultado=a.busquedaObras(numOption, BusquedaLibro.getText());
        //CARGA TODOS LOS LECTORES
        da.obtenerLectores("recursos/ListadoDeLectores.txt");
        List<Lector> lectores=da.getLectores();
        int nroDocumento=Integer.valueOf(documento.getText());
        //FILTRA EL LECTOR POR SU DOCUMENTO
        Lector lector=null;    
        for(Lector lector1:lectores){
            if(lector1.getNumDocumento()==nroDocumento){
                lector=lector1;
                break;
            }
        }
        
        if(lector==null){
            JOptionPane.showMessageDialog(null, "No existe lector con ese documento!. Debe crearse un lector primero");   
                this.setVisible(false);
                new NuevoLector().setVisible(true);
        }else{
        //prueba agegarle una multa al lector
//        LocalDate fechamulta=LocalDate.of(2022, 10, 12);
//        lector.setMulta(new Multa(2,fechamulta));
         
        //si el lector tiene una multa activa no se puede realizar el prestamo
        Multa multa=lector.getMulta();
        if(multa!=null){
            JOptionPane.showMessageDialog(null, "no se puede realizar el prestamo por que el lector tiene una multa activa"+"\n"+"fecha de vencimiento de la multa: "+multa.fechaVencimiento());
            this.setVisible(false);
            new Administracion().setVisible(true);
        }else{
        
        String fecha=fechaPrestamo.getText();
        String[] fechaArr = fecha.split("/");
        LocalDate fechaprestamo = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));
        
        String opcion1=tipoPrestamo.getSelectedItem().toString();
        LocalDate fechaDevolucion=null;
        TipoPrestamo tpPrestamo=null;
        switch(opcion1){
            case "Sala":
                fechaDevolucion=fechaprestamo;
                tpPrestamo=tpPrestamo.SALA;
                break;
            case "Domicilio":
                int dias = Integer.parseInt(duracionPrestamo.getSelectedItem().toString());
                int anio=fechaprestamo.getYear();
                int mes=fechaprestamo.getMonthValue();
                int DIA= fechaprestamo.getDayOfMonth()+ dias;
                fechaDevolucion=LocalDate.of(anio,mes,DIA);
                tpPrestamo=tpPrestamo.DOMICILIO;
                break;
        }
        Obra obra= new Obra();
        if(Resultado.size()==1){
           obra=Resultado.get(0);      
        }
 
        a.obtenerEjemplares("recursos/ListadoDeEjemplares.txt");
        List<Ejemplar> disponibles=a.getEjemplarDisponibles();
        Ejemplar ejemplar=null;
        for(Ejemplar ejemplar1:disponibles){
            if(ejemplar1.getObra().equals(obra)){
                ejemplar=ejemplar1;
                 lector.AgregarEjemplar(ejemplar1);
                JOptionPane.showMessageDialog(null, "Prestamo realizado exitosamente");
                this.setVisible(false);
                new Administracion().setVisible(true);
                break;
            }
        }
        if(ejemplar == null){
            JOptionPane.showMessageDialog(null, "No hay ejemplares disponibles");
        }
        
        int hora=Integer.parseInt(horaPrestamo.getText());
        Prestamo prestamo=new Prestamo(tpPrestamo,fechaprestamo,hora,3,fechaDevolucion,lector,ejemplar);        
        a.escribirCSV("recursos/ListaPrestamos.txt", prestamo.toCSV(1));
        //cambia el estado del ejemplar a prestado(2)
        a.modificarCSV("recursos/ListadoDeEjemplares.txt",ejemplar.toCSV(1),ejemplar.toCSV(2));
        //agrega nuevo prestamo al contador correspondiente en obra
        if(lector instanceof Docente || lector instanceof Alumno){
            obra.agregarNuevoPrestamoAlumnoODocente();
        }else{
            obra.agregarNuevoPrestamoPublicoGeneral();
        }
       }
      }
    }//GEN-LAST:event_botonPrestamoActionPerformed

    private void BusquedaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaLibroActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaLibroActionPerformed

    private void fechaPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaPrestamoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new Administracion().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void duracionPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracionPrestamoActionPerformed

    private void tipoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPrestamoActionPerformed
        String opcion=tipoPrestamo.getSelectedItem().toString();
        switch(opcion){
            case "Sala":
                this.duracionprestamoLabel.setVisible(false);
                this.duracionPrestamo.setVisible(false);
                break;
            case "Domicilio":
                this.duracionprestamoLabel.setVisible(true);
                this.duracionPrestamo.setVisible(true);
                break;
        }
    }//GEN-LAST:event_tipoPrestamoActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarPrestamo().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BusquedaLibro;
    private javax.swing.JButton botonPrestamo;
    private javax.swing.JTextField documento;
    private javax.swing.JComboBox<String> duracionPrestamo;
    private javax.swing.JLabel duracionprestamoLabel;
    private javax.swing.JTextField fechaPrestamo;
    private javax.swing.JTextField horaPrestamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> opcionBuscar;
    private javax.swing.JComboBox<String> tipoPrestamo;
    // End of variables declaration//GEN-END:variables
}
