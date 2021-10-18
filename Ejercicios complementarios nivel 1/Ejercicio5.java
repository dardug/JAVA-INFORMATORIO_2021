package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).*/

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero1=entrada.nextInt();
		System.out.println("Introduce otro numero");
		int numero2=entrada.nextInt();
		int resultado=0;
		for(int i=0;i<numero1;i ++ ) {			
			resultado+=numero2;										
		}
		System.out.println("El resultado de multiplicar "+numero1+" por "+numero2+ " es igual a "+ resultado);
	}
}
