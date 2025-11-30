//Escriba un programa que lea 10 numeros por teclado y que luego los muestre en orden inverso, es decir, 
//el primero que se introduce es el ultimo en mostrarse

import java.util.Scanner;

public class OrdenInversoArray {

    public static void main(String[] args) {
        // 1. Crear el arreglo (array) de capacidad 10
        int[] numerosIngresados = new int[10];

        // Objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // 2. Repetir el proceso 10 veces usando un bucle 'for'
        System.out.println("Por favor, introduce 10 números enteros. (Asegúrate de no introducir texto)");

        // El bucle se ejecuta para i = 0 hasta i = 9 (10 veces).
        for (int i = 0; i < numerosIngresados.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");

            // 3. Leer y Guardar directamente
            // Si el usuario introduce algo que no es un entero, el programa fallará aquí.
            int numero = scanner.nextInt();

            // Guardar el número en la posición actual 'i' del array
            numerosIngresados[i] = numero;
 
        }

        // Para que dicte los numeros introducidos a la inversa del orden introducido

        for (int i = numerosIngresados.length - 1; i > 0; i--) {
            System.out.println(numerosIngresados[i]);
        }
    }
}
