package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).*/

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce uel exponente");
		int exponente=entrada.nextInt();
		System.out.println("Introduce la base");
		int base=entrada.nextInt();
		int resultado=1;
		for(int i=0;i<exponente;i ++ ) {
			
			resultado*=base;	
			System.out.println(resultado);			
			
		}
		System.out.println("El numero "+ base + " elevado al "+ exponente+ " es igual a "+ resultado);
		
		
		

	}

}
