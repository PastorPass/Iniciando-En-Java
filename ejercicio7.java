/*
ejercicio 7
Construir un programa que dado un numero total de horas, devuelve el numero de semanas, dias y horas 
equivalentes. Por ejemplo , dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales,semanas,dias,horas;
        
        System.out.println("Ingrese la cantidad total de horas");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales/168;   // 168 es la cantidad de horas en una semana
        dias = horasTotales%168 /24;  // 24 =la cantidad total de horas en un dia, usamos mod para sacar el residuo o el resto de la division.
        horas = horasTotales%24;
        
        System.out.println("Semanas : " +semanas);
        System.out.println("Dias : " +dias);
        System.out.println("Horas : " +horas);
    }    
}
