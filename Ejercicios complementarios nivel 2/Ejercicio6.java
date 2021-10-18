package EjercicioscomplementariosLevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.*/
	
public class Ejercicio6 {
	
	public String nombre;
	public String apellido;
	public int id;
	public int horas_trabajadas;
	public int costo_hora;
	
		Ejercicio6(String nombre, String apellido, int id, int horas_trabajadas, int costo_hora){
			this.nombre = nombre;
			this.apellido = apellido; 
			this.id = id;
			this.horas_trabajadas = horas_trabajadas;
			this.costo_hora = costo_hora;		
		}	
		public static void main (String[] args){

			Ejercicio6 empleado1 = new Ejercicio6("Ulises","Bueno",30614641,30,40);
			Ejercicio6 empleado2 = new Ejercicio6("Pablo","Gomez",30614642,40,20);
			Ejercicio6 empleado3 = new Ejercicio6("Dario","Aranda",30614660,10,30);
			Ejercicio6 empleado4 = new Ejercicio6("Pamela","Arriaga",30614615,60,25);
			Ejercicio6 empleado5 = new Ejercicio6("Olga","Flores",30614650,25,50);

			Set<Ejercicio6> dotacion= new HashSet<Ejercicio6>();
			Map k = new HashMap();
			
			dotacion.add(empleado1);
			dotacion.add(empleado2);
			dotacion.add(empleado3);
			dotacion.add(empleado4);
			dotacion.add(empleado5);
			
			for(Ejercicio6 elto:dotacion) {
			System.out.println(elto.id+"----"+elto.horas_trabajadas*elto.costo_hora);
			
			k.put(elto.id, elto.horas_trabajadas*elto.costo_hora);
						
			}
			System.out.println(k);
		}    	
}

