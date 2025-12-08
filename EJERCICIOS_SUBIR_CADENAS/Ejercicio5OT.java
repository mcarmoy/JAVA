import java.util.Scanner;

public class Ejercicio5OT {
    public static void main(String[] args) {
        String nombre;
        char Primeraletra;
        String iniciales = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre y apellidos: ");
        nombre = scanner.nextLine();
        String nombreRecortado = nombre.trim();

        for (int i = 0; i < nombreRecortado.length(); i++) {
            char caracterActual = nombreRecortado.charAt(i);

            boolean esPrimeraLetra = (i == 0 && caracterActual != ' ');

            boolean esLetraDespuesDeEspacio = (i > 0 && caracterActual != ' ' && nombreRecortado.charAt(i - 1) == ' ');

            if (esPrimeraLetra || esLetraDespuesDeEspacio) {
                char inicialMayuscula = Character.toUpperCase(caracterActual);
                iniciales += inicialMayuscula;
            }
            
            }
            System.out.println("Iniciales: " + iniciales);
        }




    }

