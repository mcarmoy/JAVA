public class Ej2 {
    public static void main(String[] args) {
        // 1. Array de Cadenas (String[])
        String[] cadenas = {"Pepe", "Dani", "Javier", "Ana"};
        
       
        String cadenaMasLarga = cadenas[0]; // Inicialmente: "Pepe"
        
        // 3. Recorrer el array, empezando desde el SEGUNDO elemento (índice 1),
        // ya que el primero ya lo usamos para inicializar.
        for (int i = 1; i < cadenas.length; i++) {
            
            String cadenaActual = cadenas[i];
            
            // 4. Comparar la longitud (length()) de la cadena actual con la de la cadena más larga guardada.
            if (cadenaActual.length() > cadenaMasLarga.length()) {
                
                // 5. Si es más larga, la guardamos como la nueva cadena más larga.
                cadenaMasLarga = cadenaActual;
            }
        }
        
        System.out.println("La cadena más larga es: \"" + cadenaMasLarga + "\"");
        System.out.println("Longitud: " + cadenaMasLarga.length() + " caracteres.");
    }
}
    
    
    

