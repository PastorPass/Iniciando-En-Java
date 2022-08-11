/*  Ejercicio 13 bloque 2
Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares, con el siguiente
menu de opciones :

1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        final int montoInicial = 1000;
        int click;
        float ingreso,saldoActual,retiro;
        
        click = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
        +"1. Ingresar dinero a la cuenta\n"
        +"2. Retirar dinero de la cuenta\n "
        +"3. Salir"));
        
        switch (click) {
            case 1 : ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que desea depositar en su cuenta"));
                     saldoActual = montoInicial +ingreso;
                     JOptionPane.showMessageDialog(null,"Dinero en cuenta: " +saldoActual);
                     break;
            case 2 : retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar"));
                     if(retiro > montoInicial) {
                        JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente para retirar esa cantidad");
                     }
                     else {
                        saldoActual = montoInicial -retiro;
                        JOptionPane.showMessageDialog(null,"Dinero en cuenta: " +saldoActual);
                     }
                     break;
            case 3 : break;
            default : JOptionPane.showMessageDialog(null," Se equivoco de opcion de menu" );break;   
        }
    }
}
    
