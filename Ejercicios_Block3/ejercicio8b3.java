/*  Ejercicio 8 bloque 3
Pedir un numero N, y mostrar todos los numeros del 1 al N.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	        //Hecho sin JOptionPane.
	    
		Scanner entrada = new Scanner(System.in);
	    int numero;
	    
	    System.out.println("Ingrese un numero");
	    numero = entrada.nextInt();
	    
	    for(int i =1; i<= numero; i++) {
	        System.out.println(i);
	    }
	    
	    /*
	    //con while
	    int numero,i;
	    System.out.println("Ingrese un numero");
	    
	    i =1;
	    while(i <= numero) {
	        System.out.println(i);
	        i++;
	    }
	    */
	}
}
