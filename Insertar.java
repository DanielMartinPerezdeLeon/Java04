/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.Lista;
import java.util.GregorianCalendar;
import java.util.Random;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;
import modelo.CuentaInversion;

/**
 *
 * @author damar
 */
public class Insertar extends javax.swing.JPanel {

    /**
     * Creates new form Insertar
     */
    int tipo;
    Lista lista;

    public Insertar(Lista lis, int t) {
        initComponents();

        lista = lis;
        tipo = t;
        botonestudiante.setVisible(false);
        botonanual.setVisible(false);
        botonsemestral.setVisible(false);

        switch (t) {
            case 1: { //Ahorro
                botonestudiante.setVisible(true);
                textvar1.setText("Interes anual (%):");
                areavar1.setText("");
                System.out.println(textvar1.getAlignmentY());
                break;
            }
            case 2: {   //Corriente
                botonanual.setVisible(true);
                botonsemestral.setVisible(true);
                botonanual.setSelected(true);
                textvar1.setVisible(true);
                areavar1.setVisible(true);
                textvar1.setText("Comision:");
                areavar1.setText("");
                break;
            }
            case 3: {   //Inversion
                botonestudiante.setVisible(true);
                textvar1.setVisible(false);
                areavar1.setVisible(false);
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        areapropietario = new javax.swing.JTextField();
        areafecha = new javax.swing.JTextField();
        areasaldo = new javax.swing.JTextField();
        areasaldominimo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botonestudiante = new javax.swing.JCheckBox();
        textvar1 = new javax.swing.JLabel();
        areavar1 = new javax.swing.JTextField();
        botonanual = new javax.swing.JRadioButton();
        botonsemestral = new javax.swing.JRadioButton();

        jLabel2.setText("Propietario:");

        jLabel3.setText("Saldo:");

        jLabel4.setText("Saldo Mínimo:");

        jLabel5.setText("Fecha:");

        areapropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areapropietarioActionPerformed(evt);
            }
        });

        areafecha.setText("dd/mm/aaaa");
        areafecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areafechaActionPerformed(evt);
            }
        });

        jButton1.setText("INSERTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonestudiante.setText("Estudiante");

        textvar1.setText("Interes anual:");

        areavar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areavar1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonanual);
        botonanual.setText("Anual");
        botonanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonanualActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonsemestral);
        botonsemestral.setText("Semestral");
        botonsemestral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsemestralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(botonestudiante)
                            .addComponent(textvar1))
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(areavar1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(botonsemestral)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(areasaldominimo)
                                .addComponent(areasaldo)
                                .addComponent(areapropietario)
                                .addComponent(areafecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(botonanual))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areapropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areasaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(areasaldominimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(areafecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(areavar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textvar1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonanual)
                    .addComponent(botonestudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonsemestral)
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void areapropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areapropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areapropietarioActionPerformed

    private void areafechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areafechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areafechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (tipo) {
            case 1: {
                CuentaAhorro aux;
                Random aleatorio = new Random();

                String propie = areapropietario.getText();
                int sald = Integer.parseInt(areasaldo.getText());
                int minsald = Integer.parseInt(areasaldominimo.getText());
                boolean estud = botonestudiante.isSelected();
                int inter = Integer.parseInt(areavar1.getText());

                if (areafecha.getText().equalsIgnoreCase("")) { //Si el usuario ha dejado la fecha vacia
                    aux = new CuentaAhorro(sald, minsald, propie, inter, estud);   //se crea con la fecha del sistema
                } else {  //si no
                    int[] fecha = new int[3];
                    String[] fechatexto = areafecha.getText().split("/", 3);  //divide cada dato de la fecha escrita en un array

                    for (int i = 0; i < 3; i++) {
                        fecha[i] = Integer.parseInt(fechatexto[i]);   //Pasamos la array a una de ints
                    }

                    GregorianCalendar fechafinal = new GregorianCalendar(fecha[0], fecha[1], fecha[2]); //le decimos la fecha con los datros

                    aux = new CuentaAhorro(sald, minsald, propie, inter, estud, fechafinal);

                }

                lista.insertar(aux, aleatorio.nextInt(999) + 1);
                System.out.println("Cuenta introducida correctamente");
            }

            case 2: {
                CuentaCorriente aux;
                Random aleatorio = new Random();

                String propie = areapropietario.getText();
                int sald = Integer.parseInt(areasaldo.getText());
                int minsald = Integer.parseInt(areasaldominimo.getText());
                int comi = Integer.parseInt(areavar1.getText());
                boolean tipo = botonsemestral.isSelected();

                if (areafecha.getText().equalsIgnoreCase("")) { //Si el usuario ha dejado la fecha vacia
                    aux = new CuentaCorriente(comi, tipo, sald, minsald, propie);   //se crea con la fecha del sistema
                } else {  //si no
                    int[] fecha = new int[3];
                    String[] fechatexto = areafecha.getText().split("/", 3);  //divide cada dato de la fecha escrita en un array

                    for (int i = 0; i < 3; i++) {
                        fecha[i] = Integer.parseInt(fechatexto[i]);   //Pasamos la array a una de ints
                    }

                    GregorianCalendar fechafinal = new GregorianCalendar(fecha[0], fecha[1], fecha[2]); //le decimos la fecha con los datros

                    aux = new CuentaCorriente(comi, tipo, sald, minsald, propie, fechafinal);

                }

                lista.insertar(aux, aleatorio.nextInt(999) + 1);
                System.out.println("Cuenta introducida correctamente");

            }
            case 3: {
                CuentaInversion aux;
                Random aleatorio = new Random();

                String propie = areapropietario.getText();
                int sald = Integer.parseInt(areasaldo.getText());
                int minsald = Integer.parseInt(areasaldominimo.getText());
                boolean estud = botonestudiante.isSelected();

                if (areafecha.getText().equalsIgnoreCase("")) { //Si el usuario ha dejado la fecha vacia
                    aux = new CuentaInversion(estud, sald, minsald, propie);   //se crea con la fecha del sistema
                } else {  //si no
                    int[] fecha = new int[3];
                    String[] fechatexto = areafecha.getText().split("/", 3);  //divide cada dato de la fecha escrita en un array

                    for (int i = 0; i < 3; i++) {
                        fecha[i] = Integer.parseInt(fechatexto[i]);   //Pasamos la array a una de ints
                    }

                    GregorianCalendar fechafinal = new GregorianCalendar(fecha[0], fecha[1], fecha[2]); //le decimos la fecha con los datros

                    aux = new CuentaInversion(estud, sald, minsald, propie, fechafinal);

                }

                lista.insertar(aux, aleatorio.nextInt(999) + 1);
                System.out.println("Cuenta introducida correctamente");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void areavar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areavar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areavar1ActionPerformed

    private void botonanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonanualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonanualActionPerformed

    private void botonsemestralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsemestralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonsemestralActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areafecha;
    private javax.swing.JTextField areapropietario;
    private javax.swing.JTextField areasaldo;
    private javax.swing.JTextField areasaldominimo;
    private javax.swing.JTextField areavar1;
    private javax.swing.JRadioButton botonanual;
    private javax.swing.JCheckBox botonestudiante;
    private javax.swing.JRadioButton botonsemestral;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel textvar1;
    // End of variables declaration//GEN-END:variables
}
