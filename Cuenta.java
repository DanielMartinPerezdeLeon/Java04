
package p04;

import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author damar
 */
public class Cuenta {
    private int numero; //Numero de identificacion de cuenta (podría no ser unico)
    private transient String propietario;   //Nombre del dueño de la cuenta
    private float saldo;    //Dinero que hay en la cuenta
    private float saldominimo;  //Dinero MINIMO que puede haber en la cuenta (Si saldo fuese a bajar de este numero salta un error)
    private GregorianCalendar fecha;    //Fecha en la que se creó la cuenta
    
    public Cuenta(){    //Constructor genérico
        Random aleatorio = new Random();
        this.numero=aleatorio.nextInt(99)+1;
        this.propietario=null;
        this.saldo=0;
        this.saldominimo=0;
        this.fecha=new GregorianCalendar(); //La fecha es la del sistema
    }
    
    public Cuenta(int saldo, int saldominimo, String propietario){  //Si no se da una fecha, coge la del sistema
        this();
        this.saldo=saldo;
        this.saldominimo=saldominimo;
        this.propietario=propietario;
        
    }
    
    public Cuenta(int saldo, int saldominimo, String propietario, GregorianCalendar fecha){ //Si se da una fecha en especifico
        this(saldo,saldominimo,propietario);
        this.fecha=fecha;
        
    }

    
}
