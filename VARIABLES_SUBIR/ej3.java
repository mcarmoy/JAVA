public class ej3 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = 4.0;
        double e = 5.0;
        double f = 6.0;
        double g = 7.0;
        double h = 8.0;
        double j = 9.0;
        double m = 10.0;
        double n = 11.0;
        double p = 12.0;
        double q = 13.0;
        double r = 14.0;
        double s = 15.0;
        double x = 16.0;
        double y = 17.0;

       // a) 3/2 + 4/3
        double res_a = (3.0 / 2.0) + (4.0 / 3.0);
        System.out.println("a) 3/2 + 4/3 = " + res_a); 
        
        // b) 1/(x-5) - 3xy/4
        double res_b = (1.0 / (x - 5.0)) - (3.0 * x * y / 4.0);
        System.out.println("b) 1/(x-5) - 3xy/4 = " + res_b);
        
        // c) 1/2 + 7
        double res_c = (1.0 / 2.0) + 7.0;
        System.out.println("c) 1/2 + 7 = " + res_c);
        
        // d) 7 + 1/2
        double res_d = 7.0 + (1.0 / 2.0);
        System.out.println("d) 7 + 1/2 = " + res_d);
        
        // e) a^2/(b-c) - (d-e)/(f-g*h) / j
        double res_e = (Math.pow(a, 2) / (b - c)) - ((d - e) / (f - g * h) / j);
        System.out.println("e) a^2/(b-c) - (d-e)/(f-g*h)/j = " + res_e);
        
        // f) m/n + p
        double res_f = (m / n) + p;
        System.out.println("f) m/n + p = " + res_f);
        
        // g) m + n/(p-q)
        double res_g = m + (n / (p - q));
        System.out.println("g) m + n/(p-q) = " + res_g);
        
        // h) a^2/b^2 + c^2/d^2
        double res_h = (Math.pow(a, 2) / Math.pow(b, 2)) + (Math.pow(c, 2) / Math.pow(d, 2));
        System.out.println("h) a^2/b^2 + c^2/d^2 = " + res_h);
        
        // i) (m + n/p) / (q - r/s)
        double res_i = (m + (n / p)) / (q - (r / s));
        System.out.println("i) (m + n/p) / (q - r/s) = " + res_i);
        
        // j) (3a + b)/(d + 5e) - g/(f + 2h)
        double res_j = (((3.0 * a) + b) / (d + (5.0 * e))) - (g / (f + (2.0 * h)));
        System.out.println("j) (3a + b)/(d + 5e) - g/(f + 2h) = " + res_j);
        
        // k) (a^2 + 2ab + b^2) / (1/x^2 + 2)
        double res_k = (Math.pow(a, 2) + (2.0 * a * b) + Math.pow(b, 2)) / ((1.0 / Math.pow(x, 2)) + 2.0);
        System.out.println("k) (a^2 + 2ab + b^2) / (1/x^2 + 2) = " + res_k);
        
    }
    
}
