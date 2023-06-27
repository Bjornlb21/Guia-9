package main;

import main.entidad.Cadena;
import main.servicio.CadenaServicio;

public class Main {

    public static void main(String[] args) {
        
        CadenaServicio cs = new CadenaServicio();
        
        Cadena c = cs.crearFrase();
        
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("");
        
        cs.mostrarVocales(c);
       
        cs.invertirFrase(c);
        
        cs.vecesRepetido(c);
        
        cs.compararLongitud(c);
        
        cs.unirFrases(c);
        
        cs.reemplazar(c);
        
        String vOf = cs.contiene(c) ? "Sí" : "No";

        System.out.println(vOf);
        
        System.out.println("");
        System.out.println("=======================================================");
    }

}
