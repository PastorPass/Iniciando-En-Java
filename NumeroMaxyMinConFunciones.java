/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Armar un programa que permita cargar 3 numeros y mostrar cual es el mayor y cual es el menor


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
		
        CalcularNumeroMayor(numero1,numero2,numero3);
        CalcularNumeroMenor(numero1,numero2,numero3);
	}
	
	private static Integer CargarNumero() throws IOException {
	 
	 	InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (capturarTeclado);
		
		String Strnum = buffer.readLine();
		Integer numero = Integer.parseInt(Strnum);
		return numero;
	    
	}
	private static void CalcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
	    
	     Integer numMax = numero1;
        
        if(numero2 > numMax) {
            numMax = numero2;
        }
        if (numero3 > numMax) {
            numMax = numero3;
        }
        
        System.out.println("El numero mayor es " + numMax);
	    
	}
	
	private static void CalcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {
	    
        Integer numMin = numero1;
        
        if(numero2 < numMin) {
            numMin = numero2;
        }
        if (numero3 < numMin) {
            numMin = numero3;
        }
        
        System.out.println("El numero menor es " + numMin);
	}
	    
}
