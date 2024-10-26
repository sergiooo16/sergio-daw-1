# sergio-daw-1
package ejer1;

import java.util.Random;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Selecciona el numero de posiciones");
		
		int posiciones = entrada.nextInt();
		
		int [] array = new int [posiciones];
		int opcion;
		
		do {
		System.out.println("Seleccion una opcion: ");
		System.out.println("1. Inciaclizar a 0: ");
		System.out.println("2. Numeros aleatorios: ");
		System.out.println("3. Insertar manualmente: ");
		System.out.println("4. Reiniciar: ");
		opcion = entrada.nextInt();
		
		
		switch(opcion) {
		
		case 1:
			imprimir(array);
			break;
				
		case 2:
			
			Random random = new Random();
			
			for (int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(100);
			}
			break;
			
		case 3:
			
			for (int i = 0; i < posiciones; i++) {
				System.out.println("Ingresa la posicion" + (i+1) + ":");
				array[i] = entrada.nextInt();
		}
			break;
		
		case 4:
				
			System.out.print("¿Estás seguro de que quieres reiniciar el array? (s/n): ");
			int respuesta = entrada.nextInt();	
            if (respuesta == '1' || respuesta == '2') {
                for (int i = 0; i < array.length; i++) {
                    array[i] = 0; 
                }
                System.out.println("El array ha sido reiniciado.");
            } else {
                System.out.println("No se ha reiniciado el array.");
            }
            
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		imprimir(array);		
		
	}
		while (opcion != 4); 
			entrada.close();
		}
		
	 
		
	
	 private static void imprimir(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i<array.length -1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

}

