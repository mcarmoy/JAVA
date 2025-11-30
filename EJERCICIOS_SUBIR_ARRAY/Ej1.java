public class Ej1 {
    public static void main(String[] args) {
        int ValorBuscado = 3;
        int contador = 0;
        
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++)
            numeros[i] = i*3;
       

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] == ValorBuscado) {
                contador = contador + 1;

                }
        }

        System.out.println("El valor " + ValorBuscado + " aparece " + contador + " veces en el array.");
        
    }
    
}
