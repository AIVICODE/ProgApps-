/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Logica.Artista;
import Logica.Cliente;
import Logica.Controlador;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author topo
 */
public class SeguirUsuario extends javax.swing.JInternalFrame {

    Controlador control= new Controlador();
    public SeguirUsuario() {
        initComponents();
        setTitle("Seguir usuario");
        List<Cliente> listaClientes = control.listaClientes();
        for (Cliente auxC:listaClientes){
            comboSeguidor.addItem(auxC.getMail());
        }
        cargaComboSeguido();
        comboSeguidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarComboSeguido();
            }
        });
        txtSeguidor.setVisible(false);
        txtSeguido.setVisible(false);
    }
    private void cargaComboSeguido() {
        comboSeguido.removeAllItems();
        
        // Cargar todos los clientes
        List<Cliente> listaClientes = control.listaClientes();
        for (Cliente cliente : listaClientes) {
            comboSeguido.addItem(cliente.getMail() + " (Cliente)");
        }

        // Cargar todos los artistas
        List<Artista> listaArtistas = control.listaArtistas();
        for (Artista artista : listaArtistas) {
            comboSeguido.addItem(artista.getMail() + " (Artista)");
        }
    }
    private void actualizarComboSeguido() {
        // Obtener el cliente seleccionado en comboSeguidor
        String correoSeguidor = (String) comboSeguidor.getSelectedItem();
        
        if (correoSeguidor == null || correoSeguidor.isEmpty()) {
            return;
        }
        
        // Limpiar el comboSeguido
        comboSeguido.removeAllItems();

        // Obtener todos los clientes y excluir el que está seleccionado en comboSeguidor
        List<Cliente> listaClientes = control.listaClientes();
        for (Cliente cliente : listaClientes) {
            if (!cliente.getMail().equals(correoSeguidor)) {
                comboSeguido.addItem(cliente.getMail());
            }
        }

        // Cargar todos los artistas (no excluir al artista)
        List<Artista> listaArtistas = control.listaArtistas();
        for (Artista artista : listaArtistas) {
            comboSeguido.addItem(artista.getMail());
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
        jLabel1 = new javax.swing.JLabel();
        txtSeguidor = new javax.swing.JLabel();
        txtSeguido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        txtSeguido.setText("...");

        jLabel3.setText("Nickname");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(72, 72, 72))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(label_Seguidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Seguido)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSeguidor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtSeguidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSeguido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeguido)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Seguidor)
                    .addComponent(label_Seguido))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSeguidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSeguido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeguido)
                    .addComponent(txtSeguidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(43, 43, 43))
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

    private void comboSeguidorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSeguidorItemStateChanged
        // TODO add your handling code here:
        Cliente cliente = control.encontrarCliente((String) comboSeguidor.getSelectedItem());
        txtSeguidor.setText(cliente.getNickname());
        txtSeguidor.setVisible(true);
    }//GEN-LAST:event_comboSeguidorItemStateChanged

    private void comboSeguidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeguidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSeguidorActionPerformed

    private void comboSeguidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSeguidoItemStateChanged
        Cliente cli = control.encontrarCliente((String) comboSeguido.getSelectedItem());
        Artista art = control.encontrarArtista((String) comboSeguido.getSelectedItem());
        if(cli != null){
            txtSeguido.setText(cli.getNickname());
        }else if (art != null){
            txtSeguido.setText(art.getNickname());
        }
        txtSeguido.setVisible(true);
    }//GEN-LAST:event_comboSeguidoItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String mailSeguidor = (String) comboSeguidor.getSelectedItem();
        String mailSeguido = (String) comboSeguido.getSelectedItem();
        try {
            control.seguirUsuario(mailSeguidor, mailSeguido);
            JOptionPane.showMessageDialog(this, "Ahora "+txtSeguidor.getText()+" sigue al usuario "+ mailSeguido +" ", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            java.util.logging.Logger.getLogger(SeguirUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboSeguido;
    private javax.swing.JComboBox<String> comboSeguidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_Seguido;
    private javax.swing.JLabel label_Seguidor;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel txtSeguido;
    private javax.swing.JLabel txtSeguidor;
    // End of variables declaration//GEN-END:variables
}
