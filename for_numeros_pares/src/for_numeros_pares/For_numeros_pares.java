
package for_numeros_pares;

import java.util.Scanner;
public class For_numeros_pares {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digame su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su numero");
        int IngresoNumero = entrada.nextInt();
        int suma = 0;
        for (int numero = 1; numero <= IngresoNumero ; numero +=2 ){
            suma = suma + numero;
        }

    System.out.println("hola " + nombre + " la suma de los numeros pares es: " + suma);


        
    }
    
}
