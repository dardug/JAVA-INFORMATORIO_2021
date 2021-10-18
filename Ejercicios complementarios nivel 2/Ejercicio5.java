package EjercicioscomplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.*/

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int [] horas_trabajadas= {5,12,35,44,6,95};
		int [] costo_hora= {20,30,25,50,60,70};
		int [] costo_total= new int [6];
		List<Integer> totales= new ArrayList<>();
		for(int i=0; i<costo_total.length;i++) {			
			costo_total[i]= horas_trabajadas[i]*costo_hora[i];			
			totales.add(costo_total[i]);		
		}
		int suma=0;
		for (int i=0;i<costo_total.length;i++) {
			suma=suma+costo_total[i];			
		}
		System.out.println("Los costos parciales son igual a : "+totales);
		System.out.println("El total final a cobrar es igual a: "+ suma);	
	}
}
