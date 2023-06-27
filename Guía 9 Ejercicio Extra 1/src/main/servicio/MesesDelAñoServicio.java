package main.servicio;

import java.util.Scanner;
import main.entidad.MesesDelAño;

public class MesesDelAñoServicio {

    public void adivinarMesSecreto(MesesDelAño m) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        String mesSecreto;

        do {
            
            System.out.print("Ingrese el Mes: ");
            mesSecreto = leer.next();
            
            System.out.println("");
            
            if (mesSecreto.equalsIgnoreCase(m.getMesSecreto())) {

                System.out.println("!Felicidades! Adivinaste el mes secreto.");
                
            } else {

                System.out.println("!Vuelve a Intentarlo!");
            }

            System.out.println("");

        } while (!mesSecreto.equalsIgnoreCase(m.getMesSecreto()));
    }
}
