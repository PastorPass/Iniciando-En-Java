/*
Declaracion y sintaxis del tipo de dato arreglo
*/

import java.util.Scanner;

public class Main
{   
	public static void main(String[] args) {
	    // Una forma de llenar un arreglo
		int[] numeros = new int[3];
		
		numeros[0] = 7;
		numeros[1] = 10;
		numeros[2] = 13;
		
		
		//Otra forma de llenar el arreglo
	//	int [] numeros = {4,7,8,11};
	
		for (int i = 0; i <3 ; i++) {
		    System.out.println(numeros[i]);
		}
	}
}
