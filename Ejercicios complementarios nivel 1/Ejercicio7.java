package EjerciciosComplementariosLevel1;
import java.util.Scanner;

/*Realizar un programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().*/

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra=entrada.nextLine();

		
		for(int i = 0;i<palabra.length();i++) {
			
			char c=palabra.charAt(i);

			if(c>='a' & c<='z') {
				
			c =(char)(c - (int) 'a' + (int) 'A') ;

			System.out.print(c);
			
			}
			else if(c>='A' & c<='Z') {
				
			System.out.print(c);
			
			}		

			

			
			
		
		
			
		}
		
		
		
	}

}
