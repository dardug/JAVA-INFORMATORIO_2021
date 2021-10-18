package EjercicioscomplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.*/

public class Ejercicio4 {

	public static void main(String[] args) {	
		List<String> nombres= new ArrayList<>();		
		int i=0;		
		while(i<12) {
			i++;			
			Scanner entrada=new Scanner(System.in);
			System.out.println("Ingrese un nombre de estudiante:");
			String nombre=entrada.nextLine();
			nombres.add(nombre);								
		}	
		Collections.shuffle(nombres);
		System.out.println("Se mezclaran los nombres y dividiran en tres grupos");
		List<String> Grupo1= nombres.subList(0,4);
		List<String> Grupo2= nombres.subList(4,8);
		List<String> Grupo3= nombres.subList(8,12);
		System.out.println("El grupo 1 esta integrado por: "+Grupo1);
		System.out.println("El grupo 2 esta integrado por: "+Grupo2);
		System.out.println("El grupo 3 esta integrado por: "+Grupo3);	
	}
}
