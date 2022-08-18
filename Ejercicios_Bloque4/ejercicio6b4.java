/* Ejercicio 6 bloque 4
Leer los datos correspondientes a dos tablas de 12 elementos numericos, y mezclarlos en una tercera de
la forma  : 3 de la tabla A, 3 de la B, otros 3 de la A, otros 3 de la B,etc.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    final int tope = 12;
		int [] arregloA = new int[tope];
		int [] arregloB = new int [tope];
		int [] arregloC = new int [24];
		
		int i,j;
		//Carga de elementos al arreglo
		
		for (i = 0; i <tope; i++) {
		    System.out.println("Ingrese un numero");
		    arregloA[i] = entrada.nextInt();
		}
		
		System.out.println("INGRESE LOS ELEMENTOS PARA EL 2DO ARREGLO");
        for (i = 0; i <tope; i++) {
		    System.out.println("Ingrese un numero");
		    arregloB[i] = entrada.nextInt();
		}		
		//Llenado de elementos al 3er Arreglo
		// vamos a utilizar el iterdor i para el arreglo A[] y B[]
		//y el iterador j para el arreglo C
		
		i = 0;
		j = 0;
		
		while (i <12) {
		    //Copiar los 3 elementos de A
		    for (int k = 0; k <3; k++) {
		        arregloC[j] = arregloA[i+k];
		        j++;
		    }
		    
		    //copiamos los 3 elementos de B[]
		    for (int k = 0; k <3; k++) {
		        arregloC[j] = arregloB[i+k];
		        j++;
		    }
		    i += 3;
		}
		System.out.println("El arreglo resultante es :");
		for (int m: arregloC) {
		    System.out.println(m);
		}
	}
}