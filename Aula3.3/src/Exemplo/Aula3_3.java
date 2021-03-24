package Exemplo;

import java.util.Scanner;

public class Aula3_3 {

	public static void main(String[] args) {
		

		double n1, n2, n3, total, mediaAvaliacao, frequencia;
		String situacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		total = n1 + n2 + n3;
		mediaAvaliacao = total / 3;
		
		System.out.println("Digite a frequencia do aluno: ");
		frequencia = entrada.nextDouble();
		
		if(total >= 70 && frequencia >= 0.75) {
			situacao = "Aprovado";
		}else if(total >= 40 && total < 70 && frequencia >= 0.75){
			situacao = "Recuperacao";			
		}else {
			situacao = "Reprovado";
		}
		
			System.out.printf("O aluno obteve nota total %.2f e média por avalição %.2f. A frequência foi %.2f. Com isso o aluno esta %s.", total, mediaAvaliacao, frequencia*100, situacao);
			
			
			
		entrada.close();
		}
		
		

	}


