/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.gui;

import javax.swing.JOptionPane;
import mypackage.utils.swing.Validator;
import mypackage.connector.Connector;
import mypackage.entities.persistence.Alumno;
import mypackage.entities.persistence.Curso;
import mypackage.repositories.interfaces.I_AlumnoRepository;
import mypackage.repositories.interfaces.I_CursoRepository;
import mypackage.repositories.jdbc.AlumnoRepository;
import mypackage.repositories.jdbc.CursoRepository;
import mypackage.utils.swing.Table;


/**
 *
 * @author andre
 */
public class FormAlumnos extends javax.swing.JInternalFrame {

    private I_CursoRepository cursoRepository = new CursoRepository(Connector.getConnection());
    private I_AlumnoRepository alumnoRepository = new AlumnoRepository(Connector.getConnection());

    public FormAlumnos() {

        super(
                "Formulario de Alumno",
                false,
                true,
                false,
                true
        );
        initComponents();
        

        cargarElementosPrivados();

    }
    

    private void cargarElementosPrivados() {
        //Cargamos jComboBoxCurso
        jComboBoxCurso.removeAllItems();

        //Recorro la lista y cada elemento lo agrego
        cursoRepository.getAll().forEach(jComboBoxCurso::addItem);
        
        //Cargar la tabla de alumnos y el getall nos devuelve un list del tipo alumno
        new Table <Alumno>().cargar(jTableAlumnos,alumnoRepository.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxCurso = new javax.swing.JComboBox<>();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelEdad = new javax.swing.JLabel();
        jLabelCurso = new javax.swing.JLabel();
        jLabelOutput = new javax.swing.JLabel();
        jButtonAgregarCurso = new javax.swing.JButton();
        jTextFieldEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jLabelBusqueda = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();

        jLabelNombre.setText("Nombre:");

        jLabelApellido.setText("Apellido:");

        jLabelEdad.setText("Edad:");

        jLabelCurso.setText("Curso:");

        jLabelOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAgregarCurso.setText("Agregar Curso");
        jButtonAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCursoActionPerformed(evt);
            }
        });

        jTableAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlumnos);

        jLabelBusqueda.setText("Busqueda por Apellido:");

        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });
        jTextFieldBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBusquedaKeyReleased(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabelInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelEdad)
                            .addComponent(jLabelCurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNombre)
                                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBoxCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBusqueda)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar)))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEdad)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCurso)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregarCurso)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBusqueda)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCursoActionPerformed
        if (!validar()) {
            return;
        }
        Alumno alumno=new Alumno(
                jTextFieldNombre.getText(),
                jTextFieldApellido.getText(),
                Integer.parseInt(jTextFieldEdad.getText()),
                jComboBoxCurso.getItemAt(jComboBoxCurso.getSelectedIndex()).getId()
        );
        alumnoRepository.save(alumno);
          //Lo mostramos en el input de la gui
        jLabelOutput.setText("Se dio de alta el alumno con el id:"+alumno.getId());
        
        limpiar();
        
        cargarElementosPrivados();
    }
     private void limpiar(){
        jTextFieldNombre.setText("");
         jTextFieldNombre.requestFocus();
        jTextFieldApellido.setText("");
        jTextFieldEdad.setText("");
        jComboBoxCurso.setSelectedIndex(0);
     }
        

    public boolean validar() {
        if (!new Validator(jTextFieldNombre).length(3, 20)) {
            return false;
        }
        if (!new Validator(jTextFieldApellido).length(3, 20)) {
            return false;
        }
        if(!new Validator(jTextFieldEdad).isInteger(18,110)){
            return false;
        }
        return true;
    }//GEN-LAST:event_jButtonAgregarCursoActionPerformed

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed

    private void jTextFieldBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaKeyReleased
        new Table <Alumno>().cargar(jTableAlumnos,alumnoRepository.getLikeApellido(jTextFieldBusqueda.getText()));
    
    }//GEN-LAST:event_jTextFieldBusquedaKeyReleased

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int row=jTableAlumnos.getSelectedRow();
        if(row == -1){
            return;
        }
        //Se pide la fila con el id que queremos eliminar y con el cero se elimina
        int id=(int)jTableAlumnos.getValueAt(row,0);
        //System.out.println("Id eliminado:"+id);
        if(JOptionPane.showConfirmDialog(this, "Se borrara el curso con el id "+id+"!!")!=0){
            return;
        }
        Alumno objetoAlumno=alumnoRepository.getById(id);
       
        //Borramos de la lista el elemento con el id pasadoe n el buscador
        alumnoRepository.remove(objetoAlumno);
        //Cargamos los elementos nuevamente
          cargarElementosPrivados();
        
                                       
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlumnosMouseClicked
         int row=jTableAlumnos.getSelectedRow();
        if(row == -1){
            return;
        }
        //La columna 4 muestra el idcUrso
         int idCurso=(int)jTableAlumnos.getValueAt(row,4);
         
         jLabelInfo.setText(cursoRepository.getById(idCurso).toString());
        
        
    }//GEN-LAST:event_jTableAlumnosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCurso;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JComboBox<Curso> jComboBoxCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBusqueda;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelOutput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}
