/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wangmendel;

import entrada.Datos;
import graficas.Particiones;
import java.util.ArrayList;

/**
 *
 * @author ivan
 */
public class AlgoritmoWM implements Parametros {

    private Datos datos;
    private SeleccionRegla seleccionRegla;
    private TablaReglas tablaReglas;
    private Particiones partBR;
    private Particiones partGB;
    private Particiones partRG;

    public AlgoritmoWM(Datos datos) {
        this.datos = datos;
        seleccionRegla = new SeleccionRegla();
        partBR = new Particiones(BR_PEQUENO, BR_MEDIANO, BR_GRANDE);
        partGB = new Particiones(GB_PEQUENO, GB_MEDIANO, GB_GRANDE);
        partRG = new Particiones(RG_PEQUENO, RG_MEDIANO, RG_GRANDE);
    }

    public void ejecutar() {
        float peso = 0;
        Regla mejor;
        ArrayList<Short> particiones = new ArrayList<Short>(3);
        particiones.add(Parametros.PEQUENO);
        particiones.add(Parametros.MEDIANO);
        particiones.add(Parametros.GRANDE);
        for (int i = 0; i < datos.getRegistros().size(); i++) {
            for (int j = 0; j < particiones.size(); j++) {
                for (int k = 0; k < particiones.size(); k++) {
                    for (int n = 0; n < particiones.size(); n++) {
                        peso = partBR.getValor(particiones.get(j), datos.getRegistros().get(i).getBlueRed());
                        peso = peso * partGB.getValor(particiones.get(k), datos.getRegistros().get(i).getGreenBlue());
                        peso = peso * partRG.getValor(particiones.get(n), datos.getRegistros().get(i).getRedGreen());
                        seleccionRegla.addRegla(particiones.get(j), particiones.get(k), particiones.get(n), peso);
                        peso = 0;
                    }
                }
            }
            mejor=seleccionRegla.getMejorRegla();
            mejor.setConsecuente(datos.getRegistros().get(i).getTipo());
            tablaReglas.addRegla(seleccionRegla.getMejorRegla());
        }
        tablaReglas.imprimir();
    }
}
