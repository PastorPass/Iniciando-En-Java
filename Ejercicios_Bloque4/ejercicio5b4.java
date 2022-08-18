/* Ejercicio 5 bloque 4
Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma : el 1ro del A
El 1ro del B, el 2do del A, el 2do del B.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    /*
	    int a[], b[], c[];
	    
	    a = new int [10];
	    b = new int[10];
	    c = new int[20];
	    */
	    final int tope = 10;
		int [] arregloA = new int[tope];
		int [] arregloB = new int [tope];
		int [] arregloC = new int [20];
		//Carga de elementos al arreglo
		
		for (int i = 0; i <tope; i++) {
		    System.out.println("Ingrese un numero");
		    arregloA[i] = entrada.nextInt();
		}
		
		System.out.println("INGRESE LOS ELEMENTOS PARA EL 2DO ARREGLO");
        for (int i = 0; i <tope; i++) {
		    System.out.println("Ingrese un numero");
		    arregloB[i] = entrada.nextInt();
		}		
		//Llenado de elementos al 3er Arreglo
		// vamos a utilizar el iterdor i para el arreglo A y B
		//y el iterador j para el arreglo C
		int j = 0;
		for (int i = 0; i <10; i++) {
		    arregloC[j] = arregloA[i];
		    j++;
            arregloC[j] = arregloB[i];
            j++;
		}
		System.out.println("El tercer arreglo queda :");
		for (int i : arregloC){
		    System.out.println(i);
		}
	}
}