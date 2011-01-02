/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wangmendel;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author ivan
 */
public class SeleccionRegla {

    HashMap<String, Regla> reglas = new HashMap<String, Regla>();
    Regla mejorRegla;
    boolean mejorReglaCalculada = false;

    Regla getMejorRegla() {
        if (!mejorReglaCalculada) {
            float mayor = 0;
            Regla actual;
            Iterator i = reglas.entrySet().iterator();
            while (i.hasNext()) {
                actual = (Regla) i.next();
                if (actual.getPeso() > mayor) {
                    mayor = actual.getPeso();
                    mejorRegla = actual;
                }
            }
            mejorReglaCalculada = true;
        }
        return mejorRegla;
    }

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
