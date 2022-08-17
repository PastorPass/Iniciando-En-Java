//Ejecicio 22 bloque 3
/*
Pedir 5 calificaciones de alumnos y decir al final si hay algun reprobado.
*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		boolean ok = false;
		for (int i = 1; i <= 5; i++) {
		    do {
		        System.out.println("Ingrese una nota");
		        nota = entrada.nextInt();
		    }while (nota <0 || nota > 10);
		    
		    if(nota <5) {
		        ok = true;
		    }
		}
		if (ok) {
		    System.out.println("Si existe al menos un reprobado");
		}
		else {
		    System.out.println("NO hay ningun reprobado");
		}
	}
}
