/* Ejercicio 16 bloque 4
Queremos desarrollar una aplicacion que nos ayude a gestionar las notas de un centro educativo
Cada grupo o clase está compuesto por 5 alumnos. Se pide leer las notas del 1er , 2do y 3er trimestre
de un grupo. Debemos mostrar al final : 
La nota promedio del grupo en cada trimestre y el promedio del alumno que se encuentra en la 
posicion N (N se lee por teclado).

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    final int tope = 5;
    	Scanner entrada = new Scanner(System.in);
	    float primer[],segundo[],tercero[];
	    float sumaPrimerT = 0,sumaSegundoT = 0,SumaTercerT = 0, sumaAlumno = 0;
	    float promedioPrimerT, promedioSegundoT,promedioTercerT, promedioAlumno;
	    int pos;
	    
	    primer = new float[tope];
	    segundo = new float[tope];
	    tercero = new float [tope];
	    
	    System.out.println ("Ingrese las notas del 1er trimestre");
	    for (int i = 0; i < tope; i++) {
	        System.out.println("Nota nro " + i);
	        primer[i] = entrada.nextFloat();
	        sumaPrimerT += primer[i];
	    }
	    
	    System.out.println ("Ingrese las notas del 2do trimestre");
	    for (int i = 0; i < tope; i++) {
	        System.out.println("Nota nro " + i);
	        segundo[i] = entrada.nextFloat();
	        sumaSegundoT += segundo[i];
	    }
	    
	    System.out.println ("Ingrese las notas del 3er trimestre");
	    for (int i = 0; i < tope; i++) {
	        System.out.println("Nota nro " + i);
	        tercero[i] = entrada.nextFloat();
	        SumaTercerT += tercero[i];
	    }
	    
	    //Sacamos los promedios de cada uno de los trimestres
	    promedioPrimerT = sumaPrimerT /tope;
	    promedioSegundoT = sumaSegundoT/tope;
	    promedioTercerT = SumaTercerT / tope;
	    
	    
	    //Ahora pedimos la posicion del alumno N para sacar su promedio
	    do {
	        System.out.println("Ingrese la posicion del alumno para sacar el promedio");
	        pos = entrada.nextInt();
	    } while(pos <0 || pos >4);
	    
	    //Sacamos la suma de las notas del alumno
	    sumaAlumno = primer[pos] + segundo[pos] + tercero [pos];
	    promedioAlumno = sumaAlumno / 3;
	    
	    //Mostrar los datos 
	    System.out.println("Promedio 1er Trimestre = " + promedioPrimerT);
	    System.out.println("Promedio 2do Trimestre = " + promedioSegundoT);
	    System.out.println("Promedio 3er Trimestre = " + promedioTercerT);
	    System.out.println("Promedio del alumno = " + promedioAlumno);

	}
}
