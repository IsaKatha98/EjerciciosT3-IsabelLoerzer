package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
		1
		121
		12321
		1234321
		
		Las pruebas realizadas en este ejercicion son:
		
		- Introducir un valor 0 y que se imprima el mensaje de error.
		- Introducir un valor númerico cualquiera (6) y que se imprima la pirámide de forma correcta.
*/

	public static void main(String[] args) {
		
		//Declaramos la variable.

		int num;//Variable que introduce el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
																	
		Scanner sc= new Scanner (System.in);
																	
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
										
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Creamos una condición para que nos imprime un mensaje de error en caso de que num sea menor o igual a 0.
		if (num>0) {
			
			//Creamos un primer bucle que imprima la cantidad de filas que tiene la priámide.
			
			for (int i=1; i<=num; i++) {
				
				//Creamos un bucle para que imprima el valor de cada columna de la pirámide.
				
				for (int j=1; j<=i; j++) {
					
					System.out.print(j);
					
				}
				
				//Ahora creamos un bucle que imprima los valores hacia n pero al revés.
				
				for (int k=i-1; k>=1;k--) {
					
					System.out.print(k);
				}
				
			//Imprimimos un salto de línea para separar las filas (una fila por bucle).
				
			System.out.println("");
			}
			
			
		} else {
			
			System.out.println("Ha introducido un valor no válido.");
		}
				
		//Por último, cerramos el escáner.
					
		sc.close();

	}

}
