/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.grados_combo;

/**
 *
 * @author Nallely
 */
public class moneda extends javax.swing.JFrame {
    
    int cantidad = 0;
    double conversion=0;
    String de ="Peso";
    String a  ="Peso" ;
    
    double Peso = 1; 
    double Dolar = 18.98; // 1
    double Euro = 20.30;  // 2
    double Libra = 23.08; // 3
    double Yen = 0.14;    // 4
    double Won = .014;   // 5
    
        /**
     * Creates new form moneda
     */
    public moneda() {
        initComponents();
    }
    
    
    public String aMoneda(double cantidad, String moneda){
        return "$" + Math.round(cantidad*100.0)/100.0 + " " + moneda;
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIngresar_datos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tipo_moneda = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblmoneda = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipo_cambio = new javax.swing.JComboBox<>();
        btconvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Conversor de Monedas");

        jLabel2.setText("Ingresa la cantidad a convertir");

        txtIngresar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresar_datosActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecciona el tipo de moneda");

        tipo_moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso", "Dolar", "Euro", "Libra", "Yen", "Won", " " }));
        tipo_moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_monedaActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado:");

        jLabel5.setText("Selecciona el tipo de cambio");

        tipo_cambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso", "Dolar", "Euro", "Libra", "Yen", "Won", " " }));
        tipo_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_cambioActionPerformed(evt);
            }
        });

        btconvertir.setText("Convertir");
        btconvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtIngresar_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btconvertir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tipo_moneda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipo_cambio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtIngresar_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipo_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipo_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btconvertir)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(lblmoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresar_datosActionPerformed
        // TODO add your handling code here:
        cantidad = Integer.valueOf(txtIngresar_datos.getText());
        convertir();
    }//GEN-LAST:event_txtIngresar_datosActionPerformed

    private void tipo_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_monedaActionPerformed
        
        de = tipo_moneda.getSelectedItem().toString();
        
        convertir();
        
       
        
        
    }//GEN-LAST:event_tipo_monedaActionPerformed

    private void btconvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconvertirActionPerformed
        // TODO add your handling code here:
        cantidad = Integer.valueOf(txtIngresar_datos.getText());
        convertir();
         
    }//GEN-LAST:event_btconvertirActionPerformed
    
    public void  convertir(){
        switch(de){
            case "Peso": {
                conversion = switch (a) {
                case "Dolar" -> cantidad/Dolar;
                case "Euro" -> cantidad/Euro;
                case "Libra" -> cantidad/Libra;
                case "Yen" -> cantidad/Yen;
                case "Won" -> cantidad/Won;
                default -> cantidad;
                }; //Peso
                break;
            }
            
            case "Dolar": {
                conversion = switch (a) {
                case "Peso" -> cantidad*Dolar;
                case "Euro" -> (cantidad*Dolar)/Euro;
                case "Libra" -> (cantidad*Dolar)/Libra;
                case "Yen" -> (cantidad*Dolar)/Yen;
                case "Won" -> (cantidad*Dolar)/Won;
                default -> cantidad;
                }; //Peso
                break;
            }
            
            case "Euro": {
                conversion = switch (a) {
                case "Peso" -> cantidad*Euro;
                //case "Euro" -> (cantidad*Euro)/Euro;
                case "Libra" -> (cantidad*Euro)/Libra;
                case "Yen" -> (cantidad*Euro)/Yen;
                case "Won" -> (cantidad*Euro)/Won;
                default -> cantidad;
                }; //Peso
                break;
            }
            
            case "Libra": {
                conversion = switch (a) {
                case "Peso" -> cantidad*Libra;
                case "Euro" -> (cantidad*Libra)/Euro;
                case "Dolar" -> (cantidad*Libra)/Dolar;
                case "Yen" -> (cantidad*Libra)/Yen;
                case "Won" -> (cantidad*Libra)/Won;
                default -> cantidad;
                }; //Peso
                break;
            }
            
            case "Yen": {
                conversion = switch (a) {
                case "Peso" -> cantidad*Yen;
                case "Dolar" -> (cantidad*Yen)/Dolar;    
                case "Euro" -> (cantidad*Yen)/Euro;
                case "Libra" -> (cantidad*Yen)/Libra;
                case "Won" -> (cantidad*Yen)/Won;
                default -> cantidad;
                }; //Peso
                break;
            }
            
            case "Won": {
                conversion = switch (a) {
                case "Peso" -> cantidad*Won;
                case "Dolar" -> (cantidad*Won)/Dolar;
                case "Euro" -> (cantidad*Won)/Euro;
                case "Libra" -> (cantidad*Won)/Libra;
                case "Yen" -> (cantidad*Won)/Yen;
                default -> cantidad;
                }; //Peso
                break;
            }
        }
        txtResultado.setText(aMoneda(cantidad,de)+ " -> " + aMoneda(conversion, a));
    }
    private void tipo_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_cambioActionPerformed
        // TODO add your handling code here:
        //cantidad = Double.parseDouble(txtIngresar_datos.getText());
        a =tipo_cambio.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_tipo_cambioActionPerformed

    
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
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btconvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblmoneda;
    private javax.swing.JComboBox<String> tipo_cambio;
    private javax.swing.JComboBox<String> tipo_moneda;
    private javax.swing.JTextField txtIngresar_datos;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
