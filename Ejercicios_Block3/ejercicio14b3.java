//Ejecicio 14 bloque 3
//Pedir 10 sueldos , mostrar su suma y cuantos hay mayores a $1000

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int sueldo;  // suponiendo que los sueldos son numeros enteros.
        long sumaSueldo = 0, contMayoresMil = 0;
		for (int i = 1; i <= 10; i++) {
		    System.out.println("Ingrese un sueldo :");
		    sueldo = entrada.nextInt();
		    sumaSueldo += sueldo;
		    if(sueldo > 1000) {
		        contMayoresMil++;
		    }
		}    
		System.out.println("La suma de todos los sueldos es : " + sumaSueldo);
		System.out.println("La cantidad de sueldos mayores a mil es  : " + contMayoresMil);

	}
}
