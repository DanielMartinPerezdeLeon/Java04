
package Controlador;

import modelo.Cuenta;


public class Nodo <T>{
    private int numeroCuenta;
    private T datos;
    
    
    public Nodo(T datos, int num){
        this.datos=datos;
        
        this.numeroCuenta=num;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }
    
    
    
}
