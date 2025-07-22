package CRUD_Veterinaria;

import java.sql.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Medicamentos_vista extends javax.swing.JFrame {
    conexion con = new conexion();
    Connection cn = con.Conectar();
    Metodos me = new Metodos();
    
    public Medicamentos_vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnbuscar_idmedicamento = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtnombre_medicamento = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtprecio_unitario = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        txtidentidad_medicamentos = new javax.swing.JTextField();
        jdcfecha_caducacion = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();
        txtbuscar_medicamento = new javax.swing.JTextField();
        btnbuscar_medicamento = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(207, 185, 151));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro e Historial de Medicamentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1246, 597));

        jPanel1.setBackground(new java.awt.Color(237, 232, 208));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnbuscar_idmedicamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar_idmedicamento.setText("Buscar");
        btnbuscar_idmedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar_idmedicamentoActionPerformed(evt);
            }
        });

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        txtnombre_medicamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtnombre_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_medicamentoActionPerformed(evt);
            }
        });

        txtdescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        txtprecio_unitario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Unitario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtprecio_unitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecio_unitarioActionPerformed(evt);
            }
        });

        txtcantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        txtidentidad_medicamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtidentidad_medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentidad_medicamentosActionPerformed(evt);
            }
        });

        jdcfecha_caducacion.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CADUCACION"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtidentidad_medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtnombre_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbuscar_idmedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcantidad)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jdcfecha_caducacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtprecio_unitario))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidentidad_medicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnombre_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbuscar_idmedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcfecha_caducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprecio_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(237, 232, 208));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabledatos);

        txtbuscar_medicamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa Nombre o ID"));
        txtbuscar_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar_medicamentoActionPerformed(evt);
            }
        });

        btnbuscar_medicamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar_medicamento.setText("Buscar");
        btnbuscar_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar_medicamentoActionPerformed(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Regreso Boton.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtbuscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar_medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscar_idmedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar_idmedicamentoActionPerformed
        String idmedicamento = txtidentidad_medicamentos.getText();
        try {
            Connection cn = con.Conectar();

            PreparedStatement ps = cn.prepareStatement("SELECT nombre FROM medicamentos WHERE id_medicamento = ?");
            ps.setString(1, idmedicamento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtnombre_medicamento.setText(rs.getString("nombre"));
                me.limpiarCampos(txtcantidad, txtdescripcion, txtprecio_unitario);
                me.limpiarDateChooser(jdcfecha_caducacion);
            } else {
                int resp = JOptionPane.showConfirmDialog(this, "Medicamento no encontrado. ¿Deseas registrarlo?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    new clientes_vista().setVisible(true);
                    this.dispose();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al buscar el medicamento:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnbuscar_idmedicamentoActionPerformed

    private void txtnombre_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_medicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_medicamentoActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void txtprecio_unitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecio_unitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecio_unitarioActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

        // Obtener la fecha del JDateChooser
        java.util.Date fechaUtil = jdcfecha_caducacion.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

        if (txtcantidad.getText().trim().isEmpty() ||
            txtidentidad_medicamentos.getText().trim().isEmpty() ||
            //txtnombre_cliente.getText().trim().isEmpty() ||
            txtprecio_unitario.getText().trim().isEmpty() ||
            txtdescripcion.getText().trim().isEmpty() ||
            //combosexo.getSelectedItem().toString().equals("Seleccionar") ||
            fechaUtil == null)
        {

            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }

        try {
            Connection cn = con.Conectar();

            String query1 = ("SELECT id_cliente FROM cliente WHERE identidad = ?");
            PreparedStatement ps1 = cn.prepareStatement(query1);
            ps1.setString(1, txtidentidad_medicamentos.getText());

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                int idCliente = rs.getInt("id_cliente");

                // 2. Insertar el cargo con el id_empleado obtenido
                String query2 = "INSERT INTO mascota (nombre, especie, raza, fecha_nacimiento, sexo, id_cliente) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement ps2 = cn.prepareStatement(query2);
                ps2.setString(1, txtdescripcion.getText());
                ps2.setString(2, txtcantidad.getText());
                ps2.setString(3, txtprecio_unitario.getText());
                ps2.setDate(4, fechaSQL);
               // ps2.setString(5, combosexo.getSelectedItem().toString());
                ps2.setInt(6, idCliente);
                ps2.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cargo registrado correctamente.");
//                me.limpiarCampos(txtidentidad_medicamentos, txtid_mascota, txtnombre_medicamento, txtid_mascota, txtdescripcion, txtcantidad, txtprecio_unitario);
                me.limpiarDateChooser(jdcfecha_caducacion);
               // me.limpiarComboBox(combosexo);
               // mostrardatos();

            } else {
                int resp = JOptionPane.showConfirmDialog(this, "No se encontró un empleado con esa identidad. ¿Deseas registrarlo?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    new empleado_vista().setVisible(true);
                    this.dispose();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar mascota: ");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO DE ELIMINAR LA MASCOTA?","SALIR", JOptionPane.YES_NO_CANCEL_OPTION)==0){
            try{
                PreparedStatement ps=cn.prepareStatement("delete from mascota where id_mascota=?");
               // ps.setString(1, txtid_mascota.getText());
                //ps devuelve 0 cuando se ejecuta correctamente y por eso se actualiza la tabla
                int indice = ps.executeUpdate();
                if(indice>0){
               //     mostrardatos();
                }else{//no elimino nada por ende
                    JOptionPane.showMessageDialog(null,"No ha seleccionado la fila");
                }
              //  me.limpiarCampos(txtidentidad_medicamentos, txtid_mascota, txtnombre_medicamento, txtid_mascota, txtdescripcion, txtcantidad, txtprecio_unitario);
                me.limpiarDateChooser(jdcfecha_caducacion);
               // me.limpiarComboBox(combosexo);
                btnregistrar.setEnabled(true);

            }catch(SQLException e){
                System.out.println("Error al eliminar datos"+e);

            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        btnregistrar.setEnabled(true);

        java.util.Date fechaUtil = jdcfecha_caducacion.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());

        if (txtcantidad.getText().trim().isEmpty() ||
            txtidentidad_medicamentos.getText().trim().isEmpty() ||
            //txtnombre_cliente.getText().trim().isEmpty() ||
            txtprecio_unitario.getText().trim().isEmpty() ||
            txtdescripcion.getText().trim().isEmpty() ||
            //combosexo.getSelectedItem().toString().equals("Seleccionar") ||
            fechaUtil == null)
        {

            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }

        try {
            Connection cn = con.Conectar();

            // 1. Buscar el ID del empleado por identidad
            String query1 = "SELECT id_cliente FROM cliente WHERE identidad = ?";
            PreparedStatement ps1 = cn.prepareStatement(query1);
            ps1.setString(1, txtidentidad_medicamentos.getText());

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                int idCliente = rs.getInt("id_cliente");

                // 2. Hacer el UPDATE de mascota
                String query2 = "UPDATE mascota SET nombre = ?, especie = ?, raza = ?, fecha_nacimiento = ?, sexo = ?, id_cliente = ? WHERE id_mascota = ?";
                PreparedStatement ps2 = cn.prepareStatement(query2);
                // Asignar los valores del formulario
                ps2.setString(1, txtdescripcion.getText());
                ps2.setString(2, txtcantidad.getText());
                ps2.setString(3, txtprecio_unitario.getText());
                ps2.setDate(4, fechaSQL);
               // ps2.setString(5, combosexo.getSelectedItem().toString());
                ps2.setInt(6, idCliente);
               // ps2.setString(7, txtid_mascota.getText());

                int filasAfectadas = ps2.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Mascota actualizado correctamente.");
//                    me.limpiarCampos(txtidentidad_medicamentos, txtnombre_medicamento, txtdescripcion, txtcantidad, txtprecio_unitario, txtid_mascota);
                    me.limpiarDateChooser(jdcfecha_caducacion);
                   // me.limpiarComboBox(combosexo);
                   // mostrardatos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar la Mascota.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el cliente con la identidad ingresada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar el mascota.");
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtidentidad_medicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentidad_medicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentidad_medicamentosActionPerformed

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked

        // Activar/desactivar botones
        btnregistrar.setEnabled(false);
        btnactualizar.setEnabled(true);

        if(Sesion.rolActual.equals("Recepcionista") || (Sesion.rolActual.equals("Veterinario"))){
            btneliminar.setEnabled(false);
        }

        int fila = this.jtabledatos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.");
            return;
        }

        // Obtener valores de la fila
        String[] datos = new String[8];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = this.jtabledatos.getValueAt(fila, i).toString();
        }

        // Asignar a los campos
        this.txtidentidad_medicamentos.setText(datos[0]);
        this.txtnombre_medicamento.setText(datos[1]);
       // this.txtid_mascota.setText(datos[2]);
        this.txtdescripcion.setText(datos[3]);
        this.txtcantidad.setText(datos[4]);
        this.txtprecio_unitario.setText(datos[5]);
       // this.combosexo.setSelectedItem(datos[7]);

        // Convertir fecha si está presente
        if (!datos[6].equals("No especificada")) {
            try {
                this.jdcfecha_caducacion.setDate(new java.text.SimpleDateFormat("yyyy-MM-dd").parse(datos[6]));
            }catch (ParseException e){
                this.jdcfecha_caducacion.setDate(null);
                JOptionPane.showMessageDialog(this, "Error al cargar la fecha.");
            }
        } else {
            this.jdcfecha_caducacion.setDate(null);
        }
        try (
            PreparedStatement ps = cn.prepareStatement("SELECT identidad FROM cliente WHERE id_cliente = ?")) {

            ps.setString(1, datos[0]); // ← ID del cliente
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                this.txtidentidad_medicamentos.setText(rs.getString("identidad"));
            } else {
                this.txtidentidad_medicamentos.setText("");
                JOptionPane.showMessageDialog(this, "Identidad del cliente no encontrada.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar identidad del cliente.");
        }
    }//GEN-LAST:event_jtabledatosMouseClicked

    private void txtbuscar_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar_medicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar_medicamentoActionPerformed

    private void btnbuscar_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar_medicamentoActionPerformed

        String busqueda = txtbuscar_medicamento.getText().trim();
       // me.limpiarCampos(txtidentidad_medicamentos, txtid_mascota, txtnombre_medicamento, txtid_mascota, txtdescripcion, txtcantidad, txtprecio_unitario);
        me.limpiarDateChooser(jdcfecha_caducacion);
       // me.limpiarComboBox(combosexo);
        //btnregistrar.setEnabled(true);

        if (busqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa un nombre o ID de mascota para buscar.");
         //   mostrardatos();
            return;
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Dueño");
        modelo.addColumn("ID");
        modelo.addColumn("Mascota");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Sexo");

        String query = "SELECT m.id_mascota, m.nombre, m.especie, m.raza, m.fecha_nacimiento, m.sexo, c.id_cliente, c.nombre " +
        "FROM mascota m INNER JOIN cliente c ON c.id_cliente = m.id_cliente " +
        "WHERE c.nombre LIKE ? OR CAST(m.id_mascota AS CHAR) LIKE ?";

        try {
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, "%" + busqueda + "%");
            ps.setString(2, "%" + busqueda + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getInt("id_cliente");      // ID Cliente
                fila[1] = rs.getString("c.nombre");     // Dueño de la Mascota
                fila[2] = rs.getInt("id_mascota");      // ID Mascota
                fila[3] = rs.getString("m.nombre");     // Nombre de Mascota
                fila[4] = rs.getString("especie");      // Especie
                fila[5] = rs.getString("raza");         // Raza
                fila[6] = rs.getString("fecha_nacimiento") != null ? rs.getString("fecha_nacimiento") : "No especificada"; // Fecha Nacimiento
                fila[7] = rs.getString("sexo");         // Sexo
                modelo.addRow(fila);
            }

            jtabledatos.setModel(modelo);
            me.ajustarAnchoColumnas(jtabledatos, 150);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No se encontraron mascotas con ese nombre o ID.");
             //   mostrardatos();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnbuscar_medicamentoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        new Menu_vista().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicamentos_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicamentos_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar_idmedicamento;
    private javax.swing.JButton btnbuscar_medicamento;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jdcfecha_caducacion;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JTextField txtbuscar_medicamento;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtidentidad_medicamentos;
    private javax.swing.JTextField txtnombre_medicamento;
    private javax.swing.JTextField txtprecio_unitario;
    // End of variables declaration//GEN-END:variables
}
