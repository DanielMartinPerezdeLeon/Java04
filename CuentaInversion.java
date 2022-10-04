
import java.util.GregorianCalendar;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Cuenta Inversion
 * -Beneficio/Perdida (+-10% saldo)(Trimestral)(Aleatorio)
 * -Atributo libre
 * 
 * @author carlo
 */


public class CuentaInversion extends Cuenta{
    final int MAXIMO = 10;
    final int MINIMO = -10;
    
    int beneficio;
    //Atributo libre;

    public CuentaInversion(int sal, int salMin, String prop, GregorianCalendar f, int beneficio) {
        super(sal, salMin, prop, f);
        Random aleatorio = new Random();
        int ran = MINIMO + aleatorio.nextInt() % MAXIMO - MINIMO + 1;
        this.beneficio = ran;
    }

    
    
    
}
