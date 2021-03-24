package Exemplo;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {

		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaractere = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaractere.nextLine();
		
		System.out.print("Digite um caractere para a situação do aluno(O --> OK; P --> Pendência: ");
		statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		System.out.print("Digite a frequência do aluno: ");
		frequencia = entradaNotas.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		
		boolean aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c.\n"
				+ "Aluno(a) aprovado(a)? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
		
		entradaNotas.close();
		entradaCaractere.close();

	}

}
