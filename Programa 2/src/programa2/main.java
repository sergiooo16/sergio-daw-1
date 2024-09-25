package programa2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipo de cliente");
		String TipoCliente = entrada.next();
		
		System.out.println("Importe de la compra");
		double ImporteCompra = entrada.nextDouble();
		
		if (TipoCliente.equals("Socio")) {
			System.out.println(ImporteCompra*0.95);
		}else if (TipoCliente.equals("Vip")) {
			System.out.println(ImporteCompra*0.80);
		} else {
			System.out.println(ImporteCompra);
		}
		
		
		
		
		
		
	}

}
