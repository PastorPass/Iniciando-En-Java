/*
BUCLE FOR EACH
*/

import java.util.Scanner;

public class Main
{   
	public static void main(String[] args) {
	    
	    String[] nombres = {"luis","pedro","fabian","messi","maradona","cr7","di maria"};
	    
	    
	    //La forma clasica de imprimir el arreglo
		/*
		for (int i = 0; i < 4; i++) {
		    System.out.println(nombres[i]);
		}
		
		//Otra forma cuando no sepas cuantos elementos hay en el arreglo (en la 2da condicion del i)
		for (int = 0; i < nombres.length; i++) {
		    System.out.println(nombres[i]);
		}
		*/
		
		//BUCLE FOR EACH
		for (String i: nombres) {  // Se le pone el mismo tipo de dato del arreglo, seguido de un nombre para la variable iteradora luego ':' y finalmente el nombre del arreglo
		    System.out.println(i);
		}
		
	}
}
