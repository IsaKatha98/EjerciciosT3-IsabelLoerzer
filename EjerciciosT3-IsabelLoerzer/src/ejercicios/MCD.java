package ejercicios;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
				int numA;
				int numB;
				int divisor=0;
				
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
							
							
					
							for (int i=numA; i>1; i--) {
								
						
						
						//Se especifica que en el momento en que el módulo de numA y numB, ambos sean cero, i se guardará en la variable divisor.
						
							if (numA%i==0&&numB%i==0) {
							
								divisor=i;
							}
						}
					
					
					//Imprimimos el resultado del bucle for.
					
					System.out.println("El mcd es: "+divisor);
				
				//Imprimimos un mensaje de error, en el caso de que se introduzca un cero.
					
				} else if (numB<numA) {
					
			
					
					for (int i=numB; i>=1; i--) {
						
						if (numA%i==0&&numB%i==0) {
							
							divisor=i;
						}
						
					}
					
					//Imprimimos el resultado del bucle for.
					
					System.out.println("El mínimo común múltiplo es: "+divisor);
				
					
				}
						
				}else {
					
					System.out.println("Ha introducido valores no válidos.");
					
				}
				
				//Por último, cerramos el escáner.
				
				sc.close();
					
				


	}

}
