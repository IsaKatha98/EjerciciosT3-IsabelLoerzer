package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
		1
		121
		12321
		1234321
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
		
		int j=1;
				
				
			/*Establecemos un for en el que se imprime un número por iteración. Primero, definimos las veces que va a repetirse la condición,
			* es decir, el total de filas que tendrá la pirámide.*/
			
		for (int i=1; i<=num; i++) {
		
			System.out.println(i);
			
			j++;
			
		
			while (num>=j) {
				
				System.out.print(j);
			
				for( j=1; j<=num; j++){
				
					System.out.print(j);
					
					continue;
	
		
				//Dentro del bucle, establecemos otro bucle en el que la variable j imprimirá en la misma línea la variable i
				
			
				}//Ponemos un salto de línea para que el bucle inicial se repita por cada línea, hasta llegar al número introducido.
		
		
			}
		
			while (num<j) {
				
				for (j=num-1; j>=1; j--) {
				
					System.out.print(j);
					
					continue;
				}
			}
	
		}
				
		//Por último, cerramos el escáner.
					
		sc.close();

	}

}
