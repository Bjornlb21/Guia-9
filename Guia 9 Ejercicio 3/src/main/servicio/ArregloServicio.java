package main.servicio;

import java.util.Arrays;

public class ArregloServicio {

    // Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] A) {

        for (int i = 0; i < A.length; i++) {

            A[i] = Math.random() * 100;
        }
    }

    // Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[] A) {

        for (int i = 0; i < A.length; i++) {

            System.out.println("[" + A[i] + "]");
        }
    }

    // Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor
    public void ordenar(double[] A) {

        for (int i = 0; i < A.length; i++) {

            Arrays.sort(A);
        }
    }

    // Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
    // Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] A, double[] B) {

        System.arraycopy(A, 0, B, 0, 10);

        Arrays.fill(B, 40, 50, 0.5);
    }
}
