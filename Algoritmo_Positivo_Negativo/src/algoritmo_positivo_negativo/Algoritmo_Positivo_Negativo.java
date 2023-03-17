
package algoritmo_positivo_negativo;
import java.util.Scanner;

public class Algoritmo_Positivo_Negativo {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in); // llamamos a Scanner
        String nombre = ""; // Creamos un String 
        System.out.println("Ingrese su nombre: "); // pedimos al usario que ingrese su nombre
        nombre = dato.nextLine(); // Leemos la cadena String
        System.out.println("Hola! " + nombre); // Saludamos y llamamos a la variable nombre
        System.out.println("Ponga su numero: "); // Pedimos al usario que ingrese su numero
        int num = dato.nextInt(); // leemos entero usando nextInt
        if (num > 0){ // SI num es mayor que 0 imprimira lo siguiente
            System.out.println("Hola : " + nombre + " " +  "Su numero " + num +  " es positivo! ");
        }
        else if (num == 0){ //Si num es igual que 0 imprimira lo siguiente
            System.out.println("Hola : " + nombre + " " +  "Su numero 0 no es negativo y tampoco es positivo ");
        } 
        else{ // De lo contrario a todas las opciones imprima lo siguiente
            System.out.println("Hola : " + nombre + " " +  "Su numero " + num + " es negativo! ");
        }

        
    }
    
}
