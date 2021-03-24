package Exemplo;

public class Exemplo {

	public static void main(String[] args) {
		
		String nome, nome2;
		nome = "José da Silva";
		nome2 = "Maria Aparecida do Santos";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length();
		int tamanhoDoNome2 = nome2.length();
		
		System.out.println("A variavel do nome tem " + tamanhoDoNome + " caracteres.");
		System.out.println("A variavel do nome tem " + tamanhoDoNome2 + " caracteres.");
		
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres das duas variavéis é " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('a', '9');
		System.out.println(nomeSemA);
		
		String somenteNome = nome.substring(0, 4);
		System.out.println(somenteNome);
		
		String nomeTudoMaiusculo = nome.toUpperCase();
		System.out.println(nomeTudoMaiusculo);
		
		String nomeTudoMinusculo = nome.toLowerCase();
		System.out.println(nomeTudoMinusculo);

	}

}
