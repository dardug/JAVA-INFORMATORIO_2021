package EjercicioscomplementariosLevel2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking*/


public class Ejercicio1 {

	public static void main(String[] args) {
				
		System.out.println("¿Cuales son tus ciudades favoritas del la Argentina?. Enumera 5 ciudades desde la mas favorita hasta la menos favorita");		
		List<String> ciudades_favoritas=new ArrayList<>();
		int i=0;	
		while(i<5) {		
		i++;		
		Scanner entrada=new Scanner(System.in);		
		System.out.println("Ingresa el nombre de la ciudad:");		
		String nombre=entrada.nextLine();			
		ciudades_favoritas.add(i+"-"+nombre);		
		}
		System.out.println("El ranking de tus ciudades favoritas es: ");
		for( i=0;i<5;i++) {
		System.out.println(ciudades_favoritas.get(i));
		}
	}
}
