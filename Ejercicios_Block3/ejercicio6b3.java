/*  Ejercicio 6 bloque 3
Pedir numeros hasta que se ingrese el 0, mostrar la suma de todos los numeros introducidos.
*/


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	        //Hecho sin JOptionPane.
	    
		Scanner entrada = new Scanner(System.in);
	    int numero,sumaNumeros;
	    sumaNumeros = 0;
	    
	    //Hacerlo con un while es lo mismo , solo que yo tome que si se ingresa 0 en un inicio, la suma seguiria valiendo 0.
	    do {
	        System.out.println("Ingrese un numero");
	        numero = entrada.nextInt();
	        sumaNumeros += numero;  //suma iterativa
	    } while(numero != 0);
	    System.out.println("La suma de todos los numeros ingresados es = " + sumaNumeros);
	}
}
