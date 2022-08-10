/*  Ejercicio 2 bloque 2
Pedir dos numeros y decir cual es el mayor o si son iguales.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int numero1,numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El numero "+ numero1+" es mayor que el numero"+numero2);
        }
        else if(numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "El numero "+ numero2+" es mayor que el numero"+numero1);
        }
        else
            JOptionPane.showMessageDialog(null, "Los numeros " +numero1+" y " +numero2+" Son iguales" );

    }
}
    
