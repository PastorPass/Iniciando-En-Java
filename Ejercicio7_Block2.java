/*  Ejercicio 6 bloque 2
Pedir 3 numeros y mostrarlos ordenados de mayor a menor.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int num1,num2,num3;

       num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
       num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
       
      if ((num1 > num2 ) && (num2 > num3)) {
          JOptionPane.showMessageDialog(null, "De mayor a menor " + num1 +" "+num2+" "+num3);
      }
      else if((num1 > num3) && (num3 > num2)) {
          JOptionPane.showMessageDialog(null, "De mayor a menor " + num1 +" "+num3+" "+num2);
      }
      else if((num2 > num1) &&(num1 > num3)) {
          JOptionPane.showMessageDialog(null, "De mayor a menor " + num2 +" "+num1+" "+num3);           
      }
      else if((num2 > num3) && (num3 > num1)) {
          JOptionPane.showMessageDialog(null, "De mayor a menor " + num2 +" "+num3+" "+num1);
      }
      else if((num3 > num1)&& (num1 > num2)) {
          JOptionPane.showMessageDialog(null, "De mayor a menor " + num3 +" "+num1+" "+num2);
      }
      else
          JOptionPane.showMessageDialog(null, "De mayor a menor " + num3 +" "+num2+" "+num1);
    }
}
    
