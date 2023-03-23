
package par_impar_suma;

import java.util.Scanner;
public class par_impar_suma {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int numero = dato.nextInt();
        int impar = 0;
        int num = 0;
        int suma = 0;
        for ( num = 0; num <= numero ; num +=2 ){
            suma = suma + num;
            System.out.println("los numeros pares son: " + num );

             }
    System.out.println("La suma es de los numeros pares son: " +suma);
        for (num = 1; num <= numero ; num +=2){
            impar = impar + num;
            System.out.println("los numeros impares son: " + num );
        }
    System.out.println("la suma de los numeros impares son: " + impar );
        
        
    }
    
}
