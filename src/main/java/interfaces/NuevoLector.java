package interfaces;

import acceso.Alumno;
import acceso.Docente;
import acceso.Lector;
import inventario.Almacenamiento;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import acceso.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Maty
 */
public class NuevoLector extends javax.swing.JFrame {

    /**
     * Creates new form NuevoLector
     */
    public NuevoLector() {
        initComponents();
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
        tipoLector = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ApellidoYNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipodocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NroDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numeroTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Sexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CodigoPostal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Departamento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        localidad = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        labelFacultad = new javax.swing.JLabel();
        facultad = new javax.swing.JTextField();
        labelCarrera = new javax.swing.JLabel();
        carrera = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        Nacionalidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("tipo lector");

        tipoLector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Publico General", "Alumno", "Docente"}));
        tipoLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoLectorActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido y Nombre");

        ApellidoYNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoYNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("tipo documento");

        tipodocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodocumentoActionPerformed(evt);
            }
        });

        jLabel4.setText("documento");

        jLabel5.setText("fecha de nacimiento");

        FechaNacimiento.setText("dd/mm/aaaa");

        jLabel6.setText("sexo");

        jLabel7.setText("correo");

        jLabel8.setText("numero de telefono");

        jLabel9.setText("nacionalidad");

        jLabel10.setText("domicilio");

        jLabel11.setText("codigo postal");

        jLabel12.setText("departamento");

        jLabel13.setText("localidad");

        localidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadActionPerformed(evt);
            }
        });

        labelFacultad.setText("facultad");

        labelCarrera.setText("carrera");

        carrera.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                carreraComponentHidden(evt);
            }
        });

        botonCrear.setText("crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(correo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel13))
                                        .addGap(4, 4, 4))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(localidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(domicilio, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tipoLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTelefono))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodigoPostal)
                                    .addComponent(Departamento)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NroDocumento))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipodocumento))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ApellidoYNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nacionalidad))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Sexo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCarrera)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFacultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facultad)
                            .addComponent(carrera))))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonCrear)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFacultad))
                .addGap(11, 11, 11)
                .addComponent(botonCrear)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidoYNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoYNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoYNombreActionPerformed

    private void tipodocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodocumentoActionPerformed

    private void localidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localidadActionPerformed

    private void carreraComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_carreraComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_carreraComponentHidden

    private void tipoLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoLectorActionPerformed

        String opcion = tipoLector.getSelectedItem().toString();
        switch (opcion) {
            case "Publico General":
                this.labelCarrera.setVisible(false);
                this.labelFacultad.setVisible(false);
                this.carrera.setVisible(false);
                this.facultad.setVisible(false);
                break;
            case "Docente":
                this.labelFacultad.setVisible(false);
                this.facultad.setVisible(false);
                this.carrera.setVisible(true);
                this.labelCarrera.setVisible(true);
                break;
            case "Alumno":
                this.labelCarrera.setVisible(true);
                this.labelFacultad.setVisible(true);
                this.carrera.setVisible(true);
                this.facultad.setVisible(true);
                break;
        }

    }//GEN-LAST:event_tipoLectorActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        Almacenamiento alma = new Almacenamiento();
        DatosDeAcceso da = new DatosDeAcceso();
        List<Lector> lectores = da.getLectores();

        String apellidonombre = this.ApellidoYNombre.getText();
        String[] ApellidoNombre = apellidonombre.split("\\s");
        String apellido = ApellidoNombre[0];
        String nombre = ApellidoNombre[1];
        String fechaNacimiento = this.FechaNacimiento.getText();
        String[] fechaArr = fechaNacimiento.split("/");

        LocalDate fecha = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));

        String opcion = tipoLector.getSelectedItem().toString();
        switch (opcion) {
            case "Publico General":
                Lector lector = new Lector(nombre, apellido, this.tipodocumento.getText(), Integer.parseInt(this.NroDocumento.getText()), fecha, this.Sexo.getText(), this.correo.getText(), this.numeroTelefono.getText(), this.Nacionalidad.getText(), this.domicilio.getText(), Integer.parseInt(this.CodigoPostal.getText()), this.Departamento.getText(), this.localidad.getText());
                if (!lectores.contains(lector)) {
                    alma.escribirCSV("recursos/ListadoDeLectores.txt", lector.toCSV());
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe este lector!", "Ventana emergente", 1);
                }
                break;
            case "Docente":
                Docente docente = new Docente(nombre, apellido, this.tipodocumento.getText(), Integer.parseInt(this.NroDocumento.getText()), fecha, this.Sexo.getText(), this.correo.getText(), this.numeroTelefono.getText(), this.Nacionalidad.getText(), this.domicilio.getText(), Integer.parseInt(this.CodigoPostal.getText()), this.Departamento.getText(), this.localidad.getText(), this.carrera.getText());
                if (!lectores.contains(docente)) {
                    alma.escribirCSV("recursos/ListadoDeLectores.txt", docente.toCSV());
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe este lector!", "Ventana emergente", 1);
                }
                break;
            case "Alumno":
                Alumno alumno = new Alumno(nombre, apellido, this.tipodocumento.getText(), Integer.parseInt(this.NroDocumento.getText()), fecha, this.Sexo.getText(), this.correo.getText(), this.numeroTelefono.getText(), this.Nacionalidad.getText(), this.domicilio.getText(), Integer.parseInt(this.CodigoPostal.getText()), this.Departamento.getText(), this.localidad.getText(), this.carrera.getText(), this.facultad.getText());
                if (!lectores.contains(alumno)) {
                    alma.escribirCSV("recursos/ListadoDeLectores.txt", alumno.toCSV());
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe este lector!", "Ventana emergente", 1);
                }
                break;
        }
        this.setVisible(false);
        new Administracion().setVisible(true);
    }//GEN-LAST:event_botonCrearActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NuevoLector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoLector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoLector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoLector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoLector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoYNombre;
    private javax.swing.JTextField CodigoPostal;
    private javax.swing.JTextField Departamento;
    private javax.swing.JTextField FechaNacimiento;
    private javax.swing.JTextField Nacionalidad;
    private javax.swing.JTextField NroDocumento;
    private javax.swing.JTextField Sexo;
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField carrera;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField facultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCarrera;
    private javax.swing.JLabel labelFacultad;
    private javax.swing.JTextField localidad;
    private javax.swing.JTextField numeroTelefono;
    private javax.swing.JComboBox<String> tipoLector;
    private javax.swing.JTextField tipodocumento;
    // End of variables declaration//GEN-END:variables
}
