/*  Ejercicio 5 bloque 3
Realizar un juego para adivinar un numero,para ello, generar un numero aleatorio entre 0-100 y luego ir pidiendo numeros
indicando  "es mayor" o "es menor" segun sea mayor con respecto a N. El proceso termina cuando el usuario acierta y mostrar
el numero de intentos.
*/


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	        //Hecho sin JOptionPane.
	    
		Scanner entrada = new Scanner(System.in);
	    int numero,numAleatorio,cantIntentos = 0;
	    
	    numAleatorio = (int)(Math.random()*100);  //Genera un numero aleatorio entre 0 y 100, se multiplica *100 ya que este metodo es solo para numeros de tipo double.
	    
	    //Utilizo el ciclo do while ya que al menos se itera una vez para ver si coincide el numAleatorio con el numero leido.
	    do {
	        //Se lee una sola vez y al principio , no olvide que funciona como "repeat until"
	        System.out.println("Ingrese un numero");
	        numero = entrada.nextInt();
	        
	        if(numero > numAleatorio) {
	            System.out.println("Es menor ");
	        }
	        else {
        	    System.out.println("Es mayor");
	        }
	        cantIntentos++; // incremento de a uno el contador de numeros introducidos.
	        
	    }while(numero != numAleatorio);  // Evalua la condicion si acertó o no.
        
        //Cuando salgo del do while imprimo:
	    System.out.println("Acertaste!!");
	    System.out.println("La cantidad de intentos fue de :" + cantIntentos);
	}
}
