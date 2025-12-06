public class Ej11 {
    public static void main(String[] args) {
        //Declaración de variables de entrada
         int[][] num = {{0,32,2,100,100,5},{75,100,100,100,0,100},{100,100,-2,9,100,11}};
        
        /* No nos deja poner espacios vacios entonces lo que tenemos que hacer es 
        rellenar los huecos con un mismo numero y despues asignar una orden de qque ese numero no lo imprima */

        //Escribir la cabecera de la tabla
        System.out.printf("%s| %s %s %s %s %s %s\n", 
            "Array num", "Columna0", "Columna1", "Columna2", "Columna3", "Columna4", "Columna5");
        
        //Escribir la tabla
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Fila %3d | ", i); //Para que te cree las filas 
           for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] == 100) {
                    System.out.printf("%9s","|");
                } else {
                    System.out.printf(" %6d |", num[i][j]);
                }
           } 
           System.out.println("");
           System.out.println("-----------------------------------------------------------------");
        }
        
    }
    
}
