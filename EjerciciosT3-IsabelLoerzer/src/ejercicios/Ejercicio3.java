package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
	 	*
	 	**
	 	***
	 	****
	
	Las pruebas a realizar serán las siguientes:
	
	- Introducir un valor 0. Se espera que no se imprima nada.
	- Introducir un valor aleatorio. Se espera que se forme una pirámide correspondiente al número introducido.
	 */

	public static void main(String[] args) {
		
		//Declaramos la variable.
	
		int numFilas;//Variable que introduce el usuario.
	
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
															
		Scanner sc= new Scanner (System.in);
															
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca la base y la altura de la pirámide (un número) y pulse Intro: ");
		numFilas=sc.nextInt();
		
		/*Establecemos un for en el que se imprime un asterisco por iteración. Primero, definimos las veces que va a repetirse la condición,
		 * es decir, el total de filas que tiene el triángulo.*/
		
		 for(int altura = 1; altura<=numFilas; altura++){
	         
			 /*Ahora, se imprime los espacios en blanco. Estos serán igual al tamaño total de filas menos a la altura que haya definida en ese
			  *momento.*/
	         for(int blancos = 1; blancos<=numFilas-altura; blancos++){
	             System.out.print(" ");
	         }
	
	         /*A continuación, se imprimen los asteriscos*/
	         for(int asteriscos=1; asteriscos<=altura; asteriscos++){
	             System.out.print("* ");
	         }
	         
			//Ponemos un salto de línea para que el bucle inicial se repita por cada línea.
	         System.out.println();
		}
		 
		
		//Por último, cerramos el escáner.
			
		sc.close();
			

	}

}
