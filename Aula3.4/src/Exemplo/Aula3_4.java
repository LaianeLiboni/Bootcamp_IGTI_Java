package Exemplo;

import java.util.Scanner;

public class Aula3_4 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2= entrada.nextInt();
		
		if(n1 == n2) {
			System.out.println("Os números são iguais.");
			
		}else if(n1 > n2) {
			System.out.println("N1 é maior que N2.");
		}else {
			System.out.println("N2 é maior que N1");
		}
		
		entrada.close();
	}

}
