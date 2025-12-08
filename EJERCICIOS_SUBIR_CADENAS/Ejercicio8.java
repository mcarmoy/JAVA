import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena;
        String cadenaFinal = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");
        cadena = scanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);
            if (Character.isUpperCase(caracterActual)) {
                cadenaFinal += Character.toLowerCase(caracterActual);
            } else if (Character.isLowerCase(caracterActual)) {
                cadenaFinal += Character.toUpperCase(caracterActual);
            } else {
                cadenaFinal += caracterActual;
            }
        }

        System.out.println("La nueva cadena es: " + cadenaFinal);

    }
    
}
