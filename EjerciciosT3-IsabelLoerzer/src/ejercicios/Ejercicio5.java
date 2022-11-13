package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*De forma similar a la actividad 4, realiza un programa que calcule el mínimo común múltiplo de dos números dados. 
	 *En este caso, habrá que partir del máximo de los dos e ir incrementando hasta encontrar el primer número que sea 
	 *múltiplo de los dos números.*/

	public static void main(String[] args) {

		//Declaramos las variables
		
		int numA;
		int numB;
		int multiplo=0;
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
													
		Scanner sc= new Scanner (System.in);											
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca un número A y pulse Intro: ");
		numA=sc.nextInt();
		
		System.out.print("Introduzca un número B y pulse Intro: ");
		numB=sc.nextInt();
		
		//Instrucciones. Primero, establecemos una condición en la que debe ocurrir que  ambos números son distintos de 0.
		
		if (numA!=0&&numB!=0) {
		
			//Establecemos un bucle que empiece en uno y termine en cuando se alcance numA y que vaya sumando uno por cada vuelta del bucle.
			
				if (numA<numB) {
					
					int aux=numA*numB;
			
					for (int i=numA; i<=aux; i++) {
						
				
				
				//Se especifica que en el momento en que el módulo de numA y numB, ambos sean cero, i se guardará en la variable divisor.
				
					if (numA%i==0&&numB%i==0) {
					
						multiplo=i;
					}
				}
			
			
			//Imprimimos el resultado del bucle for.
			
			System.out.println("El mínimo común múltiplo es: "+multiplo);
		
		//Imprimimos un mensaje de error, en el caso de que se introduzca un cero.
			
		} else {
			
			int aux =numA*numB;
			
			for (int i=numB; i<=aux; i++) {
				
				if (numA%i==0&&numB%1==0) {
					
					multiplo=i;
				}
				
			}
			
			//Imprimimos el resultado del bucle for.
			
			System.out.println("El mínimo común múltiplo es: "+multiplo);
		
			
		}
				
		}else {
			
			System.out.println("Ha introducido valores no válidos.");
			
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
			
		

		

	}

}
