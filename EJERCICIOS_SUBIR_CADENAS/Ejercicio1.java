import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

        int longitud = cadena.length();

        for (int i = 0; i < longitud; i++) {
            char caracter = cadena.charAt(i);
            System.out.println("Carácter en la posición " + i + ": " + caracter);
            
        }
        
        scanner.close();
    }
    
}
