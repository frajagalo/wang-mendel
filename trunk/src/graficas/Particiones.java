/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import wangmendel.Parametros;

/**
 *
 * @author ivan
 */
public class Particiones {

    private Trapecio pequenho;
    private Trapecio mediano;
    private Trapecio grande;

    public Particiones(Trapecio pequenho, Trapecio mediano, Trapecio grande) {
        this.pequenho = pequenho;
        this.mediano = mediano;
        this.grande = grande;
    }

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
