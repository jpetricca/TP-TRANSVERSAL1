
package Vistas;

import Controlador.AlumnoData;
import Controlador.Conexion;
import Controlador.InscripcionData;
import Modelo.Alumno;
import Modelo.Inscripcion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormularioNotas extends javax.swing.JInternalFrame {

   private DefaultTableModel modelo;
   private ArrayList<Alumno> listaA;
   private ArrayList<Inscripcion> listaI;
   private AlumnoData aData;
   private Conexion conexion;
   private InscripcionData inscData;
    
    public FormularioNotas() {
        initComponents();
        conexion = new Conexion();
        inscData = new InscripcionData(conexion);
        modelo = new DefaultTableModel();
        aData = new AlumnoData(conexion);
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        
        cargaAlumnosCBox();
        armarCabeceraTabla();
        llenarTabla();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cboxAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        buttonGuardar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Carga de notas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Carga de notas");

        jLabel2.setText("Seleccione un alumno:");

        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(buttonCancelar)
                .addGap(45, 45, 45)
                .addComponent(buttonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSalir)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGuardar)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonSalir))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        borrarFilaTabla();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
            for (int i = 0; i < jTabla.getRowCount(); i++) {
            inscData.actualizarNota(((Alumno) cboxAlumno.getSelectedItem()).getIdAlumno(), Integer.parseInt(jTabla.getValueAt(i, 0).toString()), Integer.parseInt(jTabla.getValueAt(i, 2).toString()));
            
        }
        JOptionPane.showMessageDialog(null, "Notas actualizadas");
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxAlumnoActionPerformed
    private void armarCabeceraTabla(){
        ArrayList<Object>filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for(Object it: filaCabecera){
            modelo.addColumn(it);     
        }
        jTabla.setModel(modelo);
    }
    
    private void cargaAlumnosCBox(){
        for(Alumno item: listaA){
            cboxAlumno.addItem(item);
        }
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for (int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    private void llenarTabla(){
        //borrarFilasTabla();
        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        listaI = (ArrayList<Inscripcion>) inscData.obtenerMCursadasPorAlumno(selec.getIdAlumno());
        
           for(Inscripcion i: listaI){
            modelo.addRow(new Object[] { i.getIdMateria(), i.getMateria().getNombre(), i.getNota()});
           }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
