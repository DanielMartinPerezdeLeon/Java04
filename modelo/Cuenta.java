package modelo;

import java.io.IOException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author damar
 */
public class Cuenta implements Serializable{

    private int numero;
    private transient String propietario;
    private float saldo;
    private float saldoMinimo;
    private GregorianCalendar fecha;

    public Cuenta() {
        Random aleatorio = new Random();
        this.numero = aleatorio.nextInt(99) + 1;
        this.propietario = null;
        this.saldo = 0;
        this.saldoMinimo = 0;
        this.fecha = new GregorianCalendar();
    }

    public Cuenta(int saldo, int saldoMinimo, String propietario) {
        this();
        this.propietario = propietario;
        comprobarSaldo(saldo, saldoMinimo);
        this.saldoMinimo = saldoMinimo;
        this.saldo = saldo;
    }

    public Cuenta(int saldo, int saldominimo, String propietario, GregorianCalendar fecha) {
        this(saldo, saldominimo, propietario);
        this.fecha = fecha;

    }
    
    public void comprobarSaldo(int saldo, int saldoMinimo) throws Error{
        if(saldo<saldoMinimo){
            throw new Error("Error. El saldo es inferior al saldo minimo.");
        }
    }

    //GETTER
    public int getNumero() {
        return numero;
    }

    public String getPropietario() {
        return propietario;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getSaldominimo() {
        return saldoMinimo;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    //SETTER
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setSaldominimo(float saldominimo) {
        this.saldoMinimo = saldominimo;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

}
