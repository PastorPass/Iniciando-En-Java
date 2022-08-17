//Ejecicio 16 bloque 3
/*
Pedir un numero al usuario que debe estar entre 0 y 10 y mostrar la tabla de multiplicar de dicho numero.
*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		do {
		    System.out.println("Ingrese un numero");
		    numero = entrada.nextInt();
		}while(numero <0 || numero >10);
		
		for (int i = 1; i <= 10; i++) {
		    System.out.println(numero+ "x" +i+ " = " +numero*i);
		    }
	}
}
