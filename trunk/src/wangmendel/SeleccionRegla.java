/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wangmendel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Iván
 */
public class SeleccionRegla {
    //Lista que guarda todos los antecedentes con su peso psibles.
    private HashMap<String, Regla> reglas = new HashMap<String, Regla>();
    //Regla con mayor peso de toda la lista anterior
    private Regla mejorRegla;
    //Indica si hace falta o no calcular la mejor regla.
    private boolean mejorReglaCalculada = false;

    //Devuelve la mejor regla de la lista
    Regla getMejorRegla() {
        if (!mejorReglaCalculada) {
            float mayor = 0;
            Regla actual;
            Map.Entry<String, Regla> me;
            Iterator i = reglas.entrySet().iterator();
            while (i.hasNext()) {
                me = (Map.Entry) i.next();
                actual=me.getValue();
                if (actual.getPeso() > mayor) {
                    mayor = actual.getPeso();
                    mejorRegla = actual;
                }
            }
            mejorReglaCalculada = true;
        }
        return mejorRegla;
    }

    /*Añade una regla si su antecedente no existe en la lista. Si ya existe
     * simplemente actualiza su peso. 
     */
    void addRegla(short br, short gb, short rg, float peso) {
        mejorReglaCalculada = false;
        String id = Regla.construirID(br, gb, rg);
        if (reglas.containsKey(id)) {
            reglas.get(id).setPeso(peso);
        } else {
            reglas.put(id, new Regla(br, gb, rg, peso));
        }

    }
}
