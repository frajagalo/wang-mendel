/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package graficas;

/**
 *
 * @author Iván
 */
public class Trapecio {
    /*La recta que une techoA y techoB forma el techo del trapecio, mientras
     que la recta que une baseA y baseB da lugar a la base del mismo.*/
    float techoA;
    float techoB;
    float baseA;
    float baseB;


    public Trapecio(float techoA,float techoB,float baseA,float baseB){
       this.techoA=techoA;
       this.techoB=techoB;
       this.baseA=baseA;
       this.baseB=baseB;
    }

    /*Método que devuelve el valor al que corresponde el argumento punto en dicho
     trapecio. */
    public float getValor(float punto){
       float salida=0;
        if (punto<=baseA)
            salida=0;
        else if (punto>baseA && punto<=techoA)
            salida=(punto-baseA)/(techoA-baseA);
        else if (punto>techoA && punto<=techoB)
            salida=1;
        else if (punto>techoB && punto<=baseB)
            salida=(baseB-punto)/(baseB-techoB);
        else if (punto>baseB)
            salida=0;
        return salida;
    }
}
