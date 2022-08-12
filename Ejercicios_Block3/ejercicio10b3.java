/*  Ejercicio 10 bloque 3
Pedir 10 numeros y escribir la suma total
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero,suma = 0;
	    for(int i =1; i< 11; i++) {
	        System.out.println("Ingrese un numero");
	        numero = entrada.nextInt(); 
	        suma += numero;
	    }
	    System.out.println("La suma de los 10 numeros ingresados es : " +suma);
	}
}
