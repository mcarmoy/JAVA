public class ej4 {
    public static void main(String[] args) {
        /* 4. Escribe un programa Java que realice lo siguiente: declarar dos variables x e y de tipo int, dos variables
        n y m de tipo double y asigna a cada una un valor. A continuación muestra por pantalla: */

        int x = 20;
        int y = 5;
        double n = 10.5;
        double m = 2.5;
        
        //a
        System.out.println(x);
        System.out.println(y);
        System.out.println(n);
        System.out.println(m);

        // b. La suma X + Y
        System.out.println("b. X + Y = " + (x + y));
        
        // c. La diferencia X - Y
        System.out.println("c. X - Y = " + (x - y));
        
        // d. El producto X * Y
        System.out.println("d. X * Y = " + (x * y));
        
        // e. El cociente X / Y (División entera)
        System.out.println("e. El cociente X / Y (int) = " + (x / y));
        
        // f. El resto X % Y
        System.out.println("f. El resto X % Y = " + (x % y));

        System.out.println("\n--- Operaciones con Decimales (N, M) ---");
        
        // g. La suma N + M
        System.out.println("g. N + M = " + (n + m));
        
        // h. La diferencia N - M
        System.out.println("h. N - M = " + (n - m));
        
        // i. El producto N * M
        System.out.println("i. El producto N * M = " + (n * m));
        
        // j. El cociente N / M
        System.out.println("j. El cociente N / M = " + (n / m));
        
        // k. El resto N % M
        System.out.println("k. El resto N % M = " + (n % m));

        System.out.println("\n--- Operaciones Mixtas ---");
        
        // l. La suma X + N (int + double -> resultado double)
        System.out.println("l. La suma X + N = " + (x + n));
        
        // m. El cociente Y / M (int / double -> resultado double)
        System.out.println("m. El cociente Y / M = " + (y / m));
        
        // n. El resto Y % M (int % double -> resultado double)
        System.out.println("n. El resto Y % M = " + (y % m));

        System.out.println("\n--- Otras Operaciones ---");
        
        // o. El doble de cada variable
        System.out.println("o. El doble de cada variable:");
        System.out.println("   Doble de X: " + (2 * x));
        System.out.println("   Doble de Y: " + (2 * y));
        System.out.println("   Doble de N: " + (2 * n));
        System.out.println("   Doble de M: " + (2 * m));
        
        // p. La suma de todas las variables
        System.out.println("p. Suma total (X+Y+N+M) = " + (x + y + n + m));
        
        // q. El producto de todas las variables
        System.out.println("q. Producto total (X*Y*N*M) = " + (x * y * n * m));
    }
}
