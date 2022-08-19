/* Ejercicio 12 bloque 4
Leer por teclado una tabla de 10 elementos numericos enteros y una posicion entre 0 y 9.
Eliminar el elemento situado en la posicion dada sin dejar huecos.
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final int tope = 10;
		Scanner entrada = new Scanner(System.in);
		int []arreglo = new int[tope]; 
		int pos;
		
		//Carga de elementos al arreglo 
	    for (int i = 0; i <tope; i++) {
	        System.out.println("Ingrese un numero");
		    arreglo[i] = entrada.nextInt();
	    }
		    
		// Ingrese una posicion a Eliminar del arreglo
		do {
		    System.out.println("Ingrese una posicion a Eliminar en el arreglo");
		    pos = entrada.nextInt();
		}while(pos <0 || pos >9);
		
		//Eliminando el Elemento de la Posicion indicada
		for (int i = pos; i< 9; i++ ) {   // i<9 porque sino se excede en la lectura de arreglo[i+1]
		    arreglo[i] = arreglo[i+1];
		}

		for (int i = 0; i <9; i++) {
		    System.out.println("Posicion nro ." +i+ "Elemento =" +arreglo[i]);
		}
	}
}
