package modelo;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import static modelo.IFecha.ANO;
import static modelo.IFecha.DIA_DEL_MES;
import static modelo.IFecha.MES_DEL_ANO;

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

    public Cuenta(int saldo, int saldoMinimo, String propietario) throws Error {
        this();
        this.propietario = propietario;
        try{
            comprobarSaldo(saldo, saldoMinimo);
            this.saldoMinimo = saldoMinimo;
            this.saldo = saldo;
        } catch(Error e){
            throw e;
        }
        
        
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
    
    public String fechaString() {
        return this.fecha.get(Calendar.DAY_OF_MONTH) + "/" //Dia
                + (this.fecha.get(Calendar.MONTH)) + "/" //Mes
                + this.fecha.get(Calendar.YEAR);            //Año
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
    
    //FECHA
    public int dia() {
        return this.fecha.get(DIA_DEL_MES);
    }

    public int mes() {
        return this.fecha.get(MES_DEL_ANO);
    }

    public int ano() {
        return this.fecha.get(ANO);
    }
}
