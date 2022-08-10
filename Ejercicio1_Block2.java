/*  Ejercicio 1 bloque 3
Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(numero %10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " +numero+ " es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero " + numero+ " NO es multiplo de 10");
        }
    }
}
