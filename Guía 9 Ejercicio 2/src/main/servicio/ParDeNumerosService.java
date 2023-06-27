package main.servicio;

import main.entidad.ParDeNumeros;

public class ParDeNumerosService {

    // Método mostrarValores que muestra cuáles son los dos números guardados.
    
    public void mostrarValores(ParDeNumeros pdn) {
        
        System.out.println("Primer número: [" + pdn.getNum1() + "].");
        System.out.println("");
        System.out.println("Segundo número: [" + pdn.getNum2() + "].");
        System.out.println("");
    }
    
    // Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

    public double devolverMayor(ParDeNumeros pdn) {
    
        return Math.max(pdn.getNum1(), pdn.getNum2());
    }

    // Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
    // Previamente se deben redondear ambos valores.
    
    public double calcularPotencia(ParDeNumeros pdn) {
    
        long redon1 = Math.round(pdn.getNum1());
        long redon2 = Math.round(pdn.getNum2());
        
        long mayor = Math.max(redon1, redon2);
        long menor = Math.min(redon1, redon2);
        
        return Math.pow(mayor, menor);
    }
    
    // Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    // Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    
    public double calcularRaiz(ParDeNumeros pdn) {
        
        double menor = Math.min(pdn.getNum1(), pdn.getNum2());
        
        double valorAbs = Math.abs(menor);
        
        return Math.sqrt(valorAbs);
    }
}
