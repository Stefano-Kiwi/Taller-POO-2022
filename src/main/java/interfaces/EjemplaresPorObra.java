package interfaces;

import acceso.Bibliotecario;
import inventario.Almacenamiento;
import inventario.Ejemplar;
import inventario.Obra;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EjemplaresPorObra extends javax.swing.JFrame {

    
    Almacenamiento a = new Almacenamiento();
    boolean esConsulta = false;

    Bibliotecario bibliotecario;

    public EjemplaresPorObra() {
        initComponents();
        cargarDatos();
        this.setLocationRelativeTo(null);
    }

    public EjemplaresPorObra(Bibliotecario b) {
        initComponents();
        cargarDatos();
        bibliotecario = b;
        this.setLocationRelativeTo(null);
    }

    public EjemplaresPorObra(boolean consulta) {
        initComponents();
        cargarDatos();
        this.esConsulta = consulta;
        if (esConsulta == true) {
            ComboBoxTitulo.setVisible(false);
            labelAdmin.setVisible(false);
            jLabel1observac.setVisible(false);
            textoIdEjemplar.setVisible(false);
            textoObservaciones.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            botonObservaciones.setVisible(false);
            setSize(1000, 600);
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEjemplar = new javax.swing.JTable();
        labelAdmin = new javax.swing.JLabel();
        ComboBoxTitulo = new javax.swing.JComboBox<>();
        jButtonVolver = new javax.swing.JButton();
        areaTematicaLabel = new javax.swing.JLabel();
        areaTematicaCB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1observac = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoIdEjemplar = new javax.swing.JTextField();
        textoObservaciones = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        botonObservaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaEjemplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Obra", "Lugar del ejemplar", "ID unico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaEjemplar);

        labelAdmin.setText("Ejemplares total de la biblioteca:");
        labelAdmin.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                labelAdminComponentHidden(evt);
            }
        });

        ComboBoxTitulo.setToolTipText("");
        ComboBoxTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTituloActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        areaTematicaLabel.setText("Ejemplares disponibles del Área:");

        areaTematicaCB.setToolTipText("");
        areaTematicaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTematicaCBActionPerformed(evt);
            }
        });

        jButton1.setText("NUEVA RESERVA...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dotum", 1, 12)); // NOI18N
        jLabel2.setText("En caso de necesitar un ejemplar disponible, contactarse con el");

        jLabel3.setFont(new java.awt.Font("Dotum", 1, 12)); // NOI18N
        jLabel3.setText("bibliotecario más cercano. En caso de no haber ejemplares realizar una reserva.");

        jLabel1observac.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel1observac.setText("Para agregar una observacion sobre un ejemplar:");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel4.setText("id Unico del ejemplar:");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel5.setText("Observaciones (sin usar comas):");

        textoIdEjemplar.setText("ID");
        textoIdEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIdEjemplarActionPerformed(evt);
            }
        });

        textoObservaciones.setText("observaciones");

        jSeparator1.setForeground(new java.awt.Color(51, 102, 255));

        jSeparator2.setForeground(new java.awt.Color(51, 102, 255));

        botonObservaciones.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        botonObservaciones.setText("Modificar observaciones");
        botonObservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonObservacionesMouseClicked(evt);
            }
        });
        botonObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonObservacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAdmin)
                            .addComponent(ComboBoxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaTematicaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaTematicaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1observac))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoIdEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonObservaciones)
                                .addGap(115, 115, 115))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaTematicaLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaTematicaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jButton1))
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1observac)
                            .addComponent(botonObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textoIdEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ComboBoxTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTituloActionPerformed

        String opcionElegida = ComboBoxTitulo.getSelectedItem().toString();

        a.obtenerEjemplares("recursos/ListadoDeEjemplares.txt");

        List<Ejemplar> ejemplares = a.getEjemplares();

        List<Ejemplar> ejemplaresAMostrar = new ArrayList();

        //CORRECCION SOLO PIDO EL TITULO DE LA OBRA DEL EJEMPLAR Y COMPARO CON LA OPCION ELEGIDA
        if (opcionElegida == "") {
            new JOptionPane().showMessageDialog(rootPane, "Seleccionar opción");
        }
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar.getObra().getTitulo().equals(opcionElegida)) {
                ejemplaresAMostrar.add(ejemplar);
            }
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Obra");
        modelo.addColumn("Lugar del ejemplar");
        modelo.addColumn("ID unico");
        TablaEjemplar.setModel(modelo);

        for (Ejemplar ejemplar : ejemplaresAMostrar) {
            String[] campos = ejemplar.tablaGUI().split(",");
            modelo.addRow(campos);
        }

    }//GEN-LAST:event_ComboBoxTituloActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.setVisible(false);
        if (esConsulta == true) {
            new Consultas().setVisible(true);
        } else {
            new Administracion(bibliotecario).setVisible(true);
        }

    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void areaTematicaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTematicaCBActionPerformed

        String opcionElegida = areaTematicaCB.getSelectedItem().toString();

        a.obtenerEjemplares("recursos/ListadoDeEjemplares.txt");

        List<Ejemplar> ejemplares = a.getEjemplarDisponibles();

        List<Ejemplar> ejemplaresAMostrar = new ArrayList();

        //CORRECCION SOLO PIDO EL TITULO DE LA OBRA DEL EJEMPLAR Y COMPARO CON LA OPCION ELEGIDA
        if (opcionElegida == "") {
            new JOptionPane().showMessageDialog(rootPane, "Seleccionar opción");
        }
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar.getObra().getAreaTematica().equals(opcionElegida)) {
                ejemplaresAMostrar.add(ejemplar);
            }
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Obra");
        modelo.addColumn("Lugar del ejemplar");
        TablaEjemplar.setModel(modelo);

        for (Ejemplar ejemplar : ejemplaresAMostrar) {
            String[] campos = ejemplar.tablaGUI().split(",");
            modelo.addRow(campos);
        }
    }//GEN-LAST:event_areaTematicaCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        if (esConsulta == true) {
            new HacerReservas(esConsulta).setVisible(true);
        } else {
            new HacerReservas(bibliotecario).setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void labelAdminComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_labelAdminComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAdminComponentHidden

    private void textoIdEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIdEjemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIdEjemplarActionPerformed

    private void botonObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonObservacionesActionPerformed
        String idEjemplar = textoIdEjemplar.getText();
        String observaciones = textoObservaciones.getText();
        boolean encontrado = false;
        //System.out.println("El id es: "+idEjemplar+", la observacion "+observaciones);
        a.obtenerEjemplares("recursos/ListadoDeEjemplares.txt");
        a.obtenerObservaciones("recursos/ListaObservaciones.txt");

        List<Ejemplar> ejemplares = a.getEjemplares();
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar.getIdUnico().equals(idEjemplar)) { // SOLO MODIFICO LA LISTA EN ALMACENAMIENTO
                if (ejemplar.getObservaciones() == null) {
                    a.agregarNuevoRenglonCSV("recursos/ListaObservaciones.txt", idEjemplar + "," + observaciones);
                }
                ejemplar.setObservaciones(observaciones);
                encontrado = true;
                System.out.println("Lo encontré y modifiqué");
                break;
            }
        }       // HASTA ACA FUNCIONA

        if (encontrado == false) {
            System.out.println("El id Unico ingresado es incorrecto");
            JOptionPane.showMessageDialog(null, "Id Unico incorrecto", "El id unico ingresado es incorrecto.", 3);

        }
    }//GEN-LAST:event_botonObservacionesActionPerformed

    private void botonObservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonObservacionesMouseClicked
        String idEjemplar = textoIdEjemplar.getText();
        String observaciones = textoObservaciones.getText();
        System.out.println("El id es: " + idEjemplar + ", la observacion " + observaciones);
        List<Ejemplar> ejemplares = a.getEjemplares();
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar.getIdUnico().equals(idEjemplar)) {
                ejemplar.setObservaciones(observaciones);
            }
        }

    }//GEN-LAST:event_botonObservacionesMouseClicked

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
            java.util.logging.Logger.getLogger(EjemplaresPorObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemplaresPorObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemplaresPorObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemplaresPorObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemplaresPorObra().setVisible(true);
            }
        });
    }

    /**
     * Este método lo utilizamos para crear una tabla según un modelo y luego
     * mostrar los ejemplares que tiene cada obra
     */
    public void cargarDatos() {

        a.obtenerObras("recursos/ListadoDeObras.txt");

        List<Obra> obras = a.getObras();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Obra");
        modelo.addColumn("Lugar del ejemplar");
        TablaEjemplar.setModel(modelo);

        List<String> nombreDeObras = new ArrayList();

        //Lista para guardar las areas temáticas
        List<String> areasTematicas = new ArrayList();

        for (Obra obraNombre : obras) {
            if (!nombreDeObras.contains(obraNombre.getTitulo())) {
                nombreDeObras.add(obraNombre.getTitulo());
            }
        }

        //obtengo las areas temáticas
        for (Obra obra : obras) {
            if (!areasTematicas.contains(obra.getAreaTematica())) {
                areasTematicas.add(obra.getAreaTematica());
            }
        }

        String[] edit = new String[nombreDeObras.size()];
        //edit[0] = "";
        for (int i = 0; i < nombreDeObras.size(); i++) {
            edit[i] = nombreDeObras.get(i);
        }

        //guardo las areas temáticas
        String[] areas = new String[areasTematicas.size()];
        //areas[0] = ""; //primera posicion string vacio
        for (int i = 0; i < areasTematicas.size(); i++) {
            areas[i] = areasTematicas.get(i);
        }

        ComboBoxTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(edit));
        areaTematicaCB.setModel(new javax.swing.DefaultComboBoxModel<>(areas));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTitulo;
    private javax.swing.JTable TablaEjemplar;
    private javax.swing.JComboBox<String> areaTematicaCB;
    private javax.swing.JLabel areaTematicaLabel;
    private javax.swing.JButton botonObservaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1observac;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JTextField textoIdEjemplar;
    private javax.swing.JTextField textoObservaciones;
    // End of variables declaration//GEN-END:variables
}
