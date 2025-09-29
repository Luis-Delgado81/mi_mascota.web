/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;


public class Producto extends javax.swing.JFrame {

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
        codigo.setText("");
        nombre.setText("");
        precio.setText("");
        descripcion.setText("");
        codigo.grabFocus();
    }
    public Producto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        limpiar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Descripcion:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

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
        jLabel6.setText("PRODUCTOS");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrar)
                        .addGap(4, 4, 4)
                        .addComponent(limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar)
                            .addComponent(ingresar))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizar)
                            .addComponent(eliminar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(232, 232, 232)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descripcion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar)
                        .addGap(7, 7, 7)
                        .addComponent(ingresar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actualizar)
                        .addGap(7, 7, 7)
                        .addComponent(eliminar)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Connection cx = null;
        
        try{
            cx = getConnection();
            ps = cx.prepareStatement("SELECT * FROM productos WHERE codigo = ?");
            ps.setString(1,codigo.getText());
            rs = ps.executeQuery();
            if(rs.next()){
                nombre.setText(rs.getString("NOMBRE"));
                precio.setText(rs.getString("PRECIO"));
                descripcion.setText(rs.getString("DESCRIPCION"));
                
            }else {
                JOptionPane.showMessageDialog(null, "El producto no existe en la base de datos");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarMouseClicked

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        
        Connection cx = null;
        
        try{
            cx = getConnection();
            ps = cx.prepareStatement("INSERT INTO productos (CODIGO, NOMBRE, PRECIO, DESCRIPCION) VALUES (?, ?, ?, ?)");
            ps.setString(1,codigo.getText());
            ps.setString(2,nombre.getText());
            ps.setString(3,precio.getText());
            ps.setString(4,descripcion.getText());
            int res = ps.executeUpdate();
            
            if (res > 0 ){
                JOptionPane.showMessageDialog(null,"Registro Guardado");
            }else{
                JOptionPane.showMessageDialog(null,"Error al Guardar");
            }
            cx.close();
        }catch (Exception e) {
            System.out.println(e);
        }
        limpiar();
    }//GEN-LAST:event_ingresarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        Connection cx = null;
        
        try{
            cx = getConnection();
            ps = cx.prepareStatement("UPDATE productos SET CODIGO = ?, NOMBRE = ?, PRECIO = ?, DESCRIPCION = ? WHERE CODIGO = ?");
            ps.setString(1,codigo.getText());
            ps.setString(2,nombre.getText());
            ps.setString(3,precio.getText());
            ps.setString(4,descripcion.getText());
            ps.setString(5,codigo.getText());
            int res = ps.executeUpdate();
            
            if (res > 0 ){
                JOptionPane.showMessageDialog(null,"Se actualizaron los datos");
            }else{
                JOptionPane.showMessageDialog(null,"Error no se pudo Actualizar");
            }
            cx.close();
        }catch (Exception e){
            System.out.println(e);
        }
        limpiar();
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        Connection cx = null;

        try {
            cx = getConnection();
            ps = cx.prepareStatement("DELETE FROM productos WHERE CODIGO = ?");

            // Usamos setString en lugar de setInt para manejar posibles códigos alfanuméricos
            ps.setString(1, codigo.getText());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "El producto ha sido eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error: no se pudo eliminar el producto");
            }
            cx.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        limpiar();
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}
