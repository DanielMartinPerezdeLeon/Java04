
package Controlador;

import java.io.Serializable;
import modelo.Cuenta;


public class Nodo <T> implements Serializable{
    private int indiceNodo;
    private T datos;
    
    
    public Nodo(T datos, int num){
        this.datos=datos;
        
        this.indiceNodo=num;
    }

    public int getIndiceNodo() {
        return indiceNodo;
    }

    public void setIndiceNodo(int numeroCuenta) {
        this.indiceNodo = numeroCuenta;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }
    
    
    
}
