//Ejecicio 19 bloque 3
/*
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados y suspensos

*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cantAlumAprobados = 0,cantAlumCondicionados = 0,cantAlumSuspensos = 0;
		float nota;
		for (int i = 1; i <= 6; i++) {
		    do {
		       System.out.println("Ingrese una nota");
		       nota = entrada.nextFloat();
		    }while (nota <0 || nota >10);
		    
		    if(nota >4) {
		        cantAlumAprobados++;
		    }
		    else if(nota == 4) {
		        cantAlumCondicionados++;
		    }
		    else {
		        cantAlumSuspensos++;
		    }
		}
		System.out.println("Cantidad de alumnos aprobados =" + cantAlumAprobados);
		System.out.println("Cantidad de alumnos suspensos =" + cantAlumSuspensos);
		System.out.println("Cantidad de alumnos condicionados =" + cantAlumCondicionados);
	}
}
