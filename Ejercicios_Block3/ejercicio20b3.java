//Ejecicio 20 bloque 3
/*
Pedir un numero N , introducir N sueldos y mostrar el sueldo maximo.
*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tope;
		float sueldo, sueldoMaximo = -1;
		
		System.out.println("Ingrese un numero N");
		tope = entrada.nextInt();
		
		for (int i = 1; i <= tope; i++) {
		    System.out.println("Ingrese el sueldo nro " +i);
		    sueldo = entrada.nextFloat();
		    
		    if(sueldo > sueldoMaximo) {
		        sueldoMaximo = sueldo;
		    }
		}
		System.out.println("El sueldo maximo fue de : " + sueldoMaximo);
	}
}
