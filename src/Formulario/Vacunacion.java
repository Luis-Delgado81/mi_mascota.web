
package Formulario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;


public class Vacunacion extends javax.swing.JFrame {

    public static final String url = "jdbc:mysql://localhost:3306/mi_mascota"; 
    public static final String user = "root";
    public static final String password = "";
    PreparedStatement ps;
    ResultSet rs;

  
    public static Connection getConnection() {
        Connection cx = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.print(e);
        }
        return cx;
    }

    private void limpiar(){
        dosis.setText("");
        tratamiento.setText("");
        fecha.setText("");
        cod_macota.setSelectedIndex(0);
        cod_vacuna.setSelectedIndex(0);
        dosis.grabFocus();
    }
    public Vacunacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        limpiar = new javax.swing.JLabel();
        cod_macota = new javax.swing.JComboBox<>();
        cod_vacuna = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dosis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tratamiento = new javax.swing.JTextPane();
        fecha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setText("Tratamiento:");

        jLabel3.setText("Fecha");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VACUNACION");

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/note.png"))); // NOI18N
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
        });

        cod_macota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cod_macota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_macotaActionPerformed(evt);
            }
        });

        cod_vacuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cod_vacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_vacunaActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo Mascota:");

        jLabel5.setText("Codigo Vacuna:");

        jLabel7.setText("Dosis:");

        jScrollPane1.setViewportView(tratamiento);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cerrar)
                            .addGap(4, 4, 4)
                            .addComponent(limpiar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(buscar)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(cod_macota, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ingresar)
                                    .addGap(18, 18, 18)
                                    .addComponent(actualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(eliminar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cod_vacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(limpiar)
                    .addComponent(cerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cod_macota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cod_vacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingresar)
                            .addComponent(actualizar)
                            .addComponent(eliminar)
                            .addComponent(buscar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
         Connection cx = null;
        try {
            cx = getConnection();
            String sql = "SELECT * FROM vacunacion WHERE COD_MASCOTA = ?";
            ps = cx.prepareStatement(sql);
            ps.setString(1, cod_macota.getSelectedItem().toString());
            rs = ps.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("CODIGO");
            modelo.addColumn("DOSIS");
            modelo.addColumn("COD_MASCOTA");
            modelo.addColumn("COD_VACUNA");
            modelo.addColumn("TRATAMIENTO");
            modelo.addColumn("FECHA");

            tabla.setModel(modelo);

            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getString("CODIGO");
                fila[1] = rs.getString("DOSIS");
                fila[2] = rs.getString("COD_MASCOTA");
                fila[3] = rs.getString("COD_VACUNA");
                fila[4] = rs.getString("TRATAMIENTO");
                fila[5] = rs.getString("FECHA");
                modelo.addRow(fila);
            }

            cx.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarMouseClicked

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        
         Connection cx = null;
        try {
            cx = getConnection();
            ps = cx.prepareStatement("INSERT INTO vacunacion (DOSIS, COD_MASCOTA, COD_VACUNA, TRATAMIENTO, FECHA) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(dosis.getText()));
            ps.setString(2, cod_macota.getSelectedItem().toString());
            ps.setString(3, cod_vacuna.getSelectedItem().toString());
            ps.setString(4, tratamiento.getText());
            ps.setString(5, fecha.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
            cx.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        limpiar();
    }//GEN-LAST:event_ingresarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        Connection cx = null;
    try {
        cx = getConnection();
        ps = cx.prepareStatement("UPDATE vacunacion SET DOSIS = ?, TRATAMIENTO = ?, FECHA = ? WHERE CODIGO = ?");
        ps.setInt(1, Integer.parseInt(dosis.getText()));
        ps.setString(2, tratamiento.getText());
        ps.setString(3, fecha.getText());
        ps.setString(4, tabla.getValueAt(tabla.getSelectedRow(), 0).toString());  // Obtén el código de la fila seleccionada
        
        int res = ps.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Actualizar");
        }
        cx.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    limpiar();
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Connection cx = null;
    try {
        cx = getConnection();
        ps = cx.prepareStatement("DELETE FROM vacunacion WHERE CODIGO = ?");
        ps.setString(1, tabla.getValueAt(tabla.getSelectedRow(), 0).toString());

        int res = ps.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
        }
        cx.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    limpiar();;
    }//GEN-LAST:event_eliminarActionPerformed

    private void cod_macotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_macotaActionPerformed
        Connection cx = getConnection();
        String sql = "SELECT CODIGO FROM mascota";
        try {
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            cod_macota.removeAllItems();
            while (rs.next()) {
                cod_macota.addItem(rs.getString("CODIGO"));
            }
            cx.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    }//GEN-LAST:event_cod_macotaActionPerformed

    private void cod_vacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_vacunaActionPerformed
        Connection cx = getConnection();
        String sql = "SELECT CODIGO FROM vacuna";
        try {
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery();
            cod_vacuna.removeAllItems();
            while (rs.next()) {
                cod_vacuna.addItem(rs.getString("CODIGO"));
            }
            cx.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cod_vacunaActionPerformed

    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vacunacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JComboBox<String> cod_macota;
    private javax.swing.JComboBox<String> cod_vacuna;
    private javax.swing.JTextField dosis;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel limpiar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextPane tratamiento;
    // End of variables declaration//GEN-END:variables

