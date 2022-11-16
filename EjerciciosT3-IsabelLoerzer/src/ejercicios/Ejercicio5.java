package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*De forma similar a la actividad 4, realiza un programa que calcule el mínimo común múltiplo de dos números dados. 
	 *En este caso, habrá que partir del máximo de los dos e ir incrementando hasta encontrar el primer número que sea 
	 *múltiplo de los dos números.
	 *
	 *Las pruebas realizadas en este ejercicio son:
	 *
	 *- Introducir un valor 0 y se espera que salte el mensaje de error.
	 * - Introducir valores númericos donde numA (5) sea mayor que numB(3) y nos dé el mcm correcto (15).
	 * - Introducir valores númericos donde numA (3) sea menor que numB(5) y nos dé el mcd correcto (15).
	 **/

	public static void main(String[] args) {

		//Declaramos las variables
		
		int numA;
		int numB;
		int aux;
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
		
			//Multiplicamos los números introducidos para que haga de límite.
			
			aux=numA*numB;
					
				//Establecemos un bucle que empiece en uno y termine en cuando se alcance numA y que vaya sumando uno por cada vuelta del bucle.
				for (int i=1; i<=aux; i++) {
				
					//Se especifica que en el momento en que el módulo de numA y numB, ambos sean cero, i se guardará en la variable multiplo.
					if (i%numA==0&&i%numB==0) {
							
						multiplo=i;
							
						//Forzamos la salida del bucle.
						break;
					}
				}

			//Imprimimos el resultado del bucle for.
			System.out.println("El mínimo común múltiplo es: "+multiplo);	
			
			//Imprimimos un mensaje de error, en el caso de que se introduzca un cero.	
			} else {
			
				System.out.println("Ha introducido valores no válidos.");	
			}
		
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
