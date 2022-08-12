/*  Ejercicio 11 bloque 3
Diseñar un programa que muestre el producto de los 10 primeros numeros impares.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

        long ProductoPrimos = 1;
	    for(int i =1; i<= 20; i+=2) {
	        ProductoPrimos *= i;
	    }
	    System.out.println("El producto de los 10 primeros numeros impares es : " +ProductoPrimos);
	}
}

// Los 10 primeros numeros primos seriam : 1,3,5,7,9,11,13,15,17,19.    Todos estos deben ser multiplicados.
