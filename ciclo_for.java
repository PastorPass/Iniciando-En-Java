//USO DEL FOR.

/* Ciclo del for

for (inicializacion; condicion; aumento o decremento) {
    instrucciones;
  }

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    int contador;
	    System.out.println("Ingrese la cantidad de terminos");
	    
	    contador = entrada.nextInt();
	    	
		for (int i=1; i <= contador; i++) {
		    System.out.println(i);
		}
		
		/*   Impresion de numeros pares
		
		for (int =2; i <= contador; i+=2) {
		     System.out.println(i);
		}
		}
		*/
	}
}
