package EjerciciosComplementariosLevel1;

//Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre_usuario=entrada.nextLine();				
		System.out.println("HOLA "+nombre_usuario.toUpperCase()+" !!!");

	}

}
