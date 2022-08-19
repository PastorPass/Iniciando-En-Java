/* Ejercicio 7 bloque 4
Leer por teclado una serie de 10 numeros enteros. La aplicacion debe indicarnos si los numeros estan ordenados de forma 
creciente, decreciente o si estan desordenados.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    final int tope = 10;
		int [] numeros = new int[tope];
		
		boolean creciente = false, decreciente = false;

		//Carga de elementos al arreglo
		
		for (int i = 0; i <tope; i++) {
		    System.out.println("Ingrese un numero");
		    numeros[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < 9; i++) {   // si le pongo i < 10, estoy chequeando una posicion invalida del arreglo
		    if(numeros[i] < numeros[i+1]) {
		        creciente = true;
		    }
		    else if(numeros[i] > numeros[i+1]){
		        decreciente = true;
		    }
		}
		
		//Comprobar los 4 casos de orden del arreglo.
		
		if (creciente == true && decreciente == false) {
		    System.out.println("El arreglo esta en forma creciente");
		}
		else if(creciente == false && decreciente == true) {
		    System.out.println("El arreglo esta en forma decreciente");
		}
		else if (creciente && decreciente){
		    System.out.println("El arreglo esta en forma desordenada");
		}
		else if(creciente == false  && decreciente == false) {
		    System.out.println("Todos los numeros del arreglo son iguales");

		}

	}
}