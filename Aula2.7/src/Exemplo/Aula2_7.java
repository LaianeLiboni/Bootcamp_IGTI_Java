package Exemplo;

public class Aula2_7 {

	public static void main(String[] args) {
		
		String nome = "Joaquim Jos� da Silva";
		int idade = 35;
		double altura = 1.70;
		boolean estudante = true;
		char sexo = 'M';
		
		//%s String
		//%d Int
		//.4f float ou double com quatro casas decimais
		//%b boolean
		//%c caractere(char)
		
		System.out.printf("O nome � %s e o sexo %c.\nA idade � %d e a altura � %.2f.\n� estudante %b", nome, sexo, idade, altura, estudante);
	}

}
