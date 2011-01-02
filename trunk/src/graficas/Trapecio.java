/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package graficas;

/**
 *
 * @author ivan
 */
public class Trapecio {
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
