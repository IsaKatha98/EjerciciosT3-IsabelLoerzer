package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, 
	 * uno en cada línea, repitiendo cada número tantas veces como su valor.
	 * 
	 * Las pruebas a realizar en el siguiente ejercicio son:
	 * 
	 * - Introducir un valor 0 y comprobar que salta el mensaje de error.
	 * - Introducir un valor 21 y comprobar que salta el mensaje de error.
	 * - Introducir un valor númerico (8) y comprobar que se imprime la pirámide correspondiente.*/

	public static void main(String[] args) {
	
		//Declaramos la variable.

		int num;//Variable que introduce el usuario.

		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
															
		Scanner sc= new Scanner (System.in);
															
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Para empezar, excluiremos los números menores de 0 y mayores de 20.
		
		if (num>0&&num<=20) {
		
			/*Establecemos un for en el que se imprime un número por iteración. Primero, definimos las veces que va a repetirse la condición,
			 * es decir, el total de filas que tendrá la pirámide.*/
			
			for(int i = 1; i<=num; i++){
				
				//Dentro del bucle, establecemos otro bucle en el que la variable j imprimirá en la misma línea la variable i
			
					
					for( int j=2; j<=i; j++) {
						
						System.out.print(i);
					}
	         
			//Ponemos un salto de línea para que el bucle inicial se repita por cada línea, hasta llegar al número introducido.
					
	         System.out.println(i);
			}
		 
		//Se imprime un mensaje de error en caso de que no se cumpla la primera condición
		}else {
			
			System.out.println("Ha introducido valores no válidos.");
			
		}
		
		//Por último, cerramos el escáner.
			
		sc.close();

	}

}
