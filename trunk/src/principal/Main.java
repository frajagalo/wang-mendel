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
 * @author Iván
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //establecemos fichero por defecto por si no se pasa como parametro.
        String fichero = Parametros.NFICHERO; 

        if (args.length > 0) {
            fichero = args[0];//establecemos fichero pasado por parámetros
        }
        System.out.println("\n/************************************************************"
                + "\n * Algoritmo Wang & Mendel"
                + "\n * Problema: Clasificación de vidrio"
                + "\n * Autores: Iván Carballo Fernández & Pablo Porto Veloso"
                + "\n *"
                + "\n * Fichero datos = " + fichero
                + "\n ************************************************************/\n");
        //Creamos el objeto que implemeta el algoritmo y lo ejecutamos. 
         AlgoritmoWM algoritmo=new AlgoritmoWM(new Datos(fichero));
         algoritmo.ejecutar();
    }
}
