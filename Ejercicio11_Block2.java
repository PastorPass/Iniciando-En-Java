/*  Ejercicio 11 bloque 2
Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro 
operaciones aritmeticas basicas (suma,resta,multiplicacion y division ) con valores numericos enteros.
El usuario debe especificar la operacion con el primer caracter del primer parametro de la linea de comandos
S o s : para la suma, R o r : para la resta, M o m : para la multiplicacion, D o d : para la division. 
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int num1,num2,suma,resta,mult,div;
        char letra;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        letra = JOptionPane.showInputDialog("Ingrese el signo de la operacion").charAt(0);
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        
        
        switch (letra) {
            case 's' : 
            case 'S' : suma = num1 + num2;
                       JOptionPane.showMessageDialog(null, "La suma es " + suma);
                       break;
            case 'r' :
            case 'R' : resta = num1-num2;
                       JOptionPane.showMessageDialog(null, "La resta es " + resta);
                       break;
            case 'm' :
            case 'M' : mult = num1 *num2;
                       JOptionPane.showMessageDialog(null, "La multiplicacion es " + mult);
                       break;
            case 'd' : 
            case 'D' : div = num1 / num2;
                       JOptionPane.showMessageDialog(null, "La division es " + div);
                       break;
            default : JOptionPane.showMessageDialog(null, "Se equivoco de operacion");
                      //break;
        }
        
        /*
        
        if(letra == 's' || letra == 'S') {
            suma = num1+num2;
           // y se muestra el resultado con JOP
        }
        else if(letra == 'r' || letra == 'R') {
            resta = num1 - num2;
        }
        else if(letra == 'm' || letra == 'M') {
            mult = num1 *num2;
        }
        else if(letra == 'd' || letra == 'D') {
            div = num1 / num2;
        }
        else {
            JOptionPane.showMessageDialog(null, "Operador incorrecto");
        }
        */
    }
}
    
