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
 * @author porto
 */
public class TablaReglas{
    
    private HashMap<String,Regla> listaReglas;

    public TablaReglas()
    {
        this.listaReglas=new HashMap<String,Regla>();
    }

    public void addRegla(Regla regla)
    {
        Regla copiaRegla;
        String id=regla.construirID();
        
        if(listaReglas.containsKey(id))
        {
            if(listaReglas.get(id).getPeso()< regla.getPeso())
            {
                copiaRegla=(Regla)regla.clone();
                listaReglas.put(id, copiaRegla);
            }
        }
        else
        {
            copiaRegla=(Regla)regla.clone();
            listaReglas.put(id, copiaRegla);
        }
    }

    public void imprimir()
    {
        if(listaReglas.isEmpty())
            System.out.println("No se ha obtenido ninguna regla como resultado");
        else
        {
            Regla regla;
            
            Iterator it=listaReglas.entrySet().iterator();
            while(it.hasNext())
            {
                Map.Entry e=(Map.Entry)it.next();
                regla=(Regla)e.getValue();
                System.out.println("Regla"+regla.getPeso());
                System.out.println("if (blueRed is "+textoAntecedente(regla.getBlueRed())
                                   +") and (greenBlue is "+textoAntecedente(regla.getGreenBlue())
                                   +") and (redGreen is "+textoAntecedente(regla.getRedGreen())
                                   +") then (tipo is "+textoConsecuente(regla.getConsecuente())
                                   +")  #Peso="+regla.getPeso());
            }
        }
            
    }

    private String textoAntecedente(short i)
    {
        if (i == Parametros.PEQUENO)
            return "pequeno";
        else if (i == Parametros.MEDIANO)
            return "mediano";
        else if (i == Parametros.GRANDE)
            return "grande";
        else
            return "indefinido";
    }

    private String textoConsecuente(short i)
    {
        if (i == 1)
            return "vermello";
        else if (i == 2)
            return "verde";
        else if (i == 3)
            return "branco";
        else if (i == 4)
            return "azul";
        else
            return "indefinido";
    }
}
