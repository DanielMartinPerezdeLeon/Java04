package Vista;

import Controlador.Lista;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cuenta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author damar
 */
public class Vista1 extends javax.swing.JFrame {

    Lista lista = new <Cuenta> Lista(1000);

    public Vista1() {
        super("BANCO");

        initComponents();
        añadirEjemplos(lista);
        lista.decirDatos();
    }

    public void inicializarVista() {
        botonAnterior.setVisible(false);
        botonSiguiente.setVisible(false);
    }

    public static void añadirEjemplos(Lista<Cuenta> lista) {    //Añade unas cuentas a la lista
        lista.insertar(new Cuenta(1200, 1, "Antonio"), 1);
        lista.insertar(new Cuenta(150, 1, "Dani"), 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Guardar = new javax.swing.JMenu();
        Cargar = new javax.swing.JMenu();
        Insertar = new javax.swing.JMenu();
        Visualizar = new javax.swing.JMenu();
        Ordenar = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenuItem7.setText("jMenuItem7");

        jMenu8.setText("File");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar4.add(jMenu9);

        jLabel2.setText("jLabel1");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAnterior.setText("ANTERIOR");

        botonSiguiente.setText("SIGUIENTE");

        Guardar.setText("Guardar");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jMenuBar1.add(Guardar);

        Cargar.setText("Cargar");
        Cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Cargar);

        Insertar.setText("Insertar");
        jMenuBar1.add(Insertar);

        Visualizar.setText("Visualizar");
        jMenuBar1.add(Visualizar);

        Ordenar.setText("Ordenar");
        jMenuBar1.add(Ordenar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(botonAnterior)
                .addGap(159, 159, 159)
                .addComponent(botonSiguiente)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAnterior)
                    .addComponent(botonSiguiente))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

    }//GEN-LAST:event_GuardarActionPerformed

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        try {
            ObjectOutputStream guardalista = new ObjectOutputStream(new FileOutputStream(new File("cuentas.dat")));

            guardalista.writeObject(lista);

            guardalista.close();
            System.out.println("Guardado correctamente");
        } catch (IOException ex) {
            System.err.println("Error grave");
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseClicked
        try {
            ObjectInputStream cargalista = new ObjectInputStream(new FileInputStream(new File("cuentas.dat")));
            Random aleatorio = new Random();

            Lista listaAux = (Lista) cargalista.readObject();
            cargalista.close();

            for (int i = 0; listaAux.getVector()[i] != null && i < listaAux.getVector().length; i++) {
                lista.insertar(listaAux.getVector()[i].getDatos(), aleatorio.nextInt(99) + 1);
            }

            System.out.println("Cargado correctamente");
        } catch (IOException ex) {
            System.err.println("Error grave");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se ha encontrado la clase");
        }

        lista.decirDatos();
    }//GEN-LAST:event_CargarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cargar;
    private javax.swing.JMenu Guardar;
    private javax.swing.JMenu Insertar;
    private javax.swing.JMenu Ordenar;
    private javax.swing.JMenu Visualizar;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
