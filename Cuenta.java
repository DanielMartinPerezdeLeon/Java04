
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author damar
 */
public class Cuenta {
    private int numero;
    private transient String propietario;
    private float saldo;
    private float saldominimo;
    private GregorianCalendar fecha;
    
    public Cuenta(){
        Random aleatorio = new Random();
        this.numero=aleatorio.nextInt(99)+1;
        this.propietario=null;
        this.saldo=0;
        this.saldominimo=0;
        this.fecha=new GregorianCalendar();
    }
    
    public Cuenta(int saldo, int saldominimo, String propietario){
        this();
        this.saldo=saldo;
        this.saldominimo=saldominimo;
        this.propietario=propietario;
        
    }
    
    public Cuenta(int saldo, int saldominimo, String propietario, GregorianCalendar fecha){
        this(saldo,saldominimo,propietario);
        this.fecha=fecha;
        
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
        return saldominimo;
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
        this.saldominimo = saldominimo;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
    
    

    
    
}
