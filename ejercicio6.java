/*
Ejercicio 6.
Hacer un programa que calcule el cuadrado de una suma
(a+b)^2 = a^2 + b^2 +2ab
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a,b,exponente,sumaParcial;
        
        //Entrada de datos
        System.out.println("digite un numero para 'a'");
        a = entrada.nextInt();
        System.out.println("digite un numero para 'b'");
        b = entrada.nextInt();  
        
        //En este caso hice el programa para que el exponente sea leido de teclado(cambiar la potenciacion)
        System.out.println("digite un numero para el exponente");
        exponente = entrada.nextInt();
        
        //calculo
        sumaParcial = a+b;
        double resultado = Math.pow(sumaParcial, exponente);
        System.out.println("La cuenta final es : " + resultado);
             
        /* siendo la suma al cuadrado (otra solucion pero elevado el exponente al cuadrado)
        double a,b,resultado;
        System.out.println("digite un numero para 'a'");
        a = entrada.nextDouble();
        System.out.println("digite un numero para 'b'");
        b = entrada.nextDouble();
        resultado = Math.pow(a,2) + Math.pow(b, 2) + 2*a*b;
        System.out.println("El resultado es : " + resultado);
        */
    }    
}

