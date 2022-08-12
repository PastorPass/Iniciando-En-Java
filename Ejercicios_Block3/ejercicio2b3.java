/*  Ejercicio 2 bloque 3
Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0.
*/


import java.util.Scanner;
//import javax.swing.JOptionPane;  // para activar el JOptionPane.

public class Main
{
	public static void main(String[] args) {
	        //Hecho sin JOptionPane.
	    
		Scanner entrada = new Scanner(System.in);
	    int numero;
	    
	    System.out.println("Ingrese un numero");
	    numero = entrada.nextInt();
	    
	    while(numero != 0) {
	        if(numero >0) {
	            System.out.println("El numero es positivo");
	        }
	        else {
	            System.out.println("El numero es negativo");
	        }

	        //Se debe volver a leer el numero para no caer en un bucle infinito
	        System.out.println("vuelva a ingresar un numero");
	        numero = entrada.nextInt();
	    }
	    
	    /*                          hecho con JOptionPane.
	    int numero;
	    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
	    
	    while (numero != 0) {
	        if(numero > 0) {
	             JOptionPane.showMessageDialog(null,"el numero es positivo);

	        }
	        else
	        	 JOptionPane.showMessageDialog(null,"el numero es negativo" );

	        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	    }
	    */
	}
}
