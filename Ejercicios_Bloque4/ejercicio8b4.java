/* Ejercicio 8 bloque 4
Diseñar una aplicacion que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 numeros, 
despues se debe pedir un numero y una posicion, insertarlo en la posicion indicada, desplazando los que
estan detras.

*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final int tope = 10;
		Scanner entrada = new Scanner(System.in);
		int []numeros= new int[tope]; 
		int num,pos;
		
		//Carga de elementos al arreglo (solo hasta la posicion <8)
		
		for (int i = 0; i <8; i++) {
		    System.out.println("Ingrese un numero");
		    numeros[i] = entrada.nextInt();
		}
		
		//Solicitud de numero y posicion
		System.out.println("Ingrese un numero a insertar en el arreglo");
		num = entrada.nextInt();
		System.out.println("Ingrese una posicion para guardar el numero");
		pos = entrada.nextInt();
		
		//Mover una posicion los elementos detras de la posicion que el usuario quiere.
		
		for (int i = 7; i >= pos; i--) {
		    numeros[i+1] = numeros [i];
		}
		
		//Insertamos el numero en la posicion requerida del arreglo
		
		numeros[pos] = num;
		System.out.println("El nuevo arreglo queda : ");
		for (int i = 0; i <9; i++){
		   System.out.println("Posicion ." +i + " Elemento = " +numeros[i]);
		}
		
	}
}
