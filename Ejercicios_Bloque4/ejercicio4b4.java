/* Ejercicio 4 bloque 4
Leer 10 numeros enteros, almacenarlos en un arreglo, debemos mostrarlo en el siguiente orden :
El primero, el ultimo, el segundo, el anteultimo, el tercero,etc.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    final int tope = 10;
	    int j = 9;
		int [] arreglo = new int[tope];
		
		//Carga de elementos al arreglo
		
		System.out.println("LA TABLA QUEDA :");
		for (int i = 0; i <10; i++) {
		    System.out.println("Ingrese un numero");
		    arreglo[i] = entrada.nextInt();
		
		}
		/*
		//Imprimir en el orden pedido
		for (int i =0 ; i <5; i++) {
		    System.out.println(arreglo[i]);
		    System.out.println(arreglo[j]);
		    j--;
		}
		*/
		
		//Sin variable j
		for (int i = 0; i < 5; i++){
		    System.out.println(arreglo[i]);
		    System.out.println(arreglo[9-i]);
		}
	}
}