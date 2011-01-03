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
      public static Trapecio BR_PEQUENO=new Trapecio(0,30,0,1508);
      public static Trapecio BR_MEDIANO=new Trapecio(1508,1508,30,2986);
      public static Trapecio BR_GRANDE=new Trapecio(2986,3016,1508,3016);

      public static Trapecio GB_PEQUENO=new Trapecio(1474,1504,1474,2482);
      public static Trapecio GB_MEDIANO=new Trapecio(2482,2482,1504,3460);
      public static Trapecio GB_GRANDE=new Trapecio(3460,3490,2482,3490);
      
      public static Trapecio RG_PEQUENO=new Trapecio(526,556,526,2024);
      public static Trapecio RG_MEDIANO=new Trapecio(2024,2024,556,3492);
      public static Trapecio RG_GRANDE=new Trapecio(3492,3522,2024,3522);

}
