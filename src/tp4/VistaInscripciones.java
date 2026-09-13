package tp4;

import java.util.HashSet;

public class VistaInscripciones extends javax.swing.JInternalFrame {
    
    public VistaInscripciones(HashSet<Alumno> alumnos, HashSet<Materia> materias) {
        super("Registro de inscripción", false, true, false, false);
        initComponents();
        
        cmbMaterias.removeAllItems();
        for (Materia auxMaterias : materias) {
            cmbMaterias.addItem(auxMaterias);
        }
        
        cmbAlumnos.removeAllItems();
        for (Alumno auxAlumnos : alumnos) {
            cmbAlumnos.addItem(auxAlumnos);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInscribir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        separatorTitulo = new javax.swing.JSeparator();
        lblMateria = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        cmbMaterias = new javax.swing.JComboBox<>();
        cmbAlumnos = new javax.swing.JComboBox<>();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(500, 430));
        setPreferredSize(new java.awt.Dimension(500, 430));

        btnInscribir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.setToolTipText("Limpia los campos ingresados pero aún no guardados.");
        btnInscribir.setMaximumSize(new java.awt.Dimension(80, 30));
        btnInscribir.setMinimumSize(new java.awt.Dimension(80, 30));
        btnInscribir.setPreferredSize(new java.awt.Dimension(80, 30));
        btnInscribir.addActionListener(this::btnInscribirActionPerformed);

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCerrar.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCerrar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Formulario de inscripción");

        lblMateria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMateria.setText("Elija una materia:");

        lblAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAlumno.setText("Elija un alumno;");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlumno)
                    .addComponent(lblMateria))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separatorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria)
                    .addComponent(cmbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumno)
                    .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        Alumno seleccionAlumno = (Alumno) cmbAlumnos.getSelectedItem();
        Materia seleccionMateria = (Materia) cmbMaterias.getSelectedItem();
        
        if (seleccionAlumno != null && seleccionMateria != null) {
            seleccionAlumno.agregarMateria(seleccionMateria);
        }
        
    }//GEN-LAST:event_btnInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JComboBox<Alumno> cmbAlumnos;
    private javax.swing.JComboBox<Materia> cmbMaterias;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separatorTitulo;
    // End of variables declaration//GEN-END:variables
}
