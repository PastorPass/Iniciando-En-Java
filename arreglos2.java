/*
Llenado de datos al arreglo
*/

import java.util.Scanner;

public class Main
{   
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int nElementos;
	    
	    //tamaño N leido de teclado para el arreglo
	    System.out.println("Ingrese la cantidad de elementos para el tamaño del arreglo");
	    nElementos = entrada.nextInt();
	    
	    //Defino el tipo de dato para el arreglo y su dimension
	    char[] letras = new char[nElementos];
	    
	    //Como se debe llenar el arreglo con datos ingresados x teclado
		for (int i = 0; i <nElementos ; i++) {
		    System.out.println("Ingrese un caracter :");
		    letras[i] = entrada.next().charAt(0);
		}
		
		//Como se debe imprimir el arreglo
		System.out.println("Los valores del arreglo son: ");
		for (int i = 0; i < nElementos; i++) {
		    System.out.println(letras[i]);
		}
	}
}
