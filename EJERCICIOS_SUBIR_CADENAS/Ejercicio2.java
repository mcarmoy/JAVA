import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        System.out.println("Introduce una subcadena: ");
        String subcadena = scanner.nextLine();
        char letraCad;
        char letraSub;
        
        boolean coincide = true;

        if (subcadena.length() > cadena.length()) {
            coincide = false;
        }
        
        else {
            
            for (int i = 0; i < subcadena.length(); i++) {
            letraCad = cadena.charAt(i);
            letraSub = subcadena.charAt(i);

            if (letraCad != letraSub) {
                coincide = false;
                break;
            }
        }
    }

    if (coincide) {
        System.out.println("Lca cadena si comienza por la subcadena");
    } else {
        System.out.println("La cadena no comienza por la subcadena");
    } 
    
    
}
}
