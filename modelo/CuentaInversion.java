package modelo;

import java.util.GregorianCalendar;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Cuenta Inversion -Beneficio/Perdida (+-10% saldo)(Trimestral)(Aleatorio)
 * -Atributo libre
 *
 * @author carlo
 */
public class CuentaInversion extends Cuenta {

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

    public CuentaInversion(boolean estudiante, int saldo, int saldoMinimo, String propietario) {
        super(saldo, saldoMinimo, propietario);
        Random aleatorio = new Random();
        int ran = MINIMO + aleatorio.nextInt() % MAXIMO - MINIMO + 1;
        this.beneficio = ran;
        this.estudiante = estudiante;
    }

    public CuentaInversion(boolean estudiante, int saldo, int saldoMinimo, String propietario, GregorianCalendar fecha) {
        super(saldo, saldoMinimo, propietario, fecha);
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
