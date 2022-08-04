
/* Armar un programa que permita cargar 3 numeros y mostrar cual es el numero promedio,
Por ejemplo : si cargo 2, 6 y 9 el promedio es 5.66
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main   {
    
	public static void main(String[] args) throws IOException {
	
		//Aca pedimos un numero leido desde teclado
		System.out.println("Ingrese el 1er numero");
		Integer numero1 = CargarNumero();
		
		System.out.println("Ingrese el 2do numero");
		Integer numero2 = CargarNumero();
		
		System.out.println("Ingrese el 3er numero");
		Integer numero3 = CargarNumero();
		
		
		Integer suma = numero1 + numero2 + numero3;
		Double promedio = Double.valueOf(suma) / 3;
		System.out.println(promedio);
	}
	
	private static Integer CargarNumero() throws IOException {
	 
	 	InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (capturarTeclado);
		
		String Strnum = buffer.readLine();
		Integer numero = Integer.parseInt(Strnum);
		return numero;
	    
	}
	    
}
