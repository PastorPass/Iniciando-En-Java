/* Ejercicio 13 bloque 4
Leer 10 enteros en una tabla . Guardar en otra tabla los elementos pares de la 1era, y a continuacion 
los elementos impares.

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		final int tope = 10;
		Scanner entrada = new Scanner(System.in);
		int []arreglo = new int[tope]; 
		int contarPares = 0,contarImpares = 0;
		
		//Carga de elementos al arreglo 
	    for (int i = 0; i <tope; i++) {
	        System.out.println("Ingrese un numero");
		    arreglo[i] = entrada.nextInt();
		    if(arreglo[i] %2 == 0) {
		        contarPares++;
		    }
		    else {
		        contarImpares++;
		    }
	    }
	    int arregloPares[] = new int[contarPares];//Creamos el arreglo para almacenar los numeros pares
	    int arregloImpares[] = new int[contarImpares];//Creamos el arreglo para almacenar los numeros impares
	    
	    //Reutilizo las variables como iteradoras dentro del bucle
	    contarPares = 0;
	    contarImpares = 0;
	    
	    //Almacenos los numeros pares e impares en sus arreglos correspondientes.
	    for (int i = 0; i <10; i++) {
	        if(arreglo[i] %2 == 0) {
	            arregloPares[contarPares] = arreglo[i];
	            contarPares++;
	        }
	        else {
	          arregloImpares[contarImpares] = arreglo[i];
	          contarImpares++;
	        }
	    }
	    
	    //Imprimir resultados
	    for (int i = 0; i < contarPares; i++) {
	        System.out.println("Posicion NRO. " +i+ "Elemento = " + arregloPares[i]);
	    }
	    System.out.println("-----------------------------------");
	    for (int i = 0; i < contarImpares; i++) {
	        System.out.println("Posicion NRO. " +i+ "Elemento = " + arregloImpares[i]);
	    }
	}
}
