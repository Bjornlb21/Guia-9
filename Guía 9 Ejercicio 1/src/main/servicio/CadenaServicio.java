package main.servicio;

import java.util.Scanner;
import main.entidad.Cadena;


public class CadenaServicio {
    
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Cadena crearFrase(){
        
        System.out.println("==================== Crear Frase ======================");
        System.out.println("");
        
        System.out.print("Ingrese una Frase: ");
        
        return new Cadena(leer.next());
        
    }
    
    // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
    public void mostrarVocales(Cadena c){
        
        System.out.println("=================== Mostrar Vocales ===================");
        System.out.println("");
        
        int cantVocales = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            
            char letras = c.getFrase().toUpperCase().charAt(i);
            
            if (letras == 'A' || letras == 'E' || letras == 'I' || letras == 'O' || letras == 'U') {
                
                cantVocales++;
            }
        }
        
        System.out.println("Cantidad de Vocales: [" + cantVocales + "].");
        System.out.println("");
        
        System.out.println("=======================================================");
        System.out.println("");
    }
    
    // Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    
    public void invertirFrase(Cadena c) {
        
        System.out.println("=================== Invertir Frase ====================");
        System.out.println("");
    
        String frase = c.getFrase();
        
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        
        System.out.println("Frase invertida: [" + fraseInvertida + "].");
        System.out.println("");
        
        System.out.println("=======================================================");
        System.out.println("");
    }
    
    // Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
    //    y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
    // Entrada: frase = "casa blanca". 
    // Salida: El carácter 'a' se repite 4 veces.
    
    public void vecesRepetido(Cadena c) {
    
        System.out.println("=================== Veces Repetidas ===================");
        System.out.println("");
        
        System.out.print("Ingrese una Letra: ");
        String letra = leer.next();
        
        System.out.println("");
        
        int cantRepetido = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            
            if (String.valueOf(c.getFrase().charAt(i)).equalsIgnoreCase(letra)) {
                
                cantRepetido++;
            }
        }
        
        System.out.println("La letra [" + letra + "] está repetida un total de: [" + cantRepetido + "].");
        System.out.println("");
        
        System.out.println("=======================================================");
        System.out.println("");
    }
    
    // Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase 
    //    con otra nueva frase ingresada por el usuario.
    
    public void compararLongitud(Cadena c) {
        
        System.out.println("================= Comparar Longitudes =================");
        System.out.println("");
    
        System.out.print("Ingrese una Frase: ");
        String frase = leer.next();
        
        System.out.println("");
        
        if (c.getLongitud() == frase.length()) {
            
            System.out.println("Las Longitudes son iguales");
            
        } else {
        
            System.out.println("Las Frases no tienen la misma Longitud.");
        }
        
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("");
    }
    
    // Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada 
    //    por el usuario y mostrar la frase resultante.
    
    public void unirFrases(Cadena c) {
        
        System.out.println("==================== Frases Unidas ====================");
        System.out.println("");
        
        System.out.print("Ingrese una nueva Frase: ");
        String frase = leer.next();
        
        System.out.println("");
        
        System.out.println("La Frase unida es: [" + c.getFrase().concat(frase) + "].");
        
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("");
    }
    
    // Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
    //    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    
    public void reemplazar(Cadena c) {
        
        System.out.println("================== Reemplazar Letra ===================");
        System.out.println("");
    
        System.out.print("Ingrese un carácter a reemplazar por la letra A: ");
        String letra = leer.next();
        
        System.out.println("");
        
        System.out.println("La Frase reemplazada es: [" + c.getFrase().replaceAll("a", letra) + "].");
        
        System.out.println("=======================================================");
        System.out.println("");
    }
    
    // Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
    //    y devuelve verdadero si la contiene y falso si no.
    
    public boolean contiene(Cadena c) {
        
        System.out.println("================= ¿Contiene la Letra? =================");
        System.out.println("");
        
        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        
        System.out.println("");
        
        return c.getFrase().contains(letra);
    }
}
