package EjercicioscomplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.*/

public class Ejercicio3 {
	
	public static void main(String[] args) {
	List<Integer> numeros=new ArrayList<>();	
	for (int i=1;i<14;i++) {
		numeros.add(i);
	}		
	System.out.println("La lista ordenada de numeros es: "+ numeros);
	Collections.reverse(numeros);
	System.out.println("La lista ordenada de manera inversa es: "+numeros);
	Collections.shuffle(numeros);
	System.out.println("La lista ordenada de manera aleatoria es: "+numeros);		
	}		
}
