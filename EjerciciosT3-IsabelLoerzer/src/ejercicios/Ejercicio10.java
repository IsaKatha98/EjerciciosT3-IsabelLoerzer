package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	
	/*Realiza un programa que nos diga si un número introducido por teclado es capicúa o no.
	 * 
	 * Las pruebas realizadas son las siguientes:
	 * 
	 * - Introducir un valor 0 y que nos diga que es capicúa.
	 * - Introducir un valor aleatorio menor que 10 (5) y que nos diga que es capicíua.
	 * - Introducir un valor aleatorio mayor que 10 (121) y que nos diga que es capicúa.
	 * - Introducir un valor aleatoria que no sea que capicúa (123) y que nos lo muestre como tal.
*/

	public static void main(String[] args) {
	
		//Declaramos variables.
		
		int num; //Variable númerica que introduce el usuario.
		int aux; //Variable auxiliar necesaria para hacer cálculos.
		int inverso = 0; //Variable auxiliar necesaria para hacer cálculos.
		int unidad; //Variable auxiliar necesaria para hacer cálculos.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
				
		Scanner sc= new Scanner (System.in); 
				
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
				
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
			
		//Establecemos una condición que imprima que cualquier número menor 10 es capícua.
		if (num<10) {
			
			System.out.println("Es capícua.");
			
		} else if (num>=10) {
			
			 /*Ahora, hallamos el inverso de num. Utilizamos la variable aux para no perder
	         *el valor original de num.*/
			
			aux = num;
			
			//Abrimos un bucle que se repetirá mienstras aux sea distinto de 0.
	    
	         while (aux!=0) {
	        	/*Hacemos el módulo de auxiliar entre 10 y lo guardamos en la variable unidad.
	        	 *Esto guarda la última unidad de num/aux.*/
	        	unidad = aux % 10;
	        	
	        	//Se lo sumamos a inverso (valor actual=0) por diez más la unidad.
	            inverso = inverso * 10 + unidad;
	            
	            //Le quitamos la última cifra a aux.
	            aux = aux / 10;
			}
	              
	        /*Establecemos una condición en el que se imprima el mensaje correspondiente en caso
	         * de que num e inverso sean iguales.*/
	        if(num == inverso){
	            System.out.println("Es capicúa.");
	            
	        }else{
	            System.out.println("No es capicúa.");
	           
	        }
		}
		
        
        //Por último, cerramos el escáner.
		
		sc.close();

	}

}
