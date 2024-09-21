/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;


import Logica.Controlador;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author topo
 */
public class DejarDeSeguirUsuario extends javax.swing.JInternalFrame {

    Controlador control= new Controlador();
    public DejarDeSeguirUsuario() {
        initComponents();
        setTitle("Dejar de seguir usuario");
        cargarComboSeguidor();
        txtSeguidor.setVisible(false);
    }
private void cargarComboSeguidor() {
        comboSeguidor.removeAllItems();
        List<String> listaClientes = control.MostrarNombreClientes(); // Obtener los correos de los clientes
        for (String correo : listaClientes) {
            comboSeguidor.addItem(correo);
        }
    }

private void actualizarNicknameSeguidor() {
    String correoSeguidor = (String) comboSeguidor.getSelectedItem();
    if (correoSeguidor != null) {
        String nickname = control.encontrarNicknameCliente(correoSeguidor); // Cambiar a la operación correcta
        if (nickname != null) {
            txtSeguidor.setText(nickname);
            txtSeguidor.setVisible(true);
            cargarSeguidos();
        } else {
            txtSeguidor.setText("Desconocido");
        }
    }
}

    private void cargarSeguidos() {
    comboSeguido.removeAllItems();
    String correoSeguidor = (String) comboSeguidor.getSelectedItem();
    if (correoSeguidor == null) {
        return;
    }
    List<String> seguidos = control.obtenerSeguidos(correoSeguidor);
    for (String seguido : seguidos) {
        comboSeguido.addItem(seguido);
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        label_Seguidor = new javax.swing.JLabel();
        label_Seguido = new javax.swing.JLabel();
        comboSeguidor = new javax.swing.JComboBox<>();
        comboSeguido = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSeguidor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        label_Seguidor.setText("Seguidor");

        label_Seguido.setText("Seguido");

        comboSeguidor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSeguidorItemStateChanged(evt);
            }
        });
        comboSeguidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeguidorActionPerformed(evt);
            }
        });

        comboSeguido.setModel(new javax.swing.DefaultComboBoxModel<>());
        comboSeguido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSeguidoItemStateChanged(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nickname");

        txtSeguidor.setText("...");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Dejar de seguir usuario");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSeguidor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(label_Seguidor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_Seguido)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(0, 103, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addComponent(comboSeguidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(comboSeguido, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnAceptar))))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Seguidor)
                    .addComponent(label_Seguido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSeguidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSeguido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSeguidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void comboSeguidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeguidorActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_comboSeguidorActionPerformed

    private void comboSeguidorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSeguidorItemStateChanged
    if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        actualizarNicknameSeguidor();
    }
    }//GEN-LAST:event_comboSeguidorItemStateChanged

    private void comboSeguidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSeguidoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSeguidoItemStateChanged

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    String mailSeguidor = (String) comboSeguidor.getSelectedItem();
    String mailSeguido = (String) comboSeguido.getSelectedItem();
    try {
        control.dejarSeguirUsuario(mailSeguidor, mailSeguido); // Asegúrate de que el nombre del método es correcto
        JOptionPane.showMessageDialog(this, "Ahora " + txtSeguidor.getText() + " ya no sigue al usuario " + mailSeguido, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboSeguido;
    private javax.swing.JComboBox<String> comboSeguidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_Seguido;
    private javax.swing.JLabel label_Seguidor;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel txtSeguidor;
    // End of variables declaration//GEN-END:variables
}
