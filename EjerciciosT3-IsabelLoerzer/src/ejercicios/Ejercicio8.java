package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. 
	 *La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
	 *
		a) El total de números introducidos, excluido el 0.
		b) El total de números fallados.
		
	Las pruebas introducidad en este ejercicio son las siguientes:
	
	- Introducir una sucesión de números y que los acepte sin problema.
	- Introducir un fallo y que salte el mensaje de error.
	- Introducir 0 para que se cierre el programa y salten los mensajes contando los números 
		introducidos y los fallos, sin incluir el 0.
*/

	public static void main(String[] args) {
	
		//Declaramos las variables.

		int numA;//Variable que introduce el usuario.
		int numB;//Otra variable introducida por el usuario.
		int contadorTotal=0; //Variable contador que cuenta el total de los números introducidos.
		int contadorFallos=0; //Variable contador que cuenta los fallos (mensajes de error).
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
																	
		Scanner sc= new Scanner (System.in);
																	
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
										
		System.out.print("Introduzca un número inicial y pulse Intro: ");
		numA=sc.nextInt();
		
		System.out.print("El programa se cerrará cuando pulse 0.");
		System.out.println("");
		
		/*Establecemos un bucle donde pregunte por otro número y que se pare
		cuando el usuario introduzca 0.*/
		
		do {
			System.out.print("Dígame otro número: ");
			numB=sc.nextInt();
			
			//Establecemos una condición para que salte error si numB es menor que numA.
			if (numB<=numA) {
				
				contadorFallos++;
				
				System.out.println("ERROR. No puede introducir un número menor al anterior.");
				
				//Establecemos una consixión para que no cuente el 0 como fallo.
				if (numB==0) {
					contadorFallos--;
					
				}
			}
			
			//El segundo número pasará a ser el primero.
			numA=numB;
			contadorTotal++;
			
		} while (numB!=0);
	
		//Se imprime el resultado.
		System.out.println("");
		System.out.println("El total de número introducidos: "+contadorTotal);
		System.out.println("El total de números fallados: "+contadorFallos);
		
		//Por último, cerramos el escáner.
		
		sc.close();
	}

}
