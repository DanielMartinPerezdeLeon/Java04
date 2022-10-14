package Vista;

import Controlador.Lista;
import Controlador.Nodo;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;
import modelo.CuentaInversion;

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


    public static void añadirEjemplos(Lista<Cuenta> lista) {    //Añade unas cuentas a la lista
        lista.insertar(new Cuenta(1200, 1, "Antonio"), 1);
        lista.insertar(new Cuenta(150, 1, "Dani"), 2);
        lista.insertar(new CuentaAhorro(1500, 1, "Carlos", new GregorianCalendar(2022,9,10), 12, true), 8);
        lista.insertar(new CuentaCorriente(2450, 1, "Pablo", 23, true), 4);
        lista.insertar(new CuentaInversion(380, 1, "Alvaro", true), 5);

    }
    
    public void actualizarPanel(javax.swing.JPanel panel){
        this.setContentPane(panel);
        pack();
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        Guardar = new javax.swing.JMenu();
        Cargar = new javax.swing.JMenu();
        Insertar = new javax.swing.JMenu();
        menuahorro = new javax.swing.JMenuItem();
        menucorriente = new javax.swing.JMenuItem();
        menuinversion = new javax.swing.JMenuItem();
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

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        Insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertarMouseClicked(evt);
            }
        });

        menuahorro.setText("Cuenta de Ahorro");
        menuahorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuahorroMouseClicked(evt);
            }
        });
        menuahorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuahorroActionPerformed(evt);
            }
        });
        Insertar.add(menuahorro);

        menucorriente.setText("Cuenta Corriente");
        menucorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucorrienteActionPerformed(evt);
            }
        });
        Insertar.add(menucorriente);

        menuinversion.setText("Cuenta de Inversion");
        menuinversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuinversionActionPerformed(evt);
            }
        });
        Insertar.add(menuinversion);

        jMenuBar1.add(Insertar);

        Visualizar.setText("Visualizar");
        Visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisualizarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Visualizar);

        Ordenar.setText("Ordenar");
        Ordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Ordenar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

    }//GEN-LAST:event_GuardarActionPerformed

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {                                     
        try {
            ObjectOutputStream guardalista = new ObjectOutputStream(new FileOutputStream(new File("cuentas.dat")));

            for (int i = 0; lista.getVector()[i] != null && i < lista.getVector().length; i++) {
                guardalista.writeObject(lista.getVector()[i].getDatos());
            }

            guardalista.close();
            System.out.println("Guardado correctamente");
        } catch (IOException ex) {
            System.err.println("Error grave");
        }
    }                                    

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {                                    
        try {
            ObjectInputStream cargalista = new ObjectInputStream(new FileInputStream(new File("cuentas.dat")));
            Random aleatorio = new Random();

            for (int i = 0; ; i++) {
                try{
                    lista.insertar(cargalista.readObject(), aleatorio.nextInt(99) + 1);
                }
                catch(EOFException e){
                    System.out.println("Fichero Cargado");
                    break;
                }
            }
        } catch (IOException ex) {
            System.err.println("Error grave");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se ha encontrado la clase");
        }

        lista.decirDatos(); //Muestra el codigo
    }                                   

    private void InsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertarMouseClicked
    }//GEN-LAST:event_InsertarMouseClicked

    private void VisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisualizarMouseClicked
        Visualizar visualizar = new Visualizar(lista);
        actualizarPanel(visualizar);
    }//GEN-LAST:event_VisualizarMouseClicked

    private void menucorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucorrienteActionPerformed
        Insertar insertar= new Insertar(lista,2);
        actualizarPanel(insertar);
    }//GEN-LAST:event_menucorrienteActionPerformed

    private void menuahorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuahorroActionPerformed
        Insertar insertar= new Insertar(lista,1);
        actualizarPanel(insertar);
    }//GEN-LAST:event_menuahorroActionPerformed

    private void menuahorroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuahorroMouseClicked
    }//GEN-LAST:event_menuahorroMouseClicked

    private void menuinversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuinversionActionPerformed
        Insertar insertar= new Insertar(lista,3);
        actualizarPanel(insertar);
    }//GEN-LAST:event_menuinversionActionPerformed

    private void OrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenarMouseClicked
        
        for (int x = 0; lista.getVector()[x] != null && x < lista.getVector().length ; x++) {
            for (int y = 0; lista.getVector()[y+1] != null && y < lista.getVector().length - 1; y++) {
                Nodo elementoActual = lista.getVector()[y], elementoSiguiente = lista.getVector()[y + 1];
                if (elementoActual.getIndiceNodo() > elementoSiguiente.getIndiceNodo()) {
                    // Intercambiar
                    lista.getVector()[y] = elementoSiguiente;
                    lista.getVector()[y + 1] = elementoActual;
                }
            }
        }
    }//GEN-LAST:event_OrdenarMouseClicked

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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menuahorro;
    private javax.swing.JMenuItem menucorriente;
    private javax.swing.JMenuItem menuinversion;
    // End of variables declaration//GEN-END:variables
}
