
package bucle.pkgfor;

import java.util.Scanner;
public class BucleFor {

   
     
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
         System.out.println("Ingrese un número: ");
         
         int numero_ingresado = entrada.nextInt();
    
         int suma = 0;
         for (int numero = 1; numero <= numero_ingresado ; numero ++ ){
            System.out.println(numero);
            suma = suma + numero;
                    }
         System.out.println("La suma es: "+ suma);


        }


      

                
        



        
    }
    

