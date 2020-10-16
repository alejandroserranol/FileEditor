/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Frame;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author aleja
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public static File fichero = null;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        txtHojaEscritura = new java.awt.TextArea();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarComo = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarComo.setText("Guardar como");
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHojaEscritura, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAbrir)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarComo)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnGuardarComo)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHojaEscritura, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        leerBufferReader(dialogoSeleccionarFichero());

    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (fichero != null) {
            guardarNuevoFichero(fichero.getAbsolutePath());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
        dialogoGuardarFichero();
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        Frame frame = new Frame();

        String mensaje = "¿Desea descartar los cambios?";

        Object[] opcionesGuardado = {mensaje};
        int save = JOptionPane.showConfirmDialog(frame, opcionesGuardado, "Abrir", JOptionPane.YES_NO_OPTION);

        if (save == 0) {
            fichero = null;
            txtHojaEscritura.setText(" ");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnNuevo;
    private java.awt.TextArea txtHojaEscritura;
    // End of variables declaration//GEN-END:variables

    //Métodos de lectura
    private String dialogoSeleccionarFichero() {

        String rutaAbsoluta = "";
        
        try {
            JFileChooser fco = new JFileChooser();

            //Busca evitar abrir ficheros binarios
            fco.setFileFilter(new FileNameExtensionFilter("Archivos de texto txt", "txt"));
            fco.setFileFilter(new FileNameExtensionFilter("Archivos xml", "xml"));

            fco.setMultiSelectionEnabled(false);
            fco.setDialogType(JFileChooser.OPEN_DIALOG);

            //Si no se produce ningún error seleccion será 0
            int seleccion = fco.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = fco.getSelectedFile();
                String nombre = fichero.getName();
                String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());
                
                
                if (!(extension.equalsIgnoreCase("txt") || extension.equalsIgnoreCase("xml"))) {
                    Frame frame = new Frame();
                    String mensaje = "";
                    
                    Object[] textoAlerta = {mensaje};
                    
                    JOptionPane.showConfirmDialog(null, "Estensión seleccionada no válida.", "", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                } else {
                    rutaAbsoluta = fichero.getAbsolutePath();
                    leerBufferReader(rutaAbsoluta);
                }
            }
        } catch (Exception ex) {
            System.out.println("Fichero no seleccionado.");
        }

        return rutaAbsoluta;
    }

    private void leerBufferReader(String nombre) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombre));

            String valor = br.readLine();
            while (valor != null) {
                //append no incluye los saltos de línea
                txtHojaEscritura.append(valor + "\r\n");
                valor = br.readLine();
            }

            br.close();

        } catch (Exception ex) {
            System.out.println("Error al mostrar el fichero.");
        }
    }

    //Métodos de escritura
    private void dialogoGuardarFichero() {
        String rutaAbsoluta = "";
        JFileChooser fcs = new JFileChooser();

        int seleccion = fcs.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //si entra aquí es porque el usuario ha pulsado en "guardar"
            fichero = fcs.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1, nombre.length());

            if (extension.equalsIgnoreCase("txt") || extension.equalsIgnoreCase("xml")) {
                rutaAbsoluta = fichero.getAbsolutePath();
                if (fichero.exists()) {
                    guardarFicheroExistente(nombre, rutaAbsoluta);
                } else {
                    guardarNuevoFichero(rutaAbsoluta);
                }
            }
        }
    }

    private void guardarNuevoFichero(String rutaAbsoluta) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaAbsoluta));

            for (String linea : txtHojaEscritura.getText().split("\\n")) {
                bw.write(linea);
            }

            bw.close();

        } catch (IOException ex) {
            System.out.println("Error en la escritura del fichero.");
        }
    }

    private void guardarFicheroExistente(String nombre, String rutaAbsoluta) {
        Frame frame = new Frame();

        JCheckBox checkbox = new JCheckBox("Añadir al final del fichero.");
        String mensaje = nombre + " ya existe. \n ¿desea reemplazarlo?";

        Object[] opcionesGuardado = {mensaje, checkbox};
        int save = JOptionPane.showConfirmDialog(frame, opcionesGuardado, "Guardar como", JOptionPane.YES_NO_OPTION);
        boolean addChoice = checkbox.isSelected();

        if (save == 0) {
            if (addChoice == false) {

                guardarNuevoFichero(rutaAbsoluta);


            } else {
                try {

                    BufferedWriter bw = new BufferedWriter(new FileWriter(rutaAbsoluta, true));

                    for (String linea : txtHojaEscritura.getText().split("\\n")) {
                        bw.write(linea);
                    }

                    bw.close();

                } catch (IOException ex) {
                    System.out.println("Error en la escritura del fichero.");
                }
            }
        }
    }

}
