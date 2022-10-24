/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import acceso.Devolucion;
import acceso.Lector;
import acceso.Multa;
import acceso.Prestamo;
import inventario.Almacenamiento;
import inventario.Ejemplar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maty
 */
public class GenerarDevolucion extends javax.swing.JFrame {

    /**
     * Creates new form GenerarDevolucion
     */
    private String opcion;
    private List<Prestamo> prestamosActivos;
    private List<Prestamo> prestamos;
    private Almacenamiento a;
    private Prestamo prestamo;
    private String prestamosADevolver;
    private List<Prestamo> prestamosADev;

    
    public GenerarDevolucion() {
        initComponents();
        a = new Almacenamiento();
        prestamos=new ArrayList();
        tagParametroBuscar.setVisible(false);
        texto.setVisible(false);
        BotonDevolver.setVisible(false);
        buscarPrestamos.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TagBuscarPor = new javax.swing.JLabel();
        buscarPrestamoPor = new javax.swing.JComboBox<>();
        tagParametroBuscar = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        BotonDevolver = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPrestamos = new javax.swing.JTable();
        PrestamosADevolver = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        buscarPrestamos = new javax.swing.JButton();
        tagPrestamosADevolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TagBuscarPor.setText("Buscar Prestamo Por: ");

        buscarPrestamoPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Lector", "Ejemplar"}));
        buscarPrestamoPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPrestamoPorActionPerformed(evt);
            }
        });

        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        BotonDevolver.setText("Devolver");
        BotonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDevolverActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        TablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI Lector", "ID unico ejemplar", "Fecha de devolucion"
            }
        ));
        jScrollPane1.setViewportView(TablaPrestamos);

        PrestamosADevolver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        PrestamosADevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamosADevolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Prestamo/s Encontrados:");

        buscarPrestamos.setText("Buscar");
        buscarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPrestamosActionPerformed(evt);
            }
        });

        tagPrestamosADevolver.setText("Prestamos a devolver:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TagBuscarPor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buscarPrestamoPor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tagParametroBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(buscarPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 338, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tagPrestamosADevolver, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(PrestamosADevolver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TagBuscarPor)
                    .addComponent(tagParametroBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarPrestamoPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPrestamos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(tagPrestamosADevolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrestamosADevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarPrestamoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPrestamoPorActionPerformed
        opcion=buscarPrestamoPor.getSelectedItem().toString();
        switch(opcion){
            case "Lector":
                tagParametroBuscar.setText("numero dni del lector: ");
                tagParametroBuscar.setVisible(true);
                texto.setVisible(true);
                buscarPrestamos.setVisible(true);
                break;
            case "Ejemplar":
                tagParametroBuscar.setText("id unico del ejemplar: ");
                tagParametroBuscar.setVisible(true);
                texto.setVisible(true);
                buscarPrestamos.setVisible(true);
                break;
        }
                
    }//GEN-LAST:event_buscarPrestamoPorActionPerformed

    private void BotonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDevolverActionPerformed
        
      for(Prestamo pres:prestamosADev){   
        prestamo=pres;
        //verifica si la devolucion esta a tiempo o no
        LocalDate hoy=LocalDate.now();
        boolean fueradeTermino=false;
        if(hoy.isAfter(prestamo.getFechaDevolucion())){
            Lector lector = prestamo.getLector();
            lector.setMulta(new Multa(3,hoy));
            a.escribirCSV("recursos/ListaMultas.txt", lector.toCSVMulta());
            fueradeTermino=true;
        }
        
        a.obtenerMultas("recursos/ListaMultas.txt");
        System.out.println(a.getMultas());
        
        Ejemplar ejemplar = prestamo.getEjemplar();
        //actualiza los datos de los txt
        //cambia la disponibilidad del ejemplar a 1=disponible
        a.modificarCSV("recursos/ListadoDeEjemplares.txt",ejemplar.toCSV(2), ejemplar.toCSV(1));
        //cambia la disponibilidad del prestamo a 2=terminado
        //no esta funcionando por alguna razon el idunico es distinto 
        a.modificarCSV("recursos/ListaPrestamos.txt", prestamo.toCSV(1),prestamo.toCSV(2));
        
        Devolucion devolucion=new Devolucion(hoy,fueradeTermino,prestamo);
        JOptionPane.showMessageDialog(null,"se devolcio el ejemplar: "+ejemplar.getIdUnico()+"\n"+"ubiquelo en: "+ejemplar.getLugarFisico());
       }
         JOptionPane.showMessageDialog(null,"devolucion/es realizada con exito");
         this.setVisible(false);
         new Administracion().setVisible(true);
    }//GEN-LAST:event_BotonDevolverActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        new Administracion().setVisible(true);    }//GEN-LAST:event_botonVolverActionPerformed

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        Prestamo prestamo=null; 
    }//GEN-LAST:event_textoActionPerformed

    private void buscarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPrestamosActionPerformed
        a.obtenerObras("recursos/ListadoDeObras.txt");
        a.obtenerEjemplares("recursos/ListadoDeEjemplares.txt");
        a.obtenerPrestamos("recursos/ListaPrestamos.txt");
        prestamosActivos = a.getPrestamosActivos();
        
        switch(opcion){
            case "Lector":
                int dni=Integer.valueOf(texto.getText());
                for(Prestamo p:prestamosActivos){
                    if(p.getLector().getNumDocumento() == dni){
                        prestamos.add(p);
                    }
                }
                break;
            case "Ejemplar":
                String idunico=texto.getText();
                for(Prestamo p:prestamosActivos){
                    if(p.getEjemplar().getIdUnico().equalsIgnoreCase(idunico)){
                        prestamos.add(p);
                        prestamo=p;
                        break;
                    }
                }
                break;
        }
        if (prestamos.size()==0){
            JOptionPane.showMessageDialog(null,"no hay prestamos activos para el "+opcion.toLowerCase());
             this.setVisible(false);
             new Administracion().setVisible(true);  
        }
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("DNI Lector");
        modelo.addColumn("ID unico ejemplar");
        modelo.addColumn("Fecha de devolucion");
        TablaPrestamos.setModel(modelo);
        
        for(Prestamo pres:prestamos){
            String[] campos = pres.tablaDevolucion().split(",");
            modelo.addRow(campos);
        }
        
        
        String[] Prestamos = new String[prestamos.size()+1];
        Prestamos[0]="Todos";
        int x=1;
        for (int i =0; i < prestamos.size(); i++) {
            Prestamos[x] = prestamos.get(i).tablaDevolucion();
            x++;
        }
         PrestamosADevolver.setModel(new javax.swing.DefaultComboBoxModel<>(Prestamos));
    }//GEN-LAST:event_buscarPrestamosActionPerformed

    private void PrestamosADevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestamosADevolverActionPerformed
        prestamosADev=new ArrayList();
        prestamosADevolver=PrestamosADevolver.getSelectedItem().toString();
        if(prestamosADevolver.equals("Todos")){
            for(Prestamo presta:prestamos){
                prestamosADev.add(presta);
            }
        }else{
            for(Prestamo presta:prestamos){
               if(presta.tablaDevolucion().equalsIgnoreCase(prestamosADevolver)) 
                 prestamosADev.add(presta);
            }
        }
        BotonDevolver.setVisible(true);
    }//GEN-LAST:event_PrestamosADevolverActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarDevolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDevolver;
    private javax.swing.JComboBox<String> PrestamosADevolver;
    private javax.swing.JTable TablaPrestamos;
    private javax.swing.JLabel TagBuscarPor;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> buscarPrestamoPor;
    private javax.swing.JButton buscarPrestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tagParametroBuscar;
    private javax.swing.JLabel tagPrestamosADevolver;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
