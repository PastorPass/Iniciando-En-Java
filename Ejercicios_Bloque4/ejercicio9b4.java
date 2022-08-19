/* Ejercicio 9 bloque 4
Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una posicion 
hacia abajo : el primero pasa a ser el 2do. , el 2do pasa a ser el 3ro, y asi sucesivamente.
El ultimo pasa a ser el 1ero.

*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final int tope = 10;
		Scanner entrada = new Scanner(System.in);
		int []numeros= new int[tope]; 
		int num,pos,aux = 0;
		
		//Carga de elementos al arreglo (solo hasta la posicion <8)
		
		for (int i = 0; i <tope; i++) {
		    System.out.println("Ingrese un numero");
		    numeros[i] = entrada.nextInt();
		}
		
		//Guardamos el ultimo elemento del arreglo en una variable
		aux = numeros[9];
		
		
		//Avanzar una posicion debajo del arreglo
		for (int i = 8; i >= 0; i--) {
		    numeros[i+1] = numeros[i];
		}
		
		//Guardamos el valor del ultimo elemento del arreglo en la 1er posicion del arreglo.
		numeros[0] = aux;
		
		System.out.println("Imprimimos el nuevo arreglo");
		for (int i: numeros) {
		    System.out.println(i);
		}
	}
}
