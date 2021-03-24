package Exemplo;

import java.util.Scanner;

public class Aula3_7 {

	public static void main(String[] args) {
		char operacao = ' ';
		
		Scanner entrada = new Scanner(System.in);
		
		
		double n1 = 0, n2 = 0, total = 0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextDouble();
		
		entrada.nextLine();
		System.out.println("Digite a operacao desejada(+, -, /, *, %): ");
		operacao = entrada.nextLine().charAt(0);
		
		switch(operacao) {
			case '+': 
				total = n1 + n2;
				break;
			case '-':
				total = n1 - n2;
				break;
			case '/':
				total = n1 / n2;
				break;
			case '*':
				total = n1 * n2;
				break;
			case '%':
				total = n1 % n2;
				break;
			default:
				System.out.println("Operação desconhecida.");
		}
		if (operacao == '+' || operacao == '-' || operacao == '/' || operacao == '*' || operacao == '%')
		System.out.printf("%.2f, %c %.2f = %.2f",n1, operacao, n2, total);
		
		entrada.close();
	}
}
