
package Vistas;

import Controlador.AlumnoData;
import Controlador.Conexion;
import Controlador.InscripcionData;
import Controlador.MateriaData;
import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class FormularioInscripcion extends javax.swing.JInternalFrame {
    
    private ArrayList<Inscripcion> listaI;
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private Conexion conexion;
    private DefaultTableModel modelo;
    
    
    public FormularioInscripcion() {
        initComponents();
        conexion = new Conexion();
        aData = new AlumnoData(conexion);
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData(conexion);
        mData = new MateriaData(conexion);
        
        cargaAlumnos();
        armarCabeceraTabla();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        buttonSalir = new javax.swing.JButton();
        jBAInscribir = new javax.swing.JButton();
        jBInscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Formulario de Inscripcion");
        setPreferredSize(new java.awt.Dimension(460, 460));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setText("Materias no inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        jBAInscribir.setText("Anular Inscripcion");
        jBAInscribir.setEnabled(false);
        jBAInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAInscribirActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioInscriptas)
                                .addGap(46, 46, 46)
                                .addComponent(radioNoInscriptas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBInscribir)
                        .addGap(57, 57, 57)
                        .addComponent(jBAInscribir)
                        .addGap(65, 65, 65)
                        .addComponent(buttonSalir)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalir)
                    .addComponent(jBAInscribir)
                    .addComponent(jBInscribir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
        borrarFilaTabla();
        radioInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        jBAInscribir.setEnabled(false);
        jBInscribir.setEnabled(true);
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
        borrarFilaTabla();
        radioNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        jBAInscribir.setEnabled(true);
        jBInscribir.setEnabled(false);
    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        
        int filaSeleccionada = jTable1.getSelectedRow();
        if(filaSeleccionada!= -1){
            Alumno a = (Alumno)cboxAlumno.getSelectedItem();
            
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String)modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer)modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio,true);
            
            Inscripcion I = new Inscripcion(a,m,0);
            
            inscData.inscribir(I);
            
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAInscribirActionPerformed
        InscripcionData id = new InscripcionData(conexion);
        int idAlumno = ((Alumno) cboxAlumno.getSelectedItem()).getIdAlumno();
        int idMateria = (int) jTable1.getValueAt((int) jTable1.getSelectedRow(), 0);
        id.borrarInscripcionMateriaAlumno(idAlumno, idMateria);
        borrarFilaTabla();
        cargaDatosInscriptas();
    }//GEN-LAST:event_jBAInscribirActionPerformed

    private void cargaAlumnos(){ // Carga al combo box
        for(Alumno item: listaA){
            cboxAlumno.addItem(item);
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for(Object it: filaCabecera){
            modelo.addColumn(it);     
        }
        jTable1.setModel(modelo);
    }

    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for (int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargaDatosNoInscriptas(){
        //borrarFilasTabla();
        Alumno selec = (Alumno)cboxAlumno.getSelectedItem();
        listaM = (ArrayList) inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for(Materia m: listaM){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
    
    private void cargaDatosInscriptas(){
        //borrarFilasTabla();
        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        List <Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for(Materia m : lista){
            modelo.addRow(new Object[] { m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JButton jBAInscribir;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
