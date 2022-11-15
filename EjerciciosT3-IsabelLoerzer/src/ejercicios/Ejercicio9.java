package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	
	/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido debe ser mayor que 0.
	 * 
	 * Las pruebas realizadas en este ejercicio son las siguientes:
	 * 
	 * - Introducir un 0 y que salga el mensaje de error.
	 * - Introducir un valor númerico cualquiera (499) y que nos diga cuantás cifras tiene (3).  
	 * */

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int contador=0;
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
				
		Scanner sc= new Scanner (System.in); 
				
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
				
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Creamos una condición para que nos salga un mensaje de error en caso de que se introduzca un número menor o igual a 0.
		if (num>0) {
			
			//Mientras que el número sea mayor de 0, se ejecutará el siguiente bucle:
			while (num>0) {
				
				//se realiza una división entre 10 y por cada división la variable contador incrementa en 1.
				num/=10;
				
				contador++;
				
			}
			
			//Imprimimos el resultado.
			System.out.println("El número tiene "+contador+" cifras.");
		
		} else {
			System.out.println("ERROR. Ha introducido un valor no válido.");
		}

		//Por último, cerramos el escáner.
		
		sc.close();


	}

}
