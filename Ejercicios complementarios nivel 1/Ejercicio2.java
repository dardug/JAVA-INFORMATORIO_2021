package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Realizar un programa que solicite por consola 2 números enteros. Para luego
/imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números.*/


public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		double numero1=entrada.nextInt();
		System.out.println("Introduce un numero entero");
		double numero2=entrada.nextInt();		
		System.out.println("La suma de los dos numeros ingresados es igual a "+ (numero1+numero2));
		System.out.println("La resta de los dos numeros ingresados es igual a "+ Math.abs(numero1-numero2));
		System.out.println("La multiplicacion de los dos numeros ingresados es igual a "+ (numero1*numero2));
		System.out.println("La division de los dos numeros ingresados es igual a "+ (numero1/numero2));
		System.out.println("El modulo de los dos numeros ingresados es igual a "+ (numero1%numero2));
			
	}

}
