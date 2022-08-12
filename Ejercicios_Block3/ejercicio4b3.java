/*  Ejercicio 4 bloque 3
Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido
*/


import java.util.Scanner;
//import javax.swing.JOptionPane;  // para activar el JOptionPane.

public class Main
{
	public static void main(String[] args) {
	        //Hecho sin JOptionPane.
	    
		Scanner entrada = new Scanner(System.in);
	    int numero,contador = 0;
	    
	    System.out.println("Ingrese un numero");
	    numero = entrada.nextInt();
	    
	    while(numero >= 0) {
	        //se incrementa el contador de numeros introducidos
	        contador++;
	        
	        //Se debe volver a leer el numero para no caer en un bucle infinito
	        System.out.println("vuelva a ingresar otro numero");
	        numero = entrada.nextInt();
	    }
	    System.out.println("Se han introducido " +contador+ " Numeros No negativos");
	    
	    
	    /*                          hecho con JOptionPane.
	    int numero,contador = 0;
	    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
	    
	    while (numero >= 0) {
	        contador++;
	        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	    }
	    
	    JOptionPane.showMessageDialog(null,"Se han introducido " + contador+ "numeros");
	    */
	}
}
