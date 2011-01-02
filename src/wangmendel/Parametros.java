/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wangmendel;

import graficas.Trapecio;

/**
 *
 * @author ivan
 */
public interface Parametros {
      public static short PEQUENO=0;
      public static short MEDIANO=1;
      public static short GRANDE=2;
      public static String NFICHERO="evidenciaSensor.csv";
      public static Trapecio BR_PEQUENO=new Trapecio(4,4,4,4);
      public static Trapecio BR_MEDIANO=new Trapecio(4,4,4,4);
      public static Trapecio BR_GRANDE=new Trapecio(4,4,4,4);
      public static Trapecio GB_PEQUENO=new Trapecio(4,4,4,4);
      public static Trapecio GB_MEDIANO=new Trapecio(4,4,4,4);
      public static Trapecio GB_GRANDE=new Trapecio(4,4,4,4);
      public static Trapecio RG_PEQUENO=new Trapecio(4,4,4,4);
      public static Trapecio RG_MEDIANO=new Trapecio(4,4,4,4);
      public static Trapecio RG_GRANDE=new Trapecio(4,4,4,4);

}
