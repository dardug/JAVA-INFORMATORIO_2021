package EjerciciosComplementariosLevel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Confeccionar un programa que dado un número entero como dato de
entrada imprima la secuencia de números (incrementos de 1) de la siguiente
forma:*/


public class Ejercicio3 {

	public static void main(String[] args) {
		
		List<Integer> secuencia=new ArrayList<>();
				
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		int numero=entrada.nextInt();
		System.out.println(numero);		
		for(int i=1;i<=numero;i++) {			
			secuencia.add(i);
			System.out.println(secuencia);					
		}		
	}
}
