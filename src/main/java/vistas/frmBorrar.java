
package vistas;

import com.mycompany.ejercicio5.Contacto;
import com.mycompany.ejercicio5.DirectorioTelefonico;
import java.util.Collection;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class frmBorrar extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultListModel<Long> listaDeDNI = new DefaultListModel<>();

    public frmBorrar() {
        initComponents();
        armarCabecera();
        jListDNI.setModel(listaDeDNI);
        llenarListaDNI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlBorrarCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDNI = new javax.swing.JList<>();

        jButton1.setText("Borrar Cliente/s");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlBorrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlBorrarCliente.setText("Borrar Cliente");

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtClientes);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");

        jListDNI.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListDNIValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListDNI);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlBorrarCliente)
                .addGap(226, 226, 226))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlBorrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jbSalir))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(152, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
     this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jListDNIValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListDNIValueChanged

        Long dni = jListDNI.getSelectedValue();

        if (dni != null) {
            Contacto c = frmMenuPrincipal.getDirectorio().buscarPorDni(dni);

            if (c != null) {
                Long telefono = frmMenuPrincipal.getDirectorio().buscarTelefonoPorDni(dni);
                cargarContactoEnTabla(c, telefono);
            }

        }
    }//GEN-LAST:event_jListDNIValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Long dni = jListDNI.getSelectedValue();

        Long telefono = frmMenuPrincipal.getDirectorio().buscarTelefonoPorDni(dni);

        frmMenuPrincipal.getDirectorio().borrarContacto(telefono);

        llenarListaDNI();

        modelo.setRowCount(0);
            
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<Long> jListDNI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlBorrarCliente;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField jtDni;
    // End of variables declaration//GEN-END:variables

    
    private void armarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Teléfono");
        jtClientes.setModel(modelo);
    }

    private void cargarContactoEnTabla(Contacto c, Long telefono) {
        modelo.setRowCount(0);

        Object[] fila = {
            c.getDni(),
            c.getNombre(),
            c.getApellido(),
            c.getCiudad(),
            c.getDireccion(),
            telefono
        };

        modelo.addRow(fila);
    }

    private void llenarListaDNI() {
        listaDeDNI.clear();

        Collection<Contacto> contactos = frmMenuPrincipal.getDirectorio().agenda.values();

        for (Contacto c : contactos) {
            listaDeDNI.addElement(c.getDni());
        }
    }
}
