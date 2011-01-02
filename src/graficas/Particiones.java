/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

/**
 *
 * @author ivan
 */
public class Particiones {

    Trapecio pequenho;
    Trapecio mediano;
    Trapecio grande;

    Particiones(Trapecio pequenho, Trapecio mediano, Trapecio grande) {
        this.pequenho = pequenho;
        this.mediano = mediano;
        this.grande = grande;
    }

    float getValorPequenho(float punto) {
        return 1;
    }

    float getValorMediano(float punto) {
        return 1;
    }

    float getValorGrande(float punto) {
        return 1;
    }
}
