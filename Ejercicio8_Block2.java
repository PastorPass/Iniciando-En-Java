/*  Ejercicio 8 bloque 2
Pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int num,cantCifras ;
        cantCifras = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        // Se podria haber hecho con varios if anidados por ej : if(num < 10 ) tiene 1 digito if num <100...
        while ((num != 0) && (num <= 99999)) {
          cantCifras = cantCifras + 1;
          num = num /10;     
        }
        JOptionPane.showMessageDialog(null, "La cantidad de cifras que tiene el numero es: " +cantCifras);
    }
}
    
