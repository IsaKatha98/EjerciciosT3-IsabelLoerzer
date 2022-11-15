package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	/*Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
		
		a)Hora
		b)Minutos
		c)Segundos
		d)Cantidad de segundos a incrementar
	
	La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, 
	y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
	
	Las pruebas a realizar en este ejercicio son:
	
	- Introducir un valor 0 y que nos salte un mensaje de error.
	- Introducir 13 horas, 59 minutos y 51 segundos y un incremento de 10 segundos.
		Se mostrará 14:00:01
*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int incremento=0;//Será la variable que introduzca el usuario, en segundos.
		int seg=0;//La variable segundos.
		int min=0;//La variable minutos.
		int horas=0;//La variable horas.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
										
		Scanner sc= new Scanner (System.in); 
										
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
										
		System.out.print("Introduzca el número de horas y pulse Intro: ");
		horas= sc.nextInt();
		System.out.print("Introduzca el número de minutos y pulse Intro: ");
		min= sc.nextInt();
		System.out.print("Introduzca el número de segundos y pulse Intro: ");
		seg= sc.nextInt();
		
		
		/*Realizamos una primera división del número introducido por el usuario (num)*/
		
		
		/*Planteamos la primera condición. En ella, las horas deben ser mayor/igual que 0 y menor(igual que 23, los minutos mayor/igual que 0
		 * y menor o igual que 59; y los segundos mayor/igual que 0 y menor/igual que 59. En caso contrario, saltará un mensaje de error.*/
		if (horas<24&&min<60&&seg<60) {
				
			//Preguntamos por el incremento que queremos hacer.
			System.out.print("Introduzca el incremento de segundos y pulse Intro: ");
			incremento= sc.nextInt();
				
			//Creamos un bucle que se ejecute hasta el incremento marcado, una vez por bucle. Añadimos un segundo.
			for (int i=1; i<=incremento; i++) {		
					
				seg++;
				
				//Al aplicar el incremento de un segundo, en el caso de que sean mayores de 59, tendrán valor 0 y se incrementa 1 min.
				if (seg>59) {
						
					seg=0;
					min++;
					
					//Al aplicar el incremento de un minuto, en el caso de que sea mayor que 59, tendrá valor 0 y se incrementa 1 hora.
					if ( min>59) {
							
						min=0;
						horas++;
						
						//En el caso de se sobrepase las 23 horas, estas pasarán a valer 0.
						if (horas>23) {
								
							horas=0;	
						}
					}
						
				}
							 
			} 
			
			//Se imprime el resultado.
			System.out.println("La hora introducida más un incremento de "+incremento+" segundos es igual a: "+ horas+ ":"+ min+":"+ seg);
			
		} else {
				
			System.out.println("Ha introducido valores no válidos.");		
		}
										
	//Por último, cerramos el escáner
										
	sc.close();
	
	}

}
