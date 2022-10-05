
import Controlador.Lista;
import modelo.Cuenta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author damar
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new <Cuenta> Lista(10);
        añadirEjemplos(lista);
        
        lista.decirDatos();
        
        
    }
    
    public static void añadirEjemplos(Lista<Cuenta> lista) {    //Añade unas cuentas a la lista
        lista.insertar(new Cuenta(1200,1, "Antonio"),1);
        lista.insertar(new Cuenta(150, 1,"Dani"),2);

    }
}
