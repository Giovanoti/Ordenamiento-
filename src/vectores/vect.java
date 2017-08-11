package vectores;

import javax.swing.JOptionPane;

public class vect extends javax.swing.JFrame {

    String vectn[] = new String[100];
    float vectn1[] = new float[100];
    float vectn2[] = new float[100];
    float vectn3[] = new float[100];
    float vectp[] = new float[100];
    int i, n;
    float tmp, tmp2, tmp3, tmp4;
    String tmp1;

    public vect() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metodos = new javax.swing.ButtonGroup();
        cant = new javax.swing.JLabel();
        cant_n = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();
        ordenamientos = new javax.swing.JLabel();
        burbuja = new javax.swing.JRadioButton();
        insercion = new javax.swing.JRadioButton();
        seleccion = new javax.swing.JRadioButton();
        ordenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Promedio Estudiantes");

        cant.setText("Cantidad de datos a ingresar");

        cant_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_nActionPerformed(evt);
            }
        });

        aceptar.setText("Ingresar datos");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Datos Ingresados");

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        ordenamientos.setText("Metodos de Ordenamiento:");

        metodos.add(burbuja);
        burbuja.setText("Burbuja");

        metodos.add(insercion);
        insercion.setText("Inserción");

        metodos.add(seleccion);
        seleccion.setText("Selección");

        ordenar.setText("Ordenar");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir))
                    .addComponent(jLabel1)
                    .addComponent(ordenamientos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(burbuja)
                                    .addComponent(seleccion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(insercion)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(26, 26, 26)
                                .addComponent(ordenar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cant_n, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aceptar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cant)
                    .addComponent(cant_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordenamientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(burbuja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insercion)
                    .addComponent(ordenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

        n = Integer.parseInt(cant_n.getText());
        for (int i = 0; i < n; i++) {
            vectn[i] = JOptionPane.showInputDialog("Ingrese nombre del estudiante " + (i + 1));
            vectn1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 1"));
            vectn2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 2"));
            vectn3[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 3"));
            vectp[i] = (vectn1[i] + vectn2[i] + vectn3[i]) / 3;
        }
        mostrar.append("Nombre\tNota1\tNota2\tNota3\tPromedio\n");
        for (int i = 0; i < n; i++) {
            mostrar.append("\n" + vectn[i] + "\t" + vectn1[i] + "\t" + vectn2[i] + "\t" + vectn3[i] + "\t" + vectp[i]);
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void cant_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_nActionPerformed
        cant_n.transferFocus();
    }//GEN-LAST:event_cant_nActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        if (burbuja.isSelected()) {
            for (i = 0; i < vectp.length - 1; i++) {
                for (int j = 0; j < vectp.length - 1; j++) {
                    if (vectp[j] < vectp[j + 1]) {
                        tmp = vectp[j + 1];
                        tmp1 = vectn[j + 1];
                        tmp2 = vectn1[j + 1];
                        tmp3 = vectn2[j + 1];
                        tmp4 = vectn3[j + 1];
                        vectp[j + 1] = vectp[j];
                        vectn[j + 1] = vectn[j];
                        vectn1[j + 1] = vectn1[j];
                        vectn2[j + 1] = vectn2[j];
                        vectn3[j + 1] = vectn3[j];
                        vectp[j] = tmp;
                        vectn[j] = tmp1;
                        vectn1[j] = tmp2;
                        vectn2[j] = tmp3;
                        vectn3[j] = tmp4;
                    }
                }
            }
        } else {
            if (insercion.isSelected()) {
                for (i = 1; i < vectp.length; i++) {
                    for (int j = i; j < vectp.length; j++) {
                        if (vectp[j + 1] > vectp[j]) {

                        } else {
                            int k = j;
                            while (vectp[j + 1] < vectp[k]) {
                                k = k - 1;
                            }
                            tmp = vectp[j + 1];
                            for (int l = j ; l==k; l=l-1) {
                                 vectp[l+1]=vectp[l];
                            }
                        }
                    }

                }
            }

        }
        mostrar.append("\n\nDATOS ORDENADOS POR PROMEDIO\n");
        mostrar.append("\nNombre\tNota1\tNota2\tNota3\tPromedio\n");
        for (i = 0; i < n; i++) {
            mostrar.append("\n" + vectn[i] + "\t" + vectn1[i] + "\t" + vectn2[i] + "\t" + vectn3[i] + "\t" + vectp[i]);
        }
    }//GEN-LAST:event_ordenarActionPerformed

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
            java.util.logging.Logger.getLogger(vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JRadioButton burbuja;
    private javax.swing.JLabel cant;
    private javax.swing.JTextField cant_n;
    private javax.swing.JRadioButton insercion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup metodos;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JLabel ordenamientos;
    private javax.swing.JButton ordenar;
    private javax.swing.JButton salir;
    private javax.swing.JRadioButton seleccion;
    // End of variables declaration//GEN-END:variables
}
