
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
    boolean estudiante;

    public CuentaInversion() {
        super();
        Random aleatorio = new Random();
        int ran = MINIMO + aleatorio.nextInt() % MAXIMO - MINIMO + 1;
        this.beneficio = ran;
        this.estudiante = false;
    }

    public CuentaInversion(int beneficio, boolean estudiante, int saldo, int saldominimo, String propietario) {
        super(saldo, saldominimo, propietario);
        Random aleatorio = new Random();
        int ran = MINIMO + aleatorio.nextInt() % MAXIMO - MINIMO + 1;
        this.beneficio = ran;
        this.estudiante = estudiante;
    }
    
    public CuentaInversion(int sal, int salMin, String prop, GregorianCalendar f, boolean estudiante) {
        super(sal, salMin, prop, f);
        Random aleatorio = new Random();
        int ran = MINIMO + aleatorio.nextInt() % MAXIMO - MINIMO + 1;
        this.beneficio = ran;
        this.estudiante = estudiante;
    }

    //GETTER
    public int getBeneficio() {
        return beneficio;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    //SETTER
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }

    
    
    
    
    
}
