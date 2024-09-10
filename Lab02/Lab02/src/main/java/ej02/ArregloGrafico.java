/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package ej02;

/**
 *
 * @author Multipropósito2
 */

import javax.swing.JOptionPane;
public class ArregloGrafico extends javax.swing.JFrame {

   private Carro[] carros;  // Arreglo para almacenar los carros
    private int contadorCarros = 0;  // Contador de carros ingresados

    /**
     * Creates new form ArregloGrafico
     */
    public ArregloGrafico() {
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

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnGuardarCarro = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        btnOrdenarKilometraje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadCarros = new javax.swing.JTextField();
        btnOrdenarModelo = new javax.swing.JButton();
        btnConfirmarCantidad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCarros = new javax.swing.JTextArea();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardarCarro.setText("Guardar");
        btnGuardarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCarroActionPerformed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        btnOrdenarKilometraje.setText("Ordenar por Kilometraje");
        btnOrdenarKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarKilometrajeActionPerformed(evt);
            }
        });

        jLabel1.setText("Marca");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        jLabel2.setText("Modelo");

        txtKilometraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrajeActionPerformed(evt);
            }
        });

        jLabel3.setText("Kilometraje");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        jLabel4.setText("Color");

        jLabel5.setText("Numero de carros ");

        txtCantidadCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadCarrosActionPerformed(evt);
            }
        });

        btnOrdenarModelo.setText("Ordenar por Modelo");
        btnOrdenarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarModeloActionPerformed(evt);
            }
        });

        btnConfirmarCantidad.setText("OK");
        btnConfirmarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCantidadActionPerformed(evt);
            }
        });

        txtAreaCarros.setColumns(20);
        txtAreaCarros.setRows(5);
        jScrollPane1.setViewportView(txtAreaCarros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCantidadCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirmarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnOrdenarKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdenarKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidadCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConfirmarCantidad)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOrdenarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCarroActionPerformed
        
    if (contadorCarros < carros.length) {
        // Obtener los datos ingresados
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        int kilometraje = Integer.parseInt(txtKilometraje.getText());

        // Crear un objeto Carro y almacenarlo en el arreglo
        carros[contadorCarros] = new Carro(marca, modelo, color, kilometraje);
        contadorCarros++;

        // Limpiar los campos para el siguiente ingreso
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtKilometraje.setText("");

        // Avisar si ya se han ingresado todos los carros
        if (contadorCarros == carros.length) {
            JOptionPane.showMessageDialog(this, "Todos los carros han sido ingresados.");
        } else {
            JOptionPane.showMessageDialog(this, "Carro guardado. Ingrese los datos del siguiente carro.");
        }
    }

// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCarroActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrajeActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtCantidadCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCarrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadCarrosActionPerformed

    private void btnOrdenarKilometrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarKilometrajeActionPerformed
        // TODO add your handling code here:
         if (carros != null && carros.length > 0) {
            // Ordenar el arreglo por kilometraje
            bubbleSortKilometraje(carros);
            // Mostrar los carros ordenados en el JTextArea
            mostrarCarros();
            JOptionPane.showMessageDialog(this, "Carros ordenados por kilometraje.");
        } else {
            JOptionPane.showMessageDialog(this, "No hay carros para ordenar.");
        }
    }//GEN-LAST:event_btnOrdenarKilometrajeActionPerformed

    private void btnOrdenarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarModeloActionPerformed
       if (carros != null && carros.length > 0) {
            // Ordenar el arreglo por año del modelo
            bubbleSortModelo(carros);
            // Mostrar los carros ordenados en el JTextArea
            mostrarCarros();
            JOptionPane.showMessageDialog(this, "Carros ordenados por modelo (año).");
        } else {
            JOptionPane.showMessageDialog(this, "No hay carros para ordenar.");
        }  // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarModeloActionPerformed

    private void btnConfirmarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCantidadActionPerformed
    int cantidad = Integer.parseInt(txtCantidadCarros.getText());  // Leer la cantidad de carros
    carros = new Carro[cantidad];  // Inicializar el arreglo con esa cantidad
    contadorCarros = 0;  // Iniciar el contador en 0
    JOptionPane.showMessageDialog(this, "Ingrese los datos del primer carro.");        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarCantidadActionPerformed

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
            java.util.logging.Logger.getLogger(ArregloGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArregloGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArregloGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArregloGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArregloGrafico().setVisible(true);
            }
        });
    }
    public static void bubbleSortKilometraje(Carro[] carros) {
    int n = carros.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (carros[j].getKilometraje() > carros[j + 1].getKilometraje()) {
                // Intercambiar si el kilometraje actual es mayor
                Carro temp = carros[j];
                carros[j] = carros[j + 1];
                carros[j + 1] = temp;
            }
        }
    }
}
    public static void bubbleSortModelo(Carro[] carros) {
    int n = carros.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (Integer.parseInt(carros[j].getModelo()) > Integer.parseInt(carros[j + 1].getModelo())) {
                // Intercambiar si el modelo (año) actual es mayor
                Carro temp = carros[j];
                carros[j] = carros[j + 1];
                carros[j + 1] = temp;
            }
        }
    }
}
private void mostrarCarros() {
    StringBuilder sb = new StringBuilder();
    for (Carro carro : carros) {
        sb.append(carro.toString()).append("\n");
    }
    txtAreaCarros.setText(sb.toString());
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarCantidad;
    private javax.swing.JButton btnGuardarCarro;
    private javax.swing.JButton btnOrdenarKilometraje;
    private javax.swing.JButton btnOrdenarModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea txtAreaCarros;
    private javax.swing.JTextField txtCantidadCarros;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
