package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).*/

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la base");
		int base=entrada.nextInt();
		System.out.println("Introduce el exponente");
		int exponente=entrada.nextInt();
		int resultado=1;
		for(int i=0;i<exponente;i ++ ) {			
			resultado*=base;										
		}
		System.out.println("El numero "+ base + " elevado al "+ exponente+ " es igual a "+ resultado);
	}
}