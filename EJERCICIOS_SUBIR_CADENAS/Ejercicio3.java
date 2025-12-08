import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena;
        String car;
        int contador = 0;
        String porcion;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("Introduzca un caracter: ");
        car = entrada.nextLine();

        for (int index = 0; index < cadena.length(); index++) {
            porcion = cadena.substring(index, index+1);
            if (porcion.equals(car)) {
                contador++;
            }

        }

        System.out.println("El carácter " + car + " se repite " + contador + " veces.");


    }
    
}
