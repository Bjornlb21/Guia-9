package main;

import java.util.Scanner;
import main.entidad.Persona;
import main.servicio.PersonaServicio;


public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        PersonaServicio ps = new PersonaServicio();
        
        Persona p = ps.crearPersona();

        System.out.print("Ingrese una Edad: ");
        int edad = leer.nextInt();
        
        System.out.println("¿La Persona, es menor que la edad consultada?: " + ps.menorQue(p, edad));
        
        System.out.println("");

        ps.mostrarPersona(p);
    }

}
