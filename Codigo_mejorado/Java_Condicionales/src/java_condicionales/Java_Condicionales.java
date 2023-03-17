
package java_condicionales;

import java.util.Scanner;
public class Java_Condicionales {

    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String nombre = "";
        System.out.println("Hola! dame su nombre: ");
        nombre = dato.nextLine();
        System.out.println("Hola! " + nombre);
        System.out.println("dame tu numero: ");
        int numero1 = dato.nextInt();
        if (numero1 < 10){
            System.out.println("Hola! "+ nombre + " " +  "tu numero es menor que 10");
            
        }
        else if (numero1 == 10){
            System.out.println("Hola " + nombre + " " + "tu numero es igual que 10");
        }
        else {
            System.out.println("Hola " + nombre + " " + "tu numero es mayor que 10");
        }
}

    }
    

