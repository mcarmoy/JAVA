//Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en
//mayúsculas.



import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Datos de entrada
        String nombre = "";
        String sinEspacios = "";

        //Datos auxiliares
        int posicion;
        int numApellido = 0;

        
        Scanner entrada = new Scanner(System.in, StandardCharsets.UTF_8);
        
        System.out.println("Introduzca tu nombre y apellidos: ");
        nombre = entrada.nextLine();

        sinEspacios = nombre.trim(); //Eliminar espacios en blancode inicio y final de nombre
        System.out.println("El nombre es: " + sinEspacios + " sin espacios.");

        posicion = nombre.indexOf(" ");
        System.out.println("Posicion del primer espacio en blanco: " + posicion);

        //Mostrando resultado
        System.out.println("Inicial del nombre: " + nombre.substring(0, 1).toUpperCase());

        while (posicion != -1){
            numApellido++;
            nombre = nombre.substring(posicion + 1, nombre.length() - 1);
            nombre = nombre.trim();
            System.out.println("Inicial apellido " + numApellido + ": " + nombre.substring(0, 1).toUpperCase());
            posicion = nombre.indexOf(" ");

        }



    }
}   
