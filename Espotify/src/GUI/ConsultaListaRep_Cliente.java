/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Datatypes.DTListaRep;
import Datatypes.DTTema;
import Logica.Fabrica;
import Logica.IControlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ivan
 */
public class ConsultaListaRep_Cliente extends javax.swing.JInternalFrame {

    
    Fabrica fabrica = Fabrica.getInstance();
    IControlador control = fabrica.getIControlador();
    public ConsultaListaRep_Cliente() {
        initComponents();
        actualizarComboBoxCliente() ;
        configurarEnlace();
        //Escndo enalce hasta que se cargue
        Enlace.setVisible(false);
        
        
            ListasDeRep.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            actualizarTemas();
        }
    });
            
            
            TemasDeLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                actualizarEnlace();
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

        comboCli = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListasDeRep = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TemasDeLista = new javax.swing.JList<>();
        Enlace = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        comboCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCliItemStateChanged(evt);
            }
        });
        comboCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCliActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListasDeRep);

        jScrollPane2.setViewportView(TemasDeLista);

        Enlace.setText("web");

        jLabel1.setText("Seleccione cliente");

        jLabel3.setText("Lista de reproduccion");

        jLabel4.setText("Informacion de los temas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Consulta de lista por Cliente");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Enlace)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(comboCli, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Enlace)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboCliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCliItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            try {
                String nicknameSeleccionado = (String) comboCli.getSelectedItem();
                String correoSeleccionado= control.ConvierteNick_A_Correo(nicknameSeleccionado);
                
                // Invocar la operación para obtener las listas del cliente
                List<DTListaRep> listasCliente = control.obtenerDTListaPorCliente(correoSeleccionado);
                
                // Crear un array con los nombres de las listas
                String[] nombresListas = listasCliente.stream()
                        .map(DTListaRep::getNombreListaRep) // Obtener el nombre de cada lista
                        .toArray(String[]::new);
                
                // Actualizar el JList con los nombres de las listas
                ListasDeRep.setListData(nombresListas);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(ConsultaListaRep_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_comboCliItemStateChanged

    private void comboCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

private void actualizarComboBoxCliente() {
    List<String> correosCli= control.nicksClientes(); // Obtenemos la lista de correos
    
comboCli.removeAllItems(); // Limpiamos los ítems actuales del comboBox
    
    for (String correo : correosCli) {
       comboCli.addItem(correo); // Agregamos cada correo al comboBox
    }
}


  private void actualizarTemas() {
        try {
            String nombreListaSeleccionada = ListasDeRep.getSelectedValue();
            String nicknameSeleccionado = (String) comboCli.getSelectedItem();
            
            String correoSeleccionado= control.ConvierteNick_A_Correo(nicknameSeleccionado);
            
            
            if (nombreListaSeleccionada != null && correoSeleccionado != null) {
                try {
                    DTListaRep dtListaRep = control.obtenerDatosDeLista_Por_Cliente(correoSeleccionado, nombreListaSeleccionada);
                    
                    if (dtListaRep != null) {
                        List<String> datosTemas = new ArrayList<>();
                        for (DTTema tema : dtListaRep.getTemas()) {
                            datosTemas.add(String.format("%s - %d:%d", tema.getNombre(), tema.getMinutos(), tema.getSegundos()));
                        }
                        TemasDeLista.setListData(datosTemas.toArray(new String[0]));
                        
                        // Actualizar el enlace del primer tema al inicio
                        String enlace = dtListaRep.getTemas().get(0).getDirectorio();
                        if (!enlace.startsWith("http://") && !enlace.startsWith("https://")) {
                            enlace = "http://" + enlace;
                        }
                        Enlace.putClientProperty("directorio", enlace);
                        Enlace.setText(enlace);
                        Enlace.setVisible(true);
                    } else {
                        System.out.println("No se encontraron datos para la lista seleccionada.");
                        TemasDeLista.setListData(new String[0]); // Limpiar la lista de temas
                        Enlace.setVisible(false);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("No se ha seleccionado ninguna lista o cliente.");
                TemasDeLista.setListData(new String[0]); // Limpiar la lista de temas
                Enlace.setVisible(false);
            }   } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ConsultaListaRep_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
}


    private void configurarEnlace() {
        Enlace.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String enlace = (String) Enlace.getClientProperty("directorio");
                if (enlace != null) {
                    try {
                        URI uri = new URI(enlace);
                        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                        if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                            desktop.browse(uri);
                        }
                    } catch (IOException | URISyntaxException ex) {
                        //Logger.getLogger(ConsultaListaRep_Cliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    
private void actualizarEnlace() {
        try {
            String nombreTemaSeleccionado = TemasDeLista.getSelectedValue();
            
            String correoSeleccionado= control.ConvierteNick_A_Correo((String) comboCli.getSelectedItem());
            
            
            if (nombreTemaSeleccionado != null && correoSeleccionado != null) {
                try {
                    DTListaRep dtListaRep = control.obtenerDatosDeLista_Por_Cliente(correoSeleccionado, ListasDeRep.getSelectedValue());
                    
                    if (dtListaRep != null) {
                        for (DTTema tema : dtListaRep.getTemas()) {
                            if (tema.getNombre().equals(nombreTemaSeleccionado.split(" - ")[0])) {
                                String enlace = tema.getDirectorio();
                                if (!enlace.startsWith("http://") && !enlace.startsWith("https://")) {
                                    enlace = "http://" + enlace;
                                }
                                Enlace.putClientProperty("directorio", enlace);
                                Enlace.setText(enlace);
                                break;
                            }
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("No se ha seleccionado ningún tema o cliente.");
                Enlace.setVisible(false);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ConsultaListaRep_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enlace;
    private javax.swing.JList<String> ListasDeRep;
    private javax.swing.JList<String> TemasDeLista;
    private javax.swing.JComboBox<String> comboCli;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
