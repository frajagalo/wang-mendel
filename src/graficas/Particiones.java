/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import wangmendel.Parametros;

/**
 *
 * @author Iván
 */
public class Particiones {

    //Tres trapecios que forman las particiones correspodientes a una variable
    private Trapecio pequenho;
    private Trapecio mediano;
    private Trapecio grande;

    public Particiones(Trapecio pequenho, Trapecio mediano, Trapecio grande) {
        this.pequenho = pequenho;
        this.mediano = mediano;
        this.grande = grande;
    }

    /*Devuelve el valor que tiene el argumento punto en el trapecio indicado como part.
     Si el trapecio indicado no es válido devuelve -1.*/
    public float getValor(short part, float punto) {
        if (part == Parametros.PEQUENO) {
            return pequenho.getValor(punto);
        } else if (part == Parametros.MEDIANO) {
            return mediano.getValor(punto);
        } else if (part == Parametros.GRANDE) {
            return grande.getValor(punto);
        } else {
            return -1;
        }
    }
}
