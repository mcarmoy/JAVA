public class ConFor {
    public static void main(String[] args) {
        int[] notas = new int[5];

        for(int i = 0; i < notas.length; i++) {
            notas[i] = i*2;
     }

        for(int i = 0; i < notas.length; i++) {
            System.out.printf("%d\n", notas[i]);
        }
        
    }
    
}
