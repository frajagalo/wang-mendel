package wangmendel;

import entrada.Datos;
import graficas.Particiones;
import java.util.ArrayList;

/**
 *
 * @author Iván
 */
public class AlgoritmoWM implements Parametros {

    private Datos datos; //Fuente de datos
    private SeleccionRegla seleccionRegla; //Clase para seleccionar la mejor regla
    private TablaReglas tablaReglas; //Tabla que simula la matriz de reglas
    private Particiones partBR;// Particiones para la variable BlueRed
    private Particiones partGB;//Particiones para la variable GreenBlue
    private Particiones partRG;//Particiones para la variable RedGreen

    public AlgoritmoWM(Datos datos) {
        this.datos = datos;
        seleccionRegla = new SeleccionRegla();
        tablaReglas=new TablaReglas();
        /*Creamos las particiones a partir de los objetos Trapecio que existen
         en Parametros. Estos objetos modulan las gráficas de las particiones.*/
        partBR = new Particiones(BR_PEQUENO, BR_MEDIANO, BR_GRANDE);
        partGB = new Particiones(GB_PEQUENO, GB_MEDIANO, GB_GRANDE);
        partRG = new Particiones(RG_PEQUENO, RG_MEDIANO, RG_GRANDE);
    }

    /*Metodo que implementa el algoritmo Wang Mendel*/
    public void ejecutar() {
        float peso = 0;
        Regla mejor;
        //Array con las constantes de las particiones para así poder recorrerlas.
        ArrayList<Short> particiones = new ArrayList<Short>(3);
        particiones.add(Parametros.PEQUENO);
        particiones.add(Parametros.MEDIANO);
        particiones.add(Parametros.GRANDE);
        //Primero recorremos todos los registros del fichero.
        for (int i = 0; i < datos.getRegistros().size(); i++) {
            /*Con los siguientes tres lazos construimos todos los posibles antecedentes y calculamos el peso de cada
             uno parar el registro de entrada actual.*/
            //Lazo para blueRed
            for (int j = 0; j < particiones.size(); j++) {
                //Lazo para greenBlue
                for (int k = 0; k < particiones.size(); k++) {
                    //Lazo para RedGreen
                    for (int n = 0; n < particiones.size(); n++) {
                        //Calculamos el peso del antecedente obteniendo su valor en cada una de las graficas.
                        peso = partBR.getValor(particiones.get(j), datos.getRegistros().get(i).getBlueRed());
                        peso = peso * partGB.getValor(particiones.get(k), datos.getRegistros().get(i).getGreenBlue());
                        peso = peso * partRG.getValor(particiones.get(n), datos.getRegistros().get(i).getRedGreen());
                        //Añadimos una nueva regal con su peso en seleccionRegla que más tarde seleccionará la mejor.
                        seleccionRegla.addRegla(particiones.get(j), particiones.get(k), particiones.get(n), peso);
                        //Reseteamos el peso para la siguiente interacción
                        peso = 0;
                    }
                }
            }
            //Seleccionamos el mejor antecedente de todos los construidos anteriormente.
            mejor=seleccionRegla.getMejorRegla();
            //Le añadimos el consecuente para formar la regla completa
            mejor.setConsecuente(datos.getRegistros().get(i).getTipo());
            //La añadimos a la tabla que simula la matriz de reglas.
            tablaReglas.addRegla(mejor);
        }
        //Imprimimos la matriz de reglas una vez finalizado el algoritmo. 
        tablaReglas.imprimir();
    }
}
