package programa1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Dime el nombre del alumno");
	String NombreAlumno = entrada.next();
	
	
	System.out.println("Matematicas");
	Double NotaMate = entrada.nextDouble();
		
	System.out.println("Lengua");
	Double NotaLengua = entrada.nextDouble();
	
	System.out.println("Fisica");
	Double NotaFisica = entrada.nextDouble();
	
	System.out.println("Ingles");
	Double NotaIngles = entrada.nextDouble();
		
	System.out.println("Euskera");
	Double NotaEuskera = entrada.nextDouble();
	
	double media = (NotaMate+NotaLengua+NotaFisica+NotaIngles+NotaEuskera)/5;
	System.out.println("la media es " +media);
	
	if (NotaMate>5 && NotaLengua>5 && NotaFisica>5 && NotaIngles>5 && NotaEuskera>5) {
		System.out.println("apto");
	} else {
		System.out.println("no apto");
	}
	
		
		
		
	}

}
