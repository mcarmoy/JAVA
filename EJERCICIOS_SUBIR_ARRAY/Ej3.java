public class Ej3 {
    public static void main(String[] args) {
        char letra = 'J';
        String[] nombres = {"Pepe", "Juan", "Jose", "Miguel", "Javi"};

        for (int i = 0; i < nombres.length; i++) {
            if (letra == nombres[i].charAt(0)) {
                System.out.println(nombres[i]);
            }
        }

    }
    
}
