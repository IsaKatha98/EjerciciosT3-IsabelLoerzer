package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
	 * 
	 * Las pruebas a realizar son las siguientes:
	 * 
	 * - Introducir un valor 0 y que se muestre el mensaje de error.
	 * - Introducir el valor 1 y que responda que no hay primos.
	 * - Introducir un número cualquiera (7) y que responda correctamente (4 números primos).
	 * */


	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int contador=0;
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
															
		Scanner sc= new Scanner (System.in);
															
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número entero positivo y pulse Intro: ");
		num=sc.nextInt();
				
		//Establecemos una condición para que se imprima un mensaje de error en caso de que num sea menor o igual a 0.		
		if (num>0) {
			
			//Establecemos un bucle que se inicialize en dos, alcance hasta num, y se incremente una vez por iteración.
			for (int i=2; i<=num; i++) {
				
				//Hacemos un incremento del contador para que se registre la cantidad de iteraciones del bucle for.
				contador++;
				
				//Creamos una variable divisor que contará  los números que no son primos.
				for (int divisor=2; divisor<i; divisor++) {
					
					//si dividimos i entre divisor y el resultado es 0, se quitará un 1 de la variable contador, así solo tenemos en cuenta los números primos.
					if (i%divisor==0) {
						
						contador--;
						
						//forzamos la salida del bucle.
						break;
					}
				}
				
				
			} 	
			
				//Imprimimos el resultado.
				System.out.println("Hay "+contador+" números primos entre 0 y "+num+" .");
						
			} else {
					
			System.out.println("Número no válido.");
						
			}
				
			//Por último, cerramos el escáner.
				
			sc.close();
			
			}

	}


