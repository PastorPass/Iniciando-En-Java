/*
La calificacion final de un estudiante de Informatica se calcula con base a las calificaciones de 
cuatro aspectos de su rendimiento academico: participacion , primer examen parcial, segundo examen parcial
y examen final. Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones
del 10% , 25% , 25% y 40%.
Hacer un programa que calcule e imprima la calificacion obtenida por un estudiante.
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float participacion, primerExamen,segundoExamen,examenFinal,notaFinal;
        
        //Pedir los datos necesarios
        System.out.println("Digite la participacion");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del 1er examen");
        primerExamen = entrada.nextFloat();       
        System.out.println("Digite la nota del 2do examen");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final");
        examenFinal = entrada.nextFloat();
        
        //Sacamos los calculos de los porcentajes
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        //Sumamos las notas
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        //Imprimimos el resultado final
        System.out.println("La nota final es : " + notaFinal);
    }    
}
