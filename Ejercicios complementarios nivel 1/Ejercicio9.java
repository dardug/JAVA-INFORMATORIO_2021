package EjerciciosComplementariosLevel1;
/*Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.*/

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una palabra o frase");
		String palabra=entrada.nextLine();

		int contador=0;
		for(int i = 0;i<palabra.length();i++) {
			
			char c=palabra.charAt(i);
			
			if (c=='a'||c=='A') {
				
				contador++;
			}
			
			
		}
		System.out.println("La cantidad de veces que aparece la letra a es: "+ contador);
	}

}
