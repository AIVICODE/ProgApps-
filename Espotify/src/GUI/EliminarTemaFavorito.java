/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Logica.Fabrica;
import Logica.IControlador;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class EliminarTemaFavorito extends javax.swing.JInternalFrame {

    Fabrica fabrica = Fabrica.getInstance();
    IControlador control = fabrica.getIControlador();   
    
    public EliminarTemaFavorito() {
        initComponents();
        actualizarComboBoxClientes();
        actualizarComboBoxArtistas(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        comboArtistas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboAlbumes = new javax.swing.JComboBox<>();
        comboTemas = new javax.swing.JComboBox<>();
        botonC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        comboArtistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboArtistas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboArtistasItemStateChanged(evt);
            }
        });

        jLabel1.setText("Nombre del cliente");

        jLabel3.setText("Seleccione artista");

        jLabel2.setText("Nombre del album");

        jLabel4.setText("Tema a eliminar");

        jButton1.setText("Eliminar Tema");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboAlbumes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAlbumesItemStateChanged(evt);
            }
        });
        comboAlbumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlbumesActionPerformed(evt);
            }
        });

        botonC.setText("Cancelar");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Eliminar tema de favoritos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, 147, Short.MAX_VALUE)
                                    .addComponent(comboArtistas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboAlbumes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(botonC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addContainerGap(64, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(comboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonC)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged

    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {                                         
            String nicknameCliente = (String) jComboBox2.getSelectedItem();
            
            String nicknameArtista = (String) comboArtistas.getSelectedItem();
            
            String nombreAlbum = (String)comboAlbumes.getSelectedItem();
            
            String nombreTema = (String) comboTemas.getSelectedItem();
            String correoCliente= control.ConvierteNick_A_Correo(nicknameCliente);
            String correoArtista= control.ConvierteNick_A_Correo(nicknameArtista);
            try {
                control.EliminarTemaFavorito(correoCliente, correoArtista, nombreAlbum,nombreTema);
                JOptionPane.showMessageDialog(null, "Tema eliminado de favorito exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            comboTemas.removeAllItems();
            comboAlbumes.removeAllItems();
        } catch (Exception ex) {
             Logger.getLogger(EliminarTemaFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboArtistasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboArtistasItemStateChanged
        comboAlbumes.removeAllItems();
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
        try {
            
             String correoArtista= control.ConvierteNick_A_Correo((String) comboArtistas.getSelectedItem());
            //llenar combo albumes
            for(String s:control.listaAlbumesArtistaMail(correoArtista)){
                comboAlbumes.addItem(s);
            }
        } catch (Exception ex) {
            Logger.getLogger(EliminarTemaFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_comboArtistasItemStateChanged

    private void comboAlbumesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAlbumesItemStateChanged
      if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
        try {
            
            //llenar combo temas
            String correoArtista= control.ConvierteNick_A_Correo((String) comboArtistas.getSelectedItem());
            comboTemas.removeAllItems();
            for(String s:control.temasDeAlbumDeArtista((String)comboAlbumes.getSelectedItem(), correoArtista)){
                comboTemas.addItem(s);
            }
        } catch (Exception ex) {
            Logger.getLogger(EliminarTemaFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_comboAlbumesItemStateChanged

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCActionPerformed

    private void comboAlbumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlbumesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAlbumesActionPerformed
private void actualizarComboBoxClientes() {
    List<String> correosClientes = control.nicksClientes(); // Obtenemos la lista de correos
    
    jComboBox2.removeAllItems(); // Limpiamos los ítems actuales del comboBox
    
    for (String correo : correosClientes) {
        jComboBox2.addItem(correo); // Agregamos cada correo al comboBox
    }
}
private void actualizarComboBoxArtistas() {
        try {
            String correoCliente= control.ConvierteNick_A_Correo((String) jComboBox2.getSelectedItem());
            
            
            List<String> correosArtistas= control.nicknamesDeTodosLosArtistas(); // Obtenemos la lista de correos
            
            comboArtistas.removeAllItems(); // Limpiamos los ítems actuales del comboBox
            
            for (String correo : correosArtistas) {
                comboArtistas.addItem(correo); // Agregamos cada correo al comboBox
            }   } catch (Exception ex) {
            Logger.getLogger(EliminarTemaFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonC;
    private javax.swing.JComboBox<String> comboAlbumes;
    private javax.swing.JComboBox<String> comboArtistas;
    private javax.swing.JComboBox<String> comboTemas;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
