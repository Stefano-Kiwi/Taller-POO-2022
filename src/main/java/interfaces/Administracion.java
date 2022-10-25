/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import acceso.Bibliotecario;

/**
 *
 * @author lucia
 */
public class Administracion extends javax.swing.JFrame {

    /**
     * Creates new form Administracion
     */
    Bibliotecario bibliotecario;
    public Administracion(Bibliotecario b) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.bibliotecario = b;
        this.usuario.setText(b.getNombre()+" "+b.getApellido());
        
    }
    public Administracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    public Bibliotecario getBibliotecario(){
        return this.bibliotecario;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        devolver = new javax.swing.JButton();
        Deudores = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabelPrestar = new javax.swing.JLabel();
        jLabelPrestamos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelRegistrar = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        EjemplaresPorObra = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sa = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        devolver.setBackground(new java.awt.Color(153, 255, 153));
        devolver.setText("Devolver Ejemplar");
        devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverActionPerformed(evt);
            }
        });
        jPanel1.add(devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 142, 50));

        Deudores.setBackground(new java.awt.Color(255, 255, 153));
        Deudores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Deudores.setText("Deudores");
        Deudores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeudoresActionPerformed(evt);
            }
        });
        jPanel1.add(Deudores, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 150, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Todas las obras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 150, 50));

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 80, 40));

        jLabelPrestar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPrestar.setText("Consultar");
        jPanel1.add(jLabelPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jLabelPrestamos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPrestamos.setText("Prestamos");
        jPanel1.add(jLabelPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 80, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 690, 20));

        jLabelRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRegistrar.setText("Registrar");
        jPanel1.add(jLabelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registrar Lector");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, 50));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Registrar Obra");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 140, 50));

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Prestamos vigentes");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 150, 50));

        EjemplaresPorObra.setBackground(new java.awt.Color(255, 255, 153));
        EjemplaresPorObra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EjemplaresPorObra.setText("Ejemplares por Obra");
        EjemplaresPorObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjemplaresPorObraActionPerformed(evt);
            }
        });
        jPanel1.add(EjemplaresPorObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 150, 50));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Registrar Ejemplar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 140, 50));

        jButton7.setBackground(new java.awt.Color(153, 255, 153));
        jButton7.setText("Prestar Ejemplar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 142, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Reservas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 150, 50));

        jButton8.setBackground(new java.awt.Color(255, 255, 153));
        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setText("Ranking de multas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 150, 50));

        btnLogout.setBackground(new java.awt.Color(153, 255, 255));
        btnLogout.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 80, 40));

        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        sa.setBackground(new java.awt.Color(0, 0, 0));

        usuario.setBackground(new java.awt.Color(0, 0, 0));
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout saLayout = new javax.swing.GroupLayout(sa);
        sa.setLayout(saLayout);
        saLayout.setHorizontalGroup(
            saLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        saLayout.setVerticalGroup(
            saLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);   
        new ListaObras(bibliotecario).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeudoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeudoresActionPerformed
       this.setVisible(false);
        new ListaDeudores(bibliotecario).setVisible(true);
    }//GEN-LAST:event_DeudoresActionPerformed

    private void devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverActionPerformed
       this.setVisible(false);
        new GenerarDevolucion(bibliotecario).setVisible(true);
    }//GEN-LAST:event_devolverActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
       new NuevoLector(bibliotecario).setVisible(true);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new RegistrarObra(bibliotecario).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     this.setVisible(false);
     new PrestamosVigentes(bibliotecario).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void EjemplaresPorObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjemplaresPorObraActionPerformed
       this.setVisible(false);
       new EjemplaresPorObra(bibliotecario).setVisible(true);
    }//GEN-LAST:event_EjemplaresPorObraActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     this.setVisible(false);
     new RegistrarEjemplar(bibliotecario).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       this.setVisible(false);
       new GenerarPrestamo(this.bibliotecario).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
      new Reservas(bibliotecario).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
        new RankingLectores(bibliotecario).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deudores;
    private javax.swing.JButton EjemplaresPorObra;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton devolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPrestamos;
    private javax.swing.JLabel jLabelPrestar;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel sa;
    private javax.swing.JButton salir;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
