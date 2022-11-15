package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más grande que divide a ambos) 
	 * mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el primer 
	 * número que divide a ambos simultáneamente. Teniendo en cuenta lo que se acaba de explicar, realiza un programa que 
	 * calcule el máximo común divisor de dos números.
	 * 
	 * Las pruebas que se realizarán en este ejercicio son las siguientes.
	 * 
	 * - Introducir un valor 0 y se espera que salte el mensaje de error.
	 * - Introducir valores númericos donde numA (18) sea mayor que numB(12) y nos dé el mcd correcto (6).
	 * - Introducir valores númericos donde numA (12) sea menor que numB(18) y nos dé el mcd correcto (6).
	 */

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
		
			for (int i=1; i<=numA; i++) {
			
			//Se especifica que en el momento en que el módulo de numA y numB, ambos sean cero, i se guardará en la variable divisor.
			
				if (numA%i==0&&numB%i==0) {
				
					divisor=i;
				}
			}
		
		
		//Imprimimos el resultado del bucle for.
		
		System.out.println("El máximo común divisor es: "+divisor);
	
	//Imprimimos un mensaje de error, en el caso de que se introduzca un cero.
		
	} else {
		
		System.out.println("Los números son iguales.");
		
	}
	
	//Por último, cerramos el escáner.
	
	sc.close();
		
	

	}

}
