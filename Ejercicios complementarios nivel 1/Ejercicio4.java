package EjerciciosComplementariosLevel1;
import java.util.Scanner;

//Realizar un programa que calcule el factorial de un número.

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double resultado=1;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		double numero=entrada.nextInt();
		
		for(double i=numero;i>0;i--) {
			
		resultado=resultado*i;
		}
		System.out.println("El factorial de "+numero+"es igual a "+resultado);
	}
	
}
