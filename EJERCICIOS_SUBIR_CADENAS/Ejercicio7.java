import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        String caracter1;
        String caracter2;
        char car1;
        char car2;
        String cadenaFinal = "";


        System.out.println("Introduce una cadena: ");
        cadena = scanner.nextLine();

        do {
            System.out.println("Introduce un primer caracter a reemplazar: ");
            caracter1 = scanner.nextLine();
        } while (caracter1.length() != 1);
        car1 = caracter1.charAt(0);

        do {
            System.out.println("Introduce un segundo caracter por el que reemplazar el anterior: ");
            caracter2 = scanner.nextLine();
        } while (caracter2.length() != 1); 
        car2 = caracter2.charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);
            if (caracterActual == car1) {
                cadenaFinal += caracter2;
            } else {
                cadenaFinal += caracterActual;
            }
            
        }

        System.out.println("La nueva cadena es: " + cadenaFinal);

    }
    
}
