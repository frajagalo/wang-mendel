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
       return 1;
    }
}
