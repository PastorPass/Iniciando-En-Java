/*  Ejercicio 7 bloque 3
Pedir numeros hasta que se ingresa uno negativo y calcular la media(o promedio).
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	        //Hecho sin JOptionPane.
	    
		Scanner entrada = new Scanner(System.in);
	    int numero,sumaNumeros = 0,contador = 0;
	    float promedioFinal;
	    
	    System.out.println("Ingrese un numero");
	    numero = entrada.nextInt();
	    
	    while (numero >= 0) {
	        sumaNumeros += numero;
	        contador++;
	        
	        //Se vuelve a leer un numero para no caer en loop.
	        System.out.println("Ingrese otro numero");
	        numero = entrada.nextInt();
	    }
	    if(contador == 0) {
	        System.out.println("Error!! La division entre 0 no existe");
	    }
	    else {
	        promedioFinal = (float)sumaNumeros /contador;  // se antepone el (float) para sacar realmente el promedio.
	        System.out.println("El promedio de los numeros ingresados es: " +promedioFinal);
	    }
	}
}
