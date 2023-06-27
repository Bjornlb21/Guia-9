package main;

import java.util.Scanner;
import main.entidad.Ahorcado;
import main.servicio.AhorcadoServicio;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        AhorcadoServicio as = new AhorcadoServicio();

        Ahorcado a = as.crearJuego();

        System.out.println("==================== Ahorcado ===================");
        System.out.println("");

        do {

            System.out.print("Ingrese una Letra: ");
            String letra = leer.next();

            System.out.println("");

            as.juego(a, letra);

            System.out.println("-------------------------------------------------");
            System.out.println("");

        } while (a.getJugadasMaximas() > 0 && a.getLetrasEncontradas() < a.getPalabraBuscada().length);

        if (a.getLetrasEncontradas() == a.getPalabraBuscada().length) {

            System.out.println("!Felicidades, adivinaste la Palabra!");
            System.out.println("");
        }

        System.out.println("=================================================");
    }
}
