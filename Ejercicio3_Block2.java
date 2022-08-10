/*  Ejercicio 3 bloque 2
Programa que lea un caracter por teclado y compruebe si es una letra mayuscula.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        
     //con el tipo de dato (Character) + .metodo (isUpperCase(variable)) verifica rapidamente si es mayuscula
        if(Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
