package Exemplo;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Digite o número desejado: ");
		numero = entrada.nextInt();
		
		while(numero > 0) {
			
			somatorio = somatorio + numero;
			
			System.out.println("Digite o número desejado: ");
			numero = entrada.nextInt();
			
			if(numero == 18)
				break;
			
			
		}
		System.out.printf("O somatótio foi: %d.", somatorio);
		entrada.close();

	}

}
