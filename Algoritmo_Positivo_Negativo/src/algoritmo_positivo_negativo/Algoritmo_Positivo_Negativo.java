
package algoritmo_positivo_negativo;
import java.util.Scanner;

public class Algoritmo_Positivo_Negativo {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in); // llamamos a Scanner
        String nombre = ""; // Creamos un String 
        System.out.println("Ingrese su nombre: "); // pedimos al usario que ingrese su nombre
        nombre = dato.nextLine(); // Leemos la cadena String
        System.out.println("Hola! " + nombre); // Saludamos y llamamos a la variable nombre

        
    }
    
}
