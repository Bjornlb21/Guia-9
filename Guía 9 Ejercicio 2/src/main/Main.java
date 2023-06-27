package main;

import main.entidad.ParDeNumeros;
import main.servicio.ParDeNumerosService;

public class Main {

    public static void main(String[] args) {
        
        ParDeNumerosService pdns = new ParDeNumerosService();
        
        ParDeNumeros pdn = new ParDeNumeros();
        
        pdns.mostrarValores(pdn);
        
        System.out.println("El mayor de los Números es: [" + pdns.devolverMayor(pdn) + "].");
        
        System.out.println("");
        
        System.out.println("La potencia del Número mayor es de: [" + pdns.calcularPotencia(pdn) + "].");
        
        System.out.println("");
        
        System.out.println("La Raíz del Número menor es de: [" + pdns.calcularRaiz(pdn) + "].");
        System.out.println("");
    }
}
