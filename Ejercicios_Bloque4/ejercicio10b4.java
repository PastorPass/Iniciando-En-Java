/* Ejercicio 9 bloque 4
Crear un programa que lea por teclado una tabla de 10 numeros enteros y desplace N posiciones en el
arreglo (N es ingresado por el usuario)

*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final int tope = 10;
		Scanner entrada = new Scanner(System.in);
		int []numeros= new int[tope]; 
		int nPosiciones,ultimo;
		
		//Carga de elementos al arreglo 
		
		for (int i = 0; i <tope; i++) {
		    System.out.println("Ingrese un numero");
		    numeros[i] = entrada.nextInt();
		}
		
		System.out.println("Ingrese la cantidad de posiciones a desplazar");
		nPosiciones = entrada.nextInt();
		
		for (int vuelta =1; vuelta <= nPosiciones; vuelta++) {
		    //Guardamos el ultimo elemento del arreglo
		    ultimo = numeros[9];
		    for (int i = 8; i >= 0; i--) {
		        //Desplazamos una posicion en el arreglo
		        numeros[i+1] = numeros[i];
		    }
		    //Ponemos el ultimo elemento como el 1ero.
		    numeros[0] = ultimo;
		}
		System.out.println("Imprimimos el nuevo arreglo");
		for (int i: numeros) {
		    System.out.println(i);
		}
	}
}
