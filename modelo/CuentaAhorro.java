package modelo;

import java.util.GregorianCalendar;

/**
 *
 * @author damar
 */
public class CuentaAhorro extends Cuenta {

    private float interesmensual;   //Cuanto aumenta el saldo en un mes
    private boolean estudiante;     //No hace ninguna operación

    public CuentaAhorro() {
        super();//Llama al constructor padre
        this.interesmensual = 0;
        this.estudiante = false;
    }

    public CuentaAhorro(int saldo, int saldominimo, String propietario, float interesmensual, boolean estudiante) {  //Si no se da una fecha
        super(saldo, saldominimo, propietario); //Llama al constructor padre
        this.interesmensual = interesmensual;
        this.estudiante = estudiante;
    }

    public CuentaAhorro(int saldo, int saldominimo, String propietario, GregorianCalendar fecha, float interesmensual, boolean estudiante) { //Si se da una fecha
        super(saldo, saldominimo, propietario, fecha);  //Llama al constructor padre
        this.interesmensual = interesmensual;
        this.estudiante = estudiante;
    }

    //GETTER
    public float getInteresMensual() {
        return interesmensual;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    //SETTER
    public void setInteresmensual(float interesmensual) {
        this.interesmensual = interesmensual;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }
}
