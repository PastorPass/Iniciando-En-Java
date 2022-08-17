//Ejecicio 13 bloque 3
//Pedir 10 numeros , mostrar la media (o el promedio ) de los numeros positivos, la media de los 
//numeros negativos y la cantidad de ceros.

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, sumaPos = 0, contadorNumSuma = 0, contadorNumResta = 0,sumaNeg = 0, contadorCeros = 0;
		float promedioPositivos,promedioNegativos;
		for (int i = 1; i <= 10; i++) {
		    System.out.println("Ingrese un numero ");
		    numero = entrada.nextInt();
		    if(numero >0) {
		        sumaPos += numero;
		        contadorNumSuma++;
		    }
		    else if(numero <0) {
		        sumaNeg += numero;
		        contadorNumResta ++;
		    }
		    else {
		        contadorCeros ++;
		    }
		}
		if (contadorNumSuma != 0) {  // verificar que no se divida por 0.
		    promedioPositivos = (float)sumaPos /contadorNumSuma; //Se le agrega float para la conversion
	    	System.out.println("El promedio de los numeros positivos = " + promedioPositivos);
		}
		if (contadorNumResta != 0) {
		    promedioNegativos = (float)sumaNeg /contadorNumResta;
		    System.out.println("El promedio de los numeros negativos = " + promedioNegativos);
		}
		System.out.println("La cantidad de numeros ceros ingresados = " + contadorCeros);
	}
}
