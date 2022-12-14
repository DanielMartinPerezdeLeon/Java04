package modelo;

import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Cuenta Corriente -Comision (Semestral o anual) -tipoComisino
 *
 * @author carlo
 */
public class CuentaCorriente extends Cuenta {

    final boolean SEMESTRAL = true;
    final boolean ANUAL = false;

    private float comision;
    private boolean tipoComision;

    public CuentaCorriente() {
        super();
        this.comision = 0;
        this.tipoComision = SEMESTRAL;
    }

    public CuentaCorriente(int saldo, int saldominimo, String propietario, int comision, boolean tipoComision) {
        super(saldo, saldominimo, propietario);
        this.comision = comision;
        this.tipoComision = tipoComision;
    }

    public CuentaCorriente(int saldo, int saldominimo, String propietario, GregorianCalendar fecha, int comision, boolean tipoComision) {
        super(saldo, saldominimo, propietario, fecha);
        this.comision = comision;
        this.tipoComision = tipoComision;
    }

    //GETTER
    public float getComision() {
        return comision;
    }

    public boolean isTipoComision() {
        return tipoComision;
    }

    //SETTER
    public void setComision(int comision) {
        this.comision = comision;
    }

    public void setTipoComision(boolean tipoComision) {
        this.tipoComision = tipoComision;
    }

}
