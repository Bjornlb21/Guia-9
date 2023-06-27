package main.servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {

    // Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
    // Luego los pase por parámetro a un nuevo objeto Date. 
    // El método debe retornar el objeto Date. 
    // Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    public Date fechaNacimiento() {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        System.out.print("Ingrese su día de Nacimiento: ");
        int dia = leer.nextInt();
        
        System.out.println("");
        
        System.out.print("Ingrese su mes de Nacimiento: ");
        int mes = leer.nextInt();
        
        System.out.println("");
        
        System.out.print("Ingrese su año de Nacimiento: ");
        int year = leer.nextInt();
        
        return new Date(year - 1900, mes - 1, dia);
    }
    
    // Método fechaActual que cree un objeto fecha con el día actual.
    // Para esto usaremos el constructor vacío de la clase Date. 
    // Ejemplo: Date fechaActual = new  Date();
    public Date fechaActual() {
        return new Date();
    }
    
    // Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una 
    //    y otra (edad del usuario).
    public String diferencia(Date fechaNacimiento, Date fechaActual) {
        
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        
        System.out.println("");
        
        return "La edad del Usuario es de: [" + edad + "].";
    }
}
