//Ejecicio 17 bloque 3
/*
Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada
factura figura el codigo del articulo, la cantidad vendida en litros y el precio por litro.
Se pide de 5 facturas introducidas : Facturacion total, cantidad en litros vendidos del articulo 1 y cuantas facturas
se emitieron de mas de $600
*/

import java.util.Scanner;

public class Main
{       //Hecho sin JOP.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cod,cantVendidaLitros,facturasSeisMil = 0, cantLitrosVendidosArtUno = 0;
		float precioXLitro ,facturacionTotal = 0 , importeFactura = 0;
		for (int i = 1; i <= 5; i++) {
		    System.out.println("Ingrese codigo del articulo");
		    cod = entrada.nextInt();
		    
		    System.out.println("Ingrese la cantidad vendida de litros del articulo");
            cantVendidaLitros = entrada.nextInt();
            
            System.out.println("Ingrese el precio x litro");
            precioXLitro = entrada.nextFloat();
            
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
