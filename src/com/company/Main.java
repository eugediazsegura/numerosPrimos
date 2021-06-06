/*
Ejercicio 1
Hacer una función que dado un número indica si es un número primo o no. Un número
primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir
por 1 y por 17.
Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
obtenida en el ejercicio desarrollado en la clase asincrónica.
boolean esDivisible(int n, int divisor)
*/
package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner= new Scanner(System.in);
        Integer valor1;
        System.out.println("Ingrese un número");
        valor1 = scanner.nextInt();
       boolean primo = esPrimo(valor1);
        System.out.println(primo);
       if (primo){
           System.out.println("es primo");
       }else{
           System.out.println("no es primo");
       }



        }
        public static boolean esPrimo(int valor){
            boolean divisible =  true;
            for (int i = 2; i < valor; i++ ){
                divisible = esDivisible(valor, i);
                if(divisible){
                    return false;
                }
            }

            return true;
        }

        public static boolean esDivisible( int val1, int val2){
            return (val1  % val2 == 0);
        }
}
