
package ejercicios_sencillos_parte2;

import java.util.Scanner;

import javax.imageio.stream.ImageOutputStream;

public class Ejercicios_Sencillos_parte2 {

    public static void main(String[] args) {
        // int numero = 1000; // ponemos un maximo de alcanze que esta vez sera "1000"
        // int impar = 0; // creamos una variable entero con valor cero
        // for (impar = 1; impar <= numero; impar += 2) { // la variable "impar" le
        // pones que empieze de uno y que avanze
        // en 2 en 2
        // System.out.println("Los numeros impares son: " + impar); // Imprimimos

        // }

        // Empezamos el nuevo codigo abajo
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese su primer numero donde va correr: ");
        int num1 = ingreso.nextInt();
        System.out.println("Ingrese su segundo numero donde va a ser el rango: ");
        int num2 = ingreso.nextInt();

        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                ;

                num1 = num1 + 1;

            } else if (num1 % 2 != 0) {
                System.out.println("Numero impar: " + num1);
                num1 = num1 + 2;

            }
        }
    }
}
