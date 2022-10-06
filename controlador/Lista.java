
package Controlador;

import java.io.Serializable;
import modelo.Cuenta;

/**
 *
 * @author damar
 */
public class Lista <T> implements Serializable{
    private Nodo[] vector;
    
    public Lista(int tam){
        vector = new Nodo[tam];
        
        for(int i=0; i<vector.length; i++){
            vector[i]=null;
        }
        
    }
    
    public void insertar(T cuen, int indice){
        for(int i=0; i<vector.length; i++){
            if(vector[i]==null){
                vector[i]= new Nodo(cuen, indice);
                return;
            }
        }
        System.out.println("La lista esta llena");
    }
    
    
    public void decirDatos(){
        for(int i=0; vector[i]!=null && i+1<vector.length; i++){
            Cuenta aux= (Cuenta) vector[i].getDatos();
            System.out.println(aux.getNumero());
        }
    
    }

    public Nodo[] getVector() {
        return vector;
    }

    public void setVector(Nodo[] vector) {
        this.vector = vector;
    }
    
    
}
