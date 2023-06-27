package main;

import main.servicio.ArregloServicio;


public class Main {

    public static void main(String[] args) {
        
        // Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
        
        double[] A = new double[50];
        double[] B = new double[50];
        
        ArregloServicio as = new ArregloServicio();
        
        // En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
        
        as.inicializarA(A);
        as.mostrar(A);
        System.out.println("");
        as.ordenar(A);
        as.inicializarB(A, B);
        as.mostrar(A);
        System.out.println("");
        as.mostrar(B);

    }

}
