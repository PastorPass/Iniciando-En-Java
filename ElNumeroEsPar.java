
/* Armar un programa que permita ingresar un numero y mostrar si es par o impar.
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main   {
    
	public static void main(String[] args) throws IOException {
	
		//Aca pedimos un numero leido desde teclado
		System.out.println("Ingrese el 1er numero");
		Integer numero1 = CargarNumero();
		
		Boolean EsPar = (numero1 % 2) == 0;         // EL % Es equivalente al MOD de pascal. El "/" <=> DIV
		if(EsPar) {
		    System.out.println("ES par");
		}
		else {
		    System.out.println("El numero no es par");
		}
	}
	
	private static Integer CargarNumero() throws IOException {
	 
	 	InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (capturarTeclado);
		
		String Strnum = buffer.readLine();
		Integer numero = Integer.parseInt(Strnum);
		return numero;
	    
	}
	    
}
