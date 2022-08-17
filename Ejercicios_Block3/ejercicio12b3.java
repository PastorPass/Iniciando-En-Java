//Ejecicio 12 bloque 3
//Pedir un numero y calcular su factorial.

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero ;
		long factorial = 1;
		System.out.println("Ingrese un numero a calcular su factorial");
		numero = entrada.nextInt();
		
		for (int i = 1; i <= numero; i++) {
		    factorial *= i;  // Multiplicacion iterativa
		}
		
		System.out.println("El factorial del numero " + numero + " es: " +factorial);
	}
}
