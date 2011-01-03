/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wangmendel;

import graficas.Trapecio;

/**
 *
 * @author Iván
 */
public interface Parametros {
      /*Posibles valores de los atributos que forman el antecedente.*/
      public static short PEQUENO=0;
      public static short MEDIANO=1;
      public static short GRANDE=2;
      /*Nombre del fichero por defecto.*/
      public static String NFICHERO="evidenciaSensor.csv";
      /*Trapecios que encapsulan las particiones de cada una de las tres
       variables del antecedente.*/
      public static Trapecio BR_PEQUENO=new Trapecio(0,375,0,1125);
      public static Trapecio BR_MEDIANO=new Trapecio(1500,1500,750,2250);
      public static Trapecio BR_GRANDE=new Trapecio(2625,3000,1875,3000);
      public static Trapecio GB_PEQUENO=new Trapecio(1500,1750,1500,2250);
      public static Trapecio GB_MEDIANO=new Trapecio(2500,2500,2000,3000);
      public static Trapecio GB_GRANDE=new Trapecio(3250,3500,2750,3500);
      public static Trapecio RG_PEQUENO=new Trapecio(500,1625,500,2000);
      public static Trapecio RG_MEDIANO=new Trapecio(2000,2000,1250,2750);
      public static Trapecio RG_GRANDE=new Trapecio(3125,3500,2375,3500);

}
