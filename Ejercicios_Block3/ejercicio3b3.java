/*  Ejercicio 3 bloque 3
Leer numeros hasta que se introduzca un 0. Para c/u indicar si es par o impar.
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
	        if(numero %2 ==0) {
	            System.out.println("El numero es par");
	        }
	        else {
	            System.out.println("El numero es impar");
	        }

	        //Se debe volver a leer el numero para no caer en un bucle infinito
	        System.out.println("vuelva a ingresar otro numero");
	        numero = entrada.nextInt();
	    }
	    
	    /*                          hecho con JOptionPane.
	    int numero;
	    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
	    
	    while (numero != 0) {
	        if(numero %2 == 0) {
	             JOptionPane.showMessageDialog(null,"el numero es par);

	        }
	        else {
	        	 JOptionPane.showMessageDialog(null,"el numero es impar" );
            }
	        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	    }
	    */
	}
}
