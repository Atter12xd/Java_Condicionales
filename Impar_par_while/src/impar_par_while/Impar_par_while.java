package impar_par_while;

import java.util.Scanner;
public class Impar_par_while {


    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int number1 = dato.nextInt();
        int par = 0;
        int suma = 0;
        while(par <= number1 ){
            if(par % 2 == 0){
                System.out.println("Numeros pares: " + par);
                suma = suma + par;
                }
            par++;
              }
System.out.println("La suma de los numeros pares es: " + suma);
        
            

        }

        }

        
        
        
    
    

