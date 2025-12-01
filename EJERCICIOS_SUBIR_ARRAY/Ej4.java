public class Ej4 {
    public static void main(String[] args) {
        int[] array1 = {1, 6, 4, 9, 3};
        int[] array2 = {3, 8 ,1};
        int maxLenght, minLenght;

        if (array1.length >= array2.length) {
            maxLenght = array1.length;
            minLenght = array2.length;
        }
        else { 
            maxLenght = array2.length;
            minLenght = array1.length;
        }

        int[] array3 = new int[maxLenght];

        //primero rellena hasta el array más corto 
        for (int i = 0; i < minLenght; i++ ){
            if (array1[i] > array2[i])
                array3[i] = array1[i];
            else 
                array3[i] = array2[i];
        }

         // a continuación, rellena con lo que queda del más largo
        for (int i = minLenght - 1; i < maxLenght; i++){
            if (array1.length > array2.length) 
                array3[i] = array1[i];
            else
                array3[i] = array2[i];
        }

        // Mostrar el resultado
        System.out.print("El array resultante es: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
    
}
