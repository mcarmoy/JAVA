import java.util.Scanner;

public class Ejercicio6 { 
    
    public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in);
        String cadena;
        String cadenaInvertida = "";

        System.out.println("Introduce una cadena:");
        cadena = scanner.nextLine(); // Leemos la cadena

        // Bucle para invertir la cadena
        for (int i = cadena.length() - 1; i >= 0; i--) {
            char caracterActual = cadena.charAt(i);
            cadenaInvertida += caracterActual;
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);
        
    } 
    
} 
