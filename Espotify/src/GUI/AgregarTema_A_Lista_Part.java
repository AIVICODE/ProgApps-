/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Datatypes.DTAlbum;
import Datatypes.DTListaRep;
import Datatypes.DTTema;
import Logica.Fabrica;
import Logica.IControlador;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class AgregarTema_A_Lista_Part extends javax.swing.JInternalFrame {

    Fabrica fabrica = Fabrica.getInstance();
    IControlador control = fabrica.getIControlador();

    public AgregarTema_A_Lista_Part() {
        initComponents();
        actualizarComboBoxClientes();

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
        ComboBoxClientes = new javax.swing.JComboBox<>();
        ComboListas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboOpcion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Fuente_Con_Temas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ComboArtistas = new javax.swing.JComboBox<>();
        ComboTemas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        ComboBoxClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxClientesItemStateChanged(evt);
            }
        });
        ComboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxClientesActionPerformed(evt);
            }
        });

        ComboListas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboListasItemStateChanged(evt);
            }
        });
        ComboListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboListasActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione cliente");

        jLabel2.setText("Seleccione lista");

        ComboOpcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboOpcionItemStateChanged(evt);
            }
        });
        ComboOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboOpcionActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo lista");

        Fuente_Con_Temas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Fuente_Con_TemasItemStateChanged(evt);
            }
        });
        Fuente_Con_Temas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fuente_Con_TemasActionPerformed(evt);
            }
        });

        jLabel4.setText("Fuente");

        ComboArtistas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboArtistasItemStateChanged(evt);
            }
        });
        ComboArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboArtistasActionPerformed(evt);
            }
        });

        ComboTemas.setMaximumSize(new java.awt.Dimension(150, 25));
        ComboTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTemasActionPerformed(evt);
            }
        });

        jLabel5.setText("Tema");

        jButton1.setText("Agregar Tema");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Fuente_Con_Temas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(ComboArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(308, 308, 308))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jButton1)
                .addGap(94, 94, 94)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Fuente_Con_Temas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(68, Short.MAX_VALUE))
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

    private void ComboBoxClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxClientesItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            try {
                List<String> listascli = control.nombreDeListasDeCliente((String) ComboBoxClientes.getSelectedItem());

                ComboListas.removeAllItems();

                for (String noml : listascli) {
                    ComboListas.addItem(noml);
                }
            } catch (Exception ex) {
                Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ComboBoxClientesItemStateChanged

    private void ComboBoxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxClientesActionPerformed

    }//GEN-LAST:event_ComboBoxClientesActionPerformed

    private void ComboOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboOpcionActionPerformed

    private void ComboOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboOpcionItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            try {

                Fuente_Con_Temas.removeAllItems();
                List<String> albumes = control.Lista_Albumes();

                List<String> nombrelistas = control.FindListas();

                List<String> listasdef = control.FindListasDefault();

                if (ComboOpcion.getSelectedItem() == "ALBUM") {
                    for (String album : albumes) {
                        Fuente_Con_Temas.addItem(album);
                    }
                }

                if (ComboOpcion.getSelectedItem() == "LISTAS PARTICULARES") {
                    ComboArtistas.removeAllItems();
                    for (String nombreli : nombrelistas) {
                        Fuente_Con_Temas.addItem(nombreli);
                    }
                }

                if (ComboOpcion.getSelectedItem() == "LISTAS POR DEFECTO") {
                    ComboArtistas.removeAllItems();
                    for (String nombreli : listasdef) {
                        Fuente_Con_Temas.addItem(nombreli);
                    }

                }
            } catch (Exception ex) {
                Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ComboOpcionItemStateChanged

    private void ComboListasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboListasItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            ComboOpcion.removeAllItems();

            ComboOpcion.addItem("ALBUM");
            ComboOpcion.addItem("LISTAS PARTICULARES");
            ComboOpcion.addItem("LISTAS POR DEFECTO");
        }
    }//GEN-LAST:event_ComboListasItemStateChanged

    private void Fuente_Con_TemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fuente_Con_TemasActionPerformed

    }//GEN-LAST:event_Fuente_Con_TemasActionPerformed

    private void ComboArtistasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboArtistasItemStateChanged

    }//GEN-LAST:event_ComboArtistasItemStateChanged

    private void ComboArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboArtistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboArtistasActionPerformed

    private void Fuente_Con_TemasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Fuente_Con_TemasItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            if (ComboOpcion.getSelectedItem() == "ALBUM") {
                try {

                    actualizarComboBoxArtistas();

                    actualizarComboTemasAlbum();
                } catch (Exception ex) {
                    Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ComboOpcion.getSelectedItem() == "LISTAS PARTICULARES") {
                try {
                    actualizarcomboboxclientes_con_lista_part();

                    actualizarComboTemasPart();
                } catch (Exception ex) {
                    Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (ComboOpcion.getSelectedItem() == "LISTAS POR DEFECTO") {
                try {

                    actualizarComboTemasDef();
                } catch (Exception ex) {
                    Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_Fuente_Con_TemasItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ComboOpcion.getSelectedItem() == "ALBUM") {
            try {
                control.AgregarTema_De_Album_A_Lista(
                        (String) ComboBoxClientes.getSelectedItem(),
                        (String) ComboListas.getSelectedItem(),
                        (String) Fuente_Con_Temas.getSelectedItem(),
                        (String) ComboArtistas.getSelectedItem(),
                        (String) ComboTemas.getSelectedItem()
                );
                JOptionPane.showMessageDialog(this, "Tema agregado correctamente desde el álbum.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al agregar el tema desde el álbum: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (ComboOpcion.getSelectedItem() == "LISTAS PARTICULARES") {
            try {
                control.AgregarTema_De_ListaPart_A_Lista(
                        (String) ComboBoxClientes.getSelectedItem(),
                        (String) ComboListas.getSelectedItem(),
                        (String) Fuente_Con_Temas.getSelectedItem(),
                        (String) ComboArtistas.getSelectedItem(),
                        (String) ComboTemas.getSelectedItem()
                );
                JOptionPane.showMessageDialog(this, "Tema agregado correctamente desde lista particular.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al agregar el tema desde lista particular: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (ComboOpcion.getSelectedItem() == "LISTAS POR DEFECTO") {
            try {
                control.AgregarTema_De_ListaDef_A_Lista(
                        (String) ComboBoxClientes.getSelectedItem(),
                        (String) ComboListas.getSelectedItem(),
                        (String) Fuente_Con_Temas.getSelectedItem(),
                        (String) ComboTemas.getSelectedItem()
                );
                JOptionPane.showMessageDialog(this, "Tema agregado correctamente desde lista por defecto.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al agregar el tema desde lista por defecto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTemasActionPerformed

    private void ComboListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboListasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboListasActionPerformed
    private void actualizarComboTemasDef() {
        try {
            ComboTemas.removeAllItems();
            String lista = (String) Fuente_Con_Temas.getSelectedItem();

            List<String> temas = control.ListaTemas_De_Lista_Def(lista);
            for (String tema : temas) {
                ComboTemas.addItem(tema);
            }
        } catch (Exception ex) {
            Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizarComboTemasPart() {
        try {
            ComboTemas.removeAllItems();
            String lista = (String) Fuente_Con_Temas.getSelectedItem();
            String NickCli = (String) ComboArtistas.getSelectedItem();

            List<String> temas = control.ListaTemas_De_Lista(lista, NickCli);
            for (String tema : temas) {
                ComboTemas.addItem(tema);
            }
        } catch (Exception ex) {
            Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void actualizarComboTemasAlbum() {

        try {
            ComboTemas.removeAllItems();
            List<String> temas;
            String album = (String) Fuente_Con_Temas.getSelectedItem();

            String NickArtist = (String) ComboArtistas.getSelectedItem();
            String Artist = control.ConvierteNick_A_Correo(NickArtist);
            temas = control.temasDeAlbumDeArtista(album, Artist);

            for (String tema : temas) {
                ComboTemas.addItem(tema);
            }
        } catch (Exception ex) {
            Logger.getLogger(AgregarTema_A_Lista_Part.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizarcomboboxclientes_con_lista_part() throws Exception {

        List<String> clientes = control.FindListasRep_Duenios((String) Fuente_Con_Temas.getSelectedItem());
        ComboArtistas.removeAllItems(); // Limpiar el comboBox actual

        for (String cliente : clientes) {
            ComboArtistas.addItem(cliente); // Agregar los nombres de artistas
        }
    }

    private void actualizarcomboboxartistas_con_lista_def() throws Exception {

        List<String> artistas = control.FindListasRep_Duenios((String) Fuente_Con_Temas.getSelectedItem());
        ComboArtistas.removeAllItems(); // Limpiar el comboBox actual

        for (String artista : artistas) {
            ComboArtistas.addItem(artista); // Agregar los nombres de artistas
        }
    }

    private List<DTTema> listaTemas = new ArrayList<>();

    private void actualizarComboBoxClientes() {
        List<String> correosClientes = control.nicksClientes(); // Obtenemos la lista de correos

        ComboBoxClientes.removeAllItems(); // Limpiamos los ítems actuales del comboBox

        for (String correo : correosClientes) {
            ComboBoxClientes.addItem(correo); // Agregamos cada correo al comboBox
        }
    }

    private void actualizarComboBoxArtistas() throws Exception {
        String albumSeleccionado = (String) Fuente_Con_Temas.getSelectedItem();
        List<String> nombresArtistas = control.MostrarNombreArtistasbyAlbum(albumSeleccionado); // Obtener nombres de artistas

        ComboArtistas.removeAllItems(); // Limpiar el comboBox actual

        for (String artista : nombresArtistas) {
            ComboArtistas.addItem(artista); // Agregar los nombres de artistas
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboArtistas;
    private javax.swing.JComboBox<String> ComboBoxClientes;
    private javax.swing.JComboBox<String> ComboListas;
    private javax.swing.JComboBox<String> ComboOpcion;
    private javax.swing.JComboBox<String> ComboTemas;
    private javax.swing.JComboBox<String> Fuente_Con_Temas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
