
package ingreso_de_dos_numeros;

import java.util.Scanner; // Utilizamos la libreria Scanner 

public class Ingreso_de_dos_numeros {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in); // llamamos a la clase para poder que el usario ponga sus datos
        System.out.println("Digame su nombre: "); // Pedimos el nombre al Usario
        String nombre = ingreso.nextLine(); // Recogemos los datos
        // Pedimos los numeros y guardamos los datos
        System.out.println("Hola " + nombre + " Ingrese su primer numero: ");
        int numero1 = ingreso.nextInt();
        System.out.println("Hola " + nombre + " Ingrese su segundo numero: ");
        int numero2 = ingreso.nextInt();
        if (numero1 != numero2) { // si el primer numero es diferente al segundo numero imprime lo siguiente
            System.out.println(numero1 + " es diferente a " + numero2);
        }
        if (numero1 < numero2) { // si el primer numero es menor al segundo numero imprimer lo siguiente
            System.out.println(numero1 + " es menor a " + numero2);
        }
        if (numero1 <= numero2) { // si el primer numero es menor o igual al siguiente numero imprime lo siguiente
            System.out.println(numero1 + " es menor o igual a " + numero2);
        }
        if (numero1 > numero2) { // si el primer numero es mayor al segundo numero imprimero lo siguiente
            System.out.println(numero1 + " es mayor a " + numero2);
        }

    }

}
