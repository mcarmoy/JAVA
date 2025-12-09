import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        double mediaPositivos = 0;
        double mediaNegativos = 0;

        System.out.println("Introduzca 10 números enteros: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");

            numeros[i] = scanner.nextInt();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }  
        }

        if (contadorPositivos > 0 ) {
            mediaPositivos = (double)sumaPositivos/contadorPositivos;
        } 
        if (contadorNegativos > 0) {
            mediaNegativos = (double)sumaNegativos/contadorNegativos;
        }

        System.out.print("Números introducidos en el array: {");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }
        System.out.println("}");

        System.out.println("\n--- Resultados de las Medias ---");

        if (contadorPositivos > 0) {
            System.out.println("Media de los valores positivos: " + mediaPositivos);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
        
        if (contadorNegativos > 0) {
            System.out.println("Media de los valores negativos: " + mediaNegativos);
        } else {
            System.out.println("No se introdujeron números negativos.");
        }
    }
    
}
