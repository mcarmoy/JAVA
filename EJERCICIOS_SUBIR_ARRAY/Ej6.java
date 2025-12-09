import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int numAlumnos;
        double sumaNotas = 0;
        double mediaNotas;
        Scanner scanner = new Scanner(System.in);

        do {
           System.out.print("Introduce el número de alumnos de la clase: ");
            numAlumnos = scanner.nextInt(); 
        } while (numAlumnos <= 0);

        double[] notas = new double[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            sumaNotas += notas[i];
        }

        mediaNotas = sumaNotas/numAlumnos;

        System.out.printf("La nota media del grupo es: %.2f\n", mediaNotas);

        System.out.println("\n--- Alumnos con Notas Superiores a la Media --- " + "(" + (mediaNotas) + ")");

        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > mediaNotas) {
                System.out.printf("Alumno %d: %.2f\n", (i + 1), notas[i]);
            }
        }


    }
    
}
