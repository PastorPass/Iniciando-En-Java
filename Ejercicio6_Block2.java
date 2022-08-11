/*  Ejercicio 6 bloque 2
Hacer un programa que tome 2 numeros y diga si ambos numeros son pares o impares.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int num1,num2;

       num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un otro numero"));
       
      if((num1 %2 == 0) && (num2 %2 == 0)) {
        JOptionPane.showMessageDialog(null, "AMBOS NUMEROS SON PARES");
      }
      else if ((num1 %2 != 0) && (num2 %2 != 0)) {
        JOptionPane.showMessageDialog(null, "AMBOS NUMEROS SON IMPARES");
     
      }
      else
        JOptionPane.showMessageDialog(null, "Un numero es impar y el otro es par");
    }
}
    
