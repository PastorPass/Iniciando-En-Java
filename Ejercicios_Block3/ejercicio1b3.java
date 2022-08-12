/*  Ejercicio 1 bloque 3
Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se ingrese un numero negativo.
*/


import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args) {
	        //Hecho sin JOptionPane.
	    
		Scanner entrada = new Scanner(System.in);
	    int numero;
	    
	    System.out.println("Ingrese un numero");
	    numero = entrada.nextInt();
	    
	    while(numero >= 0) {
	        numero *= numero;
	        System.out.println("El cuadrado del numero es : " +numero);
	        
	        //Se debe volver a leer el numero para no caer en un bucle infinito
	        System.out.println("vuelva a ingresar un numero");
	        numero = entrada.nextInt();
	    }
	    
	    /*                          hecho con JOptionPane.
	    int numero,cuadrado;
	    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
	    
	    while (numero >= 0) {
	        cuadrado = (int)Math.pow(numero,2);
	        JOptionPane.showMessageDialog(null,"el numero" +numero+"elevado al cuadrado es : " +cuadrado);
	        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	    }
	    */
	}
}
