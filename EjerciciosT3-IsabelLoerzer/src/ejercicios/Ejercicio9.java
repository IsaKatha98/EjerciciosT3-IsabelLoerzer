package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
				
		Scanner sc= new Scanner (System.in); 
				
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
				
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Instrucciones

		if (num>0) {
			
			if (num>0&&num<=9) {
			
				System.out.println("Es un número de una cifra.");
			
			}else if(num>=10&&num<=99) {
				System.out.println("Es un número de dos cifras.");
			
			}else if (num>=100&&num<=999) {
				System.out.println("Es un número de tres cifras.");
		
			}else if (num>=1000&&num<=9999) {
				System.out.println("Es un número de cuatro cifras.");
		
			}else if (num>=10000&&num<=99999) {
				System.out.println("Es un número de cinco cifras.");
			}
		
		} else {
			System.out.println("ERROR. Ha introducido un valor no válido.");
		}

		//Por último, cerramos el escáner.
		
		sc.close();


	}

}
