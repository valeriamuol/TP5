
package vistas;

import com.mycompany.ejercicio5.DirectorioTelefonico;
import java.util.TreeSet;


public class frmMenuPrincipal extends javax.swing.JFrame {
    public static DirectorioTelefonico directorio = new DirectorioTelefonico();
    public static TreeSet<String> ciudades = new TreeSet<>();

    public static DirectorioTelefonico getDirectorio() {
        return directorio;
    }
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName());

    
    public frmMenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAgregarCliente = new javax.swing.JMenuItem();
        jmBuscar = new javax.swing.JMenuItem();
        jmBorrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmCiudad = new javax.swing.JMenu();
        jmagregarciudad = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        jMenu1.setText("Clientes");

        jmAgregarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmAgregarCliente.setText("Agregar Cliente");
        jmAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmAgregarCliente);

        jmBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmBuscar.setText("Buscar Cliente");
        jmBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(jmBuscar);

        jmBorrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmBorrar.setText("Borrar Cliente");
        jmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBorrarActionPerformed(evt);
            }
        });
        jMenu1.add(jmBorrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Directorio");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Buscar Cliente por Ciudad");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Buscar Teléfono por Apellido");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jmCiudad.setText("Ciudades");
        jmCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCiudadActionPerformed(evt);
            }
        });

        jmagregarciudad.setText("Agregar Ciudad");
        jmagregarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmagregarciudadActionPerformed(evt);
            }
        });
        jmCiudad.add(jmagregarciudad);

        jMenuBar1.add(jmCiudad);

        jMenu4.setText("Salir");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        frmBuscar bus = new frmBuscar();
        bus.setVisible(true);
        escritorio.add(bus);
        escritorio.moveToFront(bus);
    }//GEN-LAST:event_jmBuscarActionPerformed

    private void jmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBorrarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        frmBorrar b = new frmBorrar ();
        b.setVisible(true);
        escritorio.add(b);
        escritorio.moveToFront(b);
    }//GEN-LAST:event_jmBorrarActionPerformed

    private void jmAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        frmAgregarCliente agcl = new frmAgregarCliente();
        agcl.setVisible(true);
        escritorio.add(agcl);
        escritorio.moveToFront(agcl);
    }//GEN-LAST:event_jmAgregarClienteActionPerformed

    private void jmCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCiudadActionPerformed
        
    }//GEN-LAST:event_jmCiudadActionPerformed

    private void jmagregarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmagregarciudadActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        frmAgregarCiudad agc = new frmAgregarCiudad();
        agc.setVisible(true);
        escritorio.add(agc);
        escritorio.moveToFront(agc);
    }//GEN-LAST:event_jmagregarciudadActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        frmBuscarClienteCiudad bcc = new frmBuscarClienteCiudad();
        bcc.setVisible(true);
        escritorio.add(bcc);
        escritorio.moveToFront(bcc);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        frm_BuscarTelefonoPorApellido bta = new frm_BuscarTelefonoPorApellido();
        bta.setVisible(true);
        escritorio.add(bta);
        escritorio.moveToFront(bta);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jmAgregarCliente;
    private javax.swing.JMenuItem jmBorrar;
    private javax.swing.JMenuItem jmBuscar;
    private javax.swing.JMenu jmCiudad;
    private javax.swing.JMenuItem jmagregarciudad;
    // End of variables declaration//GEN-END:variables

public static void agregarCiudad(String ciudad) {
        ciudades.add(ciudad);
    }
public static TreeSet<String> getCiudades() {
        return ciudades;
    }
}
