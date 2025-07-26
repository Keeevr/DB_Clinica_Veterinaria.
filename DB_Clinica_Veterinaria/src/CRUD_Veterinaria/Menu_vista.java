package CRUD_Veterinaria;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Menu_vista extends javax.swing.JFrame {


    public Menu_vista() {
        initComponents();
        configurarSegunRol(Sesion.rolActual); // aquí usamos el rol guardado
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_mascotas = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_empleados = new javax.swing.JButton();
        btn_cargo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel_contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mascotas.setText("Mascotas");
        btn_mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mascotasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, -1));

        btn_factura.setText("Factura");
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, -1));

        btn_clientes.setText("Clientes");
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 140, -1));

        btn_empleados.setText("Empleados");
        btn_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, -1));

        btn_cargo.setText("Cargo");
        btn_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));

        jButton1.setText("Medicamentos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        jButton2.setText("Historial de Facturas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, -1));

        panel_contenedor.setBackground(new java.awt.Color(255, 51, 255));
        panel_contenedor.setPreferredSize(new java.awt.Dimension(1246, 597));
        panel_contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Fondo_Veterinaria.png"))); // NOI18N
        panel_contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panel_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        // TODO add your handling code here:
//      new clientes_vista().setVisible(true);
//      this.dispose();
    
        clientes_vista mv = new clientes_vista(); // NO hagas mv.setVisible(true);
        JPanel panelClientes = mv.getPanelClientes(); // obtenemos jPanel2
        
        mostrarPanel(panelClientes); // lo insertamos en el contenedor
        
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mascotasActionPerformed
        // TODO add your handling code here:
        //new mascota_vista().setVisible(true);
        
        mascota_vista mv = new mascota_vista(); // NO hagas mv.setVisible(true);
        JPanel panelMascotas = mv.getPanelMascotas(); // obtenemos jPanel2

        mostrarPanel(panelMascotas); // lo insertamos en el contenedor
        
    }//GEN-LAST:event_btn_mascotasActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        // TODO add your handling code here:
//        new factura_Vista().setVisible(true);
//        this.dispose();
        
        factura_Vista mv = new factura_Vista(); // NO hagas mv.setVisible(true);
        JPanel panelFactura = mv.getPanelFactura(); // obtenemos jPanel2
        
        mostrarPanel(panelFactura); // lo insertamos en el contenedor
        
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadosActionPerformed
        // TODO add your handling code here:
//        new empleado_vista().setVisible(true);
//        this.dispose();

        empleado_vista mv = new empleado_vista(); // NO hagas mv.setVisible(true);
        JPanel panelEmpleado = mv.getPanelEmpleado(); // obtenemos jPanel2
        
        mostrarPanel(panelEmpleado); // lo insertamos en el contenedor

    }//GEN-LAST:event_btn_empleadosActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargoActionPerformed
        // TODO add your handling code here:
        
        cargo_vista mv = new cargo_vista(); // NO hagas mv.setVisible(true);
        JPanel panelCargo = mv.getPanelCargo(); // obtenemos jPanel2
        mostrarPanel(panelCargo); // lo insertamos en el contenedor
        
    }//GEN-LAST:event_btn_cargoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Medicamentos_vista mv = new Medicamentos_vista(); // NO hagas mv.setVisible(true);
        JPanel panelMedicamentos = mv.getPanelMedicamentos(); // obtenemos jPanel2
        
        mostrarPanel(panelMedicamentos); // lo insertamos en el contenedor
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Formulario_Hist_Vista mv = new Formulario_Hist_Vista(); // NO hagas mv.setVisible(true);
        JPanel panelFactura_histo = mv.getPanelHistorial_Factura(); // obtenemos jPanel2
        
        mostrarPanel(panelFactura_histo); // lo insertamos en el contenedor
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargo;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_empleados;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_mascotas;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_contenedor;
    // End of variables declaration//GEN-END:variables
    
    private void configurarSegunRol(String rol) {
        if ((rol.equalsIgnoreCase("Veterinario"))) {
            btn_factura.setEnabled(false);
            btn_cargo.setEnabled(false);
            // desactiva los botones que desees
        }
    }
    
    
    public void mostrarPanel(JPanel panel) {
        panel.setSize(panel_contenedor.getSize());
        panel.setLocation(0, 0);
        panel_contenedor.removeAll();
        panel_contenedor.setLayout(new BorderLayout());
        panel_contenedor.add(panel, BorderLayout.CENTER);
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
    }
    
    public JPanel getPanelMenuCon() {
        return panel_contenedor;
    }
    
}
    
