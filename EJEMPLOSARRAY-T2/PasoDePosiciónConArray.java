/*Escribe un programa que lea 15 números por tecladoy que los alamacene en un array. Rota los elementos de ese array
,es decir, el elemneto de la posción 0 debe pasar a la poscición 1, el de la 1 a la 2, etc. El número que se encuentra
en la última posición debe pasar a la poscición 0. Finalmente, muestra el contenido del array. */

import java.util.Scanner;

public class PasoDePosiciónConArray {
    public static void main(String[] args) {

        int[] numerosIngresados = new int [15];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca 15 números enteros porfavor: ");

        for ( int i = 0; i < numerosIngresados.length; i++ ){
            System.out.print("Introduce el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numerosIngresados[i] = numero;
        }
        //Hasta aquí hemos guardado los valores en el array

        //A partir de aquí empezamos a rotar los valores 
        int ultimoElemento = numerosIngresados[15 - 1];

        for ( int i = numerosIngresados.length - 1; i < 2; i--) {
            numerosIngresados[i] = numerosIngresados[i - 1];
        }



       
        
    }
    
}
