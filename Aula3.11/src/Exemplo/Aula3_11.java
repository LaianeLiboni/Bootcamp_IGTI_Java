package Exemplo;

import java.util.Scanner;

public class Aula3_11 {

	public static void main(String[] args) {
		
		//tipo [] nome = new tipo [tamanho];
		
		int [] numeros = new int[5];
		int total = 0, i = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros[i] = entrada.nextInt();
			total = total + numeros[i];
			System.out.printf("O total parcial é: %d.\n", total);
			entrada.close();
		}
		
		System.out.printf("O valor total é: %d.", total);
		
	}
	

}
