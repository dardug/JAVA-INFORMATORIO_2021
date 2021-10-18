package EjercicioscomplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).*/


public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Introduce cinco números enteros");		
		List<Integer> numeros=new ArrayList<>();				
		int i=0;		
		while(i<5) {		
		i++;
		Scanner entrada=new Scanner(System.in);		
		System.out.println("Ingresa un número:");		
		int numero=entrada.nextInt();		
		numeros.add(numero);				
		}
		System.out.println("La cantidad de elementos de la lista es igual a :" + numeros.size());			
		Scanner entrada1=new Scanner(System.in);		
		System.out.println("Ingrese un numero entero para agregar al comienzo de la lista");		
		int numero1=entrada1.nextInt();				
		numeros.add(0,numero1);		
		Scanner entrada2=new Scanner(System.in);		
		System.out.println("Ingrese un numero entero para agregar al final de la lista");		
		int numero2=entrada2.nextInt();		
		numeros.add(numero2);				
		for (i=0;i<numeros.size(); i++) {
			System.out.println(numeros.get(i));						
		}
		System.out.println("La cantidad de elementos luego de modificar la lista es igual a :" + numeros.size());	
	}

}
