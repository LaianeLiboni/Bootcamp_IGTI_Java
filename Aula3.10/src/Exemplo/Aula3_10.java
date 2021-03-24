package Exemplo;

import java.util.Scanner;

public class Aula3_10 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		char continuar = ' ';
		System.out.println("Digite continuar (S - Sim. N - Não)?");
		continuar = entrada.nextLine().charAt(0);
		
		while (continuar == 'S') {
			System.out.println("Mensagem");
			System.out.println("Digite continuar (S - Sim. N - Não)?");
			continuar = entrada.nextLine().charAt(0);
		}
		do {
			System.out.println("Mensagem");
			System.out.println("Digite continuar (S - Sim. N - Não)?");
			continuar = entrada.nextLine().charAt(0);
		}while (continuar == 'S');
		
		entrada.close();

	}

}
