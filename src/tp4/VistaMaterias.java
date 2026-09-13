package tp4;

import java.util.HashSet;

public class VistaMaterias extends javax.swing.JInternalFrame {
    
    public VistaMaterias(HashSet<Materia> materias) {
        super("Registro de alumnos", false, true, false, false);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        separatorTitulo = new javax.swing.JSeparator();
        lblCodigo = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(500, 430));
        setPreferredSize(new java.awt.Dimension(500, 430));

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Limpia los campos ingresados pero aún no guardados.");
        btnNuevo.setMaximumSize(new java.awt.Dimension(80, 30));
        btnNuevo.setMinimumSize(new java.awt.Dimension(80, 30));
        btnNuevo.setPreferredSize(new java.awt.Dimension(80, 30));
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCerrar.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCerrar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Alta de Materias");

        txtAnio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setText("Código de materia:");

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellido.setText("Nombre de la materia:");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Año al que pertenece:");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(80, 30));
        btnGuardar.setMinimumSize(new java.awt.Dimension(80, 30));
        btnGuardar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separatorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCodigo.setText("");
        txtNombre.setText("");
        txtAnio.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int id;
        int anio;
        
        try {
            
            id = Integer.parseInt(txtCodigo.getText().trim());
            anio = Integer.parseInt(txtAnio.getText().trim());
            
        } catch (NumberFormatException number) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error. Legajo y año solo aceptan números enteros.");
            return;
        }
        
        String nombre = txtNombre.getText().trim();
        
        
        if (id <= 0 || anio <= 0 || nombre.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error. Rellena los campos con datos válidos.");
            return;
        }
        
        Materia agregarMateria =  new Materia(id, nombre, anio);
                
        if (VistaPrincipal.listadoMaterias.add(agregarMateria)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardó la materia correctamente.");
        
            txtCodigo.setText("");
            txtNombre.setText("");
            txtAnio.setText("");
            
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error. Esa materia ya existe en el sistema.");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSeparator separatorTitulo;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
