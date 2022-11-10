package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más grande que divide a ambos) 
	 * mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el primer 
	 * número que divide a ambos simultáneamente. Teniendo en cuenta lo que se acaba de explicar, realiza un programa que 
	 * calcule el máximo común divisor de dos números.
	 */

	public static void main(String[] args) {
	
	//Declaramos las variables
		
	int numA;
	int numB;
	int divisor;
	
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
		
		//Establecemos que los números introducidos sean distintos entre sí.
		while (numB!=numA) {
	
		//En el caso de que A sea mayor que B.
		if (numA<numB) {	
		
			//Establecemos un for 
			
			for (int i=numB; i>=1; i--) {
				
				int aux;
				
				aux=numB;
				
				aux%i=0;
				
				
				
				
				
		
			}
		}
		
		if (numB<numA) {
			
		}
		
			
		}
	
	} else {
		
		System.out.println("Ha introducido un número no válido.");
	}
	
	//Por último, cerramos el escáner.
	
	sc.close();
		
	

	}

}
