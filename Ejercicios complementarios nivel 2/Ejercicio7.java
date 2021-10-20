package EjercicioscomplementariosLevel2;
import java.util.*;

/*Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4*/

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int numero1=input.nextInt();
		System.out.println("Ingrese un numero mayor al anterior: ");
		int numero2=input.nextInt();
		if (numero2>numero1) {		
		System.out.println(Arrays.toString(fizzBuzzFuncion(numero1,numero2).toArray()));	
		}
		input.close();
	}

	public static List<String> fizzBuzzFuncion(int x, int y){
		List<String> cadena = new ArrayList<>();
		for (int i=x; i<y; i++){
			if (i%2==0 & i%3==0){
			cadena.add("FizzBuzz");
		 	} else if (i%3==0) {
			cadena.add("Buzz");
			} else if (i%2==0){
			cadena.add("Fizz");
			} else {
			cadena.add(String.valueOf(i));
			}
		}
		return cadena;
	}
		
}


