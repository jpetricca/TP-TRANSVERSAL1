
package Vistas;

import java.awt.Color;

/**
 *
 * @author Anto
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        itemAlumnos = new javax.swing.JMenuItem();
        menuMateria = new javax.swing.JMenu();
        itemMaterias = new javax.swing.JMenuItem();
        menuInscripcion = new javax.swing.JMenu();
        itemInscripciones = new javax.swing.JMenuItem();
        menuNotas = new javax.swing.JMenu();
        itemNotas = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        menuAlumno.setText("Alumno");

        itemAlumnos.setText("Formulario de Alumno");
        itemAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlumnosActionPerformed(evt);
            }
        });
        menuAlumno.add(itemAlumnos);

        jMenuBar1.add(menuAlumno);

        menuMateria.setText("Materia");

        itemMaterias.setText("Formulario de Materia");
        itemMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMateriasActionPerformed(evt);
            }
        });
        menuMateria.add(itemMaterias);

        jMenuBar1.add(menuMateria);

        menuInscripcion.setText("Inscripcion");

        itemInscripciones.setText("Manejo de Inscripciones");
        itemInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInscripcionesActionPerformed(evt);
            }
        });
        menuInscripcion.add(itemInscripciones);

        jMenuBar1.add(menuInscripcion);

        menuNotas.setText("Carga de notas");

        itemNotas.setText("Manipulacion de notas");
        itemNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNotasActionPerformed(evt);
            }
        });
        menuNotas.add(itemNotas);

        jMenuBar1.add(menuNotas);

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnoView alumno = new FormularioAlumnoView();
        alumno.setVisible(true);
        alumno.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(alumno);
    }//GEN-LAST:event_itemAlumnosActionPerformed

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

    private void itemNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioNotas notas = new FormularioNotas();
        notas.setVisible(true);
        notas.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(notas);
    }//GEN-LAST:event_itemNotasActionPerformed

    private void itemMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria materia = new FormularioMateria();
        materia.setVisible(true);
        materia.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(materia);
    }//GEN-LAST:event_itemMateriasActionPerformed

    private void itemInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInscripcionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion ins = new FormularioInscripcion();
        ins.setVisible(true);
        ins.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.add(ins);
    }//GEN-LAST:event_itemInscripcionesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemAlumnos;
    private javax.swing.JMenuItem itemInscripciones;
    private javax.swing.JMenuItem itemMaterias;
    private javax.swing.JMenuItem itemNotas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuInscripcion;
    private javax.swing.JMenu menuMateria;
    private javax.swing.JMenu menuNotas;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
