//Ejecicio 18 bloque 3
/*
Hacer modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro. Solo existen 3 productos 
con precios :
1.  $0.6 x litro
2.  $3 x litro
3.  $1.25 x litro
*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod,cantVendidaLitros,facturasSeisMil = 0, cantLitrosVendidosArtUno = 0;
		float precioXLitro = 0,facturacionTotal = 0 , importeFactura = 0;
		for (int i = 1; i <= 5; i++) {
		    do {
		        System.out.println("Ingrese codigo del articulo");
		        cod = entrada.nextInt();
		    }while (cod < 1 || cod > 3);
		    
		    switch (cod) {
		        case 1 : precioXLitro = 0.6f; break;
		        case 2 : precioXLitro = 3f; break;
		        case 3 : precioXLitro = 1.25f; break;
		    }
            
            System.out.println("Ingrese cantidad vendida de litros");
		    cantVendidaLitros = entrada.nextInt();
            
            importeFactura = (float)cantVendidaLitros* precioXLitro;  // importe por factura
            facturacionTotal += importeFactura;         // importe total ganado por las 5 facturas.
            if (cod == 1) {
                cantLitrosVendidosArtUno += cantVendidaLitros;
            }
            if (importeFactura > 600) {     // es equivalente a (cantVendidaLitros* precioXLitro > 600)  ??
                facturasSeisMil++;
            }
		}
		System.out.println("RESUMEN DE VENTAS");
		System.out.println("FACTURACION TOTAL = " + facturacionTotal);
		System.out.println("Cantidad en litros del articulo 1: " + cantLitrosVendidosArtUno);
		System.out.println("Cantidad de facturas mayores a $600 : " +facturasSeisMil);
	}
}
