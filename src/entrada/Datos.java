/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entrada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author porto
 */
public class Datos {

    private String nombreFichero;
    private ArrayList<Registro> registros;

    public Datos(String fichero)
    {
        this.nombreFichero=fichero;
        this.registros=new ArrayList<Registro>();

        try{
            obtenerDatos();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero " + nombreFichero);
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("Se ha producido un error al leer " + nombreFichero);
            System.exit(1);
        }
    }

    public void obtenerDatos() throws FileNotFoundException, IOException
    {
        FileReader fr=new FileReader(this.nombreFichero);
        BufferedReader br= new BufferedReader(fr);
        Registro reg;

        br.readLine();                                                          // saltamos cabecera

        String linea=br.readLine();
        while(linea != null)
        {
            String[] tokens=linea.split(",");
            
            reg=new Registro();
            reg.setBlueRed(Float.valueOf(tokens[1]));
            reg.setGreenBlue(Float.valueOf(tokens[2]));
            reg.setRedGreen(Float.valueOf(tokens[3]));
            reg.setTipo(Integer.parseInt(tokens[4].trim()));
            this.registros.add(reg);
            

            linea=br.readLine();
        }


        fr.close();
        br.close();
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }


}
