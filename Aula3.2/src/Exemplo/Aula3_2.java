package Exemplo;

import java.util.Scanner;

public class Aula3_2 {
	
	public static void main(String[] args) {
		
		char caractereDigitado, resposta = 'K';
		Scanner entrada = new Scanner(System.in);

		System.out.println("Tente adivinhar uma letra de A até Z: ");
		caractereDigitado = entrada.nextLine().charAt(0);
		
		if(caractereDigitado == resposta) {
			System.out.println("Resposta correta");
		}else {
			System.out.println("Tente novamente!");
		}
		entrada.close();
	}
}
		


