package main.servicio;

import java.util.Scanner;
import main.entidad.Ahorcado;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    // Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    // Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    // Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector.
    // Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
    public Ahorcado crearJuego() {

        Ahorcado a = new Ahorcado();

        System.out.print("Ingrese una Palabra: ");
        String palabra = leer.next();

        System.out.println("");

        String[] palabraBuscada = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            palabraBuscada[i] = palabra.substring(i, i + 1);
        }

        a.setPalabraBuscada(palabraBuscada);

        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        a.setJugadasMaximas(leer.nextInt());

        a.setLetrasEncontradas(0);

        System.out.println("");

        return a;
    }

    // Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    // Nota: buscar como se usa el vector.length.
    public void longitud(Ahorcado a) {
        System.out.println("Longitud de la Palabra: [" + a.getPalabraBuscada().length + "]");
    }

    // Método buscar(letra): este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la 
    //    palabra o no. 
    // También informará si la letra estaba o no.
    public void buscar(Ahorcado a, String letra) {

        boolean encontrada = false;

        for (String palabra : a.getPalabraBuscada()) {

            if (palabra.equalsIgnoreCase(letra)) {

                encontrada = true;
            }
        }

        if (encontrada) {

            System.out.println("");
            System.out.println("La letra pertenece a la palabra");
            System.out.println("");

        } else {

            System.out.println("");
            System.out.println("La letra no pertenece a la palabra");
            System.out.println("");
        }
    }

    // Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas
    //    y cuántas le faltan. 
    // Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, 
    //    cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    public void encontradas(Ahorcado a, String letra) {

        boolean encontrada = false;

        for (String palabra : a.getPalabraBuscada()) {

            if (palabra.equalsIgnoreCase(letra)) {

                encontrada = true;
                break;
            }
        }

        if (encontrada) {

            a.setLetrasEncontradas(a.getLetrasEncontradas() + 1);

        } else {

            a.setJugadasMaximas(a.getJugadasMaximas() - 1);
        }

        System.out.println("Número de letras (encontradas, faltantes): (" + a.getLetrasEncontradas() + "|"
                + (a.getPalabraBuscada().length - a.getLetrasEncontradas()) + ")");
    }

    // Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos(Ahorcado a) {

        System.out.println("");
        System.out.println("Número de oportunidades restantes: " + a.getJugadasMaximas());
        System.out.println("");
    }

    public void mostrarPalabraAdivinada(Ahorcado a) {

        System.out.print("Palabra: ");

        for (String letra : a.getPalabraBuscada()) {

            if (letra == null) {

                System.out.print("_ ");

            } else {

                System.out.print(letra + " ");
            }
        }

        System.out.println();
    }

    public void mostrarFiguraAhorcado(int intentosRestantes) {
       
        System.out.println("  _______");
        System.out.println(" |/      |");

        if (intentosRestantes < 5) {

            System.out.println(" |       O");

        } else {

            System.out.println(" |");
        }

        if (intentosRestantes < 4) {

            if (intentosRestantes < 3) {

                System.out.print(" |     /");

            } else {

                System.out.print(" |   ");
            }

            System.out.print(" |");

            if (intentosRestantes < 2) {

                System.out.println(" \\");

            } else {

                System.out.println();
            }

        } else {
            
            System.out.println(" |");
        }

        if (intentosRestantes < 1) {
            
            System.out.println(" |      / \\");
            
        } else {
            
            System.out.println(" |");
        }

        System.out.println(" |");
        System.out.println("_|___");

        System.out.println("");
    }

    // Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
    //    e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
    // Este método se llamará en el main.
    public void juego(Ahorcado a, String letra) {

        longitud(a);

        System.out.println("");
        mostrarPalabraAdivinada(a);

        buscar(a, letra);

        encontradas(a, letra);

        intentos(a);

        mostrarFiguraAhorcado(a.getJugadasMaximas());

        if (a.getJugadasMaximas() <= 0) {

            System.out.println("Lo sentimos, no hay más oportunidades");
        }
    }
}
