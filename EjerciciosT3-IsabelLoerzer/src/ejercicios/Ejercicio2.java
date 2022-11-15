package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

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
				
		//Instrucciones. 
				
		if (num>0) {
			
			for (int i=2; i<=num; i++) {
				contador++;
				
				for (int divisor=2; divisor<i; divisor++) {
					
					if (i%divisor==0) {
						
						contador--;
						break;
					}
				}
				
				
			} 	
			
			System.out.println("Hay "+contador+" números primos entre 0 y "+num+" .");
						
			} else {
					
			System.out.println("Número no válido.");
						
			}
				
			//Por último, cerramos el escáner.
				
			sc.close();
			
			}

	}


