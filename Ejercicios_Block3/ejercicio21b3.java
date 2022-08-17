//Ejecicio 20 bloque 3
/*
Pedir 10 numeros y mostrar al final si se ha introducido alguno negativo.
*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		boolean ok = false;
		for (int i = 1; i <= 10; i++) {
		    System.out.println("Ingrese un numero");
		    numero = entrada.nextInt();
		    
		    if(numero <0) {
		        ok = true;
		    }
		}
		if (ok) {
		    System.out.println("Si existe al menos un numero negativo");
		}
		else {
		    System.out.println("NO se introdujo ningun numero negativo");
		}
	}
}
