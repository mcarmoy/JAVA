import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        int contadorPalabras = 0;
        
        System.out.println("Introduzca una cadena (con espacios):");
        cadena = scanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            
            if (i == 0 && cadena.charAt(i) != 0) {
                contadorPalabras++;
            } else 

                if (i > 0 && cadena.charAt(i) != ' ' && cadena.charAt(i - 1) == ' ') {
                    contadorPalabras++;
                }
                
            } 
        
            System.out.println("La frase tiene " + contadorPalabras + " palabras.");

            }
            
        }

        

    
    

