
public class Ej12 {
    public static void main(String[] args) {
        //Declaración de variables de entrada
         int[][] num = new int[4][5];
         int sumaFila = 0;
         int sumaCol = 0;
         int sumaTotal = 0;

    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
            num[i][j] = (int) (Math.random()*21);
        }
    }

    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
            System.out.printf(" %4d |", num[i][j]);
            sumaFila += num[i][j];
        }
    }

     System.out.println("---------------------------------------------");
     
     //suma de las columnas
     for (int j = 0; j < num.length; j++) {
        for (int i = 0; i < num[j].length; i++) {
            sumaCol += num[i][j];
            
        }
        
     }



    }
}
