/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entrada.Datos;
import wangmendel.AlgoritmoWM;
import wangmendel.Parametros;

/**
 *
 * @author ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String fichero = Parametros.NFICHERO; //establecemos fichero por defecto

        if (args.length > 0) {
            fichero = args[0];        //establecemos fichero pasado por parámetros
        }
        System.out.println("\n/************************************************************"
                + "\n * Algoritmo Wang & Mendel"
                + "\n * Problema: Clasificación de vidrio"
                + "\n * Autores: Iván Carballo Fernández & Pablo Porto Veloso"
                + "\n *"
                + "\n * Fichero datos = " + fichero
                + "\n ************************************************************/\n");
        
         AlgoritmoWM algoritmo=new AlgoritmoWM(new Datos(fichero));
         algoritmo.ejecutar();
    }
}
