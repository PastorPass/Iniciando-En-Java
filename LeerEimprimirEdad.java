/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main   {

	public static void main(String[] args) throws IOException {
		InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (capturarTeclado);
		
		System.out.println("Ingrese su edad");
		String StrEdad = buffer.readLine();
		Integer edad = Integer.parseInt(StrEdad);
		
		if(edad >= 18) {
		    System.out.println("Es mayor de edad");
		}
		else
		  {
		      System.out.println("NO ES LEGAL");
		  }
	}
}
