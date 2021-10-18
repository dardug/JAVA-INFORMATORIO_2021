package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre=entrada.nextLine();
		System.out.println("Introduce tu apellido");
		String apellido=entrada.nextLine();
		System.out.println("Introduce tu edad");
		String edad=entrada.nextLine();
		System.out.println("Introduce tu direccion");
		String direccion=entrada.nextLine();
		System.out.println("Ciudad");
		String ciudad=entrada.nextLine();		
		System.out.println(ciudad+"-"+direccion+"-"+edad+"-"+(nombre+" "+apellido));		
	}
}
