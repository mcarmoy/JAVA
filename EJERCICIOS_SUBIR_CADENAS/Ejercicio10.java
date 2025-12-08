import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres:");
        // Importante: Convertimos a minúsculas para manejar palíndromos con mayúsculas/minúsculas
        // y eliminamos espacios para que frases como "Anita lava la tina" funcionen.
        String original = scanner.nextLine().toLowerCase().replace(" ", "");

        boolean esPalindromo = true; // Asumimos que es palíndromo hasta que se demuestre lo contrario
        int longitud = original.length();

        // =========================================================
        // 1. Lógica de Verificación con Bucle FOR
        // =========================================================
        
        // Recorremos solo la mitad de la cadena, ya que comparamos dos caracteres a la vez.
        // Si la cadena tiene longitud impar (ej: 5), el carácter central no necesita revisión.
        for (int i = 0; i < longitud / 2; i++) {
            
            // Índice del carácter del extremo DERECHO
            // longitud - 1 = último índice
            // - i          = desplazamiento desde el final hacia la izquierda
            int indiceFinal = longitud - 1 - i;
            
            char caracterInicio = original.charAt(i); // Carácter desde la IZQUIERDA
            char caracterFinal = original.charAt(indiceFinal); // Carácter desde la DERECHA

            // Comparamos los caracteres opuestos
            if (caracterInicio != caracterFinal) {
                
                esPalindromo = false; // ¡Encontramos una diferencia!
                break; // Rompemos el bucle, no es necesario seguir comprobando
            }
        }

        // =========================================================
        // 2. Mostrar Resultado
        // =========================================================
        System.out.println("\n--- Resultado ---");
        System.out.println("Cadena Analizada (Limpia): " + original);

        if (esPalindromo) {
            System.out.println("La cadena SÍ es un palíndromo.");
        } else {
            System.out.println("La cadena NO es un palíndromo.");
        }

        scanner.close();
    }
}
