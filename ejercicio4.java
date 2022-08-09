/*
Una compañia de venta de autos usados paga a su personal de ventas un salario de $1000 mensuales , mas una
comision de $150, por cada auto vendido, mas el 5% del valor de la venta por auto.  Cada mes el 
capturista de la empresa ingresa en la computadora los datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 */


import java.util.Scanner;

public class Main {          //Ejercicio_4 --> Main

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int numAutosVendidos;
        float costeAuto,total;
        
        System.out.println("Cuantos autos se vendieron");
        numAutosVendidos = entrada.nextInt();
        System.out.println("Cuanto cuesta el auto");
        costeAuto = entrada.nextFloat();
        
        total = salario + (numAutosVendidos*150) + ((numAutosVendidos*costeAuto*5)/100);
        
        System.out.println("El salario mensual es : " + total);
    }
}

