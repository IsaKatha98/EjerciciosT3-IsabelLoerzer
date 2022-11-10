package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

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
		System.out.print("Introduzca el incremento de segundos y pulse Intro: ");
		incremento= sc.nextInt();
		
		/*Realizamos una primera división del número introducido por el usuario (num)*/
		
		
		/*Planteamos la primera condición. En ella, las horas deben ser mayor/igual que 0 y menor(igual que 23, los minutos mayor/igual que 0
		 * y menor o igual que 59; y los segundos mayor/igual que 0 y menor/igual que 59. Cuando se cumpla esta condición, aplicamos un incremento 
		 * un segundo.*/
		
			
			if (horas<24&&min<60&&seg<60) {
						
				
				for (int i=1; i<=incremento; i++) {		
					
				seg++;
					
				if (seg==59) {//Al aplicar el incremento de un segundo, en el caso de que sean igual a 60, tendrán valor 0 y se incrementa 1 min.
						
					seg=0;
					min++;
				
					if ( min==59) {//Al aplicar el incremento de un minuto, en el caso de que sea igual a 60, tendrá valor 0 y se incrementa 1 hora.
							
						min=0;
						horas++;
							
						if (horas==23) {//Si tras el incremento, las horas valen 24, pasarán a tener valor 0.
								
							horas=0;
							
						}
					}
						
				}
							 
			} 
				
		}else {
				
			System.out.println("Ha introducido valores no válidos.");
				
		}
					
		
	System.out.println("La hora introducida más un incremento de "+incremento+" segundos es igual a: "+horas+" horas, "+min+" minutos y "+seg+" segundos.");
				
										
	//Por último, cerramos el escáner
										
	sc.close();
	
	}

}
