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
		InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (capturarTeclado);
		
		System.out.println("Ingrese el 1er numero");
		String Strnum1 = buffer.readLine();
		Integer numero1 = Integer.parseInt(Strnum1);
		
		System.out.println("Ingrese el 2do numero");
		String Strnum2 = buffer.readLine();
		Integer numero2 = Integer.parseInt(Strnum2);
		
		System.out.println("Ingrese el 3er numero");
		String Strnum3 = buffer.readLine();
		Integer numero3 = Integer.parseInt(Strnum3);

        Integer numMax = numero1;
        
        if(numero2 > numMax) {
            numMax = numero2;
        }
        if (numero3 > numMax) {
            numMax = numero3;
        }
        
        System.out.println("El numero mayor es " + numMax);
        
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
