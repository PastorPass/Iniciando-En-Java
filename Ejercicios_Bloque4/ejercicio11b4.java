/* Ejercicio 11 bloque 4
Leer 5 elementos numericos que se introduciran ordenados de forma creciente. Estos los guardaremos en una
tabla de tamaño 10.
Leer un numero N e insertarlo en el lugar adecuado para que la tabla continue ordenada.

NOTA : agregar un elemento en un vector y que mantenga un orden creciente
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    final int tope = 10;
		Scanner entrada = new Scanner(System.in);
		int []arreglo = new int[tope]; 
		int numero,sitioNum = 0,j= 0;
		boolean creciente = true;
		//Carga de elementos al arreglo 
		
		do {
		    for (int i = 0; i <5; i++) {
		        System.out.println("Ingrese un numero");
		        arreglo[i] = entrada.nextInt();
		    }
		    
		    //Comprobar si el arreglo esta ordenada de forma creciente
		    for (int i = 0; i<4; i++) {
		        if (arreglo[i] < arreglo[i+1]) {
		            creciente = true;
		        } 
		        if(arreglo[i] > arreglo[i+1]) {
		            creciente = false;
		            break;  // El break hace que salga del bucle for
		        }
		    }
		    
		    if(creciente == false) {
		        System.out.println("El arreglo no esta ordenado de forma creciente, vuelva a digitar");
		    }
		}while(creciente == false);
		
		
		// Ingrese un numero para insertar
		System.out.println("Ingrese un numero a insertar en el arreglo");
		numero = entrada.nextInt();
		
		//Esto es para darnos cuenta en que posicion va el numero ingresado
		while (arreglo[j] < numero && j <5) {
		    sitioNum++;
		    j++;
		}
		
		//Por ultimo trasladamos una posicion en el arreglo a los elementos que van detras de numero
		
		for (int i = 4 ; i>= sitioNum; i--) {
		    arreglo[i+1] = arreglo[i];
		}
		
		//Insertamos el numero que el usuario ingreso
		arreglo[sitioNum] = numero;
		
		/*  Si queremos imprimir el arreglo con sus 10 posiciones de dimension fisica
		System.out.println("Imprimimos el nuevo arreglo");
		for (int i: arreglo) {
		    System.out.println(i);
		}
		*/
		for (int i = 0; i <6; i++) {
		    System.out.println("Posicion nro ." +i+ "Elemento =" +arreglo[i]);
		}
	}
}
