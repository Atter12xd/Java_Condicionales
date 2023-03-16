
package java_condicionales;

import java.util.Scanner;
public class Java_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner dato = new Scanner(System.in); // llamamos a la clase que importamos
        System.out.println("Ingrese el numero: "); // pedimos que el usario ingresa el numero
        int numero1 = dato.nextInt(); // leemos el numero
        
        if (numero1 < 10){ // si numero1 es menor que 10 imprime lo siguiente
            System.out.println("Hola Atter ");
            System.out.println("El numero que ingresastes es menor que 10. ");
        
        }
        
        else{ // de lo contrario imprime lo siguiente
                System.out.println("Hola Atter");
                System.out.println("El numero que ingresastes es mayor que 10");
            }

    }
    
}
