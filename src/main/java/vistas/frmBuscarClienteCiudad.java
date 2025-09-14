
package vistas;

import com.mycompany.ejercicio5.Contacto;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.table.DefaultTableModel;


public class frmBuscarClienteCiudad extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public frmBuscarClienteCiudad() {
        initComponents();
        armarCabecera();
        jTClientes.setModel(modelo);
        llenarComboCiudades();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jLCiudades = new javax.swing.JLabel();
        jLClientesPorCiudad = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jComboCiudades = new javax.swing.JComboBox<>();

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTClientes);

        jLCiudades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLCiudades.setText("Ciudades:");

        jLClientesPorCiudad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLClientesPorCiudad.setText("Buscar Clientes de Directorio por Ciudad ");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jComboCiudades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboCiudadesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCiudades)
                            .addComponent(jComboCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLClientesPorCiudad)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLClientesPorCiudad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCiudades)
                        .addGap(18, 18, 18)
                        .addComponent(jComboCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addComponent(jButtonSalir)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboCiudadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboCiudadesItemStateChanged

        String ciudad = (String) jComboCiudades.getSelectedItem();
        cargarContactosPorCiudad(ciudad);


    }//GEN-LAST:event_jComboCiudadesItemStateChanged

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboCiudades;
    private javax.swing.JLabel jLCiudades;
    private javax.swing.JLabel jLClientesPorCiudad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Teléfono");
        jTClientes.setModel(modelo);
    }

    private void llenarComboCiudades() {
        jComboCiudades.removeAllItems();
        for (String ciudad : frmMenuPrincipal.getCiudades()) {
            jComboCiudades.addItem(ciudad);
        }
    }

    private void cargarContactosPorCiudad(String ciudad) {
        ArrayList<Contacto> lista = frmMenuPrincipal.getDirectorio().buscarContactos(ciudad);
        modelo.setRowCount(0);

        for (Contacto c : lista) {
            Long telefono = frmMenuPrincipal.getDirectorio().buscarTelefonoPorDni(c.getDni());
            Object[] fila = {
                c.getDni(),
                c.getApellido(),
                c.getNombre(),
                c.getDireccion(),
                c.getCiudad(),
                telefono
            };
            modelo.addRow(fila);
        }
    }
}
