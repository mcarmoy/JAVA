import java.util.Scanner;

public class Ejercicio9 { // Mantengo el nombre que usaste en la imagen

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        String subcadena;
        boolean encontrada = false;

        System.out.println("Introduce una cadena:");
        cadena = scanner.nextLine();

        System.out.println("Introduce una subcadena:");
        subcadena = scanner.nextLine();

        // 1. Comprobación preliminar
        if (subcadena.length() <= cadena.length()) {

            int longitudPrincipal = cadena.length();
            int longitudSub = subcadena.length();

            // 2. BUCLE EXTERIOR (i): Mueve el punto de inicio
            for (int i = 0; i <= longitudPrincipal - longitudSub; i++) {

                // Asumimos que sí coincide en esta posición i
                boolean coincidenciaParcial = true; 

                // 3. BUCLE INTERIOR (j): Compara la subcadena
                for (int j = 0; j < longitudSub; j++) {

                    // Si los caracteres NO COINCIDEN...
                    if (cadena.charAt(i + j) != subcadena.charAt(j)) {
                        coincidenciaParcial = false; // Marca el fallo
                        break; // Salta al siguiente punto 'i'
                    }
                }

                // 4. VERIFICACIÓN: Solo si el bucle interior terminó con éxito
                if (coincidenciaParcial) {
                    // Si llega aquí, significa que ¡TODOS los caracteres coincidieron!
                    encontrada = true;
                    break; // Termina la búsqueda completamente (rompe el bucle exterior)
                }
            }
        }

        // 5. Mostrar Resultado
        System.out.println("\n--- Resultado ---");
        if (encontrada) {
            System.out.println("La cadena principal SÍ contiene la subcadena.");
        } else {
            System.out.println("La cadena principal NO contiene la subcadena.");
        }

        scanner.close();
    }
}
