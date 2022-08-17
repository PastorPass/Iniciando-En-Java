//Ejecicio 15 bloque 3
/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos 
mayores a 18 años y la cantidad de alumnos que miden mas de 1.75
*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tope = 5;
		
		int edad, cantMayores = 0, cantAlumAltos = 0;
		float altura, sumaEstatura = 0, sumaEdad = 0;
		for (int i = 1; i <= tope; i++) {
		    System.out.println("Ingrese una edad :");
		    edad = entrada.nextInt();
		    sumaEdad +=  edad;
		  
		    System.out.println("Ingrese una altura:");
		    altura = entrada.nextFloat();
		    sumaEstatura += altura;
		    
		    if(edad > 18) {
		        cantMayores++;
		    }
		    if(altura > 1.75) {
		        cantAlumAltos++;
		    }
		}
		System.out.println("La edad promedio es  : " + sumaEdad/tope);
		System.out.println("La altura promedio es : " + sumaEstatura/tope);

		System.out.println("La cantidad de alumnos mayores a 18 años = " + cantMayores);
		System.out.println("La cantidad de alumnos mayores a 1.75 cm  = " + cantAlumAltos);

	}
}
