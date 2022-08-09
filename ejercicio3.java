/*
Gullermo tiene N dolares . Luis tiene la mitad de lo que posee Guillermo . Juan tiene la 
mitad de lo que poseen Luis y Guillermo juntos . Hacer un programa que calcule e imprima la
cantidad de dinero que tienen entre los 3.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        float cantidad,cantJ,cantL,sumaTotal;  // hecho con numeros con coma. se puede hacer con enteros
        
        System.out.println("Digite una cantidad ");
        cantidad = entrada.nextFloat();
        cantL = cantidad / 2;  // Luis tiene la mitad de lo que tiene Guillermo
        cantJ = (cantL + cantidad)/2;  // juan tiene la mitad de lo que poseen guillermo y luis juntos
        
        sumaTotal = cantJ + cantL + cantidad;
        System.out.println("La cantidad de dinero que tienen entre los 3 es : "+ sumaTotal);
        
    }
}

