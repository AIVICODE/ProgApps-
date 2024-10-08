
package GUI;


import Datatypes.DTCliente;
import Logica.Fabrica;
import Logica.IControlador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author topo
 */
public class DejarDeSeguirUsuario extends javax.swing.JInternalFrame {
    Fabrica fabrica = Fabrica.getInstance();
    IControlador control = fabrica.getIControlador();
    public DejarDeSeguirUsuario() {
        initComponents();
        setTitle("Dejar de seguir usuario");
        cargarComboSeguidor();
    }
private void cargarComboSeguidor() {
        comboSeguidor.removeAllItems();
        List<String> listaClientes = control.nicksClientes(); // Obtener los nicks de los clientes
        for (String nick : listaClientes) {
            comboSeguidor.addItem(nick);
        }
    }

    
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Dejar de seguir usuario");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
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
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
            try {
                String correoSeleccionado= control.ConvierteNick_A_Correo((String) comboSeguidor.getSelectedItem());

                comboSeguido.removeAllItems();
                String correoSeguidor =correoSeleccionado;
                if (correoSeguidor == null) {
                    return;
                }
                List<String> seguidos = control.obtenerSeguidos(correoSeguidor);// tiene nicks de clientes y despues de artistas
                for (String seguido : seguidos){
                    comboSeguido.addItem(seguido);//el combo se llena con los nicks de clientes y luego de artistas
                }
                /*for (String seguido : seguidos) {
                    String cli = control.encontrarNicknameCliente(seguido);
                    comboSeguido.addItem(cli);
                }//*/
            } catch (Exception ex) {
                }
        }
    }//GEN-LAST:event_comboSeguidorItemStateChanged

    private void comboSeguidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSeguidoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSeguidoItemStateChanged

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    try {                                           
        String nicknameSeguidor = (String) comboSeguidor.getSelectedItem();
        String nicknameSeguido = (String) comboSeguido.getSelectedItem();
        
        String correoSeguidor= control.ConvierteNick_A_Correo(nicknameSeguidor);
        String correoSeguido= control.ConvierteNick_A_Correo(nicknameSeguido);
        
        
        try {
            control.dejarSeguirUsuario(correoSeguidor, correoSeguido); // Asegúrate de que el nombre del método es correcto
            JOptionPane.showMessageDialog(this, "Ahora " + (String) comboSeguidor.getSelectedItem()+ " ya no sigue al usuario " + (String) comboSeguido.getSelectedItem(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
            comboSeguido.removeAllItems();// Limpia y recarga
            List<String> seguidos = control.obtenerSeguidos(correoSeguidor);// tiene nicks de clientes y despues de artistas
                for (String seguido : seguidos){
                    comboSeguido.addItem(seguido);//el combo se llena con los nicks de clientes y luego de artistas
                }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(DejarDeSeguirUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboSeguido;
    private javax.swing.JComboBox<String> comboSeguidor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_Seguido;
    private javax.swing.JLabel label_Seguidor;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
