//USO DEL DO WHILE.

/*

do {
    Instrucciones;
}while (condicion);

*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 1,contador;  // se debe inicializar la variable iteradora i.
		
		System.out.println("Ingrese cuantos numeros quiere en pantalla");
		contador = entrada.nextInt();
		
		do {                            // el ciclo do while es equivalente al repeat until de pascal.
		   System.out.println(i);
           i++;  
		}while(i <= contador);
	}
}
  // i--;     decremento.
 // i+= 2;    de dos en dos.