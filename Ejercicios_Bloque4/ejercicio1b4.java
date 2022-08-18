/* Ejercicio 1 bloque 4
Leer 5 numeros , guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
		float[] arreglo = new float[5];
		
		//Carga de elementos al arreglo
		for (int i = 0; i <5; i++) {
		    System.out.println("Ingrese un numero");
		    arreglo[i] = entrada.nextFloat();
		}
		
		//Informe de los elementos del arreglo
	   for (float i: arreglo) {
		    System.out.println(i);  // i = Imprime el contenido de cada posicion del arreglo
	   }
	}
}
