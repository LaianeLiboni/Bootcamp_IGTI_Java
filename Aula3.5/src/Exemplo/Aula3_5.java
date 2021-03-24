package Exemplo;

import java.util.Scanner;

public class Aula3_5 {

	public static void main(String[] args) {
		
		double peso, altura, imc;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		peso = entrada.nextFloat();
		

		System.out.println("Digite sua altura: ");
		altura = entrada.nextFloat();
		imc = peso / (altura * altura);
		System.out.printf("Seu IMC é: %.2f.\n", imc);
		
		if(imc <= 19) {
			System.out.println("Abaixo do Peso");
		}else if(imc > 19 && imc <= 25) {
			System.out.println("Peso ideal");
		}else if(imc > 25 && imc <= 30) {
			System.out.println("Acima do Peso");
		}else if(imc > 30 && imc <= 35) {
			System.out.println("Obsedidade leve");
		}else {
			System.out.println("Obsedidade");
		}
		
				
		entrada.close();
	}

}
