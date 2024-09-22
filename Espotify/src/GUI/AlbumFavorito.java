/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

//import Logica.Controlador;
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
public class AlbumFavorito extends javax.swing.JInternalFrame {
    Fabrica fabrica = Fabrica.getInstance();
    IControlador control = fabrica.getIControlador();
    //Controlador control= new Controlador();
    public AlbumFavorito() {
        initComponents();
        setTitle("Album Favorito");
        actualizarComboBoxClientes() ;
        actualizarComboBoxArtistas();
        ComboArtistas.addItemListener(new java.awt.event.ItemListener() {
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        try {
            ComboArtistasItemStateChanged(evt);
        } catch (Exception ex) {
            Logger.getLogger(AlbumFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ComboCorreoCliente = new javax.swing.JComboBox<>();
        ComboArtistas = new javax.swing.JComboBox<>();
        ComboAlbum = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Nombre del cliente");

        jLabel2.setText("Nombre del album");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione artista");

        ComboCorreoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboCorreoCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboCorreoClienteItemStateChanged(evt);
            }
        });
        ComboCorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCorreoClienteActionPerformed(evt);
            }
        });

        ComboArtistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboArtistasActionPerformed(evt);
            }
        });

        ComboAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAlbumActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Album favorito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98)
                                .addComponent(ComboCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void ComboArtistasItemStateChanged(java.awt.event.ItemEvent evt) throws Exception {
    if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        String correoArtista = (String) ComboArtistas.getSelectedItem(); // Obtiene el correo del artista seleccionado
        actualizarComboBoxAlbumes(correoArtista); // Actualiza el comboBox3 con los álbumes
    }
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {                                         
            String nombreCliente = (String) ComboCorreoCliente.getSelectedItem();
            
            String nombreArtista = (String) ComboArtistas.getSelectedItem();
            
            String nombreAlbum = (String) ComboAlbum.getSelectedItem();
            
            String correoCli = control.ConvierteNick_A_Correo(nombreCliente);
            String correoArt = control.ConvierteNick_A_Correo(nombreArtista);
            try {
                control.GuardarAlbumFavorito(correoCli, correoArt, nombreAlbum);
                JOptionPane.showMessageDialog(null, "Album guardado como favorito exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception ex) {
             Logger.getLogger(AlbumFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboCorreoClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboCorreoClienteItemStateChanged

    }//GEN-LAST:event_ComboCorreoClienteItemStateChanged

    private void ComboCorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCorreoClienteActionPerformed

    }//GEN-LAST:event_ComboCorreoClienteActionPerformed

    private void ComboAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAlbumActionPerformed


    private void ComboArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboArtistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboArtistasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
private void actualizarComboBoxClientes() {
    List<String> correosClientes = control.nicksClientes(); // Obtenemos la lista de correos
    
    ComboCorreoCliente.removeAllItems(); // Limpiamos los ítems actuales del comboBox
    
    for (String nickname : correosClientes) {
        try {
            ComboCorreoCliente.addItem(nickname); // Agregamos cada correo al comboBox
        } catch (Exception ex) {
            Logger.getLogger(AlbumFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
private void actualizarComboBoxArtistas() {
    List<String> correosArtistas= control.nicknamesDeTodosLosArtistas(); // Obtenemos la lista de correos
    
    ComboArtistas.removeAllItems(); // Limpiamos los ítems actuales del comboBox
    
    for (String nickname : correosArtistas) {
        try {
            ComboArtistas.addItem(nickname); // Agregamos cada correo al comboBox
        } catch (Exception ex) {
            Logger.getLogger(AlbumFavorito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

private void actualizarComboBoxAlbumes(String nicknameArtista) throws Exception {
    String correoArtista = control.ConvierteNick_A_Correo(nicknameArtista);
    List<String> nombresAlbumes = control.ListaAlbumesParaArtista(correoArtista); // Obtenemos la lista de álbumes
    
    ComboAlbum.removeAllItems(); // Limpiamos los ítems actuales del comboBox
    
    for (String album : nombresAlbumes) {
        ComboAlbum.addItem(album); // Agregamos cada álbum al comboBox
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboAlbum;
    private javax.swing.JComboBox<String> ComboArtistas;
    private javax.swing.JComboBox<String> ComboCorreoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
